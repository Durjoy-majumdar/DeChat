package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipSummaryReportStruct */
public final class VoipSummaryReportStruct extends C61103a {

    /* renamed from: A */
    public String f310512A = "";

    /* renamed from: B */
    public String f310513B = "";

    /* renamed from: C */
    public String f310514C = "";

    /* renamed from: D */
    public String f310515D = "";

    /* renamed from: E */
    public String f310516E = "";

    /* renamed from: F */
    public String f310517F = "";

    /* renamed from: G */
    public String f310518G = "";

    /* renamed from: H */
    public String f310519H = "";

    /* renamed from: d */
    public String f310520d = "";

    /* renamed from: e */
    public long f310521e;

    /* renamed from: f */
    public long f310522f;

    /* renamed from: g */
    public String f310523g = "";

    /* renamed from: h */
    public String f310524h = "";

    /* renamed from: i */
    public String f310525i = "";

    /* renamed from: j */
    public String f310526j = "";

    /* renamed from: k */
    public String f310527k = "";

    /* renamed from: l */
    public String f310528l = "";

    /* renamed from: m */
    public String f310529m = "";

    /* renamed from: n */
    public String f310530n = "";

    /* renamed from: o */
    public String f310531o = "";

    /* renamed from: p */
    public String f310532p = "";

    /* renamed from: q */
    public String f310533q = "";

    /* renamed from: r */
    public String f310534r = "";

    /* renamed from: s */
    public String f310535s = "";

    /* renamed from: t */
    public String f310536t = "";

    /* renamed from: u */
    public String f310537u = "";

    /* renamed from: v */
    public String f310538v = "";

    /* renamed from: w */
    public String f310539w = "";

    /* renamed from: x */
    public String f310540x = "";

    /* renamed from: y */
    public String f310541y = "";

    /* renamed from: z */
    public String f310542z = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25803;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310520d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310521e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310522f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310523g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310524h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310525i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310526j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310527k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310528l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310529m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310530n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310531o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310532p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310533q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310534r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310535s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310536t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310537u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310538v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310539w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310540x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310541y);
        stringBuffer.append(",");
        stringBuffer.append(this.f310542z);
        stringBuffer.append(",");
        stringBuffer.append(this.f310512A);
        stringBuffer.append(",");
        stringBuffer.append(this.f310513B);
        stringBuffer.append(",");
        stringBuffer.append(this.f310514C);
        stringBuffer.append(",");
        stringBuffer.append(this.f310515D);
        stringBuffer.append(",");
        stringBuffer.append(this.f310516E);
        stringBuffer.append(",");
        stringBuffer.append(this.f310517F);
        stringBuffer.append(",");
        stringBuffer.append(this.f310518G);
        stringBuffer.append(",");
        stringBuffer.append(this.f310519H);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("featureID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310520d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310521e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TalkingTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310522f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310523g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraTimesInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310524h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraTotalTimeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310525i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraCostTimeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310526j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310527k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310528l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeTimesInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310529m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeTotalTimeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310530n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310531o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SettingInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310532p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310533q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileFpsInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310534r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310535s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileCostTimeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310536t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileBatteryTempInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310537u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProfileMemoryInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310538v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpTimesInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310539w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpTotalTimeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310540x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310541y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderTimesInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310542z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderTotalTimeInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310512A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderLocalInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310513B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderRemoteInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310514C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderLocalNotFrameErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310515D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderRemoteNotFrameErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310516E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderEncodeNotFrameErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310517F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderLocalSizeErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310518G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RenderRemoteSizeErrorInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310519H);
        return stringBuffer.toString();
    }
}
