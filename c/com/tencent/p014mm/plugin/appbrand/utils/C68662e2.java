package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.util.Pair;
import go3.C76003c;
import gy3.C8480h;
import gy3.C87412m;
import js0.C76448t;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.e2 */
public final class C68662e2 {

    /* renamed from: a */
    public static final C68663a f197218a = new C68663a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.e2$a */
    public static final class C68663a {
        public C68663a(C8480h hVar) {
        }

        /* renamed from: a */
        public final Pair<SpannableString, Integer> mo94370a(Context context, int i, int i2, int i3, int i4, ClickableSpan clickableSpan) {
            C87412m.m108594g(context, "context");
            Drawable drawable = context.getResources().getDrawable(i);
            C87412m.m108593f(drawable, "context.resources.getDrawable(iconResId)");
            drawable.setBounds(C76448t.m91870a(i2), 0, C76448t.m91870a(i3 + i2), C76448t.m91870a(i4));
            C76003c cVar = new C76003c(drawable, 1);
            SpannableString spannableString = new SpannableString("@");
            spannableString.setSpan(cVar, 0, 1, 33);
            if (clickableSpan != null) {
                spannableString.setSpan(clickableSpan, 0, 1, 33);
            }
            return new Pair<>(spannableString, Integer.valueOf(drawable.getBounds().right));
        }
    }
}
