package kw2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C38547d6;

/* renamed from: kw2.g */
public final class C99266g extends C38547d6 {

    /* renamed from: q */
    public static final IAutoDBItem.MAutoDBInfo f291068q = C38547d6.initAutoDBInfo(C99268i.class);

    /* renamed from: p */
    public C99268i f291069p = new C99268i();

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f291068q;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public final String mo138649l2() {
        String str = this.field_date;
        C87412m.m108593f(str, "field_date");
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StoryHistoryInfo[localId:");
        C99268i iVar = this.f291069p;
        sb.append(iVar != null ? Integer.valueOf((int) iVar.systemRowid) : null);
        sb.append(" date:");
        sb.append(mo138649l2());
        sb.append(" count:");
        sb.append(this.field_count);
        sb.append(']');
        return sb.toString();
    }
}
