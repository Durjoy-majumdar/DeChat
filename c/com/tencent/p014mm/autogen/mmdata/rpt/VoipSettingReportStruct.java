package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipSettingReportStruct */
public final class VoipSettingReportStruct extends C61103a {

    /* renamed from: d */
    public long f310507d;

    /* renamed from: e */
    public long f310508e;

    /* renamed from: f */
    public String f310509f = "";

    /* renamed from: g */
    public long f310510g;

    /* renamed from: h */
    public long f310511h;

    /* renamed from: j */
    public int mo1004j() {
        return 25083;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310507d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310508e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310509f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310510g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310511h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UseFaceBeauty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310507d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DynamicPreview");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310508e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraSdk");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310509f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReuseSurfaceTexture");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310510g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UseImageReader");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310511h);
        return stringBuffer.toString();
    }
}
