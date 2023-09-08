package h41;

import android.widget.ListView;
import j20.C21153d;
import u24.C90599h;

public class b$$s implements C21153d {

    /* renamed from: a */
    public final /* synthetic */ C117067b f350804a;

    public b$$s(C117067b bVar) {
        this.f350804a = bVar;
    }

    /* renamed from: a */
    public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
    }

    /* renamed from: b */
    public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
        try {
            if (C90599h.m113509b(str2, "onScrollChange")) {
                C117067b.vx0(this.f350804a, objArr[0], objArr[1].intValue(), objArr[2].intValue());
            } else if (C90599h.m113509b(str2, "onScroll")) {
                C117067b bVar = this.f350804a;
                ListView listView = objArr[0];
                C117067b.vx0(bVar, listView, listView.getScrollX(), objArr[0].getScrollY());
            }
        } catch (Exception unused) {
        }
    }
}
