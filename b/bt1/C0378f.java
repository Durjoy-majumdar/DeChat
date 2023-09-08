package bt1;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import rx3.C13598b0;

/* renamed from: bt1.f */
public final class C0378f {

    /* renamed from: a */
    public static final C0378f f979a = new C0378f();

    /* renamed from: bt1.f$a */
    public static class C0379a implements C11182m0 {

        /* renamed from: d */
        public final AppCompatActivity f980d;

        public C0379a(AppCompatActivity appCompatActivity) {
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f980d = appCompatActivity;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var != null && e0Var.mo107176v()) {
                e0Var.mo107140d(1, this.f980d.getResources().getColor(C0966R.color.f3133gi), this.f980d.getResources().getString(C0966R.string.f360757ej3));
                e0Var.mo107140d(2, -65536, this.f980d.getResources().getString(C0966R.string.d6f));
            }
        }
    }

    /* renamed from: bt1.f$b */
    public static class C0380b implements C11184p0 {

        /* renamed from: d */
        public final C32224a<C13598b0> f981d;

        /* renamed from: e */
        public final C32224a<C13598b0> f982e;

        /* renamed from: f */
        public final C32224a<C13598b0> f983f;

        public C0380b(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32224a<C13598b0> aVar3) {
            C87412m.m108594g(aVar, "doPreview");
            C87412m.m108594g(aVar2, "doDelete");
            this.f981d = aVar;
            this.f982e = aVar2;
            this.f983f = aVar3;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C32224a<C13598b0> aVar;
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                this.f981d.invoke();
            } else if (valueOf != null && valueOf.intValue() == 2) {
                this.f982e.invoke();
            } else if (valueOf != null && valueOf.intValue() == 3 && (aVar = this.f983f) != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r0.f140295i != null) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m323a(bt1.C0378f r4, fe1.C58969q r5, int r6, java.lang.Object r7) {
        /*
            r7 = 1
            r6 = r6 & r7
            r0 = 0
            if (r6 == 0) goto L_0x0006
            r5 = r0
        L_0x0006:
            r4.getClass()
            java.lang.Class<ht1.v4> r4 = ht1.C8808v4.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ht1.v4 r4 = (ht1.C8808v4) r4
            boolean r4 = r4.mo9635e()
            r6 = 0
            if (r4 == 0) goto L_0x0019
            goto L_0x006e
        L_0x0019:
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99162E6
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r7) goto L_0x002e
            r4 = 1
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x003d
            fe1.d$b r5 = fe1.C58961d.f168673a
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            fe1.q r5 = r5.mo84155b(r1)
        L_0x003d:
            if (r5 == 0) goto L_0x006c
            te3.rg0 r5 = r5.field_bindInfoList
            if (r5 == 0) goto L_0x006c
            java.util.LinkedList<te3.qg0> r5 = r5.f140887d
            if (r5 == 0) goto L_0x006c
            java.util.Iterator r5 = r5.iterator()
        L_0x004b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r5.next()
            r2 = r1
            te3.qg0 r2 = (te3.C50955qg0) r2
            int r2 = r2.f140290d
            r3 = 5
            if (r2 != r3) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x004b
            r0 = r1
        L_0x0063:
            te3.qg0 r0 = (te3.C50955qg0) r0
            if (r0 == 0) goto L_0x006c
            te3.ol1 r5 = r0.f140295i
            if (r5 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r7 = r4
        L_0x006d:
            r6 = r7
        L_0x006e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C0378f.m323a(bt1.f, fe1.q, int, java.lang.Object):boolean");
    }
}
