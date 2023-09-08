package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct */
public final class FinderFeedDataStruct extends C61103a {

    /* renamed from: d */
    public String f155231d = "";

    /* renamed from: e */
    public int f155232e;

    /* renamed from: f */
    public String f155233f = "";

    /* renamed from: g */
    public int f155234g;

    /* renamed from: h */
    public long f155235h;

    /* renamed from: i */
    public String f155236i = "";

    /* renamed from: j */
    public int f155237j;

    /* renamed from: k */
    public String f155238k = "";

    /* renamed from: l */
    public long f155239l;

    /* renamed from: m */
    public long f155240m;

    /* renamed from: n */
    public String f155241n = "";

    /* renamed from: o */
    public String f155242o = "";

    /* renamed from: p */
    public String f155243p = "";

    /* renamed from: q */
    public String f155244q = "";

    /* renamed from: r */
    public String f155245r = "";

    /* renamed from: s */
    public String f155246s = "";

    /* renamed from: t */
    public String f155247t = "";

    /* renamed from: u */
    public long f155248u;

    /* renamed from: v */
    public String f155249v = "";

    /* renamed from: w */
    public String f155250w = "";

    /* renamed from: x */
    public int f155251x = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 18054;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155231d);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155232e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155233f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155234g);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155235h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155236i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155237j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155238k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155239l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155240m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155241n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155242o);
        stringBuffer.append(",");
        stringBuffer.append(this.f155243p);
        stringBuffer.append(",");
        stringBuffer.append(this.f155244q);
        stringBuffer.append(",");
        stringBuffer.append(this.f155245r);
        stringBuffer.append(",");
        stringBuffer.append(this.f155246s);
        stringBuffer.append(",");
        stringBuffer.append(this.f155247t);
        stringBuffer.append(",");
        stringBuffer.append(this.f155248u);
        stringBuffer.append(",");
        stringBuffer.append(this.f155249v);
        stringBuffer.append(",");
        stringBuffer.append(this.f155250w);
        stringBuffer.append(",");
        stringBuffer.append(this.f155251x);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155231d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155232e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionValue");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155233f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionCurrentVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155234g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155235h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155236i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mediaType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155237j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155238k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("videoDurationTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155239l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155240m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickFeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155241n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickFeedContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155242o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155243p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155244q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155245r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterSourceInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155246s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LongVideoId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155247t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedDisplayType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155248u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("jump_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155249v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("client_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155250w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_invalid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155251x);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderFeedDataStruct mo76252s(String str) {
        this.f155238k = mo86045b("sessionBuffer", str, true);
        return this;
    }
}
