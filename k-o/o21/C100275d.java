package o21;

import android.os.Message;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import kd0.C99125s;
import nj3.C76879j;
import p206nj.C100115c;
import p21.C100631p;
import p375qh.C101196q;
import p492dn.C97498p;
import p492dn.C97501r;
import p910lj.C76701a;
import q21.C100974a;
import t21.C101712a;
import x21.C102538a;
import x21.C102547b;
import x21.C102548c;

/* renamed from: o21.d */
public class C100275d {

    /* renamed from: q */
    public static C100275d f293766q;

    /* renamed from: a */
    public boolean f293767a;

    /* renamed from: b */
    public long f293768b;

    /* renamed from: c */
    public long f293769c;

    /* renamed from: d */
    public boolean f293770d;

    /* renamed from: e */
    public long f293771e = -1;

    /* renamed from: f */
    public Toast f293772f;

    /* renamed from: g */
    public C100115c f293773g = new C100115c(MMApplicationContext.getContext());

    /* renamed from: h */
    public C97498p f293774h;

    /* renamed from: i */
    public C97501r f293775i;

    /* renamed from: j */
    public String f293776j = "";

    /* renamed from: k */
    public String f293777k = "";

    /* renamed from: l */
    public C100974a f293778l;

    /* renamed from: m */
    public C100631p f293779m = null;

    /* renamed from: n */
    public final MMHandler f293780n = new C100276a();

    /* renamed from: o */
    public final MMHandler f293781o = new C100277b();

    /* renamed from: p */
    public final MTimerHandler f293782p = new MTimerHandler(new C100278c(), true);

    /* renamed from: o21.d$a */
    public class C100276a extends MMHandler {
        public C100276a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C100275d.this.f293767a = false;
        }
    }

    /* renamed from: o21.d$b */
    public class C100277b extends MMHandler {
        public C100277b() {
        }

        public void handleMessage(Message message) {
            if (C100275d.this.f293779m.f294831x.booleanValue()) {
                C102538a aVar = (C102538a) C100275d.this.f293778l;
                C76879j.m92714H(aVar.f301916g.getContext(), aVar.f301916g.getContext().getString(C0966R.string.hut), "", true, new C102547b(aVar), new C102548c(aVar));
                C100275d.this.f293779m.f294831x = Boolean.FALSE;
            }
            C100275d dVar = C100275d.this;
            C100631p pVar = dVar.f293779m;
            long j = dVar.f293768b;
            long j2 = 0;
            if (j != 0) {
                j2 = Util.ticksToNow(j);
            }
            pVar.f294824t = (int) C93088r.m117440j(j2);
            sendEmptyMessageDelayed(4096, 250);
        }
    }

    /* renamed from: o21.d$c */
    public class C100278c implements MTimerHandler.CallBack {
        public C100278c() {
        }

        public boolean onTimerExpired() {
            C100275d dVar = C100275d.this;
            if (dVar.f293771e == -1) {
                dVar.f293771e = Util.currentTicks();
            }
            long ticksToNow = Util.ticksToNow(C100275d.this.f293771e);
            if (ticksToNow >= 3590000 && ticksToNow <= 3600000) {
                C100275d dVar2 = C100275d.this;
                Toast toast = dVar2.f293772f;
                if (toast == null) {
                    dVar2.f293772f = C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.cmu, new Object[]{Integer.valueOf((int) ((3600000 - ticksToNow) / 1000))}), 0);
                } else {
                    toast.setText(MMApplicationContext.getContext().getString(C0966R.string.cmu, new Object[]{Integer.valueOf((int) ((3600000 - ticksToNow) / 1000))}));
                }
                C100275d.this.f293772f.show();
            }
            if (ticksToNow < 3600000) {
                return true;
            }
            Log.m105926v("MicroMsg.EditorVoiceLogic", "record stop on countdown");
            C100275d dVar3 = C100275d.this;
            dVar3.f293770d = true;
            dVar3.mo139542b();
            C100974a aVar = C100275d.this.f293778l;
            if (aVar != null) {
                ((C102538a) aVar).mo142159d((C101712a) null);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static C100275d m131079a() {
        if (f293766q == null) {
            f293766q = new C100275d();
        }
        return f293766q;
    }

    /* renamed from: b */
    public final void mo139542b() {
        if (this.f293767a) {
            this.f293781o.removeMessages(4096);
            if (this.f293776j.equals("speex")) {
                ((C99125s) this.f293775i).stopRecord();
            } else {
                ((C101196q) this.f293774h).mo140642b();
            }
            C100115c cVar = this.f293773g;
            if (cVar != null) {
                cVar.mo139414a();
            }
            long j = this.f293768b;
            long j2 = 0;
            if (j != 0) {
                j2 = Util.ticksToNow(j);
            }
            this.f293769c = j2;
            boolean z = j2 < 800;
            this.f293782p.stopTimer();
            if (!z) {
                long j3 = this.f293769c / 1000;
            } else {
                C86009m1 m1Var = new C86009m1(this.f293777k);
                if (m1Var.mo119967g()) {
                    m1Var.mo119966f();
                }
                this.f293780n.sendEmptyMessageDelayed(0, 500);
            }
            this.f293767a = false;
        }
    }
}
