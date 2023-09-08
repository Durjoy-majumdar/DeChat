package wh3;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import o90.C100308d;
import p534gl.C32472e;

/* renamed from: wh3.i */
public final class C38134i extends MAutoStorage<C32472e> {

    /* renamed from: f */
    public static final String[] f100774f = {MAutoStorage.getCreateSQLs(C32472e.f86277r, "EmojiSuggestCacheInfo")};

    /* renamed from: g */
    public static final String f100775g = "MicroMsg.EmojiSuggestCacheStorage";

    /* renamed from: d */
    public final ISQLiteDatabase f100776d;

    /* renamed from: e */
    public final C100308d<String, C32472e> f100777e = new C100308d<>(100);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38134i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C32472e.f86277r, "EmojiSuggestCacheInfo", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C32472e.f86277r;
        this.f100776d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final void mo61533Lo(C32472e eVar) {
        C87412m.m108594g(eVar, "info");
        this.f100777e.put(eVar.field_desc, eVar);
        super.replace(eVar);
    }

    /* renamed from: jo */
    public final C32472e mo61534jo(String str) {
        C87412m.m108594g(str, "desc");
        C32472e eVar = this.f100777e.get(str);
        if (eVar != null) {
            return eVar;
        }
        C32472e eVar2 = new C32472e();
        eVar2.field_desc = str;
        boolean z = false;
        super.get(eVar2, getPrimaryKey());
        byte[] bArr = eVar2.field_content;
        if (bArr != null) {
            if (bArr.length == 0) {
                z = true;
            }
            z = !z;
        }
        if (!z) {
            eVar2 = null;
        }
        if (eVar2 != null) {
            this.f100777e.put(eVar2.field_desc, eVar2);
        }
        return eVar2;
    }
}
