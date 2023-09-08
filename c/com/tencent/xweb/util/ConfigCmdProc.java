package com.tencent.xweb.util;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.updater.XWalkRuntimeRevertHelper;
import com.tencent.xweb.updater.XWebRuntimeInstaller;
import com.tencent.xweb.util.NumberUtil;
import org.xwalk.core.XWalkEnvironment;

public class ConfigCmdProc {
    private static final String TAG = "ConfigCmdProc";

    private static CommandCfg.CmdHandleRet handleCommandClearInstallEmbedVersionRecord(CommandCfg.CmdHandleRet cmdHandleRet) {
        cmdHandleRet.handled = true;
        XWebLog.m21911i(TAG, "handleCommandClearInstallEmbedVersionRecord");
        XWebRuntimeInstaller.clearLastTryEmbedInstallVersion();
        return cmdHandleRet;
    }

    private static CommandCfg.CmdHandleRet handleCommandRevertToVersion(CommandCfg.CmdHandleRet cmdHandleRet, String str) {
        cmdHandleRet.handled = true;
        NumberUtil.ParseResult safeParseInt = NumberUtil.safeParseInt(str);
        if (safeParseInt.parseSuc) {
            XWebLog.m21911i(TAG, "handleCommandRevertToVersion, version:" + str);
            XWalkRuntimeRevertHelper.revertToApkVer(XWalkEnvironment.getApplicationContext(), safeParseInt.intValue());
        }
        return cmdHandleRet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.tencent.xweb.CommandCfg.CmdHandleRet processCommand(java.lang.Object r6) {
        /*
            java.lang.Class<com.tencent.xweb.util.ConfigCmdProc> r0 = com.tencent.xweb.util.ConfigCmdProc.class
            monitor-enter(r0)
            com.tencent.xweb.CommandCfg$CmdHandleRet r1 = new com.tencent.xweb.CommandCfg$CmdHandleRet     // Catch:{ all -> 0x0072 }
            r1.<init>()     // Catch:{ all -> 0x0072 }
            boolean r2 = r6 instanceof com.tencent.xweb.util.ConfigDef.Command     // Catch:{ all -> 0x0072 }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r0)
            return r1
        L_0x000e:
            com.tencent.xweb.util.ConfigDef$Command r6 = (com.tencent.xweb.util.ConfigDef.Command) r6     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r6.optype     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = r6.opvalue     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = "executeCommand"
            boolean r4 = r2.equals(r4)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0036
            com.tencent.xweb.CommandCfg r2 = com.tencent.xweb.CommandCfg.getInstance()     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r6.opvalue     // Catch:{ all -> 0x0072 }
            java.lang.String[] r6 = r2.parseOpValue(r6)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0034
            int r2 = r6.length     // Catch:{ all -> 0x0072 }
            r3 = 2
            if (r2 >= r3) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            r2 = 0
            r2 = r6[r2]     // Catch:{ all -> 0x0072 }
            r3 = 1
            r3 = r6[r3]     // Catch:{ all -> 0x0072 }
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)
            return r1
        L_0x0036:
            java.lang.String r6 = "ConfigCmdProc"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r4.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "processCommand, type:"
            r4.append(r5)     // Catch:{ all -> 0x0072 }
            r4.append(r2)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = ", value:"
            r4.append(r5)     // Catch:{ all -> 0x0072 }
            r4.append(r3)     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0072 }
            com.tencent.xweb.util.XWebLog.m21908d(r6, r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "revertToVersion"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0062
            com.tencent.xweb.CommandCfg$CmdHandleRet r6 = handleCommandRevertToVersion(r1, r3)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)
            return r6
        L_0x0062:
            java.lang.String r6 = "cStrClearInstallEmbedVersionRecord"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0070
            com.tencent.xweb.CommandCfg$CmdHandleRet r6 = handleCommandClearInstallEmbedVersionRecord(r1)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)
            return r6
        L_0x0070:
            monitor-exit(r0)
            return r1
        L_0x0072:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ConfigCmdProc.processCommand(java.lang.Object):com.tencent.xweb.CommandCfg$CmdHandleRet");
    }
}
