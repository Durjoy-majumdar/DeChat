package com.tencent.p014mm.plugin.emoji.sync;

import com.tencent.p014mm.plugin.emoji.sync.C41062e;
import com.tencent.p014mm.plugin.emoji.sync.C93124c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import kc0.C99120a;
import p595ll.C46875a;

/* renamed from: com.tencent.mm.plugin.emoji.sync.b */
public class C93123b<T extends C41062e> {

    /* renamed from: a */
    public BKGLoaderManager f268269a;

    public C93123b() {
        C93124c.C93125a aVar = new C93124c.C93125a();
        aVar.f268271a = 1;
        C99120a aVar2 = new C99120a();
        int i = aVar.f268271a;
        aVar.f268272b = new C93124c.C93126b(i, i, aVar2);
        C93124c cVar = new C93124c(aVar);
        synchronized (this) {
            if (this.f268269a == null) {
                this.f268269a = new BKGLoaderManager(cVar);
            } else {
                Log.m105924i("MicroMsg.BKGLoader.BKGLoader", "[cpan] BKGLoader had init.");
            }
        }
    }

    /* renamed from: a */
    public void mo127637a(C46875a aVar) {
        BKGLoaderManager bKGLoaderManager = this.f268269a;
        if (bKGLoaderManager.f110553i == null) {
            bKGLoaderManager.f110553i = new HashSet();
        }
        if (!((HashSet) bKGLoaderManager.f110553i).contains(aVar)) {
            ((HashSet) bKGLoaderManager.f110553i).add(aVar);
        }
    }

    /* renamed from: b */
    public void mo127638b(C46875a aVar) {
        BKGLoaderManager bKGLoaderManager = this.f268269a;
        if (bKGLoaderManager.f110553i == null) {
            bKGLoaderManager.f110553i = new HashSet();
        }
        if (((HashSet) bKGLoaderManager.f110553i).contains(aVar)) {
            ((HashSet) bKGLoaderManager.f110553i).remove(aVar);
        }
    }
}
