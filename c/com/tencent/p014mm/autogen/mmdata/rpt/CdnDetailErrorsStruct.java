package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct */
public final class CdnDetailErrorsStruct extends C61103a {

    /* renamed from: d */
    public int f265358d = 0;

    /* renamed from: e */
    public int f265359e = 0;

    /* renamed from: f */
    public int f265360f = 0;

    /* renamed from: g */
    public int f265361g = 0;

    /* renamed from: h */
    public String f265362h = "";

    /* renamed from: i */
    public int f265363i;

    /* renamed from: j */
    public long f265364j = 0;

    /* renamed from: k */
    public long f265365k = 0;

    /* renamed from: l */
    public String f265366l = "";

    /* renamed from: m */
    public long f265367m = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 17473;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265358d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265359e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265360f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265361g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265362h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265363i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265364j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265365k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265366l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265367m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("optype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265358d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265359e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errcode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265360f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mapederror");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265361g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("filekey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265362h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("filetype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265363i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TryWritenBytes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265364j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AvailableBytes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265365k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SystemErrorDescribe");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265366l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentFileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265367m);
        return stringBuffer.toString();
    }
}
