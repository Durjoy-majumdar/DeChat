package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ActivityBrowseClickStruct */
public final class ActivityBrowseClickStruct extends C61103a {

    /* renamed from: d */
    public String f154917d = "";

    /* renamed from: e */
    public String f154918e = "";

    /* renamed from: f */
    public String f154919f = "";

    /* renamed from: g */
    public long f154920g;

    /* renamed from: h */
    public long f154921h;

    /* renamed from: i */
    public String f154922i = "";

    /* renamed from: j */
    public long f154923j;

    /* renamed from: k */
    public String f154924k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21851;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154917d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154918e);
        stringBuffer.append(",");
        stringBuffer.append(this.f154919f);
        stringBuffer.append(",");
        stringBuffer.append(this.f154920g);
        stringBuffer.append(",");
        stringBuffer.append(this.f154921h);
        stringBuffer.append(",");
        stringBuffer.append(this.f154922i);
        stringBuffer.append(",");
        stringBuffer.append(this.f154923j);
        stringBuffer.append(",");
        stringBuffer.append(this.f154924k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154917d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154918e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderContexId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154919f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154920g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154921h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154922i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTarget");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154923j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActivityId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154924k);
        return stringBuffer.toString();
    }
}
