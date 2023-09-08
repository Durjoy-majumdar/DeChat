package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct */
public final class ChatImageWebSearchActionStruct extends C61103a {

    /* renamed from: d */
    public String f265368d = "";

    /* renamed from: e */
    public int f265369e;

    /* renamed from: f */
    public int f265370f;

    /* renamed from: g */
    public int f265371g;

    /* renamed from: h */
    public String f265372h = "";

    /* renamed from: i */
    public String f265373i = "";

    /* renamed from: j */
    public int f265374j;

    /* renamed from: k */
    public String f265375k = "";

    /* renamed from: l */
    public String f265376l = "";

    /* renamed from: m */
    public long f265377m = 0;

    /* renamed from: n */
    public int f265378n;

    /* renamed from: o */
    public String f265379o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20511;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265368d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265369e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265370f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265371g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265372h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265373i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265374j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265375k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265376l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265377m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265378n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265379o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265368d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265369e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265370f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265371g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265372h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgFromUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265373i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265374j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatRoomID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265375k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PicMD5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265376l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeStampsInMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265377m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CgiRet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265378n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CgiAction");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265379o);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public ChatImageWebSearchActionStruct mo126607s(String str) {
        this.f265375k = mo86045b("ChatRoomID", str, true);
        return this;
    }

    /* renamed from: t */
    public ChatImageWebSearchActionStruct mo126608t(String str) {
        this.f265373i = mo86045b("MsgFromUsername", str, true);
        return this;
    }

    /* renamed from: u */
    public ChatImageWebSearchActionStruct mo126609u(String str) {
        this.f265372h = mo86045b("MsgId", str, true);
        return this;
    }

    /* renamed from: v */
    public ChatImageWebSearchActionStruct mo126610v(String str) {
        this.f265376l = mo86045b("PicMD5", str, true);
        return this;
    }

    /* renamed from: w */
    public ChatImageWebSearchActionStruct mo126611w(String str) {
        this.f265368d = mo86045b("RequestId", str, true);
        return this;
    }
}
