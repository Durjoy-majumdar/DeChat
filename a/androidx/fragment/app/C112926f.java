package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112912b;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.f */
public class C112926f implements C112741b.C112742a {

    /* renamed from: a */
    public final /* synthetic */ View f338059a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f338060b;

    /* renamed from: c */
    public final /* synthetic */ C112912b.C112914b f338061c;

    public C112926f(C112912b bVar, View view, ViewGroup viewGroup, C112912b.C112914b bVar2) {
        this.f338059a = view;
        this.f338060b = viewGroup;
        this.f338061c = bVar2;
    }

    public void onCancel() {
        this.f338059a.clearAnimation();
        this.f338060b.endViewTransition(this.f338059a);
        this.f338061c.mo165186a();
    }
}
