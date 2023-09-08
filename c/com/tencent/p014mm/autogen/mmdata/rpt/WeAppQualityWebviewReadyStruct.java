package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct */
public final class WeAppQualityWebviewReadyStruct extends C61103a {

    /* renamed from: d */
    public String f237335d = "";

    /* renamed from: e */
    public String f237336e = "";

    /* renamed from: f */
    public long f237337f = 0;

    /* renamed from: g */
    public C80793a f237338g;

    /* renamed from: h */
    public long f237339h = 0;

    /* renamed from: i */
    public long f237340i = 0;

    /* renamed from: j */
    public long f237341j = 0;

    /* renamed from: k */
    public long f237342k = 0;

    /* renamed from: l */
    public long f237343l = 0;

    /* renamed from: m */
    public String f237344m = "";

    /* renamed from: n */
    public long f237345n = 0;

    /* renamed from: o */
    public long f237346o = 0;

    /* renamed from: p */
    public String f237347p = "";

    /* renamed from: q */
    public long f237348q = 0;

    /* renamed from: r */
    public long f237349r = 0;

    /* renamed from: s */
    public long f237350s;

    /* renamed from: t */
    public String f237351t = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewReadyStruct$a */
    public enum C80793a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237356d;

        /* access modifiers changed from: public */
        C80793a(int i) {
            this.f237356d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16011;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237335d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237336e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237337f);
        stringBuffer.append(",");
        C80793a aVar = this.f237338g;
        stringBuffer.append(aVar != null ? aVar.f237356d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237339h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237340i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237341j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237342k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237343l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237344m);
        stringBuffer.append(",");
        stringBuffer.append(this.f237345n);
        stringBuffer.append(",");
        stringBuffer.append(this.f237346o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237347p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237348q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237349r);
        stringBuffer.append(",");
        stringBuffer.append(this.f237350s);
        stringBuffer.append(",");
        stringBuffer.append(this.f237351t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237335d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237336e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237337f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237338g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237339h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237340i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237341j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237342k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237343l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237344m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237345n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreloadPageFrame");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237346o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237347p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("initProcess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237348q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFirstPageRenderingCacheAccepted");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237349r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runningState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237350s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneNote");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237351t);
        return stringBuffer.toString();
    }
}
