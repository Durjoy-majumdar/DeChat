package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EffectRenderReportStruct */
public final class EffectRenderReportStruct extends C61103a {

    /* renamed from: d */
    public int f310158d;

    /* renamed from: e */
    public int f310159e;

    /* renamed from: f */
    public long f310160f;

    /* renamed from: g */
    public long f310161g;

    /* renamed from: h */
    public int f310162h = 0;

    /* renamed from: i */
    public int f310163i = 0;

    /* renamed from: j */
    public int f310164j = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 23689;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310158d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310159e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310160f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310161g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310162h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310163i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310164j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310158d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310159e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310160f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310161g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SizeError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310162h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InputError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310163i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OutputError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310164j);
        return stringBuffer.toString();
    }
}
