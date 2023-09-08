package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.e0 */
public final class C69207e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ListScrollPAGView f199134d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.e0$a */
    public static final class C69208a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ListScrollPAGView f199135d;

        public C69208a(ListScrollPAGView listScrollPAGView) {
            this.f199135d = listScrollPAGView;
        }

        public final void run() {
            ListScrollPAGView listScrollPAGView = this.f199135d;
            listScrollPAGView.f48757i = true;
            listScrollPAGView.f48758j = null;
            listScrollPAGView.mo21215g();
        }
    }

    public C69207e0(ListScrollPAGView listScrollPAGView) {
        this.f199134d = listScrollPAGView;
    }

    public final void run() {
        this.f199134d.mo21221h();
        ((C119157j) C119157j.f356862d).mo183895z(new C69208a(this.f199134d));
    }
}
