package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct */
public final class WAMainFrameEnterHistoryListExposeStruct extends C61103a {

    /* renamed from: d */
    public long f236469d;

    /* renamed from: e */
    public long f236470e;

    /* renamed from: f */
    public long f236471f;

    /* renamed from: g */
    public long f236472g;

    /* renamed from: h */
    public String f236473h = "";

    /* renamed from: i */
    public String f236474i = "";

    /* renamed from: j */
    public long f236475j;

    /* renamed from: k */
    public String f236476k = "";

    /* renamed from: l */
    public String f236477l = "";

    /* renamed from: m */
    public String f236478m = "";

    /* renamed from: n */
    public String f236479n = "";

    /* renamed from: o */
    public long f236480o;

    /* renamed from: j */
    public int mo1004j() {
        return 18094;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236469d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236470e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236471f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236472g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236473h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236474i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236475j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236476k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236477l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236478m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236479n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236480o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterListTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236469d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LeaveListTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236470e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LeaveListType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236471f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickAppidIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236472g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickAppid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236473h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickAppidName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236474i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickAppidIsStar");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236475j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppidFrom1And5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236476k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppidFrom6And10");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236477l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppidFrom11And15");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236478m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppidFrom16And20");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236479n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openSession");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236480o);
        return stringBuffer.toString();
    }
}
