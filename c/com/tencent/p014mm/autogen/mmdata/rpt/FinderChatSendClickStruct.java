package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderChatSendClickStruct */
public final class FinderChatSendClickStruct extends C61103a {

    /* renamed from: d */
    public String f155119d = "";

    /* renamed from: e */
    public String f155120e = "";

    /* renamed from: f */
    public String f155121f = "";

    /* renamed from: g */
    public long f155122g;

    /* renamed from: h */
    public long f155123h;

    /* renamed from: i */
    public String f155124i = "";

    /* renamed from: j */
    public String f155125j = "";

    /* renamed from: k */
    public long f155126k;

    /* renamed from: l */
    public long f155127l;

    /* renamed from: j */
    public int mo1004j() {
        return 20671;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155119d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155120e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155121f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155122g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155123h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155124i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155125j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155126k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155127l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("finderUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155119d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("toUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155120e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("toFinderUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155121f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155122g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155123h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155124i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155125j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155126k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155127l);
        return stringBuffer.toString();
    }
}
