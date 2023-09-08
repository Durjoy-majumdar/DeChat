package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AddDownloadTaskEvent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p206nj.C88955f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask */
public final class JsApiAddNativeDownloadTask extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 428;
    private static final String NAME = "addNativeDownloadTask";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask */
    public static class AddNativeDownloadTaskTask extends MainProcessTask {
        public static final Parcelable.Creator<AddNativeDownloadTaskTask> CREATOR = new C1543a();

        /* renamed from: f */
        public int f10921f = 0;

        /* renamed from: g */
        public long f10922g = 0;

        /* renamed from: h */
        public IListener f10923h;

        /* renamed from: i */
        public Runnable f10924i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask$a */
        public class C1543a implements Parcelable.Creator<AddNativeDownloadTaskTask> {
            public Object createFromParcel(Parcel parcel) {
                AddNativeDownloadTaskTask addNativeDownloadTaskTask = new AddNativeDownloadTaskTask();
                addNativeDownloadTaskTask.mo1551g(parcel);
                return addNativeDownloadTaskTask;
            }

            public Object[] newArray(int i) {
                return new AddNativeDownloadTaskTask[i];
            }
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f10921f = parcel.readInt();
            this.f10922g = parcel.readLong();
        }

        /* renamed from: i */
        public void mo1552i() {
            Runnable runnable = this.f10924i;
            if (runnable != null) {
                ((C1693g1) runnable).run();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105925i("MicroMsg.JsApiAddNativeDownloadTask", "runInMainProcess flag:%d", Integer.valueOf(this.f10921f));
            C15421 r0 = new IListener<AddDownloadTaskEvent>(C40008f.f107254d) {
                {
                    this.__eventId = 1058823164;
                }

                public boolean callback(IEvent iEvent) {
                    AddDownloadTaskEvent addDownloadTaskEvent = (AddDownloadTaskEvent) iEvent;
                    if (!(addDownloadTaskEvent instanceof AddDownloadTaskEvent)) {
                        Log.m105928w("MicroMsg.JsApiAddNativeDownloadTask", "mismatched event");
                        return false;
                    }
                    AddDownloadTaskEvent.C0994a aVar = addDownloadTaskEvent.f9026d;
                    if (aVar.f9027a != 1) {
                        Log.m105924i("MicroMsg.JsApiAddNativeDownloadTask", "not jsapi api callback");
                        return false;
                    }
                    if (aVar.f9028b) {
                        Log.m105924i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, cancel");
                        AddNativeDownloadTaskTask addNativeDownloadTaskTask = AddNativeDownloadTaskTask.this;
                        addNativeDownloadTaskTask.f10921f = 0;
                        addNativeDownloadTaskTask.mo114394b();
                    } else if (aVar.f9029c > 0) {
                        new HashMap().put("download_id", Long.valueOf(addDownloadTaskEvent.f9026d.f9029c));
                        AddNativeDownloadTaskTask addNativeDownloadTaskTask2 = AddNativeDownloadTaskTask.this;
                        long j = addDownloadTaskEvent.f9026d.f9029c;
                        addNativeDownloadTaskTask2.f10922g = j;
                        Log.m105925i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, ok downloadId:%s", Long.valueOf(j));
                        AddNativeDownloadTaskTask addNativeDownloadTaskTask3 = AddNativeDownloadTaskTask.this;
                        addNativeDownloadTaskTask3.f10921f = 2;
                        addNativeDownloadTaskTask3.mo114394b();
                    } else {
                        Log.m105924i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, failed");
                        AddNativeDownloadTaskTask addNativeDownloadTaskTask4 = AddNativeDownloadTaskTask.this;
                        addNativeDownloadTaskTask4.f10921f = 1;
                        addNativeDownloadTaskTask4.mo114394b();
                    }
                    AddNativeDownloadTaskTask.this.f10923h.dead();
                    return true;
                }
            };
            this.f10923h = r0;
            r0.alive();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10921f);
            parcel.writeLong(this.f10922g);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiAddNativeDownloadTask", "data is null");
            i2Var.mo109647a(i2, mo115109j("fail:data is null"));
            return;
        }
        String optString = jSONObject2.optString("taskName");
        String optString2 = jSONObject2.optString("taskUrl");
        long j = Util.getLong(jSONObject2.optString("taskSize"), 0);
        String optString3 = jSONObject2.optString("fileMD5");
        String optString4 = jSONObject2.optString("thumbUrl");
        String optString5 = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        Context context = i2Var.getContext();
        Log.m105925i("MicroMsg.JsApiAddNativeDownloadTask", "taskUrl : %s, taskSize : %s, fileMD5:[%s], title : %s, thumbUrl : %s", optString2, Long.valueOf(j), optString3, optString5, optString4);
        if (!NetStatusUtil.isNetworkConnected(context)) {
            i2Var.mo109647a(i2, mo115109j("fail:fail network not connected"));
            MMHandlerThread.postToMainThread(new C1668d1(this, context));
            Log.m105924i("MicroMsg.JsApiAddNativeDownloadTask", "fail, network not ready");
        } else if (!C88955f.m111058b()) {
            i2Var.mo109647a(i2, mo115109j("fail:fail sdcard not ready"));
            MMHandlerThread.postToMainThread(new C1670e1(this, context));
            Log.m105924i("MicroMsg.JsApiAddNativeDownloadTask", "fail, sdcard not ready");
        } else if (j > 0 && !C88955f.m111059c(j)) {
            i2Var.mo109647a(i2, mo115109j("fail:fail sdcard has not enough space"));
            MMHandlerThread.postToMainThread(new C1676f1(this, context));
            Log.m105924i("MicroMsg.JsApiAddNativeDownloadTask", "fail, not enough space, require size = " + j);
        } else if (Util.isNullOrNil(optString2)) {
            Log.m105920e("MicroMsg.JsApiAddNativeDownloadTask", "doAddDownloadTask fail, url is null");
            i2Var.mo109647a(i2, mo115109j("fail:taskUrl is null or nil"));
        } else {
            Intent intent = new Intent();
            intent.putExtra("task_name", optString);
            intent.putExtra("task_url", optString2);
            intent.putExtra("task_size", j);
            intent.putExtra("file_md5", optString3);
            intent.putExtra("appid", i2Var.getAppId());
            intent.putExtra("thumb_url", optString4);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString5);
            JSONObject jSONObject3 = jSONObject;
            intent.putExtra("app_developer", jSONObject3.optString("developer"));
            intent.putExtra("app_version", jSONObject3.optString("app_version"));
            intent.putExtra("app_privacy_url", jSONObject3.optString("privacy_agreement_url"));
            intent.putExtra("app_permission_url", jSONObject3.optString("permission_url"));
            C83780d1 l0 = i2Var.mo114341l0();
            if (l0 != null) {
                intent.putExtra("page_url", l0.mo116162Q0());
            } else {
                Log.m105920e("MicroMsg.JsApiAddNativeDownloadTask", "getCurrentPageView is null");
            }
            intent.putExtra("page_scene", 1);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewDownloadUI", intent, (Bundle) null);
            AddNativeDownloadTaskTask addNativeDownloadTaskTask = new AddNativeDownloadTaskTask();
            addNativeDownloadTaskTask.f10924i = new C1693g1(this, addNativeDownloadTaskTask, i2Var, i2);
            addNativeDownloadTaskTask.mo114395c();
        }
    }
}
