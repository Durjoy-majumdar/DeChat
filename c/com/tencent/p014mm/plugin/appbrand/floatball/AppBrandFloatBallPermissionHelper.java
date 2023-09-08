package com.tencent.p014mm.plugin.appbrand.floatball;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import aw0.C79636p;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p646pn.C89389h;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper */
public final class AppBrandFloatBallPermissionHelper {

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest */
    public static final class CheckFloatBallPermissionRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<CheckFloatBallPermissionRequest> CREATOR = new C81835a();

        /* renamed from: d */
        public int f240102d;

        /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionRequest$a */
        public class C81835a implements Parcelable.Creator<CheckFloatBallPermissionRequest> {
            public Object createFromParcel(Parcel parcel) {
                return new CheckFloatBallPermissionRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new CheckFloatBallPermissionRequest[i];
            }
        }

        public CheckFloatBallPermissionRequest() {
        }

        public int describeContents() {
            return 0;
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return C81838b.class;
        }

        public void readParcel(Parcel parcel) {
            this.f240102d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f240102d);
        }

        public CheckFloatBallPermissionRequest(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult */
    public static final class CheckFloatBallPermissionResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<CheckFloatBallPermissionResult> CREATOR = new C81836a();

        /* renamed from: d */
        public boolean f240103d;

        /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$CheckFloatBallPermissionResult$a */
        public class C81836a implements Parcelable.Creator<CheckFloatBallPermissionResult> {
            public Object createFromParcel(Parcel parcel) {
                return new CheckFloatBallPermissionResult(parcel);
            }

            public Object[] newArray(int i) {
                return new CheckFloatBallPermissionResult[i];
            }
        }

        public CheckFloatBallPermissionResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f240103d = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f240103d ? (byte) 1 : 0);
        }

        public CheckFloatBallPermissionResult(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$a */
    public class C81837a implements AppBrandProxyUIProcessTask.C81943b<CheckFloatBallPermissionResult> {

        /* renamed from: a */
        public final /* synthetic */ C79636p f240104a;

        public C81837a(C79636p pVar) {
            this.f240104a = pVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            CheckFloatBallPermissionResult checkFloatBallPermissionResult = (CheckFloatBallPermissionResult) processResult;
            boolean z = true;
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(checkFloatBallPermissionResult != null && checkFloatBallPermissionResult.f240103d);
            Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, checkFloatBallPermission isOK:%b", objArr);
            C79636p pVar = this.f240104a;
            if (pVar != null) {
                if (checkFloatBallPermissionResult == null || !checkFloatBallPermissionResult.f240103d) {
                    z = false;
                }
                pVar.mo109774a(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$b */
    public static final class C81838b extends AppBrandProxyUIProcessTask {

        /* renamed from: com.tencent.mm.plugin.appbrand.floatball.AppBrandFloatBallPermissionHelper$b$a */
        public class C81839a implements C79636p {
            public C81839a() {
            }

            /* renamed from: a */
            public void mo109774a(boolean z) {
                CheckFloatBallPermissionResult checkFloatBallPermissionResult = new CheckFloatBallPermissionResult();
                checkFloatBallPermissionResult.f240103d = z;
                C81838b.this.finishProcess(checkFloatBallPermissionResult);
            }
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            if (processRequest instanceof CheckFloatBallPermissionRequest) {
                int i = ((CheckFloatBallPermissionRequest) processRequest).f240102d;
                ((C89389h) C86312j.m106911c(C89389h.class)).mo123723Nv(getActivityContext(), i, false, new C81839a());
            }
        }
    }

    /* renamed from: a */
    public static void m100447a(Context context, int i, C79636p pVar) {
        CheckFloatBallPermissionRequest checkFloatBallPermissionRequest = new CheckFloatBallPermissionRequest();
        checkFloatBallPermissionRequest.f240102d = i;
        C81956c.m100675c(context, checkFloatBallPermissionRequest, new C81837a(pVar), (Intent) null);
    }
}
