package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoiceBreakPointConPlayStruct */
public final class VoiceBreakPointConPlayStruct extends C61103a {

    /* renamed from: d */
    public long f69625d;

    /* renamed from: e */
    public long f69626e;

    /* renamed from: f */
    public String f69627f = "";

    /* renamed from: g */
    public String f69628g = "";

    /* renamed from: h */
    public long f69629h;

    /* renamed from: i */
    public long f69630i;

    /* renamed from: j */
    public long f69631j;

    /* renamed from: j */
    public int mo1004j() {
        return 25041;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69625d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69626e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69627f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69628g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69629h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69630i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69631j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69625d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69626e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69627f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VoiceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69628g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69629h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StopReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69630i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69631j);
        return stringBuffer.toString();
    }
}
