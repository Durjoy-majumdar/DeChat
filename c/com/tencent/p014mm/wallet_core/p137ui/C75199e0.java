package com.tencent.p014mm.wallet_core.p137ui;

import a11.C39479c;
import android.content.Context;
import android.util.SparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyExclusiveSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45613m2;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p240sx.C77807p;
import sx3.C110818d0;
import sx3.C77813z;

/* renamed from: com.tencent.mm.wallet_core.ui.e0 */
public final class C75199e0 extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: n */
    public C75200a f221235n;

    /* renamed from: o */
    public HashMap<String, Integer> f221236o;

    /* renamed from: p */
    public SparseArray<String> f221237p;

    /* renamed from: q */
    public final List<String> f221238q = new ArrayList();

    /* renamed from: r */
    public List<C75216g0> f221239r = new ArrayList();

    /* renamed from: s */
    public int f221240s;

    /* renamed from: com.tencent.mm.wallet_core.ui.e0$a */
    public static final class C75200a {

        /* renamed from: a */
        public boolean f221241a;

        /* renamed from: b */
        public String f221242b = "";

        /* renamed from: c */
        public String f221243c = "";
    }

    public C75199e0(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, C75200a aVar) {
        super((C74493g1) mMBaseSelectContactUI, list, z, z2, false);
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "create!");
        if (aVar != null) {
            this.f221235n = aVar;
        } else {
            this.f221235n = new C75200a();
        }
        C45613m2 mr = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        C75200a aVar2 = this.f221235n;
        C87412m.m108591d(aVar2);
        ((C44662n1) mr).mo69801SE(aVar2.f221243c);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        mo7853r();
    }

    public int getCount() {
        int size = this.f221239r.size();
        SparseArray<String> sparseArray = this.f221237p;
        return size + (sparseArray != null ? sparseArray.size() : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: gl3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.tencent.mm.wallet_core.ui.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: gl3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: gl3.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gl3.C75922b mo7850h(int r7) {
        /*
            r6 = this;
            android.util.SparseArray<java.lang.String> r0 = r6.f221237p
            gy3.C87412m.m108591d(r0)
            int r0 = r0.indexOfKey(r7)
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L_0x0032
            android.util.SparseArray<java.lang.String> r0 = r6.f221237p
            gy3.C87412m.m108591d(r0)
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r3 = "posHeaderMap!![position]"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.mm.wallet_core.ui.b0 r3 = new com.tencent.mm.wallet_core.ui.b0
            r3.<init>(r7)
            r3.f221228x = r0
            r3.f222606c = r2
            if (r7 != 0) goto L_0x002d
            int r7 = r6.f221240s
            if (r7 <= 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            r3.f221229y = r1
            goto L_0x00ad
        L_0x0032:
            r3 = r7
            r0 = 0
        L_0x0034:
            android.util.SparseArray<java.lang.String> r4 = r6.f221237p
            gy3.C87412m.m108591d(r4)
            int r4 = r4.size()
            if (r0 > r4) goto L_0x0050
            android.util.SparseArray<java.lang.String> r4 = r6.f221237p
            gy3.C87412m.m108591d(r4)
            int r4 = r4.indexOfKey(r3)
            if (r4 < 0) goto L_0x004c
            int r0 = r0 + 1
        L_0x004c:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x0034
        L_0x0050:
            int r0 = r7 - r0
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r2] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3[r1] = r4
            java.lang.String r4 = "MicroMsg.AlphabetContactAdapter"
            java.lang.String r5 = "create contact item position=%d | index=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r3)
            java.util.List<com.tencent.mm.wallet_core.ui.g0> r3 = r6.f221239r
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r0 = r3.get(r0)
            com.tencent.mm.wallet_core.ui.g0 r0 = (com.tencent.p014mm.wallet_core.p137ui.C75216g0) r0
            com.tencent.mm.storage.z1 r0 = r0.f221316b
            gl3.h r3 = new gl3.h
            r3.<init>(r7)
            r3.mo106181j(r0)
            com.tencent.mm.wallet_core.ui.e0$a r7 = r6.f221235n
            java.lang.String r7 = r7.f221243c
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x008c
            com.tencent.mm.wallet_core.ui.e0$a r7 = r6.f221235n
            java.lang.String r7 = r7.f221243c
            r3.f222620q = r7
        L_0x008c:
            java.lang.String r7 = r0.getUsername()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x009f
            r3.f222608e = r2
            r3.f222611h = r2
            r3.f222610g = r2
            r3.f222680F = r1
            goto L_0x00a9
        L_0x009f:
            boolean r7 = r6.f219057f
            r3.f222608e = r7
            boolean r7 = r6.f219058g
            r3.f222611h = r7
            r3.f222680F = r2
        L_0x00a9:
            r3.f222606c = r2
            r3.f222681G = r2
        L_0x00ad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.p137ui.C75199e0.mo7850h(int):gl3.b");
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "finish!");
        this.f221239r.clear();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
    }

    /* renamed from: k */
    public int mo103530k() {
        return 0;
    }

    /* renamed from: n */
    public boolean mo70169n(C75922b bVar) {
        C87412m.m108594g(bVar, "item");
        SparseArray<String> sparseArray = this.f221237p;
        C87412m.m108591d(sparseArray);
        return sparseArray.indexOfKey(bVar.f222605b + 1) >= 0;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C87412m.m108594g(mStorageEx, "stg");
        C87412m.m108594g(obj, "obj");
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "onNotifyChange evnet = " + i);
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "onNotifyChange stg = " + mStorageEx);
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "onNotifyChange obj = " + obj);
        C72996z1 W2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69674W2(obj.toString());
        if (W2 != null && W2.mo62927s3()) {
            mo7853r();
        }
    }

    /* renamed from: q */
    public int mo7852q(String str) {
        C87412m.m108594g(str, "header");
        int hashCode = str.hashCode();
        if (hashCode == -1010580210 ? str.equals("openIm") : !(hashCode == 8593 ? !str.equals("↑") : !(hashCode == 1772656 && str.equals("🔍")))) {
            return 0;
        }
        HashMap<String, Integer> hashMap = this.f221236o;
        if (hashMap == null) {
            return -1;
        }
        C87412m.m108591d(hashMap);
        if (!hashMap.containsKey(str)) {
            return -1;
        }
        HashMap<String, Integer> hashMap2 = this.f221236o;
        C87412m.m108591d(hashMap2);
        Integer num = hashMap2.get(str);
        C87412m.m108591d(num);
        return num.intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
    }

    /* renamed from: r */
    public void mo7853r() {
        int i;
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "resetData");
        this.f221239r.clear();
        this.f221238q.clear();
        HashMap<String, Integer> hashMap = this.f221236o;
        if (hashMap != null) {
            C87412m.m108591d(hashMap);
            hashMap.clear();
        } else {
            this.f221236o = new HashMap<>();
        }
        SparseArray<String> sparseArray = this.f221237p;
        if (sparseArray != null) {
            C87412m.m108591d(sparseArray);
            sparseArray.clear();
        } else {
            this.f221237p = new SparseArray<>();
        }
        C75200a aVar = this.f221235n;
        if (aVar.f221241a) {
            String str = null;
            List<String> stringToList = !Util.isNullOrNil(aVar.f221242b) ? Util.stringToList(this.f221235n.f221242b, ",") : null;
            if (!Util.isNullOrNil((List) stringToList)) {
                if (stringToList != null) {
                    this.f221239r.clear();
                    int size = stringToList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(stringToList.get(i2));
                        C44661m1 Lo = !Util.isNullOrNil(this.f221235n.f221243c) ? ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f221235n.f221243c) : null;
                        C87412m.m108593f(z1Var, "ct");
                        this.f221239r.add(new C75216g0(((C77807p) C86312j.m106911c(C77807p.class)).mo107760sD(0, z1Var, Lo), z1Var));
                    }
                }
                if (this.f221239r.size() > 0) {
                    C77813z.m93909o(this.f221239r, C75203f0.f221246d);
                    List<T> y0 = C110818d0.m150953y0(this.f221239r);
                    ArrayList arrayList = new ArrayList();
                    this.f221239r.clear();
                    int size2 = y0.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (C72996z1.m85843n5(((C75216g0) y0.get(i3)).f221316b.getUsername())) {
                            this.f221239r.add(y0.get(i3));
                        } else {
                            arrayList.add(y0.get(i3));
                        }
                    }
                    this.f221240s = this.f221239r.size();
                    this.f221239r = C110818d0.m150900B0(C110818d0.m150933e0(this.f221239r, arrayList));
                }
                this.f221238q.add("🔍");
                if (this.f221240s > 0) {
                    C74493g1 g1Var = this.f219055d;
                    C87412m.m108592e(g1Var, "null cannot be cast to non-null type android.content.Context");
                    String string = ((Context) g1Var).getString(C0966R.string.f8175sa);
                    C87412m.m108593f(string, "selectContactUI as Conte…oney_select_openim_title)");
                    mo105039s(0, string);
                    this.f221238q.add("openIm");
                    i = 1;
                } else {
                    i = 0;
                }
                int i4 = 0;
                for (C75216g0 next : this.f221239r) {
                    int i5 = i4 + 1;
                    int i6 = this.f221240s;
                    if (i4 < i6) {
                        i4 = i5;
                    } else {
                        String str2 = next.f221315a.f225225c;
                        if (i4 != i6 || str2 == null) {
                            if (!(str == null || C87412m.m108589b(str2, str) || str2 == null)) {
                                mo105039s(i4 + i, str2);
                                this.f221238q.add(str2);
                            }
                            i4 = i5;
                            str = str2;
                        } else {
                            mo105039s(i4 + i, str2);
                            this.f221238q.add(str2);
                        }
                        i++;
                        i4 = i5;
                        str = str2;
                    }
                }
            } else {
                this.f221239r.clear();
            }
        }
        if (this.f221238q.size() > 0) {
            C74493g1 g1Var2 = this.f219055d;
            C87412m.m108592e(g1Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI");
            LuckyMoneyExclusiveSelectContactUI luckyMoneyExclusiveSelectContactUI = (LuckyMoneyExclusiveSelectContactUI) g1Var2;
            Object[] array = this.f221238q.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            luckyMoneyExclusiveSelectContactUI.f199962I = strArr;
            AlphabetScrollBar alphabetScrollBar = luckyMoneyExclusiveSelectContactUI.f218606e;
            if (alphabetScrollBar != null) {
                alphabetScrollBar.setAlphabet(strArr);
            }
        }
        Log.m105925i("MicroMsg.AlphabetContactAdapter", "memberList:%d headerPosMap=%s", Integer.valueOf(this.f221239r.size()), String.valueOf(this.f221236o));
        mo103564g();
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public final void mo105039s(int i, String str) {
        Integer valueOf = Integer.valueOf(i);
        HashMap<String, Integer> hashMap = this.f221236o;
        C87412m.m108591d(hashMap);
        hashMap.put(str, valueOf);
        SparseArray<String> sparseArray = this.f221237p;
        C87412m.m108591d(sparseArray);
        sparseArray.put(i, str);
    }
}
