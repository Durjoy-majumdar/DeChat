package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLivePreWarmStartReportStruct */
public final class FinderLivePreWarmStartReportStruct extends C61103a {

    /* renamed from: d */
    public String f155614d = "";

    /* renamed from: e */
    public long f155615e;

    /* renamed from: f */
    public int f155616f;

    /* renamed from: g */
    public String f155617g = "";

    /* renamed from: h */
    public String f155618h = "";

    /* renamed from: i */
    public int f155619i;

    /* renamed from: j */
    public int f155620j;

    /* renamed from: k */
    public String f155621k = "";

    /* renamed from: l */
    public String f155622l = "";

    /* renamed from: m */
    public String f155623m = "";

    /* renamed from: n */
    public String f155624n = "";

    /* renamed from: o */
    public long f155625o;

    /* renamed from: j */
    public int mo1004j() {
        return 21248;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155614d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155615e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155616f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155617g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155618h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155619i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155620j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155621k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155622l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155623m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155624n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155625o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appuin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155614d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appversion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155615e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("apptype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155616f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networktype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155617g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("prewarmpath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155618h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ispresend");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155619i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ispreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155620j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155621k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155622l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("shopwindowid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155623m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155624n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventtime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155625o);
        return stringBuffer.toString();
    }
}
