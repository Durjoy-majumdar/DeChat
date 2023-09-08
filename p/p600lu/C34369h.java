package p600lu;

import di3.C86312j;
import java.util.List;
import ob0.C117747y;
import ob0.C35142u;
import r62.C118225d;
import r62.C36254c;

/* renamed from: lu.h */
public final class C34369h implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C118225d dVar;
        List<C118225d.C36255a> list = C118225d.f353377e;
        Class cls = C118225d.class;
        synchronized (cls) {
            dVar = (C118225d) C86312j.m106911c(cls);
        }
        if (str != null) {
            dVar.getClass();
            if (str.startsWith("autoauth_errmsg_")) {
                return;
            }
        }
        dVar.f353379d.post(new C36254c(dVar, yVar, i, i2));
    }
}
