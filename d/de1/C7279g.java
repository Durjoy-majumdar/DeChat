package de1;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: de1.g */
public final class C7279g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f25355d;

    /* renamed from: e */
    public final /* synthetic */ Activity f25356e;

    /* renamed from: f */
    public final /* synthetic */ Intent f25357f;

    public C7279g(ImageView imageView, C32224a<C13598b0> aVar, Activity activity, Intent intent) {
        this.f25355d = aVar;
        this.f25356e = activity;
        this.f25357f = intent;
    }

    public final void run() {
        C7267b.f25328d.getClass();
        this.f25355d.invoke();
        this.f25356e.overridePendingTransition(0, 0);
        this.f25357f.removeExtra("key_intent_animating_flag");
    }
}
