package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderChatProfileStruct */
public final class FinderChatProfileStruct extends C61103a {

    /* renamed from: d */
    public String f155109d = "";

    /* renamed from: e */
    public String f155110e = "";

    /* renamed from: f */
    public String f155111f = "";

    /* renamed from: g */
    public long f155112g;

    /* renamed from: h */
    public String f155113h = "";

    /* renamed from: i */
    public String f155114i = "";

    /* renamed from: j */
    public long f155115j;

    /* renamed from: k */
    public long f155116k;

    /* renamed from: l */
    public long f155117l;

    /* renamed from: m */
    public long f155118m;

    /* renamed from: j */
    public int mo1004j() {
        return 20692;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155109d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155110e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155111f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155112g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155113h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155114i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155115j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155116k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155117l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155118m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155109d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155110e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155111f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("myAccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155112g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155113h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("talkerUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155114i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RejectMsgStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155115j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openChatInfoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155116k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clearMsgHistoryClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155117l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("complianClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155118m);
        return stringBuffer.toString();
    }
}
