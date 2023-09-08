package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveOpenWxaShopReportStruct */
public final class FinderLiveOpenWxaShopReportStruct extends C61103a {

    /* renamed from: d */
    public int f155548d;

    /* renamed from: e */
    public int f155549e;

    /* renamed from: f */
    public String f155550f = "";

    /* renamed from: g */
    public long f155551g;

    /* renamed from: h */
    public int f155552h;

    /* renamed from: i */
    public int f155553i;

    /* renamed from: j */
    public String f155554j = "";

    /* renamed from: k */
    public String f155555k = "";

    /* renamed from: l */
    public int f155556l;

    /* renamed from: m */
    public int f155557m;

    /* renamed from: n */
    public String f155558n = "";

    /* renamed from: o */
    public String f155559o = "";

    /* renamed from: p */
    public String f155560p = "";

    /* renamed from: q */
    public String f155561q = "";

    /* renamed from: r */
    public long f155562r;

    /* renamed from: s */
    public String f155563s = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21188;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155548d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155549e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155550f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155551g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155552h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155553i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155554j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155555k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155556l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155557m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155558n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155559o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155560p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155561q);
        stringBuffer.append(",");
        stringBuffer.append(this.f155562r);
        stringBuffer.append(",");
        stringBuffer.append(this.f155563s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("isFirstOpen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155548d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155549e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155550f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155551g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155552h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155553i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155554j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("preWarmPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155555k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPresend");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155556l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155557m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155558n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155559o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("shopwindowId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155560p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155561q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155562r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155563s);
        return stringBuffer.toString();
    }
}
