package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import gv0.C20842c;
import java.util.LinkedList;
import nv0.C47301e;
import nv0.C61906d;
import ob0.C11385n;
import ob0.C117747y;
import pv0.C100965f0;
import pv0.C47536u;
import pv0.C47537w;

/* renamed from: mv0.i */
public class C99986i implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C99990k f292952d;

    /* renamed from: mv0.i$a */
    public class C99987a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47536u f292953d;

        public C99987a(C47536u uVar) {
            this.f292953d = uVar;
        }

        public void run() {
            C99990k kVar = C99986i.this.f292952d;
            C47536u uVar = this.f292953d;
            synchronized (kVar) {
                C99996l lVar = kVar.f292964i;
                if (lVar != null) {
                    lVar.mo139340c();
                }
                C99996l lVar2 = new C99996l();
                kVar.f292964i = lVar2;
                LinkedList<C47537w> linkedList = uVar.f127546n;
                LinkedList<C47537w> linkedList2 = uVar.f127547o;
                long j = uVar.f127543h;
                lVar2.f292972d = linkedList;
                lVar2.f292973e = linkedList2;
                lVar2.f292975g = false;
                lVar2.f292976h = false;
                lVar2.f292977i.clear();
                lVar2.f292978j = false;
                lVar2.f292982q = false;
                lVar2.f292983r = false;
                lVar2.f292981p = 0;
                lVar2.f292985t = 0;
                lVar2.f292984s = j;
                int i = C61906d.f176002D;
                Log.m105925i("MicroMsg.BakSceneRestoreData", "setProgress %d", 0);
                C61906d.f176002D = 0;
                kVar.f292964i.f292980o = kVar.f292961f;
                Log.m105925i("MicroMsg.BakPcProcessMgr", "reve textList:%d,  mediaList:%d, convDataSize:%d", Integer.valueOf(uVar.f127546n.size()), Integer.valueOf(uVar.f127547o.size()), Long.valueOf(uVar.f127543h));
                kVar.f292964i.mo139344g(uVar);
            }
        }
    }

    /* renamed from: mv0.i$b */
    public class C99988b implements Runnable {
        public C99988b() {
        }

        public void run() {
            C99986i.this.f292952d.mo139333g(7);
        }
    }

    public C99986i(C99990k kVar) {
        this.f292952d = kVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C20842c cVar = (C20842c) yVar;
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 3) {
                C100965f0 f0Var = (C100965f0) cVar.mo32543r1();
                if (f0Var.f295649d == 2) {
                    C47536u uVar = f0Var.f295653h;
                    C99987a aVar = new C99987a(uVar);
                    C99988b bVar = new C99988b();
                    C99990k kVar = this.f292952d;
                    String str2 = uVar.f127539d;
                    kVar.getClass();
                    Log.m105925i("MicroMsg.BakPcProcessMgr", "doGetBakchatKey id: %s", str2);
                    C97625j3.m125815e().mo123455a(596, new C99989j(kVar, aVar, bVar));
                    C47301e eVar = kVar.f292965j;
                    if (eVar != null) {
                        eVar.cancel();
                    }
                    kVar.f292965j = new C47301e(str2);
                    C97625j3.m125815e().mo123460f(kVar.f292965j);
                }
            }
            C20842c.m22884u1(3, this);
            return;
        }
        Log.m105921e("MicroMsg.BakPcProcessMgr", "onSceneEnd:%d  err  [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
