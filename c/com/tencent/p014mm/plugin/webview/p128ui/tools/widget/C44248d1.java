package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.KeyboardLinearLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.d1 */
public final class C44248d1 implements KeyboardLinearLayout.C44683b {

    /* renamed from: a */
    public final /* synthetic */ C44366w0 f119906a;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.d1$a */
    public static final class C44249a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f119907d;

        public C44249a(C44366w0 w0Var) {
            this.f119907d = w0Var;
        }

        public final void run() {
            MPSmileyFooter k = this.f119907d.getSayFooter();
            k.setVisibility(0);
            WeImageView weImageView = k.f119810i;
            if (weImageView != null) {
                weImageView.setImageResource(k.mo68900c(C0966R.attr.f2752hc));
            }
            this.f119907d.getSayFooter().postInvalidate();
            this.f119907d.f120235B.postInvalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.d1$b */
    public static final class C44250b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f119908d;

        public C44250b(C44366w0 w0Var) {
            this.f119908d = w0Var;
        }

        public final void run() {
            MPSmileyFooter k = this.f119908d.getSayFooter();
            if (!k.mo68901d()) {
                k.setVisibility(8);
            }
            this.f119908d.getSayFooter().postInvalidate();
            this.f119908d.f120235B.postInvalidate();
        }
    }

    public C44248d1(C44366w0 w0Var) {
        this.f119906a = w0Var;
    }

    /* renamed from: a */
    public final void mo67991a(int i) {
        int i2 = C44366w0.f120233Q0;
        Log.m105924i("MicroMsg.MPWriteCommentLayout", "onKeyBoardStateChange, state = " + i);
        if (i == -3) {
            int keyBoardHeight = this.f119906a.f120259v.getKeyBoardHeight();
            if (keyBoardHeight > 0) {
                C44366w0.m48737i(this.f119906a, keyBoardHeight);
                C44366w0.m48737i(this.f119906a, keyBoardHeight);
            }
            new MMHandler().postDelayed(new C44249a(this.f119906a), 10);
        } else {
            C44366w0.m48737i(this.f119906a, 0);
            C44366w0.m48737i(this.f119906a, 0);
            new MMHandler().postDelayed(new C44250b(this.f119906a), 10);
        }
        this.f119906a.f120241H = i;
    }
}
