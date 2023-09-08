package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.WeAppQualityRequestOrientationStruct */
public final class WeAppQualityRequestOrientationStruct extends C61103a {

    /* renamed from: d */
    public int f80559d = -2;

    /* renamed from: e */
    public int f80560e = -2;

    /* renamed from: j */
    public int mo1004j() {
        return 23792;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f80559d);
        stringBuffer.append(",");
        stringBuffer.append(this.f80560e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("requestedOrientation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f80559d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currentOrientation");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f80560e);
        return stringBuffer.toString();
    }
}
