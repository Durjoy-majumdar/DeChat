package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.os.SystemClock;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNotHookReceiveUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C45628s0;
import f32.C75676e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.UUID;
import lu3.C88654b;
import p270xi.C53356d;
import p287zz.C79442f;
import te3.C48685aa2;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.component.b4 */
public class C73433b4 extends C73412a implements C53356d {

    /* renamed from: e */
    public C73435b f215807e;

    /* renamed from: com.tencent.mm.ui.chatting.component.b4$a */
    public class C73434a implements C79442f.C79443a {
        public C73434a() {
        }

        public void onCompletion() {
            C73433b4 b4Var = C73433b4.this;
            b4Var.f215807e = new C73435b();
            ((C119157j) C119157j.f356862d).mo183869C(C73433b4.this.f215807e, 1500);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.b4$b */
    public class C73435b extends C88654b {

        /* renamed from: com.tencent.mm.ui.chatting.component.b4$b$a */
        public class C73436a implements Runnable {
            public C73436a() {
            }

            public void run() {
                C72963f4 item;
                WeakReference<Activity> g = AppForegroundDelegate.m161224g();
                if (g != null && g.get() != null && (g.get() instanceof ChattingUI)) {
                    Log.m105924i("RedPacketPreviewComponent", "show preview");
                    C79368l V = C73433b4.this.f215752d.f193286j.mo102028V();
                    if (V.getCount() != 0 && (item = V.getItem(0)) != null) {
                        C74090l0.C74093c.m88130o0(C73433b4.this.f215752d, item);
                    }
                }
            }
        }

        public C73435b() {
        }

        public String getKey() {
            return "RedPacketPreviewCancelRunnable";
        }

        public void run() {
            ((C119157j) C119157j.f356862d).mo183895z(new C73436a());
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        if (C45628s0.m50742G(this.f215752d.mo91577r())) {
            ((C79442f) C86312j.m106911c(C79442f.class)).mo109164Y9(this.f215752d.mo91565f(), (HashMap) this.f215752d.mo91565f().getIntent().getSerializableExtra("key_red_packet_preview_extraInfo"), new C73434a());
            C75676e.f222284a = UUID.randomUUID().toString();
            C75676e.f222285b = SystemClock.elapsedRealtime() / 1000;
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        ((C79442f) C86312j.m106911c(C79442f.class)).mo109165Z4();
        C75676e.m90932a(3);
        C75676e.f222284a = null;
        C75676e.f222286c = null;
        C75676e.f222285b = -1;
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        ((C79442f) C86312j.m106911c(C79442f.class)).mo109165Z4();
        C75676e.m90932a(3);
        C75676e.f222284a = null;
        C75676e.f222286c = null;
        C75676e.f222285b = -1;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105924i("RedPacketPreviewComponent", "onChattingExitAnimStart");
        C73435b bVar = this.f215807e;
        if (bVar != null) {
            bVar.mo97819a();
            WeakReference<Activity> g = AppForegroundDelegate.m161224g();
            if (g != null && g.get() != null && g.get() != null) {
                try {
                    Class<?> cls = g.get().getClass();
                    Class<LuckyMoneyNotHookReceiveUI> cls2 = LuckyMoneyNotHookReceiveUI.class;
                    HashMap<String, C48685aa2> hashMap = LuckyMoneyNotHookReceiveUI.f200395b1;
                    if (cls == cls2) {
                        g.get().finish();
                    }
                } catch (ClassNotFoundException unused) {
                    Log.m105924i("RedPacketPreviewComponent", "onChattingExitAnimStart throw exception");
                }
            }
        }
    }
}
