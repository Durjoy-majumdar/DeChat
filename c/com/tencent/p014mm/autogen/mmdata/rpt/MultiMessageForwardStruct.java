package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct */
public final class MultiMessageForwardStruct extends C61103a {

    /* renamed from: d */
    public String f194283d = "";

    /* renamed from: e */
    public long f194284e = 0;

    /* renamed from: f */
    public long f194285f = 2;

    /* renamed from: g */
    public long f194286g = 0;

    /* renamed from: h */
    public String f194287h = "";

    /* renamed from: i */
    public long f194288i;

    /* renamed from: j */
    public String f194289j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20559;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194283d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194284e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194285f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194286g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194287h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194288i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194289j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HasConfirmed");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194283d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Oper");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194284e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasSideNote");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194285f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalShareCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194286g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalShareCountByType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194287h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ForwardScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194288i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194289j);
        return stringBuffer.toString();
    }
}
