package aw1;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.p059ui.C18842a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import nv1.C100219b;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C23115a;

/* renamed from: aw1.a */
public class C16717a extends C18842a {
    public C16717a(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    public int getType() {
        return 8192;
    }

    /* renamed from: o */
    public C22019b mo17711o(int i, C21891f.C21892a aVar) {
        C23115a aVar2;
        int i2 = (i - aVar.f61904a) - 1;
        if (aVar.f61905b || i != 0) {
            aVar2 = null;
        } else {
            aVar2 = new C23115a(i);
            aVar2.f62327e = aVar.f61910g;
        }
        if (aVar2 != null) {
            aVar2.f62332j = i2 + 1;
        }
        return aVar2;
    }

    /* renamed from: q */
    public C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet) {
        return ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, C76728k.m92447a(this.f52838h, new int[]{131072}, new int[]{16}, -1, hashSet, C100219b.f293645d, this, mMHandler));
    }

    /* renamed from: s */
    public void mo17713s(C10656l lVar, HashSet<String> hashSet) {
        this.f52840j.clear();
        C21891f.C21892a aVar = new C21891f.C21892a();
        aVar.f61908e = -4;
        aVar.f61905b = false;
        aVar.f61913j = 1;
        aVar.f61910g = lVar.f32075d;
        aVar.f61909f = new ArrayList();
        this.f52840j.add(aVar);
    }
}
