package com.tencent.p014mm.msgsubscription.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/presenter/SubscribeMsgSettingData;", "Landroid/os/Parcelable;", "CREATOR", "a", "biz-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData */
public final class SubscribeMsgSettingData implements Parcelable {
    public static final C17810a CREATOR = new C17810a((C8480h) null);

    /* renamed from: d */
    public boolean f49050d;

    /* renamed from: e */
    public boolean f49051e;

    /* renamed from: f */
    public List<SubscribeMsgTmpItem> f49052f;

    /* renamed from: g */
    public String f49053g;

    /* renamed from: h */
    public SubscribeMsgRequestResult f49054h;

    /* renamed from: com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData$a */
    public static final class C17810a implements Parcelable.Creator<SubscribeMsgSettingData> {
        public C17810a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new SubscribeMsgSettingData(parcel);
        }

        public Object[] newArray(int i) {
            return new SubscribeMsgSettingData[i];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r5 = r5.f49041h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubscribeMsgSettingData(com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r5 = "result"
            gy3.C87412m.m108594g(r4, r5)
            r3.<init>()
            r3.f49054h = r4
            boolean r5 = r4.f49009p
            r3.f49050d = r5
            boolean r5 = r4.f49008o
            r3.f49051e = r5
            com.tencent.mm.msgsubscription.WordingInfo r5 = r4.f49007n
            if (r5 == 0) goto L_0x001a
            java.lang.String r5 = r5.f49041h
            if (r5 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r5 = ""
        L_0x001c:
            r3.f49053g = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r4 = r4.f49004h
            java.util.Iterator r4 = r4.iterator()
        L_0x0029:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r4.next()
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = (com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem) r0
            android.os.Parcel r1 = android.os.Parcel.obtain()
            java.lang.String r2 = "obtain()"
            gy3.C87412m.m108593f(r1, r2)
            r2 = 0
            r0.writeToParcel(r1, r2)
            r1.setDataPosition(r2)
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem
            r0.<init>(r1)
            r5.add(r0)
            r1.recycle()
            goto L_0x0029
        L_0x0051:
            r3.f49052f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData.<init>(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult, boolean):void");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeByte(this.f49050d ? (byte) 1 : 0);
        parcel.writeByte(this.f49051e ? (byte) 1 : 0);
        parcel.writeTypedList(this.f49052f);
        parcel.writeString(this.f49053g);
        parcel.writeParcelable(this.f49054h, i);
    }

    public SubscribeMsgSettingData(Parcel parcel) {
        C87412m.m108594g(parcel, "parcel");
        boolean z = true;
        this.f49050d = parcel.readByte() != 0;
        this.f49051e = parcel.readByte() == 0 ? false : z;
        ArrayList<SubscribeMsgTmpItem> createTypedArrayList = parcel.createTypedArrayList(SubscribeMsgTmpItem.CREATOR);
        C87412m.m108591d(createTypedArrayList);
        this.f49052f = createTypedArrayList;
        this.f49053g = String.valueOf(parcel.readString());
        Parcelable readParcelable = parcel.readParcelable(SubscribeMsgRequestResult.class.getClassLoader());
        C87412m.m108591d(readParcelable);
        this.f49054h = (SubscribeMsgRequestResult) readParcelable;
    }
}
