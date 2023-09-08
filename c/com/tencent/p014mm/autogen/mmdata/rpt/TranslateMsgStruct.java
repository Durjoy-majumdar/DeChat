package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct */
public final class TranslateMsgStruct extends C61103a {

    /* renamed from: d */
    public String f194634d = "";

    /* renamed from: e */
    public String f194635e = "";

    /* renamed from: f */
    public int f194636f;

    /* renamed from: g */
    public String f194637g = "";

    /* renamed from: h */
    public String f194638h = "";

    /* renamed from: i */
    public int f194639i;

    /* renamed from: j */
    public int f194640j;

    /* renamed from: k */
    public int f194641k;

    /* renamed from: l */
    public String f194642l = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23607;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194634d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194635e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194636f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194637g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194638h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194639i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194640j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194641k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194642l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194634d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TypeSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194635e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194636f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ButtonType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194637g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194638h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TypeLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194639i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TransLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194640j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SendLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194641k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TargetLanguage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194642l);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public TranslateMsgStruct mo93197s(String str) {
        this.f194637g = mo86045b("ButtonType", str, true);
        return this;
    }

    /* renamed from: t */
    public TranslateMsgStruct mo93198t(String str) {
        this.f194638h = mo86045b("ChatId", str, true);
        return this;
    }

    /* renamed from: u */
    public TranslateMsgStruct mo93199u(String str) {
        this.f194635e = mo86045b("TypeSessionId", str, true);
        return this;
    }
}
