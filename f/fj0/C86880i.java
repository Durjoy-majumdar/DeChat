package fj0;

import com.google.android.gms.iid.InstanceID;
import ej0.C86525c;
import gj0.C87227a;
import gj0.C87229c;
import hj0.C87532b;
import hj0.C87533c;
import hj0.C87535e;
import java.util.HashMap;

/* renamed from: fj0.i */
public class C86880i implements C87227a {

    /* renamed from: a */
    public final /* synthetic */ C86525c f252175a;

    /* renamed from: b */
    public final /* synthetic */ C87229c f252176b;

    /* renamed from: c */
    public final /* synthetic */ C86883l f252177c;

    public C86880i(C86883l lVar, C86525c cVar, C87229c cVar2) {
        this.f252177c = lVar;
        this.f252175a = cVar;
        this.f252176b = cVar2;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        C87229c cVar = this.f252176b;
        if (cVar != null) {
            cVar.mo121010a(eVar);
        }
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        String a = eVar.f253593a.mo122001a("SID");
        C87533c cVar = new C87533c();
        C87532b bVar = eVar.f253593a;
        cVar.f253589a = bVar.mo122001a("SID");
        bVar.mo122001a(InstanceID.ERROR_TIMEOUT);
        cVar.f253590b = this.f252175a;
        ((HashMap) this.f252177c.f252187d).put(a, cVar);
        C87229c cVar2 = this.f252176b;
        if (cVar2 != null) {
            cVar2.mo121011b(cVar);
        }
    }
}
