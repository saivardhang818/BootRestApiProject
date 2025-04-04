package com.sathya.restapiproject.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse 
{
	private LocalDateTime timeStamp;
	private int statusCode;
	private String errorMessage;


}
