package wz1;

import android.content.Context;
import android.util.Pair;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75698i0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o90.C100308d;
import p823sg.C101611g;
import p823sg.C90193h;
import q90.C101062d;
import sz1.C77815b;
import te3.C64428hr2;
import te3.C64452ir2;
import xz1.C79013a;
import xz1.C79014b;
import xz1.C79015c;
import z51.C79305f;
import zt3.C119157j;

/* renamed from: wz1.b */
public class C78747b {

    /* renamed from: a */
    public static final C101611g<Integer, C79013a> f230457a = new C100308d(32);

    /* renamed from: wz1.b$a */
    public class C78748a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f230458d;

        public C78748a(String str) {
            this.f230458d = str;
        }

        public void run() {
            boolean z;
            boolean z2;
            Class cls = C77815b.class;
            C78746a c = ((C77815b) C86312j.m106911c(cls)).vx0().mo108666c(this.f230458d);
            if (c == null) {
                Log.m105924i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "deleteExpireGroupSolitatire() chatRoomGroupSolitatire == null");
                return;
            }
            List<C79013a> Lo = ((C77815b) C86312j.m106911c(cls)).xx0().mo108979Lo(this.f230458d, 1, c.f230453b);
            if (((ArrayList) Lo).size() > 0) {
                z = ((C77815b) C86312j.m106911c(cls)).xx0().mo108983jo(this.f230458d, 1, c.f230453b);
                if (c.f230452a) {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108684e(Lo, 2);
                } else {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108684e(Lo, 1);
                }
            } else {
                z = false;
            }
            List<C79013a> Lo2 = ((C77815b) C86312j.m106911c(cls)).xx0().mo108979Lo(this.f230458d, 0, c.f230455d);
            if (((ArrayList) Lo2).size() > 0) {
                z2 = ((C77815b) C86312j.m106911c(cls)).xx0().mo108983jo(this.f230458d, 0, c.f230455d);
                if (c.f230454c) {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108684e(Lo2, 2);
                } else {
                    ((C77815b) C86312j.m106911c(cls)).wx0().mo108684e(Lo2, 1);
                }
            } else {
                z2 = false;
            }
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "deleteExpireGroupSolitatire() activeResult:%s unActiveResult:%s", Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* renamed from: wz1.b$b */
    public class C78749b implements Comparator<C79014b> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C79014b) obj).f232013d, ((C79014b) obj2).f232013d);
        }
    }

    /* renamed from: wz1.b$c */
    public class C78750c implements Comparator<C79014b> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C79014b) obj).f232013d, ((C79014b) obj2).f232013d);
        }
    }

    /* renamed from: wz1.b$d */
    public class C78751d implements Comparator<C79014b> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C79014b) obj).f232013d, ((C79014b) obj2).f232013d);
        }
    }

    /* renamed from: wz1.b$e */
    public class C78752e implements Comparator<C79014b> {
        public int compare(Object obj, Object obj2) {
            return Long.compare(((C79014b) obj).f232013d, ((C79014b) obj2).f232013d);
        }
    }

    /* renamed from: A */
    public static C79013a m95089A(C79013a aVar, C79013a aVar2, String str, int i) {
        Class cls = C77815b.class;
        if (!(aVar == null || aVar2 == null)) {
            if (i == 1) {
                if (!Util.isEqual(str, aVar2.field_creator) || aVar.f232007N.size() > 1) {
                    return aVar2;
                }
            } else if (i != 2 && (i != 3 || !aVar.f232006M)) {
                return aVar2;
            }
            C79015c xx02 = ((C77815b) C86312j.m106911c(cls)).xx0();
            xx02.getClass();
            boolean delete = xx02.delete(aVar2.systemRowid);
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireStorage", "deleteSolitatire ret:%s deleteRet:%s", Boolean.valueOf(delete), Integer.valueOf(xx02.f232020d.delete("GroupSolitatire", "username=? and key=?", new String[]{aVar2.field_username, aVar2.field_key})));
            if (delete) {
                ((C77815b) C86312j.m106911c(cls)).vx0().mo108665b(aVar2.field_username, aVar2.field_key);
            }
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "handleSolitatireLossEfficacy key:%s result:%s", aVar2.field_key, Boolean.valueOf(delete));
            return null;
        }
        return aVar2;
    }

    /* renamed from: B */
    public static boolean m95090B(Context context, String str) {
        if (Util.isNullOrNil(str) || context == null) {
            return false;
        }
        String trim = str.trim();
        return Util.isEqual(trim, context.getString(C0966R.string.ffa)) || Util.isEqual(trim, context.getString(C0966R.string.ffb));
    }

    /* renamed from: C */
    public static boolean m95091C(C79013a aVar) {
        if (aVar == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if (aVar.f232005L == 1) {
            sb.append(aVar.f232001H);
        }
        sb.append(aVar.f232002I);
        sb.append(aVar.f232003J);
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_android_solitaire_keyword_regex, "(接龙|报名|参加|参与|活动|组织|投票|回复|统计)");
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "exampleRegex:%s", Y60);
        return Pattern.compile(Y60).matcher(sb.toString()).find();
    }

    /* renamed from: D */
    public static boolean m95092D(Context context, String str) {
        if (Util.isNullOrNil(str) || context == null) {
            return false;
        }
        String trim = str.trim();
        return trim.startsWith(context.getString(C0966R.string.ffa)) || trim.startsWith(context.getString(C0966R.string.ffb));
    }

    /* renamed from: E */
    public static boolean m95093E(String str) {
        return m95125y(str) > m95122v() * 2;
    }

    /* renamed from: F */
    public static boolean m95094F(String str) {
        return m95125y(str) > m95121u() * 2;
    }

    /* renamed from: G */
    public static boolean m95095G(C72963f4 f4Var) {
        Class cls = C77815b.class;
        if (f4Var == null) {
            return false;
        }
        String t = f4Var.mo108768t();
        String str = f4Var.f230737U;
        if (!((C75698i0) C86312j.m106911c(C75698i0.class)).Mq0(t)) {
            return false;
        }
        C79013a f = ((C77815b) C86312j.m106911c(cls)).vx0().mo108668f(t, str);
        C78746a c = ((C77815b) C86312j.m106911c(cls)).vx0().mo108666c(t);
        return f != null && c != null && f.field_active == 1 && f.field_lastActiveTime >= c.f230453b && f.f232007N.size() < m95123w() && f4Var.getMsgId() >= f.field_firstMsgId;
    }

    /* renamed from: H */
    public static boolean m95096H(C79013a aVar, C79013a aVar2, long j, boolean z, String str, boolean z2, boolean z3, long j2) {
        Class cls = C75700k0.class;
        Class cls2 = C77815b.class;
        C79013a I = m95097I(aVar, aVar2, str, z2, z3);
        if (I != null && I.field_firstMsgId == 0) {
            I.field_firstMsgId = j;
        }
        I.field_lastActiveTime = j2;
        boolean K = m95099K(I, aVar2 != null, z);
        if (j != 0 && K) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
            b002.f230737U = aVar.field_key;
            b002.f230755r = true;
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j, b002);
            if (z && aVar2 != null && aVar2.field_active == 0 && I.f232007N.size() > 1) {
                ((C77815b) C86312j.m106911c(cls2)).wx0().mo108681b(I, str);
            }
            if (aVar2 == null) {
                C79013a Ow = ((C77815b) C86312j.m106911c(cls2)).xx0().mo108980Ow(I.field_username, I.field_key, true);
                if (Ow.field_msgSvrId == 0) {
                    Ow.field_msgSvrId = b002.mo108774y2();
                    ((C77815b) C86312j.m106911c(cls2)).xx0().mo108984kD(Ow, true);
                }
            }
        }
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "mergeAndSaveGroupSolitatire() key:%s msgId:%s ret:%s", I.field_key, Long.valueOf(j), Boolean.valueOf(K));
        return K;
    }

    /* renamed from: I */
    public static C79013a m95097I(C79013a aVar, C79013a aVar2, String str, boolean z, boolean z2) {
        if (aVar == null && aVar2 == null) {
            return null;
        }
        if (aVar == null && aVar2 != null) {
            return aVar2;
        }
        if ((aVar != null && aVar2 == null) || !Util.isEqual(aVar.field_key, aVar2.field_key)) {
            return aVar;
        }
        C79013a l2 = aVar2.clone();
        LinkedHashSet<C79014b> linkedHashSet = new LinkedHashSet<>();
        if (z2) {
            for (int i = 1; i <= aVar.f232007N.size(); i++) {
                C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
                if (!linkedHashSet.contains(bVar)) {
                    linkedHashSet.add(bVar);
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            for (int i2 = 1; i2 <= aVar2.f232007N.size(); i2++) {
                C79014b bVar2 = aVar2.f232007N.get(Integer.valueOf(i2));
                if (!Util.isEqual(bVar2.f232010a, str)) {
                    linkedHashSet.add(bVar2);
                } else {
                    hashSet.add(bVar2);
                    hashMap.put(bVar2.f232014e, bVar2);
                }
            }
            for (int i3 = 1; i3 <= aVar.f232007N.size(); i3++) {
                C79014b bVar3 = aVar.f232007N.get(Integer.valueOf(i3));
                if (!linkedHashSet.contains(bVar3) && Util.isEqual(bVar3.f232010a, str)) {
                    if (z) {
                        linkedHashSet.add(bVar3);
                    } else {
                        C79014b bVar4 = (C79014b) hashMap.get(bVar3.f232014e);
                        if (bVar4 == null) {
                            linkedHashSet.add(bVar3);
                        } else {
                            linkedHashSet.add(bVar4);
                        }
                    }
                }
            }
        }
        l2.f232007N.clear();
        ArrayList arrayList = new ArrayList();
        for (C79014b add : linkedHashSet) {
            arrayList.add(add);
        }
        Collections.sort(arrayList, new C78750c());
        int i4 = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i4++;
            l2.f232007N.put(Integer.valueOf(i4), (C79014b) it.next());
        }
        l2.f232009Q = aVar.f232009Q;
        return l2;
    }

    /* renamed from: J */
    public static C79013a m95098J(C79013a aVar, C79013a aVar2, C79013a aVar3) {
        C79014b bVar;
        if (aVar == null && aVar3 == null) {
            return null;
        }
        if (aVar == null && aVar3 != null) {
            return aVar3;
        }
        if ((aVar != null && aVar3 == null) || !Util.isEqual(aVar.field_key, aVar3.field_key)) {
            return aVar;
        }
        C79013a l2 = aVar3.clone();
        LinkedHashSet<C79014b> linkedHashSet = new LinkedHashSet<>();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet<C79014b> linkedHashSet3 = new LinkedHashSet<>();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= aVar3.f232007N.size(); i++) {
            C79014b a = aVar3.f232007N.get(Integer.valueOf(i)).clone();
            if (Util.isEqual(a.f232010a, C75592q0.m90789s())) {
                linkedHashSet2.add(a);
                hashMap.put(a.f232014e, a);
                arrayList.add(a);
            } else {
                linkedHashSet.add(a);
            }
        }
        if (aVar2 != null) {
            for (int i2 = 1; i2 <= aVar2.f232007N.size(); i2++) {
                linkedHashSet4.add(aVar2.f232007N.get(Integer.valueOf(i2)).clone());
            }
        }
        for (int i3 = 1; i3 <= aVar.f232007N.size(); i3++) {
            C79014b bVar2 = aVar.f232007N.get(Integer.valueOf(i3));
            if (!linkedHashSet.contains(bVar2) && (!linkedHashSet4.contains(bVar2) || linkedHashSet2.contains(bVar2))) {
                linkedHashSet3.add(bVar2);
            }
        }
        for (C79014b bVar3 : linkedHashSet3) {
            if (linkedHashSet2.contains(bVar3)) {
                arrayList.remove(bVar3);
            }
        }
        for (C79014b bVar4 : linkedHashSet3) {
            if (linkedHashSet2.contains(bVar4)) {
                C79014b bVar5 = (C79014b) hashMap.get(bVar4.f232014e);
                if (bVar5 == null) {
                    linkedHashSet.add(bVar4);
                } else {
                    linkedHashSet.add(bVar5);
                }
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    }
                    bVar = (C79014b) it.next();
                    if (Util.isEqual(bVar.f232015f, bVar4.f232015f)) {
                        break;
                    }
                }
                if (bVar == null) {
                    linkedHashSet.add(bVar4);
                } else {
                    arrayList.remove(bVar);
                    bVar.f232014e = bVar4.f232014e;
                    linkedHashSet.add(bVar);
                }
            }
        }
        l2.f232007N.clear();
        ArrayList arrayList2 = new ArrayList();
        for (C79014b add : linkedHashSet) {
            arrayList2.add(add);
        }
        Collections.sort(arrayList2, new C78749b());
        int i4 = 0;
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            i4++;
            l2.f232007N.put(Integer.valueOf(i4), (C79014b) it4.next());
        }
        l2.f232009Q = aVar.f232009Q;
        return l2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m95099K(xz1.C79013a r17, boolean r18, boolean r19) {
        /*
            r0 = r17
            java.lang.Class<sz1.b> r1 = sz1.C77815b.class
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.Class<f62.i0> r3 = f62.C75698i0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            f62.i0 r3 = (f62.C75698i0) r3
            java.lang.String r4 = r0.field_username
            boolean r3 = r3.Mq0(r4)
            if (r3 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.field_key
            r3[r2] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r18)
            r5 = 1
            r3[r5] = r4
            r4 = 2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r19)
            r3[r4] = r6
            r4 = 3
            java.util.HashMap<java.lang.Integer, xz1.b> r6 = r0.f232007N
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r4] = r6
            java.lang.String r4 = "MicroMsg.groupsolitaire.GroupSolitatireHelp"
            java.lang.String r6 = "saveGroupSolitatire key:%s exist:%s supportOnlyOne:%s num:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            if (r18 == 0) goto L_0x0060
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r0.f232007N
            int r3 = r3.size()
            int r6 = m95123w()
            if (r3 <= r6) goto L_0x0051
            goto L_0x006a
        L_0x0051:
            di3.d r3 = di3.C86312j.m106911c(r1)
            sz1.b r3 = (sz1.C77815b) r3
            xz1.c r3 = r3.xx0()
            boolean r3 = r3.mo108984kD(r0, r2)
            goto L_0x007a
        L_0x0060:
            if (r19 == 0) goto L_0x006c
            java.util.HashMap<java.lang.Integer, xz1.b> r3 = r0.f232007N
            int r3 = r3.size()
            if (r3 <= r5) goto L_0x006c
        L_0x006a:
            r3 = 0
            goto L_0x007a
        L_0x006c:
            di3.d r3 = di3.C86312j.m106911c(r1)
            sz1.b r3 = (sz1.C77815b) r3
            xz1.c r3 = r3.xx0()
            boolean r3 = r3.insert(r0)
        L_0x007a:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r6[r2] = r7
            java.lang.String r7 = "saveGroupSolitatire() ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r6)
            if (r3 == 0) goto L_0x0156
            di3.d r6 = di3.C86312j.m106911c(r1)
            sz1.b r6 = (sz1.C77815b) r6
            wz1.c r6 = r6.vx0()
            java.lang.String r7 = r0.field_username
            r6.getClass()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r2] = r7
            java.lang.String r9 = "MicroMsg.groupsolitaire.GroupSolitatireManager"
            java.lang.String r10 = "updateChatRoomGroupSolitatire() username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x00ac
            goto L_0x0140
        L_0x00ac:
            wz1.a r8 = new wz1.a
            r8.<init>()
            int r9 = eb0.C31543z5.m39455e()
            long r9 = (long) r9
            r8.f230456e = r9
            di3.d r9 = di3.C86312j.m106911c(r1)
            sz1.b r9 = (sz1.C77815b) r9
            xz1.c r9 = r9.xx0()
            java.util.List r9 = r9.mo108985qq(r7, r2)
            di3.d r10 = di3.C86312j.m106911c(r1)
            sz1.b r10 = (sz1.C77815b) r10
            xz1.c r10 = r10.xx0()
            java.util.List r10 = r10.mo108985qq(r7, r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r11 = r9.size()
            int r12 = m95119s()
            if (r11 <= r12) goto L_0x00f2
            r8.f230454c = r2
            int r11 = m95119s()
            int r11 = r11 - r5
            java.lang.Object r9 = r9.get(r11)
            xz1.a r9 = (xz1.C79013a) r9
            long r11 = r9.field_lastActiveTime
            r8.f230455d = r11
            goto L_0x0109
        L_0x00f2:
            r8.f230454c = r5
            int r9 = eb0.C31543z5.m39455e()
            long r11 = (long) r9
            int r9 = m95116p()
            long r13 = (long) r9
            java.lang.Long r9 = xz1.C79015c.f232017f
            long r15 = r9.longValue()
            long r13 = r13 * r15
            long r11 = r11 - r13
            r8.f230455d = r11
        L_0x0109:
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r9 = r10.size()
            int r11 = m95118r()
            if (r9 <= r11) goto L_0x0127
            r8.f230452a = r2
            int r9 = m95118r()
            int r9 = r9 - r5
            java.lang.Object r9 = r10.get(r9)
            xz1.a r9 = (xz1.C79013a) r9
            long r9 = r9.field_lastActiveTime
            r8.f230453b = r9
            goto L_0x013b
        L_0x0127:
            r8.f230452a = r5
            int r9 = eb0.C31543z5.m39455e()
            long r9 = (long) r9
            r11 = 5
            long r11 = (long) r11
            java.lang.Long r13 = xz1.C79015c.f232016e
            long r13 = r13.longValue()
            long r11 = r11 * r13
            long r9 = r9 - r11
            r8.f230453b = r9
        L_0x013b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, wz1.a> r6 = r6.f230463e
            r6.put(r7, r8)
        L_0x0140:
            di3.d r1 = di3.C86312j.m106911c(r1)
            sz1.b r1 = (sz1.C77815b) r1
            wz1.c r1 = r1.vx0()
            java.lang.String r6 = r0.field_username
            java.lang.String r7 = r0.field_key
            r1.mo108665b(r6, r7)
            java.lang.String r1 = r0.field_username
            m95103c(r1)
        L_0x0156:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r2] = r0
            java.lang.String r0 = "saveGroupSolitatire() groupSolitatire:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wz1.C78747b.m95099K(xz1.a, boolean, boolean):boolean");
    }

    /* renamed from: L */
    public static void m95100L(long j, String str, C79013a aVar) {
        String str2;
        String str3;
        Class cls = C75700k0.class;
        if (aVar == null) {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg: groupSolitatire is null");
        } else if (j != 0) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
            C79013a Ow = ((C77815b) C86312j.m106911c(C77815b.class)).xx0().mo108980Ow(aVar.field_username, aVar.field_key, false);
            C64428hr2 hr22 = new C64428hr2();
            if (b002.mo100993e4()) {
                str2 = b002.getContent();
            } else if (b002.mo100977P3()) {
                C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                if (u == null) {
                    Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg: amc is null");
                    return;
                }
                str2 = u.f195570f;
            } else {
                str2 = "";
            }
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg: content is null");
                return;
            }
            if (Ow != null) {
                str3 = Ow.f232004K;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i = 1; i <= Ow.f232007N.size(); i++) {
                    C79014b bVar = Ow.f232007N.get(Integer.valueOf(i));
                    if (bVar != null && Util.isEqual(bVar.f232010a, str)) {
                        linkedHashSet.add(bVar);
                    }
                }
                for (int i2 = 1; i2 <= aVar.f232007N.size(); i2++) {
                    C79014b bVar2 = aVar.f232007N.get(Integer.valueOf(i2));
                    if (bVar2 != null) {
                        if (linkedHashSet.contains(bVar2)) {
                            bVar2.f232010a = str;
                        } else {
                            bVar2.f232010a = "";
                        }
                    }
                }
            } else {
                str3 = aVar.f232004K;
            }
            for (int i3 = aVar.f232005L == 0 ? 2 : 1; i3 <= aVar.f232007N.size(); i3++) {
                C79014b bVar3 = aVar.f232007N.get(Integer.valueOf(i3));
                if (!Util.isNullOrNil(bVar3.f232014e) && !Util.isNullOrNil(bVar3.f232014e.trim())) {
                    bVar3.f232014e = bVar3.f232014e.trim();
                    if (Util.isEqual(bVar3.f232010a, str)) {
                        hr22.f183545e.add(m95117q(str2, str3, bVar3, i3));
                    }
                }
            }
            if (hr22.f183545e.size() <= 0) {
                HashMap<Integer, C79014b> hashMap = aVar.f232007N;
                hr22.f183545e.add(m95117q(str2, str3, hashMap.get(Integer.valueOf(hashMap.size())), aVar.f232007N.size()));
            }
            if ((aVar.f232005L == 0 ? (aVar.f232007N.size() - hr22.f183545e.size()) - 1 : aVar.f232007N.size() - hr22.f183545e.size()) < 2) {
                Log.m105918d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg fold condition min num is not");
                return;
            }
            hr22.f183547g = aVar.f232005L;
            hr22.f183548h = aVar.f232007N.size() - hr22.f183545e.size();
            hr22.f183549i = aVar.field_msgSvrId;
            hr22.f183550j = aVar.field_key;
            if (aVar.f232005L == 0) {
                hr22.f183544d.add(m95117q(str2, str3, aVar.f232007N.get(1), 1));
            } else {
                String str4 = aVar.f232001H;
                if (str4 != null && !Util.isNullOrNil(str4.trim())) {
                    C64452ir2 ir22 = new C64452ir2();
                    m95104d(ir22, str2, aVar.f232001H.trim());
                    hr22.f183544d.add(ir22);
                }
                String str5 = aVar.f232002I;
                if (str5 != null && !Util.isNullOrNil(str5.trim())) {
                    Pair<Integer, Integer> x = m95124x(str2, aVar.f232002I.trim());
                    C64452ir2 ir23 = new C64452ir2();
                    if (x == null) {
                        ir23.f183730e = 0;
                        ir23.f183731f = 0;
                    } else {
                        if (hr22.f183544d.size() > 0) {
                            ir23.f183729d = "\n";
                        }
                        ir23.f183730e = ((Integer) x.first).intValue();
                        ir23.f183731f = ((Integer) x.first).intValue() + ((Integer) x.second).intValue();
                    }
                    hr22.f183544d.add(ir23);
                }
            }
            String str6 = aVar.f232003J;
            if (str6 != null && !Util.isNullOrNil(str6.trim())) {
                C64452ir2 ir24 = new C64452ir2();
                m95104d(ir24, str2, aVar.f232003J.trim());
                hr22.f183546f = ir24;
            }
            b002.mo108747a3(hr22);
            try {
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg msgId:%s", Long.valueOf(b002.getMsgId()));
        } else {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg msgId == 0");
        }
    }

    /* renamed from: a */
    public static String m95101a(String str, C79013a aVar, boolean z) {
        if (aVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<solitaire>");
        sb.append("<tt>");
        sb.append(m95109i(str, aVar.f232001H));
        sb.append("</tt>");
        sb.append("<ex>");
        sb.append(m95109i(str, aVar.f232002I));
        sb.append("</ex>");
        sb.append("<tl>");
        sb.append(m95109i(str, aVar.f232003J));
        sb.append("</tl>");
        sb.append("<s>");
        sb.append(Util.escapeStringForXml(aVar.f232004K));
        sb.append("</s>");
        sb.append("<au>");
        sb.append(aVar.field_creator);
        sb.append("</au>");
        sb.append("<hrt>");
        sb.append(aVar.f232005L + "");
        sb.append("</hrt>");
        sb.append("<loss>");
        sb.append(z ? 1 : 0);
        sb.append("</loss>");
        sb.append("<content>");
        sb.append("<s>");
        sb.append(aVar.f232007N.size());
        sb.append("</s>");
        for (int i = 1; i <= aVar.f232007N.size(); i++) {
            C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
            if (bVar != null) {
                sb.append("<i>");
                sb.append("<u>");
                sb.append(bVar.f232010a);
                sb.append("</u>");
                sb.append("<h>");
                sb.append(bVar.f232011b);
                sb.append("</h>");
                sb.append("<s>");
                sb.append(Util.escapeStringForXml(bVar.f232012c));
                sb.append("</s>");
                sb.append("<t>");
                sb.append(bVar.f232013d);
                sb.append("</t>");
                Pair<Integer, Integer> x = m95124x(str, bVar.f232014e);
                if (x == null) {
                    sb.append("<c>");
                    sb.append(Util.escapeStringForXml(bVar.f232014e));
                    sb.append("</c>");
                } else {
                    sb.append("<r>");
                    sb.append(x.first + "-" + x.second);
                    sb.append("</r>");
                }
                sb.append("</i>");
            }
        }
        sb.append("</content>");
        sb.append("</solitaire>");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m95102b(C79013a aVar) {
        if (aVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<solitaire>");
        sb.append("<tt>");
        sb.append(Util.escapeStringForXml(aVar.f232001H));
        sb.append("</tt>");
        sb.append("<ex>");
        sb.append(Util.escapeStringForXml(aVar.f232002I));
        sb.append("</ex>");
        sb.append("<tl>");
        sb.append(Util.escapeStringForXml(aVar.f232003J));
        sb.append("</tl>");
        sb.append("<s>");
        sb.append(Util.escapeStringForXml(aVar.f232004K));
        sb.append("</s>");
        sb.append("<au>");
        sb.append(aVar.field_creator);
        sb.append("</au>");
        sb.append("<hrt>");
        sb.append(aVar.f232005L + "");
        sb.append("</hrt>");
        sb.append("<content>");
        sb.append("<s>");
        sb.append(aVar.f232007N.size());
        sb.append("</s>");
        for (int i = 1; i <= aVar.f232007N.size(); i++) {
            C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
            if (bVar != null) {
                sb.append("<i>");
                sb.append("<u>");
                sb.append(bVar.f232010a);
                sb.append("</u>");
                sb.append("<h>");
                sb.append(bVar.f232011b);
                sb.append("</h>");
                sb.append("<s>");
                sb.append(Util.escapeStringForXml(bVar.f232012c));
                sb.append("</s>");
                sb.append("<t>");
                sb.append(bVar.f232013d);
                sb.append("</t>");
                sb.append("<c>");
                sb.append(Util.escapeStringForXml(bVar.f232014e));
                sb.append("</c>");
                sb.append("<o>");
                sb.append(bVar.f232015f);
                sb.append("</o>");
                sb.append("</i>");
            }
        }
        sb.append("</content>");
        sb.append("</solitaire>");
        return sb.toString();
    }

    /* renamed from: c */
    public static void m95103c(String str) {
        Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "deleteExpireGroupSolitatire() batch delete expire data!! (%s)", str);
        if (!Util.isNullOrNil(str) && C72996z1.m85820U5(str)) {
            ((C119157j) C119157j.f356862d).mo183879j(new C78748a(str), 1000, "deleteExpireGroupSolitatire");
        }
    }

    /* renamed from: d */
    public static void m95104d(C64452ir2 ir22, String str, String str2) {
        Pair<Integer, Integer> x = m95124x(str, str2);
        if (x == null) {
            ir22.f183730e = 0;
            ir22.f183731f = 0;
            return;
        }
        ir22.f183730e = ((Integer) x.first).intValue();
        ir22.f183731f = ((Integer) x.first).intValue() + ((Integer) x.second).intValue();
    }

    /* renamed from: e */
    public static void m95105e(String str, C79013a aVar) {
        if (aVar != null) {
            String s = C75592q0.m90789s();
            if (Util.isNullOrNil(aVar.field_creator)) {
                aVar.field_creator = s;
            }
            if (Util.isNullOrNil(aVar.field_username)) {
                aVar.field_username = str;
            }
            for (int i = 1; i <= aVar.f232007N.size(); i++) {
                C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
                if (Util.isNullOrNil(bVar.f232010a)) {
                    bVar.f232010a = s;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m95106f(String str, String str2, C79013a aVar, long j, boolean z) {
        Class cls = C79305f.class;
        if (aVar != null) {
            aVar.field_key = m95115o(aVar);
            aVar.field_lastActiveTime = j;
            if (z) {
                aVar.field_active = 1;
            } else {
                aVar.field_active = 0;
            }
            if (Util.isNullOrNil(aVar.field_username)) {
                aVar.field_username = str;
            }
            if (Util.isNullOrNil(aVar.field_creator)) {
                aVar.field_creator = str2;
            }
            HashMap<Integer, C79014b> hashMap = new HashMap<>();
            HashSet hashSet = new HashSet();
            aVar.f232008P = false;
            aVar.f232001H = aVar.f232001H.trim();
            aVar.f232002I = aVar.f232002I.trim();
            aVar.f232003J = aVar.f232003J.trim();
            for (int i = 1; i <= aVar.f232007N.size(); i++) {
                C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
                if (!Util.isNullOrNil(bVar.f232014e) && !Util.isNullOrNil(bVar.f232014e.trim())) {
                    bVar.f232014e = bVar.f232014e.trim();
                    if (hashSet.contains(((C79305f) C86312j.m106911c(cls)).mo109308IF(bVar.f232014e))) {
                        aVar.f232008P = true;
                    }
                    hashSet.add(((C79305f) C86312j.m106911c(cls)).mo109308IF(bVar.f232014e));
                    hashMap.put(Integer.valueOf(hashMap.size() + 1), bVar);
                    if (bVar.f232013d == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                        bVar.f232013d = j;
                    }
                    if (Util.isNullOrNil(bVar.f232010a)) {
                        bVar.f232010a = str2;
                    }
                }
            }
            aVar.f232007N = hashMap;
        }
    }

    /* renamed from: g */
    public static void m95107g(String str, String str2, C79013a aVar, long j, boolean z) {
        long e = (long) C31543z5.m39455e();
        if (j != 0) {
            e = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j).getCreateTime() / 1000;
        }
        m95106f(str, str2, aVar, e, z);
    }

    /* renamed from: h */
    public static void m95108h(C79013a aVar) {
        if (aVar != null && aVar.field_msgSvrId == 0) {
            aVar.field_msgSvrId = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(aVar.field_firstMsgId).mo108774y2();
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "fixMsgSvrId ret:%s", Boolean.valueOf(((C77815b) C86312j.m106911c(C77815b.class)).xx0().mo108984kD(aVar, true)));
        }
    }

    /* renamed from: i */
    public static String m95109i(String str, String str2) {
        Pair<Integer, Integer> x = m95124x(str, str2);
        if (x == null) {
            return str2;
        }
        return x.first + "-" + x.second;
    }

    /* renamed from: j */
    public static String m95110j(C79013a aVar) {
        if (aVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = aVar.f232001H;
        if (str != null && !Util.isNullOrNil(str.trim()) && aVar.f232005L == 1) {
            String trim = aVar.f232001H.trim();
            aVar.f232001H = trim;
            sb.append(trim);
            sb.append("\n");
        }
        String str2 = aVar.f232002I;
        if (str2 != null && !Util.isNullOrNil(str2.trim())) {
            String trim2 = aVar.f232002I.trim();
            aVar.f232002I = trim2;
            sb.append(trim2);
            sb.append("\n");
        }
        if (!Util.isNullOrNil(sb.toString())) {
            sb.append("\n");
        }
        if (aVar.f232007N.size() > 0) {
            for (int i = 1; i <= aVar.f232007N.size(); i++) {
                sb.append(i);
                sb.append(aVar.f232004K);
                sb.append(" ");
                sb.append(aVar.f232007N.get(Integer.valueOf(i)).f232014e);
                if (i < aVar.f232007N.size()) {
                    sb.append("\n");
                }
            }
        }
        String str3 = aVar.f232003J;
        if (str3 != null && !Util.isNullOrNil(str3.trim())) {
            aVar.f232003J = aVar.f232003J.trim();
            sb.append("\n");
            sb.append("\n");
            sb.append(aVar.f232003J);
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static String m95111k(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return "";
        }
        String[] split = str2.split("-");
        if (split != null && split.length == 2) {
            int i = Util.getInt(split[0], 0);
            int i2 = Util.getInt(split[1], 0) + i;
            if (i >= 0 && i2 <= str.length()) {
                return str.substring(i, i2);
            }
        }
        return str2;
    }

    /* renamed from: l */
    public static int m95112l(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            int y = m95125y(str.substring(0, i3));
            if (y == i) {
                return i3;
            }
            if (y > i) {
                length = i3 - 1;
            }
            if (y < i) {
                i2 = i3 + 1;
            }
        }
        return length;
    }

    /* renamed from: m */
    public static C79013a m95113m(String str, String str2, String str3) {
        String str4;
        String str5;
        if (Util.isNullOrNil(str3)) {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "xml is null");
            return null;
        }
        int hashCode = (str3 + Util.nullAs(str2, "")).hashCode();
        C79013a aVar = (C79013a) ((C101062d) f230457a).get(Integer.valueOf(hashCode));
        if (aVar != null) {
            Log.m105918d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "get GroupSolitatire data from cache");
            return aVar;
        } else if (!str3.trim().contains("<solitaire>")) {
            return null;
        } else {
            Map<String, String> parseXml = XmlParser.parseXml(str3, "solitaire", (String) null);
            if (parseXml == null) {
                Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "newValues is null: %s", str3);
                return null;
            }
            C79013a aVar2 = new C79013a();
            aVar2.f232001H = m95111k(str2, parseXml.get(".solitaire.tt"));
            aVar2.f232002I = m95111k(str2, parseXml.get(".solitaire.ex"));
            aVar2.f232003J = m95111k(str2, parseXml.get(".solitaire.tl"));
            aVar2.f232004K = parseXml.get(".solitaire.s");
            aVar2.field_creator = parseXml.get(".solitaire.au");
            aVar2.field_username = str;
            aVar2.f232005L = Util.getInt(parseXml.get(".solitaire.hrt"), 1);
            aVar2.f232006M = Util.getInt(parseXml.get(".solitaire.loss"), 0) == 1;
            if (parseXml.containsKey(".solitaire.content.s")) {
                int i = Util.getInt(parseXml.get(".solitaire.content.s"), 0);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    C79014b bVar = new C79014b();
                    if (i2 == 0) {
                        bVar.f232010a = parseXml.get(".solitaire.content.i.u");
                        bVar.f232011b = Util.getInt(parseXml.get(".solitaire.content.i.h"), 0);
                        bVar.f232012c = parseXml.get(".solitaire.content.i.s");
                        bVar.f232013d = Util.getLong(parseXml.get(".solitaire.content.i.t"), 0);
                        str5 = parseXml.get(".solitaire.content.i.c");
                        str4 = parseXml.get(".solitaire.content.i.r");
                    } else {
                        bVar.f232010a = parseXml.get(".solitaire.content.i" + i2 + ".u");
                        bVar.f232011b = Util.getInt(parseXml.get(".solitaire.content.i" + i2 + ".h"), 0);
                        bVar.f232012c = parseXml.get(".solitaire.content.i" + i2 + ".s");
                        bVar.f232013d = Util.getLong(parseXml.get(".solitaire.content.i" + i2 + ".t"), 0);
                        str5 = parseXml.get(".solitaire.content.i" + i2 + ".c");
                        str4 = parseXml.get(".solitaire.content.i" + i2 + ".r");
                    }
                    if (!Util.isNullOrNil(str5)) {
                        bVar.f232014e = str5;
                    } else if (!Util.isNullOrNil(str4)) {
                        bVar.f232014e = m95111k(str2, str4);
                    }
                    arrayList.add(bVar);
                }
                Collections.sort(arrayList, new C78752e());
                for (int i3 = 0; i3 < i; i3++) {
                    HashMap<Integer, C79014b> hashMap = aVar2.f232007N;
                    hashMap.put(Integer.valueOf(hashMap.size() + 1), (C79014b) arrayList.get(i3));
                }
            }
            aVar2.field_key = m95115o(aVar2);
            ((C101062d) f230457a).put(Integer.valueOf(hashCode), aVar2);
            return aVar2;
        }
    }

    /* renamed from: n */
    public static void m95114n(C79013a aVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "groupSolitatire is null");
            return;
        }
        String str = aVar.field_content;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "xml is null");
        } else if (!str.trim().contains("<solitaire>")) {
            Log.m105920e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "<solitaire> no contains");
        } else {
            Map<String, String> parseXml = XmlParser.parseXml(str, "solitaire", (String) null);
            if (parseXml == null) {
                Log.m105921e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "newValues is null: %s", str);
                return;
            }
            aVar.f232001H = parseXml.get(".solitaire.tt");
            aVar.f232002I = parseXml.get(".solitaire.ex");
            aVar.f232003J = parseXml.get(".solitaire.tl");
            aVar.f232004K = parseXml.get(".solitaire.s");
            aVar.field_creator = parseXml.get(".solitaire.au");
            aVar.f232005L = Util.getInt(parseXml.get(".solitaire.hrt"), 1);
            if (parseXml.containsKey(".solitaire.content.s")) {
                int i = Util.getInt(parseXml.get(".solitaire.content.s"), 0);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    C79014b bVar = new C79014b();
                    if (i2 == 0) {
                        bVar.f232010a = parseXml.get(".solitaire.content.i.u");
                        bVar.f232011b = Util.getInt(parseXml.get(".solitaire.content.i.h"), 0);
                        bVar.f232012c = parseXml.get(".solitaire.content.i.s");
                        bVar.f232013d = Util.getLong(parseXml.get(".solitaire.content.i.t"), 0);
                        bVar.f232014e = parseXml.get(".solitaire.content.i.c");
                        bVar.f232015f = Util.getInt(parseXml.get(".solitaire.content.i.o"), 0);
                    } else {
                        bVar.f232010a = parseXml.get(".solitaire.content.i" + i2 + ".u");
                        bVar.f232011b = Util.getInt(parseXml.get(".solitaire.content.i" + i2 + ".h"), 0);
                        bVar.f232012c = parseXml.get(".solitaire.content.i" + i2 + ".s");
                        bVar.f232013d = Util.getLong(parseXml.get(".solitaire.content.i" + i2 + ".t"), 0);
                        bVar.f232014e = parseXml.get(".solitaire.content.i" + i2 + ".c");
                        bVar.f232015f = Util.getInt(parseXml.get(".solitaire.content.i" + i2 + ".o"), 0);
                    }
                    arrayList.add(bVar);
                }
                Collections.sort(arrayList, new C78751d());
                for (int i3 = 0; i3 < i; i3++) {
                    HashMap<Integer, C79014b> hashMap = aVar.f232007N;
                    hashMap.put(Integer.valueOf(hashMap.size() + 1), (C79014b) arrayList.get(i3));
                }
            }
        }
    }

    /* renamed from: o */
    public static String m95115o(C79013a aVar) {
        if (Util.isNullOrNil(aVar.f232001H) && Util.isNullOrNil(aVar.f232002I) && Util.isNullOrNil(aVar.f232003J) && aVar.f232005L == 1) {
            aVar.f232005L = 0;
            if (aVar.f232007N.size() >= 1) {
                aVar.f232001H = aVar.f232007N.get(1).f232014e;
                aVar.f232007N.get(1).f232011b = 1;
            }
        }
        Context context = MMApplicationContext.getContext();
        return C90193h.m112878f(context.getString(C0966R.string.ffi, new Object[]{aVar.f232001H.trim(), aVar.f232005L + "", aVar.f232002I.trim(), aVar.f232003J.trim()}).getBytes());
    }

    /* renamed from: p */
    public static int m95116p() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_match_duration, 24);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getLastSolitatireMatchIntervalTime() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: q */
    public static C64452ir2 m95117q(String str, String str2, C79014b bVar, int i) {
        C64452ir2 ir22 = new C64452ir2();
        ir22.f183729d = i + str2 + " ";
        m95104d(ir22, str, bVar.f232014e);
        return ir22;
    }

    /* renamed from: r */
    public static int m95118r() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_active_max_count, 20);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getMaxGroupSolitatireActiveNum() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: s */
    public static int m95119s() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_match_max_count, 10);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getMaxGroupSolitatireMatchNum() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: t */
    public static int m95120t() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_end_word_maxcount, 500);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getMaxSolitatireItemWordNum() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: u */
    public static int m95121u() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_header_word_maxcount, 500);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getMaxSolitatireItemWordNum() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: v */
    public static int m95122v() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_body_item_word_maxcount, 150);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getMaxSolitatireItemWordNum() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: w */
    public static int m95123w() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_solitaire_content_max_count, 500);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getMaxSolitatireNum() maxNum:%s", Integer.valueOf(Qe));
        return Qe;
    }

    /* renamed from: x */
    public static Pair<Integer, Integer> m95124x(String str, String str2) {
        int indexOf;
        boolean z = false;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_solitaire_xml_use_c_tag_sw, 0);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "isXmlForceUseCTagSwt() swt:%s", Integer.valueOf(Qe));
        if (Qe == 1) {
            z = true;
        }
        if (!z && !Util.isNullOrNil(str) && (indexOf = str.indexOf(str2)) > -1) {
            return new Pair<>(Integer.valueOf(indexOf), Integer.valueOf(str2.length()));
        }
        return null;
    }

    /* renamed from: y */
    public static int m95125y(String str) {
        int i;
        if (str == null) {
            return 0;
        }
        try {
            i = str.getBytes("GBK").length;
        } catch (Exception e) {
            Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "getStringByteLen Exception：%s，%s", e.getClass().getSimpleName(), e.getMessage());
            i = str.getBytes().length;
        }
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireHelp", "length:%s", Integer.valueOf(i));
        return i;
    }

    /* renamed from: z */
    public static void m95126z(C79013a aVar) {
        if (aVar != null && aVar.f232008P) {
            HashMap<Integer, C79014b> hashMap = new HashMap<>();
            HashSet hashSet = new HashSet();
            aVar.f232008P = false;
            for (int i = 1; i <= aVar.f232007N.size(); i++) {
                C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
                if (!hashSet.contains(bVar.f232014e)) {
                    hashSet.add(bVar.f232014e);
                    hashMap.put(Integer.valueOf(hashMap.size() + 1), bVar);
                }
            }
            aVar.f232007N = hashMap;
        }
    }
}
