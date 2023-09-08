package ue1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import p749xh.C53330c3;

/* renamed from: ue1.f */
public final class C52528f extends C53330c3 {

    /* renamed from: c1 */
    public static final IAutoDBItem.MAutoDBInfo f146718c1 = C53330c3.initAutoDBInfo(C52528f.class);

    /* renamed from: X0 */
    public C52529a f146719X0;

    /* renamed from: Y0 */
    public C72996z1 f146720Y0;

    /* renamed from: Z0 */
    public CharSequence f146721Z0;

    /* renamed from: a1 */
    public String f146722a1;

    /* renamed from: b1 */
    public String f146723b1;

    /* renamed from: ue1.f$a */
    public interface C52529a {
        /* renamed from: a */
        CharSequence mo73473a(C52528f fVar);

        /* renamed from: b */
        void mo73474b(C52528f fVar);
    }

    public C52528f(C52529a aVar) {
        C87412m.m108594g(aVar, "opDelegator");
        this.f146719X0 = aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C52528f) && ((C52528f) obj).systemRowid == this.systemRowid;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f146718c1;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public int hashCode() {
        return (int) this.systemRowid;
    }

    /* renamed from: l2 */
    public final void mo73472l2() {
        C52529a aVar = this.f146719X0;
        if (aVar != null) {
            aVar.mo73474b(this);
        }
    }

    public C52528f() {
    }
}
