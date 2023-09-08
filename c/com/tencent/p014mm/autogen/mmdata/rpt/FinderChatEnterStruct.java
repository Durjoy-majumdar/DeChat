package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderChatEnterStruct */
public final class FinderChatEnterStruct extends C61103a {

    /* renamed from: d */
    public long f155096d;

    /* renamed from: e */
    public long f155097e;

    /* renamed from: f */
    public String f155098f = "";

    /* renamed from: g */
    public String f155099g = "";

    /* renamed from: h */
    public String f155100h = "";

    /* renamed from: i */
    public String f155101i = "";

    /* renamed from: j */
    public String f155102j = "";

    /* renamed from: k */
    public long f155103k;

    /* renamed from: l */
    public String f155104l = "";

    /* renamed from: m */
    public long f155105m;

    /* renamed from: n */
    public long f155106n;

    /* renamed from: o */
    public long f155107o;

    /* renamed from: p */
    public long f155108p;

    /* renamed from: j */
    public int mo1004j() {
        return 20691;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155096d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155097e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155098f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155099g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155100h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155101i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155102j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155103k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155104l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155105m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155106n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155107o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155108p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("fromCommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155096d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("myAccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155097e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("talkerUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155098f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155099g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155100h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatListSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155101i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155102j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155103k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155104l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reddotCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155105m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("newReceiveMsgCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155106n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("newSendMsgCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155107o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openChatInfoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155108p);
        return stringBuffer.toString();
    }
}
