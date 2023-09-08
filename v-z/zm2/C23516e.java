package zm2;

import android.app.ProgressDialog;
import com.tencent.p014mm.autogen.events.ResetBadgeCountEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import eb0.C31447a4;
import eb0.C31543z5;
import eb0.C75589l0;
import eb0.C97629n2;
import eb0.z3$$a;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75709u0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import p154fy.C87121j;
import p248ug.C65347o0;
import tm2.C14049d;
import zt3.C119157j;

/* renamed from: zm2.e */
public class C23516e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23519f f67451d;

    /* renamed from: zm2.e$a */
    public class C23517a implements C97629n2.C97630a {
        public C23517a() {
        }

        /* renamed from: a */
        public void mo24601a(int i, int i2) {
        }

        /* renamed from: b */
        public void mo24602b(boolean z) {
            ProgressDialog progressDialog = C23516e.this.f67451d.f67455b;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C23516e.this.f67451d.f67455b = null;
            }
            new ResetBadgeCountEvent().publish();
        }
    }

    /* renamed from: zm2.e$b */
    public class C23518b implements z3$$g {
        public C23518b() {
        }

        /* renamed from: b */
        public boolean mo24603b() {
            return C23516e.this.f67451d.f67456c;
        }

        /* renamed from: c */
        public void mo24604c() {
            ProgressDialog progressDialog = C23516e.this.f67451d.f67455b;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C23516e.this.f67451d.f67455b = null;
            }
            new ResetBadgeCountEvent().publish();
        }
    }

    public C23516e(C23519f fVar) {
        this.f67451d = fVar;
    }

    public void run() {
        List<String> F = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69735F((List<String>) null);
        ArrayList arrayList = (ArrayList) F;
        if (arrayList.size() > 0) {
            List<Boolean> e = C75589l0.m90739e(F);
            if (e != null) {
                int i = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) e;
                    if (i >= arrayList2.size()) {
                        break;
                    }
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        C14049d.m13402a().ko0((String) arrayList.get(i));
                    }
                    i++;
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Log.m105925i("MicroMsg.SettingChattingResetHelper", "doResetChatHistory >> delete history: %s", arrayList.get(i2));
                ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG((String) arrayList.get(i2));
            }
        }
        ((C75709u0) C86312j.m106911c(C75709u0.class)).mo59208rI();
        if (WeChatEnvironment.hasDebugger() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_sync_delete_message", "0").equals("1")) {
            C23517a aVar = new C23517a();
            CancellationSignal cancellationSignal = this.f67451d.f67457d;
            long c = C31543z5.m39453c();
            ((C119157j) C119157j.f356862d).mo183875f(new z3$$a(aVar, c, cancellationSignal));
        } else {
            ThreadPool.post(new C31447a4(C31543z5.m39453c(), new C23518b()), "deleteAllMsg");
        }
        ((C87121j) C86312j.m106911c(C87121j.class)).de0(9, "clearAllMsg", "" + (System.currentTimeMillis() / 1000));
    }
}
