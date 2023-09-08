package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct */
public final class SnsPostSyncFinderPostStruct extends C61103a {

    /* renamed from: d */
    public long f156853d;

    /* renamed from: e */
    public String f156854e = "";

    /* renamed from: f */
    public String f156855f = "";

    /* renamed from: g */
    public String f156856g = "";

    /* renamed from: h */
    public long f156857h;

    /* renamed from: j */
    public int mo1004j() {
        return 26531;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156853d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156854e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156855f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156856g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156857h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156853d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("snsfeedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156854e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderPublishSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156855f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MomentsPostSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156856g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156857h);
        return stringBuffer.toString();
    }
}
