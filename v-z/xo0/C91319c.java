package xo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import lp3.C46888b;
import lp3.C88631d;
import ob0.C89132b;
import te3.C64310db;
import te3.C90415hz1;

/* renamed from: xo0.c */
public final class C91319c<T> implements C88631d.C88632b {

    /* renamed from: a */
    public final /* synthetic */ C46888b f261937a;

    /* renamed from: b */
    public final /* synthetic */ String f261938b;

    /* renamed from: c */
    public final /* synthetic */ String f261939c;

    public C91319c(C46888b bVar, String str, String str2) {
        this.f261937a = bVar;
        this.f261938b = str;
        this.f261939c = str2;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        try {
            LinkedList linkedList = new LinkedList();
            Iterator<C90415hz1> it = ((C64310db) cVar.f256796d).f182660d.iterator();
            while (it.hasNext()) {
                C90415hz1 next = it.next();
                C91313a aVar = C91313a.f261928d;
                C87412m.m108593f(next, "respItem");
                linkedList.add(C91313a.vx0(aVar, next));
            }
            this.f261937a.mo72093c(linkedList);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "prefetchContactAndPkgDownloadInfo, username:" + this.f261938b + ", path:" + this.f261939c + ", convert to retList failed, exception:" + e);
            this.f261937a.mo72091a(e);
        }
    }
}
