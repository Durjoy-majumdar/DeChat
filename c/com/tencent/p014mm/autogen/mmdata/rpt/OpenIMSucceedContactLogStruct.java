package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct */
public final class OpenIMSucceedContactLogStruct extends C61103a {

    /* renamed from: d */
    public String f10022d = "";

    /* renamed from: e */
    public String f10023e = "";

    /* renamed from: f */
    public long f10024f = 0;

    /* renamed from: g */
    public long f10025g = 0;

    /* renamed from: h */
    public long f10026h = 0;

    /* renamed from: i */
    public long f10027i = 0;

    /* renamed from: j */
    public long f10028j = 0;

    /* renamed from: k */
    public long f10029k = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15855;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10022d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10023e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10024f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10025g);
        stringBuffer.append(",");
        stringBuffer.append(this.f10026h);
        stringBuffer.append(",");
        stringBuffer.append(this.f10027i);
        stringBuffer.append(",");
        stringBuffer.append(this.f10028j);
        stringBuffer.append(",");
        stringBuffer.append(this.f10029k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10022d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("userName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10023e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("succeedStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10024f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("userStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10025g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showSucceedMethod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10026h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickSucceedAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10027i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("watchMessageRecord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10028j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sendMessageStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10029k);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public OpenIMSucceedContactLogStruct mo1063s(String str) {
        this.f10022d = mo86045b("sessionid", str, true);
        return this;
    }

    /* renamed from: t */
    public OpenIMSucceedContactLogStruct mo1064t(String str) {
        this.f10023e = mo86045b("userName", str, true);
        return this;
    }
}
