package androidx.appcompat.app;

import android.view.View;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.app.k */
public class C103420k extends C107175c0 {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDelegateImpl f305077a;

    public C103420k(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f305077a = appCompatDelegateImpl;
    }

    /* renamed from: a */
    public void mo143420a(View view) {
        this.f305077a.f305023s.setAlpha(1.0f);
        this.f305077a.f305026v.mo157608d((C107173b0) null);
        this.f305077a.f305026v = null;
    }

    /* renamed from: b */
    public void mo143457b(View view) {
        this.f305077a.f305023s.setVisibility(0);
        this.f305077a.f305023s.sendAccessibilityEvent(32);
        if (this.f305077a.f305023s.getParent() instanceof View) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107212f.m145215c((View) this.f305077a.f305023s.getParent());
        }
    }
}
