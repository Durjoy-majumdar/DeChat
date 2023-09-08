package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct */
public final class WeVisionModelResStruct extends C61103a {

    /* renamed from: d */
    public int f79225d = 0;

    /* renamed from: e */
    public int f79226e = 0;

    /* renamed from: f */
    public int f79227f = 0;

    /* renamed from: g */
    public String f79228g = "";

    /* renamed from: h */
    public String f79229h = "";

    /* renamed from: i */
    public int f79230i = 0;

    /* renamed from: j */
    public int f79231j = 0;

    /* renamed from: k */
    public String f79232k = "";

    /* renamed from: l */
    public int f79233l = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 24501;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79225d);
        stringBuffer.append(",");
        stringBuffer.append(this.f79226e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79227f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79228g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79229h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79230i);
        stringBuffer.append(",");
        stringBuffer.append(this.f79231j);
        stringBuffer.append(",");
        stringBuffer.append(this.f79232k);
        stringBuffer.append(",");
        stringBuffer.append(this.f79233l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppSDKVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79225d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfigSDKVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79226e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfigVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79227f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ModelList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79228g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InvalidModelList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79229h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfigFileVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79230i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79231j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CgiModelList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79232k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ffeversion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79233l);
        return stringBuffer.toString();
    }
}
