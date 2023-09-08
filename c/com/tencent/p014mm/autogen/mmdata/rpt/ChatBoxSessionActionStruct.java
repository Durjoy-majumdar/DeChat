package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatBoxSessionActionStruct */
public final class ChatBoxSessionActionStruct extends C61103a {

    /* renamed from: d */
    public long f154926d;

    /* renamed from: e */
    public long f154927e;

    /* renamed from: j */
    public int mo1004j() {
        return 24201;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f154926d);
        stringBuffer.append(",");
        stringBuffer.append(this.f154927e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154926d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("redType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f154927e);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public ChatBoxSessionActionStruct mo76250s(long j) {
        this.f154926d = j;
        return this;
    }

    /* renamed from: t */
    public ChatBoxSessionActionStruct mo76251t(long j) {
        this.f154927e = j;
        return this;
    }
}
