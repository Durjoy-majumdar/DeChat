package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct */
public final class OCRTranslateReportStruct extends C61103a {

    /* renamed from: d */
    public long f343788d = 0;

    /* renamed from: e */
    public long f343789e = 0;

    /* renamed from: f */
    public long f343790f = 0;

    /* renamed from: g */
    public long f343791g = 0;

    /* renamed from: h */
    public long f343792h = 0;

    /* renamed from: i */
    public long f343793i = 0;

    /* renamed from: j */
    public long f343794j = 0;

    /* renamed from: k */
    public long f343795k = 0;

    /* renamed from: l */
    public long f343796l = 0;

    /* renamed from: m */
    public String f343797m = "";

    /* renamed from: n */
    public String f343798n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15435;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343788d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343789e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343790f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343791g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343792h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343793i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343794j);
        stringBuffer.append(",");
        stringBuffer.append(this.f343795k);
        stringBuffer.append(",");
        stringBuffer.append(this.f343796l);
        stringBuffer.append(",");
        stringBuffer.append(this.f343797m);
        stringBuffer.append(",");
        stringBuffer.append(this.f343798n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343788d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CaptureTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343789e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Result");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343790f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343791g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OCRTranslateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343792h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343793i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShowOriginCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343794j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasSaveResultImage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343795k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasSaveOriginImage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343796l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343797m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AesKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343798n);
        return stringBuffer.toString();
    }
}
