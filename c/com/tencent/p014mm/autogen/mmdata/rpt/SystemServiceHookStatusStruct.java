package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct */
public final class SystemServiceHookStatusStruct extends C61103a {

    /* renamed from: d */
    public int f343841d = 0;

    /* renamed from: e */
    public String f343842e = "";

    /* renamed from: f */
    public String f343843f = "";

    /* renamed from: g */
    public String f343844g = "";

    /* renamed from: h */
    public String f343845h = "";

    /* renamed from: i */
    public String f343846i = "";

    /* renamed from: j */
    public String f343847j = "";

    /* renamed from: k */
    public String f343848k = "";

    /* renamed from: l */
    public String f343849l = "";

    /* renamed from: m */
    public String f343850m = "";

    /* renamed from: n */
    public int f343851n;

    /* renamed from: o */
    public long f343852o;

    /* renamed from: p */
    public int f343853p;

    /* renamed from: q */
    public String f343854q = "";

    /* renamed from: r */
    public String f343855r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24550;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343841d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343842e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343843f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343844g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343845h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343846i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343847j);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f343848k);
        stringBuffer.append(",");
        stringBuffer.append(this.f343849l);
        stringBuffer.append(",");
        stringBuffer.append(this.f343850m);
        stringBuffer.append(",");
        stringBuffer.append(this.f343851n);
        stringBuffer.append(",");
        stringBuffer.append(this.f343852o);
        stringBuffer.append(",");
        stringBuffer.append(this.f343853p);
        stringBuffer.append(",");
        stringBuffer.append(this.f343854q);
        stringBuffer.append(",");
        stringBuffer.append(this.f343855r);
        stringBuffer.append(",");
        stringBuffer.append(0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HookResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343841d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ServiceName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343842e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MethodName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343843f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentActivity");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343844g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MethodStack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343845h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MethodTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343846i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MethodOffsetTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343847j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPermissionGranted");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343848k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrStack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343849l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequirePermission");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343850m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LogVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343851n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hookDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343852o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hookSuccessCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343853p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("businessTypeByStack");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343854q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bussinessTypeByActivity");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343855r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isBusinessMatch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        return stringBuffer.toString();
    }
}
