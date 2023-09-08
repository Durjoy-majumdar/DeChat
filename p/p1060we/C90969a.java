package p1060we;

import android.content.Context;
import p269xe.C91185g;
import p723vf.C118672d;

/* renamed from: we.a */
public class C90969a implements C90971c {

    /* renamed from: a */
    public final Context f261035a;

    public C90969a(Context context) {
        this.f261035a = context;
    }

    /* renamed from: a */
    public void mo110075a(C91185g gVar) {
        Object[] objArr = new Object[1];
        Object obj = gVar;
        if (gVar == null) {
            obj = "";
        }
        objArr[0] = obj;
        C118672d.m167353c("Matrix.DefaultPluginListener", "report issue content: %s", objArr);
    }

    /* renamed from: b */
    public void mo110076b(C90970b bVar) {
        C118672d.m167353c("Matrix.DefaultPluginListener", "%s plugin is inited", bVar.mo112098b());
    }

    /* renamed from: c */
    public void mo110077c(C90970b bVar) {
        C118672d.m167353c("Matrix.DefaultPluginListener", "%s plugin is started", bVar.mo112098b());
    }

    /* renamed from: d */
    public void mo110078d(C90970b bVar) {
        C118672d.m167353c("Matrix.DefaultPluginListener", "%s plugin is stopped", bVar.mo112098b());
    }
}
