package rb0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import f40.C86709a0;
import ob0.C11385n;
import te3.C50122kf;
import te3.C50254lf;
import te3.C51801w9;
import te3.C52297zr;

/* renamed from: rb0.i */
public class C47971i extends MAutoStorage<C47969h> implements C11385n {

    /* renamed from: f */
    public static final String[] f128676f = {MAutoStorage.getCreateSQLs(C47969h.f128672U, "BizEnterprise")};

    /* renamed from: g */
    public static C51801w9 f128677g;

    /* renamed from: d */
    public ISQLiteDatabase f128678d;

    /* renamed from: e */
    public final MStorageEvent<C47973b, C47973b.C47974a> f128679e = new C47972a(this);

    /* renamed from: rb0.i$a */
    public class C47972a extends MStorageEvent<C47973b, C47973b.C47974a> {
        public C47972a(C47971i iVar) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C47973b) obj).mo69971a((C47973b.C47974a) obj2);
        }
    }

    /* renamed from: rb0.i$b */
    public interface C47973b {

        /* renamed from: rb0.i$b$a */
        public static class C47974a {

            /* renamed from: a */
            public String f128680a;
        }

        /* renamed from: a */
        void mo69971a(C47974a aVar);
    }

    public C47971i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C47969h.f128672U, "BizEnterprise", (String[]) null);
        this.f128678d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("BizEnterprise", "CREATE INDEX IF NOT EXISTS BizEnterpriseUserNameIndex ON BizEnterprise ( userName )");
        C86709a0.m107529k().f251779b.mo123455a(1343, this);
        C86709a0.m107529k().f251779b.mo123455a(1228, this);
    }

    /* renamed from: Lo */
    public String mo72743Lo(int i) {
        if (f128677g == null) {
            f128677g = new C51801w9();
        }
        if (i == 0) {
            return f128677g.f143927d;
        }
        if (i == 1) {
            return f128677g.f143928e;
        }
        if (i != 2) {
            return null;
        }
        return f128677g.f143929f;
    }

    /* renamed from: Ow */
    public boolean mo72744Ow(C50122kf kfVar) {
        int i;
        C47969h Yt = mo72746Yt(kfVar.f136726d);
        Yt.field_userName = kfVar.f136726d;
        Yt.field_qyUin = kfVar.f136727e;
        Yt.field_userUin = kfVar.f136728f;
        Yt.field_wwMaxExposeTimes = kfVar.f136730h;
        Yt.field_wwUserVid = kfVar.f136731i;
        Yt.field_wwCorpId = kfVar.f136732j;
        Yt.field_userType = kfVar.f136733n;
        Yt.field_chatOpen = kfVar.f136734o;
        Yt.field_wwUnreadCnt = kfVar.f136735p;
        Yt.field_show_confirm = kfVar.f136736q;
        Yt.field_use_preset_banner_tips = kfVar.f136738s;
        C52297zr zrVar = kfVar.f136739t;
        if (zrVar != null) {
            Yt.field_hide_create_chat = zrVar.f146185d;
            Yt.field_hide_mod_chat_member = zrVar.f146186e;
        }
        Yt.field_hide_colleage_invite = kfVar.f136741v;
        try {
            C50254lf lfVar = new C50254lf();
            lfVar.f137368d = kfVar.f136740u;
            lfVar.f137369e = kfVar.f136742w;
            lfVar.f137370f = kfVar.f136743x;
            lfVar.f137371g = kfVar.f136744y;
            Yt.field_raw_attrs = lfVar.toByteArray();
        } catch (Throwable unused) {
        }
        f128677g = kfVar.f136737r;
        if (kfVar.f136731i == 0 && kfVar.f136732j == 0 && (i = kfVar.f136727e) != 0) {
            Yt.field_wwUserVid = (long) kfVar.f136728f;
            Yt.field_wwCorpId = (long) i;
        }
        int i2 = kfVar.f136729g & -9;
        kfVar.f136729g = i2;
        Yt.field_userFlag = (Yt.field_userFlag & 8) | i2;
        return mo72747bD(Yt);
    }

    /* renamed from: SE */
    public boolean mo72745SE(String str, C11385n nVar) {
        int i;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (C47984k.m53337k(str)) {
            i = 1;
        } else if (!C47984k.m53335i(str)) {
            return false;
        } else {
            i = 2;
        }
        return C86709a0.m107529k().f251779b.mo123461g(new C47995n0(str, i, nVar), 0);
    }

    /* renamed from: Yt */
    public C47969h mo72746Yt(String str) {
        C47969h jo = mo72749jo(str);
        if (jo != null) {
            return jo;
        }
        C47969h hVar = new C47969h();
        hVar.field_userName = str;
        hVar.field_qyUin = 0;
        hVar.field_userUin = 0;
        hVar.field_userFlag = 0;
        hVar.field_wwExposeTimes = 0;
        hVar.field_wwMaxExposeTimes = 0;
        hVar.field_wwUserVid = 0;
        hVar.field_wwCorpId = 0;
        hVar.field_chatOpen = false;
        hVar.field_wwUnreadCnt = 0;
        return hVar;
    }

    /* renamed from: bD */
    public boolean mo72747bD(C47969h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean insert = super.insert(hVar);
        if (!insert) {
            insert = super.replace(hVar);
        }
        if (insert) {
            C47973b.C47974a aVar = new C47973b.C47974a();
            aVar.f128680a = hVar.field_userName;
            this.f128679e.event(aVar);
            this.f128679e.doNotify();
        }
        return insert;
    }

    /* renamed from: c */
    public boolean mo72748c(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C47969h hVar = new C47969h();
        hVar.field_userName = str;
        boolean delete = super.delete(hVar, "userName");
        if (delete) {
            C47973b.C47974a aVar = new C47973b.C47974a();
            aVar.f128680a = str;
            this.f128679e.event(aVar);
            this.f128679e.doNotify();
        }
        return delete;
    }

    /* renamed from: jo */
    public C47969h mo72749jo(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C47969h hVar = new C47969h();
        hVar.field_userName = str;
        if (super.get(hVar, new String[0])) {
            return hVar;
        }
        mo72745SE(str, (C11385n) null);
        return null;
    }

    /* renamed from: kD */
    public boolean mo72750kD(String str) {
        C47969h jo = mo72749jo(str);
        if (jo != null) {
            int i = jo.field_userFlag;
            return ((i & 1) == 0 || (i & 16) == 0) ? false : true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = r3.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r6, int r7, java.lang.String r8, ob0.C117747y r9) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0073
            if (r7 == 0) goto L_0x0006
            goto L_0x0073
        L_0x0006:
            boolean r0 = r9 instanceof rb0.C47995n0
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003e
            r0 = r9
            rb0.n0 r0 = (rb0.C47995n0) r0
            ob0.c r3 = r0.f128719e
            if (r3 == 0) goto L_0x001c
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x001c
            te3.fw1 r3 = (te3.C49480fw1) r3
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x003d
            te3.am3 r4 = r3.f133715d
            if (r4 == 0) goto L_0x003d
            int r4 = r4.f130638d
            if (r4 != 0) goto L_0x003d
            te3.kf r3 = r3.f133716e
            if (r3 != 0) goto L_0x002c
            goto L_0x003d
        L_0x002c:
            boolean r3 = r5.mo72744Ow(r3)
            if (r3 != 0) goto L_0x0033
            r7 = -1
        L_0x0033:
            java.lang.Object r0 = r0.f128720f
            ob0.n r0 = (ob0.C11385n) r0
            if (r0 == 0) goto L_0x003e
            r0.onSceneEnd(r6, r7, r8, r9)
            goto L_0x003e
        L_0x003d:
            return
        L_0x003e:
            boolean r0 = r9 instanceof rb0.C48007u0
            if (r0 == 0) goto L_0x0073
            r0 = r9
            rb0.u0 r0 = (rb0.C48007u0) r0
            ob0.c r3 = r0.f128767e
            if (r3 == 0) goto L_0x0052
            ob0.c$d r3 = r3.f127056b
            pe3.a r3 = r3.f127083a
            if (r3 == 0) goto L_0x0052
            r2 = r3
            te3.h24 r2 = (te3.C49648h24) r2
        L_0x0052:
            if (r2 == 0) goto L_0x0073
            te3.am3 r3 = r2.f134420d
            if (r3 == 0) goto L_0x0073
            int r3 = r3.f130638d
            if (r3 != 0) goto L_0x0073
            te3.kf r2 = r2.f134421e
            if (r2 != 0) goto L_0x0061
            goto L_0x0073
        L_0x0061:
            boolean r2 = r5.mo72744Ow(r2)
            if (r2 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = r7
        L_0x0069:
            java.lang.Object r7 = r0.f128768f
            ob0.n r7 = (ob0.C11385n) r7
            if (r7 == 0) goto L_0x0073
            r7.onSceneEnd(r6, r1, r8, r9)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47971i.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: qq */
    public int mo72751qq() {
        if (f128677g == null) {
            f128677g = new C51801w9();
        }
        try {
            return Integer.parseInt(f128677g.f143933j);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
