package q22;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p196ln.C76706g;

/* renamed from: q22.a */
public class C12035a implements C80916r<IPCString, IPCString> {
    public Object invoke(Object obj) {
        IPCString iPCString = (IPCString) obj;
        Class cls = C76706g.class;
        String g = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93558g(iPCString.f10315d, true, false);
        if (Util.isNullOrNil(g) || !C86013q1.m106450k(g)) {
            g = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93558g(iPCString.f10315d, false, false);
        }
        String i = C86013q1.m106448i(g, false);
        new Bundle().putString("path", i);
        return new IPCString(i);
    }
}
