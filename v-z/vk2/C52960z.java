package vk2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: vk2.z */
public final class C52960z implements C52959y {

    /* renamed from: a */
    public final String f147825a;

    /* renamed from: b */
    public final C52949l f147826b;

    /* renamed from: c */
    public long f147827c;

    /* renamed from: d */
    public long f147828d;

    /* renamed from: e */
    public long f147829e;

    /* renamed from: f */
    public C52961a f147830f;

    /* renamed from: vk2.z$a */
    public final class C52961a {

        /* renamed from: a */
        public boolean f147831a;

        /* renamed from: b */
        public boolean f147832b;

        /* renamed from: c */
        public boolean f147833c;

        /* renamed from: d */
        public long f147834d = -1;

        /* renamed from: e */
        public long f147835e = -1;

        /* renamed from: f */
        public long f147836f = -1;

        /* renamed from: g */
        public boolean f147837g;

        public C52961a(C52960z zVar) {
        }

        /* renamed from: a */
        public final void mo73707a() {
            if (!this.f147837g && this.f147834d >= 0 && this.f147836f > 0 && this.f147835e > 0) {
                this.f147837g = true;
                Log.m105927v("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo reportScanGoodsWebViewCreate enablePreloadWebView: %b, enablePreloadFromFindTab: %b, useCache: %b, getWebViewCost: %d, initWebViewCost: %d, showCost: %d", Boolean.valueOf(this.f147831a), Boolean.valueOf(this.f147832b), Boolean.valueOf(this.f147833c), Long.valueOf(this.f147834d), Long.valueOf(this.f147835e), Long.valueOf(this.f147836f));
                C115669n.INSTANCE.mo160131h(20835, Integer.valueOf(this.f147831a ? 1 : 0), Integer.valueOf(this.f147833c ? 1 : 0), Long.valueOf(this.f147834d), Long.valueOf(this.f147835e), Long.valueOf(this.f147836f), Integer.valueOf(this.f147832b ? 1 : 0));
            }
        }
    }

    public C52960z(String str, C52949l lVar) {
        C87412m.m108594g(str, "session");
        this.f147825a = str;
        this.f147826b = lVar;
    }

    /* renamed from: a */
    public void mo24321a(DialogInterface dialogInterface, int i) {
        Log.m105927v("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onDismiss session: %s", this.f147825a);
        C52949l lVar = this.f147826b;
        if (lVar != null) {
            lVar.mo24321a(dialogInterface, i);
        }
    }

    /* renamed from: b */
    public void mo73703b(boolean z, boolean z2, boolean z3) {
        long currentTimeMillis = System.currentTimeMillis();
        C52961a aVar = this.f147830f;
        if (aVar != null) {
            aVar.f147831a = z;
            aVar.f147832b = z2;
            aVar.f147833c = z3;
            aVar.f147834d = currentTimeMillis - this.f147828d;
        }
        Object[] objArr = new Object[4];
        objArr[0] = this.f147825a;
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = Boolean.valueOf(z3);
        C52961a aVar2 = this.f147830f;
        objArr[3] = aVar2 != null ? Long.valueOf(aVar2.f147834d) : null;
        Log.m105925i("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onCreateBoxWebViewAfter session: %s, enablePreload: %b, useCache: %b, cost: %s", objArr);
        C52961a aVar3 = this.f147830f;
        if (aVar3 != null) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1259, aVar3.f147831a ? 130 : 150);
            if (!aVar3.f147831a) {
                nVar.mo175913w(1259, 151, aVar3.f147834d);
            } else if (!aVar3.f147833c) {
                nVar.mo175911u(1259, 131);
                nVar.mo175913w(1259, 133, aVar3.f147834d);
            } else {
                nVar.mo175911u(1259, 132);
            }
        }
    }

    /* renamed from: c */
    public void mo73704c() {
        long currentTimeMillis = System.currentTimeMillis();
        C52961a aVar = this.f147830f;
        if (aVar != null) {
            aVar.f147835e = currentTimeMillis - this.f147829e;
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.f147825a;
        objArr[1] = aVar != null ? Long.valueOf(aVar.f147835e) : null;
        Log.m105927v("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onInitWebViewEnd session: %s, cost: %s", objArr);
        C52961a aVar2 = this.f147830f;
        if (aVar2 != null) {
            aVar2.mo73707a();
        }
    }

    /* renamed from: d */
    public void mo73705d() {
        this.f147828d = System.currentTimeMillis();
        Log.m105927v("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onCreateBoxWebViewBefore session: %s", this.f147825a);
    }

    /* renamed from: e */
    public void mo73706e() {
        Log.m105926v("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onInitWebViewStart");
        this.f147829e = System.currentTimeMillis();
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105927v("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onCancel session: %s", this.f147825a);
        C52949l lVar = this.f147826b;
        if (lVar != null) {
            lVar.onCancel(dialogInterface);
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        C52949l lVar = this.f147826b;
        if (lVar != null) {
            lVar.onShow(dialogInterface);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C52961a aVar = this.f147830f;
        if (aVar != null) {
            aVar.f147836f = currentTimeMillis - this.f147827c;
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.f147825a;
        objArr[1] = aVar != null ? Long.valueOf(aVar.f147836f) : null;
        Log.m105925i("MicroMsg.ScanBoxDialogViewListenerImpl", "alvinluo onShow session: %s, cost: %s", objArr);
        C52961a aVar2 = this.f147830f;
        if (aVar2 != null) {
            aVar2.mo73707a();
        }
    }
}
