package pz0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38583i8;

/* renamed from: pz0.m */
public class C35745m extends C38583i8 {

    /* renamed from: v */
    public static IAutoDBItem.MAutoDBInfo f95463v = C38583i8.initAutoDBInfo(C35745m.class);

    public boolean equals(Object obj) {
        return (obj instanceof C35745m) && this.field_card_id == ((C35745m) obj).field_card_id;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f95463v;
    }

    public int hashCode() {
        String str = this.field_card_id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
