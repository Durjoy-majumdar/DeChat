package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderGotTabTipsInputArgsStruct */
public final class FinderGotTabTipsInputArgsStruct extends C61103a {

    /* renamed from: A */
    public String f48426A = "";

    /* renamed from: B */
    public long f48427B = 0;

    /* renamed from: C */
    public long f48428C = 0;

    /* renamed from: D */
    public long f48429D = 0;

    /* renamed from: E */
    public long f48430E = 0;

    /* renamed from: F */
    public long f48431F = 0;

    /* renamed from: G */
    public long f48432G = 0;

    /* renamed from: H */
    public long f48433H = 0;

    /* renamed from: I */
    public long f48434I = 0;

    /* renamed from: J */
    public String f48435J = "";

    /* renamed from: K */
    public boolean f48436K;

    /* renamed from: L */
    public String f48437L = "";

    /* renamed from: M */
    public long f48438M;

    /* renamed from: N */
    public String f48439N = "";

    /* renamed from: O */
    public long f48440O;

    /* renamed from: P */
    public long f48441P;

    /* renamed from: Q */
    public long f48442Q;

    /* renamed from: R */
    public long f48443R = 0;

    /* renamed from: S */
    public long f48444S = 0;

    /* renamed from: d */
    public long f48445d = 0;

    /* renamed from: e */
    public long f48446e = 0;

    /* renamed from: f */
    public String f48447f = "";

    /* renamed from: g */
    public long f48448g = 0;

    /* renamed from: h */
    public long f48449h = 0;

    /* renamed from: i */
    public String f48450i = "";

    /* renamed from: j */
    public long f48451j = 0;

    /* renamed from: k */
    public String f48452k = "";

    /* renamed from: l */
    public long f48453l = 0;

    /* renamed from: m */
    public long f48454m = 0;

    /* renamed from: n */
    public long f48455n = 0;

    /* renamed from: o */
    public String f48456o = "";

    /* renamed from: p */
    public long f48457p = 0;

    /* renamed from: q */
    public long f48458q = 0;

    /* renamed from: r */
    public String f48459r = "";

    /* renamed from: s */
    public long f48460s = 0;

    /* renamed from: t */
    public long f48461t = 0;

    /* renamed from: u */
    public long f48462u = 0;

    /* renamed from: v */
    public long f48463v = 0;

    /* renamed from: w */
    public long f48464w = 0;

    /* renamed from: x */
    public long f48465x = 0;

    /* renamed from: y */
    public long f48466y = 0;

    /* renamed from: z */
    public long f48467z = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48445d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48446e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48447f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48448g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48449h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48450i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48451j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48452k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48453l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48454m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48455n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48456o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48457p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48458q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48459r);
        stringBuffer.append(",");
        stringBuffer.append(this.f48460s);
        stringBuffer.append(",");
        stringBuffer.append(this.f48461t);
        stringBuffer.append(",");
        stringBuffer.append(this.f48462u);
        stringBuffer.append(",");
        stringBuffer.append(this.f48463v);
        stringBuffer.append(",");
        stringBuffer.append(this.f48464w);
        stringBuffer.append(",");
        stringBuffer.append(this.f48465x);
        stringBuffer.append(",");
        stringBuffer.append(this.f48466y);
        stringBuffer.append(",");
        stringBuffer.append(this.f48467z);
        stringBuffer.append(",");
        stringBuffer.append(this.f48426A);
        stringBuffer.append(",");
        stringBuffer.append(this.f48427B);
        stringBuffer.append(",");
        stringBuffer.append(this.f48428C);
        stringBuffer.append(",");
        stringBuffer.append(this.f48429D);
        stringBuffer.append(",");
        stringBuffer.append(this.f48430E);
        stringBuffer.append(",");
        stringBuffer.append(this.f48431F);
        stringBuffer.append(",");
        stringBuffer.append(this.f48432G);
        stringBuffer.append(",");
        stringBuffer.append(this.f48433H);
        stringBuffer.append(",");
        stringBuffer.append(this.f48434I);
        stringBuffer.append(",");
        stringBuffer.append(this.f48435J);
        stringBuffer.append(",");
        stringBuffer.append(this.f48436K ? 1 : 0);
        stringBuffer.append(",");
        stringBuffer.append(this.f48437L);
        stringBuffer.append(",");
        stringBuffer.append(this.f48438M);
        stringBuffer.append(",");
        stringBuffer.append(this.f48439N);
        stringBuffer.append(",");
        stringBuffer.append(this.f48440O);
        stringBuffer.append(",");
        stringBuffer.append(this.f48441P);
        stringBuffer.append(",");
        stringBuffer.append(this.f48442Q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48443R);
        stringBuffer.append(",");
        stringBuffer.append(this.f48444S);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("gotSyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48445d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("nowMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48446e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotFinderTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48447f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotFinderCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48448g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotFinderPushType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48449h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotFinderPushScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48450i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotFinderIgnoreFreq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48451j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotLiveTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48452k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotLiveCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48453l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotLiveSubRecallType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48454m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("gotLiveIgnoreFreq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48455n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48456o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48457p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderPushType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48458q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderPushScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48459r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderIgnoreFreq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48460s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderReceTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48461t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderExposeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48462u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currFinderExposeFirstSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48463v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastEnterFinderMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48464w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastExitFinderMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48465x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderDropRedDotCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48466y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderDeepReadCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48467z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48426A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48427B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveSubRecallType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48428C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveIgnoreFreq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48429D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveReceTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48430E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveExposeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48431F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currLiveExposeFirstSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48432G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastEnterLiveMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48433H);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastExitLiverMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48434I);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(DownloadInfo.NETTYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48435J);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("newMsgOpenWechatBool");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48436K);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("findFriendsEntryRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48437L);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("discoverTabRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48438M);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48439N);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currSessionEnterMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48440O);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isHeadset");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48441P);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("currBattery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48442Q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("calendarDiscoverFirstExposeTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48443R);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("calendarDiscoverExposeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48444S);
        return stringBuffer.toString();
    }
}
