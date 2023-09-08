package com.tencent.p014mm.smiley;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.p014mm.smiley.C96961p;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.i */
public final class C96940i {

    /* renamed from: a */
    public final SparseArray<C96971s0> f283990a = new SparseArray<>();

    /* renamed from: b */
    public final SparseArray<C96971s0> f283991b = new SparseArray<>();

    /* renamed from: c */
    public final SparseArray<C96928c0> f283992c = new SparseArray<>();

    /* renamed from: d */
    public SparseArray<String> f283993d = new SparseArray<>();

    /* renamed from: e */
    public final C96960o0 f283994e;

    /* renamed from: com.tencent.mm.smiley.i$a */
    public static final class C96941a extends C96925b {
        public C96941a() {
            this(0, 1, (C8480h) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96941a(int i, int i2, C8480h hVar) {
            super((i2 & 1) != 0 ? 1 : i);
        }

        /* renamed from: c */
        public C96925b mo135514c() {
            return new C96941a(0, 1, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.smiley.i$b */
    public static final class C96942b {

        /* renamed from: a */
        public static C96940i f283995a = new C96940i((C8480h) null);
    }

    public C96940i(C8480h hVar) {
        new SparseIntArray();
        this.f283994e = C96961p.C96962a.f284061a.f284060a;
    }

    /* renamed from: a */
    public void mo135530a(CharSequence charSequence, int i, int i2, C96975y yVar) {
        C87412m.m108594g(yVar, "matchCallback");
        new C96951l(this.f283994e).mo135537a(charSequence, i, i2, yVar);
    }
}
