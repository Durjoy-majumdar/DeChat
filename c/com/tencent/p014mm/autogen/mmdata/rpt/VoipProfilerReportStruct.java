package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipProfilerReportStruct */
public final class VoipProfilerReportStruct extends C61103a {

    /* renamed from: A */
    public int f310443A;

    /* renamed from: B */
    public int f310444B;

    /* renamed from: C */
    public int f310445C;

    /* renamed from: D */
    public int f310446D;

    /* renamed from: E */
    public String f310447E = "";

    /* renamed from: F */
    public String f310448F = "";

    /* renamed from: G */
    public String f310449G = "";

    /* renamed from: H */
    public String f310450H = "";

    /* renamed from: d */
    public int f310451d;

    /* renamed from: e */
    public int f310452e;

    /* renamed from: f */
    public int f310453f;

    /* renamed from: g */
    public int f310454g;

    /* renamed from: h */
    public int f310455h;

    /* renamed from: i */
    public int f310456i;

    /* renamed from: j */
    public int f310457j;

    /* renamed from: k */
    public int f310458k;

    /* renamed from: l */
    public int f310459l;

    /* renamed from: m */
    public int f310460m;

    /* renamed from: n */
    public int f310461n;

    /* renamed from: o */
    public int f310462o;

    /* renamed from: p */
    public int f310463p;

    /* renamed from: q */
    public int f310464q;

    /* renamed from: r */
    public int f310465r;

    /* renamed from: s */
    public int f310466s;

    /* renamed from: t */
    public int f310467t;

    /* renamed from: u */
    public int f310468u;

    /* renamed from: v */
    public int f310469v;

    /* renamed from: w */
    public int f310470w;

    /* renamed from: x */
    public int f310471x;

    /* renamed from: y */
    public int f310472y;

    /* renamed from: z */
    public int f310473z;

    /* renamed from: j */
    public int mo1004j() {
        return 25088;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310451d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310452e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310453f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310454g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310455h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310456i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310457j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310458k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310459l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310460m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310461n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310462o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310463p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310464q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310465r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310466s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310467t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310468u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310469v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310470w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310471x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310472y);
        stringBuffer.append(",");
        stringBuffer.append(this.f310473z);
        stringBuffer.append(",");
        stringBuffer.append(this.f310443A);
        stringBuffer.append(",");
        stringBuffer.append(this.f310444B);
        stringBuffer.append(",");
        stringBuffer.append(this.f310445C);
        stringBuffer.append(",");
        stringBuffer.append(this.f310446D);
        stringBuffer.append(",");
        stringBuffer.append(this.f310447E);
        stringBuffer.append(",");
        stringBuffer.append(this.f310448F);
        stringBuffer.append(",");
        stringBuffer.append(this.f310449G);
        stringBuffer.append(",");
        stringBuffer.append(this.f310450H);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310451d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Rating");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310452e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeFpsMax");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310453f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeFpsMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310454g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeLackFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310455h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeAvgFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310456i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalRenderFpsMax");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310457j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalRenderFpsMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310458k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalRenderLackFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310459l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalRenderAvgFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310460m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteRenderFpsMax");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310461n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteRenderFpsMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310462o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteRenderFpsAvf");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310463p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteRenderLackFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310464q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeFirstFrameCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310465r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalRenderFirstFrameCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310466s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteRenderFirstFrameCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310467t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GphiaMemoryGL");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310468u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GphiaMemoryEGL");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310469v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GphiaMemoryGFX");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310470w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateRaise");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310471x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CPULoad");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310472y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateInit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310473z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateMaxTick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310443A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateRaiseAvg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310444B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateRaiseMax");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310445C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateRaiseMaxTick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310446D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PhoneTemprateInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310447E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpuLoadInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310448F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CpuTemprateInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310449G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatteryTemprateInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310450H);
        return stringBuffer.toString();
    }
}
