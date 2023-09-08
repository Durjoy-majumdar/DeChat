package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct */
public final class LeftSlideOptionStruct extends C61103a {

    /* renamed from: d */
    public long f107964d = 0;

    /* renamed from: e */
    public String f107965e = "";

    /* renamed from: f */
    public long f107966f;

    /* renamed from: g */
    public long f107967g;

    /* renamed from: h */
    public long f107968h;

    /* renamed from: j */
    public int mo1004j() {
        return 11090;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107964d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107965e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107966f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107967g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107968h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107964d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107965e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107966f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107967g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasEduWindow");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107968h);
        return stringBuffer.toString();
    }
}
