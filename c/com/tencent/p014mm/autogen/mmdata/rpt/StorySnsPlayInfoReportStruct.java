package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StorySnsPlayInfoReportStruct */
public final class StorySnsPlayInfoReportStruct extends C61103a {

    /* renamed from: d */
    public long f266294d = 0;

    /* renamed from: e */
    public long f266295e = 0;

    /* renamed from: f */
    public String f266296f = "";

    /* renamed from: g */
    public String f266297g = "";

    /* renamed from: h */
    public long f266298h = 0;

    /* renamed from: i */
    public String f266299i = "";

    /* renamed from: j */
    public String f266300j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16842;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266294d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266295e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266296f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266297g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266298h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266299i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266300j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266294d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreviewEnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266295e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitPlayVideoList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266296f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitPlayUinList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266297g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FirebaseAnalytics.C113379b.INDEX);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266298h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitPlayVideoList1");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266299i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitPlayVideoList2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266300j);
        return stringBuffer.toString();
    }
}
