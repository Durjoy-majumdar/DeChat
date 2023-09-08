package vs1;

import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: vs1.b */
public final class C14982b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f41063d;

    /* renamed from: e */
    public final /* synthetic */ C14974a f41064e;

    /* renamed from: f */
    public final /* synthetic */ int f41065f;

    /* renamed from: g */
    public final /* synthetic */ TextView f41066g;

    /* renamed from: vs1.b$a */
    public static final class C14983a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C14974a f41067d;

        /* renamed from: e */
        public final /* synthetic */ View f41068e;

        public C14983a(C14974a aVar, View view) {
            this.f41067d = aVar;
            this.f41068e = view;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(this.f41067d.f41041i, this.f41068e.getContext().getString(C0966R.string.msl));
            e0Var.mo107142f(this.f41067d.f41042j, this.f41068e.getContext().getString(C0966R.string.msj));
        }
    }

    /* renamed from: vs1.b$b */
    public static final class C14984b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C14974a f41069d;

        /* renamed from: e */
        public final /* synthetic */ int f41070e;

        /* renamed from: f */
        public final /* synthetic */ TextView f41071f;

        /* renamed from: g */
        public final /* synthetic */ View f41072g;

        /* renamed from: h */
        public final /* synthetic */ C77407n f41073h;

        public C14984b(C14974a aVar, int i, TextView textView, View view, C77407n nVar) {
            this.f41069d = aVar;
            this.f41070e = i;
            this.f41071f = textView;
            this.f41072g = view;
            this.f41073h = nVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            C14974a aVar = this.f41069d;
            if (itemId == aVar.f41041i) {
                aVar.f41037e.get(this.f41070e).f41057b.f41059a = true;
                this.f41071f.setText(this.f41072g.getContext().getResources().getString(C0966R.string.msl));
                this.f41073h.mo107572p();
            } else if (itemId == aVar.f41042j) {
                aVar.f41037e.get(this.f41070e).f41057b.f41059a = false;
                this.f41071f.setText(this.f41072g.getContext().getResources().getString(C0966R.string.msj));
                this.f41073h.mo107572p();
            }
        }
    }

    public C14982b(View view, C14974a aVar, int i, TextView textView) {
        this.f41063d = view;
        this.f41064e = aVar;
        this.f41065f = i;
        this.f41066g = textView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77407n nVar = new C77407n(this.f41063d.getContext(), 1, false);
        C14974a aVar = this.f41064e;
        View view2 = this.f41063d;
        nVar.f225771i = new C14983a(aVar, view2);
        nVar.f225782p = new C14984b(aVar, this.f41065f, this.f41066g, view2, nVar);
        Object systemService = aVar.f41036d.getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f41063d.getWindowToken(), 0);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
