package com.tencent.p014mm.p136ui.contact;

import a11.C39479c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45612m0;
import eb0.C45628s0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kv1.C99251g;
import p749xh.C53339k1;
import sf0.C77702q0;

/* renamed from: com.tencent.mm.ui.contact.GroupCardSelectUI */
public class GroupCardSelectUI extends MMActivity {

    /* renamed from: d */
    public boolean f24393d = true;

    /* renamed from: e */
    public boolean f24394e;

    /* renamed from: f */
    public boolean f24395f;

    /* renamed from: g */
    public boolean f24396g;

    /* renamed from: h */
    public boolean f24397h;

    /* renamed from: i */
    public boolean f24398i;

    /* renamed from: j */
    public ArrayList<String> f24399j;

    /* renamed from: n */
    public boolean f24400n = false;

    /* renamed from: o */
    public List<String> f24401o = null;

    /* renamed from: p */
    public int f24402p;

    /* renamed from: q */
    public boolean f24403q;

    /* renamed from: r */
    public ListView f24404r;

    /* renamed from: s */
    public C6881c1 f24405s;

    /* renamed from: t */
    public List<C72996z1> f24406t;

    /* renamed from: u */
    public View f24407u;

    /* renamed from: com.tencent.mm.ui.contact.GroupCardSelectUI$a */
    public class C6827a implements AdapterView.OnItemClickListener {
        public C6827a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x01c4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                r17 = this;
                r6 = r17
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r18
                r0.add(r1)
                r1 = r19
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                r0.add(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r21)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/ui/contact/GroupCardSelectUI$1"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r4 = r17
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.ui.contact.GroupCardSelectUI r0 = com.tencent.p014mm.p136ui.contact.GroupCardSelectUI.this
                boolean r1 = r0.f24396g
                r2 = 1
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r4 = "onItemClick"
                java.lang.String r5 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r7 = "com/tencent/mm/ui/contact/GroupCardSelectUI$1"
                if (r1 == 0) goto L_0x00a0
                android.widget.ListView r0 = r0.f24404r
                int r0 = r0.getHeaderViewsCount()
                int r0 = r20 - r0
                if (r20 != 0) goto L_0x00a2
                com.tencent.mm.ui.contact.GroupCardSelectUI r0 = com.tencent.p014mm.p136ui.contact.GroupCardSelectUI.this
                r0.getClass()
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                r8 = 12
                java.lang.String r9 = "list_type"
                r1.putExtra(r9, r8)
                r8 = 2131820849(0x7f110131, float:1.9274425E38)
                java.lang.String r8 = r0.getString(r8)
                java.lang.String r9 = "titile"
                r1.putExtra(r9, r8)
                java.lang.String r8 = eb0.C75592q0.m90789s()
                java.lang.String r9 = "block_contact"
                r1.putExtra(r9, r8)
                java.lang.String r8 = "KBlockOpenImFav"
                r1.putExtra(r8, r2)
                java.lang.String r8 = "without_openim"
                r1.putExtra(r8, r2)
                r2 = 6
                int[] r2 = new int[r2]
                r2 = {16384, 64, 1, 2, 4, 4194304} // fill-array
                int r2 = com.tencent.p014mm.p136ui.contact.C74560s1.m89278g(r2)
                java.lang.String r8 = "list_attr"
                r1.putExtra(r8, r2)
                com.tencent.mm.ui.contact.f1 r2 = new com.tencent.mm.ui.contact.f1
                r2.<init>(r0)
                r0.setMMOnFragmentActivityResult(r2)
                r2 = 10001(0x2711, float:1.4014E-41)
                java.lang.String r8 = ".ui.contact.SelectContactUI"
                ke3.C88144b.m109802t(r0, r8, r1, r2)
                j20.C117292a.m165361g(r6, r7, r5, r4, r3)
                return
            L_0x00a0:
                r0 = r20
            L_0x00a2:
                com.tencent.mm.ui.contact.GroupCardSelectUI r1 = com.tencent.p014mm.p136ui.contact.GroupCardSelectUI.this
                com.tencent.mm.ui.contact.c1 r1 = r1.f24405s
                java.lang.Object r0 = r1.getItem(r0)
                com.tencent.mm.storage.z1 r0 = (com.tencent.p014mm.storage.C72996z1) r0
                if (r0 != 0) goto L_0x00b9
                java.lang.String r0 = "MicroMsg.GroupCardSelectUI"
                java.lang.String r1 = "onItemClick contact null"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
                j20.C117292a.m165361g(r6, r7, r5, r4, r3)
                return
            L_0x00b9:
                com.tencent.mm.ui.contact.GroupCardSelectUI r1 = com.tencent.p014mm.p136ui.contact.GroupCardSelectUI.this
                boolean r8 = r1.f24400n
                r15 = 0
                if (r8 == 0) goto L_0x0119
                java.util.List<java.lang.String> r8 = r1.f24401o
                java.lang.String r9 = r0.getUsername()
                boolean r8 = r8.contains(r9)
                if (r8 == 0) goto L_0x00d8
                java.util.List<java.lang.String> r8 = r1.f24401o
                java.lang.String r0 = r0.getUsername()
                r8.remove(r0)
                r1.f24397h = r2
                goto L_0x0111
            L_0x00d8:
                boolean r8 = r1.f24400n
                if (r8 == 0) goto L_0x0104
                java.util.List<java.lang.String> r8 = r1.f24401o
                int r8 = r8.size()
                int r9 = r1.f24402p
                if (r8 < r9) goto L_0x0104
                r8 = 2131835521(0x7f113a81, float:1.9304183E38)
                java.lang.Object[] r10 = new java.lang.Object[r2]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r15] = r9
                java.lang.String r8 = r1.getString(r8, r10)
                androidx.appcompat.app.AppCompatActivity r9 = r1.getContext()
                com.tencent.mm.ui.contact.e1 r10 = new com.tencent.mm.ui.contact.e1
                r10.<init>(r1)
                java.lang.String r11 = ""
                nj3.C76879j.m92749t(r9, r8, r11, r10)
                r15 = 1
            L_0x0104:
                if (r15 != 0) goto L_0x0111
                java.util.List<java.lang.String> r8 = r1.f24401o
                java.lang.String r0 = r0.getUsername()
                r8.add(r0)
                r1.f24397h = r2
            L_0x0111:
                com.tencent.mm.ui.contact.c1 r0 = r1.f24405s
                r0.notifyDataSetChanged()
            L_0x0116:
                r8 = 1
                goto L_0x027e
            L_0x0119:
                android.content.Intent r8 = r1.getIntent()
                java.lang.String r9 = "group_select_should_intercept"
                boolean r8 = r8.getBooleanExtra(r9, r15)
                if (r8 != 0) goto L_0x0127
                goto L_0x01bf
            L_0x0127:
                java.lang.Class<a11.c> r8 = a11.C39479c.class
                k40.a r8 = f40.C86709a0.m107533q(r8)
                a11.c r8 = (a11.C39479c) r8
                eb0.m2 r8 = r8.mo62084mr()
                java.lang.String r9 = r0.getUsername()
                com.tencent.mm.storage.n1 r8 = (com.tencent.p014mm.storage.C44662n1) r8
                com.tencent.mm.storage.m1 r8 = r8.mo69799Lo(r9)
                r9 = 2131821556(0x7f1103f4, float:1.9275859E38)
                r10 = 2131823309(0x7f110acd, float:1.9279414E38)
                if (r8 == 0) goto L_0x016d
                int r8 = r8.mo69788p2()
                r11 = 2
                if (r8 != r11) goto L_0x016d
                qo3.q r8 = new qo3.q
                androidx.appcompat.app.AppCompatActivity r11 = r1.getContext()
                r8.<init>(r11)
                java.lang.String r10 = r1.getString(r10)
                r8.mo107606r(r10)
                r10 = 2131823318(0x7f110ad6, float:1.9279432E38)
                java.lang.String r10 = r1.getString(r10)
                r8.mo107595g(r10)
                r8.mo107601m(r9)
                r8.mo107603o()
                goto L_0x01bd
            L_0x016d:
                java.lang.Class<pi.d> r8 = p644pi.C77089d.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                pi.d r8 = (p644pi.C77089d) r8
                si.b r8 = r8.vx0()
                java.lang.String r11 = r0.getUsername()
                te3.av3 r8 = r8.mo60794jo(r11)
                if (r8 == 0) goto L_0x01bf
                java.util.LinkedList<te3.zu3> r11 = r8.f130782e
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r11)
                if (r11 != 0) goto L_0x01bf
                qo3.q r11 = new qo3.q
                androidx.appcompat.app.AppCompatActivity r12 = r1.getContext()
                r11.<init>(r12)
                java.lang.String r10 = r1.getString(r10)
                r11.mo107606r(r10)
                r10 = 2131823317(0x7f110ad5, float:1.927943E38)
                java.lang.String r10 = r1.getString(r10)
                java.lang.Object[] r12 = new java.lang.Object[r2]
                java.util.LinkedList<te3.zu3> r8 = r8.f130782e
                java.lang.Object r8 = r8.getFirst()
                te3.zu3 r8 = (te3.C52310zu3) r8
                java.lang.String r8 = r8.f146230e
                r12[r15] = r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r10, r12)
                r11.mo107595g(r8)
                r11.mo107601m(r9)
                r11.mo107603o()
            L_0x01bd:
                r8 = 1
                goto L_0x01c0
            L_0x01bf:
                r8 = 0
            L_0x01c0:
                if (r8 == 0) goto L_0x01c4
                goto L_0x0116
            L_0x01c4:
                boolean r8 = r1.f24393d
                r9 = -1
                if (r8 == 0) goto L_0x023b
                boolean r8 = r1.f24394e
                if (r8 == 0) goto L_0x01e3
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                java.lang.String r0 = r0.getUsername()
                java.lang.String r10 = "Select_Conv_User"
                r8.putExtra(r10, r0)
                r1.setResult(r9, r8)
                r1.finish()
                goto L_0x0116
            L_0x01e3:
                android.content.Intent r8 = new android.content.Intent
                java.lang.Class<com.tencent.mm.ui.chatting.ChattingUI> r9 = com.tencent.p014mm.p136ui.chatting.ChattingUI.class
                r8.<init>(r1, r9)
                r9 = 67108864(0x4000000, float:1.5046328E-36)
                r8.addFlags(r9)
                java.lang.String r0 = r0.getUsername()
                java.lang.String r9 = "Chat_User"
                r8.putExtra(r9, r0)
                java.lang.String r0 = "chat_from_scene_for_group_chats"
                r8.putExtra(r0, r2)
                k20.a r0 = new k20.a
                r0.<init>()
                r0.mo10233c(r8)
                java.lang.Object[] r9 = r0.mo10232b()
                java.lang.String r10 = "com/tencent/mm/ui/contact/GroupCardSelectUI"
                java.lang.String r11 = "handleSelect"
                java.lang.String r12 = "(Lcom/tencent/mm/storage/Contact;)V"
                java.lang.String r13 = "Undefined"
                java.lang.String r14 = "startActivity"
                java.lang.String r16 = "(Landroid/content/Intent;)V"
                r8 = r1
                r2 = 0
                r15 = r16
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r0 = r0.mo10231a(r2)
                android.content.Intent r0 = (android.content.Intent) r0
                r1.startActivity(r0)
                java.lang.String r9 = "com/tencent/mm/ui/contact/GroupCardSelectUI"
                java.lang.String r10 = "handleSelect"
                java.lang.String r11 = "(Lcom/tencent/mm/storage/Contact;)V"
                java.lang.String r12 = "Undefined"
                java.lang.String r13 = "startActivity"
                java.lang.String r14 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                r1.finish()
                goto L_0x0116
            L_0x023b:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                eb0.c r8 = eb0.C97625j3.m125812b()
                eb0.m2 r8 = r8.mo105902q()
                java.lang.String r10 = r0.getUsername()
                com.tencent.mm.storage.n1 r8 = (com.tencent.p014mm.storage.C44662n1) r8
                java.util.List r8 = r8.mo69804bD(r10)
                java.lang.String r10 = ","
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r8, r10)
                java.lang.String r10 = "Select_Contact"
                r2.putExtra(r10, r8)
                java.lang.Class<d62.i> r8 = d62.C75339i.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                d62.i r8 = (d62.C75339i) r8
                java.lang.String r0 = r0.getUsername()
                java.lang.String r0 = r8.getDisplayName(r0)
                java.lang.String r8 = "Select_room_name"
                r2.putExtra(r8, r0)
                java.lang.String r0 = "Select_From_Group"
                r8 = 1
                r2.putExtra(r0, r8)
                r1.setResult(r9, r2)
                r1.finish()
            L_0x027e:
                com.tencent.mm.ui.contact.GroupCardSelectUI r0 = com.tencent.p014mm.p136ui.contact.GroupCardSelectUI.this
                boolean r1 = r0.f24400n
                if (r1 == 0) goto L_0x0295
                boolean r1 = r0.f24397h
                if (r1 == 0) goto L_0x0295
                r0.enableOptionMenu(r8, r8)
                r1 = 2131821561(0x7f1103f9, float:1.9275869E38)
                java.lang.String r1 = r0.getString(r1)
                r0.updateOptionMenuText(r8, r1)
            L_0x0295:
                j20.C117292a.m165361g(r6, r7, r5, r4, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.GroupCardSelectUI.C6827a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.GroupCardSelectUI$b */
    public class C6828b implements MenuItem.OnMenuItemClickListener {
        public C6828b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GroupCardSelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.GroupCardSelectUI$c */
    public static class C6829c {

        /* renamed from: a */
        public TextView f24410a;

        /* renamed from: b */
        public TextView f24411b;

        /* renamed from: c */
        public ImageView f24412c;

        /* renamed from: d */
        public CheckBox f24413d;

        /* renamed from: e */
        public WeImageView f24414e;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aym;
    }

    public void initView() {
        this.f24404r = (ListView) findViewById(C0966R.C0970id.er4);
        if (this.f24403q) {
            this.f24405s = new C6946z3(this, this.f24406t, this.f24401o, this.f24400n);
            this.f24404r.setBackgroundResource(C0966R.color.f3284m6);
        } else {
            this.f24405s = new C6881c1(this, this.f24406t, this.f24401o, this.f24400n);
        }
        this.f24404r.setAdapter(this.f24405s);
        this.f24404r.setOnItemClickListener(new C6827a());
        this.f24407u = findViewById(C0966R.C0970id.nne);
        if (this.f24405s.getCount() <= 0) {
            Log.m105924i("MicroMsg.GroupCardSelectUI", "show empty view");
            View view = this.f24407u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(1, false);
        } else {
            Log.m105924i("MicroMsg.GroupCardSelectUI", "hide empty view");
            View view3 = this.f24407u;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/contact/GroupCardSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setBackBtn(new C6828b());
        if (this.f24396g) {
            ListView listView = this.f24404r;
            View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ayp, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.bsk)).setText(C0966R.string.f360242b43);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.il8);
            if (this.f24405s.getCount() <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            listView.addHeaderView(inflate);
        }
    }

    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        this.f24393d = getIntent().getBooleanExtra("group_select_type", true);
        this.f24394e = getIntent().getBooleanExtra("group_select_need_result", false);
        this.f24395f = getIntent().getBooleanExtra("group_select_only_need_self_owner", false);
        this.f24398i = getIntent().getBooleanExtra("group_select_filter_associate_chat_room", false);
        this.f24399j = getIntent().getStringArrayListExtra("group_select_block_chatroom");
        this.f24396g = getIntent().getBooleanExtra("group_select_show_create_new_group", false);
        this.f24403q = getIntent().getBooleanExtra("group_should_show_chatroom_member", false);
        getIntent().getIntExtra("group_select_chatroom_max_num", Integer.MAX_VALUE);
        boolean booleanExtra = getIntent().getBooleanExtra("privacy_from_select_contact_ui", false);
        if (this.f24395f && !this.f24396g) {
            setMMTitle(getString(C0966R.string.f7488hm));
        } else if (booleanExtra) {
            setMMTitle(getString(C0966R.string.f361376mz0));
        } else {
            setMMTitle(getString(C0966R.string.f7487hl));
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("group_multi_select", false);
        this.f24400n = booleanExtra2;
        if (booleanExtra2) {
            String stringExtra = getIntent().getStringExtra("already_select_contact");
            if (Util.isNullOrNil(stringExtra)) {
                this.f24401o = new LinkedList();
            } else {
                String[] split = stringExtra.split(",");
                int i = C77702q0.f226484a;
                if (split == null || split.length == 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (String add : split) {
                        arrayList.add(add);
                    }
                }
                this.f24401o = arrayList;
            }
            this.f24402p = getIntent().getIntExtra("max_limit_num", 0);
        }
        List<String> c = C99251g.m129282c();
        LinkedList linkedList = new LinkedList();
        if (this.f24395f) {
            HashSet hashSet = new HashSet(((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69808kD(C45612m0.m50699p()));
            for (String next : c) {
                ArrayList<String> arrayList2 = this.f24399j;
                if ((arrayList2 == null || !arrayList2.contains(next)) && hashSet.contains(next)) {
                    if (!this.f24398i ? true : !C45628s0.m50735A(next)) {
                        linkedList.add(next);
                    }
                }
            }
        } else {
            for (String next2 : c) {
                ArrayList<String> arrayList3 = this.f24399j;
                if (arrayList3 == null || !arrayList3.contains(next2)) {
                    if (!this.f24398i ? true : !C45628s0.m50735A(next2)) {
                        linkedList.add(next2);
                    }
                }
            }
        }
        if (linkedList.isEmpty()) {
            this.f24406t = new LinkedList();
        } else {
            HashMap hashMap = new HashMap();
            ArrayList arrayList4 = new ArrayList();
            for (List<String> list : CommonKt.splitList(linkedList, 100)) {
                for (C72996z1 z1Var : C53339k1.f149474h1.selectAll().where(C53339k1.f149475i1.inString(list)).build().multiQuery(C86709a0.m107535s().f251811i, C72996z1.class)) {
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    hashMap.put(username, z1Var);
                }
                for (String str : list) {
                    C72996z1 z1Var2 = (C72996z1) hashMap.get(str);
                    if (z1Var2 != null) {
                        arrayList4.add(z1Var2);
                    }
                }
            }
            this.f24406t = arrayList4;
        }
        initView();
        if (this.f24400n) {
            addTextOptionMenu(1, getString(C0966R.string.mum), new C6882d1(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
            enableOptionMenu(1, false);
            if (this.f24400n && this.f24397h) {
                enableOptionMenu(1, true);
                updateOptionMenuText(1, getString(C0966R.string.mum));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
