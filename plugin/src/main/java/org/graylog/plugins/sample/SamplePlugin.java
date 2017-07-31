package org.graylog.plugins.sample;

import com.google.common.collect.ImmutableList;
import org.graylog2.plugin.Plugin;
import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.PluginModule;

import java.util.Collection;

/**
 * Created by kira on 17/7/4.
 */
public class SamplePlugin implements Plugin {
    @Override
    public PluginMetaData metadata() {
        return new SampleMetaData();
    }

    @Override
    public Collection<PluginModule> modules() {
        return ImmutableList.of(
                new SampleModule()
        );
    }
}
