package il3;

import com.tencent.p014mm.p136ui.conversation.C74695j1;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;
import zt3.C119157j;

/* renamed from: il3.a */
public class C21106a extends C74695j1 {

    /* renamed from: a */
    public final /* synthetic */ C72976h2 f59677a;

    /* renamed from: b */
    public final /* synthetic */ boolean f59678b;

    /* renamed from: il3.a$a */
    public class C21107a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f59679d;

        public C21107a(long j) {
            this.f59679d = j;
        }

        public void run() {
            Class cls = C75700k0.class;
            C72976h2 h2Var = C21106a.this.f59677a;
            if (h2Var != null) {
                h2Var.mo108793N2(this.f59679d);
                if (C21106a.this.f59678b) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(C21106a.this.f59677a, "conversationboxservice");
                    return;
                }
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(C21106a.this.f59677a);
            }
        }
    }

    public C21106a(C46277b bVar, C72976h2 h2Var, boolean z) {
        this.f59677a = h2Var;
        this.f59678b = z;
    }

    /* renamed from: b */
    public void mo32880b(long j) {
        ((C119157j) C119157j.f356862d).mo183876g(new C21107a(j), "refresh_box_conv_time");
    }
}
