package com.tencent.p014mm.plugin.sns.p106ui;

import a11.C39479c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ke3.C88144b;
import p196ln.C76705f;
import p629ny.C76979h;
import p740wo.C53193b;
import qe0.C47806g;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI */
public class SnsChatRoomMemberUI extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f206090s = 0;

    /* renamed from: d */
    public GridView f206091d = null;

    /* renamed from: e */
    public C71204c f206092e = null;

    /* renamed from: f */
    public C44661m1 f206093f;

    /* renamed from: g */
    public String f206094g;

    /* renamed from: h */
    public String f206095h;

    /* renamed from: i */
    public String f206096i;

    /* renamed from: j */
    public String f206097j;

    /* renamed from: n */
    public boolean f206098n;

    /* renamed from: o */
    public List<C71203b> f206099o = new ArrayList();

    /* renamed from: p */
    public C75700k0 f206100p;

    /* renamed from: q */
    public boolean f206101q = false;

    /* renamed from: r */
    public int f206102r;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$a */
    public class C71202a implements MenuItem.OnMenuItemClickListener {
        public C71202a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$3");
            SnsChatRoomMemberUI.this.setResult(0);
            SnsChatRoomMemberUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$b */
    public static class C71203b {

        /* renamed from: a */
        public int f206104a;

        /* renamed from: b */
        public C72996z1 f206105b;

        /* renamed from: c */
        public int f206106c;

        public C71203b(int i, C72996z1 z1Var, int i2) {
            this.f206104a = i;
            this.f206105b = z1Var;
            this.f206106c = i2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$c */
    public class C71204c extends BaseAdapter {

        /* renamed from: i */
        public static final /* synthetic */ int f206107i = 0;

        /* renamed from: d */
        public List<String> f206108d;

        /* renamed from: e */
        public C44661m1 f206109e;

        /* renamed from: f */
        public Context f206110f;

        /* renamed from: g */
        public C71206d f206111g;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$c$a */
        public class C71205a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f206113d;

            public C71205a(int i) {
                this.f206113d = i;
            }

            public void onClick(View view) {
                C44673z4 Lo;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsChatRoomMemberUI$ChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter$1");
                C71204c cVar = C71204c.this;
                int i = C71204c.f206107i;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
                C71206d dVar = cVar.f206111g;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
                int i2 = this.f206113d;
                C71263z3 z3Var = (C71263z3) dVar;
                z3Var.getClass();
                SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$1");
                SnsChatRoomMemberUI snsChatRoomMemberUI = z3Var.f206227a;
                int i3 = SnsChatRoomMemberUI.f206090s;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                C71204c cVar2 = snsChatRoomMemberUI.f206092e;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                if (cVar2.mo97940a(i2).f206104a == 1) {
                    SnsChatRoomMemberUI snsChatRoomMemberUI2 = z3Var.f206227a;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    C71204c cVar3 = snsChatRoomMemberUI2.f206092e;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    C72996z1 z1Var = cVar3.mo97940a(i2).f206105b;
                    if (z1Var == null) {
                        Log.m105920e("MicroMsg.SnsChatRoomMemberUI", "cont is null");
                        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$1");
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter$1");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsChatRoomMemberUI$ChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                    String username = z1Var.getUsername();
                    String nickname = z1Var.getNickname();
                    SnsChatRoomMemberUI snsChatRoomMemberUI3 = z3Var.f206227a;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    C44661m1 m1Var = snsChatRoomMemberUI3.f206093f;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    String H7 = SnsChatRoomMemberUI.m83632H7(snsChatRoomMemberUI3, m1Var, username);
                    if (Util.isNullOrNil(H7)) {
                        H7 = z1Var.mo62898f();
                    }
                    SnsChatRoomMemberUI snsChatRoomMemberUI4 = z3Var.f206227a;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    snsChatRoomMemberUI4.getClass();
                    Class cls = C75700k0.class;
                    SnsMethodCalculate.markStartTimeMs("goToContactInfo", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    if (Util.isNullOrNil(H7) && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(username)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
                        H7 = Lo.field_conRemark;
                    }
                    if (Util.isNullOrNil(username)) {
                        SnsMethodCalculate.markEndTimeMs("goToContactInfo", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("Contact_User", username);
                        intent.putExtra("Contact_RemarkName", H7);
                        C44661m1 m1Var2 = snsChatRoomMemberUI4.f206093f;
                        if (m1Var2 != null) {
                            intent.putExtra("Contact_RoomNickname", m1Var2.mo69789q2(username));
                        }
                        intent.putExtra("Contact_Nick", nickname);
                        intent.putExtra("Contact_RoomMember", true);
                        intent.putExtra("room_name", snsChatRoomMemberUI4.f206097j);
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
                        intent.putExtra("Contact_Scene", 14);
                        intent.putExtra("Is_RoomOwner", snsChatRoomMemberUI4.f206098n);
                        intent.putExtra("Contact_ChatRoomId", snsChatRoomMemberUI4.f206094g);
                        intent.putExtra("CONTACT_INFO_UI_SOURCE", snsChatRoomMemberUI4.f206102r);
                        C88144b.m109791i(snsChatRoomMemberUI4, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                        SnsMethodCalculate.markEndTimeMs("goToContactInfo", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                    }
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
                }
                SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$1");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsChatRoomMemberUI$ChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C71204c(Context context, C44661m1 m1Var, String str, List<String> list, String str2) {
            this.f206109e = m1Var;
            this.f206108d = list;
            this.f206110f = context;
        }

        /* renamed from: a */
        public C71203b mo97940a(int i) {
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            SnsChatRoomMemberUI snsChatRoomMemberUI = SnsChatRoomMemberUI.this;
            int i2 = SnsChatRoomMemberUI.f206090s;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            List<C71203b> list = snsChatRoomMemberUI.f206099o;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            C71203b bVar = (C71203b) ((ArrayList) list).get(i);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            return bVar;
        }

        public int getCount() {
            SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            SnsChatRoomMemberUI snsChatRoomMemberUI = SnsChatRoomMemberUI.this;
            int i = SnsChatRoomMemberUI.f206090s;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            List<C71203b> list = snsChatRoomMemberUI.f206099o;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            int size = ((ArrayList) list).size();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            return size;
        }

        public /* bridge */ /* synthetic */ Object getItem(int i) {
            SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            C71203b a = mo97940a(i);
            SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            return a;
        }

        public long getItemId(int i) {
            SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            long j = (long) i;
            SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            return j;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C71207e eVar;
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            if (view == null) {
                view = View.inflate(this.f206110f, C0966R.C0971layout.c2c, (ViewGroup) null);
                eVar = new C71207e();
                eVar.f206115a = (ImageView) view.findViewById(C0966R.C0970id.j8h);
                eVar.f206116b = (TextView) view.findViewById(C0966R.C0970id.j8j);
                eVar.f206116b.setMaxWidth((((WindowManager) this.f206110f.getSystemService("window")).getDefaultDisplay().getWidth() * 2) / 3);
                eVar.f206117c = (TextView) view.findViewById(C0966R.C0970id.j8k);
                view.setTag(eVar);
            } else {
                eVar = (C71207e) view.getTag();
            }
            if (this.f206111g != null) {
                view.setOnClickListener(new C71205a(i));
            }
            TextView textView = eVar.f206117c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            SnsChatRoomMemberUI snsChatRoomMemberUI = SnsChatRoomMemberUI.this;
            int i2 = SnsChatRoomMemberUI.f206090s;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            List<C71203b> list = snsChatRoomMemberUI.f206099o;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            C71203b bVar = (C71203b) ((ArrayList) list).get(i);
            if (bVar != null && bVar.f206104a == 1) {
                C72996z1 z1Var = bVar.f206105b;
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(eVar.f206115a, z1Var.getUsername());
                String H7 = SnsChatRoomMemberUI.m83632H7(SnsChatRoomMemberUI.this, this.f206109e, z1Var.getUsername());
                String n2 = !Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.mo73969n2() : H7;
                if (Util.isNullOrNil(n2)) {
                    n2 = z1Var.mo62909j3();
                }
                if (H7 != null && !H7.equals("") && !n2.equals(H7)) {
                    n2 = H7 + "( " + n2 + " )";
                }
                eVar.f206116b.setVisibility(0);
                eVar.f206116b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f206110f, n2, eVar.f206116b.getTextSize()));
                if (eVar.f206117c != null) {
                    String a = C47806g.m53116a(z1Var);
                    if (TextUtils.isEmpty(a)) {
                        eVar.f206117c.setVisibility(8);
                    } else {
                        eVar.f206117c.setVisibility(0);
                        eVar.f206117c.setText(a);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$d */
    public interface C71206d {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$e */
    public static class C71207e {

        /* renamed from: a */
        public ImageView f206115a;

        /* renamed from: b */
        public TextView f206116b;

        /* renamed from: c */
        public TextView f206117c;
    }

    /* renamed from: H7 */
    public static String m83632H7(SnsChatRoomMemberUI snsChatRoomMemberUI, C44661m1 m1Var, String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        snsChatRoomMemberUI.getClass();
        SnsMethodCalculate.markStartTimeMs("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (m1Var == null) {
            SnsMethodCalculate.markEndTimeMs("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            str2 = "";
        } else {
            String q2 = m1Var.mo69789q2(str);
            SnsMethodCalculate.markEndTimeMs("getDisplayNameInRoom", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            str2 = q2;
        }
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return str2;
    }

    /* renamed from: I7 */
    public final int mo97938I7(Context context) {
        SnsMethodCalculate.markStartTimeMs("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (context == null) {
            SnsMethodCalculate.markEndTimeMs("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
            return 0;
        }
        int width = (int) ((((float) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth()) - (context.getResources().getDimension(C0966R.dimen.f3905if) * 1.0f)) / ((float) ((int) ((context.getResources().getDimension(C0966R.dimen.f3913iq) * 2.0f) + context.getResources().getDimension(C0966R.dimen.f3919iy)))));
        Log.m105925i("MicroMsg.SnsChatRoomMemberUI", "[getWrapColNum] :%s", Integer.valueOf(width));
        SnsMethodCalculate.markEndTimeMs("getWrapColNum", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return width;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        return C0966R.C0971layout.c2d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        super.onConfigurationChanged(configuration);
        this.f206091d.setNumColumns(mo97938I7(this));
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        super.onCreate(bundle);
        this.f206100p = (C75700k0) C86709a0.m107533q(C75700k0.class);
        SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        this.f206094g = getIntent().getStringExtra("RoomInfo_Id");
        this.f206097j = getIntent().getStringExtra("room_name");
        this.f206095h = getIntent().getStringExtra("Add_address_titile");
        getIntent().getIntExtra("room_member_count", 0);
        this.f206102r = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f206101q = getIntent().getBooleanExtra("filter_open_im", false);
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f206094g);
        this.f206093f = Lo;
        if (Lo != null) {
            this.f206096i = Lo.field_roomowner;
            this.f206098n = C75592q0.m90789s().equals(this.f206096i);
        }
        GridView gridView = (GridView) findViewById(C0966R.C0970id.f359248js2);
        this.f206091d = gridView;
        gridView.setNumColumns(mo97938I7(this));
        this.f206091d.setColumnWidth(getResources().getDimensionPixelSize(C0966R.dimen.f3905if));
        C71204c cVar = new C71204c(this, this.f206093f, this.f206094g, (List<String>) null, this.f206096i);
        this.f206092e = cVar;
        this.f206091d.setAdapter(cVar);
        C71204c cVar2 = this.f206092e;
        C71263z3 z3Var = new C71263z3(this);
        cVar2.getClass();
        SnsMethodCalculate.markStartTimeMs("setMemberItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        cVar2.f206111g = z3Var;
        SnsMethodCalculate.markEndTimeMs("setMemberItemClickListener", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$ChatroomMemberAdapter");
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f206094g);
        SnsMethodCalculate.markStartTimeMs("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        if (k5 == null) {
            SnsMethodCalculate.markEndTimeMs("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        } else {
            ((ArrayList) this.f206099o).clear();
            for (int i = 0; i < k5.size(); i++) {
                C72996z1 z1Var = this.f206100p.mo96097Ni().get(k5.get(i));
                String username = z1Var.getUsername();
                if ((!this.f206101q || TextUtils.isEmpty(username) || !username.contains("@openim")) && z1Var.mo62927s3() && !C75592q0.m90764L(z1Var.getUsername())) {
                    if (this.f206093f.mo69796x2(z1Var.getUsername())) {
                        ((ArrayList) this.f206099o).add(new C71203b(1, z1Var, 3));
                    } else if (this.f206093f.mo69793u2(z1Var.getUsername())) {
                        ((ArrayList) this.f206099o).add(new C71203b(1, z1Var, 2));
                    } else {
                        ((ArrayList) this.f206099o).add(new C71203b(1, z1Var, 1));
                    }
                }
            }
            Collections.sort(this.f206099o, new C71230a4(this));
            this.f206092e.notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("setMemberOrderList", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        }
        setMMTitle(this.f206095h + "(" + ((ArrayList) this.f206099o).size() + ")");
        SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
        setBackBtn(new C71202a());
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI");
    }
}
