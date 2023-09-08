package com.tencent.p014mm.plugin.game.commlib.util;

import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import sx1.C48493b;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.e */
public class C41870e implements C48493b.C48494a {

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.e$a */
    public class C41871a implements Runnable {
        public C41871a(C41870e eVar) {
        }

        public void run() {
            String str = C41872f.f112815a;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                for (C41872f.C41873a aVar : C41872f.C41873a.values()) {
                    if (aVar != C41872f.C41873a.PERMANENT) {
                        C41872f.m45391a(new C86009m1(C41872f.f112815a + aVar.name() + "/"), aVar.f112822d);
                        C41872f.m45391a(new C86009m1(C41872f.m45395e(aVar)), aVar.f112822d);
                        C41872f.m45391a(new C86009m1(C41872f.m45392b(aVar)), aVar.f112822d);
                        C41872f.m45391a(new C86009m1(C41872f.m45393c(aVar)), aVar.f112822d);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GameFileManager", e, "", new Object[0]);
            }
            Log.m105925i("MicroMsg.GameFileManager", "remove expire files cost time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: a */
    public void mo65649a() {
        C41864d.m45386c().postDelayed(new C41871a(this), 0);
    }
}
