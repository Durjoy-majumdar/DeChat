package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XExptClientRptStruct */
public final class XExptClientRptStruct extends C61103a {

    /* renamed from: d */
    public long f343869d = 0;

    /* renamed from: e */
    public long f343870e = 0;

    /* renamed from: f */
    public long f343871f = 0;

    /* renamed from: g */
    public long f343872g = 0;

    /* renamed from: h */
    public long f343873h = 0;

    /* renamed from: i */
    public String f343874i = "";

    /* renamed from: j */
    public String f343875j = "";

    /* renamed from: k */
    public long f343876k;

    /* renamed from: j */
    public int mo1004j() {
        return 15452;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343869d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343870e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343871f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343872g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343873h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343874i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343875j);
        stringBuffer.append(",");
        stringBuffer.append(this.f343876k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ExptId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343869d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GroupId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343870e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExptSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343871f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343872g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343873h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExptKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343874i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExptVal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343875j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BucketSrc");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343876k);
        return stringBuffer.toString();
    }
}
