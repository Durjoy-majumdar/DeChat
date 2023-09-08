package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CareModeTxt2VoiceUsageStruct */
public final class CareModeTxt2VoiceUsageStruct extends C61103a {

    /* renamed from: d */
    public long f48247d;

    /* renamed from: e */
    public long f48248e;

    /* renamed from: f */
    public String f48249f = "";

    /* renamed from: g */
    public String f48250g = "";

    /* renamed from: h */
    public long f48251h;

    /* renamed from: i */
    public long f48252i;

    /* renamed from: j */
    public long f48253j;

    /* renamed from: j */
    public int mo1004j() {
        return 25904;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48247d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48248e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48249f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48250g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48251h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48252i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48253j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sentenceCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48247d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("identifyCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48248e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("identifyLangArray");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48249f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("unidentifyLangArray");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48250g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48251h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("msgid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48252i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48253j);
        return stringBuffer.toString();
    }
}
