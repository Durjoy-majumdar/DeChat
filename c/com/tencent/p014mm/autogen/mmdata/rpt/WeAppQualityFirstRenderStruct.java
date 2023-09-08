package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct */
public final class WeAppQualityFirstRenderStruct extends C61103a {

    /* renamed from: d */
    public String f236818d = "";

    /* renamed from: e */
    public String f236819e = "";

    /* renamed from: f */
    public long f236820f;

    /* renamed from: g */
    public C80766a f236821g;

    /* renamed from: h */
    public long f236822h;

    /* renamed from: i */
    public long f236823i;

    /* renamed from: j */
    public long f236824j;

    /* renamed from: k */
    public long f236825k;

    /* renamed from: l */
    public long f236826l;

    /* renamed from: m */
    public String f236827m = "";

    /* renamed from: n */
    public long f236828n;

    /* renamed from: o */
    public long f236829o;

    /* renamed from: p */
    public String f236830p = "";

    /* renamed from: q */
    public long f236831q;

    /* renamed from: r */
    public long f236832r;

    /* renamed from: s */
    public long f236833s;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFirstRenderStruct$a */
    public enum C80766a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236838d;

        /* access modifiers changed from: public */
        C80766a(int i) {
            this.f236838d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 18798;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236818d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236819e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236820f);
        stringBuffer.append(",");
        C80766a aVar = this.f236821g;
        stringBuffer.append(aVar != null ? aVar.f236838d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236822h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236823i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236824j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236825k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236826l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236827m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236828n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236829o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236830p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236831q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236832r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236833s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236818d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236819e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236820f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236821g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236822h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236823i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236824j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236825k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236826l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236827m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236828n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreloadPageFrame");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236829o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236830p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isSplitCodeLib");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236831q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("initProcess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236832r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFirstPageRenderingCacheAccepted");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236833s);
        return stringBuffer.toString();
    }
}
