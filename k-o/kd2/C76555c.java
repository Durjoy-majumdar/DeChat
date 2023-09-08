package kd2;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: kd2.c */
public final class C76555c {

    /* renamed from: a */
    public static final C76555c f224079a;

    /* renamed from: b */
    public static C76556a f224080b;

    /* renamed from: c */
    public static final ArrayList<C76557b> f224081c = new ArrayList<>();

    /* renamed from: kd2.c$a */
    public interface C76556a {
        /* renamed from: a */
        void mo106799a(String str);

        /* renamed from: b */
        void mo106800b();

        /* renamed from: c */
        String mo106801c();

        /* renamed from: d */
        Bankcard mo106802d(boolean z);

        void reload();
    }

    /* renamed from: kd2.c$b */
    public interface C76557b {
        /* renamed from: A0 */
        void mo96287A0();
    }

    static {
        C76555c cVar = new C76555c();
        f224079a = cVar;
        cVar.mo106805b();
    }

    /* renamed from: a */
    public final Bankcard mo106804a(boolean z) {
        C76556a aVar = f224080b;
        String str = null;
        if (aVar != null) {
            Bankcard d = aVar.mo106802d(z);
            StringBuilder sb = new StringBuilder();
            sb.append("getPriorBankcard: ");
            if (d != null) {
                str = d.field_bankcardType;
            }
            sb.append(str);
            Log.m105924i("MicroMsg.OfflinePriorBankcardLogic", sb.toString());
            return d;
        }
        C87412m.m108603p("sImpl");
        throw null;
    }

    /* renamed from: b */
    public final void mo106805b() {
        C76556a aVar;
        boolean z = C76559f.m92110f() == 2;
        Log.m105924i("MicroMsg.OfflinePriorBankcardLogic", "isOnlineToken: " + z);
        if (z) {
            Log.m105924i("MicroMsg.OfflinePriorBankcardLogic", "create online store");
            aVar = new C76554b();
        } else {
            Log.m105924i("MicroMsg.OfflinePriorBankcardLogic", "create legacy store");
            aVar = new C76553a();
        }
        f224080b = aVar;
        mo106806c();
    }

    /* renamed from: c */
    public final void mo106806c() {
        C76556a aVar = f224080b;
        if (aVar != null) {
            aVar.reload();
        } else {
            C87412m.m108603p("sImpl");
            throw null;
        }
    }
}
