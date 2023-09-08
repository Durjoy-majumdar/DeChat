package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tinker.loader.SystemClassLoaderAdder;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct */
public final class WeAppQualityLaunchJSStruct extends C61103a {

    /* renamed from: d */
    public String f236859d = "";

    /* renamed from: e */
    public String f236860e = "";

    /* renamed from: f */
    public long f236861f = 0;

    /* renamed from: g */
    public C80767a f236862g;

    /* renamed from: h */
    public long f236863h = 0;

    /* renamed from: i */
    public long f236864i = 0;

    /* renamed from: j */
    public long f236865j = 0;

    /* renamed from: k */
    public long f236866k = 0;

    /* renamed from: l */
    public long f236867l = 0;

    /* renamed from: m */
    public String f236868m = "";

    /* renamed from: n */
    public long f236869n = 0;

    /* renamed from: o */
    public long f236870o = 0;

    /* renamed from: p */
    public long f236871p = 0;

    /* renamed from: q */
    public String f236872q = "";

    /* renamed from: r */
    public long f236873r = 0;

    /* renamed from: s */
    public long f236874s;

    /* renamed from: t */
    public long f236875t;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct$a */
    public enum C80767a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236880d;

        /* access modifiers changed from: public */
        C80767a(int i) {
            this.f236880d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16010;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236859d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236860e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236861f);
        stringBuffer.append(",");
        C80767a aVar = this.f236862g;
        stringBuffer.append(aVar != null ? aVar.f236880d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236863h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236864i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236865j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236866k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236867l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236868m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236869n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236870o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236871p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236872q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236873r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236874s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236875t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236859d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236860e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236861f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236862g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236863h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236864i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236865j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236866k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236867l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236868m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isDownloadCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236869n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SystemClassLoaderAdder.CHECK_DEX_FIELD);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236870o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236871p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236872q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("initProcess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236873r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runningState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236874s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lazyCodeLoading");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236875t);
        return stringBuffer.toString();
    }
}
