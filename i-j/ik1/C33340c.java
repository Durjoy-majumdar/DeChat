package ik1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import hg1.C32890c;
import ig1.C33321h;
import p749xh.C38580i3;

/* renamed from: ik1.c */
public final class C33340c extends C32890c {

    /* renamed from: e */
    public final ISQLiteDatabase f90378e;

    /* renamed from: f */
    public final String f90379f = "select * from FinderLiveConfig ";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33340c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33321h.f90339p, "FinderLiveConfig", C38580i3.f102530g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C33321h.f90339p;
        this.f90378e = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public boolean replace(C33321h hVar) {
        C87412m.m108594g(hVar, "item");
        boolean replace = super.replace(hVar);
        Log.m105924i("Finder.FinderLiveConfigStorage", "insert " + hVar.field_key + ", ret:" + replace);
        return replace;
    }
}
