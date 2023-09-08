package com.tencent.xweb;

class XWebRuntimeToSdkHelper {
    private static XWebMemoryDumpInterface sXWebMemoryDumpInterface;
    private static XWebReportRequestIpInterface sXWebReportRequestIpInterface;

    public static XWebMemoryDumpInterface getXWebMemoryDumpInterface() {
        return sXWebMemoryDumpInterface;
    }

    public static XWebReportRequestIpInterface getXWebReportRequestIpInterface() {
        return sXWebReportRequestIpInterface;
    }

    public static void setXWebMemoryDumpInterface(XWebMemoryDumpInterface xWebMemoryDumpInterface) {
        sXWebMemoryDumpInterface = xWebMemoryDumpInterface;
    }

    public static void setXWebReportRequestIpInterface(XWebReportRequestIpInterface xWebReportRequestIpInterface) {
        sXWebReportRequestIpInterface = xWebReportRequestIpInterface;
    }
}
