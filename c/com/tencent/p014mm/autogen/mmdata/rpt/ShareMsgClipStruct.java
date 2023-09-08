package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct */
public final class ShareMsgClipStruct extends C61103a {

    /* renamed from: d */
    public long f194382d;

    /* renamed from: e */
    public int f194383e;

    /* renamed from: f */
    public int f194384f;

    /* renamed from: g */
    public int f194385g;

    /* renamed from: j */
    public int mo1004j() {
        return 18617;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194382d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194383e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194384f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194385g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("msgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194382d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("selectLen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194383e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalLen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194384f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clipLen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194385g);
        return stringBuffer.toString();
    }
}
