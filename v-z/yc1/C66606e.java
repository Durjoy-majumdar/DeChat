package yc1;

import bd1.C39759i;
import cm1.C28617v1;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import zc1.C66785b;

/* renamed from: yc1.e */
public final class C66606e implements Runnable {

    /* renamed from: d */
    public static final C66606e f191526d = new C66606e();

    public final void run() {
        try {
            LinkedList<C28617v1> jo = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Gx0().mo61201jo();
            Log.m105924i("Finder.AccountLogicHandler", "checkAccountDeletingTask size:" + jo.size());
            ArrayList<C28617v1> arrayList = new ArrayList<>();
            Iterator<T> it = jo.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C28617v1) next).systemRowid == -1) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (C28617v1 v1Var : arrayList) {
                Log.m105924i("Finder.AccountLogicHandler", "checkAccountDeletingTask del username = " + v1Var.field_username + ", type:" + v1Var.field_type);
                int i = v1Var.field_type;
                if (i == 1) {
                    C66785b bVar = C66785b.f191882e;
                    String str = v1Var.field_username;
                    C87412m.m108593f(str, "it.field_username");
                    bVar.mo90660L2(str, C39759i.APP_START_UP);
                } else if (i != 2) {
                    Log.m105924i("Finder.AccountLogicHandler", "checkAccountDeletingTask unknown type:" + v1Var.field_type);
                } else {
                    C58784w3.f168295a.mo83976x("checkAccountDeletingTask", v1Var);
                }
            }
        } catch (Exception e) {
            Log.m105924i("Finder.AccountLogicHandler", "checkAccountDeletingTask Exception:" + e.getMessage());
            if (C58784w3.f168295a.mo83910X0()) {
                throw e;
            }
        }
    }
}
