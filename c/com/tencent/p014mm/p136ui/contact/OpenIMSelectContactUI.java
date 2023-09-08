package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C44875c3;
import com.tencent.p014mm.p136ui.contact.SelectContactUI;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import gl3.C75921a;
import gl3.C75922b;
import gl3.C75973v;
import he0.C76158j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc3.C10485b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.contact.OpenIMSelectContactUI */
public class OpenIMSelectContactUI extends MMBaseSelectContactUI {

    /* renamed from: C */
    public String f218713C;

    /* renamed from: D */
    public String f218714D;

    /* renamed from: E */
    public List<String> f218715E;

    /* renamed from: F */
    public HashSet<String> f218716F;

    /* renamed from: G */
    public HashSet<String> f218717G;

    /* renamed from: H */
    public HashSet<String> f218718H;

    /* renamed from: I */
    public int f218719I;

    /* renamed from: J */
    public int f218720J;

    /* renamed from: K */
    public boolean f218721K = true;

    /* renamed from: L */
    public SelectContactUI.C74423s f218722L = new SelectContactUI.C74423s();

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f218716F.contains(str);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return new C44875c3(this.f218713C, this, this.f218715E, C74560s1.m89275d(this.f218720J, 64), (C44875c3.C44876a) null);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return new C74551q1(this, this.f218715E, C74560s1.m89275d(this.f218720J, 64), this.f218604A);
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        if (Util.isNullOrNil(this.f218714D)) {
            this.f218714D = ((C76158j) C86312j.m106911c(C76158j.class)).Rn0(this.f218713C, "openim_acct_type_title", C76158j.C8510a.TYPE_WORDING);
        }
        return this.f218714D;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        C75921a aVar;
        C72996z1 z1Var;
        int i2;
        int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
        int i3 = 0;
        if (headerViewsCount < 0) {
            Log.m105925i("OpenIMSelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", Integer.valueOf(headerViewsCount), Integer.valueOf(i));
            return;
        }
        C75922b j2 = mo103379N7().getItem(headerViewsCount);
        if (j2 != null && (j2 instanceof C75921a) && (z1Var = aVar.f222600A) != null && z1Var.mo73975s2() != 1) {
            String username = (aVar = (C75921a) j2).f222600A.getUsername();
            Log.m105925i("OpenIMSelectContactUI", "ClickUser=%s", username);
            if (C74560s1.m89275d(this.f218720J, 64)) {
                if (!C74560s1.m89275d(this.f218720J, 131072) || this.f218717G.size() < getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
                    if (!this.f218716F.contains(username)) {
                        mo103378K7();
                        MultiSelectContactView multiSelectContactView = this.f218609h;
                        if (multiSelectContactView != null) {
                            multiSelectContactView.mo100244d(username);
                        }
                        if (this.f218717G.contains(username)) {
                            this.f218717G.remove(username);
                        } else {
                            this.f218717G.add(username);
                        }
                    }
                } else if (!this.f218716F.contains(username)) {
                    mo103378K7();
                    if (this.f218717G.contains(username)) {
                        MultiSelectContactView multiSelectContactView2 = this.f218609h;
                        if (multiSelectContactView2 != null) {
                            multiSelectContactView2.mo100244d(username);
                        }
                        this.f218717G.remove(username);
                    } else {
                        String stringExtra = getIntent().getStringExtra("too_many_member_tip_string");
                        if (Util.isNullOrNil(stringExtra)) {
                            stringExtra = getString(C0966R.string.iiv, new Object[]{Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))});
                        }
                        C76879j.m92749t(getContext(), stringExtra, "", new C74484e3(this));
                    }
                }
                mo103418i8();
                if (this.f218721K && ((i2 = this.f218719I) == 1 || i2 == 0)) {
                    HashSet<String> hashSet = this.f218716F;
                    int size = hashSet != null ? hashSet.size() : 0;
                    HashSet<String> hashSet2 = this.f218717G;
                    if (hashSet2 != null) {
                        i3 = hashSet2.size();
                    }
                    this.f218722L.mo103452a(this, size + i3, Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChatRoomInviteStartCount")));
                }
                this.f218607f.notifyDataSetChanged();
                return;
            }
            mo103417g8(Util.stringsToList(new String[]{username}), new ArrayList(0));
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218713C = getIntent().getStringExtra("openim_appid");
        this.f218714D = getIntent().getStringExtra("titile");
        this.f218719I = getIntent().getIntExtra("list_type", -1);
        Intent intent = getIntent();
        C74560s1.m89276e();
        this.f218720J = intent.getIntExtra("list_attr", C74560s1.f219160a);
        this.f218715E = new ArrayList();
        this.f218717G = new HashSet<>();
        this.f218718H = new HashSet<>();
        this.f218716F = new HashSet<>();
        String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f218716F.addAll(Util.stringsToList(stringExtra.split(",")));
        }
        String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f218717G.addAll(Util.stringsToList(stringExtra2.split(",")));
            this.f218718H.addAll(this.f218717G);
        }
        HashSet hashSet = new HashSet();
        String stringExtra3 = getIntent().getStringExtra("block_contact");
        if (!Util.isNullOrNil(stringExtra3)) {
            hashSet.addAll(Util.stringsToList(stringExtra3.split(",")));
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet2.addAll(C74560s1.m89273b());
        hashSet2.addAll(C45628s0.m50776h());
        ((ArrayList) this.f218715E).addAll(hashSet2);
    }

    /* renamed from: U7 */
    public boolean mo103382U7() {
        return false;
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f218717G.remove(str);
            mo103379N7().notifyDataSetChanged();
            mo103418i8();
        }
    }

    /* renamed from: g8 */
    public final boolean mo103417g8(List<String> list, List<String> list2) {
        Log.m105925i("OpenIMSelectContactUI", "handleSelect %s, cancel %s", list, list2);
        Intent intent = new Intent();
        intent.putExtra("Select_Contact", Util.listToString(list, ","));
        intent.putExtra("Cancel_Select_Contact", Util.listToString(list2, ","));
        setResult(-1, intent);
        finish();
        return true;
    }

    /* renamed from: i8 */
    public final void mo103418i8() {
        if (!C74560s1.m89275d(this.f218720J, 64) || this.f218717G.size() <= 0) {
            updateOptionMenuText(1, getString(C0966R.string.f7929wj));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(C0966R.string.f7929wj) + "(" + this.f218717G.size() + ")");
        int intExtra = getIntent().getIntExtra("min_limit_num", 0);
        if (!C74560s1.m89275d(this.f218720J, 262144)) {
            enableOptionMenu(1, true);
        } else if (this.f218717G.size() >= intExtra) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C74560s1.m89275d(this.f218720J, 64)) {
            addTextOptionMenu(1, getString(C0966R.string.a18), new C74476d3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        }
        mo103418i8();
        Iterator<String> it = this.f218717G.iterator();
        while (it.hasNext()) {
            String next = it.next();
            MultiSelectContactView multiSelectContactView = this.f218609h;
            if (multiSelectContactView != null) {
                multiSelectContactView.mo100244d(next);
            }
        }
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        String str2;
        if (bVar.mo106184e() && (str2 = bVar.f222621r) != null) {
            return this.f218717G.contains(str2);
        }
        if (bVar.f222611h && (str = bVar.f222621r) != null) {
            return this.f218717G.contains(str);
        }
        if (bVar instanceof C75973v) {
            return this.f218717G.isEmpty();
        }
        return false;
    }
}
