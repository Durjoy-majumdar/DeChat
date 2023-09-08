package androidx.appcompat.app;

import android.view.View;

/* renamed from: androidx.appcompat.app.c */
public class C103410c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f305065d;

    /* renamed from: e */
    public final /* synthetic */ View f305066e;

    /* renamed from: f */
    public final /* synthetic */ AlertController f305067f;

    public C103410c(AlertController alertController, View view, View view2) {
        this.f305067f = alertController;
        this.f305065d = view;
        this.f305066e = view2;
    }

    public void run() {
        AlertController.m137124c(this.f305067f.f304952f, this.f305065d, this.f305066e);
    }
}
