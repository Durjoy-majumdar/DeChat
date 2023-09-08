package qj1;

import ak1.C54116w;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49712hj1;

/* renamed from: qj1.di */
public final class C62750di extends C62660c {

    /* renamed from: p */
    public final C58124b f178140p;

    /* renamed from: q */
    public final RelativeLayout f178141q;

    /* renamed from: r */
    public final View f178142r;

    /* renamed from: s */
    public final TextView f178143s;

    /* renamed from: t */
    public final View f178144t;

    /* renamed from: qj1.di$a */
    public static final class C62751a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62750di f178145d;

        public C62751a(C62750di diVar) {
            this.f178145d = diVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f178145d.mo10792g(8);
            ((C54116w) C86312j.m106911c(C54116w.class)).Cy0(String.valueOf(4));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.di$b */
    public static final class C62752b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62750di f178146d;

        public C62752b(C62750di diVar) {
            this.f178146d = diVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63163zd zdVar = (C63163zd) this.f178146d.mo87687E0(C63163zd.class);
            if (zdVar != null) {
                zdVar.mo88085d1(Boolean.TRUE);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRBubblePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62750di(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178140p = bVar;
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.bkl);
        this.f178141q = relativeLayout;
        this.f178142r = viewGroup.findViewById(C0966R.C0970id.bkm);
        this.f178143s = (TextView) viewGroup.findViewById(C0966R.C0970id.bkn);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bkk);
        this.f178144t = findViewById;
        findViewById.setOnClickListener(new C62751a(this));
        relativeLayout.setOnClickListener(new C62752b(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
