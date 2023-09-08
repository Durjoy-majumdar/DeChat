package com.tencent.p014mm.plugin.scanner.model;

import android.os.Bundle;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.plugin.scanner.model.C19006b1;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87413o;
import nl2.C109753o;
import p447aw.C103918d;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C64197v;
import te3.C64852yd;
import vk2.C52943a0;
import vk2.C52958x;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.scanner.model.d1 */
public final class C19013d1 implements C71029e {

    /* renamed from: a */
    public final /* synthetic */ C71004i f53415a;

    /* renamed from: b */
    public final /* synthetic */ C109753o f53416b;

    /* renamed from: c */
    public final /* synthetic */ C19006b1 f53417c;

    /* renamed from: d */
    public final /* synthetic */ C19006b1.C19007a f53418d;

    /* renamed from: com.tencent.mm.plugin.scanner.model.d1$a */
    public static final class C19014a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C71004i f53419d;

        /* renamed from: e */
        public final /* synthetic */ C109753o f53420e;

        /* renamed from: f */
        public final /* synthetic */ C19006b1 f53421f;

        /* renamed from: g */
        public final /* synthetic */ C19006b1.C19007a f53422g;

        /* renamed from: com.tencent.mm.plugin.scanner.model.d1$a$a */
        public static final class C19015a extends C87413o implements C32226l<C64852yd, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C109753o f53423d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19015a(C109753o oVar) {
                super(1);
                this.f53423d = oVar;
            }

            public Object invoke(Object obj) {
                C86709a0.m107524d().mo123460f(new C57321o(C64197v.m75534c(this.f53423d.f328502i), true, (C64852yd) obj));
                return C13598b0.f38549a;
            }
        }

        public C19014a(C71004i iVar, C109753o oVar, C19006b1 b1Var, C19006b1.C19007a aVar) {
            this.f53419d = iVar;
            this.f53420e = oVar;
            this.f53421f = b1Var;
            this.f53422g = aVar;
        }

        public final void run() {
            BaseScanUI baseScanUI = (BaseScanUI) this.f53419d;
            boolean z = false;
            if (!(baseScanUI.isFinishing() || baseScanUI.isDestroyed())) {
                Bundle bundle = new Bundle();
                bundle.putInt("template_type", 1);
                bundle.putString("req_key", this.f53420e.f328502i);
                bundle.putString("enter_session", C19016e1.f53425b);
                bundle.putString("tab_session", C19016e1.m20074f(1));
                bundle.putString("scan_session", C19016e1.m20073e(1));
                bundle.putString("detect_session", String.valueOf(this.f53420e.f328495b));
                bundle.putString("scanTabMerge", "1");
                if (this.f53420e.f328494a == 3) {
                    bundle.putFloat("fixed_dialog_height_rate", 0.75f);
                    C19006b1 b1Var = this.f53421f;
                    C109753o oVar = this.f53420e;
                    C19015a aVar = new C19015a(oVar);
                    b1Var.getClass();
                    Log.m105924i("MicroMsg.ScanProductShowBoxDialogHelper", "getLocationIfNeed needPoi: " + oVar.f328504k);
                    if (oVar.f328504k) {
                        boolean isGpsEnable = LocationUtil.isGpsEnable();
                        Log.m105924i("MicroMsg.ScanProductShowBoxDialogHelper", "getLocationIfNeed isGpsEnable: " + isGpsEnable);
                        if (isGpsEnable) {
                            boolean Lb0 = ((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.ACCESS_FINE_LOCATION");
                            Log.m105924i("MicroMsg.ScanProductShowBoxDialogHelper", "getLocationIfNeed hasSystemLocationPermission: " + Lb0);
                            if (Lb0) {
                                boolean w002 = ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.SCAN);
                                Log.m105924i("MicroMsg.ScanProductShowBoxDialogHelper", "getLocationIfNeed hasBusinessLocationPermission: " + w002);
                                if (w002) {
                                    z = true;
                                }
                            }
                        }
                        if (!z) {
                            aVar.invoke(null);
                        } else {
                            ((C92411b) ((C36570n) b1Var.f53403b).getValue()).mo126411e(new C57315c1(aVar));
                        }
                    } else {
                        aVar.invoke(null);
                    }
                }
                BaseScanUI baseScanUI2 = (BaseScanUI) this.f53419d;
                baseScanUI2.getClass();
                C52958x b = C52943a0.m59244b(baseScanUI2, bundle, this.f53421f.f53402a);
                C19006b1.C19007a aVar2 = this.f53422g;
                if (aVar2 != null) {
                    aVar2.mo24253a(b);
                }
            }
        }
    }

    public C19013d1(C71004i iVar, C109753o oVar, C19006b1 b1Var, C19006b1.C19007a aVar) {
        this.f53415a = iVar;
        this.f53416b = oVar;
        this.f53417c = b1Var;
        this.f53418d = aVar;
    }

    /* renamed from: a */
    public void mo24256a(boolean z) {
        C119179t tVar = C119157j.f356862d;
        C19014a aVar = new C19014a(this.f53415a, this.f53416b, this.f53417c, this.f53418d);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 200, false);
    }

    /* renamed from: b */
    public void mo24257b() {
    }
}
