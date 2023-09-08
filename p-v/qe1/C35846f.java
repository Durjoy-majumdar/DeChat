package qe1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p496dr.C31264b;
import rx3.C13598b0;

/* renamed from: qe1.f */
public final class C35846f<T> extends C35839a<T> {

    /* renamed from: e */
    public final int f95675e;

    /* renamed from: f */
    public final String f95676f;

    /* renamed from: qe1.f$a */
    public static final class C35847a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C35846f<T> f95677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35847a(C35846f<T> fVar) {
            super(0);
            this.f95677d = fVar;
        }

        public Object invoke() {
            Log.m105924i("ConfigItem", "[ServerExptConfig] addFinderInitListener");
            this.f95677d.mo60441b();
            this.f95677d.mo60440a();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35846f(T t, int i, String str, C32224a<C13598b0> aVar) {
        super(t, "SVR", aVar);
        C87412m.m108594g(str, "exptKey");
        C87412m.m108594g(aVar, "onConfigChanged");
        this.f95675e = i;
        this.f95676f = str;
        mo60441b();
        ((C31264b) C86312j.m106911c(C31264b.class)).f80(new C35847a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60441b() {
        /*
            r6 = this;
            java.lang.Class<dr.b> r0 = p496dr.C31264b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dr.b r0 = (p496dr.C31264b) r0
            java.util.ArrayList r0 = r0.mo58042Vd()
            int r1 = r6.f95675e
            java.lang.String r2 = ""
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L_0x005b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r4 = r0.next()
            te3.gk0 r4 = (te3.C49571gk0) r4
            java.util.LinkedList<te3.fk0> r4 = r4.f134086d
            java.lang.String r5 = "it.container"
            gy3.C87412m.m108593f(r4, r5)
            sx3.C64175a0.m75508p(r1, r4)
            goto L_0x001d
        L_0x0034:
            java.util.Iterator r0 = r1.iterator()
        L_0x0038:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0050
            java.lang.Object r1 = r0.next()
            r4 = r1
            te3.fk0 r4 = (te3.C49434fk0) r4
            java.lang.String r4 = r4.f133555d
            java.lang.String r5 = r6.f95676f
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0038
            r3 = r1
        L_0x0050:
            te3.fk0 r3 = (te3.C49434fk0) r3
            if (r3 == 0) goto L_0x00a5
            java.lang.String r0 = r3.f133556e
            if (r0 != 0) goto L_0x0059
            goto L_0x00a5
        L_0x0059:
            r2 = r0
            goto L_0x00a5
        L_0x005b:
            java.util.Iterator r0 = r0.iterator()
        L_0x005f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r0.next()
            r4 = r1
            te3.gk0 r4 = (te3.C49571gk0) r4
            int r4 = r4.f134087e
            int r5 = r6.f95675e
            if (r4 != r5) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x005f
            goto L_0x0079
        L_0x0078:
            r1 = r3
        L_0x0079:
            te3.gk0 r1 = (te3.C49571gk0) r1
            if (r1 == 0) goto L_0x00a5
            java.util.LinkedList<te3.fk0> r0 = r1.f134086d
            if (r0 == 0) goto L_0x00a5
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009d
            java.lang.Object r1 = r0.next()
            r4 = r1
            te3.fk0 r4 = (te3.C49434fk0) r4
            java.lang.String r4 = r4.f133555d
            java.lang.String r5 = r6.f95676f
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x0085
            r3 = r1
        L_0x009d:
            te3.fk0 r3 = (te3.C49434fk0) r3
            if (r3 == 0) goto L_0x00a5
            java.lang.String r0 = r3.f133556e
            if (r0 != 0) goto L_0x0059
        L_0x00a5:
            T r0 = r6.f95664a
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x00ba
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0104
        L_0x00ba:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x00cd
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0104
        L_0x00cd:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x00e0
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L_0x0104
        L_0x00e0:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x00f0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x0104
            T r0 = r6.f95664a
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0104
        L_0x00f0:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x0103
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r2, r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            goto L_0x0104
        L_0x0103:
            r2 = r0
        L_0x0104:
            r6.f95667d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe1.C35846f.mo60441b():void");
    }

    /* renamed from: c */
    public T mo60442c() {
        T t = this.f95667d;
        return t == null ? this.f95664a : t;
    }
}
