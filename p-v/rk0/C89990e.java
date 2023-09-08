package rk0;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p1042u.C111059i;

/* renamed from: rk0.e */
public class C89990e {

    /* renamed from: a */
    public static final C89993c f258568a = new C89991a();

    /* renamed from: rk0.e$a */
    public static class C89991a implements C89993c {

        /* renamed from: a */
        public static final C111059i<C89998l, C89992b> f258569a = new C111059i<>();
    }

    /* renamed from: rk0.e$b */
    public static class C89992b extends ScanCallback {

        /* renamed from: a */
        public final WeakReference<C89998l> f258570a;

        public C89992b(C89998l lVar) {
            this.f258570a = new WeakReference<>(lVar);
        }

        public void onBatchScanResults(List<ScanResult> list) {
            C89998l lVar = this.f258570a.get();
            if (lVar != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (ScanResult scanResultCompat : list) {
                    arrayList.add(new ScanResultCompat(scanResultCompat));
                }
                lVar.mo124314a(arrayList);
            }
        }

        public void onScanFailed(int i) {
            C89998l lVar = this.f258570a.get();
            if (lVar != null) {
                lVar.mo124315b(i);
            }
        }

        public void onScanResult(int i, ScanResult scanResult) {
            C89998l lVar = this.f258570a.get();
            if (lVar != null) {
                lVar.mo124316c(i, new ScanResultCompat(scanResult));
            }
        }
    }

    /* renamed from: rk0.e$c */
    public interface C89993c {
    }

    static {
        Log.m105924i("MicroMsg.ble.BleScannerCompat", "use 21");
    }
}
