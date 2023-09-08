package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.wxa_expt_hitStruct */
public final class wxa_expt_hitStruct extends C61103a {

    /* renamed from: d */
    public String f237501d = "";

    /* renamed from: e */
    public long f237502e = 0;

    /* renamed from: f */
    public long f237503f = 0;

    /* renamed from: g */
    public String f237504g = "";

    /* renamed from: h */
    public String f237505h = "";

    /* renamed from: i */
    public long f237506i;

    /* renamed from: j */
    public String f237507j = "";

    /* renamed from: k */
    public long f237508k = 0;

    /* renamed from: l */
    public long f237509l = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 21627;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237501d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237502e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237503f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237504g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237505h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237506i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237507j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237508k);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237509l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237501d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237502e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237503f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("libVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237504g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("libUpdateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237505h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exptGroupId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237506i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exptParam");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237507j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HitSrcType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237508k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JsDataType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237509l);
        return stringBuffer.toString();
    }
}
