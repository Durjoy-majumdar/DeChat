package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.game.model.C42035a;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import sw1.C48483p;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.game.p */
public class C42151p extends C86301e implements C48483p {

    /* renamed from: d */
    public C42035a f113605d;

    /* renamed from: e */
    public C42036a0 f113606e;

    /* renamed from: ar */
    public C42036a0 mo66079ar() {
        C86709a0.m107523b().mo121108c();
        if (this.f113606e == null) {
            synchronized (this) {
                if (this.f113606e == null) {
                    this.f113606e = new C42036a0();
                }
            }
        }
        return this.f113606e;
    }

    public C42035a xg0() {
        C86709a0.m107523b().mo121108c();
        if (this.f113605d == null) {
            synchronized (this) {
                if (this.f113605d == null) {
                    this.f113605d = new C42035a();
                }
            }
        }
        return this.f113605d;
    }
}
