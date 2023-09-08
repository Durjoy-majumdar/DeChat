package com.tencent.p014mm.p136ui.contact;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75921a;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI */
public class SelectContactsFromRangeUI extends MMBaseSelectContactUI implements C11385n {

    /* renamed from: C */
    public C74430c f218824C;

    /* renamed from: D */
    public C74432d f218825D;

    /* renamed from: E */
    public int f218826E;

    /* renamed from: F */
    public String f218827F;

    /* renamed from: G */
    public String[] f218828G;

    /* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI$a */
    public class C74428a implements MenuItem.OnMenuItemClickListener {
        public C74428a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectContactsFromRangeUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI$b */
    public class C74429b implements MenuItem.OnMenuItemClickListener {
        public C74429b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent();
            intent.putExtra("Select_Contact", Util.listToString(SelectContactsFromRangeUI.this.f218824C.f218835r, ","));
            SelectContactsFromRangeUI.this.setResult(-1, intent);
            SelectContactsFromRangeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI$c */
    public class C74430c extends C74526m1 {

        /* renamed from: n */
        public Cursor f218831n;

        /* renamed from: o */
        public HashMap<String, Integer> f218832o = new HashMap<>();

        /* renamed from: p */
        public SparseArray<String> f218833p = new SparseArray<>();

        /* renamed from: q */
        public String f218834q = "";

        /* renamed from: r */
        public List<String> f218835r = new LinkedList();

        /* renamed from: s */
        public int f218836s;

        /* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI$c$a */
        public class C74431a implements DialogInterface.OnClickListener {
            public C74431a(C74430c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C74430c(C74493g1 g1Var, int i) {
            super(g1Var, ContactBlackListHelper.m6942a(), true, false);
            this.f218836s = i;
            mo7853r();
        }

        public int getCount() {
            Cursor cursor = this.f218831n;
            int i = 0;
            if (cursor == null) {
                return 0;
            }
            int count = cursor.getCount();
            SparseArray<String> sparseArray = this.f218833p;
            if (sparseArray != null) {
                i = sparseArray.size();
            }
            return count + i;
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            if (this.f218833p.indexOfKey(i) >= 0) {
                C75957r rVar = new C75957r(i);
                rVar.f222731x = this.f218833p.get(i);
                return rVar;
            }
            int i2 = i;
            int i3 = 0;
            while (i3 <= this.f218833p.size()) {
                if (this.f218833p.indexOfKey(i2) >= 0) {
                    i3++;
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
            }
            int i4 = i - i3;
            if (this.f218831n.moveToPosition(i4)) {
                Log.m105919d("MicroMsg.SelectContactsFromRangeUI", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(this.f218831n);
                C75939h hVar = new C75939h(i);
                hVar.mo106181j(z1Var);
                if (C72996z1.m85820U5(z1Var.getUsername())) {
                    hVar.f222608e = false;
                    hVar.f222611h = false;
                    hVar.f222610g = false;
                    hVar.f222680F = true;
                } else {
                    hVar.f222608e = this.f219057f;
                    hVar.f222611h = this.f219058g;
                    hVar.f222680F = false;
                }
                return hVar;
            }
            Log.m105925i("MicroMsg.SelectContactsFromRangeUI", "create contact item error: position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
            return null;
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Log.m105924i("MicroMsg.SelectContactsFromRangeUI", "finish!");
            Cursor cursor = this.f218831n;
            if (cursor != null) {
                cursor.close();
                this.f218831n = null;
            }
        }

        /* renamed from: q */
        public int mo7852q(String str) {
            HashMap<String, Integer> hashMap = this.f218832o;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return -1;
            }
            return this.f218832o.get(str).intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
        }

        /* renamed from: r */
        public void mo7853r() {
            String[] strArr;
            Cursor cursor = this.f218831n;
            if (cursor != null) {
                cursor.close();
                this.f218831n = null;
            }
            this.f218832o.clear();
            this.f218833p.clear();
            if ((!"@all.contact.android".equals(SelectContactsFromRangeUI.this.f218827F) && !"@all.contact.without.chatroom.without.openim".equals(SelectContactsFromRangeUI.this.f218827F)) || ((strArr = SelectContactsFromRangeUI.this.f218828G) != null && strArr.length != 0)) {
                C86709a0.m107528h();
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                SelectContactsFromRangeUI selectContactsFromRangeUI = SelectContactsFromRangeUI.this;
                this.f218831n = Ni.mo69670S3(selectContactsFromRangeUI.f218828G, this.f218834q, selectContactsFromRangeUI.f218827F, "", this.f219096j);
                SelectContactsFromRangeUI selectContactsFromRangeUI2 = SelectContactsFromRangeUI.this;
                String[] v = C45628s0.m50804v(selectContactsFromRangeUI2.f218828G, selectContactsFromRangeUI2.f218827F, "", this.f218834q, this.f219096j);
                SelectContactsFromRangeUI selectContactsFromRangeUI3 = SelectContactsFromRangeUI.this;
                int[] t = C45628s0.m50800t(selectContactsFromRangeUI3.f218828G, selectContactsFromRangeUI3.f218827F, "", this.f219096j, this.f218834q);
                if (!(v == null || t == null)) {
                    int i = 0;
                    for (int i2 = 0; i2 < v.length; i2++) {
                        if (i2 < t.length) {
                            this.f218832o.put(v[i2], Integer.valueOf(t[i2] + i));
                            this.f218833p.put(t[i2] + i, v[i2]);
                            i++;
                        }
                    }
                }
                mo103564g();
                notifyDataSetChanged();
            }
        }

        /* renamed from: s */
        public void mo103462s(String str) {
            if (((LinkedList) this.f218835r).contains(str)) {
                ((LinkedList) this.f218835r).remove(str);
            } else if (((LinkedList) this.f218835r).size() >= this.f218836s) {
                C76879j.m92749t(SelectContactsFromRangeUI.this.getContext(), SelectContactsFromRangeUI.this.getString(C0966R.string.f7436g8, new Object[]{Integer.valueOf(this.f218836s)}), "", new C74431a(this));
                return;
            } else {
                ((LinkedList) this.f218835r).add(str);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI$d */
    public class C74432d extends C74498h1 {

        /* renamed from: j */
        public C74430c f218838j;

        public C74432d(SelectContactsFromRangeUI selectContactsFromRangeUI, C74493g1 g1Var, C74430c cVar) {
            super(g1Var, false, 0);
            this.f218838j = cVar;
        }

        public int getCount() {
            return this.f218838j.getCount();
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            return this.f218838j.mo7850h(i);
        }

        /* renamed from: q */
        public void mo96748q() {
            C74430c cVar = this.f218838j;
            if (!cVar.f218834q.equalsIgnoreCase("")) {
                cVar.f218834q = "";
            }
            cVar.mo7853r();
        }

        /* renamed from: r */
        public void mo63130r(String str, int[] iArr, boolean z) {
            C74430c cVar = this.f218838j;
            if (!cVar.f218834q.equalsIgnoreCase(str)) {
                cVar.f218834q = str;
            }
            cVar.mo7853r();
            C74498h1.C44878a aVar = this.f219051i;
            if (aVar != null) {
                aVar.mo62789t6(str, getCount(), true);
            }
        }
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        return (bVar instanceof C75939h) && this.f218826E != 16 && ((C75921a) bVar).f222600A.mo62846A3();
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return this.f218824C;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return this.f218825D;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return getString(C0966R.string.f7496hv);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            Log.m105925i("MicroMsg.SelectContactsFromRangeUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", Integer.valueOf(headerViewsCount), Integer.valueOf(i));
            return;
        }
        C75922b j2 = mo103379N7().getItem(headerViewsCount);
        if (j2 != null && (j2 instanceof C75939h)) {
            if (this.f218826E == 16 || !((C75921a) j2).f222600A.mo62846A3()) {
                String username = ((C75921a) j2).f222600A.getUsername();
                Log.m105925i("MicroMsg.SelectContactsFromRangeUI", "ClickUser=%s", username);
                this.f218824C.mo103462s(username);
                if (((LinkedList) this.f218824C.f218835r).size() > 0) {
                    updateOptionMenuText(1, getString(C0966R.string.a18) + "(" + ((LinkedList) this.f218824C.f218835r).size() + ")");
                    enableOptionMenu(1, true);
                } else {
                    updateOptionMenuText(1, getString(C0966R.string.a18));
                    enableOptionMenu(1, false);
                }
                if (mo103379N7() instanceof C74432d) {
                    mo103378K7();
                    hideVKB();
                }
                this.f218609h.mo100244d(username);
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f218826E = getIntent().getIntExtra("list_type", 0);
        this.f218827F = getIntent().getStringExtra("filter_type");
        this.f218828G = getIntent().getStringArrayExtra("already_select_contact");
        C74430c cVar = new C74430c(this, getIntent().getIntExtra("max_limit_num", 30));
        this.f218824C = cVar;
        cVar.f219057f = true;
        this.f218825D = new C74432d(this, this, this.f218824C);
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return true;
    }

    /* renamed from: e6 */
    public void mo64521e6(int i, String str) {
        if (i == 1) {
            this.f218824C.mo103462s(str);
            if (((LinkedList) this.f218824C.f218835r).size() > 0) {
                updateOptionMenuText(1, getString(C0966R.string.a18) + "(" + ((LinkedList) this.f218824C.f218835r).size() + ")");
                enableOptionMenu(1, true);
            } else {
                updateOptionMenuText(1, getString(C0966R.string.a18));
                enableOptionMenu(1, false);
            }
            if (mo103379N7() instanceof C74432d) {
                mo103378K7();
                hideVKB();
            }
        }
    }

    public Activity getActivity() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C74428a());
        addTextOptionMenu(1, getString(C0966R.string.a18), new C74429b(), (View.OnLongClickListener) null, this.f218826E == 16 ? MMActivityController.C73075r.RED : MMActivityController.C73075r.GREEN);
        enableOptionMenu(1, false);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, this);
    }

    public void onDestroy() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, this);
        this.f218824C.mo7851i();
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.SelectContactsFromRangeUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        return ((LinkedList) this.f218824C.f218835r).contains(((C75939h) bVar).f222602y);
    }
}
