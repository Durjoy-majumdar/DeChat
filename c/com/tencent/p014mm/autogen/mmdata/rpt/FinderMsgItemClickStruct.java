package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderMsgItemClickStruct */
public final class FinderMsgItemClickStruct extends C61103a {

    /* renamed from: d */
    public String f155713d = "";

    /* renamed from: e */
    public long f155714e;

    /* renamed from: f */
    public long f155715f;

    /* renamed from: g */
    public long f155716g;

    /* renamed from: h */
    public String f155717h = "";

    /* renamed from: i */
    public long f155718i;

    /* renamed from: j */
    public int mo1004j() {
        return 19946;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155713d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155714e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155715f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155716g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155717h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155718i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155713d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155714e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsOverlap");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155715f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OverlapCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155716g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155717h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155718i);
        return stringBuffer.toString();
    }
}
