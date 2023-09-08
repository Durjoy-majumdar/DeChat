package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75970u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99681n;
import nv1.C100218a;
import nv1.C100219b;

/* renamed from: com.tencent.mm.ui.contact.c2 */
public class C74469c2 extends C74498h1 {

    /* renamed from: A */
    public Map<Integer, String> f218971A = new HashMap();

    /* renamed from: B */
    public Map<String, Integer> f218972B = new HashMap();

    /* renamed from: C */
    public int f218973C = 0;

    /* renamed from: D */
    public C74592y f218974D = new C74592y();

    /* renamed from: E */
    public MMHandler f218975E = new MMHandler(Looper.getMainLooper());

    /* renamed from: F */
    public C61173o f218976F = new C74470a();

    /* renamed from: G */
    public int f218977G = 1;

    /* renamed from: H */
    public int f218978H = 1;

    /* renamed from: I */
    public int f218979I = 0;

    /* renamed from: j */
    public List<String> f218980j = new LinkedList();

    /* renamed from: n */
    public Map<String, List<C99681n>> f218981n = null;

    /* renamed from: o */
    public Map<String, Boolean> f218982o = new HashMap();

    /* renamed from: p */
    public Map<String, C99672i> f218983p = null;

    /* renamed from: q */
    public List<String> f218984q;

    /* renamed from: r */
    public List<String> f218985r;

    /* renamed from: s */
    public List<String> f218986s;

    /* renamed from: t */
    public C99664b f218987t;

    /* renamed from: u */
    public List<String> f218988u;

    /* renamed from: v */
    public int f218989v = 0;

    /* renamed from: w */
    public Map<String, LinkedList<String>> f218990w = new HashMap();

    /* renamed from: x */
    public int[] f218991x;

    /* renamed from: y */
    public List<Integer> f218992y;

    /* renamed from: z */
    public Cursor f218993z;

    /* renamed from: com.tencent.mm.ui.contact.c2$a */
    public class C74470a implements C61173o {
        public C74470a() {
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            int i = lVar.f32074c;
            if (i == -3 || i == -2 || i == -1) {
                Log.m105925i("MicroMsg.MultiSearchContactAdapter", "search query:%s, err:%s", lVar.f32072a.f224468c, Integer.valueOf(i));
                String str = lVar.f32072a.f224468c;
                C74469c2 c2Var = C74469c2.this;
                if (str.equals(c2Var.f218988u.get(c2Var.f218989v))) {
                    C74469c2.this.mo103534v();
                }
            } else if (i == 0) {
                C74469c2 c2Var2 = C74469c2.this;
                if (c2Var2.f218987t != null && lVar.f32075d != null) {
                    List<C99681n> list = lVar.f32076e;
                    if (c2Var2.f218986s != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            C99681n nVar = list.get(size);
                            if (!c2Var2.f218986s.contains(nVar.f292151e)) {
                                int i2 = nVar.f292148b;
                                if (i2 == 131072 || i2 == 131075 || i2 == 131076 || i2 == 131081) {
                                }
                            }
                            list.remove(size);
                        }
                    }
                    String str2 = lVar.f32075d.f292120a;
                    if (((HashMap) C74469c2.this.f218981n).get(str2) == null) {
                        ((HashMap) C74469c2.this.f218981n).put(str2, new LinkedList());
                        if (((HashMap) C74469c2.this.f218982o).get(str2) == null) {
                            ((HashMap) C74469c2.this.f218982o).put(str2, Boolean.FALSE);
                        }
                        ((HashMap) C74469c2.this.f218983p).put(str2, lVar.f32075d);
                    }
                    if (lVar.f32076e.size() > 0) {
                        if (lVar.f32076e.get(0).f292148b != 131072) {
                            Log.m105924i("MicroMsg.MultiSearchContactAdapter", "not support search type");
                        } else {
                            ((List) ((HashMap) C74469c2.this.f218981n).get(lVar.f32075d.f292120a)).addAll(lVar.f32076e);
                        }
                    }
                    C74469c2.this.mo103528A(lVar.f32072a.f224468c, C74469c2.this.mo103534v(), true);
                }
            }
        }
    }

    public C74469c2(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, List<String> list2, List<String> list3, boolean z, int i) {
        super(mMBaseSelectContactUI, z, i);
        this.f218985r = list;
        this.f218984q = list2;
        this.f218986s = list3;
        this.f218992y = new ArrayList();
        mo103536x();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02fa  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103528A(java.lang.String r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 0
            java.lang.String r4 = "MicroMsg.MultiSearchContactAdapter"
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L_0x016a
            boolean r8 = r19.mo103537z()
            if (r8 == 0) goto L_0x016a
            java.util.List<java.lang.String> r8 = r0.f218985r
            int r8 = r8.size()
            if (r8 >= r5) goto L_0x016a
            com.tencent.mm.ui.contact.y r8 = r0.f218974D
            java.util.List<java.lang.String> r9 = r0.f218986s
            r8.mo103650e(r9)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.List<java.lang.String> r9 = r0.f218985r
            r8.addAll(r9)
            java.util.List<java.lang.String> r9 = r0.f218984q
            r8.addAll(r9)
            com.tencent.mm.ui.contact.y r9 = r0.f218974D
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r10 = r0.f218981n
            r9.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r14 = eb0.C75592q0.m90789s()
            boolean r14 = r8.contains(r14)
            if (r14 == 0) goto L_0x0052
            java.lang.String r14 = eb0.C75592q0.m90789s()
            r8.remove(r14)
        L_0x0052:
            java.util.Iterator r14 = r8.iterator()
        L_0x0056:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0069
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r13.put(r15, r5)
            r5 = 3
            goto L_0x0056
        L_0x0069:
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.util.Collection r5 = r10.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0097
            java.lang.Object r14 = r5.next()
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x0083:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0073
            java.lang.Object r15 = r14.next()
            lv1.n r15 = (lv1.C99681n) r15
            java.lang.String r15 = r15.f292151e
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r13.put(r15, r7)
            goto L_0x0083
        L_0x0097:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r13.put(r5, r7)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.List<com.tencent.mm.storage.m1> r7 = r9.f219253d
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r7 = r7.size()
            if (r7 != 0) goto L_0x00d8
            f40.o r7 = f40.C86709a0.m107535s()
            zh3.f r7 = r7.f251811i
            com.tencent.wcdb.database.SQLiteDatabase r7 = r7.mo125615f()
            java.lang.String r14 = "select chatroomname,memberlist from chatroom where chatroomname like '%@chatroom'"
            com.tencent.wcdb.Cursor r7 = r7.rawQuery(r14, r3)
        L_0x00bf:
            boolean r14 = r7.moveToNext()
            if (r14 == 0) goto L_0x00d5
            com.tencent.mm.storage.m1 r14 = new com.tencent.mm.storage.m1
            r14.<init>()
            r14.convertFrom(r7)
            java.util.List<com.tencent.mm.storage.m1> r15 = r9.f219253d
            java.util.LinkedList r15 = (java.util.LinkedList) r15
            r15.add(r14)
            goto L_0x00bf
        L_0x00d5:
            r7.close()
        L_0x00d8:
            java.util.List<com.tencent.mm.storage.m1> r7 = r9.f219253d
            java.util.Iterator r7 = r7.iterator()
        L_0x00de:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x0124
            java.lang.Object r14 = r7.next()
            com.tencent.mm.storage.m1 r14 = (com.tencent.p014mm.storage.C44661m1) r14
            java.util.List r15 = r14.mo69790r2()
            int r15 = r15.size()
            int r17 = r10.size()
            int r18 = r8.size()
            int r17 = r17 + r18
            int r3 = r17 + 1
            if (r15 != r3) goto L_0x0122
            java.util.List r3 = r14.mo69790r2()
            java.util.Iterator r3 = r3.iterator()
        L_0x0108:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x011c
            java.lang.Object r15 = r3.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = r13.containsKey(r15)
            if (r15 != 0) goto L_0x0108
            r3 = 0
            goto L_0x011d
        L_0x011c:
            r3 = 1
        L_0x011d:
            if (r3 == 0) goto L_0x0122
            r5.add(r14)
        L_0x0122:
            r3 = 0
            goto L_0x00de
        L_0x0124:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r3[r8] = r7
            java.lang.String r7 = "MicroMsg.ContactRecommendHelper"
            java.lang.String r8 = "getSearchRecommendChatroom, time %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r3)
            java.util.List r3 = r9.mo103652g(r5)
            r0.f218980j = r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0153
            java.util.List<java.lang.String> r3 = r0.f218980j
            int r3 = r3.size()
            int r5 = r0.f218977G
            int r3 = r3 + r5
            r16 = 0
            int r3 = r3 + 0
            goto L_0x0156
        L_0x0153:
            r16 = 0
            r3 = 0
        L_0x0156:
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.util.List<java.lang.String> r7 = r0.f218980j
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r16] = r7
            java.lang.String r7 = "recommend chatroom size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r5)
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            java.util.List<java.lang.String> r5 = r0.f218988u
            if (r5 == 0) goto L_0x0201
            java.util.Iterator r5 = r5.iterator()
        L_0x0173:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0201
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r8 = r0.f218981n
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r7)
            if (r8 != 0) goto L_0x018a
            goto L_0x0173
        L_0x018a:
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r8 = r0.f218981n
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r7)
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x01d3
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r8 = r0.f218981n
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r7)
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            boolean r9 = r19.mo103537z()
            if (r9 == 0) goto L_0x01ce
            r9 = 3
            if (r8 <= r9) goto L_0x01ce
            java.util.Map<java.lang.String, java.lang.Boolean> r9 = r0.f218982o
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r7 = r9.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x01c7
            int r7 = r0.f218977G
            int r7 = r7 + r8
            int r8 = r0.f218978H
            goto L_0x01d0
        L_0x01c7:
            int r7 = r0.f218977G
            r8 = 3
            int r7 = r7 + r8
            int r8 = r0.f218978H
            goto L_0x01d0
        L_0x01ce:
            int r7 = r0.f218977G
        L_0x01d0:
            int r7 = r7 + r8
            int r3 = r3 + r7
            goto L_0x0173
        L_0x01d3:
            if (r2 == 0) goto L_0x0173
            boolean r8 = r19.mo103537z()
            if (r8 == 0) goto L_0x0173
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r8 = r0.f218981n
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.lang.Object r8 = r8.get(r1)
            java.util.List r8 = (java.util.List) r8
            lv1.n r9 = new lv1.n
            r9.<init>()
            r8.add(r9)
            int r8 = r0.f218977G
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r9 = r0.f218981n
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r7 = r9.get(r7)
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            int r8 = r8 + r7
            int r3 = r3 + r8
            goto L_0x0173
        L_0x0201:
            r0.f218973C = r3
            if (r2 == 0) goto L_0x0332
            boolean r5 = r19.mo103537z()
            if (r5 == 0) goto L_0x0332
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List<java.lang.String> r8 = r0.f218985r
            int r8 = r8.size()
            r9 = 41
            if (r8 >= r9) goto L_0x0274
            com.tencent.mm.ui.contact.y r8 = r0.f218974D
            java.util.List<java.lang.String> r9 = r0.f218986s
            r8.mo103650e(r9)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.List<java.lang.String> r9 = r0.f218985r
            r8.addAll(r9)
            java.util.List<java.lang.String> r9 = r0.f218984q
            r8.addAll(r9)
            com.tencent.mm.ui.contact.y r9 = r0.f218974D
            r9.mo103646a(r8)
            com.tencent.mm.ui.contact.y r8 = r0.f218974D
            android.database.Cursor r8 = r8.mo103649d()
            int r9 = r8.getCount()
            if (r9 <= 0) goto L_0x0271
            r7.add(r8)
            java.util.Map<java.lang.Integer, java.lang.String> r8 = r0.f218971A
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            com.tencent.mm.ui.contact.g1 r12 = r0.f219055d
            android.app.Activity r12 = r12.getActivity()
            r13 = 2131835526(0x7f113a86, float:1.9304193E38)
            java.lang.String r12 = r12.getString(r13)
            java.util.HashMap r8 = (java.util.HashMap) r8
            r8.put(r11, r12)
            int r8 = r0.f218977G
            int r8 = r8 + r9
            int r8 = r8 + r10
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11[r10] = r9
            java.lang.String r9 = "add recommend contact cursor %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r11)
            goto L_0x0275
        L_0x0271:
            r8.close()
        L_0x0274:
            r8 = 0
        L_0x0275:
            f40.C86709a0.m107528h()
            k40.a r9 = f40.C86709a0.m107533q(r5)
            f62.k0 r9 = (f62.C75700k0) r9
            com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
            java.util.List<java.lang.String> r10 = r0.f218986s
            r11 = 0
            android.database.Cursor r9 = r9.mo69699g4(r10, r11)
            int r10 = r9.getCount()
            r0.f218979I = r10
            if (r10 <= 0) goto L_0x02c1
            r7.add(r9)
            java.util.Map<java.lang.Integer, java.lang.String> r9 = r0.f218971A
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            com.tencent.mm.ui.contact.g1 r11 = r0.f219055d
            android.app.Activity r11 = r11.getActivity()
            r12 = 2131835505(0x7f113a71, float:1.930415E38)
            java.lang.String r11 = r11.getString(r12)
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.put(r10, r11)
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r0.f218972B
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.String r11 = "☆"
            r9.put(r11, r10)
            int r9 = r0.f218977G
            int r10 = r0.f218979I
            int r9 = r9 + r10
            int r8 = r8 + r9
            goto L_0x02c4
        L_0x02c1:
            r9.close()
        L_0x02c4:
            f40.C86709a0.m107528h()
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r9 = r5.mo96097Ni()
            java.util.List<java.lang.String> r12 = r0.f218986s
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r10 = "@all.contact.without.chatroom"
            java.lang.String r11 = ""
            android.database.Cursor r5 = r9.mo69721q3(r10, r11, r12, r13, r14, r15)
            r7.add(r5)
            java.util.List<java.lang.String> r5 = r0.f218986s
            java.lang.String r9 = "@all.contact.without.chatroom"
            java.lang.String r10 = ""
            r11 = 0
            java.lang.String[] r5 = eb0.C45628s0.m50804v(r11, r9, r10, r10, r5)
            java.util.List<java.lang.String> r12 = r0.f218986s
            int[] r9 = eb0.C45628s0.m50800t(r11, r9, r10, r12, r10)
            if (r5 == 0) goto L_0x0322
            if (r9 == 0) goto L_0x0322
            r10 = 0
        L_0x02f7:
            int r11 = r5.length
            if (r10 >= r11) goto L_0x0322
            int r11 = r9.length
            if (r10 >= r11) goto L_0x031f
            java.util.Map<java.lang.Integer, java.lang.String> r11 = r0.f218971A
            r12 = r9[r10]
            int r12 = r12 + r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = r5[r10]
            java.util.HashMap r11 = (java.util.HashMap) r11
            r11.put(r12, r13)
            java.util.Map<java.lang.String, java.lang.Integer> r11 = r0.f218972B
            r12 = r5[r10]
            r13 = r9[r10]
            int r13 = r13 + r8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r11 = (java.util.HashMap) r11
            r11.put(r12, r13)
            int r8 = r8 + 1
        L_0x031f:
            int r10 = r10 + 1
            goto L_0x02f7
        L_0x0322:
            android.database.MergeCursor r5 = new android.database.MergeCursor
            r8 = 0
            android.database.Cursor[] r9 = new android.database.Cursor[r8]
            java.lang.Object[] r7 = r7.toArray(r9)
            android.database.Cursor[] r7 = (android.database.Cursor[]) r7
            r5.<init>(r7)
            r0.f218993z = r5
        L_0x0332:
            android.database.Cursor r5 = r0.f218993z
            if (r5 == 0) goto L_0x0346
            android.database.MergeCursor r5 = (android.database.MergeCursor) r5
            int r5 = r5.getCount()
            java.util.Map<java.lang.Integer, java.lang.String> r7 = r0.f218971A
            java.util.HashMap r7 = (java.util.HashMap) r7
            int r7 = r7.size()
            int r5 = r5 + r7
            int r3 = r3 + r5
        L_0x0346:
            r0.f218979I = r3
            if (r22 == 0) goto L_0x0351
            com.tencent.mm.ui.contact.h1$a r5 = r0.f219051i
            if (r5 == 0) goto L_0x0351
            r5.mo62789t6(r1, r3, r2)
        L_0x0351:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            r3[r5] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            r3[r6] = r1
            r1 = 2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r22)
            r3[r1] = r2
            int r1 = r0.f218979I
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r3[r2] = r1
            java.lang.String r1 = "updateHeaderPosition, query:%s, isFinish:%b, searchEnd:%b, count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r3)
            r19.mo103564g()
            r19.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74469c2.mo103528A(java.lang.String, boolean, boolean):void");
    }

    public int getCount() {
        return this.f218979I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: gl3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: gl3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: gl3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: gl3.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: gl3.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: gl3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: gl3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: gl3.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: gl3.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gl3.C75922b mo7850h(int r14) {
        /*
            r13 = this;
            int r0 = r13.f218979I
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 2
            java.lang.String r5 = "MicroMsg.MultiSearchContactAdapter"
            if (r14 < r0) goto L_0x0020
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r2] = r14
            int r14 = r13.f218979I
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r1] = r14
            java.lang.String r14 = "createDataItem err %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r14, r0)
            return r3
        L_0x0020:
            java.util.List<java.lang.String> r0 = r13.f218980j
            if (r0 == 0) goto L_0x009c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x009c
            java.util.List<java.lang.String> r0 = r13.f218980j
            int r0 = r0.size()
            int r6 = r13.f218977G
            int r0 = r0 + r6
            if (r14 >= r0) goto L_0x0091
            if (r14 != 0) goto L_0x004c
            com.tencent.mm.ui.contact.g1 r0 = r13.f219055d
            android.app.Activity r0 = r0.getActivity()
            r1 = 2131835527(0x7f113a87, float:1.9304195E38)
            java.lang.String r0 = r0.getString(r1)
            gl3.r r1 = new gl3.r
            r1.<init>(r14)
            r1.f222731x = r0
            return r1
        L_0x004c:
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.util.List<java.lang.String> r3 = r13.f218980j
            int r4 = r13.f218977G
            int r4 = r14 - r4
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.storage.z1 r0 = r0.get(r3)
            gl3.h r3 = new gl3.h
            r3.<init>(r14)
            r3.mo106181j(r0)
            java.lang.String r14 = r0.getUsername()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85820U5(r14)
            if (r14 == 0) goto L_0x0086
            r3.f222608e = r2
            r3.f222611h = r2
            r3.f222610g = r2
            r3.f222680F = r1
            goto L_0x0090
        L_0x0086:
            boolean r14 = r13.f219057f
            r3.f222608e = r14
            boolean r14 = r13.f219058g
            r3.f222611h = r14
            r3.f222680F = r2
        L_0x0090:
            return r3
        L_0x0091:
            java.util.List<java.lang.String> r0 = r13.f218980j
            int r0 = r0.size()
            int r6 = r13.f218977G
            int r0 = r0 + r6
            int r0 = r0 + r2
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            int r6 = r13.f218973C
            r7 = 3
            if (r14 >= r6) goto L_0x011a
            java.util.List<java.lang.String> r6 = r13.f218988u
            java.util.Iterator r6 = r6.iterator()
        L_0x00a8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r9 = r13.f218981n
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r8)
            if (r9 != 0) goto L_0x00d7
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r2] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r9[r1] = r8
            int r8 = r13.f218979I
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r4] = r8
            java.lang.String r8 = "word:%s, position:%d, count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r8, r9)
            goto L_0x00a8
        L_0x00d7:
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r9 = r13.f218981n
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r8)
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            boolean r10 = r13.mo103537z()
            if (r10 == 0) goto L_0x010c
            if (r9 <= r7) goto L_0x010c
            java.util.Map<java.lang.String, java.lang.Boolean> r10 = r13.f218982o
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r8)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x00fe
            r9 = 3
        L_0x00fe:
            int r10 = r0 + r9
            int r11 = r13.f218977G
            int r10 = r10 + r11
            int r12 = r13.f218978H
            int r10 = r10 + r12
            if (r14 >= r10) goto L_0x0109
            goto L_0x0113
        L_0x0109:
            int r9 = r9 + r11
            int r9 = r9 + r12
            goto L_0x0117
        L_0x010c:
            int r10 = r0 + r9
            int r11 = r13.f218977G
            int r10 = r10 + r11
            if (r14 >= r10) goto L_0x0116
        L_0x0113:
            int r6 = r14 - r0
            goto L_0x011d
        L_0x0116:
            int r9 = r9 + r11
        L_0x0117:
            int r0 = r0 + r9
            goto L_0x00a8
        L_0x0119:
            r6 = r0
        L_0x011a:
            r8 = r3
            r0 = r6
            r6 = 0
        L_0x011d:
            if (r8 != 0) goto L_0x01b6
            java.util.Map<java.lang.Integer, java.lang.String> r6 = r13.f218971A
            int r0 = r14 - r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r7)
            if (r6 == 0) goto L_0x0145
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r13.f218971A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            gl3.r r1 = new gl3.r
            r1.<init>(r14)
            r1.f222731x = r0
            return r1
        L_0x0145:
            android.database.Cursor r6 = r13.f218993z
            java.util.Map<java.lang.Integer, java.lang.String> r7 = r13.f218971A
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x0154:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0169
            java.lang.Object r9 = r7.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r0 <= r9) goto L_0x0154
            int r8 = r8 + 1
            goto L_0x0154
        L_0x0169:
            int r0 = r0 - r8
            boolean r0 = r6.moveToPosition(r0)
            if (r0 == 0) goto L_0x01a0
            com.tencent.mm.storage.z1 r0 = new com.tencent.mm.storage.z1
            r0.<init>()
            android.database.Cursor r3 = r13.f218993z
            r0.convertFrom(r3)
            gl3.h r3 = new gl3.h
            r3.<init>(r14)
            r3.mo106181j(r0)
            java.lang.String r14 = r0.getUsername()
            boolean r14 = com.tencent.p014mm.storage.C72996z1.m85820U5(r14)
            if (r14 == 0) goto L_0x0195
            r3.f222608e = r2
            r3.f222611h = r2
            r3.f222610g = r2
            r3.f222680F = r1
            goto L_0x019f
        L_0x0195:
            boolean r14 = r13.f219057f
            r3.f222608e = r14
            boolean r14 = r13.f219058g
            r3.f222611h = r14
            r3.f222680F = r2
        L_0x019f:
            return r3
        L_0x01a0:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r2] = r14
            int r14 = r13.f218979I
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r1] = r14
            java.lang.String r14 = "create contact item error: position=%d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r14, r0)
            return r3
        L_0x01b6:
            r0 = 2131830472(0x7f1126c8, float:1.9293942E38)
            if (r6 != 0) goto L_0x01ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\""
            r1.append(r2)
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r2 = r13.mo103537z()
            if (r2 != 0) goto L_0x01e3
            com.tencent.mm.ui.contact.g1 r1 = r13.f219055d
            android.app.Activity r1 = r1.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r0)
        L_0x01e3:
            gl3.r r0 = new gl3.r
            r0.<init>(r14)
            r0.f222731x = r1
            goto L_0x0266
        L_0x01ec:
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r2 = r13.f218981n
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r8)
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            boolean r3 = r13.mo103537z()
            if (r3 == 0) goto L_0x0211
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = r13.f218982o
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r8)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            r7 = r2
        L_0x0212:
            if (r6 <= r7) goto L_0x022e
            java.util.Map<java.lang.String, java.lang.Boolean> r2 = r13.f218982o
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1 = r1 ^ r2
            gl3.u r2 = new gl3.u
            r2.<init>(r14)
            r2.f222762B = r0
            r2.f222763C = r1
        L_0x022c:
            r0 = r2
            goto L_0x0266
        L_0x022e:
            java.util.Map<java.lang.String, java.util.List<lv1.n>> r0 = r13.f218981n
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r8)
            java.util.List r0 = (java.util.List) r0
            int r2 = r6 + -1
            java.lang.Object r0 = r0.get(r2)
            lv1.n r0 = (lv1.C99681n) r0
            long r2 = r0.f292147a
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0261
            gl3.h r2 = new gl3.h
            r2.<init>(r14)
            r2.f222676B = r0
            boolean r14 = r13.f219057f
            r2.f222608e = r14
            r2.f222626w = r1
            int r6 = r6 + r1
            r2.f222625v = r6
            int r14 = r0.f292148b
            int r0 = r0.f292149c
            r2.f222624u = r14
            r2.f222623t = r0
            goto L_0x022c
        L_0x0261:
            gl3.t r0 = new gl3.t
            r0.<init>(r14)
        L_0x0266:
            r0.f222619p = r8
            boolean r14 = r0 instanceof gl3.C75921a
            if (r14 == 0) goto L_0x027b
            r14 = r0
            gl3.a r14 = (gl3.C75921a) r14
            java.util.Map<java.lang.String, lv1.i> r1 = r13.f218983p
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r8)
            lv1.i r1 = (lv1.C99672i) r1
            r14.f222603z = r1
        L_0x027b:
            int r14 = r13.f219059h
            r0.f222622s = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74469c2.mo7850h(int):gl3.b");
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.MultiSearchContactAdapter", "finish!");
        mo96748q();
    }

    /* renamed from: k */
    public int mo103530k() {
        return this.f218980j.size();
    }

    /* renamed from: l */
    public boolean mo103531l(AdapterView<?> adapterView, View view, int i, long j) {
        C75922b j2 = getItem(i - this.f219055d.mo7831f6().getHeaderViewsCount());
        if (j2 instanceof C75970u) {
            Map<String, Boolean> map = this.f218982o;
            String str = j2.f222619p;
            HashMap hashMap = (HashMap) map;
            hashMap.put(str, Boolean.valueOf(!((Boolean) hashMap.get(str)).booleanValue()));
            mo103528A((String) null, true, false);
            this.f219055d.mo7831f6().setSelection(this.f219055d.mo7831f6().getSelectedItemPosition());
            return true;
        }
        if (!Util.isNullOrNil(j2.f222619p) && (j2 instanceof C75939h)) {
            C72996z1 z1Var = ((C75939h) j2).f222600A;
            if (this.f218984q.contains(z1Var.getUsername())) {
                if (((HashMap) this.f218990w).get(j2.f222619p) != null) {
                    ((LinkedList) ((HashMap) this.f218990w).get(j2.f222619p)).remove(z1Var.getUsername());
                }
            } else {
                if (((HashMap) this.f218990w).get(j2.f222619p) == null) {
                    ((HashMap) this.f218990w).put(j2.f222619p, new LinkedList());
                }
                ((LinkedList) ((HashMap) this.f218990w).get(j2.f222619p)).add(z1Var.getUsername());
            }
            C74592y yVar = this.f218974D;
            yVar.f219250a = null;
            yVar.f219251b = null;
            ((LinkedList) yVar.f219252c).clear();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r4 = mo7850h(r4);
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo70169n(gl3.C75922b r4) {
        /*
            r3 = this;
            int r4 = r4.f222605b
            r0 = 1
            int r4 = r4 + r0
            int r1 = r3.f218979I
            if (r4 < r1) goto L_0x0009
            return r0
        L_0x0009:
            int r1 = r3.f218973C
            if (r4 < r1) goto L_0x001e
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r3.f218971A
            int r1 = r4 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.List<java.lang.String> r1 = r3.f218980j
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0032
            java.util.List<java.lang.String> r1 = r3.f218980j
            int r1 = r1.size()
            int r2 = r3.f218977G
            int r1 = r1 + r2
            if (r4 != r1) goto L_0x0032
            return r0
        L_0x0032:
            int r1 = r3.f218973C
            r2 = 0
            if (r4 >= r1) goto L_0x0044
            gl3.b r4 = r3.mo7850h(r4)
            if (r4 != 0) goto L_0x0042
            boolean r4 = r4 instanceof gl3.C75957r
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            return r0
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74469c2.mo70169n(gl3.b):boolean");
    }

    /* renamed from: q */
    public void mo96748q() {
        ((HashMap) this.f218990w).clear();
        ((HashMap) this.f218982o).clear();
        mo103536x();
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b A[LOOP:2: B:22:0x0099->B:23:0x009b, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63130r(java.lang.String r7, int[] r8, boolean r9) {
        /*
            r6 = this;
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f218981n = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r6.f218983p = r9
            java.util.List<java.lang.String> r9 = r6.f218980j
            r9.clear()
            android.database.Cursor r9 = r6.f218993z
            if (r9 == 0) goto L_0x002b
            r9.close()
            r9 = 0
            r6.f218993z = r9
            java.util.Map<java.lang.Integer, java.lang.String> r9 = r6.f218971A
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.clear()
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r6.f218972B
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.clear()
        L_0x002b:
            r9 = 0
            r6.f218979I = r9
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = " "
            java.lang.String[] r1 = r7.split(r1)
            int r2 = r1.length
            r3 = 0
        L_0x003b:
            if (r3 >= r2) goto L_0x004f
            r4 = r1[r3]
            java.lang.String r5 = r4.trim()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x004c
            r0.add(r4)
        L_0x004c:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x004f:
            java.util.Map<java.lang.String, java.util.LinkedList<java.lang.String>> r1 = r6.f218990w
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.List<java.lang.String> r1 = r6.f218988u
            if (r1 == 0) goto L_0x0084
            int r1 = r0.size()
            java.util.List<java.lang.String> r2 = r6.f218988u
            int r2 = r2.size()
            if (r1 == r2) goto L_0x006b
            goto L_0x008a
        L_0x006b:
            java.util.Iterator r1 = r0.iterator()
        L_0x006f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0084
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<java.lang.String> r3 = r6.f218988u
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x006f
            goto L_0x008a
        L_0x0084:
            java.util.List<java.lang.String> r1 = r6.f218988u
            if (r1 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = r1
        L_0x008a:
            r6.f218988u = r0
            r6.f218989v = r9
            r6.f218991x = r8
            java.util.List<java.lang.Integer> r0 = r6.f218992y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            int r0 = r8.length
            r1 = 0
        L_0x0099:
            if (r1 >= r0) goto L_0x00ab
            r2 = r8[r1]
            java.util.List<java.lang.Integer> r3 = r6.f218992y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00ab:
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r9] = r7
            java.util.List<java.lang.String> r7 = r6.f218988u
            r9 = 1
            r8[r9] = r7
            java.lang.String r7 = "MicroMsg.MultiSearchContactAdapter"
            java.lang.String r9 = "doSearch: queryString:%s, queryWords:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r8)
            r6.mo103534v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74469c2.mo63130r(java.lang.String, int[], boolean):void");
    }

    /* renamed from: s */
    public int mo103532s(String str) {
        if (((HashMap) this.f218972B).get(str) != null) {
            return ((Integer) ((HashMap) this.f218972B).get(str)).intValue() + this.f218973C;
        }
        return 0;
    }

    /* renamed from: u */
    public boolean mo103533u() {
        return mo103537z();
    }

    /* renamed from: v */
    public final boolean mo103534v() {
        if (((ArrayList) this.f218992y).size() > 0 && this.f218988u.size() > 0) {
            HashSet<String> hashSet = new HashSet<>();
            int intValue = ((Integer) ((ArrayList) this.f218992y).remove(0)).intValue();
            C76728k kVar = new C76728k();
            kVar.f224468c = this.f218988u.get(this.f218989v);
            kVar.f224472g = new int[]{intValue};
            kVar.f224475j = hashSet;
            kVar.f224478m = this.f218976F;
            kVar.f224479n = this.f218975E;
            if (intValue == 131075) {
                kVar.f224467b = 32;
                kVar.f224477l = C100218a.f293644d;
            } else {
                kVar.f224467b = 16;
                kVar.f224477l = C100219b.f293645d;
            }
            this.f218987t = ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
            return false;
        } else if (this.f218989v >= this.f218988u.size() - 1) {
            return true;
        } else {
            this.f218989v++;
            ((ArrayList) this.f218992y).clear();
            for (int valueOf : this.f218991x) {
                ((ArrayList) this.f218992y).add(Integer.valueOf(valueOf));
            }
            mo103534v();
            return false;
        }
    }

    /* renamed from: w */
    public String mo103535w() {
        Iterator it = ((HashMap) this.f218990w).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            for (String str2 : (String[]) ((LinkedList) ((HashMap) this.f218990w).get(str)).toArray(new String[0])) {
                if (!this.f218984q.contains(str2)) {
                    ((LinkedList) ((HashMap) this.f218990w).get(str)).remove(str2);
                }
            }
        }
        Iterator it4 = ((HashMap) this.f218990w).keySet().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            String str3 = (String) it4.next();
            if (((LinkedList) ((HashMap) this.f218990w).get(str3)).size() == 0) {
                ((HashMap) this.f218990w).remove(str3);
                break;
            }
        }
        String str4 = "";
        for (String next : this.f218988u) {
            if (!((HashMap) this.f218990w).containsKey(next)) {
                str4 = str4 + next + " ";
            }
        }
        if (Util.isNullOrNil(str4) && mo103537z()) {
            str4 = " ";
        }
        Log.m105925i("MicroMsg.MultiSearchContactAdapter", "getRealSearchText %s", str4);
        return str4;
    }

    /* renamed from: x */
    public final void mo103536x() {
        this.f218989v = 0;
        this.f218981n = new HashMap();
        this.f218983p = new HashMap();
        this.f218980j.clear();
        Cursor cursor = this.f218993z;
        if (cursor != null) {
            cursor.close();
            this.f218993z = null;
            this.f218971A.clear();
            this.f218972B.clear();
        }
        mo103564g();
        notifyDataSetChanged();
        if (this.f218987t != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f218987t);
            this.f218987t = null;
        }
        mo103564g();
    }

    /* renamed from: z */
    public final boolean mo103537z() {
        List<String> list = this.f218988u;
        return list != null && list.size() > 1;
    }
}
