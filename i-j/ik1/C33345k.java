package ik1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import js3.C33659a;
import js3.C60921b;
import o40.C11348f;
import o40.C61926c;
import p740wo.C53193b;
import p749xh.C38624o3;
import rx3.C13598b0;
import sx3.C110818d0;
import ux3.C65486b;
import zh3.C91753f;

/* renamed from: ik1.k */
public final class C33345k extends MAutoStorage<C38624o3> implements C60921b {

    /* renamed from: f */
    public static final C33346a f90386f = new C33346a();

    /* renamed from: g */
    public static final String f90387g = "Finder.FinderLiveTipsBarStorage";

    /* renamed from: h */
    public static final String[] f90388h;

    /* renamed from: i */
    public static final Vector<C38624o3> f90389i = new Vector<>();

    /* renamed from: j */
    public static C91753f f90390j;

    /* renamed from: n */
    public static C33345k f90391n;

    /* renamed from: d */
    public final C91753f f90392d;

    /* renamed from: e */
    public C33659a f90393e;

    /* renamed from: ik1.k$a */
    public static final class C33346a {

        /* renamed from: ik1.k$a$a */
        public static final class C33347a implements C91753f.C66827b {

            /* renamed from: a */
            public final /* synthetic */ C33346a f90394a;

            public C33347a(C33346a aVar) {
                this.f90394a = aVar;
            }

            /* renamed from: a */
            public final String[] mo6410a() {
                this.f90394a.getClass();
                return C33345k.f90388h;
            }
        }

        /* renamed from: a */
        public final void mo59090a() {
            synchronized (this) {
                try {
                    if (C33345k.f90390j == null) {
                        C33345k.f90390j = new C91753f();
                        String str = C86709a0.m107535s().f251807e + "FinderLiveTipsBar001.db";
                        HashMap hashMap = new HashMap();
                        hashMap.put(-1082358007, new C33347a(this));
                        C91753f fVar = C33345k.f90390j;
                        C87412m.m108591d(fVar);
                        if (!fVar.mo125626p(str, hashMap, true, true)) {
                            C11348f.C11349a.m11178b(C59319a.f169618b, "FinderLiveTipsBarStorage_CreateDBFailed", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                        }
                    }
                    C91753f fVar2 = C33345k.f90390j;
                    if (fVar2 != null && C33345k.f90391n == null) {
                        C33345k kVar = new C33345k(fVar2, (C8480h) null);
                        C33345k.f90389i.addAll(C33345k.m40021jo(kVar));
                        C33345k.f90391n = kVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: ik1.k$b */
    public static final class C33348b extends C87413o implements C32226l<C38624o3, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ long f90395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33348b(long j) {
            super(1);
            this.f90395d = j;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(((C38624o3) obj).field_liveId == this.f90395d);
        }
    }

    /* renamed from: ik1.k$c */
    public static final class C33349c extends C87413o implements C32226l<C38624o3, CharSequence> {

        /* renamed from: d */
        public static final C33349c f90396d = new C33349c();

        public C33349c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C38624o3 o3Var = (C38624o3) obj;
            C87412m.m108594g(o3Var, LocaleUtil.ITALIAN);
            return C61926c.m72691p(o3Var.field_liveId) + ',' + o3Var.field_markRead;
        }
    }

    /* renamed from: ik1.k$d */
    public static final class C33350d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C38624o3) t).field_timeStamp), Long.valueOf(((C38624o3) t2).field_timeStamp));
        }
    }

    /* renamed from: ik1.k$e */
    public static final class C33351e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f90397d;

        /* renamed from: e */
        public final /* synthetic */ MStorageEx f90398e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33351e(String str, MStorageEx mStorageEx) {
            super(0);
            this.f90397d = str;
            this.f90398e = mStorageEx;
        }

        public Object invoke() {
            String str = C33345k.f90387g;
            Log.m105924i(str, "notifyConversationChanged " + this.f90397d);
            MStorageEx mStorageEx = this.f90398e;
            mStorageEx.doNotify(3, mStorageEx, this.f90397d);
            return C13598b0.f38549a;
        }
    }

    static {
        String createSQLs = MAutoStorage.getCreateSQLs(C38624o3.f103211D, "FinderLiveTipsBar");
        C87412m.m108593f(createSQLs, "getCreateSQLs(BaseFinder…sBar.DB_INFO, TABLE_NAME)");
        f90388h = new String[]{createSQLs};
    }

    public C33345k(C91753f fVar, C8480h hVar) {
        super(fVar, C38624o3.f103211D, "FinderLiveTipsBar", (String[]) null);
        this.f90392d = fVar;
    }

    /* renamed from: jo */
    public static final List m40021jo(C33345k kVar) {
        kVar.getClass();
        LinkedList linkedList = new LinkedList();
        String str = f90387g;
        Log.m105924i(str, "getAllData:SELECT * FROM FinderLiveTipsBar");
        Cursor rawQuery = kVar.f90392d.rawQuery("SELECT * FROM FinderLiveTipsBar", (String[]) null);
        if (rawQuery == null) {
            Log.m105920e(str, "getAllData failed");
        } else {
            while (rawQuery.moveToNext()) {
                C38624o3 o3Var = new C38624o3();
                o3Var.convertFrom(rawQuery);
                linkedList.add(o3Var);
            }
            rawQuery.close();
        }
        return linkedList;
    }

    /* renamed from: Lo */
    public final void mo59084Lo(long j, boolean z) {
        C33659a aVar;
        String str = "SELECT * FROM FinderLiveTipsBar WHERE liveId = '" + j + '\'';
        String str2 = f90387g;
        Log.m105924i(str2, "deleteByLiveId, liveId:" + C61926c.m72691p(j) + ", sql:" + str);
        String str3 = null;
        Cursor rawQuery = this.f90392d.rawQuery(str, (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                C38624o3 o3Var = new C38624o3();
                o3Var.convertFrom(rawQuery);
                str3 = o3Var.field_hostRoomId;
            }
            rawQuery.close();
        }
        int delete = this.f90392d.delete("FinderLiveTipsBar", "liveId= ? ", new String[]{"" + j});
        if (delete < 0) {
            Log.m105920e(str2, "deleteByLiveId failed, result:" + delete);
        } else {
            Vector<C38624o3> vector = f90389i;
            synchronized (vector) {
                C61926c.m72674S(vector, new C33348b(j));
            }
            Log.m105924i(str2, "deleteByLiveId success, liveId::" + C61926c.m72691p(j) + ", hostRoomId:" + str3 + ", liveTipsBarNotify " + this.f90393e);
        }
        if (str3 != null) {
            if (z && (aVar = this.f90393e) != null) {
                aVar.mo59247a(str3);
            }
            mo59089qq(str3);
        }
    }

    /* renamed from: O */
    public int mo59085O(String str) {
        int i;
        C87412m.m108594g(str, "hostRoomId");
        Vector<C38624o3> vector = f90389i;
        synchronized (vector) {
            Iterator<C38624o3> it = vector.iterator();
            boolean z = false;
            int i2 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (C87412m.m108589b(it.next().field_hostRoomId, str)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                String str2 = f90387g;
                Log.m105924i(str2, "getLiveIconState " + str);
                Iterator<C38624o3> it4 = f90389i.iterator();
                int i3 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C38624o3 next = it4.next();
                    if (C87412m.m108589b(next.field_hostRoomId, str) && !next.field_markRead) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                if (i >= 0) {
                    z = true;
                }
                return z ? 2 : 1;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            return 0;
        }
    }

    /* renamed from: Oa */
    public void mo59086Oa(C33659a aVar) {
        C87412m.m108594g(aVar, "notify");
        String str = f90387g;
        Log.m105924i(str, "setLiveTipsBarNotify " + aVar);
        this.f90393e = aVar;
    }

    /* renamed from: d */
    public void mo59087d(long j) {
        mo59084Lo(j, true);
    }

    /* renamed from: f0 */
    public LinkedList<C38624o3> mo59088f0(String str, boolean z) {
        C87412m.m108594g(str, "hostRoomId");
        LinkedList<C38624o3> linkedList = new LinkedList<>();
        Vector<C38624o3> vector = f90389i;
        synchronized (vector) {
            ArrayList arrayList = new ArrayList();
            for (T next : vector) {
                if (C87412m.m108589b(((C38624o3) next).field_hostRoomId, str)) {
                    arrayList.add(next);
                }
            }
            linkedList.addAll(C110818d0.m150943o0(arrayList, new C33350d()));
        }
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(str);
        ArrayList arrayList2 = new ArrayList();
        for (C38624o3 o3Var : linkedList) {
            String str2 = o3Var.field_anchorWxUsername;
            if (str2 == null) {
                str2 = "";
            }
            if (!k5.contains(str2)) {
                mo59084Lo(o3Var.field_liveId, false);
                arrayList2.add(o3Var);
                String str3 = f90387g;
                Log.m105924i(str3, "delete " + C61926c.m72691p(o3Var.field_liveId) + ", anchorWxUsername:" + str2 + " is not in chatroom:" + str);
            }
        }
        linkedList.removeAll(arrayList2);
        if (z) {
            for (C38624o3 o3Var2 : linkedList) {
                o3Var2.field_markRead = true;
                update(o3Var2, "liveId");
            }
        }
        String str4 = f90387g;
        Log.m105924i(str4, "getTipsBarDataByHostRoomId " + str + ", " + C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33349c.f90396d, 31, (Object) null));
        return linkedList;
    }

    /* renamed from: qq */
    public final void mo59089qq(String str) {
        C87412m.m108594g(str, "chatRoomId");
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        MStorageEx mStorageEx = Ku instanceof MStorageEx ? (MStorageEx) Ku : null;
        if (mStorageEx != null) {
            C61926c.m72668M(new C33351e(str, mStorageEx));
        }
    }
}
