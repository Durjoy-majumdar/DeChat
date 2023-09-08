package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import android.util.SparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import gl3.C75973v;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.u */
public class C74568u extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public int f219181A;

    /* renamed from: B */
    public boolean f219182B;

    /* renamed from: C */
    public boolean f219183C;

    /* renamed from: D */
    public List<String> f219184D;

    /* renamed from: E */
    public List<String> f219185E;

    /* renamed from: F */
    public C74592y f219186F;

    /* renamed from: n */
    public C74572v f219187n;

    /* renamed from: o */
    public int f219188o;

    /* renamed from: p */
    public int f219189p;

    /* renamed from: q */
    public int f219190q;

    /* renamed from: r */
    public int f219191r;

    /* renamed from: s */
    public int f219192s;

    /* renamed from: t */
    public int f219193t;

    /* renamed from: u */
    public int f219194u;

    /* renamed from: v */
    public int f219195v;

    /* renamed from: w */
    public int f219196w;

    /* renamed from: x */
    public HashMap<String, Integer> f219197x;

    /* renamed from: y */
    public SparseArray<String> f219198y;

    /* renamed from: z */
    public Cursor f219199z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74568u(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, List<String> list2, List<String> list3, boolean z, boolean z2, C74572v vVar, boolean z3, boolean z4, boolean z5) {
        super((C74493g1) mMBaseSelectContactUI, list3, z, z2, z3);
        C74572v vVar2 = vVar;
        this.f219188o = Integer.MAX_VALUE;
        this.f219189p = Integer.MAX_VALUE;
        this.f219190q = Integer.MAX_VALUE;
        this.f219191r = Integer.MAX_VALUE;
        this.f219192s = Integer.MAX_VALUE;
        this.f219193t = Integer.MAX_VALUE;
        this.f219194u = Integer.MAX_VALUE;
        this.f219195v = Integer.MAX_VALUE;
        this.f219196w = Integer.MAX_VALUE;
        this.f219197x = null;
        this.f219198y = null;
        this.f219181A = 0;
        this.f219182B = false;
        this.f219183C = false;
        this.f219186F = new C74592y();
        this.f219182B = z4;
        this.f219183C = z5;
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "create!");
        if (vVar2 != null) {
            this.f219187n = vVar2;
        } else {
            this.f219187n = new C74572v();
        }
        this.f219185E = list;
        this.f219184D = list2;
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        mo7853r();
    }

    public int getCount() {
        int count = this.f219199z.getCount();
        SparseArray<String> sparseArray = this.f219198y;
        return count + (sparseArray == null ? 0 : sparseArray.size());
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (i == this.f219196w) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.ij6));
        }
        if (i == this.f219188o) {
            return mo103622s(i, this.f219187n.f219217n);
        }
        if (i == this.f219189p) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.iis));
        }
        if (i == this.f219190q) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.f361256ij2));
        }
        if (i == this.f219191r) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.f361257ij3));
        }
        if (i == this.f219192s) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.iik));
        }
        if (i == this.f219193t) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.f7421ft));
        }
        if (i == this.f219194u) {
            return mo103622s(i, this.f219055d.getActivity().getString(C0966R.string.iiz));
        }
        if (i == this.f219195v) {
            return new C75973v(i);
        }
        if (this.f219198y.indexOfKey(i) >= 0) {
            return mo103622s(i, this.f219198y.get(i));
        }
        int i2 = i;
        int i3 = 0;
        while (i3 <= this.f219198y.size()) {
            if (this.f219198y.indexOfKey(i2) >= 0) {
                i3++;
            }
            i2--;
            if (i2 < 0) {
                break;
            }
        }
        int i4 = i - i3;
        if (this.f219199z.moveToPosition(i4)) {
            Log.m105919d("MicroMsg.AlphabetContactAdapter", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(this.f219199z);
            C75939h hVar = new C75939h(i);
            hVar.mo106181j(z1Var);
            if (!Util.isNullOrNil(this.f219187n.f219219p)) {
                hVar.f222620q = this.f219187n.f219219p;
            }
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
            hVar.f222606c = this.f219182B;
            hVar.f222681G = this.f219183C;
            return hVar;
        }
        Log.m105925i("MicroMsg.AlphabetContactAdapter", "create contact item error: position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
        return null;
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "finish!");
        Cursor cursor = this.f219199z;
        if (cursor != null) {
            cursor.close();
            this.f219199z = null;
        }
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
    }

    /* renamed from: k */
    public int mo103530k() {
        return this.f219181A;
    }

    /* renamed from: n */
    public boolean mo70169n(C75922b bVar) {
        int i = bVar.f222605b + 1;
        int[] iArr = {this.f219196w, this.f219188o, this.f219189p, this.f219190q, this.f219191r, this.f219192s, this.f219193t, this.f219194u};
        for (int i2 = 0; i2 < 8; i2++) {
            if (i == iArr[i2]) {
                return true;
            }
        }
        return this.f219198y.indexOfKey(i) >= 0;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.AlphabetContactAdapter", "onNotifyChange evnet = " + i);
        if (mStorageEx != null) {
            Log.m105924i("MicroMsg.AlphabetContactAdapter", "onNotifyChange stg = " + mStorageEx.toString());
        }
        if (obj != null) {
            Log.m105924i("MicroMsg.AlphabetContactAdapter", "onNotifyChange obj = " + obj.toString());
        }
        if (obj != null) {
            C86709a0.m107528h();
            C72996z1 W2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69674W2(obj.toString());
            if (W2 != null && W2.mo62927s3()) {
                mo7853r();
            }
        }
    }

    /* renamed from: q */
    public int mo7852q(String str) {
        if (str.equals("↑")) {
            return 0;
        }
        HashMap<String, Integer> hashMap = this.f219197x;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return this.f219197x.get(str).intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025c  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7853r() {
        /*
            r22 = this;
            r0 = r22
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            java.lang.String r2 = "MicroMsg.AlphabetContactAdapter"
            java.lang.String r3 = "resetData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.database.Cursor r3 = r0.f219199z
            r4 = 0
            if (r3 == 0) goto L_0x0015
            r3.close()
            r0.f219199z = r4
        L_0x0015:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.f219188o = r3
            r0.f219189p = r3
            r0.f219190q = r3
            r0.f219191r = r3
            r0.f219192s = r3
            r0.f219193t = r3
            r0.f219194u = r3
            r0.f219196w = r3
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f219197x
            if (r5 == 0) goto L_0x0030
            r5.clear()
            goto L_0x0037
        L_0x0030:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f219197x = r5
        L_0x0037:
            android.util.SparseArray<java.lang.String> r5 = r0.f219198y
            if (r5 == 0) goto L_0x003f
            r5.clear()
            goto L_0x0046
        L_0x003f:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r0.f219198y = r5
        L_0x0046:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.tencent.mm.ui.contact.v r6 = r0.f219187n
            boolean r7 = r6.f219209f
            java.lang.String r8 = "@all.contact.without.chatroom.without.openim.without.openimfavour"
            java.lang.String r9 = "☆"
            java.lang.String r10 = ","
            r11 = 0
            r12 = 1
            if (r7 == 0) goto L_0x0136
            java.lang.String r4 = r6.f219213j
            java.util.List r4 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r4, r10)
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0099
            f40.C86709a0.m107528h()
            k40.a r6 = f40.C86709a0.m107533q(r1)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            android.database.Cursor r4 = r6.mo69708j4(r4, r11)
            r5.add(r4)
            int r4 = r4.getCount()
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6[r11] = r7
            java.lang.String r7 = "sport recent like count %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r7, r6)
            if (r4 <= 0) goto L_0x0096
            r0.f219196w = r11
            int r4 = r4 + r12
            int r4 = r4 + r11
            r0.mo103623t(r11, r9)
            goto L_0x009c
        L_0x0096:
            r0.f219196w = r3
            goto L_0x009b
        L_0x0099:
            r0.f219196w = r3
        L_0x009b:
            r4 = 0
        L_0x009c:
            com.tencent.mm.ui.contact.v r6 = r0.f219187n
            java.lang.String r6 = r6.f219214k
            if (r6 != r8) goto L_0x00c0
            f40.C86709a0.m107528h()
            k40.a r6 = f40.C86709a0.m107533q(r1)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            com.tencent.mm.ui.contact.v r7 = r0.f219187n
            java.lang.String r7 = r7.f219212i
            java.lang.String[] r7 = r7.split(r10)
            java.util.ArrayList r7 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r7)
            android.database.Cursor r6 = r6.mo69731z3(r7)
            goto L_0x00dd
        L_0x00c0:
            f40.C86709a0.m107528h()
            k40.a r6 = f40.C86709a0.m107533q(r1)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            com.tencent.mm.ui.contact.v r7 = r0.f219187n
            java.lang.String r7 = r7.f219212i
            java.lang.String[] r7 = r7.split(r10)
            java.util.ArrayList r7 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r7)
            android.database.Cursor r6 = r6.mo69663M3(r7)
        L_0x00dd:
            r5.add(r6)
            int r6 = r6.getCount()
            if (r6 <= 0) goto L_0x00ef
            r0.f219192s = r4
            int r6 = r6 + r12
            int r6 = r6 + r4
            r0.mo103623t(r4, r9)
            r4 = r6
            goto L_0x00f1
        L_0x00ef:
            r0.f219192s = r3
        L_0x00f1:
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            java.lang.String r3 = r3.f219212i
            java.lang.String[] r3 = r3.split(r10)
            java.util.ArrayList r3 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r3)
            f40.C86709a0.m107528h()
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            android.database.Cursor r1 = r1.mo69708j4(r3, r12)
            r5.add(r1)
            java.lang.String[] r6 = eb0.C45628s0.m50802u(r3)
            int[] r3 = eb0.C45628s0.m50798s(r3)
            if (r6 == 0) goto L_0x04f0
            if (r3 == 0) goto L_0x04f0
            r7 = 0
        L_0x011e:
            int r8 = r6.length
            if (r7 >= r8) goto L_0x0131
            int r8 = r3.length
            if (r7 >= r8) goto L_0x012e
            r8 = r3[r7]
            int r8 = r8 + r4
            r9 = r6[r7]
            r0.mo103623t(r8, r9)
            int r4 = r4 + 1
        L_0x012e:
            int r7 = r7 + 1
            goto L_0x011e
        L_0x0131:
            r1.getCount()
            goto L_0x04f0
        L_0x0136:
            boolean r6 = r6.f219210g
            if (r6 == 0) goto L_0x0143
            r0.f219195v = r11
            java.lang.String r6 = "nonLimit"
            r0.mo103623t(r11, r6)
            r6 = 1
            goto L_0x0144
        L_0x0143:
            r6 = 0
        L_0x0144:
            com.tencent.mm.ui.contact.v r7 = r0.f219187n
            boolean r13 = r7.f219215l
            java.lang.String r14 = "↑"
            if (r13 == 0) goto L_0x018e
            java.lang.String r7 = r7.f219216m
            if (r7 == 0) goto L_0x018e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x018e
            com.tencent.mm.ui.contact.v r7 = r0.f219187n
            java.lang.String r7 = r7.f219216m
            java.lang.String r13 = ";"
            java.lang.String[] r7 = r7.split(r13)
            java.util.ArrayList r7 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r7)
            f40.C86709a0.m107528h()
            k40.a r13 = f40.C86709a0.m107533q(r1)
            f62.k0 r13 = (f62.C75700k0) r13
            com.tencent.mm.storage.u3 r13 = r13.mo96097Ni()
            android.database.Cursor r7 = r13.mo69654F3(r7)
            r5.add(r7)
            int r7 = r7.getCount()
            if (r7 <= 0) goto L_0x0188
            r0.f219188o = r6
            int r7 = r7 + r12
            int r7 = r7 + r6
            r0.mo103623t(r6, r14)
            r6 = r7
            goto L_0x018a
        L_0x0188:
            r0.f219188o = r3
        L_0x018a:
            r20 = r10
            goto L_0x0256
        L_0x018e:
            com.tencent.mm.ui.contact.v r7 = r0.f219187n
            boolean r7 = r7.f219204a
            if (r7 == 0) goto L_0x018a
            java.util.List<java.lang.String> r7 = r0.f219096j
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            k40.a r15 = f40.C86709a0.m107533q(r1)
            f62.k0 r15 = (f62.C75700k0) r15
            com.tencent.mm.storage.v3 r15 = r15.mo96094Ku()
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r16 = p922vj.C78420a.f229768m1
            com.tencent.mm.storage.i2 r15 = (com.tencent.p014mm.storage.C44660i2) r15
            r16 = 1
            r18 = 0
            r19 = 1
            r20 = 0
            r17 = r7
            android.database.Cursor r7 = r15.mo69747R(r16, r17, r18, r19, r20)
            boolean r15 = r7.moveToFirst()
            if (r15 == 0) goto L_0x0210
            r15 = 0
        L_0x01be:
            com.tencent.mm.storage.h2 r4 = new com.tencent.mm.storage.h2
            r4.<init>()
            r4.convertFrom(r7)
            java.lang.String r11 = r4.getUsername()
            java.lang.String[] r3 = eb0.C45628s0.f123409o
            int r12 = r3.length
            r20 = r10
            r10 = 0
        L_0x01d0:
            if (r10 >= r12) goto L_0x01e2
            r21 = r12
            r12 = r3[r10]
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x01dd
            goto L_0x01ef
        L_0x01dd:
            int r10 = r10 + 1
            r12 = r21
            goto L_0x01d0
        L_0x01e2:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r11)
            if (r3 == 0) goto L_0x01e9
            goto L_0x01ef
        L_0x01e9:
            boolean r3 = eb0.C45628s0.m50738C(r11)
            if (r3 == 0) goto L_0x01f1
        L_0x01ef:
            r3 = 0
            goto L_0x01f2
        L_0x01f1:
            r3 = 1
        L_0x01f2:
            if (r3 == 0) goto L_0x0201
            java.lang.String r3 = r4.getUsername()
            r13.add(r3)
            int r15 = r15 + 1
            r3 = 4
            if (r15 < r3) goto L_0x0201
            goto L_0x0212
        L_0x0201:
            boolean r3 = r7.moveToNext()
            if (r3 != 0) goto L_0x0208
            goto L_0x0212
        L_0x0208:
            r10 = r20
            r3 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r12 = 1
            goto L_0x01be
        L_0x0210:
            r20 = r10
        L_0x0212:
            r7.close()
            int r3 = r13.size()
            if (r3 != 0) goto L_0x022d
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            android.database.Cursor r3 = r3.mo69714m4()
            goto L_0x023e
        L_0x022d:
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            android.database.Cursor r3 = r3.mo69654F3(r13)
        L_0x023e:
            r5.add(r3)
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x0251
            r0.f219189p = r6
            r4 = 1
            int r3 = r3 + r4
            int r3 = r3 + r6
            r0.mo103623t(r6, r14)
            r6 = r3
            goto L_0x0256
        L_0x0251:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.f219189p = r3
        L_0x0256:
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            boolean r3 = r3.f219208e
            if (r3 == 0) goto L_0x031c
            com.tencent.mm.ui.contact.y r3 = r0.f219186F
            java.util.List<java.lang.String> r4 = r0.f219096j
            r3.mo103650e(r4)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.List<java.lang.String> r4 = r0.f219185E
            r3.addAll(r4)
            java.util.List<java.lang.String> r4 = r0.f219184D
            r3.addAll(r4)
            com.tencent.mm.ui.contact.y r4 = r0.f219186F
            r4.mo103646a(r3)
            java.util.List<java.lang.String> r3 = r0.f219185E
            int r3 = r3.size()
            r4 = 3
            if (r3 >= r4) goto L_0x02de
            com.tencent.mm.ui.contact.y r3 = r0.f219186F
            r3.getClass()
            f40.C86709a0.m107528h()
            k40.a r4 = f40.C86709a0.m107533q(r1)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            android.database.Cursor r4 = r4.mo69714m4()
            java.util.List<com.tencent.mm.storage.m1> r7 = r3.f219252c
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x02b7
            f40.C86709a0.m107528h()
            k40.a r4 = f40.C86709a0.m107533q(r1)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.util.List<com.tencent.mm.storage.m1> r7 = r3.f219252c
            java.util.List r3 = r3.mo103652g(r7)
            android.database.Cursor r4 = r4.mo69692d4(r3)
        L_0x02b7:
            int r3 = r4.getCount()
            r0.f219181A = r3
            if (r3 <= 0) goto L_0x02db
            r5.add(r4)
            r0.f219191r = r6
            int r4 = r3 + 1
            int r4 = r4 + r6
            r0.mo103623t(r6, r14)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r7[r6] = r3
            java.lang.String r3 = "add recommend group cursor %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r7)
            r6 = r4
            goto L_0x02de
        L_0x02db:
            r4.close()
        L_0x02de:
            java.util.List<java.lang.String> r3 = r0.f219184D
            int r3 = r3.size()
            r4 = 1
            if (r3 < r4) goto L_0x031c
            java.util.List<java.lang.String> r3 = r0.f219185E
            int r3 = r3.size()
            r4 = 41
            if (r3 >= r4) goto L_0x031c
            com.tencent.mm.ui.contact.y r3 = r0.f219186F
            android.database.Cursor r3 = r3.mo103649d()
            int r4 = r3.getCount()
            if (r4 <= 0) goto L_0x0319
            r5.add(r3)
            r0.f219190q = r6
            int r3 = r4 + 1
            int r3 = r3 + r6
            r0.mo103623t(r6, r14)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r7[r6] = r4
            java.lang.String r4 = "add recommend contact cursor %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r7)
            r6 = r3
            goto L_0x031c
        L_0x0319:
            r3.close()
        L_0x031c:
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            boolean r3 = r3.f219205b
            if (r3 == 0) goto L_0x03ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "option.filterType = "
            r3.append(r4)
            com.tencent.mm.ui.contact.v r4 = r0.f219187n
            java.lang.String r4 = r4.f219214k
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            java.lang.String r3 = r3.f219214k
            if (r3 != r8) goto L_0x035a
            java.lang.String r3 = "getFavCursorWithoutOpenIM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.util.List<java.lang.String> r4 = r0.f219096j
            r7 = 0
            android.database.Cursor r3 = r3.mo69699g4(r4, r7)
            goto L_0x0373
        L_0x035a:
            java.lang.String r3 = "getFavCursor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            java.util.List<java.lang.String> r4 = r0.f219096j
            r7 = 0
            android.database.Cursor r3 = r3.mo69650C3(r4, r7)
        L_0x0373:
            r5.add(r3)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "before favContactCursor.getCount"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            int r3 = r3.getCount()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "favContactCursor.getCount duration = "
            r4.append(r10)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r7
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            if (r3 <= 0) goto L_0x03a8
            r0.f219192s = r6
            r4 = 1
            int r3 = r3 + r4
            int r3 = r3 + r6
            r0.mo103623t(r6, r9)
            r6 = r3
            goto L_0x03ad
        L_0x03a8:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.f219192s = r3
        L_0x03ad:
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            boolean r4 = r3.f219211h
            if (r4 == 0) goto L_0x0412
            java.lang.String r3 = r3.f219218o
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x03c6
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            java.lang.String r3 = r3.f219218o
            r4 = r20
            java.util.List r4 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r3, r4)
            goto L_0x03c7
        L_0x03c6:
            r4 = 0
        L_0x03c7:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r3 != 0) goto L_0x0409
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            r7 = 1
            android.database.Cursor r3 = r3.mo69708j4(r4, r7)
            r5.add(r3)
            java.lang.String[] r7 = eb0.C45628s0.m50802u(r4)
            int[] r4 = eb0.C45628s0.m50798s(r4)
            if (r7 == 0) goto L_0x046c
            if (r4 == 0) goto L_0x046c
            r9 = r6
            r8 = 0
        L_0x03f0:
            int r10 = r7.length
            if (r8 >= r10) goto L_0x0403
            int r10 = r4.length
            if (r8 >= r10) goto L_0x0400
            r10 = r4[r8]
            int r10 = r10 + r9
            r11 = r7[r8]
            r0.mo103623t(r10, r11)
            int r9 = r9 + 1
        L_0x0400:
            int r8 = r8 + 1
            goto L_0x03f0
        L_0x0403:
            int r3 = r3.getCount()
            int r4 = r7.length
            goto L_0x046a
        L_0x0409:
            zh3.c r3 = new zh3.c
            r3.<init>()
            r5.add(r3)
            goto L_0x046c
        L_0x0412:
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r7 = r3.mo96097Ni()
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            java.lang.String r8 = r3.f219214k
            java.util.List<java.lang.String> r10 = r0.f219096j
            r11 = 0
            r12 = 0
            boolean r3 = r0.f219095i
            r4 = 1
            r13 = r3 ^ 1
            java.lang.String r9 = ""
            android.database.Cursor r3 = r7.mo69721q3(r8, r9, r10, r11, r12, r13)
            r5.add(r3)
            com.tencent.mm.ui.contact.v r4 = r0.f219187n
            java.lang.String r4 = r4.f219214k
            java.util.List<java.lang.String> r7 = r0.f219096j
            java.lang.String r8 = ""
            r9 = 0
            java.lang.String[] r4 = eb0.C45628s0.m50804v(r9, r4, r8, r8, r7)
            com.tencent.mm.ui.contact.v r7 = r0.f219187n
            java.lang.String r7 = r7.f219214k
            java.util.List<java.lang.String> r10 = r0.f219096j
            int[] r7 = eb0.C45628s0.m50800t(r9, r7, r8, r10, r8)
            if (r4 == 0) goto L_0x046c
            if (r7 == 0) goto L_0x046c
            r9 = r6
            r8 = 0
        L_0x0452:
            int r10 = r4.length
            if (r8 >= r10) goto L_0x0465
            int r10 = r7.length
            if (r8 >= r10) goto L_0x0462
            r10 = r7[r8]
            int r10 = r10 + r9
            r11 = r4[r8]
            r0.mo103623t(r10, r11)
            int r9 = r9 + 1
        L_0x0462:
            int r8 = r8 + 1
            goto L_0x0452
        L_0x0465:
            int r3 = r3.getCount()
            int r4 = r4.length
        L_0x046a:
            int r3 = r3 + r4
            int r6 = r6 + r3
        L_0x046c:
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            boolean r3 = r3.f219206c
            if (r3 == 0) goto L_0x04b0
            f40.C86709a0.m107528h()
            k40.a r3 = f40.C86709a0.m107533q(r1)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r7 = r3.mo96097Ni()
            java.util.List<java.lang.String> r10 = r0.f219096j
            r11 = 0
            r12 = 0
            java.lang.String r8 = "@all.chatroom.contact"
            java.lang.String r9 = ""
            android.database.Cursor r3 = r7.mo69725t3(r8, r9, r10, r11, r12)
            r5.add(r3)
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x04ab
            r0.f219193t = r6
            r4 = 1
            int r3 = r3 + r4
            int r3 = r3 + r6
            com.tencent.mm.ui.contact.g1 r4 = r0.f219055d
            android.app.Activity r4 = r4.getActivity()
            r7 = 2131820771(0x7f1100e3, float:1.9274266E38)
            java.lang.String r4 = r4.getString(r7)
            r0.mo103623t(r6, r4)
            r6 = r3
            goto L_0x04b0
        L_0x04ab:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.f219193t = r3
        L_0x04b0:
            com.tencent.mm.ui.contact.v r3 = r0.f219187n
            boolean r3 = r3.f219207d
            if (r3 == 0) goto L_0x04f0
            f40.C86709a0.m107528h()
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r7 = r1.mo96097Ni()
            java.util.List<java.lang.String> r10 = r0.f219096j
            r11 = 0
            r12 = 0
            java.lang.String r8 = "@verify.contact"
            java.lang.String r9 = ""
            android.database.Cursor r1 = r7.mo69725t3(r8, r9, r10, r11, r12)
            r5.add(r1)
            int r1 = r1.getCount()
            if (r1 <= 0) goto L_0x04eb
            r0.f219194u = r6
            com.tencent.mm.ui.contact.g1 r1 = r0.f219055d
            android.app.Activity r1 = r1.getActivity()
            r3 = 2131835523(0x7f113a83, float:1.9304187E38)
            java.lang.String r1 = r1.getString(r3)
            r0.mo103623t(r6, r1)
            goto L_0x04f0
        L_0x04eb:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f219194u = r1
        L_0x04f0:
            android.database.MergeCursor r1 = new android.database.MergeCursor
            r3 = 0
            android.database.Cursor[] r4 = new android.database.Cursor[r3]
            java.lang.Object[] r4 = r5.toArray(r4)
            android.database.Cursor[] r4 = (android.database.Cursor[]) r4
            r1.<init>(r4)
            r0.f219199z = r1
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r1 = r1.getCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f219197x
            java.lang.String r1 = r1.toString()
            r3 = 1
            r4[r3] = r1
            java.lang.String r1 = "datacount:%d headerPosMap=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r4)
            r22.mo103564g()
            r22.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74568u.mo7853r():void");
    }

    /* renamed from: s */
    public final C75922b mo103622s(int i, String str) {
        C75957r rVar = new C75957r(i);
        rVar.f222731x = str;
        rVar.f222606c = this.f219182B;
        return rVar;
    }

    /* renamed from: t */
    public final void mo103623t(int i, String str) {
        this.f219197x.put(str, Integer.valueOf(i));
        this.f219198y.put(i, str);
    }

    public C74568u(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, C74572v vVar) {
        this(mMBaseSelectContactUI, (List<String>) null, (List<String>) null, list, z, z2, vVar, false, false, false);
    }
}
