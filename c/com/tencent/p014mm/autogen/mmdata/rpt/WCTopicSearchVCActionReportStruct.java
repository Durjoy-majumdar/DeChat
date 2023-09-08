package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchVCActionReportStruct */
public final class WCTopicSearchVCActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f194690d = 0;

    /* renamed from: e */
    public long f194691e = 0;

    /* renamed from: f */
    public long f194692f = 0;

    /* renamed from: g */
    public long f194693g = 0;

    /* renamed from: h */
    public long f194694h = 0;

    /* renamed from: i */
    public String f194695i = "";

    /* renamed from: j */
    public String f194696j = "";

    /* renamed from: k */
    public String f194697k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20996;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194690d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194691e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194692f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194693g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194694h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194695i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194696j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194697k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194690d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DismissType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194691e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionSourceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194692f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194693g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194694h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSceneId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194695i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194696j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QueryKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194697k);
        return stringBuffer.toString();
    }
}
