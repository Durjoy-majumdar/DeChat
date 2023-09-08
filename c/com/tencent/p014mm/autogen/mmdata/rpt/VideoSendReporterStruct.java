package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct */
public final class VideoSendReporterStruct extends C61103a {

    /* renamed from: d */
    public String f266525d = "";

    /* renamed from: e */
    public long f266526e;

    /* renamed from: f */
    public long f266527f;

    /* renamed from: g */
    public String f266528g = "";

    /* renamed from: h */
    public long f266529h;

    /* renamed from: i */
    public long f266530i;

    /* renamed from: j */
    public long f266531j;

    /* renamed from: k */
    public long f266532k;

    /* renamed from: l */
    public int f266533l;

    /* renamed from: m */
    public String f266534m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24975;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266525d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266526e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266527f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266528g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266529h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266530i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266531j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266532k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266533l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266534m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266525d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266526e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266527f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266528g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266529h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266530i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompressSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266531j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266532k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FailReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266533l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266534m);
        return stringBuffer.toString();
    }
}
