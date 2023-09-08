package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ContactTagManagementReportStruct */
public final class ContactTagManagementReportStruct extends C61103a {

    /* renamed from: d */
    public long f9649d;

    /* renamed from: e */
    public long f9650e;

    /* renamed from: f */
    public long f9651f;

    /* renamed from: g */
    public long f9652g;

    /* renamed from: h */
    public long f9653h;

    /* renamed from: j */
    public int mo1004j() {
        return 24176;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9649d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9650e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9651f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9652g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9653h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FirebaseAnalytics.C113379b.SOURCE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9649d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9650e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("operate_label_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9651f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("add_member_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9652g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("remove_member_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9653h);
        return stringBuffer.toString();
    }
}
