package com.tencent.p014mm.plugin.sns.statistics;

import a22.C67001a;
import android.os.Vibrator;
import android.view.View;
import b22.C28250a;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.events.SnsBehaviorNotifyFinderEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShareMomentReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SecondCutShareSnsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SecondCutSmallTailStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCommentEmojiExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverPostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFeedOwnerDeleteCommentReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsLikeCollapseStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsUserBehaviourInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnExposureStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.TimelineTrashReEditStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCMomentsModifyShareScopeExposureReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WechatWorkSnsStruct;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85798u1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import hi2.C46072b;
import ht1.C60200t1;
import ia1.C98619b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ms2.C61579p;
import mt2.C47101a;
import o91.C100313f;
import op3.C117882j;
import os2.C35293n0;
import p185kq.C10383h;
import p700tq.C64995b;
import p740wo.C53193b;
import qr2.C36069a;
import te3.k94;
import vr2.C102236a0;
import z91.C23462b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.statistics.SnsReportHelper */
public class SnsReportHelper {

    /* renamed from: l0 */
    public static final Integer f275505l0 = new Integer(1);

    /* renamed from: m0 */
    public static SnsReportHelper f275506m0 = new SnsReportHelper();

    /* renamed from: A */
    public long f275507A = 0;

    /* renamed from: B */
    public long f275508B = 0;

    /* renamed from: C */
    public long f275509C = 0;

    /* renamed from: D */
    public long f275510D = 0;

    /* renamed from: E */
    public long f275511E = 0;

    /* renamed from: F */
    public long f275512F = 0;

    /* renamed from: G */
    public LinkedList<SnsAlbumFeedBehaviourStruct> f275513G = new LinkedList<>();

    /* renamed from: H */
    public List<String> f275514H = new ArrayList();

    /* renamed from: I */
    public List<String> f275515I = new ArrayList();

    /* renamed from: J */
    public long f275516J = 0;

    /* renamed from: K */
    public long f275517K = 0;

    /* renamed from: L */
    public long f275518L = 0;

    /* renamed from: M */
    public long f275519M = 0;

    /* renamed from: N */
    public TimelineMissReadJumpBtnExposureStruct f275520N = new TimelineMissReadJumpBtnExposureStruct();

    /* renamed from: O */
    public TimelineTrashReEditStruct f275521O = new TimelineTrashReEditStruct();

    /* renamed from: P */
    public TimelineTrashReEditStruct f275522P = new TimelineTrashReEditStruct();

    /* renamed from: Q */
    public String f275523Q = "";

    /* renamed from: R */
    public int f275524R = 0;

    /* renamed from: S */
    public long f275525S = 0;

    /* renamed from: T */
    public int f275526T = 0;

    /* renamed from: U */
    public FinderShareMomentReportStruct f275527U = new FinderShareMomentReportStruct();

    /* renamed from: V */
    public int f275528V = 0;

    /* renamed from: W */
    public SecondCutShareSnsStruct f275529W = new SecondCutShareSnsStruct();

    /* renamed from: X */
    public SnsCoverPostStruct f275530X = new SnsCoverPostStruct();

    /* renamed from: Y */
    public int f275531Y = 0;

    /* renamed from: Z */
    public SnsCoverActionStruct f275532Z = new SnsCoverActionStruct();

    /* renamed from: a */
    public C85798u1 f275533a;

    /* renamed from: a0 */
    public Map<Long, SnsTimelineWeiShangeFoldExposeStruct> f275534a0 = new ConcurrentHashMap();

    /* renamed from: b */
    public HashMap<String, Integer> f275535b;

    /* renamed from: b0 */
    public SnsTimelineWeiShangeFoldBrowseStruct f275536b0 = new SnsTimelineWeiShangeFoldBrowseStruct();

    /* renamed from: c */
    public HashMap<String, String> f275537c;

    /* renamed from: c0 */
    public List<Long> f275538c0 = new ArrayList();

    /* renamed from: d */
    public HashSet<String> f275539d;

    /* renamed from: d0 */
    public long f275540d0 = 0;

    /* renamed from: e */
    public LinkedHashMap<Long, Object> f275541e;

    /* renamed from: e0 */
    public String f275542e0 = "";

    /* renamed from: f */
    public int f275543f = 0;

    /* renamed from: f0 */
    public String f275544f0 = "";

    /* renamed from: g */
    public SnsUserBehaviourInfoStruct.C92613a f275545g;

    /* renamed from: g0 */
    public boolean f275546g0 = false;

    /* renamed from: h */
    public String f275547h = "0";

    /* renamed from: h0 */
    public int f275548h0 = 0;

    /* renamed from: i */
    public int f275549i = -1;

    /* renamed from: i0 */
    public int f275550i0 = 0;

    /* renamed from: j */
    public int f275551j = 100;

    /* renamed from: j0 */
    public HashSet<String> f275552j0 = new HashSet<>();

    /* renamed from: k */
    public int f275553k = 14400;

    /* renamed from: k0 */
    public C98619b f275554k0 = new C94984a();

    /* renamed from: l */
    public int f275555l = 1;

    /* renamed from: m */
    public IListener<ExptChangeEvent> f275556m = new IListener<ExptChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -31521245;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
            ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
            SnsReportHelper snsReportHelper = SnsReportHelper.this;
            Integer num = SnsReportHelper.f275505l0;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            snsReportHelper.mo131360U();
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$2");
            return false;
        }
    };

    /* renamed from: n */
    public TimelineGroupUserBehaviorStruct f275557n = new TimelineGroupUserBehaviorStruct();

    /* renamed from: o */
    public Map<String, Integer> f275558o = new HashMap();

    /* renamed from: p */
    public Map<Integer, Set<String>> f275559p = new HashMap();

    /* renamed from: q */
    public Map<String, C94987c> f275560q = new HashMap();

    /* renamed from: r */
    public Map<String, C94986b> f275561r = new HashMap();

    /* renamed from: s */
    public SnsUserBehaviourInfoStruct f275562s = new SnsUserBehaviourInfoStruct();

    /* renamed from: t */
    public List<String> f275563t = new ArrayList();

    /* renamed from: u */
    public List<String> f275564u = new ArrayList();

    /* renamed from: v */
    public List<String> f275565v = new ArrayList();

    /* renamed from: w */
    public List<String> f275566w = new ArrayList();

    /* renamed from: x */
    public List<String> f275567x = new ArrayList();

    /* renamed from: y */
    public List<String> f275568y = new ArrayList();

    /* renamed from: z */
    public List<String> f275569z = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.sns.statistics.SnsReportHelper$a */
    public class C94984a implements C98619b {

        /* renamed from: com.tencent.mm.plugin.sns.statistics.SnsReportHelper$a$a */
        public class C94985a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C100313f f275572d;

            public C94985a(C100313f fVar) {
                this.f275572d = fVar;
            }

            public void run() {
                int size;
                int i;
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3$1");
                SnsReportHelper snsReportHelper = SnsReportHelper.this;
                String str = this.f275572d.f293867a.f298179d;
                Integer num = SnsReportHelper.f275505l0;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                snsReportHelper.getClass();
                SnsMethodCalculate.markStartTimeMs("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                snsReportHelper.f275544f0 = str;
                synchronized (snsReportHelper.f275552j0) {
                    try {
                        snsReportHelper.f275552j0.add(str);
                        size = snsReportHelper.f275552j0.size();
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            throw th;
                        }
                    }
                }
                SnsMethodCalculate.markStartTimeMs("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                if (snsReportHelper.f275546g0) {
                    SnsMethodCalculate.markEndTimeMs("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                } else {
                    Log.m105927v("MicroMsg.SnsReportHelper", "check expose feedid cur[%s] lastExitFeedId[%s]", str, snsReportHelper.f275542e0);
                    if (!Util.isNullOrNil(snsReportHelper.f275542e0) && Util.isEqual(snsReportHelper.f275542e0, str)) {
                        snsReportHelper.mo131349J(3);
                        snsReportHelper.f275546g0 = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
                SnsMethodCalculate.markStartTimeMs("checkIsPushExposeSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                Log.m105927v("MicroMsg.SnsReportHelper", "checkIsPushExposeSnsFeedEvent currExposeFeedCount[%d] finderControllerNFeed[%d] hadPushEventFeedCount[%d]", Integer.valueOf(size), Integer.valueOf(snsReportHelper.f275548h0), Integer.valueOf(snsReportHelper.f275550i0));
                int i2 = snsReportHelper.f275548h0;
                if (i2 > 0 && (i = size / i2) > snsReportHelper.f275550i0) {
                    snsReportHelper.f275550i0 = i;
                    snsReportHelper.mo131349J(4);
                }
                SnsMethodCalculate.markEndTimeMs("checkIsPushExposeSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                SnsMethodCalculate.markEndTimeMs("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3$1");
            }
        }

        public C94984a() {
        }

        /* renamed from: a */
        public void mo74774a(Object obj, C100313f fVar, View view) {
            SnsMethodCalculate.markStartTimeMs("onDisappear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
            SnsMethodCalculate.markEndTimeMs("onDisappear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
        }

        /* renamed from: b */
        public void mo74775b(Object obj, C100313f fVar, View view) {
            SnsMethodCalculate.markStartTimeMs("onAppear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
            ((C119157j) C119157j.f356862d).mo183885p(new C94985a(fVar), "sns_feed_expose_tag");
            SnsMethodCalculate.markEndTimeMs("onAppear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b */
    public class C94986b {

        /* renamed from: a */
        public int f275574a;

        /* renamed from: b */
        public SnsCommentEmojiExposeStruct f275575b;

        /* renamed from: c */
        public List<String> f275576c = new ArrayList();

        /* renamed from: d */
        public List<String> f275577d = new ArrayList();

        public C94986b(SnsReportHelper snsReportHelper) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.statistics.SnsReportHelper$c */
    public class C94987c {

        /* renamed from: a */
        public int f275578a;

        /* renamed from: b */
        public SnsLikeCollapseStruct f275579b;

        public C94987c(SnsReportHelper snsReportHelper) {
        }
    }

    public SnsReportHelper() {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("initAbtestArg", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f275551j = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_feed_exposure_maxcachefeedcount, 100);
        this.f275553k = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_feed_exposure_maxcacheseconds, 14400);
        this.f275555l = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_feed_exposure_needuploaddata, 1);
        Log.m105925i("MicroMsg.SnsReportHelper", "initAbtestArg maxCacheFeedCount:%d, maxCacheSeconds:%d, needUploadData:%d", Integer.valueOf(this.f275551j), Integer.valueOf(this.f275553k), Integer.valueOf(this.f275555l));
        SnsMethodCalculate.markEndTimeMs("initAbtestArg", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        mo131360U();
        try {
            this.f275533a = new C85798u1(C72994y1.f212832a + "snsreport.cfg");
        } catch (OutOfMemoryError e) {
            Log.printErrStackTrace("MicroMsg.SnsReportHelper", e, "", new Object[0]);
            C86013q1.m106447h(C72994y1.f212832a + "snsreport.cfg");
            this.f275533a = new C85798u1(C72994y1.f212832a + "snsreport.cfg");
        }
        Object b = this.f275533a.mo119661b(3, new HashMap());
        Object b2 = this.f275533a.mo119661b(4, new HashMap());
        Object b3 = this.f275533a.mo119661b(5, new HashSet());
        Object b4 = this.f275533a.mo119661b(6, new LinkedHashMap());
        if (!(b instanceof HashMap) || !(b2 instanceof HashMap) || !(b3 instanceof HashSet) || !(b4 instanceof LinkedHashMap)) {
            C86013q1.m106447h(C72994y1.f212832a + "snsreport.cfg");
            C85798u1 u1Var = this.f275533a;
            synchronized (u1Var) {
                Log.m105924i("MicroMsg.ConfigFileStorage", "ConfigFileStorage reset ");
                File file = new File(u1Var.f249880a);
                if (file.exists()) {
                    file.delete();
                }
                u1Var.f249881b = new HashMap();
                if (u1Var.mo119668i()) {
                    MultiProcessMMKV multiProcessMMKV = u1Var.f249888i.f249874d;
                    if (multiProcessMMKV != null) {
                        multiProcessMMKV.clearAll();
                    }
                    u1Var.f249888i.mo119644i(36);
                    u1Var.f249888i.mo119646k(36, (String) null);
                }
            }
            this.f275535b = new HashMap<>();
            this.f275537c = new HashMap<>();
            this.f275539d = new HashSet<>();
            this.f275541e = new LinkedHashMap<>();
        } else {
            this.f275535b = (HashMap) b;
            this.f275537c = (HashMap) b2;
            this.f275539d = (HashSet) b3;
            this.f275541e = (LinkedHashMap) b4;
        }
        Log.m105919d("MicroMsg.SnsReportHelper", "obj[%d] objForAppId[%d] objForFold[%d] objForAppIdCgi[%d] ", Integer.valueOf(this.f275535b.size()), Integer.valueOf(this.f275537c.size()), Integer.valueOf(this.f275539d.size()), Integer.valueOf(this.f275541e.size()));
        this.f275556m.alive();
    }

    /* renamed from: A */
    public SecondCutShareSnsStruct mo131340A() {
        SnsMethodCalculate.markStartTimeMs("getSecondCutShareSnsStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SecondCutShareSnsStruct secondCutShareSnsStruct = this.f275529W;
        SnsMethodCalculate.markEndTimeMs("getSecondCutShareSnsStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return secondCutShareSnsStruct;
    }

    /* renamed from: B */
    public SnsUserBehaviourInfoStruct mo131341B() {
        SnsMethodCalculate.markStartTimeMs("getSnsAlbumBehaviourInfo", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsUserBehaviourInfoStruct snsUserBehaviourInfoStruct = this.f275562s;
        SnsMethodCalculate.markEndTimeMs("getSnsAlbumBehaviourInfo", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsUserBehaviourInfoStruct;
    }

    /* renamed from: C */
    public SnsCoverActionStruct mo131342C() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsCoverActionStruct snsCoverActionStruct = this.f275532Z;
        SnsMethodCalculate.markEndTimeMs("getSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsCoverActionStruct;
    }

    /* renamed from: D */
    public SnsCoverPostStruct mo131343D() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsCoverPostStruct snsCoverPostStruct = this.f275530X;
        SnsMethodCalculate.markEndTimeMs("getSnsCoverPostStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsCoverPostStruct;
    }

    /* renamed from: E */
    public TimelineGroupUserBehaviorStruct mo131344E() {
        SnsMethodCalculate.markStartTimeMs("getTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        boolean z = false;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC, 0);
        if (j == 0) {
            z = C47101a.f126572a;
            SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        } else if (j != 2) {
            if (C47101a.f126572a) {
                Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                C47101a.f126572a = false;
            }
            SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        } else {
            z = true;
            if (!C47101a.f126572a) {
                Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                C47101a.f126572a = true;
            }
            SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        }
        TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f275557n;
        timelineGroupUserBehaviorStruct.f266362B = z ? 1 : 0;
        SnsMethodCalculate.markEndTimeMs("getTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return timelineGroupUserBehaviorStruct;
    }

    /* renamed from: F */
    public TimelineMissReadJumpBtnExposureStruct mo131345F() {
        SnsMethodCalculate.markStartTimeMs("getTimelineMissReadExposureStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineMissReadJumpBtnExposureStruct timelineMissReadJumpBtnExposureStruct = this.f275520N;
        SnsMethodCalculate.markEndTimeMs("getTimelineMissReadExposureStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return timelineMissReadJumpBtnExposureStruct;
    }

    /* renamed from: G */
    public TimelineTrashReEditStruct mo131346G() {
        SnsMethodCalculate.markStartTimeMs("getTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineTrashReEditStruct timelineTrashReEditStruct = this.f275521O;
        SnsMethodCalculate.markEndTimeMs("getTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return timelineTrashReEditStruct;
    }

    /* renamed from: H */
    public void mo131347H(String str) {
        SnsMethodCalculate.markStartTimeMs("increaseChatroomMemberClickSet", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        Integer num = (Integer) ((HashMap) this.f275558o).get(str);
        if (num == null) {
            ((HashMap) this.f275558o).put(str, 1);
        } else {
            ((HashMap) this.f275558o).put(str, Integer.valueOf(num.intValue() + 1));
        }
        SnsMethodCalculate.markEndTimeMs("increaseChatroomMemberClickSet", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: I */
    public final <T> String mo131348I(List<T> list, String str) {
        SnsMethodCalculate.markStartTimeMs("listToString", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        StringBuilder sb = new StringBuilder();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                T t = list.get(i);
                if (t != null) {
                    sb.append(t.toString());
                    sb.append(str);
                }
            }
        }
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("listToString", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return sb4;
    }

    /* renamed from: J */
    public final void mo131349J(int i) {
        SnsMethodCalculate.markStartTimeMs("pureSnsUserBehaviorEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        Log.m105925i("MicroMsg.SnsReportHelper", "pureSnsUserBehaviorEvent action [%d]", Integer.valueOf(i));
        SnsBehaviorNotifyFinderEvent snsBehaviorNotifyFinderEvent = new SnsBehaviorNotifyFinderEvent();
        snsBehaviorNotifyFinderEvent.f78984d.f78985a = i;
        snsBehaviorNotifyFinderEvent.publish();
        SnsMethodCalculate.markEndTimeMs("pureSnsUserBehaviorEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: K */
    public SnsAlbumFeedBehaviourStruct mo131350K() {
        SnsMethodCalculate.markStartTimeMs("pushNewAlbumFeedStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        mo131359T();
        SnsAlbumFeedBehaviourStruct snsAlbumFeedBehaviourStruct = new SnsAlbumFeedBehaviourStruct();
        this.f275513G.push(snsAlbumFeedBehaviourStruct);
        SnsMethodCalculate.markEndTimeMs("pushNewAlbumFeedStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return snsAlbumFeedBehaviourStruct;
    }

    /* renamed from: L */
    public void mo131351L(int i, boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("report26579ModifyShareScopeExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        WCMomentsModifyShareScopeExposureReportStruct wCMomentsModifyShareScopeExposureReportStruct = new WCMomentsModifyShareScopeExposureReportStruct();
        wCMomentsModifyShareScopeExposureReportStruct.f156898d = (long) i;
        wCMomentsModifyShareScopeExposureReportStruct.f156900f = wCMomentsModifyShareScopeExposureReportStruct.mo86045b("feedid", str, true);
        wCMomentsModifyShareScopeExposureReportStruct.f156899e = z ? 1 : 0;
        wCMomentsModifyShareScopeExposureReportStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("report26579ModifyShareScopeExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: M */
    public void mo131352M() {
        SnsMethodCalculate.markStartTimeMs("reportClickReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineTrashReEditStruct timelineTrashReEditStruct = this.f275522P;
        timelineTrashReEditStruct.f266432d = 2;
        timelineTrashReEditStruct.mo86054n();
        this.f275522P = new TimelineTrashReEditStruct();
        SnsMethodCalculate.markEndTimeMs("reportClickReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: N */
    public void mo131353N(SnsInfo snsInfo, int i, String str, int i2) {
        int i3;
        SnsMethodCalculate.markStartTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            int i4 = Util.isEqual(snsInfo.getUserName(), C75592q0.m90789s()) ? Util.isEqual(str, C75592q0.m90789s()) ? 2 : 3 : 1;
            SnsObject e = C94897n1.m120367e(snsInfo);
            int i5 = 0;
            if (e != null) {
                int i6 = e.CommentCount;
                i5 = e.LikeCount;
                i3 = i6;
            } else {
                i3 = 0;
            }
            SnsFeedOwnerDeleteCommentReportStruct snsFeedOwnerDeleteCommentReportStruct = new SnsFeedOwnerDeleteCommentReportStruct();
            snsFeedOwnerDeleteCommentReportStruct.f266036d = snsFeedOwnerDeleteCommentReportStruct.mo86045b("PublishId", C102236a0.m134763p0(snsInfo.field_snsId), true);
            snsFeedOwnerDeleteCommentReportStruct.f266038f = snsFeedOwnerDeleteCommentReportStruct.mo86045b("CommentId", String.valueOf(i), true);
            snsFeedOwnerDeleteCommentReportStruct.f266039g = i4;
            snsFeedOwnerDeleteCommentReportStruct.f266037e = snsFeedOwnerDeleteCommentReportStruct.mo86045b("FriendUsername", str, true);
            snsFeedOwnerDeleteCommentReportStruct.f266042j = i2;
            snsFeedOwnerDeleteCommentReportStruct.f266040h = (long) i5;
            snsFeedOwnerDeleteCommentReportStruct.f266041i = (long) i3;
            snsFeedOwnerDeleteCommentReportStruct.mo86054n();
        }
        SnsMethodCalculate.markEndTimeMs("reportCommentDelete", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: O */
    public void mo131354O(int i, String str, int i2, int i3, long j, int i4) {
        SnsMethodCalculate.markStartTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        mo131355P(i, str, i2, i3, j, 0, 0, i4);
        SnsMethodCalculate.markEndTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: P */
    public void mo131355P(int i, String str, int i2, int i3, long j, long j2, long j3, int i4) {
        int i5;
        int i6;
        String str2;
        SnsMethodCalculate.markStartTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (i4 == 2) {
            i5 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC, 0)).intValue();
            str2 = "";
            i6 = 0;
        } else {
            str2 = str;
            i6 = i3;
            i5 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SNS_FINDER_EXPOSE_COUNT_INT_SYNC, 0)).intValue();
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76851gm(f275506m0.f275523Q, i, str2, i2, i6, i5, j2, j3, j, i4);
        SnsMethodCalculate.markEndTimeMs("reportSnsFinderEntrance", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: Q */
    public void mo131356Q() {
        SnsMethodCalculate.markStartTimeMs("reportTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f275557n;
        if (!(timelineGroupUserBehaviorStruct == null || timelineGroupUserBehaviorStruct.f266385n == -1)) {
            Vibrator vibrator = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("getMediaEditPublishIds", "com.tencent.mm.plugin.sns.data.SnsUtil");
            String str = C102236a0.f301040d;
            C102236a0.f301040d = "";
            SnsMethodCalculate.markEndTimeMs("getMediaEditPublishIds", "com.tencent.mm.plugin.sns.data.SnsUtil");
            timelineGroupUserBehaviorStruct.f266361A = timelineGroupUserBehaviorStruct.mo86045b("MediaEditedPublishIds", str, true);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            for (Map.Entry entry : ((HashMap) this.f275558o).entrySet()) {
                sb.append((String) entry.getKey());
                sb.append("|");
                sb4.append(entry.getValue());
                sb4.append("|");
            }
            int lastIndexOf = sb.lastIndexOf("|");
            int lastIndexOf2 = sb4.lastIndexOf("|");
            if (lastIndexOf != -1) {
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = this.f275557n;
                timelineGroupUserBehaviorStruct2.f266387p = timelineGroupUserBehaviorStruct2.mo86045b("ChatroomMemClickList", sb.substring(0, lastIndexOf), true);
            }
            if (lastIndexOf2 != -1) {
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct3 = this.f275557n;
                timelineGroupUserBehaviorStruct3.f266397z = timelineGroupUserBehaviorStruct3.mo86045b("ChatroomMemClickNumList", sb4.substring(0, lastIndexOf2), true);
            }
            this.f275557n.mo86054n();
            this.f275557n = new TimelineGroupUserBehaviorStruct();
            ((HashMap) this.f275558o).clear();
            ((HashMap) this.f275559p).clear();
        }
        SnsMethodCalculate.markEndTimeMs("reportTimelineGroupUserBehavior", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: R */
    public void mo131357R(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportWechatWorkBlackPermiss", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        WechatWorkSnsStruct wechatWorkSnsStruct = new WechatWorkSnsStruct();
        wechatWorkSnsStruct.f266564f = wechatWorkSnsStruct.mo86045b("OpenimUsername", str, true);
        wechatWorkSnsStruct.f266562d = (long) i;
        wechatWorkSnsStruct.f266563e = (long) i2;
        wechatWorkSnsStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("reportWechatWorkBlackPermiss", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: S */
    public void mo131358S() {
        SnsMethodCalculate.markStartTimeMs("resetAlbumBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        ((ArrayList) this.f275563t).clear();
        ((ArrayList) this.f275564u).clear();
        ((ArrayList) this.f275565v).clear();
        ((ArrayList) this.f275566w).clear();
        ((ArrayList) this.f275567x).clear();
        ((ArrayList) this.f275568y).clear();
        ((ArrayList) this.f275569z).clear();
        this.f275507A = 0;
        this.f275508B = 0;
        this.f275509C = 0;
        this.f275510D = 0;
        this.f275511E = 0;
        this.f275512F = 0;
        SnsMethodCalculate.markEndTimeMs("resetAlbumBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: T */
    public void mo131359T() {
        SnsMethodCalculate.markStartTimeMs("resetFeedBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        ((ArrayList) this.f275514H).clear();
        ((ArrayList) this.f275515I).clear();
        this.f275516J = 0;
        this.f275518L = 0;
        this.f275517K = 0;
        this.f275519M = 0;
        SnsMethodCalculate.markEndTimeMs("resetFeedBehaviourRpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: U */
    public final void mo131360U() {
        SnsMethodCalculate.markStartTimeMs("resetXExptControl", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f275543f = 100;
        Log.m105925i("MicroMsg.SnsReportHelper", "resetXExptControl maxFeedIdForCgiRecord[%d]", 100);
        SnsMethodCalculate.markEndTimeMs("resetXExptControl", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: V */
    public SnsAlbumFeedBehaviourStruct mo131361V() {
        SnsMethodCalculate.markStartTimeMs("safeGetLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsAlbumFeedBehaviourStruct peekLast = this.f275513G.peekLast();
        if (peekLast == null) {
            peekLast = new SnsAlbumFeedBehaviourStruct();
        }
        SnsMethodCalculate.markEndTimeMs("safeGetLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return peekLast;
    }

    /* renamed from: W */
    public void mo131362W(View view, C96275w6 w6Var, String str, String str2, int i, int i2, boolean z, int i3, int i4) {
        SnsInfo snsInfo;
        C96275w6 w6Var2 = w6Var;
        SnsMethodCalculate.markStartTimeMs("setupSnsLikeRptStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(view == null || w6Var2 == null || w6Var2.f281382i == null || (snsInfo = w6Var2.f281367a) == null || snsInfo.getTimeLine() == null || w6Var2.f281367a.getTimeLine().ContentObj == null)) {
            if (((HashMap) this.f275560q).get(C102236a0.m134765q0(w6Var2.f281367a.field_snsId)) == null) {
                String s = C75592q0.m90789s();
                SnsLikeCollapseStruct snsLikeCollapseStruct = new SnsLikeCollapseStruct();
                snsLikeCollapseStruct.f266051d = snsLikeCollapseStruct.mo86045b("Username", w6Var2.f281367a.getUserName(), true);
                snsLikeCollapseStruct.f266052e = snsLikeCollapseStruct.mo86045b("PublicID", C102236a0.m134765q0(w6Var2.f281367a.field_snsId), true);
                snsLikeCollapseStruct.f266053f = (long) w6Var2.f281367a.getTimeLine().ContentObj.f298424e;
                String str3 = str;
                String[] split = str.split(",");
                int i5 = 0;
                snsLikeCollapseStruct.f266054g = (long) (split != null ? split.length : 0);
                String[] split2 = str2.split(",");
                snsLikeCollapseStruct.f266055h = (long) (split2 != null ? split2.length : 0);
                snsLikeCollapseStruct.f266056i = (long) i;
                snsLikeCollapseStruct.f266057j = (long) i2;
                if (z) {
                    snsLikeCollapseStruct.f266058k = 1;
                } else {
                    snsLikeCollapseStruct.f266058k = 2;
                }
                int i6 = 4;
                if (w6Var2.f281363W != null) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= w6Var2.f281363W.mo138165b()) {
                            break;
                        } else if (Util.isEqual(s, (String) w6Var2.f281363W.mo138164a(i7).mo182596a(0))) {
                            i6 = 1;
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                if (w6Var2.f281364X != null) {
                    while (true) {
                        if (i5 >= w6Var2.f281364X.mo138165b()) {
                            break;
                        }
                        C117882j a = w6Var2.f281364X.mo138164a(i5);
                        if (!(a.mo182596a(1) instanceof String) || !Util.isEqual(s, (String) a.mo182596a(1))) {
                            i5++;
                        } else {
                            i6 = i6 == 1 ? 3 : 2;
                        }
                    }
                    snsLikeCollapseStruct.f266059l = (long) w6Var2.f281364X.mo138165b();
                }
                snsLikeCollapseStruct.f266062o = (long) i6;
                snsLikeCollapseStruct.f266070w = (long) i4;
                snsLikeCollapseStruct.f266064q = System.currentTimeMillis();
                C94987c cVar = new C94987c(this);
                cVar.f275578a = i3;
                cVar.f275579b = snsLikeCollapseStruct;
                ((HashMap) this.f275560q).put(C102236a0.m134765q0(w6Var2.f281367a.field_snsId), cVar);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setupSnsLikeRptStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: X */
    public void mo131363X(List<C61579p> list) {
        SnsMethodCalculate.markStartTimeMs("updateLastVisibleReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(list == null || list.isEmpty() || this.f275557n == null)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C61579p next : list) {
                int i = next.f175151e;
                if (i == 0) {
                    arrayList2.add(next.f175150d);
                } else if (i == 1) {
                    arrayList3.add(next.f175150d);
                } else if (i == 2) {
                    arrayList.add(next.f175150d);
                }
            }
            if (arrayList3.size() > 0) {
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String f = ((C67001a) C28250a.m38138a()).mo90968f(str);
                    if (Util.isNullOrNil(f)) {
                        f = str;
                    }
                    List k = ((C67001a) C28250a.m38138a()).mo90973k(f);
                    if (k == null || k.size() == 0) {
                        Log.m105921e("MicroMsg.SnsReportHelper", "[updateLastVisibleReport] label empty, id:%s, name:%s", f, str);
                    } else {
                        sb.append(str);
                        sb.append("|");
                        sb.append(k.size());
                        sb.append(";");
                    }
                }
                this.f275557n.f266383l = arrayList3.size();
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f275557n;
                timelineGroupUserBehaviorStruct.f266384m = timelineGroupUserBehaviorStruct.mo86045b("LatestTimelinePsotSettingLabelList", sb.toString(), true);
            }
            if (arrayList.size() > 0) {
                StringBuilder sb4 = new StringBuilder();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String str2 = (String) it4.next();
                    ArrayList arrayList4 = new ArrayList();
                    List<String> mX = ((C53193b) C86312j.m106911c(C53193b.class)).mo73728mX(str2);
                    if (mX != null) {
                        for (String next2 : mX) {
                            if (C45628s0.m50740E(next2)) {
                                arrayList4.add(next2);
                            }
                        }
                        sb4.append(str2);
                        sb4.append("|");
                        sb4.append(arrayList4.size());
                        sb4.append(";");
                    }
                }
                this.f275557n.f266379h = arrayList.size();
                TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = this.f275557n;
                timelineGroupUserBehaviorStruct2.f266380i = timelineGroupUserBehaviorStruct2.mo86045b("LatestTimelinePsotSettingGroupList", sb4.toString(), true);
            }
            this.f275557n.f266381j = arrayList2.size();
            TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct3 = this.f275557n;
            timelineGroupUserBehaviorStruct3.f266382k = timelineGroupUserBehaviorStruct3.mo86045b("LatestTimelinePsotSettingUinList", Util.listToString(arrayList2, "|"), true);
        }
        SnsMethodCalculate.markEndTimeMs("updateLastVisibleReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: Y */
    public void mo131364Y(List<String> list) {
        TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct;
        SnsMethodCalculate.markStartTimeMs("updateSelectedContactReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(list == null || list.isEmpty() || (timelineGroupUserBehaviorStruct = this.f275557n) == null)) {
            timelineGroupUserBehaviorStruct.f266391t = list.size();
            TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = this.f275557n;
            timelineGroupUserBehaviorStruct2.f266392u = timelineGroupUserBehaviorStruct2.mo86045b("SelectedUINList", Util.listToString(list, "|"), true);
        }
        SnsMethodCalculate.markEndTimeMs("updateSelectedContactReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: Z */
    public void mo131365Z(int i) {
        SnsMethodCalculate.markStartTimeMs("updateTimelinePostPrivaceSetting", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = this.f275557n;
        if (timelineGroupUserBehaviorStruct != null) {
            if (i == 0) {
                timelineGroupUserBehaviorStruct.f266385n = 1;
            } else if (i == 1) {
                timelineGroupUserBehaviorStruct.f266385n = 2;
            } else if (i == 2) {
                timelineGroupUserBehaviorStruct.f266385n = 3;
            } else if (i == 3) {
                timelineGroupUserBehaviorStruct.f266385n = 4;
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateTimelinePostPrivaceSetting", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: a */
    public void mo131366a(C35293n0 n0Var, k94 k94, String str) {
        SnsMethodCalculate.markStartTimeMs("addWsFoldExposeStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(n0Var == null || k94 == null)) {
            SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct = new SnsTimelineWeiShangeFoldExposeStruct();
            snsTimelineWeiShangeFoldExposeStruct.f266178d = snsTimelineWeiShangeFoldExposeStruct.mo86045b("SessionId", ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36920d(), true);
            snsTimelineWeiShangeFoldExposeStruct.f266179e = snsTimelineWeiShangeFoldExposeStruct.mo86045b("FoldedBlockId", C102236a0.m134763p0(n0Var.field_groupId), true);
            snsTimelineWeiShangeFoldExposeStruct.f266182h = 2;
            snsTimelineWeiShangeFoldExposeStruct.f266183i = 2;
            snsTimelineWeiShangeFoldExposeStruct.f266180f = snsTimelineWeiShangeFoldExposeStruct.mo86045b("UserName", str, true);
            LinkedList<Long> linkedList = k94.f183902d;
            if (linkedList != null) {
                snsTimelineWeiShangeFoldExposeStruct.f266181g = (long) linkedList.size();
            }
            ((ConcurrentHashMap) this.f275534a0).put(Long.valueOf(n0Var.field_groupId), snsTimelineWeiShangeFoldExposeStruct);
        }
        SnsMethodCalculate.markEndTimeMs("addWsFoldExposeStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: a0 */
    public void mo131367a0(long j, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateWsFoldClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct = (SnsTimelineWeiShangeFoldExposeStruct) ((ConcurrentHashMap) this.f275534a0).get(Long.valueOf(j));
        if (snsTimelineWeiShangeFoldExposeStruct != null) {
            if (z) {
                snsTimelineWeiShangeFoldExposeStruct.f266183i = 1;
            } else {
                snsTimelineWeiShangeFoldExposeStruct.f266183i = 2;
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateWsFoldClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: b */
    public void mo131368b(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("browseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            String str = C102236a0.m134763p0(snsInfo.field_snsId) + "_" + i;
            if (!((ArrayList) this.f275569z).contains(str)) {
                ((ArrayList) this.f275569z).add(str);
            }
        }
        SnsMethodCalculate.markEndTimeMs("browseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: b0 */
    public void mo131369b0(long j, boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("updateWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsTimelineWeiShangeFoldExposeStruct snsTimelineWeiShangeFoldExposeStruct = (SnsTimelineWeiShangeFoldExposeStruct) ((ConcurrentHashMap) this.f275534a0).get(Long.valueOf(j));
        if (snsTimelineWeiShangeFoldExposeStruct != null) {
            if (z) {
                snsTimelineWeiShangeFoldExposeStruct.f266182h = 1;
                snsTimelineWeiShangeFoldExposeStruct.f266185k = (long) (i + 1);
            } else {
                snsTimelineWeiShangeFoldExposeStruct.f266182h = 2;
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateWsFoldExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: c */
    public void mo131370c(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("browseFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            String p0 = C102236a0.m134763p0(snsInfo.field_snsId);
            if (!((ArrayList) this.f275563t).contains(p0)) {
                ((ArrayList) this.f275563t).add(p0);
            }
            if (C94897n1.m120368f(snsInfo).NewWithTaListCount > 0 && !((ArrayList) this.f275564u).contains(p0)) {
                ((ArrayList) this.f275564u).add(p0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("browseFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: d */
    public void mo131371d(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("clickFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            String p0 = C102236a0.m134763p0(snsInfo.field_snsId);
            if (!((ArrayList) this.f275565v).contains(p0)) {
                ((ArrayList) this.f275565v).add(p0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("clickFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: e */
    public void mo131372e() {
        SnsMethodCalculate.markStartTimeMs("doReportFinderShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f275527U.mo86054n();
        this.f275527U = new FinderShareMomentReportStruct();
        SnsMethodCalculate.markEndTimeMs("doReportFinderShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: f */
    public void mo131373f(String str, int i, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("doReportMaasTemplate", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SecondCutSmallTailStruct secondCutSmallTailStruct = new SecondCutSmallTailStruct();
        int i2 = 1;
        secondCutSmallTailStruct.f265830d = secondCutSmallTailStruct.mo86045b("Publishid", str, true);
        secondCutSmallTailStruct.f265831e = i;
        secondCutSmallTailStruct.f265833g = 1;
        secondCutSmallTailStruct.f265834h = secondCutSmallTailStruct.mo86045b("EgID", str2, true);
        secondCutSmallTailStruct.f265835i = secondCutSmallTailStruct.mo86045b("MusicID", str3, true);
        if (!C46072b.f124220a.mo71508b(MMApplicationContext.getContext(), "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF")) {
            i2 = 2;
        }
        secondCutSmallTailStruct.f265832f = i2;
        secondCutSmallTailStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("doReportMaasTemplate", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: g */
    public void mo131374g() {
        SnsMethodCalculate.markStartTimeMs("doReportSecondCutShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f275529W.mo86054n();
        this.f275529W = new SecondCutShareSnsStruct();
        SnsMethodCalculate.markEndTimeMs("doReportSecondCutShareMoment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: h */
    public void mo131375h(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("doReportSecondCutSmallTail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SecondCutSmallTailStruct secondCutSmallTailStruct = new SecondCutSmallTailStruct();
        int i2 = 1;
        secondCutSmallTailStruct.f265830d = secondCutSmallTailStruct.mo86045b("Publishid", str, true);
        secondCutSmallTailStruct.f265831e = i;
        secondCutSmallTailStruct.f265833g = 2;
        if (!C46072b.f124220a.mo71508b(MMApplicationContext.getContext(), "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF")) {
            i2 = 2;
        }
        secondCutSmallTailStruct.f265832f = i2;
        secondCutSmallTailStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("doReportSecondCutSmallTail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: i */
    public void mo131376i(int i) {
        SnsMethodCalculate.markStartTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!C36069a.f96150a.mo60517b()) {
            SnsMethodCalculate.markEndTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        SnsCoverActionStruct snsCoverActionStruct = this.f275532Z;
        int i2 = snsCoverActionStruct.f265979e;
        if (i2 == 1 || i2 == 2) {
            snsCoverActionStruct.f265982h = snsCoverActionStruct.mo86045b("FinderFeedID", "", true);
        }
        SnsCoverActionStruct snsCoverActionStruct2 = this.f275532Z;
        snsCoverActionStruct2.f265981g = i;
        snsCoverActionStruct2.mo86054n();
        SnsMethodCalculate.markEndTimeMs("doReportSnsCoverActionStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: j */
    public void mo131377j() {
        SnsMethodCalculate.markStartTimeMs("doSnsAlbumFeedBehaviourReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsAlbumFeedBehaviourStruct V = mo131361V();
        V.f265941l = (long) ((ArrayList) this.f275514H).size();
        V.f265942m = (long) ((ArrayList) this.f275515I).size();
        V.f265943n = this.f275519M;
        V.f265944o = this.f275517K;
        Log.m105919d("MicroMsg.SnsReportHelper", "doSnsAlbumFeedBehaviourReport:\n %s", V.mo1006q());
        V.mo86054n();
        try {
            this.f275513G.removeLast();
        } catch (Exception e) {
            Log.m105929w("MicroMsg.SnsReportHelper", "doSnsAlbumFeedBehaviourReport remove err: %s", e.getMessage());
        }
        mo131359T();
        SnsMethodCalculate.markEndTimeMs("doSnsAlbumFeedBehaviourReport", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: k */
    public void mo131378k() {
        SnsMethodCalculate.markStartTimeMs("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f275555l == 0) {
            SnsMethodCalculate.markEndTimeMs("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        if (this.f275535b.isEmpty()) {
            this.f275533a.mo119667h(2, Util.nowSecond());
            this.f275537c.clear();
        }
        Log.m105925i("MicroMsg.SnsReportHelper", "enterTimeLine exposureFeedSize %d", Integer.valueOf(this.f275535b.size()));
        SnsMethodCalculate.markStartTimeMs("pushEnterSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        ((C64995b) C86312j.m106911c(C64995b.class)).Cv0(this.f275554k0);
        mo131349J(1);
        ((C119157j) C119157j.f356862d).mo183885p(new C95001t(this), "sns_feed_expose_tag");
        SnsMethodCalculate.markEndTimeMs("pushEnterSnsTimeLineEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markEndTimeMs("enterTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: l */
    public void mo131379l(List<Long> list, long j, String str) {
        SnsMethodCalculate.markStartTimeMs("enterWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f275540d0 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (Long longValue : list) {
            sb.append(C102236a0.m134763p0(longValue.longValue()));
            sb.append("#");
        }
        SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct = this.f275536b0;
        snsTimelineWeiShangeFoldBrowseStruct.f266173i = snsTimelineWeiShangeFoldBrowseStruct.mo86045b("FeedList", sb.toString(), true);
        this.f275536b0.f266171g = (long) list.size();
        SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct2 = this.f275536b0;
        snsTimelineWeiShangeFoldBrowseStruct2.f266169e = snsTimelineWeiShangeFoldBrowseStruct2.mo86045b("FoldedBlockId", C102236a0.m134763p0(j), true);
        SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct3 = this.f275536b0;
        snsTimelineWeiShangeFoldBrowseStruct3.f266169e = snsTimelineWeiShangeFoldBrowseStruct3.mo86045b("FoldedBlockId", C102236a0.m134763p0(j), true);
        SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct4 = this.f275536b0;
        snsTimelineWeiShangeFoldBrowseStruct4.f266170f = snsTimelineWeiShangeFoldBrowseStruct4.mo86045b("UserName", str, true);
        SnsMethodCalculate.markEndTimeMs("enterWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: m */
    public void mo131380m() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "exitTimeline"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            int r0 = r1.f275555l
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "exitTimeline"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0015:
            r2 = 2
            r3 = 0
            r4 = 1
            java.lang.String r0 = "MicroMsg.SnsReportHelper"
            java.lang.String r5 = "exitTimeline exposureFeedSize %d, exposureAppIdSize %d"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r7 = r7.size()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r6[r3] = r7     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r1.f275537c     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r7 = r7.size()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r6[r4] = r7     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r5 = 0
            long r5 = r0.mo118846d(r2, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            boolean r0 = r0.isEmpty()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r9 = 3
            if (r0 != 0) goto L_0x014c
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r0 = r0.size()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r10 = r1.f275551j     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            if (r0 > r10) goto L_0x005f
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r0 = r1.f275553k     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            long r12 = (long) r0     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x014c
        L_0x005f:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.Set r10 = r10.keySet()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r11 = 0
            r12 = 0
        L_0x0070:
            boolean r13 = r10.hasNext()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            if (r13 == 0) goto L_0x00cf
            java.lang.Object r13 = r10.next()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.String> r14 = r1.f275537c     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.Object r14 = r14.get(r13)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            if (r15 != 0) goto L_0x008c
            r11 = 1
            goto L_0x008e
        L_0x008c:
            java.lang.String r14 = ""
        L_0x008e:
            java.util.HashSet<java.lang.String> r15 = r1.f275539d     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            boolean r15 = r15.contains(r13)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            if (r15 == 0) goto L_0x0098
            r15 = 1
            goto L_0x0099
        L_0x0098:
            r15 = 0
        L_0x0099:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.<init>()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r13)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r8 = "#"
            r7.append(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.Object r8 = r8.get(r13)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r8 = "#"
            r7.append(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r14)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r8 = "#"
            r7.append(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r15)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r8 = "|"
            r7.append(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.append(r7)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            int r12 = r12 + 1
            goto L_0x0070
        L_0x00cf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.<init>()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r5 = ","
            r7.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r5 = ",1,"
            r7.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r11)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r5 = ","
            r7.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7.append(r12)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r5 = ",1"
            r7.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r5 = r7.toString()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.append(r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r5 = "MicroMsg.SnsReportHelper"
            java.lang.String r6 = "report(13226) %d: %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r8 = 13226(0x33aa, float:1.8534E-41)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7[r3] = r10     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r7[r4] = r0     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r6, r7)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r5.kvStat(r8, r0)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r5 = 0
            r0.mo119664f(r9, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r6 = 4
            r0.mo119664f(r6, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r6 = 5
            r0.mo119664f(r6, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.clear()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.f275537c     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.clear()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashSet<java.lang.String> r0 = r1.f275539d     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.clear()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.mo119667h(r2, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            goto L_0x017d
        L_0x014c:
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r1.f275535b     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r0.mo119664f(r9, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r1.f275537c     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r6 = 4
            r0.mo119664f(r6, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            com.tencent.mm.storage.u1 r0 = r1.f275533a     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            java.util.HashSet<java.lang.String> r5 = r1.f275539d     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            r6 = 5
            r0.mo119664f(r6, r5)     // Catch:{ ClassCastException -> 0x0171, Exception -> 0x0164 }
            goto L_0x017d
        L_0x0164:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.SnsReportHelper"
            java.lang.String r6 = "exitTimeline Exception e : [%s]"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r4)
            goto L_0x017d
        L_0x0171:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.SnsReportHelper"
            java.lang.String r6 = "exitTimeline ClassCastException e : [%s]"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r4)
        L_0x017d:
            monitor-enter(r16)
            java.lang.String r0 = "saveExposureFeedIdForCgi"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)     // Catch:{ all -> 0x01e2 }
            int r0 = r1.f275543f     // Catch:{ all -> 0x01e2 }
            if (r0 > 0) goto L_0x0194
            java.lang.String r0 = "saveExposureFeedIdForCgi"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r16)
            goto L_0x01b0
        L_0x0194:
            java.util.LinkedHashMap<java.lang.Long, java.lang.Object> r0 = r1.f275541e     // Catch:{ all -> 0x01e2 }
            java.lang.Object r0 = r0.clone()     // Catch:{ all -> 0x01e2 }
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch:{ all -> 0x01e2 }
            com.tencent.mm.plugin.sns.statistics.s r3 = new com.tencent.mm.plugin.sns.statistics.s     // Catch:{ all -> 0x01e2 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "save_exposure_feed"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r3, r0)     // Catch:{ all -> 0x01e2 }
            java.lang.String r0 = "saveExposureFeedIdForCgi"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch:{ all -> 0x01e2 }
            monitor-exit(r16)
        L_0x01b0:
            java.lang.String r0 = "pushExitSnsTimeLineEvent"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.lang.Class<tq.b> r4 = p700tq.C64995b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            tq.b r4 = (p700tq.C64995b) r4
            ia1.b r5 = r1.f275554k0
            r4.pn0(r5)
            r1.mo131349J(r2)
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.statistics.u r4 = new com.tencent.mm.plugin.sns.statistics.u
            r4.<init>(r1)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r5 = "sns_feed_expose_tag"
            r2.mo183885p(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = "exitTimeline"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x01e2:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.mo131380m():void");
    }

    /* renamed from: n */
    public void mo131381n(String str) {
        C94987c cVar;
        SnsLikeCollapseStruct snsLikeCollapseStruct;
        SnsMethodCalculate.markStartTimeMs("exposeSnsLikeClickComment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(str == null || (cVar = (C94987c) ((HashMap) this.f275560q).get(str)) == null || (snsLikeCollapseStruct = cVar.f275579b) == null)) {
            snsLikeCollapseStruct.f266061n = 1;
        }
        SnsMethodCalculate.markEndTimeMs("exposeSnsLikeClickComment", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: o */
    public void mo131382o(String str, boolean z) {
        C94987c cVar;
        SnsLikeCollapseStruct snsLikeCollapseStruct;
        SnsMethodCalculate.markStartTimeMs("exposeSnsLikeClickLike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(str == null || (cVar = (C94987c) ((HashMap) this.f275560q).get(str)) == null || (snsLikeCollapseStruct = cVar.f275579b) == null)) {
            if (z) {
                snsLikeCollapseStruct.f266060m = 1;
            } else {
                snsLikeCollapseStruct.f266060m = 3;
            }
        }
        SnsMethodCalculate.markEndTimeMs("exposeSnsLikeClickLike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: p */
    public void mo131383p(String str, boolean z) {
        C94987c cVar;
        SnsLikeCollapseStruct snsLikeCollapseStruct;
        SnsMethodCalculate.markStartTimeMs("exposeSnsLikeClickOpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (!(str == null || (cVar = (C94987c) ((HashMap) this.f275560q).get(str)) == null || (snsLikeCollapseStruct = cVar.f275579b) == null)) {
            if (z) {
                snsLikeCollapseStruct.f266063p = 1;
            } else {
                snsLikeCollapseStruct.f266071x = 1;
            }
        }
        SnsMethodCalculate.markEndTimeMs("exposeSnsLikeClickOpt", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: q */
    public void mo131384q(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("exposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f275555l == 0) {
            SnsMethodCalculate.markEndTimeMs("exposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        HashMap<String, Integer> hashMap = this.f275535b;
        int i = 1;
        if (hashMap.containsKey(str)) {
            i = 1 + this.f275535b.get(str).intValue();
        }
        hashMap.put(str, Integer.valueOf(i));
        if (z) {
            this.f275539d.add(str);
        }
        SnsMethodCalculate.markEndTimeMs("exposure", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: r */
    public void mo131385r(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("exposureAppId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f275555l == 0 || Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            SnsMethodCalculate.markEndTimeMs("exposureAppId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            return;
        }
        this.f275537c.put(str, str2);
        SnsMethodCalculate.markEndTimeMs("exposureAppId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: s */
    public synchronized void mo131386s(long j) {
        SnsMethodCalculate.markStartTimeMs("exposureFeedId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f275543f > 0) {
            this.f275541e.put(Long.valueOf(j), f275505l0);
        }
        SnsMethodCalculate.markEndTimeMs("exposureFeedId", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: t */
    public void mo131387t(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("feedBrowseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsInfo != null) {
            String str = C102236a0.m134763p0(snsInfo.field_snsId) + "_" + i;
            if (!((ArrayList) this.f275514H).contains(str)) {
                ((ArrayList) this.f275514H).add(str);
            }
        }
        SnsMethodCalculate.markEndTimeMs("feedBrowseDetailMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: u */
    public void mo131388u() {
        SnsMethodCalculate.markStartTimeMs("feedGalleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        this.f275516J = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("feedGalleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: v */
    public void mo131389v() {
        SnsMethodCalculate.markStartTimeMs("feedGalleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (this.f275516J != 0) {
            this.f275517K += System.currentTimeMillis() - this.f275516J;
            this.f275516J = 0;
        }
        SnsMethodCalculate.markEndTimeMs("feedGalleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
    }

    /* renamed from: w */
    public TimelineTrashReEditStruct mo131390w() {
        SnsMethodCalculate.markStartTimeMs("getClickTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        TimelineTrashReEditStruct timelineTrashReEditStruct = this.f275522P;
        SnsMethodCalculate.markEndTimeMs("getClickTimelineReEditStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return timelineTrashReEditStruct;
    }

    /* renamed from: x */
    public FinderShareMomentReportStruct mo131391x() {
        SnsMethodCalculate.markStartTimeMs("getFinderShareMomentReportStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        FinderShareMomentReportStruct finderShareMomentReportStruct = this.f275527U;
        SnsMethodCalculate.markEndTimeMs("getFinderShareMomentReportStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return finderShareMomentReportStruct;
    }

    /* renamed from: y */
    public synchronized LinkedList<Long> mo131392y() {
        SnsMethodCalculate.markStartTimeMs("getRealExposureForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f275541e.clone();
        if (linkedHashMap.size() > 0) {
            if (this.f275543f > 0) {
                LinkedList<Long> linkedList = new LinkedList<>();
                int i = 0;
                for (Long addFirst : linkedHashMap.keySet()) {
                    linkedList.addFirst(addFirst);
                    i++;
                    if (i > this.f275543f) {
                        linkedList.removeLast();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getRealExposureForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                return linkedList;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getRealExposureForCgi", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return null;
    }

    /* renamed from: z */
    public Set<String> mo131393z(int i) {
        SnsMethodCalculate.markStartTimeMs("getSearchLabelCntOfDynaLabelByVisibleState", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (((HashMap) this.f275559p).get(Integer.valueOf(i)) == null) {
            ((HashMap) this.f275559p).put(Integer.valueOf(i), new HashSet());
        }
        Set<String> set = (Set) ((HashMap) this.f275559p).get(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("getSearchLabelCntOfDynaLabelByVisibleState", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        return set;
    }
}
