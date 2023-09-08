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
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72960e2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d22.C45257b;
import d22.C45258c;
import d22.C75320d;
import di3.C86312j;
import e22.C75522n;
import e22.C75529q0;
import e22.C75530r;
import e22.C75532s;
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
import ke3.C88144b;
import kg3.C76577a;
import l31.C61212e;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import qo3.C77398g;
import qo3.C77407n;
import qo3.C77426q;
import te3.C48982cc;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI */
public class ContactLabelManagerUI extends ContactLabelBaseUI implements C11385n, C11184p0 {

    /* renamed from: X */
    public static final /* synthetic */ int f198515X = 0;

    /* renamed from: A */
    public C75838j f198516A;

    /* renamed from: B */
    public ArrayList<C72955b2> f198517B = new ArrayList<>();

    /* renamed from: C */
    public ArrayList<C72955b2> f198518C = new ArrayList<>();

    /* renamed from: D */
    public HashMap<Integer, Long> f198519D = new HashMap<>();

    /* renamed from: E */
    public HashMap<Integer, Integer> f198520E = new HashMap<>();

    /* renamed from: F */
    public HashMap<Integer, Integer> f198521F = new HashMap<>();

    /* renamed from: G */
    public HashSet<String> f198522G = new HashSet<>();

    /* renamed from: H */
    public boolean f198523H = true;

    /* renamed from: I */
    public boolean f198524I = false;

    /* renamed from: J */
    public C78253a f198525J;

    /* renamed from: K */
    public TextView f198526K;

    /* renamed from: L */
    public int f198527L = 0;

    /* renamed from: M */
    public int f198528M = 0;

    /* renamed from: N */
    public boolean f198529N = true;

    /* renamed from: P */
    public int f198530P = -1;

    /* renamed from: Q */
    public MMHandler f198531Q = new C69062j();

    /* renamed from: R */
    public C75828a.C75829a f198532R = new C69063k();

    /* renamed from: S */
    public C77398g f198533S = null;

    /* renamed from: T */
    public View.OnClickListener f198534T = new C4752l();

    /* renamed from: U */
    public MStorage.IOnStorageChange f198535U = new C4753m();

    /* renamed from: V */
    public MStorageEx.IOnStorageChange f198536V = new C4754n();

    /* renamed from: W */
    public MenuItem.OnMenuItemClickListener f198537W = new C69065o();

    /* renamed from: e */
    public C69066r f198538e = C69066r.Normal;

    /* renamed from: f */
    public View f198539f;

    /* renamed from: g */
    public View f198540g;

    /* renamed from: h */
    public View f198541h;

    /* renamed from: i */
    public WeImageView f198542i;

    /* renamed from: j */
    public View f198543j;

    /* renamed from: n */
    public View f198544n;

    /* renamed from: o */
    public View f198545o;

    /* renamed from: p */
    public Button f198546p;

    /* renamed from: q */
    public Button f198547q;

    /* renamed from: r */
    public TextView f198548r;

    /* renamed from: s */
    public View f198549s;

    /* renamed from: t */
    public RecyclerView f198550t;

    /* renamed from: u */
    public C75830b f198551u;

    /* renamed from: v */
    public boolean f198552v = false;

    /* renamed from: w */
    public View f198553w;

    /* renamed from: x */
    public boolean f198554x = false;

    /* renamed from: y */
    public String f198555y;

    /* renamed from: z */
    public boolean f198556z = false;

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$b */
    public class C4749b implements View.OnTouchListener {
        public C4749b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                ContactLabelManagerUI.this.f198527L = (int) motionEvent.getRawX();
                ContactLabelManagerUI.this.f198528M = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$f */
    public class C4750f implements Runnable {
        public C4750f(ContactLabelManagerUI contactLabelManagerUI) {
        }

        public void run() {
            C97625j3.m125815e().mo123460f(new C75320d());
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$h */
    public class C4751h implements C11182m0 {
        public C4751h() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(0, ContactLabelManagerUI.this.getResources().getColor(C0966R.color.a0u), ContactLabelManagerUI.this.getString(C0966R.string.f7944x1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$l */
    public class C4752l implements View.OnClickListener {
        public C4752l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            int i = ContactLabelManagerUI.f198515X;
            C0008d.m0a((long) contactLabelManagerUI.getIntent().getIntExtra("key_label_click_source", 0), 4, 0, 0, 0);
            ArrayList<C72955b2> arrayList2 = contactLabelManagerUI.f198517B;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                C115669n.INSTANCE.mo160131h(11347, 1, 0);
            } else {
                C115669n.INSTANCE.mo160131h(11347, 1, 1);
            }
            Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "dz[dealAddLabel]");
            Intent intent = new Intent();
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219161b, 1024));
            intent.putExtra("last_page_source_type", 1);
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", contactLabelManagerUI.getString(C0966R.string.g1n));
            intent.putExtra("show_too_many_member", false);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 5);
            intent.putExtra("label_source", "label_source_Address");
            intent.putExtra("without_openim", true);
            C88144b.m109802t(contactLabelManagerUI, ".ui.contact.SelectContactUI", intent, 7001);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$m */
    public class C4753m implements MStorage.IOnStorageChange {
        public C4753m() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            MMHandler mMHandler;
            if (!Util.isNullOrNil(str) && (mMHandler = ContactLabelManagerUI.this.f198531Q) != null) {
                mMHandler.removeMessages(5001);
                ContactLabelManagerUI.this.f198531Q.sendEmptyMessageDelayed(5001, 400);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$n */
    public class C4754n implements MStorageEx.IOnStorageChange {
        public C4754n() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            Log.m105919d("MicroMsg.Label.ContactLabelManagerUI", "event:%d, obj:%s", Integer.valueOf(i), obj);
            MMHandler mMHandler = ContactLabelManagerUI.this.f198531Q;
            if (mMHandler != null) {
                mMHandler.removeMessages(5001);
                ContactLabelManagerUI.this.f198531Q.sendEmptyMessageDelayed(5001, 400);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$p */
    public class C4755p implements View.OnClickListener {
        public C4755p(ContactLabelManagerUI contactLabelManagerUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$q */
    public class C4756q implements View.OnClickListener {
        public C4756q() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            int i = ContactLabelManagerUI.f198515X;
            contactLabelManagerUI.mo95105M7((ArrayList<C72955b2>) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$a */
    public class C69054a implements View.OnClickListener {
        public C69054a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            int i = ContactLabelManagerUI.f198515X;
            contactLabelManagerUI.removeAllOptionMenu();
            contactLabelManagerUI.f198552v = true;
            contactLabelManagerUI.f198516A.f222468n = 1;
            contactLabelManagerUI.mo95109Q7(contactLabelManagerUI.f198517B);
            View view2 = contactLabelManagerUI.f198540g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = contactLabelManagerUI.f198543j;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = contactLabelManagerUI.f198545o;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contactLabelManagerUI.f198547q.setEnabled(false);
            contactLabelManagerUI.f198526K.setText("");
            contactLabelManagerUI.f198526K.setVisibility(4);
            contactLabelManagerUI.f198547q.setTextColor(contactLabelManagerUI.getResources().getColor(C0966R.color.f3140go));
            contactLabelManagerUI.setMMTitle(contactLabelManagerUI.getString(C0966R.string.g1v));
            if (!contactLabelManagerUI.f198554x) {
                View view8 = contactLabelManagerUI.f198553w;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            contactLabelManagerUI.setBackBtn(contactLabelManagerUI.f198537W, C0966R.raw.icons_outlined_close);
            C0008d.m0a((long) contactLabelManagerUI.getIntent().getIntExtra("key_label_click_source", 0), 3, 0, 0, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$c */
    public class C69055c implements C75838j.C75844f {
        public C69055c() {
        }

        /* renamed from: W */
        public void mo95116W(View view, int i) {
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            if (!contactLabelManagerUI.f198554x && !contactLabelManagerUI.f198552v) {
                C72955b2 F4 = contactLabelManagerUI.f198516A.mo106121F4(i);
                if (F4 == null || !F4.field_isTemporary || F4.field_labelID != -1000000) {
                    ContactLabelManagerUI contactLabelManagerUI2 = ContactLabelManagerUI.this;
                    contactLabelManagerUI2.f198525J.mo108272g(view, i, -1, contactLabelManagerUI2, contactLabelManagerUI2, contactLabelManagerUI2.f198527L, contactLabelManagerUI2.f198528M);
                    return;
                }
                Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "onItemLongClick, is no lebal title item, position = " + i);
            }
        }

        /* renamed from: a */
        public void mo95117a(Intent intent) {
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            contactLabelManagerUI.f198529N = false;
            contactLabelManagerUI.startActivityForResult(intent, 8001);
        }

        /* renamed from: b */
        public void mo95118b(C75529q0 q0Var, int i) {
            C72955b2 F4;
            C75529q0 q0Var2 = q0Var;
            int i2 = i;
            if (ContactLabelManagerUI.this.f198516A.getItemViewType(i2) == 2) {
                ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
                contactLabelManagerUI.getClass();
                C86709a0.m107525e().postToWorker(new C75530r(contactLabelManagerUI));
                return;
            }
            C75838j jVar = ContactLabelManagerUI.this.f198516A;
            if (jVar != null && i2 >= 0 && (F4 = jVar.mo106121F4(i2)) != null) {
                ContactLabelManagerUI contactLabelManagerUI2 = ContactLabelManagerUI.this;
                if (contactLabelManagerUI2.f198552v) {
                    ContactLabelManagerUI.m81357I7(contactLabelManagerUI2, q0Var2.f221910B, F4);
                } else if (!contactLabelManagerUI2.f198554x) {
                    String str = F4.field_labelID + "";
                    String str2 = F4.field_labelName;
                    contactLabelManagerUI2.getClass();
                    Intent intent = new Intent();
                    intent.putExtra("label_id", str);
                    intent.putExtra("label_name", str2);
                    intent.putExtra("label_source", "label_source_Address");
                    intent.putExtra("last_page_source_type", 1);
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactEditLabel ");
                        intent.setClass(contactLabelManagerUI2, ContactEditLabel.class);
                    } else {
                        Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactLabelEditUI ");
                        intent.setClass(contactLabelManagerUI2, ContactLabelEditUI.class);
                    }
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(contactLabelManagerUI2, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    contactLabelManagerUI2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(contactLabelManagerUI2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C0008d.m0a((long) contactLabelManagerUI2.getIntent().getIntExtra("key_label_click_source", 0), 2, 0, 0, 0);
                    if (Util.isNullOrNil(str)) {
                        ArrayList<C72955b2> arrayList = contactLabelManagerUI2.f198517B;
                        if (arrayList == null || arrayList.isEmpty()) {
                            C115669n.INSTANCE.mo160131h(11347, 1, 0);
                            return;
                        }
                        C115669n.INSTANCE.mo160131h(11347, 1, 1);
                    }
                } else if (contactLabelManagerUI2.f198556z) {
                    ContactLabelManagerUI.m81357I7(contactLabelManagerUI2, q0Var2.f221910B, F4);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("label_id", F4.field_labelID);
                    ContactLabelManagerUI.this.setResult(-1, intent2);
                    ContactLabelManagerUI.this.finish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$d */
    public class C69056d implements MenuItem.OnMenuItemClickListener {
        public C69056d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            int i = ContactLabelManagerUI.f198515X;
            contactLabelManagerUI.getClass();
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < contactLabelManagerUI.f198516A.f222463f.size(); i2++) {
                ArrayList<String> bO = C27740g.vx0().mo100951bO(contactLabelManagerUI.f198516A.f222463f.get(i2));
                if (bO != null && bO.size() > 0) {
                    hashSet.addAll(bO);
                }
            }
            String s = C75592q0.m90789s();
            if (hashSet.contains(s)) {
                hashSet.remove(s);
            }
            Intent intent = new Intent(contactLabelManagerUI, SelectPrivacyContactsFromRangeUI.class);
            intent.putExtra("privacy_source_type", contactLabelManagerUI.f198555y);
            intent.putExtra("privacy_menu_enter_type", 3);
            intent.putExtra("privacy_select_chatroom_or_lebal_count", contactLabelManagerUI.f198516A.f222463f.size());
            intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
            intent.putExtra("need_show_all_selected", true);
            intent.putExtra("titile", contactLabelManagerUI.getResources().getString(C0966R.string.hm6));
            intent.putExtra("list_type", 1);
            intent.putExtra("already_select_contact", (String[]) hashSet.toArray(new String[0]));
            intent.putExtra("key_label_click_source", contactLabelManagerUI.getIntent().getIntExtra("key_label_click_source", 0));
            contactLabelManagerUI.startActivityForResult(intent, 7001);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$e */
    public class C69057e implements View.OnClickListener {
        public C69057e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75838j jVar = ContactLabelManagerUI.this.f198516A;
            if (jVar != null) {
                jVar.mo106122G4();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$g */
    public class C69058g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f198561d;

        /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$g$a */
        public class C69059a implements Runnable {
            public C69059a() {
            }

            public void run() {
                MMHandler mMHandler;
                if (ContactLabelManagerUI.this.f198517B.size() > 0) {
                    ContactLabelManagerUI.m81359K7(ContactLabelManagerUI.this);
                } else {
                    ContactLabelManagerUI.this.f198516A.mo106123O4();
                    ContactLabelManagerUI.this.mo95113U7(C69066r.Empty);
                    ContactLabelManagerUI.this.f198548r.setEnabled(false);
                    ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
                    contactLabelManagerUI.f198548r.setTextColor(contactLabelManagerUI.getResources().getColor(C0966R.color.f3140go));
                }
                C69058g gVar = C69058g.this;
                if (gVar.f198561d && (mMHandler = ContactLabelManagerUI.this.f198531Q) != null) {
                    mMHandler.removeMessages(5002);
                    ContactLabelManagerUI.this.f198531Q.sendEmptyMessageDelayed(5003, 0);
                }
                ContactLabelManagerUI.this.mo95110R7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$g$b */
        public class C69060b implements Runnable {
            public C69060b() {
            }

            public void run() {
                MMHandler mMHandler;
                ContactLabelManagerUI.m81359K7(ContactLabelManagerUI.this);
                C69058g gVar = C69058g.this;
                if (gVar.f198561d && (mMHandler = ContactLabelManagerUI.this.f198531Q) != null) {
                    mMHandler.removeMessages(5002);
                    ContactLabelManagerUI.this.f198531Q.sendEmptyMessageDelayed(5003, 400);
                }
            }
        }

        public C69058g(boolean z) {
            this.f198561d = z;
        }

        public void run() {
            ContactLabelManagerUI.this.f198517B = C27740g.vx0().mo100953kD();
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            if (contactLabelManagerUI.f198517B == null) {
                contactLabelManagerUI.f198517B = new ArrayList<>();
            }
            ContactLabelManagerUI contactLabelManagerUI2 = ContactLabelManagerUI.this;
            if (contactLabelManagerUI2.f198554x && contactLabelManagerUI2.f198556z) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < ContactLabelManagerUI.this.f198517B.size(); i++) {
                    C72955b2 b2Var = ContactLabelManagerUI.this.f198517B.get(i);
                    int i2 = b2Var.field_labelID;
                    C72960e2 vx02 = C27740g.vx0();
                    ArrayList<String> bO = vx02.mo100951bO(i2 + "");
                    if (bO == null || bO.size() <= 0) {
                        arrayList.add(b2Var);
                    }
                }
                if (arrayList.size() > 0) {
                    ContactLabelManagerUI.this.f198517B.removeAll(arrayList);
                }
            }
            ContactLabelManagerUI.this.f198522G.clear();
            ArrayList<C72955b2> arrayList2 = ContactLabelManagerUI.this.f198517B;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Empty");
                if (ContactLabelManagerUI.this.f198523H) {
                    C115669n.INSTANCE.mo160131h(11346, 1, 0);
                    ContactLabelManagerUI.this.f198523H = false;
                }
                ContactLabelManagerUI.m81358J7(ContactLabelManagerUI.this);
                MMHandlerThread.postToMainThread(new C69059a());
                return;
            }
            Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Normal");
            if (ContactLabelManagerUI.this.f198523H) {
                C115669n.INSTANCE.mo160131h(11346, 1, 1);
                ContactLabelManagerUI.this.f198523H = false;
            }
            ArrayList<C72955b2> arrayList3 = ContactLabelManagerUI.this.f198517B;
            if (arrayList3 != null && arrayList3.size() > 0) {
                int size = ContactLabelManagerUI.this.f198517B.size();
                C27740g.vx0().mo100945Lo();
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = ContactLabelManagerUI.this.f198517B.get(i3).field_labelID;
                    C72960e2 vx03 = C27740g.vx0();
                    ArrayList<String> bO2 = vx03.mo100951bO(i4 + "");
                    if (bO2 == null || bO2.size() <= 0) {
                        ContactLabelManagerUI.this.f198521F.put(Integer.valueOf(i4), 0);
                    } else {
                        ContactLabelManagerUI.this.f198522G.addAll(bO2);
                        ContactLabelManagerUI.this.f198521F.put(Integer.valueOf(i4), Integer.valueOf(bO2.size()));
                    }
                }
            }
            ContactLabelManagerUI contactLabelManagerUI3 = ContactLabelManagerUI.this;
            if (!contactLabelManagerUI3.f198554x && !contactLabelManagerUI3.f198552v) {
                contactLabelManagerUI3.f198517B.add(0, contactLabelManagerUI3.f198516A.f222473s);
            }
            ContactLabelManagerUI.m81358J7(ContactLabelManagerUI.this);
            MMHandlerThread.postToMainThread(new C69060b());
        }

        public String toString() {
            return super.toString() + "|updateData";
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$i */
    public class C69061i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f198565d;

        public C69061i(ArrayList arrayList) {
            this.f198565d = arrayList;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                ArrayList arrayList = this.f198565d;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    C75838j jVar = ContactLabelManagerUI.this.f198516A;
                    if (jVar != null && jVar.f222463f.size() > 0) {
                        for (int i2 = 0; i2 < ContactLabelManagerUI.this.f198516A.f222463f.size(); i2++) {
                            C72955b2 bF = C27740g.vx0().mo100950bF(ContactLabelManagerUI.this.f198516A.f222463f.get(i2));
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
                        ContactLabelManagerUI.m81360L7(ContactLabelManagerUI.this, arrayList3, arrayList2);
                    }
                    ContactLabelManagerUI.this.f198530P = 2;
                } else if (arrayList.size() > 0) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i3 = 0; i3 < this.f198565d.size(); i3++) {
                        C72955b2 b2Var = (C72955b2) this.f198565d.get(i3);
                        if (b2Var != null) {
                            if (!arrayList4.contains(b2Var.field_labelID + "")) {
                                arrayList4.add(b2Var.field_labelID + "");
                            }
                            C115669n.INSTANCE.mo160131h(16097, 2, 2, 2);
                        }
                    }
                    ContactLabelManagerUI.m81360L7(ContactLabelManagerUI.this, arrayList4, this.f198565d);
                    ContactLabelManagerUI.this.f198530P = 1;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$j */
    public class C69062j extends MMHandler {
        public C69062j() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            Log.m105919d("MicroMsg.Label.ContactLabelManagerUI", "handleMessage:%d", Integer.valueOf(i));
            switch (i) {
                case 5001:
                    ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
                    int i2 = ContactLabelManagerUI.f198515X;
                    contactLabelManagerUI.mo95111S7(false);
                    return;
                case 5002:
                    ContactLabelManagerUI contactLabelManagerUI2 = ContactLabelManagerUI.this;
                    contactLabelManagerUI2.mo95085H7(contactLabelManagerUI2.getString(C0966R.string.a4d));
                    return;
                case 5003:
                    ContactLabelManagerUI.this.hideLoading();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$k */
    public class C69063k implements C75828a.C75829a {

        /* renamed from: a */
        public boolean f198568a = false;

        /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$k$a */
        public class C69064a implements Runnable {
            public C69064a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "can not drag.");
                ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
                contactLabelManagerUI.f198524I = false;
                contactLabelManagerUI.f198516A.notifyDataSetChanged();
            }
        }

        public C69063k() {
        }

        /* renamed from: e */
        public void mo95125e() {
            C75838j jVar = ContactLabelManagerUI.this.f198516A;
            if (jVar.f222471q != jVar.f222470p) {
                jVar.f222469o++;
            }
            jVar.f222471q = -1;
            jVar.f222470p = -1;
            this.f198568a = false;
        }

        /* renamed from: f */
        public void mo95126f(int i) {
        }

        public void onItemSelected(int i) {
            ContactLabelManagerUI.this.f198516A.f222471q = i;
            if (!this.f198568a) {
                C74804o4.m89546a();
            }
            this.f198568a = true;
        }

        public boolean onMove(int i, int i2) {
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            C75838j jVar = contactLabelManagerUI.f198516A;
            jVar.f222470p = i2;
            boolean z = false;
            if (i2 == 0) {
                return false;
            }
            ArrayList<C72955b2> arrayList = jVar.f222462e;
            if (arrayList != null) {
                z = true;
                if (!jVar.f222461d) {
                    if (!contactLabelManagerUI.f198524I) {
                        contactLabelManagerUI.f198524I = true;
                        String string = contactLabelManagerUI.getResources().getString(C0966R.string.g2w);
                        C69064a aVar = new C69064a();
                        C77398g gVar = contactLabelManagerUI.f198533S;
                        if (gVar == null || !gVar.isShowing()) {
                            C77426q qVar = new C77426q(contactLabelManagerUI);
                            qVar.mo107595g(string);
                            qVar.mo107601m(C0966R.string.f8028zq);
                            qVar.mo107600l(new C75532s(contactLabelManagerUI, aVar));
                            contactLabelManagerUI.f198533S = qVar.f225839c;
                            qVar.mo107603o();
                        }
                    }
                    return true;
                }
                Collections.swap(arrayList, i, i2);
                ContactLabelManagerUI.this.f198516A.notifyItemMoved(i, i2);
            }
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$o */
    public class C69065o implements MenuItem.OnMenuItemClickListener {
        public C69065o() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelManagerUI contactLabelManagerUI = ContactLabelManagerUI.this;
            if (contactLabelManagerUI.f198552v) {
                contactLabelManagerUI.mo95108P7();
                return true;
            }
            contactLabelManagerUI.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI$r */
    public enum C69066r {
        Normal,
        Empty
    }

    /* renamed from: I7 */
    public static void m81357I7(ContactLabelManagerUI contactLabelManagerUI, View view, C72955b2 b2Var) {
        contactLabelManagerUI.getClass();
        if ((view.getTag() instanceof C75529q0) && ((C75529q0) view.getTag()).f221911C != null) {
            CheckBox checkBox = ((C75529q0) view.getTag()).f221911C;
            if (contactLabelManagerUI.f198554x || checkBox.isChecked() || contactLabelManagerUI.f198516A.f222463f.size() < 50) {
                C75838j jVar = contactLabelManagerUI.f198516A;
                boolean z = jVar.f222474t;
                jVar.f222474t = false;
                if (z) {
                    jVar.notifyDataSetChanged();
                }
                checkBox.setChecked(!checkBox.isChecked());
                if (checkBox.isChecked()) {
                    contactLabelManagerUI.f198516A.f222463f.add(String.valueOf(b2Var.field_labelID));
                } else {
                    contactLabelManagerUI.f198516A.f222463f.remove(String.valueOf(b2Var.field_labelID));
                }
                if (contactLabelManagerUI.f198554x) {
                    contactLabelManagerUI.mo95112T7();
                }
                contactLabelManagerUI.mo95110R7();
                return;
            }
            C75838j jVar2 = contactLabelManagerUI.f198516A;
            boolean z2 = !jVar2.f222474t;
            jVar2.f222474t = true;
            if (z2) {
                jVar2.notifyDataSetChanged();
            }
            Toast.makeText(contactLabelManagerUI, contactLabelManagerUI.getResources().getString(C0966R.string.g2v), 0).show();
        }
    }

    /* renamed from: J7 */
    public static void m81358J7(ContactLabelManagerUI contactLabelManagerUI) {
        if (!contactLabelManagerUI.f198554x && !contactLabelManagerUI.f198552v) {
            ArrayList arrayList = new ArrayList();
            HashSet<String> hashSet = contactLabelManagerUI.f198522G;
            if (hashSet != null && hashSet.size() > 0) {
                Iterator<String> it = contactLabelManagerUI.f198522G.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            HashMap<Integer, List<String>> O7 = contactLabelManagerUI.mo95107O7(arrayList, true);
            if (O7.size() > 0) {
                C75838j.C75839a aVar = new C75838j.C75839a();
                aVar.field_labelName = contactLabelManagerUI.getResources().getString(C0966R.string.g2_);
                aVar.field_labelID = -1000000;
                aVar.field_isTemporary = true;
                Iterator<Integer> it4 = O7.keySet().iterator();
                if (it4.hasNext()) {
                    Integer next = it4.next();
                    aVar.f222482C = next.intValue();
                    aVar.f222481B = O7.get(next);
                }
                contactLabelManagerUI.f198516A.f222466i = aVar;
                return;
            }
            contactLabelManagerUI.f198516A.f222466i = null;
        }
    }

    /* renamed from: K7 */
    public static void m81359K7(ContactLabelManagerUI contactLabelManagerUI) {
        contactLabelManagerUI.mo95113U7(C69066r.Normal);
        contactLabelManagerUI.mo95109Q7(contactLabelManagerUI.f198517B);
        contactLabelManagerUI.f198518C.clear();
        contactLabelManagerUI.f198518C.addAll(contactLabelManagerUI.f198517B);
        contactLabelManagerUI.f198519D.clear();
        Iterator<C72955b2> it = contactLabelManagerUI.f198518C.iterator();
        while (it.hasNext()) {
            C72955b2 next = it.next();
            if (!next.field_isTemporary) {
                contactLabelManagerUI.f198519D.put(Integer.valueOf(next.field_labelID), Long.valueOf(next.field_createTime));
            }
        }
        contactLabelManagerUI.f198516A.notifyDataSetChanged();
        C75838j jVar = contactLabelManagerUI.f198516A;
        boolean z = false;
        if (jVar.f222478x) {
            TextView textView = contactLabelManagerUI.f198548r;
            if (jVar.getItemCount() > 1) {
                z = true;
            }
            textView.setEnabled(z);
        } else {
            TextView textView2 = contactLabelManagerUI.f198548r;
            if (jVar.getItemCount() > 0) {
                z = true;
            }
            textView2.setEnabled(z);
        }
        contactLabelManagerUI.f198548r.setTextColor(contactLabelManagerUI.getResources().getColor(contactLabelManagerUI.f198548r.isEnabled() ? C0966R.color.f3142gq : C0966R.color.f3140go));
        contactLabelManagerUI.mo95110R7();
    }

    /* renamed from: L7 */
    public static void m81360L7(ContactLabelManagerUI contactLabelManagerUI, ArrayList arrayList, ArrayList arrayList2) {
        contactLabelManagerUI.getClass();
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m105928w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteScene] can not do scene. lable is null");
            return;
        }
        contactLabelManagerUI.mo95085H7(contactLabelManagerUI.getString(C0966R.string.g1r));
        C45258c cVar = new C45258c(Util.listToString(arrayList, ","));
        cVar.f122606g = arrayList2;
        C97625j3.m125815e().mo123460f(cVar);
    }

    /* renamed from: M7 */
    public final void mo95105M7(ArrayList<C72955b2> arrayList) {
        C77407n nVar = new C77407n((Context) this, 1, true);
        nVar.f225771i = new C4751h();
        nVar.mo107568m(getString(C0966R.string.g2q), 17, C76577a.m92151b(this, 14));
        nVar.f225782p = new C69061i(arrayList);
        nVar.mo107573q();
    }

    /* renamed from: N7 */
    public final void mo95106N7() {
        removeAllOptionMenu();
        this.f198552v = false;
        if (this.f198516A.f222469o > 0) {
            C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 8, (long) this.f198516A.f222469o, 0, 0);
        }
        C75838j jVar = this.f198516A;
        jVar.f222468n = 0;
        jVar.mo106123O4();
        mo95109Q7(this.f198517B);
        this.f198551u.f222444I.f222443e = false;
        View view = this.f198540g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f198543j;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f198545o;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitle(getString(C0966R.string.g1o));
        setBackBtn(this.f198537W, C0966R.raw.actionbar_icon_dark_back);
        View view6 = this.f198553w;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: O7 */
    public final HashMap<Integer, List<String>> mo95107O7(List<String> list, boolean z) {
        String s = C75592q0.m90789s();
        if (list != null) {
            if (!list.contains("filehelper")) {
                list.add("filehelper");
            }
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        C86709a0.m107528h();
        Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, "", "@all.contact.without.chatroom.without.openim.without.openimfavour", "", list);
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        if (S3.getCount() == 0) {
            return hashMap;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (S3.moveToPosition(i)) {
            Log.m105919d("MicroMsg.Label.ContactLabelManagerUI", "create contact item index=%d", Integer.valueOf(i));
            i++;
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(S3);
            arrayList.add(z1Var.getUsername());
            if (z && arrayList.size() > 10) {
                break;
            }
        }
        if (arrayList.size() > 0) {
            hashMap.put(Integer.valueOf(S3.getCount()), arrayList);
        }
        S3.close();
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d9  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo95108P7() {
        /*
            r13 = this;
            boolean r0 = r13.f198552v
            r1 = 1
            if (r0 == 0) goto L_0x01dc
            java.util.ArrayList<com.tencent.mm.storage.b2> r0 = r13.f198518C
            java.lang.String r2 = "MicroMsg.Label.ContactLabelManagerUI"
            r3 = 0
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0014
            goto L_0x00b8
        L_0x0014:
            g22.j r0 = r13.f198516A
            java.util.ArrayList<com.tencent.mm.storage.b2> r0 = r0.f222462e
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0022
            goto L_0x00b2
        L_0x0022:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r13.f198520E
            r0.clear()
            r0 = 0
        L_0x0028:
            g22.j r4 = r13.f198516A
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r4.f222462e
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x00a8
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r13.f198518C
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x00a5
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r13.f198518C
            java.lang.Object r4 = r4.get(r0)
            com.tencent.mm.storage.b2 r4 = (com.tencent.p014mm.storage.C72955b2) r4
            int r4 = r4.field_labelID
            r5 = -1000000(0xfffffffffff0bdc0, float:NaN)
            if (r4 == r5) goto L_0x0058
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r13.f198518C
            java.lang.Object r4 = r4.get(r0)
            com.tencent.mm.storage.b2 r4 = (com.tencent.p014mm.storage.C72955b2) r4
            int r4 = r4.field_labelID
            r5 = -2000000(0xffffffffffe17b80, float:NaN)
            if (r4 != r5) goto L_0x0065
        L_0x0058:
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r13.f198518C
            java.lang.Object r4 = r4.get(r0)
            com.tencent.mm.storage.b2 r4 = (com.tencent.p014mm.storage.C72955b2) r4
            boolean r4 = r4.field_isTemporary
            if (r4 == 0) goto L_0x0065
            goto L_0x00a5
        L_0x0065:
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r13.f198518C
            java.lang.Object r4 = r4.get(r0)
            com.tencent.mm.storage.b2 r4 = (com.tencent.p014mm.storage.C72955b2) r4
            int r4 = r4.field_labelID
            g22.j r5 = r13.f198516A
            java.util.ArrayList<com.tencent.mm.storage.b2> r5 = r5.f222462e
            java.lang.Object r5 = r5.get(r0)
            com.tencent.mm.storage.b2 r5 = (com.tencent.p014mm.storage.C72955b2) r5
            int r5 = r5.field_labelID
            if (r4 == r5) goto L_0x00a5
            java.lang.String r4 = "isSwapPosAdapter field_labelID no equal."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r4 = r13.f198520E
            g22.j r5 = r13.f198516A
            java.util.ArrayList<com.tencent.mm.storage.b2> r5 = r5.f222462e
            java.lang.Object r5 = r5.get(r0)
            com.tencent.mm.storage.b2 r5 = (com.tencent.p014mm.storage.C72955b2) r5
            int r5 = r5.field_labelID
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.ArrayList<com.tencent.mm.storage.b2> r6 = r13.f198518C
            java.lang.Object r6 = r6.get(r0)
            com.tencent.mm.storage.b2 r6 = (com.tencent.p014mm.storage.C72955b2) r6
            int r6 = r6.field_labelID
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r5, r6)
        L_0x00a5:
            int r0 = r0 + 1
            goto L_0x0028
        L_0x00a8:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r13.f198520E
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00b2:
            java.lang.String r0 = "isSwapPosAdapter mAdapter.getData() error."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x00bd
        L_0x00b8:
            java.lang.String r0 = "isSwapPosAdapter mAllContactLabelCopy error."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00bd:
            r0 = 0
        L_0x00be:
            if (r0 == 0) goto L_0x01d9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            g22.j r4 = r13.f198516A
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r4.f222462e
            r0.addAll(r4)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x00da:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00f8
            java.lang.Object r7 = r6.next()
            com.tencent.mm.storage.b2 r7 = (com.tencent.p014mm.storage.C72955b2) r7
            boolean r8 = r7.field_isTemporary
            if (r8 == 0) goto L_0x00ee
            r5.add(r7)
            goto L_0x00da
        L_0x00ee:
            int r7 = r7.field_labelID
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            goto L_0x00da
        L_0x00f8:
            r0.removeAll(r5)
            int r0 = r4.size()
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "cpan[doDeleteScene] can not do scene. lable is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x01dc
        L_0x0108:
            d22.b r0 = new d22.b
            r0.<init>(r4)
            ob0.b0 r4 = eb0.C97625j3.m125815e()
            r4.mo123460f(r0)
            java.util.LinkedList<java.lang.Integer> r0 = r0.f122602f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x011f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01a4
            java.lang.Object r5 = r0.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r13.f198520E
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L_0x0134
            goto L_0x011f
        L_0x0134:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r13.f198520E
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.HashMap<java.lang.Integer, java.lang.Long> r7 = r13.f198519D
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            com.tencent.mm.storage.e2 r9 = a22.C27740g.vx0()
            java.lang.String r10 = java.lang.String.valueOf(r5)
            com.tencent.mm.storage.b2 r9 = r9.mo100950bF(r10)
            if (r9 != 0) goto L_0x0164
            com.tencent.mm.storage.b2 r9 = new com.tencent.mm.storage.b2
            r9.<init>()
            goto L_0x0169
        L_0x0164:
            boolean r10 = r9.field_isTemporary
            if (r10 == 0) goto L_0x0169
            goto L_0x011f
        L_0x0169:
            long r10 = r9.field_createTime
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x011f
            r9.field_createTime = r7
            r4.add(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "oldLebalId = "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = ", newSortLabelId = "
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = ", label.field_createTime = "
            r10.append(r5)
            long r5 = r9.field_createTime
            r10.append(r5)
            java.lang.String r5 = ", newCreateTime = "
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            goto L_0x011f
        L_0x01a4:
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            r0.mo100959vP(r4, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            g22.j r2 = r13.f198516A
            java.util.ArrayList<com.tencent.mm.storage.b2> r2 = r2.f222462e
            r0.addAll(r2)
            java.util.ArrayList<com.tencent.mm.storage.b2> r2 = r13.f198517B
            r2.clear()
            java.util.ArrayList<com.tencent.mm.storage.b2> r2 = r13.f198517B
            r2.addAll(r0)
            java.util.ArrayList<com.tencent.mm.storage.b2> r2 = r13.f198518C
            r2.clear()
            java.util.ArrayList<com.tencent.mm.storage.b2> r2 = r13.f198518C
            r2.addAll(r0)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r13.f198520E
            r0.clear()
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = r13.f198519D
            r0.clear()
            r13.mo95106N7()
            goto L_0x01dc
        L_0x01d9:
            r13.mo95106N7()
        L_0x01dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.label.p067ui.ContactLabelManagerUI.mo95108P7():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        if (r0 > r4) goto L_0x00db;
     */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95109Q7(java.util.ArrayList<com.tencent.p014mm.storage.C72955b2> r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0007
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0007:
            g22.j r0 = r7.f198516A
            r0.getClass()
            int r1 = r8.size()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0020
            java.util.ArrayList<java.lang.String> r8 = r0.f222463f
            if (r8 == 0) goto L_0x001b
            r8.clear()
        L_0x001b:
            r0.notifyDataSetChanged()
            goto L_0x00a9
        L_0x0020:
            java.util.ArrayList<java.lang.String> r1 = r0.f222463f
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x006a
            r1 = 0
        L_0x0029:
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r0.f222462e
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x0057
            java.util.ArrayList<com.tencent.mm.storage.b2> r4 = r0.f222462e
            java.lang.Object r4 = r4.get(r1)
            com.tencent.mm.storage.b2 r4 = (com.tencent.p014mm.storage.C72955b2) r4
            java.util.ArrayList<java.lang.String> r5 = r0.f222463f
            int r6 = r4.field_labelID
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0054
            java.util.List<java.lang.String> r5 = r0.f222464g
            int r4 = r4.field_labelID
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r4)
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0057:
            java.util.ArrayList<java.lang.String> r1 = r0.f222463f
            r1.clear()
            java.util.ArrayList<java.lang.String> r1 = r0.f222463f
            java.util.List<java.lang.String> r4 = r0.f222464g
            r1.addAll(r4)
            java.util.List<java.lang.String> r1 = r0.f222464g
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.clear()
        L_0x006a:
            g22.j$a r1 = r0.f222466i
            if (r1 == 0) goto L_0x0084
            r0.f222478x = r2
            int r4 = r0.f222468n
            if (r4 != r2) goto L_0x0078
            r8.remove(r1)
            goto L_0x0086
        L_0x0078:
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x0086
            g22.j$a r1 = r0.f222466i
            r8.add(r1)
            goto L_0x0086
        L_0x0084:
            r0.f222478x = r3
        L_0x0086:
            boolean r1 = r0.f222480z
            if (r1 == 0) goto L_0x0097
            com.tencent.mm.storage.b2 r1 = r0.f222473s
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x0097
            com.tencent.mm.storage.b2 r1 = r0.f222473s
            r8.add(r3, r1)
        L_0x0097:
            int r1 = r8.size()
            boolean r4 = r0.f222478x
            if (r1 <= r4) goto L_0x00a1
            r1 = 1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            r0.f222477w = r1
            r0.f222462e = r8
            r0.notifyDataSetChanged()
        L_0x00a9:
            g22.j r8 = r7.f198516A
            int r0 = r8.getItemCount()
            g22.j r1 = r7.f198516A
            boolean r1 = r1.f222477w
            r4 = 2
            if (r1 == 0) goto L_0x00b8
            r1 = 2
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            if (r0 <= r1) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            r8.f222461d = r0
            r8.notifyDataSetChanged()
            g22.b r8 = r7.f198551u
            boolean r0 = r7.f198552v
            if (r0 == 0) goto L_0x00da
            g22.j r0 = r7.f198516A
            int r0 = r0.getItemCount()
            g22.j r1 = r7.f198516A
            boolean r1 = r1.f222477w
            if (r1 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r4 = 0
        L_0x00d7:
            if (r0 <= r4) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r2 = 0
        L_0x00db:
            g22.a r8 = r8.f222444I
            r8.f222443e = r2
            android.widget.TextView r8 = r7.f198548r
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131100177(0x7f060211, float:1.7812728E38)
            int r0 = r0.getColor(r1)
            r8.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.label.p067ui.ContactLabelManagerUI.mo95109Q7(java.util.ArrayList):void");
    }

    /* renamed from: R7 */
    public void mo95110R7() {
        if (this.f198552v) {
            this.f198547q.setEnabled(this.f198516A.f222463f.size() > 0);
            if (this.f198516A.f222463f.size() > 0) {
                this.f198526K.setVisibility(8);
                this.f198547q.setTextColor(getResources().getColor(C0966R.color.a0u));
            } else {
                this.f198526K.setVisibility(8);
                this.f198547q.setTextColor(getResources().getColor(C0966R.color.f3140go));
            }
            if (this.f198516A.f222463f.size() > 0) {
                Button button = this.f198547q;
                button.setText(getResources().getString(C0966R.string.f360335by3) + " (" + this.f198516A.f222463f.size() + ")");
                return;
            }
            this.f198547q.setText(getResources().getString(C0966R.string.f360335by3));
        }
    }

    /* renamed from: S7 */
    public final synchronized void mo95111S7(boolean z) {
        MMHandler mMHandler;
        Log.m105919d("MicroMsg.Label.ContactLabelManagerUI", "loading%s", z + "");
        if (z && (mMHandler = this.f198531Q) != null) {
            mMHandler.sendEmptyMessageDelayed(5002, 400);
        }
        C86709a0.m107525e().postToWorker(new C69058g(z));
    }

    /* renamed from: T7 */
    public final void mo95112T7() {
        if (this.f198556z) {
            C75838j jVar = this.f198516A;
            if (jVar == null || jVar.f222463f.size() <= 0) {
                enableOptionMenu(1, false);
            } else {
                enableOptionMenu(1, true);
            }
            updateOptionMenuText(1, getString(C0966R.string.f360089a13) + "(" + this.f198516A.f222463f.size() + ")");
        }
    }

    /* renamed from: U7 */
    public final void mo95113U7(C69066r rVar) {
        this.f198538e = rVar;
        int ordinal = rVar.ordinal();
        if (ordinal == 0) {
            View view = this.f198539f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f198549s;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!this.f198554x) {
                View view4 = this.f198543j;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view6 = this.f198543j;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (ordinal != 1) {
            Log.m105929w("MicroMsg.Label.ContactLabelManagerUI", "unkonw mode:%s", this.f198538e + "");
        } else {
            View view8 = this.f198539f;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c(8);
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = this.f198549s;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = this.f198543j;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.fgz;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7085xr;
    }

    public void initView() {
        this.f198554x = getIntent().getBooleanExtra("select_label", false);
        this.f198555y = getIntent().getStringExtra("privacy_source_type");
        this.f198556z = getIntent().getBooleanExtra("intent_status_from_privacy_setting", false);
        setMMTitle(getString(C0966R.string.g1o));
        setBackBtn(this.f198537W, C0966R.raw.actionbar_icon_dark_back);
        this.f198516A = new C75838j(this);
        this.f198539f = findViewById(C0966R.C0970id.f358497fh1);
        this.f198549s = findViewById(C0966R.C0970id.fgt);
        this.f198550t = (RecyclerView) findViewById(C0966R.C0970id.fgz);
        this.f198550t.setLayoutManager(new LinearLayoutManager(this));
        this.f198550t.setHasFixedSize(true);
        C75830b bVar = new C75830b(new C75828a(this.f198532R));
        this.f198551u = bVar;
        bVar.mo17527j(this.f198550t);
        C75830b bVar2 = this.f198551u;
        bVar2.f222444I.f222443e = false;
        this.f198516A.f222467j = bVar2;
        this.f198543j = findViewById(C0966R.C0970id.gtb);
        this.f198545o = findViewById(C0966R.C0970id.cau);
        this.f198546p = (Button) findViewById(C0966R.C0970id.h0d);
        this.f198547q = (Button) findViewById(C0966R.C0970id.c1h);
        this.f198540g = findViewById(C0966R.C0970id.agx);
        ((TextView) findViewById(C0966R.C0970id.hdf)).setOnClickListener(this.f198534T);
        this.f198548r = (TextView) findViewById(C0966R.C0970id.car);
        this.f198526K = (TextView) findViewById(C0966R.C0970id.eth);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.f5471g1);
        this.f198546p.setOnClickListener(new C4755p(this));
        this.f198547q.setOnClickListener(new C4756q());
        this.f198548r.setOnClickListener(new C69054a());
        this.f198525J = new C78253a(this);
        C75838j jVar = this.f198516A;
        jVar.f222476v = new C4749b();
        this.f198550t.setAdapter(jVar);
        boolean z = this.f198556z;
        if (z && this.f198554x) {
            this.f198516A.f222468n = 2;
        }
        C75838j jVar2 = this.f198516A;
        jVar2.f222472r = this.f198521F;
        jVar2.f222460A = new C69055c();
        if (z && this.f198554x) {
            addTextOptionMenu(1, getString(C0966R.string.f360089a13), new C69056d(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
            mo95112T7();
        }
        View view = this.f198543j;
        int i = !this.f198554x ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById = findViewById(C0966R.C0970id.hdg);
        this.f198541h = findViewById;
        findViewById.setOnClickListener(this.f198534T);
        WeImageView weImageView2 = (WeImageView) findViewById(C0966R.C0970id.hdh);
        this.f198542i = weImageView2;
        weImageView2.setImageDrawable(C74933u4.m89768e(this, C0966R.raw.icons_outlined_add, C76577a.m92153d(this, C0966R.color.f2958ae)));
        this.f198542i.setIconColor(getResources().getColor(C0966R.color.f2958ae));
        this.f198547q.setEnabled(false);
        C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 1, 0, 0, 0);
        this.f198516A.f222480z = !this.f198554x;
        View findViewById2 = findViewById(C0966R.C0970id.fhd);
        this.f198553w = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C69057e());
        }
        View findViewById3 = findViewById(C0966R.C0970id.fp4);
        this.f198544n = findViewById3;
        if (this.f198554x && (findViewById3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f198544n.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f198544n.setLayoutParams(marginLayoutParams);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] requestCode:%d resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1) {
            if (i3 != 7001) {
                if (i3 == 8001) {
                    String stringExtra = intent2.getStringExtra("contact_choose_label_list");
                    Log.m105925i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra + "");
                    if (!Util.isNullOrNil(stringExtra)) {
                        List<String> stringToList = Util.stringToList(stringExtra, ",");
                        try {
                            for (String next : stringToList) {
                                if (!Util.isNullOrNil(next) && !this.f198516A.f222463f.contains(next)) {
                                    this.f198516A.f222463f.add(next);
                                }
                            }
                            C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 11, (long) stringToList.size(), 0, 0);
                            this.f198516A.notifyDataSetChanged();
                            mo95110R7();
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (!this.f198554x || !this.f198556z) {
                String stringExtra2 = intent2.getStringExtra("Select_Contact");
                Log.m105925i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra2 + "");
                if (!Util.isNullOrNil(stringExtra2)) {
                    Intent intent3 = new Intent(intent2);
                    intent3.putExtra("label_source", "label_source_Address");
                    intent3.putExtra("last_page_source_type", 1);
                    if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactEditLabel ");
                        intent3.setClass(this, ContactEditLabel.class);
                    } else {
                        Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactLabelEditUI ");
                        intent3.setClass(this, ContactLabelEditUI.class);
                    }
                    intent3.putExtra("Select_Contact", stringExtra2);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                String stringExtra3 = intent2.getStringExtra("Select_Contact");
                Log.m105925i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra3 + "");
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
        initView();
        C86709a0.m107525e().postToWorker(new C4750f(this));
        C27740g.vx0().add(this.f198535U);
        C115669n.INSTANCE.mo160131h(16097, 2, 0, 2);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.ContactLabelManagerUI).mo86179qs(this, C76986a.Tags);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C72955b2 F4;
        int i = ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position;
        C75838j jVar = this.f198516A;
        if (!(jVar == null || i < 0 || (F4 = jVar.mo106121F4(i)) == null)) {
            contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(view.getContext(), F4.field_labelName));
            contextMenu.add(0, 0, 0, getString(C0966R.string.f7944x1));
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onDestroy() {
        C27740g.vx0().remove(this.f198535U);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0 || !this.f198552v) {
            return super.onKeyDown(i, keyEvent);
        }
        mo95108P7();
        return true;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int i2 = ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position;
        C75838j jVar = this.f198516A;
        if (jVar != null && i2 >= 0) {
            C72955b2 F4 = jVar.mo106121F4(i2);
            if (i == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(F4);
                mo95105M7(arrayList);
            }
        }
    }

    public void onPause() {
        C97625j3.m125815e().mo123470p(636, this);
        C97625j3.m125815e().mo123470p(5882, this);
        C97625j3.m125812b().mo105907v().remove(this.f198536V);
        super.onPause();
    }

    public void onResume() {
        C97625j3.m125815e().mo123455a(636, this);
        C97625j3.m125815e().mo123455a(5882, this);
        C97625j3.m125812b().mo105907v().add(this.f198536V);
        if (this.f198529N) {
            mo95111S7(true);
        } else {
            this.f198529N = true;
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105925i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        int type = yVar.getType();
        if (type != 636) {
            if (type != 5882) {
                Log.m105928w("MicroMsg.Label.ContactLabelManagerUI", "unknow type.");
            } else if (i != 0 || i2 != 0) {
                Log.m105928w("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort fail.");
            } else if (((C48982cc) ((C45257b) yVar).f122600d.f127056b.f127083a).f131633d == 0) {
                Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort success is this type.");
            } else {
                Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort success no this type.");
            }
        } else if (i == 0 && i2 == 0) {
            ArrayList<C72955b2> arrayList = ((C45258c) yVar).f122606g;
            if (!C27740g.vx0().mo100949Yt(arrayList)) {
                Log.m105928w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteContactLabel] fail.");
                hideLoading();
                C76879j.m92749t(this, getString(C0966R.string.bxv), "", new C75522n(this));
                return;
            }
            hideLoading();
            mo95111S7(false);
            if (arrayList != null && arrayList.size() > 0) {
                if (this.f198516A != null) {
                    i3 = 0;
                    for (C72955b2 b2Var : arrayList) {
                        i3 += this.f198516A.f222472r.get(Integer.valueOf(b2Var.field_labelID)).intValue();
                    }
                } else {
                    i3 = 0;
                }
                C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), this.f198530P == 2 ? 7 : 12, (long) arrayList.size(), 0, (long) i3);
            }
        } else {
            Log.m105928w("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd] delete fail.");
            hideLoading();
            C76879j.m92749t(this, getString(C0966R.string.bxv), "", new C75522n(this));
        }
    }
}
