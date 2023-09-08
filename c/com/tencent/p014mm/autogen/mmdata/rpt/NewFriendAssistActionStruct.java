package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.NewFriendAssistActionStruct */
public final class NewFriendAssistActionStruct extends C61103a {

    /* renamed from: d */
    public long f194294d;

    /* renamed from: e */
    public long f194295e;

    /* renamed from: f */
    public long f194296f;

    /* renamed from: g */
    public long f194297g;

    /* renamed from: h */
    public long f194298h;

    /* renamed from: i */
    public String f194299i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24723;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194294d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194295e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194296f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194297g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194298h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194299i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("type_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194294d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("status_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194295e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_expired_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194296f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("source_");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194297g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194298h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194299i);
        return stringBuffer.toString();
    }
}
