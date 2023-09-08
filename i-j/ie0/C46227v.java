package ie0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ie0.v */
public final class C46227v implements Runnable {

    /* renamed from: d */
    public static final C46227v f124611d = new C46227v();

    /* renamed from: ie0.v$a */
    public static final class C46228a implements z3$$g {
        /* renamed from: b */
        public boolean mo24603b() {
            return false;
        }

        /* renamed from: c */
        public void mo24604c() {
        }
    }

    public final void run() {
        Class cls = C75700k0.class;
        Cursor I = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69738I(6, (List<String>) null, "opencustomerservicemsg", -1);
        if (I != null) {
            LinkedList<String> linkedList = new LinkedList<>();
            if (I.moveToFirst()) {
                do {
                    C72976h2 h2Var = new C72976h2();
                    h2Var.convertFrom(I);
                    String username = h2Var.getUsername();
                    if (!(username == null || username.length() == 0)) {
                        linkedList.add(h2Var.getUsername());
                    }
                    if (!I.moveToNext()) {
                        break;
                    }
                } while (I.isAfterLast());
            }
            I.close();
            Log.m105925i("MicroMsg.OpenIMKefuConversationLogic", "alvinluo deleteAllOpenImKefuConversation conversation list size: %s", Integer.valueOf(linkedList.size()));
            for (String h : linkedList) {
                C75604z3.m90836h(h, new C46228a());
            }
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69767h(linkedList);
        }
    }
}
