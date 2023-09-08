package zq0;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneNumberAddUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Arrays;
import p225rc.C89916g;
import p225rc.g$$e;
import rx3.C13598b0;
import zq0.C91910r;

/* renamed from: zq0.m */
public class C91894m implements C91910r {

    /* renamed from: zq0.m$a */
    public static final class C91895a implements g$$e {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Integer, Intent, C13598b0> f263122a;

        public C91895a(C32227p<? super Integer, ? super Intent, C13598b0> pVar) {
            this.f263122a = pVar;
        }

        /* renamed from: a */
        public final void mo1626a(int i, Intent intent) {
            this.f263122a.invoke(Integer.valueOf(i), intent);
        }
    }

    /* renamed from: zq0.m$b */
    public static final class C91896b implements g$$e {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Integer, Intent, C13598b0> f263123a;

        public C91896b(C32227p<? super Integer, ? super Intent, C13598b0> pVar) {
            this.f263123a = pVar;
        }

        /* renamed from: a */
        public final void mo1626a(int i, Intent intent) {
            this.f263123a.invoke(Integer.valueOf(i), intent);
        }
    }

    /* renamed from: a */
    public void mo121661a(Context context) {
        C87412m.m108594g(context, "context");
        boolean z = context instanceof BaseActivity;
    }

    /* renamed from: b */
    public void mo125723b(Context context, String str, C32227p<? super Integer, ? super Intent, C13598b0> pVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(pVar, "callback");
        C89916g a = C89916g.m112446a(context);
        Intent intent = new Intent(context, PhoneNumberAddUI.class);
        intent.putExtra("APPID", str);
        a.mo124236j(intent, new C91895a(pVar));
    }

    /* renamed from: c */
    public SpannableString mo121662c(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pagePath");
        String string = context.getString(C0966R.string.a7t);
        C87412m.m108593f(string, "context.getString(R.stri…number_expose_slogan_end)");
        String string2 = context.getString(C0966R.string.a7u);
        C87412m.m108593f(string2, "context.getString(R.stri…mber_expose_slogan_start)");
        String format = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return new SpannableString(format);
    }

    /* renamed from: d */
    public C79424p mo125724d(Context context, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(aVar, "onDone");
        return new C91921x(context, str, aVar);
    }

    /* renamed from: e */
    public void mo125725e(Context context, String str, String str2, C91891k0 k0Var, PhoneItem phoneItem, C91910r.C91911a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "extDesc");
        C87412m.m108594g(phoneItem, "phoneItem");
        new C91897m0(context, str, k0Var, str2, phoneItem, aVar).mo125729e(true);
    }

    /* renamed from: f */
    public C91913s mo125726f(Context context, String str, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pagePath");
        return new C91882i0(context, str, str2);
    }

    /* renamed from: g */
    public void mo125727g(Context context, String str, String str2, C32227p<? super Integer, ? super Intent, C13598b0> pVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pagePath");
        C87412m.m108594g(pVar, "callback");
        C89916g a = C89916g.m112446a(context);
        Intent intent = new Intent(context, PhoneNumberManagerUI.class);
        intent.putExtra("APPID", str);
        intent.putExtra("PAGEPATH", str2);
        a.mo124236j(intent, new C91896b(pVar));
    }

    /* renamed from: h */
    public void mo121663h(Context context, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "callback");
        lVar.invoke(0);
    }

    /* renamed from: i */
    public boolean mo125728i() {
        return true;
    }

    /* renamed from: j */
    public void mo121664j(C91891k0 k0Var) {
        C87412m.m108594g(k0Var, "report");
        Log.m105924i("Luggage.FULL.DefaultPhoneNumberLogic", "report:" + k0Var);
    }
}
