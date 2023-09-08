package gm2;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import gy3.C24560g0;
import gy3.C87412m;

/* renamed from: gm2.d */
public final class C59598d extends MvvmStorage<C32484b> {

    /* renamed from: d */
    public final String f170308d = "MicroMsg.SecData.SecReportDataInfoStorage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59598d(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* renamed from: c3 */
    public final C32484b mo84614c3(String str) {
        C87412m.m108594g(str, "id");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        return (C32484b) get(contentValues, C24560g0.m30725a(C32484b.class));
    }

    public String getLogTag() {
        return this.f170308d;
    }
}
