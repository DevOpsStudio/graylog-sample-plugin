package org.graylog.plugins.sample;

import org.graylog2.plugin.rest.PluginRestResource;
import org.graylog2.shared.plugins.PluginRestResourceClasses;

import java.util.Map;
import java.util.Set;

/**
 * Created by kira on 17/7/15.
 */
public class SPLResource extends PluginRestResourceClasses {
    public SPLResource(Map<String, Set<Class<? extends PluginRestResource>>> pluginRestResources) {
        super(pluginRestResources);
    }
}
