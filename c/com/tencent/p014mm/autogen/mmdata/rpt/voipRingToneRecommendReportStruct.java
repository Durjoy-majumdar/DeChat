package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.voipRingToneRecommendReportStruct */
public final class voipRingToneRecommendReportStruct extends C61103a {

    /* renamed from: d */
    public String f156983d = "";

    /* renamed from: e */
    public long f156984e;

    /* renamed from: f */
    public long f156985f;

    /* renamed from: g */
    public long f156986g;

    /* renamed from: h */
    public long f156987h;

    /* renamed from: i */
    public String f156988i = "";

    /* renamed from: j */
    public long f156989j;

    /* renamed from: k */
    public long f156990k;

    /* renamed from: l */
    public long f156991l;

    /* renamed from: m */
    public String f156992m = "";

    /* renamed from: n */
    public String f156993n = "";

    /* renamed from: o */
    public long f156994o;

    /* renamed from: p */
    public long f156995p;

    /* renamed from: q */
    public long f156996q;

    /* renamed from: r */
    public String f156997r = "";

    /* renamed from: s */
    public String f156998s = "";

    /* renamed from: t */
    public String f156999t = "";

    /* renamed from: u */
    public long f157000u;

    /* renamed from: j */
    public int mo1004j() {
        return 23604;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f156983d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156984e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156985f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156986g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156987h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156988i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156989j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156990k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156991l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156992m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156993n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156994o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156995p);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f156996q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156997r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156998s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156999t);
        stringBuffer.append(",");
        stringBuffer.append(this.f157000u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156983d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156984e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Exposure_pos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156985f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eventCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156986g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156987h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchKeyword");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156988i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("previewTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156989j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chooseTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156990k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_individual");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156991l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("toUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156992m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_ID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156993n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("setType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156994o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("channel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156995p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_vibrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_REASON);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156996q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("recall_cmdid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156997r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("search_request_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156998s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rec_request_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156999t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_video_stream");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f157000u);
        return stringBuffer.toString();
    }
}
