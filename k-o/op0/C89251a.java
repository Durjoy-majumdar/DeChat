package op0;

import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import java.util.List;

/* renamed from: op0.a */
public interface C89251a {

    /* renamed from: op0.a$a */
    public interface C89252a {
        /* renamed from: a */
        void mo123572a(WxaPkgLoadProgress wxaPkgLoadProgress);
    }

    /* renamed from: op0.a$b */
    public interface C89253b {
        /* renamed from: a */
        void mo114320a(List<String> list);

        /* renamed from: b */
        void mo114321b(C89255d dVar);
    }

    /* renamed from: op0.a$c */
    public static class C89254c implements C89251a {
        /* renamed from: a */
        public void mo109805a(String str, C89253b bVar) {
            if (bVar != null) {
                bVar.mo114321b(C89255d.OK);
            }
        }

        /* renamed from: b */
        public void mo123569b(String str, C89253b bVar, C89252a aVar, boolean z) {
            mo109805a(str, bVar);
        }

        /* renamed from: c */
        public String mo123570c(String str) {
            return ModulePkgInfo.MAIN_MODULE_NAME;
        }

        /* renamed from: d */
        public boolean mo123571d() {
            return false;
        }
    }

    /* renamed from: op0.a$d */
    public enum C89255d {
        OK,
        FAIL,
        CANCEL,
        MODULE_NOT_FOUND
    }

    /* renamed from: a */
    void mo109805a(String str, C89253b bVar);

    /* renamed from: b */
    void mo123569b(String str, C89253b bVar, C89252a aVar, boolean z);

    /* renamed from: c */
    String mo123570c(String str);

    /* renamed from: d */
    boolean mo123571d();
}
