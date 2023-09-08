package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tinker.loader.SystemClassLoaderAdder;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFinishLoadingStruct */
public final class WeAppQualityFinishLoadingStruct extends C61103a {

    /* renamed from: d */
    public String f236799d = "";

    /* renamed from: e */
    public String f236800e = "";

    /* renamed from: f */
    public long f236801f = 0;

    /* renamed from: g */
    public C80765a f236802g;

    /* renamed from: h */
    public long f236803h = 0;

    /* renamed from: i */
    public long f236804i = 0;

    /* renamed from: j */
    public long f236805j = 0;

    /* renamed from: k */
    public long f236806k = 0;

    /* renamed from: l */
    public String f236807l = "";

    /* renamed from: m */
    public long f236808m;

    /* renamed from: n */
    public long f236809n;

    /* renamed from: o */
    public long f236810o;

    /* renamed from: p */
    public long f236811p;

    /* renamed from: q */
    public long f236812q;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFinishLoadingStruct$a */
    public enum C80765a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236817d;

        /* access modifiers changed from: public */
        C80765a(int i) {
            this.f236817d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 19266;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236799d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236800e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236801f);
        stringBuffer.append(",");
        C80765a aVar = this.f236802g;
        stringBuffer.append(aVar != null ? aVar.f236817d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236803h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236804i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f236805j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236806k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236807l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236808m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236809n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236810o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236811p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236812q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236799d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236800e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236801f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236802g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236803h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236804i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236805j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236806k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236807l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isDownloadCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236808m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SystemClassLoaderAdder.CHECK_DEX_FIELD);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236809n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236810o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("initProcess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236811p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LoadingInEndT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236812q);
        return stringBuffer.toString();
    }
}
