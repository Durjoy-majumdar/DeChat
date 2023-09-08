package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import ig1.C8916d;
import org.libpag.PAGComposition;
import org.libpag.PAGLayer;
import org.libpag.PAGTextLayer;
import p277yf.C15996c;
import ql1.C12874a;

/* renamed from: qj1.s7 */
public final class C12660s7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12611q7 f36258d;

    /* renamed from: e */
    public final /* synthetic */ C8916d f36259e;

    /* renamed from: f */
    public final /* synthetic */ String f36260f;

    /* renamed from: g */
    public final /* synthetic */ String f36261g;

    public C12660s7(C12611q7 q7Var, C8916d dVar, String str, String str2) {
        this.f36258d = q7Var;
        this.f36259e = dVar;
        this.f36260f = str;
        this.f36261g = str2;
    }

    public final void run() {
        this.f36258d.f36152q.setScaleMode(3);
        this.f36258d.f36152q.setRepeatCount(0);
        C15996c a = C12874a.f36849a.mo12389a();
        C8916d dVar = this.f36259e;
        PAGLayer[] pAGLayerArr = null;
        String str = dVar != null ? dVar.field_animationPagUrl : null;
        if (str == null) {
            str = "";
        }
        C15996c.C15997a.m14902b(a, str, this.f36258d.f36152q, (String) null, 4, (Object) null);
        if (this.f36260f.length() > 0) {
            PAGComposition composition = this.f36258d.f36152q.getComposition();
            if (composition != null) {
                pAGLayerArr = composition.getLayersByName("customText");
            }
            if (pAGLayerArr != null) {
                String str2 = this.f36260f;
                for (PAGLayer pAGLayer : pAGLayerArr) {
                    if (pAGLayer.layerType() == 3 && (pAGLayer instanceof PAGTextLayer)) {
                        ((PAGTextLayer) pAGLayer).setText(str2);
                    }
                }
            }
        }
        this.f36258d.f36152q.flush();
        C12611q7.m12130Z0(this.f36258d);
        Log.m105924i("Finder.FinderLiveGiftPlayPlugin", "playGiftAnimation launch timer by " + (this.f36258d.f36152q.duration() / 1000) + ", pagPath:" + this.f36261g);
    }
}
