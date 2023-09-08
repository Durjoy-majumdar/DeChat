package wa3;

import ab3.C91983a;
import android.os.Message;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96728e0;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96742s;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96743t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import kd0.C99125s;
import nj3.C76879j;
import p206nj.C100115c;
import p375qh.C101196q;
import p910lj.C76701a;
import qd0.C101121a;
import xa3.C102596l;
import ya3.C102830a;

/* renamed from: wa3.p */
public class C102378p {

    /* renamed from: q */
    public static C102378p f301520q;

    /* renamed from: a */
    public boolean f301521a;

    /* renamed from: b */
    public long f301522b;

    /* renamed from: c */
    public long f301523c;

    /* renamed from: d */
    public boolean f301524d;

    /* renamed from: e */
    public long f301525e = -1;

    /* renamed from: f */
    public Toast f301526f;

    /* renamed from: g */
    public C100115c f301527g = new C100115c(MMApplicationContext.getContext());

    /* renamed from: h */
    public C101196q f301528h;

    /* renamed from: i */
    public C99125s f301529i;

    /* renamed from: j */
    public String f301530j = "";

    /* renamed from: k */
    public String f301531k = "";

    /* renamed from: l */
    public C102830a f301532l;

    /* renamed from: m */
    public C102596l f301533m = null;

    /* renamed from: n */
    public final MMHandler f301534n = new C102379a();

    /* renamed from: o */
    public final MMHandler f301535o = new C102380b();

    /* renamed from: p */
    public final MTimerHandler f301536p = new MTimerHandler(new C102381c(), true);

    /* renamed from: wa3.p$a */
    public class C102379a extends MMHandler {
        public C102379a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C102378p.this.f301521a = false;
        }
    }

    /* renamed from: wa3.p$b */
    public class C102380b extends MMHandler {
        public C102380b() {
        }

        public void handleMessage(Message message) {
            if (C102378p.this.f301533m.f302089z.booleanValue()) {
                C96728e0 e0Var = (C96728e0) C102378p.this.f301532l;
                C76879j.m92714H(e0Var.f283359g.getContext(), e0Var.f283359g.getContext().getString(C0966R.string.h_o), "", true, new C96742s(e0Var), new C96743t(e0Var));
                C102378p.this.f301533m.f302089z = Boolean.FALSE;
            }
            C102378p pVar = C102378p.this;
            C102596l lVar = pVar.f301533m;
            long j = pVar.f301522b;
            long j2 = 0;
            if (j != 0) {
                j2 = Util.ticksToNow(j);
            }
            lVar.f302131t = (int) C101121a.m132521a(j2);
            sendEmptyMessageDelayed(4096, 250);
        }
    }

    /* renamed from: wa3.p$c */
    public class C102381c implements MTimerHandler.CallBack {
        public C102381c() {
        }

        public boolean onTimerExpired() {
            C102378p pVar = C102378p.this;
            if (pVar.f301525e == -1) {
                pVar.f301525e = Util.currentTicks();
            }
            long ticksToNow = Util.ticksToNow(C102378p.this.f301525e);
            if (ticksToNow >= 3590000 && ticksToNow <= 3600000) {
                C102378p pVar2 = C102378p.this;
                Toast toast = pVar2.f301526f;
                if (toast == null) {
                    pVar2.f301526f = C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.cmu, new Object[]{Integer.valueOf((int) ((3600000 - ticksToNow) / 1000))}), 0);
                } else {
                    toast.setText(MMApplicationContext.getContext().getString(C0966R.string.cmu, new Object[]{Integer.valueOf((int) ((3600000 - ticksToNow) / 1000))}));
                }
                C102378p.this.f301526f.show();
            }
            if (ticksToNow < 3600000) {
                return true;
            }
            Log.m105926v("MicroMsg.WNNoteVoiceLogic", "record stop on countdown");
            C102378p pVar3 = C102378p.this;
            pVar3.f301524d = true;
            pVar3.mo141967b();
            C102830a aVar = C102378p.this.f301532l;
            if (aVar != null) {
                ((C96728e0) aVar).mo134989c((C91983a) null);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static C102378p m135106a() {
        if (f301520q == null) {
            f301520q = new C102378p();
        }
        return f301520q;
    }

    /* renamed from: b */
    public final void mo141967b() {
        if (this.f301521a) {
            this.f301535o.removeMessages(4096);
            if (this.f301530j.equals("speex")) {
                this.f301529i.stopRecord();
            } else {
                this.f301528h.mo140642b();
            }
            C100115c cVar = this.f301527g;
            if (cVar != null) {
                cVar.mo139414a();
            }
            long j = this.f301522b;
            long j2 = 0;
            if (j != 0) {
                j2 = Util.ticksToNow(j);
            }
            this.f301523c = j2;
            boolean z = j2 < 800;
            this.f301536p.stopTimer();
            if (!z) {
                long j3 = this.f301523c / 1000;
            } else {
                C86009m1 m1Var = new C86009m1(this.f301531k);
                if (m1Var.mo119967g()) {
                    m1Var.mo119966f();
                }
                this.f301534n.sendEmptyMessageDelayed(0, 500);
            }
            this.f301521a = false;
        }
    }
}
