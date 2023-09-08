package com.tencent.p014mm.plugin.appbrand.task.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import gy3.C87412m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p488dc.C31102a;
import p963fc.C86812g;
import ur0.C90724a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandFinishMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "Ldc/a;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage */
public final class AppBrandFinishMessage extends LuggageClientProcessMessage<AppBrandRuntimeWC> implements C31102a {
    public static final Parcelable.Creator<AppBrandFinishMessage> CREATOR = new C84294a();

    /* renamed from: e */
    public final String f246169e;

    /* renamed from: f */
    public final String f246170f;

    /* renamed from: g */
    public final boolean f246171g;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage$a */
    public static final class C84294a implements Parcelable.Creator<AppBrandFinishMessage> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new AppBrandFinishMessage(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new AppBrandFinishMessage[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandFinishMessage(String str, String str2, boolean z) {
        super(str);
        C87412m.m108594g(str, "appId");
        this.f246169e = str;
        this.f246170f = str2;
        this.f246171g = z;
    }

    /* renamed from: a */
    public String mo57980a() {
        return this.f246170f;
    }

    /* renamed from: b */
    public String mo892b() {
        return this.f246169e;
    }

    /* renamed from: c */
    public void mo893c(C86812g gVar) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) gVar;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        if (!this.f246171g) {
            appBrandRuntimeWC.mo113006E();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        appBrandRuntimeWC.f238109G.add(new C90724a(countDownLatch));
        appBrandRuntimeWC.mo113006E();
        if (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f246169e);
        parcel.writeString(this.f246170f);
        parcel.writeInt(this.f246171g ? 1 : 0);
    }
}
