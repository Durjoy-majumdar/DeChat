package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaRuntimeModulePluginListMap;", "Landroid/os/Parcelable;", "<init>", "()V", "luggage-wxa-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap */
public final class WxaRuntimeModulePluginListMap implements Parcelable {
    public static final Parcelable.Creator<WxaRuntimeModulePluginListMap> CREATOR = new C81225a();

    /* renamed from: d */
    public final ArrayMap<C81350r3, List<WxaPluginPkgInfo>> f238594d;

    /* renamed from: e */
    public ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> f238595e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap$a */
    public static final class C81225a implements Parcelable.Creator<WxaRuntimeModulePluginListMap> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new WxaRuntimeModulePluginListMap(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaRuntimeModulePluginListMap[i];
        }
    }

    public WxaRuntimeModulePluginListMap(Parcel parcel) {
        C87412m.m108594g(parcel, "p");
        int readInt = parcel.readInt();
        this.f238594d = new ArrayMap<>(readInt);
        this.f238595e = new ArrayMap<>();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            C87412m.m108591d(readString);
            LinkedList linkedList = new LinkedList();
            int readInt2 = parcel.readInt();
            int i2 = 0;
            while (i2 < readInt2) {
                WxaPluginPkgInfo createFromParcel = WxaPluginPkgInfo.CREATOR.createFromParcel(parcel);
                ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap = this.f238595e;
                if (arrayMap != null) {
                    C87412m.m108593f(createFromParcel, "p");
                    mo113463a(arrayMap, createFromParcel);
                    linkedList.add(createFromParcel);
                    i2++;
                } else {
                    C87412m.m108603p("mSecondaryMap");
                    throw null;
                }
            }
            this.f238594d.put(new C81350r3(readString), linkedList);
        }
    }

    /* renamed from: a */
    public final void mo113463a(ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap, WxaPluginPkgInfo wxaPluginPkgInfo) {
        String str = wxaPluginPkgInfo.provider;
        C87412m.m108593f(str, "plugin.provider");
        C1517s3 s3Var = new C1517s3(str);
        LinkedList linkedList = arrayMap.get(s3Var);
        if (linkedList == null) {
            linkedList = new LinkedList();
            arrayMap.put(s3Var, linkedList);
        }
        linkedList.add(wxaPluginPkgInfo);
    }

    /* renamed from: b */
    public final List<WxaPluginPkgInfo> mo113464b(String str) {
        C87412m.m108594g(str, "moduleName");
        return this.f238594d.get(new C81350r3(str));
    }

    /* renamed from: c */
    public final List<WxaPluginPkgInfo> mo113465c() {
        ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap = this.f238595e;
        if (arrayMap == null) {
            C87412m.m108603p("mSecondaryMap");
            throw null;
        } else if (arrayMap.size() <= 0) {
            return null;
        } else {
            LinkedList linkedList = new LinkedList();
            ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap2 = this.f238595e;
            if (arrayMap2 != null) {
                for (Map.Entry<C1517s3, LinkedList<WxaPluginPkgInfo>> value : arrayMap2.entrySet()) {
                    LinkedList linkedList2 = (LinkedList) value.getValue();
                    C87412m.m108593f(linkedList2, "namedPluginList");
                    WxaPluginPkgInfo wxaPluginPkgInfo = (WxaPluginPkgInfo) C110818d0.m150916N(linkedList2);
                    if (wxaPluginPkgInfo != null) {
                        linkedList.add(wxaPluginPkgInfo);
                    }
                }
                return linkedList;
            }
            C87412m.m108603p("mSecondaryMap");
            throw null;
        }
    }

    /* renamed from: d */
    public final void mo113466d(WxaPluginPkgInfo wxaPluginPkgInfo) {
        C87412m.m108594g(wxaPluginPkgInfo, "updated");
        ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap = this.f238595e;
        if (arrayMap != null) {
            String str = wxaPluginPkgInfo.provider;
            C87412m.m108593f(str, "updated.provider");
            LinkedList<WxaPluginPkgInfo> linkedList = arrayMap.get(new C1517s3(str));
            if (linkedList != null) {
                for (WxaPluginPkgInfo wxaPluginPkgInfo2 : linkedList) {
                    if (wxaPluginPkgInfo.isAssignable(wxaPluginPkgInfo2)) {
                        wxaPluginPkgInfo2.pkgPath = wxaPluginPkgInfo.pkgPath;
                        wxaPluginPkgInfo2.md5 = wxaPluginPkgInfo.md5;
                        wxaPluginPkgInfo2.stringVersion = wxaPluginPkgInfo.stringVersion;
                    }
                }
                return;
            }
            return;
        }
        C87412m.m108603p("mSecondaryMap");
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo113468e() {
        if (this.f238595e == null) {
            this.f238595e = new ArrayMap<>();
            Collection<List<WxaPluginPkgInfo>> values = this.f238594d.values();
            C87412m.m108593f(values, "mPrimaryMap.values");
            for (List list : values) {
                C87412m.m108593f(list, "list");
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        WxaPluginPkgInfo wxaPluginPkgInfo = (WxaPluginPkgInfo) it.next();
                        ArrayMap<C1517s3, LinkedList<WxaPluginPkgInfo>> arrayMap = this.f238595e;
                        if (arrayMap != null) {
                            mo113463a(arrayMap, wxaPluginPkgInfo);
                        } else {
                            C87412m.m108603p("mSecondaryMap");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.f238594d.size());
        for (Map.Entry next : this.f238594d.entrySet()) {
            List<WxaPluginPkgInfo> list = (List) next.getValue();
            parcel.writeString(((C81350r3) next.getKey()).f238824a);
            C87412m.m108593f(list, "value");
            parcel.writeInt(list.size());
            for (WxaPluginPkgInfo writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        }
    }

    public WxaRuntimeModulePluginListMap() {
        this.f238594d = new ArrayMap<>();
    }
}
