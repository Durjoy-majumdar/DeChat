package kw2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C38692w8;

/* renamed from: kw2.c */
public final class C34074c extends C38692w8 {

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f91947x = C38692w8.initAutoDBInfo(C34074c.class);

    public void convertFrom(Cursor cursor) {
        C87412m.m108594g(cursor, "cu");
        super.convertFrom(cursor);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f91947x;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public String toString() {
        return this.field_timeStamp + ", " + this.systemRowid + ", " + this.field_mixFlag;
    }
}
