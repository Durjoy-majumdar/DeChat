package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XFilesActionNewStruct */
public final class XFilesActionNewStruct extends C61103a {

    /* renamed from: d */
    public String f48684d = "";

    /* renamed from: e */
    public String f48685e = "";

    /* renamed from: f */
    public String f48686f = "";

    /* renamed from: g */
    public long f48687g;

    /* renamed from: h */
    public long f48688h;

    /* renamed from: i */
    public long f48689i;

    /* renamed from: j */
    public int mo1004j() {
        return WXWebReporter.WXWEB_KV_FR_ACTION;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48684d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48685e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48686f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48687g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48688h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48689i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48684d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48685e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileFormat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48686f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48687g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstallQB");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48688h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FilePageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48689i);
        return stringBuffer.toString();
    }
}
