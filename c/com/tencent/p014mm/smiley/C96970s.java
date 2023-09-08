package com.tencent.p014mm.smiley;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.smiley.EmojiDrawableBitmapRepo;
import gy3.C8478d0;
import gy3.C87412m;
import p490dl.C97487n;
import q90.C101062d;

/* renamed from: com.tencent.mm.smiley.s */
public final class C96970s implements C96975y {

    /* renamed from: a */
    public final /* synthetic */ C8478d0 f284082a;

    /* renamed from: b */
    public final /* synthetic */ PInt f284083b;

    /* renamed from: c */
    public final /* synthetic */ C8478d0 f284084c;

    /* renamed from: d */
    public final /* synthetic */ C8478d0 f284085d;

    /* renamed from: e */
    public final /* synthetic */ C96965r f284086e;

    /* renamed from: f */
    public final /* synthetic */ Spannable f284087f;

    public C96970s(C8478d0 d0Var, PInt pInt, C8478d0 d0Var2, C8478d0 d0Var3, C96965r rVar, Spannable spannable) {
        this.f284082a = d0Var;
        this.f284083b = pInt;
        this.f284084c = d0Var2;
        this.f284085d = d0Var3;
        this.f284086e = rVar;
        this.f284087f = spannable;
    }

    /* renamed from: a */
    public boolean mo135526a(C96974x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "item");
        if (this.f284082a.f27483d < this.f284083b.value && (xVar instanceof C96973t0)) {
            int i3 = EmojiDrawableBitmapRepo.f283926b;
            EmojiDrawableBitmapRepo emojiDrawableBitmapRepo = EmojiDrawableBitmapRepo.C96922a.f283929a;
            C96973t0 t0Var = (C96973t0) xVar;
            String valueOf = String.valueOf(t0Var.f284095a.f283953d);
            emojiDrawableBitmapRepo.getClass();
            C87412m.m108594g(valueOf, "key");
            if (((C101062d) C97487n.C97488a.f286127a.f286125b).check(valueOf)) {
                this.f284084c.f27483d++;
            } else {
                this.f284085d.f27483d++;
            }
            this.f284082a.f27483d++;
            C96965r rVar = this.f284086e;
            Spannable spannable = this.f284087f;
            rVar.getClass();
            Drawable a = emojiDrawableBitmapRepo.mo135511a(t0Var, true);
            if (a != null) {
                spannable.setSpan(new C72953u(a, false, i, i2), i, i2, 33);
            }
        }
        return false;
    }
}
