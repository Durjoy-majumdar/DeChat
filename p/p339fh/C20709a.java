package p339fh;

import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;
import p213oh.C89209a;
import p343gh.C20834d;
import p343gh.C20835e;
import p348ih.C21087k;

/* renamed from: fh.a */
public class C20709a implements C20835e {

    /* renamed from: a */
    public final /* synthetic */ String f58561a;

    /* renamed from: b */
    public final /* synthetic */ String f58562b;

    /* renamed from: c */
    public final /* synthetic */ C45784e f58563c;

    public C20709a(C45784e eVar, String str, String str2) {
        this.f58563c = eVar;
        this.f58561a = str;
        this.f58562b = str2;
    }

    /* renamed from: a */
    public void mo32433a() {
        this.f58563c.f123682c = C89209a.m111501c(this.f58561a, "audio_cache_path_file.txt");
        C45784e eVar = this.f58563c;
        eVar.getClass();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "saveData", (Object[]) null);
        C20834d dVar = new C20834d(new C45782c(eVar), "saveData", 5);
        C21087k.m23341a();
        C21087k.m23342b(dVar);
        this.f58563c.f123682c = C89209a.m111501c(this.f58562b, "audio_cache_path_file.txt");
        C45784e eVar2 = this.f58563c;
        eVar2.getClass();
        Log.m105925i("MicroMsg.Mix.AudioCachePathMgr", "readData", (Object[]) null);
        C20834d dVar2 = new C20834d(new C45783d(eVar2), "readData", 5);
        C21087k.m23341a();
        C21087k.m23342b(dVar2);
    }

    /* renamed from: b */
    public void mo32434b() {
    }
}
