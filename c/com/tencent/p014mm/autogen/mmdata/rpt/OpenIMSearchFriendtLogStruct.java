package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct */
public final class OpenIMSearchFriendtLogStruct extends C61103a {

    /* renamed from: d */
    public String f194308d = "";

    /* renamed from: e */
    public long f194309e = 0;

    /* renamed from: f */
    public long f194310f = 0;

    /* renamed from: g */
    public long f194311g = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15850;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194308d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194309e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194310f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194311g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194308d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194309e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionCodeResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194310f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickAddContact");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194311g);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public OpenIMSearchFriendtLogStruct mo93196s(String str) {
        this.f194308d = mo86045b("sessionID", str, true);
        return this;
    }
}
