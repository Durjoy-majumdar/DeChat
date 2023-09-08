package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolEditeLogStruct */
public final class ChatRoomToolEditeLogStruct extends C61103a {

    /* renamed from: d */
    public String f48254d = "";

    /* renamed from: e */
    public long f48255e;

    /* renamed from: f */
    public long f48256f = 0;

    /* renamed from: g */
    public long f48257g = 0;

    /* renamed from: h */
    public long f48258h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 19437;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48254d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48255e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48256f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48257g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48258h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomusrname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48254d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48255e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48256f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topBefore");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48257g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topAfter");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48258h);
        return stringBuffer.toString();
    }
}
