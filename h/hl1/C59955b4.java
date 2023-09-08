package hl1;

import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import qj1.C62924pe;
import rx3.C13598b0;
import vk1.C65762c;

/* renamed from: hl1.b4 */
public final class C59955b4 {

    /* renamed from: hl1.b4$a */
    public static final class C59956a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171084d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f171085e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f171086f;

        /* renamed from: g */
        public final /* synthetic */ C65762c f171087g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59956a(C59988k kVar, ViewGroup viewGroup, ViewGroup viewGroup2, C65762c cVar) {
            super(0);
            this.f171084d = kVar;
            this.f171085e = viewGroup;
            this.f171086f = viewGroup2;
            this.f171087g = cVar;
        }

        public Object invoke() {
            if (this.f171084d.f171173N == null) {
                this.f171085e.addView(this.f171086f);
                this.f171084d.f171173N = new C62924pe(this.f171086f, this.f171087g);
                C62924pe peVar = this.f171084d.f171173N;
                if (peVar != null) {
                    peVar.mo10792g(8);
                }
                C62924pe peVar2 = this.f171084d.f171173N;
                if (peVar2 != null) {
                    peVar2.mo8357i0();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m69852a(C59988k kVar, String str, ViewGroup viewGroup, ViewGroup viewGroup2) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(viewGroup2, "shoppingListRoot");
        C65762c cVar = kVar.f166848f;
        if (cVar != null) {
            String str2 = kVar.f171222i;
            Log.m105924i(str2, str + " attachShoppingListPlugin shoppingListPlugin:" + kVar.f171173N + '!');
            C61926c.m72668M(new C59956a(kVar, viewGroup, viewGroup2, cVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m69853b(hl1.C59988k r11, android.app.Activity r12) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r12, r0)
            vk1.c r0 = r11.f166848f
            if (r0 == 0) goto L_0x006d
            qj1.pe r0 = r11.f171173N
            if (r0 != 0) goto L_0x006d
            am3.a r0 = r11.f171178Q
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0023
            am3.a$b r0 = r0.f152059c
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.f152069e
            if (r0 != r2) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != 0) goto L_0x006d
            am3.a r0 = r11.f171178Q
            if (r0 == 0) goto L_0x0032
            java.util.concurrent.Future<?> r0 = r0.f152060d
            gy3.C87412m.m108591d(r0)
            r0.cancel(r2)
        L_0x0032:
            r0 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto L_0x0055
            ft1.a r2 = ft1.C59319a.f169618b
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 60
            r10 = 0
            java.lang.String r3 = "liveInitContentViewError"
            o40.C11348f.C11349a.m11178b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r11 = r11.f171222i
            java.lang.String r12 = "syncInflateShoppingPlugin root is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            goto L_0x006d
        L_0x0055:
            android.view.LayoutInflater r12 = r12.getLayoutInflater()
            r2 = 2131495208(0x7f0c0928, float:1.8613946E38)
            android.view.View r12 = r12.inflate(r2, r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r12, r1)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            java.lang.String r1 = "syncInflateShoppingPlugin"
            m69852a(r11, r1, r0, r12)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59955b4.m69853b(hl1.k, android.app.Activity):void");
    }
}
