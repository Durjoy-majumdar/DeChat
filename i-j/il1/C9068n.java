package il1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: il1.n */
public final class C9068n {

    /* renamed from: a */
    public final ViewGroup f28612a;

    /* renamed from: b */
    public final C58124b f28613b;

    /* renamed from: c */
    public final C62660c f28614c;

    /* renamed from: d */
    public final String f28615d = "Finder.FinderLiveAnchoMusicEntranceWidget";

    /* renamed from: e */
    public boolean f28616e = true;

    /* renamed from: f */
    public final View f28617f;

    /* renamed from: g */
    public final String f28618g;

    public C9068n(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28612a = viewGroup;
        this.f28613b = bVar;
        this.f28614c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.one);
        this.f28617f = findViewById;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.onc);
        this.f28618g = "anchorlive.bottom.music";
        viewGroup.setOnClickListener(new C9059m(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.music", findViewById, (View) null, textView, 8, (Object) null);
    }

    /* renamed from: a */
    public final void mo9893a() {
        Class cls = C54108o.class;
        if (this.f28612a.getVisibility() != 0 || this.f28616e) {
            this.f28616e = false;
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.MUSIC, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
            C16217b.f43438a.mo14751g(this.f28618g);
        }
    }
}
