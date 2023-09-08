package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAAppTaskVersionFallBackActionStruct */
public final class WAAppTaskVersionFallBackActionStruct extends C61103a {

    /* renamed from: d */
    public String f236431d = "";

    /* renamed from: e */
    public String f236432e = "";

    /* renamed from: f */
    public long f236433f = 0;

    /* renamed from: g */
    public long f236434g = 0;

    /* renamed from: h */
    public long f236435h = 0;

    /* renamed from: i */
    public long f236436i = 0;

    /* renamed from: j */
    public long f236437j = 0;

    /* renamed from: k */
    public String f236438k = "";

    /* renamed from: l */
    public long f236439l = 0;

    /* renamed from: m */
    public String f236440m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20572;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236431d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236432e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236433f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236434g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236435h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236436i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236437j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236438k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236439l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236440m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236431d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236432e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpenScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236433f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TargetAppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236434g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalAppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236435h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FallbackScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236436i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitTimeInMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236437j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236438k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsWeakNet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236439l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236440m);
        return stringBuffer.toString();
    }
}
