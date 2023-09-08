package com.tencent.xweb.xwalk.plugin;

import android.text.TextUtils;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.CommandCfgPlugin;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.SchedulerConfig;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public class XFileSchedulerFactory {
    private static final HashMap<String, XFileScheduler> sMapSchedulers = new HashMap<>();

    public static class XFileScheduler extends Scheduler {
        public String mStrPluginName;

        public XFileScheduler(String str) {
            this.mStrPluginName = str;
            this.TAG = getScheduleType() + "Scheduler";
        }

        public String getCustomCurHourSpeedConfig(boolean z) {
            if (!z) {
                String cmd = CommandCfgPlugin.getInstance().getCmd(CommandDef.COMMAND_UPDATE_SPEED_CONFIG, XWalkEnvironment.MODULE_TOOLS);
                return TextUtils.isEmpty(cmd) ? CommandCfg.getInstance().getCmd(CommandDef.COMMAND_UPDATE_SPEED_CONFIG, XWalkEnvironment.MODULE_TOOLS) : cmd;
            }
            String cmd2 = CommandCfgPlugin.getInstance().getCmd(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG, XWalkEnvironment.MODULE_TOOLS);
            return TextUtils.isEmpty(cmd2) ? CommandCfg.getInstance().getCmd(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG, XWalkEnvironment.MODULE_TOOLS) : cmd2;
        }

        public String getCustomTimeRangeBindConfig() {
            String cmd = CommandCfgPlugin.getInstance().getCmd(CommandDef.COMMAND_UPDATE_SCHEDULE_TIME_RANGE_BIND, XWalkEnvironment.MODULE_TOOLS);
            return TextUtils.isEmpty(cmd) ? super.getCustomTimeRangeBindConfig() : cmd;
        }

        public String getFreeFetchConfigZoneConfig() {
            return CommandCfgPlugin.getInstance().getCmd(CommandDef.COMMAND_FREE_FETCH_CONFIG_TIME_ZONE, XWalkEnvironment.MODULE_TOOLS);
        }

        public int getIdkeyOffsetFromDefault() {
            return 15;
        }

        public String getScheduleType() {
            return this.mStrPluginName;
        }

        public boolean isSameScheduler(SchedulerConfig schedulerConfig, SchedulerConfig schedulerConfig2) {
            if (schedulerConfig.skipSubFileMD5Check != schedulerConfig2.skipSubFileMD5Check || !isSameString(schedulerConfig.path, schedulerConfig2.path)) {
                return false;
            }
            return super.isSameScheduler(schedulerConfig, schedulerConfig2);
        }
    }

    public static synchronized XFileScheduler getScheduler(String str) {
        XFileScheduler xFileScheduler;
        synchronized (XFileSchedulerFactory.class) {
            HashMap<String, XFileScheduler> hashMap = sMapSchedulers;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new XFileScheduler(str));
            }
            xFileScheduler = hashMap.get(str);
        }
        return xFileScheduler;
    }
}
