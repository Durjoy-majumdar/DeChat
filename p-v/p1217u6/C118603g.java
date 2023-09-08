package p1217u6;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import p1217u6.C118589a;

/* renamed from: u6.g */
public class C118603g implements C118589a.C118590a {

    /* renamed from: a */
    public final Context f354916a;

    /* renamed from: b */
    public final List<C118589a.C118590a> f354917b = new LinkedList();

    /* renamed from: c */
    public C118589a f354918c;

    public C118603g(Context context) {
        this.f354916a = context;
    }

    /* renamed from: a */
    public void mo183344a(C118591b bVar) {
        this.f354918c.mo183343b();
        this.f354918c = null;
        for (C118589a.C118590a a : this.f354917b) {
            a.mo183344a(bVar);
        }
        ((LinkedList) this.f354917b).clear();
    }
}
