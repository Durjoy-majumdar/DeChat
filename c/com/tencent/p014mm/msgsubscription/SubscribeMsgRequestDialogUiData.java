package com.tencent.p014mm.msgsubscription;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import zd0.C23466p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestDialogUiData;", "Landroid/os/Parcelable;", "<init>", "()V", "b", "ItemUiData", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData */
public final class SubscribeMsgRequestDialogUiData implements Parcelable {
    public static final Parcelable.Creator<SubscribeMsgRequestDialogUiData> CREATOR = new C17804a();

    /* renamed from: g */
    public static final C17805b f48992g = new C17805b((C8480h) null);

    /* renamed from: d */
    public int f48993d = 0;

    /* renamed from: e */
    public int f48994e;

    /* renamed from: f */
    public ArrayList<ItemUiData> f48995f = new ArrayList<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestDialogUiData$ItemUiData;", "Landroid/os/Parcelable;", "<init>", "()V", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$ItemUiData */
    public static final class ItemUiData implements Parcelable {
        public static final Parcelable.Creator<ItemUiData> CREATOR = new C17803a();

        /* renamed from: d */
        public String f48996d = "";

        /* renamed from: e */
        public int f48997e;

        /* renamed from: f */
        public boolean f48998f;

        /* renamed from: g */
        public boolean f48999g;

        /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$ItemUiData$a */
        public static final class C17803a implements Parcelable.Creator<ItemUiData> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                ItemUiData itemUiData = new ItemUiData();
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                itemUiData.f48996d = readString;
                itemUiData.f48997e = parcel.readInt();
                boolean z = false;
                itemUiData.f48998f = parcel.readInt() == 1;
                if (parcel.readInt() == 0) {
                    z = true;
                }
                itemUiData.f48999g = z;
                return itemUiData;
            }

            public Object[] newArray(int i) {
                return new ItemUiData[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f48996d);
            parcel.writeInt(this.f48997e);
            parcel.writeInt(this.f48998f ? 1 : 0);
            parcel.writeInt(this.f48999g ? 1 : 0);
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$a */
    public static final class C17804a implements Parcelable.Creator<SubscribeMsgRequestDialogUiData> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData = new SubscribeMsgRequestDialogUiData();
            subscribeMsgRequestDialogUiData.f48993d = parcel.readInt();
            subscribeMsgRequestDialogUiData.f48994e = parcel.readInt();
            ArrayList<ItemUiData> arrayList = new ArrayList<>();
            parcel.readList(arrayList, ItemUiData.class.getClassLoader());
            subscribeMsgRequestDialogUiData.f48995f = arrayList;
            return subscribeMsgRequestDialogUiData;
        }

        public Object[] newArray(int i) {
            return new SubscribeMsgRequestDialogUiData[i];
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$b */
    public static final class C17805b {
        public C17805b(C8480h hVar) {
        }

        /* renamed from: a */
        public final SubscribeMsgRequestDialogUiData mo21949a(int i, List<C23466p.C23474i> list, boolean z) {
            C87412m.m108594g(list, "itemsShowOnDialog");
            SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData = new SubscribeMsgRequestDialogUiData();
            subscribeMsgRequestDialogUiData.f48994e = z ? 1 : 0;
            int i2 = 3;
            if (i == 1) {
                i2 = 1;
            } else if (i != 3) {
                i2 = 2;
            }
            subscribeMsgRequestDialogUiData.f48993d = i2;
            for (C23466p.C23474i next : list) {
                ArrayList<ItemUiData> arrayList = subscribeMsgRequestDialogUiData.f48995f;
                ItemUiData itemUiData = new ItemUiData();
                String str = next.f67356d;
                C87412m.m108594g(str, "<set-?>");
                itemUiData.f48996d = str;
                itemUiData.f48997e = next.f67353a ? 1 : 0;
                if (next instanceof C23466p.C23482l) {
                    itemUiData.f48998f = ((C23466p.C23482l) next).f67378g;
                } else if (next instanceof C23466p.C23481k) {
                    itemUiData.f48999g = ((C23466p.C23481k) next).f67376f;
                }
                arrayList.add(itemUiData);
            }
            return subscribeMsgRequestDialogUiData;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f48993d);
        parcel.writeInt(this.f48994e);
        parcel.writeList(this.f48995f);
    }
}
