package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import eb0.C45628s0;
import eb0.C75592q0;
import gl3.C75922b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import yf0.C79090a;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI */
public class AASelectContactUI extends MMBaseSelectContactUI {

    /* renamed from: V */
    public static final /* synthetic */ int f195986V = 0;

    /* renamed from: C */
    public int f195987C;

    /* renamed from: D */
    public String f195988D;

    /* renamed from: E */
    public String f195989E;

    /* renamed from: F */
    public ArrayList<String> f195990F;

    /* renamed from: G */
    public ArrayList<String> f195991G;

    /* renamed from: H */
    public HashSet<String> f195992H;

    /* renamed from: I */
    public HashSet<String> f195993I;

    /* renamed from: J */
    public long f195994J;

    /* renamed from: K */
    public CheckBox f195995K;

    /* renamed from: L */
    public View f195996L;

    /* renamed from: M */
    public List<String> f195997M;

    /* renamed from: N */
    public List<String> f195998N;

    /* renamed from: P */
    public int f195999P;

    /* renamed from: Q */
    public int f196000Q;

    /* renamed from: R */
    public int f196001R;

    /* renamed from: S */
    public ArrayList<String> f196002S = new ArrayList<>();

    /* renamed from: T */
    public ArrayList<String> f196003T = new ArrayList<>();

    /* renamed from: U */
    public HashMap<String, String> f196004U = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$a */
    public class C68178a extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$a$a */
        public class C68179a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ List f196006d;

            public C68179a(List list) {
                this.f196006d = list;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AASelectContactUI.m80594i8(AASelectContactUI.this, this.f196006d);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$a$b */
        public class C68180b implements DialogInterface.OnClickListener {
            public C68180b(C68178a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C68178a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            ArrayList arrayList;
            if (AASelectContactUI.this.f195995K.isChecked()) {
                AASelectContactUI aASelectContactUI = AASelectContactUI.this;
                HashSet<String> hashSet = aASelectContactUI.f195993I;
                if (hashSet != null) {
                    hashSet.clear();
                } else {
                    aASelectContactUI.f195993I = new HashSet<>();
                }
                AASelectContactUI.this.f195995K.setChecked(false);
                AASelectContactUI.this.mo103379N7().notifyDataSetChanged();
            } else {
                AASelectContactUI aASelectContactUI2 = AASelectContactUI.this;
                if (aASelectContactUI2.f195987C == 6) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = AASelectContactUI.this.f195991G.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    arrayList = arrayList2;
                } else if (!C45628s0.m50748M(aASelectContactUI2.f195988D)) {
                    AASelectContactUI aASelectContactUI3 = AASelectContactUI.this;
                    arrayList = aASelectContactUI3.mo93741j8(aASelectContactUI3.mo93742k8());
                } else {
                    arrayList = AASelectContactUI.this.f195997M;
                }
                AASelectContactUI aASelectContactUI4 = AASelectContactUI.this;
                if (((long) arrayList.size()) > aASelectContactUI4.f195994J) {
                    AppCompatActivity context = aASelectContactUI4.getContext();
                    AASelectContactUI aASelectContactUI5 = AASelectContactUI.this;
                    C76879j.m92750u(context, aASelectContactUI5.getString(C0966R.string.f7320cn, new Object[]{Long.valueOf(aASelectContactUI5.f195994J)}), "", new C68179a(arrayList), new C68180b(this));
                } else if (!aASelectContactUI4.mo93743l8() || arrayList.size() != 0) {
                    AASelectContactUI.m80594i8(AASelectContactUI.this, arrayList);
                } else {
                    C76912y0.m92767f(AASelectContactUI.this.getContext(), AASelectContactUI.this.getContext().getString(C0966R.string.myb));
                }
            }
            C115669n.INSTANCE.mo160131h(13721, 2, 6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$b */
    public class C68181b implements CompoundButton.OnCheckedChangeListener {
        public C68181b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AASelectContactUI aASelectContactUI = AASelectContactUI.this;
            int i = AASelectContactUI.f195986V;
            aASelectContactUI.mo93745n8();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$c */
    public class C68182c implements MenuItem.OnMenuItemClickListener {
        public C68182c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            long size = (long) AASelectContactUI.this.f195993I.size();
            AASelectContactUI aASelectContactUI = AASelectContactUI.this;
            if (size > aASelectContactUI.f195994J) {
                AppCompatActivity context = aASelectContactUI.getContext();
                AASelectContactUI aASelectContactUI2 = AASelectContactUI.this;
                C76879j.m92748s(context, aASelectContactUI2.getString(C0966R.string.g3r, new Object[]{Long.valueOf(aASelectContactUI2.f195994J)}), "");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(13721, 2, 8);
                nVar.mo160131h(13722, 3);
                return true;
            } else if (aASelectContactUI.f195993I.size() < 1) {
                C115669n.INSTANCE.mo160131h(13721, 2, 9);
                return true;
            } else {
                LinkedList linkedList = new LinkedList();
                if (AASelectContactUI.this.mo93743l8()) {
                    linkedList.addAll(AASelectContactUI.m80593g8(AASelectContactUI.this));
                } else {
                    linkedList.addAll(AASelectContactUI.this.f195993I);
                }
                String listToString = Util.listToString(linkedList, ",");
                AASelectContactUI aASelectContactUI3 = AASelectContactUI.this;
                aASelectContactUI3.setResult(-1, aASelectContactUI3.getIntent().putExtra("Select_Contact", listToString));
                AASelectContactUI.this.finish();
                AASelectContactUI.this.hideVKB();
                C115669n.INSTANCE.mo160131h(13721, 2, 8);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$d */
    public class C68183d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$d$a */
        public class C68184a implements DialogInterface.OnClickListener {
            public C68184a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AASelectContactUI aASelectContactUI = AASelectContactUI.this;
                if (((long) AASelectContactUI.this.f195993I.size()) > aASelectContactUI.f195994J) {
                    AppCompatActivity context = aASelectContactUI.getContext();
                    AASelectContactUI aASelectContactUI2 = AASelectContactUI.this;
                    C76879j.m92748s(context, aASelectContactUI2.getString(C0966R.string.g3r, new Object[]{Long.valueOf(aASelectContactUI2.f195994J)}), "");
                    C115669n.INSTANCE.mo160131h(13722, 3);
                    return;
                }
                LinkedList linkedList = new LinkedList();
                if (AASelectContactUI.this.mo93743l8()) {
                    linkedList.addAll(AASelectContactUI.m80593g8(AASelectContactUI.this));
                } else {
                    linkedList.addAll(AASelectContactUI.this.f195993I);
                }
                String listToString = Util.listToString(linkedList, ",");
                AASelectContactUI aASelectContactUI3 = AASelectContactUI.this;
                aASelectContactUI3.setResult(-1, aASelectContactUI3.getIntent().putExtra("Select_Contact", listToString));
                AASelectContactUI.this.finish();
                C115669n.INSTANCE.mo160131h(13721, 2, 11);
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$d$b */
        public class C68185b implements DialogInterface.OnClickListener {
            public C68185b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                AASelectContactUI.this.finish();
                C115669n.INSTANCE.mo160131h(13721, 2, 10);
            }
        }

        public C68183d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r11) {
            /*
                r10 = this;
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.HashSet<java.lang.String> r11 = r11.f195993I
                r0 = 0
                r1 = 1
                if (r11 == 0) goto L_0x00b2
                int r11 = r11.size()
                if (r11 <= 0) goto L_0x00b2
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.HashSet<java.lang.String> r11 = r11.f195993I
                int r11 = r11.size()
                long r2 = (long) r11
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                long r4 = r11.f195994J
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x00b2
                java.util.HashSet<java.lang.String> r11 = r11.f195993I
                int r11 = r11.size()
                if (r11 != r1) goto L_0x003c
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.HashSet<java.lang.String> r11 = r11.f195993I
                java.lang.String r2 = eb0.C75592q0.m90789s()
                boolean r11 = r11.contains(r2)
                if (r11 == 0) goto L_0x003c
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                r11.finish()
                goto L_0x00b7
            L_0x003c:
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.ArrayList<java.lang.String> r11 = r11.f195990F
                if (r11 == 0) goto L_0x007e
                int r11 = r11.size()
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.HashSet<java.lang.String> r2 = r2.f195993I
                int r2 = r2.size()
                if (r11 != r2) goto L_0x007e
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.HashSet<java.lang.String> r11 = r11.f195993I
                java.util.Iterator r11 = r11.iterator()
                r2 = 0
            L_0x0059:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r11.next()
                java.lang.String r3 = (java.lang.String) r3
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r4 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.ArrayList<java.lang.String> r4 = r4.f195990F
                boolean r3 = r4.contains(r3)
                if (r3 == 0) goto L_0x0072
                int r2 = r2 + 1
                goto L_0x0059
            L_0x0072:
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                java.util.HashSet<java.lang.String> r11 = r11.f195993I
                int r11 = r11.size()
                if (r2 != r11) goto L_0x007e
                r11 = 0
                goto L_0x007f
            L_0x007e:
                r11 = 1
            L_0x007f:
                if (r11 == 0) goto L_0x00ac
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r2 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                r11 = 2131820622(0x7f11004e, float:1.9273964E38)
                java.lang.String r3 = r2.getString(r11)
                r4 = 0
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                r5 = 2131820626(0x7f110052, float:1.9273972E38)
                java.lang.String r5 = r11.getString(r5)
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                r6 = 2131820625(0x7f110051, float:1.927397E38)
                java.lang.String r6 = r11.getString(r6)
                r7 = 0
                com.tencent.mm.plugin.aa.ui.AASelectContactUI$d$a r8 = new com.tencent.mm.plugin.aa.ui.AASelectContactUI$d$a
                r8.<init>()
                com.tencent.mm.plugin.aa.ui.AASelectContactUI$d$b r9 = new com.tencent.mm.plugin.aa.ui.AASelectContactUI$d$b
                r9.<init>()
                nj3.C76879j.m92709C(r2, r3, r4, r5, r6, r7, r8, r9)
                goto L_0x00b7
            L_0x00ac:
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                r11.finish()
                goto L_0x00b7
            L_0x00b2:
                com.tencent.mm.plugin.aa.ui.AASelectContactUI r11 = com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.this
                r11.finish()
            L_0x00b7:
                com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 13721(0x3599, float:1.9227E-41)
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r0] = r3
                r0 = 7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4[r1] = r0
                r11.mo160131h(r2, r4)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.C68183d.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AASelectContactUI$e */
    public class C68186e implements Runnable {
        public C68186e() {
        }

        public void run() {
            AASelectContactUI aASelectContactUI = AASelectContactUI.this;
            int i = AASelectContactUI.f195986V;
            aASelectContactUI.getContentView().findViewById(C0966R.C0970id.bpe).findViewById(C0966R.C0970id.h7o).sendAccessibilityEvent(128);
        }
    }

    /* renamed from: g8 */
    public static List m80593g8(AASelectContactUI aASelectContactUI) {
        aASelectContactUI.getClass();
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = aASelectContactUI.mo93741j8(aASelectContactUI.mo93742k8()).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (aASelectContactUI.f195993I.contains(next)) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    /* renamed from: i8 */
    public static void m80594i8(AASelectContactUI aASelectContactUI, List list) {
        HashSet<String> hashSet = aASelectContactUI.f195993I;
        if (hashSet != null) {
            hashSet.clear();
        } else {
            aASelectContactUI.f195993I = new HashSet<>();
        }
        aASelectContactUI.f195993I.addAll(list);
        aASelectContactUI.f195995K.setChecked(true);
        aASelectContactUI.mo103379N7().notifyDataSetChanged();
    }

    /* renamed from: D6 */
    public boolean mo7830D6(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f195992H.contains(str);
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        ArrayList arrayList;
        if (this.f195987C == 6) {
            return new C40392a0(this, this.f195991G);
        }
        String str = this.f195988D;
        ArrayList<String> k8 = mo93742k8();
        if (mo93743l8()) {
            arrayList = new ArrayList();
            arrayList.addAll(this.f196003T);
        } else {
            arrayList = new ArrayList();
        }
        return new C40393b0(this, str, k8, arrayList, mo93744m8());
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        ArrayList arrayList;
        if (this.f195987C == 6) {
            return new C40394c0(this, this.f195991G);
        }
        String str = this.f195988D;
        ArrayList<String> k8 = mo93742k8();
        if (mo93743l8()) {
            arrayList = new ArrayList();
            arrayList.addAll(this.f196003T);
        } else {
            arrayList = new ArrayList();
        }
        return new C40395d0(this, str, k8, arrayList, mo93744m8());
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return this.f195989E;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64517R7(android.widget.AdapterView<?> r4, android.view.View r5, int r6, long r7) {
        /*
            r3 = this;
            com.tencent.mm.ui.contact.i1 r4 = r3.mo103379N7()
            android.widget.ListView r5 = r3.f218605d
            int r5 = r5.getHeaderViewsCount()
            int r6 = r6 - r5
            gl3.b r5 = r4.getItem(r6)
            if (r5 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.String r6 = r5.f222621r
            if (r6 != 0) goto L_0x0017
            return
        L_0x0017:
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r0 = 0
            r8[r0] = r6
            java.lang.String r6 = "MicroMsg.AASelectContactUI"
            java.lang.String r1 = "ClickUser=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r8)
            java.lang.String r5 = r5.f222621r
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85843n5(r5)
            if (r6 == 0) goto L_0x002d
            goto L_0x0076
        L_0x002d:
            boolean r6 = r3.mo93743l8()
            if (r6 == 0) goto L_0x0056
            boolean r6 = r3.mo93744m8()
            if (r6 == 0) goto L_0x0056
            java.lang.String r6 = eb0.C75592q0.m90789s()
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0056
            androidx.appcompat.app.AppCompatActivity r6 = r3.getContext()
            androidx.appcompat.app.AppCompatActivity r8 = r3.getContext()
            r1 = 2131835478(0x7f113a56, float:1.9304096E38)
            java.lang.String r8 = r8.getString(r1)
            nj3.C76912y0.m92767f(r6, r8)
            goto L_0x0076
        L_0x0056:
            boolean r6 = r3.mo93743l8()
            if (r6 == 0) goto L_0x0078
            java.lang.String r6 = r3.f195988D
            boolean r6 = yf0.C79104i.m95670o(r6, r5)
            if (r6 != 0) goto L_0x0078
            androidx.appcompat.app.AppCompatActivity r6 = r3.getContext()
            androidx.appcompat.app.AppCompatActivity r8 = r3.getContext()
            r1 = 2131835480(0x7f113a58, float:1.93041E38)
            java.lang.String r8 = r8.getString(r1)
            nj3.C76912y0.m92767f(r6, r8)
        L_0x0076:
            r6 = 1
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r6 == 0) goto L_0x007c
            return
        L_0x007c:
            java.lang.String r6 = eb0.C75592q0.m90789s()
            boolean r6 = r5.equals(r6)
            r8 = 13721(0x3599, float:1.9227E-41)
            r1 = 2
            if (r6 == 0) goto L_0x009e
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r0] = r1
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r7] = r1
            r6.mo160131h(r8, r2)
            goto L_0x00b2
        L_0x009e:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r0] = r1
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r7] = r1
            r6.mo160131h(r8, r2)
        L_0x00b2:
            r3.mo103378K7()
            java.util.HashSet<java.lang.String> r6 = r3.f195993I
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L_0x00c3
            java.util.HashSet<java.lang.String> r6 = r3.f195993I
            r6.remove(r5)
            goto L_0x00c8
        L_0x00c3:
            java.util.HashSet<java.lang.String> r6 = r3.f195993I
            r6.add(r5)
        L_0x00c8:
            int r5 = r3.f195987C
            r6 = 6
            if (r5 != r6) goto L_0x00cf
            r5 = 1
            goto L_0x00d0
        L_0x00cf:
            r5 = 0
        L_0x00d0:
            if (r5 == 0) goto L_0x00d9
            java.util.ArrayList<java.lang.String> r5 = r3.f195991G
            int r5 = r5.size()
            goto L_0x00f6
        L_0x00d9:
            java.lang.String r5 = r3.f195988D
            boolean r5 = eb0.C45628s0.m50748M(r5)
            if (r5 != 0) goto L_0x00ee
            java.util.ArrayList r5 = r3.mo93742k8()
            java.util.ArrayList r5 = r3.mo93741j8(r5)
            int r5 = r5.size()
            goto L_0x00f6
        L_0x00ee:
            java.util.List<java.lang.String> r5 = r3.f195997M
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x00f6:
            java.util.HashSet<java.lang.String> r6 = r3.f195993I
            int r6 = r6.size()
            if (r6 != r5) goto L_0x0104
            android.widget.CheckBox r5 = r3.f195995K
            r5.setChecked(r7)
            goto L_0x0109
        L_0x0104:
            android.widget.CheckBox r5 = r3.f195995K
            r5.setChecked(r0)
        L_0x0109:
            r4.notifyDataSetChanged()
            r3.mo93745n8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.AASelectContactUI.mo64517R7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    /* renamed from: T7 */
    public void mo64518T7() {
        super.mo64518T7();
        this.f195987C = getIntent().getIntExtra("enter_scene", 1);
        this.f195991G = getIntent().getStringArrayListExtra("third_party_usernamelist");
        this.f195989E = getIntent().getStringExtra("titile");
        this.f195994J = getIntent().getLongExtra("max_select_num", 20);
        getIntent().getIntExtra("select_type", 1);
        this.f195988D = getIntent().getStringExtra("chatroomName");
        this.f195999P = getIntent().getIntExtra("enter_mode", 2);
        this.f196000Q = getIntent().getIntExtra("enter_sub_mode", 4);
        this.f196001R = getIntent().getIntExtra("group_solitatire_flag", 0);
        if (mo93743l8()) {
            this.f196002S = getIntent().getStringArrayListExtra("group_solitatire_username_list");
            this.f196003T = getIntent().getStringArrayListExtra("group_solitatire_desc_list");
            this.f196004U = new HashMap<>();
            ArrayList<String> arrayList = this.f196003T;
            if (arrayList != null && arrayList.size() > 0 && this.f196003T.size() == this.f196002S.size()) {
                for (int i = 0; i <= this.f196002S.size() - 1; i++) {
                    this.f196004U.put(this.f196002S.get(i), this.f196003T.get(i));
                }
            }
        }
        if (!C72996z1.m85820U5(this.f195988D)) {
            Log.m105924i("MicroMsg.AASelectContactUI", "is single chat");
        }
        this.f195993I = new HashSet<>();
        this.f195992H = new HashSet<>();
        this.f195990F = new ArrayList<>();
        this.f195998N = new ArrayList();
        this.f195997M = new ArrayList();
        if (C45628s0.m50748M(this.f195988D)) {
            ArrayList<String> k8 = mo93742k8();
            if (k8.size() > 0) {
                Iterator<String> it = k8.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (C72996z1.m85843n5(next)) {
                        ((ArrayList) this.f195998N).add(next);
                    } else {
                        ((ArrayList) this.f195997M).add(next);
                    }
                }
            }
        }
        String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f195992H.addAll(Arrays.asList(stringExtra.split(",")));
        }
        String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!Util.isNullOrNil(stringExtra2)) {
            ArrayList<String> stringsToList = Util.stringsToList(stringExtra2.split(","));
            if (mo93743l8()) {
                this.f195993I.addAll(mo93741j8(stringsToList));
            } else {
                this.f195993I.addAll(stringsToList);
            }
            mo93745n8();
        }
        this.f195990F.addAll(this.f195993I);
        this.f195995K = (CheckBox) findViewById(C0966R.C0970id.kqg);
        View findViewById = findViewById(C0966R.C0970id.kqh);
        this.f195996L = findViewById;
        findViewById.setOnClickListener(new C68178a());
        int size = this.f195987C == 6 ? this.f195991G.size() : !C45628s0.m50748M(this.f195988D) ? mo93741j8(mo93742k8()).size() : ((ArrayList) this.f195997M).size();
        if (this.f195993I.size() == 0 || this.f195993I.size() != size) {
            this.f195995K.setChecked(false);
        } else {
            this.f195995K.setChecked(true);
        }
        this.f195995K.setOnCheckedChangeListener(new C68181b());
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
            this.f195993I.remove(str);
            mo103379N7().notifyDataSetChanged();
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6268a6;
    }

    public void initView() {
        super.initView();
        addTextOptionMenu(1, getString(C0966R.string.a18), new C68182c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        mo93745n8();
        this.f218609h.setOnContactDeselectListener(this);
        setBackBtn(new C68183d());
        if (C45628s0.m50748M(this.f195988D)) {
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6269a7, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5286ay);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setMinimumHeight(C76577a.m92151b(getContext(), 44));
            linearLayout.setPadding(C76577a.m92151b(getContext(), 16), C76577a.m92151b(getContext(), 15), 0, C76577a.m92151b(getContext(), 8));
            View findViewById = inflate.findViewById(C0966R.C0970id.f5287az);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/aa/ui/AASelectContactUI", "addOpenIMTipsHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/aa/ui/AASelectContactUI", "addOpenIMTipsHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f218605d.addHeaderView(inflate, (Object) null, false);
        }
    }

    /* renamed from: j8 */
    public ArrayList<String> mo93741j8(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (mo93743l8()) {
            arrayList2.addAll(C79104i.m95666k(arrayList, this.f195988D, mo93744m8(), true));
        } else {
            arrayList2.addAll(mo93742k8());
        }
        return arrayList2;
    }

    /* renamed from: k8 */
    public final ArrayList<String> mo93742k8() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (mo93743l8()) {
            arrayList.addAll(this.f196002S);
        } else {
            arrayList.addAll(C79104i.m95664i(this.f195988D));
        }
        return arrayList;
    }

    /* renamed from: l8 */
    public final boolean mo93743l8() {
        return this.f196001R == 1;
    }

    /* renamed from: m8 */
    public final boolean mo93744m8() {
        return mo93743l8() && this.f195999P == 3 && this.f196000Q == 4;
    }

    /* renamed from: n1 */
    public String mo7833n1(C75922b bVar) {
        if (!mo93743l8() || bVar.f222621r == null || this.f196004U.size() <= 0) {
            return null;
        }
        return C79104i.m95665j(60, this.f196004U.get(bVar.f222621r));
    }

    /* renamed from: n8 */
    public final void mo93745n8() {
        if (this.f195993I.size() > 0) {
            enableOptionMenu(1, true);
            updateOptionMenuText(1, getString(C0966R.string.f7281bf, new Object[]{Integer.valueOf(this.f195993I.size())}));
        } else {
            enableOptionMenu(1, false);
            updateOptionMenuText(1, getString(C0966R.string.a18));
        }
        if (this.f195993I.size() == 1 && this.f195993I.contains(C75592q0.m90789s())) {
            enableOptionMenu(1, false);
        } else if (this.f195993I.size() == 0) {
            enableOptionMenu(1, false);
        } else {
            enableOptionMenu(1, true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f195992H.addAll(Util.stringsToList(stringExtra.split(",")));
        }
        getContentView().post(new C68186e());
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }

    /* renamed from: x7 */
    public boolean mo7834x7(C75922b bVar) {
        String str;
        if (!bVar.mo106184e() || (str = bVar.f222621r) == null) {
            return false;
        }
        return this.f195993I.contains(str);
    }
}
