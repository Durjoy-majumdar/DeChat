package com.tencent.p014mm.plugin.appbrand.jsapi.address;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import di3.C7335d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C110823p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract */
public interface AddressSelectorContract extends C7335d {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$AddressNode;", "Landroid/os/Parcelable;", "appbrand-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode */
    public static final class AddressNode implements Parcelable {
        public static final Parcelable.Creator<AddressNode> CREATOR = new C1579a();

        /* renamed from: d */
        public final String f11045d;

        /* renamed from: e */
        public final int f11046e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode$a */
        public static final class C1579a implements Parcelable.Creator<AddressNode> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new AddressNode(parcel.readString(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new AddressNode[i];
            }
        }

        public AddressNode(String str, int i) {
            C87412m.m108594g(str, "name");
            this.f11045d = str;
            this.f11046e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressNode)) {
                return false;
            }
            AddressNode addressNode = (AddressNode) obj;
            return C87412m.m108589b(this.f11045d, addressNode.f11045d) && this.f11046e == addressNode.f11046e;
        }

        public int hashCode() {
            return (this.f11045d.hashCode() * 31) + this.f11046e;
        }

        public String toString() {
            return "AddressNode(name=" + this.f11045d + ", code=" + this.f11046e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f11045d);
            parcel.writeInt(this.f11046e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$SelectRequest;", "Landroid/os/Parcelable;", "appbrand-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest */
    public static final class SelectRequest implements Parcelable {
        public static final Parcelable.Creator<SelectRequest> CREATOR = new C1580a();

        /* renamed from: d */
        public final C1582a f11047d;

        /* renamed from: e */
        public final ArrayList<String> f11048e;

        /* renamed from: f */
        public final boolean f11049f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest$a */
        public static final class C1580a implements Parcelable.Creator<SelectRequest> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                C1582a aVar = (C1582a) C110823p.m150982H(C1582a.values(), parcel.readInt());
                if (aVar == null) {
                    aVar = C1582a.REGION;
                }
                return new SelectRequest(aVar, parcel.createStringArrayList(), parcel.readInt() != 0);
            }

            public Object[] newArray(int i) {
                return new SelectRequest[i];
            }
        }

        public SelectRequest(C1582a aVar, ArrayList<String> arrayList, boolean z) {
            C87412m.m108594g(aVar, "mode");
            this.f11047d = aVar;
            this.f11048e = arrayList;
            this.f11049f = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectRequest)) {
                return false;
            }
            SelectRequest selectRequest = (SelectRequest) obj;
            return this.f11047d == selectRequest.f11047d && C87412m.m108589b(this.f11048e, selectRequest.f11048e) && this.f11049f == selectRequest.f11049f;
        }

        public int hashCode() {
            int hashCode = this.f11047d.hashCode() * 31;
            ArrayList<String> arrayList = this.f11048e;
            int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            boolean z = this.f11049f;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public String toString() {
            return "SelectRequest(mode=" + this.f11047d + ", current=" + this.f11048e + ", autoLocation=" + this.f11049f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            C1582a aVar = this.f11047d;
            C87412m.m108594g(aVar, "<this>");
            parcel.writeInt(aVar.ordinal());
            parcel.writeStringList(this.f11048e);
            parcel.writeInt(this.f11049f ? 1 : 0);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$SelectResponse;", "Landroid/os/Parcelable;", "appbrand-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse */
    public static final class SelectResponse implements Parcelable {
        public static final Parcelable.Creator<SelectResponse> CREATOR = new C1581a();

        /* renamed from: d */
        public final ArrayList<AddressNode> f11050d;

        /* renamed from: e */
        public final int f11051e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse$a */
        public static final class C1581a implements Parcelable.Creator<SelectResponse> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(AddressNode.CREATOR.createFromParcel(parcel));
                }
                return new SelectResponse(arrayList, parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new SelectResponse[i];
            }
        }

        public SelectResponse(ArrayList<AddressNode> arrayList, int i) {
            C87412m.m108594g(arrayList, "list");
            this.f11050d = arrayList;
            this.f11051e = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectResponse)) {
                return false;
            }
            SelectResponse selectResponse = (SelectResponse) obj;
            return C87412m.m108589b(this.f11050d, selectResponse.f11050d) && this.f11051e == selectResponse.f11051e;
        }

        public int hashCode() {
            return (this.f11050d.hashCode() * 31) + this.f11051e;
        }

        public String toString() {
            return "SelectResponse(list=" + this.f11050d + ", postcode=" + this.f11051e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            ArrayList<AddressNode> arrayList = this.f11050d;
            parcel.writeInt(arrayList.size());
            Iterator<AddressNode> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.f11051e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$a */
    public enum C1582a {
        PROVINCE(1),
        CITY(2),
        REGION(3),
        DISTRICT(4);
        

        /* renamed from: e */
        public static final C1583a f11052e = null;

        /* renamed from: d */
        public final int f11058d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$a$a */
        public static final class C1583a {
            public C1583a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C1582a mo1619a(String str) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -987485392:
                            if (str.equals("province")) {
                                return C1582a.PROVINCE;
                            }
                            break;
                        case -934795532:
                            if (str.equals("region")) {
                                return C1582a.REGION;
                            }
                            break;
                        case 3053931:
                            if (str.equals("city")) {
                                return C1582a.CITY;
                            }
                            break;
                        case 649134203:
                            if (str.equals("sub-district")) {
                                return C1582a.DISTRICT;
                            }
                            break;
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f11052e = new C1583a((C8480h) null);
        }

        /* access modifiers changed from: public */
        C1582a(int i) {
            this.f11058d = i;
        }
    }

    void mu0(Context context, SelectRequest selectRequest, C32226l<? super SelectResponse, C13598b0> lVar, C32224a<C13598b0> aVar);
}
