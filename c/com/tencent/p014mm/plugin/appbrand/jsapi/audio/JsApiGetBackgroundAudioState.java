package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12155j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState */
public class JsApiGetBackgroundAudioState extends C82016a0 {
    public static final int CTRL_INDEX = 159;
    public static final String NAME = "getBackgroundAudioState";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        String appId = fVar.getAppId();
        GetBackgroundAudioStateTask getBackgroundAudioStateTask = new GetBackgroundAudioStateTask();
        getBackgroundAudioStateTask.f240497f = appId;
        if (!getBackgroundAudioStateTask.mo114396f()) {
            Log.m105920e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail");
            return mo115109j("fail");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Double.valueOf(getBackgroundAudioStateTask.f240498g));
        hashMap.put("currentTime", Double.valueOf(getBackgroundAudioStateTask.f240499h));
        hashMap.put("paused", Boolean.valueOf(getBackgroundAudioStateTask.f240500i == 1));
        hashMap.put("buffered", Double.valueOf(getBackgroundAudioStateTask.f240501j));
        hashMap.put("src", getBackgroundAudioStateTask.f240502n);
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getBackgroundAudioStateTask.f240503o);
        hashMap.put("epname", getBackgroundAudioStateTask.f240504p);
        hashMap.put("singer", getBackgroundAudioStateTask.f240505q);
        hashMap.put("coverImgUrl", getBackgroundAudioStateTask.f240506r);
        hashMap.put("webUrl", getBackgroundAudioStateTask.f240507s);
        String str = getBackgroundAudioStateTask.f240508t;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("protocol", str);
        hashMap.put("startTime", Integer.valueOf(getBackgroundAudioStateTask.f240509u / 1000));
        hashMap.put("songLyric", getBackgroundAudioStateTask.f240510v);
        hashMap.put("playbackRate", Double.valueOf(getBackgroundAudioStateTask.f240511w));
        hashMap.put("referrerPolicy", getBackgroundAudioStateTask.f240512x);
        if (!TextUtils.isEmpty(getBackgroundAudioStateTask.f240514z)) {
            str2 = getBackgroundAudioStateTask.f240514z;
        }
        if (getBackgroundAudioStateTask.f240513y) {
            Log.m105921e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail, err:%s", str2);
            return mo115109j("fail:" + str2);
        }
        Log.m105918d("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState is ok");
        return mo115112m("ok", hashMap);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask */
    public static class GetBackgroundAudioStateTask extends MainProcessTask {
        public static final Parcelable.Creator<GetBackgroundAudioStateTask> CREATOR = new C82028a();

        /* renamed from: f */
        public String f240497f = "";

        /* renamed from: g */
        public double f240498g = 0.0d;

        /* renamed from: h */
        public double f240499h;

        /* renamed from: i */
        public int f240500i;

        /* renamed from: j */
        public double f240501j;

        /* renamed from: n */
        public String f240502n;

        /* renamed from: o */
        public String f240503o;

        /* renamed from: p */
        public String f240504p;

        /* renamed from: q */
        public String f240505q;

        /* renamed from: r */
        public String f240506r;

        /* renamed from: s */
        public String f240507s;

        /* renamed from: t */
        public String f240508t;

        /* renamed from: u */
        public int f240509u;

        /* renamed from: v */
        public String f240510v;

        /* renamed from: w */
        public double f240511w;

        /* renamed from: x */
        public String f240512x = null;

        /* renamed from: y */
        public boolean f240513y = false;

        /* renamed from: z */
        public String f240514z;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState$GetBackgroundAudioStateTask$a */
        public class C82028a implements Parcelable.Creator<GetBackgroundAudioStateTask> {
            public Object createFromParcel(Parcel parcel) {
                return new GetBackgroundAudioStateTask(parcel);
            }

            public Object[] newArray(int i) {
                return new GetBackgroundAudioStateTask[i];
            }
        }

        public GetBackgroundAudioStateTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240497f = parcel.readString();
            this.f240498g = parcel.readDouble();
            this.f240499h = parcel.readDouble();
            this.f240500i = parcel.readInt();
            this.f240501j = parcel.readDouble();
            this.f240502n = parcel.readString();
            this.f240503o = parcel.readString();
            this.f240504p = parcel.readString();
            this.f240505q = parcel.readString();
            this.f240506r = parcel.readString();
            this.f240507s = parcel.readString();
            this.f240508t = parcel.readString();
            this.f240510v = parcel.readString();
            this.f240509u = parcel.readInt();
            this.f240511w = parcel.readDouble();
            this.f240512x = parcel.readString();
        }

        /* renamed from: j */
        public void mo1553j() {
            int i;
            String str = C83613a.C83615b.f244198a.f244191a;
            if (Util.isNullOrNil(str) || str.equals(this.f240497f)) {
                C101106m b = C101093a.m132480b();
                if (b != null) {
                    C12155j a = C101093a.m132479a();
                    int i2 = -1;
                    if (a != null) {
                        i2 = a.f35260a;
                        i = a.f35261b;
                    } else {
                        i = -1;
                    }
                    if (a == null || i2 < 0 || i < 0) {
                        Log.m105921e("MicroMsg.JsApiGetBackgroundAudioState", "return parameter is invalid, duration_t:%d, position:%d", Integer.valueOf(i2), Integer.valueOf(i));
                        this.f240513y = true;
                        this.f240514z = "return parameter is invalid";
                        mo114394b();
                        return;
                    }
                    double d = ((double) i2) / 1000.0d;
                    this.f240498g = d;
                    this.f240499h = ((double) i) / 1000.0d;
                    int i3 = a.f35262c;
                    int i4 = a.f35263d;
                    double d2 = 0.0d;
                    if (d > 0.0d) {
                        d2 = (((double) i4) * d) / 100.0d;
                    }
                    this.f240501j = d2;
                    this.f240500i = i3 == 1 ? 0 : 1;
                    this.f240502n = b.f295966n;
                    this.f240503o = b.f295962g;
                    this.f240504p = b.f295964i;
                    this.f240505q = b.f295963h;
                    this.f240506r = b.f295965j;
                    this.f240507s = b.f295968p;
                    this.f240508t = b.f295945F;
                    this.f240509u = b.f295943D;
                    this.f240510v = b.f295969q;
                    this.f240511w = b.f295950K;
                    this.f240512x = b.f295956R;
                    Log.m105919d("MicroMsg.JsApiGetBackgroundAudioState", "duration: %f , currentTime: %f ,paused: %d , buffered: %f , src: %s, startTime:%d, title:%s, singer:%s, webUrl:%s, coverImgUrl:%s, protocol:%s, playbackRate:%f, referrerPolicy: %s", Double.valueOf(d), Double.valueOf(this.f240499h), Integer.valueOf(this.f240500i), Double.valueOf(this.f240501j), this.f240502n, Integer.valueOf(this.f240509u), this.f240503o, this.f240505q, this.f240507s, this.f240506r, this.f240508t, Double.valueOf(this.f240511w), this.f240512x);
                } else {
                    Log.m105920e("MicroMsg.JsApiGetBackgroundAudioState", "currentWrapper is null");
                    this.f240513y = true;
                    this.f240514z = "currentWrapper is null";
                }
                mo114394b();
                return;
            }
            Log.m105925i("MicroMsg.JsApiGetBackgroundAudioState", "appid not match cannot get background audio state, preAppId:%s, appId:%s", str, this.f240497f);
            this.f240513y = true;
            this.f240514z = "appid not match cannot get background audio state";
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240497f);
            parcel.writeDouble(this.f240498g);
            parcel.writeDouble(this.f240499h);
            parcel.writeInt(this.f240500i);
            parcel.writeDouble(this.f240501j);
            parcel.writeString(this.f240502n);
            parcel.writeString(this.f240503o);
            parcel.writeString(this.f240504p);
            parcel.writeString(this.f240505q);
            parcel.writeString(this.f240506r);
            parcel.writeString(this.f240507s);
            parcel.writeString(this.f240508t);
            parcel.writeString(this.f240510v);
            parcel.writeInt(this.f240509u);
            parcel.writeDouble(this.f240511w);
            parcel.writeString(this.f240512x);
        }

        public GetBackgroundAudioStateTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
