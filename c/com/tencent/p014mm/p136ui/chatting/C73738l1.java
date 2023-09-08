package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI;
import com.tencent.p014mm.p136ui.chatting.component.C73655y0;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p227rn.C48053v;
import p248ug.C52558c;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48340e;
import se3.C77685c;
import zj3.C79369m;

/* renamed from: com.tencent.mm.ui.chatting.l1 */
public class C73738l1 {

    /* renamed from: a */
    public static C89779i0 f216483a;

    /* renamed from: b */
    public static C73741c f216484b;

    /* renamed from: com.tencent.mm.ui.chatting.l1$a */
    public class C73739a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216485d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f216486e;

        public C73739a(String str, C67391b bVar) {
            this.f216485d = str;
            this.f216486e = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C73738l1.m87335b(this.f216485d, this.f216486e);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l1$b */
    public class C73740b implements C88144b.C76564c {

        /* renamed from: a */
        public final /* synthetic */ C67391b f216487a;

        public C73740b(C67391b bVar) {
            this.f216487a = bVar;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            if (intent == null) {
                Log.m105928w("MicroMsg.ChattingEditModeSendToBrand", "[onActivityResult] data is null!");
            } else if (i == 225) {
                String stringExtra = intent.getStringExtra("enterprise_biz_name");
                long longExtra = intent.getLongExtra("key_biz_chat_id", -1);
                C67391b bVar = this.f216487a;
                Activity f = bVar.mo91565f();
                if (!Util.isNullOrNil(stringExtra) && stringExtra.length() > 0) {
                    C73738l1.f216483a = C76879j.m92723Q(f, f.getString(C0966R.string.a3h), f.getString(C0966R.string.ilt), false, false, (DialogInterface.OnCancelListener) null);
                    C73655y0.f216259q.add(new C73742d(bVar, f, stringExtra, longExtra, C73738l1.f216484b));
                }
                ((C79369m) bVar.f193278b.mo102812a(C79369m.class)).mo102686y3();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l1$c */
    public static class C73741c {

        /* renamed from: a */
        public List<C72963f4> f216488a;

        /* renamed from: b */
        public boolean f216489b;

        /* renamed from: c */
        public String f216490c;

        /* renamed from: d */
        public DoFavoriteEvent f216491d;

        /* renamed from: e */
        public C77685c f216492e;

        /* renamed from: f */
        public boolean f216493f;

        public C73741c(C73717h1 h1Var) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.l1$d */
    public static class C73742d implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public C67391b f216494d;

        /* renamed from: e */
        public Context f216495e;

        /* renamed from: f */
        public String f216496f;

        /* renamed from: g */
        public long f216497g;

        /* renamed from: h */
        public C73741c f216498h;

        /* renamed from: i */
        public boolean f216499i;

        public C73742d(C67391b bVar, Context context, String str, long j, C73741c cVar) {
            this.f216494d = bVar;
            this.f216495e = context;
            this.f216496f = str;
            this.f216497g = j;
            this.f216498h = cVar;
            this.f216499i = ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(str);
        }

        /* renamed from: a */
        public final void mo102808a() {
            for (C72963f4 next : this.f216498h.f216488a) {
                Context context = this.f216495e;
                boolean z = this.f216498h.f216489b;
                String str = this.f216496f;
                if (next.mo100993e4()) {
                    C74343y0.m88754M(context, str, next, z);
                } else if (next.mo100979R3()) {
                    C74343y0.m88752K(context, str, next);
                } else if (next.mo100994f4() && !this.f216499i) {
                    C74343y0.m88755N(context, str, next);
                } else if (next.mo100982U3()) {
                    C74343y0.m88753L(context, str, next, z);
                } else if ((next.mo100973L3() || next.mo101022y3()) && !this.f216499i) {
                    if (!C74343y0.m88747F(next)) {
                        C74343y0.m88751J(context, str, next);
                    }
                } else if (next.mo101020w3() && ((!this.f216499i || C74343y0.m88769m(next)) && !C74343y0.m88770n(next) && next.getType() != 318767153 && !C74343y0.m88782z(next) && !C74343y0.m88742A(next))) {
                    C74343y0.m88749H(context, str, next, z);
                }
            }
        }

        /* renamed from: b */
        public final void mo102809b() {
            Context context = this.f216495e;
            String str = this.f216496f;
            RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
            RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
            aVar.f265029a = 6;
            C73741c cVar = C73738l1.f216484b;
            aVar.f265040l = cVar.f216488a;
            aVar.f265033e = str;
            aVar.f265042n = cVar.f216490c;
            aVar.f265041m = context;
            recordOperationEvent.publish();
            C73741c cVar2 = C73738l1.f216484b;
            RecordOperationEvent.C92552b bVar = recordOperationEvent.f265028e;
            cVar2.f216491d = bVar.f265053f;
            cVar2.f216492e = bVar.f265054g;
            RecordOperationEvent recordOperationEvent2 = new RecordOperationEvent();
            RecordOperationEvent.C92551a aVar2 = recordOperationEvent2.f265027d;
            aVar2.f265029a = 5;
            C73741c cVar3 = this.f216498h;
            aVar2.f265040l = cVar3.f216488a;
            aVar2.f265033e = this.f216496f;
            aVar2.f265042n = cVar3.f216490c;
            aVar2.f265041m = this.f216495e;
            aVar2.f265044p = cVar3.f216491d;
            aVar2.f265045q = cVar3.f216492e;
            recordOperationEvent2.publish();
        }

        public boolean doInBackground() {
            if (this.f216499i) {
                C48334c a0 = C48009v0.Ax0().mo73042a0(this.f216497g);
                synchronized (C48340e.f129429d) {
                    String j = C48340e.m53669j();
                    C48340e.m53670k(a0);
                    if (this.f216498h.f216493f) {
                        mo102808a();
                    } else {
                        mo102809b();
                    }
                    C48340e.m53662c(j);
                }
                return true;
            }
            if (this.f216498h.f216493f) {
                mo102808a();
            } else {
                mo102809b();
            }
            return true;
        }

        public boolean onPostExecute() {
            C89779i0 i0Var = C73738l1.f216483a;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C75026b.m89952b(this.f216495e, this.f216494d.mo91562c(C0966R.C0970id.f358753gv2), this.f216495e.getString(C0966R.string.euo), (C75018a.C75025e) null);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m87334a(java.lang.String r7, ck3.C67391b r8, java.util.List<com.tencent.p014mm.storage.C72963f4> r9) {
        /*
            android.app.Activity r0 = r8.mo91565f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            ug.c r1 = rb0.C47984k.m53328b(r7)
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            boolean r1 = r1.mo73501s2()
            com.tencent.mm.ui.chatting.l1$c r2 = f216484b
            boolean r2 = r2.f216493f
            r3 = 0
            if (r2 == 0) goto L_0x0080
            boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88777u(r9)
            if (r1 == 0) goto L_0x0076
            r1 = 1
            if (r9 == 0) goto L_0x005a
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0029
            goto L_0x005a
        L_0x0029:
            java.util.Iterator r4 = r9.iterator()
        L_0x002d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0058
            java.lang.Object r5 = r4.next()
            com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
            boolean r6 = r5.mo100993e4()
            if (r6 != 0) goto L_0x002d
            boolean r6 = r5.mo100995g4()
            if (r6 != 0) goto L_0x002d
            boolean r6 = r5.mo100979R3()
            if (r6 != 0) goto L_0x002d
            boolean r6 = r5.mo100982U3()
            if (r6 != 0) goto L_0x002d
            boolean r5 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88769m(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x0061
        L_0x0058:
            r1 = 0
            goto L_0x0061
        L_0x005a:
            java.lang.String r4 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r5 = "check contain invalid send to bizchat msg error, selected item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
        L_0x0061:
            com.tencent.mm.ui.chatting.l1$c r4 = f216484b
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>(r9)
            r4.f216488a = r5
            if (r2 != 0) goto L_0x006e
            if (r1 == 0) goto L_0x0080
        L_0x006e:
            r9 = 2131825156(0x7f111204, float:1.928316E38)
            java.lang.String r9 = r0.getString(r9)
            goto L_0x0081
        L_0x0076:
            if (r2 == 0) goto L_0x0080
            r9 = 2131825157(0x7f111205, float:1.9283162E38)
            java.lang.String r9 = r0.getString(r9)
            goto L_0x0081
        L_0x0080:
            r9 = r3
        L_0x0081:
            if (r9 == 0) goto L_0x008e
            com.tencent.mm.ui.chatting.l1$a r1 = new com.tencent.mm.ui.chatting.l1$a
            r1.<init>(r7, r8)
            java.lang.String r7 = ""
            nj3.C76879j.m92750u(r0, r9, r7, r1, r3)
            goto L_0x0091
        L_0x008e:
            m87335b(r7, r8)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73738l1.m87334a(java.lang.String, ck3.b, java.util.List):void");
    }

    /* renamed from: b */
    public static void m87335b(String str, C67391b bVar) {
        C52558c b = C47984k.m53328b(str);
        if (b != null) {
            if (b.mo73501s2()) {
                Intent intent = new Intent(bVar.mo91565f(), BizChatSelectConversationUI.class);
                intent.putExtra("enterprise_biz_name", str);
                intent.putExtra("biz_chat_scene", 2);
                intent.putExtra("enterprise_extra_params", f216484b.f216493f);
                bVar.mo91557R(intent, 225, new C73740b(bVar));
            } else if (b.mo72811g1()) {
                Intent intent2 = new Intent();
                intent2.putExtra("enterprise_biz_name", str);
                intent2.putExtra("enterprise_scene", 1);
                C88144b.m109797o(bVar.f193286j, "brandservice", ".ui.EnterpriseBizContactPlainListUI", intent2, 225);
            }
        }
    }
}
