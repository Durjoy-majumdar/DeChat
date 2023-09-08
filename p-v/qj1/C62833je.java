package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dk1.C58312g;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import te3.C49712hj1;

/* renamed from: qj1.je */
public final class C62833je extends C62660c {

    /* renamed from: p */
    public final C58124b f178326p;

    /* renamed from: q */
    public final String f178327q = "FinderLiveShadowPlugin";

    /* renamed from: r */
    public final View f178328r;

    /* renamed from: s */
    public final View f178329s;

    /* renamed from: qj1.je$a */
    public static final class C62834a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62833je f178330d;

        public C62834a(C62833je jeVar) {
            this.f178330d = jeVar;
        }

        public void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (C61926c.m72696u(((C55001u) this.f178330d.mo87696x0(C55001u.class)).f154420q.f182374S, 4096)) {
                this.f178330d.mo10792g(8);
            }
        }
    }

    /* renamed from: qj1.je$b */
    public static final class C62835b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62833je f178331d;

        public C62835b(C62833je jeVar) {
            this.f178331d = jeVar;
        }

        public final void run() {
            this.f178331d.f178328r.animate().alpha(1.0f).setDuration(500).start();
            this.f178331d.f178329s.animate().alpha(1.0f).setDuration(500).start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62833je(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f178326p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fyh);
        this.f178328r = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fyj);
        this.f178329s = findViewById2;
        if (!mo82893g0()) {
            int i = C75044y4.m89990b(viewGroup.getContext()).y;
            findViewById.getLayoutParams().height = (int) (((double) i) * 0.463d);
            return;
        }
        int i2 = C75044y4.m89990b(viewGroup.getContext()).y;
        double d = (double) i2;
        findViewById.getLayoutParams().height = (int) (0.463d * d);
        findViewById2.getLayoutParams().height = (int) (d * 0.232d);
        Log.m105924i("FinderLiveShadowPlugin", "screenHeight:" + i2 + ",shadowDown.height:" + findViewById.getLayoutParams().height + ",shadowUp.height:" + findViewById2.getLayoutParams().height);
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
        mo10792g(this.f177938i);
    }

    /* renamed from: Z0 */
    public final void mo87800Z0() {
        View view = this.f178328r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        View view2 = this.f178329s;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveShadowPlugin", "playEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mo10792g(0);
        this.f166287d.post(new C62835b(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        this.f177938i = i;
        C39818r rVar = C39818r.f106831a;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        boolean z = ((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e;
        int i2 = 8;
        if (z) {
            i = 0;
        } else if (this.f177939j == 8) {
            i = 8;
        }
        if (C61926c.m72696u(((C55001u) mo87696x0(C55001u.class)).f154420q.f182374S, 4096)) {
            Log.m105924i(this.f178327q, "flag check Live_Flag_Weakening_Shadows = true, gone");
        } else {
            i2 = i;
        }
        this.f166287d.setVisibility(i2);
        if (i2 == 0) {
            this.f166287d.setAlpha(1.0f);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        ((C55001u) mo87684A0().mo71262a(C55001u.class)).f154418o.observe(this, new C62834a(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal == 7) {
                    mo10792g(0);
                    return;
                } else if (!(ordinal == 27 || ordinal == 28)) {
                    return;
                }
            } else if (this.f178326p.getLiveRole() != 1) {
                mo10792g(4);
                return;
            } else {
                return;
            }
        }
        mo10792g(4);
    }
}
