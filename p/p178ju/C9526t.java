package p178ju;

import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.lang.ref.WeakReference;
import java.util.Map;
import wd3.C53155r0;

/* renamed from: ju.t */
public class C9526t implements C7241k.C7244c {
    /* renamed from: G4 */
    public CharSequence mo8417G4(Map map, String str, Bundle bundle, WeakReference weakReference, WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        long safeParseLong = Util.safeParseLong((String) map.get(str + ".mmlive.live_id"));
        String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        String nullAsNil = Util.nullAsNil((String) map.get(str + ".des"));
        String nullAsNil2 = Util.nullAsNil((String) map.get(str + ".mmlive.identity_id"));
        SpannableString spannableString = new SpannableString(nullAsNil);
        spannableString.setSpan(new C60922s(this, 1, (C53155r0) null, weakReference, string, nullAsNil2, safeParseLong), 0, nullAsNil.length(), 33);
        return spannableString;
    }
}
