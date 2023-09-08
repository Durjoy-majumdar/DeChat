package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireMsgFoldClickStruct */
public final class SolitaireMsgFoldClickStruct extends C61103a {

    /* renamed from: d */
    public String f194454d = "";

    /* renamed from: e */
    public long f194455e = 0;

    /* renamed from: f */
    public String f194456f = "";

    /* renamed from: g */
    public long f194457g = 0;

    /* renamed from: h */
    public long f194458h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 19964;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194454d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194455e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194456f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194457g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194458h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194454d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194455e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Identifier");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194456f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DisplayCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194457g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HideCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194458h);
        return stringBuffer.toString();
    }
}
