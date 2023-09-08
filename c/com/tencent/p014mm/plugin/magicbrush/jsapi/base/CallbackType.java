package com.tencent.p014mm.plugin.magicbrush.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.magicbrush.base.MBJsEventBase;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "Landroid/os/Parcelable;", "()V", "Event", "FinalCallback", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$Event;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$FinalCallback;", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType */
public abstract class CallbackType implements Parcelable {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$Event;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType$Event */
    public static final class Event extends CallbackType {
        public static final Parcelable.Creator<Event> CREATOR = new C85275a();

        /* renamed from: d */
        public final MBJsEventBase f248432d;

        /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType$Event$a */
        public static final class C85275a implements Parcelable.Creator<Event> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new Event((MBJsEventBase) parcel.readParcelable(Event.class.getClassLoader()));
            }

            public Object[] newArray(int i) {
                return new Event[i];
            }
        }

        public Event(MBJsEventBase mBJsEventBase) {
            C87412m.m108594g(mBJsEventBase, "event");
            this.f248432d = mBJsEventBase;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Event) && C87412m.m108589b(this.f248432d, ((Event) obj).f248432d);
        }

        public int hashCode() {
            return this.f248432d.hashCode();
        }

        public String toString() {
            return "Event(event=" + this.f248432d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeParcelable(this.f248432d, i);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$FinalCallback;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "mb-jsapi_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType$FinalCallback */
    public static final class FinalCallback extends CallbackType {
        public static final Parcelable.Creator<FinalCallback> CREATOR = new C85276a();

        /* renamed from: d */
        public final IPCString f248433d;

        /* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType$FinalCallback$a */
        public static final class C85276a implements Parcelable.Creator<FinalCallback> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new FinalCallback((IPCString) parcel.readParcelable(FinalCallback.class.getClassLoader()));
            }

            public Object[] newArray(int i) {
                return new FinalCallback[i];
            }
        }

        public FinalCallback(IPCString iPCString) {
            C87412m.m108594g(iPCString, "callbackStr");
            this.f248433d = iPCString;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinalCallback) && C87412m.m108589b(this.f248433d, ((FinalCallback) obj).f248433d);
        }

        public int hashCode() {
            return this.f248433d.hashCode();
        }

        public String toString() {
            return "FinalCallback(callbackStr=" + this.f248433d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeParcelable(this.f248433d, i);
        }
    }
}
