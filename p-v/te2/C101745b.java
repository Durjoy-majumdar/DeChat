package te2;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C24560g0;
import gy3.C87412m;
import ke2.C99129c;
import xe2.C102630a;
import xe2.C102631b;

/* renamed from: te2.b */
public final class C101745b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f297821d;

    public C101745b(C72963f4 f4Var) {
        this.f297821d = f4Var;
    }

    public final void run() {
        if (this.f297821d.mo100979R3()) {
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C102631b bVar = cVar.f290673z;
            String str = this.f297821d.mo108774y2() + "_1";
            bVar.getClass();
            C87412m.m108594g(str, "msgItemId");
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgItemId", str);
            C102630a aVar = (C102630a) bVar.get(contentValues, C24560g0.m30725a(C102630a.class));
            if (aVar != null) {
                aVar.mo142463F2(50);
                MvvmStorage.update$default(bVar, aVar, false, false, 6, (Object) null);
            }
            Log.m105924i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: msg exposure, update priority, msgId:" + this.f297821d.getMsgId() + ", msgSvrId:" + this.f297821d.mo108774y2());
        }
    }
}
