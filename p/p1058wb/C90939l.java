package p1058wb;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.websocket.libwcwss.WcwssNative;
import gy3.C87412m;

/* renamed from: wb.l */
public final class C90939l implements WcwssNative.IWcWssReportListener {

    /* renamed from: a */
    public WcwssNative.IWcWssReportListener f260962a;

    /* renamed from: wb.l$a */
    public static final class C90940a implements C83174m.C83175a {

        /* renamed from: d */
        public final /* synthetic */ C90939l f260963d;

        public C90940a(C90939l lVar) {
            this.f260963d = lVar;
        }

        public final void onDestroy() {
            this.f260963d.f260962a = null;
        }
    }

    public C90939l(WcwssNative.IWcWssReportListener iWcWssReportListener, C83174m mVar) {
        C87412m.m108594g(mVar, "lifecycleOwner");
        this.f260962a = iWcWssReportListener;
        mVar.mo115384z0(new C90940a(this));
    }

    public int getNetworkType() {
        WcwssNative.IWcWssReportListener iWcWssReportListener = this.f260962a;
        if (iWcWssReportListener != null) {
            return iWcWssReportListener.getNetworkType();
        }
        return 0;
    }

    public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        WcwssNative.IWcWssReportListener iWcWssReportListener = this.f260962a;
        if (iWcWssReportListener != null) {
            iWcWssReportListener.onIdKeyStat(iArr, iArr2, iArr3);
        }
    }

    public void onKvStat(int i, String str) {
        WcwssNative.IWcWssReportListener iWcWssReportListener = this.f260962a;
        if (iWcWssReportListener != null) {
            iWcWssReportListener.onKvStat(i, str);
        }
    }
}
