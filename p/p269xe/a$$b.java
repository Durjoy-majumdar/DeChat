package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import p981ie.C87705i;

/* renamed from: xe.a$$b */
public final /* synthetic */ class a$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ String f261428a;

    public /* synthetic */ a$$b(String str) {
        this.f261428a = str;
    }

    public final void accept(Object obj) {
        String str = this.f261428a;
        C80364g gVar = (C80364g) obj;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2129330689:
                if (str.equals("startScan")) {
                    c = 0;
                    break;
                }
                break;
            case -2081340776:
                if (str.equals("startLeScan")) {
                    c = 1;
                    break;
                }
                break;
            case -475549842:
                if (str.equals("startDiscovery")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                gVar.f235235b.f235240c++;
                return;
            case 2:
                gVar.f235235b.f235239b++;
                return;
            default:
                return;
        }
    }
}
