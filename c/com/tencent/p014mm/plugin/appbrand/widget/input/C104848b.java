package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import rt0.C36482d;
import rt0.C36483h;
import rt0.C77568i;
import rt0.C90098e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.b */
public enum C104848b {
    ;

    /* renamed from: a */
    public static <Input extends EditText & C104863f1> void m140515a(Input input, C77568i iVar) {
        C36482d dVar = C36482d.NORMAL;
        Class cls = C36482d.class;
        if (input != null && iVar != null) {
            Float f = iVar.f331040k;
            if (!(f == null || f.floatValue() == input.getTextSize())) {
                input.setTextSize(iVar.f331040k.floatValue());
            }
            Integer num = iVar.f331039j;
            if (num != null) {
                input.setTextColor(num.intValue());
            }
            if (iVar.f331038i == null) {
                input.setBackground((Drawable) null);
            } else if (input.getBackground() == null || !(input.getBackground() instanceof ColorDrawable) || ((ColorDrawable) input.getBackground()).getColor() != iVar.f331038i.intValue()) {
                input.setBackground(new ColorDrawable(iVar.f331038i.intValue()));
            }
            String str = iVar.f331044o;
            int i = 0;
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    input.setHint("");
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.f331044o);
                    int length = iVar.f331044o.length();
                    C36482d dVar2 = (C36482d) C90098e.m112719a(iVar.f331045p, cls);
                    if (dVar2 == null) {
                        dVar2 = dVar;
                    }
                    spannableStringBuilder.setSpan(new StyleSpan(dVar2.f97066d), 0, length, 18);
                    if (iVar.f331047r != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(iVar.f331047r.intValue()), 0, length, 18);
                    }
                    if (iVar.f331046q != null) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iVar.f331046q.intValue(), false), 0, length, 18);
                    }
                    input.setHint(spannableStringBuilder);
                }
            }
            String str2 = iVar.f331042m;
            if (str2 != null) {
                C36482d dVar3 = (C36482d) C90098e.m112719a(str2, cls);
                if (dVar3 != null) {
                    dVar = dVar3;
                }
                Typeface create = Typeface.create("sans-serif", dVar.f97066d);
                if (create != null) {
                    input.setTypeface(create);
                }
            }
            C36483h hVar = (C36483h) C90098e.m112719a(iVar.f331037h, C36483h.class);
            C36483h hVar2 = C36483h.LEFT;
            if (hVar == null) {
                hVar = hVar2;
            }
            C104863f1 f1Var = (C104863f1) input;
            int ordinal = hVar.ordinal();
            if (ordinal == 0) {
                f1Var.mo148812j();
            } else if (ordinal == 1) {
                f1Var.mo148803f();
            } else if (ordinal == 2) {
                f1Var.mo148802e();
            }
            if (C84975p1.m104768c(iVar.f331049t)) {
                i = 8;
            }
            input.setVisibility(i);
            f1Var.setFixed(C84975p1.m104768c(iVar.f331053x));
        }
    }

    /* renamed from: b */
    public static <Input extends EditText & C104863f1> void m140516b(Input input, int i, int i2) {
        if (input == null || input.getEditableText() == null) {
            Log.m105929w("MicroMsg.AppBrandInputCommStyleHelper", "applySelection, invalid input %s", input);
            return;
        }
        if (i <= -2) {
            i = input.getSelectionStart();
        } else if (i == -1 || i > input.getText().length()) {
            i = input.getText().length();
        }
        if (i2 <= -2) {
            i2 = input.getSelectionEnd();
        } else if (i2 == -1 || i2 > input.getText().length()) {
            i2 = input.getText().length();
        }
        if (i > i2) {
            i = i2;
        }
        Selection.removeSelection(input.getEditableText());
        input.setSelection(i, i2);
    }
}
