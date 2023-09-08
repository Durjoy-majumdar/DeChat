package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FTSSeachSimilarImgActionReportStruct */
public final class FTSSeachSimilarImgActionReportStruct extends C61103a {

    /* renamed from: d */
    public long f265492d = 0;

    /* renamed from: e */
    public String f265493e = "";

    /* renamed from: f */
    public String f265494f = "";

    /* renamed from: g */
    public String f265495g = "";

    /* renamed from: h */
    public String f265496h = "";

    /* renamed from: i */
    public long f265497i;

    /* renamed from: j */
    public int mo1004j() {
        return 22411;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265492d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265493e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265494f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265495g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265496h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265497i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265492d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265493e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265494f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DocId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265495g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PicMD5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265496h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265497i);
        return stringBuffer.toString();
    }
}
