package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.List;
import java.util.Map;
import p248ug.C52558c;
import rb0.C47976j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.contact.t0 */
public class C74562t0 extends LinearLayout implements C47976j.C47978b {

    /* renamed from: d */
    public Context f219171d;

    /* renamed from: e */
    public LinearLayout f219172e = null;

    /* renamed from: f */
    public List<String> f219173f;

    /* renamed from: g */
    public Map<String, View> f219174g;

    /* renamed from: h */
    public List<String> f219175h;

    /* renamed from: i */
    public C74564b f219176i;

    /* renamed from: com.tencent.mm.ui.contact.t0$a */
    public class C74563a implements Runnable {
        public C74563a() {
        }

        public void run() {
            C74562t0 t0Var = C74562t0.this;
            t0Var.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C74558s0(t0Var));
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.t0$b */
    public interface C74564b {
        /* renamed from: a */
        void mo103526a(int i);
    }

    public C74562t0(Context context, C74564b bVar) {
        super(context);
        this.f219171d = context;
        this.f219176i = bVar;
        ((C119157j) C119157j.f356862d).mo183875f(new C74558s0(this));
    }

    public int getEnterpriseFriendCount() {
        List<String> list = this.f219173f;
        if (list == null || this.f219175h == null) {
            return 0;
        }
        return list.size() + this.f219175h.size();
    }

    /* renamed from: m5 */
    public void mo70089m5(C47976j.C47978b.C47980b bVar) {
        C52558c cVar = bVar.f128692c;
        if (cVar != null) {
            if (!cVar.mo72811g1()) {
                Log.m105924i("MicroMsg.EnterpriseBizView", "onEvent, not enterprise father");
            } else {
                MMHandlerThread.postToMainThread(new C74563a());
            }
        }
    }
}
