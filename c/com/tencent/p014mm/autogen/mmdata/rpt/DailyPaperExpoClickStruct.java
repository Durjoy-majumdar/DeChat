package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DailyPaperExpoClickStruct */
public final class DailyPaperExpoClickStruct extends C61103a {

    /* renamed from: d */
    public String f154952d = "";

    /* renamed from: e */
    public long f154953e;

    /* renamed from: f */
    public long f154954f;

    /* renamed from: g */
    public String f154955g = "";

    /* renamed from: h */
    public String f154956h = "";

    /* renamed from: i */
    public String f154957i = "";

    /* renamed from: j */
    public long f154958j;

    /* renamed from: j */
    public int mo1004j() {
        return 21559;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154952d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154953e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154954f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154955g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154956h);
        stringBuffer.append(",");
        stringBuffer.append(this.f154957i);
        stringBuffer.append(",");
        stringBuffer.append(this.f154958j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154952d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actiontimestampms");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154953e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("atcion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154954f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DailyPaperId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154955g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DailyPaperWording");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154956h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154957i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TagClickable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154958j);
        return stringBuffer.toString();
    }
}
