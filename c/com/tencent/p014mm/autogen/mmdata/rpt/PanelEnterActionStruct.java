package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct */
public final class PanelEnterActionStruct extends C61103a {

    /* renamed from: d */
    public String f194315d = "";

    /* renamed from: e */
    public long f194316e = 0;

    /* renamed from: f */
    public String f194317f = "";

    /* renamed from: g */
    public int f194318g;

    /* renamed from: j */
    public int mo1004j() {
        return 19959;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194315d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194316e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194317f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194318g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RoomName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194315d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194316e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194317f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PanelPage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194318g);
        return stringBuffer.toString();
    }
}
