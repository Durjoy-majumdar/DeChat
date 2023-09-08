package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipNewCallWhenInCallReportStruct */
public final class VoipNewCallWhenInCallReportStruct extends C61103a {

    /* renamed from: d */
    public long f310425d;

    /* renamed from: e */
    public long f310426e;

    /* renamed from: f */
    public long f310427f;

    /* renamed from: g */
    public long f310428g;

    /* renamed from: h */
    public long f310429h;

    /* renamed from: j */
    public int mo1004j() {
        return 27765;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310425d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310426e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310427f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310428g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310429h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomkey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310425d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310426e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("newroomkey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310427f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("newroomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310428g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310429h);
        return stringBuffer.toString();
    }
}
