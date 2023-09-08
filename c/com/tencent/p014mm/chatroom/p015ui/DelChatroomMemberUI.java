package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7628p0;
import f40.C86709a0;
import f62.C31950v0;
import f62.C75700k0;
import g62.C32330n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p530fx.C45819c;
import p530fx.C75818e;
import p629ny.C76979h;
import pg3.C77084b;
import pg3.C77086f;
import te3.C64490kg2;

/* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI */
public class DelChatroomMemberUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ListView f194832d;

    /* renamed from: e */
    public C67875b f194833e;

    /* renamed from: f */
    public String f194834f;

    /* renamed from: g */
    public LinkedList<String> f194835g = new LinkedList<>();

    /* renamed from: h */
    public List<String> f194836h = new ArrayList();

    /* renamed from: i */
    public C44661m1 f194837i;

    /* renamed from: j */
    public int f194838j;

    /* renamed from: n */
    public int f194839n;

    /* renamed from: o */
    public int f194840o;

    /* renamed from: p */
    public boolean f194841p = false;

    /* renamed from: q */
    public C72940a f194842q = null;

    /* renamed from: r */
    public ProgressDialog f194843r = null;

    /* renamed from: s */
    public C72963f4 f194844s;

    /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$a */
    public class C67874a implements MenuItem.OnMenuItemClickListener {
        public C67874a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            DelChatroomMemberUI delChatroomMemberUI = DelChatroomMemberUI.this;
            if (delChatroomMemberUI.f194839n == 1) {
                DelChatroomMemberUI.m80263I7(delChatroomMemberUI, delChatroomMemberUI.f194844s, delChatroomMemberUI.f194840o, delChatroomMemberUI.f194836h, delChatroomMemberUI.f194833e.getCount(), 0, 1, "");
            }
            DelChatroomMemberUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$b */
    public class C67875b extends BaseAdapter {

        /* renamed from: d */
        public List<C72996z1> f194846d = new LinkedList();

        /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$b$a */
        public class C67876a implements View.OnClickListener {

            /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$b$a$a */
            public class C67877a implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ C72996z1 f194849d;

                /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$b$a$a$a */
                public class C67878a extends C77086f {
                    public C67878a() {
                    }

                    /* renamed from: a */
                    public void mo10150a(int i, int i2, String str, C77084b bVar) {
                        C77086f fVar = (C77086f) bVar;
                        Object[] objArr = new Object[4];
                        objArr[0] = Integer.valueOf(i);
                        objArr[1] = Integer.valueOf(i2);
                        objArr[2] = Util.nullAs(str, "");
                        objArr[3] = fVar != null ? Integer.valueOf(fVar.f225171a) : "null";
                        Log.m105925i("Micromsg.RoomOpLogResult", "dealDelChatroomMemberImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
                        if (this.f225171a != 0) {
                            ProgressDialog progressDialog = DelChatroomMemberUI.this.f194843r;
                            if (progressDialog != null) {
                                progressDialog.dismiss();
                            }
                            DelChatroomMemberUI delChatroomMemberUI = DelChatroomMemberUI.this;
                            C76879j.m92754y(delChatroomMemberUI, delChatroomMemberUI.getString(C0966R.string.iju), "", DelChatroomMemberUI.this.getString(C0966R.string.a18), new C67980n0(this));
                            C67875b bVar2 = C67875b.this;
                            DelChatroomMemberUI delChatroomMemberUI2 = DelChatroomMemberUI.this;
                            if (delChatroomMemberUI2.f194839n == 1) {
                                DelChatroomMemberUI.m80263I7(delChatroomMemberUI2, delChatroomMemberUI2.f194844s, delChatroomMemberUI2.f194840o, delChatroomMemberUI2.f194836h, bVar2.getCount(), 1, 3, C67877a.this.f194849d.getUsername());
                                return;
                            }
                            return;
                        }
                        C67877a aVar = C67877a.this;
                        DelChatroomMemberUI delChatroomMemberUI3 = DelChatroomMemberUI.this;
                        delChatroomMemberUI3.f194842q = DelChatroomMemberUI.m80262H7(delChatroomMemberUI3, aVar.f194849d.getUsername(), true);
                    }
                }

                public C67877a(C72996z1 z1Var) {
                    this.f194849d = z1Var;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    DelChatroomMemberUI delChatroomMemberUI = DelChatroomMemberUI.this;
                    if (delChatroomMemberUI.f194841p) {
                        delChatroomMemberUI.f194842q = null;
                        C75818e J7 = DelChatroomMemberUI.m80264J7(delChatroomMemberUI.f194834f, delChatroomMemberUI.f194844s, 2, this.f194849d.getUsername(), new C67878a());
                        DelChatroomMemberUI delChatroomMemberUI2 = DelChatroomMemberUI.this;
                        ProgressDialog progressDialog = delChatroomMemberUI2.f194843r;
                        if (progressDialog == null) {
                            delChatroomMemberUI2.f194843r = C76879j.m92723Q(delChatroomMemberUI2, delChatroomMemberUI2.getString(C0966R.string.a3h), delChatroomMemberUI2.getString(C0966R.string.i64), true, true, new C67977m0(delChatroomMemberUI2, J7));
                            return;
                        }
                        progressDialog.show();
                        return;
                    }
                    DelChatroomMemberUI.m80262H7(delChatroomMemberUI, this.f194849d.getUsername(), false);
                }
            }

            /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$b$a$b */
            public class C67879b implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ C72996z1 f194852d;

                public C67879b(C72996z1 z1Var) {
                    this.f194852d = z1Var;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C67875b bVar = C67875b.this;
                    DelChatroomMemberUI delChatroomMemberUI = DelChatroomMemberUI.this;
                    if (delChatroomMemberUI.f194839n == 1) {
                        DelChatroomMemberUI.m80263I7(delChatroomMemberUI, delChatroomMemberUI.f194844s, delChatroomMemberUI.f194840o, delChatroomMemberUI.f194836h, bVar.getCount(), 1, 1, this.f194852d.getUsername());
                    }
                }
            }

            public C67876a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/DelChatroomMemberUI$DelChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C72996z1 z1Var = (C72996z1) C67875b.this.getItem(((Integer) view.getTag()).intValue());
                C67875b bVar = C67875b.this;
                DelChatroomMemberUI delChatroomMemberUI = DelChatroomMemberUI.this;
                String string = delChatroomMemberUI.f194841p ? delChatroomMemberUI.getString(C0966R.string.i6_, new Object[]{bVar.mo93286a(z1Var)}) : delChatroomMemberUI.getString(C0966R.string.i69, new Object[]{bVar.mo93286a(z1Var)});
                DelChatroomMemberUI delChatroomMemberUI2 = DelChatroomMemberUI.this;
                String string2 = delChatroomMemberUI2.f194841p ? delChatroomMemberUI2.getString(C0966R.string.i6i) : delChatroomMemberUI2.getString(C0966R.string.i6h);
                DelChatroomMemberUI delChatroomMemberUI3 = DelChatroomMemberUI.this;
                C76879j.m92709C(delChatroomMemberUI3, string, (String) null, string2, delChatroomMemberUI3.getString(C0966R.string.f7926wf), true, new C67877a(z1Var), new C67879b(z1Var));
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/DelChatroomMemberUI$DelChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C67875b() {
        }

        /* renamed from: a */
        public String mo93286a(C72996z1 z1Var) {
            String str;
            if (!Util.isNullOrNil(z1Var.mo73969n2())) {
                str = z1Var.mo73969n2();
            } else {
                DelChatroomMemberUI delChatroomMemberUI = DelChatroomMemberUI.this;
                String username = z1Var.getUsername();
                C44661m1 m1Var = delChatroomMemberUI.f194837i;
                str = m1Var == null ? null : m1Var.mo69789q2(username);
            }
            if (Util.isNullOrNil(str)) {
                str = z1Var.mo73969n2();
            }
            return Util.isNullOrNil(str) ? z1Var.mo62909j3() : str;
        }

        public int getCount() {
            return ((LinkedList) this.f194846d).size();
        }

        public Object getItem(int i) {
            return ((LinkedList) this.f194846d).get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C67880c cVar;
            if (view == null) {
                view = View.inflate(DelChatroomMemberUI.this, C0966R.C0971layout.f6811p7, (ViewGroup) null);
                cVar = new C67880c(DelChatroomMemberUI.this);
                cVar.f194854a = (ImageView) view.findViewById(C0966R.C0970id.b0y);
                cVar.f194855b = (TextView) view.findViewById(C0966R.C0970id.b0z);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.b0x);
                cVar.f194856c = textView;
                textView.setOnClickListener(new C67876a());
                view.setTag(cVar);
            } else {
                cVar = (C67880c) view.getTag();
            }
            cVar.f194856c.setTag(Integer.valueOf(i));
            C72996z1 z1Var = (C72996z1) getItem(i);
            String a = mo93286a(z1Var);
            cVar.f194855b.setText(a);
            ((C76979h) C86312j.m106911c(C76979h.class)).yp0(DelChatroomMemberUI.this, a, cVar.f194855b.getTextSize());
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(cVar.f194854a, z1Var.getUsername());
            return view;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.DelChatroomMemberUI$c */
    public class C67880c {

        /* renamed from: a */
        public ImageView f194854a;

        /* renamed from: b */
        public TextView f194855b;

        /* renamed from: c */
        public TextView f194856c;

        public C67880c(DelChatroomMemberUI delChatroomMemberUI) {
        }
    }

    /* renamed from: H7 */
    public static C72940a m80262H7(DelChatroomMemberUI delChatroomMemberUI, String str, boolean z) {
        delChatroomMemberUI.getClass();
        if (str == null || str.equals("")) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        C72940a a = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(delChatroomMemberUI.f194834f).mo71490a(delChatroomMemberUI.f194834f, linkedList, delChatroomMemberUI.f194838j);
        a.f212613b = new C67962h0(delChatroomMemberUI, str, z, linkedList);
        a.f212614c = new C67972k0(delChatroomMemberUI, str);
        if (z) {
            a.mo100865c();
            return a;
        }
        a.mo100867d(delChatroomMemberUI, delChatroomMemberUI.getString(C0966R.string.a3h), delChatroomMemberUI.getString(C0966R.string.i64), true, true, new C67973l0(delChatroomMemberUI, a));
        return a;
    }

    /* renamed from: I7 */
    public static void m80263I7(DelChatroomMemberUI delChatroomMemberUI, C72963f4 f4Var, int i, List list, int i2, int i3, int i4, String str) {
        delChatroomMemberUI.getClass();
        ((C31950v0) C86312j.m106911c(C31950v0.class)).w70(delChatroomMemberUI.f194834f, list != null ? list.size() : 0, i2, i, i3, i4, Util.safeParseLong(f4Var != null ? f4Var.mo108764r2() : ""), str);
    }

    /* renamed from: J7 */
    public static C75818e m80264J7(String str, C72963f4 f4Var, int i, String str2, C77086f fVar) {
        if (f4Var == null) {
            Log.m105920e("MicroMsg.DelChatroomMemberUI", "revokeRecord msgInfo is null");
            return null;
        }
        C64490kg2 kg22 = new C64490kg2();
        kg22.f183925d = f4Var.mo108774y2();
        kg22.f183926e = Long.parseLong(f4Var.mo108764r2());
        kg22.f183927f = str;
        kg22.f183928g = i;
        if (i == 2) {
            kg22.f183929h = str2;
        }
        kg22.f183930i = C7628p0.m7761a(C75592q0.m90789s(), f4Var.getCreateTime());
        C75818e qd = ((C45819c) C86312j.m106911c(C45819c.class)).mo71193qd(true);
        qd.mo100870b(new C32330n(221, kg22));
        qd.mo106110a(fVar).mo100865c();
        return qd;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6812p8;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.i6l);
        this.f194832d = (ListView) findViewById(C0966R.C0970id.grn);
        C67875b bVar = new C67875b();
        this.f194833e = bVar;
        LinkedList<String> linkedList = this.f194835g;
        if (linkedList != null) {
            Log.m105925i("MicroMsg.DelChatroomMemberAdapter", "initData members.size %d", Integer.valueOf(linkedList.size()));
            ((LinkedList) bVar.f194846d).clear();
            for (String next : linkedList) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next);
                if (z1Var != null && !Util.isNullOrNil(z1Var.getUsername()) && z1Var.getUsername().equals(next)) {
                    ((LinkedList) bVar.f194846d).add(z1Var);
                }
            }
        }
        this.f194832d.setAdapter(this.f194833e);
        setBackBtn(new C67874a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f194834f = getIntent().getStringExtra("RoomInfo_Id");
        this.f194838j = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f194839n = getIntent().getIntExtra("local_scene", 0);
        this.f194840o = getIntent().getIntExtra("select_record_report_opt", 0);
        this.f194841p = getIntent().getBooleanExtra("revoke_record", false);
        if (this.f194839n == 1) {
            this.f194844s = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(getIntent().getLongExtra("msg_id", -1));
        }
        String stringExtra = getIntent().getStringExtra("members");
        this.f194836h = Util.stringToList(getIntent().getStringExtra("origin_members"), ",");
        for (String add : stringExtra.split(",")) {
            this.f194835g.add(add);
        }
        this.f194837i = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f194834f);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.DelChatroomMemberUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
    }
}
