package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultitalkScreenFunctionStruct */
public final class MultitalkScreenFunctionStruct extends C61103a {

    /* renamed from: d */
    public String f310261d = "";

    /* renamed from: e */
    public int f310262e;

    /* renamed from: f */
    public long f310263f;

    /* renamed from: g */
    public long f310264g;

    /* renamed from: h */
    public long f310265h;

    /* renamed from: i */
    public long f310266i;

    /* renamed from: j */
    public long f310267j;

    /* renamed from: j */
    public int mo1004j() {
        return 21344;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310261d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310262e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310263f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310264g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310265h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310266i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310267j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MultitalkGroupId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310261d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScreeningType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310262e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Actiontype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310263f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Usertype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310264g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310265h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310266i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomkey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310267j);
        return stringBuffer.toString();
    }
}
