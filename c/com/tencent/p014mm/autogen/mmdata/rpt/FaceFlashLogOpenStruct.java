package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct */
public final class FaceFlashLogOpenStruct extends C61103a {

    /* renamed from: A */
    public String f9685A = "";

    /* renamed from: B */
    public int f9686B = -1;

    /* renamed from: C */
    public int f9687C = -1;

    /* renamed from: d */
    public long f9688d;

    /* renamed from: e */
    public long f9689e;

    /* renamed from: f */
    public long f9690f;

    /* renamed from: g */
    public int f9691g;

    /* renamed from: h */
    public int f9692h;

    /* renamed from: i */
    public int f9693i;

    /* renamed from: j */
    public long f9694j;

    /* renamed from: k */
    public long f9695k;

    /* renamed from: l */
    public long f9696l;

    /* renamed from: m */
    public String f9697m = "";

    /* renamed from: n */
    public String f9698n = "";

    /* renamed from: o */
    public int f9699o;

    /* renamed from: p */
    public long f9700p = 0;

    /* renamed from: q */
    public long f9701q = 0;

    /* renamed from: r */
    public long f9702r = 0;

    /* renamed from: s */
    public long f9703s = 0;

    /* renamed from: t */
    public long f9704t = 0;

    /* renamed from: u */
    public long f9705u = 0;

    /* renamed from: v */
    public long f9706v = 0;

    /* renamed from: w */
    public long f9707w = 0;

    /* renamed from: x */
    public long f9708x = 0;

    /* renamed from: y */
    public String f9709y = "";

    /* renamed from: z */
    public String f9710z = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21130;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9688d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9689e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9690f);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f9691g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9692h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9693i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9694j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9695k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9696l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9697m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9698n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9699o);
        stringBuffer.append(",");
        stringBuffer.append(this.f9700p);
        stringBuffer.append(",");
        stringBuffer.append(this.f9701q);
        stringBuffer.append(",");
        stringBuffer.append(this.f9702r);
        stringBuffer.append(",");
        stringBuffer.append(this.f9703s);
        stringBuffer.append(",");
        stringBuffer.append(this.f9704t);
        stringBuffer.append(",");
        stringBuffer.append(this.f9705u);
        stringBuffer.append(",");
        stringBuffer.append(this.f9706v);
        stringBuffer.append(",");
        stringBuffer.append(this.f9707w);
        stringBuffer.append(",");
        stringBuffer.append(this.f9708x);
        stringBuffer.append(",");
        stringBuffer.append(this.f9709y);
        stringBuffer.append(",");
        stringBuffer.append(this.f9710z);
        stringBuffer.append(",");
        stringBuffer.append(this.f9685A);
        stringBuffer.append(",");
        stringBuffer.append(this.f9686B);
        stringBuffer.append(",");
        stringBuffer.append(this.f9687C);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ResultCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9688d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AliveType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9689e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9690f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PrepareCgiErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfigCgiErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9691g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9692h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VerifyCgiErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9693i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9694j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LivenessCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9695k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResetCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9696l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StateRecord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9697m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AndroidStateRecord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9698n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FaceReset");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9699o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfirmPageTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9700p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FlashUIPageTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9701q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReqConfigTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9702r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RspConfigTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9703s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VerifyStartTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9704t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VerifyEndTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9705u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnEndTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9706v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RspVerifyTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9707w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitVerifyTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9708x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BioId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9709y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9710z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SdkStatusStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9685A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9686B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeviceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9687C);
        return stringBuffer.toString();
    }
}
