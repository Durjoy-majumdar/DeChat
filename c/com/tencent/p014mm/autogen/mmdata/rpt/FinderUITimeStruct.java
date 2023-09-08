package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderUITimeStruct */
public final class FinderUITimeStruct extends C61103a {

    /* renamed from: d */
    public String f48482d = "";

    /* renamed from: e */
    public String f48483e = "";

    /* renamed from: f */
    public long f48484f = 0;

    /* renamed from: g */
    public long f48485g = 0;

    /* renamed from: h */
    public long f48486h = 0;

    /* renamed from: i */
    public String f48487i = "";

    /* renamed from: j */
    public String f48488j = "";

    /* renamed from: k */
    public long f48489k = 0;

    /* renamed from: l */
    public String f48490l = "";

    /* renamed from: m */
    public String f48491m = "";

    /* renamed from: n */
    public String f48492n = "";

    /* renamed from: o */
    public long f48493o;

    /* renamed from: j */
    public int mo1004j() {
        return 19943;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48482d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48483e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48484f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48485g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48486h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48487i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48488j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48489k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48490l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48491m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48492n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48493o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48482d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48483e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48484f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48485g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48486h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48487i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48488j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48489k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48490l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48491m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterSourceInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48492n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModeFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48493o);
        return stringBuffer.toString();
    }
}
