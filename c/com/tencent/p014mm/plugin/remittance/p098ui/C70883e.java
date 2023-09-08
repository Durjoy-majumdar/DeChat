package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Comparator;
import java.util.Iterator;
import te3.C77907be0;
import te3.C77995sj;

/* renamed from: com.tencent.mm.plugin.remittance.ui.e */
public class C70883e {

    /* renamed from: a */
    public C77907be0 f205296a = null;

    /* renamed from: b */
    public C77995sj f205297b;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.e$a */
    public class C70884a implements Comparator {
        public C70884a(C70883e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((C77907be0) obj).f227001j - ((C77907be0) obj2).f227001j > 0 ? -1 : 1;
        }
    }

    /* renamed from: a */
    public void mo97552a(String str) {
        this.f205296a = null;
        if (str == null) {
            this.f205296a = null;
            return;
        }
        C77995sj sjVar = this.f205297b;
        if (sjVar == null) {
            Log.m105920e("MicroMsg.FavorInfoPicked", "error setSelectFavorComposeId currentFavorResp is null");
            this.f205296a = null;
            return;
        }
        Iterator<C77907be0> it = sjVar.f228221e.iterator();
        while (it.hasNext()) {
            C77907be0 next = it.next();
            if (str.equals(next.f226995d)) {
                this.f205296a = next;
                return;
            }
        }
    }
}
