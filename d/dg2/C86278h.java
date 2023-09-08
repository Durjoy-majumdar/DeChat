package dg2;

import ag2.C67038p;
import ag2.C79544u;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dg2.h */
public class C86278h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86286p f250892d;

    public C86278h(C86286p pVar) {
        this.f250892d = pVar;
    }

    public void run() {
        ReadMailUI readMailUI = this.f250892d.f250902d;
        readMailUI.f248831u.setMailId(readMailUI.f248818e.f233213a);
        ReadMailUI readMailUI2 = this.f250892d.f250902d;
        C79544u uVar = readMailUI2.f248818e;
        if (uVar != null) {
            readMailUI2.f248827q.setText(uVar.f233215c);
            readMailUI2.f248828r.setText(readMailUI2.f248818e.f233214b);
            readMailUI2.f248829s.setEnabled(true);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<Bundle> it = readMailUI2.f248818e.f233216d.iterator();
            while (it.hasNext()) {
                Bundle next = it.next();
                C67038p pVar = new C67038p();
                pVar.f192575e = next.getString(FirebaseAnalytics.C113379b.ITEM_NAME, "");
                pVar.f192576f = next.getString("item_addr", "");
                arrayList.add(pVar);
            }
            readMailUI2.f248822i.mo96852c(arrayList, true);
            Iterator<Bundle> it4 = readMailUI2.f248818e.f233217e.iterator();
            while (it4.hasNext()) {
                Bundle next2 = it4.next();
                C67038p pVar2 = new C67038p();
                pVar2.f192575e = next2.getString(FirebaseAnalytics.C113379b.ITEM_NAME, "");
                pVar2.f192576f = next2.getString("item_addr", "");
                arrayList2.add(pVar2);
            }
            readMailUI2.f248824n.mo96852c(arrayList2, true);
            Iterator<Bundle> it5 = readMailUI2.f248818e.f233218f.iterator();
            while (it5.hasNext()) {
                Bundle next3 = it5.next();
                C67038p pVar3 = new C67038p();
                pVar3.f192575e = next3.getString(FirebaseAnalytics.C113379b.ITEM_NAME, "");
                pVar3.f192576f = next3.getString("item_addr", "");
                arrayList3.add(pVar3);
            }
            if (!arrayList3.isEmpty()) {
                readMailUI2.f248823j.mo96852c(arrayList3, true);
            } else {
                readMailUI2.f248823j.setVisibility(8);
            }
        }
        ReadMailUI.m105396J7(this.f250892d.f250902d);
    }
}
