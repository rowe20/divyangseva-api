package com.sk.divyangseva.model.resmodel;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ResUser {
    private String name;
    private String user_type;
}
