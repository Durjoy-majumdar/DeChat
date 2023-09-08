package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicBootsPkgRecordStruct */
public final class MagicBootsPkgRecordStruct extends C61103a {

    /* renamed from: d */
    public String f69546d = "";

    /* renamed from: e */
    public String f69547e = "";

    /* renamed from: f */
    public String f69548f = "";

    /* renamed from: g */
    public String f69549g = "";

    /* renamed from: h */
    public long f69550h;

    /* renamed from: i */
    public long f69551i;

    /* renamed from: j */
    public long f69552j;

    /* renamed from: k */
    public long f69553k;

    /* renamed from: j */
    public int mo1004j() {
        return 27831;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69546d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69547e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69548f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69549g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69550h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69551i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69552j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69553k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PkgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69546d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BaseId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69547e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Version");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69548f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69549g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileExist");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69550h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69551i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("State");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69552j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69553k);
        return stringBuffer.toString();
    }
}
