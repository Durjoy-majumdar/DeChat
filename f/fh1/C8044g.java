package fh1;

import a14.C0000n0;
import a14.C53873d2;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Intent;
import c50.C54655b;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gh1.C59440c;
import gh1.C8313a;
import gy3.C87412m;
import kotlin.ResultKt;
import nk1.C11207i;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.g */
public final class C8044g extends C8313a implements C59440c {

    /* renamed from: j */
    public C53973z1 f26760j;

    /* renamed from: n */
    public boolean f26761n;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorEnableController$isGestureEffectEnable$1", mo125469f = "GestureEffectAnchorEnableController.kt", mo125470l = {38, 43}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.g$a */
    public static final class C8045a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f26762d;

        /* renamed from: e */
        public Object f26763e;

        /* renamed from: f */
        public Object f26764f;

        /* renamed from: g */
        public Object f26765g;

        /* renamed from: h */
        public int f26766h;

        /* renamed from: i */
        public final /* synthetic */ C8044g f26767i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8045a(C8044g gVar, C15601d<? super C8045a> dVar) {
            super(2, dVar);
            this.f26767i = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8045a(this.f26767i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8045a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f26766h
                r2 = 2
                java.lang.String r3 = "FinderGestureEffectAnchorEnableController"
                r4 = 1
                if (r1 == 0) goto L_0x003e
                if (r1 == r4) goto L_0x0032
                if (r1 != r2) goto L_0x002a
                java.lang.Object r1 = r11.f26765g
                te3.bz0 r1 = (te3.C48928bz0) r1
                java.lang.Object r4 = r11.f26764f
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r11.f26763e
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r11.f26762d
                fh1.g r6 = (fh1.C8044g) r6
                kotlin.ResultKt.throwOnFailure(r12)
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L_0x009e
            L_0x002a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0032:
                java.lang.Object r1 = r11.f26763e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f26762d
                fh1.g r4 = (fh1.C8044g) r4
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0064
            L_0x003e:
                kotlin.ResultKt.throwOnFailure(r12)
                xh1.d r12 = xh1.C15685d.f42379a
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List<te3.bz0> r12 = xh1.C15685d.f42381c
                r1.addAll(r12)
                fh1.g r12 = r11.f26767i
                java.lang.String r5 = "#setEnable ready to refresh"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                xh1.a r5 = xh1.C23087a.f66318a
                r11.f26762d = r12
                r11.f26763e = r1
                r11.f26766h = r4
                java.lang.Object r4 = r5.mo36502i(r1, r4, r11)
                if (r4 != r0) goto L_0x0063
                return r0
            L_0x0063:
                r4 = r12
            L_0x0064:
                java.lang.String r12 = "#setEnable ready to done. one by one load"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r1 = r1.iterator()
                r5 = r12
                r6 = r4
                r12 = r11
                r4 = r1
            L_0x0076:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x00e0
                java.lang.Object r1 = r4.next()
                te3.bz0 r1 = (te3.C48928bz0) r1
                xh1.a r7 = xh1.C23087a.f66318a
                r12.f26762d = r6
                r12.f26763e = r5
                r12.f26764f = r4
                r12.f26765g = r1
                r12.f26766h = r2
                java.lang.Object r7 = r7.mo36496c(r1, r12)
                if (r7 != r0) goto L_0x0095
                return r0
            L_0x0095:
                r10 = r0
                r0 = r12
                r12 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L_0x009e:
                xh1.a$a r12 = (xh1.C23087a.C15676a) r12
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "#setEnable gestureId="
                r8.append(r9)
                int r9 = r3.f131399d
                r8.append(r9)
                java.lang.String r9 = ", luaPath="
                r8.append(r9)
                if (r12 == 0) goto L_0x00b9
                java.lang.String r9 = r12.f42362a
                goto L_0x00ba
            L_0x00b9:
                r9 = 0
            L_0x00ba:
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
                if (r12 == 0) goto L_0x00d9
                java.lang.String r12 = r12.f42362a
                if (r12 == 0) goto L_0x00d9
                rx3.l r8 = new rx3.l
                int r3 = r3.f131399d
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r3)
                r8.<init>(r9, r12)
                r6.add(r8)
            L_0x00d9:
                r12 = r0
                r0 = r1
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r7
                goto L_0x0076
            L_0x00e0:
                c50.b r12 = c50.C54655b.f153178f1
                if (r12 != 0) goto L_0x00eb
                c50.b r12 = new c50.b
                r12.<init>()
                c50.C54655b.f153178f1 = r12
            L_0x00eb:
                c50.b r12 = c50.C54655b.f153178f1
                gy3.C87412m.m108591d(r12)
                r12.mo75575G0(r5)
                java.lang.Class<fh1.p> r12 = fh1.C8070p.class
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r12 = r6.controller(r12)
                fh1.p r12 = (fh1.C8070p) r12
                if (r12 == 0) goto L_0x0116
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "手势特效:\nload lua done\n数量："
                r0.append(r1)
                int r1 = r5.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.mo9159K3(r0)
            L_0x0116:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C8044g.C8045a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorEnableController$isGestureEffectEnable$2", mo125469f = "GestureEffectAnchorEnableController.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.g$b */
    public static final class C8046b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f26768d;

        /* renamed from: e */
        public final /* synthetic */ C8044g f26769e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8046b(C8044g gVar, C15601d<? super C8046b> dVar) {
            super(2, dVar);
            this.f26769e = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8046b(this.f26769e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8046b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f26768d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = this.f26769e.f26760j;
                if (z1Var != null) {
                    this.f26768d = 1;
                    if (C53873d2.m60391c(z1Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (C54655b.f153178f1 == null) {
                C54655b.f153178f1 = new C54655b();
            }
            C54655b bVar = C54655b.f153178f1;
            C87412m.m108591d(bVar);
            bVar.mo75575G0(C64186f0.f181907d);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8044g(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: e */
    public boolean mo9121e() {
        return false;
    }

    /* renamed from: m3 */
    public final void mo9135m3(boolean z) {
        Log.m105924i("FinderGestureEffectAnchorEnableController", "#setEnable=" + this.f26761n);
        if (z != this.f26761n) {
            this.f26761n = z;
            if (z) {
                this.f26760j = C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C8045a(this, (C15601d<? super C8045a>) null), 3, (Object) null);
                return;
            }
            C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C8046b(this, (C15601d<? super C8046b>) null), 3, (Object) null);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (1003 == i && i2 == -1) {
            mo9135m3(C8048h.f26771n.mo9138c(getStore().getLiveRoomData()));
        }
    }

    public void onLiveActivate() {
        mo9135m3(C8048h.f26771n.mo9138c(getStore().getLiveRoomData()));
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    public void onNewIntent(Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void resume() {
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
