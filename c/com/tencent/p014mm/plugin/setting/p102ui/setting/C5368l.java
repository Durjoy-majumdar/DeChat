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

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.l */
public final class C5368l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ColorfulSelfQRCodeUI f21011d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.l$a */
    public static final class C5369a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ColorfulSelfQRCodeUI f21012d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f21013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5369a(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI, Bitmap bitmap) {
            super(0);
            this.f21012d = colorfulSelfQRCodeUI;
            this.f21013e = bitmap;
        }

        public Object invoke() {
            C76701a.makeText((Context) this.f21012d.getContext(), (CharSequence) this.f21012d.getString(C0966R.string.fn4, new Object[]{((C7138g) C86312j.m106911c(C7138g.class)).mo8327wx()}), 1).show();
            this.f21013e.recycle();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.l$b */
    public static final class C5370b implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ ColorfulSelfQRCodeUI f21014a;

        public C5370b(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
            this.f21014a = colorfulSelfQRCodeUI;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, "isOk");
            if (bool.booleanValue()) {
                ColorfulSelfQRCodeUI.m5223H7(this.f21014a);
            }
        }
    }

    public C5368l(ColorfulSelfQRCodeUI colorfulSelfQRCodeUI) {
        this.f21011d = colorfulSelfQRCodeUI;
    }

    public final void run() {
        if (((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.STORAGE, C113177k.C113178a.SAVE_FILE, new C5370b(this.f21011d))) {
            Log.m105924i("MicroMsg.Setting.ColorfulSelfQRCodeUI", "business switch close ,return");
            return;
        }
        Bitmap I7 = this.f21011d.mo6183I7();
        ColorfulSelfQRCodeUI colorfulSelfQRCodeUI = this.f21011d;
        C5369a aVar = new C5369a(this.f21011d, I7);
        colorfulSelfQRCodeUI.getClass();
        ((C119157j) C119157j.f356862d).mo183875f(new C5375n(I7, ((C7138g) C86312j.m106911c(C7138g.class)).mo8323lm() + "mmqrcode" + System.currentTimeMillis() + ".png", colorfulSelfQRCodeUI, aVar));
    }
}
