package com.tencent.p014mm.plugin.emoji.sync;

import java.util.Set;
import p595ll.C46875a;

/* renamed from: com.tencent.mm.plugin.emoji.sync.d */
public class C41061d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f110570d;

    /* renamed from: e */
    public final /* synthetic */ BKGLoaderManager f110571e;

    public C41061d(BKGLoaderManager bKGLoaderManager, int i) {
        this.f110571e = bKGLoaderManager;
        this.f110570d = i;
    }

    public void run() {
        Set<C46875a> set = this.f110571e.f110553i;
        if (set != null && set.size() > 0) {
            for (C46875a b : this.f110571e.f110553i) {
                b.mo72083b(this.f110570d);
            }
        }
    }
}
