package d91;

import android.app.Application;
import android.util.Pair;
import android.view.View;
import ao3.C113066a;
import ao3.C113067b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C20552a;
import gy3.C87412m;
import h81.C20928j;
import i20.C21043a;
import j91.C21200b;
import j91.C21203d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l91.C21398a;
import l91.C21400b;
import l91.C21406g;
import n91.C117614e;
import n91.C21619f;
import r91.C22218b;
import rx3.C36570n;
import t91.C22457b;
import t91.C22466j;
import w91.C22880b;

/* renamed from: d91.e */
public class C20453e implements C20928j {

    /* renamed from: d */
    public static C20928j.C20932d f57483d;

    /* renamed from: e */
    public static final C20928j.C20929a f57484e = new C20454a();

    /* renamed from: d91.e$a */
    public class C20454a implements C20928j.C20929a {
        /* renamed from: a */
        public void mo32004a(String str, int i, long j, boolean z, boolean z2, String str2) {
            Log.m105925i("HABBYGE-MALI.HellhoundService", "onPaused: %s", str);
        }

        /* renamed from: b */
        public void mo32005b(String str, int i, long j, boolean z, boolean z2, String str2) {
            Log.m105925i("HABBYGE-MALI.HellhoundService", "onResumed: %s", str);
        }
    }

    /* renamed from: WI */
    public void mo31999WI(C20928j.C20932d dVar) {
        if (dVar != null) {
            f57483d = dVar;
            ((CopyOnWriteArrayList) C22880b.m26857d().f65773c).add(dVar);
            C20552a a = C20552a.m22323a();
            ((CopyOnWriteArrayList) ((C21200b) a.f57843a).f59969a).add(dVar);
            C21406g gVar = (C21406g) a.f57844b;
            ((CopyOnWriteArrayList) gVar.f60562c).add(dVar);
            C21400b bVar = gVar.f60560a.f60559a.f60552c;
            if (bVar != null) {
                ((CopyOnWriteArrayList) bVar.f60546b).add(dVar);
                if (!((ArrayList) C21398a.f60543f).contains(dVar)) {
                    ((ArrayList) C21398a.f60543f).add(dVar);
                }
            }
            Map<String, WeakReference<View>> map = C117614e.f351842a;
            ((ArrayList) ((C21619f) ((C36570n) C117614e.f351843b).getValue()).f61211b).add(dVar);
        }
    }

    /* renamed from: ZC */
    public void mo32000ZC(C20928j.C20930b bVar) {
        C21406g gVar = (C21406g) C20552a.m22323a().f57844b;
        gVar.f60561b = bVar;
        C22457b bVar2 = C22466j.f63626f;
        bVar2.getClass();
        C22218b bVar3 = bVar2.f63606e;
        if (bVar3 != null) {
            bVar3.f62955b = gVar;
        }
    }

    /* renamed from: a4 */
    public void mo32001a4(C20928j.C20929a aVar) {
        C21200b bVar = (C21200b) C20552a.m22323a().f57843a;
        bVar.getClass();
        bVar.f59971c.f59973a = aVar;
    }

    /* renamed from: hb */
    public void mo32002hb(C20928j.C20931c cVar) {
        C22880b.m26857d().f65772b = cVar;
    }

    /* renamed from: tx */
    public void mo32003tx(Application application) {
        C20552a a = C20552a.m22323a();
        a.getClass();
        Log.m105924i("HABBYGE-MALI.HellhoundMonitor", "Hellhound.startMonitor()");
        C21200b bVar = (C21200b) a.f57843a;
        bVar.getClass();
        if (application != null && C20449a.m22052d()) {
            C21203d dVar = bVar.f59970b;
            dVar.getClass();
            C113067b bVar2 = C113067b.f338452d;
            C113066a aVar = dVar.f59978d;
            C87412m.m108594g(aVar, "callback");
            ArrayList<Application.ActivityLifecycleCallbacks> arrayList = C113067b.f338453e;
            synchronized (arrayList) {
                arrayList.add(aVar);
            }
            C21043a.m23197h().f59538b = dVar.f59976b;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("startActivity", "(Landroid/content/Intent;)V"));
            arrayList2.add(new Pair("startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V"));
            arrayList2.add(new Pair("startActivities", "([Landroid/content/Intent;)V"));
            arrayList2.add(new Pair("startActivities", "([Landroid/content/Intent;Landroid/os/Bundle;)V"));
            C21043a.m23197h().mo32755i(arrayList2, dVar.f59977c);
        }
    }
}
