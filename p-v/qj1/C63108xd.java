package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import ok1.C62042e;
import te3.C49712hj1;

/* renamed from: qj1.xd */
public final class C63108xd extends C62660c {

    /* renamed from: r */
    public static final Set<Long> f179095r = new LinkedHashSet();

    /* renamed from: p */
    public final C58124b f179096p;

    /* renamed from: q */
    public final View f179097q;

    /* renamed from: qj1.xd$a */
    public static final class C63109a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63108xd f179098d;

        public C63109a(C63108xd xdVar) {
            this.f179098d = xdVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRehearsalBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f179098d.mo10792g(8);
            C58124b.C7172a.m7372a(this.f179098d.f179096p, C58124b.C58125b.FINDER_LIVE_REHEARSAL_BUBBLE_CLOSED, (Bundle) null, 2, (Object) null);
            C63108xd.f179095r.add(Long.valueOf(((C55001u) this.f179098d.mo87684A0().mo71262a(C55001u.class)).f154420q.f182392d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRehearsalBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.xd$b */
    public static final class C63110b {
        public C63110b(C8480h hVar) {
        }
    }

    static {
        new C63110b((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63108xd(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179096p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.nkb);
        this.f179097q = findViewById;
        mo10792g(8);
        findViewById.setOnClickListener(new C63109a(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 0) {
            C58124b.C7172a.m7372a(this.f179096p, C58124b.C58125b.FINDER_LIVE_REHEARSAL_BUBBLE_SHOWN, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return C62042e.f176370a.mo87090j1(mo87684A0());
    }
}
