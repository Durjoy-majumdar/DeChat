package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct */
public final class StoryPreviewReportStruct extends C61103a {

    /* renamed from: d */
    public long f266264d = 0;

    /* renamed from: e */
    public long f266265e = 0;

    /* renamed from: f */
    public long f266266f = 0;

    /* renamed from: g */
    public String f266267g = "";

    /* renamed from: h */
    public long f266268h = 0;

    /* renamed from: i */
    public long f266269i = 0;

    /* renamed from: j */
    public long f266270j = 0;

    /* renamed from: k */
    public long f266271k = 0;

    /* renamed from: l */
    public long f266272l = 0;

    /* renamed from: m */
    public long f266273m = 0;

    /* renamed from: n */
    public long f266274n = 0;

    /* renamed from: o */
    public long f266275o = 0;

    /* renamed from: p */
    public long f266276p = 0;

    /* renamed from: q */
    public long f266277q = 0;

    /* renamed from: r */
    public String f266278r = "";

    /* renamed from: s */
    public long f266279s = 0;

    /* renamed from: t */
    public String f266280t = "";

    /* renamed from: u */
    public long f266281u = 0;

    /* renamed from: v */
    public long f266282v = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16658;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266264d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266265e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266266f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266267g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266268h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266269i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266270j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266271k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266272l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266273m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266274n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266275o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266276p);
        stringBuffer.append(",");
        stringBuffer.append(this.f266277q);
        stringBuffer.append(",");
        stringBuffer.append(this.f266278r);
        stringBuffer.append(",");
        stringBuffer.append(this.f266279s);
        stringBuffer.append(",");
        stringBuffer.append(this.f266280t);
        stringBuffer.append(",");
        stringBuffer.append(this.f266281u);
        stringBuffer.append(",");
        stringBuffer.append(this.f266282v);
        stringBuffer.append(",");
        stringBuffer.append(0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266264d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreviewEnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266265e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266266f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266267g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceContactType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266268h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasUnreadStoryTips");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266269i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266270j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266271k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalUserNameCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266272l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FriendUserNameCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266273m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalStoryCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266274n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FriendStoryCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266275o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalBrowserCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266276p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FriendBrowserCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266277q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266278r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllVideoBrowserCountWithRepeat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266279s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266280t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitPlayFriendCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266281u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsShowComment");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266282v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsInformComment");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        return stringBuffer.toString();
    }
}
