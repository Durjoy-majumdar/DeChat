package p1058wb;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.websocket.libwcwss.WcwssNative;
import gy3.C87412m;

/* renamed from: wb.m */
public final class C90941m implements WcwssNative.IWcWssWebSocketListener {

    /* renamed from: a */
    public WcwssNative.IWcWssWebSocketListener f260964a;

    /* renamed from: wb.m$a */
    public static final class C90942a implements C83174m.C83175a {

        /* renamed from: d */
        public final /* synthetic */ C90941m f260965d;

        public C90942a(C90941m mVar) {
            this.f260965d = mVar;
        }

        public final void onDestroy() {
            this.f260965d.f260964a = null;
        }
    }

    public C90941m(WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener, C83174m mVar) {
        C87412m.m108594g(mVar, "lifecycleOwner");
        this.f260964a = iWcWssWebSocketListener;
        mVar.mo115384z0(new C90942a(this));
    }

    public WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i, String str) {
        WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f260964a;
        if (iWcWssWebSocketListener != null) {
            return iWcWssWebSocketListener.bindSocketToCellularAndDnsByCellular(i, str);
        }
        return null;
    }

    public int doCertificateVerify(String str, long j, String str2, byte[][] bArr) {
        WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f260964a;
        if (iWcWssWebSocketListener != null) {
            return iWcWssWebSocketListener.doCertificateVerify(str, j, str2, bArr);
        }
        return 0;
    }

    public void onStateChange(String str, long j, int i) {
        WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f260964a;
        if (iWcWssWebSocketListener != null) {
            iWcWssWebSocketListener.onStateChange(str, j, i);
        }
    }
}
