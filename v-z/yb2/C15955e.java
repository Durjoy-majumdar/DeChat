package yb2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import java.lang.ref.WeakReference;
import java.util.List;
import pj3.C47511g;
import rx3.C36570n;

/* renamed from: yb2.e */
public final class C15955e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C15947c f42851d;

    public C15955e(C15947c cVar) {
        this.f42851d = cVar;
    }

    public final void run() {
        C15947c cVar = this.f42851d;
        cVar.f42839n.clear();
        AppCompatActivity activity = cVar.getActivity();
        C47511g gVar = null;
        MMPreference mMPreference = activity instanceof MMPreference ? (MMPreference) activity : null;
        if (mMPreference != null) {
            gVar = mMPreference.getPreferenceScreen();
        }
        if (gVar != null) {
            for (WeakReference weakReference : (List) ((C36570n) cVar.f42838j).getValue()) {
                Preference preference = (Preference) weakReference.get();
                if (preference != null && gVar.mo72522f(preference.f121285r)) {
                    cVar.f42839n.add(new WeakReference(preference));
                }
            }
        }
        this.f42851d.mo14602i3();
    }
}
