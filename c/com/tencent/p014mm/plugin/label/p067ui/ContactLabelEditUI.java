package com.tencent.p014mm.plugin.label.p067ui;

import a22.C0008d;
import a22.C27740g;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import cm0.C28613b;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.ContactLabelEditStruct;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.label.p067ui.widget.InputClearablePreference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72960e2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d22.C45258c;
import d22.C45259e;
import d22.C45260f;
import d22.C75319a;
import di3.C86312j;
import e22.C75524o;
import e22.C75526p;
import e22.C75528q;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p609mp.C76802a;
import p609mp.C76803c;
import p609mp.C76805e;
import p680ru.C77570i;
import p749xh.C53339k1;
import pj3.C47511g;
import sf0.C77691f;
import sx3.C64197v;
import te3.C48946c3;
import te3.C50422mm2;
import te3.ap4;
import wd3.C78565f0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI */
public class ContactLabelEditUI extends MMPreference implements C11385n {

    /* renamed from: G */
    public static final /* synthetic */ int f198480G = 0;

    /* renamed from: A */
    public ProgressDialog f198481A;

    /* renamed from: B */
    public String f198482B;

    /* renamed from: C */
    public String f198483C;

    /* renamed from: D */
    public boolean f198484D;

    /* renamed from: E */
    public ContactLabelEditStruct f198485E = new ContactLabelEditStruct();

    /* renamed from: F */
    public MMHandler f198486F = new C69045c(Looper.getMainLooper());

    /* renamed from: d */
    public String f198487d;

    /* renamed from: e */
    public String f198488e;

    /* renamed from: f */
    public String f198489f;

    /* renamed from: g */
    public C72955b2 f198490g;

    /* renamed from: h */
    public boolean f198491h;

    /* renamed from: i */
    public boolean f198492i;

    /* renamed from: j */
    public boolean f198493j = false;

    /* renamed from: n */
    public String f198494n;

    /* renamed from: o */
    public C47511g f198495o;

    /* renamed from: p */
    public ContactListExpandPreference f198496p;

    /* renamed from: q */
    public InputClearablePreference f198497q;

    /* renamed from: r */
    public Preference f198498r;

    /* renamed from: s */
    public PreferenceTitleCategory f198499s;

    /* renamed from: t */
    public boolean f198500t = true;

    /* renamed from: u */
    public boolean f198501u = true;

    /* renamed from: v */
    public ArrayList<String> f198502v = new ArrayList<>();

    /* renamed from: w */
    public ArrayList<String> f198503w = new ArrayList<>();

    /* renamed from: x */
    public HashSet<String> f198504x = new HashSet<>();

    /* renamed from: y */
    public HashSet<String> f198505y = new HashSet<>();

    /* renamed from: z */
    public HashSet<String> f198506z = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$a */
    public class C69043a implements DialogInterface.OnClickListener {
        public C69043a(ContactLabelEditUI contactLabelEditUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$b */
    public class C69044b implements DialogInterface.OnClickListener {
        public C69044b(ContactLabelEditUI contactLabelEditUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$c */
    public class C69045c extends MMHandler {
        public C69045c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 6001) {
                ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
                int i2 = ContactLabelEditUI.f198480G;
                contactLabelEditUI.mo95093N7();
            } else if (i != 6002) {
                Log.m105929w("MicroMsg.Label.ContactLabelEditUI", "unknow message. what is:%d", Integer.valueOf(i));
            } else {
                ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$d */
    public class C69046d implements MenuItem.OnMenuItemClickListener {
        public C69046d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelEditUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$e */
    public class C69047e implements MenuItem.OnMenuItemClickListener {
        public C69047e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactLabelEditUI.m81344H7(ContactLabelEditUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$f */
    public class C69048f implements C76805e.C76807b {
        public C69048f(ContactLabelEditUI contactLabelEditUI) {
        }

        /* renamed from: a */
        public boolean mo1069a(ViewGroup viewGroup, View view, int i) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$g */
    public class C69049g implements ContactListExpandPreference.C72740a {
        public C69049g() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
            ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
            contactLabelEditUI.f198485E.f194188i = 1;
            String c = C76802a.m92581c(contactLabelEditUI.f198496p, i);
            Log.m105919d("MicroMsg.Label.ContactLabelEditUI", "cpan[onItemDelClick] position:%d userName:%s", Integer.valueOf(i), c);
            ContactLabelEditUI contactLabelEditUI2 = ContactLabelEditUI.this;
            contactLabelEditUI2.getClass();
            Log.m105924i("MicroMsg.Label.ContactLabelEditUI", "cpan[dealRemoveContact]");
            ArrayList<String> arrayList = contactLabelEditUI2.f198502v;
            if (arrayList != null && arrayList.contains(c)) {
                contactLabelEditUI2.f198502v.remove(c);
                ContactLabelEditStruct contactLabelEditStruct = contactLabelEditUI2.f198485E;
                contactLabelEditStruct.f194189j++;
                contactLabelEditStruct.f194190k = contactLabelEditStruct.mo86045b("DeleteUinlist", contactLabelEditUI2.f198485E.f194190k + ";" + c, true);
            }
            ArrayList<String> arrayList2 = contactLabelEditUI2.f198503w;
            if (arrayList2 != null && arrayList2.contains(c)) {
                contactLabelEditUI2.f198506z.add(c);
            }
            HashSet<String> hashSet = contactLabelEditUI2.f198504x;
            if (hashSet != null && hashSet.contains(c)) {
                contactLabelEditUI2.f198504x.remove(c);
                contactLabelEditUI2.f198505y.remove(c);
            }
            MMHandler mMHandler = contactLabelEditUI2.f198486F;
            if (mMHandler != null) {
                mMHandler.sendEmptyMessage(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
            }
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
            contactLabelEditUI.f198485E.f194188i = 1;
            contactLabelEditUI.getClass();
            Log.m105924i("MicroMsg.Label.ContactLabelEditUI", "cpan[dealAddContact]");
            Intent intent = new Intent();
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219161b, 1024));
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", contactLabelEditUI.getString(C0966R.string.g1n));
            intent.putExtra("show_too_many_member", false);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
            ArrayList<String> arrayList = contactLabelEditUI.f198502v;
            if (arrayList != null) {
                intent.putExtra("always_select_contact", Util.listToString(arrayList, ","));
            }
            C88144b.m109802t(contactLabelEditUI, ".ui.contact.SelectContactUI", intent, 7001);
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            ContactListExpandPreference contactListExpandPreference = ContactLabelEditUI.this.f198496p;
            if (contactListExpandPreference != null) {
                contactListExpandPreference.mo100300J();
            }
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            C76803c cVar = ContactLabelEditUI.this.f198496p.f211662K;
            if (cVar != null ? ((C72741a) cVar).f211670g.mo108546d(i) : false) {
                ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
                contactLabelEditUI.f198485E.f194187h++;
                String c = C76802a.m92581c(contactLabelEditUI.f198496p, i);
                String a = C76802a.m92579a(ContactLabelEditUI.this.f198496p, i);
                if (!Util.isNullOrNil(c)) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", c);
                    intent.putExtra("Contact_RoomNickname", a);
                    intent.putExtra("CONTACT_INFO_UI_SOURCE", ContactLabelEditUI.this.f198484D ? 17 : 15);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, ContactLabelEditUI.this);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$h */
    public class C69050h implements InputClearablePreference.C69106d {
        public C69050h() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$i */
    public class C69051i implements Runnable {
        public C69051i() {
        }

        public void run() {
            ArrayList<String> bO = C27740g.vx0().mo100951bO(ContactLabelEditUI.this.f198489f);
            if (bO == null) {
                Log.m105928w("MicroMsg.Label.ContactLabelEditUI", "result is null");
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            if (C27740g.vx0().f212653g.containsKey(ContactLabelEditUI.this.f198489f)) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                for (List<String> list : CommonKt.splitList(bO, 100)) {
                    SingleTable singleTable = C53339k1.f149474h1;
                    Column column = C53339k1.f149475i1;
                    for (C72996z1 z1Var : singleTable.select((List<? extends ISqlColumn>) C64197v.m75537f(column, C53339k1.f149478l1)).where(column.inString(list)).build().multiQuery(C86709a0.m107535s().f251811i, C72996z1.class)) {
                        String username = z1Var.getUsername();
                        C87412m.m108593f(username, "contact.username");
                        hashMap.put(username, z1Var);
                    }
                    for (String str : list) {
                        C72996z1 z1Var2 = (C72996z1) hashMap.get(str);
                        if (z1Var2 != null) {
                            arrayList2.add(z1Var2);
                        }
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C72996z1 z1Var3 = (C72996z1) it.next();
                    if (!Util.isNullOrNil(z1Var3.mo73974r2()) && z1Var3.mo73974r2().contains(ContactLabelEditUI.this.f198489f)) {
                        arrayList.add(z1Var3.getUsername());
                    }
                }
            } else {
                arrayList.addAll(bO);
            }
            ContactLabelEditStruct contactLabelEditStruct = ContactLabelEditUI.this.f198485E;
            contactLabelEditStruct.f194186g = contactLabelEditStruct.mo86045b("CurrentLabelUinList", Util.listToString(arrayList, ";"), true);
            ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
            contactLabelEditUI.f198502v = arrayList;
            ArrayList<String> arrayList3 = contactLabelEditUI.f198503w;
            if (arrayList3 == null) {
                contactLabelEditUI.f198503w = new ArrayList<>();
            } else {
                arrayList3.clear();
            }
            ContactLabelEditUI.this.f198503w.addAll(arrayList);
            MMHandler mMHandler = ContactLabelEditUI.this.f198486F;
            if (mMHandler != null) {
                mMHandler.sendEmptyMessage(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
            }
        }

        public String toString() {
            return super.toString() + "|initView";
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$j */
    public class C69052j implements AbsListView.OnScrollListener {
        public C69052j() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelEditUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelEditUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactLabelEditUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 2 || i == 1) {
                ContactLabelEditUI.this.hideVKB();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactLabelEditUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI$k */
    public class C69053k implements DialogInterface.OnClickListener {
        public C69053k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ContactLabelEditUI contactLabelEditUI = ContactLabelEditUI.this;
            C72955b2 b2Var = contactLabelEditUI.f198490g;
            if (b2Var.field_isTemporary) {
                contactLabelEditUI.mo95088I7(b2Var);
            } else {
                ContactLabelEditUI contactLabelEditUI2 = contactLabelEditUI;
                contactLabelEditUI.f198481A = C76879j.m92723Q(contactLabelEditUI2, contactLabelEditUI.getString(C0966R.string.a3h), contactLabelEditUI.getString(C0966R.string.g1r), true, true, new C75524o(contactLabelEditUI));
                C97625j3.m125815e().mo123460f(new C45258c(b2Var.field_labelID + ""));
            }
            if (contactLabelEditUI.f198484D) {
                C115669n.INSTANCE.mo160131h(16097, 1, 2, 2);
                return;
            }
            C115669n.INSTANCE.mo160131h(16097, 1, 2, 3);
        }
    }

    /* renamed from: H7 */
    public static void m81344H7(ContactLabelEditUI contactLabelEditUI) {
        contactLabelEditUI.getClass();
        Log.m105924i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveLabelChange]");
        ContactLabelEditUI contactLabelEditUI2 = contactLabelEditUI;
        contactLabelEditUI.f198481A = C76879j.m92723Q(contactLabelEditUI2, contactLabelEditUI.getString(C0966R.string.a3h), contactLabelEditUI.getString(C0966R.string.g2h), true, true, new C75524o(contactLabelEditUI));
        String nullAs = Util.nullAs(contactLabelEditUI.f198488e, "");
        contactLabelEditUI.f198488e = nullAs;
        String trim = nullAs.trim();
        contactLabelEditUI.f198488e = trim;
        if (Util.isNullOrNil(trim)) {
            contactLabelEditUI.hideLoading();
            contactLabelEditUI.mo95092M7(contactLabelEditUI.getString(C0966R.string.f360931g24));
        } else if (C45078p0.m49927f(contactLabelEditUI.f198488e) > 36) {
            contactLabelEditUI.hideLoading();
            contactLabelEditUI.mo95092M7(String.format(contactLabelEditUI.getString(C0966R.string.f7386es), new Object[]{Integer.valueOf(C45078p0.m49923b(36, ""))}));
        } else {
            if (!(!Util.isNullOrNil(C27740g.vx0().mo100944LL(contactLabelEditUI.f198488e))) || !contactLabelEditUI.f198500t) {
                if (!(!Util.isNullOrNil(C27740g.vx0().mo100944LL(contactLabelEditUI.f198488e))) || Util.isNullOrNil(contactLabelEditUI.f198487d) || contactLabelEditUI.f198487d.equals(contactLabelEditUI.f198488e)) {
                    C72955b2 bF = C27740g.vx0().mo100950bF(contactLabelEditUI.f198489f);
                    if (contactLabelEditUI.f198500t || bF.field_isTemporary) {
                        C97625j3.m125815e().mo123460f(new C75319a(contactLabelEditUI.f198488e));
                        return;
                    }
                    C97625j3.m125815e().mo123460f(new C45260f(Util.getInt(contactLabelEditUI.f198489f, 0), contactLabelEditUI.f198488e));
                    return;
                }
            }
            contactLabelEditUI.hideLoading();
            contactLabelEditUI.mo95092M7(contactLabelEditUI.getString(C0966R.string.f7382eo));
        }
    }

    /* renamed from: I7 */
    public final void mo95088I7(C72955b2 b2Var) {
        if (!C27740g.vx0().mo100957qq(true, b2Var, "labelID")) {
            Log.m105928w("MicroMsg.Label.ContactLabelEditUI", "cpan[doDeleteContactLabel] fail.");
            mo95092M7(getString(C0966R.string.bxv));
            return;
        }
        setResult(-1);
        finish();
    }

    /* renamed from: J7 */
    public final void mo95089J7() {
        Object[] objArr = new Object[2];
        HashSet<String> hashSet = this.f198504x;
        objArr[0] = Integer.valueOf(hashSet == null ? 0 : hashSet.size());
        HashSet<String> hashSet2 = this.f198506z;
        objArr[1] = Integer.valueOf(hashSet2 == null ? 0 : hashSet2.size());
        Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList] addcount:%d,delcount:%d", objArr);
        LinkedList linkedList = new LinkedList();
        HashSet<String> hashSet3 = this.f198504x;
        if (hashSet3 != null && hashSet3.size() > 0) {
            this.f198504x.size();
            Iterator<String> it = this.f198504x.iterator();
            while (it.hasNext()) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(it.next());
                String r2 = z1Var.mo73974r2();
                String b = C0008d.m1b(r2, this.f198489f);
                Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "labels:%s mixLabelIds:%s", r2, b);
                if (!b.equalsIgnoreCase(r2)) {
                    ap4 ap4 = new ap4();
                    ap4.f130717d = z1Var.getUsername();
                    ap4.f130718e = b;
                    linkedList.add(ap4);
                }
            }
        }
        HashSet<String> hashSet4 = this.f198506z;
        if (hashSet4 != null && hashSet4.size() > 0) {
            this.f198506z.size();
            Iterator<String> it4 = this.f198506z.iterator();
            while (it4.hasNext()) {
                String next = it4.next();
                String r25 = C97625j3.m125812b().mo105907v().get(next).mo73974r2();
                String c = C0008d.m2c(r25, this.f198489f);
                Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "username:%s labels:%s mixLabelIds:%s", next, r25, c);
                if (!c.equalsIgnoreCase(r25)) {
                    ap4 ap42 = new ap4();
                    ap42.f130717d = next;
                    ap42.f130718e = c;
                    linkedList.add(ap42);
                }
            }
        }
        if (linkedList.size() > 0) {
            C97625j3.m125815e().mo123460f(new C45259e(linkedList));
        } else {
            mo95090K7();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010b  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95090K7() {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "MicroMsg.Label.ContactLabelEditUI"
            java.lang.String r2 = "cpan[savaSuccess]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r18.hideLoading()
            java.util.HashSet<java.lang.String> r2 = r0.f198504x
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x001a
            int r2 = r2.size()
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.HashSet<java.lang.String> r5 = r0.f198506z
            if (r5 == 0) goto L_0x0024
            int r5 = r5.size()
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            boolean r6 = r0.f198492i
            if (r6 == 0) goto L_0x0059
            boolean r6 = r0.f198500t
            java.lang.String r7 = "key_label_click_source"
            if (r6 == 0) goto L_0x0043
            android.content.Intent r6 = r18.getIntent()
            int r6 = r6.getIntExtra(r7, r3)
            long r7 = (long) r6
            r9 = 10
            r11 = 1
            long r13 = (long) r2
            r15 = 0
            a22.C0008d.m0a(r7, r9, r11, r13, r15)
            goto L_0x0059
        L_0x0043:
            android.content.Intent r6 = r18.getIntent()
            int r6 = r6.getIntExtra(r7, r3)
            long r7 = (long) r6
            r9 = 6
            r11 = 1
            long r13 = (long) r2
            r17 = r4
            long r3 = (long) r5
            r15 = r3
            a22.C0008d.m0a(r7, r9, r11, r13, r15)
            goto L_0x005b
        L_0x0059:
            r17 = r4
        L_0x005b:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r7
            java.lang.String r7 = "cpan[doUpdateContactList]addnum:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r4)
            r1 = 4
            r4 = 2
            r7 = 3
            if (r2 <= 0) goto L_0x00b0
            java.util.HashSet<java.lang.String> r8 = r0.f198505y
            int r8 = r8.size()
            int r9 = r2 - r8
            int r9 = java.lang.Math.max(r6, r9)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 11220(0x2bd4, float:1.5723E-41)
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r13 = eb0.C75592q0.m90789s()
            r12[r6] = r13
            r12[r3] = r17
            r12[r4] = r17
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r12[r7] = r13
            boolean r13 = r0.f198491h
            if (r13 == 0) goto L_0x0098
            r13 = 1
            goto L_0x0099
        L_0x0098:
            r13 = 2
        L_0x0099:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r1] = r13
            r13 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r13] = r8
            r8 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12[r8] = r9
            r10.mo160131h(r11, r12)
        L_0x00b0:
            boolean r8 = r0.f198500t
            r9 = 16097(0x3ee1, float:2.2557E-41)
            if (r8 == 0) goto L_0x010b
            android.content.Intent r1 = r18.getIntent()
            java.lang.String r2 = r0.f198488e
            java.lang.String r5 = "k_sns_label_add_label"
            r1.putExtra(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashSet<java.lang.String> r5 = r0.f198504x
            r2.<init>(r5)
            java.lang.String r5 = "k_sns_label_add_label_usernames"
            r1.putStringArrayListExtra(r5, r2)
            r2 = 0
            r0.setResult(r2, r1)
            boolean r1 = r0.f198484D
            if (r1 == 0) goto L_0x00f0
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5[r2] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r4] = r2
            r1.mo160131h(r9, r5)
            goto L_0x0186
        L_0x00f0:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5[r2] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r5[r4] = r2
            r1.mo160131h(r9, r5)
            goto L_0x0186
        L_0x010b:
            if (r2 <= 0) goto L_0x0146
            boolean r2 = r0.f198484D
            if (r2 == 0) goto L_0x012c
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r8[r6] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r8[r4] = r10
            r2.mo160131h(r9, r8)
            goto L_0x0146
        L_0x012c:
            r6 = 0
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r8[r6] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8[r4] = r10
            r2.mo160131h(r9, r8)
        L_0x0146:
            if (r5 <= 0) goto L_0x0182
            boolean r2 = r0.f198484D
            if (r2 == 0) goto L_0x0167
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r5[r6] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r5[r4] = r1
            r2.mo160131h(r9, r5)
            goto L_0x0183
        L_0x0167:
            r6 = 0
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r5[r6] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r5[r4] = r1
            r2.mo160131h(r9, r5)
            goto L_0x0183
        L_0x0182:
            r6 = 0
        L_0x0183:
            r0.setResult(r6)
        L_0x0186:
            r18.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.label.p067ui.ContactLabelEditUI.mo95090K7():void");
    }

    /* renamed from: L7 */
    public final void mo95091L7() {
        Log.m105924i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveFailed]");
        hideLoading();
        mo95092M7(getString(C0966R.string.f7383ep));
    }

    /* renamed from: M7 */
    public void mo95092M7(String str) {
        C76879j.m92749t(this, str, "", new C69044b(this));
    }

    /* renamed from: N7 */
    public final void mo95093N7() {
        ContactListExpandPreference contactListExpandPreference = this.f198496p;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.mo100301K((String) null, this.f198502v);
            ArrayList<String> arrayList = this.f198502v;
            if (arrayList == null || arrayList.size() <= 0) {
                this.f198496p.mo100300J();
            }
        }
        InputClearablePreference inputClearablePreference = this.f198497q;
        if (inputClearablePreference != null) {
            inputClearablePreference.mo95177J(this.f198488e);
        }
    }

    public String getIdentString() {
        return this.f198500t ? "_New" : "_Edit";
    }

    public int getResourceId() {
        return C0966R.xml.f8910b6;
    }

    public final void hideLoading() {
        ProgressDialog progressDialog = this.f198481A;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f198481A.dismiss();
        }
    }

    public void initView() {
        if (this.f198484D) {
            C115669n.INSTANCE.mo160131h(16097, 1, 0, 2);
        } else {
            C115669n.INSTANCE.mo160131h(16097, 1, 0, 3);
        }
        if (Util.isNullOrNil(this.f198489f)) {
            this.f198500t = true;
            this.f198494n = getString(C0966R.string.hly);
        } else {
            this.f198500t = false;
            this.f198490g = C27740g.vx0().mo100950bF(this.f198489f);
            this.f198494n = getString(C0966R.string.hlx);
        }
        setMMTitle(this.f198494n);
        setBackBtn(new C69046d());
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C69047e(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        C47511g preferenceScreen = getPreferenceScreen();
        this.f198495o = preferenceScreen;
        ContactListExpandPreference contactListExpandPreference = (ContactListExpandPreference) preferenceScreen.mo72519a("contact_label_contact_list");
        this.f198496p = contactListExpandPreference;
        contactListExpandPreference.mo100302L(this.f198495o, contactListExpandPreference.f121285r);
        this.f198496p.mo100304N(true);
        this.f198496p.mo100305P(true);
        C76803c cVar = this.f198496p.f211662K;
        if (cVar != null) {
            ((C72741a) cVar).f211670g.getClass();
        }
        ContactListExpandPreference contactListExpandPreference2 = this.f198496p;
        C76803c cVar2 = contactListExpandPreference2.f211662K;
        if (cVar2 != null) {
            ((C72741a) cVar2).f211668e = false;
        }
        C69048f fVar = new C69048f(this);
        if (cVar2 != null) {
            ((C72741a) cVar2).f211671h = fVar;
        }
        contactListExpandPreference2.mo100307S(new C69049g());
        InputClearablePreference inputClearablePreference = (InputClearablePreference) this.f198495o.mo72519a("contact_label_name");
        this.f198497q = inputClearablePreference;
        String string = getString(C0966R.string.g1u);
        inputClearablePreference.f198721K = string;
        MMEditText mMEditText = inputClearablePreference.f198726Q;
        if (mMEditText != null) {
            mMEditText.setHint(string);
        }
        this.f198497q.f198722L = getString(C0966R.string.g2d);
        InputClearablePreference inputClearablePreference2 = this.f198497q;
        String string2 = getString(C0966R.string.f7384eq);
        inputClearablePreference2.f198723M = string2;
        TextView textView = inputClearablePreference2.f198728S;
        if (textView != null) {
            textView.setText(string2);
        }
        InputClearablePreference inputClearablePreference3 = this.f198497q;
        inputClearablePreference3.f198724N = 36;
        inputClearablePreference3.f198725P = this.f198500t;
        inputClearablePreference3.f198730U = new C69050h();
        inputClearablePreference3.mo95177J(this.f198488e);
        MMHandler mMHandler = this.f198486F;
        if (mMHandler != null) {
            mMHandler.sendEmptyMessage(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
        }
        if (this.f198500t) {
            ArrayList<String> arrayList = this.f198502v;
            if (arrayList == null || arrayList.size() <= 0) {
                C76803c cVar3 = this.f198496p.f211662K;
                if (cVar3 != null) {
                    C72741a aVar = (C72741a) cVar3;
                    ArrayList<C72996z1> arrayList2 = new ArrayList<>(0);
                    C78565f0 f0Var = aVar.f211670g;
                    f0Var.f230158y = false;
                    f0Var.f230142f = arrayList2;
                    aVar.mo100308a((String) null);
                }
            } else {
                this.f198496p.mo100301K((String) null, this.f198502v);
            }
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C69051i());
        }
        if (getListView() != null) {
            getListView().setOnScrollListener(new C69052j());
        }
        this.f198498r = this.f198495o.mo72519a("contact_label_delete");
        this.f198499s = (PreferenceTitleCategory) this.f198495o.mo72519a("contact_label_empty_category");
        if (this.f198500t) {
            this.f198495o.mo72526j(this.f198498r);
            this.f198495o.mo72526j(this.f198499s);
        } else if (!this.f198493j) {
            this.f198495o.mo72526j(this.f198498r);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] requestCode:%d resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1 && i == 7001) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] %s", stringExtra + "");
            if (!Util.isNullOrNil(stringExtra)) {
                ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
                if (stringsToList != null && stringsToList.size() > 0) {
                    int size = stringsToList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = stringsToList.get(i3);
                        if (!Util.isNullOrNil(str)) {
                            if (!C45628s0.m50740E(str) || this.f198502v.contains(str) || str.equals(this.f198482B)) {
                                Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", str);
                            } else {
                                this.f198502v.add(str);
                                ArrayList<String> arrayList = this.f198503w;
                                if (arrayList != null && !arrayList.contains(stringsToList.get(i3))) {
                                    this.f198504x.add(str);
                                    ContactLabelEditStruct contactLabelEditStruct = this.f198485E;
                                    contactLabelEditStruct.f194191l++;
                                    contactLabelEditStruct.f194192m = contactLabelEditStruct.mo86045b("TotoalAddUinList", this.f198485E.f194192m + ";" + str, true);
                                }
                                if (booleanExtra) {
                                    this.f198505y.add(str);
                                }
                                HashSet<String> hashSet = this.f198506z;
                                if (hashSet != null && hashSet.contains(str)) {
                                    this.f198506z.remove(str);
                                }
                            }
                        }
                    }
                }
                MMHandler mMHandler = this.f198486F;
                if (mMHandler != null) {
                    mMHandler.sendEmptyMessage(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
                }
            }
        }
    }

    public void onBackPressed() {
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        if ((Util.isNullOrNil(this.f198488e) || this.f198488e.equals(this.f198487d)) && (((hashSet = this.f198504x) == null || hashSet.size() <= 0) && ((hashSet2 = this.f198506z) == null || hashSet2.size() <= 0))) {
            setResult(0);
            finish();
            return;
        }
        C76879j.m92707A(this, getString(C0966R.string.ian), "", getString(C0966R.string.att), getString(C0966R.string.atw), new C75526p(this), new C75528q(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f198482B = C75592q0.m90789s();
        this.f198489f = getIntent().getStringExtra("label_id");
        this.f198487d = getIntent().getStringExtra("label_name");
        this.f198488e = getIntent().getStringExtra("label_name");
        this.f198491h = getIntent().getBooleanExtra("Is_Chatroom", false);
        this.f198492i = getIntent().getIntExtra("last_page_source_type", 0) == 1;
        String stringExtra = getIntent().getStringExtra("label_source");
        this.f198483C = stringExtra;
        this.f198484D = stringExtra != null && stringExtra.equals("label_source_Address");
        this.f198493j = getIntent().getBooleanExtra("is_show_delete", true);
        String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        if (!Util.isNullOrNil(stringExtra2)) {
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra2.split(","));
            this.f198502v = new ArrayList<>();
            if (stringsToList != null && stringsToList.size() > 0) {
                int size = stringsToList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringsToList.get(i);
                    if (!Util.isNullOrNil(str)) {
                        if (!C45628s0.m50740E(str) || this.f198502v.contains(str) || str.equals(this.f198482B)) {
                            Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f198502v.add(str);
                            this.f198504x.add(str);
                            if (this.f198491h) {
                                this.f198505y.add(str);
                            }
                        }
                    }
                }
            }
        }
        C97625j3.m125815e().mo123455a(C28613b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123455a(637, this);
        C97625j3.m125815e().mo123455a(638, this);
        initView();
        this.f198485E.f194183d = Objects.equals(this.f198483C, "label_source_Address") ? 2 : Objects.equals(this.f198483C, "label_source_SNS") ? 1 : -1;
        ContactLabelEditStruct contactLabelEditStruct = this.f198485E;
        contactLabelEditStruct.f194184e = contactLabelEditStruct.mo86045b("SessionID", this.f198482B + "-" + System.currentTimeMillis(), true);
        ContactLabelEditStruct contactLabelEditStruct2 = this.f198485E;
        contactLabelEditStruct2.f194185f = contactLabelEditStruct2.mo86045b("LabelID", this.f198489f, true);
        ContactLabelEditStruct contactLabelEditStruct3 = this.f198485E;
        contactLabelEditStruct3.f194187h = 0;
        contactLabelEditStruct3.f194188i = 0;
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this);
        C97625j3.m125815e().mo123470p(637, this);
        C97625j3.m125815e().mo123470p(638, this);
        ContactListExpandPreference contactListExpandPreference = this.f198496p;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        super.onDestroy();
        this.f198485E.mo86054n();
    }

    public void onPause() {
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(4, "ContactLabelEditUI" + getIdentString(), hashCode());
        C97625j3.m125815e().mo123470p(636, this);
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is null.");
            return false;
        }
        if (str.equals("contact_label_delete")) {
            C76879j.m92708B(this, getString(C0966R.string.g1q), "", getString(C0966R.string.g1p), getString(C0966R.string.f7926wf), new C69053k(), new C69043a(this), C0966R.color.a_3);
        }
        Log.m105919d("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is %s:", str);
        return false;
    }

    public void onResume() {
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(3, "ContactLabelEditUI" + getIdentString(), hashCode());
        C97625j3.m125815e().mo123455a(636, this);
        enableOptionMenu(Util.isNullOrNil(this.f198488e) ^ true);
        mo95093N7();
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        switch (yVar.getType()) {
            case C28613b.CTRL_INDEX:
                if (i == 0 && i2 == 0) {
                    LinkedList<C50422mm2> linkedList = ((C48946c3) ((C75319a) yVar).f221473d.f127056b.f127083a).f131475e;
                    if (linkedList == null || linkedList.size() <= 0) {
                        mo95091L7();
                        return;
                    }
                    C50422mm2 mm22 = linkedList.get(0);
                    Log.m105925i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", mm22.f138106e + "", mm22.f138105d);
                    this.f198489f = mm22.f138106e + "";
                    C72960e2 vx02 = C27740g.vx0();
                    vx02.f212653g.put(this.f198489f, new ArrayList(this.f198504x));
                    mo95089J7();
                    return;
                }
                mo95091L7();
                return;
            case 636:
                if (i == 0 && i2 == 0) {
                    mo95088I7(this.f198490g);
                    MMHandler mMHandler = this.f198486F;
                    if (mMHandler != null) {
                        mMHandler.sendEmptyMessageDelayed(6002, 300);
                        return;
                    }
                    return;
                }
                Log.m105928w("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] delete fail.");
                mo95092M7(getString(C0966R.string.bxv));
                return;
            case 637:
                if (i == 0 && i2 == 0) {
                    String str2 = this.f198489f;
                    String str3 = this.f198488e;
                    Log.m105924i("MicroMsg.Label.ContactLabelEditUI", "cpan[doInsertOrUpdateLable]");
                    try {
                        i3 = Integer.valueOf(str2).intValue();
                    } catch (Exception unused) {
                        Log.m105921e("MicroMsg.Label.ContactLabelEditUI", "id is not integer type:%s", str2 + "");
                        i3 = -1;
                    }
                    if (i3 != -1) {
                        C72955b2 bF = C27740g.vx0().mo100950bF(str2);
                        if (bF == null) {
                            bF = new C72955b2();
                        }
                        bF.field_labelID = i3;
                        bF.field_labelName = str3;
                        bF.field_labelPYFull = C77691f.m93686a(str3);
                        bF.field_labelPYShort = C77691f.m93687b(str3);
                        C27740g.vx0().mo100958uP(true, bF, "labelID");
                    } else {
                        mo95091L7();
                    }
                    mo95089J7();
                    return;
                }
                mo95091L7();
                return;
            case 638:
                if (i == 0 && i2 == 0) {
                    mo95090K7();
                    MMHandler mMHandler2 = this.f198486F;
                    if (mMHandler2 != null) {
                        mMHandler2.sendEmptyMessageDelayed(6002, 300);
                        return;
                    }
                    return;
                }
                mo95091L7();
                return;
            default:
                return;
        }
    }
}
