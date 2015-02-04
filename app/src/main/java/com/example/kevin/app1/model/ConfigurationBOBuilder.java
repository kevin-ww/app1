package com.example.kevin.app1.model;

public class ConfigurationBOBuilder {
    private String ak;
    private String av;
    private String sv;
    private String pn;

    public ConfigurationBOBuilder setAk(String ak) {
        this.ak = ak;
        return this;
    }

    public ConfigurationBOBuilder setAv(String av) {
        this.av = av;
        return this;
    }

    public ConfigurationBOBuilder setSv(String sv) {
        this.sv = sv;
        return this;
    }

    public ConfigurationBOBuilder setPn(String pn) {
        this.pn = pn;
        return this;
    }

    public ConfigurationBO createConfigurationBO() {
        return new ConfigurationBO(ak, av, sv, pn);
    }
}