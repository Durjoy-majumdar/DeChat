package com.tencent.p014mm.plugin.gallery.p473ui;

import android.widget.TextView;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.gallery.ui.c */
public class C56822c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94049a.C56820m f162828d;

    public C56822c(C94049a.C56820m mVar) {
        this.f162828d = mVar;
    }

    public void run() {
        TextView textView;
        C94049a.C56820m mVar = this.f162828d;
        if (mVar.f162824f != null) {
            int i = mVar.f162823e.f162766w;
            WeakReference<TextView> weakReference = mVar.f162822d;
            if (weakReference != null && (textView = weakReference.get()) != null) {
                C94049a.C56820m.m65512c(textView, i);
                C94049a.C56820m.f162821h.remove(textView);
            }
        }
    }
}
