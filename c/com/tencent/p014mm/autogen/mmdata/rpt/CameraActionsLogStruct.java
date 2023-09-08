package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct */
public final class CameraActionsLogStruct extends C61103a {

    /* renamed from: d */
    public long f310033d;

    /* renamed from: e */
    public long f310034e;

    /* renamed from: f */
    public long f310035f;

    /* renamed from: g */
    public long f310036g;

    /* renamed from: h */
    public long f310037h;

    /* renamed from: i */
    public long f310038i;

    /* renamed from: j */
    public long f310039j;

    /* renamed from: k */
    public long f310040k = 0;

    /* renamed from: l */
    public long f310041l = 0;

    /* renamed from: m */
    public long f310042m = 0;

    /* renamed from: n */
    public long f310043n = 0;

    /* renamed from: o */
    public String f310044o = "";

    /* renamed from: p */
    public int f310045p = 0;

    /* renamed from: q */
    public String f310046q = "";

    /* renamed from: r */
    public String f310047r = "";

    /* renamed from: s */
    public String f310048s = "";

    /* renamed from: t */
    public String f310049t = "";

    /* renamed from: u */
    public int f310050u = 0;

    /* renamed from: v */
    public int f310051v = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 27940;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310033d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310034e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310035f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310036g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310037h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310038i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310039j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310040k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310041l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310042m);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f310043n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310044o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310045p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310046q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310047r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310048s);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f310049t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310050u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310051v);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310033d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310034e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310035f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310036g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalContentSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310037h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalContentType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310038i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalFlashLightStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310039j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchCameraByButtonCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310040k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SwitchCameraByDoubleClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310041l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickFlashLightCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310042m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AutoMacroLensCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310043n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CameraSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310044o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LightAdjustLastValue");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310045p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalBeautyCamType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310046q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalCamFliterType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310047r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalCamTemplateId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310048s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterMaasCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maasSessionKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310049t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AndroidCameraStrategy");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310050u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecordResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310051v);
        return stringBuffer.toString();
    }
}
