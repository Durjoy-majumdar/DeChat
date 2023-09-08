package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C31519v2;
import eb0.C75604z3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p910lj.C76701a;
import qg2.C77335p;
import sf0.C77702q0;
import te3.ot4;
import uj3.C78208e;
import uw2.C52630b;
import uw2.C78291e;
import uw2.C78294g;
import zj3.C79362h1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t7 */
public final class C74235t7 extends C74023i {

    /* renamed from: v */
    public C67391b f217930v;

    /* renamed from: w */
    public C11385n f217931w;

    /* renamed from: x */
    public ProgressDialog f217932x;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$a */
    public class C74236a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f217933d;

        /* renamed from: e */
        public final /* synthetic */ C78208e f217934e;

        public C74236a(C72963f4 f4Var, C78208e eVar) {
            this.f217933d = f4Var;
            this.f217934e = eVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C77702q0.m93719b(this.f217933d.mo108765s2())) {
                Log.m105918d("MicroMsg.ChattingItemVoiceRemindConfirm", "filename is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((C79362h1) C74235t7.this.f217930v.f193278b.mo102812a(C79362h1.class)).mo102325W().mo102006i(this.f217934e.getAdapterPosition(), this.f217933d);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$b */
    public class C74237b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f217936d;

        /* renamed from: e */
        public final /* synthetic */ String f217937e;

        /* renamed from: f */
        public final /* synthetic */ C78208e f217938f;

        public C74237b(C72963f4 f4Var, String str, C78208e eVar) {
            this.f217936d = f4Var;
            this.f217937e = str;
            this.f217938f = eVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            boolean z;
            Log.m105918d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + i + " errCode " + i2 + "  scene " + yVar.getType());
            if (C31519v2.m39437b() != null) {
                z = ((C78291e) C31519v2.m39437b()).yx0(this.f217936d.getMsgId());
            } else {
                z = false;
            }
            if (!z && i == 0 && i2 == 0 && ((C77335p) yVar).mo107462n1().equals(this.f217937e)) {
                C72963f4 l3 = C72963f4.m85593l3(this.f217936d);
                l3.mo108739S2(this.f217936d.mo108775z2());
                l3.setMsgId(-1);
                ((C79362h1) C74235t7.this.f217930v.f193278b.mo102812a(C79362h1.class)).mo102325W().mo102006i(this.f217938f.getAdapterPosition(), l3);
            }
            C97625j3.m125815e().mo123470p(221, C74235t7.this.f217931w);
            C74235t7.this.f217931w = null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$c */
    public class C74238c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C72683d f217940d;

        public C74238c(C72683d dVar) {
            this.f217940d = dVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105918d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + i + " errCode " + i2 + "  scene " + yVar.getType());
            if (((C77335p) yVar).mo107462n1().equals(this.f217940d.field_mediaSvrId)) {
                C97625j3.m125815e().mo123470p(221, C74235t7.this.f217931w);
                C74235t7.this.f217931w = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$d */
    public class C74239d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f217942d;

        /* renamed from: e */
        public final /* synthetic */ C78294g f217943e;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$d$a */
        public class C74240a implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$d$a$a */
            public class C74241a implements C11385n {
                public C74241a() {
                }

                public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                    C72683d Yt;
                    Log.m105918d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + i + " errCode " + i2 + "  scene " + yVar.getType());
                    if (i == 0 && i2 == 0) {
                        String content = C74239d.this.f217942d.getContent();
                        if (!((content != null ? C68070l.C68072b.m80422u(content, (String) null) : null) == null || (Yt = C72709y1.vx0().mo100150Yt(C74239d.this.f217942d.getMsgId())) == null)) {
                            Log.m105925i("MicroMsg.AppMsgLogic", "summerapp deleteAttachInfoAndFile deleteFile[%b] deleteInfo[%b] msgInfoId[%d] mediaSvrId[%s] path[%s] stack[%s]", Boolean.valueOf(C86013q1.m106447h(Yt.field_fileFullPath)), Boolean.valueOf(C72709y1.vx0().delete(Yt, "msgInfoId")), Long.valueOf(Yt.field_msgInfoId), Yt.field_mediaSvrId, Yt.field_fileFullPath, Util.getStack());
                        }
                        C75604z3.m90834f(C74239d.this.f217942d.getMsgId());
                        C76701a.makeText((Context) C74235t7.this.f217930v.mo91565f(), (CharSequence) C74235t7.this.f217930v.mo91572m().getString(C0966R.string.b9o), 0).show();
                    }
                    C97625j3.m125815e().mo123470p(331, C74235t7.this.f217931w);
                    C74235t7 t7Var = C74235t7.this;
                    t7Var.f217931w = null;
                    ProgressDialog progressDialog = t7Var.f217932x;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.t7$d$a$b */
            public class C74242b implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C52630b f217947d;

                public C74242b(C52630b bVar) {
                    this.f217947d = bVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    C97625j3.m125815e().mo123458d(this.f217947d);
                    C97625j3.m125815e().mo123470p(331, C74235t7.this.f217931w);
                    C74235t7 t7Var = C74235t7.this;
                    t7Var.f217931w = null;
                    ProgressDialog progressDialog = t7Var.f217932x;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                }
            }

            public C74240a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C89137b0 e = C97625j3.m125815e();
                C74235t7 t7Var = C74235t7.this;
                C74241a aVar = new C74241a();
                t7Var.f217931w = aVar;
                e.mo123455a(331, aVar);
                LinkedList linkedList = new LinkedList();
                ot4 ot4 = new ot4();
                ot4.f139361d = C74239d.this.f217943e.f229342b;
                linkedList.add(ot4);
                C52630b bVar = new C52630b(1, linkedList, linkedList.size());
                C97625j3.m125815e().mo123460f(bVar);
                C74235t7 t7Var2 = C74235t7.this;
                t7Var2.f217932x = C76879j.m92723Q(t7Var2.f217930v.mo91565f(), C74235t7.this.f217930v.mo91572m().getString(C0966R.string.a3h), C74235t7.this.f217930v.mo91572m().getString(C0966R.string.b9p), true, true, new C74242b(bVar));
            }
        }

        public C74239d(C72963f4 f4Var, C78294g gVar) {
            this.f217942d = f4Var;
            this.f217943e = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76879j.m92743n(C74235t7.this.f217930v.mo91565f(), C0966R.string.kdr, C0966R.string.kdt, new C74240a(), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6971tq);
        C74124m8 m8Var = new C74124m8();
        m8Var.mo103191a(n4Var, true);
        n4Var.setTag(m8Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (menuItem.getItemId() != 111) {
            return false;
        }
        Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C67391b bVar2 = bVar;
        C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bVar.mo91556Q((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindConfirm", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        int m = C72695v.m85071m(C75604z3.m90840l(this.f217930v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        int i = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f217930v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null).f195594l;
        if (i <= 0 || (i > 0 && m >= 100)) {
            e0Var.mo107136c(b, 111, 0, this.f217930v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
        }
        if (this.f217930v.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, this.f217930v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r24, ck3.C67391b r25, com.tencent.p014mm.storage.C72963f4 r26, java.lang.String r27) {
        /*
            r23 = this;
            r1 = r23
            r2 = r26
            java.lang.String r3 = ""
            r4 = r24
            com.tencent.mm.ui.chatting.viewitems.m8 r4 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74124m8) r4
            r0 = r25
            r1.f217930v = r0
            com.tencent.mm.pluginsdk.model.app.s r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Ax0()
            long r5 = r26.getMsgId()
            com.tencent.mm.message.l r0 = r0.mo135038a0(r5)
            java.lang.String r5 = r26.getContent()
            r6 = 0
            if (r0 == 0) goto L_0x0029
            if (r5 == 0) goto L_0x0029
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r6)
            r7 = r0
            goto L_0x002a
        L_0x0029:
            r7 = r6
        L_0x002a:
            uw2.g r5 = uw2.C78294g.m94582a(r5)
            java.lang.String r8 = "MicroMsg.ChattingItemVoiceRemindConfirm"
            r9 = 0
            r11 = 0
            r12 = 1
            if (r5 == 0) goto L_0x00d6
            int r0 = r5.f229341a
            if (r0 == 0) goto L_0x00d6
            ck3.b r0 = r1.f217930v     // Catch:{ Exception -> 0x008e }
            android.app.Activity r0 = r0.mo91565f()     // Catch:{ Exception -> 0x008e }
            int r13 = r5.f229341a     // Catch:{ Exception -> 0x008e }
            java.lang.String r0 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85115h(r0, r13)     // Catch:{ Exception -> 0x008e }
            if (r7 == 0) goto L_0x006e
            java.lang.String r13 = r7.f195574g     // Catch:{ Exception -> 0x008e }
            if (r13 == 0) goto L_0x006e
            r14 = 124(0x7c, float:1.74E-43)
            int r13 = r13.indexOf(r14)     // Catch:{ Exception -> 0x008e }
            if (r13 <= 0) goto L_0x0069
            java.lang.String r14 = r7.f195574g     // Catch:{ Exception -> 0x008e }
            int r14 = r14.length()     // Catch:{ Exception -> 0x008e }
            int r13 = r13 + r12
            if (r14 <= r13) goto L_0x0069
            java.lang.String r14 = r7.f195574g     // Catch:{ Exception -> 0x008e }
            java.lang.String r13 = r14.substring(r13)     // Catch:{ Exception -> 0x008e }
            android.widget.TextView r14 = r4.f217597b     // Catch:{ Exception -> 0x008e }
            r14.setText(r13)     // Catch:{ Exception -> 0x008e }
            goto L_0x006e
        L_0x0069:
            android.widget.TextView r13 = r4.f217597b     // Catch:{ Exception -> 0x008e }
            r13.setText(r3)     // Catch:{ Exception -> 0x008e }
        L_0x006e:
            if (r0 == 0) goto L_0x0094
            int r13 = r0.length()     // Catch:{ Exception -> 0x008e }
            if (r13 <= 0) goto L_0x0094
            java.lang.String r13 = ";"
            java.lang.String[] r0 = r0.split(r13)     // Catch:{ Exception -> 0x008e }
            android.widget.TextView r13 = r4.f217598c     // Catch:{ Exception -> 0x008e }
            r14 = r0[r11]     // Catch:{ Exception -> 0x008e }
            r13.setText(r14)     // Catch:{ Exception -> 0x008e }
            int r13 = r0.length     // Catch:{ Exception -> 0x008e }
            if (r13 <= r12) goto L_0x0094
            android.widget.TextView r13 = r4.f217599d     // Catch:{ Exception -> 0x008e }
            r0 = r0[r12]     // Catch:{ Exception -> 0x008e }
            r13.setText(r0)     // Catch:{ Exception -> 0x008e }
            goto L_0x0094
        L_0x008e:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r13)
        L_0x0094:
            int r0 = r5.f229341a
            int r3 = sf0.C77702q0.f226484a
            long r13 = (long) r0
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            long r15 = java.lang.System.currentTimeMillis()
            r25 = r7
            long r6 = r13 - r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "time "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r3 = "  systime "
            r0.append(r3)
            long r13 = java.lang.System.currentTimeMillis()
            r0.append(r13)
            java.lang.String r3 = " diff "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.Util"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            r0 = 1
            goto L_0x00d9
        L_0x00d6:
            r25 = r7
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            if (r0 == 0) goto L_0x0111
            android.widget.ImageView r0 = r4.f217602g
            r0.setVisibility(r11)
            android.widget.TextView r0 = r4.f217597b
            ck3.b r3 = r1.f217930v
            android.content.res.Resources r3 = r3.mo91572m()
            r6 = 2131101732(0x7f060824, float:1.7815882E38)
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r4.f217599d
            ck3.b r3 = r1.f217930v
            android.content.res.Resources r3 = r3.mo91572m()
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r4.f217598c
            ck3.b r3 = r1.f217930v
            android.content.res.Resources r3 = r3.mo91572m()
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
            goto L_0x0148
        L_0x0111:
            android.widget.ImageView r0 = r4.f217602g
            r3 = 8
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.f217597b
            ck3.b r3 = r1.f217930v
            android.content.res.Resources r3 = r3.mo91572m()
            r6 = 2131101731(0x7f060823, float:1.781588E38)
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r4.f217599d
            ck3.b r3 = r1.f217930v
            android.content.res.Resources r3 = r3.mo91572m()
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r4.f217598c
            ck3.b r3 = r1.f217930v
            android.content.res.Resources r3 = r3.mo91572m()
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
        L_0x0148:
            android.widget.Button r0 = r4.f217600e
            com.tencent.mm.ui.chatting.viewitems.t7$a r3 = new com.tencent.mm.ui.chatting.viewitems.t7$a
            r3.<init>(r2, r4)
            r0.setOnClickListener(r3)
            long r6 = r26.getMsgId()
            ck3.b r0 = r1.f217930v
            java.lang.Class<zj3.h1> r3 = zj3.C79362h1.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            zj3.h1 r0 = (zj3.C79362h1) r0
            com.tencent.mm.ui.chatting.AutoPlay r0 = r0.mo102325W()
            if (r0 == 0) goto L_0x017a
            ob0.p r3 = r0.f215194g
            ph.a r3 = (p371ph.C21967a) r3
            boolean r3 = r3.mo35058b()
            if (r3 == 0) goto L_0x017a
            long r13 = r0.f215195h
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x017a
            r0 = 1
            goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            if (r0 == 0) goto L_0x0186
            android.widget.Button r0 = r4.f217600e
            r3 = 2131235436(0x7f08126c, float:1.8087066E38)
            r0.setBackgroundResource(r3)
            goto L_0x018e
        L_0x0186:
            android.widget.Button r0 = r4.f217600e
            r3 = 2131235437(0x7f08126d, float:1.8087068E38)
            r0.setBackgroundResource(r3)
        L_0x018e:
            if (r5 == 0) goto L_0x021d
            java.lang.String r3 = r5.f229343c
            boolean r3 = sf0.C77702q0.m93719b(r3)
            if (r3 != 0) goto L_0x021d
            int r3 = r5.f229344d
            if (r3 <= 0) goto L_0x021d
            java.lang.String r3 = r26.mo108775z2()
            boolean r3 = sf0.C77702q0.m93719b(r3)
            if (r3 == 0) goto L_0x021d
            if (r25 == 0) goto L_0x021d
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r3 = uw2.C78306m.yr0(r3)
            java.lang.String r13 = uw2.C78296j.m94584b(r3, r11)
            r2.mo108746Z2(r3)
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            long r6 = r26.getMsgId()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r3.xy0(r6, r2)
            long r14 = r26.getMsgId()
            r6 = r25
            int r3 = r6.f195566e
            java.lang.String r7 = r6.f195562d
            java.lang.String r9 = r5.f229343c
            int r10 = r5.f229344d
            int r11 = r6.f195582i
            java.lang.String r12 = r6.f195524R
            int r0 = r6.f195626t
            r16 = r3
            r17 = r7
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r0
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85073o(r13, r14, r16, r17, r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x021f
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            com.tencent.mm.ui.chatting.viewitems.t7$b r3 = new com.tencent.mm.ui.chatting.viewitems.t7$b
            r3.<init>(r2, r9, r4)
            r1.f217931w = r3
            r7 = 221(0xdd, float:3.1E-43)
            r0.mo123455a(r7, r3)
            qg2.p r0 = new qg2.p
            r3 = 0
            r0.<init>((java.lang.String) r9, (ob0.C47355o) r3)
            r3 = 1
            r0.f225481y = r3
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f225466g
            java.lang.String r3 = r3.field_fileFullPath
            java.lang.String r7 = "#!AMR\n"
            byte[] r7 = r7.getBytes()
            com.tencent.p014mm.vfs.C86013q1.m106440a(r3, r7)
            ob0.b0 r3 = eb0.C97625j3.m125815e()
            r3.mo123460f(r0)
            goto L_0x021f
        L_0x021d:
            r6 = r25
        L_0x021f:
            java.lang.String r0 = r26.mo108765s2()
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 == 0) goto L_0x027f
            int r0 = r5.f229345e
            if (r0 <= 0) goto L_0x027f
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            java.lang.String r3 = r26.mo108768t()
            int r7 = r5.f229345e
            long r9 = (long) r7
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.h30(r3, r9)
            java.lang.String r3 = r0.mo108765s2()
            boolean r3 = sf0.C77702q0.m93719b(r3)
            if (r3 != 0) goto L_0x027f
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r3 = uw2.C78306m.yr0(r3)
            r7 = 0
            java.lang.String r9 = uw2.C78296j.m94584b(r3, r7)
            java.lang.String r0 = r0.mo108765s2()
            java.lang.String r0 = uw2.C78296j.m94584b(r0, r7)
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r9, r7)
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x027f
            r2.mo108739S2(r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r9 = r26.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r9, r2)
        L_0x027f:
            java.lang.String r0 = r26.mo108765s2()
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 == 0) goto L_0x0303
            if (r5 == 0) goto L_0x0303
            java.lang.String r0 = r5.f229346f
            boolean r0 = sf0.C77702q0.m93719b(r0)
            if (r0 != 0) goto L_0x0303
            int r0 = r5.f229347g
            if (r0 <= 0) goto L_0x0303
            ob0.n r0 = r1.f217931w
            if (r0 != 0) goto L_0x0303
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r0 = uw2.C78306m.yr0(r0)
            r3 = 0
            java.lang.String r9 = uw2.C78296j.m94584b(r0, r3)
            r2.mo108739S2(r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r10 = r26.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r10, r2)
            long r10 = r26.getMsgId()
            int r12 = r6.f195566e
            java.lang.String r13 = r6.f195562d
            java.lang.String r14 = r6.f195606o
            int r15 = r6.f195594l
            com.tencent.mm.pluginsdk.model.app.d r0 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85066h(r9, r10, r12, r13, r14, r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "mediaId  "
            r3.append(r6)
            java.lang.String r6 = r0.field_mediaSvrId
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r3)
            java.lang.String r3 = r0.field_mediaSvrId
            if (r3 == 0) goto L_0x0303
            ob0.b0 r3 = eb0.C97625j3.m125815e()
            com.tencent.mm.ui.chatting.viewitems.t7$c r6 = new com.tencent.mm.ui.chatting.viewitems.t7$c
            r6.<init>(r0)
            r1.f217931w = r6
            r7 = 221(0xdd, float:3.1E-43)
            r3.mo123455a(r7, r6)
            qg2.p r3 = new qg2.p
            r6 = 1
            r3.<init>((com.tencent.p014mm.pluginsdk.model.app.C72683d) r0, (boolean) r6)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123460f(r3)
        L_0x0303:
            android.widget.Button r0 = r4.f217601f
            com.tencent.mm.ui.chatting.viewitems.t7$d r3 = new com.tencent.mm.ui.chatting.viewitems.t7$d
            r3.<init>(r2, r5)
            r0.setOnClickListener(r3)
            android.view.View r0 = r4.clickArea
            com.tencent.mm.ui.chatting.viewitems.t8 r3 = new com.tencent.mm.ui.chatting.viewitems.t8
            ck3.b r5 = r1.f217930v
            boolean r5 = r5.mo91583x()
            r6 = 0
            r3.<init>(r2, r5, r4, r6)
            r0.setTag(r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 == 0) goto L_0x0333
            android.view.View r0 = r4.clickArea
            ck3.b r2 = r1.f217930v
            com.tencent.mm.ui.chatting.viewitems.i$e r2 = r1.mo103098p(r2)
            r0.setOnLongClickListener(r2)
        L_0x0333:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74235t7.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048189;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}
