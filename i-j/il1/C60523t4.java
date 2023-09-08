package il1;

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
import er1.C58782w0;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import xk1.C66297d2;

/* renamed from: il1.t4 */
public final class C60523t4 {

    /* renamed from: j */
    public static final HashSet<String> f172502j = new HashSet<>();

    /* renamed from: a */
    public final MMActivity f172503a;

    /* renamed from: b */
    public final boolean f172504b;

    /* renamed from: c */
    public final C66297d2.C15724d f172505c;

    /* renamed from: d */
    public int f172506d = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_KNOW_GAME_LICENSE_UPDATE_INT_SYNC, 0);

    /* renamed from: e */
    public View f172507e;

    /* renamed from: f */
    public CheckBox f172508f;

    /* renamed from: g */
    public TextView f172509g;

    /* renamed from: h */
    public boolean f172510h;

    /* renamed from: i */
    public String f172511i = "";

    /* renamed from: il1.t4$a */
    public static final class C60524a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60523t4 f172512d;

        public C60524a(C60523t4 t4Var) {
            this.f172512d = t4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172512d.mo85490b().setChecked(!this.f172512d.mo85490b().isChecked());
            C60523t4 t4Var = this.f172512d;
            t4Var.f172506d = t4Var.mo85490b().isChecked() ? 1 : 0;
            this.f172512d.f172505c.onChange();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.t4$b */
    public static final class C60525b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C60523t4 f172513a;

        public C60525b(C60523t4 t4Var) {
            this.f172513a = t4Var;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C60523t4 t4Var = this.f172513a;
            t4Var.f172506d = t4Var.mo85490b().isChecked() ? 1 : 0;
            this.f172513a.f172505c.onChange();
        }
    }

    public C60523t4(MMActivity mMActivity, ViewGroup viewGroup, boolean z, C66297d2.C15724d dVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "licenseContainer");
        C87412m.m108594g(dVar, "callback");
        this.f172503a = mMActivity;
        this.f172504b = z;
        this.f172505c = dVar;
        C32444a aVar = C32444a.f86121a;
        this.f172507e = viewGroup;
        viewGroup.setOnClickListener(new C60524a(this));
        View findViewById = this.f172507e.findViewById(C0966R.C0970id.i09);
        C87412m.m108593f(findViewById, "container.findViewById(R.id.post_license_checkbox)");
        this.f172508f = (CheckBox) findViewById;
        mo85490b().setOnCheckedChangeListener(new C60525b(this));
        View findViewById2 = this.f172507e.findViewById(C0966R.C0970id.i0a);
        C87412m.m108593f(findViewById2, "container.findViewById(R.id.post_license_tv)");
        TextView textView = (TextView) findViewById2;
        this.f172509g = textView;
        SpannableString g = C58782w0.f168290a.mo83848g(mMActivity, C0966R.string.dna, this.f172510h);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(g);
    }

    /* renamed from: a */
    public final void mo85489a() {
        if (this.f172504b) {
            this.f172506d = 0;
        }
        if (this.f172506d == 1) {
            View view = this.f172507e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo85490b().setChecked(true);
            this.f172505c.onChange();
            return;
        }
        View view3 = this.f172507e;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGamePostLicenseWidget", "checkLicenseState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public final CheckBox mo85490b() {
        CheckBox checkBox = this.f172508f;
        if (checkBox != null) {
            return checkBox;
        }
        C87412m.m108603p("checkBox");
        throw null;
    }
}
