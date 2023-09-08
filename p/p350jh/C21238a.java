package p350jh;

import com.tencent.p014mm.sdk.platformtools.Log;
import nb0.C88912b;
import p213oh.C11412b;

/* renamed from: jh.a */
public class C21238a implements C21243f {

    /* renamed from: a */
    public final /* synthetic */ C21239b f60039a;

    public C21238a(C21239b bVar) {
        this.f60039a = bVar;
    }

    /* renamed from: a */
    public void mo33230a(C88912b bVar) {
        String str = "";
        synchronized (this.f60039a.f60043d) {
            if (bVar != null) {
                this.f60039a.f60040a.remove(bVar.f256417b);
                str = bVar.f256417b;
            }
        }
        Object[] objArr = {str};
        int i = C11412b.f33577a;
        Log.m105921e("MicroMsg.Audio.AudioDownloadMgr", "download fail, src:%s", objArr);
    }
}
