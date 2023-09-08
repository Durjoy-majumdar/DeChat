package ne0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import he0.C46021h;
import he0.C76158j;
import ie0.C46220j;
import p749xh.C53354z6;
import zt3.C119157j;

/* renamed from: ne0.a */
public final class C47224a {

    /* renamed from: ne0.a$a */
    public static final class C47225a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f126784d;

        /* renamed from: e */
        public final /* synthetic */ int f126785e;

        /* renamed from: f */
        public final /* synthetic */ int f126786f;

        /* renamed from: g */
        public final /* synthetic */ long f126787g;

        public C47225a(String str, int i, int i2, long j) {
            this.f126784d = str;
            this.f126785e = i;
            this.f126786f = i2;
            this.f126787g = j;
        }

        public final void run() {
            C53354z6 au = ((C46021h) C86312j.m106911c(C46021h.class)).mo71460au(this.f126784d);
            if (au != null) {
                C47224a.m52530a((C46220j) au, this.f126785e, this.f126786f, this.f126787g);
            }
        }
    }

    /* renamed from: ne0.a$b */
    public static final class C47226b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C46220j f126788d;

        /* renamed from: e */
        public final /* synthetic */ int f126789e;

        /* renamed from: f */
        public final /* synthetic */ int f126790f;

        /* renamed from: g */
        public final /* synthetic */ long f126791g;

        public C47226b(C46220j jVar, int i, int i2, long j) {
            this.f126788d = jVar;
            this.f126789e = i;
            this.f126790f = i2;
            this.f126791g = j;
        }

        public final void run() {
            C46220j jVar = this.f126788d;
            String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(jVar.field_openImAppId, jVar.field_openImDescWordingId);
            C115669n nVar = C115669n.INSTANCE;
            C46220j jVar2 = this.f126788d;
            nVar.mo160131h(23393, jVar2.field_username, jVar2.field_nickname, jVar2.field_openImAppId, wo, Integer.valueOf(this.f126789e), Integer.valueOf(this.f126790f), 0, "", this.f126788d.field_finderUsername, Long.valueOf(this.f126791g));
        }
    }

    /* renamed from: a */
    public static final void m52530a(C46220j jVar, int i, int i2, long j) {
        if (jVar != null) {
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            long j2 = j;
            ((C119157j) C119157j.f356862d).mo183870a(new C47226b(jVar, i, i2, j2));
        }
    }

    /* renamed from: b */
    public static final void m52531b(String str, int i, int i2) {
        if (!(str == null || str.length() == 0)) {
            ((C119157j) C119157j.f356862d).mo183870a(new C47225a(str, i, i2, System.currentTimeMillis()));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m52532c(C46220j jVar, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            j = 0;
        }
        m52530a(jVar, i, i2, j);
    }

    /* renamed from: d */
    public static final void m52533d(int i) {
        C115669n.INSTANCE.mo160131h(23393, "", "", "", "", Integer.valueOf(i), 0, 0, "", "", Long.valueOf(System.currentTimeMillis()));
    }
}
