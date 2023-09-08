package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: androidx.appcompat.app.b */
public class C103409b implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ View f305063d;

    /* renamed from: e */
    public final /* synthetic */ View f305064e;

    public C103409b(AlertController alertController, View view, View view2) {
        this.f305063d = view;
        this.f305064e = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m137124c(absListView, this.f305063d, this.f305064e);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
