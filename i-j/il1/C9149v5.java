package il1;

import ak1.C54108o;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import xk1.C66297d2;
import z04.C112550d0;

/* renamed from: il1.v5 */
public final class C9149v5 {

    /* renamed from: a */
    public final MMActivity f28815a;

    /* renamed from: b */
    public final C66297d2.C15724d f28816b;

    /* renamed from: c */
    public int f28817c = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_KNOW_LICENSE_UPDATE_INT_SYNC, 0);

    /* renamed from: d */
    public View f28818d;

    /* renamed from: e */
    public CheckBox f28819e;

    /* renamed from: f */
    public int f28820f;

    /* renamed from: il1.v5$a */
    public static final class C9150a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9149v5 f28821d;

        public C9150a(C9149v5 v5Var) {
            this.f28821d = v5Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostLicenseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28821d.mo9971b().setChecked(!this.f28821d.mo9971b().isChecked());
            C9149v5 v5Var = this.f28821d;
            v5Var.f28817c = v5Var.mo9971b().isChecked() ? 1 : 0;
            this.f28821d.f28816b.onChange();
            C9149v5.m8831a(this.f28821d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostLicenseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.v5$b */
    public static final class C9151b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C9149v5 f28822a;

        public C9151b(C9149v5 v5Var) {
            this.f28822a = v5Var;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C9149v5 v5Var = this.f28822a;
            v5Var.f28817c = v5Var.mo9971b().isChecked() ? 1 : 0;
            this.f28822a.f28816b.onChange();
            C9149v5.m8831a(this.f28822a);
        }
    }

    public C9149v5(MMActivity mMActivity, ViewGroup viewGroup, C66297d2.C15724d dVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "licenseContainer");
        C87412m.m108594g(dVar, "callback");
        this.f28815a = mMActivity;
        this.f28816b = dVar;
        C32444a aVar = C32444a.f86121a;
        this.f28818d = viewGroup;
        viewGroup.setOnClickListener(new C9150a(this));
        View findViewById = this.f28818d.findViewById(C0966R.C0970id.i09);
        C87412m.m108593f(findViewById, "container.findViewById(R.id.post_license_checkbox)");
        this.f28819e = (CheckBox) findViewById;
        mo9971b().setOnCheckedChangeListener(new C9151b(this));
        View findViewById2 = this.f28818d.findViewById(C0966R.C0970id.i0a);
        C87412m.m108593f(findViewById2, "container.findViewById(R.id.post_license_tv)");
        TextView textView = (TextView) findViewById2;
        String string = textView.getContext().getResources().getString(C0966R.string.dfk);
        C87412m.m108593f(string, "tv.context.resources.get…inder_live_anchor_iterms)");
        String string2 = textView.getContext().getResources().getString(C0966R.string.dg8);
        C87412m.m108593f(string2, "tv.context.resources.get…der_live_anchor_standard)");
        String string3 = textView.getContext().getResources().getString(C0966R.string.f360527df0);
        C87412m.m108593f(string3, "tv.context.resources.get…ng.finder_live_agree_new)");
        String format = String.format(string3, Arrays.copyOf(new Object[]{string, string2}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        int E = C112550d0.m153769E(format, string, 0, false, 6, (Object) null);
        int E2 = C112550d0.m153769E(format, string2, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(format);
        C9160w5 w5Var = new C9160w5(this);
        C9167x5 x5Var = new C9167x5(this);
        spannableString.setSpan(w5Var, E, string.length() + E, 33);
        spannableString.setSpan(x5Var, E2, string2.length() + E2, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        this.f28820f = 4;
    }

    /* renamed from: a */
    public static final void m8831a(C9149v5 v5Var) {
        Class cls = C54108o.class;
        int i = v5Var.f28817c == 1 ? 3 : 4;
        if (v5Var.f28820f != i) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 10, String.valueOf(i), (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls)).getClass();
            C54108o.f151869h.f151435Q = (long) i;
            v5Var.f28820f = i;
        }
    }

    /* renamed from: b */
    public final CheckBox mo9971b() {
        CheckBox checkBox = this.f28819e;
        if (checkBox != null) {
            return checkBox;
        }
        C87412m.m108603p("checkBox");
        throw null;
    }
}
