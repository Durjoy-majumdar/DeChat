package com.tencent.p014mm.plugin.appbrand.phonenumber;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.p136ui.base.BaseLuggageActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p225rc.C89923l;
import rx3.C13598b0;
import zq0.C79424p;
import zq0.C91875g0;
import zq0.C91894m;
import zq0.C91910r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI */
public final class PhoneNumberAddUI extends BaseLuggageActivity {

    /* renamed from: B */
    public C79424p f245281B;

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI$a */
    public static final class C84015a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ PhoneNumberAddUI f245282d;

        public C84015a(PhoneNumberAddUI phoneNumberAddUI) {
            this.f245282d = phoneNumberAddUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f245282d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI$b */
    public static final class C84016b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ PhoneNumberAddUI f245283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84016b(PhoneNumberAddUI phoneNumberAddUI) {
            super(0);
            this.f245283d = phoneNumberAddUI;
        }

        public Object invoke() {
            this.f245283d.finish();
            return C13598b0.f38549a;
        }
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("APPID");
        if (C89923l.f258408a.mo117499e(stringExtra)) {
            setTheme(C0966R.style.f361671a11);
        } else {
            setTheme(C0966R.style.f361672a12);
        }
        super.onCreate(bundle);
        setNavigationbarColor(MMApplicationContext.getResources().getColor(C0966R.color.f2928b));
        mo101259H7(MMApplicationContext.getResources().getColor(C0966R.color.f2929c));
        hideActionbarLine();
        Log.m105924i("MicroMsg.PhoneNumberAddUI", "onCreate() appId:" + stringExtra);
        setTitle(MMApplicationContext.getResources().getString(C0966R.string.a7n));
        mo101260I7(new C84015a(this), 0, BaseActivity.C73014c.BACK);
        C91910r rVar = C91875g0.f263042b;
        if (rVar == null) {
            rVar = new C91894m();
        }
        C87412m.m108591d(stringExtra);
        C79424p d = rVar.mo125724d(this, stringExtra, new C84016b(this));
        this.f245281B = d;
        if (d != null) {
            d.init();
        }
        C79424p pVar = this.f245281B;
        setContentView(pVar != null ? pVar.getView() : null);
    }

    public void onDestroy() {
        super.onDestroy();
        C79424p pVar = this.f245281B;
        if (pVar != null) {
            pVar.uninit();
        }
    }
}
