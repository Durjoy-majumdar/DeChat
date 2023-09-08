package com.tencent.p014mm.autogen.mmdata.rpt;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.Skyline_Dart_Crash_ReporterStruct */
public final class Skyline_Dart_Crash_ReporterStruct extends C61103a {

    /* renamed from: d */
    public String f236387d = "";

    /* renamed from: e */
    public String f236388e = "";

    /* renamed from: f */
    public String f236389f = "";

    /* renamed from: g */
    public String f236390g = "";

    /* renamed from: h */
    public String f236391h = "";

    /* renamed from: i */
    public String f236392i = "";

    /* renamed from: j */
    public String f236393j = "";

    /* renamed from: k */
    public String f236394k = "";

    /* renamed from: l */
    public String f236395l = "";

    /* renamed from: m */
    public String f236396m = "";

    /* renamed from: n */
    public long f236397n;

    /* renamed from: j */
    public int mo1004j() {
        return 27412;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236387d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236388e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236389f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236390g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236391h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236392i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236393j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236394k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236395l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236396m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236397n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Runtime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236387d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentActivity");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236388e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentThread");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236389f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraCrashMsg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236390g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceParameters");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236391h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CustomParameters");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236392i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ApplicationParameters");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236393j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ExifInterface.TAG_DATETIME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236394k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Context");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236395l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CrashContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236396m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("KillSelf");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236397n);
        return stringBuffer.toString();
    }
}
