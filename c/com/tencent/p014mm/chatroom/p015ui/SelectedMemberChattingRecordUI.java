package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMLoadMoreListView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import o90.C100308d;
import p629ny.C76979h;
import p823sg.C101611g;
import te3.C77915dp3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI */
public class SelectedMemberChattingRecordUI extends MMActivity {

    /* renamed from: n */
    public static final C101611g<Integer, C77915dp3> f195042n = new C100308d(32);

    /* renamed from: d */
    public MMLoadMoreListView f195043d;

    /* renamed from: e */
    public View f195044e;

    /* renamed from: f */
    public View f195045f;

    /* renamed from: g */
    public C67948e f195046g;

    /* renamed from: h */
    public String f195047h;

    /* renamed from: i */
    public String f195048i;

    /* renamed from: j */
    public int f195049j = 0;

    /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$a */
    public class C67943a implements Runnable {

        /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$a$a */
        public class C67944a implements Runnable {
            public C67944a() {
            }

            public void run() {
                try {
                    SelectedMemberChattingRecordUI.this.initView();
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.SelectedMemberChattingRecordUI", "initView failed, exception : " + th.getMessage());
                }
            }
        }

        public C67943a() {
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            int i;
            Class cls = C75700k0.class;
            if (!Util.isNullOrNil(SelectedMemberChattingRecordUI.this.f195048i) && C75592q0.m90764L(SelectedMemberChattingRecordUI.this.f195048i)) {
                SelectedMemberChattingRecordUI.this.f195049j = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Xx0(SelectedMemberChattingRecordUI.this.f195047h);
            } else if (!C75592q0.m90764L(SelectedMemberChattingRecordUI.this.f195048i)) {
                SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = SelectedMemberChattingRecordUI.this;
                C75875l LE = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
                SelectedMemberChattingRecordUI selectedMemberChattingRecordUI2 = SelectedMemberChattingRecordUI.this;
                String str = selectedMemberChattingRecordUI2.f195047h;
                String str2 = selectedMemberChattingRecordUI2.f195048i;
                C72972g4 g4Var = (C72972g4) LE;
                g4Var.getClass();
                String str3 = " SELECT COUNT(*) FROM " + g4Var.hy0(str) + " WHERE" + g4Var.mo101130mL(str) + g4Var.iy0(str) + "AND " + "content" + " LIKE '" + str2 + "%' ";
                Cursor rawQuery = g4Var.f212775p.rawQuery(str3, (String[]) null, 2);
                try {
                    i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
                    rawQuery.close();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e, "", new Object[0]);
                    rawQuery.close();
                    i = 0;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
                Log.m105919d("MicroMsg.MsgInfoStorage", "getMsgCountByMember getCursor talk:%s member:%s,count:%s,[%s]", str, str2, Integer.valueOf(i), str3);
                selectedMemberChattingRecordUI.f195049j = i;
            }
            if (!SelectedMemberChattingRecordUI.this.isFinishing() && !SelectedMemberChattingRecordUI.this.isDestroyed()) {
                SelectedMemberChattingRecordUI.this.runOnUiThread(new C67944a());
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$b */
    public class C67945b implements AdapterView.OnItemClickListener {
        public C67945b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C72963f4 f4Var = (C72963f4) SelectedMemberChattingRecordUI.this.f195046g.getItem(i);
            if (f4Var != null) {
                SelectedMemberChattingRecordUI selectedMemberChattingRecordUI = SelectedMemberChattingRecordUI.this;
                long msgId = f4Var.getMsgId();
                selectedMemberChattingRecordUI.getClass();
                Log.m105925i("MicroMsg.SelectedMemberChattingRecordUI", "[goToChattingUI] msgLocalId:%s", Long.valueOf(msgId));
                C88144b.m109801s(selectedMemberChattingRecordUI, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", selectedMemberChattingRecordUI.f195047h).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId), (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$c */
    public class C67946c implements MMLoadMoreListView.C73175b {
        public C67946c() {
        }

        public void onLoadMore() {
            C67948e eVar = SelectedMemberChattingRecordUI.this.f195046g;
            if (eVar != null) {
                Class cls = C75700k0.class;
                eVar.f195058r -= 16;
                if (!Util.isNullOrNil(SelectedMemberChattingRecordUI.this.f195048i) && C75592q0.m90764L(SelectedMemberChattingRecordUI.this.f195048i)) {
                    eVar.mo7998r(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Bx0(eVar.f195056p, eVar.f195059s - eVar.f195058r));
                } else if (!C75592q0.m90764L(SelectedMemberChattingRecordUI.this.f195048i)) {
                    eVar.mo7998r(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ax0(eVar.f195056p, eVar.f195057q, eVar.f195059s - eVar.f195058r));
                }
                SelectedMemberChattingRecordUI.this.f195046g.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$d */
    public class C67947d implements MenuItem.OnMenuItemClickListener {
        public C67947d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectedMemberChattingRecordUI.this.setResult(0);
            SelectedMemberChattingRecordUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$e */
    public class C67948e extends C6975i1<C72963f4> {

        /* renamed from: o */
        public Context f195055o;

        /* renamed from: p */
        public String f195056p;

        /* renamed from: q */
        public String f195057q;

        /* renamed from: r */
        public int f195058r = -1;

        /* renamed from: s */
        public int f195059s;

        /* renamed from: t */
        public C44661m1 f195060t;

        public C67948e(Context context, String str, String str2, int i) {
            super(context, new C72963f4());
            this.f195055o = context;
            this.f195059s = i;
            this.f195056p = str;
            this.f195057q = str2;
            this.f195060t = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(SelectedMemberChattingRecordUI.this.f195047h);
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C72963f4 f4Var = (C72963f4) obj;
            if (f4Var == null) {
                f4Var = new C72963f4();
            }
            f4Var.convertFrom(cursor);
            return f4Var;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x03a2, code lost:
            r2 = new java.lang.Object[1];
            r2[r7] = r8.mo93550m();
            r13 = r9.getString(com.tencent.p014mm.C0966R.string.f361170hv0, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b3, code lost:
            r2 = new java.lang.Object[1];
            r2[r7] = r8.f195570f;
            r13 = r9.getString(com.tencent.p014mm.C0966R.string.htq, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x03c2, code lost:
            r13 = r8.f195570f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0571, code lost:
            r13 = r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Class<f62.k0> r1 = f62.C75700k0.class
                r2 = 0
                r3 = 0
                if (r18 != 0) goto L_0x004a
                android.content.Context r4 = r0.f24696e
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                r5 = 2131496494(0x7f0c0e2e, float:1.8616554E38)
                android.view.View r4 = r4.inflate(r5, r3, r2)
                com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$f r5 = new com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$f
                r5.<init>()
                r6 = 2131297474(0x7f0904c2, float:1.8212894E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r5.f195062a = r6
                r6 = 2131310284(0x7f0936cc, float:1.8238876E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f195063b = r6
                r6 = 2131309625(0x7f093439, float:1.823754E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f195064c = r6
                r6 = 2131315971(0x7f094d03, float:1.825041E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f195065d = r6
                r4.setTag(r5)
                goto L_0x004c
            L_0x004a:
                r4 = r18
            L_0x004c:
                java.lang.Object r5 = r16.getItem(r17)
                com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
                java.lang.Object r6 = r4.getTag()
                com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$f r6 = (com.tencent.p014mm.chatroom.p015ui.SelectedMemberChattingRecordUI.C67949f) r6
                java.lang.Class<ln.f> r7 = p196ln.C76705f.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                ln.f r7 = (p196ln.C76705f) r7
                android.widget.ImageView r8 = r6.f195062a
                java.lang.String r9 = r0.f195057q
                r7.mo106849z(r8, r9)
                java.lang.String r7 = r0.f195057q
                k40.a r8 = f40.C86709a0.m107533q(r1)
                f62.k0 r8 = (f62.C75700k0) r8
                com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
                com.tencent.mm.storage.z1 r7 = r8.get(r7)
                java.lang.String r8 = r7.mo73969n2()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x0086
                java.lang.String r8 = r7.mo73969n2()
                goto L_0x0099
            L_0x0086:
                com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI r8 = com.tencent.p014mm.chatroom.p015ui.SelectedMemberChattingRecordUI.this
                com.tencent.mm.storage.m1 r9 = r0.f195060t
                java.lang.String r10 = r7.getUsername()
                r8.getClass()
                if (r9 != 0) goto L_0x0095
                r8 = r3
                goto L_0x0099
            L_0x0095:
                java.lang.String r8 = r9.mo69789q2(r10)
            L_0x0099:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r9 == 0) goto L_0x00a3
                java.lang.String r8 = r7.mo62909j3()
            L_0x00a3:
                boolean r9 = r7.mo62927s3()
                if (r9 != 0) goto L_0x00c9
                k40.a r9 = f40.C86709a0.m107533q(r1)
                f62.k0 r9 = (f62.C75700k0) r9
                g62.s r9 = r9.mm0()
                java.lang.String r7 = r7.getUsername()
                com.tencent.mm.storage.a5 r9 = (com.tencent.p014mm.storage.C44651a5) r9
                com.tencent.mm.storage.z4 r7 = r9.mo69630Lo(r7)
                if (r7 == 0) goto L_0x00c9
                java.lang.String r9 = r7.field_conRemark
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x00c9
                java.lang.String r8 = r7.field_conRemark
            L_0x00c9:
                android.widget.TextView r7 = r6.f195063b
                r0.mo93353s(r8, r7)
                java.lang.String r7 = r0.f195057q
                com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI r8 = com.tencent.p014mm.chatroom.p015ui.SelectedMemberChattingRecordUI.this
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r10 = r5.getType()
                java.lang.String r11 = r5.getContent()
                int r12 = r5.mo108769t2()
                r8.getClass()
                com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r11, r3)
                java.lang.String r3 = "decode msg content failed"
                java.lang.String r15 = "MicroMsg.SelectedMemberChattingRecordUI"
                java.lang.String r13 = ""
                r14 = 1
                r2 = 2
                switch(r10) {
                    case -1879048186: goto L_0x0668;
                    case -1879048185: goto L_0x0659;
                    case -1879048183: goto L_0x0659;
                    case -1879048176: goto L_0x0659;
                    case 1: goto L_0x064d;
                    case 3: goto L_0x0645;
                    case 23: goto L_0x0645;
                    case 33: goto L_0x0645;
                    case 34: goto L_0x05d7;
                    case 37: goto L_0x0574;
                    case 42: goto L_0x0504;
                    case 43: goto L_0x04f3;
                    case 47: goto L_0x04ea;
                    case 48: goto L_0x04ca;
                    case 49: goto L_0x034f;
                    case 62: goto L_0x04f3;
                    case 66: goto L_0x0504;
                    case 369098801: goto L_0x033f;
                    case 419430449: goto L_0x02d7;
                    case 436207665: goto L_0x02aa;
                    case 452984881: goto L_0x033f;
                    case 469762097: goto L_0x02aa;
                    case 486539313: goto L_0x04f3;
                    case 503316529: goto L_0x027a;
                    case 520093745: goto L_0x026c;
                    case 754974769: goto L_0x021d;
                    case 771751985: goto L_0x01f9;
                    case 805306417: goto L_0x034f;
                    case 822083633: goto L_0x034f;
                    case 838860849: goto L_0x019c;
                    case 855638065: goto L_0x018c;
                    case 956301361: goto L_0x015c;
                    case 973078577: goto L_0x0153;
                    case 1006633009: goto L_0x019c;
                    case 1023410225: goto L_0x0106;
                    case 1040187441: goto L_0x00f6;
                    case 1090519089: goto L_0x034f;
                    case 1107296305: goto L_0x064d;
                    case 1124073521: goto L_0x034f;
                    case 1140850737: goto L_0x034f;
                    default: goto L_0x00f4;
                }
            L_0x00f4:
                goto L_0x0676
            L_0x00f6:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                java.lang.String r2 = r8.f195570f
                r3 = 0
                r1[r3] = r2
                r2 = 2131834474(0x7f11366a, float:1.930206E38)
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x0106:
                r1 = 2131821532(0x7f1103dc, float:1.927581E38)
                java.lang.String r13 = r9.getString(r1)
                java.lang.Class<ht1.l> r1 = ht1.C60181l.class
                com.tencent.mm.message.g r1 = r8.mo93555w(r1)
                ht1.l r1 = (ht1.C60181l) r1
                if (r1 == 0) goto L_0x0676
                te3.fw2 r2 = r1.f171715b
                if (r2 == 0) goto L_0x0676
                java.lang.String r2 = r2.f183243f
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0676
                te3.fw2 r2 = r1.f171715b
                java.lang.String r2 = r2.f183245h
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x013e
                java.lang.Object[] r2 = new java.lang.Object[r14]
                te3.fw2 r1 = r1.f171715b
                java.lang.String r1 = r1.f183243f
                r3 = 0
                r2[r3] = r1
                r1 = 2131834480(0x7f113670, float:1.9302072E38)
                java.lang.String r1 = r9.getString(r1, r2)
                goto L_0x0142
            L_0x013e:
                te3.fw2 r1 = r1.f171715b
                java.lang.String r1 = r1.f183245h
            L_0x0142:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                r2.append(r1)
                java.lang.String r13 = r2.toString()
                goto L_0x0676
            L_0x0153:
                r1 = 2131834481(0x7f113671, float:1.9302074E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x015c:
                r1 = 2131821532(0x7f1103dc, float:1.927581E38)
                java.lang.String r13 = r9.getString(r1)
                java.lang.Class<ht1.d> r1 = ht1.C60158d.class
                com.tencent.mm.message.g r1 = r8.mo93555w(r1)
                ht1.d r1 = (ht1.C60158d) r1
                if (r1 == 0) goto L_0x0676
                te3.nk1 r2 = r1.f171700b
                java.lang.String r2 = r2.f184476e
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0676
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                te3.nk1 r1 = r1.f171700b
                java.lang.String r1 = r1.f184476e
                r2.append(r1)
                java.lang.String r13 = r2.toString()
                goto L_0x0676
            L_0x018c:
                r1 = 2131834482(0x7f113672, float:1.9302076E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r7 = 0
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x019c:
                r1 = 2131821532(0x7f1103dc, float:1.927581E38)
                java.lang.String r13 = r9.getString(r1)
                java.lang.Class<ht1.k> r1 = ht1.C60178k.class
                com.tencent.mm.message.g r1 = r8.mo93555w(r1)
                ht1.k r1 = (ht1.C60178k) r1
                if (r1 == 0) goto L_0x0676
                te3.tk1 r2 = r1.f171714b
                if (r2 == 0) goto L_0x0676
                java.lang.String r2 = r2.f185603d
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0676
                te3.tk1 r2 = r1.f171714b
                int r2 = r2.f185604e
                if (r2 != r14) goto L_0x01e4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r7 = 2131834460(0x7f11365c, float:1.930203E38)
                java.lang.Object[] r8 = new java.lang.Object[r14]
                te3.tk1 r1 = r1.f171714b
                java.lang.String r1 = r1.f185603d
                r9 = 0
                r8[r9] = r1
                java.lang.String r1 = r3.getString(r7, r8)
                r2.append(r1)
                java.lang.String r13 = r2.toString()
                goto L_0x0676
            L_0x01e4:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                te3.tk1 r1 = r1.f171714b
                java.lang.String r1 = r1.f185603d
                r2.append(r1)
                java.lang.String r13 = r2.toString()
                goto L_0x0676
            L_0x01f9:
                java.lang.Class<ht1.e> r1 = ht1.C60161e.class
                com.tencent.mm.message.g r1 = r8.mo93555w(r1)
                ht1.e r1 = (ht1.C60161e) r1
                if (r1 == 0) goto L_0x0676
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 2131821535(0x7f1103df, float:1.9275816E38)
                java.lang.String r3 = r9.getString(r3)
                r2.append(r3)
                java.lang.String r1 = r1.f171704e
                r2.append(r1)
                java.lang.String r13 = r2.toString()
                goto L_0x0676
            L_0x021d:
                r1 = 2131821532(0x7f1103dc, float:1.927581E38)
                java.lang.String r13 = r9.getString(r1)
                java.lang.Class<ht1.f> r1 = ht1.C60166f.class
                com.tencent.mm.message.g r1 = r8.mo93555w(r1)
                ht1.f r1 = (ht1.C60166f) r1
                if (r1 == 0) goto L_0x0676
                te3.rk1 r2 = r1.f171710b
                if (r2 == 0) goto L_0x0676
                java.lang.String r2 = r1.mo85179g()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0676
                te3.rk1 r2 = r1.f171710b
                java.lang.String r2 = r2.f185187h
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0257
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r1 = r1.mo85179g()
                r3 = 0
                r2[r3] = r1
                r1 = 2131834480(0x7f113670, float:1.9302072E38)
                java.lang.String r1 = r9.getString(r1, r2)
                goto L_0x025b
            L_0x0257:
                te3.rk1 r1 = r1.f171710b
                java.lang.String r1 = r1.f185187h
            L_0x025b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                r2.append(r1)
                java.lang.String r13 = r2.toString()
                goto L_0x0676
            L_0x026c:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                r7 = 0
                r1[r7] = r13
                r2 = 2131834442(0x7f11364a, float:1.9301994E38)
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x027a:
                r7 = 0
                if (r8 != 0) goto L_0x0282
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
                goto L_0x0676
            L_0x0282:
                if (r12 != r14) goto L_0x0297
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r2 = r8.f195596l1
                r1[r7] = r2
                java.lang.String r2 = r8.f195652z1
                r1[r14] = r2
                r10 = 2131834441(0x7f113649, float:1.9301992E38)
                java.lang.String r13 = r9.getString(r10, r1)
                goto L_0x0676
            L_0x0297:
                r10 = 2131834441(0x7f113649, float:1.9301992E38)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r2 = r8.f195596l1
                r1[r7] = r2
                java.lang.String r2 = r8.f195648y1
                r1[r14] = r2
                java.lang.String r13 = r9.getString(r10, r1)
                goto L_0x0676
            L_0x02aa:
                r7 = 0
                r10 = 2131834441(0x7f113649, float:1.9301992E38)
                if (r8 != 0) goto L_0x02b5
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
                goto L_0x0676
            L_0x02b5:
                if (r12 != r14) goto L_0x02c7
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r2 = r8.f195596l1
                r1[r7] = r2
                java.lang.String r2 = r8.f195584i1
                r1[r14] = r2
                java.lang.String r13 = r9.getString(r10, r1)
                goto L_0x0676
            L_0x02c7:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r2 = r8.f195596l1
                r1[r7] = r2
                java.lang.String r2 = r8.f195580h1
                r1[r14] = r2
                java.lang.String r13 = r9.getString(r10, r1)
                goto L_0x0676
            L_0x02d7:
                r1 = 2131834477(0x7f11366d, float:1.9302065E38)
                java.lang.String r13 = r9.getString(r1)
                if (r8 == 0) goto L_0x0676
                if (r12 != r14) goto L_0x02e4
                r2 = 1
                goto L_0x02e5
            L_0x02e4:
                r2 = 0
            L_0x02e5:
                int r1 = r8.f195489G0
                if (r1 == r14) goto L_0x032b
                r3 = 21
                if (r1 == r3) goto L_0x032b
                r3 = 3
                if (r1 == r3) goto L_0x0317
                r3 = 4
                if (r1 == r3) goto L_0x0303
                r3 = 23
                if (r1 == r3) goto L_0x0317
                r3 = 24
                if (r1 == r3) goto L_0x0303
                java.lang.String r1 = r8.f195570f
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                goto L_0x0571
            L_0x0303:
                if (r2 == 0) goto L_0x030e
                r1 = 2131822011(0x7f1105bb, float:1.9276781E38)
                java.lang.String r1 = r9.getString(r1)
                goto L_0x0571
            L_0x030e:
                r1 = 2131822006(0x7f1105b6, float:1.9276771E38)
                java.lang.String r1 = r9.getString(r1)
                goto L_0x0571
            L_0x0317:
                if (r2 == 0) goto L_0x0322
                r1 = 2131822008(0x7f1105b8, float:1.9276775E38)
                java.lang.String r1 = r9.getString(r1)
                goto L_0x0571
            L_0x0322:
                r1 = 2131822005(0x7f1105b5, float:1.927677E38)
                java.lang.String r1 = r9.getString(r1)
                goto L_0x0571
            L_0x032b:
                if (r2 == 0) goto L_0x0336
                r1 = 2131822007(0x7f1105b7, float:1.9276773E38)
                java.lang.String r1 = r9.getString(r1)
                goto L_0x0571
            L_0x0336:
                r1 = 2131822013(0x7f1105bd, float:1.9276785E38)
                java.lang.String r1 = r9.getString(r1)
                goto L_0x0571
            L_0x033f:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                java.lang.String r2 = r8.f195570f
                r3 = 0
                r1[r3] = r2
                r2 = 2131834442(0x7f11364a, float:1.9301994E38)
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x034f:
                if (r8 != 0) goto L_0x0356
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
                goto L_0x0676
            L_0x0356:
                int r1 = r8.f195582i
                r2 = 97
                if (r1 == r2) goto L_0x04c1
                r2 = 98
                if (r1 == r2) goto L_0x04b8
                switch(r1) {
                    case 1: goto L_0x03c2;
                    case 2: goto L_0x0399;
                    case 3: goto L_0x0389;
                    case 4: goto L_0x0379;
                    case 5: goto L_0x0377;
                    case 6: goto L_0x0375;
                    case 7: goto L_0x0676;
                    case 8: goto L_0x036c;
                    default: goto L_0x0363;
                }
            L_0x0363:
                r7 = 0
                switch(r1) {
                    case 15: goto L_0x04c1;
                    case 17: goto L_0x03f6;
                    case 19: goto L_0x03e7;
                    case 33: goto L_0x03c6;
                    case 36: goto L_0x03c6;
                    case 44: goto L_0x03c6;
                    case 48: goto L_0x03c6;
                    case 53: goto L_0x03c2;
                    case 57: goto L_0x03c2;
                    case 74: goto L_0x03b3;
                    case 101: goto L_0x03a2;
                    default: goto L_0x0367;
                }
            L_0x0367:
                switch(r1) {
                    case 24: goto L_0x040e;
                    case 25: goto L_0x0405;
                    case 26: goto L_0x04c1;
                    case 27: goto L_0x04c1;
                    default: goto L_0x036a;
                }
            L_0x036a:
                goto L_0x0676
            L_0x036c:
                r1 = 2131821468(0x7f11039c, float:1.927568E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x0375:
                r7 = 0
                goto L_0x03b3
            L_0x0377:
                r7 = 0
                goto L_0x03a2
            L_0x0379:
                r1 = 2131834497(0x7f113681, float:1.9302106E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r7 = 0
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x0389:
                r7 = 0
                java.lang.Object[] r1 = new java.lang.Object[r14]
                java.lang.String r2 = r8.f195570f
                r1[r7] = r2
                r2 = 2131834474(0x7f11366a, float:1.930206E38)
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x0399:
                r1 = 2131821636(0x7f110444, float:1.927602E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x03a2:
                r1 = 2131834496(0x7f113680, float:1.9302104E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.mo93550m()
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x03b3:
                r1 = 2131834449(0x7f113651, float:1.9302009E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x03c2:
                java.lang.String r13 = r8.f195570f
                goto L_0x0676
            L_0x03c6:
                java.lang.String r1 = r8.f195570f
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                r2 = 2131834435(0x7f113643, float:1.930198E38)
                if (r1 == 0) goto L_0x03db
                java.lang.Object[] r1 = new java.lang.Object[r14]
                r1[r7] = r13
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x03db:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r1[r7] = r3
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x03e7:
                r1 = 2131834476(0x7f11366c, float:1.9302063E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x03f6:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                java.lang.String r2 = r8.f195570f
                r1[r7] = r2
                r2 = 2131834468(0x7f113664, float:1.9302047E38)
                java.lang.String r13 = r9.getString(r2, r1)
                goto L_0x0676
            L_0x0405:
                r1 = 2131821453(0x7f11038d, float:1.927565E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x040e:
                java.lang.String r1 = r8.f195571f0
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x041f
                java.lang.String r1 = "xml is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
                r3 = 0
                goto L_0x04a0
            L_0x041f:
                int r2 = r1.hashCode()
                sg.g<java.lang.Integer, te3.dp3> r3 = com.tencent.p014mm.chatroom.p015ui.SelectedMemberChattingRecordUI.f195042n
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                q90.d r3 = (q90.C101062d) r3
                java.lang.Object r7 = r3.get(r7)
                te3.dp3 r7 = (te3.C77915dp3) r7
                if (r7 == 0) goto L_0x043a
                java.lang.String r1 = "get record msg data from cache"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
            L_0x0438:
                r3 = r7
                goto L_0x04a0
            L_0x043a:
                java.lang.String r7 = r1.trim()
                java.lang.String r8 = "<recordinfo>"
                boolean r7 = r7.startsWith(r8)
                java.lang.String r10 = "recordinfo"
                if (r7 == 0) goto L_0x044e
                r7 = 0
                java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r10, r7)
                goto L_0x0467
            L_0x044e:
                r7 = 0
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r8)
                r11.append(r1)
                java.lang.String r8 = "</recordinfo>"
                r11.append(r8)
                java.lang.String r8 = r11.toString()
                java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r10, r7)
            L_0x0467:
                if (r8 != 0) goto L_0x0475
                java.lang.Object[] r2 = new java.lang.Object[r14]
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "values is null: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r2)
                goto L_0x0438
            L_0x0475:
                te3.dp3 r1 = new te3.dp3
                r1.<init>()
                java.lang.String r7 = ".recordinfo.title"
                java.lang.Object r7 = r8.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r1.f227153d = r7
                java.lang.String r7 = ".recordinfo.desc"
                java.lang.Object r7 = r8.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r1.f227154e = r7
                java.lang.String r7 = ".recordinfo.favusername"
                java.lang.Object r7 = r8.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r1.f227156g = r7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.put(r2, r1)
                r3 = r1
            L_0x04a0:
                if (r3 != 0) goto L_0x04a4
                r1 = r13
                goto L_0x04a6
            L_0x04a4:
                java.lang.String r1 = r3.f227154e
            L_0x04a6:
                r2 = 2131834475(0x7f11366b, float:1.9302061E38)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r13)
                r7 = 0
                r3[r7] = r1
                java.lang.String r13 = r9.getString(r2, r3)
                goto L_0x0676
            L_0x04b8:
                r1 = 2131820943(0x7f11018f, float:1.9274615E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x04c1:
                r1 = 2131821467(0x7f11039b, float:1.9275678E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x04ca:
                k40.a r1 = f40.C86709a0.m107533q(r1)
                f62.k0 r1 = (f62.C75700k0) r1
                g62.l r1 = r1.mo96095LE()
                com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
                com.tencent.mm.storage.f4$e r1 = r1.Tx0(r11)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r1 = r1.f212707e
                r3 = 0
                r2[r3] = r1
                r1 = 2131834468(0x7f113664, float:1.9302047E38)
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x04ea:
                r1 = 2131821467(0x7f11039b, float:1.9275678E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x04f3:
                r1 = 62
                if (r1 != r10) goto L_0x04fb
                r1 = 2131821692(0x7f11047c, float:1.9276134E38)
                goto L_0x04fe
            L_0x04fb:
                r1 = 2131821728(0x7f1104a0, float:1.9276207E38)
            L_0x04fe:
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x0504:
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x0676
                java.lang.String r3 = eb0.C75604z3.m90847s(r11)
                boolean r8 = android.text.TextUtils.isEmpty(r3)
                if (r8 == 0) goto L_0x0519
                goto L_0x051a
            L_0x0519:
                r7 = r3
            L_0x051a:
                k40.a r3 = f40.C86709a0.m107533q(r1)
                f62.k0 r3 = (f62.C75700k0) r3
                g62.l r3 = r3.mo96095LE()
                com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
                com.tencent.mm.storage.f4$b r3 = r3.Rv0(r11)
                k40.a r1 = f40.C86709a0.m107533q(r1)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
                com.tencent.mm.storage.z1 r1 = r1.get(r7)
                java.lang.String r1 = r1.mo62898f()
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
                if (r7 == 0) goto L_0x054a
                java.util.List r7 = eb0.C45612m0.m50700q(r1)
                java.lang.String r1 = eb0.C45612m0.m50693j(r7, r1)
            L_0x054a:
                if (r12 != r14) goto L_0x055f
                r7 = 2131830305(0x7f112621, float:1.9293604E38)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r8 = 0
                r2[r8] = r1
                java.lang.String r1 = r3.mo101025b()
                r2[r14] = r1
                java.lang.String r1 = r9.getString(r7, r2)
                goto L_0x0571
            L_0x055f:
                r8 = 0
                r7 = 2131830306(0x7f112622, float:1.9293606E38)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r8] = r1
                java.lang.String r1 = r3.mo101025b()
                r2[r14] = r1
                java.lang.String r1 = r9.getString(r7, r2)
            L_0x0571:
                r13 = r1
                goto L_0x0676
            L_0x0574:
                if (r11 == 0) goto L_0x0676
                int r1 = r11.length()
                if (r1 <= 0) goto L_0x0676
                com.tencent.mm.storage.f4$h r1 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r11)
                java.lang.String r2 = r1.f212737a
                if (r2 == 0) goto L_0x0676
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0676
                int r2 = r1.f212744h
                r3 = 18
                if (r2 == r3) goto L_0x05c6
                switch(r2) {
                    case 22: goto L_0x05b5;
                    case 23: goto L_0x05b5;
                    case 24: goto L_0x05b5;
                    case 25: goto L_0x05a4;
                    case 26: goto L_0x05b5;
                    case 27: goto L_0x05b5;
                    case 28: goto L_0x05b5;
                    case 29: goto L_0x05b5;
                    default: goto L_0x0593;
                }
            L_0x0593:
                r7 = 0
                r2 = 2131830396(0x7f11267c, float:1.9293788E38)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                java.lang.String r1 = r1.mo101038e()
                r3[r7] = r1
                java.lang.String r1 = r9.getString(r2, r3)
                goto L_0x0571
            L_0x05a4:
                r2 = 2131830304(0x7f112620, float:1.9293602E38)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                java.lang.String r1 = r1.mo101038e()
                r7 = 0
                r3[r7] = r1
                java.lang.String r1 = r9.getString(r2, r3)
                goto L_0x0571
            L_0x05b5:
                r7 = 0
                r2 = 2131830387(0x7f112673, float:1.929377E38)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                java.lang.String r1 = r1.mo101038e()
                r3[r7] = r1
                java.lang.String r1 = r9.getString(r2, r3)
                goto L_0x0571
            L_0x05c6:
                r7 = 0
                r2 = 2131830377(0x7f112669, float:1.929375E38)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                java.lang.String r1 = r1.mo101038e()
                r3[r7] = r1
                java.lang.String r1 = r9.getString(r2, r3)
                goto L_0x0571
            L_0x05d7:
                r7 = 0
                java.lang.String r1 = "\n"
                boolean r1 = r11.endsWith(r1)     // Catch:{ Exception -> 0x0620 }
                if (r1 == 0) goto L_0x05eb
                int r1 = r11.length()     // Catch:{ Exception -> 0x0620 }
                int r1 = r1 - r14
                r3 = 0
                java.lang.String r11 = r11.substring(r3, r1)     // Catch:{ Exception -> 0x0620 }
            L_0x05eb:
                java.lang.String r1 = ":"
                java.lang.String[] r1 = r11.split(r1)     // Catch:{ Exception -> 0x0620 }
                int r3 = r1.length     // Catch:{ Exception -> 0x0620 }
                r10 = 4
                if (r3 != r10) goto L_0x0600
                r3 = 0
                r10 = r1[r3]     // Catch:{ Exception -> 0x0620 }
                boolean r3 = com.tencent.p014mm.storage.C72996z1.m85811N4(r10)     // Catch:{ Exception -> 0x0620 }
                if (r3 == 0) goto L_0x0600
                r3 = 1
                goto L_0x0601
            L_0x0600:
                r3 = 0
            L_0x0601:
                int r10 = r1.length     // Catch:{ Exception -> 0x0620 }
                if (r10 <= r3) goto L_0x0606
                r10 = r1[r3]     // Catch:{ Exception -> 0x0620 }
            L_0x0606:
                int r10 = r1.length     // Catch:{ Exception -> 0x0620 }
                int r11 = r3 + 1
                if (r10 <= r11) goto L_0x0612
                r10 = r1[r11]     // Catch:{ Exception -> 0x0620 }
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r10, r7)     // Catch:{ Exception -> 0x0620 }
                goto L_0x0613
            L_0x0612:
                r10 = r7
            L_0x0613:
                int r12 = r1.length     // Catch:{ Exception -> 0x0620 }
                int r3 = r3 + r2
                if (r12 <= r3) goto L_0x061e
                r1 = r1[r3]     // Catch:{ Exception -> 0x0620 }
                java.lang.String r2 = "1"
                r1.equals(r2)     // Catch:{ Exception -> 0x0620 }
            L_0x061e:
                r7 = r10
                goto L_0x0627
            L_0x0620:
                java.lang.String r1 = "MicroMsg.VoiceContent"
                java.lang.String r2 = "VoiceContent parse failed."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x0627:
                r1 = 2131834501(0x7f113685, float:1.9302114E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.Class<dn.t> r3 = p492dn.C75415t.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                dn.t r3 = (p492dn.C75415t) r3
                float r3 = r3.F30(r7)
                int r3 = (int) r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r7 = 0
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x0645:
                r1 = 2131821636(0x7f110444, float:1.927602E38)
                java.lang.String r13 = r9.getString(r1)
                goto L_0x0676
            L_0x064d:
                java.lang.String r1 = ":\n"
                int r1 = r11.indexOf(r1)
                int r1 = r1 + r14
                java.lang.String r13 = r11.substring(r1)
                goto L_0x0676
            L_0x0659:
                r1 = 2131834434(0x7f113642, float:1.9301978E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r7 = 0
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
                goto L_0x0676
            L_0x0668:
                r7 = 0
                r1 = 2131834483(0x7f113673, float:1.9302078E38)
                java.lang.Object[] r2 = new java.lang.Object[r14]
                java.lang.String r3 = r8.f195570f
                r2[r7] = r3
                java.lang.String r13 = r9.getString(r1, r2)
            L_0x0676:
                java.lang.String r1 = r13.trim()
                android.widget.TextView r2 = r6.f195064c
                r0.mo93353s(r1, r2)
                com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI r1 = com.tencent.p014mm.chatroom.p015ui.SelectedMemberChattingRecordUI.this
                long r2 = r5.getCreateTime()
                java.lang.CharSequence r1 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r1, r2, r14)
                android.widget.TextView r2 = r6.f195065d
                r0.mo93353s(r1, r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.SelectedMemberChattingRecordUI.C67948e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            Class cls = C75700k0.class;
            int i = this.f195058r;
            if (i < 0 || i > this.f195059s) {
                this.f195058r = this.f195059s - 16;
            }
            if (!Util.isNullOrNil(SelectedMemberChattingRecordUI.this.f195048i) && C75592q0.m90764L(SelectedMemberChattingRecordUI.this.f195048i)) {
                mo7998r(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Bx0(this.f195056p, this.f195059s - this.f195058r));
            } else if (!C75592q0.m90764L(SelectedMemberChattingRecordUI.this.f195048i)) {
                mo7998r(((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ax0(this.f195056p, this.f195057q, this.f195059s - this.f195058r));
            }
        }

        /* renamed from: s */
        public boolean mo93353s(CharSequence charSequence, TextView textView) {
            if (charSequence == null || charSequence.length() == 0) {
                textView.setVisibility(8);
                return false;
            }
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(textView.getContext(), charSequence));
            textView.setVisibility(0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI$f */
    public static class C67949f {

        /* renamed from: a */
        public ImageView f195062a;

        /* renamed from: b */
        public TextView f195063b;

        /* renamed from: c */
        public TextView f195064c;

        /* renamed from: d */
        public TextView f195065d;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bw6;
    }

    public void initView() {
        super.initView();
        View view = this.f195045f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        MMLoadMoreListView mMLoadMoreListView = (MMLoadMoreListView) findViewById(C0966R.C0970id.gri);
        this.f195043d = mMLoadMoreListView;
        mMLoadMoreListView.mo101731g();
        C67948e eVar = new C67948e(this, this.f195047h, this.f195048i, this.f195049j);
        this.f195046g = eVar;
        this.f195043d.setAdapter(eVar);
        View findViewById = findViewById(C0966R.C0970id.j_d);
        this.f195044e = findViewById;
        if (this.f195049j == 0) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f195043d.setVisibility(8);
        }
        this.f195043d.setOnItemClickListener(new C67945b());
        this.f195043d.setOnLoadMoreListener(new C67946c());
        setBackBtn(new C67947d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SelectedMemberChattingRecordUI", "[onCreate]");
        this.f195047h = getIntent().getStringExtra("RoomInfo_Id");
        this.f195048i = getIntent().getStringExtra("room_member");
        Log.m105925i("MicroMsg.SelectedMemberChattingRecordUI", "roomId:%s", this.f195047h);
        setMMTitle(Util.nullAsNil(getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE)));
        this.f195045f = findViewById(C0966R.C0970id.j_e);
        ((C119157j) C119157j.f356862d).mo183884o(new C67943a());
    }
}
