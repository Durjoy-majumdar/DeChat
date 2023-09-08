package com.tencent.p014mm.plugin.finder.extension.reddot;

import android.database.Cursor;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderExceptionDetectStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.Arrays;
import p749xh.C66277w3;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.w */
public final class C55724w extends MAutoStorage<C55718s0> {

    /* renamed from: e */
    public static final String[] f158596e = {MAutoStorage.getCreateSQLs(C55718s0.f158582G, "FinderRedDotInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f158597d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55724w(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C55718s0.f158582G, "FinderRedDotInfo", C66277w3.f190705q);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C55718s0.f158582G;
        this.f158597d = iSQLiteDatabase;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, boolean z, String[] strArr) {
        C55718s0 s0Var = (C55718s0) iAutoDBItem;
        C87412m.m108594g(strArr, "keys");
        StringBuilder sb = new StringBuilder();
        sb.append("[delete] item=");
        sb.append(s0Var != null ? s0Var.field_tipsId : null);
        sb.append(" isNotify=");
        sb.append(z);
        Log.m105924i("Finder.RedDotCtrInfoStorage", sb.toString());
        return super.delete(s0Var, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: jo */
    public final boolean mo77315jo(C55718s0 s0Var, boolean z) {
        C87412m.m108594g(s0Var, "item");
        boolean z2 = true;
        if (this.f158597d.update(getTableName(), s0Var.convertTo(), "tipsId = ?", new String[]{s0Var.field_tipsId}) <= 0) {
            z2 = false;
        }
        if (z2 && z) {
            doNotify("update");
        }
        Log.m105924i("Finder.RedDotCtrInfoStorage", "[update] ret=" + z2 + " item=" + s0Var.field_tipsId + " isNotify=" + z);
        return z2;
    }

    public boolean replace(IAutoDBItem iAutoDBItem, boolean z) {
        C55718s0 s0Var = (C55718s0) iAutoDBItem;
        boolean z2 = false;
        if (s0Var == null) {
            Log.m105924i("Finder.RedDotCtrInfoStorage", "[replace] failure!");
        } else {
            String str = s0Var.field_tipsId;
            C87412m.m108593f(str, "item.field_tipsId");
            Cursor rawQuery = this.f158597d.rawQuery("select * from FinderRedDotInfo  where tipsId = '" + str + "' ", (String[]) null);
            boolean z3 = rawQuery.getCount() > 0;
            rawQuery.close();
            if (z3) {
                try {
                    z2 = mo77315jo(s0Var, z);
                } catch (Exception e) {
                    Log.printErrStackTrace("Finder.RedDotCtrInfoStorage", e, "tipsId=" + s0Var.field_tipsId + " type=" + s0Var.field_ctrType, new Object[0]);
                    FinderExceptionDetectStruct finderExceptionDetectStruct = new FinderExceptionDetectStruct();
                    finderExceptionDetectStruct.f155198d = finderExceptionDetectStruct.mo86045b("InnerVersion", "1", true);
                    finderExceptionDetectStruct.f155199e = 10003;
                    finderExceptionDetectStruct.mo86054n();
                }
            } else {
                z2 = insertNotify(s0Var, z);
            }
            Log.m105924i("Finder.RedDotCtrInfoStorage", "[replace] ret=" + z2 + " isExist=" + z3 + " item=" + s0Var.field_tipsId + " isNotify=" + z);
        }
        return z2;
    }
}
