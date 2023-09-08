package t62;

import ab0.C112784b;
import bb0.C113157b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import u62.C22595e;
import z62.C66734b;

/* renamed from: t62.b */
public class C118386b implements C22438a {

    /* renamed from: a */
    public final C22595e f353796a;

    /* renamed from: b */
    public final C66734b f353797b;

    /* renamed from: c */
    public final String f353798c;

    /* renamed from: d */
    public final String f353799d;

    /* renamed from: e */
    public C113157b f353800e;

    public C118386b(C22595e eVar, C66734b bVar, String str, String str2) {
        C87412m.m108594g(eVar, "onePlayContext");
        C87412m.m108594g(bVar, "mediaSource");
        C87412m.m108594g(str, "originMediaId");
        C87412m.m108594g(str2, "playMediaId");
        this.f353796a = eVar;
        this.f353797b = bVar;
        this.f353798c = str;
        this.f353799d = str2;
        C113157b a = C112784b.f337700a.mo164535a(bVar.f191765a, false);
        String str3 = bVar.f191766b;
        C87412m.m108594g(str3, "value");
        a.field_url = str3;
        this.f353800e = a;
        boolean k = C86013q1.m106450k(a.mo165658l2());
        String j = mo183177j();
        Log.m105924i(j, "create ResourceLoaderProxy, cache:" + this.f353800e + " mediaCache path:" + this.f353800e.mo165658l2() + ", exists:" + k + ' ');
        int i = this.f353800e.field_state;
        if (i == -2 || i == -1 || i == 0) {
            mo183178k();
        } else if ((i == 2 || i == 3) && !k) {
            mo183178k();
        }
    }

    /* renamed from: a */
    public boolean mo22517a() {
        C113157b bVar = this.f353800e;
        return bVar.field_totalSize > 0 && bVar.field_cacheSize > 0 && bVar.field_state == 3;
    }

    /* renamed from: b */
    public long mo22518b() {
        return this.f353800e.field_cacheSize;
    }

    /* renamed from: c */
    public long mo22519c() {
        return this.f353800e.field_totalSize;
    }

    /* renamed from: d */
    public void mo22520d(String str) {
        C87412m.m108594g(str, "fileFormat");
        String j = mo183177j();
        Log.m105924i(j, "updateFileFormat fileFormat:" + str);
        C113157b b = C112784b.m154286b(C112784b.f337700a, this.f353799d, false, 2, (Object) null);
        if (!C87412m.m108589b(b.field_specFormat, str)) {
            b.field_specFormat = str;
        }
        mo183179l();
    }

    /* renamed from: e */
    public boolean mo22521e() {
        return this.f353800e.field_moovReady;
    }

    /* renamed from: f */
    public void mo22522f() {
        Log.m105924i(mo183177j(), "updateMoovReady");
        C112784b.m154286b(C112784b.f337700a, this.f353799d, false, 2, (Object) null).field_moovReady = true;
        mo183179l();
    }

    /* renamed from: g */
    public void mo22523g(int i) {
        String j = mo183177j();
        Log.m105924i(j, "updateDecoderType decoderType:" + i);
        C113157b b = C112784b.m154286b(C112784b.f337700a, this.f353799d, false, 2, (Object) null);
        if (b.field_codecFormat != i) {
            b.field_codecFormat = i;
        }
        mo183179l();
    }

    public String getFilePath() {
        return this.f353800e.mo165658l2();
    }

    /* renamed from: h */
    public void mo22525h(int i) {
        String j = mo183177j();
        Log.m105924i(j, "markStateError retCode:" + i);
        C112784b bVar = C112784b.f337700a;
        C113157b b = C112784b.m154286b(bVar, this.f353799d, false, 2, (Object) null);
        b.field_cacheSize = b.field_cacheSize;
        b.field_totalSize = b.field_totalSize;
        b.field_state = b.field_state;
        String str = this.f353799d;
        String str2 = this.f353798c;
        String str3 = this.f353797b.f191766b;
        int i2 = b.field_codecFormat;
        String str4 = b.field_specFormat;
        if (str4 == null) {
            str4 = "";
        }
        bVar.mo164537d(str, str2, str3, i2, str4, 0, 0, 0, -1, b.field_duration, "", "");
        mo183179l();
    }

    /* renamed from: i */
    public void mo22526i(long j, long j2, int i) {
        String j3 = mo183177j();
        Log.m105924i(j3, "updateProgressMemory cacheSize:" + j + " totalSize:" + j2 + " state:" + i);
        C113157b b = C112784b.m154286b(C112784b.f337700a, this.f353799d, false, 2, (Object) null);
        b.field_cacheSize = j;
        b.field_totalSize = j2;
        b.field_state = i;
        mo183179l();
    }

    /* renamed from: j */
    public final String mo183177j() {
        return this.f353796a.mo35698b("FVFDbCache");
    }

    /* renamed from: k */
    public final void mo183178k() {
        Log.m105924i(mo183177j(), "resetMediaCache");
        C112784b bVar = C112784b.f337700a;
        C113157b b = C112784b.m154286b(bVar, this.f353799d, false, 2, (Object) null);
        b.field_cacheSize = b.field_cacheSize;
        b.field_totalSize = b.field_totalSize;
        b.field_state = b.field_state;
        String str = this.f353799d;
        String str2 = this.f353798c;
        String str3 = this.f353797b.f191766b;
        int i = b.field_codecFormat;
        String str4 = b.field_specFormat;
        if (str4 == null) {
            str4 = "";
        }
        bVar.mo164537d(str, str2, str3, i, str4, 0, 0, 0, 1, b.field_duration, "", "");
        mo183179l();
    }

    /* renamed from: l */
    public final void mo183179l() {
        this.f353800e = C112784b.m154286b(C112784b.f337700a, this.f353799d, false, 2, (Object) null);
    }
}
