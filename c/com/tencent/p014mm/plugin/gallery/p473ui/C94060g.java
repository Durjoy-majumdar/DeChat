package com.tencent.p014mm.plugin.gallery.p473ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.gallery.p473ui.C94061h;
import hw1.C60223w;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.gallery.ui.g */
public class C94060g implements C60223w.C60225b {

    /* renamed from: a */
    public WeakReference<TextView> f271574a;

    public C94060g(C94061h hVar, C94061h.C94065d dVar) {
        this.f271574a = new WeakReference<>(dVar.f271598e);
    }

    /* renamed from: a */
    public void mo85218a(C60223w wVar) {
        View view = this.f271574a.get();
        if (view != null && wVar.equals(view.getTag())) {
            view.setTag((Object) null);
        }
    }
}
