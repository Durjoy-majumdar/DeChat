package vx2;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import com.tencent.p014mm.plugin.taskbar.p110ui.dynamicbackground.DynamicBgServiceImpl;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.HashSet;
import p413ok.C77014c;
import p913nk.C76918b;
import p913nk.C76919c;
import wx2.C66204d;
import yx2.C39238d;
import yx2.C79167e;

@C86522b(dependencies = {C37860g.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: vx2.v */
public final class C78494v extends C86301e implements C66204d {

    /* renamed from: d */
    public final SparseArray<HashSet<C66204d.C66205b>> f229931d = new SparseArray<>();

    /* renamed from: e */
    public final DynamicBgServiceImpl f229932e = new DynamicBgServiceImpl();

    /* renamed from: Fs */
    public void mo90299Fs() {
        C79167e.m95837a();
    }

    public void L90() {
        C78493o.m94790a();
    }

    public void Vr0(int i, C66204d.C66205b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        HashSet hashSet = this.f229931d.get(i);
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        hashSet.add(bVar);
        this.f229931d.put(i, hashSet);
    }

    /* renamed from: jV */
    public boolean mo90302jV() {
        return C78493o.m94791b();
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        C76918b bVar = C76919c.f224781a;
        DynamicBgServiceImpl dynamicBgServiceImpl = this.f229932e;
        C87412m.m108595h(dynamicBgServiceImpl, "dynamicBgService");
        C77014c.m92922b("MicroMsg.DynamicBgServiceManager", "alvinluo setDynamicBgService", new Object[0]);
        C76919c.f224781a = dynamicBgServiceImpl;
    }

    public void v50(int i, C66204d.C66205b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        HashSet hashSet = this.f229931d.get(i);
        if (hashSet != null) {
            hashSet.remove(bVar);
        }
    }

    public View wo0(Context context) {
        C87412m.m108594g(context, "context");
        Context applicationContext = context.getApplicationContext();
        C87412m.m108593f(applicationContext, "context.applicationContext");
        return new DynamicBackgroundGLSurfaceView(applicationContext, (AttributeSet) null);
    }

    /* renamed from: zD */
    public boolean mo90305zD() {
        C39238d dVar = C39238d.f105557a;
        return C39238d.f105558b;
    }
}
