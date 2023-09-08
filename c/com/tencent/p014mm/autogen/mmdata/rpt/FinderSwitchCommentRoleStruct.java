package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSwitchCommentRoleStruct */
public final class FinderSwitchCommentRoleStruct extends C61103a {

    /* renamed from: d */
    public String f156117d = "";

    /* renamed from: e */
    public String f156118e = "";

    /* renamed from: f */
    public long f156119f;

    /* renamed from: g */
    public long f156120g;

    /* renamed from: h */
    public long f156121h;

    /* renamed from: i */
    public long f156122i;

    /* renamed from: j */
    public long f156123j;

    /* renamed from: j */
    public int mo1004j() {
        return 19387;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156117d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156118e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156119f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156120g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156121h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156122i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156123j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156117d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156118e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156119f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156120g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedCommentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156121h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedFriLikeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156122i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RoleBeforeSwitch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156123j);
        return stringBuffer.toString();
    }
}
