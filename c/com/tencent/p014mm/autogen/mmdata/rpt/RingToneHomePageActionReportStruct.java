package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RingToneHomePageActionReportStruct */
public final class RingToneHomePageActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f156790d;

    /* renamed from: e */
    public String f156791e = "";

    /* renamed from: f */
    public long f156792f;

    /* renamed from: g */
    public String f156793g = "";

    /* renamed from: h */
    public int f156794h = -1;

    /* renamed from: i */
    public long f156795i;

    /* renamed from: j */
    public long f156796j;

    /* renamed from: j */
    public int mo1004j() {
        return 23612;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156790d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156791e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156792f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156793g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156794h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156795i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156796j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156790d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156791e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156792f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tousername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156793g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_individual");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156794h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_valid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156795i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_vibrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156796j);
        return stringBuffer.toString();
    }
}
