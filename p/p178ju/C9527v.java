package p178ju;

import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7241k;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ju.v */
public class C9527v implements C7241k.C7244c {
    /* renamed from: G4 */
    public CharSequence mo8417G4(Map map, String str, Bundle bundle, WeakReference weakReference, WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        return new SpannableString(Util.nullAsNil((String) map.get(str + ".plain")));
    }
}
