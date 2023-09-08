package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.HellTimelineStruct */
public final class HellTimelineStruct extends C61103a {

    /* renamed from: d */
    public int f265623d = 0;

    /* renamed from: e */
    public String f265624e = "";

    /* renamed from: f */
    public String f265625f = "";

    /* renamed from: g */
    public long f265626g = 0;

    /* renamed from: h */
    public long f265627h = 0;

    /* renamed from: i */
    public long f265628i = 0;

    /* renamed from: j */
    public String f265629j = "";

    /* renamed from: k */
    public int f265630k = 0;

    /* renamed from: l */
    public int f265631l = 0;

    /* renamed from: m */
    public int f265632m = 0;

    /* renamed from: n */
    public int f265633n = 0;

    /* renamed from: o */
    public String f265634o = "";

    /* renamed from: p */
    public String f265635p = "";

    /* renamed from: q */
    public String f265636q = "";

    /* renamed from: r */
    public String f265637r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 16242;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265623d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265624e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265625f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265626g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265627h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265628i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265629j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265630k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265631l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265632m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265633n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265634o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265635p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265636q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265637r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265623d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265624e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265625f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("frontTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265626g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265627h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("scrollTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265628i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportFeedList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265629j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265630k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265631l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265632m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265633n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Performance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265634o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionPageId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265635p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265636q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SvrSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265637r);
        return stringBuffer.toString();
    }
}
