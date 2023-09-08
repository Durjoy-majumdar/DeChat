package com.tencent.p014mm.plugin.appbrand.phonenumber;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.p136ui.base.BaseLuggageActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import junit.framework.Assert;
import kotlin.Metadata;
import zq0.C91875g0;
import zq0.C91910r;
import zq0.C91913s;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI */
public final class PhoneNumberManagerUI extends BaseLuggageActivity {

    /* renamed from: D */
    public static final /* synthetic */ int f245284D = 0;

    /* renamed from: B */
    public C91913s f245285B;

    /* renamed from: C */
    public boolean f245286C;

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI$a */
    public static final class C84017a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ PhoneNumberManagerUI f245287d;

        public C84017a(PhoneNumberManagerUI phoneNumberManagerUI) {
            this.f245287d = phoneNumberManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C91913s sVar = this.f245287d.f245285B;
            if (sVar != null) {
                sVar.mo125710e();
            }
            PhoneNumberManagerUI phoneNumberManagerUI = this.f245287d;
            phoneNumberManagerUI.f245286C = false;
            C91913s sVar2 = phoneNumberManagerUI.f245285B;
            if (sVar2 != null) {
                sVar2.mo125709d(false);
            }
            this.f245287d.mo116671N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI$b */
    public static final class C84018b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ PhoneNumberManagerUI f245288d;

        public C84018b(PhoneNumberManagerUI phoneNumberManagerUI) {
            this.f245288d = phoneNumberManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            PhoneNumberManagerUI phoneNumberManagerUI = this.f245288d;
            int i = PhoneNumberManagerUI.f245284D;
            phoneNumberManagerUI.f245286C = false;
            C91913s sVar = phoneNumberManagerUI.f245285B;
            if (sVar != null) {
                sVar.mo125709d(false);
            }
            this.f245288d.mo116671N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI$c */
    public static final class C84019c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ PhoneNumberManagerUI f245289d;

        public C84019c(PhoneNumberManagerUI phoneNumberManagerUI) {
            this.f245289d = phoneNumberManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            PhoneNumberManagerUI phoneNumberManagerUI = this.f245289d;
            int i = PhoneNumberManagerUI.f245284D;
            phoneNumberManagerUI.f245286C = true;
            C91913s sVar = phoneNumberManagerUI.f245285B;
            if (sVar != null) {
                sVar.mo125709d(true);
            }
            this.f245289d.mo116671N7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI$d */
    public static final class C84020d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ PhoneNumberManagerUI f245290d;

        public C84020d(PhoneNumberManagerUI phoneNumberManagerUI) {
            this.f245290d = phoneNumberManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f245290d.finish();
            return true;
        }
    }

    /* renamed from: N7 */
    public final void mo116671N7() {
        BaseActivity.C73016e eVar = BaseActivity.C73016e.TEXT;
        if (!this.f214188x.isEmpty()) {
            this.f214188x.clear();
            supportInvalidateOptionsMenu();
        }
        C91913s sVar = this.f245285B;
        if (sVar != null) {
            sVar.mo125707b(this.f245286C);
        }
        if (this.f245286C) {
            mo101258G7(0, 0, getString(C0966R.string.a7v), new C84017a(this), (View.OnLongClickListener) null, eVar);
            mo101260I7(new C84018b(this), C0966R.raw.actionbar_icon_dark_close, BaseActivity.C73014c.CUSTOM);
            return;
        }
        mo101258G7(0, 0, getString(C0966R.string.f360121a82), new C84019c(this), (View.OnLongClickListener) null, eVar);
        mo101260I7(new C84020d(this), 0, BaseActivity.C73014c.BACK);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6399ds;
    }

    public void onBackPressed() {
        if (this.f245286C) {
            this.f245286C = false;
            C91913s sVar = this.f245285B;
            if (sVar != null) {
                sVar.mo125709d(false);
            }
            mo116671N7();
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f361670a10);
        super.onCreate(bundle);
        mo101259H7(getResources().getColor(C0966R.color.f2929c));
        setNavigationbarColor(getResources().getColor(C0966R.color.f2928b));
        hideActionbarLine();
        setTitle(getResources().getString(C0966R.string.f360122a83));
        String stringExtra = getIntent().getStringExtra("APPID");
        Util.isNullOrNil(stringExtra);
        Assert.assertFalse(false);
        Log.m105924i("MicroMsg.PhoneNumberManagerUI", "onCreate() appId:" + stringExtra);
        String stringExtra2 = getIntent().getStringExtra("PAGEPATH");
        C91910r a = C91875g0.f263041a.mo125702a();
        C87412m.m108591d(stringExtra);
        C87412m.m108591d(stringExtra2);
        C91913s f = a.mo125726f(this, stringExtra, stringExtra2);
        this.f245285B = f;
        if (f != null) {
            f.init();
        }
        C91913s sVar = this.f245285B;
        setContentView(sVar != null ? sVar.getView() : null);
    }

    public void onDestroy() {
        super.onDestroy();
        C91913s sVar = this.f245285B;
        if (sVar != null) {
            sVar.uninit();
        }
    }

    public void onResume() {
        super.onResume();
        mo116671N7();
    }
}
