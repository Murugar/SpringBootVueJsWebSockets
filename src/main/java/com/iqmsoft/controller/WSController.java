
package com.iqmsoft.controller;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iqmsoft.model.InfoHolder;


@Controller
public class WSController {

	private ObjectMapper mapper;
	private InfoHolder modelInfoHolder;
	private SimpMessagingTemplate messageTemplate;

	public WSController(ObjectMapper mapper, SimpMessagingTemplate messageTemplate, InfoHolder modelInfoHolder) {
		this.mapper = mapper;
		this.messageTemplate = messageTemplate;
		this.modelInfoHolder = modelInfoHolder;
	}

	@Scheduled(fixedDelay = 1000)
	public void sendWebSocketUpdate() throws JsonProcessingException {
		modelInfoHolder.changeValues();
		this.messageTemplate.convertAndSend("/info/values",
				mapper.writeValueAsString(modelInfoHolder.getModelInfoList()));
	}

}
