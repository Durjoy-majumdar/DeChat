package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VideoSendLogStruct */
public final class VideoSendLogStruct extends C61103a {

    /* renamed from: d */
    public int f266516d = -1;

    /* renamed from: e */
    public int f266517e = -1;

    /* renamed from: f */
    public int f266518f = -1;

    /* renamed from: g */
    public String f266519g = "";

    /* renamed from: h */
    public String f266520h = "";

    /* renamed from: i */
    public String f266521i = "";

    /* renamed from: j */
    public int f266522j = -1;

    /* renamed from: k */
    public int f266523k = -1;

    /* renamed from: l */
    public int f266524l = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 24620;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266516d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266517e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266518f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266519g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266520h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266521i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266522j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266523k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266524l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266516d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266517e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266518f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginMediaInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266519g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemuxInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266520h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OutputMediaInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266521i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResultCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266522j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemuxDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266523k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ParallelSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266524l);
        return stringBuffer.toString();
    }
}
