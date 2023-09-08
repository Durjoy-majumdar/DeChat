package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct */
public final class SNSJankReportStruct extends C61103a {

    /* renamed from: d */
    public int f265804d = -1;

    /* renamed from: e */
    public int f265805e = -1;

    /* renamed from: f */
    public int f265806f = -1;

    /* renamed from: g */
    public int f265807g = -1;

    /* renamed from: h */
    public int f265808h = -1;

    /* renamed from: i */
    public int f265809i = -1;

    /* renamed from: j */
    public int f265810j = -1;

    /* renamed from: k */
    public int f265811k = -1;

    /* renamed from: l */
    public int f265812l = -1;

    /* renamed from: m */
    public int f265813m = -1;

    /* renamed from: n */
    public int f265814n = -1;

    /* renamed from: o */
    public long f265815o = -1;

    /* renamed from: p */
    public long f265816p = -1;

    /* renamed from: q */
    public int f265817q = -1;

    /* renamed from: r */
    public String f265818r = "";

    /* renamed from: s */
    public int f265819s = -1;

    /* renamed from: t */
    public int f265820t = 0;

    /* renamed from: u */
    public String f265821u = "";

    /* renamed from: v */
    public int f265822v = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 26068;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265804d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265805e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265806f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265807g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265808h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265809i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265810j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265811k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265812l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265813m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265814n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265815o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265816p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265817q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265818r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265819s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265820t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265821u);
        stringBuffer.append(",");
        stringBuffer.append(this.f265822v);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PageInTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265804d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageOutTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265805e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalScrollTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265806f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalJankTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265807g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScrollJankTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265808h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalFrameCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265809i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JankFrameCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265810j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScrollFrameCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265811k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScrollJankFrameCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265812l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SystemFPS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265813m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageStayTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265814n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageStartTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265815o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageEnTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265816p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageEnterCostMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265817q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265818r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageEnterCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265819s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnableItemImprove");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265820t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpuInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265821u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecyclerView");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265822v);
        return stringBuffer.toString();
    }
}
