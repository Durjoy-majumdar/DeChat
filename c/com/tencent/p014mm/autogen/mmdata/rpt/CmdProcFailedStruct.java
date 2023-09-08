package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CmdProcFailedStruct */
public final class CmdProcFailedStruct extends C61103a {

    /* renamed from: d */
    public long f194179d;

    /* renamed from: e */
    public long f194180e;

    /* renamed from: f */
    public String f194181f = "";

    /* renamed from: g */
    public long f194182g;

    /* renamed from: j */
    public int mo1004j() {
        return 26246;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194179d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194180e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194181f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194182g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194179d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("svrId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194180e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(AppMeasurement.CRASH_ORIGIN);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194181f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cmdId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194182g);
        return stringBuffer.toString();
    }
}
