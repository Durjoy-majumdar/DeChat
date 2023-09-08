package kw2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C87412m;
import p749xh.C38707y8;

/* renamed from: kw2.l */
public final class C34077l extends MAutoStorage<C34076k> implements MStorage.IOnStorageChange {

    /* renamed from: e */
    public static final String[] f91950e = {MAutoStorage.getCreateSQLs(C34076k.f91949v, "StoryRoomInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f91951d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34077l(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C34076k.f91949v, "StoryRoomInfo", C38707y8.f104342j);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C34076k.f91949v;
        this.f91951d = iSQLiteDatabase;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
    }
}
