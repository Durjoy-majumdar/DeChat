package com.tencent.p014mm.plugin.appbrand.app;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.C55469m;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import kotlin.Metadata;
import p196ln.C76708i;
import p974hc.C87471a;
import q20.C89449a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.app.y */
public final class C81190y implements C87471a {

    /* renamed from: d */
    public static final C81190y f238508d = new C81190y();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/y$b;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.y$b */
    public static final class C1513b implements C80916r<IPCVoid, IPCString> {
        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            String m = C75592q0.m90783m();
            if (m == null || m.length() == 0) {
                m = C75592q0.m90789s();
            }
            return new IPCString(m);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/y$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.app.y$a */
    public static final class C55444a implements C80883e<IPCVoid, IPCString> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C55469m.f158057a.mo76996a(C75592q0.m90789s(), new C55443x(gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.y$c */
    public static final class C81191c<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C87471a.C87475b f238509d;

        public C81191c(C87471a.C87475b bVar) {
            this.f238509d = bVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            C13598b0 b0Var;
            String str;
            IPCString iPCString = (IPCString) obj;
            if (iPCString == null || (str = iPCString.f10315d) == null) {
                b0Var = null;
            } else {
                this.f238509d.mo114592a(((C76708i) C86312j.m106911c(C76708i.class)).Wd0(str, (String) null));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                this.f238509d.mo114592a((Bitmap) null);
            }
        }
    }

    /* renamed from: Y5 */
    public Drawable mo113356Y5() {
        return MMApplicationContext.getContext().getDrawable(C0966R.C0969drawable.bfa);
    }

    public String Yu0() {
        IPCString iPCString = (IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C1513b.class);
        if (iPCString != null) {
            return iPCString.f10315d;
        }
        return null;
    }

    /* renamed from: kg */
    public void mo113358kg(C87471a.C87475b bVar) {
        C87412m.m108594g(bVar, "callback");
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C55444a.class, new C81191c(bVar));
    }
}
