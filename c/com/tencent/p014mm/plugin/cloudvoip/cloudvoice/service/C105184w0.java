package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51120rk2;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w0 */
public class C105184w0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C85147b f312401a;

    /* renamed from: b */
    public final /* synthetic */ boolean f312402b;

    /* renamed from: c */
    public final /* synthetic */ C105181w f312403c;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w0$a */
    public class C105185a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f312404d;

        /* renamed from: e */
        public final /* synthetic */ int f312405e;

        /* renamed from: f */
        public final /* synthetic */ C47350c f312406f;

        /* renamed from: g */
        public final /* synthetic */ String f312407g;

        public C105185a(int i, int i2, C47350c cVar, String str) {
            this.f312404d = i;
            this.f312405e = i2;
            this.f312406f = cVar;
            this.f312407g = str;
        }

        public void run() {
            C47465a aVar;
            if (this.f312404d == 0 && this.f312405e == 0 && (aVar = this.f312406f.f127056b.f127083a) != null) {
                C105184w0 w0Var = C105184w0.this;
                C105181w wVar = w0Var.f312403c;
                long j = ((C51120rk2) aVar).f140975d;
                wVar.f312355R = j;
                C105181w.m141243b(wVar, j, w0Var.f312402b, w0Var.f312401a);
                return;
            }
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "hy: getroomId fail, errType:" + this.f312404d + ",errCode:" + this.f312405e);
            C105184w0 w0Var2 = C105184w0.this;
            C105181w wVar2 = w0Var2.f312403c;
            C85147b bVar = w0Var2.f312401a;
            String format = String.format("join room failed. errType: %d, errCode: %d, errMsg: %s", new Object[]{Integer.valueOf(this.f312404d), Integer.valueOf(this.f312405e), this.f312407g});
            C105181w wVar3 = C105181w.INSTANCE;
            wVar2.mo149497c(bVar, -10088, -10, format);
        }
    }

    public C105184w0(C105181w wVar, C85147b bVar, boolean z) {
        this.f312403c = wVar;
        this.f312401a = bVar;
        this.f312402b = z;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        this.f312403c.mo149500g(new C105185a(i, i2, cVar, str));
    }
}
