package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TopSessionInfoReportStruct */
public final class TopSessionInfoReportStruct extends C61103a {

    /* renamed from: d */
    public long f194623d;

    /* renamed from: e */
    public long f194624e;

    /* renamed from: f */
    public long f194625f;

    /* renamed from: g */
    public long f194626g;

    /* renamed from: h */
    public long f194627h;

    /* renamed from: i */
    public long f194628i;

    /* renamed from: j */
    public long f194629j;

    /* renamed from: j */
    public int mo1004j() {
        return 23512;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194623d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194624e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194625f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194626g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194627h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194628i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194629j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SingleCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194623d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GroupCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194624e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ServiceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194625f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedChatTopCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194626g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedChatNoTopCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194627h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OneScreenCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194628i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LimitRate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194629j);
        return stringBuffer.toString();
    }
}
