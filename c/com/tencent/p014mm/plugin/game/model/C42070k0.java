package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.io.IOException;
import py1.C47542a1;
import py1.C47549b1;
import py1.C47551b3;
import py1.C47577f1;
import py1.C47581f5;
import py1.C47589h;
import py1.C47699x0;
import py1.C47705y0;
import py1.C47711z0;
import py1.C47712z1;
import sw1.C48483p;
import uy1.C52644e;

/* renamed from: com.tencent.mm.plugin.game.model.k0 */
public class C42070k0 extends C42056f0 {

    /* renamed from: a */
    public C47712z1 f113349a;

    /* renamed from: b */
    public C47551b3 f113350b;

    /* renamed from: c */
    public C42071a f113351c;

    /* renamed from: d */
    public C47542a1 f113352d;

    /* renamed from: e */
    public C47581f5 f113353e;

    /* renamed from: f */
    public C47577f1 f113354f;

    /* renamed from: com.tencent.mm.plugin.game.model.k0$a */
    public static class C42071a {

        /* renamed from: a */
        public C42039b f113355a;

        /* renamed from: b */
        public C47705y0 f113356b;

        /* renamed from: c */
        public C47711z0 f113357c;

        /* renamed from: d */
        public C47549b1 f113358d;
    }

    public C42070k0(C47712z1 z1Var, boolean z) {
        if (z1Var == null) {
            this.f113349a = new C47712z1();
            return;
        }
        this.f113349a = z1Var;
        mo66038b(z);
    }

    /* renamed from: b */
    public final void mo66038b(boolean z) {
        C47589h hVar;
        C47589h hVar2;
        C47712z1 z1Var = this.f113349a;
        if (z1Var != null) {
            this.f113350b = z1Var.f128178g;
            C47699x0 x0Var = z1Var.f128175d;
            if (!(x0Var == null || (hVar2 = x0Var.f128130d) == null)) {
                C42071a aVar = new C42071a();
                this.f113351c = aVar;
                aVar.f113355a = C42056f0.m45762a(hVar2);
                C42071a aVar2 = this.f113351c;
                C42039b bVar = aVar2.f113355a;
                if (bVar != null) {
                    bVar.f113249B1 = this.f113349a.f128175d.f128133g;
                    bVar.f113254G1 = 10;
                    bVar.f113255H1 = 1002;
                    bVar.f113256I1 = 1;
                }
                C47712z1 z1Var2 = this.f113349a;
                C47699x0 x0Var2 = z1Var2.f128175d;
                aVar2.f113356b = x0Var2.f128132f;
                aVar2.f113357c = x0Var2.f128131e;
                aVar2.f113358d = z1Var2.f128177f;
            }
            C47712z1 z1Var3 = this.f113349a;
            this.f113352d = z1Var3.f128176e;
            this.f113353e = z1Var3.f128179h;
            this.f113354f = z1Var3.f128180i;
        }
        C47712z1 z1Var4 = this.f113349a;
        if (z1Var4 != null && z) {
            C47699x0 x0Var3 = z1Var4.f128175d;
            if (!(x0Var3 == null || (hVar = x0Var3.f128130d) == null)) {
                C52644e.m59021b(C42056f0.m45762a(hVar));
            }
            ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65971b(MMApplicationContext.getContext());
        }
    }

    public C42070k0(byte[] bArr, boolean z) {
        C47712z1 z1Var = new C47712z1();
        this.f113349a = z1Var;
        if (bArr != null && bArr.length != 0) {
            try {
                z1Var.parseFrom(bArr);
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GamePBDataIndex4", "Parsing Failed: %s", e.getMessage());
            }
            mo66038b(z);
        }
    }
}
