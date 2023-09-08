package d62;

import android.content.Context;
import android.os.Bundle;
import com.tencent.neattextview.textview.view.NeatTextView;
import di3.C7335d;
import java.lang.ref.WeakReference;
import java.util.Map;
import ob0.C35136m;
import p261wl.C15510f;

/* renamed from: d62.k */
public interface C7241k extends C7335d {

    /* renamed from: d62.k$a */
    public interface C7242a {
        /* renamed from: M4 */
        String mo8415M4(Map<String, String> map, String str, Bundle bundle);
    }

    /* renamed from: d62.k$b */
    public interface C7243b extends C15510f {
        /* renamed from: M4 */
        String mo8416M4(Map<String, String> map, String str, Bundle bundle);
    }

    /* renamed from: d62.k$c */
    public interface C7244c extends C15510f {
        /* renamed from: G4 */
        CharSequence mo8417G4(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);
    }

    /* renamed from: d62.k$d */
    public interface C7245d {
        /* renamed from: d */
        Boolean mo8418d(Map<String, String> map);

        /* renamed from: q */
        CharSequence mo8419q(Map<String, String> map, String str);
    }

    /* renamed from: d62.k$e */
    public interface C7246e {
        /* renamed from: G4 */
        CharSequence mo8420G4(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);
    }

    /* renamed from: d62.k$f */
    public interface C7247f extends C7245d, C15510f {
    }

    /* renamed from: d62.k$g */
    public interface C7248g extends C15510f {
        /* renamed from: K0 */
        void mo8421K0(String str, Map<String, String> map, C35136m.C35137a aVar);

        /* renamed from: u2 */
        void mo8422u2(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);
    }

    /* renamed from: d62.k$h */
    public interface C7249h {
        /* renamed from: K0 */
        void mo7772K0(String str, Map<String, String> map, C35136m.C35137a aVar);

        /* renamed from: u2 */
        void mo7773u2(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);
    }

    /* renamed from: TV */
    CharSequence mo8408TV(long j, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);

    /* renamed from: cF */
    CharSequence mo8409cF(String str, Bundle bundle);

    /* renamed from: gZ */
    void mo8410gZ(String str, C7246e eVar);

    void h80(String str, Map<String, String> map, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2);

    /* renamed from: pS */
    void mo8412pS(String str, C7249h hVar);

    void sn0(String str, C7249h hVar);

    void z60(String str);
}
