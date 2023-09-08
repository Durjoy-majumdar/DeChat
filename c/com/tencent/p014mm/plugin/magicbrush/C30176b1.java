package com.tencent.p014mm.plugin.magicbrush;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d42.C86195z;
import di3.C86301e;
import e42.C7594e;
import ei3.C86522b;
import fy3.C32224a;
import g42.C87140c;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.b1 */
public final class C30176b1 extends C86301e implements C85278l0 {

    /* renamed from: d */
    public final C13601g f81579d = C36568h.m40985a(C30177a.f81580d);

    /* renamed from: com.tencent.mm.plugin.magicbrush.b1$a */
    public static final class C30177a extends C87413o implements C32224a<C87140c> {

        /* renamed from: d */
        public static final C30177a f81580d = new C30177a();

        public C30177a() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            return new C87140c(context);
        }
    }

    /* renamed from: mI */
    public <T extends C7594e> C86195z<T> mo57202mI(String str) {
        C87412m.m108594g(str, "bizName");
        return ((C87140c) ((C36570n) this.f81579d).getValue()).mo57202mI(str);
    }
}
