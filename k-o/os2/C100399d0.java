package os2;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.model.C30408i1;
import com.tencent.p014mm.plugin.sns.model.C30410j1;
import com.tencent.p014mm.plugin.sns.model.C30412k1;
import com.tencent.p014mm.plugin.sns.model.C30413l1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tavkit.component.TAVExporter;
import java.util.ArrayList;
import java.util.List;
import jr2.C46570n;
import te3.C51865wq1;
import te3.a94;
import te3.q94;
import te3.z84;
import vr2.C102236a0;
import zh3.C91753f;

/* renamed from: os2.d0 */
public class C100399d0 extends MAutoStorage<C100398c0> implements C46570n {

    /* renamed from: g */
    public static final String[] f294083g = {MAutoStorage.getCreateSQLs(C100398c0.f294082R0, "snsExtInfo3")};

    /* renamed from: d */
    public boolean f294084d = false;

    /* renamed from: e */
    public C91753f f294085e;

    /* renamed from: f */
    public C35295p f294086f = null;

    public C100399d0(C91753f fVar, C35295p pVar) {
        super(fVar, C100398c0.f294082R0, "snsExtInfo3", (String[]) null);
        boolean z = false;
        SnsMethodCalculate.markStartTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        Cursor rawQuery = fVar.rawQuery("PRAGMA table_info( snsExtInfo3 )", (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("name");
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (rawQuery.moveToNext()) {
            if (columnIndex >= 0) {
                String string = rawQuery.getString(columnIndex);
                z = "imBGaeskey".equalsIgnoreCase(string) ? true : z;
                z2 = "imBGauthkey".equalsIgnoreCase(string) ? true : z2;
                z3 = "imBGmd5sum".equalsIgnoreCase(string) ? true : z3;
                if ("imBGfileid".equalsIgnoreCase(string)) {
                    z4 = true;
                }
            }
        }
        rawQuery.close();
        long beginTransaction = fVar.beginTransaction(Thread.currentThread().getId());
        if (!z) {
            fVar.execSQL("snsExtInfo3", "Alter table snsExtInfo3 add imBGaeskey STRING");
        }
        if (!z2) {
            fVar.execSQL("snsExtInfo3", "Alter table snsExtInfo3 add imBGauthkey STRING");
        }
        if (!z3) {
            fVar.execSQL("snsExtInfo3", "Alter table snsExtInfo3 add imBGmd5sum STRING");
        }
        if (!z4) {
            fVar.execSQL("snsExtInfo3", "Alter table snsExtInfo3 add imBGfileid STRING");
        }
        fVar.endTransaction(beginTransaction);
        SnsMethodCalculate.markEndTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        this.f294085e = fVar;
        this.f294086f = pVar;
        Log.m105924i("MicroMsg.SnsExtStorage", "createExtStorage " + fVar + "  " + Thread.currentThread().getId());
    }

    /* renamed from: CP */
    public boolean mo139773CP(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("updateSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        int i3 = -1;
        int i4 = Yt.field_iFlag | 4096;
        int i5 = (Yt.mo139770m2() != null ? Yt.mo139770m2().f130395g : 0) | 4096;
        if (z) {
            i3 = 4320;
        }
        if (z2) {
            i3 = 72;
        }
        if (z4) {
            i3 = TAVExporter.VIDEO_EXPORT_WIDTH;
        }
        if (z3) {
            i2 = i4 | 2048;
            i = i5 | 2048;
        } else {
            i2 = i4 & -2049;
            i = i5 & -2049;
        }
        Yt.field_iFlag = i2;
        a94 m2 = Yt.mo139770m2();
        if (m2 != null) {
            m2.f130395g = i;
            m2.f130396h = i3;
            SnsMethodCalculate.markStartTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            try {
                Yt.field_snsuser = m2.toByteArray();
            } catch (Exception unused) {
            }
            SnsMethodCalculate.markEndTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        }
        mo139790nP(Yt);
        SnsMethodCalculate.markEndTimeMs("updateSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }

    /* renamed from: DN */
    public boolean mo139774DN(C100398c0 c0Var) {
        SnsMethodCalculate.markStartTimeMs("replaceImp", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        boolean replace = super.replace(c0Var);
        SnsMethodCalculate.markEndTimeMs("replaceImp", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return replace;
    }

    /* renamed from: LL */
    public boolean mo139775LL(C100398c0 c0Var) {
        C35295p pVar;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (!this.f294084d || (pVar = this.f294086f) == null) {
            boolean DN = mo139774DN(c0Var);
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return DN;
        }
        C30413l1 l1Var = (C30413l1) pVar;
        l1Var.getClass();
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        if (c0Var == null || Util.isNullOrNil(c0Var.field_userName)) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        } else {
            C94866e1.my0().post(new C30412k1(l1Var, c0Var));
            z = true;
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        SnsMethodCalculate.markStartTimeMs("push", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C35295p pVar2 = this.f294086f;
        if (pVar2 != null) {
            SnsMethodCalculate.markStartTimeMs("push", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            C94866e1.my0().post(new C30408i1((C30413l1) pVar2));
            SnsMethodCalculate.markEndTimeMs("push", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        }
        SnsMethodCalculate.markEndTimeMs("push", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return z;
    }

    /* renamed from: Lo */
    public void mo139776Lo(String str) {
        SnsMethodCalculate.markStartTimeMs("delMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        Yt.field_userName = str;
        super.delete(Yt, getPrimaryKey());
        SnsMethodCalculate.markEndTimeMs("delMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    /* renamed from: NQ */
    public void mo139777NQ(String str, List<q94> list) {
        SnsMethodCalculate.markStartTimeMs("updateSnsYearMonthInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (list == null) {
            Log.m105924i("MicroMsg.SnsExtStorage", "updateSnsYearMonthInfo info is null");
            list = new ArrayList<>();
        }
        Log.m105925i("MicroMsg.SnsExtStorage", "updateSnsYearMonthInfo size:%s", Integer.valueOf(list.size()));
        C100398c0 Yt = mo139782Yt(str);
        z84 n2 = Yt.mo139771n2();
        n2.f145766d.clear();
        n2.f145766d.addAll(list);
        SnsMethodCalculate.markStartTimeMs("setSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            Yt.field_snsYearMonthInfo = n2.toByteArray();
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("setSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        mo139790nP(Yt);
        SnsMethodCalculate.markEndTimeMs("updateSnsYearMonthInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    /* renamed from: Ow */
    public C51865wq1 mo139778Ow(String str) {
        SnsMethodCalculate.markStartTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C51865wq1 wq12 = new C51865wq1();
        C100398c0 Yt = mo139782Yt(str);
        try {
            if (!Util.isNullOrNil(Yt.field_faultS)) {
                wq12 = (C51865wq1) new C51865wq1().parseFrom(Yt.field_faultS);
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SnsExtStorage", "parser field_faultS error");
        }
        if (wq12 == null) {
            wq12 = new C51865wq1();
        }
        SnsMethodCalculate.markEndTimeMs("getFault", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return wq12;
    }

    /* renamed from: SE */
    public a94 mo139779SE(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsUserInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        a94 m2 = mo139782Yt(str).mo139770m2();
        SnsMethodCalculate.markEndTimeMs("getSnsUserInfo", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return m2;
    }

    /* renamed from: TE */
    public int mo139780TE(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("insertAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        Yt.field_albumMd5 = str2;
        Yt.field_lastFirstPageRequestErrType = i;
        Yt.field_lastFirstPageRequestErrCode = i2;
        super.replace(Yt);
        SnsMethodCalculate.markEndTimeMs("insertAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    /* renamed from: TO */
    public void mo139781TO() {
        SnsMethodCalculate.markStartTimeMs("resetTimeLineMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt("@__weixintimtline");
        Yt.field_md5 = "";
        Yt.field_albumMd5 = "";
        mo139775LL(Yt);
        SnsMethodCalculate.markEndTimeMs("resetTimeLineMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    /* renamed from: Yt */
    public C100398c0 mo139782Yt(String str) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 c0Var = new C100398c0();
        C35295p pVar = this.f294086f;
        if (pVar != null && this.f294084d) {
            C30413l1 l1Var = (C30413l1) pVar;
            l1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("getExt", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            C100398c0 c0Var2 = l1Var.f82026a.get(str);
            SnsMethodCalculate.markEndTimeMs("getExt", "com.tencent.mm.plugin.sns.model.SnsExtCache");
            if (c0Var2 != null) {
                SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                return c0Var2;
            }
            c0Var = new C100398c0();
        }
        c0Var.field_userName = str;
        super.get(c0Var, getPrimaryKey());
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return c0Var;
    }

    /* renamed from: bD */
    public a94 mo139783bD(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        a94 m2 = mo139782Yt(str).mo139770m2();
        if (m2 == null) {
            Log.m105920e("MicroMsg.SnsExtStorage", "userinfo is null");
            SnsMethodCalculate.markEndTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return null;
        }
        int i = m2.f130395g;
        m2.f130395g = z ? i | 1 : i & -2;
        SnsMethodCalculate.markEndTimeMs("getSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return m2;
    }

    /* renamed from: bF */
    public int mo139784bF(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        Yt.field_md5 = str2;
        super.replace(Yt);
        SnsMethodCalculate.markEndTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    /* renamed from: bO */
    public boolean mo139785bO(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("replaceNewerIds", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        Yt.field_newerIds = str2;
        boolean replace = super.replace(Yt);
        SnsMethodCalculate.markEndTimeMs("replaceNewerIds", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return replace;
    }

    /* renamed from: jo */
    public void mo139786jo(C100398c0 c0Var, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("clearBackgroundImageIfBanned", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (TextUtils.isEmpty(str)) {
            Log.m105929w("MicroMsg.SnsExtStorage", "clear cached background image as it has been banned: username=%s", str2);
            String YO = C94866e1.m120262YO();
            C86013q1.m106447h(C94938q1.m120518e(YO, str2) + (str2 + "tbg_"));
            C86013q1.m106447h(C94938q1.m120518e(YO, str2) + (str2 + "bg_"));
            c0Var.field_older_bgId = null;
            c0Var.field_bgId = null;
        }
        SnsMethodCalculate.markEndTimeMs("clearBackgroundImageIfBanned", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    /* renamed from: kD */
    public a94 mo139787kD(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        SnsMethodCalculate.markStartTimeMs("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        a94 m2 = mo139782Yt(str).mo139770m2();
        if (m2 == null) {
            Log.m105920e("MicroMsg.SnsExtStorage", "userinfo is null");
            SnsMethodCalculate.markEndTimeMs("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return null;
        }
        int i = -1;
        int i2 = m2.f130395g | 4096;
        if (z) {
            i = 4320;
        }
        if (z2) {
            i = 72;
        }
        if (z4) {
            i = TAVExporter.VIDEO_EXPORT_WIDTH;
        }
        m2.f130395g = z3 ? i2 | 2048 : i2 & -2049;
        m2.f130396h = i;
        SnsMethodCalculate.markEndTimeMs("getSnsRecentFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return m2;
    }

    /* renamed from: mI */
    public int mo139788mI(String str, String str2, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        Yt.field_md5 = str2;
        Yt.field_lastFirstPageRequestErrType = i;
        Yt.field_lastFirstPageRequestErrCode = i2;
        super.replace(Yt);
        SnsMethodCalculate.markEndTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    /* renamed from: mL */
    public int mo139789mL(String str, String str2, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        Yt.field_md5 = str2;
        Yt.field_adsession = bArr;
        super.replace(Yt);
        SnsMethodCalculate.markEndTimeMs("insertMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return 0;
    }

    /* renamed from: nP */
    public boolean mo139790nP(C100398c0 c0Var) {
        String str;
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (c0Var == null || (str = c0Var.field_userName) == null || str.equals("")) {
            SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return false;
        }
        boolean replace = super.replace(c0Var);
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return replace;
    }

    /* renamed from: qq */
    public void mo139791qq() {
        SnsMethodCalculate.markStartTimeMs("detchCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        this.f294084d = false;
        C30413l1 l1Var = (C30413l1) this.f294086f;
        l1Var.getClass();
        SnsMethodCalculate.markStartTimeMs("pushAll", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        C94866e1.my0().post(new C30410j1(l1Var));
        SnsMethodCalculate.markEndTimeMs("pushAll", "com.tencent.mm.plugin.sns.model.SnsExtCache");
        Log.m105918d("MicroMsg.SnsExtStorage", "detchCache");
        SnsMethodCalculate.markEndTimeMs("detchCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
    }

    public /* bridge */ /* synthetic */ boolean replace(IAutoDBItem iAutoDBItem) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        boolean LL = mo139775LL((C100398c0) iAutoDBItem);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return LL;
    }

    /* renamed from: uP */
    public boolean mo139792uP(String str, a94 a94) {
        SnsMethodCalculate.markStartTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        if (a94 == null) {
            SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            return false;
        }
        C100398c0 Yt = mo139782Yt(str);
        String q0 = C102236a0.m134765q0(a94.f130394f);
        if (!Util.isNullOrNil(a94.f130393e) && (Yt.field_bgUrl == null || !Yt.field_bgId.equals(q0))) {
            Yt.field_older_bgId = Yt.field_bgId;
            SnsMethodCalculate.markStartTimeMs("setChnage", "com.tencent.mm.plugin.sns.storage.SnsExt");
            Yt.field_local_flag |= 1;
            Yt.mo139772o2();
            SnsMethodCalculate.markEndTimeMs("setChnage", "com.tencent.mm.plugin.sns.storage.SnsExt");
            Log.m105918d("MicroMsg.SnsExtStorage", "bg change");
        }
        Yt.field_bgId = q0;
        String str2 = a94.f130393e;
        Yt.field_bgUrl = str2;
        mo139786jo(Yt, str2, str);
        Yt.field_iFlag = a94.f130392d;
        Yt.field_snsBgId = a94.f130394f;
        Yt.field_local_flag |= 4;
        int i = a94.f130395g;
        if ((i & 4096) == 0) {
            if ((i & 512) > 0) {
                a94.f130395g = i | 4096;
                a94.f130396h = 4320;
            } else if ((i & 1024) > 0) {
                a94.f130395g = i | 4096;
                a94.f130396h = 72;
            }
        }
        SnsMethodCalculate.markStartTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            Yt.field_snsuser = a94.toByteArray();
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        mo139775LL(Yt);
        SnsMethodCalculate.markEndTimeMs("updateBg", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }

    /* renamed from: vP */
    public boolean mo139793vP(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        C100398c0 Yt = mo139782Yt(str);
        int i = Yt.field_iFlag;
        Yt.field_iFlag = z ? i | 1 : i & -2;
        mo139790nP(Yt);
        SnsMethodCalculate.markEndTimeMs("updateSnsFlag", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        return true;
    }
}
