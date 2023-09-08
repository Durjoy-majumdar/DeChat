package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct */
public final class SuggestEmoiconWordListStruct extends C61103a {

    /* renamed from: d */
    public long f79184d;

    /* renamed from: e */
    public long f79185e;

    /* renamed from: f */
    public long f79186f;

    /* renamed from: g */
    public long f79187g;

    /* renamed from: h */
    public String f79188h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20203;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79184d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79185e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79186f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79187g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79188h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PullStartTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79184d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PullEndTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79185e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79186f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WordSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79187g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WordVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79188h);
        return stringBuffer.toString();
    }
}
