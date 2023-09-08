package lj1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kj1.C10125e1;
import nj3.C76874e0;
import nj3.C76875f0;
import p213oh.C11412b;
import rx3.C13598b0;
import te3.C64586nn1;
import zj1.C16217b;

/* renamed from: lj1.e */
public abstract class C10538e extends C10536d {

    /* renamed from: g */
    public final String f31816g = "MoreActionMenuItem";

    /* renamed from: lj1.e$a */
    public static final class C10539a extends C87413o implements C32227p<C2458a, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MenuItem f31817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10539a(MenuItem menuItem) {
            super(2);
            this.f31817d = menuItem;
        }

        public Object invoke(Object obj, Object obj2) {
            C2458a aVar = (C2458a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(aVar, "result");
            if (aVar.f12908a) {
                C64586nn1 nn12 = aVar.f12909b;
                if (!(nn12 != null && nn12.f184502d == 6) || booleanValue) {
                    C76875f0 f0Var = (C76875f0) this.f31817d;
                    f0Var.f224712d = false;
                    f0Var.f224713e = true;
                } else {
                    C76875f0 f0Var2 = (C76875f0) this.f31817d;
                    f0Var2.f224712d = true;
                    f0Var2.f224713e = false;
                }
            } else {
                C76875f0 f0Var3 = (C76875f0) this.f31817d;
                f0Var3.f224712d = false;
                f0Var3.f224713e = false;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10538e(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: r */
    public static void m10469r(C10538e eVar, int i, int i2, String str, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 1;
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            int i4 = eVar.f31810b;
            String str2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? "assistant.more" : "audience.more" : "startlive.more" : "anchorlive.more";
            ArrayList arrayList = new ArrayList();
            C64586nn1 nn12 = new C64586nn1();
            nn12.f184502d = i2;
            nn12.f184506h = 1;
            nn12.f184507i = eVar.mo10518g();
            nn12.f184508j = str2;
            nn12.f184515t = 1;
            arrayList.add(nn12);
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184506h = 2;
            nn13.f184507i = str2;
            arrayList.add(nn13);
            C16217b.f43438a.mo14749f(i, arrayList, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertRedDot");
    }

    /* renamed from: m */
    public final void mo10807m(C76874e0 e0Var, int i, CharSequence charSequence, int i2) {
        C87412m.m108594g(e0Var, "<this>");
        C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        mo10811u(e0Var.mo107144g(i, charSequence, i2));
    }

    /* renamed from: n */
    public final void mo10808n(C76874e0 e0Var, int i, CharSequence charSequence, int i2, int i3) {
        C87412m.m108594g(e0Var, "<this>");
        C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        mo10811u(e0Var.mo107146h(i, charSequence, i2, i3));
    }

    /* renamed from: o */
    public abstract void mo10523o(C10125e1 e1Var, C76874e0 e0Var);

    /* renamed from: p */
    public final void mo10809p(C76874e0 e0Var) {
        C87412m.m108594g(e0Var, "menu");
        if (mo10519k()) {
            mo10523o(this.f31809a, e0Var);
            mo10806l();
            C16217b.f43438a.mo14751g(mo10518g());
            return;
        }
        int i = C11412b.f33577a;
        Log.m105925i(this.f31816g, "add menuItem " + mo10524q() + " failed, as it is not enabled", (Object[]) null);
    }

    /* renamed from: q */
    public abstract int mo10524q();

    /* renamed from: s */
    public final void mo10810s() {
        mo10525t(this.f31809a);
        C10536d.m10457e(this, false, 1, (Object) null);
    }

    /* renamed from: t */
    public abstract void mo10525t(C10125e1 e1Var);

    /* renamed from: u */
    public final void mo10811u(MenuItem menuItem) {
        if (menuItem instanceof C76875f0) {
            this.f31813e = new C10539a(menuItem);
        }
    }
}
