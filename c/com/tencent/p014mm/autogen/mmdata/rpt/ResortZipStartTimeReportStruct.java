package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ResortZipStartTimeReportStruct */
public final class ResortZipStartTimeReportStruct extends C61103a {

    /* renamed from: d */
    public String f79143d = "";

    /* renamed from: e */
    public String f79144e = "";

    /* renamed from: f */
    public long f79145f;

    /* renamed from: g */
    public String f79146g = "";

    /* renamed from: h */
    public long f79147h;

    /* renamed from: i */
    public String f79148i = "";

    /* renamed from: j */
    public long f79149j;

    /* renamed from: k */
    public int f79150k;

    /* renamed from: l */
    public String f79151l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26008;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79143d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79144e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79145f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79146g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79147h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f79148i);
        stringBuffer.append(",");
        stringBuffer.append(this.f79149j);
        stringBuffer.append(",");
        stringBuffer.append(this.f79150k);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f79151l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActivityName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79143d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Content");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79144e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79145f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resourceName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79146g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resourceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79147h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFirstLoad");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cpuModel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79148i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("devLevel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79149j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("loadTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79150k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("loadScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79151l);
        return stringBuffer.toString();
    }
}
