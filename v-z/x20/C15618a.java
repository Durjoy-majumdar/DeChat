package x20;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import junit.framework.Assert;
import u20.C90594b;

/* renamed from: x20.a */
public final class C15618a {
    /* renamed from: a */
    public static final /* synthetic */ void m14625a(C1256g gVar) {
        C87412m.m108594g(gVar, "<this>");
        gVar.mo894a(IPCVoid.f10316d);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m14626b(Object obj, C80883e eVar, C1256g gVar) {
        C87412m.m108594g(eVar, "invoke");
        Assert.assertTrue(C90594b.m113493a(eVar.getClass()));
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, obj, eVar.getClass(), gVar);
    }

    /* renamed from: c */
    public static /* synthetic */ void m14627c(Object obj, C80883e eVar, C1256g gVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            gVar = null;
        }
        m14626b(obj, eVar, gVar);
    }

    /* renamed from: d */
    public static final /* synthetic */ Object m14628d(Object obj, C80916r rVar) {
        C87412m.m108594g(rVar, "invoke");
        Assert.assertTrue(C90594b.m113493a(rVar.getClass()));
        return XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, obj, rVar.getClass());
    }
}
