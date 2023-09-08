package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.contact.C44879k3;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1915z5;
import com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatTipImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C45613m2;
import eb0.C45628s0;
import eb0.C75589l0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76705f;
import p530fx.C45819c;
import p629ny.C76979h;
import p674ri.C77520a;
import p740wo.C53193b;
import pg3.C35488c;
import pg3.C77084b;
import qe0.C47806g;

/* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI */
public class SeeRoomMemberUI extends MMActivity implements C11385n, C77520a.C77522b {

    /* renamed from: y */
    public static int f194964y = 5;

    /* renamed from: d */
    public GridView f194965d;

    /* renamed from: e */
    public C67931k f194966e;

    /* renamed from: f */
    public C44661m1 f194967f;

    /* renamed from: g */
    public String f194968g;

    /* renamed from: h */
    public String f194969h;

    /* renamed from: i */
    public String f194970i;

    /* renamed from: j */
    public String f194971j;

    /* renamed from: n */
    public String f194972n;

    /* renamed from: o */
    public boolean f194973o;

    /* renamed from: p */
    public boolean f194974p;

    /* renamed from: q */
    public String f194975q;

    /* renamed from: r */
    public String f194976r;

    /* renamed from: s */
    public MMEditText f194977s;

    /* renamed from: t */
    public boolean f194978t;

    /* renamed from: u */
    public int f194979u;

    /* renamed from: v */
    public int f194980v;

    /* renamed from: w */
    public int f194981w;

    /* renamed from: x */
    public AdapterView.OnItemClickListener f194982x = new C67925e();

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$a */
    public class C67919a implements Runnable {
        public C67919a() {
        }

        public void run() {
            SeeRoomMemberUI seeRoomMemberUI = SeeRoomMemberUI.this;
            seeRoomMemberUI.f194965d.scrollListBy(seeRoomMemberUI.f194980v);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$b */
    public class C67920b implements MenuItem.OnMenuItemClickListener {
        public C67920b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SeeRoomMemberUI.this.setResult(0);
            SeeRoomMemberUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$c */
    public class C67921c implements TextWatcher {
        public C67921c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SeeRoomMemberUI.this.f194966e.mo93330b(charSequence.toString());
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$d */
    public class C67922d implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$d$a */
        public class C67923a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f194987d;

            public C67923a(int i) {
                this.f194987d = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SeeRoomMemberUI seeRoomMemberUI = SeeRoomMemberUI.this;
                int i2 = this.f194987d;
                if (seeRoomMemberUI.f194966e.getItem(i2).f194995a == 1) {
                    String username = seeRoomMemberUI.f194966e.getItem(i2).f194996b.getUsername();
                    Log.m105918d("MicroMsg.SeeRoomMemberUI", "roomPref del " + i2 + " userName : " + username);
                    if (Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "").equals(username)) {
                        C76879j.m92738i(seeRoomMemberUI.getContext(), C0966R.string.i6o, C0966R.string.a3h);
                    } else {
                        seeRoomMemberUI.mo93316H7(username);
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$d$b */
        public class C67924b implements DialogInterface.OnClickListener {
            public C67924b(C67922d dVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C67922d() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            SeeRoomMemberUI seeRoomMemberUI = SeeRoomMemberUI.this;
            if (seeRoomMemberUI.f194978t) {
                C72996z1 z1Var = seeRoomMemberUI.f194966e.getItem(i).f194996b;
                if (z1Var == null) {
                    return true;
                }
                if (SeeRoomMemberUI.this.f194967f.field_roomowner.equals(z1Var.getUsername())) {
                    return true;
                }
                SeeRoomMemberUI seeRoomMemberUI2 = SeeRoomMemberUI.this;
                C76879j.m92750u(seeRoomMemberUI2, seeRoomMemberUI2.getString(C0966R.string.i66), "", new C67923a(i), new C67924b(this));
            } else {
                Log.m105924i("MicroMsg.SeeRoomMemberUI", "U are not a roomowner");
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$e */
    public class C67925e implements AdapterView.OnItemClickListener {
        public C67925e() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C44661m1 m1Var;
            C44673z4 Lo;
            int i2 = i;
            Class cls = C53193b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i2 > SeeRoomMemberUI.this.f194966e.getCount() - 1) {
                Log.m105925i("MicroMsg.SeeRoomMemberUI", "[onItemClick]count=%s position=%s", Integer.valueOf(SeeRoomMemberUI.this.f194966e.getCount()), Integer.valueOf(i));
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int i3 = SeeRoomMemberUI.this.f194966e.getItem(i2).f194995a;
            if (i3 == 2) {
                Log.m105924i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Add member");
                C115669n.INSTANCE.idkeyStat(219, 6, 1, true);
                SeeRoomMemberUI seeRoomMemberUI = SeeRoomMemberUI.this;
                seeRoomMemberUI.getClass();
                String listToString = Util.listToString(((C53193b) C86312j.m106911c(cls)).mo73727k5(seeRoomMemberUI.f194969h), ",");
                Intent intent = new Intent();
                intent.putExtra("titile", seeRoomMemberUI.getString(C0966R.string.f7496hv));
                intent.putExtra("list_type", 1);
                C74560s1.m89276e();
                intent.putExtra("list_attr", C74560s1.f219162c);
                intent.putExtra("always_select_contact", listToString);
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
                intent.putExtra("KBlockOpenImFav", C72996z1.m85807K5(seeRoomMemberUI.f194969h));
                intent.putExtra("is_select_record_msg_mode", C72996z1.m85807K5(seeRoomMemberUI.f194969h));
                intent.putExtra("menu_mode", 2);
                intent.putExtra("chatroomName", seeRoomMemberUI.f194969h);
                C88144b.m109802t(seeRoomMemberUI, ".ui.contact.SelectContactUI", intent, 1);
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else if (i3 == 3) {
                Log.m105924i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Delete member");
                SeeRoomMemberUI seeRoomMemberUI2 = SeeRoomMemberUI.this;
                seeRoomMemberUI2.getClass();
                C115669n.INSTANCE.idkeyStat(219, 8, 1, true);
                List<String> k5 = ((C53193b) C86312j.m106911c(cls)).mo73727k5(seeRoomMemberUI2.f194969h);
                String listToString2 = Util.listToString(k5, ",");
                int size = k5.size();
                Intent intent2 = new Intent();
                intent2.putExtra("RoomInfo_Id", seeRoomMemberUI2.f194969h);
                intent2.putExtra("Is_Chatroom", true);
                intent2.putExtra("Chatroom_member_list", listToString2);
                intent2.putExtra("room_member_count", size);
                intent2.putExtra("Is_RoomOwner", seeRoomMemberUI2.f194978t);
                C74560s1.m89276e();
                intent2.putExtra("list_attr", C74560s1.f219162c);
                intent2.putExtra("room_name", seeRoomMemberUI2.f194969h);
                intent2.putExtra("room_owner_name", seeRoomMemberUI2.f194967f.field_roomowner);
                intent2.setClass(seeRoomMemberUI2, SelectDelMemberUI.class);
                seeRoomMemberUI2.startActivityForResult(intent2, 2);
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            } else {
                if (i3 == 1) {
                    C72996z1 z1Var = SeeRoomMemberUI.this.f194966e.getItem(i2).f194996b;
                    if (z1Var == null) {
                        Log.m105920e("MicroMsg.SeeRoomMemberUI", "cont is null");
                        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                        return;
                    }
                    SeeRoomMemberUI.this.f194972n = z1Var.getUsername();
                    String nickname = z1Var.getNickname();
                    SeeRoomMemberUI seeRoomMemberUI3 = SeeRoomMemberUI.this;
                    String I7 = SeeRoomMemberUI.m80283I7(seeRoomMemberUI3.f194967f, seeRoomMemberUI3.f194972n);
                    if (Util.isNullOrNil(I7)) {
                        SeeRoomMemberUI.this.f194971j = z1Var.mo62898f();
                    } else {
                        SeeRoomMemberUI.this.f194971j = I7;
                    }
                    C44879k3.m49760a(SeeRoomMemberUI.this.f194977s.getText().toString(), 1, 6, i2 + 1);
                    SeeRoomMemberUI seeRoomMemberUI4 = SeeRoomMemberUI.this;
                    String str = seeRoomMemberUI4.f194972n;
                    String str2 = seeRoomMemberUI4.f194971j;
                    seeRoomMemberUI4.getClass();
                    Class cls2 = C75700k0.class;
                    if (Util.isNullOrNil(str2) && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls2)).mm0()).mo69630Lo(str)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                        str2 = Lo.field_conRemark;
                    }
                    if (!Util.isNullOrNil(str)) {
                        Intent intent3 = new Intent();
                        intent3.putExtra("Contact_User", str);
                        intent3.putExtra("Contact_RemarkName", str2);
                        if (seeRoomMemberUI4.f194973o && (m1Var = seeRoomMemberUI4.f194967f) != null) {
                            intent3.putExtra("Contact_RoomNickname", m1Var.mo69789q2(str));
                        }
                        intent3.putExtra("Contact_Nick", nickname);
                        intent3.putExtra("Contact_RoomMember", true);
                        intent3.putExtra("room_name", seeRoomMemberUI4.f194975q);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(str);
                        if (z1Var2 != null && ((int) z1Var2.f108320R1) > 0 && z1Var2.mo62927s3()) {
                            SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                            SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                            aVar.f9503a = intent3;
                            aVar.f9504b = str;
                            setLocalQQMobileEvent.publish();
                        }
                        if (seeRoomMemberUI4.f194973o) {
                            if (z1Var2 != null && z1Var2.mo62916m3()) {
                                C115669n nVar = C115669n.INSTANCE;
                                nVar.kvStat(10298, z1Var2.getUsername() + "," + 14);
                            }
                            intent3.putExtra("Contact_Scene", 14);
                        } else if (seeRoomMemberUI4.f194974p) {
                            intent3.putExtra("Contact_Scene", 44);
                            if (!C75592q0.m90764L(z1Var2.getUsername())) {
                                intent3.putExtra("Contact_IsLBSFriend", true);
                            }
                        }
                        intent3.putExtra("Is_RoomOwner", seeRoomMemberUI4.f194978t);
                        intent3.putExtra("Contact_ChatRoomId", seeRoomMemberUI4.f194969h);
                        intent3.putExtra("CONTACT_INFO_UI_SOURCE", 10);
                        C88144b.m109791i(seeRoomMemberUI4, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$f */
    public class C67926f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f194990d;

        public C67926f(List list) {
            this.f194990d = list;
        }

        public void run() {
            C67931k kVar = SeeRoomMemberUI.this.f194966e;
            if (kVar != null) {
                kVar.mo93331d(this.f194990d);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$g */
    public class C67927g implements C35488c {
        public C67927g() {
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C35488c cVar = (C35488c) bVar;
            SeeRoomMemberUI.this.mo93267c1();
            SeeRoomMemberUI.this.mo93251N4();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$h */
    public class C67928h implements C35488c {
        public C67928h() {
        }

        /* renamed from: a */
        public void mo10150a(int i, int i2, String str, C77084b bVar) {
            C35488c cVar = (C35488c) bVar;
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(SeeRoomMemberUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (i2 == -66) {
                SeeRoomMemberUI seeRoomMemberUI = SeeRoomMemberUI.this;
                C76879j.m92748s(seeRoomMemberUI, seeRoomMemberUI.getString(C0966R.string.bxz), SeeRoomMemberUI.this.getString(C0966R.string.a3h));
                SeeRoomMemberUI.this.mo93267c1();
                SeeRoomMemberUI.this.mo93251N4();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$i */
    public class C67929i implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C72940a f194994d;

        public C67929i(SeeRoomMemberUI seeRoomMemberUI, C72940a aVar) {
            this.f194994d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f194994d.cancel();
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$k */
    public class C67931k extends BaseAdapter {

        /* renamed from: d */
        public String f194998d;

        /* renamed from: e */
        public List<String> f194999e;

        /* renamed from: f */
        public C44661m1 f195000f;

        /* renamed from: g */
        public Context f195001g;

        /* renamed from: h */
        public List<C67930j> f195002h;

        /* renamed from: i */
        public List<C67930j> f195003i = new ArrayList();

        /* renamed from: j */
        public C75700k0 f195004j;

        /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$k$a */
        public class C67932a implements Comparator<C67930j> {
            public C67932a(C67931k kVar) {
            }

            public int compare(Object obj, Object obj2) {
                return ((C67930j) obj2).f194997c - ((C67930j) obj).f194997c;
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$k$b */
        public class C67933b implements View.OnClickListener {
            public C67933b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeRoomMemberUI$ChatroomMemberAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105925i("MicroMsg.SeeRoomMemberUI", "onItemClick %s%s", view, view.getTag());
                if (view.getTag() != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    SeeRoomMemberUI seeRoomMemberUI = SeeRoomMemberUI.this;
                    ((C67925e) seeRoomMemberUI.f194982x).onItemClick(seeRoomMemberUI.f194965d, view, intValue, (long) intValue);
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$ChatroomMemberAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C67931k(Context context, C44661m1 m1Var, String str, List<String> list, String str2) {
            this.f195000f = m1Var;
            this.f194998d = str;
            this.f194999e = list;
            this.f195001g = context;
            this.f195004j = (C75700k0) C86709a0.m107533q(C75700k0.class);
            mo93331d(((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(str));
        }

        /* renamed from: a */
        public C67930j getItem(int i) {
            return this.f195003i.get(i);
        }

        /* renamed from: b */
        public void mo93330b(String str) {
            C72996z1 z1Var;
            C44673z4 Lo;
            String str2;
            ArrayList arrayList = new ArrayList();
            if (!Util.isNullOrNil(str)) {
                for (C67930j next : this.f195002h) {
                    if (!(next == null || (z1Var = next.f194996b) == null || next.f194995a != 1)) {
                        if (z1Var.mo73969n2() != null && z1Var.mo73969n2().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(next);
                        } else if (!Util.isNullOrNil(SeeRoomMemberUI.m80283I7(this.f195000f, z1Var.getUsername())) && SeeRoomMemberUI.m80283I7(this.f195000f, z1Var.getUsername()).contains(str)) {
                            arrayList.add(next);
                        } else if (z1Var.mo62909j3() != null && z1Var.mo62909j3().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(next);
                        } else if (z1Var.mo62942y2() != null && z1Var.mo62942y2().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(next);
                        } else if (z1Var.mo62913l2() != null && z1Var.mo62913l2().contains(str)) {
                            arrayList.add(next);
                        } else if (z1Var.getUsername() != null && z1Var.getUsername().contains(str)) {
                            arrayList.add(next);
                        } else if (!z1Var.mo62927s3() && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0()).mo69630Lo(z1Var.getUsername())) != null && (str2 = Lo.field_conRemark) != null && str2.toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(next);
                        }
                    }
                }
                Log.m105924i("MicroMsg.SeeRoomMemberUI", "[setMemberListBySearch]");
                this.f195003i = arrayList;
            } else {
                this.f195003i = this.f195002h;
            }
            notifyDataSetChanged();
        }

        /* renamed from: d */
        public void mo93331d(List<String> list) {
            if (list != null) {
                this.f195003i.clear();
                for (int i = 0; i < list.size(); i++) {
                    C72996z1 z1Var = this.f195004j.mo96097Ni().get(list.get(i));
                    if (this.f195000f.mo69796x2(z1Var.getUsername())) {
                        this.f195003i.add(new C67930j(1, z1Var, 3));
                    } else if (this.f195000f.mo69793u2(z1Var.getUsername())) {
                        this.f195003i.add(new C67930j(1, z1Var, 2));
                    } else {
                        this.f195003i.add(new C67930j(1, z1Var, 1));
                    }
                }
                Collections.sort(this.f195003i, new C67932a(this));
                this.f195003i.add(new C67930j(2, (C72996z1) null));
                if (this.f195000f.mo69797y2()) {
                    this.f195003i.add(new C67930j(3, (C72996z1) null));
                }
                this.f195002h = this.f195003i;
                notifyDataSetChanged();
            }
        }

        public int getCount() {
            return this.f195003i.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C67934l lVar;
            if (view == null) {
                view = View.inflate(this.f195001g, C0966R.C0971layout.bvr, (ViewGroup) null);
                lVar = new C67934l();
                lVar.f195007a = (AvatarPatTipImageView) view.findViewById(C0966R.C0970id.j8h);
                lVar.f195008b = (TextView) view.findViewById(C0966R.C0970id.j8j);
                lVar.f195008b.setMaxWidth((((WindowManager) this.f195001g.getSystemService("window")).getDefaultDisplay().getWidth() * 2) / 3);
                lVar.f195009c = (TextView) view.findViewById(C0966R.C0970id.j8k);
                view.setTag(lVar);
            } else {
                lVar = (C67934l) view.getTag();
            }
            lVar.f195007a.setTag(Integer.valueOf(i));
            TextView textView = lVar.f195009c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            C67930j jVar = this.f195003i.get(i);
            if (jVar != null && jVar.f194995a == 1) {
                C72996z1 z1Var = jVar.f194996b;
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(lVar.f195007a, z1Var.getUsername());
                String I7 = SeeRoomMemberUI.m80283I7(this.f195000f, z1Var.getUsername());
                String n2 = !Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.mo73969n2() : I7;
                if (Util.isNullOrNil(n2)) {
                    n2 = z1Var.mo62909j3();
                }
                if (I7 != null && !I7.equals("") && !n2.equals(I7)) {
                    n2 = I7 + "( " + n2 + " )";
                }
                lVar.f195008b.setVisibility(0);
                lVar.f195008b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f195001g, n2, lVar.f195008b.getTextSize()));
                lVar.f195007a.setTagUsername(z1Var.getUsername());
                lVar.f195007a.setTagTalker(this.f194998d);
                lVar.f195007a.setTagScene(4);
                lVar.f195007a.setOnClickListener(new C67933b());
                if (lVar.f195009c != null) {
                    String a = C47806g.m53116a(z1Var);
                    if (TextUtils.isEmpty(a)) {
                        lVar.f195009c.setVisibility(8);
                    } else {
                        lVar.f195009c.setVisibility(0);
                        lVar.f195009c.setText(a);
                    }
                }
            } else if (jVar != null && jVar.f194995a == 2) {
                lVar.f195008b.setVisibility(4);
                lVar.f195007a.setImageResource(C0966R.C0969drawable.f4552fu);
                lVar.f195007a.setContentDescription(this.f195001g.getString(C0966R.string.f7397f5));
                lVar.f195007a.setTagUsername("");
            } else if (jVar != null && jVar.f194995a == 3) {
                lVar.f195008b.setVisibility(4);
                lVar.f195007a.setImageResource(C0966R.C0969drawable.f4553fv);
                lVar.f195007a.setContentDescription(this.f195001g.getString(C0966R.string.f360333by1));
                lVar.f195007a.setTagUsername("");
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$l */
    public static class C67934l {

        /* renamed from: a */
        public AvatarPatTipImageView f195007a;

        /* renamed from: b */
        public TextView f195008b;

        /* renamed from: c */
        public TextView f195009c;
    }

    /* renamed from: I7 */
    public static String m80283I7(C44661m1 m1Var, String str) {
        return m1Var == null ? "" : m1Var.mo69789q2(str);
    }

    /* renamed from: H7 */
    public final void mo93316H7(String str) {
        if (str != null && !str.equals("")) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            C72940a a = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(this.f194969h).mo71490a(this.f194969h, linkedList, 0);
            a.f212613b = new C67927g();
            a.f212614c = new C67928h();
            a.mo100867d(this, getString(C0966R.string.a3h), getString(C0966R.string.i64), true, true, new C67929i(this, a));
        }
    }

    /* renamed from: J7 */
    public int mo93317J7(Context context) {
        if (context == null) {
            return 0;
        }
        int width = (int) ((((float) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth()) - (context.getResources().getDimension(C0966R.dimen.f3905if) * 1.0f)) / ((float) ((int) ((context.getResources().getDimension(C0966R.dimen.f3913iq) * 2.0f) + context.getResources().getDimension(C0966R.dimen.f3919iy)))));
        Log.m105925i("MicroMsg.SeeRoomMemberUI", "[getWrapColNum] :%s", Integer.valueOf(width));
        f194964y = width;
        return width;
    }

    /* renamed from: N4 */
    public void mo93251N4() {
        if (this.f194967f != null) {
            setMMTitle(this.f194968g + "(" + this.f194967f.mo69790r2().size() + ")");
        }
    }

    /* renamed from: c1 */
    public void mo93267c1() {
        C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        String str = this.f194970i;
        if (str == null) {
            str = this.f194969h;
        }
        this.f194967f = ((C44662n1) mr).mo69799Lo(str);
        runOnUiThread(new C67926f(((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f194969h)));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvs;
    }

    public void initView() {
        setMMTitle(this.f194968g + "(" + this.f194979u + ")");
        setBackBtn(new C67920b());
        this.f194977s = (MMEditText) findViewById(C0966R.C0970id.h7o);
        GridView gridView = (GridView) findViewById(C0966R.C0970id.b15);
        this.f194965d = gridView;
        gridView.setNumColumns(mo93317J7(this));
        this.f194965d.setColumnWidth(getResources().getDimensionPixelSize(C0966R.dimen.f3905if));
        C44661m1 m1Var = this.f194967f;
        String str = this.f194969h;
        LinkedList linkedList = new LinkedList();
        if (Util.isNullOrNil((String) null)) {
            C44665r4 jo = ((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69821jo("@t.qq.com");
            if (jo != null) {
                linkedList.add(jo.f121095b);
            }
            this.f194966e = new C67931k(this, m1Var, str, linkedList, this.f194976r);
            this.f194977s.addTextChangedListener(new C67921c());
            this.f194965d.setOnItemClickListener(this.f194982x);
            this.f194965d.setOnItemLongClickListener(new C67922d());
            this.f194965d.setAdapter(this.f194966e);
            return;
        }
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i != 1) {
            if (i == 2 && intent != null) {
                mo93316H7(intent.getStringExtra("Select_Contact"));
            }
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = (ChatroomInfoUI.LocalHistoryInfo) intent.getParcelableExtra("select_record_msg_info");
            if (!C72996z1.m85807K5(this.f194969h) || C45628s0.m50735A(this.f194969h) || C75589l0.m90735a(stringExtra)) {
                if (!Util.nullAsNil(C75592q0.m90789s()).equals(stringExtra)) {
                    List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f194969h);
                    boolean z2 = false;
                    if (k5 == null) {
                        z = false;
                    } else {
                        for (String equals : k5) {
                            if (equals.equals(stringExtra)) {
                                z2 = true;
                            }
                        }
                        z = z2;
                    }
                }
                if (z) {
                    C76879j.m92748s(this, getString(C0966R.string.f7396f3), getString(C0966R.string.a3h));
                } else if (Util.stringsToList(stringExtra.split(",")) != null) {
                    new C77520a(this, this.f194969h, intent.getStringExtra("Select_Contact"), localHistoryInfo, intent.getLongExtra("select_record_fake_msg_id", 0), this);
                }
            } else {
                C76879j.m92748s(this, getString(C0966R.string.i7k), getString(C0966R.string.a3h));
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f194965d.setNumColumns(mo93317J7(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C115669n.INSTANCE.idkeyStat(219, 2, 1, true);
        C86709a0.m107529k().f251779b.mo123455a(C1915z5.CTRL_INDEX, this);
        this.f194969h = getIntent().getStringExtra("RoomInfo_Id");
        this.f194970i = getIntent().getStringExtra("Chat_User");
        getIntent().getStringExtra("Chatroom_member_list");
        this.f194973o = getIntent().getBooleanExtra("Is_Chatroom", true);
        this.f194974p = getIntent().getBooleanExtra("Is_Lbsroom", false);
        this.f194978t = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f194976r = getIntent().getStringExtra("room_owner_name");
        this.f194968g = getIntent().getStringExtra("Add_address_titile");
        C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        String str = this.f194970i;
        if (str == null) {
            str = this.f194969h;
        }
        this.f194967f = ((C44662n1) mr).mo69799Lo(str);
        this.f194979u = getIntent().getIntExtra("room_member_count", 0);
        this.f194975q = getIntent().getStringExtra("room_name");
        this.f194980v = getIntent().getIntExtra("offset", 0);
        this.f194981w = getIntent().getIntExtra("first_pos", 0);
        initView();
        if (this.f194966e != null) {
            mo93267c1();
            this.f194965d.setSelection(this.f194981w * f194964y < this.f194966e.getCount() ? this.f194981w * f194964y : this.f194966e.getCount() - 1);
            this.f194965d.postDelayed(new C67919a(), 100);
        }
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(C1915z5.CTRL_INDEX, this);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C67931k kVar = this.f194966e;
        if (kVar != null) {
            kVar.mo93330b(this.f194977s.getText().toString());
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeRoomMemberUI$j */
    public static class C67930j {

        /* renamed from: a */
        public int f194995a;

        /* renamed from: b */
        public C72996z1 f194996b;

        /* renamed from: c */
        public int f194997c;

        public C67930j(int i, C72996z1 z1Var, int i2) {
            this.f194995a = i;
            this.f194996b = z1Var;
            this.f194997c = i2;
        }

        public C67930j(int i, C72996z1 z1Var) {
            this.f194997c = 0;
            this.f194995a = i;
            this.f194996b = z1Var;
        }
    }
}
