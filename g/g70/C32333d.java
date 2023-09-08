package g70;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.magicbrush.plugin.scl.file.MagicSclBootsPkgManagement;
import com.tencent.p014mm.magicbrush.plugin.scl.file.MagicSclPkgManagementLegacy;
import com.tencent.p014mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.magicbrush.C30183d0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h70.C8494c;
import h81.C32735h;
import j70.C87902a;
import java.util.LinkedList;
import p426a.C26814d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: g70.d */
public final class C32333d extends C86301e implements C8494c {

    /* renamed from: d */
    public final C13601g f85823d = C36568h.m40985a(new C32335b(this));

    /* renamed from: g70.d$a */
    public static final class C32334a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public final /* synthetic */ C32333d f85824d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32334a(C32333d dVar) {
            super(1);
            this.f85824d = dVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return this.f85824d.mo58569m() ? new MagicSclBootsPkgManagement(str) : new MagicSclPkgManagementLegacy(str);
        }
    }

    /* renamed from: g70.d$b */
    public static final class C32335b extends C87413o implements C32224a<C8239c> {

        /* renamed from: d */
        public final /* synthetic */ C32333d f85825d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32335b(C32333d dVar) {
            super(0);
            this.f85825d = dVar;
        }

        public Object invoke() {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(((C30183d0) C86312j.m106911c(C30183d0.class)).Ep0(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE));
            linkedList.add(new MBJsApiSetCanvasStatus());
            return this.f85825d.mo58569m() ? new C87166m(linkedList) : new C26814d(C87902a.class, linkedList);
        }
    }

    public C40427l0 Ba0() {
        return provide().mo9282g0();
    }

    /* renamed from: m */
    public boolean mo58569m() {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_magicbrush_scl_use_boots, 1) != 1) {
            z = false;
        }
        Log.m105924i("MicroMsg.MagicBrushSclFeatureService", "hy: scl use boots " + z);
        return z;
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57229My(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE, new C32334a(this));
    }

    public C8239c provide() {
        return (C8239c) ((C36570n) this.f85823d).getValue();
    }
}
