package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.OpenFileRequest;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.g1 */
public class C17890g1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ OpenFileRequest.C17886b.C17889c f49344d;

    public C17890g1(OpenFileRequest.C17886b.C17889c cVar) {
        this.f49344d = cVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        OpenFileRequest.C17886b bVar = OpenFileRequest.C17886b.this;
        int i = OpenFileRequest.C17886b.f49333o;
        e0Var.mo107142f(0, bVar.getString(C0966R.string.i48));
        if (!(OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI() == null || OpenFileRequest.C17886b.this.getAppBrandTaskProxyUI().f49247p == null)) {
            e0Var.mo107142f(3, OpenFileRequest.C17886b.this.getString(C0966R.string.cvn));
        }
        e0Var.mo107142f(1, OpenFileRequest.C17886b.this.getString(C0966R.string.bd6));
        e0Var.mo107142f(4, OpenFileRequest.C17886b.this.getString(C0966R.string.cmx));
        e0Var.mo107142f(5, OpenFileRequest.C17886b.this.getString(C0966R.string.cgm));
    }
}
