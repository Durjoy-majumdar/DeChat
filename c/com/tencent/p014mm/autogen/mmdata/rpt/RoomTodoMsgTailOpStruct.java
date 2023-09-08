package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RoomTodoMsgTailOpStruct */
public final class RoomTodoMsgTailOpStruct extends C61103a {

    /* renamed from: d */
    public String f69588d = "";

    /* renamed from: e */
    public long f69589e;

    /* renamed from: f */
    public long f69590f;

    /* renamed from: g */
    public long f69591g;

    /* renamed from: h */
    public long f69592h;

    /* renamed from: i */
    public long f69593i;

    /* renamed from: j */
    public String f69594j = "";

    /* renamed from: k */
    public String f69595k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19442;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69588d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69589e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69590f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69591g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69592h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69593i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69594j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69595k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69588d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69589e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69590f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("msgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69591g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69592h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openHelp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69593i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("todoid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69594j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69595k);
        return stringBuffer.toString();
    }
}
