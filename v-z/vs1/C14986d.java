package vs1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C7919x;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vs1.d */
public final class C14986d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14974a f41076d;

    /* renamed from: e */
    public final /* synthetic */ View f41077e;

    /* renamed from: f */
    public final /* synthetic */ TextView f41078f;

    /* renamed from: g */
    public final /* synthetic */ int f41079g;

    /* renamed from: vs1.d$a */
    public static final class C14987a implements C7045j.C7056k<Object> {

        /* renamed from: a */
        public final /* synthetic */ C7045j f41080a;

        /* renamed from: b */
        public final /* synthetic */ TextView f41081b;

        /* renamed from: c */
        public final /* synthetic */ C14974a f41082c;

        /* renamed from: d */
        public final /* synthetic */ int f41083d;

        public C14987a(C7045j jVar, TextView textView, C14974a aVar, int i) {
            this.f41080a = jVar;
            this.f41081b = textView;
            this.f41082c = aVar;
            this.f41083d = i;
        }

        public void onResult(boolean z, Object obj, Object obj2) {
            this.f41080a.mo8101d();
            if (z) {
                TextView textView = this.f41081b;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                CharSequence charSequence = (CharSequence) obj;
                textView.setText(charSequence);
                this.f41082c.f41037e.get(this.f41083d).f41057b.f41060b = Util.getInt(charSequence.subSequence(0, charSequence.length() - 2).toString(), 0);
            }
            this.f41082c.f41044o = this.f41080a.mo8099b();
        }
    }

    public C14986d(C14974a aVar, View view, TextView textView, int i) {
        this.f41076d = aVar;
        this.f41077e = view;
        this.f41078f = textView;
        this.f41079g = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14974a aVar = this.f41076d;
        Context context = this.f41077e.getContext();
        C87412m.m108593f(context, "itemView.context");
        aVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 1; i < 16; i++) {
            arrayList2.add(context.getResources().getString(C0966R.string.msm, new Object[]{String.valueOf(i)}));
        }
        C7045j jVar = new C7045j(this.f41077e.getContext(), (ArrayList<String>) arrayList2);
        jVar.mo8106i(this.f41076d.f41044o);
        View inflate = LayoutInflater.from(this.f41077e.getContext()).inflate(C0966R.C0971layout.f359765d03, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(itemView.context).i…ting_picker_header, null)");
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ngd);
        C87412m.m108593f(textView, "headetTv");
        C7919x.m8091a(textView);
        jVar.mo8104g(inflate);
        TextView textView2 = this.f41078f;
        C14974a aVar2 = this.f41076d;
        jVar.f24869t = new C14987a(jVar, textView2, aVar2, this.f41079g);
        Object systemService = aVar2.f41036d.getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f41077e.getWindowToken(), 0);
        jVar.mo8109l();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$SettingVoteViewHolder$_onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
