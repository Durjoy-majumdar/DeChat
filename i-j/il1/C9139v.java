package il1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: il1.v */
public final class C9139v {

    /* renamed from: a */
    public final ViewGroup f28784a;

    /* renamed from: b */
    public final C58124b f28785b;

    /* renamed from: c */
    public final C62660c f28786c;

    /* renamed from: d */
    public final String f28787d = "Finder.FinderLiveAnchorGameEntranceWidget";

    /* renamed from: e */
    public boolean f28788e;

    /* renamed from: f */
    public final View f28789f;

    /* renamed from: g */
    public final String f28790g;

    /* renamed from: il1.v$a */
    public static final class C9140a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9139v f28791d;

        public C9140a(C9139v vVar) {
            this.f28791d = vVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f28791d.f28785b, C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_SHOW_HALF, (Bundle) null, 2, (Object) null);
            C16217b.f43438a.mo14745b(this.f28791d.f28790g, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9139v(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28784a = viewGroup;
        this.f28785b = bVar;
        this.f28786c = cVar;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dle);
        this.f28788e = true;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.olo);
        this.f28789f = findViewById;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.oln);
        this.f28790g = "anchorlive.bottom.game";
        viewGroup.setVisibility(8);
        ViewParent parent = viewGroup.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) parent;
        viewGroup2.setClipToPadding(false);
        viewGroup2.setClipChildren(false);
        viewGroup.setOnClickListener(new C9140a(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.game", findViewById, (View) null, textView2, 8, (Object) null);
    }
}
