package u61;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import java.text.DecimalFormat;
import java.util.Arrays;
import ke3.C88144b;
import kg3.C76577a;
import qo3.C101218e0;
import qo3.C77426q;
import rx3.C13598b0;
import z04.C112550d0;
import zp3.C16386s;

/* renamed from: u61.e */
public final class C14123e {

    /* renamed from: a */
    public static final C14124a f39523a = new C14124a((C8480h) null);

    /* renamed from: b */
    public static int f39524b = -1;

    /* renamed from: u61.e$a */
    public static final class C14124a {

        /* renamed from: u61.e$a$a */
        public static final class C14125a implements C101218e0.C12907m {

            /* renamed from: a */
            public final /* synthetic */ C101218e0 f39525a;

            public C14125a(C101218e0 e0Var) {
                this.f39525a = e0Var;
            }

            /* renamed from: a */
            public final void mo2001a() {
                this.f39525a.mo140680z();
            }
        }

        public C14124a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C101218e0 mo13541a(Context context) {
            C87412m.m108594g(context, "mContext");
            C101218e0 e0Var = new C101218e0(context, 2, 0);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            String string = context.getResources().getString(C0966R.string.caa);
            C87412m.m108593f(string, "mContext.resources.getSt…ial_dialog_title_wording)");
            TextView textView = new TextView(context);
            linearLayout.addView(textView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams());
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.topMargin = C76577a.m92155f(context, C0966R.dimen.f3753d4);
            layoutParams.bottomMargin = C76577a.m92155f(context, C0966R.dimen.f3743cv);
            textView.setTextColor(C76577a.m92153d(context, C0966R.color.f3139gn));
            textView.setTextSize(1, 17.0f);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            textView.setText(string);
            textView.setLayoutParams(layoutParams);
            String string2 = context.getResources().getString(C0966R.string.ca_);
            C87412m.m108593f(string2, "mContext.resources.getSt…rial_dialog_desc_wording)");
            TextView textView2 = new TextView(context);
            linearLayout.addView(textView2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(textView2.getLayoutParams());
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            layoutParams2.bottomMargin = C76577a.m92155f(context, C0966R.dimen.f3766df);
            textView2.setTextColor(C76577a.m92153d(context, C0966R.color.f3287m_));
            textView2.setTextSize(1, 17.0f);
            textView2.setText(string2);
            textView2.setLayoutParams(layoutParams2);
            e0Var.mo140663j(linearLayout);
            e0Var.mo140677w(context.getResources().getString(C0966R.string.ca9));
            e0Var.mo140676v(1);
            e0Var.f296375F = new C14125a(e0Var);
            return e0Var;
        }

        /* renamed from: b */
        public final CharSequence mo13542b(Context context, int i, String str, int i2) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "suffix");
            StringBuilder sb = new StringBuilder();
            String string = context.getString(C0966R.string.ca6);
            C87412m.m108593f(string, "context.getString(R.stri…coin_price_button_woring)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            sb.append(format);
            sb.append(str);
            SpannableString spannableString = new SpannableString(sb.toString());
            String string2 = context.getString(C0966R.string.ca5);
            C87412m.m108593f(string2, "context.getString(R.stri…e_button_wording_replace)");
            int E = C112550d0.m153769E(spannableString, string2, 0, false, 6, (Object) null);
            int intrinsicWidth = context.getResources().getDrawable(C0966R.raw.wecoin_balance_icons).getIntrinsicWidth();
            int h = C76577a.m92157h(context, C0966R.dimen.f3736cp);
            Drawable e = C87515a.m108835e(context.getResources(), C0966R.raw.wecoin_balance_icons, (((float) h) * 1.0f) / ((float) intrinsicWidth));
            e.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
            e.setBounds(0, 0, h, h);
            spannableString.setSpan(new C16386s(e), E, string2.length() + E, 17);
            return spannableString;
        }
    }

    /* renamed from: a */
    public static final void m13456a(Context context, String str, String str2, int i, String str3, String str4) {
        C14124a aVar = f39523a;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "productId");
        C87412m.m108594g(str2, "priceType");
        C87412m.m108594g(str3, "priceNum");
        C87412m.m108594g(str4, "goodName");
        if (f39524b == -1) {
            f39524b = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, 0);
        }
        if (f39524b == 0) {
            Log.m105924i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] show EmojiStoreWecoinTutorialDialog");
            aVar.mo13541a(context).mo140655A();
            return;
        }
        String string = context.getResources().getString(C0966R.string.c6a);
        C87412m.m108593f(string, "context.resources.getStr…R.string.emoji_good_name)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str4}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        Intent intent = new Intent();
        intent.putExtra("key_product_id", str);
        intent.putExtra("key_currency_type", str2);
        intent.putExtra("key_pay_type", 6);
        intent.putExtra("key_wecoin_price", String.valueOf(i));
        String str5 = "";
        if (!C87412m.m108589b(str3, str5)) {
            try {
                String format2 = new DecimalFormat("#.#").format(Double.parseDouble(str3));
                C87412m.m108593f(format2, "{\n                Decima…toDouble())\n            }");
                str3 = format2;
            } catch (NumberFormatException unused) {
                Log.m105920e("MicroMsg.EmojiWecoinTool", "formatOriginPrice error, priceNum:" + str3);
            }
            str5 = str3;
        }
        intent.putExtra("key_price", str5);
        intent.putExtra("key_desc", format);
        intent.putExtra("key_product_title_insufficient", MMApplicationContext.getContext().getString(C0966R.string.mqg));
        Log.m105924i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] enter wecoin pay");
        C88144b.m109795m(context, "wallet_index", ".ui.WecoinIapUI", intent, 2001);
    }

    /* renamed from: b */
    public static final void m13457b(Context context, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "content");
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(str);
        qVar.mo107602n(context.getString(C0966R.string.f360378ca2));
        qVar.mo107590b(new C14126f(aVar));
        qVar.mo107603o();
        qVar.f225839c.mo107529i(-2, false);
    }

    /* renamed from: c */
    public static final void m13458c(boolean z) {
        if (MMApplicationContext.isMainProcess() && C86709a0.m107522a()) {
            f39524b = z ? 1 : 0;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, Integer.valueOf(f39524b));
        }
    }
}
