package s61;

import androidx.recyclerview.widget.C54258u;
import java.util.List;

/* renamed from: s61.i */
public final class C101549i implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ C101551k f297288a;

    /* renamed from: b */
    public final /* synthetic */ List<C101543c> f297289b;

    public C101549i(C101551k kVar, List<? extends C101543c> list) {
        this.f297288a = kVar;
        this.f297289b = list;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        this.f297288a.f297294f.clear();
        this.f297288a.f297294f.addAll(this.f297289b);
        this.f297288a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        this.f297288a.f297294f.clear();
        this.f297288a.f297294f.addAll(this.f297289b);
        this.f297288a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        this.f297288a.f297294f.clear();
        this.f297288a.f297294f.addAll(this.f297289b);
        this.f297288a.notifyItemRangeChanged(i, i2);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        this.f297288a.notifyItemMoved(i, i2);
    }
}
