package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderProfilePostBtnReportStruct */
public final class FinderProfilePostBtnReportStruct extends C61103a {

    /* renamed from: d */
    public String f155915d = "";

    /* renamed from: e */
    public String f155916e = "";

    /* renamed from: f */
    public String f155917f = "";

    /* renamed from: g */
    public long f155918g;

    /* renamed from: h */
    public long f155919h;

    /* renamed from: i */
    public String f155920i = "";

    /* renamed from: j */
    public long f155921j;

    /* renamed from: j */
    public int mo1004j() {
        return 21923;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155915d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155916e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155917f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155918g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155919h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155920i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155921j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155915d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155916e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderContexId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155917f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155918g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155919h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155920i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTarget");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155921j);
        return stringBuffer.toString();
    }
}
