package s93;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C45511f0;
import e00.C45518r0;
import e00.C7580y;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import t93.C48618a;

/* renamed from: s93.a */
public final class C48302a {

    /* renamed from: a */
    public int f129351a;

    /* renamed from: b */
    public C48303a f129352b;

    /* renamed from: s93.a$a */
    public static final class C48303a implements C45511f0.C45512a {

        /* renamed from: a */
        public final /* synthetic */ C48302a f129353a;

        /* renamed from: b */
        public final /* synthetic */ C7580y f129354b;

        public C48303a(C48302a aVar, C7580y yVar) {
            this.f129353a = aVar;
            this.f129354b = yVar;
        }

        /* renamed from: a */
        public void mo71048a(int i, int i2) {
            int i3 = this.f129353a.f129351a;
            boolean z = true;
            if (i3 != i) {
                Log.m105929w("MicroMsg.WebViewExtEventHandler", "checkWebViewIdValid failed %s, %s", Integer.valueOf(i3), Integer.valueOf(i));
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.WebViewExtEventHandler", "onImageViewPositionChanged dispatchEvent webViewId: " + i + ", pos: " + i2);
                HashMap hashMap = new HashMap();
                hashMap.put(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(i2));
                this.f129354b.mo8701f("onImagePreviewChanged", hashMap);
            }
        }
    }

    public C48302a(C7580y yVar) {
        C87412m.m108594g(yVar, "jsApiHandler");
        this.f129352b = new C48303a(this, yVar);
        C45511f0 Pl = ((C45518r0) C86312j.m106911c(C45518r0.class)).mo70754Pl();
        C48303a aVar = this.f129352b;
        ((C48618a) Pl).getClass();
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C45511f0.C45512a> arrayList = C48618a.f130144b;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.WebViewExtEventService", "registerOnImagePreviewPositionChangedListener size: %s", Integer.valueOf(arrayList.size()));
            arrayList.add(aVar);
        }
    }
}
