package com.tencent.p014mm.plugin.appbrand.utils;

import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.utils.C55552j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C8480h;
import kotlin.Metadata;
import p196ln.C61311l;
import p196ln.C76706g;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.utils.n */
final class C55559n<InputType, ResultType> implements C80883e {
    static {
        new C55559n();
    }

    public void invoke(Object obj, C1256g gVar) {
        IPCString iPCString = (IPCString) obj;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str == null || str.length() == 0) {
            Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCAsyncInvokeTask, username is empty");
            gVar.mo894a(new IPCString(""));
            return;
        }
        C55552j jVar = C55552j.f158177a;
        C2043m mVar = new C2043m(gVar);
        C55552j.C55556c cVar = new C55552j.C55556c((String) null, 1, (C8480h) null);
        C55552j.C55555b b = jVar.mo77083b(str, cVar);
        mVar.invoke(cVar.f158188a);
        Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, dispatchResult: " + b);
        if (C55552j.C55555b.DISPATCH_NOT_HD_AVATAR != b) {
            return;
        }
        if (C72996z1.m85820U5(str)) {
            Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, " + str + " is chat room, do not need to fetch hd avatar");
        } else if (Looper.myLooper() != null) {
            C61311l hl02 = ((C76706g) C86312j.m106911c(C76706g.class)).hl0();
            hl02.mo86279b(str, new C55563r(hl02));
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C55562q(str));
        }
    }
}
