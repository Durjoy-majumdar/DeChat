package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import android.os.Parcel;
import android.os.Parcelable;
import be0.C16783a;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/SubscribeMsgExecutor;", "Lcom/tencent/mm/plugin/appbrand/jsapi/msgsubscription/ISubscribeMsgCGIExecutor;", "b", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor */
public final class SubscribeMsgExecutor implements ISubscribeMsgCGIExecutor {
    public static final Parcelable.Creator<SubscribeMsgExecutor> CREATOR = new C82830a();

    /* renamed from: d */
    public final String f242242d;

    /* renamed from: e */
    public SubscribeMsgRequestDialogUiData f242243e;

    /* renamed from: f */
    public C82831b f242244f;

    /* renamed from: g */
    public byte[] f242245g;

    /* renamed from: h */
    public List<SubscribeMsgTmpItem> f242246h = new ArrayList();

    /* renamed from: i */
    public C16783a.C16784a f242247i = C17912a.f49411a;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor$a */
    public static final class C82830a implements Parcelable.Creator<SubscribeMsgExecutor> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            SubscribeMsgExecutor subscribeMsgExecutor = new SubscribeMsgExecutor(String.valueOf(parcel.readString()));
            List<SubscribeMsgTmpItem> list = subscribeMsgExecutor.f242246h;
            Collection createTypedArrayList = parcel.createTypedArrayList(SubscribeMsgTmpItem.CREATOR);
            if (createTypedArrayList == null) {
                createTypedArrayList = C64186f0.f181907d;
            }
            ((ArrayList) list).addAll(createTypedArrayList);
            byte[] bArr = new byte[parcel.readInt()];
            subscribeMsgExecutor.f242245g = bArr;
            parcel.readByteArray(bArr);
            subscribeMsgExecutor.f242243e = (SubscribeMsgRequestDialogUiData) parcel.readParcelable(SubscribeMsgRequestDialogUiData.class.getClassLoader());
            return subscribeMsgExecutor;
        }

        public Object[] newArray(int i) {
            return new SubscribeMsgExecutor[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor$b */
    public interface C82831b {
        /* renamed from: a */
        void mo115059a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult);

        /* renamed from: b */
        void mo115060b(SubscribeMsgRequestResult subscribeMsgRequestResult);
    }

    public SubscribeMsgExecutor(String str) {
        this.f242242d = str;
    }

    /* renamed from: a */
    public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "errMsg");
        C82831b bVar = this.f242244f;
        if (bVar != null) {
            bVar.mo115059a(i, i2, str, subscribeMsgRequestResult);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f242242d);
        }
        if (parcel != null) {
            parcel.writeTypedList(this.f242246h);
        }
        if (parcel != null) {
            byte[] bArr = this.f242245g;
            parcel.writeInt(bArr != null ? bArr.length : 0);
        }
        if (parcel != null) {
            byte[] bArr2 = this.f242245g;
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            parcel.writeByteArray(bArr2);
        }
        if (parcel != null) {
            parcel.writeParcelable(this.f242243e, i);
        }
    }
}
