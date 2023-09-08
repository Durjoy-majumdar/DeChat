package p1215u4;

import android.content.Context;
import android.os.Build;
import p1014o4.C117695n;
import p1169a5.C112757a;
import p1214t4.C118383b;
import p1218v4.C118661g;
import p1221x4.C118847o;

/* renamed from: u4.d */
public class C118581d extends C118579c<C118383b> {
    public C118581d(Context context, C112757a aVar) {
        super(C118661g.m167348a(context, aVar).f355064c);
    }

    /* renamed from: b */
    public boolean mo183332b(C118847o oVar) {
        return oVar.f355550j.f351995a == C117695n.CONNECTED;
    }

    /* renamed from: c */
    public boolean mo183333c(Object obj) {
        C118383b bVar = (C118383b) obj;
        return Build.VERSION.SDK_INT >= 26 ? !bVar.f353788a || !bVar.f353789b : true ^ bVar.f353788a;
    }
}
