package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct */
public final class EmoticonFastManagementStruct extends C61103a {

    /* renamed from: d */
    public int f265458d;

    /* renamed from: e */
    public int f265459e;

    /* renamed from: f */
    public String f265460f = "";

    /* renamed from: g */
    public String f265461g = "";

    /* renamed from: h */
    public int f265462h;

    /* renamed from: j */
    public int mo1004j() {
        return 19434;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265458d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265459e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265460f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265461g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265462h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265458d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265459e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Pid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265460f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265461g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265462h);
        return stringBuffer.toString();
    }
}
