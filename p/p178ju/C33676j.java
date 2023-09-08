package p178ju;

import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import eb0.C45626r0;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ju.j */
public class C33676j implements C7241k.C7244c {
    /* renamed from: G4 */
    public CharSequence mo8417G4(Map map, String str, Bundle bundle, WeakReference weakReference, WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        String nullAsNil = Util.nullAsNil((String) map.get(str + ".identity_id"));
        String nullAsNil2 = Util.nullAsNil((String) map.get(str + ".nickname"));
        String b = C45626r0.m50732b(nullAsNil);
        if (!Util.isNullOrNil(b)) {
            nullAsNil2 = b;
        }
        return new SpannableString(nullAsNil2);
    }
}
