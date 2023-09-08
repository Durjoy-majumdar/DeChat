package uz0;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import java.util.List;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import sx3.C64197v;
import te3.C22517nn;

/* renamed from: uz0.l0 */
public final class C22686l0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f65237d;

    /* renamed from: e */
    public final /* synthetic */ List<C22517nn> f65238e;

    /* renamed from: uz0.l0$a */
    public static final class C22687a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List<C22517nn> f65239d;

        public C22687a(List<? extends C22517nn> list) {
            this.f65239d = list;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            int i = 0;
            for (T next : this.f65239d) {
                int i2 = i + 1;
                if (i >= 0) {
                    e0Var.add(0, i, 1, (CharSequence) ((C22517nn) next).f64329d);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: uz0.l0$b */
    public static final class C22688b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ HistoryCardListUI f65240d;

        public C22688b(HistoryCardListUI historyCardListUI) {
            this.f65240d = historyCardListUI;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: te3.nn} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r3, int r4) {
            /*
                r2 = this;
                com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI r3 = r2.f65240d
                uz0.h r3 = r3.f52272n
                r0 = 0
                if (r3 == 0) goto L_0x001e
                androidx.lifecycle.z<te3.nn> r1 = r3.f65226e
                androidx.lifecycle.z<java.util.List<te3.nn>> r3 = r3.f65225d
                java.lang.Object r3 = r3.getValue()
                java.util.List r3 = (java.util.List) r3
                if (r3 == 0) goto L_0x001a
                java.lang.Object r3 = r3.get(r4)
                r0 = r3
                te3.nn r0 = (te3.C22517nn) r0
            L_0x001a:
                r1.postValue(r0)
                return
            L_0x001e:
                java.lang.String r3 = "mViewModel"
                gy3.C87412m.m108603p(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: uz0.C22686l0.C22688b.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    public C22686l0(HistoryCardListUI historyCardListUI, List<? extends C22517nn> list) {
        this.f65237d = historyCardListUI;
        this.f65238e = list;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f65237d.getContext(), 1, false);
        nVar.f225771i = new C22687a(this.f65238e);
        nVar.f225782p = new C22688b(this.f65237d);
        nVar.mo107573q();
        return false;
    }
}
