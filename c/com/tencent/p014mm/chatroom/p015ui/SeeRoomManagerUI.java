package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import hc0.C20937c;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nr3.C89059e;
import ob0.C89132b;
import p148ei.C7660a;
import p203mi.C47034b;
import p203mi.C47037e;
import p203mi.C47038f;
import p203mi.C47039g;
import p788aj.C39608b;
import qo3.C89779i0;
import te3.C50069k20;
import te3.C50487n3;
import te3.C52055y2;
import te3.C52203z20;

/* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI */
public class SeeRoomManagerUI extends MMActivity implements MStorage.IOnStorageChange {

    /* renamed from: i */
    public static final /* synthetic */ int f108173i = 0;

    /* renamed from: d */
    public GridView f108174d;

    /* renamed from: e */
    public C44661m1 f108175e;

    /* renamed from: f */
    public String f108176f;

    /* renamed from: g */
    public C40229i f108177g;

    /* renamed from: h */
    public C89779i0 f108178h;

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$a */
    public class C1194a implements View.OnTouchListener {
        public C1194a(SeeRoomManagerUI seeRoomManagerUI) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeRoomManagerUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/chatroom/ui/SeeRoomManagerUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$c */
    public class C1195c implements MenuItem.OnMenuItemClickListener {
        public C1195c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SeeRoomManagerUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$b */
    public class C40223b implements Runnable {
        public C40223b() {
        }

        public void run() {
            int dimension = (int) (SeeRoomManagerUI.this.getResources().getDimension(C0966R.dimen.f3627k) + SeeRoomManagerUI.this.getResources().getDimension(C0966R.dimen.f3919iy) + SeeRoomManagerUI.this.getResources().getDimension(C0966R.dimen.f3962lk));
            if (SeeRoomManagerUI.this.f108177g.getCount() / 4 > 0) {
                dimension *= (SeeRoomManagerUI.this.f108177g.getCount() / 4) + 1;
            }
            SeeRoomManagerUI.this.f108174d.setLayoutParams(new LinearLayout.LayoutParams(SeeRoomManagerUI.this.f108174d.getWidth(), dimension));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$d */
    public class C40224d implements C87581a<Void, C89132b.C89134c<C52055y2>> {

        /* renamed from: a */
        public final /* synthetic */ LinkedList f108180a;

        public C40224d(LinkedList linkedList) {
            this.f108180a = linkedList;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C89779i0 i0Var = SeeRoomManagerUI.this.f108178h;
            if (i0Var != null && i0Var.isShowing()) {
                SeeRoomManagerUI.this.f108178h.dismiss();
            }
            C7660a a = C7660a.m7782a(cVar.f256795c);
            if (a != null) {
                a.mo8792b(SeeRoomManagerUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                SeeRoomManagerUI.m43259I7(SeeRoomManagerUI.this, this.f108180a);
                SeeRoomManagerUI.this.f108177g.notifyDataSetChanged();
            } else if (cVar.f256797e.getType() == 889) {
                Log.m105925i("MicroMsg.SeeRoomManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 774, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
                C76879j.m92748s(SeeRoomManagerUI.this.getContext(), Util.nullAs(cVar.f256795c, SeeRoomManagerUI.this.getString(C0966R.string.f7388eu)), SeeRoomManagerUI.this.getString(C0966R.string.a3h));
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$e */
    public class C40225e implements C87581a<Void, C89132b.C89134c<C50487n3>> {

        /* renamed from: a */
        public final /* synthetic */ LinkedList f108182a;

        public C40225e(LinkedList linkedList) {
            this.f108182a = linkedList;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C89779i0 i0Var = SeeRoomManagerUI.this.f108178h;
            if (i0Var != null && i0Var.isShowing()) {
                SeeRoomManagerUI.this.f108178h.dismiss();
            }
            C7660a a = C7660a.m7782a(cVar.f256795c);
            if (a != null) {
                a.mo8792b(SeeRoomManagerUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                SeeRoomManagerUI.m43259I7(SeeRoomManagerUI.this, this.f108182a);
                SeeRoomManagerUI.this.f108177g.notifyDataSetChanged();
            } else if (cVar.f256797e.getType() == 776) {
                Log.m105925i("MicroMsg.SeeRoomManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 774, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
                C76879j.m92748s(SeeRoomManagerUI.this.getContext(), Util.nullAs(cVar.f256795c, SeeRoomManagerUI.this.getString(C0966R.string.f7388eu)), SeeRoomManagerUI.this.getString(C0966R.string.a3h));
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$f */
    public class C40226f implements C87581a<Void, C89132b.C89134c<C50069k20>> {

        /* renamed from: a */
        public final /* synthetic */ LinkedList f108184a;

        public C40226f(LinkedList linkedList) {
            this.f108184a = linkedList;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C89779i0 i0Var = SeeRoomManagerUI.this.f108178h;
            if (i0Var != null && i0Var.isShowing()) {
                SeeRoomManagerUI.this.f108178h.dismiss();
            }
            C7660a a = C7660a.m7782a(cVar.f256795c);
            if (a != null) {
                a.mo8792b(SeeRoomManagerUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                SeeRoomManagerUI.m43258H7(SeeRoomManagerUI.this, this.f108184a);
                SeeRoomManagerUI.this.f108177g.notifyDataSetChanged();
            } else if (cVar.f256797e.getType() == 259) {
                Log.m105925i("MicroMsg.SeeRoomManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 774, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
                C76879j.m92748s(SeeRoomManagerUI.this.getContext(), SeeRoomManagerUI.this.getString(C0966R.string.bxw), SeeRoomManagerUI.this.getString(C0966R.string.a3h));
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$g */
    public class C40227g implements C87581a<Void, C89132b.C89134c<C52203z20>> {

        /* renamed from: a */
        public final /* synthetic */ LinkedList f108186a;

        public C40227g(LinkedList linkedList) {
            this.f108186a = linkedList;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C89779i0 i0Var = SeeRoomManagerUI.this.f108178h;
            if (i0Var != null && i0Var.isShowing()) {
                SeeRoomManagerUI.this.f108178h.dismiss();
            }
            C7660a a = C7660a.m7782a(cVar.f256795c);
            if (a != null) {
                a.mo8792b(SeeRoomManagerUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                SeeRoomManagerUI.m43258H7(SeeRoomManagerUI.this, this.f108186a);
                SeeRoomManagerUI.this.f108177g.notifyDataSetChanged();
            } else if (cVar.f256797e.getType() == 3677) {
                Log.m105925i("MicroMsg.SeeRoomManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 774, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
                C76879j.m92748s(SeeRoomManagerUI.this.getContext(), SeeRoomManagerUI.this.getString(C0966R.string.bxw), SeeRoomManagerUI.this.getString(C0966R.string.a3h));
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$h */
    public class C40228h {

        /* renamed from: a */
        public int f108188a;

        /* renamed from: b */
        public C72996z1 f108189b;

        public C40228h(SeeRoomManagerUI seeRoomManagerUI, int i, C72996z1 z1Var) {
            this.f108188a = i;
            this.f108189b = z1Var;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$i */
    public class C40229i extends BaseAdapter {

        /* renamed from: d */
        public List<C40228h> f108190d;

        /* renamed from: e */
        public Context f108191e;

        /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$i$a */
        public class C40230a implements Runnable {
            public C40230a() {
            }

            public void run() {
                int dimension = (int) (SeeRoomManagerUI.this.getResources().getDimension(C0966R.dimen.f3627k) + SeeRoomManagerUI.this.getResources().getDimension(C0966R.dimen.f3919iy) + SeeRoomManagerUI.this.getResources().getDimension(C0966R.dimen.f3962lk));
                if (SeeRoomManagerUI.this.f108177g.getCount() / 4 > 0) {
                    dimension *= (SeeRoomManagerUI.this.f108177g.getCount() / 4) + 1;
                }
                SeeRoomManagerUI.this.f108174d.setLayoutParams(new LinearLayout.LayoutParams(SeeRoomManagerUI.this.f108174d.getWidth(), dimension));
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$i$b */
        public class C40231b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f108194d;

            public C40231b(int i) {
                this.f108194d = i;
            }

            public void onClick(View view) {
                C44673z4 Lo;
                C44673z4 Lo2;
                Class cls = C75700k0.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeRoomManagerUI$ManagerAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i = ((C40228h) ((ArrayList) C40229i.this.f108190d).get(this.f108194d)).f108188a;
                if (i == 1) {
                    C72996z1 z1Var = ((C40228h) ((ArrayList) C40229i.this.f108190d).get(this.f108194d)).f108189b;
                    SeeRoomManagerUI seeRoomManagerUI = SeeRoomManagerUI.this;
                    String username = z1Var.getUsername();
                    C40229i iVar = C40229i.this;
                    iVar.getClass();
                    String n2 = !Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.mo73969n2() : SeeRoomManagerUI.this.f108175e.mo69789q2(z1Var.getUsername());
                    if (Util.isNullOrNil(n2)) {
                        n2 = z1Var.mo62909j3();
                    }
                    if (!z1Var.mo62927s3() && (Lo2 = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(z1Var.getUsername())) != null && !Util.isNullOrNil(Lo2.field_conRemark)) {
                        n2 = Lo2.field_conRemark;
                    }
                    String nickname = z1Var.getNickname();
                    int i2 = SeeRoomManagerUI.f108173i;
                    seeRoomManagerUI.getClass();
                    if (Util.isNullOrNil(n2) && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(username)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                        n2 = Lo.field_conRemark;
                    }
                    if (!Util.isNullOrNil(username)) {
                        Intent intent = new Intent();
                        intent.putExtra("Contact_User", username);
                        intent.putExtra("Contact_RemarkName", n2);
                        C44661m1 m1Var = seeRoomManagerUI.f108175e;
                        if (m1Var != null) {
                            intent.putExtra("Contact_RoomNickname", m1Var.mo69789q2(username));
                        }
                        intent.putExtra("Contact_Nick", nickname);
                        intent.putExtra("Contact_RoomMember", true);
                        intent.putExtra("room_name", seeRoomManagerUI.f108176f);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(username);
                        if (z1Var2 != null && ((int) z1Var2.f108320R1) > 0 && z1Var2.mo62927s3()) {
                            SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                            SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                            aVar.f9503a = intent;
                            aVar.f9504b = username;
                            setLocalQQMobileEvent.publish();
                        }
                        if (z1Var2 != null && z1Var2.mo62916m3()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.kvStat(10298, z1Var2.getUsername() + "," + 14);
                        }
                        intent.putExtra("Contact_Scene", 96);
                        intent.putExtra("Is_RoomOwner", true);
                        intent.putExtra("Contact_ChatRoomId", seeRoomManagerUI.f108176f);
                        C88144b.m109791i(seeRoomManagerUI, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                    }
                } else if (i == 2) {
                    Intent intent2 = new Intent(SeeRoomManagerUI.this, SelectAddRoomManagerUI.class);
                    intent2.putExtra("RoomInfo_Id", SeeRoomManagerUI.this.f108176f);
                    SeeRoomManagerUI.this.startActivityForResult(intent2, 0);
                } else if (i == 3) {
                    Intent intent3 = new Intent(SeeRoomManagerUI.this, SelectDelRoomManagerUI.class);
                    intent3.putExtra("RoomInfo_Id", SeeRoomManagerUI.this.f108176f);
                    SeeRoomManagerUI seeRoomManagerUI2 = SeeRoomManagerUI.this;
                    seeRoomManagerUI2.getClass();
                    LinkedList linkedList = new LinkedList();
                    Iterator it = ((ArrayList) seeRoomManagerUI2.f108177g.f108190d).iterator();
                    while (it.hasNext()) {
                        C40228h hVar = (C40228h) it.next();
                        if (hVar.f108188a == 1) {
                            linkedList.add(hVar.f108189b.getUsername());
                        }
                    }
                    intent3.putExtra("RoomManagers", Util.listToString(linkedList, ","));
                    SeeRoomManagerUI.this.startActivityForResult(intent3, 1);
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomManagerUI$ManagerAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C40229i(Context context) {
            ArrayList arrayList = new ArrayList();
            this.f108190d = arrayList;
            this.f108191e = context;
            arrayList.clear();
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(Util.nullAsNil(SeeRoomManagerUI.this.f108176f));
            SeeRoomManagerUI.this.f108175e = Lo;
            if (Lo != null) {
                for (String next : Lo.mo69790r2()) {
                    if (SeeRoomManagerUI.this.f108175e.mo69793u2(next)) {
                        Log.m105925i("MicroMsg.SeeRoomManagerUI", "[resetData] Room Manager:%s", next);
                        this.f108190d.add(new C40228h(SeeRoomManagerUI.this, 1, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next)));
                    }
                }
                if (C75592q0.m90789s().equals(SeeRoomManagerUI.this.f108175e.field_roomowner)) {
                    this.f108190d.add(new C40228h(SeeRoomManagerUI.this, 2, (C72996z1) null));
                    if (this.f108190d.size() > 1) {
                        this.f108190d.add(new C40228h(SeeRoomManagerUI.this, 3, (C72996z1) null));
                    }
                }
            }
            notifyDataSetChanged();
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = C0966R.raw.default_avatar;
            bVar.mo32666a();
        }

        public int getCount() {
            return ((ArrayList) this.f108190d).size();
        }

        public Object getItem(int i) {
            return (C40228h) ((ArrayList) this.f108190d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j} */
        /* JADX WARNING: type inference failed for: r1v9, types: [android.text.SpannableString] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
            /*
                r9 = this;
                r12 = 2131312627(0x7f093ff3, float:1.8243628E38)
                r0 = 2131312630(0x7f093ff6, float:1.8243634E38)
                r1 = 0
                if (r11 != 0) goto L_0x002d
                android.content.Context r11 = r9.f108191e
                r2 = 2131497279(0x7f0c113f, float:1.8618147E38)
                android.view.View r11 = android.view.View.inflate(r11, r2, r1)
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI r2 = com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.this
                r2.getClass()
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j r3 = new com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j
                r3.<init>(r2)
                android.view.View r0 = r11.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r3.f108196a = r0
                android.view.View r12 = r11.findViewById(r12)
                android.widget.TextView r12 = (android.widget.TextView) r12
                r3.f108197b = r12
                goto L_0x0050
            L_0x002d:
                java.lang.Object r2 = r11.getTag()
                r3 = r2
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j r3 = (com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.C40232j) r3
                if (r3 != 0) goto L_0x0050
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI r2 = com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.this
                r2.getClass()
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j r3 = new com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j
                r3.<init>(r2)
                android.view.View r0 = r11.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r3.f108196a = r0
                android.view.View r12 = r11.findViewById(r12)
                android.widget.TextView r12 = (android.widget.TextView) r12
                r3.f108197b = r12
            L_0x0050:
                java.util.List<com.tencent.mm.chatroom.ui.SeeRoomManagerUI$h> r12 = r9.f108190d
                java.util.ArrayList r12 = (java.util.ArrayList) r12
                java.lang.Object r12 = r12.get(r10)
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI$h r12 = (com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.C40228h) r12
                r0 = 0
                r2 = 2
                java.lang.String r4 = "MicroMsg.SeeRoomManagerUI"
                r5 = 1
                if (r12 != 0) goto L_0x0079
                java.lang.Object[] r12 = new java.lang.Object[r2]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r12[r0] = r10
                int r10 = r9.getCount()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r12[r5] = r10
                java.lang.String r10 = "null == item! position:%s, count:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r10, r12)
                return r11
            L_0x0079:
                int r6 = r12.f108188a
                if (r6 != r5) goto L_0x0106
                android.widget.TextView r2 = r3.f108197b
                r2.setVisibility(r0)
                com.tencent.mm.storage.z1 r12 = r12.f108189b
                android.widget.TextView r0 = r3.f108197b
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI r2 = com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.this
                java.lang.String r5 = r12.getUsername()
                android.widget.TextView r6 = r3.f108197b
                int r7 = com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.f108173i
                r2.getClass()
                if (r6 != 0) goto L_0x0096
                goto L_0x00f1
            L_0x0096:
                java.lang.Class<f62.k0> r7 = f62.C75700k0.class
                k40.a r7 = f40.C86709a0.m107533q(r7)
                f62.k0 r7 = (f62.C75700k0) r7
                com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                com.tencent.mm.storage.z1 r7 = r7.get(r8)
                if (r7 != 0) goto L_0x00b2
                java.lang.String r2 = "ct == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
                goto L_0x00f1
            L_0x00b2:
                java.lang.String r4 = r7.mo73969n2()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x00c1
                java.lang.String r1 = r7.mo73969n2()
                goto L_0x00c9
            L_0x00c1:
                com.tencent.mm.storage.m1 r4 = r2.f108175e
                if (r4 == 0) goto L_0x00c9
                java.lang.String r1 = r4.mo69789q2(r5)
            L_0x00c9:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r4 == 0) goto L_0x00d3
                java.lang.String r1 = r7.mo73969n2()
            L_0x00d3:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r4 == 0) goto L_0x00dd
                java.lang.String r1 = r7.mo62909j3()
            L_0x00dd:
                java.lang.Class<ny.h> r4 = p629ny.C76979h.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                ny.h r4 = (p629ny.C76979h) r4
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                float r5 = r6.getTextSize()
                android.text.SpannableString r1 = r4.yp0(r2, r1, r5)
            L_0x00f1:
                r0.setText(r1)
                java.lang.Class<ln.f> r0 = p196ln.C76705f.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ln.f r0 = (p196ln.C76705f) r0
                android.widget.ImageView r1 = r3.f108196a
                java.lang.String r12 = r12.getUsername()
                r0.mo106849z(r1, r12)
                goto L_0x0143
            L_0x0106:
                r12 = 4
                if (r6 != r2) goto L_0x0125
                android.widget.TextView r0 = r3.f108197b
                r0.setVisibility(r12)
                android.widget.ImageView r12 = r3.f108196a
                r0 = 2131231180(0x7f0801cc, float:1.8078434E38)
                r12.setImageResource(r0)
                android.widget.ImageView r12 = r3.f108196a
                android.content.Context r0 = r9.f108191e
                r1 = 2131820741(0x7f1100c5, float:1.9274206E38)
                java.lang.String r0 = r0.getString(r1)
                r12.setContentDescription(r0)
                goto L_0x0143
            L_0x0125:
                r0 = 3
                if (r6 != r0) goto L_0x0143
                android.widget.TextView r0 = r3.f108197b
                r0.setVisibility(r12)
                android.widget.ImageView r12 = r3.f108196a
                r0 = 2131231181(0x7f0801cd, float:1.8078436E38)
                r12.setImageResource(r0)
                android.widget.ImageView r12 = r3.f108196a
                android.content.Context r0 = r9.f108191e
                r1 = 2131824588(0x7f110fcc, float:1.9282008E38)
                java.lang.String r0 = r0.getString(r1)
                r12.setContentDescription(r0)
            L_0x0143:
                com.tencent.mm.chatroom.ui.SeeRoomManagerUI$i$b r12 = new com.tencent.mm.chatroom.ui.SeeRoomManagerUI$i$b
                r12.<init>(r10)
                r11.setOnClickListener(r12)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.SeeRoomManagerUI.C40229i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            SeeRoomManagerUI.this.f108174d.post(new C40230a());
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomManagerUI$j */
    public class C40232j {

        /* renamed from: a */
        public ImageView f108196a;

        /* renamed from: b */
        public TextView f108197b;

        public C40232j(SeeRoomManagerUI seeRoomManagerUI) {
        }
    }

    /* renamed from: H7 */
    public static void m43258H7(SeeRoomManagerUI seeRoomManagerUI, List list) {
        C39608b n2;
        Log.m105925i("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] roomName:%s size:%s", seeRoomManagerUI.f108176f, Integer.valueOf(list.size()));
        LinkedList linkedList = new LinkedList(seeRoomManagerUI.f108177g.f108190d);
        ((ArrayList) seeRoomManagerUI.f108177g.f108190d).clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C40228h hVar = (C40228h) it.next();
            if (hVar.f108188a == 1 && !list.contains(hVar.f108189b.getUsername())) {
                ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(hVar);
            } else if (hVar.f108188a == 1 && list.contains(hVar.f108189b.getUsername()) && (n2 = seeRoomManagerUI.f108175e.mo69786n2(hVar.f108189b.getUsername())) != null) {
                n2.f106345f &= -2049;
            }
        }
        ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(new C40228h(seeRoomManagerUI, 2, (C72996z1) null));
        if (((ArrayList) seeRoomManagerUI.f108177g.f108190d).size() > 1) {
            ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(new C40228h(seeRoomManagerUI, 3, (C72996z1) null));
        } else {
            Log.m105929w("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] roomName:%s size:%s mAdapter.dataList size:%s", seeRoomManagerUI.f108176f, Integer.valueOf(list.size()), seeRoomManagerUI.f108177g.f108190d);
        }
        Log.m105925i("MicroMsg.SeeRoomManagerUI", "[delRoomManagerSuccessful] ret:%s", Boolean.valueOf(((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).replace(seeRoomManagerUI.f108175e)));
    }

    /* renamed from: I7 */
    public static void m43259I7(SeeRoomManagerUI seeRoomManagerUI, List list) {
        Log.m105925i("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] roomName:%s size:%s", seeRoomManagerUI.f108176f, Integer.valueOf(list.size()));
        LinkedList linkedList = new LinkedList(seeRoomManagerUI.f108177g.f108190d);
        ((ArrayList) seeRoomManagerUI.f108177g.f108190d).clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C40228h hVar = (C40228h) it.next();
            if (hVar.f108188a == 1) {
                ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(hVar);
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get((String) it4.next());
            ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(new C40228h(seeRoomManagerUI, 1, z1Var));
            C39608b n2 = seeRoomManagerUI.f108175e.mo69786n2(z1Var.getUsername());
            if (n2 != null) {
                n2.f106345f &= 2048;
            }
        }
        ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(new C40228h(seeRoomManagerUI, 2, (C72996z1) null));
        if (((ArrayList) seeRoomManagerUI.f108177g.f108190d).size() > 1) {
            ((ArrayList) seeRoomManagerUI.f108177g.f108190d).add(new C40228h(seeRoomManagerUI, 3, (C72996z1) null));
        } else {
            Log.m105929w("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] roomName:%s size:%s mAdapter.dataList size:%s", seeRoomManagerUI.f108176f, Integer.valueOf(list.size()), seeRoomManagerUI.f108177g.f108190d);
        }
        Log.m105925i("MicroMsg.SeeRoomManagerUI", "[addRoomManagerSuccessful] ret:%s", Boolean.valueOf(((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).replace(seeRoomManagerUI.f108175e)));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvq;
    }

    public void initView() {
        super.initView();
        setMMTitle((int) C0966R.string.i7d);
        this.f108174d = (GridView) findViewById(C0966R.C0970id.go8);
        C40229i iVar = new C40229i(this);
        this.f108177g = iVar;
        this.f108174d.setAdapter(iVar);
        this.f108174d.setOnTouchListener(new C1194a(this));
        this.f108174d.post(new C40223b());
        setBackBtn(new C1195c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null || i2 != -1) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(intent == null);
            objArr[1] = Integer.valueOf(i2);
            Log.m105929w("MicroMsg.SeeRoomManagerUI", "[onActivityResult] data is null? %s resultCode:%s", objArr);
            return;
        }
        String stringExtra = intent.getStringExtra("Select_Contact");
        Log.m105925i("MicroMsg.SeeRoomManagerUI", "[onActivityResult] roomName:%s requestCode:%s userListString:%s", this.f108176f, Integer.valueOf(i), stringExtra);
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.SeeRoomManagerUI", "[onActivityResult] userListString is null!");
            return;
        }
        String[] split = stringExtra.split(",");
        LinkedList linkedList = new LinkedList();
        for (String add : split) {
            linkedList.add(add);
        }
        if (i == 0) {
            this.f108178h = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.i5d), true, false, (DialogInterface.OnCancelListener) null);
            if (C72996z1.m85807K5(this.f108176f)) {
                C89059e i3 = new C47034b(this.f108176f, linkedList).mo9225i();
                i3.mo11397F(this);
                i3.mo123062e(new C40224d(linkedList));
                return;
            }
            C89059e i4 = new C47038f(this.f108176f, linkedList).mo9225i();
            i4.mo11397F(this);
            i4.mo123062e(new C40225e(linkedList));
        } else if (i == 1) {
            this.f108178h = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.f361212i63), true, false, (DialogInterface.OnCancelListener) null);
            if (C72996z1.m85807K5(this.f108176f)) {
                C89059e i5 = new C47037e(this.f108176f, linkedList).mo9225i();
                i5.mo11397F(this);
                i5.mo123062e(new C40226f(linkedList));
                return;
            }
            C89059e i6 = new C47039g(this.f108176f, linkedList).mo9225i();
            i6.mo11397F(this);
            i6.mo123062e(new C40227g(linkedList));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().add(this);
        this.f108176f = getIntent().getStringExtra("RoomInfo_Id");
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr().remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (mStorageEventData != null) {
            Log.m105925i("MicroMsg.SeeRoomManagerUI", "[onNotifyChange] event:%s [%s:%s]", str, mStorageEventData.event, Integer.valueOf(mStorageEventData.eventId));
        }
    }
}
