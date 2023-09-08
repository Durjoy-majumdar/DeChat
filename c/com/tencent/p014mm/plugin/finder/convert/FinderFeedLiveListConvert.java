package com.tencent.p014mm.plugin.finder.convert;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0707a0;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C10008v1;
import os1.C62153d;
import rs1.C13457t3;
import rs1.C63512a;
import rs1.C63586o;
import rx3.C13604l;
import rx3.C36570n;
import te3.C49712hj1;
import tf0.C13887q1;
import ve1.C14655v2;
import ve1.C14674w2;
import zp3.C23564m;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert */
public final class FinderFeedLiveListConvert extends C60896i<C0707a0> {

    /* renamed from: e */
    public final C10008v1 f12801e;

    /* renamed from: f */
    public final C49712hj1 f12802f;

    /* renamed from: g */
    public final int f12803g;

    /* renamed from: h */
    public final String f12804h = "FinderFeedLiveListConvert";

    /* renamed from: i */
    public ArrayList<C0740i2> f12805i = new ArrayList<>();

    /* renamed from: j */
    public C0707a0 f12806j = new C0707a0();

    /* renamed from: n */
    public boolean f12807n;

    /* renamed from: o */
    public WxRecyclerAdapter<?> f12808o;

    /* renamed from: p */
    public LinearLayoutManager f12809p;

    /* renamed from: q */
    public RecyclerView.C0130p f12810q;

    /* renamed from: r */
    public C2410a f12811r = new C2410a(this);

    /* renamed from: s */
    public boolean f12812s;

    /* renamed from: t */
    public boolean f12813t;

    /* renamed from: u */
    public long f12814u;

    /* renamed from: v */
    public C9500j f12815v = new FinderFeedLiveListConvert$itemConvertFactory$1(this);

    /* renamed from: w */
    public final C2413d f12816w = new C2413d(this);

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert$a */
    public static final class C2410a implements C63512a {

        /* renamed from: a */
        public final FinderFeedLiveListConvert f12817a;

        /* renamed from: b */
        public RecyclerView f12818b;

        public C2410a(FinderFeedLiveListConvert finderFeedLiveListConvert) {
            C87412m.m108594g(finderFeedLiveListConvert, "convert");
            this.f12817a = finderFeedLiveListConvert;
        }

        /* renamed from: a */
        public void mo2404a(int i) {
            RecyclerView.C16631z I0;
            RecyclerView recyclerView = this.f12818b;
            WxRecyclerView wxRecyclerView = recyclerView instanceof WxRecyclerView ? (WxRecyclerView) recyclerView : null;
            if (wxRecyclerView != null && (I0 = wxRecyclerView.mo17023I0(0)) != null && (I0 instanceof C60905o)) {
                C60905o oVar = (C60905o) I0;
                Object obj = oVar.f173503E;
                if ((obj instanceof C0707a0) && C87412m.m108589b(obj, this.f12817a.f12806j)) {
                    this.f12817a.mo2401j(oVar, i);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert$b */
    public static final class C2411b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<?> f12819d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedLiveListConvert f12820e;

        public C2411b(WxRecyclerAdapter<?> wxRecyclerAdapter, FinderFeedLiveListConvert finderFeedLiveListConvert) {
            this.f12819d = wxRecyclerAdapter;
            this.f12820e = finderFeedLiveListConvert;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0120 A[SYNTHETIC] */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r33, android.view.View r34, int r35, androidx.recyclerview.widget.RecyclerView.C16631z r36) {
            /*
                r32 = this;
                r0 = r32
                r1 = r36
                jq3.o r1 = (jq3.C60905o) r1
                java.lang.String r2 = "adapter"
                r3 = r33
                gy3.C87412m.m108594g(r3, r2)
                java.lang.String r2 = "view"
                r3 = r34
                gy3.C87412m.m108594g(r3, r2)
                java.lang.String r2 = "holder"
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r2 = r0.f12819d
                int r2 = r2.mo85796c6()
                int r2 = r35 - r2
                com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert r3 = r0.f12820e
                java.lang.String r3 = r3.f12804h
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "click item "
                r4.append(r5)
                java.lang.String r5 = ""
                if (r2 < 0) goto L_0x004c
                com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert r6 = r0.f12820e
                java.util.ArrayList<cm1.i2> r6 = r6.f12805i
                int r6 = r6.size()
                if (r2 >= r6) goto L_0x004c
                com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert r6 = r0.f12820e
                java.util.ArrayList<cm1.i2> r6 = r6.f12805i
                java.lang.Object r6 = r6.get(r2)
                java.lang.String r7 = "adapterData[clickPos]"
                gy3.C87412m.m108593f(r6, r7)
                goto L_0x004d
            L_0x004c:
                r6 = r5
            L_0x004d:
                r4.append(r6)
                java.lang.String r6 = " pos:"
                r4.append(r6)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert r3 = r0.f12820e
                java.util.ArrayList<cm1.i2> r4 = r3.f12805i
                java.lang.Class<er1.b> r6 = er1.C58684b.class
                java.lang.Class<ht1.j5> r7 = ht1.C8777j5.class
                java.lang.String r8 = "dataList"
                gy3.C87412m.m108594g(r4, r8)
                java.lang.Object r8 = r1.f173503E
                boolean r9 = r8 instanceof cm1.C0712b0
                java.lang.String r10 = "holder.context"
                r11 = 1
                if (r9 == 0) goto L_0x0209
                r9 = r8
                cm1.b0 r9 = (cm1.C0712b0) r9
                com.tencent.mm.protocal.protobuf.FinderObject r12 = r9.f1709d
                r15 = 0
                if (r12 == 0) goto L_0x008e
                java.lang.String r12 = r12.username
                if (r12 == 0) goto L_0x008e
                int r12 = r12.length()
                if (r12 != 0) goto L_0x0089
                r12 = 1
                goto L_0x008a
            L_0x0089:
                r12 = 0
            L_0x008a:
                if (r12 != r11) goto L_0x008e
                r12 = 1
                goto L_0x008f
            L_0x008e:
                r12 = 0
            L_0x008f:
                if (r12 == 0) goto L_0x009a
                java.lang.String r1 = r3.f12804h
                java.lang.String r2 = "gotoLive err username is empty!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                goto L_0x026d
            L_0x009a:
                com.tencent.mm.protocal.protobuf.FinderObject r12 = r9.f1709d
                java.lang.String r12 = r12.username
                zc1.b r13 = zc1.C66785b.f191882e
                java.lang.String r13 = r13.mo90662O5()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r13)
                java.lang.String r14 = "getService(ActivityRouter::class.java)"
                if (r12 == 0) goto L_0x00f6
                di3.d r2 = di3.C86312j.m106911c(r6)
                gy3.C87412m.m108593f(r2, r14)
                r15 = r2
                tf0.o1 r15 = (tf0.C13883o1) r15
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r10)
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r9.f1709d
                long r3 = r2.f164794id
                java.lang.String r6 = r2.objectNonceId
                if (r6 != 0) goto L_0x00c6
                r19 = r5
                goto L_0x00c8
            L_0x00c6:
                r19 = r6
            L_0x00c8:
                te3.c21 r2 = r2.liveInfo
                if (r2 != 0) goto L_0x00d1
                te3.c21 r2 = new te3.c21
                r2.<init>()
            L_0x00d1:
                r20 = r2
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r9.f1709d
                java.lang.String r2 = r2.sessionBuffer
                r27 = r2
                r28 = 0
                r29 = 0
                r30 = 7152(0x1bf0, float:1.0022E-41)
                r31 = 0
                r16 = r1
                r17 = r3
                tf0.C13883o1.C13884a.m13249a(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                goto L_0x026d
            L_0x00f6:
                di3.d r7 = di3.C86312j.m106911c(r7)
                r12 = r7
                ht1.j5 r12 = (ht1.C8777j5) r12
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r9.f1709d
                java.lang.String r7 = r7.username
                r34 = r12
                long r11 = (long) r2
                ak1.f0$q r17 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR
                java.lang.String r18 = r3.mo2403l()
                r19 = r11
                r12 = r34
                r13 = r9
                r2 = r14
                r14 = r7
                r7 = 0
                r15 = r19
                r12.mo9604Pw(r13, r14, r15, r17, r18)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0120:
                boolean r12 = r4.hasNext()
                if (r12 == 0) goto L_0x0153
                java.lang.Object r12 = r4.next()
                r13 = r12
                cm1.i2 r13 = (cm1.C0740i2) r13
                boolean r14 = r13 instanceof cm1.C0712b0
                if (r14 == 0) goto L_0x014c
                r14 = r13
                cm1.b0 r14 = (cm1.C0712b0) r14
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.f1709d
                te3.c21 r14 = r14.liveInfo
                if (r14 == 0) goto L_0x0141
                int r14 = r14.f182394f
                r15 = 2
                if (r14 != r15) goto L_0x0141
                r15 = 1
                goto L_0x0142
            L_0x0141:
                r15 = 0
            L_0x0142:
                if (r15 == 0) goto L_0x014a
                boolean r13 = gy3.C87412m.m108589b(r13, r8)
                if (r13 == 0) goto L_0x014c
            L_0x014a:
                r15 = 1
                goto L_0x014d
            L_0x014c:
                r15 = 0
            L_0x014d:
                if (r15 == 0) goto L_0x0120
                r11.add(r12)
                goto L_0x0120
            L_0x0153:
                di3.d r4 = di3.C86312j.m106911c(r6)
                gy3.C87412m.m108593f(r4, r2)
                r12 = r4
                tf0.o1 r12 = (tf0.C13883o1) r12
                android.content.Context r13 = r1.f173499A
                gy3.C87412m.m108593f(r13, r10)
                int r15 = r11.indexOf(r9)
                if (r15 < 0) goto L_0x0169
                goto L_0x016a
            L_0x0169:
                r15 = 0
            L_0x016a:
                cj1.b1 r14 = new cj1.b1
                r14.<init>()
                r14.f153420i = r15
                int r2 = r3.f12803g
                r14.f153421j = r2
                rs1.s8$a r2 = rs1.C13442s8.f38060Q0
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r10)
                rs1.s8 r1 = r2.mo12873f(r1)
                if (r1 == 0) goto L_0x0189
                te3.hj1 r1 = r1.mo12861q3()
                int r1 = r1.f134675i
                goto L_0x018a
            L_0x0189:
                r1 = 0
            L_0x018a:
                r14.f153422k = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = sx3.C36907w.m41090l(r11, r2)
                r1.<init>(r2)
                java.util.Iterator r2 = r11.iterator()
            L_0x019b:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x01bf
                java.lang.Object r4 = r2.next()
                cm1.b0 r4 = (cm1.C0712b0) r4
                java.lang.Class<tf0.q1> r6 = tf0.C13887q1.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                java.lang.String r8 = "getService(IFinderCommonLiveService::class.java)"
                gy3.C87412m.m108593f(r6, r8)
                tf0.q1 r6 = (tf0.C13887q1) r6
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f1709d
                r8 = 1
                com.tencent.mm.live.api.LiveConfig r4 = r6.mo13324QR(r4, r8, r7)
                r1.add(r4)
                goto L_0x019b
            L_0x01bf:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                r14.f153423l = r2
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r9.f1709d
                java.lang.String r1 = r1.nickname
                if (r1 != 0) goto L_0x01cd
                r1 = r5
            L_0x01cd:
                r14.f153436y = r1
                java.lang.Object r1 = sx3.C110818d0.m150917O(r11, r15)
                cm1.b0 r1 = (cm1.C0712b0) r1
                if (r1 == 0) goto L_0x01e2
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f1709d
                if (r1 == 0) goto L_0x01e2
                te3.c21 r1 = r1.liveInfo
                if (r1 == 0) goto L_0x01e2
                int r15 = r1.f182406t
                goto L_0x01e3
            L_0x01e2:
                r15 = 0
            L_0x01e3:
                r14.f153426o = r15
                te3.hj1 r1 = r3.f12802f
                if (r1 == 0) goto L_0x01f0
                java.lang.String r2 = r1.f134671e
                if (r2 != 0) goto L_0x01ee
                goto L_0x01f0
            L_0x01ee:
                r15 = r2
                goto L_0x01f1
            L_0x01f0:
                r15 = r5
            L_0x01f1:
                if (r1 == 0) goto L_0x01fb
                java.lang.String r1 = r1.f134672f
                if (r1 != 0) goto L_0x01f8
                goto L_0x01fb
            L_0x01f8:
                r16 = r1
                goto L_0x01fd
            L_0x01fb:
                r16 = r5
            L_0x01fd:
                r17 = 0
                r18 = 0
                r19 = 48
                r20 = 0
                tf0.C13883o1.C13884a.m13251c(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                goto L_0x026d
            L_0x0209:
                boolean r4 = r8 instanceof cm1.C0727e0
                if (r4 == 0) goto L_0x026d
                java.lang.Class<ns3.d> r4 = ns3.C11266d.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                ns3.d r4 = (ns3.C11266d) r4
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r10)
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                cm1.a0 r6 = r3.f12806j
                pe3.b r6 = r6.f1690d
                if (r6 == 0) goto L_0x024a
                byte[] r8 = r6.mo123703f()
                java.lang.String r9 = "nearby_live_target_last_buffer_params_key"
                r5.putExtra(r9, r8)
                java.lang.String r8 = "nearby_live_target_auto_refresh_params_key"
                r9 = 1
                r5.putExtra(r8, r9)
                java.lang.String r8 = r3.f12804h
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "gotoLive lastBuffer:"
                r9.append(r10)
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            L_0x024a:
                te3.hj1 r6 = r3.f12802f
                if (r6 == 0) goto L_0x0255
                java.lang.String r6 = r6.f134671e
                java.lang.String r8 = "key_context_id"
                r5.putExtra(r8, r6)
            L_0x0255:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                r4.mo9184Nw(r1, r5)
                di3.d r1 = di3.C86312j.m106911c(r7)
                r4 = r1
                ht1.j5 r4 = (ht1.C8777j5) r4
                r5 = 0
                r6 = 0
                long r7 = (long) r2
                ak1.f0$q r9 = ak1.C54067f0.C54078q.LIVE_CLICK_MORE_LIVE
                java.lang.String r10 = r3.mo2403l()
                r4.mo9604Pw(r5, r6, r7, r9, r10)
            L_0x026d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert.C2411b.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert$c */
    public static final class C2412c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedLiveListConvert f12821d;

        public C2412c(FinderFeedLiveListConvert finderFeedLiveListConvert) {
            this.f12821d = finderFeedLiveListConvert;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            boolean z;
            int size;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                FinderFeedLiveListConvert finderFeedLiveListConvert = this.f12821d;
                int D = linearLayoutManager.mo16958D();
                C0707a0 a0Var = finderFeedLiveListConvert.f12806j;
                if (!a0Var.f1693g || (i2 = size - D) > 5 || finderFeedLiveListConvert.f12807n) {
                    z = false;
                } else {
                    String str = finderFeedLiveListConvert.f12804h;
                    Log.m105924i(str, "[needToLoadMore] size:" + (size = a0Var.f1691e.size()) + ", lastPos:" + D + ", leftSize:" + i2 + ", loading:" + finderFeedLiveListConvert.f12807n);
                    z = true;
                }
                if (z) {
                    finderFeedLiveListConvert.f12807n = true;
                    C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
                    ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13330Tz(finderFeedLiveListConvert.f12806j.f1690d, finderFeedLiveListConvert.f12803g, ((Number) X0.f38555d).floatValue(), ((Number) X0.f38556e).floatValue(), new C14655v2(finderFeedLiveListConvert)).mo9225i();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, this.f12821d.mo2403l(), C0075i.EVENT_ON_SCROLL_HORIZONTAL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$bindAdapter$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert$d */
    public static final class C2413d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedLiveListConvert f12822d;

        public C2413d(FinderFeedLiveListConvert finderFeedLiveListConvert) {
            this.f12822d = finderFeedLiveListConvert;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, this.f12822d.mo2403l(), C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public FinderFeedLiveListConvert(C10008v1 v1Var, C49712hj1 hj12, int i) {
        this.f12801e = v1Var;
        this.f12802f = hj12;
        this.f12803g = i;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6251q;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        FinderHomeTabFragment finderHomeTabFragment;
        ViewTreeObserver viewTreeObserver;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
        this.f12811r.f12818b = recyclerView;
        C10008v1 v1Var = this.f12801e;
        FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        if (!(finderTimelinePresenter == null || (finderHomeTabFragment = finderTimelinePresenter.f13267h) == null)) {
            C63586o oVar = (C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class);
            C2410a aVar = this.f12811r;
            oVar.getClass();
            C87412m.m108594g(aVar, "actionBarLayoutChangeListener");
            Log.m105924i("Finder.DoubleClickTipUIC", "registActionBarLayoutChangeListener, actionBarLayoutChangeListener:" + aVar + '!');
            oVar.f180313p = aVar;
            ViewGroup viewGroup = (ViewGroup) ((C36570n) oVar.f180306f).getValue();
            if (!(viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) ((C36570n) oVar.f180317t).getValue());
            }
        }
        Log.m105924i(this.f12804h, "[onAttachedToRecyclerView]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: cm1.i2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01fe A[EDGE_INSN: B:163:0x01fe->B:71:0x01fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f8 A[LOOP:2: B:54:0x01cd->B:69:0x01f8, LOOP_END] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r22, jq3.C9493c r23, int r24, int r25, boolean r26, java.util.List r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r27
            r3 = r23
            cm1.a0 r3 = (cm1.C0707a0) r3
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.String r4 = r0.f12804h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[updateLiveList]onBindViewHolder holder"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ",position:"
            r5.append(r6)
            r6 = r24
            r5.append(r6)
            java.lang.String r6 = ", tabType:"
            r5.append(r6)
            int r6 = r0.f12803g
            r5.append(r6)
            java.lang.String r6 = ",data:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ",payloads:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x005b
            boolean r6 = r27.isEmpty()
            if (r6 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r6 = 0
            goto L_0x005c
        L_0x005b:
            r6 = 1
        L_0x005c:
            r7 = 2131307697(0x7f092cb1, float:1.8233629E38)
            if (r6 != 0) goto L_0x00ea
            java.util.Iterator r6 = r27.iterator()
        L_0x0065:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00ea
            java.lang.Object r9 = r6.next()
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0065
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r6 = gy3.C87412m.m108589b(r9, r6)
            if (r6 == 0) goto L_0x00ea
            android.view.View r6 = r1.mo85812D(r7)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x008a
            androidx.recyclerview.widget.RecyclerView$e r6 = r6.getAdapter()
            goto L_0x008b
        L_0x008a:
            r6 = 0
        L_0x008b:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r9 = r0.f12808o
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 == 0) goto L_0x00ea
            java.lang.String r6 = r0.f12804h
            java.lang.String r9 = "scrollToPosition 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            android.view.View r6 = r1.mo85812D(r7)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r12 = "updatePayload"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/List;)Z"
            java.lang.String r14 = "Undefined"
            java.lang.String r16 = "scrollToPosition"
            java.lang.String r17 = "(I)V"
            r9 = r6
            r8 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r8 = r8.mo10231a(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.mo17115r1(r8)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r11 = "updatePayload"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/List;)Z"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "scrollToPosition"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r6 = 1
            goto L_0x00eb
        L_0x00ea:
            r6 = 0
        L_0x00eb:
            if (r6 == 0) goto L_0x00ef
            goto L_0x04ae
        L_0x00ef:
            java.util.ArrayList<cm1.i2> r6 = r0.f12805i
            r6.clear()
            java.util.ArrayList<cm1.i2> r6 = r0.f12805i
            java.util.ArrayList<cm1.i2> r8 = r3.f1691e
            r6.addAll(r8)
            android.view.View r6 = r1.mo85812D(r7)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0108
            androidx.recyclerview.widget.RecyclerView$e r6 = r6.getAdapter()
            goto L_0x0109
        L_0x0108:
            r6 = 0
        L_0x0109:
            r0.f12812s = r4
            r0.f12813t = r4
            r8 = 0
            r0.f12814u = r8
            if (r2 == 0) goto L_0x011c
            boolean r10 = r27.isEmpty()
            if (r10 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r10 = 0
            goto L_0x011d
        L_0x011c:
            r10 = 1
        L_0x011d:
            r11 = 3
            r12 = 2
            if (r10 != 0) goto L_0x0164
            java.util.Iterator r2 = r27.iterator()
        L_0x0125:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0164
            java.lang.Object r10 = r2.next()
            boolean r13 = r10 instanceof rx3.C13604l
            if (r13 == 0) goto L_0x0125
            rx3.l r10 = (rx3.C13604l) r10
            A r13 = r10.f38555d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r14 = gy3.C87412m.m108589b(r13, r14)
            if (r14 == 0) goto L_0x0144
            r0.f12812s = r5
            goto L_0x0125
        L_0x0144:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x0125
            B r10 = r10.f38556e
            boolean r13 = r10 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0125
            r0.f12813t = r5
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Long"
            gy3.C87412m.m108592e(r10, r13)
            java.lang.Long r10 = (java.lang.Long) r10
            long r13 = r10.longValue()
            r0.f12814u = r13
            goto L_0x0125
        L_0x0164:
            java.lang.String r2 = r0.f12804h
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "[bindToTargetAdapter] tabType:"
            r10.append(r13)
            int r13 = r0.f12803g
            r10.append(r13)
            java.lang.String r13 = ",holderAdapter:"
            r10.append(r13)
            r10.append(r6)
            java.lang.String r13 = ",innderAdapter:"
            r10.append(r13)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r13 = r0.f12808o
            r10.append(r13)
            java.lang.String r13 = ",same adapter:"
            r10.append(r13)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r13 = r0.f12808o
            boolean r13 = gy3.C87412m.m108589b(r6, r13)
            r10.append(r13)
            java.lang.String r13 = ",isLoadMore:"
            r10.append(r13)
            boolean r13 = r0.f12812s
            r10.append(r13)
            java.lang.String r13 = ",isLiveStatusChange:"
            r10.append(r13)
            boolean r13 = r0.f12813t
            r10.append(r13)
            java.lang.String r13 = ",liveIdToChange:"
            r10.append(r13)
            long r13 = r0.f12814u
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r2 = r0.f12808o
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 == 0) goto L_0x027b
            boolean r2 = r0.f12813t
            if (r2 == 0) goto L_0x0223
            java.util.ArrayList<cm1.i2> r2 = r0.f12805i
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L_0x01cd:
            boolean r10 = r2.hasNext()
            r13 = -1
            if (r10 == 0) goto L_0x01fd
            java.lang.Object r10 = r2.next()
            cm1.i2 r10 = (cm1.C0740i2) r10
            boolean r14 = r10 instanceof cm1.C0712b0
            if (r14 == 0) goto L_0x01f4
            cm1.b0 r10 = (cm1.C0712b0) r10
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f1709d
            if (r10 == 0) goto L_0x01eb
            te3.c21 r10 = r10.liveInfo
            if (r10 == 0) goto L_0x01eb
            long r14 = r10.f182392d
            goto L_0x01ec
        L_0x01eb:
            r14 = r8
        L_0x01ec:
            long r8 = r0.f12814u
            int r10 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x01f4
            r8 = 1
            goto L_0x01f5
        L_0x01f4:
            r8 = 0
        L_0x01f5:
            if (r8 == 0) goto L_0x01f8
            goto L_0x01fe
        L_0x01f8:
            int r6 = r6 + 1
            r8 = 0
            goto L_0x01cd
        L_0x01fd:
            r6 = -1
        L_0x01fe:
            if (r6 != r13) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            int r6 = r6 + 1
        L_0x0203:
            java.lang.String r2 = r0.f12804h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "[bindToTargetAdapter] indexToUpdate:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            if (r6 == r13) goto L_0x022a
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r2 = r0.f12808o
            if (r2 == 0) goto L_0x022a
            r2.notifyItemChanged(r6)
            goto L_0x022a
        L_0x0223:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?> r2 = r0.f12808o
            if (r2 == 0) goto L_0x022a
            r2.notifyDataSetChanged()
        L_0x022a:
            boolean r2 = r0.f12812s
            if (r2 != 0) goto L_0x027e
            boolean r2 = r0.f12813t
            if (r2 != 0) goto L_0x027e
            android.view.View r2 = r1.mo85812D(r7)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L_0x027e
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r7)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r16 = "bindToTargetAdapter"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/List;)V"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "scrollToPosition"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r6 = r6.mo10231a(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.mo17115r1(r6)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r15 = "bindToTargetAdapter"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/util/List;)V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "scrollToPosition"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x027e
        L_0x027b:
            r21.mo2402k(r22)
        L_0x027e:
            r2 = 2131307794(0x7f092d12, float:1.8233825E38)
            android.view.View r2 = r1.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.util.ArrayList<cm1.i2> r6 = r0.f12805i
            if (r6 == 0) goto L_0x0294
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0292
            goto L_0x0294
        L_0x0292:
            r6 = 0
            goto L_0x0295
        L_0x0294:
            r6 = 1
        L_0x0295:
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            r8 = 8
            if (r6 == 0) goto L_0x02a0
            r2.setVisibility(r8)
            goto L_0x02f4
        L_0x02a0:
            android.text.TextPaint r6 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r6, r7)
            int r6 = r0.f12803g
            if (r6 == r5) goto L_0x02df
            if (r6 == r12) goto L_0x02c9
            if (r6 == r11) goto L_0x02b3
            r2.setVisibility(r8)
            goto L_0x02f4
        L_0x02b3:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131827436(0x7f111aec, float:1.9287785E38)
            java.lang.String r6 = r6.getString(r9)
            r2.setText(r6)
            r2.setVisibility(r4)
            goto L_0x02f4
        L_0x02c9:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131827641(0x7f111bb9, float:1.92882E38)
            java.lang.String r6 = r6.getString(r9)
            r2.setText(r6)
            r2.setVisibility(r4)
            goto L_0x02f4
        L_0x02df:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131827458(0x7f111b02, float:1.928783E38)
            java.lang.String r6 = r6.getString(r9)
            r2.setText(r6)
            r2.setVisibility(r4)
        L_0x02f4:
            int r2 = r0.f12803g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r8 = 2131305104(0x7f092290, float:1.822837E38)
            if (r2 != r12) goto L_0x03e0
            java.util.ArrayList<cm1.i2> r2 = r0.f12805i
            if (r2 == 0) goto L_0x030b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x030a
            goto L_0x030b
        L_0x030a:
            r5 = 0
        L_0x030b:
            if (r5 == 0) goto L_0x030f
            goto L_0x03e0
        L_0x030f:
            androidx.recyclerview.widget.RecyclerView$e r2 = r1.f173500B
            boolean r5 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r5 == 0) goto L_0x0438
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r2
            java.util.List r2 = r2.getData()
            java.util.Iterator r2 = r2.iterator()
        L_0x031f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x039f
            java.lang.Object r5 = r2.next()
            jq3.c r5 = (jq3.C9493c) r5
            boolean r5 = r5 instanceof cm1.C0707a0
            if (r5 != 0) goto L_0x031f
            android.view.View r2 = r1.mo85812D(r8)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r6)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r12 = "refreshFooterTips"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveList;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r11 = "refreshFooterTips"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveList;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r2 = 2131305134(0x7f0922ae, float:1.822843E38)
            android.view.View r2 = r1.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.text.TextPaint r5 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r5, r7)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131827642(0x7f111bba, float:1.9288202E38)
            java.lang.String r5 = r5.getString(r6)
            r2.setText(r5)
            java.lang.String r2 = r0.f12804h
            java.lang.String r5 = "show footer!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            goto L_0x0438
        L_0x039f:
            android.view.View r2 = r1.mo85812D(r8)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r5.mo10233c(r6)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r9 = "refreshFooterTips"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveList;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r8 = "refreshFooterTips"
            java.lang.String r9 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveList;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0438
        L_0x03e0:
            java.lang.String r2 = r0.f12804h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "refreshFooterTips,fragmentTabType:"
            r5.append(r7)
            int r7 = r0.f12803g
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            android.view.View r2 = r1.mo85812D(r8)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r5.mo10233c(r6)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r12 = "refreshFooterTips"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveList;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedLiveListConvert"
            java.lang.String r11 = "refreshFooterTips"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLiveList;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0438:
            r0.f12806j = r3
            kf1.v1 r2 = r0.f12801e
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter
            if (r3 == 0) goto L_0x0443
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r2
            goto L_0x0444
        L_0x0443:
            r2 = 0
        L_0x0444:
            if (r2 == 0) goto L_0x04ae
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r2 = r2.f13267h
            if (r2 == 0) goto L_0x04ae
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r2 = r3.mo62445d(r2)
            java.lang.Class<rs1.o> r3 = rs1.C63586o.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.o r2 = (rs1.C63586o) r2
            r3 = 2131296429(0x7f0900ad, float:1.8210774E38)
            android.view.View r2 = r2.findViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0467
            int r4 = r2.getMeasuredHeight()
        L_0x0467:
            androidx.recyclerview.widget.RecyclerView r2 = r22.mo85811C()
            java.lang.String r3 = "holder.recyclerView"
            gy3.C87412m.m108593f(r2, r3)
            boolean r3 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerView
            if (r3 == 0) goto L_0x0477
            com.tencent.mm.view.recyclerview.WxRecyclerView r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r2
            goto L_0x0478
        L_0x0477:
            r2 = 0
        L_0x0478:
            if (r2 == 0) goto L_0x047f
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            goto L_0x0480
        L_0x047f:
            r2 = 0
        L_0x0480:
            boolean r3 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r3 == 0) goto L_0x0487
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r2
            goto L_0x0488
        L_0x0487:
            r2 = 0
        L_0x0488:
            if (r2 == 0) goto L_0x0498
            java.util.List r2 = r2.getData()
            if (r2 == 0) goto L_0x0498
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            r8 = r2
            cm1.i2 r8 = (cm1.C0740i2) r8
            goto L_0x0499
        L_0x0498:
            r8 = 0
        L_0x0499:
            boolean r2 = r8 instanceof cm1.C0707a0
            if (r2 == 0) goto L_0x04ae
            android.content.Context r2 = r1.f173499A
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            android.content.Context r3 = r1.f173499A
            int r3 = com.tencent.p014mm.p136ui.C75044y4.m89989a(r3)
            int r2 = r2 + r3
            int r2 = r2 + r4
            r0.mo2401j(r1, r2)
        L_0x04ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        mo2402k(oVar);
        recyclerView.mo17043c(this.f12816w);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.fww);
        C87412m.m108593f(wxRecyclerView, "this");
        C23564m.m28137g(wxRecyclerView, new C14674w2(this));
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        FinderHomeTabFragment finderHomeTabFragment;
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        Log.m105924i(this.f12804h, "[onDetachedFromRecyclerView]");
        recyclerView.mo17098m1(this.f12816w);
        C10008v1 v1Var = this.f12801e;
        FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        if (finderTimelinePresenter != null && (finderHomeTabFragment = finderTimelinePresenter.f13267h) != null) {
            ((C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88440k3();
        }
    }

    /* renamed from: j */
    public final void mo2401j(C60905o oVar, int i) {
        View D = oVar.mo85812D(C0966R.C0970id.fv4);
        if (D != null) {
            D.setPadding(D.getPaddingLeft(), i, D.getPaddingRight(), D.getPaddingBottom());
            String str = this.f12804h;
            Log.m105924i(str, "adjustLayoutPadding newHeight:" + i);
        }
    }

    /* renamed from: k */
    public final void mo2402k(C60905o oVar) {
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.fww);
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(this.f12815v, this.f12805i, false);
        this.f12808o = wxRecyclerAdapter;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(C79406f.m96347a(context, 10.0f), 1));
        C60898l.m71329W5(wxRecyclerAdapter, view, 1, false, 4, (Object) null);
        Context context2 = oVar.f173499A;
        C87412m.m108593f(context2, "holder.context");
        View view2 = new View(context2);
        view2.setLayoutParams(new LinearLayout.LayoutParams(C79406f.m96347a(context2, 10.0f), 1));
        C60898l.m71327S5(wxRecyclerAdapter, view2, 2, false, 4, (Object) null);
        wxRecyclerAdapter.f173488o = new C2411b(wxRecyclerAdapter, this);
        this.f12809p = new LinearLayoutManager(oVar.f173499A, 0, false);
        this.f12810q = new C2412c(this);
        wxRecyclerView.setAdapter(this.f12808o);
        wxRecyclerView.setLayoutManager(this.f12809p);
        RecyclerView.C0130p pVar = this.f12810q;
        if (pVar != null) {
            wxRecyclerView.mo17043c(pVar);
        }
        wxRecyclerView.setHasFixedSize(true);
        C10008v1 v1Var = this.f12801e;
        FinderHomeTabFragment finderHomeTabFragment = null;
        FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        FinderHomeTabFragment finderHomeTabFragment2 = finderTimelinePresenter != null ? finderTimelinePresenter.f13267h : null;
        if (finderHomeTabFragment2 instanceof Fragment) {
            finderHomeTabFragment = finderHomeTabFragment2;
        }
        if (finderHomeTabFragment != null) {
            ((C13457t3) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C13457t3.class)).f38155h = true;
        }
        String str = this.f12804h;
        Log.m105924i(str, "[bindAdapter] tabType:" + this.f12803g + ",innderAdapter:" + this.f12808o);
    }

    /* renamed from: l */
    public final String mo2403l() {
        int i = this.f12803g;
        return i == 1 ? "temp_9" : (i != 3 && i == 2) ? "temp_10" : "temp_1";
    }
}
