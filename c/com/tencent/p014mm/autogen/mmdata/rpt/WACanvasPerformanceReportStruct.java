package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WACanvasPerformanceReportStruct */
public final class WACanvasPerformanceReportStruct extends C61103a {

    /* renamed from: d */
    public String f236449d = "";

    /* renamed from: e */
    public long f236450e;

    /* renamed from: f */
    public long f236451f;

    /* renamed from: g */
    public long f236452g;

    /* renamed from: h */
    public String f236453h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23423;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236449d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236450e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236451f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236452g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236453h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236449d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236450e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236451f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236452g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236453h);
        return stringBuffer.toString();
    }
}
