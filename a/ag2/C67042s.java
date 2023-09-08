package ag2;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sf0.C77691f;
import zf2.C53779k;

/* renamed from: ag2.s */
public class C67042s {

    /* renamed from: a */
    public long f192587a;

    /* renamed from: b */
    public C0043t f192588b;

    /* renamed from: c */
    public List<C67044b> f192589c;

    /* renamed from: d */
    public int f192590d = 1;

    /* renamed from: e */
    public int f192591e = 2;

    /* renamed from: f */
    public int f192592f = 0;

    /* renamed from: ag2.s$a */
    public class C67043a implements C1256g<Bundle> {
        public C67043a() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            LinkedList b = C67042s.this.f192588b.mo73082b();
            if (b == null) {
                b = new LinkedList();
            }
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList("sync_add_list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                for (Bundle bundle2 : parcelableArrayList) {
                    C67038p pVar = new C67038p();
                    pVar.f192575e = bundle2.getString(FirebaseAnalytics.C113379b.ITEM_NAME);
                    String string = bundle2.getString("item_addr");
                    pVar.f192576f = string;
                    if (!Util.isNullOrNil(string)) {
                        pVar.f192574d = pVar.f192576f.hashCode();
                    }
                    pVar.f192578h = C77691f.m93686a(pVar.f192575e);
                    C67045y0 y0Var = new C67045y0(pVar);
                    if (!b.contains(y0Var)) {
                        b.add(y0Var);
                        Log.m105925i("MicroMsg.Plugin.MailAddrMgr", "add contact (%s,%s)", pVar.f192576f, pVar.f192575e);
                    }
                }
            }
            ArrayList<Bundle> parcelableArrayList2 = bundle.getParcelableArrayList("sync_update_list");
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                for (Bundle bundle3 : parcelableArrayList2) {
                    C67038p pVar2 = new C67038p();
                    pVar2.f192575e = bundle3.getString(FirebaseAnalytics.C113379b.ITEM_NAME);
                    String string2 = bundle3.getString("item_addr");
                    pVar2.f192576f = string2;
                    if (!Util.isNullOrNil(string2)) {
                        pVar2.f192574d = pVar2.f192576f.hashCode();
                    }
                    pVar2.f192578h = C77691f.m93686a(pVar2.f192575e);
                    C67045y0 y0Var2 = new C67045y0(pVar2);
                    int indexOf = b.indexOf(y0Var2);
                    if (indexOf != -1) {
                        b.set(indexOf, y0Var2);
                        Log.m105925i("MicroMsg.Plugin.MailAddrMgr", "update contact (%s,%s)", pVar2.f192576f, pVar2.f192575e);
                    }
                }
            }
            ArrayList<Bundle> parcelableArrayList3 = bundle.getParcelableArrayList("sync_delete_list");
            if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
                for (Bundle bundle4 : parcelableArrayList3) {
                    C67038p pVar3 = new C67038p();
                    pVar3.f192575e = bundle4.getString(FirebaseAnalytics.C113379b.ITEM_NAME);
                    String string3 = bundle4.getString("item_addr");
                    pVar3.f192576f = string3;
                    if (!Util.isNullOrNil(string3)) {
                        pVar3.f192574d = pVar3.f192576f.hashCode();
                    }
                    pVar3.f192578h = C77691f.m93686a(pVar3.f192575e);
                    b.remove(new C67045y0(pVar3));
                    Log.m105925i("MicroMsg.Plugin.MailAddrMgr", "delete contact (%s,%s)", pVar3.f192576f, pVar3.f192575e);
                }
            }
            C67042s.this.f192588b.mo73083c(b);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_XMAIL_SYNC_CONTACT_KEY_LONG_SYNC, Long.valueOf(bundle.getLong("last_sync_key")));
            C67042s sVar = C67042s.this;
            sVar.f192592f = sVar.f192591e;
            MMHandlerThread.postToMainThread(new C67041r(this));
        }
    }

    /* renamed from: ag2.s$b */
    public static abstract class C67044b {
        /* renamed from: a */
        public abstract void mo91029a();
    }

    public C67042s(String str) {
        this.f192588b = new C0043t(str);
        this.f192589c = new ArrayList();
    }

    /* renamed from: a */
    public static char m79223a(C67042s sVar, String str) {
        sVar.getClass();
        if (Util.isNullOrNil(str)) {
            return '~';
        }
        return str.charAt(0);
    }

    /* renamed from: b */
    public void mo91023b(C67044b bVar) {
        Iterator it = ((ArrayList) this.f192589c).iterator();
        while (it.hasNext()) {
            if (((C67044b) it.next()) == bVar) {
                return;
            }
        }
        ((ArrayList) this.f192589c).add(bVar);
    }

    /* renamed from: c */
    public void mo91024c(List<C67038p> list) {
        LinkedList b = this.f192588b.mo73082b();
        for (C67038p y0Var : list) {
            int indexOf = b.indexOf(new C67045y0(y0Var));
            if (indexOf != -1) {
                ((C67045y0) b.get(indexOf)).f192577g++;
            }
        }
        this.f192588b.mo73083c(b);
    }

    /* renamed from: d */
    public void mo91025d() {
        if (this.f192592f != this.f192590d) {
            if (Util.nowMilliSecond() - this.f192587a <= 600000) {
                Iterator it = ((ArrayList) this.f192589c).iterator();
                while (it.hasNext()) {
                    ((C67044b) it.next()).mo91029a();
                }
                return;
            }
            this.f192592f = this.f192590d;
            this.f192587a = Util.nowMilliSecond();
            C80907o.m98781d(MMApplicationContext.getPackageName(), new IPCVoid(), C53779k.class, new C67043a());
        }
    }

    /* renamed from: e */
    public List<C67038p> mo91026e(String str) {
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        LinkedList b = this.f192588b.mo73082b();
        if (b != null) {
            arrayList.addAll(b);
        }
        if (this.f192592f == 0) {
            mo91025d();
        }
        Collections.sort(arrayList, new C67040q(this));
        if (str == null || str.length() == 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C67038p pVar = (C67038p) it.next();
            if (pVar != null && (((str2 = pVar.f192575e) != null && str2.contains(str)) || (((str3 = pVar.f192578h) != null && str3.contains(str)) || ((str4 = pVar.f192576f) != null && str4.contains(str))))) {
                arrayList2.add(pVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: f */
    public void mo91027f(C67044b bVar) {
        Iterator it = ((ArrayList) this.f192589c).iterator();
        while (it.hasNext()) {
            C67044b bVar2 = (C67044b) it.next();
            if (bVar2 == bVar) {
                ((ArrayList) this.f192589c).remove(bVar2);
                return;
            }
        }
    }

    public void finalize() {
        ((ArrayList) this.f192589c).clear();
    }
}
