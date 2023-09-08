package ph1;

import a14.C53973z1;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import f50.C58924d;
import fk1.C59113a;
import fk1.C59114b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ph1.i */
public final class C62293i {

    /* renamed from: a */
    public static final C62293i f177081a = new C62293i();

    /* renamed from: b */
    public static HashMap<Long, C53973z1> f177082b = new HashMap<>();

    /* renamed from: c */
    public static boolean f177083c;

    /* renamed from: d */
    public static boolean f177084d = true;

    /* renamed from: e */
    public static boolean f177085e;

    /* renamed from: f */
    public static boolean f177086f;

    /* renamed from: g */
    public static final HashMap<Long, C62297m> f177087g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<Long, C62292g> f177088h = new HashMap<>();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ph1.C62290e mo87356a(long r8) {
        /*
            r7 = this;
            java.util.HashMap<java.lang.Long, ph1.g> r0 = f177088h
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Object r1 = r0.get(r1)
            ph1.g r1 = (ph1.C62292g) r1
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99135B6
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0047
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99578z6
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0042
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r2 != 0) goto L_0x0042
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r2 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r2 == 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            r5 = 0
            if (r2 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0050
            f50.d r2 = r1.f177095g
            goto L_0x0051
        L_0x0050:
            r2 = r5
        L_0x0051:
            if (r2 == 0) goto L_0x0067
            f50.d r2 = r1.f177095g
            gy3.C87412m.m108591d(r2)
            boolean r2 = r2.isPlaying()
            if (r2 == 0) goto L_0x0067
            boolean r2 = r1.f177079l
            if (r2 != 0) goto L_0x0067
            boolean r2 = f177083c
            if (r2 == 0) goto L_0x0067
            r3 = 1
        L_0x0067:
            ph1.e r2 = new ph1.e
            r2.<init>(r8, r3, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = " checkAutoPlay feedId: "
            r4.append(r6)
            r4.append(r8)
            java.lang.String r6 = "  canReusePlayer:"
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = "  isFloatWindow: "
            r4.append(r3)
            if (r1 == 0) goto L_0x008e
            boolean r1 = r1.f177079l
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L_0x008e:
            r4.append(r5)
            java.lang.String r1 = "  feedId= "
            r4.append(r1)
            r4.append(r8)
            java.lang.String r8 = " map = "
            r4.append(r8)
            r4.append(r0)
            java.lang.String r8 = r4.toString()
            java.lang.String r9 = "FinderFluentSwitchManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ph1.C62293i.mo87356a(long):ph1.e");
    }

    /* renamed from: b */
    public final void mo87357b(C62297m mVar) {
        C58924d dVar;
        boolean z = mVar instanceof C62291f ? ((C62291f) mVar).mo84321f().f177079l : false;
        if (mVar instanceof C59113a) {
            z = ((C59114b) ((C59113a) mVar).f169076e.mo88668x()).f177079l;
        }
        Log.m105924i("FinderFluentSwitchManager", "checkDirectorPlayerStop releaseDirector: " + mVar + " isFloatWindow: " + z + " isLiveRoomOnDestroy: " + f177084d + " isDetach: " + mVar.mo84320e());
        if (!z) {
            if (mVar instanceof C62288c) {
                C58924d dVar2 = ((C62288c) mVar).f177064e.f186980z;
                if (dVar2 != null) {
                    dVar2.stopPlay(true);
                }
            } else {
                C62294j f = mVar.mo84321f();
                if (!(f == null || (dVar = f.f177095g) == null)) {
                    dVar.stopPlay(true);
                }
            }
            mVar.mo84322g();
        }
    }

    /* renamed from: c */
    public final void mo87358c() {
        StringBuilder sb = new StringBuilder();
        sb.append("clearFluentList exitParamsSize: ");
        sb.append(f177088h.size());
        sb.append(" directorSize: ");
        HashMap<Long, C62297m> hashMap = f177087g;
        sb.append(hashMap.size());
        Log.m105924i("FinderFluentSwitchManager", sb.toString());
        for (Map.Entry<Long, C62297m> value : hashMap.entrySet()) {
            f177081a.mo87357b((C62297m) value.getValue());
        }
        f177087g.clear();
        f177088h.clear();
    }

    /* renamed from: d */
    public final void mo87359d(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("clearFluentList feedId: ");
        sb.append(j);
        sb.append(" exitParamsSize: ");
        HashMap<Long, C62292g> hashMap = f177088h;
        sb.append(hashMap);
        sb.append(" directorSize: ");
        HashMap<Long, C62297m> hashMap2 = f177087g;
        sb.append(hashMap2);
        Log.m105924i("FinderFluentSwitchManager", sb.toString());
        C62297m remove = hashMap2.remove(Long.valueOf(j));
        if (remove != null) {
            f177081a.mo87357b(remove);
        }
        hashMap.remove(Long.valueOf(j));
    }

    /* renamed from: e */
    public final C62297m mo87360e(long j) {
        return f177087g.get(Long.valueOf(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0103 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87361f() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "release size:"
            r0.append(r1)
            java.util.HashMap<java.lang.Long, ph1.m> r1 = f177087g
            int r2 = r1.size()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FinderFluentSwitchManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r1 = r0.hasNext()
            java.lang.String r3 = " isFloatWindow: "
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getKey()
            java.lang.Number r6 = (java.lang.Number) r6
            r6.longValue()
            java.lang.Object r1 = r1.getValue()
            ph1.m r1 = (ph1.C62297m) r1
            boolean r6 = r1 instanceof ph1.C62291f
            if (r6 == 0) goto L_0x0059
            r6 = r1
            ph1.f r6 = (ph1.C62291f) r6
            ph1.g r6 = r6.mo84321f()
            boolean r6 = r6.f177079l
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "square exit start releaseDirector: "
            r7.append(r8)
            r7.append(r1)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = " isLiveRoomOnDestroy: "
            r7.append(r3)
            boolean r3 = f177084d
            r7.append(r3)
            java.lang.String r3 = " isDetach: "
            r7.append(r3)
            boolean r3 = r1.mo84320e()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r6 != 0) goto L_0x002c
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99135B6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x00c5
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99578z6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x00c1
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r3 != 0) goto L_0x00c1
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r3 != 0) goto L_0x00c1
            r3 = 1
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            if (r3 == 0) goto L_0x00c5
            r4 = 1
        L_0x00c5:
            if (r4 == 0) goto L_0x002c
            boolean r3 = f177084d
            if (r3 != 0) goto L_0x00d1
            boolean r3 = r1.mo84320e()
            if (r3 != 0) goto L_0x002c
        L_0x00d1:
            boolean r3 = r1 instanceof ph1.C62288c
            if (r3 == 0) goto L_0x00e2
            r3 = r1
            ph1.c r3 = (ph1.C62288c) r3
            th1.c r3 = r3.f177064e
            f50.d r3 = r3.f186980z
            if (r3 == 0) goto L_0x00ef
            r3.stopPlay(r5)
            goto L_0x00ef
        L_0x00e2:
            ph1.j r3 = r1.mo84321f()
            if (r3 == 0) goto L_0x00ef
            f50.d r3 = r3.f177095g
            if (r3 == 0) goto L_0x00ef
            r3.stopPlay(r5)
        L_0x00ef:
            r1.mo84322g()
            goto L_0x002c
        L_0x00f4:
            java.util.HashMap<java.lang.Long, ph1.m> r0 = f177087g
            r0.clear()
            java.util.HashMap<java.lang.Long, ph1.g> r0 = f177088h
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0103:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0197
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getKey()
            java.lang.Number r6 = (java.lang.Number) r6
            r6.longValue()
            java.lang.Object r1 = r1.getValue()
            ph1.g r1 = (ph1.C62292g) r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "square exit start releaseParams: "
            r6.append(r7)
            r6.append(r1)
            r6.append(r3)
            r6.append(r1)
            java.lang.String r7 = ".isFloatWindow isLiveRoomOnDestory: "
            r6.append(r7)
            boolean r7 = f177084d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            boolean r6 = r1.f177079l
            if (r6 != 0) goto L_0x0103
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99135B6
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L_0x0180
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99578z6
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L_0x017b
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r6 != 0) goto L_0x017b
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r6 != 0) goto L_0x017b
            r6 = 1
            goto L_0x017c
        L_0x017b:
            r6 = 0
        L_0x017c:
            if (r6 == 0) goto L_0x0180
            r6 = 1
            goto L_0x0181
        L_0x0180:
            r6 = 0
        L_0x0181:
            if (r6 == 0) goto L_0x0103
            boolean r6 = f177084d
            if (r6 == 0) goto L_0x0103
            f50.d r6 = r1.f177095g
            if (r6 == 0) goto L_0x018e
            r6.stopPlay(r5)
        L_0x018e:
            android.graphics.SurfaceTexture r1 = r1.f177076i
            if (r1 == 0) goto L_0x0103
            r1.release()
            goto L_0x0103
        L_0x0197:
            java.util.HashMap<java.lang.Long, ph1.g> r0 = f177088h
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph1.C62293i.mo87361f():void");
    }

    /* renamed from: g */
    public final C62297m mo87362g(long j, boolean z) {
        C62297m mVar = f177087g.get(Long.valueOf(j));
        Log.m105924i("FinderFluentSwitchManager", "recordFluentSwitchInRoomPlayer feedId:" + j + " director:" + mVar);
        if (mVar instanceof C62291f) {
            C62291f fVar = (C62291f) mVar;
            fVar.mo84321f();
            f177088h.put(Long.valueOf(j), fVar.mo84321f());
        }
        Log.m105924i("FinderFluentSwitchManager", "getSwitchInLiveRoomDirector feedId:" + j + " checkDetach:" + z + " director:" + mVar);
        boolean z2 = true;
        if (mVar == null || !mVar.mo84320e()) {
            z2 = false;
        }
        if (!z2 || !z) {
            return mVar;
        }
        return null;
    }

    /* renamed from: h */
    public final C62297m mo87363h(Context context, C62294j jVar) {
        C62297m mVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jVar, "params");
        long j = jVar.f177090b;
        if (jVar instanceof C62289d) {
            Context applicationContext = context.getApplicationContext();
            C87412m.m108593f(applicationContext, "context.applicationContext");
            mVar = new C62288c(applicationContext);
        } else if (jVar instanceof C59114b) {
            Context applicationContext2 = context.getApplicationContext();
            C87412m.m108593f(applicationContext2, "context.applicationContext");
            mVar = new C59113a(applicationContext2);
        } else {
            Context applicationContext3 = context.getApplicationContext();
            C87412m.m108593f(applicationContext3, "context.applicationContext");
            mVar = new C62291f(applicationContext3);
        }
        mVar.mo84319d(jVar);
        Log.m105924i("FinderFluentSwitchManager", "startSwitchOutFromSquare feedId: " + j + " director: " + mVar + ' ');
        mo87361f();
        f177087g.put(Long.valueOf(j), mVar);
        return mVar;
    }
}
