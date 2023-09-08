package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "UpdateResult", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent */
public final class NotifyWxaCommLibUpdatedEvent extends IEvent implements Parcelable {
    public static final Parcelable.Creator<NotifyWxaCommLibUpdatedEvent> CREATOR = new C81213a();

    /* renamed from: d */
    public final UpdateResult f238553d;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Failed", "Succeed", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult */
    public static abstract class UpdateResult implements Parcelable {

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed */
        public static final class Failed extends UpdateResult {
            public static final Parcelable.Creator<Failed> CREATOR = new C81211a();

            /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed$a */
            public static final class C81211a implements Parcelable.Creator<Failed> {
                public Object createFromParcel(Parcel parcel) {
                    C87412m.m108594g(parcel, "parcel");
                    parcel.readInt();
                    return new Failed();
                }

                public Object[] newArray(int i) {
                    return new Failed[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C87412m.m108594g(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed */
        public static final class Succeed extends UpdateResult {
            public static final Parcelable.Creator<Succeed> CREATOR = new C81212a();

            /* renamed from: d */
            public final ICommLibReader f238554d;

            /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed$a */
            public static final class C81212a implements Parcelable.Creator<Succeed> {
                public Object createFromParcel(Parcel parcel) {
                    C87412m.m108594g(parcel, "parcel");
                    return new Succeed((ICommLibReader) parcel.readParcelable(Succeed.class.getClassLoader()));
                }

                public Object[] newArray(int i) {
                    return new Succeed[i];
                }
            }

            public Succeed(ICommLibReader iCommLibReader) {
                C87412m.m108594g(iCommLibReader, "reader");
                this.f238554d = iCommLibReader;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C87412m.m108594g(parcel, "out");
                parcel.writeParcelable(this.f238554d, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$a */
    public static final class C81213a implements Parcelable.Creator<NotifyWxaCommLibUpdatedEvent> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new NotifyWxaCommLibUpdatedEvent((UpdateResult) parcel.readParcelable(NotifyWxaCommLibUpdatedEvent.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new NotifyWxaCommLibUpdatedEvent[i];
        }
    }

    public NotifyWxaCommLibUpdatedEvent(UpdateResult updateResult) {
        C87412m.m108594g(updateResult, "result");
        this.f238553d = updateResult;
    }

    /* renamed from: a */
    public static final void m99496a(NotifyWxaCommLibUpdatedEvent notifyWxaCommLibUpdatedEvent) {
        notifyWxaCommLibUpdatedEvent.publish();
        String[] strArr = C86709a0.f251722m;
        for (int i = 0; i < 5; i++) {
            String str = MMApplicationContext.getApplicationId() + strArr[i];
            if (MMApplicationContext.isProcessExist(str)) {
                C28947a.m38500a(str, notifyWxaCommLibUpdatedEvent, C81394z0.f238901d, (C32226l) null);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeParcelable(this.f238553d, i);
    }
}
