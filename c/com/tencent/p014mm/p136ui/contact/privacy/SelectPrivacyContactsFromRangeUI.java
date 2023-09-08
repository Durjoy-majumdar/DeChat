package com.tencent.p014mm.p136ui.contact.privacy;

import a22.C0008d;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import d51.C7171c;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import hl3.C8606e;
import hl3.C8609f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI */
public class SelectPrivacyContactsFromRangeUI extends MMBaseSelectContactUI implements C11385n {

    /* renamed from: C */
    public C74547d f219120C;

    /* renamed from: D */
    public C74549e f219121D;

    /* renamed from: E */
    public int f219122E;

    /* renamed from: F */
    public String f219123F;

    /* renamed from: G */
    public String f219124G;

    /* renamed from: H */
    public String[] f219125H;

    /* renamed from: I */
    public String f219126I;

    /* renamed from: J */
    public View f219127J;

    /* renamed from: K */
    public ImageView f219128K;

    /* renamed from: L */
    public boolean f219129L;

    /* renamed from: M */
    public boolean f219130M;

    /* renamed from: N */
    public boolean f219131N = true;

    /* renamed from: P */
    public Set<String> f219132P = new HashSet();

    /* renamed from: Q */
    public Set<String> f219133Q = new HashSet();

    /* renamed from: R */
    public C8606e f219134R = new C8606e(this);

    /* renamed from: S */
    public boolean f219135S = false;

    /* renamed from: T */
    public boolean f219136T;

    /* renamed from: U */
    public boolean f219137U;

    /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$a */
    public class C74543a implements MenuItem.OnMenuItemClickListener {
        public C74543a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectPrivacyContactsFromRangeUI.this.hideVKB();
            SelectPrivacyContactsFromRangeUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$b */
    public class C74544b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$b$a */
        public class C74545a implements Runnable {
            public C74545a() {
            }

            public void run() {
                SelectPrivacyContactsFromRangeUI.m89235g8(SelectPrivacyContactsFromRangeUI.this);
                Intent intent = new Intent();
                intent.putExtra("Select_Contact", Util.listToString(SelectPrivacyContactsFromRangeUI.this.f219120C.f219146r, ","));
                SelectPrivacyContactsFromRangeUI.this.setResult(-1, intent);
                SelectPrivacyContactsFromRangeUI.this.finish();
            }
        }

        public C74544b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = SelectPrivacyContactsFromRangeUI.this;
            if (selectPrivacyContactsFromRangeUI.f219122E == 16) {
                C8606e eVar = selectPrivacyContactsFromRangeUI.f219134R;
                String stringExtra = selectPrivacyContactsFromRangeUI.getIntent().getStringExtra("privacy_del_tips");
                C74545a aVar = new C74545a();
                Context context = eVar.f27709a;
                C76879j.m92708B(context, stringExtra, "", context.getResources().getString(C0966R.string.f7438g_), eVar.f27709a.getResources().getString(C0966R.string.f7926wf), new C8609f(eVar, aVar), (DialogInterface.OnClickListener) null, C0966R.color.f2958ae);
                return true;
            }
            SelectPrivacyContactsFromRangeUI.m89235g8(selectPrivacyContactsFromRangeUI);
            Intent intent = new Intent();
            intent.putExtra("Select_Contact", Util.listToString(SelectPrivacyContactsFromRangeUI.this.f219120C.f219146r, ","));
            SelectPrivacyContactsFromRangeUI.this.setResult(-1, intent);
            SelectPrivacyContactsFromRangeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$c */
    public class C74546c implements View.OnClickListener {
        public C74546c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = SelectPrivacyContactsFromRangeUI.this;
            selectPrivacyContactsFromRangeUI.f219129L = !selectPrivacyContactsFromRangeUI.f219129L;
            selectPrivacyContactsFromRangeUI.mo103598j8();
            SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = SelectPrivacyContactsFromRangeUI.this;
            if (selectPrivacyContactsFromRangeUI2.f219129L) {
                Iterator it = ((HashSet) selectPrivacyContactsFromRangeUI2.f219133Q).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!((LinkedList) SelectPrivacyContactsFromRangeUI.this.f219120C.f219146r).contains(str)) {
                        ((LinkedList) SelectPrivacyContactsFromRangeUI.this.f219120C.f219146r).add(str);
                    }
                }
            } else {
                ((LinkedList) selectPrivacyContactsFromRangeUI2.f219120C.f219146r).clear();
            }
            SelectPrivacyContactsFromRangeUI.this.f219120C.notifyDataSetChanged();
            SelectPrivacyContactsFromRangeUI.this.mo103599k8();
            C117292a.m165361g(this, "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$d */
    public class C74547d extends C74526m1 {

        /* renamed from: n */
        public Cursor f219142n;

        /* renamed from: o */
        public HashMap<String, Integer> f219143o = new HashMap<>();

        /* renamed from: p */
        public SparseArray<String> f219144p = new SparseArray<>();

        /* renamed from: q */
        public String f219145q = "";

        /* renamed from: r */
        public List<String> f219146r = new LinkedList();

        /* renamed from: s */
        public int f219147s;

        /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$d$a */
        public class C74548a implements DialogInterface.OnClickListener {
            public C74548a(C74547d dVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C74547d(C74493g1 g1Var, int i) {
            super(g1Var, ContactBlackListHelper.m6942a(), true, false);
            this.f219147s = i;
            mo7853r();
        }

        public int getCount() {
            Cursor cursor = this.f219142n;
            int i = 0;
            if (cursor == null) {
                return 0;
            }
            int count = cursor.getCount();
            SparseArray<String> sparseArray = this.f219144p;
            if (sparseArray != null) {
                i = sparseArray.size();
            }
            return count + i;
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            C75939h hVar;
            if (this.f219144p.indexOfKey(i) >= 0) {
                C75957r rVar = new C75957r(i);
                rVar.f222731x = this.f219144p.get(i);
                return rVar;
            }
            int i2 = i;
            int i3 = 0;
            while (i3 <= this.f219144p.size()) {
                if (this.f219144p.indexOfKey(i2) >= 0) {
                    i3++;
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
            }
            int i4 = i - i3;
            if (this.f219142n.moveToPosition(i4)) {
                Log.m105919d("MicroMsg.SelectPrivacyContactsFromRangeUI", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(this.f219142n);
                C75939h hVar2 = new C75939h(i);
                hVar2.mo106181j(z1Var);
                if (C72996z1.m85820U5(z1Var.getUsername())) {
                    hVar2.f222608e = false;
                    hVar2.f222611h = false;
                    hVar2.f222610g = false;
                    hVar2.f222680F = true;
                } else {
                    hVar2.f222608e = mo103570o();
                    hVar2.f222611h = this.f219058g;
                    hVar2.f222680F = false;
                }
                if (SelectPrivacyContactsFromRangeUI.this.mo7830D6(hVar2)) {
                    ((LinkedList) SelectPrivacyContactsFromRangeUI.this.f219120C.f219146r).remove(z1Var.getUsername());
                }
                hVar = hVar2;
            } else {
                hVar = null;
            }
            hVar.f222608e = true;
            return hVar;
        }

        /* renamed from: i */
        public void mo7851i() {
            mo103564g();
            Log.m105924i("MicroMsg.SelectPrivacyContactsFromRangeUI", "finish!");
            Cursor cursor = this.f219142n;
            if (cursor != null) {
                cursor.close();
                this.f219142n = null;
            }
        }

        /* renamed from: o */
        public boolean mo103570o() {
            return !SelectPrivacyContactsFromRangeUI.this.f219130M;
        }

        /* renamed from: q */
        public int mo7852q(String str) {
            HashMap<String, Integer> hashMap = this.f219143o;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return -1;
            }
            return this.f219143o.get(str).intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
        }

        /* renamed from: r */
        public void mo7853r() {
            String[] strArr;
            Cursor cursor = this.f219142n;
            if (cursor != null) {
                cursor.close();
                this.f219142n = null;
            }
            this.f219143o.clear();
            this.f219144p.clear();
            if ((!"@all.contact.android".equals(SelectPrivacyContactsFromRangeUI.this.f219123F) && !"@all.contact.without.chatroom.without.openim".equals(SelectPrivacyContactsFromRangeUI.this.f219123F)) || ((strArr = SelectPrivacyContactsFromRangeUI.this.f219125H) != null && strArr.length != 0)) {
                C86709a0.m107528h();
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = SelectPrivacyContactsFromRangeUI.this;
                this.f219142n = Ni.mo69670S3(selectPrivacyContactsFromRangeUI.f219125H, this.f219145q, selectPrivacyContactsFromRangeUI.f219123F, "", this.f219096j);
                SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI2 = SelectPrivacyContactsFromRangeUI.this;
                String[] v = C45628s0.m50804v(selectPrivacyContactsFromRangeUI2.f219125H, selectPrivacyContactsFromRangeUI2.f219123F, "", this.f219145q, this.f219096j);
                SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI3 = SelectPrivacyContactsFromRangeUI.this;
                int[] t = C45628s0.m50800t(selectPrivacyContactsFromRangeUI3.f219125H, selectPrivacyContactsFromRangeUI3.f219123F, "", this.f219096j, this.f219145q);
                if (!(v == null || t == null)) {
                    int i = 0;
                    for (int i2 = 0; i2 < v.length; i2++) {
                        if (i2 < t.length) {
                            this.f219143o.put(v[i2], Integer.valueOf(t[i2] + i));
                            this.f219144p.put(t[i2] + i, v[i2]);
                            i++;
                        }
                    }
                }
                mo103564g();
                notifyDataSetChanged();
            }
        }

        /* renamed from: s */
        public void mo103605s(String str) {
            if (((LinkedList) this.f219146r).contains(str)) {
                ((LinkedList) this.f219146r).remove(str);
            } else if (((LinkedList) this.f219146r).size() >= this.f219147s) {
                C76879j.m92749t(SelectPrivacyContactsFromRangeUI.this.getContext(), SelectPrivacyContactsFromRangeUI.this.getString(C0966R.string.f7436g8, new Object[]{Integer.valueOf(this.f219147s)}), "", new C74548a(this));
                return;
            } else {
                ((LinkedList) this.f219146r).add(str);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$e */
    public class C74549e extends C74498h1 {

        /* renamed from: j */
        public C74547d f219149j;

        public C74549e(SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI, C74493g1 g1Var, C74547d dVar) {
            super(g1Var, false, 0);
            this.f219149j = dVar;
        }

        public int getCount() {
            return this.f219149j.getCount();
        }

        /* renamed from: h */
        public C75922b mo7850h(int i) {
            return this.f219149j.mo7850h(i);
        }

        /* renamed from: q */
        public void mo96748q() {
            C74547d dVar = this.f219149j;
            if (!dVar.f219145q.equalsIgnoreCase("")) {
                dVar.f219145q = "";
            }
            dVar.mo7853r();
        }

        /* renamed from: r */
        public void mo63130r(String str, int[] iArr, boolean z) {
            mo103564g();
            C74547d dVar = this.f219149j;
            if (!dVar.f219145q.equalsIgnoreCase(str)) {
                dVar.f219145q = str;
            }
            dVar.mo7853r();
            C74498h1.C44878a aVar = this.f219051i;
            if (aVar != null) {
                aVar.mo62789t6(str, getCount(), true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* renamed from: g8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m89235g8(com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI r8) {
        /*
            r8.getClass()
            com.tencent.mm.autogen.mmdata.rpt.ContactsAuthorityManageOperateLogStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ContactsAuthorityManageOperateLogStruct
            r0.<init>()
            java.lang.String r1 = r8.f219124G
            java.lang.String r2 = "@sns.black.android"
            boolean r1 = r2.equals(r1)
            r2 = 4
            r3 = 1
            r4 = 2
            r5 = 0
            r6 = 3
            if (r1 == 0) goto L_0x0019
            r2 = 2
            goto L_0x005f
        L_0x0019:
            java.lang.String r1 = r8.f219124G
            java.lang.String r7 = "@sns.unlike.android"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0025
            r2 = 2
            goto L_0x0070
        L_0x0025:
            java.lang.String r1 = r8.f219124G
            java.lang.String r7 = "@werun.black.android"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0032
            r1 = 5
            r2 = 5
            goto L_0x006c
        L_0x0032:
            java.lang.String r1 = r8.f219124G
            java.lang.String r7 = "@tophistory.black.android"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x003d
            goto L_0x005f
        L_0x003d:
            java.lang.String r1 = r8.f219124G
            java.lang.String r7 = "@tophistory.unlike.android"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0048
            goto L_0x0070
        L_0x0048:
            java.lang.String r1 = r8.f219124G
            java.lang.String r2 = "@finder.block.his.liked.android"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0054
            r2 = 3
            goto L_0x0070
        L_0x0054:
            java.lang.String r1 = r8.f219124G
            java.lang.String r2 = "@finder.block.my.liked.android"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0061
            r2 = 3
        L_0x005f:
            r4 = 1
            goto L_0x0070
        L_0x0061:
            java.lang.String r1 = r8.f219124G
            java.lang.String r2 = "@social.black.android"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x006e
            r2 = 1
        L_0x006c:
            r4 = 0
            goto L_0x0070
        L_0x006e:
            r4 = -1
            r2 = 0
        L_0x0070:
            long r1 = (long) r2
            r0.f9655e = r1
            int r1 = r8.f219122E
            r2 = 16
            if (r1 == r2) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r3 == 0) goto L_0x0080
            r1 = 1
            goto L_0x0082
        L_0x0080:
            r1 = 2
        L_0x0082:
            r0.f9654d = r1
            long r1 = (long) r4
            r0.f9656f = r1
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r2 = "privacy_menu_enter_type"
            int r1 = r1.getIntExtra(r2, r5)
            long r1 = (long) r1
            r0.f9657g = r1
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r2 = "privacy_select_chatroom_or_lebal_count"
            int r1 = r1.getIntExtra(r2, r5)
            long r1 = (long) r1
            r0.f9658h = r1
            com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$d r1 = r8.f219120C
            android.database.Cursor r1 = r1.f219142n
            if (r1 == 0) goto L_0x00ac
            int r1 = r1.getCount()
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            java.util.Set<java.lang.String> r2 = r8.f219132P
            java.util.HashSet r2 = (java.util.HashSet) r2
            int r2 = r2.size()
            int r1 = r1 - r2
            long r1 = (long) r1
            r0.f9659i = r1
            com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$d r1 = r8.f219120C
            java.util.List<java.lang.String> r1 = r1.f219146r
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            long r1 = (long) r1
            r0.f9661k = r1
            com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI$d r8 = r8.f219120C
            android.database.Cursor r8 = r8.f219142n
            if (r8 == 0) goto L_0x00d0
            int r5 = r8.getCount()
        L_0x00d0:
            long r1 = (long) r5
            r0.f9660j = r1
            r0.mo86054n()
            u73.C22613h1.m26490p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI.m89235g8(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = ((gl3.C75939h) r4).f222600A;
     */
    /* renamed from: D6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7830D6(gl3.C75922b r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof gl3.C75939h
            r1 = 0
            if (r0 == 0) goto L_0x0018
            gl3.h r4 = (gl3.C75939h) r4
            com.tencent.mm.storage.z1 r4 = r4.f222600A
            if (r4 == 0) goto L_0x0018
            int r0 = r3.f219122E
            r2 = 16
            if (r0 == r2) goto L_0x0018
            boolean r4 = r3.mo103597i8(r4)
            if (r4 == 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI.mo7830D6(gl3.b):boolean");
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        return this.f219120C;
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        return this.f219121D;
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return Util.isNullOrNil(this.f219126I) ? getString(C0966R.string.f7496hv) : this.f219126I;
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        int headerViewsCount = i - this.f218605d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            Log.m105925i("MicroMsg.SelectPrivacyContactsFromRangeUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", Integer.valueOf(headerViewsCount), Integer.valueOf(i));
            return;
        }
        C75922b j2 = mo103379N7().getItem(headerViewsCount);
        if (j2 != null && (j2 instanceof C75939h) && !mo7830D6(j2)) {
            String str = j2.f222621r;
            Log.m105925i("MicroMsg.SelectPrivacyContactsFromRangeUI", "ClickUser=%s", str);
            this.f219120C.mo103605s(str);
            mo103599k8();
            if (mo103379N7() instanceof C74549e) {
                mo103378K7();
                hideVKB();
            }
            if (this.f219137U) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_Scene", 3);
                intent.putExtra("key_label_click_source", getIntent().getIntExtra("key_label_click_source", 0));
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                if (!Util.isNullOrNil(str)) {
                    C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                }
            }
        }
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        boolean z = false;
        this.f219122E = getIntent().getIntExtra("list_type", 0);
        this.f219123F = getIntent().getStringExtra("filter_type");
        this.f219125H = getIntent().getStringArrayExtra("already_select_contact");
        int intExtra = getIntent().getIntExtra("max_limit_num", 100);
        this.f219124G = getIntent().getStringExtra("privacy_source_type");
        this.f219120C = new C74547d(this, intExtra);
        boolean booleanExtra = getIntent().getBooleanExtra("only_show_contact", false);
        this.f219130M = booleanExtra;
        this.f219120C.f219057f = !booleanExtra;
        if (booleanExtra) {
            this.f219131N = false;
        }
        if (!booleanExtra && ("@all.contact.android".equals(this.f219123F) || "@all.contact.without.chatroom.without.openim".equals(this.f219123F))) {
            C44668u3 Jx0 = C94866e1.Jx0();
            String[] strArr = this.f219125H;
            if (strArr != null && strArr.length != 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (Jx0.get(strArr[i]).mo62927s3()) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.f219135S = !z;
        }
        C74549e eVar = new C74549e(this, this, this.f219120C);
        this.f219121D = eVar;
        eVar.f219057f = true;
        this.f219120C.notifyDataSetChanged();
    }

    /* renamed from: U7 */
    public boolean mo103382U7() {
        return this.f219131N;
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
        if (i == 1 && str != null) {
            this.f219120C.mo103605s(str);
            mo103599k8();
            this.f219120C.notifyDataSetChanged();
        }
    }

    public Activity getActivity() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: i8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo103597i8(com.tencent.p014mm.storage.C72996z1 r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x00d9
            int r2 = r5.f219122E
            r3 = 16
            if (r2 == r3) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@sns.black.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0021
            if (r2 == 0) goto L_0x00d9
            boolean r6 = r6.mo62943y3()
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x0021:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@sns.unlike.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x00d9
            int r6 = r6.getType()
            r2 = 1048576(0x100000, float:1.469368E-39)
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0038
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x003d:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@werun.black.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0059
            if (r2 == 0) goto L_0x00d9
            int r6 = r6.getType()
            r2 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0054
            r6 = 1
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x0059:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@tophistory.black.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0075
            if (r2 == 0) goto L_0x00d9
            int r6 = r6.getType()
            r2 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 & r2
            if (r6 == 0) goto L_0x0070
            r6 = 1
            goto L_0x0071
        L_0x0070:
            r6 = 0
        L_0x0071:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x0075:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@tophistory.unlike.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0090
            if (r2 == 0) goto L_0x00d9
            int r6 = r6.getType()
            r2 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r2
            if (r6 == 0) goto L_0x008c
            r6 = 1
            goto L_0x008d
        L_0x008c:
            r6 = 0
        L_0x008d:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x0090:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@social.black.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00a3
            if (r2 == 0) goto L_0x00d9
            boolean r6 = r6.mo62846A3()
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00a3:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@finder.block.his.liked.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00be
            if (r2 == 0) goto L_0x00d9
            int r6 = r6.getType()
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r6 = r6 & r2
            if (r6 == 0) goto L_0x00ba
            r6 = 1
            goto L_0x00bb
        L_0x00ba:
            r6 = 0
        L_0x00bb:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00be:
            java.lang.String r3 = r5.f219124G
            java.lang.String r4 = "@finder.block.my.liked.android"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00d9
            int r6 = r6.getType()
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 & r2
            if (r6 == 0) goto L_0x00d5
            r6 = 1
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            if (r6 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r0 = 0
        L_0x00da:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.privacy.SelectPrivacyContactsFromRangeUI.mo103597i8(com.tencent.mm.storage.z1):boolean");
    }

    /* renamed from: j8 */
    public final void mo103598j8() {
        if (this.f219129L) {
            C7171c.m7371a(this.f219128K, "checkbox_cell_on");
        } else {
            C7171c.m7371a(this.f219128K, "checkbox_cell_off");
        }
    }

    /* renamed from: k8 */
    public final void mo103599k8() {
        if (!this.f219130M) {
            if (((LinkedList) this.f219120C.f219146r).size() > 0) {
                updateOptionMenuText(1, getString(C0966R.string.f8014z_) + "(" + ((LinkedList) this.f219120C.f219146r).size() + ")");
                enableOptionMenu(1, true);
            } else {
                updateOptionMenuText(1, getString(C0966R.string.f8014z_));
                enableOptionMenu(1, false);
            }
            if (this.f219136T) {
                int size = ((LinkedList) this.f219120C.f219146r).size();
                Cursor cursor = this.f219120C.f219142n;
                if (size == (cursor != null ? cursor.getCount() : 0)) {
                    if (!this.f219129L) {
                        this.f219129L = true;
                        mo103598j8();
                    }
                } else if (this.f219129L) {
                    this.f219129L = false;
                    mo103598j8();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f219126I = getIntent().getStringExtra("titile");
        this.f219137U = getIntent().getBooleanExtra("can_go_to_profile", false);
        setMMTitle(mo64516Q7());
        setBackBtn(new C74543a());
        if (!this.f219130M) {
            addTextOptionMenu(1, getString(C0966R.string.f8014z_), new C74544b(), (View.OnLongClickListener) null, this.f219122E == 16 ? MMActivityController.C73075r.RED : MMActivityController.C73075r.GREEN);
            enableOptionMenu(1, false);
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, this);
        boolean booleanExtra = getIntent().getBooleanExtra("need_show_all_selected", false);
        this.f219136T = booleanExtra;
        if (booleanExtra) {
            View findViewById = findViewById(C0966R.C0970id.b_a);
            this.f219127J = findViewById;
            ImageView imageView = (ImageView) findViewById.findViewById(C0966R.C0970id.b__);
            this.f219128K = imageView;
            imageView.setVisibility(0);
            this.f219129L = true;
            mo103598j8();
            this.f219127J.setOnClickListener(new C74546c());
            if (!this.f219135S) {
                C86709a0.m107528h();
                Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3(this.f219125H, "", this.f219123F, "", new ArrayList());
                if (S3 != null) {
                    S3.moveToFirst();
                    while (!S3.isAfterLast()) {
                        C72996z1 z1Var = new C72996z1();
                        z1Var.convertFrom(S3);
                        if (!mo103597i8(z1Var)) {
                            ((HashSet) this.f219133Q).add(z1Var.getUsername());
                        } else {
                            ((HashSet) this.f219132P).add(z1Var.getUsername());
                        }
                        S3.moveToNext();
                    }
                    S3.close();
                }
                ((LinkedList) this.f219120C.f219146r).addAll(this.f219133Q);
                mo103599k8();
            }
        } else {
            View findViewById2 = findViewById(C0966R.C0970id.b_a);
            this.f219127J = findViewById2;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/privacy/SelectPrivacyContactsFromRangeUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (getIntent().getIntExtra("last_page_source_type", 0) == 1) {
            C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 5, 0, 0, 0);
        }
    }

    public void onDestroy() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, this);
        this.f219120C.mo7851i();
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.SelectPrivacyContactsFromRangeUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        if (!(bVar instanceof C75939h)) {
            return false;
        }
        return ((LinkedList) this.f219120C.f219146r).contains(((C75939h) bVar).f222602y);
    }
}
