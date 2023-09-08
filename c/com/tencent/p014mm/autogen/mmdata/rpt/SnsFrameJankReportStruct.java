package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFrameJankReportStruct */
public final class SnsFrameJankReportStruct extends C61103a {

    /* renamed from: d */
    public String f266043d = "";

    /* renamed from: e */
    public long f266044e = -1;

    /* renamed from: f */
    public long f266045f = -1;

    /* renamed from: g */
    public long f266046g = -1;

    /* renamed from: h */
    public long f266047h = -1;

    /* renamed from: i */
    public String f266048i = "";

    /* renamed from: j */
    public int f266049j = 0;

    /* renamed from: k */
    public String f266050k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26077;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266043d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266044e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266045f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266046g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266047h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266048i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266049j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266050k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266043d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FrameStartNanos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266044e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FrameDurationUiNanos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266045f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FrameDurationCpuNanos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266046g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FrameOverrunNanos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266047h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JankState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266048i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnableItemImprove");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266049j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpuInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266050k);
        return stringBuffer.toString();
    }
}
