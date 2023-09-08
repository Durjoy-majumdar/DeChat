package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderThumbCheckReportStruct */
public final class FinderThumbCheckReportStruct extends C61103a {

    /* renamed from: d */
    public int f156147d = 0;

    /* renamed from: e */
    public int f156148e = 0;

    /* renamed from: f */
    public int f156149f = -1;

    /* renamed from: g */
    public int f156150g = 0;

    /* renamed from: h */
    public int f156151h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 26304;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156147d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156148e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156149f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156150g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156151h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ThumbTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156147d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CheckThumbDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156148e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CoverTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156149f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UseAlgorithmCheckBlackFrame");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156150g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReplaceUserDefaultThumb");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156151h);
        return stringBuffer.toString();
    }
}
