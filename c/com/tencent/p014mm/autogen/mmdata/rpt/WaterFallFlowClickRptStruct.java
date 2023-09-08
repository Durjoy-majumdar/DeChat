package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WaterFallFlowClickRptStruct */
public final class WaterFallFlowClickRptStruct extends C61103a {

    /* renamed from: d */
    public String f48647d = "";

    /* renamed from: e */
    public String f48648e = "";

    /* renamed from: f */
    public int f48649f;

    /* renamed from: g */
    public long f48650g;

    /* renamed from: h */
    public long f48651h;

    /* renamed from: i */
    public String f48652i = "";

    /* renamed from: j */
    public String f48653j = "";

    /* renamed from: k */
    public int f48654k;

    /* renamed from: l */
    public int f48655l;

    /* renamed from: m */
    public String f48656m = "";

    /* renamed from: n */
    public String f48657n = "";

    /* renamed from: o */
    public String f48658o = "";

    /* renamed from: p */
    public int f48659p;

    /* renamed from: j */
    public int mo1004j() {
        return 19945;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48647d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48648e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48649f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48650g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48651h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48652i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48653j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48654k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48655l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48656m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48657n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48658o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48659p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48647d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickFeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48648e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48649f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UpdataTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48650g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48651h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemExposureAreaWeigth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48652i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ScreenExposureAreaWeigth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48653j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemDirection");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48654k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48655l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShotScreenJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48656m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48657n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemBufffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48658o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemArrayIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48659p);
        return stringBuffer.toString();
    }
}
