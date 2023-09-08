package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonPreviewClickStruct */
public final class EmoticonPreviewClickStruct extends C61103a {

    /* renamed from: d */
    public String f265463d = "";

    /* renamed from: e */
    public String f265464e = "";

    /* renamed from: f */
    public String f265465f = "";

    /* renamed from: g */
    public long f265466g;

    /* renamed from: h */
    public long f265467h;

    /* renamed from: j */
    public int mo1004j() {
        return 25690;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265463d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265464e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265465f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265466g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265467h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265463d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265464e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("raw_md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265465f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("raw_md5_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265466g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("md5_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265467h);
        return stringBuffer.toString();
    }
}
