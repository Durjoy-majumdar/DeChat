package o90;

import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C101611g;
import q90.C101060a;
import q90.C101061b;
import q90.C101069i;
import q90.C62585c;

/* renamed from: o90.c */
public class C100307c implements C101611g.C101612b<String, Object> {

    /* renamed from: a */
    public final /* synthetic */ C100301b f293830a;

    public C100307c(C100301b bVar) {
        this.f293830a = bVar;
    }

    public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        if (obj2 == null || obj3 == null || obj2 != obj3) {
            C101060a aVar = C101060a.f295868c;
            if (!(this.f293830a.f295875e == null || obj2 == null || obj3 != null)) {
                Log.m105924i("MicroMsg.BitmapResource", "let me see see");
                this.f293830a.f295875e.preRemoveCallback(str, obj2, obj3);
            }
            C100301b bVar = this.f293830a;
            C62585c<T, Y> cVar = bVar.f295873c;
            if (cVar != null) {
                C101069i iVar = (C101069i) cVar;
                Object b = iVar.mo140123b(bVar.f293825f, str);
                C101061b bVar2 = (C101061b) iVar.f295881a.remove(b);
                C101061b bVar3 = (C101061b) iVar.f295882b.remove(b);
            }
        }
    }
}
