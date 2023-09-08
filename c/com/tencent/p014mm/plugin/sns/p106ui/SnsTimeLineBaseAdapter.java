package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.ListView;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicCheckErrorEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.autogen.events.SnsOldItemContactEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C57411d;
import com.tencent.p014mm.plugin.sns.p106ui.item.C57414i;
import com.tencent.p014mm.plugin.sns.p106ui.item.C57416j;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95911b;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95925h;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95929m;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95933n;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95942o;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95944p;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95959s;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vending.base.Vending;
import cs2.C45199a;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import hq2.C98496b;
import j20.C117292a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jp2.C98963o;
import k20.C9556a;
import kq2.C99160b;
import kq2.C99163d;
import lq2.C99578a;
import lu2.C61403b;
import mq2.C99938a;
import nj3.C76874e0;
import nj3.C76912y0;
import nu2.C100202d;
import oa1.C117731d;
import p214om.C11502f;
import qc0.C101093a;
import qc0.C101106m;
import qo3.C77407n;
import rq2.C63505q;
import te3.C101789j00;
import te3.C101808lv2;
import te3.C101833r5;
import uo3.C78253a;
import uu2.C102112a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter */
public class SnsTimeLineBaseAdapter implements C95764e1 {

    /* renamed from: A */
    public Set<String> f278549A;

    /* renamed from: B */
    public C96317y0 f278550B;

    /* renamed from: C */
    public IListener f278551C;

    /* renamed from: D */
    public IListener f278552D;

    /* renamed from: E */
    public IListener f278553E;

    /* renamed from: F */
    public HashMap<Integer, Class<? extends BaseTimeLineItem.BaseViewHolder>> f278554F;

    /* renamed from: G */
    public View f278555G;

    /* renamed from: H */
    public boolean f278556H;

    /* renamed from: I */
    public View.OnClickListener f278557I;

    /* renamed from: J */
    public View.OnClickListener f278558J;

    /* renamed from: K */
    public SnsPostDescPreloadTextView.C96303b f278559K;

    /* renamed from: L */
    public View.OnClickListener f278560L;

    /* renamed from: M */
    public View.OnClickListener f278561M;

    /* renamed from: N */
    public View.OnTouchListener f278562N;

    /* renamed from: O */
    public ListView f278563O;

    /* renamed from: P */
    public IListener f278564P;

    /* renamed from: Q */
    public IListener f278565Q;

    /* renamed from: R */
    public final List<View> f278566R;

    /* renamed from: a */
    public C95747c1 f278567a;

    /* renamed from: b */
    public BaseTimeLine f278568b;

    /* renamed from: c */
    public LinkedList<SnsCommentCollapseLayout> f278569c = new LinkedList<>();

    /* renamed from: d */
    public HashMap<Integer, WeakReference<View>> f278570d = new HashMap<>();

    /* renamed from: e */
    public boolean f278571e = false;

    /* renamed from: f */
    public TimelineClickListener f278572f;

    /* renamed from: g */
    public C78253a f278573g;

    /* renamed from: h */
    public View f278574h;

    /* renamed from: i */
    public MMActivity f278575i;

    /* renamed from: j */
    public C96085n8 f278576j;

    /* renamed from: k */
    public C95713a5 f278577k;

    /* renamed from: l */
    public int f278578l = 0;

    /* renamed from: m */
    public boolean f278579m = false;

    /* renamed from: n */
    public PBool f278580n = new PBool();

    /* renamed from: o */
    public TranslateAnimation f278581o;

    /* renamed from: p */
    public TranslateAnimation f278582p;

    /* renamed from: q */
    public int f278583q = -1;

    /* renamed from: r */
    public HashMap<String, Integer> f278584r = new HashMap<>();

    /* renamed from: s */
    public HashMap<String, Integer> f278585s = new HashMap<>();

    /* renamed from: t */
    public HashMap<String, C95632i> f278586t = new HashMap<>();

    /* renamed from: u */
    public HashMap<Integer, View> f278587u = new HashMap<>();

    /* renamed from: v */
    public C96174r f278588v;

    /* renamed from: w */
    public C43151t f278589w;

    /* renamed from: x */
    public int f278590x;

    /* renamed from: y */
    public boolean f278591y;

    /* renamed from: z */
    public boolean f278592z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$a */
    public class C95624a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ WeImageView f278597a;

        /* renamed from: b */
        public final /* synthetic */ ScaleAnimation f278598b;

        public C95624a(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, WeImageView weImageView, ScaleAnimation scaleAnimation) {
            this.f278597a = weImageView;
            this.f278598b = scaleAnimation;
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
            this.f278597a.startAnimation(this.f278598b);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$b */
    public class C95625b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ LinearLayout f278599a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f278600b;

        public C95625b(LinearLayout linearLayout, Runnable runnable) {
            this.f278599a = linearLayout;
            this.f278600b = runnable;
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
            LinearLayout linearLayout = this.f278599a;
            if (linearLayout != null) {
                SnsTimeLineBaseAdapter.this.f278568b.f276715y.mo133669b(linearLayout);
                this.f278599a.setPressed(false);
            }
            Runnable runnable = this.f278600b;
            if (runnable != null) {
                runnable.run();
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$11");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$c */
    public class C95626c implements View.OnClickListener {
        public C95626c() {
        }

        public void onClick(View view) {
            C63505q.C63506a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
            Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn");
            BaseTimeLine baseTimeLine = SnsTimeLineBaseAdapter.this.f278568b;
            baseTimeLine.getClass();
            SnsMethodCalculate.markStartTimeMs("freeLikeActionLock", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            baseTimeLine.f276702i = false;
            SnsMethodCalculate.markEndTimeMs("freeLikeActionLock", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = SnsTimeLineBaseAdapter.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            View view2 = snsTimeLineBaseAdapter.f278555G;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            if (view2 == view) {
                SnsTimeLineBaseAdapter.this.mo132931z();
            } else {
                SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = SnsTimeLineBaseAdapter.this;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                snsTimeLineBaseAdapter2.f278556H = true;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            }
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter3 = SnsTimeLineBaseAdapter.this;
            SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            snsTimeLineBaseAdapter3.f278555G = view;
            SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            IListener iListener = NotInteresetABTestManager.f273611b;
            SnsMethodCalculate.markStartTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
            SnsMethodCalculate.markEndTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
            if (!(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
                Log.m105920e("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn err1");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            TimeLineObject timeLineObject = baseViewHolder.timeLineObject;
            if (timeLineObject != null && timeLineObject.ContentObj.f298424e == 21) {
                C101808lv2 lv22 = baseViewHolder.f279957g0;
                if (!C75592q0.m90789s().equals(baseViewHolder.timeLineObject.UserName) && (lv22 == null || lv22.f298730D == 0)) {
                    Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "snsCommentFix showTipsDialog.");
                    C45199a.m50003a(SnsTimeLineBaseAdapter.this.f278575i, baseViewHolder.f279936S.mo132426b(0));
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            if (baseViewHolder.isAd) {
                String str = baseViewHolder.f279956g;
                C98963o oVar = SnsTimeLineBaseAdapter.this.f278568b.f276699f;
                SnsMethodCalculate.markStartTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                try {
                    aVar = C98496b.m127947c(C94866e1.Yx0().mo139798DN(str), true, view, oVar);
                    SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                } catch (Throwable unused) {
                    aVar = null;
                    SnsMethodCalculate.markEndTimeMs("createFeedbackReportData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdFeedbackChannelData");
                }
                C63505q.m74843b(aVar);
            }
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter4 = SnsTimeLineBaseAdapter.this;
            if (snsTimeLineBaseAdapter4.f278575i instanceof C96317y0) {
                Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "snsCommentFix addCommentView.");
                ((C96317y0) SnsTimeLineBaseAdapter.this.f278575i).mo132949H3(view);
            } else {
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                C96317y0 y0Var = snsTimeLineBaseAdapter4.f278550B;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                if (y0Var != null) {
                    SnsTimeLineBaseAdapter snsTimeLineBaseAdapter5 = SnsTimeLineBaseAdapter.this;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    C96317y0 y0Var2 = snsTimeLineBaseAdapter5.f278550B;
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    y0Var2.mo132949H3(view);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$d */
    public class C95627d implements View.OnClickListener {
        public C95627d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
            if (!(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            SnsTimeLineBaseAdapter.this.mo132928w((BaseTimeLineItem.BaseViewHolder) view.getTag());
            SnsTimeLineBaseAdapter.this.f278567a.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$e */
    public class C95628e implements SnsPostDescPreloadTextView.C96303b {
        public C95628e() {
        }

        /* renamed from: a */
        public void mo132940a() {
            SnsMethodCalculate.markStartTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
            Log.m105918d("MicroMsg.SnsTimeLineBaseAdapter", "onSpread: adapter notify");
            SnsTimeLineBaseAdapter.this.f278567a.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
        }

        /* renamed from: b */
        public void mo132941b() {
            SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
            Log.m105918d("MicroMsg.SnsTimeLineBaseAdapter", "onShrink: adapter notify");
            SnsTimeLineBaseAdapter.this.f278567a.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$f */
    public class C95629f implements View.OnClickListener {
        public C95629f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = SnsTimeLineBaseAdapter.this;
            if (!snsTimeLineBaseAdapter.f278579m || snsTimeLineBaseAdapter.f278578l <= 0) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!(view.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
                if (baseViewHolder == null) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "likeCollapListener onclick %s", baseViewHolder.f279956g);
                if (!SnsTimeLineBaseAdapter.this.f278585s.containsKey(baseViewHolder.f279956g) || (!SnsTimeLineBaseAdapter.this.f278585s.get(baseViewHolder.f279956g).equals(1) && !SnsTimeLineBaseAdapter.this.f278585s.get(baseViewHolder.f279956g).equals(3))) {
                    SnsTimeLineBaseAdapter.this.f278585s.put(baseViewHolder.f279956g, 1);
                    SnsReportHelper.f275506m0.mo131383p(C102236a0.m134765q0(baseViewHolder.f279952e), false);
                } else {
                    SnsTimeLineBaseAdapter.this.f278585s.put(baseViewHolder.f279956g, 2);
                    SnsReportHelper.f275506m0.mo131383p(C102236a0.m134765q0(baseViewHolder.f279952e), true);
                }
                SnsTimeLineBaseAdapter.this.f278567a.notifyDataSetChanged();
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$g */
    public class C95630g implements View.OnClickListener {
        public C95630g() {
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            if (view.getParent() == null || !(view.getParent() instanceof SnsCommentCollapseLayout)) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (((SnsCommentCollapseLayout) view.getParent()).getTag() == null || !(((SnsCommentCollapseLayout) view.getParent()).getTag() instanceof C96230u)) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C96230u uVar = (C96230u) ((SnsCommentCollapseLayout) view.getParent()).getTag();
                if (uVar == null) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                try {
                    Intent intent = new Intent();
                    intent.putExtra("sns_text_show", uVar.f281193c);
                    intent.putExtra("sns_local_id", uVar.f281191a);
                    intent.putExtra("sns_comment_buf", uVar.f281195e.toByteArray());
                    intent.putExtra("sns_content_source", 2);
                    intent.setClass(SnsTimeLineBaseAdapter.this.f278575i, SnsSingleTextViewUI.class);
                    MMActivity mMActivity = SnsTimeLineBaseAdapter.this.f278575i;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    str = "(Landroid/view/View;)V";
                    C9556a aVar2 = aVar;
                    try {
                        C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(mMActivity, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    str = "(Landroid/view/View;)V";
                    Log.printErrStackTrace("MicroMsg.SnsTimeLineBaseAdapter", e, "commentCollapse click exception.", new Object[0]);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", str);
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$h */
    public class C95631h implements n8$$g0 {

        /* renamed from: a */
        public final /* synthetic */ C95747c1 f278607a;

        public C95631h(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, C95747c1 c1Var) {
            this.f278607a = c1Var;
        }

        /* renamed from: a */
        public void mo132640a() {
            SnsMethodCalculate.markStartTimeMs("onDataChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$9");
            this.f278607a.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("onDataChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$i */
    public interface C95632i {
        /* renamed from: a */
        void mo132826a(boolean z);

        String getKey();
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$j */
    public interface C95633j {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$k */
    public static class C95634k implements C75597w2.C31525a {

        /* renamed from: a */
        public C95747c1 f278608a;

        /* renamed from: b */
        public int f278609b;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$k$a */
        public class C95635a implements Runnable {
            public C95635a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack$1");
                C95634k kVar = C95634k.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                C95747c1 c1Var = kVar.f278608a;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                if (c1Var.mo133190l0() != null) {
                    C95634k kVar2 = C95634k.this;
                    SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                    C95747c1 c1Var2 = kVar2.f278608a;
                    SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                    Vending l0 = c1Var2.mo133190l0();
                    C95634k kVar3 = C95634k.this;
                    SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                    int i = kVar3.f278609b;
                    SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                    l0.request(Integer.valueOf(i));
                }
                C95634k kVar4 = C95634k.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                C95747c1 c1Var3 = kVar4.f278608a;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
                c1Var3.notifyDataSetChanged();
                new SnsOldItemContactEvent().publish();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack$1");
            }
        }

        public C95634k(C95747c1 c1Var, int i) {
            this.f278608a = c1Var;
            this.f278609b = i;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
            if (z) {
                C86709a0.m107528h();
                if (C86709a0.m107523b().mo121114l()) {
                    C94866e1.ly0().post(new C95635a());
                }
            }
            SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
        }
    }

    public SnsTimeLineBaseAdapter(MMActivity mMActivity, ListView listView, TimelineClickListener timelineClickListener, BaseTimeLine baseTimeLine, int i, C95747c1 c1Var) {
        MMActivity mMActivity2 = mMActivity;
        BaseTimeLine baseTimeLine2 = baseTimeLine;
        C95747c1 c1Var2 = c1Var;
        Class<C61403b.C61404a> cls = C61403b.C61404a.class;
        Class<C95917e.C95922e> cls2 = C95917e.C95922e.class;
        Class<C95929m.C95932c> cls3 = C95929m.C95932c.class;
        new MMHandler();
        new HashMap();
        new HashMap();
        this.f278590x = 2;
        this.f278591y = false;
        this.f278592z = false;
        this.f278549A = new HashSet();
        C40008f fVar = C40008f.f107254d;
        this.f278551C = new IListener<SnsTranslateStartEvent>(fVar) {
            {
                this.__eventId = 1200144606;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                SnsTranslateStartEvent snsTranslateStartEvent = (SnsTranslateStartEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                if (snsTranslateStartEvent instanceof SnsTranslateStartEvent) {
                    SnsTranslateStartEvent.C92597a aVar = snsTranslateStartEvent.f265208d;
                    int i = aVar.f265209a;
                    if (i == 1) {
                        String str = aVar.f265210b;
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = SnsTimeLineBaseAdapter.this;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        snsTimeLineBaseAdapter.getClass();
                        SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "postDescTranslateStart, id: %s", str);
                        SnsInfo TE = C94866e1.Yx0().mo139807TE(str);
                        if (TE != null) {
                            String localid = TE.getLocalid();
                            if (snsTimeLineBaseAdapter.f278584r.containsKey(localid) && snsTimeLineBaseAdapter.f278584r.get(localid).equals(1)) {
                                snsTimeLineBaseAdapter.f278584r.put(localid, 2);
                            }
                            C94965w1.m120620a(str, 2);
                            snsTimeLineBaseAdapter.mo132925t();
                        }
                        SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    } else if (i == 2) {
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = SnsTimeLineBaseAdapter.this;
                        String str2 = aVar.f265210b;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        snsTimeLineBaseAdapter2.getClass();
                        SnsMethodCalculate.markStartTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "commentTranslateStart, id: %s", str2);
                        C94965w1.m120620a(str2, 2);
                        snsTimeLineBaseAdapter2.mo132925t();
                        SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$1");
                return false;
            }
        };
        this.f278552D = new IListener<SnsTranslateFinishEvent>(fVar) {
            {
                this.__eventId = 2139223297;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                SnsTranslateFinishEvent snsTranslateFinishEvent = (SnsTranslateFinishEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                if (snsTranslateFinishEvent instanceof SnsTranslateFinishEvent) {
                    SnsTranslateFinishEvent.C92595a aVar = snsTranslateFinishEvent.f265201d;
                    String str = aVar.f265203b;
                    int i = aVar.f265202a;
                    if (i == 1) {
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = SnsTimeLineBaseAdapter.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        snsTimeLineBaseAdapter.getClass();
                        SnsMethodCalculate.markStartTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "postDescTranslateFinish, id: %s", str);
                        C94965w1.m120620a(str, 2);
                        snsTimeLineBaseAdapter.mo132925t();
                        SnsMethodCalculate.markEndTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    } else if (i == 2) {
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = SnsTimeLineBaseAdapter.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        snsTimeLineBaseAdapter2.getClass();
                        SnsMethodCalculate.markStartTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "commentTranslateFinish, id: %s", str);
                        C94965w1.m120620a(str, 2);
                        snsTimeLineBaseAdapter2.mo132925t();
                        SnsMethodCalculate.markEndTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$2");
                return false;
            }
        };
        this.f278553E = new IListener<SnsUnTranslateEvent>(fVar) {
            {
                this.__eventId = -868441523;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                SnsUnTranslateEvent snsUnTranslateEvent = (SnsUnTranslateEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                if (snsUnTranslateEvent instanceof SnsUnTranslateEvent) {
                    SnsUnTranslateEvent.C92598a aVar = snsUnTranslateEvent.f265211d;
                    String str = aVar.f265213b;
                    int i = aVar.f265212a;
                    if (i == 1) {
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = SnsTimeLineBaseAdapter.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        snsTimeLineBaseAdapter.getClass();
                        SnsMethodCalculate.markStartTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "unTranslatePostDesc, id: %s", str);
                        C94965w1.m120629j(str, 2);
                        snsTimeLineBaseAdapter.mo132925t();
                        SnsMethodCalculate.markEndTimeMs("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    } else if (i == 2) {
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = SnsTimeLineBaseAdapter.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        snsTimeLineBaseAdapter2.getClass();
                        SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        Log.m105919d("MicroMsg.SnsTimeLineBaseAdapter", "unTranslateComment, id: %s", str);
                        C94965w1.m120629j(str, 2);
                        snsTimeLineBaseAdapter2.mo132925t();
                        SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$3");
                return false;
            }
        };
        HashMap<Integer, Class<? extends BaseTimeLineItem.BaseViewHolder>> hashMap = new HashMap<>();
        this.f278554F = hashMap;
        hashMap.put(6, C95942o.C95943a.class);
        this.f278554F.put(2, cls3);
        this.f278554F.put(3, cls3);
        this.f278554F.put(4, cls3);
        this.f278554F.put(5, cls3);
        this.f278554F.put(0, cls3);
        this.f278554F.put(24, C57416j.C57418b.class);
        this.f278554F.put(1, cls3);
        this.f278554F.put(7, cls3);
        this.f278554F.put(8, cls3);
        this.f278554F.put(9, cls3);
        this.f278554F.put(11, C95944p.C95951g.class);
        this.f278554F.put(13, C95911b.C95915d.class);
        this.f278554F.put(27, cls2);
        this.f278554F.put(28, cls2);
        this.f278554F.put(29, cls2);
        this.f278554F.put(30, cls2);
        this.f278554F.put(31, cls2);
        this.f278554F.put(32, cls2);
        this.f278554F.put(39, cls2);
        this.f278554F.put(41, cls2);
        this.f278554F.put(35, cls2);
        this.f278554F.put(15, C95933n.C95941e.class);
        this.f278554F.put(10, cls3);
        this.f278554F.put(12, cls3);
        this.f278554F.put(16, cls3);
        this.f278554F.put(17, C95925h.C95926a.class);
        this.f278554F.put(18, C57411d.C57413b.class);
        this.f278554F.put(20, cls);
        this.f278554F.put(33, cls);
        this.f278554F.put(25, cls);
        this.f278554F.put(21, C57414i.C57415a.class);
        this.f278554F.put(19, C99163d.C99165b.class);
        this.f278554F.put(22, C95959s.C43123a.class);
        this.f278554F.put(23, C99160b.C99161a.class);
        this.f278554F.put(26, C99578a.C99582d.class);
        this.f278554F.put(34, C99938a.C99939a.class);
        this.f278556H = false;
        this.f278557I = new C95626c();
        this.f278558J = new C95627d();
        this.f278559K = new C95628e();
        this.f278560L = new C95629f();
        this.f278561M = new C95630g();
        this.f278562N = Util.genLinearPressedListener();
        new HashMap();
        this.f278564P = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
                if (r5 != 7) goto L_0x0045;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$13"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r5 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r5
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    boolean r2 = r5 instanceof com.tencent.p014mm.autogen.events.MusicPlayerEvent
                    if (r2 == 0) goto L_0x0045
                    com.tencent.mm.autogen.events.MusicPlayerEvent$a r5 = r5.f9336d
                    int r5 = r5.f9337a
                    if (r5 == 0) goto L_0x003e
                    r2 = 1
                    if (r5 == r2) goto L_0x003e
                    r2 = 2
                    if (r5 == r2) goto L_0x003e
                    r2 = 3
                    if (r5 == r2) goto L_0x003e
                    r2 = 4
                    if (r5 == r2) goto L_0x0026
                    r2 = 7
                    if (r5 == r2) goto L_0x003e
                    goto L_0x0045
                L_0x0026:
                    com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.this
                    com.tencent.mm.plugin.sns.ui.c1 r5 = r5.f278567a
                    r5.notifyDataSetChanged()
                    com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.this
                    android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    r3 = 2131833332(0x7f1131f4, float:1.9299743E38)
                    java.lang.String r2 = r2.getString(r3)
                    com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122249a(r5, r2)
                    goto L_0x0045
                L_0x003e:
                    com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.this
                    com.tencent.mm.plugin.sns.ui.c1 r5 = r5.f278567a
                    r5.notifyDataSetChanged()
                L_0x0045:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    r5 = 0
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.C9562113.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f278565Q = new IListener<MusicCheckErrorEvent>(fVar) {
            {
                this.__eventId = -1443570203;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                MusicCheckErrorEvent musicCheckErrorEvent = (MusicCheckErrorEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "musicCheckErrorListener check error");
                MusicCheckErrorEvent.C55147a aVar = musicCheckErrorEvent.f154842d;
                if (aVar.f154843a == 0) {
                    Log.m105920e("MicroMsg.SnsTimeLineBaseAdapter", "musicCheckErrorListener, must has error.");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                } else {
                    SnsTimeLineBaseAdapter.m122249a(SnsTimeLineBaseAdapter.this, !Util.isNullOrNil(aVar.f154844b) ? musicCheckErrorEvent.f154842d.f154844b : MMApplicationContext.getContext().getString(C0966R.string.f361077h32));
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$14");
                return false;
            }
        };
        this.f278566R = new ArrayList();
        this.f278567a = c1Var2;
        this.f278568b = baseTimeLine2;
        Log.m105918d("MicroMsg.SnsTimeLineBaseAdapter", "SnsTimeLineAdapter 2");
        this.f278563O = listView;
        C94866e1.Fx0().getClass();
        SnsMethodCalculate.markStartTimeMs("idleStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsMethodCalculate.markEndTimeMs("idleStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f278575i = mMActivity2;
        this.f278572f = timelineClickListener;
        LayoutInflater.from(mMActivity);
        new C77407n((Context) mMActivity2, 1, false);
        new C76874e0(mMActivity2);
        new C76874e0(mMActivity2);
        this.f278573g = new C78253a(mMActivity2);
        this.f278577k = new C95713a5(mMActivity2);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        this.f278581o = translateAnimation;
        translateAnimation.setStartOffset(100);
        this.f278581o.setDuration(200);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        this.f278582p = translateAnimation2;
        translateAnimation2.setStartOffset(100);
        this.f278582p.setDuration(200);
        C94895m2 m2Var = baseTimeLine2.f276700g;
        this.f278588v = new C96174r(mMActivity2, 0, m2Var);
        this.f278589w = new C43151t(baseTimeLine2);
        this.f278576j = new C96085n8(mMActivity2, new C95631h(this, c1Var2), 0, m2Var);
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            this.f278578l = this.f278590x;
            this.f278579m = true;
        } else {
            try {
                this.f278578l = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_lines", "0", false, true));
                this.f278579m = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_enable", "0", false, true)) == 1;
            } catch (NumberFormatException e) {
                Log.m105929w("MicroMsg.SnsTimeLineBaseAdapter", "parse like collapse config error: %s", e.getMessage());
            }
        }
        this.f278591y = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_WS_FOLD_DEBUG_INT_SYNC, 0) == 1;
        this.f278592z = true;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("SnsTimelineMMKV");
        Log.m105925i("MicroMsg.SnsTimeLineBaseAdapter", "SnsCrashProtect isNeedSkipCrashItem:%s", Boolean.valueOf(this.f278592z));
        String string = mmkv.getString("SnsTimelineMMKVLastShowItemId", "");
        if (!Util.isNullOrNil(string)) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(150, 91);
            mmkv.encode("SnsTimelineMMKVLastShowItemId", "");
            String string2 = mmkv.getString("SnsTimelineMMKVLastCrashItemId", "");
            if (Util.isNullOrNil(string2) || !string2.equals(string)) {
                mmkv.encode("SnsTimelineMMKVLastCrashItemId", string);
                mmkv.encode("SnsTimelineMMKVLastCrashItemCount", 1);
                Log.m105921e("MicroMsg.SnsTimeLineBaseAdapter", "SnsCrashProtect, last crash item id:%s, crash time:%s", string, 1);
            } else {
                int i2 = mmkv.getInt("SnsTimelineMMKVLastCrashItemCount", 0) + 1;
                Log.m105921e("MicroMsg.SnsTimeLineBaseAdapter", "SnsCrashProtect, last crash item id:%s, crash time:%s", string, Integer.valueOf(i2));
                if (i2 >= 10) {
                    nVar.mo175911u(150, 92);
                    Set stringSet = mmkv.getStringSet("SnsTimelineMMKVNeedSkipItem", new HashSet());
                    stringSet = stringSet.size() > 10 ? new HashSet() : stringSet;
                    stringSet.add(string2);
                    mmkv.encode("SnsTimelineMMKVNeedSkipItem", (Set<String>) stringSet);
                    mmkv.encode("SnsTimelineMMKVLastCrashItemId", "");
                    mmkv.encode("SnsTimelineMMKVLastCrashItemCount", 0);
                } else {
                    mmkv.encode("SnsTimelineMMKVLastCrashItemCount", i2);
                }
            }
        }
        if (this.f278592z) {
            this.f278549A = mmkv.getStringSet("SnsTimelineMMKVNeedSkipItem", new HashSet());
        }
    }

    /* renamed from: a */
    public static void m122249a(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, String str) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        snsTimeLineBaseAdapter.getClass();
        SnsMethodCalculate.markStartTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        C76912y0.m92767f(MMApplicationContext.getContext(), str);
        SnsMethodCalculate.markEndTimeMs("processPlayError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: e */
    public static String m122250e(TimeLineObject timeLineObject, Context context) {
        SnsMethodCalculate.markStartTimeMs("getAppUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        String v102 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().v10(context, timeLineObject.AppInfo.f299236d, "timeline");
        SnsMethodCalculate.markEndTimeMs("getAppUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return v102;
    }

    /* renamed from: f */
    public static ArrayList<C94965w1.C94967b> m122251f(String str) {
        SnsMethodCalculate.markStartTimeMs("getCommentTranslateInfoBySnsId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        ArrayList<C94965w1.C94967b> arrayList = new ArrayList<>();
        HashMap<String, C94965w1.C94967b> hashMap = C94965w1.f275297a;
        SnsMethodCalculate.markStartTimeMs("getTranslateInfoCache", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        HashMap<String, C94965w1.C94967b> hashMap2 = C94965w1.f275297a;
        SnsMethodCalculate.markEndTimeMs("getTranslateInfoCache", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (hashMap2.size() <= 0) {
            SnsMethodCalculate.markEndTimeMs("getCommentTranslateInfoBySnsId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return arrayList;
        }
        SnsMethodCalculate.markStartTimeMs("getTranslateInfoCache", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        HashMap<String, C94965w1.C94967b> hashMap3 = C94965w1.f275297a;
        SnsMethodCalculate.markEndTimeMs("getTranslateInfoCache", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        for (String next : hashMap3.keySet()) {
            if (next.startsWith(str)) {
                SnsMethodCalculate.markStartTimeMs("getTranslateInfoCache", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                HashMap<String, C94965w1.C94967b> hashMap4 = C94965w1.f275297a;
                SnsMethodCalculate.markEndTimeMs("getTranslateInfoCache", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                C94965w1.C94967b bVar = hashMap4.get(next);
                SnsMethodCalculate.markStartTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                boolean z = false;
                if (bVar != null) {
                    if ((bVar.f275308f & 2) != 0) {
                        z = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                } else {
                    SnsMethodCalculate.markEndTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                }
                if (z) {
                    arrayList.add(bVar);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCommentTranslateInfoBySnsId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return arrayList;
    }

    /* renamed from: l */
    public static String m122252l(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        Log.m105918d("MicroMsg.SnsTimeLineBaseAdapter", "url:" + str);
        String K3 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93142K3(str, "timeline");
        SnsMethodCalculate.markEndTimeMs("getReditectUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return K3;
    }

    /* renamed from: o */
    public static String m122253o(String str) {
        SnsMethodCalculate.markStartTimeMs("getTruncUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getTruncUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return str;
        }
        int indexOf = str.indexOf("://");
        if (indexOf != -1) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf("/");
        if (indexOf2 != -1) {
            str = str.substring(0, indexOf2);
        }
        SnsMethodCalculate.markEndTimeMs("getTruncUrl", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return str;
    }

    /* renamed from: p */
    public static int m122254p(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        int q = m122255q(snsInfo, true);
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return q;
    }

    /* renamed from: q */
    public static int m122255q(SnsInfo snsInfo, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        TimeLineObject timeLine = snsInfo.getTimeLine();
        if (z && snsInfo.isWsFold()) {
            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 22;
        } else if (timeLine == null) {
            Log.m105920e("MicroMsg.SnsTimeLineBaseAdapter", "obj is null");
            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return 1;
        } else {
            Object[] objArr = new Object[1];
            String str = timeLine.f283893Id;
            if (str == null) {
                str = "null";
            }
            objArr[0] = str;
            Log.m105925i("MicroMsg.SnsTimeLineBaseAdapter", "getViewType Id:%s", objArr);
            C101789j00 j002 = timeLine.ContentObj;
            if (j002 == null) {
                Log.m105920e("MicroMsg.SnsTimeLineBaseAdapter", "obj.ContentObj is null");
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 1;
            }
            int i = j002.f298424e;
            if (i == 1) {
                if (!z || timeLine.showFlag != 1) {
                    if (snsInfo.isAd() && snsInfo.getAdXml() != null) {
                        if (snsInfo.getAdXml().isCardAd()) {
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                            return 13;
                        } else if (snsInfo.isFullCardAd()) {
                            int a = C100202d.m130998a(snsInfo);
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                            return a;
                        } else if (snsInfo.isSphereCardAd()) {
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                            return 15;
                        } else if (snsInfo.isCombinedGridAD()) {
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                            return 34;
                        }
                    }
                    int size = timeLine.ContentObj.f298427h.size();
                    if (size <= 1) {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 2;
                    } else if (size <= 3) {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 3;
                    } else if (size <= 6) {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 4;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 5;
                    }
                } else {
                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 12;
                }
            } else if (i == 2) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 6;
            } else if (i == 21) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 10;
            } else if (i == 4) {
                C101833r5 r5Var = timeLine.AppInfo;
                if (C87412m.m108589b("wx5aa333606550dfd5", r5Var != null ? r5Var.f299236d : "")) {
                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 24;
                }
                if (!(((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_new_music_type_flag, C104160f.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1)) {
                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 0;
                }
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 1;
            } else if (i == 5) {
                if (snsInfo.isAd() && snsInfo.getAdXml() != null) {
                    if (snsInfo.getAdXml().isCardAd()) {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 13;
                    } else if (snsInfo.isFullCardAd()) {
                        int a2 = C100202d.m130998a(snsInfo);
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return a2;
                    } else if (snsInfo.isSphereCardAd()) {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 15;
                    } else if (snsInfo.isCombinedGridAD()) {
                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                        return 34;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 1;
            } else if (i == 7) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 2;
            } else if (i == 8) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 3;
            } else if (i == 14) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 7;
            } else if (i != 15) {
                if (i == 33) {
                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 17;
                } else if (i != 34) {
                    switch (i) {
                        case 27:
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                            return 11;
                        case 28:
                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                            return 18;
                        case 29:
                            break;
                        default:
                            switch (i) {
                                case 36:
                                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                    return 21;
                                case 37:
                                case 38:
                                    break;
                                case 39:
                                    int i2 = j002.f298437u;
                                    if (i2 == 3 || i2 == 100000000) {
                                        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                        return 16;
                                    }
                                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                    return 1;
                                default:
                                    switch (i) {
                                        case 42:
                                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                            return 24;
                                        case 43:
                                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                            return 25;
                                        case 44:
                                        case 46:
                                            break;
                                        case 45:
                                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                            return 33;
                                        default:
                                            SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                                            return 1;
                                    }
                            }
                    }
                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 16;
                } else {
                    SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    return 20;
                }
            } else if (z && timeLine.sightFolded == 1) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 12;
            } else if (!snsInfo.isAd() || snsInfo.getAdXml() == null) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 9;
            } else if (snsInfo.getAdXml().isCardAd()) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 13;
            } else if (snsInfo.isFullCardAd()) {
                int a3 = C100202d.m130998a(snsInfo);
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return a3;
            } else if (snsInfo.isSphereCardAd()) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 15;
            } else if (snsInfo.isFinderTopicCardAd()) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 23;
            } else if (snsInfo.isSlideFullCardAd()) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 26;
            } else if (snsInfo.isCombinedGridAD()) {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 34;
            } else {
                SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                return 19;
            }
        }
    }

    /* renamed from: r */
    public static boolean m122256r(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        boolean z = true;
        if (timeLineObject.ContentObj.f298424e == 9) {
            SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return true;
        }
        if ((C5431p1.C5432a.m5339j() & 1) > 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isDisplaySummary", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return z;
    }

    /* renamed from: b */
    public View mo132914b(int i, View view) {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        C102112a.f300683a.mo141614c(i, view != null);
        SnsInfo item = this.f278567a.getItem(i);
        View c = mo132915c(item, i, this.f278568b.mo132093o() == 1 ? m122255q(item, false) : m122254p(item), view);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0337  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo132915c(com.tencent.p014mm.plugin.sns.storage.SnsInfo r27, int r28, int r29, android.view.View r30) {
        /*
            r26 = this;
            r9 = r26
            r10 = r27
            r11 = r28
            r7 = r29
            r8 = r30
            java.lang.String r0 = "createViewBySnsInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r1 = "createViewBySnsInfo >> %d"
            r12 = 1
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r28)
            r13 = 0
            r2[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r27.getSnsId()
            r6 = 2
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120626g(r0, r6)
            if (r0 == 0) goto L_0x004c
            r0 = 22
            if (r7 == r0) goto L_0x004c
            java.lang.String r0 = r27.getSnsId()
            com.tencent.mm.plugin.sns.model.w1$b r0 = com.tencent.p014mm.plugin.sns.model.C94965w1.m120624e(r0)
            long r2 = r10.field_snsId
            r4 = 0
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x004a
            com.tencent.mm.plugin.sns.model.w1$b r0 = new com.tencent.mm.plugin.sns.model.w1$b
            r0.<init>()
        L_0x004a:
            r5 = r0
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            java.lang.String r0 = r27.getSnsId()
            java.util.ArrayList r4 = m122251f(r0)
            com.tencent.mm.plugin.sns.ui.c1 r0 = r26.mo132918h()
            com.tencent.mm.plugin.sns.ui.w6 r0 = r0.mo133189h0(r11)
            r0.f281376e0 = r11
            r0.f281378f0 = r5
            java.util.ArrayList<com.tencent.mm.plugin.sns.model.w1$b> r2 = r0.f281380g0
            r2.clear()
            java.util.ArrayList<com.tencent.mm.plugin.sns.model.w1$b> r0 = r0.f281380g0
            r0.addAll(r4)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r27.getTimeLine()
            r0 = 8
            if (r3 == 0) goto L_0x010b
            java.lang.String r2 = r3.f283893Id
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x010b
            boolean r2 = r9.f278592z
            if (r2 == 0) goto L_0x00fe
            java.util.Set<java.lang.String> r2 = r9.f278549A
            java.lang.String r1 = r3.f283893Id
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x00fe
            java.lang.String r1 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r2 = "createView skipItemSet includes this id:%s"
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r3 = r3.f283893Id
            r4[r13] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r4)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 150(0x96, float:2.1E-43)
            r3 = 93
            r1.mo175911u(r2, r3)
            if (r8 != 0) goto L_0x00a9
            android.view.View r1 = new android.view.View
            com.tencent.mm.ui.MMActivity r2 = r9.f278575i
            r1.<init>(r2)
            goto L_0x00aa
        L_0x00a9:
            r1 = r8
        L_0x00aa:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter"
            java.lang.String r17 = "createViewBySnsInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILandroid/view/View;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = r2.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter"
            java.lang.String r16 = "createViewBySnsInfo"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILandroid/view/View;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            uu2.a r0 = uu2.C102112a.f300683a
            boolean r2 = r27.isAd()
            r0.mo141617e((int) r11, (boolean) r2)
            r0.mo141615d(r11)
            java.lang.String r0 = "createViewBySnsInfo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return r1
        L_0x00fe:
            java.lang.String r1 = "SnsTimelineMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            java.lang.String r2 = "SnsTimelineMMKVLastShowItemId"
            java.lang.String r6 = r3.f283893Id
            r1.encode((java.lang.String) r2, (java.lang.String) r6)
        L_0x010b:
            java.lang.String r1 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1)
            java.lang.String r2 = "SnsMMKVDeleteTable"
            boolean r1 = r1.getBoolean(r2, r13)
            if (r1 == 0) goto L_0x0185
            boolean r1 = r27.isAd()
            if (r1 == 0) goto L_0x0185
            java.lang.String r1 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r2 = "already delete sns table, skip ad"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r8 != 0) goto L_0x0130
            android.view.View r1 = new android.view.View
            com.tencent.mm.ui.MMActivity r2 = r9.f278575i
            r1.<init>(r2)
            goto L_0x0131
        L_0x0130:
            r1 = r8
        L_0x0131:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object[] r15 = r2.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter"
            java.lang.String r17 = "createViewBySnsInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILandroid/view/View;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = r2.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter"
            java.lang.String r16 = "createViewBySnsInfo"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILandroid/view/View;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            uu2.a r0 = uu2.C102112a.f300683a
            boolean r2 = r27.isAd()
            r0.mo141617e((int) r11, (boolean) r2)
            r0.mo141615d(r11)
            java.lang.String r0 = "createViewBySnsInfo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return r1
        L_0x0185:
            java.lang.String r1 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r2 = "[SnsFeedInfo|c] createTime:%s[%s] snsId:[%s, %s] userName[%s, %s] type:%s localId:%s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r6 = r27.getCreateTime()
            r19 = r4
            r18 = r5
            long r4 = (long) r6
            java.lang.String r4 = vr2.C102236a0.m134772u(r4)
            r0[r13] = r4
            int r4 = r27.getCreateTime()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r12] = r4
            java.lang.String r4 = r27.getSnsId()
            r5 = 2
            r0[r5] = r4
            r4 = 3
            java.lang.String r5 = r27.getSnsId()
            long r5 = vr2.C102236a0.m134706B0(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r4] = r5
            r4 = 4
            java.lang.String r5 = r27.getUserName()
            r0[r4] = r5
            r4 = 5
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            java.lang.String r6 = r27.getUserName()
            java.lang.String r5 = r5.getDisplayName(r6)
            r0[r4] = r5
            r4 = 6
            int r5 = r27.getSourceType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            r4 = 7
            int r5 = r10.localid
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            boolean r0 = r27.isAd()
            if (r0 == 0) goto L_0x02ed
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x01ff
            java.lang.String r1 = r3.f283893Id
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01ff
            java.lang.String r0 = r3.f283893Id
        L_0x01ff:
            pq2.a r1 = pq2.C35614a.f95198a
            java.lang.String r1 = "tryReportTimelineExposeCost"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            if (r0 != 0) goto L_0x020f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x0222
        L_0x020f:
            long r4 = java.lang.System.currentTimeMillis()
            zt3.t r6 = zt3.C119157j.f356862d
            pq2.d r13 = new pq2.d
            r13.<init>(r0, r4, r11)
            zt3.j r6 = (zt3.C119157j) r6
            r6.mo183875f(r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0222:
            java.lang.String r1 = "obtainAdItemReporter"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            pq2.a$a r4 = new pq2.a$a
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            java.lang.String r1 = "setSnsId"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$AdapterAdItemReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r0, r5)
            r4.f95200a = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            java.lang.String r0 = "beginGetView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$AdapterAdItemReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r5 = java.lang.System.currentTimeMillis()
            r4.f95203d = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r27.getAdInfo()
            if (r0 == 0) goto L_0x02eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.sessionKeyAd
            r1.append(r0)
            java.lang.String r0 = ""
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x02eb
            sp2.c r1 = sp2.C101690c.f297710a
            java.lang.String r1 = "emitAdExposed"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r1 = "setExposed"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            if (r0 != 0) goto L_0x0297
            java.lang.String r0 = "AdPullRequestHelper"
            java.lang.String r1 = "this is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            java.lang.String r0 = "setExposed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x02d8
        L_0x0297:
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = sp2.C101690c.f297713d
            monitor-enter(r1)
            java.lang.String r2 = "AdPullRequestHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e0 }
            r5.<init>()     // Catch:{ all -> 0x02e0 }
            java.lang.String r6 = "setExposed "
            r5.append(r6)     // Catch:{ all -> 0x02e0 }
            r5.append(r0)     // Catch:{ all -> 0x02e0 }
            java.lang.String r6 = " = "
            r5.append(r6)     // Catch:{ all -> 0x02e0 }
            r5.append(r12)     // Catch:{ all -> 0x02e0 }
            java.lang.String r6 = "  oldValue = "
            r5.append(r6)     // Catch:{ all -> 0x02e0 }
            r6 = r1
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6     // Catch:{ all -> 0x02e0 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x02e0 }
            r5.append(r6)     // Catch:{ all -> 0x02e0 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x02e0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ all -> 0x02e0 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02e0 }
            r1.put(r0, r2)     // Catch:{ all -> 0x02e0 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x02e0 }
            monitor-exit(r1)
            java.lang.String r0 = "setExposed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x02d8:
            java.lang.String r0 = "emitAdExposed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x02eb
        L_0x02e0:
            r0 = move-exception
            monitor-exit(r1)
            java.lang.String r1 = "setExposed"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        L_0x02eb:
            r13 = r4
            goto L_0x02ee
        L_0x02ed:
            r13 = 0
        L_0x02ee:
            r0 = 2131314015(0x7f09455f, float:1.8246443E38)
            if (r8 == 0) goto L_0x032d
            java.lang.Object r1 = r8.getTag(r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x0302
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0303
        L_0x0302:
            r1 = -1
        L_0x0303:
            if (r1 != r7) goto L_0x032d
            java.lang.Object r1 = r30.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r1 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r1
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem r2 = r1.f279965k0
            java.lang.String r4 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r5 = "reuse convertView type:%d hash:%d"
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r29)
            r20 = 0
            r0[r20] = r16
            int r16 = r30.hashCode()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r0[r12] = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r0)
            r16 = r2
            goto L_0x0331
        L_0x032d:
            r6 = 2
            r1 = 0
            r16 = 0
        L_0x0331:
            long r21 = java.lang.System.currentTimeMillis()
            if (r1 != 0) goto L_0x0519
            java.lang.String r0 = "createBaseTimelineItem"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            switch(r7) {
                case 0: goto L_0x0477;
                case 1: goto L_0x046e;
                case 2: goto L_0x0465;
                case 3: goto L_0x045c;
                case 4: goto L_0x0453;
                case 5: goto L_0x044a;
                case 6: goto L_0x0441;
                case 7: goto L_0x046e;
                case 8: goto L_0x046e;
                case 9: goto L_0x0438;
                case 10: goto L_0x042f;
                case 11: goto L_0x0426;
                case 12: goto L_0x041d;
                case 13: goto L_0x0414;
                case 14: goto L_0x0341;
                case 15: goto L_0x040a;
                case 16: goto L_0x046e;
                case 17: goto L_0x0400;
                case 18: goto L_0x03f6;
                case 19: goto L_0x03ec;
                case 20: goto L_0x03e2;
                case 21: goto L_0x03d8;
                case 22: goto L_0x03ce;
                case 23: goto L_0x03c4;
                case 24: goto L_0x03ba;
                case 25: goto L_0x03d8;
                case 26: goto L_0x03b0;
                case 27: goto L_0x03a6;
                case 28: goto L_0x039c;
                case 29: goto L_0x0392;
                case 30: goto L_0x0388;
                case 31: goto L_0x037e;
                case 32: goto L_0x0373;
                case 33: goto L_0x03e2;
                case 34: goto L_0x0369;
                case 35: goto L_0x035f;
                case 36: goto L_0x0341;
                case 37: goto L_0x0341;
                case 38: goto L_0x0341;
                case 39: goto L_0x0355;
                case 40: goto L_0x0341;
                case 41: goto L_0x034b;
                default: goto L_0x0341;
            }
        L_0x0341:
            com.tencent.mm.plugin.sns.ui.item.l r4 = new com.tencent.mm.plugin.sns.ui.item.l
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x034b:
            mu2.d r4 = new mu2.d
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0355:
            mu2.a r4 = new mu2.a
            r4.<init>(r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x035f:
            mu2.b r4 = new mu2.b
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0369:
            mq2.a r4 = new mq2.a
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0373:
            mu2.a r4 = new mu2.a
            r5 = 0
            r4.<init>(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x037e:
            mu2.f r4 = new mu2.f
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0388:
            mu2.e r4 = new mu2.e
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0392:
            mu2.c r4 = new mu2.c
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x039c:
            mu2.g r4 = new mu2.g
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03a6:
            com.tencent.mm.plugin.sns.ui.item.e r4 = new com.tencent.mm.plugin.sns.ui.item.e
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03b0:
            lq2.a r4 = new lq2.a
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03ba:
            com.tencent.mm.plugin.sns.ui.item.j r4 = new com.tencent.mm.plugin.sns.ui.item.j
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03c4:
            kq2.b r4 = new kq2.b
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03ce:
            com.tencent.mm.plugin.sns.ui.item.s r4 = new com.tencent.mm.plugin.sns.ui.item.s
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03d8:
            com.tencent.mm.plugin.sns.ui.item.i r4 = new com.tencent.mm.plugin.sns.ui.item.i
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03e2:
            lu2.b r4 = new lu2.b
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03ec:
            kq2.d r4 = new kq2.d
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x03f6:
            com.tencent.mm.plugin.sns.ui.item.d r4 = new com.tencent.mm.plugin.sns.ui.item.d
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0400:
            com.tencent.mm.plugin.sns.ui.item.h r4 = new com.tencent.mm.plugin.sns.ui.item.h
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x040a:
            com.tencent.mm.plugin.sns.ui.item.n r4 = new com.tencent.mm.plugin.sns.ui.item.n
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0414:
            com.tencent.mm.plugin.sns.ui.item.b r4 = new com.tencent.mm.plugin.sns.ui.item.b
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x041d:
            com.tencent.mm.plugin.sns.ui.item.c r4 = new com.tencent.mm.plugin.sns.ui.item.c
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0426:
            com.tencent.mm.plugin.sns.ui.item.p r4 = new com.tencent.mm.plugin.sns.ui.item.p
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x042f:
            com.tencent.mm.plugin.sns.ui.item.g r4 = new com.tencent.mm.plugin.sns.ui.item.g
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0438:
            com.tencent.mm.plugin.sns.ui.item.r r4 = new com.tencent.mm.plugin.sns.ui.item.r
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0441:
            com.tencent.mm.plugin.sns.ui.item.o r4 = new com.tencent.mm.plugin.sns.ui.item.o
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x044a:
            com.tencent.mm.plugin.sns.ui.item.m r4 = new com.tencent.mm.plugin.sns.ui.item.m
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0453:
            com.tencent.mm.plugin.sns.ui.item.m r4 = new com.tencent.mm.plugin.sns.ui.item.m
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x045c:
            com.tencent.mm.plugin.sns.ui.item.m r4 = new com.tencent.mm.plugin.sns.ui.item.m
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0465:
            com.tencent.mm.plugin.sns.ui.item.m r4 = new com.tencent.mm.plugin.sns.ui.item.m
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x046e:
            com.tencent.mm.plugin.sns.ui.item.l r4 = new com.tencent.mm.plugin.sns.ui.item.l
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x047f
        L_0x0477:
            com.tencent.mm.plugin.sns.ui.item.k r4 = new com.tencent.mm.plugin.sns.ui.item.k
            r4.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x047f:
            r5 = r4
            java.util.HashMap<java.lang.Integer, java.lang.Class<? extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder>> r0 = r9.f278554F     // Catch:{ Exception -> 0x04fc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)     // Catch:{ Exception -> 0x04fc }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x04fc }
            if (r0 == 0) goto L_0x049f
            java.util.HashMap<java.lang.Integer, java.lang.Class<? extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder>> r0 = r9.f278554F     // Catch:{ Exception -> 0x04fc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)     // Catch:{ Exception -> 0x04fc }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x04fc }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ Exception -> 0x04fc }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x04fc }
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r0     // Catch:{ Exception -> 0x04fc }
            goto L_0x04a4
        L_0x049f:
            com.tencent.mm.plugin.sns.ui.item.m$c r0 = new com.tencent.mm.plugin.sns.ui.item.m$c     // Catch:{ Exception -> 0x04fc }
            r0.<init>()     // Catch:{ Exception -> 0x04fc }
        L_0x04a4:
            r4 = r0
            r4.f279965k0 = r5     // Catch:{ Exception -> 0x04ed }
            r4.timeLineObject = r3     // Catch:{ Exception -> 0x04ed }
            com.tencent.mm.ui.MMActivity r2 = r9.f278575i     // Catch:{ Exception -> 0x04ed }
            r1 = r5
            r23 = r3
            r3 = r4
            r16 = r4
            r24 = r19
            r4 = r29
            r25 = r18
            r18 = r5
            r5 = r26
            r12 = 2
            r6 = r27
            android.view.View r1 = r1.mo133400s(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x04eb }
            java.lang.String r0 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r2 = "create new convertView type:%d hash:%d"
            java.lang.Object[] r3 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x04e8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r29)     // Catch:{ Exception -> 0x04e8 }
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x04e8 }
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x04e8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x04e8 }
            r5 = 1
            r3[r5] = r4     // Catch:{ Exception -> 0x04e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r3)     // Catch:{ Exception -> 0x04e8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)     // Catch:{ Exception -> 0x04e8 }
            r2 = 2131314015(0x7f09455f, float:1.8246443E38)
            r1.setTag(r2, r0)     // Catch:{ Exception -> 0x04e8 }
            goto L_0x0513
        L_0x04e8:
            r0 = move-exception
            r8 = r1
            goto L_0x04f9
        L_0x04eb:
            r0 = move-exception
            goto L_0x04f9
        L_0x04ed:
            r0 = move-exception
            r23 = r3
            r16 = r4
            r25 = r18
            r24 = r19
            r12 = 2
            r18 = r5
        L_0x04f9:
            r1 = r16
            goto L_0x0506
        L_0x04fc:
            r0 = move-exception
            r23 = r3
            r25 = r18
            r24 = r19
            r12 = 2
            r18 = r5
        L_0x0506:
            java.lang.String r2 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r3 = "create holder error"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r5)
            r16 = r1
            r1 = r8
        L_0x0513:
            r8 = r1
            r0 = r16
            r6 = r18
            goto L_0x0523
        L_0x0519:
            r23 = r3
            r25 = r18
            r24 = r19
            r12 = 2
            r0 = r1
            r6 = r16
        L_0x0523:
            uu2.a r1 = uu2.C102112a.f300683a
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r21
            r1.mo141612a(r11, r2)
            boolean r1 = r27.isAd()
            if (r1 == 0) goto L_0x0553
            if (r13 == 0) goto L_0x0553
            java.lang.String r1 = "endInitItem"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$AdapterAdItemReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            long r3 = java.lang.System.currentTimeMillis()
            r13.f95201b = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            java.lang.String r1 = "setViewType"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$AdapterAdItemReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r13.f95204e = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0553:
            boolean r1 = r9.f278571e
            r6.getClass()
            java.lang.String r2 = "setIsFromMainTimeline"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r6.f279907h = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r1 = "setCommentTranslateInfo"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r24
            r6.f279911o = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            long r16 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.sns.ui.c1 r1 = r26.mo132918h()
            com.tencent.mm.plugin.sns.ui.w6 r18 = r1.mo133189h0(r11)
            r1 = r6
            r2 = r0
            r3 = r28
            r4 = r27
            r5 = r23
            r12 = r6
            r6 = r29
            r7 = r26
            r10 = r8
            r8 = r18
            r1.mo133396m(r2, r3, r4, r5, r6, r7, r8)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r16
            java.lang.String r3 = "fillContentCost"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.util.HashMap<java.lang.Integer, com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct> r5 = uu2.C102112a.f300684b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r28)
            java.lang.Object r5 = r5.get(r6)
            com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct r5 = (com.tencent.p014mm.autogen.mmdata.rpt.SnsMethodReportStruct) r5
            if (r5 != 0) goto L_0x05af
            goto L_0x05b2
        L_0x05af:
            int r2 = (int) r1
            r5.f266077g = r2
        L_0x05b2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r1 = r25
            if (r1 == 0) goto L_0x05ee
            boolean r2 = r1.f275306d
            if (r2 == 0) goto L_0x05d4
            boolean r2 = r1.f275307e
            if (r2 != 0) goto L_0x05c9
            java.lang.String r2 = r1.f275304b
            java.lang.String r3 = r1.f275305c
            r12.mo133401u(r1, r0, r2, r3)
            goto L_0x05d2
        L_0x05c9:
            r12.mo133403w(r0)
            java.lang.String r0 = r1.f275303a
            r1 = 2
            com.tencent.p014mm.plugin.sns.model.C94965w1.m120629j(r0, r1)
        L_0x05d2:
            r4 = 1
            goto L_0x05f2
        L_0x05d4:
            java.lang.String r1 = "postDescTranslateStart"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r3 = r0.f279970n
            r4 = 1
            if (r3 == 0) goto L_0x05ea
            r3.mo133019j(r4)
            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView r0 = r0.f279970n
            r3 = 0
            r0.setVisibility(r3)
        L_0x05ea:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x05f2
        L_0x05ee:
            r4 = 1
            r12.mo133403w(r0)
        L_0x05f2:
            boolean r0 = r27.isAd()
            if (r0 == 0) goto L_0x0694
            if (r13 == 0) goto L_0x0694
            java.lang.String r0 = "endFillItem"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$AdapterAdItemReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r2 = java.lang.System.currentTimeMillis()
            r13.f95202c = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r1 = "report"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$AdapterAdItemReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "AdTimelineReporter"
            java.lang.String r5 = "getPerformanceReportEnable"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0645 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x0645 }
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_sns_ad_timeline_performance_report_android     // Catch:{ all -> 0x0645 }
            r8 = 0
            int r7 = r0.mo58779Qe(r7, r8)     // Catch:{ all -> 0x0643 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x063f }
            r0.<init>()     // Catch:{ all -> 0x063f }
            java.lang.String r4 = "getPerformanceReportEnable called "
            r0.append(r4)     // Catch:{ all -> 0x063f }
            r0.append(r7)     // Catch:{ all -> 0x063f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x063f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ all -> 0x063f }
            goto L_0x065f
        L_0x063f:
            r0 = move-exception
            r20 = r7
            goto L_0x0649
        L_0x0643:
            r0 = move-exception
            goto L_0x0647
        L_0x0645:
            r0 = move-exception
            r8 = 0
        L_0x0647:
            r20 = 0
        L_0x0649:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "getPerformanceReportEnable, exp="
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r7 = r20
        L_0x065f:
            if (r7 <= 0) goto L_0x0664
            r19 = 1
            goto L_0x0666
        L_0x0664:
            r19 = 0
        L_0x0666:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r19 == 0) goto L_0x0691
            java.lang.String r0 = r13.f95200a
            long r3 = r13.f95201b
            long r5 = r13.f95203d
            long r3 = r3 - r5
            int r4 = (int) r3
            long r7 = r13.f95202c
            long r7 = r7 - r5
            int r3 = (int) r7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "viewType="
            r5.append(r6)
            int r6 = r13.f95204e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "time_line_list_fill_item_cost"
            vr2.C37817q.m41546b(r6, r0, r4, r3, r5)
        L_0x0691:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x0694:
            java.util.HashMap<java.lang.Integer, android.view.View> r0 = r9.f278587u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r0.put(r1, r10)
            r1 = r23
            java.lang.String r0 = r1.f283893Id
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x06b4
            java.lang.String r0 = "SnsTimelineMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "SnsTimelineMMKVLastShowItemId"
            java.lang.String r2 = ""
            r0.encode((java.lang.String) r1, (java.lang.String) r2)
        L_0x06b4:
            uu2.a r0 = uu2.C102112a.f300683a
            java.lang.String r1 = r12.mo81016t()
            r0.mo141616e((int) r11, (java.lang.String) r1)
            boolean r1 = r27.isAd()
            r0.mo141617e((int) r11, (boolean) r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r14
            r0.mo141613b(r11, r1)
            r0.mo141615d(r11)
            java.lang.String r0 = "createViewBySnsInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.mo132915c(com.tencent.mm.plugin.sns.storage.SnsInfo, int, int, android.view.View):android.view.View");
    }

    /* renamed from: d */
    public void mo132916d(LinearLayout linearLayout, Runnable runnable) {
        LinearLayout linearLayout2 = linearLayout;
        SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        WeImageView weImageView = (WeImageView) linearLayout2.findViewById(C0966R.C0970id.f5730n2);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation2.setDuration(100);
        scaleAnimation2.setRepeatCount(0);
        scaleAnimation2.setFillAfter(true);
        weImageView.clearAnimation();
        weImageView.startAnimation(scaleAnimation);
        scaleAnimation.setAnimationListener(new C95624a(this, weImageView, scaleAnimation2));
        scaleAnimation2.setAnimationListener(new C95625b(linearLayout2, runnable));
        SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: g */
    public int mo132917g() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        int count = this.f278567a.getCount();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return count;
    }

    /* renamed from: h */
    public C95747c1 mo132918h() {
        SnsMethodCalculate.markStartTimeMs("getITimelineAdapter", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        C95747c1 c1Var = this.f278567a;
        SnsMethodCalculate.markEndTimeMs("getITimelineAdapter", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return c1Var;
    }

    /* renamed from: i */
    public SnsInfo mo132919i(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        SnsInfo item = this.f278567a.getItem(i);
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return item;
    }

    /* renamed from: j */
    public int mo132920j(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        SnsInfo item = this.f278567a.getItem(i);
        int q = this.f278568b.mo132093o() == 1 ? m122255q(item, false) : m122254p(item);
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return q;
    }

    /* renamed from: k */
    public C78253a mo132921k() {
        SnsMethodCalculate.markStartTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        C78253a aVar = this.f278573g;
        if (aVar != null) {
            aVar.mo108266a();
        }
        C78253a aVar2 = new C78253a(this.f278575i);
        this.f278573g = aVar2;
        SnsMethodCalculate.markEndTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return aVar2;
    }

    /* renamed from: m */
    public SnsCommentCollapseLayout mo132922m() {
        SnsMethodCalculate.markStartTimeMs("getTextView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (this.f278569c.size() == 0) {
            SnsCommentCollapseLayout snsCommentCollapseLayout = new SnsCommentCollapseLayout(this.f278575i);
            SnsMethodCalculate.markEndTimeMs("getTextView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return snsCommentCollapseLayout;
        }
        SnsCommentCollapseLayout removeFirst = this.f278569c.removeFirst();
        SnsMethodCalculate.markEndTimeMs("getTextView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return removeFirst;
    }

    /* renamed from: n */
    public C96317y0 mo132923n() {
        SnsMethodCalculate.markStartTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        MMActivity mMActivity = this.f278575i;
        if (mMActivity instanceof C96317y0) {
            C96317y0 y0Var = (C96317y0) mMActivity;
            SnsMethodCalculate.markEndTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return y0Var;
        }
        C96317y0 y0Var2 = this.f278550B;
        if (y0Var2 != null) {
            SnsMethodCalculate.markEndTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return y0Var2;
        }
        SnsMethodCalculate.markEndTimeMs("getTimeline", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return null;
    }

    /* renamed from: s */
    public boolean mo132924s(String str) {
        SnsMethodCalculate.markStartTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (!C101093a.m132481c()) {
            SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return false;
        }
        C101106m b = C101093a.m132480b();
        if (b == null || !C101093a.m132482d(b) || !str.equals(b.f295960e)) {
            SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isTheSameId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        return true;
    }

    /* renamed from: t */
    public void mo132925t() {
        SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "notifyDataSetChanged: ");
        this.f278567a.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: u */
    public void mo132926u() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.f278551C.dead();
        this.f278552D.dead();
        this.f278553E.dead();
        this.f278564P.dead();
        this.f278565Q.dead();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: v */
    public void mo132927v() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.f278551C.alive();
        this.f278552D.alive();
        this.f278553E.alive();
        this.f278564P.alive();
        this.f278565Q.alive();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: w */
    public boolean mo132928w(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (baseViewHolder == null || baseViewHolder.isAd) {
            SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return false;
        } else if (this.f278584r.containsKey(baseViewHolder.f279956g) && this.f278584r.get(baseViewHolder.f279956g).equals(0)) {
            SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return false;
        } else if (!this.f278584r.containsKey(baseViewHolder.f279956g) || !this.f278584r.get(baseViewHolder.f279956g).equals(1)) {
            this.f278584r.put(baseViewHolder.f279956g, 1);
            Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "descCollapListener onClick: SHRINK");
            SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return true;
        } else {
            this.f278584r.put(baseViewHolder.f279956g, 2);
            Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "descCollapListener onClick: SPREAD");
            SnsMethodCalculate.markEndTimeMs("refreshCollapseibleMapState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            return false;
        }
    }

    /* renamed from: x */
    public void mo132929x(String str, C95632i iVar) {
        SnsMethodCalculate.markStartTimeMs("registerLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        if (iVar != null) {
            this.f278586t.put(str, iVar);
        }
        SnsMethodCalculate.markEndTimeMs("registerLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: y */
    public void mo132930y(boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("updateCollapseLikeTextBySelf", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        C95632i iVar = this.f278586t.get(str);
        if (iVar != null && Util.isEqual(iVar.getKey(), str)) {
            iVar.mo132826a(z);
        }
        SnsMethodCalculate.markEndTimeMs("updateCollapseLikeTextBySelf", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }

    /* renamed from: z */
    public void mo132931z() {
        SnsMethodCalculate.markStartTimeMs("updateShowIntercation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.f278556H = !this.f278556H;
        Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "updateShowIntercation, current showIntercation = " + this.f278556H);
        SnsMethodCalculate.markEndTimeMs("updateShowIntercation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }
}
