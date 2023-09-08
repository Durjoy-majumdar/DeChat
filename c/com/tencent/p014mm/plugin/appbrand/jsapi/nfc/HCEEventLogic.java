package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import wl0.C91030h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic */
public class HCEEventLogic {

    /* renamed from: a */
    public static String f242261a = null;

    /* renamed from: b */
    public static boolean f242262b = true;

    /* renamed from: c */
    public static C83231l.C83234d f242263c = new C82845a();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic$a */
    public class C82845a extends C83231l.C83234d {
        /* renamed from: b */
        public void mo109496b() {
            Log.m105924i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onCreate");
            HCEEventLogic.m101594a(HCEEventLogic.f242261a, 21, (Bundle) null);
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105924i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onDestroy");
            HCEEventLogic.m101594a(HCEEventLogic.f242261a, 24, (Bundle) null);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105924i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onPause");
            HCEEventLogic.m101594a(HCEEventLogic.f242261a, 23, (Bundle) null);
        }

        /* renamed from: f */
        public void mo109498f() {
            Log.m105924i("MicroMsg.HCEEventLogic", "alvinluo AppBrandLifeCycle mHCELifeCycleListener onResume");
            HCEEventLogic.m101594a(HCEEventLogic.f242261a, 22, (Bundle) null);
        }
    }

    /* renamed from: a */
    public static void m101594a(String str, int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Log.m105925i("MicroMsg.HCEEventLogic", "alvinluo HCEEventLogic sendHCEEventToMM appId: %s, eventType: %d", str, Integer.valueOf(i));
        new SendHCEEventToMMTask(str, i, bundle, (C82845a) null).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic$SendHCEEventToMMTask */
    public static class SendHCEEventToMMTask extends MainProcessTask {
        public static final Parcelable.Creator<SendHCEEventToMMTask> CREATOR = new C82844a();

        /* renamed from: f */
        public int f242264f;

        /* renamed from: g */
        public String f242265g;

        /* renamed from: h */
        public Bundle f242266h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic$SendHCEEventToMMTask$a */
        public class C82844a implements Parcelable.Creator<SendHCEEventToMMTask> {
            public Object createFromParcel(Parcel parcel) {
                return new SendHCEEventToMMTask(parcel);
            }

            public Object[] newArray(int i) {
                return new SendHCEEventToMMTask[i];
            }
        }

        public SendHCEEventToMMTask(String str, int i, Bundle bundle, C82845a aVar) {
            this.f242264f = i;
            this.f242265g = str;
            this.f242266h = bundle;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f242264f = parcel.readInt();
            this.f242265g = parcel.readString();
            this.f242266h = parcel.readBundle();
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.HCEEventLogic", "alvinluo HCEEventLogic SendHCEEventToMMTask runInMainProcess");
            C91030h.f261169n.mo125084c(this.f242264f, this.f242265g, this.f242266h);
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f242264f);
            parcel.writeString(this.f242265g);
            parcel.writeBundle(this.f242266h);
        }

        public SendHCEEventToMMTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
