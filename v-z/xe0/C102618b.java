package xe0;

import a14.C53921m;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import o40.C61926c;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p277yf.C102843g;
import p277yf.C15996c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import wx3.C15601d;
import xx3.C66447b;
import ye0.C102831a;
import ye0.C102836b;
import ye0.C102837c;
import ze0.C103011a;
import ze0.C103012b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: xe0.b */
public final class C102618b implements C15996c {

    /* renamed from: a */
    public final String f302178a = "PagLoader";

    /* renamed from: b */
    public final int f302179b = 3;

    /* renamed from: c */
    public final int f302180c = 5;

    /* renamed from: d */
    public String f302181d = "";

    /* renamed from: e */
    public boolean f302182e;

    /* renamed from: f */
    public boolean f302183f;

    /* renamed from: g */
    public final C13601g f302184g = C36568h.m40985a(C102619a.f302186d);

    /* renamed from: h */
    public final C13601g f302185h = C36568h.m40985a(new C102624e(this));

    /* renamed from: xe0.b$a */
    public static final class C102619a extends C87413o implements C32224a<C102629f> {

        /* renamed from: d */
        public static final C102619a f302186d = new C102619a();

        public C102619a() {
            super(0);
        }

        public Object invoke() {
            return new C102629f();
        }
    }

    /* renamed from: xe0.b$b */
    public static final class C102620b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f302187d;

        /* renamed from: e */
        public final /* synthetic */ C102618b f302188e;

        /* renamed from: f */
        public final /* synthetic */ String f302189f;

        /* renamed from: g */
        public final /* synthetic */ PAGView f302190g;

        /* renamed from: xe0.b$b$a */
        public static final class C102621a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C102618b f302191d;

            /* renamed from: e */
            public final /* synthetic */ PAGView f302192e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102621a(C102618b bVar, PAGView pAGView) {
                super(0);
                this.f302191d = bVar;
                this.f302192e = pAGView;
            }

            public Object invoke() {
                if (this.f302191d.f302183f) {
                    this.f302192e.setVisibility(4);
                }
                return C13598b0.f38549a;
            }
        }

        public C102620b(String str, C102618b bVar, String str2, PAGView pAGView) {
            this.f302187d = str;
            this.f302188e = bVar;
            this.f302189f = str2;
            this.f302190g = pAGView;
        }

        public final void run() {
            String str = this.f302188e.f302181d + MD5Util.getMD5String(this.f302187d);
            Log.m105924i(this.f302188e.f302178a, "[load-execute] tag:" + this.f302189f + ", url:" + this.f302187d + ", path:" + str);
            C102837c cVar = new C102837c(new C103012b(this.f302187d, str, this.f302190g, this.f302189f, this.f302188e.f302182e), (C102629f) ((C36570n) this.f302188e.f302184g).getValue());
            if (C102618b.m135551c(this.f302188e, str)) {
                cVar.mo142557e(new C102831a.C102832a.C102834b(str));
                Log.m105924i(this.f302188e.f302178a, "[load-return-cache] tag:" + this.f302189f + ", url:" + this.f302187d + ", path:" + str);
                return;
            }
            C61926c.m72668M(new C102621a(this.f302188e, this.f302190g));
            ((C65222f) ((C36570n) this.f302188e.f302185h).getValue()).mo89348b(cVar);
            Log.m105924i(this.f302188e.f302178a, "[load-return-async] tag:" + this.f302189f + ", url:" + this.f302187d + ", path:" + str);
        }
    }

    /* renamed from: xe0.b$c */
    public static final class C102622c extends C87413o implements C32226l<PAGFile, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C102618b f302193d;

        /* renamed from: e */
        public final /* synthetic */ String f302194e;

        /* renamed from: f */
        public final /* synthetic */ String f302195f;

        /* renamed from: g */
        public final /* synthetic */ SafeResume<PAGFile> f302196g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102622c(C102618b bVar, String str, String str2, SafeResume<PAGFile> safeResume) {
            super(1);
            this.f302193d = bVar;
            this.f302194e = str;
            this.f302195f = str2;
            this.f302196g = safeResume;
        }

        public Object invoke(Object obj) {
            PAGFile pAGFile = (PAGFile) obj;
            String str = this.f302193d.f302178a;
            StringBuilder sb = new StringBuilder();
            sb.append("[load] finished tag:");
            sb.append(this.f302194e);
            sb.append(", url:");
            sb.append(this.f302195f);
            sb.append(", hashcode:");
            String str2 = this.f302194e;
            sb.append(str2 != null ? str2.hashCode() : 0);
            Log.m105924i(str, sb.toString());
            this.f302196g.resume(pAGFile);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xe0.b$d */
    public static final class C102623d implements C65231j<C102831a> {

        /* renamed from: a */
        public final /* synthetic */ C102618b f302197a;

        /* renamed from: b */
        public final /* synthetic */ String f302198b;

        /* renamed from: c */
        public final /* synthetic */ String f302199c;

        /* renamed from: d */
        public final /* synthetic */ String f302200d;

        /* renamed from: e */
        public final /* synthetic */ SafeResume<PAGFile> f302201e;

        public C102623d(C102618b bVar, String str, String str2, String str3, SafeResume<PAGFile> safeResume) {
            this.f302197a = bVar;
            this.f302198b = str;
            this.f302199c = str2;
            this.f302200d = str3;
            this.f302201e = safeResume;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C87412m.m108594g((C102831a) dVar, "task");
            C87412m.m108594g(nVar, "status");
            String str = this.f302197a.f302178a;
            StringBuilder sb = new StringBuilder();
            sb.append("[onLoaderFin] finished tag:");
            sb.append(this.f302198b);
            sb.append(", url:");
            sb.append(this.f302199c);
            sb.append(", hashcode:");
            String str2 = this.f302198b;
            sb.append(str2 != null ? str2.hashCode() : 0);
            Log.m105924i(str, sb.toString());
            if (C102618b.m135551c(this.f302197a, this.f302200d)) {
                this.f302201e.resume(PAGFile.Load(this.f302200d));
            } else {
                this.f302201e.resume(null);
            }
        }
    }

    /* renamed from: xe0.b$e */
    public static final class C102624e extends C87413o implements C32224a<C65222f<C102831a>> {

        /* renamed from: d */
        public final /* synthetic */ C102618b f302202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102624e(C102618b bVar) {
            super(0);
            this.f302202d = bVar;
        }

        public Object invoke() {
            C102152a aVar = new C102152a(Integer.MAX_VALUE, Integer.MAX_VALUE);
            C102618b bVar = this.f302202d;
            int i = bVar.f302179b;
            int i2 = bVar.f302180c;
            return new C65222f(new C102156f(aVar, new C102157g(i, i2), new C102157g(i, i2), new C102157g(i, i2), 3, "PagLoader"));
        }
    }

    public C102618b(C102843g gVar) {
        C87412m.m108594g(gVar, "cfg");
        this.f302181d = gVar.f303579a;
        this.f302182e = gVar.f303580b;
        this.f302183f = gVar.f303581c;
    }

    /* renamed from: c */
    public static final boolean m135551c(C102618b bVar, String str) {
        bVar.getClass();
        if (C86013q1.m106450k(str)) {
            String str2 = bVar.f302178a;
            Log.m105924i(str2, "fileExist,path = " + str);
            PAGFile Load = PAGFile.Load(str);
            if (!(Load != null)) {
                Load = null;
            }
            if (Load != null) {
                return true;
            }
            if (bVar.f302182e) {
                String str3 = bVar.f302178a;
                Log.m105924i(str3, "[checkFileLoadSuccess], del path:" + str);
                C86013q1.m106447h(str);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo14621a(String str, PAGView pAGView, String str2) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(pAGView, "pagView");
        String str3 = this.f302178a;
        Log.m105924i(str3, "[load] tag:" + str2 + ", url:" + str);
        if (mo142282d(str2)) {
            if (str.length() == 0) {
                String str4 = this.f302178a;
                Log.m105924i(str4, "[load] tag:" + str2 + ", url:" + str + ", empty return");
                return;
            }
            C119179t tVar = C119157j.f356862d;
            C102620b bVar = new C102620b(str, this, str2, pAGView);
            ((C119157j) tVar).mo183876g(bVar, this.f302178a + "-[load]");
        }
    }

    /* renamed from: b */
    public Object mo14622b(String str, String str2, C15601d<? super PAGFile> dVar) {
        boolean z = true;
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        if (!mo142282d(str2)) {
            mVar.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        int i = 0;
        if (str.length() != 0) {
            z = false;
        }
        if (z) {
            Log.m105924i(this.f302178a, "[load] tag:" + str2 + ", url:" + str + ", empty return");
            mVar.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        String str3 = this.f302181d + MD5Util.getMD5String(str);
        SafeResume safeResume = new SafeResume(mVar);
        String str4 = this.f302178a;
        StringBuilder sb = new StringBuilder();
        sb.append("[load] tag:");
        sb.append(str2);
        sb.append(", url:");
        sb.append(str);
        sb.append(", hashcode:");
        sb.append(str2 != null ? str2.hashCode() : 0);
        Log.m105924i(str4, sb.toString());
        if (m135551c(this, str3)) {
            String str5 = this.f302178a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[load] finished-cache tag:");
            sb4.append(str2);
            sb4.append(", url:");
            sb4.append(str);
            sb4.append(", hashcode:");
            if (str2 != null) {
                i = str2.hashCode();
            }
            sb4.append(i);
            Log.m105924i(str5, sb4.toString());
            safeResume.resume(PAGFile.Load(str3));
        } else {
            ((C65222f) ((C36570n) this.f302185h).getValue()).mo89349c(new C102836b(new C103011a(str, str3, this.f302182e, new C102622c(this, str2, str, safeResume))), new C102623d(this, str2, str, str3, safeResume));
        }
        return mVar.mo74608o();
    }

    /* renamed from: d */
    public final boolean mo142282d(String str) {
        if (!(this.f302181d.length() == 0)) {
            return true;
        }
        String str2 = this.f302178a;
        Log.m105920e(str2, "tag = " + str + ", path is null, return ");
        return false;
    }
}
