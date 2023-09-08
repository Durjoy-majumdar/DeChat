package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipFeatureReportLogicStruct */
public final class VoipFeatureReportLogicStruct extends C61103a {

    /* renamed from: A */
    public String f310396A = "";

    /* renamed from: B */
    public String f310397B = "";

    /* renamed from: C */
    public String f310398C = "";

    /* renamed from: D */
    public long f310399D;

    /* renamed from: E */
    public long f310400E;

    /* renamed from: F */
    public long f310401F;

    /* renamed from: d */
    public long f310402d;

    /* renamed from: e */
    public long f310403e;

    /* renamed from: f */
    public String f310404f = "";

    /* renamed from: g */
    public String f310405g = "";

    /* renamed from: h */
    public long f310406h;

    /* renamed from: i */
    public long f310407i;

    /* renamed from: j */
    public long f310408j;

    /* renamed from: k */
    public long f310409k;

    /* renamed from: l */
    public String f310410l = "";

    /* renamed from: m */
    public String f310411m = "";

    /* renamed from: n */
    public String f310412n = "";

    /* renamed from: o */
    public String f310413o = "";

    /* renamed from: p */
    public long f310414p;

    /* renamed from: q */
    public long f310415q;

    /* renamed from: r */
    public String f310416r = "";

    /* renamed from: s */
    public long f310417s;

    /* renamed from: t */
    public long f310418t;

    /* renamed from: u */
    public String f310419u = "";

    /* renamed from: v */
    public String f310420v = "";

    /* renamed from: w */
    public String f310421w = "";

    /* renamed from: x */
    public String f310422x = "";

    /* renamed from: y */
    public String f310423y = "";

    /* renamed from: z */
    public long f310424z;

    /* renamed from: j */
    public int mo1004j() {
        return 23241;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310402d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310403e);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f310404f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310405g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310406h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310407i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310408j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310409k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310410l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310411m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310412n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310413o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310414p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310415q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310416r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310417s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310418t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310419u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310420v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310421w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310422x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310423y);
        stringBuffer.append(",");
        stringBuffer.append(this.f310424z);
        stringBuffer.append(",");
        stringBuffer.append(this.f310396A);
        stringBuffer.append(",");
        stringBuffer.append(this.f310397B);
        stringBuffer.append(",");
        stringBuffer.append(this.f310398C);
        stringBuffer.append(",");
        stringBuffer.append(this.f310399D);
        stringBuffer.append(",");
        stringBuffer.append(this.f310400E);
        stringBuffer.append(",");
        stringBuffer.append(this.f310401F);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("voipType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310402d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310403e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audioDevicePlugs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("doubleLinkStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310404f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("previewSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310405g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useRemovePreviewCallback");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310406h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useRgb2Yuv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310407i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useFaceBeauty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310408j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useSTFilter");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310409k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("decodeChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310410l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("encodeChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310411m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("miniViewChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310412n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fullViewChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310413o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("avgBatteryCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310414p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useSurfaceEncode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310415q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audioDevicePlugChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310416r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cameraStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310417s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("closeReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310418t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("encodeSizeChange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310419u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("batteryTemperate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310420v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ringtoneUseInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310421w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("voipInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310422x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("floatCardInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310423y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFlutterVoip");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310424z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("virtualBackgroundInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310396A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cpuLoadInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310397B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cameraPauseInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310398C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("landscapeMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310399D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isAdaptiveRotate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310400E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isMultipleUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310401F);
        return stringBuffer.toString();
    }
}
