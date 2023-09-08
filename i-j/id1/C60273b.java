package id1;

import android.content.Context;
import android.net.Uri;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.wcdb.database.SQLiteException;
import ei3.C86522b;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import jh3.C60869d;
import p151er.C58676k;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import zc1.C66783a;
import zc1.C66785b;
import zh3.C91753f;

@C86522b
/* renamed from: id1.b */
public final class C60273b extends C60869d implements C58676k {

    /* renamed from: i */
    public static final String[] f171832i = {MAutoStorage.getCreateSQLs(C54446b.f152697e1, "FinderAccount")};

    /* renamed from: g */
    public final C13601g f171833g = C36568h.m40985a(new C8879a(this));

    /* renamed from: h */
    public final C13601g f171834h = C36568h.m40985a(new C8880b(this));

    /* renamed from: id1.b$a */
    public static final class C8879a extends C87413o implements C32224a<C91753f> {

        /* renamed from: d */
        public final /* synthetic */ C60273b f28147d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8879a(C60273b bVar) {
            super(0);
            this.f28147d = bVar;
        }

        public Object invoke() {
            this.f28147d.getClass();
            C91753f fVar = new C91753f();
            String str = C86709a0.m107535s().f251807e + "FinderAccounts_01.db";
            HashMap hashMap = new HashMap();
            hashMap.put(-1527282937, C8881c.f28149a);
            if (fVar.mo125626p(str, hashMap, true, true)) {
                Log.m105924i("MicroMsg.FinderAccountFeatureService", "[initAccountDb] path=" + str);
                return fVar;
            }
            throw new SQLiteException("finder db init failed");
        }
    }

    /* renamed from: id1.b$b */
    public static final class C8880b extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public final /* synthetic */ C60273b f28148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8880b(C60273b bVar) {
            super(0);
            this.f28148d = bVar;
        }

        public Object invoke() {
            this.f28148d.getClass();
            String str = C86709a0.m107535s().f251807e + "/finder";
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            boolean z = false;
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                z = l.f348991a.mo119948x(l.f348992b);
            }
            if (!z) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            C86009m1 m1Var = new C86009m1(str + "/FinderAccountPublicInfo_01.info");
            if (!m1Var.mo119967g()) {
                m1Var.mo119964e();
            }
            Log.m105924i("MicroMsg.FinderAccountFeatureService", "[initAccountPublicInfoFile] size=" + Util.getSizeKB(m1Var.mo119980r()) + " filePath=" + m1Var.mo119971i());
            return m1Var;
        }
    }

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C54446b.f152697e1;
    }

    public C60273b() {
        super("PluginFinderAccount");
    }

    public boolean Ha0(String str) {
        C87412m.m108594g(str, "username");
        C58969q b = C58961d.f168673a.mo84155b(str);
        if (b == null) {
            return false;
        }
        int i = b.field_follow_Flag;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
        return i != C58969q.f168707c2;
    }

    public C86009m1 Kg0() {
        return (C86009m1) ((C36570n) this.f171834h).getValue();
    }

    /* renamed from: O5 */
    public String mo83550O5() {
        return C66785b.f191882e.mo90662O5();
    }

    public ISQLiteDatabase a20() {
        return (ISQLiteDatabase) ((C36570n) this.f171833g).getValue();
    }

    public String gp0() {
        String str = null;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        if (c != null) {
            str = c.field_nickname;
        }
        return str == null ? "" : str;
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        if (!a20().isClose()) {
            ((C66783a) C39818r.f106831a.mo62446e(C58676k.class).mo62447c(C66783a.class)).initialize();
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
    }

    /* renamed from: yw */
    public C13604l<Integer, Integer> mo83553yw() {
        C66785b bVar = C66785b.f191882e;
        return new C13604l<>(Integer.valueOf(bVar.mo90673n0().mo62398d().f141681j), Integer.valueOf(bVar.mo90673n0().mo62398d().f141682n));
    }
}
