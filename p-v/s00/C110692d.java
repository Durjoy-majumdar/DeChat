package s00;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C7335d;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: s00.d */
public interface C110692d extends C7335d {

    /* renamed from: s00.d$a */
    public static class C22288a {

        /* renamed from: a */
        public WeakReference<View> f63184a;

        /* renamed from: b */
        public int f63185b;

        /* renamed from: c */
        public int f63186c;

        /* renamed from: d */
        public int f63187d;

        public C22288a(View view, int i, int i2, int i3, int i4, int i5) {
            this.f63184a = new WeakReference<>(view);
            this.f63185b = i;
            this.f63186c = i3;
            this.f63187d = i5;
        }
    }

    void S90(Context context, String str, String str2, int i);

    /* renamed from: SN */
    void mo35325SN(Context context, String str, String str2);

    void gb0(Context context, String str, String str2, String str3, String str4, boolean z, HashMap<String, String> hashMap, ValueCallback<String> valueCallback, ValueCallback<Integer> valueCallback2, boolean z2);

    /* renamed from: q9 */
    void mo35327q9(C22288a aVar);

    /* renamed from: tq */
    void mo35328tq(MMActivity mMActivity, String str, String str2, String str3);

    /* renamed from: zJ */
    String mo35329zJ(String str);
}
