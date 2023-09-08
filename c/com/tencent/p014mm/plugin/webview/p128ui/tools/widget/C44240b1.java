package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import nj3.C76879j;
import ob0.C47350c;
import pe3.C47465a;
import qo3.C89779i0;
import t83.C48590l;
import te3.C49239e6;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.b1 */
public final class C44240b1 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C44366w0 f119890a;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.b1$a */
    public static final class C44241a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44366w0 f119891d;

        /* renamed from: e */
        public final /* synthetic */ int f119892e;

        /* renamed from: f */
        public final /* synthetic */ int f119893f;

        /* renamed from: g */
        public final /* synthetic */ String f119894g;

        /* renamed from: h */
        public final /* synthetic */ C47350c f119895h;

        public C44241a(C44366w0 w0Var, int i, int i2, String str, C47350c cVar) {
            this.f119891d = w0Var;
            this.f119892e = i;
            this.f119893f = i2;
            this.f119894g = str;
            this.f119895h = cVar;
        }

        public final void run() {
            C48590l lVar;
            C89779i0 i0Var = this.f119891d.getWebView().f118510Z1;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
            }
            if (this.f119891d.getWeakThis$plugin_webview_release().get() != null) {
                C44366w0 w0Var = this.f119891d.getWeakThis$plugin_webview_release().get();
                C87412m.m108592e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
                C44366w0 w0Var2 = w0Var;
                int i = this.f119892e;
                int i2 = this.f119893f;
                String str = this.f119894g;
                C47350c cVar = this.f119895h;
                C87412m.m108593f(cVar, "rr");
                if (i2 == 0 || Util.isNullOrNil(str)) {
                    C47465a aVar = cVar.f127055a.f127080a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgLikeCommentReq");
                    C49239e6 e6Var = (C49239e6) aVar;
                    if (i == 0 && i2 == 0) {
                        int i3 = e6Var.f132718h;
                        if (i3 == 1) {
                            C48590l lVar2 = w0Var2.f120257t.f118508Z;
                            if (lVar2 != null) {
                                lVar2.mo73220Q("praiseComment", e6Var.f132715e, "", 0, e6Var.f132717g);
                            }
                        } else if (i3 == 2 && (lVar = w0Var2.f120257t.f118508Z) != null) {
                            lVar.mo73220Q("praiseComment", e6Var.f132715e, "", e6Var.f132719i, e6Var.f132717g);
                        }
                    }
                } else {
                    C76879j.m92754y(w0Var2.getContext(), str, "", w0Var2.getContext().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                }
            }
        }
    }

    public C44240b1(C44366w0 w0Var) {
        this.f119890a = w0Var;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        MMHandlerThread.postToMainThread(new C44241a(this.f119890a, i, i2, str, cVar));
    }
}
