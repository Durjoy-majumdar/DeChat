package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct */
public final class SuggestEmoiconPreloadStruct extends C61103a {

    /* renamed from: d */
    public String f79163d = "";

    /* renamed from: e */
    public long f79164e;

    /* renamed from: f */
    public long f79165f;

    /* renamed from: g */
    public long f79166g;

    /* renamed from: h */
    public long f79167h;

    /* renamed from: j */
    public int mo1004j() {
        return CdnLogic.MediaTypeFriendsImageThumb;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79163d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79164e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79165f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79166g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79167h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79163d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PullStartTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79164e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PullEndTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79165f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79166g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FailedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79167h);
        return stringBuffer.toString();
    }
}
