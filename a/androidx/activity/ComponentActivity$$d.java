package androidx.activity;

import android.text.TextUtils;

public class ComponentActivity$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ComponentActivity f304941d;

    public ComponentActivity$$d(ComponentActivity componentActivity) {
        this.f304941d = componentActivity;
    }

    public void run() {
        try {
            ComponentActivity$$d.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
