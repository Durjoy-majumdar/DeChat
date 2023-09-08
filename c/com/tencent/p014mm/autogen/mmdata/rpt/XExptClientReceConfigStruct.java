package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XExptClientReceConfigStruct */
public final class XExptClientReceConfigStruct extends C61103a {

    /* renamed from: d */
    public long f343865d = 0;

    /* renamed from: e */
    public long f343866e = 0;

    /* renamed from: f */
    public long f343867f = 0;

    /* renamed from: g */
    public long f343868g;

    /* renamed from: j */
    public int mo1004j() {
        return 16909;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343865d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343866e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343867f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343868g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ExptId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343865d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GroupId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343866e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExptSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343867f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BucketSrc");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343868g);
        return stringBuffer.toString();
    }
}
