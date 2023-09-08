package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFaceVerifyStreamStruct */
public final class FinderFaceVerifyStreamStruct extends C61103a {

    /* renamed from: d */
    public String f155214d = "";

    /* renamed from: e */
    public String f155215e = "";

    /* renamed from: f */
    public int f155216f;

    /* renamed from: g */
    public String f155217g = "";

    /* renamed from: h */
    public long f155218h;

    /* renamed from: i */
    public long f155219i;

    /* renamed from: j */
    public int mo1004j() {
        return 21113;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155214d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155215e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155216f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155217g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155218h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155219i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinderUsrname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155214d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderWxAppInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155215e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPrivate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155216f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155217g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155218h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155219i);
        return stringBuffer.toString();
    }
}
