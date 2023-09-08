package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82777y;
import fy3.C32226l;
import gy3.C87413o;
import lp3.C46888b;
import lp3.C88631d;
import nj3.C11184p0;
import nr3.C89060f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.b0 */
public final class C82694b0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C82777y f241979d;

    /* renamed from: e */
    public final /* synthetic */ C46888b f241980e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.b0$a */
    public static final class C82695a extends C87413o implements C32226l<C82739n, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46888b f241981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82695a(C46888b bVar) {
            super(1);
            this.f241981d = bVar;
        }

        public Object invoke(Object obj) {
            this.f241981d.mo72093c((C82739n) obj);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.b0$b */
    public static final class C82696b<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C46888b f241982a;

        public C82696b(C46888b bVar) {
            this.f241982a = bVar;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            this.f241982a.mo72091a(obj);
        }
    }

    public C82694b0(C82777y yVar, C46888b bVar) {
        this.f241979d = yVar;
        this.f241980e = bVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        (itemId != 1 ? itemId != 2 ? C89060f.m111323b(C82739n.C82740a.f242060a) : C82777y.m101524a(this.f241979d) : C82777y.m101525b(this.f241979d)).mo123062e(new C82777y.C82778a(new C82695a(this.f241980e))).mo123065b(new C82696b(this.f241980e));
    }
}
