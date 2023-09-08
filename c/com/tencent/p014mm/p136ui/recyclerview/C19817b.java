package com.tencent.p014mm.p136ui.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension;
import gy3.C87412m;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.ui.recyclerview.b */
public final class C19817b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DynamicViewCacheExtension.C19808c f56399d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f56400e;

    /* renamed from: com.tencent.mm.ui.recyclerview.b$a */
    public static final class C19818a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ View f56401d;

        /* renamed from: e */
        public final /* synthetic */ DynamicViewCacheExtension.C19808c f56402e;

        public C19818a(View view, DynamicViewCacheExtension.C19808c cVar) {
            this.f56401d = view;
            this.f56402e = cVar;
        }

        public void onViewAttachedToWindow(View view) {
            C87412m.m108594g(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            AtomicBoolean atomicBoolean;
            C87412m.m108594g(view, "view");
            this.f56401d.removeOnAttachStateChangeListener(this);
            DynamicViewCacheExtension.C19808c.C19809a aVar = this.f56402e.f56380l;
            if (!(aVar == null || (atomicBoolean = aVar.f56390n) == null)) {
                atomicBoolean.set(true);
            }
            this.f56402e.f56374f.removeCallbacksAndMessages((Object) null);
        }
    }

    public C19817b(DynamicViewCacheExtension.C19808c cVar, RecyclerView recyclerView) {
        this.f56399d = cVar;
        this.f56400e = recyclerView;
    }

    public final void run() {
        AtomicBoolean atomicBoolean;
        DynamicViewCacheExtension.C19808c.m21516a(this.f56399d);
        DynamicViewCacheExtension.C19808c.m21517b(this.f56399d, true, "recyclerView.first.post", 0, 4, (Object) null);
        RecyclerView recyclerView = this.f56400e;
        DynamicViewCacheExtension.C19808c cVar = this.f56399d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(recyclerView)) {
            DynamicViewCacheExtension.C19808c.C19809a aVar = cVar.f56380l;
            if (!(aVar == null || (atomicBoolean = aVar.f56390n) == null)) {
                atomicBoolean.set(true);
            }
            cVar.f56374f.removeCallbacksAndMessages((Object) null);
            return;
        }
        recyclerView.addOnAttachStateChangeListener(new C19818a(recyclerView, cVar));
    }
}
