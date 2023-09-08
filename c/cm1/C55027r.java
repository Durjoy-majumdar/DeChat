package cm1;

import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import te3.C64417hb1;
import te3.C64488kb1;
import tf1.C13914m;
import up1.C65418l;

/* renamed from: cm1.r */
public final class C55027r implements C0740i2 {

    /* renamed from: d */
    public final C65418l f154485d;

    public C55027r(C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        this.f154485d = lVar;
    }

    /* renamed from: a */
    public final String mo76079a() {
        C64417hb1 hb12;
        C64488kb1 kb12 = null;
        if (mo76080b()) {
            FinderObjectDesc finderObjectDesc = this.f154485d.mo89514l2().getFeedObject().objectDesc;
            if (!(finderObjectDesc == null || (hb12 = finderObjectDesc.mvInfo) == null)) {
                kb12 = hb12.f183456e;
            }
            String str = "";
            if (kb12 == null) {
                return str;
            }
            if (Util.isNullOrNil(kb12.f183905e)) {
                String str2 = kb12.f183904d;
                return str2 == null ? str : str2;
            } else if (Util.isNullOrNil(kb12.f183904d)) {
                return String.valueOf(kb12.f183905e);
            } else {
                StringBuilder sb = new StringBuilder();
                String str3 = kb12.f183904d;
                if (str3 != null) {
                    str = str3;
                }
                sb.append(str);
                sb.append('-');
                sb.append(kb12.f183905e);
                return sb.toString();
            }
        } else {
            FinderObjectDesc finderObjectDesc2 = this.f154485d.mo89514l2().getFeedObject().objectDesc;
            if (finderObjectDesc2 != null) {
                return finderObjectDesc2.description;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo76080b() {
        return this.f154485d.field_objectType == 2;
    }

    /* renamed from: c */
    public int mo75c() {
        return C55027r.class.getName().hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C55027r rVar = mVar instanceof C55027r ? (C55027r) mVar : null;
        if (rVar == null) {
            return -1;
        }
        C65418l lVar = rVar.f154485d;
        long j = lVar.field_localId;
        if (j > 0) {
            long j2 = this.f154485d.field_localId;
            if (j2 > 0 && j == j2) {
                return 0;
            }
        }
        long j3 = this.f154485d.field_objectId;
        if (j3 == 0) {
            return -1;
        }
        long j4 = lVar.field_objectId;
        return (j4 == 0 || j3 != j4) ? -1 : 0;
    }

    public long getItemId() {
        C65418l lVar = this.f154485d;
        long j = lVar.field_localId;
        return j != 0 ? j : lVar.field_objectId;
    }
}
