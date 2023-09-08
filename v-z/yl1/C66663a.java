package yl1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import d92.C107028a;
import fy3.C32224a;
import gy3.C87412m;
import k92.C108976d;
import l92.C109296d;
import rx3.C13598b0;
import te3.C110959d13;
import wx2.C66204d;

/* renamed from: yl1.a */
public final class C66663a extends C108976d {

    /* renamed from: x */
    public static final C66665b f191683x = new C66665b();

    /* renamed from: y */
    public static final C66664a f191684y = new C66664a();

    /* renamed from: u */
    public final Context f191685u;

    /* renamed from: v */
    public C32224a<C13598b0> f191686v;

    /* renamed from: w */
    public C32224a<Boolean> f191687w;

    /* renamed from: yl1.a$a */
    public static final class C66664a implements C66204d.C66205b {
        /* renamed from: D1 */
        public void mo90306D1(MultiTaskInfo multiTaskInfo) {
            C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        }

        /* renamed from: Q0 */
        public void mo90307Q0(MultiTaskInfo multiTaskInfo) {
            C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
            C66663a.f191683x.mo90715a(multiTaskInfo, (C110959d13) null, false, (Activity) null);
        }

        /* renamed from: m1 */
        public void mo90308m1(MultiTaskInfo multiTaskInfo) {
            C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        }
    }

    /* renamed from: yl1.a$b */
    public static final class C66665b {
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00df, code lost:
            if (r0.putExtra("KEY_CACHE_OBJECT_NONCE_ID", r6.mo3513o().getObjectNonceId()) == null) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0149, code lost:
            if (r0.putExtra("key_multi_task_common_info", r7.toByteArray()) == null) goto L_0x014b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo90715a(com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo r20, te3.C110959d13 r21, boolean r22, android.app.Activity r23) {
            /*
                r19 = this;
                r1 = r20
                r2 = r21
                r3 = r23
                java.lang.Class<com.tencent.mm.plugin.multitask.k> r4 = com.tencent.p014mm.plugin.multitask.C105919k.class
                java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
                java.lang.String r6 = "MegaVideoMultiTaskHelper"
                java.lang.String r0 = "multiTaskInfo"
                gy3.C87412m.m108594g(r1, r0)
                te3.zv2 r7 = new te3.zv2
                r7.<init>()
                r8 = 0
                r9 = 1
                byte[] r0 = r1.field_data     // Catch:{ all -> 0x001e }
                r7.parseFrom(r0)     // Catch:{ all -> 0x001e }
                goto L_0x0028
            L_0x001e:
                r0 = move-exception
                java.lang.Object[] r10 = new java.lang.Object[r9]
                r10[r8] = r0
                java.lang.String r0 = "MegaVideoFloatBallInfo parse fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r10)
            L_0x0028:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r10 = r7.f186888j
                java.lang.String r11 = "data.cacheNewVideoList"
                gy3.C87412m.m108593f(r10, r11)
                int r12 = r7.f186884f
                java.lang.Object r10 = sx3.C110818d0.m150917O(r10, r12)
                if (r10 != 0) goto L_0x0054
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "onTaskBarItemClicked: currVideoPos item is null pos = "
                r10.append(r12)
                int r12 = r7.f186884f
                r10.append(r12)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)
                r7.f186884f = r8
            L_0x0054:
                java.lang.String r6 = r1.field_id
                r7.f186882d = r6
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r7.f186888j
                gy3.C87412m.m108593f(r6, r11)
                java.util.ArrayList r10 = new java.util.ArrayList
                r11 = 10
                int r11 = sx3.C36907w.m41090l(r6, r11)
                r10.<init>(r11)
                java.util.Iterator r6 = r6.iterator()
            L_0x006c:
                boolean r11 = r6.hasNext()
                if (r11 == 0) goto L_0x008d
                java.lang.Object r11 = r6.next()
                com.tencent.mm.protocal.protobuf.FinderObject r11 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r11
                com.tencent.mm.plugin.finder.storage.FinderItem$a r12 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                java.lang.String r13 = "it"
                gy3.C87412m.m108593f(r11, r13)
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r12.mo79056a(r11, r9)
                wp1.f$a r12 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r12.mo14348k(r11)
                r10.add(r11)
                goto L_0x006c
            L_0x008d:
                int r6 = r7.f186884f
                java.lang.Object r6 = sx3.C110818d0.m150917O(r10, r6)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
                if (r6 == 0) goto L_0x009c
                java.util.List r6 = sx3.C26236u.m33719b(r6)
                goto L_0x00a1
            L_0x009c:
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
            L_0x00a1:
                r13 = r6
                java.lang.Object r6 = sx3.C110818d0.m150916N(r13)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
                java.lang.String r10 = "KEY_CACHE_OBJECT_ID"
                if (r6 == 0) goto L_0x00e1
                long r11 = r7.f186889n
                long r14 = eb0.C31543z5.m39453c()
                int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r16 <= 0) goto L_0x00c6
                er1.w3 r11 = er1.C58784w3.f168295a
                int r12 = r7.f186884f
                pe3.b r14 = r7.f186886h
                r16 = 0
                r17 = 16
                r18 = 0
                r15 = r0
                er1.C58784w3.m68427B1(r11, r12, r13, r14, r15, r16, r17, r18)
            L_0x00c6:
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r6.mo3513o()
                long r11 = r11.getId()
                r0.putExtra(r10, r11)
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
                java.lang.String r6 = r6.getObjectNonceId()
                java.lang.String r11 = "KEY_CACHE_OBJECT_NONCE_ID"
                android.content.Intent r6 = r0.putExtra(r11, r6)
                if (r6 != 0) goto L_0x00e6
            L_0x00e1:
                long r11 = r7.f186891p
                r0.putExtra(r10, r11)
            L_0x00e6:
                di3.d r6 = di3.C86312j.m106911c(r5)
                ht1.t1 r6 = (ht1.C60200t1) r6
                r10 = 4
                r6.mo76876sZ(r10, r0)
                java.lang.String r6 = "KEY_ROUTER_UI"
                r0.putExtra(r6, r8)
                byte[] r6 = r7.toByteArray()
                java.lang.String r11 = "KEY_FLOAT_BALL_INFO"
                r0.putExtra(r11, r6)
                int r6 = r7.f186885g
                long r6 = (long) r6
                r11 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 * r11
                java.lang.String r11 = "KEY_VIDEO_START_PLAY_TIME_MS"
                r0.putExtra(r11, r6)
                di3.d r6 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.multitask.k r6 = (com.tencent.p014mm.plugin.multitask.C105919k) r6
                java.lang.String r6 = r6.mo151046eZ(r1)
                java.lang.String r7 = "KEY_VIDEO_THUMB_LOCAL_PATH"
                r0.putExtra(r7, r6)
                java.lang.String r6 = "key_multi_task_common_info"
                if (r2 == 0) goto L_0x014b
                te3.ry r7 = new te3.ry
                r7.<init>()
                r7.f141210d = r2
                r2 = r22 ^ 1
                r7.f141212f = r2
                if (r3 == 0) goto L_0x0141
                java.lang.Class<ox.b> r2 = p640ox.C77049b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ox.b r2 = (p640ox.C77049b) r2
                r11 = 5
                pe3.a r2 = r2.mo72346DT(r3, r11)
                te3.i13 r2 = (te3.C110964i13) r2
                if (r2 == 0) goto L_0x013e
                java.lang.String r2 = r2.f332057d
                goto L_0x013f
            L_0x013e:
                r2 = 0
            L_0x013f:
                r7.f141211e = r2
            L_0x0141:
                byte[] r2 = r7.toByteArray()
                android.content.Intent r2 = r0.putExtra(r6, r2)
                if (r2 != 0) goto L_0x015b
            L_0x014b:
                te3.ry r2 = new te3.ry
                r2.<init>()
                r7 = r22 ^ 1
                r2.f141212f = r7
                byte[] r2 = r2.toByteArray()
                r0.putExtra(r6, r2)
            L_0x015b:
                r2 = 536870912(0x20000000, float:1.0842022E-19)
                r0.addFlags(r2)
                di3.d r2 = di3.C86312j.m106911c(r5)
                ht1.t1 r2 = (ht1.C60200t1) r2
                if (r22 == 0) goto L_0x016b
                r5 = 18
                goto L_0x016d
            L_0x016b:
                r5 = 17
            L_0x016d:
                r6 = 2
                java.lang.String r2 = r2.mo76842e7(r5, r6, r10, r0)
                if (r22 == 0) goto L_0x01cc
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "{\"feedid\":"
                r5.append(r6)
                java.lang.String r6 = r1.field_id
                r5.append(r6)
                r6 = 125(0x7d, float:1.75E-43)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "key_extra_info"
                r0.putExtra(r6, r5)
                di3.d r4 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.multitask.k r4 = (com.tencent.p014mm.plugin.multitask.C105919k) r4
                java.lang.String r5 = r1.field_id
                java.lang.String r6 = "multiTaskInfo.field_id"
                gy3.C87412m.m108593f(r5, r6)
                int r4 = r4.us0(r5)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                te3.hj1 r6 = new te3.hj1
                r6.<init>()
                r6.f134671e = r2
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r7 = r1.field_id
                java.lang.String r10 = "feedid"
                r2.put(r10, r7)
                int r4 = r4 + r9
                java.lang.String r7 = "feed_index"
                r2.put(r7, r4)
                long r10 = r1.field_createTime
                java.lang.String r1 = "import_time"
                r2.put(r1, r10)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "float_feed"
                r5.mo8577a(r6, r1, r9, r2)
            L_0x01cc:
                java.lang.Class<er1.b> r1 = er1.C58684b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(ActivityRouter::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                er1.b r1 = (er1.C58684b) r1
                if (r3 == 0) goto L_0x01dd
                r2 = r3
                goto L_0x01e1
            L_0x01dd:
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            L_0x01e1:
                java.lang.String r4 = "activity ?: MMApplicationContext.getContext()"
                gy3.C87412m.m108593f(r2, r4)
                r1.ey0(r2, r0, r8)
                if (r22 == 0) goto L_0x01f0
                if (r3 == 0) goto L_0x01f0
                r3.overridePendingTransition(r8, r8)
            L_0x01f0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yl1.C66663a.C66665b.mo90715a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo, te3.d13, boolean, android.app.Activity):void");
        }
    }

    /* renamed from: yl1.a$c */
    public static final class C66666c implements C109296d {

        /* renamed from: a */
        public final /* synthetic */ C66663a f191688a;

        public C66666c(C66663a aVar) {
            this.f191688a = aVar;
        }

        /* renamed from: a */
        public void mo90716a(Bitmap bitmap, boolean z, int i) {
        }

        /* renamed from: b */
        public void mo90717b(int i) {
            this.f191688a.mo160098W((Bitmap) null, false, false, true);
        }

        /* renamed from: c */
        public void mo90718c(Bitmap bitmap, int i) {
            this.f191688a.mo160098W((Bitmap) null, false, false, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66663a(Context context, C107028a aVar) {
        super(aVar);
        C87412m.m108594g(context, "context");
        this.f191685u = context;
    }

    /* renamed from: Z */
    public static void m78645Z(C66663a aVar, Bitmap bitmap, int[] iArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        C107028a aVar2 = aVar.f326423e;
        if (aVar2 != null) {
            if (bitmap == null) {
                bitmap = z ? aVar.f326434p : aVar.mo160089o(aVar2.getBitmap());
            }
            aVar.mo160090r(bitmap, true);
        }
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return true;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return true;
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        super.mo35809D(i, str);
        this.f326429k = new C66666c(this);
    }

    /* renamed from: G */
    public void mo67895G(boolean z) {
        mo124068H(z, 1);
    }

    /* renamed from: R */
    public void mo90713R(boolean z) {
        super.mo90713R(true);
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        return super.mo67896U(i, z);
    }

    /* renamed from: X */
    public boolean mo90714X() {
        C32224a<Boolean> aVar = this.f191687w;
        return !(aVar != null && !aVar.invoke().booleanValue());
    }

    /* renamed from: d */
    public void mo67897d() {
        C32224a<C13598b0> aVar = this.f191686v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: y */
    public boolean mo35811y() {
        return true;
    }
}
