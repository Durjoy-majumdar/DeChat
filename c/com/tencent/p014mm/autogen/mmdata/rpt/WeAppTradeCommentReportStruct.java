package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppTradeCommentReportStruct */
public final class WeAppTradeCommentReportStruct extends C61103a {

    /* renamed from: d */
    public int f237370d;

    /* renamed from: e */
    public int f237371e;

    /* renamed from: f */
    public int f237372f;

    /* renamed from: g */
    public String f237373g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27948;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237370d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237371e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237372f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237373g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237370d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237371e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237372f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237373g);
        return stringBuffer.toString();
    }
}
