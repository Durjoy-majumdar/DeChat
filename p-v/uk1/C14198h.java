package uk1;

import al1.C54130j;
import cl1.C54963d0;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;

/* renamed from: uk1.h */
public final class C14198h extends C87413o implements C32226l<String, C54130j> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f39651d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14198h(C45795b bVar) {
        super(1);
        this.f39651d = bVar;
    }

    public Object invoke(Object obj) {
        T t;
        String str = (String) obj;
        C87412m.m108594g(str, DownloadInfo.UID);
        List<C54130j> l3 = ((C54963d0) this.f39651d.mo71262a(C54963d0.class)).mo75929l3();
        C87412m.m108593f(l3, "buContext.business(LiveL….java).allLinkMicUserList");
        synchronized (l3) {
            Iterator<T> it = l3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                    break;
                }
            }
        }
        return (C54130j) t;
    }
}
