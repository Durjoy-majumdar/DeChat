package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAPhoneAuthActionLogStruct */
public final class WAPhoneAuthActionLogStruct extends C61103a {

    /* renamed from: A */
    public long f236481A = 0;

    /* renamed from: B */
    public long f236482B = 0;

    /* renamed from: C */
    public long f236483C = 0;

    /* renamed from: D */
    public String f236484D = "";

    /* renamed from: E */
    public String f236485E = "";

    /* renamed from: d */
    public long f236486d = 0;

    /* renamed from: e */
    public long f236487e = 0;

    /* renamed from: f */
    public long f236488f = 0;

    /* renamed from: g */
    public long f236489g = 0;

    /* renamed from: h */
    public long f236490h = 0;

    /* renamed from: i */
    public long f236491i = 0;

    /* renamed from: j */
    public long f236492j = 0;

    /* renamed from: k */
    public long f236493k = 0;

    /* renamed from: l */
    public long f236494l = 0;

    /* renamed from: m */
    public long f236495m = 0;

    /* renamed from: n */
    public long f236496n = 0;

    /* renamed from: o */
    public long f236497o = 0;

    /* renamed from: p */
    public long f236498p = 0;

    /* renamed from: q */
    public long f236499q = 0;

    /* renamed from: r */
    public long f236500r = 0;

    /* renamed from: s */
    public long f236501s = 0;

    /* renamed from: t */
    public long f236502t = 0;

    /* renamed from: u */
    public long f236503u = 0;

    /* renamed from: v */
    public long f236504v = 0;

    /* renamed from: w */
    public long f236505w = 0;

    /* renamed from: x */
    public long f236506x = 0;

    /* renamed from: y */
    public long f236507y = 0;

    /* renamed from: z */
    public long f236508z = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 16375;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236486d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236487e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236488f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236489g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236490h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236491i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236492j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236493k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236494l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236495m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236496n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236497o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236498p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236499q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236500r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236501s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236502t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236503u);
        stringBuffer.append(",");
        stringBuffer.append(this.f236504v);
        stringBuffer.append(",");
        stringBuffer.append(this.f236505w);
        stringBuffer.append(",");
        stringBuffer.append(this.f236506x);
        stringBuffer.append(",");
        stringBuffer.append(this.f236507y);
        stringBuffer.append(",");
        stringBuffer.append(this.f236508z);
        stringBuffer.append(",");
        stringBuffer.append(this.f236481A);
        stringBuffer.append(",");
        stringBuffer.append(this.f236482B);
        stringBuffer.append(",");
        stringBuffer.append(this.f236483C);
        stringBuffer.append(",");
        stringBuffer.append(this.f236484D);
        stringBuffer.append(",");
        stringBuffer.append(this.f236485E);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("isBindPhone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236486d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bindSuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236487e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("getPhoneNumberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236488f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickConfirmCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236489g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickDenyCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236490h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickCancelCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236491i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("confirmBindedPhoneCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236492j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("confirmUnBindPhoneCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236493k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickInfoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236494l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickUseOtherPhoneCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236495m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickManagePhoneCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236496n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickGetVerifyCodeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236497o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("getVerifyCodeSuccessCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236498p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("getVerifyCodeFailedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236499q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickAddPhoneDoneCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236500r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addPhoneSuccessCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236501s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addPhoneFailedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236502t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addPhoneAndSaveCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236503u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("addPhoneNotSaveCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236504v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickAddPhoneOnManagePageCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236505w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("deletePhoneCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236506x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("deletePhoneSuccessCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236507y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("deletePhoneFailedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236508z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("verifyCodeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236481A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("verifyCodeSuccessCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236482B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("verifyCodeFailedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236483C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236484D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("phoneNumber");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236485E);
        return stringBuffer.toString();
    }
}
