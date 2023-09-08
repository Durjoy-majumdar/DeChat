package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct */
public final class EmoticonBoardReddotNotificationStruct extends C61103a {

    /* renamed from: d */
    public int f265442d;

    /* renamed from: e */
    public int f265443e;

    /* renamed from: f */
    public String f265444f = "";

    /* renamed from: g */
    public int f265445g;

    /* renamed from: h */
    public String f265446h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19435;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265442d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265443e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265444f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265445g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265446h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265442d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsRed");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265443e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterPid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265444f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265445g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Pid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265446h);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public EmoticonBoardReddotNotificationStruct mo126612s(String str) {
        this.f265446h = mo86045b("Pid", str, true);
        return this;
    }
}
