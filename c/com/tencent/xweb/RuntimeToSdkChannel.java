package com.tencent.xweb;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.xweb.pinus.XWebBrowserProcessHelper;
import com.tencent.xweb.util.ReflectionUtils;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class RuntimeToSdkChannel {
    public static final String KEY_CREATE_JAVA_CRASH_DUMP_FILE = "KEY_CREATE_JAVA_CRASH_DUMP_FILE";
    public static final String KEY_CREATE_NATIVE_CRASH_DUMP_FILE = "KEY_CREATE_NATIVE_CRASH_DUMP_FILE";
    public static final String KEY_DECREASE_CHILD_PROCESS_CRASH_COUNT = "KEY_DECREASE_CHILD_PROCESS_CRASH_COUNT";
    public static final String KEY_GET_CONFIG_CMD = "GET_CONFIG_CMD";
    public static final String KEY_GET_CONFIG_CMD_EXTEND = "GET_CONFIG_CMD_EXTEND";
    public static final String KEY_INCREASE_CHILD_PROCESS_CRASH_COUNT = "KEY_INCREASE_CHILD_PROCESS_CRASH_COUNT";
    public static final String KEY_INVOKE_METHOD = "INVOKE_INSTANCE_METHOD";
    public static final String KEY_MULTI_PROCESS_DOWNGRADE_CRASH = "KEY_MULTI_PROCESS_DOWNGRADE_CRASH";
    public static final String KEY_MULTI_PROCESS_DOWNGRADE_SYS = "KEY_MULTI_PROCESS_DOWNGRADE_SYS";
    public static final String KEY_REPORT_REQUEST_IP = "KEY_REPORT_REQUEST_IP";
    public static final String KEY_STATIC_METHOD = "INVOKE_STATIC_METHOD";
    public static final String KEY_XPROFILE_RESULT_FORWARD_TO_SDK = "KEY_XPROFILE_RESULT_FORWARD_TO_SDK";
    public static final String KEY_XPROFILE_TRACING_FRAME_COST_RESULT = "KEY_XPROFILE_TRACING_FRAME_COST_RESULT";
    public static final String KEY_X_MEMORY_DUMP = "KEY_X_MEMORY_DUMP";
    private static final String TAG = "RuntimeToSdkChannel";

    public static Object[] createRuntimeToSdkChannelObject() {
        return new Object[]{new ValueCallback() {
            public void onReceiveValue(Object obj) {
                if (!(obj instanceof Object[])) {
                    XWebLog.m21913w(RuntimeToSdkChannel.TAG, "RuntimeToSdkChannel, invalid args");
                    return;
                }
                Object[] objArr = (Object[]) obj;
                if (objArr.length < 3) {
                    XWebLog.m21913w(RuntimeToSdkChannel.TAG, "RuntimeToSdkChannel, invalid args length");
                    return;
                }
                Object obj2 = objArr[0];
                if (!(obj2 instanceof String)) {
                    XWebLog.m21913w(RuntimeToSdkChannel.TAG, "RuntimeToSdkChannel, invalid args[0]");
                } else {
                    objArr[2] = RuntimeToSdkChannel.onRuntimeCalled((String) obj2, objArr[1]);
                }
            }
        }};
    }

    private static String handleCreateJavaCrashDumpFile(Object obj) {
        if (!(obj instanceof String)) {
            XWebLog.m21913w(TAG, "handleCreateJavaCrashDumpFile, invalid args");
            return null;
        }
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && XWebBrowserProcessHelper.getCrashDumpFileCallback() != null) {
            XWebLog.m21911i(TAG, "handleCreateJavaCrashDumpFile, serviceName:" + str);
            if (str.contains("SandboxedProcessService")) {
                return XWebBrowserProcessHelper.getCrashDumpFileCallback().getJavaCrashDumpFilePath(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX);
            }
            if (str.contains("PrivilegedProcessService")) {
                return XWebBrowserProcessHelper.getCrashDumpFileCallback().getJavaCrashDumpFilePath(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_GPU);
            }
        }
        return null;
    }

    private static String handleCreateNativeCrashDumpFile(Object obj) {
        if (!(obj instanceof String)) {
            XWebLog.m21913w(TAG, "handleCreateNativeCrashDumpFile, invalid args");
            return null;
        }
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && XWebBrowserProcessHelper.getCrashDumpFileCallback() != null) {
            XWebLog.m21911i(TAG, "handleCreateNativeCrashDumpFile, serviceName:" + str);
            if (str.contains("SandboxedProcessService")) {
                return XWebBrowserProcessHelper.getCrashDumpFileCallback().getNativeCrashDumpFilePath(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX);
            }
            if (str.contains("PrivilegedProcessService")) {
                return XWebBrowserProcessHelper.getCrashDumpFileCallback().getNativeCrashDumpFilePath(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_GPU);
            }
        }
        return null;
    }

    private static Object handleDecreaseChildProcessCrashCount() {
        XWebChildProcessMonitor.decreaseCrashCount();
        return null;
    }

    private static Object handleGetConfigCmd(Object obj) {
        if (!(obj instanceof String[])) {
            XWebLog.m21913w(TAG, "handleGetConfigCmd, invalid args");
            return "";
        }
        String[] strArr = (String[]) obj;
        if (strArr.length >= 2) {
            return TextUtils.isEmpty(strArr[1]) ? CommandCfg.getInstance().getCmd(strArr[0]) : CommandCfg.getInstance().getCmd(strArr[0], strArr[1]);
        }
        XWebLog.m21913w(TAG, "handleGetConfigCmd, invalid args length");
        return "";
    }

    private static Object handleGetConfigCmdExtend(Object obj) {
        if (!(obj instanceof String[])) {
            XWebLog.m21913w(TAG, "handleGetConfigCmdExtend, invalid args");
            return "";
        }
        String[] strArr = (String[]) obj;
        if (strArr.length >= 2) {
            return TextUtils.isEmpty(strArr[1]) ? CommandCfgPlugin.getInstance().getCmd(strArr[0]) : CommandCfgPlugin.getInstance().getCmd(strArr[0], strArr[1]);
        }
        XWebLog.m21913w(TAG, "handleGetConfigCmdExtend, invalid args length");
        return "";
    }

    private static Object handleIncreaseChildProcessCrashCount() {
        XWebChildProcessMonitor.increaseCrashCount();
        return null;
    }

    private static Object handleInvokeMethod(Object obj) {
        if (!(obj instanceof Object[])) {
            XWebLog.m21913w(TAG, "handleInvokeMethod, invalid args");
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr == null || objArr.length < 2) {
            XWebLog.m21913w(TAG, "handleInvokeMethod, invalid args length");
            return null;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof Object)) {
            XWebLog.m21913w(TAG, "handleInvokeMethod, invalid args[0]");
            return null;
        } else if (!(objArr[1] instanceof String)) {
            XWebLog.m21913w(TAG, "handleInvokeMethod, invalid args[1]");
            return null;
        } else {
            if (obj2 instanceof String) {
                obj2 = ReflectionUtils.instanceFromName((String) obj2);
            }
            if (obj2 == null) {
                XWebLog.m21913w(TAG, "handleInvokeMethod, instance is null");
                return null;
            }
            String str = (String) objArr[1];
            if (2 == objArr.length) {
                return ReflectionUtils.invokeInstance(obj2, str);
            }
            if (4 != objArr.length) {
                return ReflectionUtils.invokeInstance(obj2, str);
            }
            Object obj3 = objArr[2];
            if (!(obj3 instanceof Class[])) {
                return ReflectionUtils.invokeInstance(obj2, str);
            }
            Object obj4 = objArr[3];
            return !(obj4 instanceof Object[]) ? ReflectionUtils.invokeInstance(obj2, str) : ReflectionUtils.invokeInstance(obj2, str, (Class[]) obj3, (Object[]) obj4);
        }
    }

    private static Object handleMemoryDump(Object obj) {
        if (!(obj instanceof Bundle)) {
            XWebLog.m21913w(TAG, "handleMemoryDump, invalid args");
            return null;
        }
        Bundle bundle = (Bundle) obj;
        if (!bundle.containsKey("json") || !bundle.containsKey("map")) {
            XWebLog.m21913w(TAG, "handleMemoryDump, invalid args, Bundle not containsKey");
            return null;
        }
        if (XWebRuntimeToSdkHelper.getXWebMemoryDumpInterface() != null) {
            XWebRuntimeToSdkHelper.getXWebMemoryDumpInterface().onMemoryDumpFinished(bundle.getString("json"), bundle.getBundle("map"));
        }
        return null;
    }

    private static Object handleMultiProcessDowngradeCrash(Object obj) {
        if (!(obj instanceof String)) {
            XWebChildProcessMonitor.recordChildProcessCrash((String) null);
            return null;
        }
        XWebChildProcessMonitor.recordChildProcessCrash((String) obj);
        return null;
    }

    private static Object handleMultiProcessDowngradeSys(Object obj) {
        if (!(obj instanceof String)) {
            XWebChildProcessMonitor.setShouldSwitchToSys(true, (String) null);
            return null;
        }
        XWebChildProcessMonitor.setShouldSwitchToSys(true, (String) obj);
        return null;
    }

    private static Object handleReportRequestIP(Object obj) {
        if (!(obj instanceof Bundle)) {
            XWebLog.m21913w(TAG, "handleReportRequestIP, invalid args");
            return null;
        }
        Bundle bundle = (Bundle) obj;
        if (XWebRuntimeToSdkHelper.getXWebReportRequestIpInterface() != null) {
            XWebRuntimeToSdkHelper.getXWebReportRequestIpInterface().onCallback(bundle);
        }
        return null;
    }

    private static Object handleStaticMethod(Object obj) {
        if (!(obj instanceof Object[])) {
            XWebLog.m21913w(TAG, "handleStaticMethod, invalid args");
            return null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr == null || objArr.length < 2) {
            XWebLog.m21913w(TAG, "handleStaticMethod, invalid args length");
            return null;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof String)) {
            XWebLog.m21913w(TAG, "handleStaticMethod, invalid args[0]");
            return null;
        }
        Object obj3 = objArr[1];
        if (!(obj3 instanceof String)) {
            XWebLog.m21913w(TAG, "handleStaticMethod, invalid args[1]");
            return null;
        }
        String str = (String) obj2;
        String str2 = (String) obj3;
        if (2 == objArr.length) {
            return ReflectionUtils.invokeStatic(str, str2);
        }
        if (4 != objArr.length) {
            return ReflectionUtils.invokeInstance(str, str2);
        }
        Object obj4 = objArr[2];
        if (!(obj4 instanceof Class[])) {
            return ReflectionUtils.invokeStatic(str, str2);
        }
        Object obj5 = objArr[3];
        return !(obj5 instanceof Object[]) ? ReflectionUtils.invokeStatic(str, str2) : ReflectionUtils.invokeStatic(str, str2, (Class<?>[]) (Class[]) obj4, (Object[]) obj5);
    }

    private static Object handleXProfileResult(Object obj) {
        XWebProfilerController.getInstance().onProfileStop(obj);
        return null;
    }

    public static Object onRuntimeCalled(String str, Object obj) {
        if (KEY_GET_CONFIG_CMD.equals(str)) {
            return handleGetConfigCmd(obj);
        }
        if (KEY_GET_CONFIG_CMD_EXTEND.equals(str)) {
            return handleGetConfigCmdExtend(obj);
        }
        if (KEY_INVOKE_METHOD.equals(str)) {
            return handleInvokeMethod(obj);
        }
        if (KEY_STATIC_METHOD.equals(str)) {
            return handleStaticMethod(obj);
        }
        if (KEY_XPROFILE_RESULT_FORWARD_TO_SDK.equals(str) || KEY_XPROFILE_TRACING_FRAME_COST_RESULT.equals(str)) {
            return handleXProfileResult(obj);
        }
        if (KEY_CREATE_JAVA_CRASH_DUMP_FILE.equals(str)) {
            return handleCreateJavaCrashDumpFile(obj);
        }
        if (KEY_CREATE_NATIVE_CRASH_DUMP_FILE.equals(str)) {
            return handleCreateNativeCrashDumpFile(obj);
        }
        if (KEY_X_MEMORY_DUMP.equals(str)) {
            return handleMemoryDump(obj);
        }
        if (KEY_REPORT_REQUEST_IP.equals(str)) {
            return handleReportRequestIP(obj);
        }
        if (KEY_INCREASE_CHILD_PROCESS_CRASH_COUNT.equals(str)) {
            return handleIncreaseChildProcessCrashCount();
        }
        if (KEY_DECREASE_CHILD_PROCESS_CRASH_COUNT.equals(str)) {
            return handleDecreaseChildProcessCrashCount();
        }
        if (KEY_MULTI_PROCESS_DOWNGRADE_SYS.equals(str)) {
            return handleMultiProcessDowngradeSys(obj);
        }
        if (KEY_MULTI_PROCESS_DOWNGRADE_CRASH.equals(str)) {
            return handleMultiProcessDowngradeCrash(obj);
        }
        return null;
    }
}
