package tz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;
import p1081gi.C98121d;
import uz2.C52718u;
import uz2.C78317u1;
import vz2.C78501d;
import z04.C112551y;

/* renamed from: tz2.j */
public final class C78124j implements C78116c {

    /* renamed from: a */
    public final /* synthetic */ long f228933a;

    /* renamed from: b */
    public final /* synthetic */ C78125k f228934b;

    public C78124j(long j, C78125k kVar) {
        this.f228933a = j;
        this.f228934b = kVar;
    }

    /* renamed from: a */
    public void mo108098a(int i, boolean z, C98121d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onUploadEnd cost");
        sb.append(System.currentTimeMillis() - this.f228933a);
        sb.append(".errorCode");
        sb.append(i);
        sb.append(",isOk");
        sb.append(z);
        sb.append(",mediaType");
        C52718u uVar = this.f228934b.f228935a.f229448d;
        sb.append(uVar != null ? Integer.valueOf(uVar.f147237f) : null);
        sb.append(",sceneResult");
        sb.append(dVar);
        Log.m105924i("MicroMsg.TextStatus.UploadTask", sb.toString());
        if (z && dVar != null) {
            String str = dVar.field_fileUrl;
            if (!(str == null || C112551y.m153811k(str))) {
                String str2 = dVar.field_thumbUrl;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    C78317u1 u1Var = this.f228934b.f228935a;
                    C52718u uVar2 = u1Var.f229448d;
                    uVar2.f147239h = dVar.field_fileUrl;
                    uVar2.f147241j = dVar.field_thumbUrl;
                    C61926c.m72668M(new C78114a(new C78115b(u1Var)));
                    return;
                }
            }
        }
        C78120g gVar = C78120g.f228929a;
        C78317u1 u1Var2 = this.f228934b.f228935a;
        C87412m.m108594g(u1Var2, "postInfo");
        Log.m105924i("MicroMsg.TextStatus.UploadManager", "makeCdnFail " + u1Var2.f229455n + ' ' + u1Var2.f229453i + ' ' + u1Var2.f229454j);
        u1Var2.f229453i = u1Var2.f229453i + 1;
        gVar.mo108103c(u1Var2);
        C78501d.m94804e(C78501d.f229945a, u1Var2.f229458q, 2L, (String) null, (String) null, 12, (Object) null);
        C78120g.f228930b.sendEmptyMessage(0);
    }
}
