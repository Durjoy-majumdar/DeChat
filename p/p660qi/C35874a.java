package p660qi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import p644pi.C77089d;
import p684si.C36674e;
import zt3.C119157j;

/* renamed from: qi.a */
public class C35874a implements C44668u3.C30780c {

    /* renamed from: qi.a$a */
    public class C35875a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f95735d;

        public C35875a(C35874a aVar, String str) {
            this.f95735d = str;
        }

        public void run() {
            C36674e eVar = new C36674e();
            eVar.field_chatroomname = this.f95735d;
            eVar.field_queryState = 1;
            Log.m105925i("ChatroomContactOnStorageChanged", "onNotifyChange username:%s result:%s", this.f95735d, Boolean.valueOf(((C77089d) C86312j.m106911c(C77089d.class)).xx0().insert(eVar)));
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj != null && (obj instanceof String) && i == 2 && mStorageEx == ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni()) {
            String str = (String) obj;
            if (C72996z1.m85807K5(str)) {
                ((C119157j) C119157j.f356862d).mo183875f(new C35875a(this, str));
            }
        }
    }
}
