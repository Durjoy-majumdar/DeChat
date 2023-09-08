package ml2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.scanner.model.C19003b;
import com.tencent.p014mm.plugin.scanner.model.C19030n0;
import com.tencent.p014mm.plugin.scanner.model.C57317j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.scanlib.p325ui.ScanView;
import f40.C86709a0;
import gy3.C87412m;
import ml2.C10931f;
import ob0.C11385n;
import ob0.C117747y;
import te3.C64852yd;

/* renamed from: ml2.a */
public final class C21513a extends C10931f<Bundle> implements C10931f.C10933a, C11385n {

    /* renamed from: g */
    public C21515b f60914g;

    /* renamed from: h */
    public final C19003b.C19004a f60915h = new C21514a(this);

    /* renamed from: i */
    public C64852yd f60916i;

    /* renamed from: j */
    public C19003b f60917j;

    /* renamed from: n */
    public C19003b f60918n;

    /* renamed from: ml2.a$a */
    public static final class C21514a implements C19003b.C19004a {

        /* renamed from: a */
        public final /* synthetic */ C21513a f60919a;

        public C21514a(C21513a aVar) {
            this.f60919a = aVar;
        }

        /* renamed from: a */
        public void mo24249a(int i, long j, int i2, String str) {
            C21515b bVar = this.f60919a.f60914g;
            if (bVar != null) {
                bVar.mo24315a(i, j, i2, str);
            }
        }

        /* renamed from: b */
        public void mo24250b(int i, long j, int i2) {
            C21515b bVar = this.f60919a.f60914g;
            if (bVar != null) {
                bVar.mo24316b(i, j, i2);
            }
        }

        /* renamed from: c */
        public void mo24251c(C19030n0 n0Var) {
            C87412m.m108594g(n0Var, "result");
            C21515b bVar = this.f60919a.f60914g;
            if (bVar != null) {
                bVar.mo24317c(n0Var);
            }
        }

        /* renamed from: d */
        public void mo24252d(int i) {
            Log.m105921e("MicroMsg.AiImageHandler", "alvinluo onUploadError errCode: %d", Integer.valueOf(i));
            this.f60919a.mo361b(i, (Bundle) null);
        }
    }

    /* renamed from: ml2.a$b */
    public interface C21515b {
        /* renamed from: a */
        void mo24315a(int i, long j, int i2, String str);

        /* renamed from: b */
        void mo24316b(int i, long j, int i2);

        /* renamed from: c */
        void mo24317c(C19030n0 n0Var);
    }

    public C21513a(int i, ScanView scanView, C10931f.C10932b bVar, C21515b bVar2) {
        C87412m.m108594g(scanView, "scanView");
        C87412m.m108594g(bVar, "uiCallback");
        C87412m.m108594g(bVar2, "scanCallback");
        this.f32580d = scanView;
        this.f32581e = bVar;
        this.f32582f = scanView.getContext();
        this.f60914g = bVar2;
        C86709a0.m107524d().mo123455a(2580, this);
    }

    /* renamed from: a */
    public void mo360a(long j, Object obj) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            int i = bundle.getInt("scan_source", 0);
            if (i == 1) {
                if (this.f60918n == null) {
                    this.f60918n = new C19003b(i, this.f60915h);
                }
                C19003b bVar = this.f60918n;
                if (bVar != null) {
                    bVar.f53392f = this.f60916i;
                }
                if (bVar != null) {
                    bVar.mo24246d(j, bundle);
                }
            } else if (i == 2) {
                if (this.f60917j == null) {
                    this.f60917j = new C19003b(i, this.f60915h);
                }
                C19003b bVar2 = this.f60917j;
                if (bVar2 != null) {
                    bVar2.f53392f = null;
                }
                if (bVar2 != null) {
                    bVar2.mo24246d(j, bundle);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo361b(int i, Bundle bundle) {
        ScanView scanView;
        Log.m105925i("MicroMsg.AiImageHandler", "notify Event: %d", Integer.valueOf(i));
        if (i == 1 || i == 2) {
            ScanView scanView2 = this.f32580d;
            if (scanView2 != null) {
                scanView2.mo24373f();
            }
        } else if (i == 3) {
            C10931f.C10932b bVar = this.f32581e;
            if (bVar != null) {
                bVar.mo6125q();
            }
        } else if (i == 5 && (scanView = this.f32580d) != null) {
            scanView.mo24372e();
        }
    }

    /* renamed from: c */
    public void mo11131c(long j, boolean z) {
        C19003b bVar = this.f60918n;
        if (bVar != null) {
            bVar.mo24245c(j, z);
        }
        C19003b bVar2 = this.f60917j;
        if (bVar2 != null) {
            bVar2.mo24245c(j, z);
        }
    }

    public void destroy() {
        this.f32582f = null;
        this.f32580d = null;
        this.f32581e = null;
        this.f60914g = null;
        this.f60916i = null;
        C86709a0.m107524d().mo123470p(2580, this);
        C19003b bVar = this.f60917j;
        if (bVar != null) {
            Log.m105924i("MicroMsg.AiScanImageUploader", "alvinluo release");
            bVar.f53391e = null;
        }
        C19003b bVar2 = this.f60918n;
        if (bVar2 != null) {
            Log.m105924i("MicroMsg.AiScanImageUploader", "alvinluo release");
            bVar2.f53391e = null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C19003b bVar;
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        objArr[3] = yVar != null ? Integer.valueOf(yVar.getType()) : null;
        Log.m105925i("MicroMsg.AiImageHandler", "alvinluo AiScanImage onSceneEnd errType %d, errCode %d, errMsg %s, scene type: %s", objArr);
        if (yVar != null && yVar.getType() == 2580) {
            z = true;
        }
        if (z) {
            int i3 = yVar instanceof C57317j ? ((C57317j) yVar).f164192f : -1;
            if (i3 == 1) {
                C19003b bVar2 = this.f60918n;
                if (bVar2 != null) {
                    bVar2.mo24247e(i, i2, str, yVar);
                }
            } else if (i3 == 2 && (bVar = this.f60917j) != null) {
                bVar.mo24247e(i, i2, str, yVar);
            }
        }
    }
}
