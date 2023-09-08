package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct */
public final class DeviceSupportStruct extends C61103a {

    /* renamed from: d */
    public String f48259d = "";

    /* renamed from: e */
    public int f48260e = -1;

    /* renamed from: f */
    public int f48261f = -1;

    /* renamed from: g */
    public int f48262g = -1;

    /* renamed from: h */
    public int f48263h = -1;

    /* renamed from: i */
    public int f48264i = -1;

    /* renamed from: j */
    public int f48265j = -1;

    /* renamed from: k */
    public int f48266k = -1;

    /* renamed from: l */
    public String f48267l = "";

    /* renamed from: m */
    public int f48268m = -1;

    /* renamed from: n */
    public int f48269n = -1;

    /* renamed from: o */
    public String f48270o = "";

    /* renamed from: p */
    public int f48271p;

    /* renamed from: q */
    public int f48272q;

    /* renamed from: r */
    public int f48273r;

    /* renamed from: j */
    public int mo1004j() {
        return 28583;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48259d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48260e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48261f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48262g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48263h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48264i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48265j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48266k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48267l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48268m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48269n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48270o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48271p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48272q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48273r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ScreenSupportedHdrType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48259d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScreenMinLuminance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48260e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScreenMaxLuminance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48261f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScreenMaxAverageLuminance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48262g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayDolbyVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48263h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayHDR10");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48264i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayHDR10Plus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48265j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayHDRHLG");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48266k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpenGLVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48267l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GpuScore");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48268m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemMB");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48269n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CPUName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48270o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CPUCores");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48271p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CPUFreq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48272q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScrrenFPS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48273r);
        return stringBuffer.toString();
    }
}
