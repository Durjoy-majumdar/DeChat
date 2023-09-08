package com.tencent.xweb;

import android.content.SharedPreferences;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.FileReaderHelper;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public class CommandCfgPlugin extends CommandCfg {
    public static final String C_STR_CMD_AUDIO_PLAYER_STRATEGY_PREFIX = "audio_player_strategy_";
    public static final String C_STR_CMD_DISABLE_FILE_READER_X_5_PREFIX = "disable_fr_x5_";
    public static final String C_STR_CMD_DOWNLOAD_WHEN_NOT_INSTALL = "download_when_not_install";
    public static final String C_STR_CMD_DOWNLOAD_WHEN_PLUGIN_ERROR = "download_when_plugin_error";
    public static final String C_STR_CMD_DOWNLOAD_WHEN_X_5_FAIL = "download_when_x5_fail";
    public static final String C_STR_CMD_FILE_READER_PREFIX = "fr_";
    public static final String C_STR_CMD_MAX_DOWNLOAD_COUNT_WHEN_PLUGIN_ERROR = "max_download_count_when_plugin_error";
    public static final String C_STR_CMD_PLUGIN_PARAM_PREFIX = "param_";
    public static final String C_STR_CMD_SET_PLUGIN_CONFIG_PERIOD = "setPluginConfigPeriod";
    public static final String C_STR_CMD_USE_OFFICE_READER_PREFIX = "use_office_reader_";
    public static final String C_STR_CMD_X_FILES_HIDE_BOTTOM_BAR = "xfiles_hide_bottom_bar";
    public static final String C_STR_CMD_X_FILES_HIDE_CUSTOM_MENU = "xfiles_hide_custom_menu";
    public static final int DEFAULT_MAX_DOWNLOAD_COUNT_WHEN_PLUGIN_ERROR = 2;
    private static final String TAG = "CommandCfgPlugin";
    private static CommandCfgPlugin sPluginInstance;

    public static FileReaderHelper.ReaderType convertFileReader(String str) {
        FileReaderHelper.ReaderType readerType = FileReaderHelper.ReaderType.NONE;
        if (str == null || str.isEmpty()) {
            return readerType;
        }
        try {
            return FileReaderHelper.ReaderType.valueOf(str);
        } catch (Throwable unused) {
            return FileReaderHelper.ReaderType.NONE;
        }
    }

    public static FileReaderHelper.UseOfficeReader convertUseOfficeReader(String str) {
        FileReaderHelper.UseOfficeReader useOfficeReader = FileReaderHelper.UseOfficeReader.none;
        if (str == null || str.isEmpty()) {
            return useOfficeReader;
        }
        try {
            return FileReaderHelper.UseOfficeReader.valueOf(str);
        } catch (Throwable unused) {
            return FileReaderHelper.UseOfficeReader.none;
        }
    }

    public static synchronized CommandCfgPlugin getInstance() {
        CommandCfgPlugin commandCfgPlugin;
        synchronized (CommandCfgPlugin.class) {
            if (sPluginInstance == null) {
                CommandCfgPlugin commandCfgPlugin2 = new CommandCfgPlugin();
                sPluginInstance = commandCfgPlugin2;
                commandCfgPlugin2.initCommandConfigs();
            }
            commandCfgPlugin = sPluginInstance;
        }
        return commandCfgPlugin;
    }

    private String getSafeModuleForFileReader() {
        if (XWalkEnvironment.MODULE_APPBRAND.equalsIgnoreCase(XWalkEnvironment.getSafeModuleName(XWalkEnvironment.MODULE_TOOLS))) {
            XWebLog.m21911i(getLogTag(), "getSafeModuleForFileReader, use module appbrand");
            return XWalkEnvironment.MODULE_APPBRAND;
        }
        XWebLog.m21911i(getLogTag(), "getSafeModuleForFileReader, use module tools");
        return XWalkEnvironment.MODULE_TOOLS;
    }

    public static synchronized void resetCommandCfgPlugin() {
        synchronized (CommandCfgPlugin.class) {
            XWebLog.m21911i(TAG, "resetCommandCfg, module: " + XWalkEnvironment.getModuleName());
            sPluginInstance = null;
            getInstance();
        }
    }

    public void applyCommandInternal(ConfigDef.Command[] commandArr, String str, boolean z) {
        String str2;
        if (str == null) {
            XWebLog.m21911i(getLogTag(), "applyCommandInternal, invalid configVersion");
            return;
        }
        String logTag = getLogTag();
        XWebLog.m21911i(logTag, "applyCommandInternal, configVersion:" + str + ", isRecheck:" + z);
        forkSectionBToSectionAIfNeed();
        HashMap hashMap = new HashMap();
        if (commandArr == null || commandArr.length == 0) {
            XWebLog.m21913w(getLogTag(), "applyCommandInternal, empty new command configs");
            saveCommandConfigs(str, hashMap);
            return;
        }
        for (int i = 0; i < commandArr.length; i++) {
            ConfigDef.Command command = commandArr[i];
            if (command != null && ((!z || !isForbidRecheckCmd(command.optype)) && commandArr[i].filter.checkMatch(false, false, TAG))) {
                IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
                if (xWebViewProvider != null) {
                    CommandCfg.CmdHandleRet cmdHandleRet = (CommandCfg.CmdHandleRet) xWebViewProvider.execute(ConstValue.STR_CMD_EXXCUTE_CMD_FROM_CONFIG, new Object[]{commandArr[i]});
                    if (cmdHandleRet != null && cmdHandleRet.handled) {
                        String logTag2 = getLogTag();
                        XWebLog.m21911i(logTag2, "applyCommandInternal, command(" + commandArr[i] + ") handled");
                    }
                }
                ConfigDef.Command command2 = commandArr[i];
                if (!(command2.opvalue == null || (str2 = command2.module) == null || str2.isEmpty())) {
                    applyCommandCommand(commandArr[i], hashMap, commandArr[i].module.split(","));
                }
            }
        }
        saveCommandConfigs(str, hashMap);
    }

    public boolean canDownloadWhenNotInstall(boolean z) {
        try {
            String cmd = getCmd(C_STR_CMD_DOWNLOAD_WHEN_NOT_INSTALL, getSafeModuleForFileReader());
            if (cmd != null) {
                if (!cmd.isEmpty()) {
                    return Boolean.parseBoolean(cmd);
                }
            }
            XWebLog.m21911i(TAG, "canDownloadWhenNotInstall cmd is empty, return defValue = " + z);
            return z;
        } catch (Throwable th) {
            String logTag = getLogTag();
            XWebLog.m21909e(logTag, "canDownloadWhenNotInstall error, return defValue = " + z + ", errorMsg = " + th.getMessage());
            return z;
        }
    }

    public boolean canDownloadWhenPluginError(boolean z) {
        try {
            String cmd = getCmd(C_STR_CMD_DOWNLOAD_WHEN_PLUGIN_ERROR, getSafeModuleForFileReader());
            if (cmd != null) {
                if (!cmd.isEmpty()) {
                    return Boolean.parseBoolean(cmd);
                }
            }
            XWebLog.m21911i(TAG, "canDownloadWhenPluginError cmd is empty, return defValue = " + z);
            return z;
        } catch (Throwable th) {
            String logTag = getLogTag();
            XWebLog.m21909e(logTag, "canDownloadWhenPluginError error, return defValue = " + z + ", errorMsg = " + th.getMessage());
            return z;
        }
    }

    public boolean canDownloadWhenX5Fail(boolean z) {
        try {
            String cmd = getCmd(C_STR_CMD_DOWNLOAD_WHEN_X_5_FAIL, getSafeModuleForFileReader());
            if (cmd != null) {
                if (!cmd.isEmpty()) {
                    return Boolean.parseBoolean(cmd);
                }
            }
            XWebLog.m21911i(TAG, "canDownloadWhenX5Fail cmd is empty, return defValue = " + z);
            return z;
        } catch (Throwable th) {
            String logTag = getLogTag();
            XWebLog.m21909e(logTag, "canDownloadWhenX5Fail error, return defValue = " + z + ", errorMsg = " + th.getMessage());
            return z;
        }
    }

    public FileReaderHelper.AudioPlayerStrategy getAudioPlayerStrategy(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    String cmd = getCmd(C_STR_CMD_AUDIO_PLAYER_STRATEGY_PREFIX + str.toLowerCase(), getSafeModuleForFileReader());
                    if (cmd != null) {
                        if (!cmd.isEmpty()) {
                            return FileReaderHelper.AudioPlayerStrategy.valueOf(cmd);
                        }
                    }
                    return FileReaderHelper.AudioPlayerStrategy.auto;
                }
            } catch (Throwable th) {
                String logTag = getLogTag();
                XWebLog.m21909e(logTag, "getAudioPlayerStrategy error:" + th.getMessage());
                return FileReaderHelper.AudioPlayerStrategy.auto;
            }
        }
        return FileReaderHelper.AudioPlayerStrategy.auto;
    }

    public HashMap<String, String> getCmdPluginParam(String str) {
        try {
            String cmd = getCmd(C_STR_CMD_PLUGIN_PARAM_PREFIX + str, XWalkEnvironment.MODULE_TOOLS);
            if (cmd != null) {
                if (!cmd.isEmpty()) {
                    String[] split = cmd.split(",");
                    if (split == null) {
                        return null;
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    for (String str2 : split) {
                        if (str2 != null) {
                            if (!str2.isEmpty()) {
                                String[] split2 = str2.split("_");
                                if (split2 != null) {
                                    if (split2.length == 2) {
                                        hashMap.put(split2[0], split2[1]);
                                    }
                                }
                            }
                        }
                    }
                    return hashMap;
                }
            }
            return null;
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "getCmdPluginParam error", th);
            return null;
        }
    }

    public int getCmdPluginUpdatePeriod() {
        try {
            String cmd = getCmd(C_STR_CMD_SET_PLUGIN_CONFIG_PERIOD, XWalkEnvironment.MODULE_TOOLS);
            if (cmd != null) {
                if (!cmd.isEmpty()) {
                    int parseInt = Integer.parseInt(cmd);
                    if (parseInt < 30) {
                        return -1;
                    }
                    return parseInt * 60 * 1000;
                }
            }
            return -1;
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "getCmdPluginUpdatePeriod error", th);
            return -1;
        }
    }

    public FileReaderHelper.UseOfficeReader getCmdUseOfficeReader(String str, String str2) {
        return convertUseOfficeReader(getCmd(C_STR_CMD_USE_OFFICE_READER_PREFIX + str.toLowerCase(), str2));
    }

    public FileReaderHelper.ReaderType getFileReaderType(String str, String str2) {
        return convertFileReader(getCmd(C_STR_CMD_FILE_READER_PREFIX + str.toLowerCase(), str2));
    }

    public String getLogTag() {
        return TAG;
    }

    public int getMaxDownloadCountWhenPluginError() {
        try {
            String cmd = getCmd(C_STR_CMD_MAX_DOWNLOAD_COUNT_WHEN_PLUGIN_ERROR, getSafeModuleForFileReader());
            if (cmd != null) {
                if (!cmd.isEmpty()) {
                    int parseInt = Integer.parseInt(cmd);
                    if (parseInt < 0) {
                        return 2;
                    }
                    return parseInt;
                }
            }
            return 2;
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "getMaxDownloadCountWhenPluginError error", th);
            return 2;
        }
    }

    public SharedPreferences getSharePreferenceForCommandConfig() {
        return XWebSharedPreferenceUtil.getMMKVSharedPreferencesForCommandCfgPlugin();
    }

    public SharedPreferences getSharePreferenceForCommandConfigLatest() {
        return XWebSharedPreferenceUtil.getMMKVSharedPreferencesForCommandCfgPluginLatest();
    }

    public boolean isDisableFileReaderX5(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    String cmd = getCmd(C_STR_CMD_DISABLE_FILE_READER_X_5_PREFIX + str.toLowerCase(), getSafeModuleForFileReader());
                    if (cmd != null) {
                        if (!cmd.isEmpty()) {
                            return Boolean.parseBoolean(cmd);
                        }
                    }
                    return false;
                }
            } catch (Throwable th) {
                XWebLog.m21910e(getLogTag(), "isDisableFileReaderX5 error", th);
            }
        }
        return false;
    }

    public boolean isXFilesHideBottomBar() {
        try {
            String cmd = getCmd(C_STR_CMD_X_FILES_HIDE_BOTTOM_BAR, getSafeModuleForFileReader());
            if (cmd == null) {
                return false;
            }
            if (cmd.isEmpty()) {
                return false;
            }
            return Boolean.parseBoolean(cmd);
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "isXFilesHideBottomBar error", th);
            return false;
        }
    }

    public boolean isXFilesHideCustomMenu() {
        try {
            String cmd = getCmd(C_STR_CMD_X_FILES_HIDE_CUSTOM_MENU, getSafeModuleForFileReader());
            if (cmd == null) {
                return false;
            }
            if (cmd.isEmpty()) {
                return false;
            }
            return Boolean.parseBoolean(cmd);
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "isXFilesHideCustomMenu error", th);
            return false;
        }
    }

    public FileReaderHelper.UseOfficeReader getCmdUseOfficeReader(String str) {
        return getCmdUseOfficeReader(str, XWalkEnvironment.getSafeModuleName(XWalkEnvironment.MODULE_TOOLS));
    }

    public FileReaderHelper.ReaderType getFileReaderType(String str) {
        return getFileReaderType(str, getSafeModuleForFileReader());
    }
}
