package com.tencent.luggage.sdk.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p427v4.p1171os.ResultReceiver;
import com.tencent.p014mm.plugin.appbrand.ipc.ResultReceiverFixLeak;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

public class ActivityStarterIpcDelegate implements Parcelable {
    public static final Parcelable.Creator<ActivityStarterIpcDelegate> CREATOR = new C0930a();

    /* renamed from: d */
    public final ResultReceiver f2136d;

    /* renamed from: com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate$a */
    public class C0930a implements Parcelable.Creator<ActivityStarterIpcDelegate> {
        public Object createFromParcel(Parcel parcel) {
            return new ActivityStarterIpcDelegate(parcel, (C09291) null);
        }

        public Object[] newArray(int i) {
            return new ActivityStarterIpcDelegate[i];
        }
    }

    public ActivityStarterIpcDelegate(final Activity activity) {
        this.f2136d = ResultReceiverFixLeak.m100671a(new ResultReceiver(this, new Handler(Looper.getMainLooper())) {
            /* renamed from: a */
            public void mo883a(int i, Bundle bundle) {
                if (4660 == i && bundle != null) {
                    bundle.setClassLoader(ActivityStarterIpcDelegate.class.getClassLoader());
                    Intent intent = (Intent) bundle.getParcelable("intent");
                    if (intent != null) {
                        intent.setExtrasClassLoader(ActivityStarterIpcDelegate.class.getClassLoader());
                        Log.m105925i("MicroMsg.ActivityStarterIpcDelegate", "onReceiveResult(MSG_START_ACTIVITY) activity:%s --START", activity);
                        if (intent.getExtras() != null) {
                            for (String next : intent.getExtras().keySet()) {
                                Log.m105925i("MicroMsg.ActivityStarterIpcDelegate", ">>> key(%s) -> value(%s)", next, intent.getExtras().get(next));
                            }
                        }
                        intent.setFlags(intent.getFlags() & -268435457);
                        Activity activity = activity;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity2 = activity;
                        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate$1", "onReceiveResult", "(ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity2, "com/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate$1", "onReceiveResult", "(ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        Log.m105925i("MicroMsg.ActivityStarterIpcDelegate", "onReceiveResult(MSG_START_ACTIVITY) activity:%s --END", activity);
                    }
                }
            }
        }, activity);
    }

    /* renamed from: a */
    public static ActivityStarterIpcDelegate m893a(Context context) {
        if (context instanceof Activity) {
            return new ActivityStarterIpcDelegate((Activity) context);
        }
        return null;
    }

    /* renamed from: b */
    public void mo880b(Intent intent) {
        if (intent != null) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("intent", intent);
            this.f2136d.mo164633b(4660, bundle);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f2136d.writeToParcel(parcel, i);
    }

    public ActivityStarterIpcDelegate(Parcel parcel, C09291 r2) {
        this.f2136d = ResultReceiver.CREATOR.createFromParcel(parcel);
    }
}
