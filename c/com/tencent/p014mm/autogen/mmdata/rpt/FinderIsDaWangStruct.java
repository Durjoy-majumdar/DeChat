package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderIsDaWangStruct */
public final class FinderIsDaWangStruct extends C61103a {

    /* renamed from: d */
    public long f265586d;

    /* renamed from: e */
    public long f265587e;

    /* renamed from: j */
    public int mo1004j() {
        return 22554;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265586d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265587e);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("isOnDawang");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265586d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(DownloadInfo.NETTYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265587e);
        return stringBuffer.toString();
    }
}
