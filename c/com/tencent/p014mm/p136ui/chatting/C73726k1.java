package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73738l1;
import com.tencent.p014mm.p136ui.chatting.component.C73655y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import java.util.Iterator;
import java.util.List;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.k1 */
public class C73726k1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ List f216473d;

    /* renamed from: e */
    public final /* synthetic */ Context f216474e;

    /* renamed from: f */
    public final /* synthetic */ C67391b f216475f;

    /* renamed from: g */
    public final /* synthetic */ C72996z1 f216476g;

    /* renamed from: h */
    public final /* synthetic */ C73655y0 f216477h;

    /* renamed from: com.tencent.mm.ui.chatting.k1$a */
    public class C73727a implements DialogInterface.OnClickListener {
        public C73727a(C73726k1 k1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$b */
    public class C73728b implements DialogInterface.OnClickListener {
        public C73728b(C73726k1 k1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$c */
    public class C73729c implements DialogInterface.OnClickListener {
        public C73729c(C73726k1 k1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$d */
    public class C73730d implements DialogInterface.OnClickListener {
        public C73730d(C73726k1 k1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$e */
    public class C73731e implements DialogInterface.OnClickListener {
        public C73731e(C73726k1 k1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$f */
    public class C73732f implements DialogInterface.OnClickListener {
        public C73732f(C73726k1 k1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$g */
    public class C73733g implements C11182m0 {
        public C73733g(C73726k1 k1Var) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107125a(0, C0966R.string.f361056gy2);
            e0Var.mo107125a(1, C0966R.string.f361057gy3);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$h */
    public class C73734h implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ String f216478d;

        public C73734h(String str) {
            this.f216478d = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                C73738l1.f216484b.f216493f = true;
                String str = this.f216478d;
                C73726k1 k1Var = C73726k1.this;
                C73738l1.m87334a(str, k1Var.f216475f, k1Var.f216473d);
            } else if (itemId == 1) {
                C73738l1.f216484b.f216493f = false;
                String str2 = this.f216478d;
                C73726k1 k1Var2 = C73726k1.this;
                C73738l1.m87334a(str2, k1Var2.f216475f, k1Var2.f216473d);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.k1$i */
    public class C73735i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MenuItem f216480d;

        public C73735i(MenuItem menuItem) {
            this.f216480d = menuItem;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            List list = C73726k1.this.f216473d;
            boolean z = true;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C72963f4 f4Var = (C72963f4) it.next();
                    if (!C74343y0.m88768l(f4Var)) {
                        if (!f4Var.mo100995g4() && !C74343y0.m88747F(f4Var) && !f4Var.mo100975N3() && !C74343y0.m88742A(f4Var) && !C74343y0.m88746E(f4Var) && f4Var.getType() != -1879048186 && !C74343y0.m88776t(f4Var) && !C74343y0.m88771o(f4Var) && !C74343y0.m88770n(f4Var) && !C74343y0.m88782z(f4Var) && !C74343y0.m88767k(f4Var)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                Log.m105928w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to brand service error, select item empty");
            }
            if (z) {
                Log.m105928w("MicroMsg.ChattingEditModeSendToBrand", "only contain invalid msg, exit long click mode");
                C73655y0 y0Var = C73726k1.this.f216477h;
                if (y0Var != null) {
                    y0Var.mo102686y3();
                    return;
                }
                return;
            }
            Context context = C73726k1.this.f216474e;
            C73738l1.f216483a = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), C73726k1.this.f216474e.getString(C0966R.string.ilt), false, false, (DialogInterface.OnCancelListener) null);
            QueueWorkerThread queueWorkerThread = C73655y0.f216259q;
            C73726k1 k1Var = C73726k1.this;
            C67391b bVar = k1Var.f216475f;
            Context context2 = k1Var.f216474e;
            queueWorkerThread.add(new C73738l1.C73742d(bVar, context2, this.f216480d.getTitle() + "", -1, C73738l1.f216484b));
            C73655y0 y0Var2 = C73726k1.this.f216477h;
            if (y0Var2 != null) {
                y0Var2.mo102686y3();
            }
        }
    }

    public C73726k1(List list, Context context, C67391b bVar, C72996z1 z1Var, C73655y0 y0Var) {
        this.f216473d = list;
        this.f216474e = context;
        this.f216475f = bVar;
        this.f216476g = z1Var;
        this.f216477h = y0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMMMenuItemSelected(android.view.MenuItem r14, int r15) {
        /*
            r13 = this;
            int r15 = r14.getItemId()
            r0 = 2131824451(0x7f110f43, float:1.928173E38)
            r1 = 2131824450(0x7f110f42, float:1.9281728E38)
            r2 = 2131824449(0x7f110f41, float:1.9281726E38)
            r3 = 0
            r4 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r5 = ""
            r6 = 1193046(0x123456, float:1.671814E-39)
            if (r15 != r6) goto L_0x007d
            java.util.List r14 = r13.f216473d
            boolean r14 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88779w(r14)
            if (r14 == 0) goto L_0x0035
            android.content.Context r14 = r13.f216474e
            java.lang.String r15 = r14.getString(r2)
            android.content.Context r0 = r13.f216474e
            java.lang.String r0 = r0.getString(r4)
            com.tencent.mm.ui.chatting.k1$a r1 = new com.tencent.mm.ui.chatting.k1$a
            r1.<init>(r13)
            nj3.C76879j.m92754y(r14, r15, r5, r0, r1)
            return
        L_0x0035:
            java.util.List r14 = r13.f216473d
            boolean r14 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88780x(r14)
            if (r14 == 0) goto L_0x0052
            android.content.Context r14 = r13.f216474e
            java.lang.String r15 = r14.getString(r1)
            android.content.Context r0 = r13.f216474e
            java.lang.String r0 = r0.getString(r4)
            com.tencent.mm.ui.chatting.k1$b r1 = new com.tencent.mm.ui.chatting.k1$b
            r1.<init>(r13)
            nj3.C76879j.m92754y(r14, r15, r5, r0, r1)
            return
        L_0x0052:
            java.util.List r14 = r13.f216473d
            boolean r14 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88781y(r14)
            if (r14 == 0) goto L_0x0069
            android.content.Context r14 = r13.f216474e
            java.lang.String r15 = r14.getString(r0)
            com.tencent.mm.ui.chatting.k1$c r0 = new com.tencent.mm.ui.chatting.k1$c
            r0.<init>(r13)
            nj3.C76879j.m92750u(r14, r15, r5, r0, r3)
            return
        L_0x0069:
            ck3.b r14 = r13.f216475f
            java.util.List r15 = r13.f216473d
            com.tencent.mm.storage.z1 r0 = r13.f216476g
            boolean r14 = com.tencent.p014mm.p136ui.chatting.C73762n1.m87367a(r14, r15, r0)
            if (r14 == 0) goto L_0x007c
            com.tencent.mm.ui.chatting.component.y0 r14 = r13.f216477h
            if (r14 == 0) goto L_0x007c
            r14.mo102686y3()
        L_0x007c:
            return
        L_0x007d:
            java.util.List r15 = r13.f216473d
            boolean r15 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88779w(r15)
            if (r15 == 0) goto L_0x009a
            android.content.Context r14 = r13.f216474e
            java.lang.String r15 = r14.getString(r2)
            android.content.Context r0 = r13.f216474e
            java.lang.String r0 = r0.getString(r4)
            com.tencent.mm.ui.chatting.k1$d r1 = new com.tencent.mm.ui.chatting.k1$d
            r1.<init>(r13)
            nj3.C76879j.m92754y(r14, r15, r5, r0, r1)
            return
        L_0x009a:
            java.util.List r15 = r13.f216473d
            boolean r15 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88780x(r15)
            if (r15 == 0) goto L_0x00b7
            android.content.Context r14 = r13.f216474e
            java.lang.String r15 = r14.getString(r1)
            android.content.Context r0 = r13.f216474e
            java.lang.String r0 = r0.getString(r4)
            com.tencent.mm.ui.chatting.k1$e r1 = new com.tencent.mm.ui.chatting.k1$e
            r1.<init>(r13)
            nj3.C76879j.m92754y(r14, r15, r5, r0, r1)
            return
        L_0x00b7:
            java.util.List r15 = r13.f216473d
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            r2 = 0
            r4 = 1
            if (r15 != 0) goto L_0x00c9
            java.lang.String r15 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r1 = "check contain undownload image or video error, select item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r1)
        L_0x00c6:
            r15 = 0
            goto L_0x0190
        L_0x00c9:
            java.util.Iterator r15 = r15.iterator()
        L_0x00cd:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r15.next()
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6
            int r7 = r6.mo108769t2()
            if (r7 != r4) goto L_0x00e0
            goto L_0x00c6
        L_0x00e0:
            boolean r7 = r6.mo100979R3()
            if (r7 == 0) goto L_0x013e
            long r7 = r6.getMsgId()
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0109
            di3.d r7 = di3.C86312j.m106911c(r1)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r8 = r6.mo108768t()
            long r11 = r6.getMsgId()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            com.tencent.mm.modelimage.k r7 = r7.mo127200vP(r8, r11)
            goto L_0x010a
        L_0x0109:
            r7 = r3
        L_0x010a:
            if (r7 == 0) goto L_0x0112
            long r11 = r7.f267374a
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0132
        L_0x0112:
            long r11 = r6.mo108774y2()
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0132
            di3.d r7 = di3.C86312j.m106911c(r1)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r8 = r6.mo108768t()
            long r9 = r6.mo108774y2()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            com.tencent.mm.modelimage.k r7 = r7.mo127168NQ(r8, r9)
        L_0x0132:
            if (r7 != 0) goto L_0x0135
            goto L_0x00cd
        L_0x0135:
            int r6 = r7.f267376c
            int r7 = r7.f267377d
            if (r6 < r7) goto L_0x0164
            if (r7 != 0) goto L_0x00cd
            goto L_0x0164
        L_0x013e:
            boolean r7 = r6.mo100994f4()
            r8 = 199(0xc7, float:2.79E-43)
            if (r7 == 0) goto L_0x0166
            java.lang.Class<rz.s> r7 = p682rz.C101488s.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            rz.s r7 = (p682rz.C101488s) r7
            rz.t r7 = r7.Kj0()
            java.lang.String r6 = r6.mo108765s2()
            hd0.o0 r7 = (hd0.C98410o0) r7
            hd0.n0 r6 = r7.mo137720f(r6)
            if (r6 == 0) goto L_0x00cd
            int r6 = r6.f288562i
            if (r6 == r8) goto L_0x00cd
            if (r6 == r8) goto L_0x00cd
        L_0x0164:
            r15 = 1
            goto L_0x0190
        L_0x0166:
            boolean r7 = r6.mo100989b4()
            if (r7 == 0) goto L_0x0185
            java.lang.Class<rz.u> r7 = p682rz.C101491u.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            rz.u r7 = (p682rz.C101491u) r7
            java.lang.String r6 = r6.mo108765s2()
            hd0.n0 r6 = r7.mo140806Zd(r6)
            if (r6 == 0) goto L_0x00cd
            int r6 = r6.f288562i
            if (r6 == r8) goto L_0x00cd
            if (r6 == r8) goto L_0x00cd
            goto L_0x0164
        L_0x0185:
            boolean r7 = r6.mo101022y3()
            if (r7 == 0) goto L_0x00cd
            boolean r15 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88766j(r6)
            r15 = r15 ^ r4
        L_0x0190:
            if (r15 != 0) goto L_0x023a
            java.util.List r15 = r13.f216473d
            boolean r15 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88781y(r15)
            if (r15 == 0) goto L_0x019c
            goto L_0x023a
        L_0x019c:
            java.lang.CharSequence r15 = r14.getTitle()
            java.lang.String r15 = (java.lang.String) r15
            boolean r0 = rb0.C47984k.m53338l(r15)
            if (r0 == 0) goto L_0x01d5
            java.util.List r14 = r13.f216473d
            int r14 = r14.size()
            if (r14 > r4) goto L_0x01bc
            com.tencent.mm.ui.chatting.l1$c r14 = com.tencent.p014mm.p136ui.chatting.C73738l1.f216484b
            r14.f216493f = r4
            ck3.b r14 = r13.f216475f
            java.util.List r0 = r13.f216473d
            com.tencent.p014mm.p136ui.chatting.C73738l1.m87334a(r15, r14, r0)
            return
        L_0x01bc:
            qo3.n r14 = new qo3.n
            android.content.Context r0 = r13.f216474e
            r14.<init>((android.content.Context) r0, (int) r4, (boolean) r2)
            com.tencent.mm.ui.chatting.k1$g r0 = new com.tencent.mm.ui.chatting.k1$g
            r0.<init>(r13)
            r14.f225771i = r0
            com.tencent.mm.ui.chatting.k1$h r0 = new com.tencent.mm.ui.chatting.k1$h
            r0.<init>(r15)
            r14.f225782p = r0
            r14.mo107573q()
            return
        L_0x01d5:
            java.util.List r15 = r13.f216473d
            boolean r15 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88777u(r15)
            if (r15 == 0) goto L_0x01f1
            android.content.Context r15 = r13.f216474e
            r0 = 2131831458(0x7f112aa2, float:1.9295942E38)
            java.lang.String r15 = r15.getString(r0)
            android.content.Context r0 = r13.f216474e
            com.tencent.mm.ui.chatting.k1$i r1 = new com.tencent.mm.ui.chatting.k1$i
            r1.<init>(r14)
            nj3.C76879j.m92750u(r0, r15, r5, r1, r3)
            goto L_0x0239
        L_0x01f1:
            android.content.Context r6 = r13.f216474e
            r15 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r7 = r6.getString(r15)
            android.content.Context r15 = r13.f216474e
            r0 = 2131835638(0x7f113af6, float:1.930442E38)
            java.lang.String r8 = r15.getString(r0)
            r9 = 0
            r10 = 0
            r11 = 0
            qo3.i0 r15 = nj3.C76879j.m92723Q(r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.p136ui.chatting.C73738l1.f216483a = r15
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r15 = com.tencent.p014mm.p136ui.chatting.component.C73655y0.f216259q
            com.tencent.mm.ui.chatting.l1$d r0 = new com.tencent.mm.ui.chatting.l1$d
            ck3.b r7 = r13.f216475f
            android.content.Context r8 = r13.f216474e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.CharSequence r14 = r14.getTitle()
            r1.append(r14)
            r1.append(r5)
            java.lang.String r9 = r1.toString()
            r10 = -1
            com.tencent.mm.ui.chatting.l1$c r12 = com.tencent.p014mm.p136ui.chatting.C73738l1.f216484b
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r12)
            r15.add(r0)
            com.tencent.mm.ui.chatting.component.y0 r14 = r13.f216477h
            if (r14 == 0) goto L_0x0239
            r14.mo102686y3()
        L_0x0239:
            return
        L_0x023a:
            android.content.Context r14 = r13.f216474e
            java.lang.String r15 = r14.getString(r0)
            com.tencent.mm.ui.chatting.k1$f r0 = new com.tencent.mm.ui.chatting.k1$f
            r0.<init>(r13)
            nj3.C76879j.m92750u(r14, r15, r5, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73726k1.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
