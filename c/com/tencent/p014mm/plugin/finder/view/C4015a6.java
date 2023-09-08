package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C11184p0;
import nj3.C76912y0;
import te3.C50542nh0;
import te3.C64707sc1;

/* renamed from: com.tencent.mm.plugin.finder.view.a6 */
public final class C4015a6 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ boolean f18068d;

    /* renamed from: e */
    public final /* synthetic */ String f18069e;

    /* renamed from: f */
    public final /* synthetic */ long f18070f;

    /* renamed from: g */
    public final /* synthetic */ long f18071g;

    /* renamed from: h */
    public final /* synthetic */ String f18072h;

    /* renamed from: com.tencent.mm.plugin.finder.view.a6$a */
    public static final class C4016a implements C8794p5<C64707sc1> {
        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C87412m.m108594g((C64707sc1) obj, "req");
            C87412m.m108594g(nh02, "ret");
            Context context = MMApplicationContext.getContext();
            if (nh02.f138603e == 0) {
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3x), 0).show();
            } else {
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.e3y), 0).show();
            }
        }
    }

    public C4015a6(boolean z, String str, long j, long j2, String str2) {
        this.f18068d = z;
        this.f18069e = str;
        this.f18070f = j;
        this.f18071g = j2;
        this.f18072h = str2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C3603n1.class;
        if (menuItem.getItemId() == 1000) {
            C4016a aVar = new C4016a();
            if (this.f18068d) {
                ((C3603n1) C86312j.m106911c(cls)).st0(this.f18069e, true, aVar);
            } else {
                ((C3603n1) C86312j.m106911c(cls)).vv0(this.f18070f, this.f18071g, this.f18072h, true, aVar);
            }
        }
    }
}
