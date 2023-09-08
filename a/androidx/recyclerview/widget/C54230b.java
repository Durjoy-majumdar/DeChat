package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
public final class C54230b implements C54258u {

    /* renamed from: a */
    public final RecyclerView.C16613e f152201a;

    public C54230b(RecyclerView.C16613e eVar) {
        this.f152201a = eVar;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        this.f152201a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        this.f152201a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
        this.f152201a.notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        this.f152201a.notifyItemMoved(i, i2);
    }
}
