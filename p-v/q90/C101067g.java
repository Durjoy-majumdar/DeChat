package q90;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C101611g;

/* renamed from: q90.g */
public class C101067g implements C101611g.C101612b<Object, C101061b<Object>> {

    /* renamed from: a */
    public final /* synthetic */ C101069i f295879a;

    public C101067g(C101069i iVar) {
        this.f295879a = iVar;
    }

    public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
        C101061b bVar = (C101061b) obj2;
        C101061b bVar2 = (C101061b) obj3;
        Log.m105925i("MicroMsg.UsageLruMap", "extraLruMap RemoveCallback key:%s size:%s", obj, Util.getSizeKB((long) this.f295879a.f295881a.size()));
    }
}
