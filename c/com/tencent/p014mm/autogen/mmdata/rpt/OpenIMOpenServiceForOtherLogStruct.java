package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMOpenServiceForOtherLogStruct */
public final class OpenIMOpenServiceForOtherLogStruct extends C61103a {

    /* renamed from: d */
    public long f194304d;

    /* renamed from: e */
    public long f194305e;

    /* renamed from: f */
    public long f194306f;

    /* renamed from: g */
    public long f194307g;

    /* renamed from: j */
    public int mo1004j() {
        return 27840;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194304d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194305e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194306f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194307g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194304d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllowOrDisallow");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194305e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194306f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContactType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194307g);
        return stringBuffer.toString();
    }
}
