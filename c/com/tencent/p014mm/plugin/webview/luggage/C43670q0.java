package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43634a;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43656s;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43657t;
import java.util.HashMap;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.webview.luggage.q0 */
public class C43670q0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C43687x0 f118039d;

    public C43670q0(C43687x0 x0Var) {
        this.f118039d = x0Var;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        C43687x0 x0Var = this.f118039d;
        C43656s sVar = x0Var.f118057b;
        C43658n nVar = x0Var.f118056a;
        Context context = nVar.f148196d;
        for (C43657t next : sVar.f117902a) {
            if (!next.f117906c && !next.f117908e) {
                C43634a aVar = (C43634a) ((HashMap) sVar.f117903b).get(Integer.valueOf(next.f117904a));
                if (aVar != null) {
                    aVar.mo67921a(context, nVar, e0Var);
                }
            }
        }
    }
}
