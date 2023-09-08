package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ClientCellInfoReportStruct */
public final class ClientCellInfoReportStruct extends C61103a {

    /* renamed from: d */
    public int f194168d = 0;

    /* renamed from: e */
    public int f194169e = 0;

    /* renamed from: f */
    public int f194170f = 0;

    /* renamed from: g */
    public String f194171g = "";

    /* renamed from: h */
    public String f194172h = "";

    /* renamed from: i */
    public String f194173i = "";

    /* renamed from: j */
    public String f194174j = "";

    /* renamed from: k */
    public String f194175k = "";

    /* renamed from: l */
    public String f194176l = "";

    /* renamed from: m */
    public String f194177m = "";

    /* renamed from: n */
    public String f194178n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 15548;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194168d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194169e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194170f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194171g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194172h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194173i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194174j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194175k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194176l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194177m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194178n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CgiCmd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194168d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194169e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194170f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194171g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptUserinfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194172h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptCellinfoLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194173i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptCellinfo_01");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194174j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptCellinfo_02");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194175k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptCellinfo_03");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194176l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptCellinfo_04");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194177m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptCellinfo_05");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194178n);
        return stringBuffer.toString();
    }
}
