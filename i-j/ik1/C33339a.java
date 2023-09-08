package ik1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import hg1.C32889a;
import ig1.C33316a;
import ks3.C10407d;
import p749xh.C38565g3;

/* renamed from: ik1.a */
public final class C33339a extends C32889a {

    /* renamed from: e */
    public final ISQLiteDatabase f90377e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33339a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33316a.f90334p, "FinderLiveActionRecord", C38565g3.f102335g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33316a.f90334p;
        this.f90377e = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final String mo59077jo(String str, C10407d dVar) {
        return MD5Util.getMD5String(str) + '_' + dVar.ordinal();
    }
}
