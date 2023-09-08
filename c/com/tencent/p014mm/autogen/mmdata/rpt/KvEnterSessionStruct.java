package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.KvEnterSessionStruct */
public final class KvEnterSessionStruct extends C61103a {

    /* renamed from: d */
    public String f48530d = "";

    /* renamed from: e */
    public long f48531e;

    /* renamed from: f */
    public long f48532f;

    /* renamed from: g */
    public long f48533g;

    /* renamed from: h */
    public String f48534h = "";

    /* renamed from: i */
    public long f48535i;

    /* renamed from: j */
    public int mo1004j() {
        return 20493;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48530d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48531e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48532f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48533g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48534h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48535i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48530d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48531e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48532f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotShowInfoType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48533g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotTipsID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48534h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48535i);
        return stringBuffer.toString();
    }
}
