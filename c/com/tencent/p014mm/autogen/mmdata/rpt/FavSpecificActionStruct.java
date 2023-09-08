package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavSpecificActionStruct */
public final class FavSpecificActionStruct extends C61103a {

    /* renamed from: d */
    public long f265536d = 0;

    /* renamed from: e */
    public long f265537e = 0;

    /* renamed from: f */
    public long f265538f = 0;

    /* renamed from: g */
    public int f265539g;

    /* renamed from: j */
    public int mo1004j() {
        return 27536;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265536d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265537e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265538f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265539g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265536d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265537e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265538f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FavId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265539g);
        return stringBuffer.toString();
    }
}
