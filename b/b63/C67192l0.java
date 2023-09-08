package b63;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: b63.l0 */
public class C67192l0 {

    /* renamed from: a */
    public static C67192l0 f192913a;

    /* renamed from: b */
    public static ArrayList<C67195n> f192914b;

    /* renamed from: a */
    public boolean mo91291a(C67195n nVar) {
        if (nVar == null) {
            Log.m105920e("MicroMsg.WalletPushNotifyManager", "hy: the callback for registering is null. register failed");
            return false;
        }
        if (f192914b == null) {
            f192914b = new ArrayList<>();
        }
        f192914b.add(nVar);
        return true;
    }

    /* renamed from: b */
    public boolean mo91292b(C67195n nVar) {
        ArrayList<C67195n> arrayList = f192914b;
        if (arrayList == null) {
            Log.m105920e("MicroMsg.WalletPushNotifyManager", "hy: callback pool is null. release failed");
            return false;
        }
        arrayList.remove(nVar);
        return true;
    }
}
