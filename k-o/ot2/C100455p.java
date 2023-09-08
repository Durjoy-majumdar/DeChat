package ot2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: ot2.p */
public final class C100455p extends UIComponent {

    /* renamed from: d */
    public boolean f294282d;

    /* renamed from: e */
    public boolean f294283e = true;

    /* renamed from: ot2.p$a */
    public static final class C100456a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100455p f294284d;

        /* renamed from: ot2.p$a$a */
        public static final class C100457a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C100455p f294285d;

            public C100457a(C100455p pVar) {
                this.f294285d = pVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1$1");
                ((C100437h) C39818r.f106831a.mo62444c(this.f294285d.getActivity()).mo75002a(C100437h.class)).mo139928l3(true);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1$1");
            }
        }

        /* renamed from: ot2.p$a$b */
        public static final class C100458b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C100458b f294286d = new C100458b();

            public final void onClick(DialogInterface dialogInterface, int i) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1$2");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1$2");
            }
        }

        public C100456a(C100455p pVar) {
            this.f294284d = pVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1");
            C76879j.m92743n(this.f294284d.getActivity(), C0966R.string.jjr, C0966R.string.a3h, new C100457a(this.f294284d), C100458b.f294286d);
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$1");
            return true;
        }
    }

    /* renamed from: ot2.p$b */
    public static final class C100459b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100455p f294287d;

        public C100459b(C100455p pVar) {
            this.f294287d = pVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$2");
            ((C100437h) C39818r.f106831a.mo62444c(this.f294287d.getActivity()).mo75002a(C100437h.class)).mo139928l3(false);
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$2");
            return true;
        }
    }

    /* renamed from: ot2.p$c */
    public static final class C100460c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100455p f294288d;

        public C100460c(C100455p pVar) {
            this.f294288d = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$3");
            C100455p pVar = this.f294288d;
            SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            boolean z = pVar.f294282d;
            SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            if (z) {
                AppCompatActivity activity = this.f294288d.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) activity;
                C100455p pVar2 = this.f294288d;
                SnsMethodCalculate.markStartTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
                boolean z2 = pVar2.f294283e;
                SnsMethodCalculate.markEndTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
                mMActivity.setTitleVisibility(z2 ? 8 : 0);
                C100455p pVar3 = this.f294288d;
                SnsMethodCalculate.markStartTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
                boolean z3 = pVar3.f294283e;
                SnsMethodCalculate.markEndTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
                SnsMethodCalculate.markStartTimeMs("access$setShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
                pVar3.f294283e = !z3;
                SnsMethodCalculate.markEndTimeMs("access$setShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100455p(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
        super.onCreate(bundle);
        this.f294282d = getIntent().getBooleanExtra("intent_video_is_preview", false);
        View findViewById = getActivity().findViewById(C0966R.C0970id.myq);
        C87412m.m108593f(findViewById, "activity.findViewById(R.…ake_video_view_container)");
        if (this.f294282d) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).addIconOptionMenu(0, (int) C0966R.string.f7944x1, (int) C0966R.raw.icons_outlined_delete, (MenuItem.OnMenuItemClickListener) new C100456a(this));
            AppCompatActivity activity2 = getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity2).setBackBtn(new C100459b(this));
        } else {
            AppCompatActivity activity3 = getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity3).hideTitleView();
        }
        findViewById.setOnClickListener(new C100460c(this));
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
    }
}
