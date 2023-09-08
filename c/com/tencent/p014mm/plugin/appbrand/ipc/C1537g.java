package com.tencent.p014mm.plugin.appbrand.ipc;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.utils.C2032a1;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import fy3.C32224a;
import gy3.C87412m;
import jp3.C9486a;
import jp3.C9487b;
import kotlin.Metadata;
import q20.C89449a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.g */
public final class C1537g {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ipc/g$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.g$a */
    public static final class C1538a implements C1255d<IPCVoid, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.g$b */
    public static final class C1539b implements C1256g<IPCVoid>, C9486a {

        /* renamed from: d */
        public C32224a<C13598b0> f10909d;

        /* renamed from: e */
        public C9487b<? super C9486a> f10910e;

        public C1539b(C32224a<C13598b0> aVar, C9487b<? super C9486a> bVar) {
            C87412m.m108594g(aVar, "block");
            this.f10909d = aVar;
            this.f10910e = bVar;
            if (bVar != null) {
                bVar.keep(this);
            }
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C32224a<C13598b0> aVar = this.f10909d;
            if (aVar != null) {
                aVar.invoke();
            }
            dead();
        }

        public void dead() {
            this.f10909d = null;
            C9487b<? super C9486a> bVar = this.f10910e;
            C2032a1 a1Var = bVar instanceof C2032a1 ? (C2032a1) bVar : null;
            if (a1Var != null) {
                a1Var.mo1963B7(this);
            }
            this.f10910e = null;
        }
    }

    /* renamed from: a */
    public static final void m1524a(C32224a<C13598b0> aVar, C9487b<? super C9486a> bVar) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C1538a.class, aVar == null ? null : new C1539b(aVar, bVar));
    }
}
