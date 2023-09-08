package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipCameraModularReportStruct */
public final class VoipCameraModularReportStruct extends C61103a {

    /* renamed from: d */
    public int f310353d;

    /* renamed from: e */
    public long f310354e;

    /* renamed from: f */
    public long f310355f;

    /* renamed from: g */
    public long f310356g;

    /* renamed from: h */
    public long f310357h;

    /* renamed from: i */
    public long f310358i;

    /* renamed from: j */
    public long f310359j;

    /* renamed from: k */
    public long f310360k;

    /* renamed from: l */
    public String f310361l = "";

    /* renamed from: m */
    public String f310362m = "";

    /* renamed from: n */
    public int f310363n;

    /* renamed from: o */
    public int f310364o;

    /* renamed from: p */
    public long f310365p;

    /* renamed from: q */
    public long f310366q;

    /* renamed from: r */
    public long f310367r;

    /* renamed from: s */
    public long f310368s;

    /* renamed from: t */
    public long f310369t;

    /* renamed from: u */
    public long f310370u;

    /* renamed from: v */
    public long f310371v;

    /* renamed from: w */
    public long f310372w;

    /* renamed from: x */
    public long f310373x;

    /* renamed from: j */
    public int mo1004j() {
        return 25051;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310353d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310354e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310355f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310356g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310357h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310358i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310359j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310360k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310361l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310362m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310363n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310364o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310365p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310366q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310367r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310368s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310369t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310370u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310371v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310372w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310373x);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Rating");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310353d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310354e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InitCameraError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310355f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartPreviewError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310356g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StopPreviewError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310357h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraLeak");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310358i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchCameraError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310359j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchPreviewError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310360k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreviewSizeError");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310361l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraSdk");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310362m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchCameraTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310363n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchPreviewTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310364o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalFrontCamera");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310365p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalBackCamera");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310366q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Total480PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310367r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Total720PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310368s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Total1080PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310369t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartCameraCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310370u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchPreviewCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310371v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchCameraCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310372w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartPreviewCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310373x);
        return stringBuffer.toString();
    }
}
