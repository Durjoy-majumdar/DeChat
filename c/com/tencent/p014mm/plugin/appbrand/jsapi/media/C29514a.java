package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nc3.C34767b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.a */
public final class C29514a extends C29527l2 {

    /* renamed from: g */
    public final String f80393g = ("MicroMsg.AppBrandAudioFocusService#" + hashCode());

    /* renamed from: h */
    public final C13601g f80394h = C36568h.m40985a(new C29515a(this));

    /* renamed from: i */
    public final C34767b.C34769b.C34770a f80395i = C34767b.C34769b.C34770a.f93453c;

    /* renamed from: j */
    public final C13601g f80396j = C36568h.m40985a(new C29516b(this));

    /* renamed from: n */
    public volatile C34767b.C34768c f80397n;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.a$a */
    public static final class C29515a extends C87413o implements C32224a<C34767b> {

        /* renamed from: d */
        public final /* synthetic */ C29514a f80398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29515a(C29514a aVar) {
            super(0);
            this.f80398d = aVar;
        }

        public Object invoke() {
            C7335d c = C86312j.m106911c(C34767b.class);
            C29514a aVar = this.f80398d;
            C34767b bVar = (C34767b) c;
            if (bVar == null) {
                Log.m105920e(aVar.f80393g, "audioFocusManager is null");
            }
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.a$b */
    public static final class C29516b extends C87413o implements C32224a<C29517b> {

        /* renamed from: d */
        public final /* synthetic */ C29514a f80399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29516b(C29514a aVar) {
            super(0);
            this.f80399d = aVar;
        }

        public Object invoke() {
            return new C29517b(this.f80399d);
        }
    }

    /* renamed from: c */
    public boolean mo56764c() {
        C34767b.C34768c cVar;
        if (((C34767b) ((C36570n) this.f80394h).getValue()) == null || (cVar = this.f80397n) == null) {
            return false;
        }
        C34767b bVar = (C34767b) ((C36570n) this.f80394h).getValue();
        C87412m.m108591d(bVar);
        boolean b202 = bVar.b20(cVar);
        if (b202) {
            this.f80397n = null;
        }
        return b202;
    }

    /* renamed from: e */
    public String mo56765e() {
        return this.f80393g;
    }

    /* renamed from: q */
    public boolean mo56766q() {
        if (((C34767b) ((C36570n) this.f80394h).getValue()) == null) {
            return false;
        }
        if (this.f80397n != null) {
            Log.m105924i(this.f80393g, "requestAudioFocus, requestSession not null");
            return true;
        }
        C34767b bVar = (C34767b) ((C36570n) this.f80394h).getValue();
        C87412m.m108591d(bVar);
        C34767b.C34768c el = bVar.mo34192el(this.f80395i, (C29517b) ((C36570n) this.f80396j).getValue());
        if (el.mo34198a()) {
            this.f80397n = el;
        }
        return el.mo34198a();
    }
}
