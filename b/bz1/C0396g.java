package bz1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64197v;
import wy1.C53224d;
import xy1.C15912f;
import xy1.C15913g;
import yy1.C53643e;
import zy1.C16410a;
import zy1.C16413d;
import zy1.C16414e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: bz1.g */
public final class C0396g extends C86301e implements C15913g {

    /* renamed from: d */
    public final ConcurrentHashMap<String, C0394d> f1000d = new ConcurrentHashMap<>();

    /* renamed from: bz1.g$a */
    public static final class C0397a implements C15913g.C15916c {

        /* renamed from: a */
        public static final C0397a f1001a = new C0397a();

        /* renamed from: a */
        public final void mo445a(Map<String, C15912f> map) {
        }
    }

    /* renamed from: bz1.g$b */
    public static final class C0398b extends C87413o implements C32227p<Map<String, ? extends C0394d>, List<? extends String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HashMap<String, C15912f> f1002d;

        /* renamed from: e */
        public final /* synthetic */ C0396g f1003e;

        /* renamed from: f */
        public final /* synthetic */ C15913g.C15916c f1004f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0398b(HashMap<String, C15912f> hashMap, C0396g gVar, C15913g.C15916c cVar) {
            super(2);
            this.f1002d = hashMap;
            this.f1003e = gVar;
            this.f1004f = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Map map = (Map) obj;
            List list = (List) obj2;
            C87412m.m108594g(map, "resultMap");
            C87412m.m108594g(list, "remain");
            this.f1002d.putAll(map);
            if (!list.isEmpty()) {
                C0396g gVar = this.f1003e;
                C0402h hVar = new C0402h(this.f1002d, this.f1004f);
                gVar.getClass();
                new C16413d(new LinkedList(list)).mo9225i().mo123419C(new C0403i(list, hVar, new HashMap(), gVar));
            } else {
                this.f1004f.mo445a(this.f1002d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bz1.g$c */
    public static final class C0399c implements C15913g.C15916c {

        /* renamed from: a */
        public final /* synthetic */ List<String> f1005a;

        /* renamed from: b */
        public final /* synthetic */ C15913g.C15916c f1006b;

        public C0399c(List<String> list, C15913g.C15916c cVar) {
            this.f1005a = list;
            this.f1006b = cVar;
        }

        /* renamed from: a */
        public final void mo445a(Map<String, C15912f> map) {
            StringBuilder sb = new StringBuilder();
            sb.append("[getContact] usernameList=");
            sb.append(this.f1005a);
            sb.append(" result=");
            C87412m.m108593f(map, "result");
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(((String) next.getKey()) + '=' + ((C15912f) next.getValue()).getNickname());
            }
            sb.append(arrayList);
            Log.m105924i("GameLife.ContactService", sb.toString());
            this.f1006b.mo445a(map);
        }
    }

    /* renamed from: bz1.g$d */
    public static final class C0400d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f1007a;

        /* renamed from: b */
        public final /* synthetic */ C15913g.C15914a f1008b;

        public C0400d(String str, C15913g.C15914a aVar) {
            this.f1007a = str;
            this.f1008b = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256794b;
            boolean z = false;
            if (i == 0 && cVar.f256793a == 0) {
                C53643e eVar = (C53643e) cVar.f256796d;
                boolean z2 = eVar.f150693e;
                if (C87412m.m108589b(this.f1007a, eVar.f150692d.f150679d)) {
                    z = ((C53643e) cVar.f256796d).f150692d.f150680e;
                }
                this.f1008b.mo14560a(z2, z);
            } else {
                Log.m105921e("GameLife.ContactService", "isBlackListAssociateWithWAGame errCode:%d,errType:%d", Integer.valueOf(i), Integer.valueOf(cVar.f256793a));
                this.f1008b.mo14560a(false, false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bz1.g$e */
    public static final class C0401e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C15913g.C15915b f1009a;

        public C0401e(C15913g.C15915b bVar) {
            this.f1009a = bVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256794b;
            if (i == 0 && cVar.f256793a == 0) {
                C15913g.C15915b bVar = this.f1009a;
                if (bVar == null) {
                    return null;
                }
                bVar.mo5406a(true);
                return C13598b0.f38549a;
            }
            Log.m105921e("GameLife.ContactService", "setBlackListAssociateWithWAGame errCode:%d,errType:%d", Integer.valueOf(i), Integer.valueOf(cVar.f256793a));
            C15913g.C15915b bVar2 = this.f1009a;
            if (bVar2 == null) {
                return null;
            }
            bVar2.mo5406a(false);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016e, code lost:
        cy3.C58003b.m67160a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C40(java.util.List<java.lang.String> r8, xy1.C15913g.C15916c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r9, r0)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0012
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            if (r2 == 0) goto L_0x001b
            sx3.g0 r8 = sx3.C36903g0.f97931d
            r9.mo445a(r8)
            return
        L_0x001b:
            bz1.g$c r2 = new bz1.g$c
            r2.<init>(r8, r9)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x002e:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r8.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 == 0) goto L_0x0050
            bz1.d r4 = new bz1.d
            r4.<init>()
            java.lang.String r5 = ""
            r9.put(r5, r4)
            goto L_0x002e
        L_0x0050:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bz1.d> r5 = r7.f1000d
            java.lang.Object r5 = r5.get(r4)
            bz1.d r5 = (bz1.C0394d) r5
            if (r5 == 0) goto L_0x005e
            r9.put(r4, r5)
            goto L_0x002e
        L_0x005e:
            r3.add(r4)
            goto L_0x002e
        L_0x0062:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L_0x006c
            r2.mo445a(r9)
            return
        L_0x006c:
            bz1.g$b r8 = new bz1.g$b
            r8.<init>(r9, r7, r2)
            java.lang.Class<wy1.d> r9 = wy1.C53224d.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            wy1.d r9 = (wy1.C53224d) r9
            bz1.k r9 = r9.yx0()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT *, rowid FROM GameLifeContact WHERE username IN "
            r0.append(r2)
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0090
            java.lang.String r1 = "()"
            goto L_0x00df
        L_0x0090:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "("
            r2.append(r4)
            int r4 = r3.size()
            int r4 = r4 + -1
        L_0x00a0:
            java.lang.String r5 = "'"
            if (r1 >= r4) goto L_0x00bb
            r2.append(r5)
            java.lang.Object r6 = r3.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = ","
            r2.append(r5)
            int r1 = r1 + 1
            goto L_0x00a0
        L_0x00bb:
            r2.append(r5)
            int r1 = r3.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "sb.toString()"
            gy3.C87412m.m108593f(r1, r2)
        L_0x00df:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.f1017d
            r2 = 2
            r4 = 0
            android.database.Cursor r9 = r9.rawQuery(r0, r4, r2)
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x0115
        L_0x00f9:
            boolean r0 = r9.isAfterLast()     // Catch:{ all -> 0x016b }
            if (r0 != 0) goto L_0x0115
            bz1.d r0 = new bz1.d     // Catch:{ all -> 0x016b }
            r0.<init>()     // Catch:{ all -> 0x016b }
            r0.convertFrom(r9)     // Catch:{ all -> 0x016b }
            java.lang.String r2 = r0.field_username     // Catch:{ all -> 0x016b }
            java.lang.String r5 = "field_username"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ all -> 0x016b }
            r1.put(r2, r0)     // Catch:{ all -> 0x016b }
            r9.moveToNext()     // Catch:{ all -> 0x016b }
            goto L_0x00f9
        L_0x0115:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x016b }
            cy3.C58003b.m67160a(r9, r4)
            java.util.Collection r9 = r1.values()
            java.util.Iterator r9 = r9.iterator()
        L_0x0122:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r9.next()
            bz1.d r0 = (bz1.C0394d) r0
            java.lang.String r2 = r0.getUsername()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bz1.d> r4 = r7.f1000d
            r4.put(r2, r0)
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            r0.mo69653F1(r2)
            goto L_0x0122
        L_0x0147:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r3.iterator()
        L_0x0150:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r1.containsKey(r3)
            if (r3 != 0) goto L_0x0150
            r9.add(r2)
            goto L_0x0150
        L_0x0167:
            r8.invoke(r1, r9)
            return
        L_0x016b:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x016d }
        L_0x016d:
            r0 = move-exception
            cy3.C58003b.m67160a(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bz1.C0396g.C40(java.util.List, xy1.g$c):void");
    }

    /* renamed from: Pj */
    public void mo437Pj(String str, boolean z, boolean z2, C15913g.C15915b bVar) {
        if (str == null || str.length() == 0) {
            Log.m105920e("GameLife.ContactService", "setBlackListAssociateWithWAGame username null!");
            if (bVar != null) {
                bVar.mo5406a(false);
                return;
            }
            return;
        }
        Log.m105925i("GameLife.ContactService", "setBlackListAssociateWithWAGame username:%s,setBlack:%b,isAssociate:%b", str, Boolean.valueOf(z), Boolean.valueOf(z2));
        new C16414e(str, z, z2).mo9225i().mo123419C(new C0401e(bVar));
    }

    /* renamed from: Tx */
    public void mo438Tx(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("GameLife.ContactService", "checkContactExpired userName empty");
            return;
        }
        C0394d vx02 = mo440X3(str);
        if (vx02 == null) {
            Log.m105921e("GameLife.ContactService", "checkContactExpired contact null username:%s", str);
            return;
        }
        long c = C31543z5.m39453c() - vx02.field_updateTime;
        Log.m105919d("GameLife.ContactService", "syncTime diff:%d,contact.field_updateTime:%d", Long.valueOf(c), Long.valueOf(vx02.field_updateTime));
        if (c >= 86400000) {
            Log.m105924i("GameLife.ContactService", "[checkContactExpired] diff:" + c + " limit:86400000 username:" + str);
            List b = C26236u.m33719b(str);
            new C16413d(new LinkedList(b)).mo9225i().mo123419C(new C0403i(b, C0397a.f1001a, new HashMap(), this));
        }
    }

    /* renamed from: VN */
    public void mo439VN(String str, C15913g.C15914a aVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(aVar, "callback");
        if (str.length() == 0) {
            Log.m105920e("GameLife.ContactService", "isBlackListAssociateWithWAGame username null!");
            aVar.mo14560a(false, false);
        }
        Log.m105925i("GameLife.ContactService", "isBlackListAssociateWithWAGame username:%s", str);
        new C16410a(str).mo9225i().mo123419C(new C0400d(str, aVar));
    }

    /* renamed from: g */
    public void mo441g(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            ((C53224d) C86312j.m106911c(C53224d.class)).yx0().remove(iOnStorageChange);
        }
    }

    /* renamed from: i */
    public void mo442i(MStorage.IOnStorageChange iOnStorageChange) {
        if (iOnStorageChange != null) {
            ((C53224d) C86312j.m106911c(C53224d.class)).yx0().add(iOnStorageChange);
        }
    }

    /* renamed from: vx0 */
    public C0394d mo440X3(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C0394d dVar = this.f1000d.get(str);
        if (dVar != null) {
            return dVar;
        }
        C0394d jo = ((C53224d) C86312j.m106911c(C53224d.class)).yx0().mo446jo(str);
        if (jo == null) {
            return null;
        }
        String username = jo.getUsername();
        this.f1000d.put(username, jo);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69653F1(username);
        return jo;
    }

    public void xt0(String str, C15913g.C15916c cVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(cVar, "callback");
        C40(C64197v.m75539h(str), cVar);
    }
}
