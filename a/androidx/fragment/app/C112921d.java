package androidx.fragment.app;

import android.animation.Animator;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.d */
public class C112921d implements C112741b.C112742a {

    /* renamed from: a */
    public final /* synthetic */ Animator f338050a;

    public C112921d(C112912b bVar, Animator animator) {
        this.f338050a = animator;
    }

    public void onCancel() {
        this.f338050a.end();
    }
}
