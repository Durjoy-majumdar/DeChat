package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryFriendVisitPageExposeStruct */
public final class StoryFriendVisitPageExposeStruct extends C61103a {

    /* renamed from: d */
    public long f156860d = 0;

    /* renamed from: e */
    public long f156861e = 0;

    /* renamed from: f */
    public String f156862f = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18744;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f156860d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156861e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156862f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Storyid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseFriendsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156860d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentFriendsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156861e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StoryidStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156862f);
        return stringBuffer.toString();
    }
}
