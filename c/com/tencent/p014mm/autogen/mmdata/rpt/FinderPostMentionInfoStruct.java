package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPostMentionInfoStruct */
public final class FinderPostMentionInfoStruct extends C61103a {

    /* renamed from: d */
    public String f155807d = "";

    /* renamed from: e */
    public String f155808e = "";

    /* renamed from: f */
    public String f155809f = "";

    /* renamed from: g */
    public String f155810g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19792;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155807d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155808e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155809f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155810g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155807d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155808e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PostUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155809f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mentionedDetailInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155810g);
        return stringBuffer.toString();
    }
}
