package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0324s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import gy3.C24560g0;
import gy3.C87412m;
import ht1.C8765f3;
import ht1.C8769g3;
import ht1.C8771h3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import sx3.C110826x0;
import te3.C50687oi1;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderManagementUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/view/View;", "o", "Landroid/view/View;", "getNotSeeHim", "()Landroid/view/View;", "setNotSeeHim", "(Landroid/view/View;)V", "notSeeHim", "p", "getNotSeeAccount", "setNotSeeAccount", "notSeeAccount", "q", "getNotSeeMine", "setNotSeeMine", "notSeeMine", "r", "getPersonalizeSetting", "setPersonalizeSetting", "personalizeSetting", "s", "getInteractiveInfo", "setInteractiveInfo", "interactiveInfo", "t", "getLiveRoleGroup", "setLiveRoleGroup", "liveRoleGroup", "v", "getFinderTitle", "setFinderTitle", "finderTitle", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI */
public final class FinderManagementUI extends MMFinderUI {

    /* renamed from: o */
    public View f16938o;

    /* renamed from: p */
    public View f16939p;

    /* renamed from: q */
    public View f16940q;

    /* renamed from: r */
    public View f16941r;

    /* renamed from: s */
    public View f16942s;

    /* renamed from: t */
    public View f16943t;

    /* renamed from: u */
    public boolean f16944u;

    /* renamed from: v */
    public View f16945v;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI$a */
    public static final class C3687a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderManagementUI f16946d;

        public C3687a(FinderManagementUI finderManagementUI) {
            this.f16946d = finderManagementUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f16946d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI$b */
    public static final class C3688b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderManagementUI f16947d;

        public C3688b(FinderManagementUI finderManagementUI) {
            this.f16947d = finderManagementUI;
        }

        public final void onClick(View view) {
            Class cls = C58684b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f16947d.f16944u) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                AppCompatActivity context = this.f16947d.getContext();
                C87412m.m108593f(context, "context");
                C58684b.Wx0((C58684b) c, context, (Intent) null, 1, 2, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
                AppCompatActivity context2 = this.f16947d.getContext();
                C87412m.m108593f(context2, "context");
                C58684b.Cx0((C58684b) c2, context2, (Intent) null, 1, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI$c */
    public static final class C3689c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderManagementUI f16948d;

        public C3689c(FinderManagementUI finderManagementUI) {
            this.f16948d = finderManagementUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            AppCompatActivity context = this.f16948d.getContext();
            C87412m.m108593f(context, "context");
            C58684b.Cx0((C58684b) c, context, (Intent) null, 3, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI$d */
    public static final class C3690d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderManagementUI f16949d;

        public C3690d(FinderManagementUI finderManagementUI) {
            this.f16949d = finderManagementUI;
        }

        public final void onClick(View view) {
            Class cls = C58684b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f16949d.f16944u) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                AppCompatActivity context = this.f16949d.getContext();
                C87412m.m108593f(context, "context");
                C58684b.Wx0((C58684b) c, context, (Intent) null, 2, 2, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
                AppCompatActivity context2 = this.f16949d.getContext();
                C87412m.m108593f(context2, "context");
                C58684b.Cx0((C58684b) c2, context2, (Intent) null, 2, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI$e */
    public static final class C3691e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderManagementUI f16950d;

        public C3691e(FinderManagementUI finderManagementUI) {
            this.f16950d = finderManagementUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(this.f16950d, FinderSettingPersonalizedUI.class);
            AppCompatActivity context = this.f16950d.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderManagementUI$f */
    public static final class C3692f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderManagementUI f16951d;

        public C3692f(FinderManagementUI finderManagementUI) {
            this.f16951d = finderManagementUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(this.f16951d, FinderSettingInteractiveInfoUI.class);
            AppCompatActivity context = this.f16951d.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.apf;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C0324s.m265a(C24560g0.m30725a(C8771h3.class)), C0324s.m265a(C24560g0.m30725a(C8769g3.class)), C0324s.m265a(C24560g0.m30725a(C8765f3.class)));
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f360520dd2);
        setBackBtn(new C3687a(this));
        this.f16944u = getIntent().getBooleanExtra("intent_status_from_privacy_to_video_setting", false);
        View findViewById = findViewById(C0966R.C0970id.hi5);
        this.f16938o = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new C3688b(this));
        }
        View findViewById2 = findViewById(C0966R.C0970id.hgu);
        this.f16939p = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C3689c(this));
        }
        View findViewById3 = findViewById(C0966R.C0970id.hgw);
        this.f16940q = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C3690d(this));
        }
        View findViewById4 = findViewById(C0966R.C0970id.huo);
        this.f16941r = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C3691e(this));
        }
        View findViewById5 = findViewById(C0966R.C0970id.f8d);
        this.f16942s = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C3692f(this));
        }
        this.f16943t = findViewById(C0966R.C0970id.fye);
        this.f16945v = findViewById(C0966R.C0970id.e8e);
        if (this.f16944u) {
            View view2 = this.f16939p;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f16943t;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f16945v;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view6 = this.f16941r;
            if (view6 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view8 = this.f16942s;
            if (view8 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(8);
                C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
        if ((oi12 != null && oi12.f139196d == 1) && (view = this.f16941r) != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view9 = view;
            C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/ui/FinderManagementUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer c0 = C58784w3.m68436c0(w3Var, 1, false, 2, (Object) null);
        int intValue = c0 != null ? c0.intValue() : C0966R.raw.icons_filled_channels_like_thick;
        TextView textView = (TextView) findViewById(C0966R.C0970id.hi6);
        if (textView != null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            String string = MMApplicationContext.getContext().getString(C0966R.string.iji);
            C87412m.m108593f(string, "getContext().getString(R…not_see_he_like_feed_new)");
            textView.setText(w3Var.mo83957q1(context, string, '#', intValue, C0966R.color.FG_0, dimension, dimension));
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.hgx);
        if (textView2 != null) {
            Context context2 = MMApplicationContext.getContext();
            C87412m.m108593f(context2, "getContext()");
            String string2 = MMApplicationContext.getContext().getString(C0966R.string.hvc);
            C87412m.m108593f(string2, "getContext().getString(R…ot_push_my_like_feed_new)");
            textView2.setText(w3Var.mo83957q1(context2, string2, '#', intValue, C0966R.color.FG_0, dimension, dimension));
        }
    }

    public final void setFinderTitle(View view) {
        this.f16945v = view;
    }

    public final void setInteractiveInfo(View view) {
        this.f16942s = view;
    }

    public final void setLiveRoleGroup(View view) {
        this.f16943t = view;
    }

    public final void setNotSeeAccount(View view) {
        this.f16939p = view;
    }

    public final void setNotSeeHim(View view) {
        this.f16938o = view;
    }

    public final void setNotSeeMine(View view) {
        this.f16940q = view;
    }

    public final void setPersonalizeSetting(View view) {
        this.f16941r = view;
    }
}
