package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MessageSecurityStruct */
public final class MessageSecurityStruct extends C61103a {

    /* renamed from: d */
    public long f265689d;

    /* renamed from: e */
    public String f265690e = "";

    /* renamed from: f */
    public String f265691f = "";

    /* renamed from: g */
    public long f265692g;

    /* renamed from: h */
    public String f265693h = "";

    /* renamed from: i */
    public long f265694i;

    /* renamed from: j */
    public int mo1004j() {
        return 23344;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265689d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265690e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265691f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265692g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265693h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265694i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("msgid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265689d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265690e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265691f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265692g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BanDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265693h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265694i);
        return stringBuffer.toString();
    }
}
