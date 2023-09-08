package com.tencent.p014mm.plugin.finder.live.view;

import android.graphics.Bitmap;
import bl3.C39818r;
import ht1.C60200t1;
import l60.C99344b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import t60.C64207e;
import up1.C27696y;
import x60.C102564a;

/* renamed from: com.tencent.mm.plugin.finder.live.view.k1 */
public final class C56079k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f159914d;

    /* renamed from: e */
    public final /* synthetic */ C56072j1 f159915e;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.k1$a */
    public static final class C56080a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C56072j1 f159916a;

        public C56080a(C56072j1 j1Var) {
            this.f159916a = j1Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f159916a.f159902a.mo74195s(bitmap);
            }
        }
    }

    public C56079k1(String str, C56072j1 j1Var) {
        this.f159914d = str;
        this.f159915e = j1Var;
    }

    public final void run() {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(this.f159914d, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
        C56080a aVar = new C56080a(this.f159915e);
        b.getClass();
        b.f291320d = aVar;
        b.mo85953c();
    }
}
