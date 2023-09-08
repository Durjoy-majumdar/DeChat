package com.tencent.p014mm.p136ui.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension;
import en3.C97674b;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: com.tencent.mm.ui.recyclerview.a */
public final class C19816a extends C97674b {

    /* renamed from: b */
    public final /* synthetic */ DynamicViewCacheExtension.C19808c f56398b;

    public C19816a(DynamicViewCacheExtension.C19808c cVar) {
        this.f56398b = cVar;
    }

    /* renamed from: a */
    public void mo26320a(RecyclerView.C16613e<RecyclerView.C16631z> eVar) {
        C87412m.m108594g(eVar, "adapter");
        HashMap<Integer, String> hashMap = DynamicViewCacheExtension.f56355h;
        DynamicViewCacheExtension.f56355h.put(Integer.valueOf(eVar.hashCode()), this.f56398b.f56369a);
        eVar.registerAdapterDataObserver(this.f56398b.f56378j);
        if (this.f56398b.f56373e) {
            if (eVar instanceof SynchronizedAdapter) {
                ((SynchronizedAdapter) eVar).setEnableSynchronized(true);
            } else {
                throw new RuntimeException("If you select isSerialOnBind=true, your adapter need extend of SynchronizedAdapter.");
            }
        }
        DynamicViewCacheExtension.C19808c.m21516a(this.f56398b);
        DynamicViewCacheExtension.C19808c.m21517b(this.f56398b, false, "setAdapter", 0, 4, (Object) null);
    }
}
