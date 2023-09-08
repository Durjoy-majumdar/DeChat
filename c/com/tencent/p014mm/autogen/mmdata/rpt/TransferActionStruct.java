package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TransferActionStruct */
public final class TransferActionStruct extends C61103a {

    /* renamed from: d */
    public long f194630d = 0;

    /* renamed from: e */
    public long f194631e = 0;

    /* renamed from: f */
    public long f194632f = 0;

    /* renamed from: g */
    public String f194633g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16440;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194630d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194631e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194632f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194633g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194630d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194631e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194632f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TransferId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194633g);
        return stringBuffer.toString();
    }
}
