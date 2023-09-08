package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C12925w;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.view.y */
public final class C4213y extends C12925w {

    /* renamed from: F */
    public final String f18509F = "CustomInputBottomPage";

    /* renamed from: G */
    public final C13601g f18510G;

    /* renamed from: com.tencent.mm.plugin.finder.view.y$a */
    public static final class C4214a extends C87413o implements C32224a<KeyboardHeightProvider> {

        /* renamed from: d */
        public final /* synthetic */ Activity f18511d;

        /* renamed from: e */
        public final /* synthetic */ C4213y f18512e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4214a(Activity activity, C4213y yVar) {
            super(0);
            this.f18511d = activity;
            this.f18512e = yVar;
        }

        public Object invoke() {
            KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this.f18511d);
            keyboardHeightProvider.f220015b = new C4203x(this.f18512e);
            return keyboardHeightProvider;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4213y(Activity activity) {
        super(activity);
        C87412m.m108594g(activity, "context");
        this.f18510G = C36568h.m40985a(new C4214a(activity, this));
    }

    /* renamed from: n */
    public void mo5085n() {
        ((KeyboardHeightProvider) ((C36570n) this.f18510G).getValue()).mo104021d();
        super.mo5085n();
    }

    /* renamed from: o */
    public void mo5086o() {
        ((KeyboardHeightProvider) ((C36570n) this.f18510G).getValue()).mo104022e();
        super.mo5086o();
    }
}
