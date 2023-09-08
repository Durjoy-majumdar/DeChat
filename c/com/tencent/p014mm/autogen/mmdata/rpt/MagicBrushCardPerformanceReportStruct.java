package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBrushCardPerformanceReportStruct */
public final class MagicBrushCardPerformanceReportStruct extends C61103a {

    /* renamed from: d */
    public String f69554d = "";

    /* renamed from: e */
    public String f69555e = "";

    /* renamed from: f */
    public long f69556f;

    /* renamed from: g */
    public long f69557g;

    /* renamed from: h */
    public String f69558h = "";

    /* renamed from: i */
    public String f69559i = "";

    /* renamed from: j */
    public String f69560j = "";

    /* renamed from: k */
    public String f69561k = "";

    /* renamed from: l */
    public String f69562l = "";

    /* renamed from: m */
    public String f69563m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27297;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69554d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69555e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69556f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69557g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69558h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69559i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69560j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69561k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69562l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69563m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69554d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CardName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69555e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69556f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69557g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra0");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69558h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra1");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69559i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69560j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra3");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69561k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra4");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69562l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69563m);
        return stringBuffer.toString();
    }
}
