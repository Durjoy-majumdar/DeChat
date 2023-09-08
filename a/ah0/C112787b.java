package ah0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: ah0.b */
public class C112787b implements C11385n {

    /* renamed from: d */
    public Context f337721d;

    /* renamed from: e */
    public C112786a f337722e = null;

    /* renamed from: f */
    public HashSet<C117747y> f337723f = new HashSet<>();

    /* renamed from: g */
    public HashSet<C117747y> f337724g = new HashSet<>();

    /* renamed from: h */
    public Dialog f337725h = null;

    /* renamed from: i */
    public Set<Integer> f337726i = new HashSet();

    /* renamed from: ah0.b$a */
    public class C112788a implements DialogInterface.OnCancelListener {
        public C112788a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C112787b bVar = C112787b.this;
            if (bVar.f337725h != null && bVar.f337723f.isEmpty()) {
                C112787b.this.f337725h.dismiss();
                Iterator<C117747y> it = C112787b.this.f337724g.iterator();
                while (it.hasNext()) {
                    C97625j3.m125815e().mo123458d(it.next());
                }
                C112787b.this.f337724g.clear();
            }
        }
    }

    public C112787b(Context context, C112786a aVar) {
        this.f337721d = context;
        this.f337722e = aVar;
    }

    /* renamed from: a */
    public void mo164545a(int i) {
        ((HashSet) this.f337726i).add(Integer.valueOf(i));
        C97625j3.m125815e().mo123455a(i, this);
    }

    /* renamed from: b */
    public void mo164546b(C117747y yVar, boolean z) {
        Dialog dialog;
        Log.m105918d("MicroMsg.WalletNetSceneMgr", "isShowProgress " + z);
        this.f337724g.add(yVar);
        if (z && ((dialog = this.f337725h) == null || (dialog != null && !dialog.isShowing()))) {
            Dialog dialog2 = this.f337725h;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f337725h = C76879j.m92723Q(this.f337721d, "", "", true, true, new C112788a());
        }
        C97625j3.m125815e().mo123460f(yVar);
    }

    /* renamed from: c */
    public void mo164547c(int i) {
        C97625j3.m125815e().mo123470p(i, this);
        ((HashSet) this.f337726i).remove(Integer.valueOf(i));
        if (((HashSet) this.f337726i).isEmpty()) {
            Dialog dialog = this.f337725h;
            if (dialog != null) {
                dialog.dismiss();
                this.f337725h = null;
            }
            Iterator<C117747y> it = this.f337723f.iterator();
            while (it.hasNext()) {
                C97625j3.m125815e().mo123458d(it.next());
            }
            Iterator<C117747y> it4 = this.f337724g.iterator();
            while (it4.hasNext()) {
                C97625j3.m125815e().mo123458d(it4.next());
            }
            this.f337723f.clear();
            this.f337724g.clear();
            this.f337722e = null;
            this.f337721d = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r20, int r21, java.lang.String r22, ob0.C117747y r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            java.util.HashSet<ob0.y> r4 = r0.f337724g
            boolean r4 = r4.contains(r3)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 1
            java.lang.String r8 = "MicroMsg.WalletNetSceneMgr"
            if (r4 == 0) goto L_0x0023
            java.util.HashSet<ob0.y> r4 = r0.f337724g
            r4.remove(r3)
            java.lang.String r4 = "has find scene "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r4)
            goto L_0x0035
        L_0x0023:
            java.util.HashSet<ob0.y> r4 = r0.f337723f
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0037
            java.util.HashSet<ob0.y> r4 = r0.f337723f
            r4.remove(r3)
            java.lang.String r4 = "has find forcescenes "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r4)
        L_0x0035:
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            java.util.HashSet<ob0.y> r8 = r0.f337724g
            boolean r8 = r8.isEmpty()
            r9 = 0
            if (r8 == 0) goto L_0x0052
            java.util.HashSet<ob0.y> r8 = r0.f337723f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0052
            android.app.Dialog r8 = r0.f337725h
            if (r8 == 0) goto L_0x0052
            r8.dismiss()
            r0.f337725h = r9
        L_0x0052:
            if (r4 == 0) goto L_0x026e
            ah0.a r4 = r0.f337722e
            if (r4 == 0) goto L_0x026e
            r10 = r4
            com.tencent.mm.plugin.address.ui.WalletSelectAddrUI r10 = (com.tencent.p014mm.plugin.address.p879ui.WalletSelectAddrUI) r10
            ah0.b r4 = r10.f345292h
            r8 = r22
            r4.onSceneEnd(r1, r2, r8, r3)
            r4 = 419(0x1a3, float:5.87E-43)
            if (r1 != 0) goto L_0x0240
            if (r2 != 0) goto L_0x0240
            int r1 = r23.getType()
            r2 = 417(0x1a1, float:5.84E-43)
            if (r1 != r2) goto L_0x00de
            r1 = r3
            zg0.g r1 = (zg0.C66803g) r1
            boolean r1 = r1.f191924f
            if (r1 == 0) goto L_0x026e
            r10.mo174982I7()
            android.view.View r1 = r10.getContentView()
            r2 = 2131296701(0x7f0901bd, float:1.8211326E38)
            android.view.View r1 = r1.findViewById(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r6)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI"
            java.lang.String r14 = "onSceneEnd"
            java.lang.String r15 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI"
            java.lang.String r13 = "onSceneEnd"
            java.lang.String r14 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r10.f345297p
            if (r1 == 0) goto L_0x026e
            java.util.List<bh0.b> r1 = r10.f345288d
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            if (r1 != 0) goto L_0x026e
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.Class<com.tencent.mm.plugin.address.ui.WalletAddAddressUI> r2 = com.tencent.p014mm.plugin.address.p879ui.WalletAddAddressUI.class
            r1.setClass(r10, r2)
            r10.startActivityForResult((android.content.Intent) r1, (int) r7)
            goto L_0x026e
        L_0x00de:
            int r1 = r23.getType()
            r2 = 416(0x1a0, float:5.83E-43)
            if (r1 != r2) goto L_0x014c
            r1 = r3
            zg0.h r1 = (zg0.C66804h) r1
            xg0.C78803b.vx0()
            zg0.p r2 = xg0.C78803b.xx0()
            int r1 = r1.f191927f
            bh0.b r1 = r2.mo183777b(r1)
            if (r1 == 0) goto L_0x0147
            xg0.C78803b.vx0()
            zg0.p r2 = xg0.C78803b.xx0()
            bh0.a r3 = r2.f356680a
            if (r3 != 0) goto L_0x010a
            bh0.a r3 = new bh0.a
            r3.<init>()
            r2.f356680a = r3
        L_0x010a:
            r3 = 0
        L_0x010b:
            bh0.a r4 = r2.f356680a
            java.util.LinkedList<bh0.b> r4 = r4.f152728d
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0131
            bh0.a r4 = r2.f356680a
            java.util.LinkedList<bh0.b> r4 = r4.f152728d
            java.lang.Object r4 = r4.get(r3)
            bh0.b r4 = (bh0.C113174b) r4
            int r4 = r4.f338614d
            int r6 = r1.f338614d
            if (r4 != r6) goto L_0x012e
            bh0.a r1 = r2.f356680a
            java.util.LinkedList<bh0.b> r1 = r1.f152728d
            r1.remove(r3)
            r5 = 1
            goto L_0x0131
        L_0x012e:
            int r3 = r3 + 1
            goto L_0x010b
        L_0x0131:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "delte addr "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WalletSelectAddrUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
        L_0x0147:
            r10.mo174982I7()
            goto L_0x026e
        L_0x014c:
            int r1 = r23.getType()
            if (r1 != r4) goto L_0x0163
            bh0.b r1 = r10.f345289e
            if (r1 == 0) goto L_0x026e
            r2 = -1
            android.content.Intent r1 = dh0.C7328a.m7472a(r1)
            r10.setResult(r2, r1)
            r10.finish()
            goto L_0x026e
        L_0x0163:
            int r1 = r23.getType()
            r2 = 582(0x246, float:8.16E-43)
            if (r1 != r2) goto L_0x026e
            r1 = 2131820855(0x7f110137, float:1.9274437E38)
            java.lang.String r1 = r10.getString(r1)
            r2 = r3
            zg0.f r2 = (zg0.C66802f) r2
            int r2 = r2.f191919d
            r3 = 8
            r4 = 196657(0x30031, float:2.75575E-40)
            if (r2 == 0) goto L_0x01d6
            if (r2 == r7) goto L_0x01ae
            r5 = 2
            if (r2 == r5) goto L_0x01ae
            r3 = 3
            if (r2 == r3) goto L_0x0195
            qo3.g r2 = r10.f345301t
            if (r2 == 0) goto L_0x018d
            r2.dismiss()
        L_0x018d:
            qo3.g r1 = nj3.C76879j.m92713G(r10, r1, r9, r7, r9)
            r10.f345301t = r1
            goto L_0x026e
        L_0x0195:
            com.tencent.mm.autogen.events.NeedVerifyQQEvent r1 = new com.tencent.mm.autogen.events.NeedVerifyQQEvent
            r1.<init>()
            com.tencent.mm.autogen.events.NeedVerifyQQEvent$a r2 = r1.f236243d
            r2.f236245a = r10
            ch0.p r3 = new ch0.p
            r3.<init>(r10, r1)
            r2.f236246b = r3
            android.os.Looper r2 = android.os.Looper.myLooper()
            r1.asyncPublish((android.os.Looper) r2)
            goto L_0x026e
        L_0x01ae:
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo119676J(r4, r2)
            android.widget.TextView r1 = r10.f345294j
            r1.setVisibility(r3)
            r1 = 2131820856(0x7f110138, float:1.9274439E38)
            java.lang.String r1 = r10.getString(r1)
            qo3.g r2 = r10.f345301t
            if (r2 == 0) goto L_0x01ce
            r2.dismiss()
        L_0x01ce:
            qo3.g r1 = nj3.C76879j.m92713G(r10, r1, r9, r7, r9)
            r10.f345301t = r1
            goto L_0x026e
        L_0x01d6:
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo119676J(r4, r2)
            android.widget.TextView r1 = r10.f345294j
            r1.setVisibility(r3)
            r10.mo174982I7()
            android.view.View r1 = r10.getContentView()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r6)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI"
            java.lang.String r14 = "onSceneEnd"
            java.lang.String r15 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI"
            java.lang.String r13 = "onSceneEnd"
            java.lang.String r14 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            r1 = 2131820857(0x7f110139, float:1.927444E38)
            java.lang.String r1 = r10.getString(r1)
            qo3.g r2 = r10.f345301t
            if (r2 == 0) goto L_0x0239
            r2.dismiss()
        L_0x0239:
            qo3.g r1 = nj3.C76879j.m92713G(r10, r1, r9, r7, r9)
            r10.f345301t = r1
            goto L_0x026e
        L_0x0240:
            int r1 = r23.getType()
            if (r1 != r4) goto L_0x026e
            r1 = -3103(0xfffffffffffff3e1, float:NaN)
            if (r2 != r1) goto L_0x026e
            r1 = 2131820770(0x7f1100e2, float:1.9274264E38)
            java.lang.String r14 = r10.getString(r1)
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r15 = r10.getString(r1)
            ch0.q r1 = new ch0.q
            r1.<init>(r10)
            ch0.n r2 = new ch0.n
            r2.<init>(r10)
            r11 = 1
            java.lang.String r13 = ""
            r12 = r22
            r16 = r1
            r17 = r2
            nj3.C76879j.m92717K(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ah0.C112787b.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
