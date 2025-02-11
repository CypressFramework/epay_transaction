/*
 *
 *  Copyright (c) [2024] [State Bank of India]
 *  All rights reserved.
 *
 *  Author:@V0000001(Shilpa Kothre)
 *  Version:1.0
 *
 */

package com.epay.transaction.exceptions;


import com.epay.transaction.dto.ErrorDto;
import lombok.Getter;

import java.util.List;

@Getter
public class ValidationException extends RuntimeException {

    private String errorCode;
    private String errorMessage;
    private List<ErrorDto> errorMessages;

    public ValidationException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ValidationException(List<ErrorDto> errorMessages) {
        this.errorMessages = errorMessages;
    }

}