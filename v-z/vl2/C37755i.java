package vl2;

import android.os.Parcel;
import android.util.Base64;
import com.tencent.p014mm.autogen.events.AppMsgInsertEvent;
import com.tencent.p014mm.plugin.scanner.model.OfflineScanContext;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75604z3;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;

/* renamed from: vl2.i */
public final class C37755i {

    /* renamed from: a */
    public static final C37755i f100002a = new C37755i();

    /* renamed from: b */
    public static int f100003b = -1;

    /* renamed from: a */
    public final boolean mo61324a(int i, int i2, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (yVar.getType() == 233 || yVar.getType() == 106 || yVar.getType() == 1061) {
            return i == 1 || i == 2 || i == 3 || i == 7 || i == 8 || i == 9;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo61325b(OfflineScanContext offlineScanContext, String str, boolean z) {
        C87412m.m108594g(offlineScanContext, "context");
        C87412m.m108594g(str, "showMsg");
        Log.m105925i("MicroMsg.OfflineScanManager", "alvinluo OfflineScan handleNetworkUnconnected needNotifyMessage: %b, context: %s, time: %d", Boolean.valueOf(z), offlineScanContext, Long.valueOf(offlineScanContext.f248920n));
        OfflineScanContext.CREATOR.getClass();
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        obtain.setDataPosition(0);
        offlineScanContext.writeToParcel(obtain, 0);
        String encodeToString = Base64.encodeToString(obtain.marshall(), 0);
        C87412m.m108593f(encodeToString, "encodeToString(dataByteArray, Base64.DEFAULT)");
        if (z) {
            Log.m105924i("MicroMsg.OfflineScanManager", "alvinluo insertOfflineScanMessage");
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108749c3("notifymessage");
            f4Var.mo108740T2(0);
            f4Var.mo100991d(3);
            f4Var.setType(721420337);
            f4Var.mo108733M2(C75604z3.m90844p());
            f4Var.mo108732L2(encodeToString);
            C75604z3.m90852x(f4Var);
            AppMsgInsertEvent appMsgInsertEvent = new AppMsgInsertEvent();
            appMsgInsertEvent.f78718d.f78719a = f4Var;
            appMsgInsertEvent.publish();
            return;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_OFFLINE_SCAN_LOCAL_STORAGE_STRING_SYNC;
        Object f = i.mo119685f(aVar, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) f;
        if (str2.length() > 0) {
            encodeToString = str2 + ',' + encodeToString;
        }
        Log.m105925i("MicroMsg.OfflineScanManager", "alvinluo handleNetworkUnconnected toSave string length: %d", Integer.valueOf(encodeToString.length()));
        C86709a0.m107535s().mo121142i().mo119677K(aVar, encodeToString);
    }
}
