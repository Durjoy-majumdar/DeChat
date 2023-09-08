package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import di3.C86312j;
import eb0.C45628s0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nm2.C76933e;
import p227rn.C48053v;
import qo3.C77407n;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.component.q0 */
public class C73579q0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C73655y0 f216091d;

    /* renamed from: com.tencent.mm.ui.chatting.component.q0$a */
    public class C73580a implements C11182m0 {
        public C73580a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107125a(0, C0966R.string.f361056gy2);
            e0Var.mo107125a(1, C0966R.string.f361057gy3);
            Activity f = C73579q0.this.f216091d.f215752d.mo91565f();
            IWWAPI.WWAppType wWAppType = IWWAPI.WWAppType.WwAppTypeLocal;
            long currentTimeMillis = System.currentTimeMillis();
            boolean e = WWAPIFactory.m125312a(f).mo136607e(wWAppType);
            Log.m105925i("MicroMsg.SendToWeWorkHelper", "isSupport: result:%s type:%s costTime:%s", Boolean.valueOf(e), wWAppType, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (e) {
                Activity f2 = C73579q0.this.f216091d.f215752d.mo91565f();
                Object[] objArr = new Object[1];
                Activity f3 = C73579q0.this.f216091d.f215752d.mo91565f();
                objArr[0] = !WeChatBrands.AppInfo.current().isMainland() ? f3.getString(C0966R.string.lk5) : WWAPIFactory.m125312a(f3).mo136604b(wWAppType);
                e0Var.mo107142f(3, f2.getString(C0966R.string.gy4, objArr));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.q0$b */
    public class C73581b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ View f216093d;

        /* renamed from: com.tencent.mm.ui.chatting.component.q0$b$a */
        public class C73582a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ List f216095d;

            public C73582a(List list) {
                this.f216095d = list;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.ChattingMoreBtnBarHelper", "MENU_ID_SEND_NORMAL to MENU_ID_SEND_RECORD");
                C73579q0.m87013a(C73579q0.this, this.f216095d);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.q0$b$b */
        public class C73583b implements DialogInterface.OnClickListener {
            public C73583b(C73581b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.ChattingMoreBtnBarHelper", "MENU_ID_SEND_NORMAL onCancel");
            }
        }

        public C73581b(View view) {
            this.f216093d = view;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
            r10 = r10 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
            r8 = r8 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
            r4 = r4 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMMMenuItemSelected(android.view.MenuItem r17, int r18) {
            /*
                r16 = this;
                r0 = r16
                com.tencent.mm.ui.chatting.component.q0 r1 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r1 = r1.f216091d
                java.util.List r1 = r1.mo102683n0()
                nm2.e r2 = nm2.C76933e.m92785a()
                r2.getClass()
                r3 = r1
                java.util.LinkedList r3 = (java.util.LinkedList) r3
                int r3 = r3.size()
                long r3 = (long) r3
                com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct r5 = r2.f224830a
                r5.f194286g = r3
                java.util.Iterator r3 = r1.iterator()
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
            L_0x002b:
                boolean r14 = r3.hasNext()
                if (r14 == 0) goto L_0x006e
                java.lang.Object r14 = r3.next()
                com.tencent.mm.storage.f4 r14 = (com.tencent.p014mm.storage.C72963f4) r14
                int r15 = r14.getType()
                switch(r15) {
                    case 1: goto L_0x0068;
                    case 3: goto L_0x0065;
                    case 11: goto L_0x0068;
                    case 13: goto L_0x0065;
                    case 21: goto L_0x0068;
                    case 23: goto L_0x0065;
                    case 31: goto L_0x0068;
                    case 33: goto L_0x0065;
                    case 34: goto L_0x0062;
                    case 36: goto L_0x0068;
                    case 39: goto L_0x0065;
                    case 42: goto L_0x005f;
                    case 43: goto L_0x005c;
                    case 44: goto L_0x005c;
                    case 47: goto L_0x0059;
                    case 49: goto L_0x003f;
                    case 62: goto L_0x005c;
                    case 66: goto L_0x005f;
                    case 268435505: goto L_0x0065;
                    case 301989937: goto L_0x0068;
                    case 1107296305: goto L_0x0068;
                    default: goto L_0x003e;
                }
            L_0x003e:
                goto L_0x006b
            L_0x003f:
                java.lang.String r14 = r14.getContent()
                r15 = 0
                com.tencent.mm.message.l$b r14 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r14, r15)
                if (r14 == 0) goto L_0x002b
                int r14 = r14.f195582i
                switch(r14) {
                    case 1: goto L_0x0068;
                    case 4: goto L_0x005c;
                    case 6: goto L_0x0056;
                    case 19: goto L_0x0053;
                    case 33: goto L_0x0050;
                    case 36: goto L_0x0050;
                    case 44: goto L_0x0050;
                    case 48: goto L_0x0050;
                    case 53: goto L_0x0068;
                    case 57: goto L_0x0068;
                    case 1048625: goto L_0x0059;
                    default: goto L_0x004f;
                }
            L_0x004f:
                goto L_0x006b
            L_0x0050:
                int r13 = r13 + 1
                goto L_0x002b
            L_0x0053:
                int r12 = r12 + 1
                goto L_0x002b
            L_0x0056:
                int r11 = r11 + 1
                goto L_0x002b
            L_0x0059:
                int r10 = r10 + 1
                goto L_0x002b
            L_0x005c:
                int r8 = r8 + 1
                goto L_0x002b
            L_0x005f:
                int r9 = r9 + 1
                goto L_0x002b
            L_0x0062:
                int r7 = r7 + 1
                goto L_0x002b
            L_0x0065:
                int r6 = r6 + 1
                goto L_0x002b
            L_0x0068:
                int r5 = r5 + 1
                goto L_0x002b
            L_0x006b:
                int r4 = r4 + 1
                goto L_0x002b
            L_0x006e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                java.lang.String r4 = ";"
                r3.append(r4)
                r3.append(r5)
                r3.append(r4)
                r3.append(r6)
                r3.append(r4)
                r3.append(r7)
                r3.append(r4)
                r3.append(r8)
                r3.append(r4)
                r3.append(r9)
                r3.append(r4)
                r3.append(r10)
                r3.append(r4)
                r3.append(r11)
                r3.append(r4)
                r3.append(r12)
                r3.append(r4)
                r3.append(r13)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct r2 = r2.f224830a
                java.lang.String r4 = "FinalShareCountByType"
                r5 = 1
                java.lang.String r3 = r2.mo86045b(r4, r3, r5)
                r2.f194287h = r3
                int r2 = r17.getItemId()
                if (r2 == 0) goto L_0x0163
                if (r2 == r5) goto L_0x015c
                r3 = 2
                r4 = 3
                if (r2 == r3) goto L_0x0117
                r3 = 3
                if (r2 == r3) goto L_0x00d2
                goto L_0x01f0
            L_0x00d2:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalWeCom
                android.view.View r3 = r0.f216093d
                android.content.Context r3 = r3.getContext()
                boolean r2 = r2.checkAvailable(r3)
                if (r2 != 0) goto L_0x00e2
                goto L_0x01f0
            L_0x00e2:
                nm2.e r2 = nm2.C76933e.m92785a()
                com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct r2 = r2.f224830a
                r2.f194284e = r4
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                ck3.b r2 = r2.f215752d
                android.app.Activity r2 = r2.mo91565f()
                com.tencent.mm.ui.chatting.component.q0 r3 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r3 = r3.f216091d
                com.tencent.mm.storage.z1 r4 = r3.f216263h
                boolean r5 = r3.f216264i
                com.tencent.wework.api.IWWAPI$WWAppType r6 = com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal
                r7 = 0
                r3 = r4
                r4 = r1
                boolean r1 = com.tencent.p014mm.p136ui.chatting.C97182r4.m125145h(r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L_0x010e
                nm2.e r1 = nm2.C76933e.m92785a()
                r1.mo107269c()
            L_0x010e:
                com.tencent.mm.ui.chatting.component.q0 r1 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r1 = r1.f216091d
                r1.mo102686y3()
                goto L_0x01f0
            L_0x0117:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalWeCom
                android.view.View r3 = r0.f216093d
                android.content.Context r3 = r3.getContext()
                boolean r2 = r2.checkAvailable(r3)
                if (r2 != 0) goto L_0x0127
                goto L_0x01f0
            L_0x0127:
                nm2.e r2 = nm2.C76933e.m92785a()
                com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct r2 = r2.f224830a
                r2.f194284e = r4
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                ck3.b r2 = r2.f215752d
                android.app.Activity r2 = r2.mo91565f()
                com.tencent.mm.ui.chatting.component.q0 r3 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r3 = r3.f216091d
                com.tencent.mm.storage.z1 r4 = r3.f216263h
                boolean r5 = r3.f216264i
                com.tencent.wework.api.IWWAPI$WWAppType r6 = com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork
                r7 = 0
                r3 = r4
                r4 = r1
                boolean r1 = com.tencent.p014mm.p136ui.chatting.C97182r4.m125145h(r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L_0x0153
                nm2.e r1 = nm2.C76933e.m92785a()
                r1.mo107269c()
            L_0x0153:
                com.tencent.mm.ui.chatting.component.q0 r1 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r1 = r1.f216091d
                r1.mo102686y3()
                goto L_0x01f0
            L_0x015c:
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.p014mm.p136ui.chatting.component.C73579q0.m87013a(r2, r1)
                goto L_0x01f0
            L_0x0163:
                nm2.e r2 = nm2.C76933e.m92785a()
                r3 = 2
                com.tencent.mm.autogen.mmdata.rpt.MultiMessageForwardStruct r2 = r2.f224830a
                r2.f194284e = r3
                r2 = r1
                java.util.LinkedList r2 = (java.util.LinkedList) r2
                int r2 = r2.size()
                r3 = 31
                if (r2 <= r3) goto L_0x01c5
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                ck3.b r2 = r2.f215752d
                android.app.Activity r3 = r2.mo91565f()
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                ck3.b r2 = r2.f215752d
                android.app.Activity r2 = r2.mo91565f()
                r4 = 2131838144(0x7f1144c0, float:1.9309503E38)
                java.lang.String r4 = r2.getString(r4)
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                ck3.b r2 = r2.f215752d
                android.app.Activity r2 = r2.mo91565f()
                r5 = 2131833141(0x7f113135, float:1.9299356E38)
                java.lang.String r6 = r2.getString(r5)
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                ck3.b r2 = r2.f215752d
                android.app.Activity r2 = r2.mo91565f()
                r5 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.String r7 = r2.getString(r5)
                com.tencent.mm.ui.chatting.component.q0$b$a r8 = new com.tencent.mm.ui.chatting.component.q0$b$a
                r8.<init>(r1)
                com.tencent.mm.ui.chatting.component.q0$b$b r9 = new com.tencent.mm.ui.chatting.component.q0$b$b
                r9.<init>(r0)
                java.lang.String r5 = ""
                nj3.C76879j.m92707A(r3, r4, r5, r6, r7, r8, r9)
                return
            L_0x01c5:
                com.tencent.mm.ui.chatting.component.q0 r2 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r2 = r2.f216091d
                r2.f216265j = r5
                ck3.b r2 = r2.f215752d
                android.app.Activity r2 = r2.mo91565f()
                com.tencent.mm.ui.chatting.component.q0 r3 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r3 = r3.f216091d
                boolean r4 = r3.f216264i
                com.tencent.mm.storage.z1 r3 = r3.f216263h
                java.lang.String r5 = r3.getUsername()
                r6 = 2
                com.tencent.mm.ui.chatting.component.q0 r3 = com.tencent.p014mm.p136ui.chatting.component.C73579q0.this
                com.tencent.mm.ui.chatting.component.y0 r7 = r3.f216091d
                r3 = r1
                boolean r1 = com.tencent.p014mm.p136ui.chatting.C73313b1.m86456b(r2, r3, r4, r5, r6, r7)
                if (r1 != 0) goto L_0x01f0
                nm2.e r1 = nm2.C76933e.m92785a()
                r1.mo107269c()
            L_0x01f0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73579q0.C73581b.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.q0$c */
    public class C73584c implements C77407n.C47880p {
        public C73584c(C73579q0 q0Var) {
        }

        public void onDismiss() {
            C76933e.m92785a().mo107269c();
        }
    }

    public C73579q0(C73655y0 y0Var) {
        this.f216091d = y0Var;
    }

    /* renamed from: a */
    public static void m87013a(C73579q0 q0Var, List list) {
        q0Var.f216091d.f216265j = false;
        C76933e.m92785a().f224830a.f194284e = 1;
        Activity f = q0Var.f216091d.f215752d.mo91565f();
        C73655y0 y0Var = q0Var.f216091d;
        if (!C73313b1.m86456b(f, list, y0Var.f216264i, y0Var.f216263h.getUsername(), 3, q0Var.f216091d)) {
            C76933e.m92785a().mo107269c();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((C79368l) this.f216091d.f215752d.f193278b.mo102812a(C79368l.class)).mo108181M5() == 0) {
            Log.m105928w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if ((!C45628s0.m50738C(this.f216091d.f216263h.getUsername()) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(this.f216091d.f216263h.getUsername())) && !C45628s0.m50751P(this.f216091d.f216263h.getUsername())) {
            C76933e.f224829b = new C76933e();
            C77407n nVar = new C77407n((Context) this.f216091d.f215752d.mo91565f(), 1, false);
            nVar.f225771i = new C73580a();
            nVar.f225782p = new C73581b(view);
            nVar.f225761d = new C73584c(this);
            nVar.mo107573q();
        } else {
            C73655y0 y0Var = this.f216091d;
            y0Var.f216265j = true;
            Activity f = y0Var.f215752d.mo91565f();
            List<C72963f4> n0 = this.f216091d.mo102683n0();
            C73655y0 y0Var2 = this.f216091d;
            C73313b1.m86456b(f, n0, y0Var2.f216264i, y0Var2.f216263h.getUsername(), 1, this.f216091d);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
