package com.tencent.p014mm.plugin.appbrand.media.music;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import qc0.C12154i;

/* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService */
public class AppBrandMusicClientService {

    /* renamed from: c */
    public static AppBrandMusicClientService f244185c = new AppBrandMusicClientService();

    /* renamed from: a */
    public HashMap<String, C83612a> f244186a = new HashMap<>();

    /* renamed from: b */
    public volatile String f244187b = "";

    /* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$StopBackgroundMusicTask */
    public static class StopBackgroundMusicTask extends MainProcessTask {
        public static final Parcelable.Creator<StopBackgroundMusicTask> CREATOR = new C83611a();

        /* renamed from: f */
        public String f244190f;

        /* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$StopBackgroundMusicTask$a */
        public class C83611a implements Parcelable.Creator<StopBackgroundMusicTask> {
            public Object createFromParcel(Parcel parcel) {
                return new StopBackgroundMusicTask(parcel);
            }

            public Object[] newArray(int i) {
                return new StopBackgroundMusicTask[i];
            }
        }

        public StopBackgroundMusicTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f244190f = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.AppBrandMusicClientService", "runInMainProcess");
            String str = C83613a.C83615b.f244198a.f244191a;
            if (!Util.isNullOrNil(str) && !str.equals(this.f244190f)) {
                Log.m105925i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, preAppId:%s, appId:%s", str, this.f244190f);
                mo114394b();
            } else if (!C83613a.C83615b.f244198a.mo115929c(this.f244190f)) {
                Log.m105925i("MicroMsg.AppBrandMusicClientService", "appid not match cannot operate, can't not stop, preAppId:%s, appId:%s", str, this.f244190f);
                mo114394b();
            } else {
                if (C12154i.m11770d()) {
                    Log.m105924i("MicroMsg.AppBrandMusicClientService", "stop music ok");
                } else {
                    Log.m105920e("MicroMsg.AppBrandMusicClientService", "stop music fail");
                }
                mo114394b();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f244190f);
        }

        public StopBackgroundMusicTask(Parcel parcel) {
            this.f244190f = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$a */
    public interface C83612a {
        /* renamed from: a */
        void mo115924a();

        /* renamed from: b */
        void mo115925b();

        void onStop();
    }

    /* renamed from: a */
    public static boolean m102644a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        IPCQueryPlaying iPCQueryPlaying = new IPCQueryPlaying();
        iPCQueryPlaying.f244188f = str;
        if (iPCQueryPlaying.mo114396f()) {
            return iPCQueryPlaying.f244189g;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo115919b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equalsIgnoreCase(this.f244187b)) {
            Log.m105920e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
            return false;
        }
        StopBackgroundMusicTask stopBackgroundMusicTask = new StopBackgroundMusicTask();
        stopBackgroundMusicTask.f244190f = str;
        stopBackgroundMusicTask.mo114395c();
        return true;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$IPCQueryPlaying */
    public static class IPCQueryPlaying extends MainProcessTask {
        public static final Parcelable.Creator<IPCQueryPlaying> CREATOR = new C83610a();

        /* renamed from: f */
        public String f244188f = null;

        /* renamed from: g */
        public boolean f244189g = false;

        /* renamed from: com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService$IPCQueryPlaying$a */
        public class C83610a implements Parcelable.Creator<IPCQueryPlaying> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCQueryPlaying(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCQueryPlaying[i];
            }
        }

        public IPCQueryPlaying() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f244188f = parcel.readString();
            this.f244189g = parcel.readByte() != 0;
        }

        /* renamed from: j */
        public void mo1553j() {
            this.f244189g = C83613a.C83615b.f244198a.mo115929c(this.f244188f);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f244188f);
            parcel.writeByte(this.f244189g ? (byte) 1 : 0);
        }

        public IPCQueryPlaying(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
