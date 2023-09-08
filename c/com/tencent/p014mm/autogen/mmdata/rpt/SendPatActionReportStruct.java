package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct */
public final class SendPatActionReportStruct extends C61103a {

    /* renamed from: d */
    public int f194361d;

    /* renamed from: e */
    public long f194362e;

    /* renamed from: f */
    public String f194363f = "";

    /* renamed from: g */
    public String f194364g = "";

    /* renamed from: h */
    public String f194365h = "";

    /* renamed from: i */
    public int f194366i;

    /* renamed from: j */
    public long f194367j;

    /* renamed from: k */
    public int f194368k;

    /* renamed from: l */
    public int f194369l;

    /* renamed from: m */
    public int f194370m;

    /* renamed from: n */
    public String f194371n = "";

    /* renamed from: o */
    public int f194372o;

    /* renamed from: p */
    public int f194373p;

    /* renamed from: q */
    public int f194374q;

    /* renamed from: r */
    public String f194375r = "";

    /* renamed from: s */
    public String f194376s = "";

    /* renamed from: t */
    public String f194377t = "";

    /* renamed from: u */
    public String f194378u = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19878;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194361d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194362e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194363f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194364g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194365h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194366i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194367j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194368k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194369l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194370m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194371n);
        stringBuffer.append(",");
        stringBuffer.append(this.f194372o);
        stringBuffer.append(",");
        stringBuffer.append(this.f194373p);
        stringBuffer.append(",");
        stringBuffer.append(this.f194374q);
        stringBuffer.append(",");
        stringBuffer.append(this.f194375r);
        stringBuffer.append(",");
        stringBuffer.append(this.f194376s);
        stringBuffer.append(",");
        stringBuffer.append(this.f194377t);
        stringBuffer.append(",");
        stringBuffer.append(this.f194378u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194361d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194362e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194363f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PattedUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194364g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatroomName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194365h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194366i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeInterval");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194367j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsHitLocalFrequency");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194368k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsCreateNewChat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194369l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatSequence");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194370m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PatSuffix");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194371n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194372o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeMethod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194373p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsEducationGuidance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194374q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194375r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194376s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromStatusIcon");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194377t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToStatusIcon");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194378u);
        return stringBuffer.toString();
    }
}
