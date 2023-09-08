package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bv2.C92313c;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.sns.model.C43034b0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vending.base.Vending;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ft2.C97983h;
import gy3.C87412m;
import h81.C32735h;
import iv2.C33418b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jp2.C98963o;
import js2.C99020a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import p185kq.C10383h;
import pt2.C100905b;
import qo3.C89779i0;
import te3.C49969jb;
import vr2.C102236a0;
import wc3.C78538u;
import z91.C23462b;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI */
public class SnsWsFoldDetailUI extends MMActivity implements C96317y0, C11385n {

    /* renamed from: C */
    public static final /* synthetic */ int f279030C = 0;

    /* renamed from: A */
    public C98963o f279031A = new C98963o(0);

    /* renamed from: B */
    public C95761d8 f279032B = new C95761d8();

    /* renamed from: d */
    public ListView f279033d = null;

    /* renamed from: e */
    public ProgressBar f279034e = null;

    /* renamed from: f */
    public C97983h f279035f = null;

    /* renamed from: g */
    public C44668u3 f279036g = null;

    /* renamed from: h */
    public BaseTimeLine f279037h = null;

    /* renamed from: i */
    public long f279038i = 0;

    /* renamed from: j */
    public long f279039j = 0;

    /* renamed from: n */
    public long f279040n = 0;

    /* renamed from: o */
    public String f279041o = "";

    /* renamed from: p */
    public List<Long> f279042p = new ArrayList();

    /* renamed from: q */
    public String f279043q = "";

    /* renamed from: r */
    public C72996z1 f279044r;

    /* renamed from: s */
    public Map<String, Boolean> f279045s;

    /* renamed from: t */
    public Map<String, String> f279046t;

    /* renamed from: u */
    public List<String> f279047u;

    /* renamed from: v */
    public TextView f279048v;

    /* renamed from: w */
    public View f279049w;

    /* renamed from: x */
    public View f279050x;

    /* renamed from: y */
    public boolean f279051y = false;

    /* renamed from: z */
    public C100905b f279052z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$a */
    public class C95701a implements Runnable {
        public C95701a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$5");
            SnsWsFoldDetailUI.this.mo132950a1();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$5");
        }
    }

    /* renamed from: H3 */
    public boolean mo132949H3(View view) {
        SnsMethodCalculate.markStartTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        boolean a = this.f279037h.f276715y.mo133668a(view);
        SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return a;
    }

    /* renamed from: H7 */
    public final void mo133121H7() {
        SnsMethodCalculate.markStartTimeMs("setUnfoldFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        if (!(this.f279048v == null || this.f279049w == null || this.f279050x == null)) {
            String string = getString(C0966R.string.m_i);
            C72996z1 z1Var = this.f279044r;
            if (z1Var != null) {
                int i = z1Var.f149500H;
                if (i == 1) {
                    string = getString(C0966R.string.m_h);
                } else if (i == 2) {
                    string = getString(C0966R.string.m_g);
                }
            }
            this.f279048v.setText(string);
            this.f279048v.setTextColor(getResources().getColor(C0966R.color.f3563xt));
            View view = this.f279049w;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f279050x;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f279048v.setOnClickListener((View.OnClickListener) null);
        }
        SnsMethodCalculate.markEndTimeMs("setUnfoldFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    /* renamed from: a1 */
    public boolean mo132950a1() {
        SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        boolean d = this.f279037h.f276715y.mo133671d();
        SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return d;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return C0966R.C0971layout.c55;
    }

    public int keyboardState() {
        SnsMethodCalculate.markStartTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        C100905b bVar = this.f279052z;
        if (bVar == null || !bVar.mo140370b()) {
            int keyboardState = super.keyboardState();
            SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            return keyboardState;
        }
        int c = this.f279052z.mo140371c();
        SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return c;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        boolean z = true;
        C74779i.m89536a(this, true);
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        this.f279051y = false;
        this.f279038i = getIntent().getLongExtra("key_ws_group_id", 0);
        this.f279039j = getIntent().getLongExtra("key_ws_detail_max_id", 0);
        this.f279040n = getIntent().getLongExtra("key_ws_detail_min_id", 0);
        this.f279041o = getIntent().getStringExtra("key_ws_detail_username");
        Log.m105925i("MicroMsg.SnsWsFoldDetailUI", "groupId:%s", Long.valueOf(this.f279038i));
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_ws_str_sns_id_list");
        if (!Util.isNullOrNil((List) stringArrayListExtra)) {
            for (String next : stringArrayListExtra) {
                long B0 = C102236a0.m134706B0(next);
                ((ArrayList) this.f279042p).add(Long.valueOf(B0));
                Log.m105925i("MicroMsg.SnsWsFoldDetailUI", "snsId:%s-%s", next, Long.valueOf(B0));
            }
        }
        C86709a0.m107528h();
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        this.f279036g = Ni;
        if (Ni != null) {
            this.f279044r = Ni.get(this.f279041o);
        }
        this.f279043q = C94866e1.Mx0();
        this.f279045s = new HashMap();
        this.f279046t = new HashMap();
        this.f279047u = new ArrayList();
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        setMMTitle((int) C0966R.string.jkl);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        setBackBtn(new C95771e8(this), C0966R.raw.actionbar_icon_dark_back);
        SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        C96316x8 x8Var = new C96316x8(this);
        this.f279037h = x8Var;
        x8Var.f276709s = (FrameLayout) findViewById(C0966R.C0970id.jxj);
        this.f279037h.f276711u = new C96227t4(this);
        this.f279037h.mo132092n(this.f279031A);
        this.f279033d = (ListView) findViewById(C0966R.C0970id.jxh);
        this.f279034e = (ProgressBar) findViewById(C0966R.C0970id.jxi);
        ListView listView = this.f279033d;
        BaseTimeLine baseTimeLine = this.f279037h;
        C97983h hVar = r0;
        String str = "initViews";
        C97983h hVar2 = new C97983h(this, listView, baseTimeLine.f276693D, baseTimeLine, 10, C94866e1.Mx0(), (Vending.C97302l) null);
        this.f279035f = hVar;
        this.f279033d.setAdapter(hVar);
        this.f279037h.f276690A = new C99020a(this, this.f279035f.mo137303a().f278572f, this.f279037h.f276709s, (View) null);
        BaseTimeLine baseTimeLine2 = this.f279037h;
        TimelineClickListener timelineClickListener = this.f279035f.mo137303a().f278572f;
        BaseTimeLine baseTimeLine3 = this.f279037h;
        baseTimeLine2.f276716z = new C95733b(this, timelineClickListener, baseTimeLine3.f276709s, (View) null, baseTimeLine3.f276690A);
        this.f279037h.f276692C = new C43155u8(this, this.f279035f.mo137303a().f278572f, this.f279037h.f276709s, (View) null);
        this.f279037h.f276691B = new C43162z1((Context) this, this.f279035f.mo137303a().f278572f, this.f279037h.f276709s, (View) null);
        this.f279037h.f276715y = new C96104o8(this, this.f279035f.mo137303a(), this.f279037h.f276709s, (View) null);
        this.f279037h.f276707q = this.f279035f.mo137303a();
        this.f279037h.f276708r = (SnsCommentFooter) findViewById(C0966R.C0970id.bjo);
        this.f279052z = new C100905b(this, this.f279037h.f276708r);
        BaseTimeLine baseTimeLine4 = this.f279037h;
        ListView listView2 = this.f279033d;
        baseTimeLine4.f276698e = listView2;
        baseTimeLine4.f276710t = new C96116p8(listView2, baseTimeLine4.f276708r);
        SnsMethodCalculate.markStartTimeMs("setFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        if (this.f279033d == null) {
            Log.m105920e("MicroMsg.SnsWsFoldDetailUI", "updateFooterView listview error");
            SnsMethodCalculate.markEndTimeMs("setFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        } else {
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_ws_unfold_enable, false);
            Log.m105925i("MicroMsg.SnsWsFoldDetailUI", "setUnfoldBtn enable%s", Boolean.valueOf(wf));
            if (wf) {
                View inflate = getLayoutInflater().inflate(C0966R.C0971layout.cqj, (ViewGroup) null);
                inflate.setMinimumHeight(C76577a.m92157h(getContext(), C0966R.dimen.avr));
                this.f279048v = (TextView) inflate.findViewById(C0966R.C0970id.mm4);
                this.f279049w = inflate.findViewById(C0966R.C0970id.j3x);
                this.f279050x = inflate.findViewById(C0966R.C0970id.mlb);
                C95790g2 Kx0 = C94866e1.Kx0();
                String str2 = this.f279041o;
                Kx0.getClass();
                SnsMethodCalculate.markStartTimeMs("isUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                boolean contains = Kx0.f279541m.contains(str2);
                SnsMethodCalculate.markEndTimeMs("isUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                if (contains) {
                    mo133121H7();
                } else {
                    String string = getString(C0966R.string.m_o);
                    C72996z1 z1Var = this.f279044r;
                    if (z1Var != null) {
                        int i = z1Var.f149500H;
                        if (i == 1) {
                            string = getString(C0966R.string.m_f);
                        } else if (i == 2) {
                            string = getString(C0966R.string.m_e);
                        }
                    }
                    this.f279048v.setText(string);
                    this.f279048v.setTextColor(getResources().getColor(C0966R.color.f2958ae));
                    View view = this.f279049w;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f279050x;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f279048v.setOnClickListener(new C95808h8(this));
                }
                this.f279033d.addFooterView(inflate);
            }
            SnsMethodCalculate.markEndTimeMs("setFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        }
        this.f279033d.setOnTouchListener(new C95785f8(this));
        this.f279033d.setOnScrollListener(new C95796g8(this));
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        this.f279034e.setVisibility(0);
        this.f279033d.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        this.f279035f.mo137304b(this);
        SnsMethodCalculate.markStartTimeMs("loadRemoteData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        C86709a0.m107529k().f251779b.mo123460f(new C43034b0(this.f279042p));
        SnsMethodCalculate.markEndTimeMs("loadRemoteData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        C86709a0.m107529k().f251779b.mo123455a(5987, this);
        C86709a0.m107529k().f251779b.mo123455a(213, this);
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        C86709a0.m107529k().f251779b.mo123455a(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, this);
        C78538u.m94868d(this);
        C95761d8 d8Var = this.f279032B;
        d8Var.getClass();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        C95741b5 b5Var = d8Var.f279354a;
        C95745b8 b8Var = new C95745b8(d8Var);
        b5Var.getClass();
        SnsMethodCalculate.markStartTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b5Var.f279253a = b8Var;
        SnsMethodCalculate.markEndTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        d8Var.f279355b = C33418b.f90548a.mo59132a(d8Var.f279354a);
        SnsMethodCalculate.markStartTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_WS_FOLD_AUTOPLAY_INT_SYNC, 0);
        if (j == 0) {
            z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_ws_fold_auto_play, false);
            SnsMethodCalculate.markEndTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        } else if (j != 1) {
            SnsMethodCalculate.markEndTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
            z = false;
        } else {
            SnsMethodCalculate.markEndTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        }
        d8Var.f279356c = z;
        d8Var.f279357d = getSupportActionBar();
        d8Var.f279358e = this;
        d8Var.f279359f = (int) (((double) getResources().getDisplayMetrics().heightPixels) * 0.4d);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onDestroy();
        this.f279051y = true;
        BaseTimeLine baseTimeLine = this.f279037h;
        if (baseTimeLine != null) {
            baseTimeLine.mo132082d();
        }
        this.f279036g = null;
        ((HashMap) this.f279045s).clear();
        ((HashMap) this.f279046t).clear();
        ((ArrayList) this.f279047u).clear();
        C86709a0.m107529k().f251779b.mo123470p(5987, this);
        C86709a0.m107529k().f251779b.mo123470p(213, this);
        C86709a0.m107529k().f251779b.mo123470p(218, this);
        C86709a0.m107529k().f251779b.mo123470p(JsApiCheckIsSupportFaceDetect.CTRL_INDEX, this);
        C97983h hVar = this.f279035f;
        if (hVar != null) {
            hVar.mo137303a().getClass();
            SnsMethodCalculate.markStartTimeMs("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            SnsMethodCalculate.markEndTimeMs("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("reportWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) snsReportHelper.f275538c0).iterator();
        while (it.hasNext()) {
            sb.append(C102236a0.m134763p0(((Long) it.next()).longValue()));
            sb.append("#");
        }
        SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct = snsReportHelper.f275536b0;
        snsTimelineWeiShangeFoldBrowseStruct.f266174j = snsTimelineWeiShangeFoldBrowseStruct.mo86045b("BrowseFeedList", sb.toString(), true);
        snsReportHelper.f275536b0.f266172h = (long) ((ArrayList) snsReportHelper.f275538c0).size();
        SnsTimelineWeiShangeFoldBrowseStruct snsTimelineWeiShangeFoldBrowseStruct2 = snsReportHelper.f275536b0;
        snsTimelineWeiShangeFoldBrowseStruct2.f266168d = snsTimelineWeiShangeFoldBrowseStruct2.mo86045b("SessionId", ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36920d(), true);
        snsReportHelper.f275536b0.f266175k = System.currentTimeMillis() - snsReportHelper.f275540d0;
        Log.m105925i("MicroMsg.SnsReportHelper", "setBrowseFeedList:%s FeedList:%s", sb, snsReportHelper.f275536b0.f266173i);
        snsReportHelper.f275536b0.mo86054n();
        snsReportHelper.f275536b0 = new SnsTimelineWeiShangeFoldBrowseStruct();
        ((ArrayList) snsReportHelper.f275538c0).clear();
        snsReportHelper.f275540d0 = 0;
        SnsMethodCalculate.markEndTimeMs("reportWsFoldDetail", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        C95761d8 d8Var = this.f279032B;
        d8Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        Log.m105924i("MicroMsg.SnsWsFoldAutoPlayManager", "onUIDestroy");
        C95741b5 b5Var = d8Var.f279354a;
        b5Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        SnsMethodCalculate.markStartTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            MMApplicationContext.getContext().unregisterReceiver(b5Var.f279255c);
        } catch (IllegalArgumentException unused) {
        }
        SnsMethodCalculate.markEndTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b5Var.f279253a = null;
        b5Var.f279254b = 1;
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    public void onKeyboardStateChanged() {
        BaseTimeLine baseTimeLine;
        SnsCommentFooter snsCommentFooter;
        SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onKeyboardStateChanged();
        MMHandlerThread.postToMainThread(new C95701a());
        if (keyboardState() == 2) {
            BaseTimeLine baseTimeLine2 = this.f279037h;
            if (!(baseTimeLine2 == null || (snsCommentFooter = baseTimeLine2.f276708r) == null || snsCommentFooter.mo132700s())) {
                Log.m105924i("MicroMsg.SnsWsFoldDetailUI", "onKeyBoardStateChange find");
            }
        } else if (keyboardState() == 1 && (baseTimeLine = this.f279037h) != null) {
            baseTimeLine.mo132086h();
        }
        SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onPause();
        this.f279035f.mo137303a().mo132926u();
        C95761d8 d8Var = this.f279032B;
        d8Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        Log.m105924i("MicroMsg.SnsWsFoldAutoPlayManager", "onUIPause");
        if (d8Var.f279355b && d8Var.f279356c) {
            C96254a.m123394d().mo133937j();
            C92313c.m116089a().mo126300c();
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        C100905b bVar = this.f279052z;
        if (bVar != null) {
            bVar.mo140369a();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onResume();
        this.f279035f.mo137303a().mo132927v();
        C95761d8 d8Var = this.f279032B;
        d8Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        Log.m105924i("MicroMsg.SnsWsFoldAutoPlayManager", "onUIResume");
        C95741b5 b5Var = d8Var.f279354a;
        b5Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b5Var.f279254b = b5Var.mo133184b();
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        C95761d8 d8Var2 = this.f279032B;
        ListView listView = this.f279033d;
        d8Var2.getClass();
        SnsMethodCalculate.markStartTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        C87412m.m108594g(listView, "listView");
        listView.postDelayed(new C95752c8(d8Var2, listView), 15);
        SnsMethodCalculate.markEndTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        C100905b bVar = this.f279052z;
        if (bVar != null) {
            bVar.mo140372d();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        Log.m105924i("MicroMsg.SnsWsFoldDetailUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType());
        if (yVar.getType() == 5987) {
            SnsMethodCalculate.markStartTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            C49969jb jbVar = ((C43034b0) yVar).f116490f;
            SnsMethodCalculate.markEndTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            if (jbVar != null && !Util.isNullOrNil((List) jbVar.f135975d)) {
                LinkedList<SnsObject> linkedList = jbVar.f135975d;
                C94897n1.m120370h("@__batch", 128, linkedList, C102236a0.m134705B(C102236a0.m134765q0(linkedList.getFirst().f283891Id)));
            }
        }
        if (yVar.getType() == 218) {
            C94877g0 g0Var = (C94877g0) yVar;
            if ((g0Var.mo131050m1() == 1 || g0Var.mo131050m1() == 6 || g0Var.mo131050m1() == 4) && (i0Var = this.f279037h.f276694E) != null) {
                i0Var.dismiss();
            }
        }
        C97983h hVar = this.f279035f;
        if (hVar != null) {
            hVar.mo137304b(this);
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onWindowFocusChanged(z);
        C100905b bVar = this.f279052z;
        if (bVar != null && z) {
            bVar.mo140372d();
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }
}
