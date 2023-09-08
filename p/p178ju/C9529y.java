package p178ju;

import android.os.Bundle;
import android.text.SpannableString;
import c62.C0419f;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.Map;
import wd3.C53155r0;

/* renamed from: ju.y */
public class C9529y implements C7241k.C7244c {
    /* renamed from: G4 */
    public CharSequence mo8417G4(Map map, String str, Bundle bundle, WeakReference weakReference, WeakReference weakReference2) {
        Bundle bundle2 = bundle;
        if (map == null) {
            return null;
        }
        String string = bundle2 != null ? bundle2.getString("conv_talker_username") : "";
        ((C0419f) C86312j.m106911c(C0419f.class)).Fx0(map, str, bundle, weakReference, string, false);
        String nullAsNil = Util.nullAsNil((String) map.get(str + ".title"));
        SpannableString spannableString = new SpannableString(nullAsNil);
        spannableString.setSpan(new C9528x(this, 1, (C53155r0) null, map, str, bundle, weakReference, string, weakReference2), 0, nullAsNil.length(), 33);
        return spannableString;
    }
}
