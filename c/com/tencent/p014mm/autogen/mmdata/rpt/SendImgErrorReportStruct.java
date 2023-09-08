package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendImgErrorReportStruct */
public final class SendImgErrorReportStruct extends C61103a {

    /* renamed from: d */
    public long f265861d;

    /* renamed from: e */
    public long f265862e;

    /* renamed from: f */
    public long f265863f;

    /* renamed from: g */
    public String f265864g = "";

    /* renamed from: h */
    public long f265865h;

    /* renamed from: i */
    public long f265866i;

    /* renamed from: j */
    public int mo1004j() {
        return 27902;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265861d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265862e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265863f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265864g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265865h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265866i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265861d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompressType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265862e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265863f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265864g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rotateCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265865h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AvgTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265866i);
        return stringBuffer.toString();
    }
}
