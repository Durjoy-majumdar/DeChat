package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.OnSearchFinderViewEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier */
public final class SearchFinderViewEventNotifier {

    /* renamed from: a */
    public final String f17203a = "MicroMsg.SearchFinderViewEvent";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/SearchFinderViewEventNotifier$OnSearchFinderViewInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$OnSearchFinderViewInfo */
    public static final class OnSearchFinderViewInfo implements Parcelable {
        public static final C3760a CREATOR = new C3760a((C8480h) null);

        /* renamed from: d */
        public String f17204d;

        /* renamed from: e */
        public String f17205e;

        /* renamed from: com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$OnSearchFinderViewInfo$a */
        public static final class C3760a implements Parcelable.Creator<OnSearchFinderViewInfo> {
            public C3760a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                OnSearchFinderViewInfo onSearchFinderViewInfo = new OnSearchFinderViewInfo();
                onSearchFinderViewInfo.f17204d = parcel.readString();
                onSearchFinderViewInfo.f17205e = parcel.readString();
                return onSearchFinderViewInfo;
            }

            public Object[] newArray(int i) {
                return new OnSearchFinderViewInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f17204d);
            parcel.writeString(this.f17205e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/SearchFinderViewEventNotifier$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/finder/ui/SearchFinderViewEventNotifier$OnSearchFinderViewInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.ui.SearchFinderViewEventNotifier$a */
    public static final class C3761a implements C80883e<OnSearchFinderViewInfo, IPCVoid> {
        /* renamed from: a */
        public void invoke(OnSearchFinderViewInfo onSearchFinderViewInfo, C1256g<IPCVoid> gVar) {
            if (onSearchFinderViewInfo != null) {
                OnSearchFinderViewEvent onSearchFinderViewEvent = new OnSearchFinderViewEvent();
                OnSearchFinderViewEvent.C1102a aVar = onSearchFinderViewEvent.f9366d;
                aVar.f9367a = onSearchFinderViewInfo.f17204d;
                aVar.f9368b = onSearchFinderViewInfo.f17205e;
                onSearchFinderViewEvent.publish();
                if (gVar != null) {
                    gVar.mo894a(new IPCVoid());
                }
            }
        }
    }
}
