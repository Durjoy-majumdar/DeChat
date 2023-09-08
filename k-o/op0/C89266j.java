package op0;

import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.pointers.PBool;
import java.util.List;
import js0.C9514m;
import op0.C89251a;
import op0.C89269l;

/* renamed from: op0.j */
public class C89266j implements C89251a.C89253b {

    /* renamed from: a */
    public final /* synthetic */ C89251a.C89253b f257168a;

    /* renamed from: b */
    public final /* synthetic */ PBool f257169b;

    /* renamed from: c */
    public final /* synthetic */ C89269l.C89274d f257170c;

    /* renamed from: d */
    public final /* synthetic */ C9514m f257171d;

    /* renamed from: e */
    public final /* synthetic */ C9514m f257172e;

    /* renamed from: f */
    public final /* synthetic */ C89269l f257173f;

    /* renamed from: op0.j$a */
    public class C89267a implements Runnable {
        public C89267a() {
        }

        public void run() {
            if (C89266j.this.f257172e.f29691a != null) {
                ((C89256c) C89266j.this.f257172e.f29691a).dismiss();
            }
        }
    }

    public C89266j(C89269l lVar, C89251a.C89253b bVar, PBool pBool, C89269l.C89274d dVar, C9514m mVar, C9514m mVar2) {
        this.f257173f = lVar;
        this.f257168a = bVar;
        this.f257169b = pBool;
        this.f257170c = dVar;
        this.f257171d = mVar;
        this.f257172e = mVar2;
    }

    /* renamed from: a */
    public void mo114320a(List<String> list) {
        C89251a.C89253b bVar = this.f257168a;
        if (bVar != null) {
            bVar.mo114320a(list);
        }
    }

    /* renamed from: b */
    public void mo114321b(C89251a.C89255d dVar) {
        C89269l.C89274d dVar2;
        this.f257169b.value = true;
        if (C89251a.C89255d.OK == dVar && (dVar2 = this.f257170c) != null && dVar2.f257194b) {
            if (!((ModulePkgInfo) this.f257171d.f29691a).independent) {
                this.f257173f.mo123583i(ModulePkgInfo.MAIN_MODULE_NAME, "options.injectModuleJS");
            }
            this.f257173f.mo123583i(((ModulePkgInfo) this.f257171d.f29691a).name, "options.injectModuleJS");
        }
        this.f257173f.f257182c.mo113024P0(new C89267a());
        C89251a.C89253b bVar = this.f257168a;
        if (bVar != null) {
            bVar.mo114321b(dVar);
        }
    }
}
