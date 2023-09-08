package com.tencent.p014mm.p136ui.contact.privacy;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ke3.C88144b;
import nj3.C88989a;
import ob0.C117747y;
import r03.C47918a;
import s03.C13609i;
import te3.C52179yx;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI */
public class TopStorySettingVisibilityDetailUI extends ContactMgrUIBase {

    /* renamed from: F */
    public List<String> f24606F = new ArrayList();

    /* renamed from: G */
    public List<String> f24607G = new ArrayList();

    /* renamed from: H */
    public long f24608H;

    /* renamed from: I */
    public String f24609I;

    /* renamed from: J */
    public String f24610J;

    /* renamed from: K */
    public Set<C13609i> f24611K;

    /* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI$a */
    public class C6926a implements MenuItem.OnMenuItemClickListener {
        public C6926a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            TopStorySettingVisibilityDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI$b */
    public class C6927b implements Runnable {
        public C6927b() {
        }

        public void run() {
            Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact, cancel.");
            Iterator it = ((HashSet) TopStorySettingVisibilityDetailUI.this.f24611K).iterator();
            int i = 0;
            while (it.hasNext()) {
                C13609i iVar = (C13609i) it.next();
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(iVar);
                TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
                boolean z = true;
                if (i != ((HashSet) topStorySettingVisibilityDetailUI.f24611K).size() - 1) {
                    z = false;
                }
                topStorySettingVisibilityDetailUI.mo7947X7(iVar, z);
                i++;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI$c */
    public class C6928c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f24614d;

        public C6928c(List list) {
            this.f24614d = list;
        }

        public void run() {
            C86709a0.m107528h();
            String nullAs = Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "");
            for (int i = 0; i < this.f24614d.size(); i++) {
                String str = (String) this.f24614d.get(i);
                if (!Util.isNullOrNil((String) this.f24614d.get(i)) && !nullAs.equals(this.f24614d.get(i))) {
                    TopStorySettingVisibilityDetailUI.this.f24544d.remove(str);
                }
            }
            TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
            topStorySettingVisibilityDetailUI.f24540A = true;
            topStorySettingVisibilityDetailUI.mo7949Z7();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI$d */
    public class C6929d implements Runnable {
        public C6929d() {
        }

        public void run() {
            Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onRemoveContact, cancel.");
            Iterator it = ((HashSet) TopStorySettingVisibilityDetailUI.this.f24611K).iterator();
            int i = 0;
            while (it.hasNext()) {
                C13609i iVar = (C13609i) it.next();
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(iVar);
                TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = TopStorySettingVisibilityDetailUI.this;
                boolean z = true;
                if (i != ((HashSet) topStorySettingVisibilityDetailUI.f24611K).size() - 1) {
                    z = false;
                }
                topStorySettingVisibilityDetailUI.mo7947X7(iVar, z);
                i++;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.TopStorySettingVisibilityDetailUI$e */
    public class C6930e extends ContactMgrUIBase.C6915k {
        public C6930e(C74493g1 g1Var) {
            super(TopStorySettingVisibilityDetailUI.this, g1Var);
        }

        /* renamed from: v */
        public String mo7911v() {
            return TopStorySettingVisibilityDetailUI.this.f24608H == 1 ? "@tophistory.unlike.android" : "@tophistory.black.android";
        }
    }

    public TopStorySettingVisibilityDetailUI() {
        new HashSet();
        this.f24609I = "";
        this.f24610J = "";
        this.f24611K = new HashSet();
    }

    /* renamed from: H7 */
    public ContactMgrUIBase.C6915k mo7900H7(C74493g1 g1Var) {
        return new C6930e(g1Var);
    }

    /* renamed from: J7 */
    public void mo7902J7() {
        String listToString = Util.listToString(this.f24544d, ",");
        Intent intent = new Intent();
        intent.putExtra("titile", getString(C0966R.string.hm6));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219161b);
        intent.putExtra("always_select_contact", listToString);
        intent.putExtra("topstory_import_type", this.f24608H == 1 ? 1 : 2);
        C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    /* renamed from: K7 */
    public void mo7903K7() {
        Intent intent = new Intent(this, SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("titile", getResources().getString(C0966R.string.hm_));
        long j = this.f24608H;
        if (j == 1) {
            intent.putExtra("filter_type", "@tophistory.unlike.android");
        } else if (j == 2) {
            intent.putExtra("filter_type", "@tophistory.black.android");
        }
        mo7912P7(intent);
        startActivityForResult(intent, 2);
    }

    /* renamed from: L7 */
    public void mo7904L7(Intent intent, Context context) {
        ArrayList<String> stringsToList;
        Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact.");
        String stringExtra = intent.getStringExtra("Select_Contact");
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact %s", stringExtra);
        if (stringExtra != null && (stringsToList = Util.stringsToList(stringExtra.split(","))) != null) {
            String stringExtra2 = intent.getStringExtra("App_MsgId");
            C86709a0.m107528h();
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            String s = C75592q0.m90789s();
            if (Util.isNullOrNil(stringExtra2) || !stringExtra2.equals("fromSns")) {
                for (String next : stringsToList) {
                    if (!this.f24544d.contains(next) && !s.equals(next) && Ni.get(next).mo62927s3()) {
                        this.f24544d.add(next);
                    }
                }
            } else {
                for (String next2 : stringsToList) {
                    if (!this.f24544d.contains(next2) && !s.equals(next2)) {
                        Ni.get(next2).getClass();
                        this.f24544d.add(next2);
                    }
                }
            }
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact tagList = %s.", this.f24544d);
            this.f24563z = true;
            mo7949Z7();
            if (((HashSet) this.f24611K).size() > 0) {
                this.f24543D.mo9466a(new C6927b());
            }
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
        String stringExtra = intent.getStringExtra("Select_Contact");
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onRemoveContact %s", stringExtra);
        ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
        if (stringsToList != null) {
            this.f24543D.mo9467b(new C6928c(stringsToList), new C6929d());
        }
    }

    /* renamed from: W7 */
    public void mo7908W7() {
        ContactMgrUIBase.C6915k kVar = this.f24547g;
        if (kVar == null || kVar.mo7934u() <= 0) {
            setMMTitle(this.f24609I);
            return;
        }
        setMMTitle(this.f24609I + "(" + this.f24547g.mo7934u() + ")");
    }

    /* renamed from: X7 */
    public final void mo7947X7(C13609i iVar, boolean z) {
        Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus");
        if (iVar == null || iVar.f38565g == null || iVar.f38566h == null) {
            Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus， netScene is null.");
            return;
        }
        for (int i = 0; i < iVar.f38565g.size(); i++) {
            String str = iVar.f38565g.get(i);
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus，snsTagId is %s,  name is %s, .", Long.valueOf(this.f24608H), str);
                long j = this.f24608H;
                if (j == 1) {
                    if (iVar.f38566h.get(i).intValue() == 3) {
                        this.f24544d.remove(str);
                        this.f24606F.remove(str);
                    } else if (iVar.f38566h.get(i).intValue() == 4) {
                        this.f24544d.add(str);
                        this.f24606F.add(str);
                    }
                } else if (j == 2) {
                    if (iVar.f38566h.get(i).intValue() == 1) {
                        this.f24544d.remove(str);
                        this.f24606F.remove(str);
                    } else if (iVar.f38566h.get(i).intValue() == 2) {
                        this.f24544d.add(str);
                        this.f24606F.add(str);
                    }
                }
            }
        }
        mo7948Y7();
        mo7917U7();
        if (z) {
            mo7913Q7();
        }
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus, snsTamd5gName: %s, tagList: %s, origList : %s.", this.f24610J, this.f24544d, this.f24606F);
    }

    /* renamed from: Y7 */
    public final void mo7948Y7() {
        this.f24610J = this.f24609I + " " + Util.listToString(this.f24544d, ",");
        if (this.f24608H == 1) {
            C47918a.m53244b().f128580e.clear();
            C47918a.m53244b().f128580e.addAll(this.f24544d);
            C47918a.m53244b().mo72677d();
            return;
        }
        C47918a.m53244b().f128579d.clear();
        C47918a.m53244b().f128579d.addAll(this.f24544d);
        C47918a.m53244b().mo72676c();
    }

    /* renamed from: Z7 */
    public void mo7949Z7() {
        String str = this.f24609I + " " + Util.listToString(this.f24544d, ",");
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "writeNow newMd5 = %s, md5 = %s, origList = %s.", str, this.f24610J, this.f24606F);
        if (!str.equals(this.f24610J) || this.f24608H == 0) {
            mo7948Y7();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String next : this.f24544d) {
                if (!this.f24606F.contains(next)) {
                    arrayList.add(next);
                    if (this.f24608H == 1) {
                        arrayList2.add(3);
                    } else {
                        arrayList2.add(1);
                    }
                }
            }
            for (String next2 : this.f24606F) {
                if (!this.f24544d.contains(next2)) {
                    arrayList.add(next2);
                    if (this.f24608H == 1) {
                        arrayList2.add(4);
                    } else {
                        arrayList2.add(2);
                    }
                }
            }
            ((HashSet) this.f24611K).clear();
            int i = 0;
            while (i < arrayList.size()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i2 = 0;
                while (i < arrayList.size() && i2 < 50) {
                    arrayList3.add((String) arrayList.get(i));
                    arrayList4.add((Integer) arrayList2.get(i));
                    i++;
                    i2++;
                }
                ((HashSet) this.f24611K).add(new C13609i(arrayList3, arrayList4));
            }
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "batch doNetscene, size: %s", Integer.valueOf(((HashSet) this.f24611K).size()));
            this.f24606F.clear();
            this.f24606F.addAll(this.f24544d);
            if (((HashSet) this.f24611K).size() == 0) {
                this.f24543D.mo9468c();
                return;
            }
            Iterator it = ((HashSet) this.f24611K).iterator();
            while (it.hasNext()) {
                C86709a0.m107529k().f251779b.mo123460f((C13609i) it.next());
            }
        }
    }

    public void initView() {
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        setBackBtn(new C6926a());
    }

    public void onCreate(Bundle bundle) {
        this.f24608H = (long) getIntent().getIntExtra("k_topstory_type", 0);
        super.onCreate(bundle);
        if (this.f24608H == 1) {
            this.f24609I = getString(C0966R.string.hml);
        } else {
            this.f24609I = getString(C0966R.string.hm8);
        }
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, before md5: %s, tagList: %s, origList : %s.", this.f24610J, this.f24544d, this.f24606F);
        String stringExtra = getIntent().getStringExtra("k_topstory_user_list");
        if (!Util.isNullOrNil(stringExtra)) {
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
            this.f24606F = stringsToList;
            for (String next : stringsToList) {
                if (!Util.isNullOrNil(next) && !this.f24544d.contains(next)) {
                    this.f24544d.add(next);
                }
            }
        }
        ((ArrayList) this.f24607G).clear();
        C86709a0.m107528h();
        String nullAs = Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), "");
        long j = this.f24608H;
        if (j == 1) {
            Cursor b4 = C97625j3.m125812b().mo105907v().mo69687b4("@tophistory.unlike.android", "", (List<String>) null);
            while (b4.moveToNext()) {
                ((ArrayList) this.f24607G).add(b4.getString(b4.getColumnIndex("username")));
            }
            b4.close();
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, localContactTagList: %s.", this.f24607G);
            for (int i = 0; i < ((ArrayList) this.f24607G).size(); i++) {
                String str = (String) ((ArrayList) this.f24607G).get(i);
                if (!Util.isNullOrNil(str) && !this.f24544d.contains(str)) {
                    C45628s0.m50809x0(C97625j3.m125812b().mo105907v().get(str));
                    Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList tag no container db tagName: %s", str);
                }
            }
            for (int i2 = 0; i2 < this.f24544d.size(); i2++) {
                String str2 = this.f24544d.get(i2);
                if (!Util.isNullOrNil(str2)) {
                    C45628s0.m50791o0(C97625j3.m125812b().mo105907v().get(str2));
                    Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList db no container tag tagName: %s", str2);
                }
            }
            if (this.f24544d.contains(nullAs)) {
                this.f24544d.remove(nullAs);
                C45628s0.m50809x0(C97625j3.m125812b().mo105907v().get(nullAs));
            }
        } else if (j == 2) {
            Cursor b44 = C97625j3.m125812b().mo105907v().mo69687b4("@tophistory.black.android", "", (List<String>) null);
            while (b44.moveToNext()) {
                ((ArrayList) this.f24607G).add(b44.getString(b44.getColumnIndex("username")));
            }
            b44.close();
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, localContactTagList: %s.", this.f24607G);
            for (int i3 = 0; i3 < ((ArrayList) this.f24607G).size(); i3++) {
                String str3 = (String) ((ArrayList) this.f24607G).get(i3);
                if (!Util.isNullOrNil(str3) && !this.f24544d.contains(str3)) {
                    C45628s0.m50807w0(C97625j3.m125812b().mo105907v().get(str3));
                }
            }
            for (int i4 = 0; i4 < this.f24544d.size(); i4++) {
                String str4 = this.f24544d.get(i4);
                if (!Util.isNullOrNil(str4)) {
                    C45628s0.m50789n0(C97625j3.m125812b().mo105907v().get(str4));
                }
            }
            if (this.f24544d.contains(nullAs)) {
                this.f24544d.remove(nullAs);
                C45628s0.m50807w0(C97625j3.m125812b().mo105907v().get(nullAs));
            }
        }
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, after md5: %s, tagList: %s, origList : %s.", this.f24610J, this.f24544d, this.f24606F);
        initView();
        C86709a0.m107524d().mo123455a(2859, this);
        enableOptionMenu(false);
        this.f24610J = this.f24609I + " " + Util.listToString(this.f24544d, ",");
        if (this.f24608H == 1) {
            this.f24556s = getString(C0966R.string.hmj);
        } else {
            this.f24556s = getString(C0966R.string.hmk);
        }
        mo7916T7();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(2859, this);
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onNotifyChange, event: %s, stg: %s, obj: %s.", Integer.valueOf(i), mStorageEx, obj);
        if (i == 4) {
            mo7917U7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar instanceof C13609i) {
            C13609i iVar = (C13609i) yVar;
            boolean z = i == 0 && i2 == 0;
            if (z && (i3 = ((C52179yx) iVar.f38564f.f127056b.f127083a).BaseResponse.f135955d) != 0) {
                Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", Integer.valueOf(i3));
                z = false;
            }
            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", Boolean.valueOf(z));
            if (!z) {
                int i4 = iVar.f38567i + 1;
                iVar.f38567i = i4;
                Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd, netScene.retryTimes: %s.", Integer.valueOf(i4));
                if (iVar.f38567i < 2) {
                    C13609i iVar2 = new C13609i(iVar);
                    C86709a0.m107529k().f251779b.mo123460f(iVar2);
                    ((HashSet) this.f24611K).add(iVar2);
                } else {
                    mo7947X7(iVar, true);
                    Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd, isAddingContact: %s, isRemovingContact: %s.", Boolean.valueOf(this.f24563z), Boolean.valueOf(this.f24540A));
                }
            }
            if (((HashSet) this.f24611K).contains(yVar)) {
                ((HashSet) this.f24611K).remove(yVar);
                Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", Integer.valueOf(((HashSet) this.f24611K).size()));
                if (z) {
                    Log.m105924i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseSuccessContactStatus");
                    for (int i5 = 0; i5 < iVar.f38565g.size(); i5++) {
                        String str2 = iVar.f38565g.get(i5);
                        if (!Util.isNullOrNil(str2)) {
                            Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseSuccessContactStatus，snsTagId is %s,  name is %s, .", Long.valueOf(this.f24608H), str2);
                            long j = this.f24608H;
                            if (j == 1) {
                                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str2);
                                if (iVar.f38566h.get(i5).intValue() == 3) {
                                    C45628s0.m50791o0(z1Var);
                                } else if (iVar.f38566h.get(i5).intValue() == 4) {
                                    C45628s0.m50809x0(z1Var);
                                }
                            } else if (j == 2) {
                                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str2);
                                if (iVar.f38566h.get(i5).intValue() == 1) {
                                    C45628s0.m50789n0(z1Var2);
                                } else if (iVar.f38566h.get(i5).intValue() == 2) {
                                    C45628s0.m50807w0(z1Var2);
                                }
                            }
                        }
                    }
                    mo7917U7();
                    Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus, snsTamd5gName: %s, tagList: %s, origList : %s.", this.f24610J, this.f24544d, this.f24606F);
                }
                if (((HashSet) this.f24611K).isEmpty()) {
                    Log.m105925i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", " onSceneEnd, isEmpty, isAddingContact: %s, isRemovingContact: %s, succ : %s.", Boolean.valueOf(this.f24563z), Boolean.valueOf(this.f24540A), Boolean.valueOf(z));
                    this.f24543D.mo9468c();
                    this.f24540A = false;
                    this.f24563z = false;
                    if (z) {
                        mo7914R7();
                    }
                }
            }
        }
    }
}
