package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RoomTodoHandleStruct */
public final class RoomTodoHandleStruct extends C61103a {

    /* renamed from: d */
    public String f69581d = "";

    /* renamed from: e */
    public long f69582e;

    /* renamed from: f */
    public long f69583f;

    /* renamed from: g */
    public long f69584g;

    /* renamed from: h */
    public long f69585h;

    /* renamed from: i */
    public String f69586i = "";

    /* renamed from: j */
    public String f69587j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19444;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69581d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69582e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69583f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69584g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69585h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69586i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69587j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69581d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69582e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("msgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69583f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69584g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69585h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("todoid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69586i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69587j);
        return stringBuffer.toString();
    }
}
