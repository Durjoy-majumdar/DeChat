package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPackageDeleteActionStruct */
public final class WeAppPackageDeleteActionStruct extends C61103a {

    /* renamed from: d */
    public long f79220d = 0;

    /* renamed from: e */
    public String f79221e = "";

    /* renamed from: f */
    public long f79222f = 0;

    /* renamed from: g */
    public long f79223g = 0;

    /* renamed from: h */
    public long f79224h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 15402;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79220d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79221e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79222f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79223g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79224h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DeleteReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79220d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79221e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DebugType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79222f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeleteCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79223g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AbtestStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79224h);
        return stringBuffer.toString();
    }
}
