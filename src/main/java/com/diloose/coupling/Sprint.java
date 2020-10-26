package com.diloose.coupling;

public class Sprint {

    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void activateService() {

        service.serviceRunning();
    }
}
