package iu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import gy3.C87412m;
import ju2.C99054m;
import kotlin.Metadata;
import vr2.C102236a0;
import zb2.C66777a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, mo182094d2 = {"Liu2/a;", "Lzb2/a;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: iu2.a */
public final class C98799a extends C66777a<C98799a> {

    /* renamed from: d */
    public final C98214b f289651d;

    public C98799a(C98214b bVar) {
        C87412m.m108594g(bVar, "info");
        this.f289651d = bVar;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        SnsMethodCalculate.markStartTimeMs("getUniqueId", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        String str = (this.f289651d.isAd() ? "ad_table_" : "sns_table_") + '_' + this.f289651d.mo137526z2();
        SnsMethodCalculate.markEndTimeMs("getUniqueId", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return str;
    }

    /* renamed from: b */
    public final C98214b mo138170b() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        C98214b bVar = this.f289651d;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return bVar;
    }

    /* renamed from: c */
    public int mo75c() {
        SnsMethodCalculate.markStartTimeMs("getItemType", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        int a = C99054m.f290360a.mo138406a(this.f289651d);
        SnsMethodCalculate.markEndTimeMs("getItemType", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return a;
    }

    public Object clone() {
        SnsMethodCalculate.markStartTimeMs("clone", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        Object clone = super.clone();
        SnsMethodCalculate.markEndTimeMs("clone", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return clone;
    }

    public int compareTo(Object obj) {
        SnsMethodCalculate.markStartTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        C98799a aVar = (C98799a) obj;
        SnsMethodCalculate.markStartTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        C87412m.m108594g(aVar, "other");
        int i = aVar.f289651d.getCreateTime() != this.f289651d.getCreateTime() ? C87412m.m108596i(aVar.f289651d.getCreateTime(), this.f289651d.getCreateTime()) : aVar.f289651d.mo137504B2().compareTo(this.f289651d.mo137504B2());
        SnsMethodCalculate.markEndTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        SnsMethodCalculate.markEndTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return i;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        if (obj instanceof C98799a) {
            boolean b = C87412m.m108589b(mo344Oa(), ((C98799a) obj).mo344Oa());
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
            return b;
        }
        SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return false;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        C98799a aVar = (C98799a) obj;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        C87412m.m108594g(aVar, "other");
        boolean z = false;
        if (aVar.f289651d.isAd()) {
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        } else {
            if (this.f289651d.compareContent(aVar.f289651d) && C102236a0.m134765q0(this.f289651d.mo142401p2()).equals(C102236a0.m134765q0(aVar.f289651d.mo142401p2())) && C87412m.m108589b(this.f289651d.mo137503A2(), aVar.f289651d.mo137503A2())) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        }
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return z;
    }
}
