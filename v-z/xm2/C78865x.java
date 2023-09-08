package xm2;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kv1.C99260q;
import lv1.C76728k;
import xm2.C78858a0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: xm2.x */
public class C78865x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C78858a0 f231711d;

    public C78865x(C78858a0 a0Var) {
        this.f231711d = a0Var;
    }

    public void run() {
        C78858a0 a0Var = this.f231711d;
        a0Var.getClass();
        Class cls = C75700k0.class;
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni();
        ArrayList arrayList = new ArrayList();
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("filehelper");
        arrayList.add("helper_entry");
        arrayList.add(C75592q0.m90789s());
        C44665r4 jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(cls)).V50()).mo69821jo("@t.qq.com");
        if (jo != null) {
            arrayList.add(jo.f121095b);
        }
        arrayList.add("blogapp");
        Cursor D3 = Ni.mo69651D3("@all.contact.without.chatroom", (String) null, arrayList, (List<String>) null, false, false);
        if (D3 != null) {
            D3.moveToFirst();
            while (!D3.isAfterLast()) {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(D3);
                linkedList.add(z1Var.getUsername());
                D3.moveToNext();
            }
            D3.close();
        }
        Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[getQuery] cost:%sms list size:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(linkedList.size()));
        if (a0Var.f231682b) {
            C78858a0.C53377b bVar = new C78858a0.C53377b(a0Var.f231692l, a0Var.f231684d);
            a0Var.f231691k = bVar;
            bVar.f150195g = System.currentTimeMillis();
            C86709a0.m107524d().mo123455a(JsApiSetAudioState.CTRL_INDEX, bVar);
            GetSnsTagListEvent getSnsTagListEvent = new GetSnsTagListEvent();
            getSnsTagListEvent.f9308d.f9309a = 3;
            getSnsTagListEvent.publish();
        }
        if (a0Var.f231681a) {
            HashSet hashSet = new HashSet();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
            long currentTimeMillis2 = System.currentTimeMillis() - 15552000000L;
            Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] timestamp:%s size:%s", Long.valueOf(currentTimeMillis2), Integer.valueOf(hashSet.size()));
            long currentTimeMillis3 = System.currentTimeMillis();
            C76728k kVar = new C76728k();
            kVar.f224467b = 9;
            kVar.f224468c = String.valueOf(currentTimeMillis2);
            kVar.f224478m = new C78869z(a0Var, hashSet, currentTimeMillis2, currentTimeMillis3);
            kVar.f224479n = a0Var.f231685e;
            ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
        }
        if (a0Var.f231683c) {
            a0Var.mo108883a(linkedList, 0);
        }
        C119179t tVar = C119157j.f356862d;
        C78866y yVar = new C78866y(a0Var);
        a0Var.f231694n = yVar;
        ((C119157j) tVar).mo183875f(yVar);
    }
}
