package qj1;

import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import o40.C61926c;
import sx3.C110823p;

/* renamed from: qj1.ei */
public final class C62767ei implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C62750di f178175d;

    public C62767ei(C62750di diVar) {
        this.f178175d = diVar;
    }

    public final void run() {
        Integer G;
        int a = C74942w4.m89784a(this.f178175d.f166287d.getContext(), 24);
        int a2 = C74942w4.m89784a(this.f178175d.f166287d.getContext(), 16);
        C62741dg dgVar = (C62741dg) this.f178175d.mo87687E0(C62741dg.class);
        int[] iArr = null;
        ViewGroup viewGroup = dgVar != null ? dgVar.f178130y.f172601d : null;
        if (viewGroup != null) {
            iArr = C61926c.m72690o(viewGroup);
        }
        int i = 0;
        int width = ((viewGroup != null ? viewGroup.getWidth() : 0) - (viewGroup != null ? viewGroup.getPaddingStart() : 0)) - (viewGroup != null ? viewGroup.getPaddingEnd() : 0);
        int intValue = (iArr == null || (G = C110823p.m150981G(iArr, 0)) == null) ? 0 : G.intValue();
        if (viewGroup != null) {
            i = viewGroup.getPaddingStart();
        }
        int width2 = this.f178175d.f178141q.getWidth() + a2;
        int i2 = (C75044y4.m89990b(this.f178175d.f166287d.getContext()).x - width2) - a2;
        int i3 = width2 - ((intValue + i) + (width / 2));
        if (i3 < a) {
            ViewGroup viewGroup2 = this.f178175d.f166287d;
            float abs = ((float) Math.abs(i3)) + ((float) a) + ((float) (this.f178175d.f178142r.getWidth() / 2));
            float f = (float) i2;
            if (abs > f) {
                abs = f;
            }
            viewGroup2.setTranslationX(abs);
            return;
        }
        this.f178175d.f166287d.setTranslationX(0.0f);
    }
}
