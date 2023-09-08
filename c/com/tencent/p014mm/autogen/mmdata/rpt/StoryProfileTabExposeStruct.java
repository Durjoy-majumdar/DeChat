package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct */
public final class StoryProfileTabExposeStruct extends C61103a {

    /* renamed from: d */
    public long f194468d = 0;

    /* renamed from: e */
    public long f194469e = 0;

    /* renamed from: f */
    public long f194470f = 0;

    /* renamed from: g */
    public long f194471g = 0;

    /* renamed from: h */
    public long f194472h = 0;

    /* renamed from: i */
    public long f194473i = 0;

    /* renamed from: j */
    public long f194474j = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16844;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194468d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194469e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194470f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194471g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194472h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194473i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194474j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ClickMyProfileTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194468d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickCameraTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194469e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickGuidePageTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194470f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isProfileRedPoint");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194471g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isCameraRedPoint");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194472h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194473i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isStoryCommentRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194474j);
        return stringBuffer.toString();
    }
}
