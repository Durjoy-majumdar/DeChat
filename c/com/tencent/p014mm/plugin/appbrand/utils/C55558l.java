package com.tencent.p014mm.plugin.appbrand.utils;

import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C80916r;
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

@Metadata(mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.utils.l */
final class C55558l<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C55558l<InputType, ResultType> f158191a = new C55558l<>();

    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str == null || str.length() == 0) {
            Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCSyncInvokeTask, username is empty");
            return new IPCString("");
        }
        C55552j jVar = C55552j.f158177a;
        C55552j.C55556c cVar = new C55552j.C55556c((String) null, 1, (C8480h) null);
        C55552j.C55555b b = jVar.mo77083b(str, cVar);
        Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcess, dispatchResult: " + b);
        if (C55552j.C55555b.DISPATCH_NOT_HD_AVATAR == b) {
            if (C72996z1.m85820U5(str)) {
                Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcess, " + str + " is chat room, do not need to fetch hd avatar");
            } else if (Looper.myLooper() != null) {
                C61311l hl02 = ((C76706g) C86312j.m106911c(C76706g.class)).hl0();
                hl02.mo86279b(str, new C55561p(hl02));
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new C55560o(str));
            }
        }
        String str2 = cVar.f158188a;
        Log.m105918d("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCSyncInvokeTask, avatarPath: " + str2);
        return new IPCString(str2);
    }
}
