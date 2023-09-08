package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct */
public final class WCTopicSearchShareActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f266535d = 0;

    /* renamed from: e */
    public long f266536e = 0;

    /* renamed from: f */
    public long f266537f = 0;

    /* renamed from: g */
    public String f266538g = "";

    /* renamed from: h */
    public long f266539h = 0;

    /* renamed from: i */
    public String f266540i = "";

    /* renamed from: j */
    public String f266541j = "";

    /* renamed from: k */
    public String f266542k = "";

    /* renamed from: l */
    public String f266543l = "";

    /* renamed from: m */
    public String f266544m = "";

    /* renamed from: n */
    public long f266545n;

    /* renamed from: o */
    public long f266546o;

    /* renamed from: j */
    public int mo1004j() {
        return 20997;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266535d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266536e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266537f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266538g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266539h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266540i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266541j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266542k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266543l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266544m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266545n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266546o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266535d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266536e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResultType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266537f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResultQuery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266538g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266539h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareSceneId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266540i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266541j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareSearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266542k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareRequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266543l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareDocId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266544m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareBizType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266545n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareSubType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266546o);
        return stringBuffer.toString();
    }
}
