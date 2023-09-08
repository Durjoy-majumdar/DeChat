package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonClientLocalOcrResultStruct */
public final class EmoticonClientLocalOcrResultStruct extends C61103a {

    /* renamed from: d */
    public long f265447d;

    /* renamed from: e */
    public long f265448e;

    /* renamed from: f */
    public long f265449f;

    /* renamed from: j */
    public int mo1004j() {
        return 27969;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265447d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265448e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265449f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("total_md5_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265447d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rec_md5_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265448e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("result_md5_cnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265449f);
        return stringBuffer.toString();
    }
}
