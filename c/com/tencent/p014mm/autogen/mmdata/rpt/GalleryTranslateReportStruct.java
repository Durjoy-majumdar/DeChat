package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct */
public final class GalleryTranslateReportStruct extends C61103a {

    /* renamed from: d */
    public long f265618d = 0;

    /* renamed from: e */
    public long f265619e = 0;

    /* renamed from: f */
    public long f265620f = 0;

    /* renamed from: g */
    public String f265621g = "";

    /* renamed from: h */
    public String f265622h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 17055;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265618d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265619e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265620f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265621g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265622h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265618d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265619e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265620f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265621g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AesKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265622h);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public GalleryTranslateReportStruct mo126620s(String str) {
        this.f265622h = mo86045b("AesKey", str, true);
        return this;
    }

    /* renamed from: t */
    public GalleryTranslateReportStruct mo126621t(String str) {
        this.f265621g = mo86045b("FileID", str, true);
        return this;
    }
}
