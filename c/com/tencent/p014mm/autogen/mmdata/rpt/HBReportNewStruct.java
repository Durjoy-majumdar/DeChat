package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct */
public final class HBReportNewStruct extends C61103a {

    /* renamed from: d */
    public long f194229d = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16722;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194229d);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194229d);
        return stringBuffer.toString();
    }
}
