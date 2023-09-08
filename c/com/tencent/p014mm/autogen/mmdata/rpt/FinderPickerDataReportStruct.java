package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct */
public final class FinderPickerDataReportStruct extends C61103a {

    /* renamed from: d */
    public String f155759d = "";

    /* renamed from: e */
    public long f155760e;

    /* renamed from: f */
    public long f155761f;

    /* renamed from: g */
    public String f155762g = "";

    /* renamed from: h */
    public long f155763h;

    /* renamed from: i */
    public String f155764i = "";

    /* renamed from: j */
    public String f155765j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22878;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155759d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155760e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155761f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155762g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155763h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155764i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155765j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155759d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pickerScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155760e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155761f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155762g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155763h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udfKv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155764i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("timeStampInMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155765j);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderPickerDataReportStruct mo76265s(String str) {
        this.f155762g = mo86045b("eventCode", str, true);
        return this;
    }

    /* renamed from: t */
    public FinderPickerDataReportStruct mo76266t(String str) {
        this.f155759d = mo86045b("sessionid", str, true);
        return this;
    }

    /* renamed from: u */
    public FinderPickerDataReportStruct mo76267u(String str) {
        this.f155765j = mo86045b("timeStampInMs", str, true);
        return this;
    }

    /* renamed from: v */
    public FinderPickerDataReportStruct mo76268v(String str) {
        this.f155764i = mo86045b("udfKv", str, true);
        return this;
    }
}
