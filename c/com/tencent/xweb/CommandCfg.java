package com.tencent.xweb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.NumberUtil;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.xwalk.core.XWalkEnvironment;

public class CommandCfg {
    private static final int MIN_APK_VERSION_FOR_MULTI_PROCESS = 4228;
    private static final int MIN_SDK_VERSION_FOR_COMMAND_CONFIG = 200502;
    private static final String SPLIT_CMD_AND_MODULES = "```";
    private static final String SPLIT_CMD_AND_MODULES_OLD = ":";
    private static final String SPLIT_MODULES = "~~~";
    private static final String SPLIT_MODULES_OLD = ";";
    private static final String TAG = "CommandCfg";
    private static final String cStrSpKeyConfigPeriod = "cStrSpKeyConfigPeriod";
    private static final String cStrSpKeyConfigsReady = "cStrSpKeyConfigsReady";
    private static final String cStrSpKeyTAGConfigSdkVer = "cStrTAGConfigSdkVer";
    private static final String cStrSpKeyTAGConfigVer = "cStrTAGConfigVer";
    private static CommandCfg sInstance = null;
    private static int sNConfigSdkVer = 0;
    private static String sStrConfigVer = "";
    public Map<String, Object> sMapCommandConfigs = new HashMap();

    public static class CmdHandleRet {
        public Object handleRet = null;
        public boolean handled = false;
    }

    public static synchronized CommandCfg getInstance() {
        CommandCfg commandCfg;
        synchronized (CommandCfg.class) {
            if (sInstance == null) {
                CommandCfg commandCfg2 = new CommandCfg();
                sInstance = commandCfg2;
                commandCfg2.initCommandConfigs();
            }
            commandCfg = sInstance;
        }
        return commandCfg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r3 = r3.getString(cStrSpKeyConfigsReady, "");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isCommandConfigSharedPreferenceReady(android.content.SharedPreferences r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001d
            java.lang.String r0 = "cStrSpKeyConfigsReady"
            boolean r1 = r3.contains(r0)
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            if (r3 == 0) goto L_0x001d
            java.lang.String r0 = "true"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x001d
            r3 = 1
            return r3
        L_0x001d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.CommandCfg.isCommandConfigSharedPreferenceReady(android.content.SharedPreferences):boolean");
    }

    public static synchronized void resetCommandCfg() {
        synchronized (CommandCfg.class) {
            XWebLog.m21911i(TAG, "resetCommandCfg, module: " + XWalkEnvironment.getModuleName());
            sInstance = null;
            getInstance();
        }
    }

    public synchronized void applyCommand(ConfigDef.Command[] commandArr, String str) {
        applyCommand(commandArr, str, false);
    }

    public boolean applyCommandCommand(ConfigDef.Command command, Map<String, Object> map, String[] strArr) {
        String str = command.optype;
        String str2 = command.opvalue;
        if (str.equals(CommandDef.COMMAND_EXECUTE_COMMAND)) {
            String[] parseOpValue = parseOpValue(command.opvalue);
            if (parseOpValue == null || parseOpValue.length < 2) {
                return false;
            }
            str = parseOpValue[0];
            str2 = parseOpValue[1];
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, String> commandMap = getCommandMap(str, map);
        if (commandMap == null || commandMap.isEmpty()) {
            commandMap = new HashMap<>();
            map.put(str, commandMap);
        }
        boolean z = false;
        for (String trim : strArr) {
            String trim2 = trim.trim();
            if (trim2 != null && !trim2.isEmpty() && !commandMap.containsKey(trim2)) {
                commandMap.put(trim2, str2);
                z = true;
            }
        }
        return z;
    }

    public synchronized void applyCommandInternal(ConfigDef.Command[] commandArr, String str, boolean z) {
        if (str == null) {
            XWebLog.m21911i(getLogTag(), "applyCommandInternal, invalid configVersion");
            return;
        }
        String logTag = getLogTag();
        XWebLog.m21911i(logTag, "applyCommandInternal, configVersion:" + str + ", isRecheck:" + z);
        forkSectionBToSectionAIfNeed();
        HashMap hashMap = new HashMap();
        if (commandArr != null) {
            if (commandArr.length != 0) {
                for (int i = 0; i < commandArr.length; i++) {
                    ConfigDef.Command command = commandArr[i];
                    if (command != null) {
                        if (!z || !isForbidRecheckCmd(command.optype)) {
                            String logTag2 = getLogTag();
                            XWebLog.m21911i(logTag2, "applyCommandInternal, command[" + i + "]:" + commandArr[i]);
                            if (commandArr[i].filter.checkMatch(false, false, TAG)) {
                                IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
                                if (xWebViewProvider != null) {
                                    CmdHandleRet cmdHandleRet = (CmdHandleRet) xWebViewProvider.execute(ConstValue.STR_CMD_EXXCUTE_CMD_FROM_CONFIG, new Object[]{commandArr[i]});
                                    if (cmdHandleRet != null && cmdHandleRet.handled) {
                                        String logTag3 = getLogTag();
                                        XWebLog.m21911i(logTag3, "applyCommandInternal, command(" + commandArr[i].optype + ") handled");
                                    }
                                }
                                ConfigDef.Command command2 = commandArr[i];
                                if (command2.opvalue != null) {
                                    String str2 = command2.module;
                                    if (str2 != null) {
                                        if (!str2.isEmpty()) {
                                            applyCommandCommand(commandArr[i], hashMap, commandArr[i].module.split(","));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                saveCommandConfigs(str, hashMap);
                return;
            }
        }
        XWebLog.m21913w(getLogTag(), "applyCommandInternal, empty new command configs");
        saveCommandConfigs(str, hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void clearOldCommandConfigs(java.util.Map<java.lang.String, java.lang.Object> r5, android.content.SharedPreferences r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r6.getAll()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008e
            int r1 = r0.size()     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x000f
            goto L_0x008e
        L_0x000f:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0090 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0090 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0090 }
            r1.<init>()     // Catch:{ all -> 0x0090 }
        L_0x001c:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0090 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0090 }
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0090 }
            r1.add(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x001c
        L_0x0032:
            android.content.SharedPreferences$Editor r0 = r6.edit()     // Catch:{ all -> 0x0090 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0090 }
        L_0x003a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "cStrTAGConfigVer"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0090 }
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = "cStrTAGConfigSdkVer"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0090 }
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = "cStrSpKeyConfigsReady"
            boolean r3 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0090 }
            if (r3 != 0) goto L_0x003a
            boolean r3 = r5.containsKey(r2)     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0065
            goto L_0x003a
        L_0x0065:
            r0.remove(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x003a
        L_0x0069:
            r0.commit()     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = r4.getLogTag()     // Catch:{ all -> 0x0090 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r0.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "clearOldCommandConfigs, remained section B size:"
            r0.append(r1)     // Catch:{ all -> 0x0090 }
            java.util.Map r6 = r6.getAll()     // Catch:{ all -> 0x0090 }
            int r6 = r6.size()     // Catch:{ all -> 0x0090 }
            r0.append(r6)     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0090 }
            com.tencent.xweb.util.XWebLog.m21911i(r5, r6)     // Catch:{ all -> 0x0090 }
            monitor-exit(r4)
            return
        L_0x008e:
            monitor-exit(r4)
            return
        L_0x0090:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.CommandCfg.clearOldCommandConfigs(java.util.Map, android.content.SharedPreferences):void");
    }

    public WebView.FullscreenVideoKind convertFullscreenVideo(String str) {
        if (str == null || str.isEmpty()) {
            return WebView.FullscreenVideoKind.HOOK_EVALUTE_JS;
        }
        WebView.FullscreenVideoKind fullscreenVideoKind = WebView.FullscreenVideoKind.HOOK_EVALUTE_JS;
        try {
            return WebView.FullscreenVideoKind.valueOf(str);
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "convertFullscreenVideo error", th);
            return fullscreenVideoKind;
        }
    }

    public WebView.WebViewKind convertWebType(String str) {
        if (str == null || str.isEmpty()) {
            return WebView.WebViewKind.WV_KIND_NONE;
        }
        WebView.WebViewKind webViewKind = WebView.WebViewKind.WV_KIND_NONE;
        try {
            return WebView.WebViewKind.valueOf(str);
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "convertWebType error", th);
            return webViewKind;
        }
    }

    public Map<String, String> deserializeMap(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        if (str != null && !str.isEmpty()) {
            for (String str4 : str.split(SPLIT_MODULES)) {
                if (str4 != null && !str4.isEmpty()) {
                    String[] split = str4.split(SPLIT_CMD_AND_MODULES);
                    if (!(split.length != 2 || (str2 = split[0]) == null || (str3 = split[1]) == null)) {
                        hashMap.put(str2, str3);
                    }
                }
            }
        }
        return hashMap;
    }

    public Map<String, String> deserializeMapOld(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        if (str != null && !str.isEmpty()) {
            for (String str4 : str.split(SPLIT_MODULES_OLD)) {
                if (str4 != null && !str4.isEmpty()) {
                    String[] split = str4.split(":");
                    if (!(split.length != 2 || (str2 = split[0]) == null || (str3 = split[1]) == null)) {
                        hashMap.put(str2, str3);
                    }
                }
            }
        }
        return hashMap;
    }

    public synchronized String dumpCmds() {
        StringBuilder sb = new StringBuilder(512);
        Set<String> keySet = this.sMapCommandConfigs.keySet();
        sb.append(" config version = " + sStrConfigVer + "\n");
        sb.append(" config sdk version = " + sNConfigSdkVer + "\n");
        if (keySet == null) {
            return sb.toString();
        }
        for (String next : keySet) {
            if (!TextUtils.isEmpty(next)) {
                String serializeMap = serializeMap(getCommandMap(next));
                if (serializeMap == null) {
                    serializeMap = "";
                }
                sb.append(" [" + next + "] = ");
                sb.append(serializeMap);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public synchronized void forkSectionBToSectionAIfNeed() {
        if (!isCommandConfigSharedPreferenceReady(getSharePreferenceForCommandConfigLatest())) {
            XWebLog.m21911i(getLogTag(), "forkSectionBToSectionAIfNeed, section B not ready, ignore");
            return;
        }
        SharedPreferences.Editor edit = getSharePreferenceForCommandConfig().edit();
        edit.putString(cStrSpKeyConfigsReady, "false");
        edit.commit();
        SharedPreferences sharePreferenceForCommandConfigLatest = getSharePreferenceForCommandConfigLatest();
        Map<String, ?> all = sharePreferenceForCommandConfigLatest.getAll();
        if (all != null) {
            if (all.size() != 0) {
                for (Map.Entry<String, ?> key : all.entrySet()) {
                    String str = (String) key.getKey();
                    String string = sharePreferenceForCommandConfigLatest.getString(str, "");
                    if (str != null && !str.equalsIgnoreCase(cStrSpKeyConfigsReady)) {
                        edit.putString(str, String.valueOf(string));
                    }
                }
                edit.putString(cStrSpKeyConfigsReady, "true");
                edit.commit();
                String logTag = getLogTag();
                XWebLog.m21911i(logTag, "forkSectionBToSectionAIfNeed, forked section A size:" + getSharePreferenceForCommandConfig().getAll().size());
            }
        }
        XWebLog.m21911i(getLogTag(), "forkSectionBToSectionAIfNeed, empty command configs");
        edit.putString(cStrSpKeyConfigsReady, "true");
        edit.commit();
        String logTag2 = getLogTag();
        XWebLog.m21911i(logTag2, "forkSectionBToSectionAIfNeed, forked section A size:" + getSharePreferenceForCommandConfig().getAll().size());
    }

    public String getAbstractInfo() {
        try {
            return dumpCmds();
        } catch (Throwable th) {
            XWebLog.m21910e(getLogTag(), "getAbstractInfo error", th);
            return "";
        }
    }

    public int getChildProcessStartTimeOutCount() {
        return getCmdAsInt(CommandDef.COMMAND_CHILD_PROCESS_START_TIMEOUT_COUNT, XWalkEnvironment.MODULE_MM, 2);
    }

    public int getChildProcessStartTimeOutThreshold() {
        return getCmdAsInt(CommandDef.COMMAND_CHILD_PROCESS_START_TIMEOUT_THRESHOLD, XWalkEnvironment.MODULE_MM, 50);
    }

    public synchronized String getCmd(String str) {
        String moduleName;
        moduleName = WebView.getModuleName();
        if (TextUtils.isEmpty(moduleName)) {
            moduleName = XWalkEnvironment.MODULE_TOOLS;
        }
        return getCmd(str, moduleName);
    }

    public synchronized boolean getCmdAsBoolean(String str, String str2, boolean z) {
        String cmdInternal = getCmdInternal(str, str2);
        if (TextUtils.isEmpty(cmdInternal)) {
            return z;
        }
        if ("true".equalsIgnoreCase(cmdInternal)) {
            return true;
        }
        if ("false".equalsIgnoreCase(cmdInternal)) {
            return false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int getCmdAsInt(java.lang.String r1, java.lang.String r2, int r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = r0.getCmdInternal(r1, r2)     // Catch:{ all -> 0x0020 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r0)
            return r3
        L_0x000d:
            com.tencent.xweb.util.NumberUtil$ParseResult r1 = com.tencent.xweb.util.NumberUtil.safeParseInt(r1)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            boolean r2 = r1.parseSuc     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)
            return r1
        L_0x001e:
            monitor-exit(r0)
            return r3
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.CommandCfg.getCmdAsInt(java.lang.String, java.lang.String, int):int");
    }

    public synchronized String getCmdAsString(String str, String str2, String str3) {
        String cmdInternal = getCmdInternal(str, str2);
        return TextUtils.isEmpty(cmdInternal) ? str3 : cmdInternal;
    }

    public int getCmdFetchConfigPeriodMills() {
        try {
            String cmd = getCmd(CommandDef.COMMAND_SET_CONFIG_PERIOD, XWalkEnvironment.MODULE_TOOLS);
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
            XWebLog.m21910e(getLogTag(), "getCmdFetchConfigPeriodMills, error", th);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String getCmdInternal(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r2 = r1.getCommandMap(r2)     // Catch:{ all -> 0x0045 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r3 = com.tencent.xweb.WebView.getModuleName()     // Catch:{ all -> 0x0045 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0018
            java.lang.String r3 = "tools"
        L_0x0018:
            if (r2 == 0) goto L_0x0041
            if (r3 != 0) goto L_0x001d
            goto L_0x0041
        L_0x001d:
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0045 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "["
            boolean r3 = r2.contains(r3)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            java.lang.String r3 = "]"
            boolean r3 = r2.contains(r3)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            java.lang.String r2 = com.tencent.xweb.util.TimeRangeCommandParser.getValueByNow(r2)     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
            return r2
        L_0x003f:
            monitor-exit(r1)
            return r2
        L_0x0041:
            java.lang.String r2 = ""
            monitor-exit(r1)
            return r2
        L_0x0045:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.CommandCfg.getCmdInternal(java.lang.String, java.lang.String):java.lang.String");
    }

    public synchronized Map<String, String> getCommandMap(String str) {
        return getCommandMap(str, this.sMapCommandConfigs);
    }

    public boolean getDisableChildProcessStartCrashCount() {
        return getCmdAsBoolean(CommandDef.COMMAND_DISABLE_CHILD_PROCESS_START_CRASH_COUNT, XWalkEnvironment.MODULE_MM, false);
    }

    public boolean getDisableChildProcessStartTimeOut() {
        return getCmdAsBoolean(CommandDef.COMMAND_DISABLE_CHILD_PROCESS_START_TIMEOUT, XWalkEnvironment.MODULE_MM, false);
    }

    public boolean getEnableCheckStorage() {
        return getCmdAsBoolean(CommandDef.COMMAND_ENABLE_CHECK_STORAGE, XWalkEnvironment.MODULE_TOOLS, false);
    }

    public boolean getEnableThirdAppReport() {
        String[] split;
        String cmd = getInstance().getCmd(CommandDef.COMMAND_THIRD_APP_REPORT, XWalkEnvironment.MODULE_TOOLS);
        if (cmd != null && !cmd.equalsIgnoreCase("") && (split = cmd.split(",")) != null && split.length > 0) {
            String valueOf = String.valueOf(XWebGrayValueUtil.getGrayValue());
            for (String str : split) {
                if (valueOf != null && valueOf.endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getEnabledTraceCategory(String str) {
        return getCmd(CommandDef.COMMAND_SET_ENABLED_TRACE_CATEGORY, str);
    }

    public boolean getFullscreenVideoEnableInitChannelsTryRuntime() {
        return getCmdAsBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_INIT_CHANNELS_TRY_RUNTIME, XWalkEnvironment.MODULE_TOOLS, true);
    }

    public boolean getFullscreenVideoEnableMute() {
        return getCmdAsBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_MUTE, XWalkEnvironment.MODULE_TOOLS, false);
    }

    public boolean getFullscreenVideoEnableSpeed() {
        return getCmdAsBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_SPEED, XWalkEnvironment.MODULE_TOOLS, false);
    }

    public boolean getFullscreenVideoEnableSysTryRuntime() {
        return getCmdAsBoolean(CommandDef.COMMAND_FULLSCREEN_VIDEO_ENABLE_SYS_TRY_RUNTIME, XWalkEnvironment.MODULE_TOOLS, true);
    }

    public WebView.FullscreenVideoKind getFullscreenVideoKind(String str) {
        return convertFullscreenVideo(getCmd(CommandDef.COMMAND_SET_FULLSCREEN_VIDEO, str));
    }

    public String getLogTag() {
        return TAG;
    }

    public int getMMWebViewDowngradeMode() {
        return getCmdAsInt(CommandDef.COMMAND_WEBVIEW_DOWNGRADE_MODE_FOR_MM, XWalkEnvironment.MODULE_MM, XWebSdk.WebViewModeForMM.DISABLE_MULTI_PROCESS.ordinal());
    }

    public SharedPreferences getSharePreferenceForCommandConfig() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForCommandCfg();
    }

    public SharedPreferences getSharePreferenceForCommandConfigLatest() {
        return XWebSharedPreferenceUtil.getSharedPreferencesForCommandCfgLatest();
    }

    public int getSupportMultiProcessMinApkVersion() {
        return getCmdAsInt(CommandDef.COMMAND_MIN_APK_VERSION_FOR_MULTI_PROCESS, XWalkEnvironment.MODULE_TOOLS, MIN_APK_VERSION_FOR_MULTI_PROCESS);
    }

    public int getTraceRatioInTenThousand(String str) {
        String cmd = getCmd(CommandDef.COMMAND_SET_TRACE_SAMPLE_RATIO_IN_TEN_THOUSAND, str);
        if (TextUtils.isEmpty(cmd) || !TextUtils.isDigitsOnly(cmd)) {
            return 0;
        }
        return Integer.parseInt(cmd);
    }

    public WebView.WebViewKind getWebKind(String str) {
        return convertWebType(getCmd(CommandDef.COMMAND_HARD_CODE_WEB_TYPE, str));
    }

    public int getWebViewModeCommandForAppBrand() {
        return getCmdAsInt(CommandDef.COMMAND_WEBVIEW_MODE_FOR_APPBRAND, XWalkEnvironment.MODULE_APPBRAND, XWebSdk.WebViewModeForAppBrand.DISABLE_MULTI_PROCESS.ordinal());
    }

    public int getWebViewModeCommandForMM() {
        return getCmdAsInt(CommandDef.COMMAND_WEBVIEW_MODE_FOR_MM, XWalkEnvironment.MODULE_MM, getMMWebViewDowngradeMode());
    }

    public boolean getWxdkDowngrade() {
        return getCmdAsBoolean(CommandDef.COMMAND_MM_WXDK_DOWNGRADE, XWalkEnvironment.MODULE_MM, true);
    }

    public synchronized void initCommandConfigs() {
        XWebLog.m21911i(getLogTag(), "initCommandConfigs start");
        this.sMapCommandConfigs.clear();
        SharedPreferences sharePreferenceForCommandConfigLatest = getSharePreferenceForCommandConfigLatest();
        if (!isCommandConfigSharedPreferenceReady(sharePreferenceForCommandConfigLatest)) {
            sharePreferenceForCommandConfigLatest = getSharePreferenceForCommandConfig();
            if (!isCommandConfigSharedPreferenceReady(sharePreferenceForCommandConfigLatest)) {
                XWebLog.m21913w(getLogTag(), "initCommandConfigs, section A and B both not ready!!!");
                WXWebReporter.idkeyReport(1749, 46, 1);
            } else {
                XWebLog.m21911i(getLogTag(), "initCommandConfigs, section A is ready");
                WXWebReporter.idkeyReport(1749, 47, 1);
            }
        } else {
            XWebLog.m21911i(getLogTag(), "initCommandConfigs, section B is ready");
            WXWebReporter.idkeyReport(1749, 48, 1);
        }
        sStrConfigVer = sharePreferenceForCommandConfigLatest.getString(cStrSpKeyTAGConfigVer, "");
        String string = sharePreferenceForCommandConfigLatest.getString(cStrSpKeyTAGConfigSdkVer, "");
        boolean z = false;
        int intValue = !TextUtils.isEmpty(string) ? NumberUtil.safeParseInt(string).intValue() : 0;
        sNConfigSdkVer = intValue;
        if (intValue < MIN_SDK_VERSION_FOR_COMMAND_CONFIG) {
            z = true;
            String logTag = getLogTag();
            XWebLog.m21911i(logTag, "config sdk version(" + intValue + ") is old, use deserialize from old");
        }
        Map<String, ?> all = sharePreferenceForCommandConfigLatest.getAll();
        if (all != null) {
            if (all.size() != 0) {
                for (Map.Entry<String, ?> key : all.entrySet()) {
                    String str = (String) key.getKey();
                    String string2 = sharePreferenceForCommandConfigLatest.getString(str, "");
                    if (!(str == null || string2 == null)) {
                        Map<String, String> deserializeMapOld = z ? deserializeMapOld(string2) : deserializeMap(string2);
                        if (deserializeMapOld != null) {
                            if (deserializeMapOld.size() != 0) {
                                this.sMapCommandConfigs.put(str, deserializeMapOld);
                            }
                        }
                        this.sMapCommandConfigs.put(str, string2);
                    }
                }
                String logTag2 = getLogTag();
                XWebLog.m21911i(logTag2, "initCommandConfigs end, config version:" + sStrConfigVer + ", config sdk version:" + sNConfigSdkVer + ", config map size:" + this.sMapCommandConfigs.size());
                return;
            }
        }
        XWebLog.m21911i(getLogTag(), "initCommandConfigs end, empty command configs");
    }

    public boolean isForbidRecheckCmd(String str) {
        return CommandDef.COMMAND_REVERT_TO_VERSION.equals(str);
    }

    public String[] parseOpValue(String str) {
        String[] strArr = new String[2];
        if (str == null || !str.contains(":")) {
            return null;
        }
        int indexOf = str.indexOf(58);
        strArr[0] = str.substring(0, indexOf);
        if (str.length() - 1 <= indexOf) {
            strArr[1] = "";
        } else {
            strArr[1] = str.substring(indexOf + 1);
        }
        return strArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.putString((java.lang.String) r2.getKey(), r3.toString());
        r4 = getLogTag();
        com.tencent.xweb.util.XWebLog.m21911i(r4, "saveCommandConfigs error, command:" + ((java.lang.String) r2.getKey()) + ", map:" + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void saveCommandConfigs(java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.SharedPreferences r0 = r7.getSharePreferenceForCommandConfigLatest()     // Catch:{ all -> 0x0108 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0108 }
            java.lang.String r1 = "cStrSpKeyConfigsReady"
            java.lang.String r2 = "false"
            r0.putString(r1, r2)     // Catch:{ all -> 0x0108 }
            r0.commit()     // Catch:{ all -> 0x0108 }
            android.content.SharedPreferences r1 = r7.getSharePreferenceForCommandConfigLatest()     // Catch:{ all -> 0x0108 }
            r7.clearOldCommandConfigs(r9, r1)     // Catch:{ all -> 0x0108 }
            java.lang.String r1 = "cStrTAGConfigVer"
            r0.putString(r1, r8)     // Catch:{ all -> 0x0108 }
            java.lang.String r1 = "cStrTAGConfigSdkVer"
            int r2 = com.tencent.xweb.XWebSdk.getXWebSdkVersion()     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0108 }
            r0.putString(r1, r2)     // Catch:{ all -> 0x0108 }
            if (r9 == 0) goto L_0x003e
            boolean r1 = r9.isEmpty()     // Catch:{ all -> 0x0108 }
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = r7.getLogTag()     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "saveCommandConfigs, new command configs is empty"
            com.tencent.xweb.util.XWebLog.m21913w(r1, r2)     // Catch:{ all -> 0x0108 }
        L_0x003e:
            java.util.Set r1 = r9.entrySet()     // Catch:{ all -> 0x0108 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0108 }
        L_0x0046:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0108 }
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0108 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0108 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x0108 }
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x0108 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0108 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0108 }
            if (r3 == 0) goto L_0x0065
            goto L_0x0046
        L_0x0065:
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x0108 }
            if (r3 != 0) goto L_0x006c
            goto L_0x0046
        L_0x006c:
            boolean r4 = r3 instanceof java.util.Map     // Catch:{ all -> 0x0108 }
            if (r4 == 0) goto L_0x00b9
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0084 }
            if (r4 != 0) goto L_0x0076
            goto L_0x0046
        L_0x0076:
            java.lang.String r4 = r7.serializeMap(r4)     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0084 }
            r0.putString(r5, r4)     // Catch:{ all -> 0x0084 }
            goto L_0x0046
        L_0x0084:
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x0108 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0108 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0108 }
            r0.putString(r4, r5)     // Catch:{ all -> 0x0108 }
            java.lang.String r4 = r7.getLogTag()     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
            r5.<init>()     // Catch:{ all -> 0x0108 }
            java.lang.String r6 = "saveCommandConfigs error, command:"
            r5.append(r6)     // Catch:{ all -> 0x0108 }
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0108 }
            r5.append(r2)     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = ", map:"
            r5.append(r2)     // Catch:{ all -> 0x0108 }
            r5.append(r3)     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0108 }
            com.tencent.xweb.util.XWebLog.m21911i(r4, r2)     // Catch:{ all -> 0x0108 }
            goto L_0x0046
        L_0x00b9:
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0108 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0108 }
            r0.putString(r2, r3)     // Catch:{ all -> 0x0108 }
            goto L_0x0046
        L_0x00c7:
            java.lang.String r1 = "cStrSpKeyConfigsReady"
            java.lang.String r2 = "true"
            r0.putString(r1, r2)     // Catch:{ all -> 0x0108 }
            boolean r0 = r0.commit()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00d9
            sStrConfigVer = r8     // Catch:{ all -> 0x0108 }
            r7.sMapCommandConfigs = r9     // Catch:{ all -> 0x0108 }
        L_0x00d9:
            java.lang.String r8 = r7.getLogTag()     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
            r9.<init>()     // Catch:{ all -> 0x0108 }
            java.lang.String r1 = "saveCommandConfigs, result:"
            r9.append(r1)     // Catch:{ all -> 0x0108 }
            r9.append(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = ", sp size:"
            r9.append(r0)     // Catch:{ all -> 0x0108 }
            android.content.SharedPreferences r0 = r7.getSharePreferenceForCommandConfigLatest()     // Catch:{ all -> 0x0108 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0108 }
            int r0 = r0.size()     // Catch:{ all -> 0x0108 }
            r9.append(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0108 }
            com.tencent.xweb.util.XWebLog.m21911i(r8, r9)     // Catch:{ all -> 0x0108 }
            monitor-exit(r7)
            return
        L_0x0108:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.CommandCfg.saveCommandConfigs(java.lang.String, java.util.Map):void");
    }

    public String serializeMap(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() != 0) {
                sb.append(SPLIT_MODULES);
            }
            sb.append((String) next.getKey());
            sb.append(SPLIT_CMD_AND_MODULES);
            sb.append((String) next.getValue());
        }
        return sb.toString();
    }

    public void setCommandForTest(String str, String str2) {
        synchronized (this) {
            if (this.sMapCommandConfigs == null) {
                this.sMapCommandConfigs = new HashMap();
            }
            HashMap hashMap = new HashMap();
            hashMap.put(XWalkEnvironment.MODULE_TOOLS, str2);
            hashMap.put(XWalkEnvironment.MODULE_APPBRAND, str2);
            hashMap.put("support", str2);
            hashMap.put(XWalkEnvironment.MODULE_MM, str2);
            this.sMapCommandConfigs.put(str, hashMap);
        }
    }

    public synchronized Map<String, String> getCommandMap(String str, Map<String, Object> map) {
        if (str != null) {
            if (!str.isEmpty()) {
                Object obj = map.get(str);
                if (obj instanceof HashMap) {
                    return (Map) obj;
                }
                return new HashMap();
            }
        }
        return new HashMap();
    }

    public synchronized void applyCommand(ConfigDef.Command[] commandArr, String str, boolean z) {
        applyCommandInternal(commandArr, str, z);
    }

    public synchronized String getCmd(String str, String str2) {
        return getCmdInternal(str, str2);
    }
}
