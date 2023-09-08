package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import p1130l.C109068h;

/* renamed from: androidx.appcompat.widget.k */
public class C103543k extends C103560s {

    /* renamed from: p */
    public final /* synthetic */ AppCompatSpinner.C103489b f305772p;

    /* renamed from: q */
    public final /* synthetic */ AppCompatSpinner f305773q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103543k(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.C103489b bVar) {
        super(view);
        this.f305773q = appCompatSpinner;
        this.f305772p = bVar;
    }

    /* renamed from: b */
    public C109068h mo143517b() {
        return this.f305772p;
    }

    /* renamed from: c */
    public boolean mo143518c() {
        if (this.f305773q.f305466i.isShowing()) {
            return true;
        }
        this.f305773q.f305466i.show();
        return true;
    }
}
