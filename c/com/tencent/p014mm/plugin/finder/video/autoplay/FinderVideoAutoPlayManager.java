package com.tencent.p014mm.plugin.finder.video.autoplay;

import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dg1.C58263a;
import dm1.C58322c;
import eb0.C31543z5;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import er1.C58744l;
import er1.C58784w3;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import hr1.C60134a;
import hr1.C60137b;
import hr1.C60138c;
import hr1.C60139d;
import hr1.C8730k;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jq3.C60905o;
import jq3.C9493c;
import kotlin.Metadata;
import qt1.C12932c;
import rs1.C13442s8;
import rs1.C63566lb;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/autoplay/FinderVideoAutoPlayManager;", "Lef1/d;", "Lhr1/k;", "Ldg1/a;", "Lhr1/a$a;", "Lcom/tencent/mm/ui/MMFragmentActivity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lrs1/lb;", "recycler", "Ldm1/c;", "musicManager", "", "tabType", "<init>", "(Lcom/tencent/mm/ui/MMFragmentActivity;Landroidx/recyclerview/widget/RecyclerView;Lrs1/lb;Ldm1/c;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager */
public final class FinderVideoAutoPlayManager extends C58555d implements C8730k, C58263a, C60134a.C60135a {

    /* renamed from: g */
    public final MMFragmentActivity f161958g;

    /* renamed from: h */
    public final RecyclerView f161959h;

    /* renamed from: i */
    public final C63566lb f161960i;

    /* renamed from: j */
    public final C58322c f161961j;

    /* renamed from: n */
    public final int f161962n;

    /* renamed from: o */
    public final C60134a f161963o;

    /* renamed from: p */
    public C12932c f161964p = new C12932c("ReadyPlayForward");

    /* renamed from: q */
    public final MMHandler f161965q = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C56534a(this));

    /* renamed from: r */
    public long f161966r = -1;

    /* renamed from: s */
    public final int f161967s;

    /* renamed from: t */
    public final HashSet<String> f161968t;

    /* renamed from: u */
    public boolean f161969u;

    /* renamed from: v */
    public final HashSet<String> f161970v;

    /* renamed from: w */
    public boolean f161971w;

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$a */
    public static final class C56534a implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoAutoPlayManager f161972d;

        public C56534a(FinderVideoAutoPlayManager finderVideoAutoPlayManager) {
            this.f161972d = finderVideoAutoPlayManager;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            int i = message.what;
            if (i == 1) {
                Log.m105924i("Finder.VideoAutoPlayManager", "data change to check play...");
                FinderVideoAutoPlayManager finderVideoAutoPlayManager = this.f161972d;
                finderVideoAutoPlayManager.mo79661E1(finderVideoAutoPlayManager.f161959h, false);
            } else if (i == 2) {
                FinderVideoAutoPlayManager finderVideoAutoPlayManager2 = this.f161972d;
                Object obj = message.obj;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj).longValue();
                finderVideoAutoPlayManager2.getClass();
                C58784w3 w3Var = C58784w3.f168295a;
                w3Var.getClass();
                long j = C58784w3.f168301g;
                if (longValue == j) {
                    w3Var.mo83881K1(j, true, 3);
                } else {
                    Log.m105924i("Finder.VideoAutoPlayManager", "feedId:" + longValue + " no eqauls current center feed");
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$b */
    public static final class C56535b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C7637b f161973d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoAutoPlayManager f161974e;

        public C56535b(C7637b bVar, FinderVideoAutoPlayManager finderVideoAutoPlayManager) {
            this.f161973d = bVar;
            this.f161974e = finderVideoAutoPlayManager;
        }

        public final void run() {
            boolean z = ((C7642k) this.f161973d).f25957h != 5;
            FinderVideoAutoPlayManager finderVideoAutoPlayManager = this.f161974e;
            finderVideoAutoPlayManager.mo79661E1(finderVideoAutoPlayManager.f161959h, z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$c */
    public static final class C56536c extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f161975d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56536c(FinderVideoLayout finderVideoLayout) {
            super(1);
            this.f161975d = finderVideoLayout;
        }

        public Object invoke(Object obj) {
            C59670o2 o2Var = (C59670o2) obj;
            C87412m.m108594g(o2Var, "view");
            FinderVideoLayout finderVideoLayout = this.f161975d;
            boolean z = true;
            if (finderVideoLayout != null) {
                z = true ^ C87412m.m108589b(finderVideoLayout.getVideoView(), o2Var.getVideoView());
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$d */
    public static final class C56537d extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderImgFeedMusicTag f161976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56537d(FinderImgFeedMusicTag finderImgFeedMusicTag) {
            super(1);
            this.f161976d = finderImgFeedMusicTag;
        }

        public Object invoke(Object obj) {
            boolean z;
            View view = (View) obj;
            C87412m.m108594g(view, "musicViewInManager");
            FinderImgFeedMusicTag finderImgFeedMusicTag = this.f161976d;
            if (finderImgFeedMusicTag != null) {
                Log.m105924i("FinderImgFeedMusicPlayer", "focusView:" + finderImgFeedMusicTag.getId() + ",other:" + view.getId());
                z = C87412m.m108589b(finderImgFeedMusicTag, view);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public FinderVideoAutoPlayManager(MMFragmentActivity mMFragmentActivity, RecyclerView recyclerView, C63566lb lbVar, C58322c cVar, int i) {
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(lbVar, "recycler");
        C87412m.m108594g(cVar, "musicManager");
        this.f161958g = mMFragmentActivity;
        this.f161959h = recyclerView;
        this.f161960i = lbVar;
        this.f161961j = cVar;
        this.f161962n = i;
        C60134a aVar = new C60134a();
        this.f161963o = aVar;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        this.f161967s = C37521f.f99254P2.mo60266n().intValue();
        Log.m105924i("FinderFeedSelectorAdapter", "bindRecyclerView recyclerView:" + recyclerView);
        aVar.f171656b = recyclerView;
        aVar.f171657c = i;
        if (recyclerView instanceof FinderRecyclerView) {
            fVar.getClass();
            if (C37521f.f99354a5.mo60266n().intValue() == 1) {
                ((FinderRecyclerView) recyclerView).setPageChangeListener(new C60138c(aVar));
            }
        }
        recyclerView.mo17088i0(new C60139d(recyclerView, aVar));
        RecyclerView recyclerView2 = aVar.f171656b;
        if (recyclerView2 != null) {
            recyclerView2.mo17043c(new C60137b(recyclerView2, aVar));
        }
        aVar.f171658d = this;
        this.f161968t = new HashSet<>();
        this.f161970v = new HashSet<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ca, code lost:
        if (r7 == null) goto L_0x00cc;
     */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65157G1(com.tencent.p014mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager r12, com.tencent.p014mm.plugin.finder.storage.FeedData r13, jq3.C60905o r14, qt1.C12931a r15) {
        /*
            java.util.LinkedList r0 = r13.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            r1 = 0
            java.lang.String r2 = "Finder.VideoAutoPlayManager"
            if (r0 == 0) goto L_0x013c
            r12.mo79662F1(r14)
            long r3 = r13.getId()
            if (r14 == 0) goto L_0x0135
            android.view.View r13 = r14.f44854d
            r5 = 2131304779(0x7f09214b, float:1.822771E38)
            android.view.View r13 = r13.findViewById(r5)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r5 = 0
            r6 = 1
            if (r13 == 0) goto L_0x002f
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x002f
            r13 = 1
            goto L_0x0030
        L_0x002f:
            r13 = 0
        L_0x0030:
            if (r13 == 0) goto L_0x0039
            java.lang.String r12 = "playFocusHolder videoContainer shareShadowView is visible, return}"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            goto L_0x0135
        L_0x0039:
            android.view.View r13 = r14.f44854d
            r7 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r13 = r13.findViewById(r7)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r13 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r13
            if (r13 == 0) goto L_0x0115
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "playFocusHolder videoContainer "
            r1.append(r7)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r7 = r13.f161854J
            if (r7 == 0) goto L_0x00cc
            pl1.r0 r8 = r7.f161894c
            com.tencent.mm.plugin.finder.storage.FeedData r9 = r7.f161892a
            r9.getExpectId()
            java.util.LinkedList<te3.rq2> r7 = r7.f161896e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[FinderVideoLayout#loginfo] layout=["
            r9.append(r10)
            int r10 = r13.getWidth()
            r9.append(r10)
            r10 = 58
            r9.append(r10)
            int r11 = r13.getHeight()
            r9.append(r11)
            java.lang.String r11 = "] videoView=["
            r9.append(r11)
            int r11 = r13.getWidth()
            r9.append(r11)
            r9.append(r10)
            int r11 = r13.getHeight()
            r9.append(r11)
            java.lang.String r11 = "] video=["
            r9.append(r11)
            te3.rq2 r11 = r8.f177253e
            float r11 = r11.f185270h
            r9.append(r11)
            r9.append(r10)
            te3.rq2 r10 = r8.f177253e
            float r10 = r10.f185271i
            r9.append(r10)
            java.lang.String r10 = "] "
            r9.append(r10)
            java.lang.String r10 = r13.mo79549P()
            r9.append(r10)
            java.lang.String r10 = " media="
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = " mediaList="
            r9.append(r8)
            int r7 = r7.size()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            if (r7 != 0) goto L_0x00ce
        L_0x00cc:
            java.lang.String r7 = "[FinderVideoLayout#loginfo] playInfo is null"
        L_0x00ce:
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r15 == 0) goto L_0x00df
            java.lang.String r1 = "playFocusHolder"
            r15.mo12482c(r1)
        L_0x00df:
            r13.setSelectedToPlay(r6)
            gr1.o2 r1 = r13.getVideoView()
            if (r1 == 0) goto L_0x00ec
            boolean r5 = r1.isPlaying()
        L_0x00ec:
            boolean r1 = r13.f161850F
            if (r5 == 0) goto L_0x00f8
            if (r15 == 0) goto L_0x0101
            java.lang.String r1 = "hitPause"
            r15.mo11310b(r1)
            goto L_0x0101
        L_0x00f8:
            if (r1 == 0) goto L_0x0101
            if (r15 == 0) goto L_0x0101
            java.lang.String r1 = "hitPreRender"
            r15.mo11310b(r1)
        L_0x0101:
            int r14 = r14.mo17363j()
            r13.mo79541C(r14, r15)
            boolean r13 = r12.f161971w
            if (r13 != 0) goto L_0x0113
            rs1.lb r12 = r12.f161960i
            hr1.i r13 = hr1.C8729i.f27995d
            r12.mo80066B0(r13)
        L_0x0113:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0115:
            if (r1 != 0) goto L_0x0135
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "playFocusHolder videoContainer is null! mediaId="
            r12.append(r13)
            java.lang.String r13 = r0.f185275p
            r12.append(r13)
            java.lang.String r13 = "] feedId="
            r12.append(r13)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r12)
        L_0x0135:
            java.lang.String r12 = "playFocusHolder mediaList first feed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x013c:
            if (r1 != 0) goto L_0x0143
            java.lang.String r12 = "playFocusHolder mediaList first feed null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager.m65157G1(com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager, com.tencent.mm.plugin.finder.storage.FeedData, jq3.o, qt1.a):void");
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
        if (bVar instanceof C7642k) {
            StringBuilder sb = new StringBuilder();
            sb.append("onEventHappen event state:");
            C7642k kVar = (C7642k) bVar;
            sb.append(kVar.f25957h);
            sb.append(" event feed:");
            sb.append(kVar.f25958i);
            Log.m105924i("Finder.VideoAutoPlayManager", sb.toString());
            this.f161959h.post(new C56535b(bVar, this));
        }
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        this.f161965q.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: E1 */
    public final void mo79661E1(RecyclerView recyclerView, boolean z) {
        this.f161965q.removeMessages(1);
        long c = C31543z5.m39453c();
        C60134a aVar = this.f161963o;
        aVar.getClass();
        C60134a.m70028a(aVar, (Set) null, z, "checkSelected", 1, (Object) null);
        long c2 = C31543z5.m39453c() - c;
        Log.m105918d("Finder.VideoAutoPlayManager", "check2Play cost:" + c2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r0 = r6.f44854d;
     */
    /* renamed from: F1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79662F1(androidx.recyclerview.widget.RecyclerView.C16631z r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pauseAllMedia without:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.VideoAutoPlayManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r6 == 0) goto L_0x0026
            android.view.View r0 = r6.f44854d
            if (r0 == 0) goto L_0x0026
            r1 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r0
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            rs1.lb r1 = r5.f161960i
            com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$c r2 = new com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$c
            r2.<init>(r0)
            r1.mo80066B0(r2)
            er1.w3 r0 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r0 = r0.mo83882L(r6)
            dm1.c r1 = r5.f161961j
            com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$d r2 = new com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager$d
            r2.<init>(r0)
            r1.mo83076e3(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f161959h
            int r0 = r0.getChildCount()
            r1 = 0
        L_0x0048:
            if (r1 >= r0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView r2 = r5.f161959h
            android.view.View r2 = r2.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r5.f161959h
            androidx.recyclerview.widget.RecyclerView$z r2 = r3.mo17021F0(r2)
            if (r2 == 0) goto L_0x0083
            boolean r3 = r2 instanceof jq3.C60905o
            if (r3 == 0) goto L_0x0083
            boolean r3 = gy3.C87412m.m108589b(r6, r2)
            if (r3 != 0) goto L_0x0083
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.Object r3 = r2.f173503E
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r4 == 0) goto L_0x0083
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            int r3 = r3.getMediaType()
            r4 = 2
            if (r3 != r4) goto L_0x0083
            r3 = 2131304482(0x7f092022, float:1.8227108E38)
            android.view.View r2 = r2.mo85812D(r3)
            com.tencent.mm.plugin.finder.view.FinderImageBanner r2 = (com.tencent.p014mm.plugin.finder.view.FinderImageBanner) r2
            r2.mo4584f()
        L_0x0083:
            int r1 = r1 + 1
            goto L_0x0048
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager.mo79662F1(androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a6  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79663G(java.util.List<? extends jq3.C9493c> r12, er1.C58744l r13, jq3.C60905o r14, int r15) {
        /*
            r11 = this;
            java.lang.String r15 = "source"
            gy3.C87412m.m108594g(r12, r15)
            java.lang.String r12 = "feed"
            gy3.C87412m.m108594g(r13, r12)
            java.lang.String r12 = "holder"
            gy3.C87412m.m108594g(r14, r12)
            qt1.c r12 = r11.f161964p
            java.lang.String r14 = "onFeedSelected"
            r12.mo12481a(r14)
            boolean r12 = r11.f161971w
            java.lang.String r14 = "Finder.VideoAutoPlayManager"
            if (r12 != 0) goto L_0x0035
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[playSelectedFeed] activity is not resume, tabType="
            r12.append(r13)
            int r13 = r11.f161962n
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r12)
            goto L_0x02dd
        L_0x0035:
            boolean r12 = r11.f161969u
            if (r12 == 0) goto L_0x0065
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[playSelectedFeed] isLocked="
            r12.append(r13)
            boolean r13 = r11.f161969u
            r12.append(r13)
            java.lang.String r13 = " lockKV="
            r12.append(r13)
            java.util.HashSet<java.lang.String> r13 = r11.f161968t
            r12.append(r13)
            java.lang.String r13 = " tabType="
            r12.append(r13)
            int r13 = r11.f161962n
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r12)
            goto L_0x02dd
        L_0x0065:
            com.tencent.mm.ui.MMFragmentActivity r12 = r11.f161958g
            boolean r15 = r12 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            r0 = 1
            r1 = 0
            if (r15 == 0) goto L_0x008b
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r12 = r15.mo62444c(r12)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r15 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.i0 r12 = r12.mo75002a(r15)
            java.lang.String r15 = "UICProvider.of(activity)…inderHomeUIC::class.java)"
            gy3.C87412m.m108593f(r12, r15)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r12 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r12
            int r12 = r12.mo5128d3()
            int r15 = r11.f161962n
            if (r12 != r15) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r12 = 0
            goto L_0x008c
        L_0x008b:
            r12 = 1
        L_0x008c:
            if (r12 != 0) goto L_0x00a6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[playSelectedFeed] isUserVisibleFocused=false tabType="
            r12.append(r13)
            int r13 = r11.f161962n
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r12)
            goto L_0x02dd
        L_0x00a6:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "playSelectedFeed feed:"
            r12.append(r15)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            long r2 = r13.f168204b
            int r12 = r11.f161967s
            r15 = 2
            if (r12 != r0) goto L_0x00f6
            long r4 = r11.f161966r
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x00f6
            r11.f161966r = r2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r4 = "send show comment msg,feedId:"
            r12.append(r4)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f161965q
            r12.removeMessages(r15)
            com.tencent.mm.sdk.platformtools.MMHandler r12 = r11.f161965q
            android.os.Message r12 = r12.obtainMessage(r15)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.obj = r2
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r11.f161965q
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.sendMessageDelayed(r12, r3)
        L_0x00f6:
            qt1.a r12 = new qt1.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FVPT-"
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r13.f168208f
            r3.append(r4)
            r4 = 46
            r3.append(r4)
            er1.p0 r5 = er1.C58764p0.f168246a
            com.tencent.mm.plugin.finder.storage.FeedData r6 = r13.f168206d
            r7 = 0
            if (r6 == 0) goto L_0x011d
            java.lang.String r6 = r6.getDescription()
            goto L_0x011e
        L_0x011d:
            r6 = r7
        L_0x011e:
            java.lang.String r6 = r5.mo83800a(r6)
            r3.append(r6)
            r3.append(r4)
            java.lang.String r4 = r13.f168205c
            java.lang.String r6 = "mediaId"
            gy3.C87412m.m108594g(r4, r6)
            r6 = 4
            java.lang.String r4 = r5.mo83801b(r4, r1, r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.<init>(r2)
            java.lang.String r2 = "onSelected"
            r12.mo12481a(r2)
            jq3.o r2 = r13.f168209g
            if (r2 != 0) goto L_0x0155
            java.lang.String r12 = "playSelectedFeed return for holder:null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r12)
            goto L_0x02dd
        L_0x0155:
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r13.f168206d
            if (r3 != 0) goto L_0x0160
            java.lang.String r12 = "playSelectedFeed return for feed:null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r12)
            goto L_0x02dd
        L_0x0160:
            int r4 = r2.mo17364k()
            int r5 = r2.mo17363j()
            if (r4 == r5) goto L_0x0201
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "playSelectedFeed holder="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " centerId="
            r4.append(r5)
            long r8 = r13.f168204b
            r4.append(r8)
            java.lang.String r5 = " adapterPosition="
            r4.append(r5)
            int r5 = r2.mo17363j()
            r4.append(r5)
            java.lang.String r5 = " layoutPosition="
            r4.append(r5)
            int r5 = r2.mo17364k()
            r4.append(r5)
            java.lang.String r5 = " isInLayout="
            r4.append(r5)
            androidx.recyclerview.widget.RecyclerView r5 = r11.f161959h
            boolean r5 = r5.isInLayout()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r4)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 20251(0x4f1b, float:2.8378E-41)
            java.lang.Object[] r9 = new java.lang.Object[r15]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r9[r1] = r10
            r9[r0] = r4
            r5.mo160131h(r8, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r2.hashCode()
            r4.append(r5)
            r5 = 95
            r4.append(r5)
            int r8 = r2.mo17363j()
            r4.append(r8)
            r4.append(r5)
            int r8 = r2.mo17364k()
            r4.append(r8)
            r4.append(r5)
            long r8 = r2.f44858h
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.util.HashSet<java.lang.String> r5 = r11.f161970v
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x0201
            androidx.recyclerview.widget.RecyclerView r12 = r11.f161959h
            hr1.j r13 = new hr1.j
            r13.<init>(r11, r4)
            r12.post(r13)
            goto L_0x02dd
        L_0x0201:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "playSelectedFeed mediaType:"
            r4.append(r5)
            int r5 = r3.getMediaType()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r4)
            int r4 = r3.getMediaType()
            if (r4 != r6) goto L_0x0224
            m65157G1(r11, r3, r2, r12)
            goto L_0x02bf
        L_0x0224:
            int r4 = r3.getMediaType()
            r5 = 9
            if (r4 != r5) goto L_0x0231
            m65157G1(r11, r3, r2, r12)
            goto L_0x02bf
        L_0x0231:
            int r12 = r3.getMediaType()
            if (r12 != r15) goto L_0x02a8
            r11.mo79662F1(r2)
            boolean r12 = r3.getHasBgmInfo()
            r15 = 2131305309(0x7f09235d, float:1.8228785E38)
            if (r12 == 0) goto L_0x0267
            er1.w3 r12 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r12 = r12.mo83882L(r2)
            android.view.View r3 = r2.mo85812D(r15)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r3
            if (r3 == 0) goto L_0x0254
            boolean r3 = r3.f17507V
            goto L_0x0255
        L_0x0254:
            r3 = 0
        L_0x0255:
            if (r3 != 0) goto L_0x0267
            if (r12 == 0) goto L_0x025f
            r12.mo78357e()
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x0260
        L_0x025f:
            r12 = r7
        L_0x0260:
            if (r12 != 0) goto L_0x0267
            java.lang.String r12 = "playMusicHolder musicContainer is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r12)
        L_0x0267:
            android.view.View r12 = r2.mo85812D(r15)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r12 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r12
            if (r12 == 0) goto L_0x0271
            boolean r1 = r12.f17507V
        L_0x0271:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "[playImage] isInSeekMode: "
            r12.append(r15)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            if (r1 != 0) goto L_0x0293
            r12 = 2131304482(0x7f092022, float:1.8227108E38)
            android.view.View r12 = r2.mo85812D(r12)
            com.tencent.mm.plugin.finder.view.FinderImageBanner r12 = (com.tencent.p014mm.plugin.finder.view.FinderImageBanner) r12
            r12.setAutoPlay(r0)
        L_0x0293:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "playSelectedFeed hit playImage feed:"
            r12.append(r15)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            goto L_0x02bf
        L_0x02a8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "playSelectedFeed hit pauseAllMedia feed:"
            r12.append(r15)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            r11.mo79662F1(r7)
        L_0x02bf:
            rs1.s8$a r12 = rs1.C13442s8.f38060Q0
            android.content.Context r14 = r2.f173499A
            java.lang.String r15 = "holder.context"
            gy3.C87412m.m108593f(r14, r15)
            rs1.s8 r12 = r12.mo12873f(r14)
            if (r12 == 0) goto L_0x02d2
            te3.hj1 r7 = r12.mo12861q3()
        L_0x02d2:
            java.lang.Class<ht1.j5> r12 = ht1.C8777j5.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ht1.j5 r12 = (ht1.C8777j5) r12
            r12.Tt0(r13, r7)
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager.mo79663G(java.util.List, er1.l, jq3.o, int):void");
    }

    /* renamed from: L0 */
    public void mo9561L0() {
        MMFragmentActivity mMFragmentActivity = this.f161958g;
        if (mMFragmentActivity != null) {
            mo77491x1(mMFragmentActivity, this);
        }
        C58553c y3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f161958g).mo75002a(C13442s8.class)).mo12867y3(this.f161962n);
        if (y3 != null) {
            y3.mo83450a(this);
        }
        if (!this.f161965q.hasMessages(1)) {
            this.f161965q.sendEmptyMessageDelayed(1, 500);
        }
    }

    /* renamed from: M0 */
    public void mo9562M0(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105924i("Finder.VideoAutoPlayManager", "[lock] scene=" + str + " isLock=" + z + " lockSize=" + this.f161968t.size() + " unLockAfterCheck=" + z2);
        if (z) {
            this.f161968t.add(str);
            this.f161969u = true;
        } else {
            this.f161968t.remove(str);
            if (this.f161968t.size() <= 0) {
                this.f161969u = false;
            }
        }
        this.f161965q.removeMessages(1);
        if (!this.f161969u && z2) {
            this.f161965q.sendEmptyMessage(1);
        }
    }

    /* renamed from: W0 */
    public void mo79664W0(List<? extends C9493c> list, C58744l lVar, C60905o oVar, int i) {
        C87412m.m108594g(list, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(lVar, "feed");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.VideoAutoPlayManager", "onFeedUnSelected position:" + i);
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.f44854d.findViewById(C0966R.C0970id.d7a);
        if (finderVideoLayout != null) {
            finderVideoLayout.setSelectedToPlay(false);
        }
    }

    /* renamed from: e */
    public void mo79665e(RecyclerView recyclerView, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Log.m105924i("Finder.VideoAutoPlayManager", "onPageScrollStateChanged state:" + i);
        if (i == 0) {
            this.f161964p.mo11310b("onViewIdle");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0093, code lost:
        r0 = r7.getMediaList();
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo79666n0(java.util.List<? extends jq3.C9493c> r6, er1.C58744l r7, jq3.C60905o r8, int r9) {
        /*
            r5 = this;
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r6 = "feed"
            gy3.C87412m.m108594g(r7, r6)
            java.lang.String r6 = "holder"
            gy3.C87412m.m108594g(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "onNextFeedPrepare position:"
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "Finder.VideoAutoPlayManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99124A4
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 == 0) goto L_0x0117
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r6 != 0) goto L_0x003f
            goto L_0x0117
        L_0x003f:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6
            co1.e r6 = r6.Hx0()
            boolean r6 = r6.f154570y
            if (r6 != 0) goto L_0x0056
            java.lang.String r6 = "preloadNextFeed return for canPreCreatedPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r6)
            goto L_0x012d
        L_0x0056:
            cm1.i2 r6 = r7.f168210h
            boolean r9 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x0070
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            gy3.C87412m.m108592e(r6, r9)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            boolean r6 = r6.mo3525y()
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = "preloadNextFeed return for needToPreload"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r6)
            goto L_0x012d
        L_0x0070:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "preloadNextFeed nextFeed:"
            r6.append(r9)
            long r0 = r7.f168204b
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            er1.w3 r6 = er1.C58784w3.f168295a
            jq3.o r6 = r7.f168209g
            com.tencent.mm.plugin.finder.storage.FeedData r7 = r7.f168206d
            r9 = 0
            if (r7 == 0) goto L_0x00a0
            java.util.LinkedList r0 = r7.getMediaList()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            goto L_0x00a1
        L_0x00a0:
            r0 = r9
        L_0x00a1:
            er1.j4 r1 = er1.C58739j4.f168176a
            if (r6 == 0) goto L_0x012d
            if (r7 == 0) goto L_0x012d
            if (r0 == 0) goto L_0x012d
            int r1 = r7.getMediaType()
            r2 = 4
            if (r1 != r2) goto L_0x012d
            long r1 = r7.getId()
            android.view.View r7 = r6.f44854d
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r7 = r7.findViewById(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r7 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r7
            if (r7 == 0) goto L_0x00f6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "prepareNextHolder "
            r9.append(r3)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            int r6 = r6.mo17363j()
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r9 = r7.f161854J
            if (r9 == 0) goto L_0x00f4
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r9.f161892a
            r3.setPosition(r6)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r6 = r7.getVideoCore()
            rs1.lb r6 = r6.mo79538z1()
            pl1.r0 r3 = r9.f161894c
            gr1.u1 r4 = new gr1.u1
            r4.<init>(r7, r9)
            r6.mo80069R(r7, r3, r4)
        L_0x00f4:
            rx3.b0 r9 = rx3.C13598b0.f38549a
        L_0x00f6:
            if (r9 != 0) goto L_0x012d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "prepareNextHolder videoContainer is null! mediaId="
            r6.append(r7)
            java.lang.String r7 = r0.f185275p
            r6.append(r7)
            java.lang.String r7 = "] feedId="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r6)
            goto L_0x012d
        L_0x0117:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "preloadNextFeed return for disable IS_ARM64:"
            r6.append(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r6)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager.mo79666n0(java.util.List, er1.l, jq3.o, int):void");
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f161965q.removeMessages(1);
        this.f161965q.removeMessages(2);
        this.f161971w = false;
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        MMFragmentActivity mMFragmentActivity = this.f161958g;
        if (mMFragmentActivity instanceof FinderHomeUI) {
            C39622i0 a = C39818r.f106831a.mo62444c(mMFragmentActivity).mo75002a(FinderHomeUIC.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…inderHomeUIC::class.java)");
            if (((FinderHomeUIC) a).mo5128d3() == this.f161962n && !this.f161965q.hasMessages(1)) {
                this.f161965q.sendEmptyMessage(1);
            }
        }
        this.f161971w = true;
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
    }

    /* renamed from: s1 */
    public void mo9563s1(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Finder.VideoAutoPlayManager", "[postCheck] source=" + str);
        this.f161965q.removeMessages(1);
        this.f161965q.sendEmptyMessage(1);
    }

    /* renamed from: y1 */
    public boolean mo2424y1() {
        return false;
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        if (!(bVar instanceof C7642k)) {
            return false;
        }
        int i = ((C7642k) bVar).f25951b;
        return i == 3 || i == 0 || i == 5 || i == 11;
    }
}
