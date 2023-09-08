package com.tencent.xweb;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.report.KVReportForUrlDispatch;
import com.tencent.xweb.util.XWebLog;
import java.util.ArrayList;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public class UrlDispatcher {
    public static final String TAG = "UrlDispatcher";
    private static boolean sInited;
    private static List<String> sListSuffixBlackList = new ArrayList();
    private static List<String> sListSuffixWhiteList = new ArrayList();
    private static List<String> sListSuffixWhiteListSwitchToTools = new ArrayList();

    static {
        init();
    }

    private static String getHost(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("http")) {
            trim = HttpWrapperBase.PROTOCAL_HTTP + trim;
        }
        String host = Uri.parse(trim).getHost();
        XWebLog.m21911i(TAG, "getHost, host:" + host + ", url:" + trim);
        return host;
    }

    public static synchronized boolean init() {
        synchronized (UrlDispatcher.class) {
            if (sInited) {
                return true;
            }
            try {
                String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_TOOLS_WHITE_LIST_HOST_SUFFIX, XWalkEnvironment.MODULE_TOOLS);
                String cmd2 = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_NEW_WHITE_LIST_HOST_SUFFIX, XWalkEnvironment.MODULE_TOOLS);
                String cmd3 = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_NEW_BLACK_LIST_HOST_SUFFIX, XWalkEnvironment.MODULE_TOOLS);
                sListSuffixWhiteListSwitchToTools.addAll(splitList(cmd));
                sListSuffixWhiteList.addAll(splitList(cmd2));
                sListSuffixBlackList.addAll(splitList(cmd3));
                sInited = true;
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "init failed error", th);
            }
            boolean z = sInited;
            return z;
        }
    }

    private static boolean isMatchSuffix(String str, List<String> list) {
        for (String next : list) {
            if (!TextUtils.isEmpty(str)) {
                if ("all".equalsIgnoreCase(next)) {
                    return true;
                }
                if (str.endsWith(next) && (str.length() == next.length() || str.charAt((str.length() - next.length()) - 1) == '.')) {
                    return true;
                }
            }
        }
        return false;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean needSwitchToTools(String str) {
        if (!init()) {
            XWebLog.m21911i(TAG, "needSwitchToTools false, init failed, url:" + str);
            return false;
        }
        String host = getHost(str);
        if (TextUtils.isEmpty(host)) {
            XWebLog.m21909e(TAG, "needSwitchToTools false, host is empty");
            return false;
        } else if (isMatchSuffix(host, sListSuffixWhiteListSwitchToTools)) {
            XWebLog.m21911i(TAG, "needSwitchToTools true, host in whitelist, host:" + host);
            KVReportForUrlDispatch.report(host, 1);
            return true;
        } else {
            XWebLog.m21911i(TAG, "needSwitchToTools false, host:" + host + ", url:" + str);
            return false;
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean needUseXWeb(String str) {
        if (!init()) {
            XWebLog.m21911i(TAG, "needUseXWeb true, init failed, url:" + str);
            return true;
        }
        String host = getHost(str);
        if (TextUtils.isEmpty(host)) {
            XWebLog.m21909e(TAG, "needUseXWeb true, host is empty");
            return true;
        } else if (isMatchSuffix(host, sListSuffixWhiteList)) {
            XWebLog.m21911i(TAG, "needUseXWeb true, host in whitelist, host:" + host);
            KVReportForUrlDispatch.report(host, 2);
            return true;
        } else if (isMatchSuffix(host, sListSuffixBlackList)) {
            XWebLog.m21911i(TAG, "needUseXWeb false, host in blacklist, host:" + host);
            KVReportForUrlDispatch.report(host, 3);
            return false;
        } else {
            XWebLog.m21911i(TAG, "needUseXWeb true, host:" + host + ", url:" + str);
            return true;
        }
    }

    public static synchronized void refresh() {
        synchronized (UrlDispatcher.class) {
            sInited = false;
            sListSuffixWhiteListSwitchToTools = new ArrayList();
            sListSuffixWhiteList = new ArrayList();
            sListSuffixBlackList = new ArrayList();
            init();
        }
    }

    private static List<String> splitList(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        if (!(TextUtils.isEmpty(str) || (split = str.split(",")) == null || split.length == 0)) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }
}
