package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RoomTodoShareStruct */
public final class RoomTodoShareStruct extends C61103a {

    /* renamed from: d */
    public String f194354d = "";

    /* renamed from: e */
    public long f194355e;

    /* renamed from: f */
    public String f194356f = "";

    /* renamed from: g */
    public String f194357g = "";

    /* renamed from: h */
    public long f194358h;

    /* renamed from: i */
    public long f194359i;

    /* renamed from: j */
    public long f194360j;

    /* renamed from: j */
    public int mo1004j() {
        return 19440;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194354d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194355e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194356f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194357g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194358h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194359i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194360j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194354d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194355e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194356f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194357g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("todo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194358h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openHelp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194359i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194360j);
        return stringBuffer.toString();
    }
}
