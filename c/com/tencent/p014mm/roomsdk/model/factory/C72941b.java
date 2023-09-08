package com.tencent.p014mm.roomsdk.model.factory;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ng3.C76856a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p530fx.C45818b;
import pg3.C77084b;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.roomsdk.model.factory.b */
public class C72941b extends C72940a implements C45818b {

    /* renamed from: f */
    public C117747y f212617f;

    /* renamed from: g */
    public C11385n f212618g = new C72942a();

    /* renamed from: com.tencent.mm.roomsdk.model.factory.b$a */
    public class C72942a implements C11385n {
        public C72942a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (C72941b.this.f212617f.equals(yVar)) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123470p(yVar.getType(), C72941b.this.f212618g);
                C89779i0 i0Var = C72941b.this.f212616e;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                if (yVar instanceof C76856a) {
                    ((C76856a) yVar).mo71848e0(C72941b.this.f212615d);
                }
                C77084b bVar = C72941b.this.f212615d;
                if (bVar != null) {
                    bVar.mo10150a(i, i2, str, bVar);
                }
                if (i == 0 && i2 == 0) {
                    C77084b bVar2 = C72941b.this.f212613b;
                    if (bVar2 != null) {
                        bVar2.mo10150a(i, i2, str, bVar2);
                        return;
                    }
                    return;
                }
                C77084b bVar3 = C72941b.this.f212614c;
                if (bVar3 != null) {
                    bVar3.mo10150a(i, i2, str, bVar3);
                }
            }
        }
    }

    public C72941b(boolean z) {
        this.f212612a = z;
    }

    /* renamed from: c */
    public void mo100865c() {
        C117747y yVar = this.f212617f;
        if (yVar != null) {
            Log.m105925i("MicroMsg.RoomCallbackFactory", "request scene %s", yVar);
            if (!(this.f212616e == null && this.f212613b == null && this.f212614c == null && this.f212615d == null)) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123455a(this.f212617f.getType(), this.f212618g);
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(this.f212617f);
        }
    }

    public void cancel() {
        if (this.f212617f != null) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f212617f);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(this.f212617f.getType(), this.f212618g);
        }
    }

    /* renamed from: d */
    public void mo100867d(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        if (this.f212617f != null) {
            this.f212616e = C76879j.m92723Q(context, str, str2, z, z2, onCancelListener);
            mo100865c();
        }
    }
}
