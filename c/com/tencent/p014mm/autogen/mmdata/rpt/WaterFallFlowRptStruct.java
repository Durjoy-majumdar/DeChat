package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WaterFallFlowRptStruct */
public final class WaterFallFlowRptStruct extends C61103a {

    /* renamed from: d */
    public String f48660d = "";

    /* renamed from: e */
    public String f48661e = "";

    /* renamed from: f */
    public long f48662f;

    /* renamed from: g */
    public long f48663g;

    /* renamed from: h */
    public int f48664h = -1;

    /* renamed from: i */
    public String f48665i = "";

    /* renamed from: j */
    public String f48666j = "";

    /* renamed from: k */
    public String f48667k = "";

    /* renamed from: l */
    public int f48668l;

    /* renamed from: m */
    public long f48669m;

    /* renamed from: n */
    public long f48670n;

    /* renamed from: o */
    public int f48671o;

    /* renamed from: p */
    public String f48672p = "";

    /* renamed from: q */
    public int f48673q;

    /* renamed from: j */
    public int mo1004j() {
        return 19944;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48660d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48661e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48662f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48663g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48664h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48665i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48666j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48667k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48668l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48669m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48670n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48671o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48672p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48673q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48660d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48661e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartExposureMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48662f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndExposureMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48663g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DisAppearType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48664h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemExposureAreaWeigth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48665i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScreenExposureAreaWeigth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48666j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48667k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48668l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdataTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48669m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemExposureTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48670n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemPos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48671o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemBufffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48672p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemArrayIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48673q);
        return stringBuffer.toString();
    }
}
