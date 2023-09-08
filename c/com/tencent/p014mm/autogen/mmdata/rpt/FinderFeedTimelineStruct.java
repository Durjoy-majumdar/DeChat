package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFeedTimelineStruct */
public final class FinderFeedTimelineStruct extends C61103a {

    /* renamed from: d */
    public int f265572d;

    /* renamed from: e */
    public String f265573e = "";

    /* renamed from: f */
    public String f265574f = "";

    /* renamed from: g */
    public long f265575g;

    /* renamed from: h */
    public long f265576h;

    /* renamed from: i */
    public long f265577i;

    /* renamed from: j */
    public String f265578j = "";

    /* renamed from: k */
    public int f265579k;

    /* renamed from: l */
    public int f265580l;

    /* renamed from: m */
    public int f265581m;

    /* renamed from: n */
    public int f265582n;

    /* renamed from: o */
    public String f265583o = "";

    /* renamed from: p */
    public String f265584p = "";

    /* renamed from: q */
    public String f265585q = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18260;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265572d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265573e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265574f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265575g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265576h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265577i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265578j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265579k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265580l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265581m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265582n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265583o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265584p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265585q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265572d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265573e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265574f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("frontTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265575g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265576h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scrollTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265577i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportFeedList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265578j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265579k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265580l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265581m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265582n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Performance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265583o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionPageId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265584p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265585q);
        return stringBuffer.toString();
    }
}
