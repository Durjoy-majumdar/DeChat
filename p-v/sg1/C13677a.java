package sg1;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import nj3.C76912y0;
import rx3.C13601g;
import rx3.C36568h;
import z04.C112550d0;

/* renamed from: sg1.a */
public final class C13677a {

    /* renamed from: a */
    public static final C13677a f38723a = new C13677a();

    /* renamed from: b */
    public static final C13601g f38724b = C36568h.m40985a(C13679b.f38725d);

    /* renamed from: sg1.a$a */
    public static final class C13678a extends ClickableSpan {
        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/charge/ChargeUtil$SpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            Log.m105924i("setWhiteListSetterText", "copy https://channels.weixin.qq.com");
            ClipboardHelper.setText("https://channels.weixin.qq.com");
            C76912y0.m92768g(MMApplicationContext.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.f7938wv));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/charge/ChargeUtil$SpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: sg1.a$b */
    public static final class C13679b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C13679b f38725d = new C13679b();

        public C13679b() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86034A1.mo60266n().intValue() == 0);
        }
    }

    /* renamed from: a */
    public final String mo13061a(Context context, int i, int i2) {
        C87412m.m108594g(context, "context");
        if (i2 == 2) {
            int i3 = i % 3600;
            if (i3 == 0) {
                String string = context.getResources().getString(C0966R.string.n7_);
                C87412m.m108593f(string, "context.resources.getStr…ree_mode_2_rigth_an_hour)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                return format;
            } else if (i > 3600) {
                String string2 = context.getResources().getString(C0966R.string.n79);
                C87412m.m108593f(string2, "context.resources.getStr…free_mode_2_over_an_hour)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf(i3 / 60)}, 2));
                C87412m.m108593f(format2, "format(format, *args)");
                return format2;
            } else {
                String string3 = context.getResources().getString(C0966R.string.n7b);
                C87412m.m108593f(string3, "context.resources.getStr…ree_mode_2_under_an_hour)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
                C87412m.m108593f(format3, "format(format, *args)");
                return format3;
            }
        } else {
            int i4 = i % 3600;
            if (i4 == 0) {
                String string4 = context.getResources().getString(C0966R.string.f360574n82);
                C87412m.m108593f(string4, "context.resources.getStr…_time_unit_right_an_hour)");
                String format4 = String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600)}, 1));
                C87412m.m108593f(format4, "format(format, *args)");
                return format4;
            } else if (i > 3600) {
                String string5 = context.getResources().getString(C0966R.string.f360573n81);
                C87412m.m108593f(string5, "context.resources.getStr…h_time_unit_over_an_hour)");
                String format5 = String.format(string5, Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf(i4 / 60)}, 2));
                C87412m.m108593f(format5, "format(format, *args)");
                return format5;
            } else {
                String string6 = context.getResources().getString(C0966R.string.f360575n83);
                C87412m.m108593f(string6, "context.resources.getStr…_time_unit_under_an_hour)");
                String format6 = String.format(string6, Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
                C87412m.m108593f(format6, "format(format, *args)");
                return format6;
            }
        }
    }

    /* renamed from: b */
    public final String mo13062b(Context context, int i) {
        C87412m.m108594g(context, "context");
        int i2 = i % 3600;
        if (i2 == 0) {
            String string = context.getResources().getString(C0966R.string.f360574n82);
            C87412m.m108593f(string, "context.resources.getStr…_time_unit_right_an_hour)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        } else if (i > 3600) {
            String string2 = context.getResources().getString(C0966R.string.f360573n81);
            C87412m.m108593f(string2, "context.resources.getStr…h_time_unit_over_an_hour)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf(i2 / 60)}, 2));
            C87412m.m108593f(format2, "format(format, *args)");
            return format2;
        } else {
            String string3 = context.getResources().getString(C0966R.string.f360575n83);
            C87412m.m108593f(string3, "context.resources.getStr…_time_unit_under_an_hour)");
            String format3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
            C87412m.m108593f(format3, "format(format, *args)");
            return format3;
        }
    }

    /* renamed from: c */
    public final void mo13063c(TextView textView) {
        C87412m.m108594g(textView, "tv");
        String string = textView.getContext().getResources().getString(C0966R.string.n_4);
        C87412m.m108593f(string, "tv.context.resources.get…y_white_list_setter_copy)");
        String string2 = textView.getContext().getResources().getString(C0966R.string.n_1);
        C87412m.m108593f(string2, "tv.context.resources.get…y_no_white_list_tips_new)");
        String format = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        int E = C112550d0.m153769E(format, string, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new C13678a(), E, string.length() + E, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }
}
