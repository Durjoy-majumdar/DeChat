package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRecordProfileReportStruct */
public final class FinderRecordProfileReportStruct extends C61103a {

    /* renamed from: d */
    public long f310165d;

    /* renamed from: e */
    public long f310166e;

    /* renamed from: f */
    public int f310167f;

    /* renamed from: g */
    public long f310168g;

    /* renamed from: h */
    public long f310169h;

    /* renamed from: i */
    public long f310170i;

    /* renamed from: j */
    public long f310171j;

    /* renamed from: k */
    public long f310172k;

    /* renamed from: l */
    public long f310173l;

    /* renamed from: m */
    public long f310174m;

    /* renamed from: n */
    public int f310175n;

    /* renamed from: j */
    public int mo1004j() {
        return 23312;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310165d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310166e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310167f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310168g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310169h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310170i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310171j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310172k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310173l);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f310174m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310175n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OpenCameraCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310165d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FirstFrameCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310166e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsCamera2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310167f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateRecorderCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310168g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StopRecorderCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310169h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310170i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderFrameCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310171j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EffectInitCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310172k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EffectTrackCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310173l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EffectRenderCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EffectErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310174m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NextStep");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310175n);
        return stringBuffer.toString();
    }
}
