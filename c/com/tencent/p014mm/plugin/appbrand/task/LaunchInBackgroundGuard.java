package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard */
public final class LaunchInBackgroundGuard {

    /* renamed from: a */
    public static final ConcurrentHashMap<Integer, C32226l<Activity, C13598b0>> f246141a = new ConcurrentHashMap<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/task/LaunchInBackgroundGuard$StartActivityRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest */
    public static final class StartActivityRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final C84271a CREATOR = new C84271a((C8480h) null);

        /* renamed from: d */
        public final int f246142d;

        /* renamed from: com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$StartActivityRequest$a */
        public static final class C84271a implements Parcelable.Creator<StartActivityRequest> {
            public C84271a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
                return new StartActivityRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new StartActivityRequest[i];
            }
        }

        public StartActivityRequest(int i) {
            this.f246142d = i;
        }

        public int describeContents() {
            return 0;
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return C84272a.class;
        }

        public boolean oneShotForeground() {
            return true;
        }

        public boolean preferRunOnUiThreadForStartingProcessProxyUI() {
            return true;
        }

        public boolean usePendingIntentOnBackground() {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "dest");
            parcel.writeInt(this.f246142d);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public StartActivityRequest(Parcel parcel) {
            this(parcel.readInt());
            C87412m.m108594g(parcel, "parcel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.LaunchInBackgroundGuard$a */
    public static final class C84272a extends AppBrandProxyUIProcessTask {
        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            try {
                StartActivityRequest startActivityRequest = processRequest instanceof StartActivityRequest ? (StartActivityRequest) processRequest : null;
                if (startActivityRequest != null) {
                    C32226l remove = LaunchInBackgroundGuard.f246141a.remove(Integer.valueOf(startActivityRequest.f246142d));
                    if (remove != null) {
                        MMActivity activityContext = getActivityContext();
                        C87412m.m108593f(activityContext, "activityContext");
                        remove.invoke(activityContext);
                        finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
                        return;
                    }
                    return;
                }
                finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            } finally {
                finishProcess((AppBrandProxyUIProcessTask.ProcessResult) null);
            }
        }
    }
}
