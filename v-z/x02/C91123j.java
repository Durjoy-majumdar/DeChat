package x02;

import b12.C79643a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: x02.j */
public class C91123j extends C79643a {

    /* renamed from: h */
    public final /* synthetic */ C91118g f261323h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91123j(C91118g gVar, String str, String str2, String str3, boolean z) {
        super(str, str2, str3, z);
        this.f261323h = gVar;
    }

    /* renamed from: a */
    public void mo93948a(Object obj) {
        Runnable runnable = (Runnable) obj;
        C79643a aVar = this.f261323h.f261314d;
        Log.m105919d("Tinker.HotPatchApplyService", "hp_apply download url=%s, file=%s, failed=%b", aVar.f233526d, aVar.f233527e, Boolean.valueOf(aVar.f233529g));
        if (!this.f261323h.f261314d.f233529g) {
            C38431f.m41872c(1);
            C91118g gVar = this.f261323h;
            gVar.mo125180d(gVar.f261314d.f233527e);
        } else {
            C38431f.m41871b(1);
        }
        this.f261323h.f261314d = null;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo93949b(Object obj) {
        Runnable runnable = (Runnable) obj;
    }
}
