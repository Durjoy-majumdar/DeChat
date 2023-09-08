package com.tencent.p014mm.p136ui.contact.privacy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import hl3.C8605d;
import ht1.C76243a5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ke3.C88144b;
import lc3.C10485b;
import ob0.C117747y;
import pc0.C11884l;
import te3.C50194ky2;
import te3.C50327ly2;
import tv2.C14096e;
import up1.C14364t0;

/* renamed from: com.tencent.mm.ui.contact.privacy.FinderBlockListUI */
public class FinderBlockListUI extends ContactMgrUIBase {

    /* renamed from: F */
    public int f24584F = 0;

    /* renamed from: G */
    public C14364t0 f24585G = null;

    /* renamed from: H */
    public CharSequence f24586H;

    /* renamed from: I */
    public LinkedList<FinderContact> f24587I;

    /* renamed from: J */
    public Set<C117747y> f24588J = new HashSet();

    /* renamed from: K */
    public TextView f24589K;

    /* renamed from: com.tencent.mm.ui.contact.privacy.FinderBlockListUI$a */
    public class C6916a implements Runnable {
        public C6916a() {
        }

        public void run() {
            for (C117747y d : FinderBlockListUI.this.f24588J) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d(d);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.FinderBlockListUI$b */
    public class C6917b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f24591d;

        public C6917b(List list) {
            this.f24591d = list;
        }

        public void run() {
            ArrayList arrayList = new ArrayList();
            FinderBlockListUI.this.f24540A = true;
            for (String str : this.f24591d) {
                if (!Util.isNullOrNil(str)) {
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                    FinderContact finderContact = new FinderContact();
                    finderContact.username = z1Var.getUsername();
                    finderContact.coverImgUrl = z1Var.f149515T0;
                    arrayList.add(finderContact);
                }
            }
            FinderBlockListUI finderBlockListUI = FinderBlockListUI.this;
            finderBlockListUI.f24588J = finderBlockListUI.f24585G.mo13648j(arrayList, (C14364t0.C14366b) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.FinderBlockListUI$c */
    public class C6918c implements Runnable {
        public C6918c() {
        }

        public void run() {
            for (C117747y d : FinderBlockListUI.this.f24588J) {
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d(d);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.FinderBlockListUI$d */
    public class C6919d extends ContactMgrUIBase.C6915k {
        public C6919d(C74493g1 g1Var) {
            super(FinderBlockListUI.this, g1Var);
        }

        /* renamed from: s */
        public C75922b mo7932s(int i, String str) {
            C75957r rVar = new C75957r(i);
            rVar.f222731x = str;
            return rVar;
        }

        /* renamed from: v */
        public String mo7911v() {
            int i = FinderBlockListUI.this.f24584F;
            if (i == 2) {
                return "@finder.block.my.liked.android";
            }
            if (i == 1) {
                return "@finder.block.his.liked.android";
            }
            return null;
        }
    }

    /* renamed from: H7 */
    public ContactMgrUIBase.C6915k mo7900H7(C74493g1 g1Var) {
        return new C6919d(g1Var);
    }

    /* renamed from: J7 */
    public void mo7902J7() {
        Log.m105924i("MicroMsg.FinderBlockListUI", "doCallSelectContactUIForMultiRetransmit");
        Intent intent = new Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", getString(C0966R.string.ece));
        intent.putExtra("always_select_contact", Util.listToString(this.f24544d, ","));
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219161b);
        intent.putExtra("block_contact", C75592q0.m90789s());
        intent.putExtra("max_limit_num", 20);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        startActivityForResult(intent, 1);
    }

    /* renamed from: K7 */
    public void mo7903K7() {
        Intent intent = new Intent(this, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        int i = this.f24584F;
        if (i == 2) {
            intent.putExtra("filter_type", "@finder.block.my.liked.android");
        } else if (i == 1) {
            intent.putExtra("filter_type", "@finder.block.his.liked.android");
        }
        mo7912P7(intent);
        intent.putExtra("titile", getResources().getString(C0966R.string.hm_));
        startActivityForResult(intent, 2);
    }

    /* renamed from: L7 */
    public void mo7904L7(Intent intent, Context context) {
        ArrayList<String> stringsToList;
        String stringExtra = intent.getStringExtra("Select_Contact");
        if (!Util.isNullOrNil(stringExtra) && (stringsToList = Util.stringsToList(stringExtra.split(","))) != null) {
            this.f24588J.clear();
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30);
            int i = 0;
            while (i < stringsToList.size()) {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i < stringsToList.size() && i2 < b) {
                    arrayList.add(stringsToList.get(i));
                    i++;
                    i2++;
                }
                this.f24588J.add(this.f24585G.mo13639a(arrayList));
            }
            this.f24563z = true;
            this.f24543D.mo9466a(new C6916a());
        }
    }

    /* renamed from: M7 */
    public boolean mo7905M7(AdapterView<?> adapterView, View view, int i, long j) {
        return false;
    }

    /* renamed from: N7 */
    public void mo7906N7(AdapterView<?> adapterView, View view, int i, long j) {
        C75922b j2 = this.f24547g.getItem(i);
        if (j2 != null && (j2 instanceof C75939h)) {
            String str = ((C75939h) j2).f222602y;
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: O7 */
    public void mo7907O7(Intent intent, Context context) {
        ArrayList<String> stringsToList;
        String stringExtra = intent.getStringExtra("Select_Contact");
        if (!Util.isNullOrNil(stringExtra) && (stringsToList = Util.stringsToList(stringExtra.split(","))) != null) {
            this.f24543D.mo9467b(new C6917b(stringsToList), new C6918c());
        }
    }

    /* renamed from: V7 */
    public void mo7918V7() {
        TextView textView;
        ContactMgrUIBase.C6915k kVar = this.f24547g;
        if (kVar == null || kVar.mo7934u() != 0 || (textView = this.f24589K) == null) {
            this.f24589K.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* renamed from: W7 */
    public void mo7908W7() {
        CharSequence charSequence;
        ContactMgrUIBase.C6915k kVar = this.f24547g;
        if (kVar == null || kVar.mo7934u() <= 0) {
            setMMTitle(this.f24586H);
            return;
        }
        CharSequence charSequence2 = this.f24586H;
        int u = this.f24547g.mo7934u();
        if ((charSequence2 instanceof SpannableString) || (charSequence2 instanceof SpannableStringBuilder)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
            spannableStringBuilder.append('(').append(u + "").append(')');
            charSequence = spannableStringBuilder;
        } else {
            charSequence = charSequence2 + "(" + this.f24547g.mo7934u() + ")";
        }
        setMMTitle(charSequence);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnq;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C76243a5.class;
        int intExtra = getIntent().getIntExtra("BLOCK_LIST_TYPE", 0);
        this.f24584F = intExtra;
        if (intExtra == 1) {
            this.f24585G = ((C76243a5) C86312j.m106911c(cls)).mo13209Hv();
        } else if (intExtra == 2) {
            this.f24585G = ((C76243a5) C86312j.m106911c(cls)).mo13248yq();
        }
        if (this.f24585G == null) {
            finish();
        }
        super.onCreate(bundle);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f359411ks3);
        this.f24589K = textView;
        if (textView != null) {
            textView.setText(this.f24585G.mo13641c(this, true));
            ((C76243a5) C86312j.m106911c(cls)).mo13219S3(this.f24589K, new SpannableString(this.f24585G.mo13641c(this, true)));
        }
        int i = this.f24584F;
        if (i == 1) {
            this.f24556s = this.f24585G.mo13655q().toString();
        } else if (i == 2) {
            this.f24556s = this.f24585G.mo13646h().toString();
        }
        C14096e.m13447a(39);
        CharSequence f = this.f24585G.mo13644f();
        this.f24586H = f;
        setMMTitle(f);
        TextView textView2 = this.f24548h;
        if (textView2 != null) {
            textView2.setText(this.f24585G.mo13641c(this, true));
            ((C76243a5) C86312j.m106911c(cls)).mo13219S3(this.f24548h, new SpannableString(this.f24585G.mo13641c(this, true)));
        }
        setBackBtn(new C8605d(this));
        this.f24587I = this.f24585G.mo13650l();
        this.f24544d.clear();
        List<String> a = ContactBlackListHelper.m6942a();
        for (int i2 = 0; i2 < this.f24587I.size(); i2++) {
            FinderContact finderContact = this.f24587I.get(i2);
            if (finderContact != null) {
                if (!((ArrayList) a).contains(finderContact.username)) {
                    this.f24544d.add(finderContact.username);
                }
            }
        }
        mo7916T7();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.FinderBlockListUI", "onNotifyChange: event = " + i + " stg = " + mStorageEx + " obj = " + obj);
        if (i == 4) {
            mo7917U7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        this.f24543D.mo9468c();
        C11884l lVar = (C11884l) yVar;
        if (i == 0 && i2 == 0) {
            if (lVar.f34724g == 1) {
                if (!(lVar.mo11760j1() == null || lVar.mo11760j1().f138522e == null)) {
                    Iterator<C50327ly2> it = lVar.mo11760j1().f138522e.iterator();
                    while (it.hasNext()) {
                        C50327ly2 next = it.next();
                        C50194ky2 ky22 = next.f137716e;
                        if (ky22 != null && !Util.isNullOrNil(ky22.f137101d) && !this.f24544d.contains(next.f137716e.f137101d)) {
                            this.f24544d.add(next.f137716e.f137101d);
                        }
                    }
                }
                mo7917U7();
            }
            if (lVar.f34724g == 2) {
                if (!(lVar.mo11760j1() == null || lVar.mo11760j1().f138522e == null)) {
                    Iterator<C50327ly2> it4 = lVar.mo11760j1().f138522e.iterator();
                    while (it4.hasNext()) {
                        C50327ly2 next2 = it4.next();
                        C50194ky2 ky23 = next2.f137716e;
                        if (ky23 != null && !Util.isNullOrNil(ky23.f137101d) && this.f24544d.contains(next2.f137716e.f137101d)) {
                            this.f24544d.remove(next2.f137716e.f137101d);
                        }
                    }
                }
                mo7917U7();
            }
            if (this.f24588J.contains(yVar)) {
                this.f24588J.remove(yVar);
                if (this.f24588J.isEmpty()) {
                    mo7914R7();
                    mo7917U7();
                }
            }
        } else if (this.f24588J.contains(yVar)) {
            this.f24588J.remove(yVar);
            if (this.f24588J.isEmpty()) {
                mo7913Q7();
            }
            mo7917U7();
        }
        this.f24563z = false;
        this.f24540A = false;
    }
}
