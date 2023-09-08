package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C0124r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask */
public abstract class AppBrandProxyUIProcessTask implements MMActivity.C6739d {
    /* access modifiers changed from: private */
    public C81961h mProxyUI;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$DefaultProcessResult */
    public static class DefaultProcessResult extends ProcessResult {
        public static final Parcelable.Creator<DefaultProcessResult> CREATOR = new C81941a();

        /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$DefaultProcessResult$a */
        public class C81941a implements Parcelable.Creator<DefaultProcessResult> {
            public Object createFromParcel(Parcel parcel) {
                return new DefaultProcessResult();
            }

            public Object[] newArray(int i) {
                return new DefaultProcessResult[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
        }

        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest */
    public static abstract class ProcessRequest implements Parcelable {
        public ProcessRequest() {
        }

        public ProcessRequest(Parcel parcel) {
            readParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public int getStartActivityRequestCode() {
            return -1;
        }

        public abstract Class<? extends AppBrandProxyUIProcessTask> getTaskClass();

        public String getUIAlias() {
            return null;
        }

        public boolean needParams() {
            return true;
        }

        public boolean oneShotForeground() {
            return false;
        }

        public boolean preferRunOnUiThreadForStartingProcessProxyUI() {
            return false;
        }

        public void readParcel(Parcel parcel) {
        }

        public boolean useLandscape() {
            return false;
        }

        public boolean usePendingIntentOnBackground() {
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult */
    public static abstract class ProcessResult implements Parcelable {
        public ProcessResult() {
        }

        public abstract void readParcel(Parcel parcel);

        public ProcessResult(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$a */
    public class C81942a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ProcessResult f240337d;

        public C81942a(ProcessResult processResult) {
            this.f240337d = processResult;
        }

        public void run() {
            if (AppBrandProxyUIProcessTask.this.mProxyUI != null) {
                ((AppBrandProcessProxyUI) AppBrandProxyUIProcessTask.this.mProxyUI).mo114356H7(this.f240337d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$b */
    public interface C81943b<R extends ProcessResult> {
        void onReceiveResult(R r);
    }

    public final void attach(C81961h hVar) {
        this.mProxyUI = hVar;
        if (this instanceof C0124r) {
            getActivityContext().getLifecycle().addObserver((C0124r) this);
        }
    }

    public final void finishProcess(ProcessResult processResult) {
        runOnUiThread(new C81942a(processResult));
    }

    public final MMActivity getActivityContext() {
        AppBrandProcessProxyUI appBrandProcessProxyUI = (AppBrandProcessProxyUI) this.mProxyUI;
        appBrandProcessProxyUI.getClass();
        return appBrandProcessProxyUI;
    }

    public AppBrandTaskProxyUI getAppBrandTaskProxyUI() {
        C81961h hVar = this.mProxyUI;
        if (hVar instanceof AppBrandTaskProxyUI) {
            return (AppBrandTaskProxyUI) hVar;
        }
        return null;
    }

    public final String getString(int i) {
        return MMApplicationContext.getResources().getString(i);
    }

    public abstract void handleRequest(ProcessRequest processRequest);

    public final boolean isProcessTerminated() {
        C81961h hVar = this.mProxyUI;
        if (hVar == null) {
            return true;
        }
        AppBrandProcessProxyUI appBrandProcessProxyUI = (AppBrandProcessProxyUI) hVar;
        return appBrandProcessProxyUI.activityHasDestroyed() || appBrandProcessProxyUI.isFinishing() || appBrandProcessProxyUI.f240319h;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onInterceptFinishActivityAction() {
        return false;
    }

    public void onProcessInterrupted() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public final void runOnUiThread(Runnable runnable) {
        C81961h hVar = this.mProxyUI;
        if (hVar != null) {
            hVar.runOnUiThread(runnable);
        }
    }

    public final void sendResult(ProcessResult processResult) {
        C81961h hVar = this.mProxyUI;
        if (hVar != null) {
            ((AppBrandProcessProxyUI) hVar).mo114357I7(processResult);
        }
    }

    public final void startActivity(String str, String str2) {
        C88144b.m109789g(getActivityContext(), str, str2);
    }

    public final void startActivityForResult(String str, String str2, Intent intent, int i) {
        getActivityContext().mmSetOnActivityResultCallback(this);
        C88144b.m109795m(getActivityContext(), str, str2, intent, i);
    }

    public final void startActivityForResult(Intent intent, int i) {
        getActivityContext().mmSetOnActivityResultCallback(this);
        getActivityContext().startActivityForResult(intent, i);
    }
}
