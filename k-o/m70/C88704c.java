package m70;

import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86177e;
import e42.C31415g;
import e42.C7596h;
import e42.C86428f;
import e42.C86430i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13598b0;
import zp3.C23564m;

/* renamed from: m70.c */
public abstract class C88704c<ViewType, T extends C86428f<ViewType>> extends C86430i<T> {

    /* renamed from: m70.c$a */
    public static final class C88705a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88704c<ViewType, T> f256057d;

        /* renamed from: e */
        public final /* synthetic */ C7596h f256058e;

        /* renamed from: f */
        public final /* synthetic */ int f256059f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88705a(C88704c<ViewType, T> cVar, C7596h hVar, int i) {
            super(0);
            this.f256057d = cVar;
            this.f256058e = hVar;
            this.f256059f = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
            r1 = r1.f251224a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                m70.c<ViewType, T> r0 = r7.f256057d
                e42.h r1 = r7.f256058e
                r0.getClass()
                java.lang.String r2 = "parentId"
                r3 = 0
                int r2 = r1.optInt(r2, r3)
                r3 = 0
                if (r2 != 0) goto L_0x002f
                T r0 = r0.f251227a
                e42.f r0 = (e42.C86428f) r0
                if (r0 == 0) goto L_0x0028
                java.lang.String r2 = "containerTag"
                java.lang.String r1 = r1.optString(r2)
                java.lang.String r2 = "data.optString(\"containerTag\")"
                gy3.C87412m.m108593f(r1, r2)
                d42.e r0 = r0.mo118860g0(r1)
                goto L_0x0029
            L_0x0028:
                r0 = r3
            L_0x0029:
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.api.ICoverViewHolderDelegate<ViewType of com.tencent.mm.magicbrush.plugin.scl.jsapi.frameset.coverview.BaseMBCoverViewOperator.getParentOrContainerDelegate$lambda-0, kotlin.Any>"
                gy3.C87412m.m108592e(r0, r1)
                goto L_0x006a
            L_0x002f:
                T r1 = r0.f251227a
                e42.f r1 = (e42.C86428f) r1
                if (r1 == 0) goto L_0x0044
                e42.f$a r1 = r1.f251224a
                if (r1 == 0) goto L_0x0044
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> r1 = r1.f251225a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r1 = r1.get(r2)
                goto L_0x0045
            L_0x0044:
                r1 = r3
            L_0x0045:
                boolean r2 = r1 instanceof d42.C86177e
                if (r2 == 0) goto L_0x004d
                r0 = r1
                d42.e r0 = (d42.C86177e) r0
                goto L_0x006a
            L_0x004d:
                boolean r2 = r1 instanceof d42.C58105c
                if (r2 == 0) goto L_0x0064
                d42.c r1 = (d42.C58105c) r1
                android.widget.FrameLayout r0 = r1.getCoverViewHolder()
                java.lang.String r1 = "parentView"
                gy3.C87412m.m108594g(r0, r1)
                m70.i r1 = new m70.i
                r1.<init>(r0)
                r0 = r1
                goto L_0x006a
            L_0x0064:
                e42.g r1 = e42.C31415g.C31416a.f84093c
                r0.mo123141r(r1)
                r0 = r3
            L_0x006a:
                java.lang.String r1 = "MicroMsg.BaseCoverViewOperator"
                if (r0 == 0) goto L_0x00b9
                m70.c<ViewType, T> r2 = r7.f256057d
                e42.h r4 = r7.f256058e
                int r5 = r7.f256059f
                r2.mo123140t(r4, r0)
                T r6 = r2.f251227a
                e42.f r6 = (e42.C86428f) r6
                if (r6 == 0) goto L_0x008c
                e42.f$a r6 = r6.f251224a
                if (r6 == 0) goto L_0x008c
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Object> r6 = r6.f251225a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r6.get(r5)
                goto L_0x008d
            L_0x008c:
                r5 = r3
            L_0x008d:
                if (r5 != 0) goto L_0x0090
                r5 = r3
            L_0x0090:
                if (r5 == 0) goto L_0x0097
                r2.mo123143u(r4, r5, r0)
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x0097:
                if (r3 != 0) goto L_0x00b7
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "(context?.getCoverViewManager()?.getView(viewId) as? ViewType) wrong;data:"
                r0.append(r3)
                r0.append(r4)
                r3 = 32
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                e42.g r0 = e42.C31415g.C31416a.f84091a
                r2.mo123141r(r0)
            L_0x00b7:
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x00b9:
                if (r3 != 0) goto L_0x00d8
                m70.c<ViewType, T> r0 = r7.f256057d
                e42.h r2 = r7.f256058e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "getParentOrContainerDelegate nil,data:"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                e42.g r1 = e42.C31415g.C31416a.f84092b
                r0.mo123141r(r1)
            L_0x00d8:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m70.C88704c.C88705a.invoke():java.lang.Object");
        }
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        Log.m105924i("MicroMsg.BaseCoverViewOperator", "invoke, name: " + mo16e() + ", data:" + hVar + ", biz:" + mo120841d().f26666a);
        int s = mo123142s(hVar);
        if (s == 0) {
            Log.m105920e("MicroMsg.BaseCoverViewOperator", "hy: operating cover view without viewId is illegal");
            mo123141r(C31415g.C7595b.f25865d);
            return;
        }
        C23564m.m28136f(new C88705a(this, hVar, s));
    }

    /* renamed from: r */
    public final void mo123141r(C31415g gVar) {
        C87412m.m108594g(gVar, "errOrSuc");
        if (gVar.f84089a == 0) {
            mo120840p().invoke(mo120844i());
        } else {
            mo120840p().invoke(mo120843h(gVar));
        }
    }

    /* renamed from: s */
    public final int mo123142s(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        return jSONObject.optInt("viewId", 0);
    }

    /* renamed from: t */
    public void mo123140t(JSONObject jSONObject, C86177e<ViewType, Object> eVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(eVar, "coverViewDelegate");
    }

    /* renamed from: u */
    public void mo123143u(JSONObject jSONObject, ViewType viewtype, C86177e<ViewType, Object> eVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(viewtype, "view");
        C87412m.m108594g(eVar, "parent");
    }

    /* renamed from: v */
    public final void mo123144v(ViewType viewtype, JSONObject jSONObject, C86177e<ViewType, Object> eVar) {
        C87412m.m108594g(viewtype, "view");
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(eVar, "coverViewDelegate");
        C86177e.C86178a<ViewType> d = eVar.mo120578d(viewtype);
        if (jSONObject.optInt("hide") > 0) {
            d.mo8352a(viewtype);
        }
    }
}
