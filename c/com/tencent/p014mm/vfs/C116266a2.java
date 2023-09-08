package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.util.Pair;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64186f0;
import tx3.C26317d;
import y04.C112349m;
import y04.C112354s;
import y04.C15925h;
import y04.C91365f;

/* renamed from: com.tencent.mm.vfs.a2 */
public final class C116266a2 implements C116281f0.C116286f {

    /* renamed from: a */
    public static final C116266a2 f348897a = new C116266a2();

    /* renamed from: b */
    public static C116270c f348898b;

    /* renamed from: a */
    public boolean mo177782a(String str, FileSystem.C85995c cVar, CancellationSignal cancellationSignal) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(cVar, "fs");
        C116270c cVar2 = f348898b;
        C87412m.m108591d(cVar2);
        boolean z = true;
        C15925h e = C112349m.m153282e(cVar);
        List<FileSystem.C85995c> list = null;
        FileSystem.C85994b bVar = cVar instanceof FileSystem.C85994b ? (FileSystem.C85994b) cVar : null;
        if (bVar != null) {
            list = bVar.mo119931j();
        }
        if (list == null) {
            list = C64186f0.f181907d;
        }
        C91365f.C91366a aVar = new C91365f.C91366a((C91365f) C112354s.m153293p(e, list));
        while (aVar.mo125334a()) {
            FileSystem.C85995c cVar3 = (FileSystem.C85995c) aVar.next();
            for (C13604l next : C116267b2.f348900b) {
                if (((Class) next.f38555d).isInstance(cVar3)) {
                    C87412m.m108593f(cVar3, "cfs");
                    z &= ((Boolean) ((C32227p) next.f38556e).invoke(cVar2, cVar3)).booleanValue();
                }
            }
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        return z;
    }

    /* renamed from: b */
    public void mo177783b(CancellationSignal cancellationSignal) {
        List<Pair<String, String>> c = VFSStrategy.m163775c();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(c, 10));
        Iterator it = ((ArrayList) c).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new C13604l(pair.first, pair.second));
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        Map<String, Object> d = f0Var.mo177791d();
        C26317d dVar = new C26317d();
        for (String next : ((C116340x0) f0Var.mo177788a()).mo177848c().keySet()) {
            C116343y1 y1Var = C116343y1.f349133a;
            C87412m.m108593f(next, "name");
            String a = y1Var.mo177858a(next);
            if (a != null) {
                dVar.put(next, a);
            }
        }
        dVar.mo53242c();
        dVar.f73339r = true;
        String d2 = C116299g2.m163848d(d, "account");
        String str = "";
        if (d2 == null) {
            d2 = str;
        }
        String d3 = C116299g2.m163848d(d, "accountSalt");
        if (d3 != null) {
            str = d3;
        }
        f348898b = new C116270c(arrayList, dVar, d2, str);
    }

    /* renamed from: c */
    public void mo177784c(boolean z, boolean z2, CancellationSignal cancellationSignal) {
    }
}
