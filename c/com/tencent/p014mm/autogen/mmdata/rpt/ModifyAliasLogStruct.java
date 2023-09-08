package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct */
public final class ModifyAliasLogStruct extends C61103a {

    /* renamed from: d */
    public String f9997d = "";

    /* renamed from: e */
    public long f9998e;

    /* renamed from: f */
    public long f9999f;

    /* renamed from: g */
    public long f10000g;

    /* renamed from: j */
    public int mo1004j() {
        return 19818;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9997d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9998e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9999f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10000g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9997d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9998e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errortype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9999f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pageid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10000g);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public ModifyAliasLogStruct mo1043s(String str) {
        this.f9997d = mo86045b("sessionid", str, true);
        return this;
    }
}
