package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.game.model.C30099e0;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.plugin.game.model.silent_download.C42105i;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import ly1.C99734h;
import ly1.C99754l;
import sw1.C48484q;
import vx1.C53038b;
import vx1.C53039c;
import wx1.C38347e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.game.r */
public class C42152r extends C86301e implements C48484q {

    /* renamed from: d */
    public volatile C42040b0 f113607d;

    /* renamed from: e */
    public volatile C30099e0 f113608e;

    /* renamed from: f */
    public volatile C42105i f113609f;

    /* renamed from: g */
    public volatile C99754l f113610g;

    /* renamed from: h */
    public volatile C99734h f113611h;

    /* renamed from: i */
    public volatile C38347e f113612i;

    /* renamed from: j */
    public volatile C53039c f113613j;

    /* renamed from: Jx */
    public C53038b mo66103Jx() {
        C86709a0.m107523b().mo121108c();
        if (this.f113613j == null) {
            synchronized (this) {
                if (this.f113613j == null) {
                    C86709a0.m107528h();
                    this.f113613j = new C53039c(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113613j;
    }

    public C38347e Og0() {
        C86709a0.m107523b().mo121108c();
        if (this.f113612i == null) {
            synchronized (this) {
                if (this.f113612i == null) {
                    C86709a0.m107528h();
                    this.f113612i = new C38347e(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113612i;
    }

    public C42105i Po0() {
        C86709a0.m107523b().mo121108c();
        if (this.f113609f == null) {
            synchronized (this) {
                if (this.f113609f == null) {
                    C86709a0.m107528h();
                    this.f113609f = new C42105i(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113609f;
    }

    /* renamed from: SL */
    public C30099e0 mo66106SL() {
        C86709a0.m107523b().mo121108c();
        if (this.f113608e == null) {
            synchronized (this) {
                if (this.f113608e == null) {
                    C86709a0.m107528h();
                    this.f113608e = new C30099e0(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113608e;
    }

    /* renamed from: kc */
    public C99754l mo66107kc() {
        C86709a0.m107523b().mo121108c();
        if (this.f113610g == null) {
            synchronized (this) {
                if (this.f113610g == null) {
                    C86709a0.m107528h();
                    this.f113610g = new C99754l(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113610g;
    }

    public C99734h og0() {
        C86709a0.m107523b().mo121108c();
        if (this.f113611h == null) {
            synchronized (this) {
                if (this.f113611h == null) {
                    C86709a0.m107528h();
                    this.f113611h = new C99734h(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113611h;
    }

    public C42040b0 xi0() {
        C86709a0.m107523b().mo121108c();
        if (this.f113607d == null) {
            synchronized (this) {
                if (this.f113607d == null) {
                    C86709a0.m107528h();
                    this.f113607d = new C42040b0(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f113607d;
    }
}
