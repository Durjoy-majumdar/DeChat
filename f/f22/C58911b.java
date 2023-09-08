package f22;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f22.C58909a;
import gy3.C87412m;
import kg3.C76577a;
import p255vr.C78470h;
import p629ny.C76979h;
import ph3.C77087a;

/* renamed from: f22.b */
public final class C58911b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58909a.C58910a f168581d;

    /* renamed from: e */
    public final /* synthetic */ C58909a f168582e;

    /* renamed from: f */
    public final /* synthetic */ Context f168583f;

    /* renamed from: g */
    public final /* synthetic */ C58909a f168584g;

    public C58911b(C58909a.C58910a aVar, C58909a aVar2, Context context, C58909a aVar3) {
        this.f168581d = aVar;
        this.f168582e = aVar2;
        this.f168583f = context;
        this.f168584g = aVar3;
    }

    public final void run() {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            TextView textView = this.f168581d.f168575I;
            C87412m.m108591d(textView);
            ViewParent parent = textView.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int measuredWidth = ((ViewGroup) parent).getMeasuredWidth();
            if (measuredWidth != 0) {
                String str = '@' + this.f168582e.f168569j;
                int h = C76577a.m92157h(this.f168583f, C0966R.dimen.f3684bd);
                TextView textView2 = new TextView(this.f168583f);
                float f = (float) h;
                textView2.getPaint().setTextSize(f);
                float measureText = textView2.getPaint().measureText(' ' + str);
                TextPaint paint = textView2.getPaint();
                TextView textView3 = this.f168581d.f168575I;
                C87412m.m108591d(textView3);
                paint.setTextSize(textView3.getTextSize());
                double d = (double) measuredWidth;
                if (((double) measureText) >= 0.6d * d) {
                    charSequence = TextUtils.ellipsize(this.f168582e.f168567h, textView2.getPaint(), (float) (d * 0.4d), TextUtils.TruncateAt.END);
                    C87412m.m108593f(charSequence, "ellipsize(dataItem.nickn…TextUtils.TruncateAt.END)");
                    float measureText2 = textView2.getPaint().measureText(charSequence.toString());
                    textView2.getPaint().setTextSize(f);
                    CharSequence ellipsize = TextUtils.ellipsize(str, textView2.getPaint(), (((float) measuredWidth) - measureText2) - ((float) 20), TextUtils.TruncateAt.END);
                    C87412m.m108593f(ellipsize, "ellipsize(openIMWording,…TextUtils.TruncateAt.END)");
                    charSequence2 = ellipsize;
                } else {
                    charSequence = TextUtils.ellipsize(this.f168582e.f168567h, textView2.getPaint(), ((float) measuredWidth) - measureText, TextUtils.TruncateAt.END);
                    C87412m.m108593f(charSequence, "ellipsize(dataItem.nickn…TextUtils.TruncateAt.END)");
                    charSequence2 = str;
                }
                CharSequence charSequence3 = charSequence;
                Context context = this.f168583f;
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence3);
                sb.append(' ');
                sb.append(charSequence2);
                SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, sb.toString());
                ColorStateList e = C76577a.m92154e(this.f168583f, C0966R.color.a7t);
                T1.setSpan(new TextAppearanceSpan((String) null, 0, h, e, e), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
                T1.setSpan(new C77087a(h), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
                ((C78470h) C86312j.m106911c(C78470h.class)).mo108300VH(T1, this.f168581d.f168575I);
            }
        } catch (Exception e2) {
            Log.m105921e(this.f168584g.f168564e, "fillingViewItem Exception:%s %s", e2.getClass().getSimpleName(), e2.getMessage());
        }
    }
}
