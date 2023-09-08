package p178ju;

import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.lang.ref.WeakReference;
import java.util.Map;
import wd3.C53155r0;

/* renamed from: ju.o */
public class C9523o implements C7241k.C7244c {
    /* renamed from: G4 */
    public CharSequence mo8417G4(Map map, String str, Bundle bundle, WeakReference weakReference, WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        String nullAsNil = Util.nullAsNil((String) map.get(str + ".title"));
        SpannableString spannableString = new SpannableString(nullAsNil);
        spannableString.setSpan(new C9522n(this, 1, (C53155r0) null, bundle, map, str, weakReference, weakReference2), 0, nullAsNil.length(), 33);
        return spannableString;
    }
}
