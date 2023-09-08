package com.tencent.p014mm.plugin.collect.p038ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import e21.C75481j0;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectHKMainUI */
public class CollectHKMainUI extends CollectMainUI {

    /* renamed from: C1 */
    public boolean f197809C1 = false;

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectHKMainUI$a */
    public class C68843a implements MenuItem.OnMenuItemClickListener {
        public C68843a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C75228t.m90219L(CollectHKMainUI.this.getContext(), "https://hkwallet.moneydata.hk/hybrid/www/weixin/f2f/zh_hk/faq.shtml", true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectHKMainUI$b */
    public class C68844b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C75481j0 f197811g;

        public C68844b(C75481j0 j0Var) {
            this.f197811g = j0Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C75228t.m90219L(CollectHKMainUI.this.getContext(), this.f197811g.f221818r, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectHKMainUI$c */
    public class C68845c extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C75481j0 f197813g;

        public C68845c(C75481j0 j0Var) {
            this.f197813g = j0Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (!Util.isNullOrNil(this.f197813g.f221822v)) {
                C75228t.m90219L(CollectHKMainUI.this.getContext(), this.f197813g.f221822v, true);
            }
        }
    }

    /* renamed from: I7 */
    public boolean mo94696I7(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C75481j0) {
            C75481j0 j0Var = (C75481j0) yVar;
            if (i != 0 || i2 != 0) {
                Log.m105921e("MicroMsg.CollectHKMainUI", "net error: %s", yVar);
            } else if (j0Var.f221809f == 0) {
                this.f345579L = j0Var.f221811h;
                this.f345580M = j0Var.f221823w;
                this.f345581N = j0Var.f221820t;
                mo175109b8();
                if (!Util.isNullOrNil(j0Var.f221817q)) {
                    this.f345596W0.setText(j0Var.f221817q);
                    this.f345602Z0.setOnClickListener(new C68844b(j0Var));
                    this.f345602Z0.setVisibility(0);
                } else {
                    this.f345602Z0.setVisibility(8);
                }
                if (!Util.isNullOrNil(j0Var.f221821u)) {
                    this.f345576I.setText(j0Var.f221821u);
                    this.f345576I.setOnClickListener(new C68845c(j0Var));
                    this.f345575H.setVisibility(0);
                } else {
                    this.f345575H.setVisibility(8);
                }
                return true;
            }
            if (!this.f197809C1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N7 */
    public void mo94697N7() {
        C86709a0.m107528h();
        this.f345579L = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HK_PAY_URL_STRING, "");
        C75481j0 j0Var = new C75481j0(0, C75592q0.m90784n());
        if (!Util.isNullOrNil(this.f345579L)) {
            mo105011H7().mo105625d(j0Var, false);
            return;
        }
        Log.m105924i("MicroMsg.CollectHKMainUI", "force load payurl");
        this.f197809C1 = true;
        mo105011H7().mo105625d(j0Var, true);
    }

    /* renamed from: R7 */
    public String mo94698R7() {
        if (Util.isNullOrNil(this.f345581N)) {
            this.f345581N = C45121z0.m49962b();
        }
        return this.f345581N;
    }

    /* renamed from: V7 */
    public String mo94699V7() {
        return this.f345580M;
    }

    /* renamed from: W7 */
    public void mo94700W7() {
        ImageView imageView = (ImageView) this.f345568A.findViewById(C0966R.C0970id.bhz);
        ImageView imageView2 = (ImageView) this.f345568A.findViewById(C0966R.C0970id.bhq);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.addRule(13);
        imageView2.setLayoutParams(layoutParams);
        if (LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
            imageView.setImageResource(C0966R.raw.collect_top_logo_hk_traditional);
            imageView2.setImageResource(C0966R.raw.collect_bottom_logo_hk_traditional);
            return;
        }
        imageView.setImageResource(C0966R.raw.collect_top_logo_hk);
        imageView2.setImageResource(C0966R.raw.collect_bottom_logo_hk);
    }

    /* renamed from: a8 */
    public void mo94701a8() {
        super.mo94701a8();
        if (this.f345593V) {
            View findViewById = findViewById(C0966R.C0970id.bhi);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View findViewById2 = findViewById(C0966R.C0970id.bhi);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f345602Z0.setVisibility(8);
        View findViewById = findViewById(C0966R.C0970id.bhi);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.bi9);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = findViewById2;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectHKMainUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo105011H7().mo105624c(1335);
        addIconOptionMenu(0, C0966R.C0969drawable.cf_, new C68843a());
        mo175114f8();
    }

    public void onDestroy() {
        super.onDestroy();
        mo105011H7().mo105630i(1335);
    }
}
