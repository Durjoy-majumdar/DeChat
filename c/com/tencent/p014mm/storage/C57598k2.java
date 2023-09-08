package com.tencent.p014mm.storage;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import gy3.C24560g0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.storage.k2 */
public final class C57598k2 extends MvvmStorage<C30750j2> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57598k2(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* renamed from: c3 */
    public final void mo81950c3(String str) {
        C87412m.m108594g(str, "roomId");
        Log.m105924i("MicroMsg.CropCenterStorage", "deleteImageByRoomId >> roomId: " + str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("chat_room_id", str);
        C30750j2 j2Var = (C30750j2) get(contentValues, C24560g0.m30725a(C30750j2.class));
        if (j2Var != null) {
            Log.m105924i("MicroMsg.CropCenterStorage", "deleteImageByRoomId >> roomId: " + str + ", cropImage: " + j2Var.field_crop_image_path);
            MvvmStorage.delete$default(this, j2Var, false, false, 6, (Object) null);
        }
    }

    public String getLogTag() {
        return "MicroMsg.CropCenterStorage";
    }
}
