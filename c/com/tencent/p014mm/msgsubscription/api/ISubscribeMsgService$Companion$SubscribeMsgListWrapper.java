package com.tencent.p014mm.msgsubscription.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import rd0.C22222c;
import rd0.C48018e;
import xd0.C23073a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/msgsubscription/api/ISubscribeMsgService$Companion$SubscribeMsgListWrapper", "Landroid/os/Parcelable;", "CREATOR", "a", "biz-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper */
public final class ISubscribeMsgService$Companion$SubscribeMsgListWrapper implements Parcelable {
    public static final C17809a CREATOR = new C17809a((C8480h) null);

    /* renamed from: d */
    public List<SubscribeMsgTmpItem> f49048d;

    /* renamed from: e */
    public boolean f49049e;

    /* renamed from: com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper$a */
    public static final class C17809a implements Parcelable.Creator<ISubscribeMsgService$Companion$SubscribeMsgListWrapper> {
        public C17809a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new ISubscribeMsgService$Companion$SubscribeMsgListWrapper(parcel);
        }

        public Object[] newArray(int i) {
            return new ISubscribeMsgService$Companion$SubscribeMsgListWrapper[i];
        }
    }

    public ISubscribeMsgService$Companion$SubscribeMsgListWrapper(List<SubscribeMsgTmpItem> list, boolean z) {
        C87412m.m108594g(list, "subscribeMsgList");
        ArrayList arrayList = new ArrayList();
        this.f49048d = arrayList;
        arrayList.addAll(list);
        this.f49049e = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeTypedList(this.f49048d);
        parcel.writeByte(this.f49049e ? (byte) 1 : 0);
    }

    public ISubscribeMsgService$Companion$SubscribeMsgListWrapper(Parcel parcel) {
        C23073a f;
        C23073a f2;
        C87412m.m108594g(parcel, "parcel");
        ArrayList arrayList = new ArrayList();
        this.f49048d = arrayList;
        try {
            parcel.readTypedList(arrayList, SubscribeMsgTmpItem.CREATOR);
            this.f49049e = parcel.readByte() != 0;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SubscribeMsgListWrapper", e, "alvinluo SubscribeMsgListWrapper read parcel exception and clear storage", new Object[0]);
            C48018e eVar = C48018e.f128802a;
            C22222c a = eVar.mo72802a("name_biz");
            if (!(a == null || (f2 = a.mo35365f()) == null)) {
                f2.mo36472n2();
            }
            C22222c a2 = eVar.mo72802a("name_wxa");
            if (a2 != null && (f = a2.mo35365f()) != null) {
                f.mo36472n2();
            }
        }
    }
}
