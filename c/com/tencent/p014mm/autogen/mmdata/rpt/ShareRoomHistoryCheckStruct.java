package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryCheckStruct */
public final class ShareRoomHistoryCheckStruct extends C61103a {

    /* renamed from: d */
    public String f194386d = "";

    /* renamed from: e */
    public long f194387e;

    /* renamed from: f */
    public long f194388f = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 20543;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194386d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194387e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194388f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RoomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194386d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194387e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HistoryID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194388f);
        return stringBuffer.toString();
    }
}
