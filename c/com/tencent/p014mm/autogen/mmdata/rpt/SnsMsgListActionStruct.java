package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsMsgListActionStruct */
public final class SnsMsgListActionStruct extends C61103a {

    /* renamed from: d */
    public long f266081d = 0;

    /* renamed from: e */
    public long f266082e = 0;

    /* renamed from: f */
    public long f266083f = 0;

    /* renamed from: g */
    public long f266084g = 0;

    /* renamed from: h */
    public long f266085h = 0;

    /* renamed from: i */
    public long f266086i = 0;

    /* renamed from: j */
    public long f266087j = 0;

    /* renamed from: k */
    public String f266088k = "";

    /* renamed from: l */
    public long f266089l = 0;

    /* renamed from: m */
    public String f266090m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 13677;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266081d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266082e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266083f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266084g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266085h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266086i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266087j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266088k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266089l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266090m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266081d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266082e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266083f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266084g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266085h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266086i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterStartTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266087j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266088k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("blockNotifyEduFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266089l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EduTriggerFeedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266090m);
        return stringBuffer.toString();
    }
}
