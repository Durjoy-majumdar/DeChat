package com.tencent.p014mm.plugin.label.p067ui;

import a22.C0008d;
import a22.C27740g;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.MMTagPanelScrollView;
import com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.label.p067ui.widget.MMLabelPanel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72996z1;
import d22.C45257b;
import d22.C45258c;
import d22.C75320d;
import di3.C86312j;
import e22.C75522n;
import e22.C75529q0;
import e22.C75534v;
import e22.C75535w;
import e22.C75536x;
import e22.C75537y;
import e22.u$$a;
import e22.u$$b;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g22.C75828a;
import g22.C75830b;
import g22.C75838j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import qo3.C77398g;
import qo3.C77407n;
import qo3.C77426q;
import te3.C48982cc;
import uo3.C78253a;
import zp3.C79406f;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI */
public class ContactLabelSelectUI extends ContactLabelBaseUI implements C11385n, C11184p0 {

    /* renamed from: X */
    public static final /* synthetic */ int f198575X = 0;

    /* renamed from: A */
    public boolean f198576A = false;

    /* renamed from: B */
    public C75838j f198577B;

    /* renamed from: C */
    public ArrayList<C72955b2> f198578C = new ArrayList<>();

    /* renamed from: D */
    public ArrayList<C72955b2> f198579D = new ArrayList<>();

    /* renamed from: E */
    public HashMap<Integer, Long> f198580E = new HashMap<>();

    /* renamed from: F */
    public HashMap<Integer, Integer> f198581F;

    /* renamed from: G */
    public HashMap<String, String> f198582G;

    /* renamed from: H */
    public HashMap<String, String> f198583H;

    /* renamed from: I */
    public HashSet<String> f198584I;

    /* renamed from: J */
    public HashSet<String> f198585J;

    /* renamed from: K */
    public boolean f198586K;

    /* renamed from: L */
    public boolean f198587L;

    /* renamed from: M */
    public C78253a f198588M;

    /* renamed from: N */
    public int f198589N;

    /* renamed from: P */
    public int f198590P;

    /* renamed from: Q */
    public boolean f198591Q;

    /* renamed from: R */
    public int f198592R;

    /* renamed from: S */
    public MMHandler f198593S;

    /* renamed from: T */
    public C75828a.C75829a f198594T;

    /* renamed from: U */
    public C77398g f198595U;

    /* renamed from: V */
    public MStorage.IOnStorageChange f198596V;

    /* renamed from: W */
    public MStorageEx.IOnStorageChange f198597W;

    /* renamed from: e */
    public final int f198598e = C0966R.string.f7929wj;

    /* renamed from: f */
    public final int f198599f = C0966R.string.n_w;

    /* renamed from: g */
    public int f198600g = 0;

    /* renamed from: h */
    public C69085p f198601h = C69085p.Normal;

    /* renamed from: i */
    public View f198602i;

    /* renamed from: j */
    public View f198603j;

    /* renamed from: n */
    public View f198604n;

    /* renamed from: o */
    public Button f198605o;

    /* renamed from: p */
    public Button f198606p;

    /* renamed from: q */
    public View f198607q;

    /* renamed from: r */
    public RecyclerView f198608r;

    /* renamed from: s */
    public C75830b f198609s;

    /* renamed from: t */
    public View f198610t;

    /* renamed from: u */
    public View f198611u;

    /* renamed from: v */
    public MMTagPanelScrollView f198612v;

    /* renamed from: w */
    public MMLabelPanel f198613w;

    /* renamed from: x */
    public boolean f198614x = true;

    /* renamed from: y */
    public boolean f198615y = false;

    /* renamed from: z */
    public String f198616z;

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$a */
    public class C69067a implements C75838j.C75844f {
        public C69067a() {
        }

        /* renamed from: W */
        public void mo95116W(View view, int i) {
            ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
            if (!contactLabelSelectUI.f198614x) {
                contactLabelSelectUI.getClass();
                C72955b2 F4 = ContactLabelSelectUI.this.f198577B.mo106121F4(i);
                if (F4 == null || !F4.field_isTemporary || F4.field_labelID != -1000000) {
                    ContactLabelSelectUI contactLabelSelectUI2 = ContactLabelSelectUI.this;
                    contactLabelSelectUI2.f198588M.mo108272g(view, i, -1, contactLabelSelectUI2, contactLabelSelectUI2, contactLabelSelectUI2.f198589N, contactLabelSelectUI2.f198590P);
                    return;
                }
                Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "onItemLongClick, is no lebal title item, position = " + i);
            }
        }

        /* renamed from: a */
        public void mo95117a(Intent intent) {
            ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
            contactLabelSelectUI.f198591Q = false;
            contactLabelSelectUI.startActivityForResult(intent, 8001);
        }

        /* renamed from: b */
        public void mo95118b(C75529q0 q0Var, int i) {
            Integer num;
            CheckBox checkBox = q0Var.f221911C;
            if (checkBox != null) {
                boolean z = true;
                checkBox.setChecked(!checkBox.isChecked());
                boolean isChecked = q0Var.f221911C.isChecked();
                C75838j jVar = ContactLabelSelectUI.this.f198577B;
                if (jVar != null && i >= 0) {
                    C72955b2 F4 = jVar.mo106121F4(i);
                    C75838j jVar2 = ContactLabelSelectUI.this.f198577B;
                    HashMap<Integer, Integer> hashMap = jVar2.f222472r;
                    if (hashMap == null || hashMap.isEmpty() || !jVar2.f222472r.containsKey(Integer.valueOf(F4.field_labelID)) || (num = jVar2.f222472r.get(Integer.valueOf(F4.field_labelID))) == null || num.intValue() > 0) {
                        z = false;
                    }
                    if (z) {
                        q0Var.f221911C.setChecked(false);
                        C77426q qVar = new C77426q(ContactLabelSelectUI.this.getContext());
                        qVar.mo107595g(ContactLabelSelectUI.this.getResources().getString(C0966R.string.myq));
                        qVar.mo107602n(ContactLabelSelectUI.this.getResources().getString(C0966R.string.f8028zq));
                        qVar.mo107603o();
                    } else if (isChecked) {
                        ContactLabelSelectUI.this.mo95135P7(String.valueOf(F4.field_labelID));
                    } else {
                        ContactLabelSelectUI.m81375I7(ContactLabelSelectUI.this, String.valueOf(F4.field_labelID), false);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$b */
    public class C69068b implements MenuItem.OnMenuItemClickListener {
        public C69068b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
            int i = ContactLabelSelectUI.f198575X;
            contactLabelSelectUI.getClass();
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < contactLabelSelectUI.f198577B.f222463f.size(); i2++) {
                ArrayList<String> bO = C27740g.vx0().mo100951bO(contactLabelSelectUI.f198577B.f222463f.get(i2));
                if (bO != null && bO.size() > 0) {
                    hashSet.addAll(bO);
                }
            }
            String s = C75592q0.m90789s();
            if (hashSet.contains(s)) {
                hashSet.remove(s);
            }
            Intent intent = new Intent(contactLabelSelectUI, SelectPrivacyContactsFromRangeUI.class);
            intent.putExtra("privacy_source_type", contactLabelSelectUI.f198616z);
            intent.putExtra("privacy_menu_enter_type", 3);
            intent.putExtra("privacy_select_chatroom_or_lebal_count", contactLabelSelectUI.f198577B.f222463f.size());
            intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
            intent.putExtra("need_show_all_selected", true);
            intent.putExtra("titile", contactLabelSelectUI.getResources().getString(C0966R.string.hm6));
            intent.putExtra("list_type", 1);
            intent.putExtra("already_select_contact", (String[]) hashSet.toArray(new String[0]));
            intent.putExtra("key_label_click_source", contactLabelSelectUI.getIntent().getIntExtra("key_label_click_source", 0));
            contactLabelSelectUI.startActivityForResult(intent, 7001);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$c */
    public class C69069c implements View.OnClickListener {
        public C69069c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75838j jVar = ContactLabelSelectUI.this.f198577B;
            if (jVar != null) {
                jVar.mo106122G4();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$d */
    public class C69070d implements Runnable {
        public C69070d(ContactLabelSelectUI contactLabelSelectUI) {
        }

        public void run() {
            C97625j3.m125815e().mo123460f(new C75320d());
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$e */
    public class C69071e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f198620d;

        /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$e$a */
        public class C69072a implements Runnable {
            public C69072a() {
            }

            public void run() {
                MMHandler mMHandler;
                if (ContactLabelSelectUI.this.f198578C.size() > 0) {
                    ContactLabelSelectUI.m81376J7(ContactLabelSelectUI.this);
                } else {
                    ContactLabelSelectUI.this.f198577B.mo106123O4();
                    ContactLabelSelectUI.this.mo95139T7(C69085p.Empty);
                }
                C69071e eVar = C69071e.this;
                if (eVar.f198620d && (mMHandler = ContactLabelSelectUI.this.f198593S) != null) {
                    mMHandler.removeMessages(5002);
                    ContactLabelSelectUI.this.f198593S.sendEmptyMessageDelayed(5003, 0);
                }
                ContactLabelSelectUI.this.mo95137R7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$e$b */
        public class C69073b implements Runnable {
            public C69073b() {
            }

            public void run() {
                MMHandler mMHandler;
                ContactLabelSelectUI.m81376J7(ContactLabelSelectUI.this);
                C69071e eVar = C69071e.this;
                if (eVar.f198620d && (mMHandler = ContactLabelSelectUI.this.f198593S) != null) {
                    mMHandler.removeMessages(5002);
                    ContactLabelSelectUI.this.f198593S.sendEmptyMessageDelayed(5003, 400);
                }
            }
        }

        public C69071e(boolean z) {
            this.f198620d = z;
        }

        public void run() {
            ContactLabelSelectUI.this.f198578C = C27740g.vx0().mo100953kD();
            ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
            if (contactLabelSelectUI.f198578C == null) {
                contactLabelSelectUI.f198578C = new ArrayList<>();
            }
            Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "updateData allContactLabel size:%d", Integer.valueOf(ContactLabelSelectUI.this.f198578C.size()));
            ContactLabelSelectUI contactLabelSelectUI2 = ContactLabelSelectUI.this;
            if (contactLabelSelectUI2.f198614x && contactLabelSelectUI2.f198576A) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < ContactLabelSelectUI.this.f198578C.size(); i++) {
                    C72955b2 b2Var = ContactLabelSelectUI.this.f198578C.get(i);
                    int i2 = b2Var.field_labelID;
                    ArrayList<String> bO = C27740g.vx0().mo100951bO(i2 + "");
                    if (bO == null || bO.size() <= 0) {
                        arrayList.add(b2Var);
                    }
                }
                if (arrayList.size() > 0) {
                    ContactLabelSelectUI.this.f198578C.removeAll(arrayList);
                }
                Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "updateData: filterContactLabel size:%d", Integer.valueOf(arrayList.size()));
            }
            ContactLabelSelectUI.this.f198584I.clear();
            ArrayList<C72955b2> arrayList2 = ContactLabelSelectUI.this.f198578C;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "cpan[updateData] Empty");
                if (ContactLabelSelectUI.this.f198586K) {
                    C115669n.INSTANCE.mo160131h(11346, 1, 0);
                    ContactLabelSelectUI.this.f198586K = false;
                }
                ContactLabelSelectUI contactLabelSelectUI3 = ContactLabelSelectUI.this;
                if (!contactLabelSelectUI3.f198614x) {
                    ArrayList arrayList3 = new ArrayList();
                    HashSet<String> hashSet = contactLabelSelectUI3.f198584I;
                    if (hashSet != null && hashSet.size() > 0) {
                        Iterator<String> it = contactLabelSelectUI3.f198584I.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(it.next());
                        }
                    }
                    String s = C75592q0.m90789s();
                    if (!arrayList3.contains("filehelper")) {
                        arrayList3.add("filehelper");
                    }
                    if (!arrayList3.contains(s)) {
                        arrayList3.add(s);
                    }
                    C86709a0.m107528h();
                    Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, "", "@all.contact.without.chatroom.without.openim.without.openimfavour", "", arrayList3);
                    HashMap hashMap = new HashMap();
                    if (S3.getCount() != 0) {
                        ArrayList arrayList4 = new ArrayList();
                        int i3 = 0;
                        while (S3.moveToPosition(i3)) {
                            Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "create contact item index=%d", Integer.valueOf(i3));
                            i3++;
                            C72996z1 z1Var = new C72996z1();
                            z1Var.convertFrom(S3);
                            arrayList4.add(z1Var.getUsername());
                            if (arrayList4.size() > 10) {
                                break;
                            }
                        }
                        if (arrayList4.size() > 0) {
                            hashMap.put(Integer.valueOf(S3.getCount()), arrayList4);
                        }
                        S3.close();
                    }
                    if (hashMap.size() > 0) {
                        C75838j.C75839a aVar = new C75838j.C75839a();
                        aVar.field_labelName = contactLabelSelectUI3.getResources().getString(C0966R.string.g2_);
                        aVar.field_labelID = -1000000;
                        aVar.field_isTemporary = true;
                        Iterator it4 = hashMap.keySet().iterator();
                        if (it4.hasNext()) {
                            Integer num = (Integer) it4.next();
                            aVar.f222482C = num.intValue();
                            aVar.f222481B = (List) hashMap.get(num);
                        }
                        contactLabelSelectUI3.f198577B.f222466i = aVar;
                    } else {
                        contactLabelSelectUI3.f198577B.f222466i = null;
                    }
                }
                MMHandlerThread.postToMainThread(new C69072a());
                return;
            }
            Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "cpan[updateData] Normal");
            if (ContactLabelSelectUI.this.f198586K) {
                C115669n.INSTANCE.mo160131h(11346, 1, 1);
                ContactLabelSelectUI.this.f198586K = false;
            }
            ArrayList<C72955b2> arrayList5 = ContactLabelSelectUI.this.f198578C;
            if (arrayList5 != null && arrayList5.size() > 0) {
                Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "updateData run: mAllContactLabel size:%d", Integer.valueOf(ContactLabelSelectUI.this.f198578C.size()));
                int size = ContactLabelSelectUI.this.f198578C.size();
                C27740g.vx0().mo100945Lo();
                ContactLabelSelectUI.this.f198582G.clear();
                ContactLabelSelectUI.this.f198583H.clear();
                for (int i4 = 0; i4 < size; i4++) {
                    C72955b2 b2Var2 = ContactLabelSelectUI.this.f198578C.get(i4);
                    int i5 = b2Var2.field_labelID;
                    String str = b2Var2.field_labelName;
                    String str2 = i5 + "";
                    if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
                        Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "updateData label error, id:%s, name:%s", str2, str);
                    } else {
                        ContactLabelSelectUI.this.f198582G.put(str2, str);
                        ContactLabelSelectUI.this.f198583H.put(str, str2);
                    }
                    ArrayList<String> bO2 = C27740g.vx0().mo100951bO(i5 + "");
                    if (bO2 == null || bO2.size() <= 0) {
                        ContactLabelSelectUI.this.f198581F.put(Integer.valueOf(i5), 0);
                    } else {
                        ContactLabelSelectUI.this.f198584I.addAll(bO2);
                        ContactLabelSelectUI.this.f198581F.put(Integer.valueOf(i5), Integer.valueOf(bO2.size()));
                    }
                }
                Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "updateData run finish, size of LabelCountMap:%d, LabelIdNameMap:%d, LabelNameIdMap:%d", Integer.valueOf(ContactLabelSelectUI.this.f198581F.size()), Integer.valueOf(ContactLabelSelectUI.this.f198582G.size()), Integer.valueOf(ContactLabelSelectUI.this.f198583H.size()));
            }
            MMHandlerThread.postToMainThread(new C69073b());
        }

        public String toString() {
            return super.toString() + "|updateData";
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$f */
    public class C69074f implements C11182m0 {
        public C69074f() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(0, ContactLabelSelectUI.this.getResources().getColor(C0966R.color.a0u), ContactLabelSelectUI.this.getString(C0966R.string.g1p));
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$g */
    public class C69075g extends MMHandler {
        public C69075g() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "handleMessage:%d", Integer.valueOf(i));
            switch (i) {
                case 5001:
                    ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
                    int i2 = ContactLabelSelectUI.f198575X;
                    contactLabelSelectUI.mo95138S7(false);
                    return;
                case 5002:
                    ContactLabelSelectUI contactLabelSelectUI2 = ContactLabelSelectUI.this;
                    contactLabelSelectUI2.mo95085H7(contactLabelSelectUI2.getString(C0966R.string.a4d));
                    return;
                case 5003:
                    ContactLabelSelectUI.this.hideLoading();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$h */
    public class C69076h implements C75828a.C75829a {

        /* renamed from: a */
        public boolean f198626a = false;

        /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$h$a */
        public class C69077a implements Runnable {
            public C69077a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "can not drag.");
                ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
                contactLabelSelectUI.f198587L = false;
                contactLabelSelectUI.f198577B.notifyDataSetChanged();
            }
        }

        public C69076h() {
        }

        /* renamed from: e */
        public void mo95125e() {
            C75838j jVar = ContactLabelSelectUI.this.f198577B;
            if (jVar.f222471q != jVar.f222470p) {
                jVar.f222469o++;
            }
            jVar.f222471q = -1;
            jVar.f222470p = -1;
            this.f198626a = false;
        }

        /* renamed from: f */
        public void mo95126f(int i) {
        }

        public void onItemSelected(int i) {
            ContactLabelSelectUI.this.f198577B.f222471q = i;
            if (!this.f198626a) {
                C74804o4.m89546a();
            }
            this.f198626a = true;
        }

        public boolean onMove(int i, int i2) {
            ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
            C75838j jVar = contactLabelSelectUI.f198577B;
            jVar.f222470p = i2;
            boolean z = false;
            if (i2 == 0) {
                return false;
            }
            ArrayList<C72955b2> arrayList = jVar.f222462e;
            if (arrayList != null) {
                z = true;
                if (!jVar.f222461d) {
                    if (!contactLabelSelectUI.f198587L) {
                        contactLabelSelectUI.f198587L = true;
                        String string = contactLabelSelectUI.getResources().getString(C0966R.string.g2w);
                        C69077a aVar = new C69077a();
                        C77398g gVar = contactLabelSelectUI.f198595U;
                        if (gVar == null || !gVar.isShowing()) {
                            C77426q qVar = new C77426q(contactLabelSelectUI);
                            qVar.mo107595g(string);
                            qVar.mo107601m(C0966R.string.f8028zq);
                            qVar.mo107600l(new C75537y(contactLabelSelectUI, aVar));
                            contactLabelSelectUI.f198595U = qVar.f225839c;
                            qVar.mo107603o();
                        }
                    }
                    return true;
                }
                Collections.swap(arrayList, i, i2);
                ContactLabelSelectUI.this.f198577B.notifyItemMoved(i, i2);
            }
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$i */
    public class C69078i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f198629d;

        public C69078i(ArrayList arrayList) {
            this.f198629d = arrayList;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ArrayList arrayList = this.f198629d;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    C75838j jVar = ContactLabelSelectUI.this.f198577B;
                    if (jVar != null && jVar.f222463f.size() > 0) {
                        for (int i2 = 0; i2 < ContactLabelSelectUI.this.f198577B.f222463f.size(); i2++) {
                            C72955b2 bF = C27740g.vx0().mo100950bF(ContactLabelSelectUI.this.f198577B.f222463f.get(i2));
                            if (bF != null) {
                                if (!arrayList3.contains(bF.field_labelID + "")) {
                                    arrayList3.add(bF.field_labelID + "");
                                    arrayList2.add(bF);
                                }
                                C115669n.INSTANCE.mo160131h(16097, 2, 2, 2);
                            }
                        }
                    }
                    if (arrayList3.size() > 0) {
                        ContactLabelSelectUI.m81377K7(ContactLabelSelectUI.this, arrayList3, arrayList2);
                    }
                    ContactLabelSelectUI.this.f198592R = 2;
                } else if (arrayList.size() > 0) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i3 = 0; i3 < this.f198629d.size(); i3++) {
                        C72955b2 b2Var = (C72955b2) this.f198629d.get(i3);
                        if (b2Var != null) {
                            if (!arrayList4.contains(b2Var.field_labelID + "")) {
                                arrayList4.add(b2Var.field_labelID + "");
                            }
                            C115669n.INSTANCE.mo160131h(16097, 2, 2, 2);
                        }
                    }
                    ContactLabelSelectUI.m81377K7(ContactLabelSelectUI.this, arrayList4, this.f198629d);
                    ContactLabelSelectUI.this.f198592R = 1;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$j */
    public class C69079j implements MStorage.IOnStorageChange {
        public C69079j() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            MMHandler mMHandler;
            if (!Util.isNullOrNil(str) && (mMHandler = ContactLabelSelectUI.this.f198593S) != null) {
                mMHandler.removeMessages(5001);
                ContactLabelSelectUI.this.f198593S.sendEmptyMessageDelayed(5001, 400);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$k */
    public class C69080k implements MStorageEx.IOnStorageChange {
        public C69080k() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "event:%d, obj:%s", Integer.valueOf(i), obj);
            MMHandler mMHandler = ContactLabelSelectUI.this.f198593S;
            if (mMHandler != null) {
                mMHandler.removeMessages(5001);
                ContactLabelSelectUI.this.f198593S.sendEmptyMessageDelayed(5001, 400);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$l */
    public class C69081l implements MenuItem.OnMenuItemClickListener {
        public C69081l() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelSelectUI.this.getClass();
            ContactLabelSelectUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$m */
    public class C69082m implements View.OnClickListener {
        public C69082m(ContactLabelSelectUI contactLabelSelectUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$n */
    public class C69083n implements View.OnClickListener {
        public C69083n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactLabelSelectUI contactLabelSelectUI = ContactLabelSelectUI.this;
            int i = ContactLabelSelectUI.f198575X;
            contactLabelSelectUI.mo95132M7((ArrayList<C72955b2>) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$o */
    public class C69084o implements View.OnTouchListener {
        public C69084o() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                ContactLabelSelectUI.this.f198589N = (int) motionEvent.getRawX();
                ContactLabelSelectUI.this.f198590P = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelSelectUI$p */
    public enum C69085p {
        Normal,
        Empty
    }

    public ContactLabelSelectUI() {
        new HashMap();
        this.f198581F = new HashMap<>();
        this.f198582G = new HashMap<>();
        this.f198583H = new HashMap<>();
        this.f198584I = new HashSet<>();
        this.f198585J = new HashSet<>();
        this.f198586K = true;
        this.f198587L = false;
        this.f198589N = 0;
        this.f198590P = 0;
        this.f198591Q = true;
        this.f198592R = -1;
        this.f198593S = new C69075g();
        this.f198594T = new C69076h();
        this.f198595U = null;
        this.f198596V = new C69079j();
        this.f198597W = new C69080k();
        new C69081l();
    }

    /* renamed from: I7 */
    public static void m81375I7(ContactLabelSelectUI contactLabelSelectUI, String str, boolean z) {
        int i;
        contactLabelSelectUI.getClass();
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "unselectLabel: id = %s", str);
        if (!Util.isNullOrNil(str) && contactLabelSelectUI.f198577B.f222463f.contains(str)) {
            contactLabelSelectUI.f198577B.f222463f.remove(str);
            contactLabelSelectUI.f198585J.remove(str);
            if (z) {
                C75838j jVar = contactLabelSelectUI.f198577B;
                int parseInt = Integer.parseInt(str);
                if (!Util.isNullOrNil((List) jVar.f222462e)) {
                    i = 0;
                    while (true) {
                        if (i >= jVar.f222462e.size()) {
                            break;
                        } else if (jVar.f222462e.get(i).field_labelID == parseInt) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
                if (Util.isNullOrNil((List) jVar.f222462e) || i < 0 || i >= jVar.f222462e.size()) {
                    Log.m105921e("MicroMsg.LabelAdapter", "notifyTargetItemByLabelId: failed, labelId:%d, pos:%d", Integer.valueOf(parseInt), Integer.valueOf(i));
                } else {
                    Log.m105925i("MicroMsg.LabelAdapter", "notifyTargetItemByLabelId: labelId:%d, pos:%d", Integer.valueOf(parseInt), Integer.valueOf(i));
                    jVar.notifyItemChanged(i);
                }
            }
            String str2 = contactLabelSelectUI.f198582G.get(str);
            if (Util.isNullOrNil(str2)) {
                Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "unselectLabel failed, get name cache failed, try read db, labelId:%s", str);
                String N7 = contactLabelSelectUI.mo95133N7(str);
                if (Util.isNullOrNil(N7)) {
                    Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "unselectLabel failed again, read name failed, labelId:%s", str);
                } else {
                    contactLabelSelectUI.f198613w.mo101812o(N7);
                }
            } else {
                contactLabelSelectUI.f198613w.mo101812o(str2);
            }
        }
        contactLabelSelectUI.mo95131L7(contactLabelSelectUI.f198577B.f222463f.size());
        contactLabelSelectUI.mo95140U7(contactLabelSelectUI.f198577B.f222463f.size());
    }

    /* renamed from: J7 */
    public static void m81376J7(ContactLabelSelectUI contactLabelSelectUI) {
        boolean z;
        HashMap<Integer, Integer> hashMap;
        contactLabelSelectUI.getClass();
        Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "freshAdapter: ");
        contactLabelSelectUI.mo95139T7(C69085p.Normal);
        contactLabelSelectUI.mo95136Q7(contactLabelSelectUI.f198578C);
        contactLabelSelectUI.f198579D.clear();
        contactLabelSelectUI.f198579D.addAll(contactLabelSelectUI.f198578C);
        contactLabelSelectUI.f198580E.clear();
        Iterator<String> it = contactLabelSelectUI.f198577B.f222463f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Iterator<C72955b2> it4 = contactLabelSelectUI.f198578C.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z = false;
                    break;
                }
                C72955b2 next2 = it4.next();
                if (next.equals(next2.field_labelID + "") && (hashMap = contactLabelSelectUI.f198581F) != null && hashMap.containsKey(Integer.valueOf(next2.field_labelID)) && contactLabelSelectUI.f198581F.get(Integer.valueOf(next2.field_labelID)).intValue() > 0) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                it.remove();
                Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "can not found lable id:%s", next);
            }
        }
        Iterator<C72955b2> it5 = contactLabelSelectUI.f198579D.iterator();
        while (it5.hasNext()) {
            C72955b2 next3 = it5.next();
            if (!next3.field_isTemporary) {
                contactLabelSelectUI.f198580E.put(Integer.valueOf(next3.field_labelID), Long.valueOf(next3.field_createTime));
            }
        }
        contactLabelSelectUI.f198577B.notifyDataSetChanged();
        ArrayList<String> arrayList = contactLabelSelectUI.f198577B.f222463f;
        if (Util.isNullOrNil((List) arrayList)) {
            Log.m105920e("MicroMsg.Label.ContactLabelSelectUI", "updateLabelPanelBySelectedIdList: failed idList nil");
            contactLabelSelectUI.mo95131L7(0);
        } else {
            Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "updateLabelPanelBySelectedIdList: size:%d", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                String str = arrayList.get(i);
                String str2 = contactLabelSelectUI.f198582G.get(str);
                if (Util.isNullOrNil(str2)) {
                    Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "updateLabelPanelWithSelectIdList: get name failed, labelId:%s", str);
                } else {
                    arrayList2.add(str2);
                }
            }
            contactLabelSelectUI.f198613w.mo95190q(arrayList2, arrayList2);
            contactLabelSelectUI.mo95131L7(contactLabelSelectUI.f198577B.f222463f.size());
        }
        contactLabelSelectUI.mo95140U7(contactLabelSelectUI.f198577B.f222463f.size());
        contactLabelSelectUI.mo95137R7();
    }

    /* renamed from: K7 */
    public static void m81377K7(ContactLabelSelectUI contactLabelSelectUI, ArrayList arrayList, ArrayList arrayList2) {
        contactLabelSelectUI.getClass();
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m105928w("MicroMsg.Label.ContactLabelSelectUI", "cpan[doDeleteScene] can not do scene. lable is null");
            return;
        }
        contactLabelSelectUI.mo95085H7(contactLabelSelectUI.getString(C0966R.string.g1r));
        C45258c cVar = new C45258c(Util.listToString(arrayList, ","));
        cVar.f122606g = arrayList2;
        C97625j3.m125815e().mo123460f(cVar);
    }

    /* renamed from: L7 */
    public final void mo95131L7(int i) {
        boolean z = i > 0;
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility: show=[%b]", Boolean.valueOf(z));
        if (z) {
            View view = this.f198610t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f198611u;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view5 = this.f198610t;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view6 = this.f198611u;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: M7 */
    public final void mo95132M7(ArrayList<C72955b2> arrayList) {
        C77407n nVar = new C77407n((Context) this, 1, true);
        nVar.f225771i = new C69074f();
        nVar.mo107568m(getString(C0966R.string.g2q), 17, C76577a.m92151b(this, 14));
        nVar.f225782p = new C69078i(arrayList);
        nVar.mo107573q();
    }

    /* renamed from: N7 */
    public final String mo95133N7(String str) {
        String str2;
        C72955b2 bF;
        if (Util.isNullOrNil(str) || (bF = C27740g.vx0().mo100950bF(str)) == null || Util.isNullOrNil(bF.field_labelName)) {
            str2 = "";
        } else {
            str2 = bF.field_labelName;
            this.f198582G.put(str, str2);
            this.f198582G.put(str2, str);
        }
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "getLabelNameByIdFromStorage: labelId:%s", str);
        return str2;
    }

    /* renamed from: O7 */
    public final String mo95134O7(int i) {
        if (this.f198600g != 0) {
            return getContext().getResources().getString(this.f198600g);
        }
        if (i <= 0) {
            return getContext().getResources().getString(this.f198598e);
        }
        return getContext().getResources().getString(this.f198599f, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: P7 */
    public final void mo95135P7(String str) {
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "selectLabel: id = %s", str);
        if (!Util.isNullOrNil(str) && !this.f198577B.f222463f.contains(str)) {
            this.f198577B.f222463f.add(str);
            String str2 = this.f198582G.get(str);
            if (Util.isNullOrNil(str2)) {
                Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "selectLabel failed, get name cache failed,try read db, labelId:%s", str);
                String N7 = mo95133N7(str);
                if (Util.isNullOrNil(N7)) {
                    Log.m105921e("MicroMsg.Label.ContactLabelSelectUI", "selectLabel failed again, read name failed, labelId:%s", str);
                } else {
                    this.f198613w.mo95185d(N7, true);
                }
            } else {
                this.f198613w.mo95185d(str2, true);
            }
        }
        mo95131L7(this.f198577B.f222463f.size());
        mo95140U7(this.f198577B.f222463f.size());
    }

    /* renamed from: Q7 */
    public final void mo95136Q7(ArrayList<C72955b2> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        C75838j jVar = this.f198577B;
        jVar.getClass();
        if (arrayList.size() != 0) {
            jVar.f222462e = arrayList;
            jVar.notifyDataSetChanged();
        }
        C75838j jVar2 = this.f198577B;
        jVar2.f222461d = jVar2.getItemCount() > (this.f198577B.f222477w ? 2 : 0);
        jVar2.notifyDataSetChanged();
        this.f198609s.f222444I.f222443e = false;
    }

    /* renamed from: R7 */
    public void mo95137R7() {
    }

    /* renamed from: S7 */
    public final synchronized void mo95138S7(boolean z) {
        MMHandler mMHandler;
        Log.m105919d("MicroMsg.Label.ContactLabelSelectUI", "updateData loading%s", z + "");
        if (z && (mMHandler = this.f198593S) != null) {
            mMHandler.sendEmptyMessageDelayed(5002, 400);
        }
        C86709a0.m107525e().postToWorker(new C69071e(z));
    }

    /* renamed from: T7 */
    public final void mo95139T7(C69085p pVar) {
        this.f198601h = pVar;
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            View view = this.f198602i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f198607q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (ordinal != 1) {
            Log.m105929w("MicroMsg.Label.ContactLabelSelectUI", "unkonw mode:%s", this.f198601h + "");
        } else {
            View view4 = this.f198602i;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = this.f198607q;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        }
    }

    /* renamed from: U7 */
    public final void mo95140U7(int i) {
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "updateOpButtonTextOnSelectChange: selectedCount:%d", Integer.valueOf(i));
        updateOptionMenuText(0, mo95134O7(i));
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.fgz;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d1f;
    }

    public void initView() {
        this.f198616z = getIntent().getStringExtra("privacy_source_type");
        this.f198615y = getIntent().getBooleanExtra("privacy_from_select_contact_ui", false);
        this.f198576A = getIntent().getBooleanExtra("intent_status_from_privacy_setting", false);
        this.f198600g = getIntent().getIntExtra("option_button_wording_res_id", 0);
        hideActionbarLine();
        if (!this.f198615y) {
            setMMTitle(getString(C0966R.string.mx_));
        } else {
            setMMTitle(getString(C0966R.string.myz));
        }
        setBackBtn(new u$$a(this));
        String O7 = mo95134O7(0);
        u$$b u__b = new u$$b(this);
        MMActivityController.C73075r rVar = MMActivityController.C73075r.GREEN;
        addTextOptionMenu(0, O7, u__b, (View.OnLongClickListener) null, rVar);
        this.f198577B = new C75838j(this);
        this.f198602i = findViewById(C0966R.C0970id.f358497fh1);
        this.f198607q = findViewById(C0966R.C0970id.fgt);
        View findViewById = findViewById(C0966R.C0970id.fh5);
        this.f198611u = findViewById;
        this.f198612v = (MMTagPanelScrollView) findViewById.findViewById(C0966R.C0970id.fh7);
        this.f198613w = (MMLabelPanel) this.f198611u.findViewById(C0966R.C0970id.fh6);
        this.f198612v.setMaxLine(3);
        this.f198612v.setBackground(getResources().getDrawable(C0966R.C0969drawable.bn4));
        MMLabelPanel mMLabelPanel = this.f198613w;
        mMLabelPanel.f214929p = true;
        mMLabelPanel.mo101809k(true);
        this.f198613w.setEditTextEnableEdit(false);
        this.f198613w.setEditTextOnClickListener(new C75534v(this));
        this.f198613w.setEditHint(getContext().getResources().getString(C0966R.string.g2j));
        this.f198613w.setEditTextSize((float) C79406f.m96347a(getContext(), 17.0f));
        MMLabelPanel mMLabelPanel2 = this.f198613w;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.auz);
        MMEditText mMEditText = mMLabelPanel2.f214919E;
        if (mMEditText != null) {
            mMEditText.setPadding(dimensionPixelSize, 0, 0, 0);
        }
        this.f198613w.setOnClickListener(new C75535w(this));
        this.f198613w.setCallBack(new C75536x(this));
        this.f198608r = (RecyclerView) findViewById(C0966R.C0970id.fgz);
        this.f198608r.setLayoutManager(new LinearLayoutManager(this));
        this.f198608r.setHasFixedSize(true);
        C75830b bVar = new C75830b(new C75828a(this.f198594T));
        this.f198609s = bVar;
        bVar.mo17527j(this.f198608r);
        C75830b bVar2 = this.f198609s;
        bVar2.f222444I.f222443e = false;
        this.f198577B.f222467j = bVar2;
        this.f198604n = findViewById(C0966R.C0970id.cau);
        this.f198605o = (Button) findViewById(C0966R.C0970id.h0d);
        this.f198606p = (Button) findViewById(C0966R.C0970id.c1h);
        TextView textView = (TextView) findViewById(C0966R.C0970id.eth);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.f5471g1);
        this.f198605o.setOnClickListener(new C69082m(this));
        this.f198606p.setOnClickListener(new C69083n());
        this.f198588M = new C78253a(this);
        C75838j jVar = this.f198577B;
        jVar.f222476v = new C69084o();
        this.f198608r.setAdapter(jVar);
        C75838j jVar2 = this.f198577B;
        jVar2.f222468n = 3;
        jVar2.f222472r = this.f198581F;
        jVar2.f222460A = new C69067a();
        if (this.f198576A && this.f198614x) {
            addTextOptionMenu(1, getString(C0966R.string.f360089a13), new C69068b(), (View.OnLongClickListener) null, rVar);
            if (this.f198576A) {
                C75838j jVar3 = this.f198577B;
                if (jVar3 == null || jVar3.f222463f.size() <= 0) {
                    enableOptionMenu(1, false);
                } else {
                    enableOptionMenu(1, true);
                }
                updateOptionMenuText(1, getString(C0966R.string.f360089a13) + "(" + this.f198577B.f222463f.size() + ")");
            }
        }
        this.f198606p.setEnabled(false);
        C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 1, 0, 0, 0);
        this.f198577B.f222480z = !this.f198614x;
        View findViewById2 = findViewById(C0966R.C0970id.fhd);
        this.f198610t = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C69069c());
        }
        View findViewById3 = findViewById(C0966R.C0970id.fp4);
        this.f198603j = findViewById3;
        if (this.f198614x && (findViewById3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f198603j.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f198603j.setLayoutParams(marginLayoutParams);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] requestCode:%d resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            if (i3 != 7001) {
                if (i3 == 8001) {
                    String stringExtra = intent2.getStringExtra("contact_choose_label_list");
                    Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] %s", stringExtra + "");
                    if (!Util.isNullOrNil(stringExtra)) {
                        List<String> stringToList = Util.stringToList(stringExtra, ",");
                        try {
                            for (String next : stringToList) {
                                if (!Util.isNullOrNil(next) && !this.f198577B.f222463f.contains(next)) {
                                    mo95135P7(next);
                                    this.f198585J.add(next);
                                }
                            }
                            C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 11, (long) stringToList.size(), 0, 0);
                            this.f198577B.notifyDataSetChanged();
                            mo95137R7();
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (!this.f198614x || !this.f198576A) {
                String stringExtra2 = intent2.getStringExtra("Select_Contact");
                Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] %s", stringExtra2 + "");
                if (!Util.isNullOrNil(stringExtra2)) {
                    Intent intent3 = new Intent(intent2);
                    intent3.putExtra("label_source", "label_source_SNS");
                    intent3.putExtra("last_page_source_type", 1);
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "startActivity ContactEditLabel ");
                        intent3.setClass(this, ContactEditLabel.class);
                    } else {
                        Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "startActivity ContactLabelEditUI ");
                        intent3.setClass(this, ContactLabelEditUI.class);
                    }
                    intent3.putExtra("Select_Contact", stringExtra2);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                String stringExtra3 = intent2.getStringExtra("Select_Contact");
                Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] %s", stringExtra3 + "");
                Intent intent4 = new Intent();
                intent4.putExtra("Select_Contact", stringExtra3);
                setResult(-1, intent4);
                finish();
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        initView();
        if (intent.hasExtra("label_id")) {
            ArrayList arrayList = new ArrayList(new HashSet(intent.getStringArrayListExtra("label_id")));
            this.f198577B.f222463f.clear();
            this.f198577B.f222463f.addAll(arrayList);
            Log.m105918d("MicroMsg.Label.ContactLabelSelectUI", "onCreate: set selected label from intent");
        }
        C86709a0.m107525e().postToWorker(new C69070d(this));
        C27740g.vx0().add(this.f198596V);
        C115669n.INSTANCE.mo160131h(16097, 2, 0, 2);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C72955b2 F4;
        int i = ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position;
        C75838j jVar = this.f198577B;
        if (!(jVar == null || i < 0 || (F4 = jVar.mo106121F4(i)) == null)) {
            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(view.getContext(), F4.field_labelName));
            contextMenu.add(0, 0, 0, getString(C0966R.string.f7944x1));
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onDestroy() {
        C27740g.vx0().remove(this.f198596V);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            int action = keyEvent.getAction();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int i2 = ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position;
        C75838j jVar = this.f198577B;
        if (jVar != null && i2 >= 0) {
            C72955b2 F4 = jVar.mo106121F4(i2);
            if (i == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(F4);
                mo95132M7(arrayList);
            }
        }
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(636, this);
        C97625j3.m125815e().mo123470p(5882, this);
        C97625j3.m125812b().mo105907v().remove(this.f198597W);
        super.onPause();
    }

    public void onResume() {
        C97625j3.m125815e().mo123455a(636, this);
        C97625j3.m125815e().mo123455a(5882, this);
        C97625j3.m125812b().mo105907v().add(this.f198597W);
        if (this.f198591Q) {
            mo95138S7(true);
        } else {
            this.f198591Q = true;
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105925i("MicroMsg.Label.ContactLabelSelectUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        int type = yVar.getType();
        if (type != 636) {
            if (type != 5882) {
                Log.m105928w("MicroMsg.Label.ContactLabelSelectUI", "unknow type.");
            } else if (i != 0 || i2 != 0) {
                Log.m105928w("MicroMsg.Label.ContactLabelSelectUI", "[onSceneEnd] sort fail.");
            } else if (((C48982cc) ((C45257b) yVar).f122600d.f127056b.f127083a).f131633d == 0) {
                Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "[onSceneEnd] sort success is this type.");
            } else {
                Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "[onSceneEnd] sort success no this type.");
            }
        } else if (i == 0 && i2 == 0) {
            ArrayList<C72955b2> arrayList = ((C45258c) yVar).f122606g;
            if (!C27740g.vx0().mo100949Yt(arrayList)) {
                Log.m105928w("MicroMsg.Label.ContactLabelSelectUI", "cpan[doDeleteContactLabel] fail.");
                hideLoading();
                C76879j.m92749t(this, getString(C0966R.string.bxv), "", new C75522n(this));
                return;
            }
            hideLoading();
            mo95138S7(false);
            if (arrayList != null && arrayList.size() > 0) {
                if (this.f198577B != null) {
                    i3 = 0;
                    for (C72955b2 b2Var : arrayList) {
                        i3 += this.f198577B.f222472r.get(Integer.valueOf(b2Var.field_labelID)).intValue();
                    }
                } else {
                    i3 = 0;
                }
                C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), this.f198592R == 2 ? 7 : 12, (long) arrayList.size(), 0, (long) i3);
            }
        } else {
            Log.m105928w("MicroMsg.Label.ContactLabelSelectUI", "cpan[onSceneEnd] delete fail.");
            hideLoading();
            C76879j.m92749t(this, getString(C0966R.string.bxv), "", new C75522n(this));
        }
    }

    public void setScreenEnable(boolean z) {
        super.setScreenEnable(z);
    }
}
