package tm0;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: tm0.m0 */
public final class C14031m0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14031m0 f39384d = new C14031m0();

    public C14031m0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        map.put("bluetoothEnabled", Boolean.valueOf(defaultAdapter != null ? defaultAdapter.isEnabled() : false));
        return C13598b0.f38549a;
    }
}
