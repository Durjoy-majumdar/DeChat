package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct */
public final class MediaFileReportStruct extends C61103a {

    /* renamed from: d */
    public String f79131d = "";

    /* renamed from: e */
    public String f79132e = "";

    /* renamed from: f */
    public String f79133f = "";

    /* renamed from: g */
    public long f79134g;

    /* renamed from: h */
    public long f79135h;

    /* renamed from: i */
    public int f79136i = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 27643;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79131d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79132e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79133f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79134g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79135h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79136i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MediaDirPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79131d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaFilePath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79132e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModifiedTimeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79133f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModifiedTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79134g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaFileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79135h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OptType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79136i);
        return stringBuffer.toString();
    }
}
