package qb1;

import com.tencent.p014mm.autogen.mmdata.rpt.FavSpecificActionStruct;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p749xh.C102660p2;
import p749xh.C102670ua;
import pb1.C100736q0;
import pb1.C100755z;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: qb1.b */
public final class C101089b implements C100736q0 {

    /* renamed from: a */
    public static final C101089b f295920a = new C101089b();

    /* renamed from: b */
    public static final SingleTable f295921b = C102660p2.f302857p;

    /* renamed from: c */
    public static final C13601g f295922c = C36568h.m40985a(C101090a.f295923d);

    /* renamed from: qb1.b$a */
    public static final class C101090a extends C87413o implements C32224a<ISQLiteDatabase> {

        /* renamed from: d */
        public static final C101090a f295923d = new C101090a();

        public C101090a() {
            super(0);
        }

        public Object invoke() {
            if (C102670ua.f303014i == null) {
                C102670ua.f303014i = new C102670ua();
            }
            C102670ua uaVar = C102670ua.f303014i;
            boolean z = false;
            if (!(uaVar != null && uaVar.mo125628r())) {
                uaVar = null;
            }
            C102660p2.createTable(uaVar);
            if (C102670ua.f303014i == null) {
                C102670ua.f303014i = new C102670ua();
            }
            C102670ua uaVar2 = C102670ua.f303014i;
            if (uaVar2 != null && uaVar2.mo125628r()) {
                z = true;
            }
            if (z) {
                return uaVar2;
            }
            return null;
        }
    }

    /* renamed from: qb1.b$b */
    public static final class C101091b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100755z f295924d;

        /* renamed from: e */
        public final /* synthetic */ int f295925e;

        /* renamed from: f */
        public final /* synthetic */ int f295926f;

        /* renamed from: g */
        public final /* synthetic */ String f295927g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101091b(C100755z zVar, int i, int i2, String str) {
            super(0);
            this.f295924d = zVar;
            this.f295925e = i;
            this.f295926f = i2;
            this.f295927g = str;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.FavDelMgr", "updateDelInfo() called with: itemid = " + this.f295924d.field_id + ", delType = " + this.f295925e + ", delFlag = " + this.f295926f + ", callMsg = " + this.f295927g);
            C101089b.f295920a.mo140542b(this.f295924d, this.f295927g, this.f295925e, this.f295926f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public void mo140541a(C100755z zVar, String str, int i, int i2) {
        C87412m.m108594g(str, "callMsg");
        if (zVar != null) {
            C61926c.m72661F("THREAD.FavDelManager", new C101091b(zVar, i, i2, str));
        }
    }

    /* renamed from: b */
    public final void mo140542b(C100755z zVar, String str, int i, int i2) {
        try {
            SelectSql build = C102660p2.f302857p.selectAll().where(C102660p2.f302858q.equal((Number) Integer.valueOf(zVar.field_id))).log("MicroMsg.SDK.BaseFavDelInfo").build();
            C13601g gVar = f295922c;
            C101088a aVar = (C101088a) build.singleQuery((ISQLiteDatabase) ((C36570n) gVar).getValue(), C101088a.class);
            C101088a aVar2 = aVar == null ? new C101088a() : aVar;
            aVar2.mo142417r2(zVar.field_id);
            aVar2.mo142415p2(C31543z5.m39453c());
            aVar2.mo142413n2(BuildInfo.BUILD_TAG + '_' + BuildInfo.REV);
            aVar2.mo142416q2(i);
            aVar2.mo142418s2(zVar.field_type);
            aVar2.mo142419t2(zVar.field_updateTime);
            aVar2.mo142414o2(aVar2.mo142411l2() | i2);
            long execute = new ReplaceExecutor(aVar2, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseFavDelInfo").execute((ISQLiteDatabase) ((C36570n) gVar).getValue());
            StringBuilder sb = new StringBuilder();
            sb.append("updateDelInfoInner: %s, curInfoNull=");
            sb.append(aVar == null);
            sb.append("， replaceInfo:");
            sb.append(aVar2);
            sb.append(" replaceRet:%s");
            Log.m105925i("MicroMsg.FavDelMgr", sb.toString(), Integer.valueOf(zVar.field_id), Long.valueOf(execute));
            FavSpecificActionStruct favSpecificActionStruct = new FavSpecificActionStruct();
            favSpecificActionStruct.f265536d = 1;
            favSpecificActionStruct.f265539g = zVar.field_id;
            favSpecificActionStruct.f265537e = (long) i;
            favSpecificActionStruct.f265538f = (long) i2;
            favSpecificActionStruct.mo86054n();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FavDelMgr", th, "updateDelInfoInner err", new Object[0]);
        }
    }
}
