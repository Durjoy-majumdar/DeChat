package p814gd;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMFileSlotManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import dn0.C45428e;

/* renamed from: gd.a */
public class C45904a implements C45428e {

    /* renamed from: a */
    public MMFileSlotManager f123873a = new MMFileSlotManager("bizplaylist", 86400);

    /* renamed from: a */
    public C86009m1 mo71331a(String str) {
        C86009m1 m1Var;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (Util.isNullOrNil(lastPathSegment) || (m1Var = (C86009m1) this.f123873a.findSlot(lastPathSegment)) == null) {
            return null;
        }
        Log.m105925i("PlaylistFileInterceptor", "intercept success, contentId:%s, url:%s", lastPathSegment, str);
        return new C86009m1(String.format("%s/%s", new Object[]{m1Var.mo119976n(), lastPathSegment}));
    }
}
