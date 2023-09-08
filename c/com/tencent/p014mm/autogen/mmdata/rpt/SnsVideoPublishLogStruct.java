package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct */
public final class SnsVideoPublishLogStruct extends C61103a {

    /* renamed from: d */
    public String f266237d = "";

    /* renamed from: e */
    public int f266238e = -1;

    /* renamed from: f */
    public int f266239f = -1;

    /* renamed from: g */
    public long f266240g = 0;

    /* renamed from: h */
    public long f266241h = 0;

    /* renamed from: i */
    public long f266242i = 0;

    /* renamed from: j */
    public long f266243j = 0;

    /* renamed from: k */
    public long f266244k = 0;

    /* renamed from: l */
    public long f266245l = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 26179;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266237d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266238e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266239f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266240g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266241h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266242i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266243j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266244k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266245l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266237d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266238e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("usertype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266239f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaEditPageCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266240g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaEditPlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266241h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("editPagePlayCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266242i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("editPagePlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266243j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("muxTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266244k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fakePublishTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266245l);
        return stringBuffer.toString();
    }
}
