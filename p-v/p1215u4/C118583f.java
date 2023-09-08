package p1215u4;

import android.content.Context;
import android.os.Build;
import p1014o4.C117693m;
import p1014o4.C117695n;
import p1169a5.C112757a;
import p1214t4.C118383b;
import p1218v4.C118661g;
import p1221x4.C118847o;

/* renamed from: u4.f */
public class C118583f extends C118579c<C118383b> {

    /* renamed from: e */
    public static final String f354877e = C117693m.m165967e("NetworkNotRoamingCtrlr");

    public C118583f(Context context, C112757a aVar) {
        super(C118661g.m167348a(context, aVar).f355064c);
    }

    /* renamed from: b */
    public boolean mo183332b(C118847o oVar) {
        return oVar.f355550j.f351995a == C117695n.NOT_ROAMING;
    }

    /* renamed from: c */
    public boolean mo183333c(Object obj) {
        C118383b bVar = (C118383b) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            C117693m.m165966c().mo182389a(f354877e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.f353788a;
        }
        if (bVar.f353788a && bVar.f353791d) {
            z = false;
        }
        return z;
    }
}
