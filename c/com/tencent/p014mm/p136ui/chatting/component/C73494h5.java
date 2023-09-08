package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.component.TranslateComponent;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.component.h5 */
public class C73494h5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f215919d;

    /* renamed from: e */
    public final /* synthetic */ String f215920e;

    /* renamed from: f */
    public final /* synthetic */ TranslateComponent.C733972 f215921f;

    public C73494h5(TranslateComponent.C733972 r1, int i, String str) {
        this.f215921f = r1;
        this.f215919d = i;
        this.f215920e = str;
    }

    public void run() {
        int i = this.f215919d;
        if (i == 0) {
            TranslateComponent translateComponent = TranslateComponent.this;
            translateComponent.f215696j++;
            translateComponent.mo102306Y5(Util.safeParseLong(this.f215920e), ChattingItemTranslate.C73918e.Transformed);
            TranslateComponent translateComponent2 = TranslateComponent.this;
            translateComponent2.f215691e.add(new C73488g5(translateComponent2, Util.safeParseLong(this.f215920e)));
            return;
        }
        if (i == 3) {
            C76879j.m92726T(TranslateComponent.this.f215752d.mo91565f(), TranslateComponent.this.f215752d.mo91572m().getString(C0966R.string.bch));
        } else if (i != 5) {
            C76879j.m92726T(TranslateComponent.this.f215752d.mo91565f(), TranslateComponent.this.f215752d.mo91572m().getString(C0966R.string.bc7));
        }
        TranslateComponent.this.mo102306Y5(Util.safeParseLong(this.f215920e), ChattingItemTranslate.C73918e.NoTransform);
        TranslateComponent.this.f215752d.mo91540A();
    }
}
