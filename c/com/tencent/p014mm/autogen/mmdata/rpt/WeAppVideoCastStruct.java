package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct */
public final class WeAppVideoCastStruct extends C61103a {

    /* renamed from: d */
    public String f237374d = "";

    /* renamed from: e */
    public long f237375e = 0;

    /* renamed from: f */
    public long f237376f = 0;

    /* renamed from: g */
    public String f237377g = "";

    /* renamed from: h */
    public String f237378h = "";

    /* renamed from: i */
    public long f237379i = 0;

    /* renamed from: j */
    public long f237380j = 0;

    /* renamed from: k */
    public long f237381k = 2;

    /* renamed from: l */
    public long f237382l = 3;

    /* renamed from: m */
    public String f237383m = "";

    /* renamed from: n */
    public String f237384n = "";

    /* renamed from: o */
    public long f237385o = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 18144;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237374d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237375e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237376f);
        stringBuffer.append(",");
        stringBuffer.append(this.f237377g);
        stringBuffer.append(",");
        stringBuffer.append(this.f237378h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237379i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237380j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237381k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237382l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237383m);
        stringBuffer.append(",");
        stringBuffer.append(this.f237384n);
        stringBuffer.append(",");
        stringBuffer.append(this.f237385o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237374d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237375e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237376f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PagePath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237377g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237378h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237379i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237380j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CastResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237381k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProtocolType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237382l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModelName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237383m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ManuFacturer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237384n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237385o);
        return stringBuffer.toString();
    }
}
