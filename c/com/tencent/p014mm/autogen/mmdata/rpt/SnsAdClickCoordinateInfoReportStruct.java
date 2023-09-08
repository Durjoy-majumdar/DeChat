package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsAdClickCoordinateInfoReportStruct */
public final class SnsAdClickCoordinateInfoReportStruct extends C61103a {

    /* renamed from: d */
    public int f265924d = 0;

    /* renamed from: e */
    public int f265925e = 0;

    /* renamed from: f */
    public int f265926f = 0;

    /* renamed from: g */
    public int f265927g = 0;

    /* renamed from: h */
    public int f265928h = 0;

    /* renamed from: i */
    public String f265929i = "";

    /* renamed from: j */
    public String f265930j = "";

    /* renamed from: k */
    public String f265931k = "";

    /* renamed from: l */
    public String f265932l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23600;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265924d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265925e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265926f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265927g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265928h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265929i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265930j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265931k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265932l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContentW");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265924d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContentH");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265925e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickX");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265926f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickY");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265927g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265928h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265929i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Uxinfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265930j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra1");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265931k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Extra2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265932l);
        return stringBuffer.toString();
    }
}
