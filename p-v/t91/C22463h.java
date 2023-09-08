package t91;

import gy3.C87412m;
import j20.C21153d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t91.h */
public final class C22463h implements C21153d {
    /* renamed from: a */
    public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
    }

    /* renamed from: b */
    public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
        if (C87412m.m108589b(str2, "onRefreshBegin") && C87412m.m108589b(str3, "(I)V")) {
            synchronized (C22466j.f63621a) {
                Iterator it = ((ArrayList) C22466j.f63624d).iterator();
                while (it.hasNext()) {
                    ((C22462f) it.next()).mo35357d();
                }
            }
        } else if (C87412m.m108589b(str2, "onLoadMoreBegin") && C87412m.m108589b(str3, "()V")) {
            synchronized (C22466j.f63621a) {
                Iterator it4 = ((ArrayList) C22466j.f63624d).iterator();
                while (it4.hasNext()) {
                    ((C22462f) it4.next()).mo35358e();
                }
            }
        }
    }
}
