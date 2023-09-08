package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import js0.C88024r;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import p140cw.C7138g;
import p447aw.C103918d;
import p914oj.C89231c;
import qo3.C89779i0;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo */
public final class JsApiChooseVideo extends C82268c {
    public static final int CTRL_INDEX = 36;
    public static final String NAME = "chooseVideo";

    /* renamed from: g */
    public static volatile boolean f241952g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest */
    public static final class ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<ChooseRequest> CREATOR = new C82683a();

        /* renamed from: d */
        public String f241953d;

        /* renamed from: e */
        public int f241954e;

        /* renamed from: f */
        public boolean f241955f;

        /* renamed from: g */
        public boolean f241956g;

        /* renamed from: h */
        public boolean f241957h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseRequest$a */
        public class C82683a implements Parcelable.Creator<ChooseRequest> {
            public Object createFromParcel(Parcel parcel) {
                return new ChooseRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new ChooseRequest[i];
            }
        }

        public ChooseRequest() {
        }

        public int describeContents() {
            return 0;
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return C82687c.class;
        }

        public String getUIAlias() {
            return "GalleryChooseVideo";
        }

        public boolean oneShotForeground() {
            return true;
        }

        public void readParcel(Parcel parcel) {
            this.f241953d = parcel.readString();
            this.f241954e = parcel.readInt();
            boolean z = true;
            this.f241955f = parcel.readByte() != 0;
            this.f241956g = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f241957h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241953d);
            parcel.writeInt(this.f241954e);
            parcel.writeByte(this.f241955f ? (byte) 1 : 0);
            parcel.writeByte(this.f241956g ? (byte) 1 : 0);
            parcel.writeByte(this.f241957h ? (byte) 1 : 0);
        }

        public ChooseRequest(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult */
    public static final class ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<ChooseResult> CREATOR = new C82684a();

        /* renamed from: d */
        public int f241958d;

        /* renamed from: e */
        public AppBrandLocalVideoObject f241959e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$ChooseResult$a */
        public class C82684a implements Parcelable.Creator<ChooseResult> {
            public Object createFromParcel(Parcel parcel) {
                return new ChooseResult(parcel);
            }

            public Object[] newArray(int i) {
                return new ChooseResult[i];
            }
        }

        public ChooseResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
            this.f241958d = parcel.readInt();
            this.f241959e = (AppBrandLocalVideoObject) parcel.readParcelable(AppBrandLocalVideoObject.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f241958d);
            parcel.writeParcelable(this.f241959e, i);
        }

        public ChooseResult(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$a */
    public class C82685a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241960d;

        public C82685a(JsApiChooseVideo jsApiChooseVideo, C82381f fVar) {
            this.f241960d = fVar;
        }

        /* renamed from: f */
        public void mo109498f() {
            JsApiChooseVideo.f241952g = false;
            C83231l.m102144e(this.f241960d.getAppId(), this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$b */
    public class C82686b implements AppBrandProxyUIProcessTask.C81943b<ChooseResult> {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241961a;

        /* renamed from: b */
        public final /* synthetic */ int f241962b;

        public C82686b(C82381f fVar, int i) {
            this.f241961a = fVar;
            this.f241962b = i;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            ChooseResult chooseResult = (ChooseResult) processResult;
            if (chooseResult == null) {
                this.f241961a.mo109647a(this.f241962b, JsApiChooseVideo.this.mo115109j("fail"));
                return;
            }
            int i = chooseResult.f241958d;
            if (i == -1) {
                AppBrandLocalVideoObject appBrandLocalVideoObject = chooseResult.f241959e;
                if (appBrandLocalVideoObject == null) {
                    Log.m105920e("MicroMsg.JsApiChooseVideo", "choose result code is OK but videoObj null");
                    this.f241961a.mo109647a(this.f241962b, JsApiChooseVideo.this.mo115109j("fail"));
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("tempFilePath", appBrandLocalVideoObject.f238902d);
                hashMap.put("duration", Integer.valueOf(appBrandLocalVideoObject.f238912n));
                hashMap.put("size", Long.valueOf(appBrandLocalVideoObject.f238913o));
                hashMap.put("height", Integer.valueOf(appBrandLocalVideoObject.f238915q));
                hashMap.put("width", Integer.valueOf(appBrandLocalVideoObject.f238914p));
                this.f241961a.mo109647a(this.f241962b, JsApiChooseVideo.this.mo115112m("ok", hashMap));
            } else if (i != 0) {
                this.f241961a.mo109647a(this.f241962b, JsApiChooseVideo.this.mo115109j("fail"));
            } else {
                this.f241961a.mo109647a(this.f241962b, JsApiChooseVideo.this.mo115109j("cancel"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$c */
    public static final class C82687c extends AppBrandProxyUIProcessTask {

        /* renamed from: d */
        public ChooseResult f241964d = new ChooseResult();

        /* renamed from: e */
        public ChooseRequest f241965e;

        /* renamed from: f */
        public String f241966f;

        /* renamed from: g */
        public C89779i0 f241967g;

        /* renamed from: h */
        public DialogInterface.OnCancelListener f241968h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$c$a */
        public class C82688a implements DialogInterface.OnCancelListener {
            public C82688a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C82687c cVar = C82687c.this;
                ChooseResult chooseResult = cVar.f241964d;
                chooseResult.f241958d = 0;
                cVar.finishProcess(chooseResult);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$c$b */
        public class C82689b implements Runnable {
            public C82689b() {
            }

            public void run() {
                Uri n = C116299g2.m163858n(C82687c.this.f241966f);
                String path = n.getPath();
                boolean z = false;
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a()) {
                    z = l.f348991a.mo119948x(l.f348992b);
                }
                if (z) {
                    C82687c cVar = C82687c.this;
                    ChooseResult chooseResult = cVar.f241964d;
                    chooseResult.f241958d = -1;
                    chooseResult.f241959e = C82687c.m101470a(cVar, cVar.f241966f, cVar.f241965e.f241957h);
                    C82687c cVar2 = C82687c.this;
                    cVar2.finishProcess(cVar2.f241964d);
                    return;
                }
                C82687c cVar3 = C82687c.this;
                ChooseResult chooseResult2 = cVar3.f241964d;
                chooseResult2.f241958d = -2;
                cVar3.finishProcess(chooseResult2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo$c$c */
        public class C82690c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f241971d;

            public C82690c(String str) {
                this.f241971d = str;
            }

            public void run() {
                C82687c cVar = C82687c.this;
                ChooseResult chooseResult = cVar.f241964d;
                chooseResult.f241958d = -1;
                chooseResult.f241959e = C82687c.m101470a(cVar, this.f241971d, cVar.f241965e.f241957h);
                C82687c cVar2 = C82687c.this;
                cVar2.finishProcess(cVar2.f241964d);
            }
        }

        /* renamed from: a */
        public static AppBrandLocalVideoObject m101470a(C82687c cVar, String str, boolean z) {
            C89231c cVar2;
            int i;
            int i2;
            cVar.getClass();
            if (z) {
                try {
                    str = C82713f2.m101487e(str);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiChooseVideo", "addVideoItem, remux failed, exp = %s", Util.stackTraceToString(e));
                }
            }
            try {
                cVar2 = new C89231c();
                cVar2.setDataSource(str);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.JsApiChooseVideo", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e2);
                cVar2 = null;
            }
            if (cVar2 == null) {
                Log.m105920e("MicroMsg.JsApiChooseVideo", "addVideoItem, null meta data");
                return null;
            }
            int i3 = Util.getInt(cVar2.extractMetadata(24), 0);
            if (i3 == 90 || i3 == 270) {
                i2 = Util.getInt(cVar2.extractMetadata(19), 0);
                i = Util.getInt(cVar2.extractMetadata(18), 0);
            } else {
                i2 = Util.getInt(cVar2.extractMetadata(18), 0);
                i = Util.getInt(cVar2.extractMetadata(19), 0);
            }
            int i4 = Util.getInt(cVar2.extractMetadata(9), 0);
            cVar2.release();
            String str2 = cVar.f241965e.f241953d;
            String str3 = AppBrandLocalMediaObjectManager.f238909a;
            AppBrandLocalVideoObject appBrandLocalVideoObject = (AppBrandLocalVideoObject) AppBrandLocalMediaObjectManager.m99830c(str2, str, AppBrandLocalVideoObject.class, "mp4", false);
            if (appBrandLocalVideoObject == null) {
                return null;
            }
            appBrandLocalVideoObject.f238912n = (i4 + 500) / 1000;
            appBrandLocalVideoObject.f238914p = i2;
            appBrandLocalVideoObject.f238915q = i;
            appBrandLocalVideoObject.f238913o = C86013q1.m106451l(str);
            Log.m105925i("MicroMsg.JsApiChooseVideo", "addVideoItem, return %s", appBrandLocalVideoObject);
            return appBrandLocalVideoObject;
        }

        /* renamed from: b */
        public final void mo114985b() {
            this.f241968h = new C82688a();
            this.f241967g = C76879j.m92723Q(getActivityContext(), getString(C0966R.string.a3h), getString(C0966R.string.f7638m_), true, true, this.f241968h);
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            ChooseRequest chooseRequest = (ChooseRequest) processRequest;
            this.f241965e = chooseRequest;
            chooseRequest.f241954e = Math.min(Math.max(chooseRequest.f241954e, 60), 0);
            if (!(Util.getAvailableMemoryMB(getActivityContext()) > 200)) {
                C76912y0.makeText((Context) getActivityContext(), (CharSequence) getString(C0966R.string.f7638m_), 1).show();
            }
            Class cls = C7138g.class;
            getActivityContext().mmSetOnActivityResultCallback(this);
            Intent intent = new Intent();
            intent.putExtra("key_send_raw_image", false);
            intent.putExtra("query_media_type", 2);
            intent.putExtra("GalleryUI_SkipVideoSizeLimit", true);
            intent.putExtra("gallery_report_tag", 16);
            ChooseRequest chooseRequest2 = this.f241965e;
            boolean z = chooseRequest2.f241955f;
            if (z && chooseRequest2.f241956g) {
                this.f241966f = C86013q1.m106448i(C112760b.m154240l() + "microMsg." + System.currentTimeMillis() + ".mp4", false);
                intent.putExtra("record_video_force_sys_camera", true);
                intent.putExtra("record_video_quality", 1);
                intent.putExtra("record_video_time_limit", this.f241965e.f241954e);
                intent.putExtra("video_full_path", this.f241966f);
                ((C7138g) C86312j.m106911c(cls)).mo8308Fc(getActivityContext(), 4, 1, 7, intent);
            } else if (z) {
                this.f241966f = C86013q1.m106448i(C112760b.m154240l() + "microMsg." + System.currentTimeMillis() + ".mp4", false);
                ((C7138g) C86312j.m106911c(cls)).mo8312MW(getActivityContext(), this.f241966f, 5, this.f241965e.f241954e, 0, 1, false);
            } else if (chooseRequest2.f241956g) {
                intent.putExtra("show_header_view", false);
                ((C7138g) C86312j.m106911c(cls)).mo8308Fc(getActivityContext(), 4, 1, 16, intent);
            } else {
                ChooseResult chooseResult = this.f241964d;
                chooseResult.f241958d = -2;
                finishProcess(chooseResult);
            }
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i2 == 0) {
                ChooseResult chooseResult = this.f241964d;
                chooseResult.f241958d = 0;
                finishProcess(chooseResult);
            } else if (-1 != i2) {
                ChooseResult chooseResult2 = this.f241964d;
                chooseResult2.f241958d = -2;
                finishProcess(chooseResult2);
            } else if (i == 4) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
                if (Util.isNullOrNil((List) stringArrayListExtra)) {
                    ChooseResult chooseResult3 = this.f241964d;
                    chooseResult3.f241958d = -2;
                    finishProcess(chooseResult3);
                    return;
                }
                String i3 = C86013q1.m106448i(stringArrayListExtra.get(0), false);
                mo114985b();
                Set<Object> set = C84737f0.f247137a;
                C88024r.m109571a().postToWorker(new C82690c(i3));
            } else if (i != 5) {
                ChooseResult chooseResult4 = this.f241964d;
                chooseResult4.f241958d = -2;
                finishProcess(chooseResult4);
            } else if (Util.isNullOrNil(this.f241966f)) {
                ChooseResult chooseResult5 = this.f241964d;
                chooseResult5.f241958d = -2;
                finishProcess(chooseResult5);
            } else {
                mo114985b();
                Set<Object> set2 = C84737f0.f247137a;
                C88024r.m109571a().postToWorker(new C82689b());
            }
        }

        public void onProcessInterrupted() {
            super.onProcessInterrupted();
            C89779i0 i0Var = this.f241967g;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f241967g = null;
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        if (f241952g) {
            fVar2.mo109647a(i2, mo115109j("cancel"));
            return;
        }
        Context context = fVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            fVar2.mo109647a(i2, mo115109j("fail"));
            return;
        }
        ChooseRequest chooseRequest = new ChooseRequest();
        JSONArray optJSONArray = jSONObject2.optJSONArray("sourceType");
        String optString = jSONObject2.optString("maxDuration");
        boolean z = false;
        Log.m105925i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, maxDuration = %s", optJSONArray, optString);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            chooseRequest.f241955f = true;
            chooseRequest.f241956g = true;
        } else {
            chooseRequest.f241955f = optJSONArray.toString().contains("camera");
            chooseRequest.f241956g = optJSONArray.toString().contains(FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        }
        chooseRequest.f241957h = jSONObject2.optBoolean("compressed", true);
        if (chooseRequest.f241955f) {
            C91085v.m114266a(fVar.getAppId(), new C82697b1(this, fVar2, jSONObject2, i2));
            Context context2 = fVar.getContext();
            if (context2 == null || !(context2 instanceof Activity)) {
                fVar2.mo109647a(i2, mo115109j("fail"));
            } else {
                z = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context2, "android.permission.CAMERA", 115, "", "");
                if (z) {
                    C91085v.m114268c(fVar.getAppId());
                }
            }
            if (!z) {
                return;
            }
        }
        f241952g = true;
        C83231l.m102140a(fVar.getAppId(), new C82685a(this, fVar2));
        chooseRequest.f241954e = Util.getInt(optString, 60);
        chooseRequest.f241953d = fVar.getAppId();
        C81956c.m100674b(context, chooseRequest, new C82686b(fVar2, i2));
    }
}
