package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFinderKeyWordsReportStruct */
public final class SnsFinderKeyWordsReportStruct extends C61103a {

    /* renamed from: d */
    public String f69615d = "";

    /* renamed from: e */
    public String f69616e = "";

    /* renamed from: f */
    public String f69617f = "";

    /* renamed from: g */
    public String f69618g = "";

    /* renamed from: h */
    public String f69619h = "";

    /* renamed from: i */
    public int f69620i = 1;

    /* renamed from: j */
    public int f69621j = 0;

    /* renamed from: k */
    public long f69622k = 0;

    /* renamed from: l */
    public long f69623l = 0;

    /* renamed from: m */
    public long f69624m = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 23569;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69615d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69616e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69617f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69618g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69619h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69620i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69621j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69622k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69623l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69624m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69615d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69616e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedUin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69617f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreatedCommentID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69618g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HotWord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69619h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HotWordCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69620i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HotWordNo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69621j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69622k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedAuthorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69623l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TagSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69624m);
        return stringBuffer.toString();
    }
}
