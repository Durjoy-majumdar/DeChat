package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderEmptyFeedLoader;
import di3.C86312j;
import gy3.C87412m;
import h81.C59774i;
import java.util.Map;
import kf1.C9788i3;
import kf1.C9806j3;
import kf1.C9854m5;
import kotlin.Metadata;
import p185kq.C10383h;
import p217oq.C11716d;
import q31.C118148a;
import rs1.C13287j5;
import rs1.C13298k5;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C90364q0;
import u24.C90599h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoNewFormUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lkf1/j3;", "Lkf1/i3;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI */
public final class FinderHorizontalVideoNewFormUI extends FinderLoaderFeedUI<BaseFinderFeedLoader, C9806j3, C9788i3> {

    /* renamed from: s */
    public C9788i3 f14423s;

    /* renamed from: t */
    public C9806j3 f14424t;

    /* renamed from: u */
    public FinderEmptyFeedLoader f14425u = new FinderEmptyFeedLoader();

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI$a */
    public static final class C2936a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderHorizontalVideoNewFormUI f14426a;

        public C2936a(FinderHorizontalVideoNewFormUI finderHorizontalVideoNewFormUI) {
            this.f14426a = finderHorizontalVideoNewFormUI;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14426a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f14426a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 162;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: O7 */
    public BaseFinderFeedLoader mo2938O7() {
        return this.f14425u;
    }

    /* renamed from: P7 */
    public FinderLoaderFeedUIContract$Presenter mo2939P7() {
        C9788i3 i3Var = this.f14423s;
        if (i3Var != null) {
            return i3Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: R7 */
    public C9854m5 mo2940R7() {
        C9806j3 j3Var = this.f14424t;
        if (j3Var != null) {
            return j3Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: java.lang.Class<rs1.n3>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: bo1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: bo1.e} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x04ed, code lost:
        if (r2 == false) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02dd, code lost:
        if (eb0.C31543z5.m39453c() < (r8.getTimestamps() + (((long) r8.getFeedObject().urlValidDuration) * 1000))) goto L_0x02e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x04d2  */
    /* renamed from: S7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2941S7() {
        /*
            r41 = this;
            r0 = r41
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            android.content.Intent r2 = r41.getIntent()
            java.lang.String r3 = "feed_object_id"
            r4 = 0
            long r2 = r2.getLongExtra(r3, r4)
            android.content.Intent r6 = r41.getIntent()
            java.lang.String r7 = "feed_encrypted_object_id"
            java.lang.String r6 = r6.getStringExtra(r7)
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x0020
            r9 = r7
            goto L_0x0021
        L_0x0020:
            r9 = r6
        L_0x0021:
            android.content.Intent r6 = r41.getIntent()
            java.lang.String r8 = "feed_object_nonceId"
            java.lang.String r6 = r6.getStringExtra(r8)
            if (r6 != 0) goto L_0x002f
            r10 = r7
            goto L_0x0030
        L_0x002f:
            r10 = r6
        L_0x0030:
            kf1.i3 r6 = new kf1.i3
            r6.<init>(r0)
            r0.f14423s = r6
            kf1.j3 r7 = new kf1.j3
            r8 = 162(0xa2, float:2.27E-43)
            r15 = 2
            r7.<init>(r0, r6, r15, r8)
            r0.f14424t = r7
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r6 = r14.mo62444c(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC> r7 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC r6 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) r6
            android.app.Activity r7 = r6.getContext()
            android.view.LayoutInflater r7 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r7)
            r8 = 2131494710(0x7f0c0736, float:1.8612936E38)
            r13 = 0
            r12 = 0
            android.view.View r7 = r7.inflate(r8, r13, r12)
            java.lang.String r8 = "getInflater(context).inf…awer_layout, null, false)"
            gy3.C87412m.m108593f(r7, r8)
            r6.f18675e = r7
            android.app.Activity r7 = r6.getContext()
            int r7 = kg3.C76577a.m92159j(r7)
            android.app.Activity r8 = r6.getContext()
            int r8 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r8)
            int r7 = r7 + r8
            ds1.a r8 = ds1.C7515a.f25777a
            android.app.Activity r11 = r6.getContext()
            float r8 = r8.mo8637a(r11)
            float r7 = (float) r7
            float r7 = r7 * r8
            android.app.Activity r8 = r6.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131166492(0x7f07051c, float:1.794723E38)
            float r8 = r8.getDimension(r11)
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            android.app.Activity r13 = r6.getContext()
            r11.<init>(r13)
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r13.<init>(r4, r4)
            r11.setLayoutParams(r13)
            android.view.View r4 = r6.f18675e
            java.lang.String r5 = "drawerContainer"
            if (r4 == 0) goto L_0x058d
            r13 = 2131305999(0x7f09260f, float:1.8230185E38)
            android.view.View r4 = r4.findViewById(r13)
            android.widget.TextView r4 = (android.widget.TextView) r4
            as1.a$a r13 = new as1.a$a
            r13.<init>()
            r13.f712d = r7
            r13.f709a = r8
            bs1.c r7 = new bs1.c
            android.app.Activity r25 = r6.getContext()
            r26 = 2131099798(0x7f060096, float:1.781196E38)
            r27 = 2131099676(0x7f06001c, float:1.7811712E38)
            r28 = 2131233007(0x7f0808ef, float:1.808214E38)
            r29 = 0
            r24 = r7
            r24.<init>(r25, r26, r27, r28, r29)
            r13.f713e = r7
            bs1.b r7 = new bs1.b
            android.view.View r8 = r6.f18675e
            if (r8 == 0) goto L_0x0588
            r7.<init>(r8)
            r13.f714f = r7
            android.app.Activity r5 = r6.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131099798(0x7f060096, float:1.781196E38)
            int r5 = r5.getColor(r7)
            r13.f720l = r5
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$a r5 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$a
            r5.<init>()
            java.util.Set<bs1.d> r7 = r13.f716h
            java.util.HashSet r7 = (java.util.HashSet) r7
            r7.add(r5)
            bs1.b r5 = new bs1.b
            r5.<init>(r11)
            r13.f715g = r5
            rs1.d5 r5 = new rs1.d5
            r5.<init>(r6, r11)
            java.util.List<as1.a$b> r7 = r13.f718j
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r5)
            rs1.e5 r5 = new rs1.e5
            r5.<init>(r4)
            java.util.List<as1.a$b> r7 = r13.f718j
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r5)
            androidx.appcompat.app.AppCompatActivity r5 = r6.getActivity()
            boolean r7 = r5 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r7 == 0) goto L_0x0128
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            goto L_0x0129
        L_0x0128:
            r5 = 0
        L_0x0129:
            if (r5 == 0) goto L_0x0136
            com.tencent.mm.ui.MMActivityController r5 = r5.getController()
            if (r5 == 0) goto L_0x0136
            android.view.View r5 = r5.mo177094s()
            goto L_0x0137
        L_0x0136:
            r5 = 0
        L_0x0137:
            boolean r7 = r5 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x013e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            if (r5 != 0) goto L_0x014f
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r6.findViewById(r5)
            java.lang.String r7 = "findViewById(android.R.id.content)"
            gy3.C87412m.m108593f(r5, r7)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x014f:
            as1.a r5 = r13.mo235a(r5)
            r6.f18674d = r5
            as1.a r5 = r6.mo5141e3()
            rs1.f5 r7 = new rs1.f5
            r7.<init>(r6)
            r5.setContentReachTop(r7)
            as1.a r5 = r6.mo5141e3()
            r5.mo4919k(r15, r12)
            as1.a r5 = r6.mo5141e3()
            r13 = 1
            r5.setDrawerOpen(r13)
            java.lang.String r5 = "drawerTitleView"
            gy3.C87412m.m108593f(r4, r5)
            er1.C7919x.m8091a(r4)
            rs1.g5 r4 = new rs1.g5
            r4.<init>(r6)
            as1.a r5 = r6.mo5141e3()
            android.widget.FrameLayout r5 = r5.getHeaderContainer()
            r5.setOnClickListener(r4)
            as1.a r5 = r6.mo5141e3()
            android.widget.FrameLayout r5 = r5.getCenterContainer()
            r5.setOnClickListener(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1 r4 = r6.f18678h
            r4.alive()
            bl3.r$a r4 = r14.mo62444c(r0)
            java.lang.Class<rs1.k5> r5 = rs1.C13298k5.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            rs1.k5 r4 = (rs1.C13298k5) r4
            kf1.i3 r5 = r0.f14423s
            if (r5 == 0) goto L_0x0581
            kf1.j3 r11 = r0.f14424t
            if (r11 == 0) goto L_0x0579
            r4.getClass()
            java.lang.Class<rs1.n3> r7 = rs1.C63575n3.class
            r4.f37741h = r5
            r4.f37742i = r11
            r4.f37737d = r2
            r4.f37739f = r9
            r4.f37740g = r10
            android.app.Activity r5 = r4.getContext()
            android.content.Intent r5 = r5.getIntent()
            r6 = 31
            java.lang.String r8 = "key_reuqest_scene"
            int r5 = r5.getIntExtra(r8, r6)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r8 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader
            android.app.Activity r6 = r4.getContext()
            bl3.r$a r6 = r14.mo62443b(r6)
            java.lang.Class<rs1.s8> r12 = rs1.C13442s8.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r12)
            rs1.s8 r6 = (rs1.C13442s8) r6
            te3.hj1 r18 = r6.mo12861q3()
            r12 = 301(0x12d, float:4.22E-43)
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 3840(0xf00, float:5.381E-42)
            r27 = 0
            java.lang.String r28 = ""
            r6 = r8
            r30 = r7
            r31 = r8
            r7 = r2
            r29 = r11
            r11 = r12
            r12 = r19
            r13 = r5
            r5 = r14
            r14 = r28
            r15 = r18
            r16 = r20
            r17 = r21
            r18 = r24
            r19 = r25
            r20 = r26
            r21 = r27
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            android.app.Activity r6 = r4.getContext()
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "context.intent"
            gy3.C87412m.m108593f(r6, r7)
            r7 = r31
            r7.initFromCache(r6)
            com.tencent.mm.plugin.finder.feed.model.w0 r13 = r7.getCache()
            if (r13 == 0) goto L_0x024d
            java.util.ArrayList<cm1.i2> r6 = r13.f14079a
            if (r6 == 0) goto L_0x0239
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0236
            goto L_0x0239
        L_0x0236:
            r6 = 1
            r12 = 0
            goto L_0x023b
        L_0x0239:
            r6 = 1
            r12 = 1
        L_0x023b:
            r8 = r12 ^ 1
            if (r8 == 0) goto L_0x0240
            goto L_0x0241
        L_0x0240:
            r13 = 0
        L_0x0241:
            if (r13 == 0) goto L_0x024e
            rs1.l5 r8 = new rs1.l5
            r8.<init>(r4, r7)
            r7.setInitDone(r8)
            r12 = 1
            goto L_0x024f
        L_0x024d:
            r6 = 1
        L_0x024e:
            r12 = 0
        L_0x024f:
            rs1.m5 r8 = new rs1.m5
            r8.<init>(r4)
            r7.f13574t = r8
            r4.f37743j = r7
            java.lang.String r7 = "FinderHorizontalVideoNewFormUIC"
            r8 = 0
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x030e
            vp1.e r8 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo89871e(r2)
            if (r8 == 0) goto L_0x02f3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "use cache cacheTime="
            r9.append(r10)
            long r10 = r8.getTimestamps()
            r13 = 1000(0x3e8, float:1.401E-42)
            long r13 = (long) r13
            long r10 = r10 / r13
            java.lang.String r15 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r10 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r10)
            r9.append(r10)
            java.lang.String r10 = ", cacheTime="
            r9.append(r10)
            long r10 = r8.getTimestamps()
            r9.append(r10)
            java.lang.String r10 = " current="
            r9.append(r10)
            long r10 = eb0.C31543z5.m39453c()
            long r10 = r10 / r13
            java.lang.String r10 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r15, r10)
            r9.append(r10)
            java.lang.String r10 = ", urlValidDuration="
            r9.append(r10)
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r8.getFeedObject()
            int r10 = r10.urlValidDuration
            r9.append(r10)
            r10 = 115(0x73, float:1.61E-43)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            long r9 = r8.getTimestamps()
            r13 = 0
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x02e0
            long r9 = eb0.C31543z5.m39453c()
            long r13 = r8.getTimestamps()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r8.getFeedObject()
            int r11 = r11.urlValidDuration
            r15 = r7
            long r6 = (long) r11
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r16
            long r13 = r13 + r6
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x02f4
            goto L_0x02e1
        L_0x02e0:
            r15 = r7
        L_0x02e1:
            wp1.f$a r6 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r6.mo14348k(r8)
            boolean r7 = r6 instanceof cm1.C55018j0
            if (r7 == 0) goto L_0x02ef
            r13 = r6
            cm1.j0 r13 = (cm1.C55018j0) r13
            goto L_0x02f0
        L_0x02ef:
            r13 = 0
        L_0x02f0:
            r4.f37744n = r13
            goto L_0x02f4
        L_0x02f3:
            r15 = r7
        L_0x02f4:
            android.app.Activity r6 = r4.getContext()
            bl3.r$a r6 = r5.mo62443b(r6)
            java.lang.Class<rs1.l7> r7 = rs1.C13317l7.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            rs1.l7 r6 = (rs1.C13317l7) r6
            java.lang.String r7 = o40.C61926c.m72691p(r2)
            java.lang.String r8 = "first_feedid"
            r6.mo12758c3(r8, r7)
            goto L_0x030f
        L_0x030e:
            r15 = r7
        L_0x030f:
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r6 = r4.mo12749g3()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataListJustForAdapter()
            r6.clear()
            com.tencent.mm.view.RefreshLoadMoreLayout r6 = r4.mo12750i3()
            androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r7 = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager
            android.app.Activity r8 = r4.getContext()
            r7.<init>(r8)
            r6.setLayoutManager(r7)
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView
            if (r7 == 0) goto L_0x034a
            r7 = r6
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r7 = (com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView) r7
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r7.getLayoutManager()
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r9 == 0) goto L_0x0343
            r13 = r8
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r13 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r13
            r8 = 2
            r9 = 0
            goto L_0x0346
        L_0x0343:
            r8 = 2
            r9 = 0
            r13 = 0
        L_0x0346:
            com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView.m63293z1(r7, r13, r9, r8, r9)
            goto L_0x034b
        L_0x034a:
            r9 = 0
        L_0x034b:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r7 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoNewFormUIC$buildItemCoverts$1 r8 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoNewFormUIC$buildItemCoverts$1
            r8.<init>()
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r10 = r4.mo12749g3()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r10 = r10.getDataListJustForAdapter()
            r11 = 0
            r7.<init>(r8, r10, r11)
            r4.f37748r = r7
            rs1.p5 r8 = new rs1.p5
            r8.<init>(r4)
            r7.f173488o = r8
            r6.setAdapter(r7)
            com.tencent.mm.view.RefreshLoadMoreLayout r7 = r4.mo12750i3()
            rs1.q5 r8 = new rs1.q5
            r8.<init>(r4)
            r7.setActionCallback(r8)
            rs1.r5 r7 = new rs1.r5
            r7.<init>(r4)
            zp3.C23564m.m28137g(r6, r7)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r6 = r4.mo12749g3()
            rx3.g r7 = r4.f37749s
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            rs1.j5 r7 = (rs1.C13287j5) r7
            r6.register(r7)
            android.app.Activity r6 = r4.getContext()
            bl3.r$a r6 = r5.mo62443b(r6)
            r7 = r30
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            rs1.n3 r6 = (rs1.C63575n3) r6
            android.app.Activity r8 = r4.getContext()
            android.content.Intent r8 = r8.getIntent()
            android.os.Bundle r8 = r8.getExtras()
            r6.mo88425i3(r8)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r8 = r4.mo12749g3()
            r6.f180282h = r8
            cm1.j0 r6 = r4.f37744n
            if (r6 == 0) goto L_0x0443
            android.view.View r8 = r4.mo12747e3()
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r10.mo10233c(r13)
            java.lang.Object[] r34 = r10.mo10232b()
            java.lang.String r35 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC"
            java.lang.String r36 = "attach"
            java.lang.String r37 = "(Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$Presenter;Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$ViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            r33 = r8
            j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
            java.lang.Object r10 = r10.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.setVisibility(r10)
            java.lang.String r34 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC"
            java.lang.String r35 = "attach"
            java.lang.String r36 = "(Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$Presenter;Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$ViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            j20.C117292a.m165359e(r33, r34, r35, r36, r37, r38, r39)
            r4.mo12753l3(r11)
            rs1.n5 r8 = new rs1.n5
            r8.<init>(r4, r6)
            r13 = 0
            o40.C61926c.m72666K(r13, r8)
            android.app.Activity r6 = r4.getContext()
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r8 = "FLOAT_BALL_KEY"
            java.lang.String r6 = r6.getStringExtra(r8)
            if (r6 == 0) goto L_0x0425
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0421
            goto L_0x0425
        L_0x0421:
            r6 = 1
            r32 = 0
            goto L_0x0428
        L_0x0425:
            r6 = 1
            r32 = 1
        L_0x0428:
            r8 = r32 ^ 1
            if (r8 != 0) goto L_0x042f
            r4.mo12752k3(r6)
        L_0x042f:
            android.app.Activity r10 = r4.getContext()
            bl3.r$a r10 = r5.mo62443b(r10)
            androidx.lifecycle.i0 r10 = r10.mo75002a(r7)
            rs1.n3 r10 = (rs1.C63575n3) r10
            r10.mo88427k3(r6)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0445
        L_0x0443:
            r13 = r9
            r8 = 0
        L_0x0445:
            if (r13 != 0) goto L_0x04a3
            android.view.View r6 = r4.mo12747e3()
            r10 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.mo10233c(r10)
            java.lang.Object[] r17 = r13.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC"
            java.lang.String r19 = "attach"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$Presenter;Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$ViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r10 = r13.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r6.setVisibility(r10)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC"
            java.lang.String r18 = "attach"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$Presenter;Lcom/tencent/mm/plugin/finder/feed/FinderHorizontalVideoNewFormContract$ViewCallback;JLjava/lang/String;Ljava/lang/String;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.app.Activity r6 = r4.getContext()
            bl3.r$a r5 = r5.mo62443b(r6)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r7)
            rs1.n3 r5 = (rs1.C63575n3) r5
            r5.mo88427k3(r11)
            r5 = 1
            r4.mo12753l3(r5)
        L_0x04a3:
            j31.a$b r5 = j31.C9276a.f29023b
            j31.a r5 = r5.mo10053a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "3688+"
            r6.append(r7)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r6.append(r2)
            java.lang.String r2 = "+0+31"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            j31.b r2 = r5.mo10052a(r2)
            boolean r3 = r2 instanceof bo1.C0341e
            if (r3 == 0) goto L_0x04cf
            r13 = r2
            bo1.e r13 = (bo1.C0341e) r13
            goto L_0x04d0
        L_0x04cf:
            r13 = r9
        L_0x04d0:
            if (r13 == 0) goto L_0x04f0
            boolean r2 = r13.mo380g()
            if (r2 == 0) goto L_0x04ec
            te3.lp0 r2 = r13.mo382j()
            if (r2 == 0) goto L_0x04e7
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r2 = r2.f137560d
            if (r2 == 0) goto L_0x04e7
            int r2 = r2.size()
            goto L_0x04e8
        L_0x04e7:
            r2 = 0
        L_0x04e8:
            if (r2 <= 0) goto L_0x04ec
            r2 = 1
            goto L_0x04ed
        L_0x04ec:
            r2 = 0
        L_0x04ed:
            if (r2 == 0) goto L_0x04f0
            goto L_0x04f1
        L_0x04f0:
            r13 = r9
        L_0x04f1:
            if (r13 == 0) goto L_0x04f5
            r2 = 1
            goto L_0x04f6
        L_0x04f5:
            r2 = 0
        L_0x04f6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onAttach: hasPreloadCache="
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = ", isFromFloatBall="
            r3.append(r5)
            r3.append(r8)
            java.lang.String r5 = ", hasInitCache="
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r5 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            if (r8 == 0) goto L_0x051f
            if (r12 != 0) goto L_0x0523
        L_0x051f:
            if (r8 != 0) goto L_0x052f
            if (r2 == 0) goto L_0x052f
        L_0x0523:
            r4.mo12752k3(r11)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r2 = r4.mo12749g3()
            r3 = 1
            com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(r2, r11, r3, r9)
            goto L_0x0532
        L_0x052f:
            r4.mo12751j3()
        L_0x0532:
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r29.mo10308D()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            mf1.g1 r3 = new mf1.g1
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r29.mo10308D()
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99256P4
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r3.<init>(r5, r4, r6)
            r2.mo17043c(r3)
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            o31.a r3 = o31.C76986a.Finder
            l31.e r2 = r2.mo86179qs(r0, r3)
            r3 = 168(0xa8, float:2.35E-43)
            r4 = 24184(0x5e78, float:3.3889E-41)
            r2.mo86148No(r0, r3, r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI$a r2 = new com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI$a
            r2.<init>(r0)
            r1.E60(r0, r2)
            return
        L_0x0579:
            r9 = 0
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            throw r9
        L_0x0581:
            r9 = 0
            java.lang.String r1 = "presenter"
            gy3.C87412m.m108603p(r1)
            throw r9
        L_0x0588:
            r9 = 0
            gy3.C87412m.m108603p(r5)
            throw r9
        L_0x058d:
            r9 = 0
            gy3.C87412m.m108603p(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHorizontalVideoNewFormUI.mo2941S7():void");
    }

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return true;
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_t;
    }

    public void onDestroy() {
        C13298k5 k5Var = (C13298k5) C39818r.f106831a.mo62444c(this).mo75002a(C13298k5.class);
        k5Var.mo12749g3().unregister((C13287j5) ((C36570n) k5Var.f37749s).getValue());
        super.onDestroy();
    }
}
