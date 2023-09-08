package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p922vj.C78420a;

/* renamed from: com.tencent.mm.ui.contact.f3 */
public class C74490f3 extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: n */
    public Cursor f219034n;

    /* renamed from: o */
    public Cursor f219035o;

    /* renamed from: p */
    public Cursor f219036p;

    /* renamed from: q */
    public int f219037q = -1;

    /* renamed from: r */
    public int f219038r = -1;

    /* renamed from: s */
    public boolean f219039s;

    /* renamed from: t */
    public int f219040t = 0;

    /* renamed from: u */
    public int f219041u = 0;

    /* renamed from: v */
    public Map<String, Integer> f219042v = new HashMap();

    /* renamed from: w */
    public Map<String, Integer> f219043w = new HashMap();

    /* renamed from: x */
    public int f219044x = 0;

    /* renamed from: y */
    public int f219045y = 0;

    public C74490f3(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, boolean z3, int i) {
        super(mMBaseSelectContactUI, list, z, z2);
        Log.m105924i("MicroMsg.RecentConversationAdapter", "create!");
        this.f219039s = z3;
        this.f219040t = i;
        mo7853r();
    }

    public int getCount() {
        Cursor cursor = this.f219036p;
        if (cursor != null) {
            return cursor.getCount() + this.f219041u;
        }
        Log.m105920e("MicroMsg.RecentConversationAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0126  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gl3.C75922b mo7850h(int r8) {
        /*
            r7 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            int r1 = r7.f219038r
            r2 = 1
            if (r1 <= 0) goto L_0x003e
            r1 = 2131835523(0x7f113a83, float:1.9304187E38)
            if (r8 != 0) goto L_0x0022
            gl3.r r3 = new gl3.r
            r3.<init>(r8)
            com.tencent.mm.ui.contact.g1 r4 = r7.f219055d
            android.app.Activity r4 = r4.getActivity()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
            r3.f222731x = r1
            goto L_0x003e
        L_0x0022:
            if (r8 != r2) goto L_0x003e
            gl3.c r3 = new gl3.c
            r3.<init>(r8)
            com.tencent.mm.ui.contact.g1 r4 = r7.f219055d
            android.app.Activity r4 = r4.getActivity()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
            r4 = 2131755489(0x7f1001e1, float:1.9141859E38)
            r3.f222628G = r4
            r3.f222629H = r1
        L_0x003e:
            int r1 = r7.f219038r
            if (r8 == r1) goto L_0x0147
            int r3 = r7.f219037q
            if (r8 != r3) goto L_0x0048
            goto L_0x0147
        L_0x0048:
            if (r8 >= 0) goto L_0x004d
            r8 = 0
            goto L_0x017c
        L_0x004d:
            int r3 = r7.f219041u
            r4 = 0
            java.lang.String r5 = "MicroMsg.RecentConversationAdapter"
            r6 = 2
            if (r3 != r6) goto L_0x005a
            if (r8 <= r1) goto L_0x005c
            int r1 = r8 + -2
            goto L_0x006d
        L_0x005a:
            if (r3 != r2) goto L_0x005f
        L_0x005c:
            int r1 = r8 + -1
            goto L_0x006d
        L_0x005f:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r1[r4] = r3
            java.lang.String r3 = "Actually dead branch. position=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r1)
            r1 = r8
        L_0x006d:
            android.database.Cursor r3 = r7.f219036p
            boolean r3 = r3.moveToPosition(r1)
            if (r3 == 0) goto L_0x0126
            gl3.n r1 = new gl3.n
            r1.<init>(r8)
            com.tencent.mm.storage.h2 r3 = new com.tencent.mm.storage.h2
            r3.<init>()
            android.database.Cursor r4 = r7.f219036p
            r3.convertFrom(r4)
            f40.C86709a0.m107528h()
            k40.a r4 = f40.C86709a0.m107533q(r0)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r5 = r3.getUsername()
            com.tencent.mm.storage.z1 r4 = r4.mo69674W2(r5)
            r1.mo106181j(r4)
            com.tencent.mm.storage.z1 r4 = r1.f222600A
            if (r4 != 0) goto L_0x00b8
            f40.C86709a0.m107528h()
            k40.a r4 = f40.C86709a0.m107533q(r0)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            java.lang.String r3 = r3.getUsername()
            com.tencent.mm.storage.z1 r3 = r4.mo69656H3(r3)
            r1.mo106181j(r3)
        L_0x00b8:
            boolean r3 = r7.f219057f
            r1.f222608e = r3
            int r3 = r7.f219038r
            int r4 = r3 + -1
            if (r8 != r4) goto L_0x00c4
            r1.f222615l = r2
        L_0x00c4:
            java.lang.String r4 = r1.f222621r
            int r5 = r7.f219041u
            if (r5 != r6) goto L_0x00ff
            if (r8 <= r3) goto L_0x00f0
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r7.f219042v
            int r8 = r8 - r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r4, r8)
            k40.a r8 = f40.C86709a0.m107533q(r0)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.v3 r8 = r8.mo96094Ku()
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8
            boolean r8 = r8.mo69755a0(r4)
            if (r8 == 0) goto L_0x0124
            int r8 = r7.f219044x
            int r8 = r8 + r2
            r7.f219044x = r8
            goto L_0x0124
        L_0x00f0:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r7.f219043w
            int r2 = r7.f219037q
            int r8 = r8 - r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r4, r8)
            goto L_0x0124
        L_0x00ff:
            if (r5 != r2) goto L_0x0124
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r7.f219042v
            int r8 = r8 - r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r4, r8)
            k40.a r8 = f40.C86709a0.m107533q(r0)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.v3 r8 = r8.mo96094Ku()
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8
            boolean r8 = r8.mo69755a0(r4)
            if (r8 == 0) goto L_0x0124
            int r8 = r7.f219044x
            int r8 = r8 + r2
            r7.f219044x = r8
        L_0x0124:
            r8 = r1
            goto L_0x017c
        L_0x0126:
            gl3.q r0 = new gl3.q
            r3 = 4
            r0.<init>(r3, r8)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            android.database.Cursor r3 = r7.f219036p
            boolean r3 = r3.isClosed()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8[r4] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8[r2] = r1
            java.lang.String r1 = "wrong case: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r8)
            goto L_0x017b
        L_0x0147:
            gl3.r r0 = new gl3.r
            r0.<init>(r8)
            int r1 = r7.f219037q
            if (r8 != r1) goto L_0x0164
            com.tencent.mm.ui.contact.g1 r8 = r7.f219055d
            android.app.Activity r8 = r8.getActivity()
            android.content.res.Resources r8 = r8.getResources()
            r1 = 2131835524(0x7f113a84, float:1.930419E38)
            java.lang.String r8 = r8.getString(r1)
            r0.f222731x = r8
            goto L_0x017b
        L_0x0164:
            int r1 = r7.f219038r
            if (r8 != r1) goto L_0x017b
            com.tencent.mm.ui.contact.g1 r8 = r7.f219055d
            android.app.Activity r8 = r8.getActivity()
            android.content.res.Resources r8 = r8.getResources()
            r1 = 2131835486(0x7f113a5e, float:1.9304112E38)
            java.lang.String r8 = r8.getString(r1)
            r0.f222731x = r8
        L_0x017b:
            r8 = r0
        L_0x017c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74490f3.mo7850h(int):gl3.b");
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.RecentConversationAdapter", "finish!");
        mo103560s();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().remove(this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo7853r();
        notifyDataSetChanged();
    }

    /* renamed from: r */
    public void mo7853r() {
        List<String> list;
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.RecentConversationAdapter", "resetData");
        mo103560s();
        ArrayList arrayList = new ArrayList();
        this.f219045y = 0;
        if (C74560s1.m89275d(this.f219040t, 4)) {
            list = C57827q0.m66829b();
            if (!Util.isNullOrNil((List) list)) {
                C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                List<String> list2 = this.f219096j;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
                this.f219035o = ((C44660i2) Ku).mo69739J(list, 3, list2, (String) null, this.f219095i, "");
            }
            Log.m105924i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku2 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list3 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C78420a.f229768m1;
            this.f219034n = ((C44660i2) Ku2).mo69747R(3, list3, (String) null, this.f219095i, "");
        } else if (C74560s1.m89275d(this.f219040t, 16)) {
            list = C57827q0.m66827a();
            if (!Util.isNullOrNil((List) list)) {
                C30783v3 Ku3 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                List<String> list4 = this.f219096j;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo3 = C78420a.f229768m1;
                this.f219035o = ((C44660i2) Ku3).mo69739J(list, 5, list4, (String) null, this.f219095i, "");
            }
            Log.m105924i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku4 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list5 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo4 = C78420a.f229768m1;
            this.f219034n = ((C44660i2) Ku4).mo69747R(5, list5, (String) null, this.f219095i, "");
        } else {
            list = C57827q0.m66830c();
            if (!Util.isNullOrNil((List) list)) {
                C30783v3 Ku5 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                List<String> list6 = this.f219096j;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo5 = C78420a.f229768m1;
                this.f219035o = ((C44660i2) Ku5).mo69739J(list, 1, list6, (String) null, this.f219095i, "");
            }
            Log.m105924i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            C30783v3 Ku6 = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            List<String> list7 = this.f219096j;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo6 = C78420a.f229768m1;
            this.f219034n = ((C44660i2) Ku6).mo69747R(1, list7, (String) null, this.f219095i, "");
        }
        int i = this.f219039s ? 2 : 0;
        this.f219041u = 0;
        if (!Util.isNullOrNil((List) list)) {
            int count = this.f219035o.getCount();
            this.f219045y = count;
            if (count > 0) {
                arrayList.add(this.f219035o);
                this.f219037q = 0 + i;
                this.f219041u++;
            }
        }
        if (this.f219034n.getCount() > 0) {
            this.f219041u++;
            int i2 = this.f219037q;
            if (i2 == -1) {
                this.f219038r = i + 0;
            } else {
                this.f219038r = i2 + this.f219045y + 1;
            }
        } else {
            this.f219038r = this.f219055d.mo7831f6().getHeaderViewsCount();
        }
        arrayList.add(this.f219034n);
        this.f219036p = new MergeCursor((Cursor[]) arrayList.toArray(new Cursor[0]));
        mo103564g();
    }

    /* renamed from: s */
    public final void mo103560s() {
        Cursor cursor = this.f219034n;
        if (cursor != null) {
            cursor.close();
            this.f219034n = null;
        }
        Cursor cursor2 = this.f219035o;
        if (cursor2 != null) {
            cursor2.close();
            this.f219035o = null;
        }
        Cursor cursor3 = this.f219036p;
        if (cursor3 != null) {
            cursor3.close();
            this.f219036p = null;
        }
    }
}
