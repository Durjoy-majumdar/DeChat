package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderTimelineMoreFeedExposeStruct */
public final class FinderTimelineMoreFeedExposeStruct extends C61103a {

    /* renamed from: d */
    public String f9909d = "";

    /* renamed from: e */
    public long f9910e;

    /* renamed from: f */
    public long f9911f;

    /* renamed from: g */
    public long f9912g;

    /* renamed from: h */
    public long f9913h;

    /* renamed from: j */
    public int mo1004j() {
        return 19251;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9909d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9910e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9911f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9912g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9913h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9909d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MessageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9910e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9911f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFloat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9912g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9913h);
        return stringBuffer.toString();
    }
}
