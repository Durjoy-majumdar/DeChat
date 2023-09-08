package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.io.IOException;
import pe3.C47465a;

/* renamed from: com.tencent.mm.plugin.game.model.e0 */
public class C30099e0 extends MAutoStorage<C30098d0> {

    /* renamed from: d */
    public static final String[] f81399d = {MAutoStorage.getCreateSQLs(C30098d0.f81398p, "GamePBCache")};

    public C30099e0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C30098d0.f81398p, "GamePBCache", (String[]) null);
    }

    /* renamed from: Lo */
    public boolean mo57115Lo(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C30098d0 d0Var = new C30098d0();
        d0Var.field_key = str;
        return super.delete(d0Var, new String[0]);
    }

    /* renamed from: Rz */
    public byte[] mo57116Rz(String str) {
        if (Util.isNullOrNil(str) || !LocaleUtil.getApplicationLanguage().equals(MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0).getString("game_center_pref_lang", LocaleUtil.getApplicationLanguage()))) {
            return null;
        }
        C30098d0 d0Var = new C30098d0();
        d0Var.field_key = str;
        if (super.get(d0Var, new String[0])) {
            return d0Var.field_value;
        }
        return null;
    }

    /* renamed from: Yt */
    public boolean mo57117Yt(String str, byte[] bArr) {
        boolean z;
        if (bArr == null) {
            return false;
        }
        C30098d0 d0Var = new C30098d0();
        d0Var.field_key = str;
        if (super.get(d0Var, new String[0])) {
            d0Var.field_value = bArr;
            z = super.update(d0Var, new String[0]);
        } else {
            d0Var.field_value = bArr;
            z = super.insert(d0Var);
        }
        if (!z) {
            Log.m105920e("MicroMsg.GamePBCacheStorage", "Saving cache failed (update or insert)");
        }
        return z;
    }

    /* renamed from: jo */
    public void mo57118jo(String str) {
        String str2 = "delete from GamePBCache where key like '%" + str + "'";
        Log.m105925i("MicroMsg.GamePBCacheStorage", "deleteDataWithSuffix, ret:%b, sql: %s", Boolean.valueOf(execSQL("GameHaowanMedia", str2)), str2);
    }

    /* renamed from: qq */
    public boolean mo57119qq(String str, C47465a aVar) {
        if (!Util.isNullOrNil(str) && aVar != null) {
            try {
                return mo57117Yt(str, aVar.toByteArray());
            } catch (IOException e) {
                Log.m105921e("MicroMsg.GamePBCacheStorage", "Saving Failed: %s", e.getMessage());
            }
        }
        return false;
    }
}
