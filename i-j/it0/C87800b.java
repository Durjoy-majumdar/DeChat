package it0;

import android.app.Activity;
import android.view.WindowInsets;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.sdk.platformtools.Log;
import in3.C87771d;

/* renamed from: it0.b */
public final class C87800b implements C87771d.C46280b {

    /* renamed from: d */
    public final /* synthetic */ C87795a f254174d;

    public C87800b(C87795a aVar) {
        this.f254174d = aVar;
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        WindowInsets b;
        Activity R = this.f254174d.f254168rt.mo113026R();
        if (R != null) {
            Log.m105928w(C87795a.TAG, "[onStatusBarHeightChange] newHeight=" + i + "  rt.isResumed()=" + this.f254174d.f254168rt.f238122S);
            if (this.f254174d.f254168rt.f238122S && (b = C85924r4.m106237b(R)) != null) {
                this.f254174d.onApplyWindowInsets(b);
            }
        }
    }
}
