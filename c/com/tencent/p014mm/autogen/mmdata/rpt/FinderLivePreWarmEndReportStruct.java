package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLivePreWarmEndReportStruct */
public final class FinderLivePreWarmEndReportStruct extends C61103a {

    /* renamed from: d */
    public String f155601d = "";

    /* renamed from: e */
    public String f155602e = "";

    /* renamed from: f */
    public int f155603f;

    /* renamed from: g */
    public String f155604g = "";

    /* renamed from: h */
    public String f155605h = "";

    /* renamed from: i */
    public String f155606i = "";

    /* renamed from: j */
    public String f155607j = "";

    /* renamed from: k */
    public String f155608k = "";

    /* renamed from: l */
    public long f155609l;

    /* renamed from: m */
    public int f155610m;

    /* renamed from: n */
    public int f155611n;

    /* renamed from: o */
    public long f155612o;

    /* renamed from: p */
    public long f155613p;

    /* renamed from: j */
    public int mo1004j() {
        return 21249;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155601d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155602e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155603f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155604g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155605h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155606i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155607j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155608k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155609l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155610m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155611n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155612o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155613p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appuin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155601d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appversion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155602e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("apptype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155603f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networktype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155604g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155605h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155606i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("shopwindowid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155607j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155608k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155609l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ispresend");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155610m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ispreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155611n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("prewarmstartime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155612o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("prewarmendtime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155613p);
        return stringBuffer.toString();
    }
}
