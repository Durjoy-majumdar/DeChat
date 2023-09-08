package np0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kb0.C33865k;
import ob0.C47350c;
import ob0.C89144l0;
import te3.C50236la2;
import te3.C50376ma2;
import te3.i44;
import v90.C37702d;
import v90.C37703e;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: np0.w */
public class C34987w extends C86301e implements C33865k {

    /* renamed from: d */
    public static Map<String, C33865k.C33867b> f93909d = new HashMap();

    /* renamed from: e */
    public static Map<String, List<C34988a>> f93910e = new HashMap();

    /* renamed from: np0.w$a */
    public static class C34988a {

        /* renamed from: a */
        public String f93911a;

        /* renamed from: b */
        public String f93912b;

        /* renamed from: c */
        public int f93913c;

        /* renamed from: d */
        public long f93914d;

        /* renamed from: e */
        public C33865k.C33866a f93915e;

        /* renamed from: a */
        public void mo59813a() {
            if (Util.isNullOrNil(this.f93911a) || Util.isNullOrNil(this.f93912b)) {
                Log.m105928w("MicroMsg.WxaUpdateableMsgService", "appId or shareKey is null, return");
                return;
            }
            C34989b bVar = C34989b.INSTANCE;
            Log.m105919d("MicroMsg.WxaUpdateableMsgService", "[addWorker]getUpdatableMsgWorkerList size:%d", Integer.valueOf(((ConcurrentHashMap) bVar.f93918d).size()));
            ((ConcurrentHashMap) bVar.f93918d).put(Integer.valueOf(this.f93912b.hashCode()), this);
        }

        /* renamed from: b */
        public void mo59814b() {
            C34989b bVar = C34989b.INSTANCE;
            Log.m105919d("MicroMsg.WxaUpdateableMsgService", "[removeWorker]getUpdatableMsgWorkerList size:%d", Integer.valueOf(((ConcurrentHashMap) bVar.f93918d).size()));
            ((ConcurrentHashMap) bVar.f93918d).remove(Integer.valueOf(this.f93912b.hashCode()));
        }

        /* renamed from: c */
        public boolean mo59815c() {
            int i = this.f93913c;
            if (i < 0) {
                return false;
            }
            if (i == 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f93914d;
                Log.m105919d("MicroMsg.WxaUpdateableMsgService", "consumeTime:%d", Long.valueOf(currentTimeMillis));
                return currentTimeMillis > 10000;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - this.f93914d;
            Log.m105919d("MicroMsg.WxaUpdateableMsgService", "consumeTime:%d", Long.valueOf(currentTimeMillis2));
            return currentTimeMillis2 > ((long) this.f93913c) * 1000;
        }
    }

    /* renamed from: np0.w$b */
    public enum C34989b {
        INSTANCE;
        

        /* renamed from: d */
        public Map<Integer, C34988a> f93918d;

        /* renamed from: e */
        public AtomicBoolean f93919e;

        /* renamed from: f */
        public Runnable f93920f;

        /* renamed from: np0.w$b$a */
        public class C34990a implements Runnable {
            public C34990a() {
            }

            public void run() {
                LinkedList<i44> linkedList = new LinkedList<>();
                for (C34988a aVar : ((ConcurrentHashMap) C34989b.this.f93918d).values()) {
                    if (aVar.mo59815c()) {
                        i44 i44 = new i44();
                        i44.f135106e = aVar.f93912b;
                        i44.f135105d = aVar.f93911a;
                        linkedList.add(i44);
                    }
                }
                C34989b bVar = C34989b.this;
                bVar.getClass();
                if (linkedList.size() <= 0) {
                    Log.m105918d("MicroMsg.WxaUpdateableMsgService", "shareKeyInfoList is null, return");
                    bVar.mo59816a();
                    return;
                }
                Log.m105919d("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg shareKeyInfoList.size:%d", Integer.valueOf(linkedList.size()));
                C47350c.C47352b bVar2 = new C47350c.C47352b();
                bVar2.f127069d = 2954;
                bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getupdatablemsginfo";
                C50236la2 la22 = new C50236la2();
                la22.f137278d = linkedList;
                bVar2.f127066a = la22;
                bVar2.f127067b = new C50376ma2();
                C89144l0.m111429e(bVar2.mo72403a(), new C34991x(bVar), false);
            }
        }

        /* renamed from: a */
        public final synchronized void mo59816a() {
            C86709a0.m107525e();
            MMHandlerThread.removeRunnable(this.f93920f);
            if (this.f93919e.get()) {
                Log.m105918d("MicroMsg.WxaUpdateableMsgService", "isPause, not sendUpdatableMsgRequest");
            } else if (((ConcurrentHashMap) this.f93918d).size() <= 0) {
                Log.m105918d("MicroMsg.WxaUpdateableMsgService", "sGetUpdatableMsgWorkerMap is empty, not sendUpdatableMsgRequest");
            } else {
                long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
                Iterator it = ((ConcurrentHashMap) this.f93918d).values().iterator();
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C34988a aVar = (C34988a) it.next();
                    if (aVar.mo59815c()) {
                        j = 0;
                        z = true;
                        break;
                    }
                    int i = aVar.f93913c;
                    if (i >= 0) {
                        j = Math.min((long) i, j);
                        z = true;
                    }
                }
                Log.m105919d("MicroMsg.WxaUpdateableMsgService", "needUpdate:%b minDelayTime:%d", Boolean.valueOf(z), Long.valueOf(j));
                if (z) {
                    C86709a0.m107525e().postToWorkerDelayed(this.f93920f, j * 1000);
                }
            }
        }
    }

    /* renamed from: Ag */
    public C37702d mo59335Ag(String str) {
        C81161g2.requireAccountInitializedOnDemand();
        C37703e eVar = C81161g2.f238477p;
        if (eVar == null) {
            Log.m105920e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null");
            return null;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WxaUpdateableMsgService", "shareKey is null, return");
            return null;
        } else {
            int hashCode = str.hashCode();
            C37702d dVar = new C37702d();
            dVar.field_shareKeyHash = hashCode;
            if (!eVar.get(dVar, "shareKeyHash")) {
                Log.m105920e("MicroMsg.WxaUpdateableMsgStorage", "WxaUpdateableMsg is null");
                dVar = null;
            }
            if (dVar == null) {
                Log.m105921e("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, wxaUpdateableMsg is null", str, Integer.valueOf(str.hashCode()));
                return null;
            }
            Log.m105919d("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d status:%s", str, Integer.valueOf(str.hashCode()), Integer.valueOf(dVar.field_btnState));
            return dVar;
        }
    }

    public void Du0() {
        Log.m105924i("MicroMsg.WxaUpdateableMsgService", "startUpdatbleMsgInfoChange");
        C34989b bVar = C34989b.INSTANCE;
        synchronized (bVar) {
            bVar.f93919e.set(false);
            bVar.mo59816a();
        }
    }

    /* renamed from: HJ */
    public synchronized void mo59337HJ(String str) {
        Log.m105925i("MicroMsg.WxaUpdateableMsgService", "removeOnUpdatbleMsgInfoChange token:%s", str);
        List<C34988a> list = (List) ((HashMap) f93910e).get(str);
        if (list == null) {
            Log.m105928w("MicroMsg.WxaUpdateableMsgService", "[removeOnUpdatbleMsgInfoChange]getUpdatableMsgWorkers is null, err");
            return;
        }
        for (C34988a b : list) {
            b.mo59814b();
        }
        ((HashMap) f93910e).remove(str);
    }

    /* renamed from: KN */
    public void mo59338KN() {
        Log.m105924i("MicroMsg.WxaUpdateableMsgService", "stopOnUpdatbleMsgInfoChange");
        C34989b bVar = C34989b.INSTANCE;
        synchronized (bVar) {
            bVar.f93919e.set(true);
        }
    }

    public synchronized void c60(String str, String str2, String str3, int i, C33865k.C33866a aVar) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            if (!Util.isNullOrNil(str3)) {
                List list = (List) ((HashMap) f93910e).get(str);
                if (list == null) {
                    Log.m105925i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatbleMsgInfoChange token:%s", str);
                    list = new ArrayList();
                    ((HashMap) f93910e).put(str, list);
                }
                Log.m105925i("MicroMsg.WxaUpdateableMsgService", "addOnUpdatbleMsgInfoChange shareKeyHash:%d", Integer.valueOf(str3.hashCode()));
                Log.m105919d("MicroMsg.WxaUpdateableMsgService", "addOnUpdatbleMsgInfoChange shareKey:%s", str3);
                C34988a aVar2 = new C34988a();
                aVar2.f93911a = str2;
                aVar2.f93912b = str3;
                aVar2.f93913c = i;
                aVar2.f93915e = aVar;
                aVar2.mo59813a();
                list.add(aVar2);
                return;
            }
        }
        Log.m105920e("MicroMsg.WxaUpdateableMsgService", "token appId or shareKey is null, return");
    }

    /* renamed from: sd */
    public void mo59340sd(Context context) {
    }

    /* renamed from: tE */
    public boolean mo59341tE(String str, int i) {
        boolean z;
        C33865k.C33867b bVar;
        C81161g2.requireAccountInitializedOnDemand();
        C37703e eVar = C81161g2.f238477p;
        if (eVar == null) {
            Log.m105920e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null, err");
            return false;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WxaUpdateableMsgStorage", "shareKey is null, err");
            z = false;
        } else {
            C37702d dVar = new C37702d();
            dVar.field_shareKeyHash = str.hashCode();
            boolean z2 = eVar.get(dVar, new String[0]);
            dVar.field_btnState = i;
            z = z2 ? eVar.update(dVar, new String[0]) : eVar.insert(dVar);
        }
        Log.m105919d("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, btnState:%d isOk:%b", str, Integer.valueOf(str.hashCode()), Integer.valueOf(i), Boolean.valueOf(z));
        if (z && (bVar = (C33865k.C33867b) ((HashMap) f93909d).get(str)) != null) {
            bVar.mo59344a(str, i);
        }
        return z;
    }

    /* renamed from: x7 */
    public boolean mo59342x7(String str, String str2, String str3, int i, int i2) {
        boolean z;
        C81161g2.requireAccountInitializedOnDemand();
        C37703e eVar = C81161g2.f238477p;
        if (eVar == null) {
            Log.m105920e("MicroMsg.WxaUpdateableMsgService", "wxaUpdateableMsgStorage is null, err");
            return false;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WxaUpdateableMsgStorage", "shareKey is null, err");
            z = false;
        } else {
            C37702d dVar = new C37702d();
            dVar.field_shareKeyHash = str.hashCode();
            boolean z2 = eVar.get(dVar, new String[0]);
            dVar.field_updatePeroid = i;
            dVar.field_msgState = i2;
            dVar.field_content = str2;
            dVar.field_contentColor = str3;
            z = z2 ? eVar.update(dVar, new String[0]) : eVar.insert(dVar);
        }
        Log.m105919d("MicroMsg.WxaUpdateableMsgService", "shareKey:%s, shareKeyHash:%d, content:%s contentColor:%s isOk:%b", str, Integer.valueOf(str.hashCode()), str2, str3, Boolean.valueOf(z));
        return z;
    }
}
