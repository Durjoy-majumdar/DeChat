package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct */
public final class MaasSdkResStruct extends C61103a {

    /* renamed from: d */
    public int f79121d = 0;

    /* renamed from: e */
    public int f79122e = 0;

    /* renamed from: f */
    public int f79123f = 0;

    /* renamed from: g */
    public int f79124g;

    /* renamed from: h */
    public int f79125h = -1;

    /* renamed from: i */
    public int f79126i = 0;

    /* renamed from: j */
    public int f79127j = 0;

    /* renamed from: k */
    public String f79128k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25056;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79121d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79122e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79123f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79124g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79125h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79126i);
        stringBuffer.append(",");
        stringBuffer.append(this.f79127j);
        stringBuffer.append(",");
        stringBuffer.append(this.f79128k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ApkCompatVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79121d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResCompatVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79122e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79123f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Event");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79124g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResSubType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79125h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LoadFailCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79126i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79127j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sha1");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79128k);
        return stringBuffer.toString();
    }
}
