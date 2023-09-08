package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p140cw.C7138g;
import p910lj.C76701a;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.c */
public final class C5340c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ColorfulChatroomQRCodeUI f20973d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.c$a */
    public static final class C5341a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20974d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f20975e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5341a(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI, Bitmap bitmap) {
            super(0);
            this.f20974d = colorfulChatroomQRCodeUI;
            this.f20975e = bitmap;
        }

        public Object invoke() {
            C76701a.makeText((Context) this.f20974d.getContext(), (CharSequence) this.f20974d.getString(C0966R.string.fn4, new Object[]{((C7138g) C86312j.m106911c(C7138g.class)).mo8327wx()}), 1).show();
            this.f20975e.recycle();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.c$b */
    public static final class C5342b implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ ColorfulChatroomQRCodeUI f20976a;

        public C5342b(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
            this.f20976a = colorfulChatroomQRCodeUI;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, "isOk");
            if (bool.booleanValue()) {
                ColorfulChatroomQRCodeUI.m5210H7(this.f20976a);
            }
        }
    }

    public C5340c(ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f20973d = colorfulChatroomQRCodeUI;
    }

    public final void run() {
        if (((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.STORAGE, C113177k.C113178a.SAVE_FILE, new C5342b(this.f20973d))) {
            Log.m105924i("MicroMsg.ColorfulChatroomQRCodeUI", "business switch close ,return");
            return;
        }
        Bitmap I7 = this.f20973d.mo6165I7();
        ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f20973d;
        C5341a aVar = new C5341a(this.f20973d, I7);
        colorfulChatroomQRCodeUI.getClass();
        ((C119157j) C119157j.f356862d).mo183875f(new C5354g(I7, ((C7138g) C86312j.m106911c(C7138g.class)).mo8323lm() + "mmqrcode" + System.currentTimeMillis() + ".png", colorfulChatroomQRCodeUI, aVar));
    }
}
