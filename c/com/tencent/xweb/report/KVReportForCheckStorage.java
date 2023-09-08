package com.tencent.xweb.report;

import android.text.TextUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import java.util.ArrayList;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForCheckStorage {

    /* renamed from: ID */
    public static final int f57016ID = 24156;
    private long appXWalkTotalSize;
    private long configSize;
    private List<VersionSize> excelVersionList = new ArrayList();
    private List<VersionSize> officeVersionList = new ArrayList();
    private List<VersionSize> pdfVersionList = new ArrayList();
    private long pluginTotalSize;
    private List<VersionSize> pptVersionList = new ArrayList();
    private List<VersionSize> txtVersionList = new ArrayList();
    private List<VersionSize> videoVersionList = new ArrayList();
    private List<VersionSize> wordVersionList = new ArrayList();
    private List<VersionSize> xwebVersionList = new ArrayList();

    public class VersionSize {
        private long size;
        private int version;

        public VersionSize(int i, long j) {
            this.version = i;
            this.size = j;
        }

        public String toString() {
            return FastJsonResponse.QUOTE + this.version + "\":" + this.size;
        }
    }

    public void appendPluginVersion(String str, int i, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_PDF)) {
            this.pdfVersionList.add(new VersionSize(i, j));
        } else if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_WORD)) {
            this.wordVersionList.add(new VersionSize(i, j));
        } else if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL)) {
            this.excelVersionList.add(new VersionSize(i, j));
        } else if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_PPT)) {
            this.pptVersionList.add(new VersionSize(i, j));
        } else if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE)) {
            this.officeVersionList.add(new VersionSize(i, j));
        } else if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_TXT)) {
            this.txtVersionList.add(new VersionSize(i, j));
        } else if (str.startsWith(XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO)) {
            this.videoVersionList.add(new VersionSize(i, j));
        }
    }

    public void appendXWebVersion(int i, long j) {
        this.xwebVersionList.add(new VersionSize(i, j));
    }

    public String convertListToJSON(List<VersionSize> list) {
        if (list == null || list.isEmpty()) {
            return "{}";
        }
        ArrayList arrayList = new ArrayList();
        for (VersionSize versionSize : list) {
            arrayList.add(versionSize.toString());
        }
        return "{" + TextUtils.join(";", arrayList) + "}";
    }

    public void report() {
        WXWebReporter.setKVLog(f57016ID, XWebSdk.getXWebSdkVersion() + "," + XWebSdk.getAvailableVersion() + "," + XWalkEnvironment.getInstalledPluginVersion(XWalkEnvironment.getApplicationContext(), XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO) + "," + XWalkEnvironment.getInstalledPluginVersion(XWalkEnvironment.getApplicationContext(), XWalkPluginManager.XWALK_PLUGIN_NAME_PDF) + "," + XWalkEnvironment.getInstalledPluginVersion(XWalkEnvironment.getApplicationContext(), XWalkPluginManager.XWALK_PLUGIN_NAME_WORD) + "," + XWalkEnvironment.getInstalledPluginVersion(XWalkEnvironment.getApplicationContext(), XWalkPluginManager.XWALK_PLUGIN_NAME_EXCEL) + "," + XWalkEnvironment.getInstalledPluginVersion(XWalkEnvironment.getApplicationContext(), XWalkPluginManager.XWALK_PLUGIN_NAME_PPT) + "," + XWalkEnvironment.getInstalledPluginVersion(XWalkEnvironment.getApplicationContext(), XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE) + "," + convertListToJSON(this.xwebVersionList) + "," + convertListToJSON(this.videoVersionList) + "," + convertListToJSON(this.pdfVersionList) + "," + convertListToJSON(this.wordVersionList) + "," + convertListToJSON(this.excelVersionList) + "," + convertListToJSON(this.pptVersionList) + "," + convertListToJSON(this.officeVersionList) + "," + this.configSize + "," + this.pluginTotalSize + "," + this.appXWalkTotalSize + "," + this.xwebVersionList.size() + "," + this.videoVersionList.size() + "," + this.pdfVersionList.size() + "," + this.wordVersionList.size() + "," + this.excelVersionList.size() + "," + this.pptVersionList.size() + "," + this.officeVersionList.size());
    }

    public void setAppXWalkTotalSize(long j) {
        this.appXWalkTotalSize = j;
    }

    public void setConfigSize(long j) {
        this.configSize = j;
    }

    public void setPluginTotalSize(long j) {
        this.pluginTotalSize = j;
    }
}
