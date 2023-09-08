package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BizTLVideoAutoPlayReportStruct */
public final class BizTLVideoAutoPlayReportStruct extends C61103a {

    /* renamed from: d */
    public long f48195d;

    /* renamed from: e */
    public String f48196e = "";

    /* renamed from: f */
    public long f48197f;

    /* renamed from: g */
    public int f48198g;

    /* renamed from: h */
    public int f48199h;

    /* renamed from: i */
    public int f48200i;

    /* renamed from: j */
    public long f48201j;

    /* renamed from: k */
    public int f48202k;

    /* renamed from: l */
    public long f48203l;

    /* renamed from: m */
    public long f48204m;

    /* renamed from: n */
    public long f48205n;

    /* renamed from: o */
    public int f48206o;

    /* renamed from: p */
    public int f48207p;

    /* renamed from: q */
    public String f48208q = "";

    /* renamed from: r */
    public String f48209r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21001;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48195d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48196e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48197f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48198g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48199h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48200i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48201j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48202k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48203l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48204m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48205n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48206o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48207p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48208q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48209r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("BizUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48195d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Vid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48196e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48197f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Idx");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48198g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AbsolutePosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48199h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48200i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AutoPlayId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48201j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48202k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48203l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48204m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BufferDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48205n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48206o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48207p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48208q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48209r);
        return stringBuffer.toString();
    }
}
