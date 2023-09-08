package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct */
public final class DeviceIdChangeStatStruct extends C61103a {

    /* renamed from: d */
    public String f236375d = "";

    /* renamed from: e */
    public String f236376e = "";

    /* renamed from: f */
    public String f236377f = "";

    /* renamed from: g */
    public String f236378g = "";

    /* renamed from: h */
    public String f236379h = "";

    /* renamed from: i */
    public String f236380i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 28619;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236375d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236376e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236377f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236378g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236379h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236380i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PreFirstInstallTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236375d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurFirstInstallTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236376e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreAndroidId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236377f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurAndroidId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236378g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreDeviceModel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236379h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurDeviceModel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236380i);
        return stringBuffer.toString();
    }
}
