package s52;

import android.database.Cursor;
import android.os.Looper;
import b63.C28261a0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86301e;
import di3.C86312j;
import e63.C31433f;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p281yz.C79173v;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: s52.n */
public class C36626n extends C86301e {

    /* renamed from: d */
    public ConcurrentHashMap<Integer, C28261a0> f97367d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public MMHandler f97368e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public boolean f97369f = false;

    public static C36626n vx0() {
        return (C36626n) C86312j.m106911c(C36626n.class);
    }

    public ArrayList<MallFunction> wx0(int i) {
        return xx0(i).f77823x;
    }

    public final C28261a0 xx0(int i) {
        if (!this.f97367d.contains(Integer.valueOf(i))) {
            C79173v vVar = (C79173v) C86312j.m106911c(C79173v.class);
            vVar.getClass();
            if (C86709a0.m107522a()) {
                C31433f a = vVar.f232481p.mo59825a();
                a.getClass();
                String str = "select * from WalletFunciontList where wallet_region = " + i;
                C28261a0 a0Var = null;
                Cursor rawQuery = a.f84134d.rawQuery(str, (String[]) null, 2);
                Log.m105924i("MicroMsg.WalletFunctionListStg", "getWalletFunciontListInfo " + str);
                if (rawQuery != null) {
                    if (rawQuery.moveToNext()) {
                        a0Var = new C28261a0();
                        a0Var.convertFrom(rawQuery);
                    }
                    rawQuery.close();
                }
                if (a0Var != null) {
                    this.f97367d.put(Integer.valueOf(i), a0Var);
                }
            } else {
                throw new C86484b();
            }
        }
        C28261a0 a0Var2 = this.f97367d.get(Integer.valueOf(i));
        return a0Var2 == null ? new C28261a0() : a0Var2;
    }
}
