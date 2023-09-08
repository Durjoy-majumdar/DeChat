package p1215u4;

import android.content.Context;
import android.os.Build;
import p1014o4.C117695n;
import p1169a5.C112757a;
import p1214t4.C118383b;
import p1218v4.C118661g;
import p1221x4.C118847o;

/* renamed from: u4.g */
public class C118584g extends C118579c<C118383b> {
    public C118584g(Context context, C112757a aVar) {
        super(C118661g.m167348a(context, aVar).f355064c);
    }

    /* renamed from: b */
    public boolean mo183332b(C118847o oVar) {
        C117695n nVar = oVar.f355550j.f351995a;
        return nVar == C117695n.UNMETERED || (Build.VERSION.SDK_INT >= 30 && nVar == C117695n.TEMPORARILY_UNMETERED);
    }

    /* renamed from: c */
    public boolean mo183333c(Object obj) {
        C118383b bVar = (C118383b) obj;
        return !bVar.f353788a || bVar.f353790c;
    }
}
