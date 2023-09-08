package p1117h3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

/* renamed from: h3.c */
public abstract class C108046c extends C108041a {

    /* renamed from: o */
    public int f323552o;

    /* renamed from: p */
    public int f323553p;

    /* renamed from: q */
    public LayoutInflater f323554q;

    @Deprecated
    public C108046c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f323553p = i;
        this.f323552o = i;
        this.f323554q = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
