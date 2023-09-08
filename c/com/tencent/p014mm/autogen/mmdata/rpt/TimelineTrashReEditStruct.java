package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct */
public final class TimelineTrashReEditStruct extends C61103a {

    /* renamed from: d */
    public long f266432d;

    /* renamed from: e */
    public String f266433e = "";

    /* renamed from: f */
    public long f266434f;

    /* renamed from: g */
    public long f266435g;

    /* renamed from: h */
    public String f266436h = "";

    /* renamed from: i */
    public String f266437i = "";

    /* renamed from: j */
    public long f266438j;

    /* renamed from: k */
    public long f266439k;

    /* renamed from: l */
    public String f266440l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19750;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266432d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266433e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266434f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266435g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266436h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266437i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266438j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266439k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266440l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266432d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PublishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266433e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LikeCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266434f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266435g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266436h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266437i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NextAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266438j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266439k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NextPublishId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266440l);
        return stringBuffer.toString();
    }
}
