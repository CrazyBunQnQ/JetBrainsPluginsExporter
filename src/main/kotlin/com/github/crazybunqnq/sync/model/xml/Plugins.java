package com.github.crazybunqnq.sync.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Plugins {
    @XmlElement(name = "plugin")
    List<Plugin> plugins = new ArrayList<>();

    public Plugins() {
    }

    public void add(Plugin plugin) {
        plugins.add(plugin);
    }

    public List<Plugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }
}
