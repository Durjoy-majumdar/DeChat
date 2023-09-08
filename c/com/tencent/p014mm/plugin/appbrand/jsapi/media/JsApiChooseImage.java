package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import js0.C88024r;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import p140cw.C7138g;
import p225rc.C89922k;
import qo3.C89779i0;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage */
public final class JsApiChooseImage extends C82268c {
    public static final int CTRL_INDEX = 29;
    public static final String NAME = "chooseImage";

    /* renamed from: g */
    public boolean f241808g = false;

    /* renamed from: h */
    public ChooseRequest f241809h;

    /* renamed from: i */
    public AppBrandProxyUIProcessTask.C81943b<ChooseResult> f241810i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult */
    public static final class ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<ChooseResult> CREATOR = new C82647a();

        /* renamed from: d */
        public int f241818d;

        /* renamed from: e */
        public ArrayList<AppBrandLocalMediaObject> f241819e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseResult$a */
        public class C82647a implements Parcelable.Creator<ChooseResult> {
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
            this.f241818d = parcel.readInt();
            this.f241819e = parcel.createTypedArrayList(AppBrandLocalMediaObject.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f241818d);
            parcel.writeTypedList(this.f241819e);
        }

        public ChooseResult(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$a */
    public class C82648a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241820d;

        public C82648a(JsApiChooseImage jsApiChooseImage, C82381f fVar) {
            this.f241820d = fVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            if (this.f241820d.getAppId() != null) {
                C84072q1.m103586a(this.f241820d.getAppId()).f245462f = false;
            }
            C83231l.m102144e(this.f241820d.getAppId(), this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$b */
    public class C82649b implements AppBrandProxyUIProcessTask.C81943b<ChooseResult> {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241821a;

        /* renamed from: b */
        public final /* synthetic */ int f241822b;

        public C82649b(C82381f fVar, int i) {
            this.f241821a = fVar;
            this.f241822b = i;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            String str;
            ChooseResult chooseResult = (ChooseResult) processResult;
            if (this.f241821a.getAppId() != null) {
                C84072q1.m103586a(this.f241821a.getAppId()).f245462f = false;
            }
            if (chooseResult == null) {
                this.f241821a.mo109647a(this.f241822b, JsApiChooseImage.this.mo115109j("fail"));
                return;
            }
            int i = chooseResult.f241818d;
            if (i == -1) {
                ArrayList<AppBrandLocalMediaObject> arrayList = chooseResult.f241819e;
                if (Util.isNullOrNil((List) arrayList)) {
                    Log.m105920e("MicroMsg.JsApiChooseImage", "onActivityResult, result list is null or nil");
                    this.f241821a.mo109647a(this.f241822b, JsApiChooseImage.this.mo115109j("fail"));
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                Iterator<AppBrandLocalMediaObject> it = arrayList.iterator();
                while (it.hasNext()) {
                    AppBrandLocalMediaObject next = it.next();
                    if (next != null && !Util.isNullOrNil(next.f238902d)) {
                        arrayList2.add(next.f238902d);
                        arrayList3.add(Long.valueOf(next.f238907i));
                        arrayList4.add(next.f238903e);
                    }
                }
                if (arrayList2.size() == 0) {
                    Log.m105920e("MicroMsg.JsApiChooseImage", "data is null");
                    str = null;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        jSONArray.put(arrayList2.get(i2));
                    }
                    str = jSONArray.toString();
                }
                Log.m105925i("MicroMsg.JsApiChooseImage", "onActivityResult, localIds json list string = %s", str);
                HashMap hashMap = new HashMap(1);
                hashMap.put("tempFilePaths", JsApiChooseImage.m101432w(arrayList2));
                hashMap.put("tempFileSizes", JsApiChooseImage.m101432w(arrayList3));
                if (CrashReportFactory.hasDebuger()) {
                    hashMap.put("__realPaths", JsApiChooseImage.m101432w(arrayList4));
                }
                this.f241821a.mo109647a(this.f241822b, JsApiChooseImage.this.mo115112m("ok", hashMap));
            } else if (i != 0) {
                this.f241821a.mo109647a(this.f241822b, JsApiChooseImage.this.mo115109j("fail"));
            } else {
                this.f241821a.mo109647a(this.f241822b, JsApiChooseImage.this.mo115109j("cancel"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$c */
    public class C82650c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241824d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f241825e;

        /* renamed from: f */
        public final /* synthetic */ int f241826f;

        /* renamed from: g */
        public final /* synthetic */ Context f241827g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$c$a */
        public class C82651a implements C11184p0 {
            public C82651a() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    JsApiChooseImage.this.f241809h.f241814g = false;
                } else if (itemId == 2) {
                    JsApiChooseImage.this.f241809h.f241813f = false;
                }
                if (menuItem.getItemId() == 1) {
                    C82650c cVar = C82650c.this;
                    if (!JsApiChooseImage.this.mo114931x(cVar.f241824d, cVar.f241825e, cVar.f241826f)) {
                        Log.m105928w("MicroMsg.JsApiChooseImage", "check camera permission fail");
                        return;
                    }
                }
                if (menuItem.getItemId() == 2) {
                    C82650c cVar2 = C82650c.this;
                    if (!JsApiChooseImage.this.mo114932y(cVar2.f241824d, cVar2.f241825e, cVar2.f241826f)) {
                        Log.m105928w("MicroMsg.JsApiChooseImage", "check external storage permission fail");
                        return;
                    }
                }
                Log.m105924i("MicroMsg.JsApiChooseImage", "start select after source choose");
                C82650c cVar3 = C82650c.this;
                Context context = cVar3.f241827g;
                JsApiChooseImage jsApiChooseImage = JsApiChooseImage.this;
                C81956c.m100674b(context, jsApiChooseImage.f241809h, jsApiChooseImage.f241810i);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$c$b */
        public class C82652b implements DialogInterface.OnCancelListener {
            public C82652b() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Log.m105924i("MicroMsg.JsApiChooseImage", "cancel when select source from");
                C84072q1.m103586a(C82650c.this.f241824d.getAppId()).f245462f = false;
                C82650c cVar = C82650c.this;
                cVar.f241824d.mo109647a(cVar.f241826f, JsApiChooseImage.this.mo115109j("cancel"));
            }
        }

        public C82650c(C82381f fVar, JSONObject jSONObject, int i, Context context) {
            this.f241824d = fVar;
            this.f241825e = jSONObject;
            this.f241826f = i;
            this.f241827g = context;
        }

        public void run() {
            JsApiChooseImage jsApiChooseImage = JsApiChooseImage.this;
            Context context = this.f241824d.getContext();
            C82651a aVar = new C82651a();
            C82652b bVar = new C82652b();
            jsApiChooseImage.getClass();
            C45082x0 x0Var = new C45082x0(context);
            x0Var.f122286e.f225802y = new C82743n0(jsApiChooseImage, bVar);
            x0Var.mo70436b((View) null, new C82744o0(jsApiChooseImage, context), aVar, new C82746p0(jsApiChooseImage, bVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$d */
    public static final class C82653d extends AppBrandProxyUIProcessTask {

        /* renamed from: d */
        public ChooseRequest f241831d;

        /* renamed from: e */
        public ChooseResult f241832e = new ChooseResult();

        /* renamed from: f */
        public int f241833f;

        /* renamed from: g */
        public String f241834g;

        /* renamed from: h */
        public HashSet<Integer> f241835h;

        /* renamed from: i */
        public C89779i0 f241836i;

        /* renamed from: j */
        public DialogInterface.OnCancelListener f241837j;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$d$a */
        public class C82654a implements DialogInterface.OnCancelListener {
            public C82654a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C82653d dVar = C82653d.this;
                ChooseResult chooseResult = dVar.f241832e;
                chooseResult.f241818d = 0;
                dVar.finishProcess(chooseResult);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$d$b */
        public class C82655b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List f241839d;

            /* renamed from: e */
            public final /* synthetic */ boolean f241840e;

            /* renamed from: f */
            public final /* synthetic */ boolean f241841f;

            /* renamed from: g */
            public final /* synthetic */ boolean f241842g;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$d$b$a */
            public class C82656a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ArrayList f241844d;

                public C82656a(ArrayList arrayList) {
                    this.f241844d = arrayList;
                }

                public void run() {
                    C82653d dVar = C82653d.this;
                    ChooseResult chooseResult = dVar.f241832e;
                    chooseResult.f241818d = -1;
                    chooseResult.f241819e = this.f241844d;
                    dVar.finishProcess(chooseResult);
                }
            }

            public C82655b(List list, boolean z, boolean z2, boolean z3) {
                this.f241839d = list;
                this.f241840e = z;
                this.f241841f = z2;
                this.f241842g = z3;
            }

            public void run() {
                String c;
                ArrayList arrayList = new ArrayList(this.f241839d.size());
                for (String str : this.f241839d) {
                    boolean isGif = ImgUtil.isGif(str);
                    boolean z = this.f241840e;
                    if (!isGif) {
                        if (this.f241841f) {
                            c = C1732c2.m1782b(str);
                            if (c != null && !c.equals(str)) {
                                if (Util.nullAsNil(str).equals(C82653d.this.f241834g)) {
                                    C86013q1.m106447h(str);
                                }
                            }
                        } else if (this.f241842g) {
                            c = C1732c2.m1783c(str, true);
                            if (!c.equals(str)) {
                                if (Util.nullAsNil(str).equals(C82653d.this.f241834g)) {
                                    C86013q1.m106447h(str);
                                }
                            }
                        }
                        str = c;
                        z = true;
                    } else {
                        Log.m105925i("MicroMsg.JsApiChooseImage", "path: %s is a GIF file", str);
                    }
                    C1732c2.m1781a(str);
                    String str2 = null;
                    if (!Util.nullAsNil(str).endsWith(".jpg")) {
                        str2 = "jpg";
                    }
                    AppBrandLocalMediaObject b = AppBrandLocalMediaObjectManager.m99829b(C82653d.this.f241831d.f241811d, str, str2, z);
                    if (b != null) {
                        if (z) {
                            try {
                                C82653d.this.getActivityContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_data=?", new String[]{str});
                            } catch (Exception unused) {
                            }
                        }
                        arrayList.add(b);
                    } else {
                        Log.m105921e("MicroMsg.JsApiChooseImage", "handle chosen list from gallery, get null obj from path: %s", str);
                    }
                }
                MMHandlerThread.postToMainThread(new C82656a(arrayList));
            }
        }

        public C82653d() {
            int hashCode = hashCode() % 10000;
            this.f241835h = new HashSet<>();
        }

        /* renamed from: a */
        public final void mo114941a(int i) {
            this.f241837j = new C82654a();
            this.f241836i = C76879j.m92723Q(getActivityContext(), getString(C0966R.string.a3h), getString(i), true, true, this.f241837j);
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            ChooseRequest chooseRequest = (ChooseRequest) processRequest;
            this.f241831d = chooseRequest;
            chooseRequest.f241817j = true;
            chooseRequest.f241812e = Math.max(1, Math.min(9, chooseRequest.f241812e));
            this.f241833f = 16;
            if (!(Util.getAvailableMemoryMB(getActivityContext()) > 200)) {
                C76912y0.makeText((Context) getActivityContext(), (CharSequence) getString(C0966R.string.f7636m8), 1).show();
            }
            getActivityContext().mmSetOnActivityResultCallback(this);
            Intent intent = new Intent();
            intent.putExtra("key_send_raw_image", !this.f241831d.f241815h);
            intent.putExtra("key_force_show_raw_image_button", this.f241831d.f241816i);
            ChooseRequest chooseRequest2 = this.f241831d;
            intent.putExtra("key_is_raw_image_button_disable", chooseRequest2.f241816i && !chooseRequest2.f241815h);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("key_force_hide_edit_image_button_after_album_take_image", true);
            intent.putExtra("album_business_tag", "album_business_bubble_media_by_jsapi_chooseimage");
            intent.putExtra("gallery_report_tag", 16);
            ChooseRequest chooseRequest3 = this.f241831d;
            boolean z = chooseRequest3.f241813f;
            if (z && chooseRequest3.f241814g) {
                Log.m105920e("MicroMsg.JsApiChooseImage", "illegal scene, ignore this request");
                ChooseResult chooseResult = this.f241832e;
                chooseResult.f241818d = -2;
                finishProcess(chooseResult);
            } else if (chooseRequest3.f241814g) {
                intent.putExtra("show_header_view", false);
                ((C7138g) C86312j.m106911c(C7138g.class)).mo8311H7(getActivityContext(), 1, this.f241831d.f241812e, this.f241833f, intent);
            } else if (z) {
                C88024r.m109571a().postToWorker(new C82749q0(this));
            } else {
                Log.m105920e("MicroMsg.JsApiChooseImage", "unknown scene, ignore this request");
                ChooseResult chooseResult2 = this.f241832e;
                chooseResult2.f241818d = -2;
                finishProcess(chooseResult2);
            }
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            String str;
            if (!this.f241835h.contains(Integer.valueOf(i))) {
                if (i2 == 0) {
                    if ((i == 1 || i == 3) && !Util.isNullOrNil(this.f241834g)) {
                        C86013q1.m106447h(this.f241834g);
                        this.f241834g = null;
                    }
                    ChooseResult chooseResult = this.f241832e;
                    chooseResult.f241818d = 0;
                    finishProcess(chooseResult);
                    return;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ChooseResult chooseResult2 = this.f241832e;
                                chooseResult2.f241818d = -2;
                                finishProcess(chooseResult2);
                                return;
                            }
                        }
                    }
                    if (intent == null) {
                        ChooseResult chooseResult3 = this.f241832e;
                        chooseResult3.f241818d = 0;
                        finishProcess(chooseResult3);
                        return;
                    }
                    if (i == 2) {
                        SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
                        if (sightCaptureResult == null) {
                            ChooseResult chooseResult4 = this.f241832e;
                            chooseResult4.f241818d = 0;
                            finishProcess(chooseResult4);
                            return;
                        }
                        str = sightCaptureResult.f201523p;
                    } else if (intent.getIntExtra("key_new_sight_media_opt_code", -1) != 0) {
                        ChooseResult chooseResult5 = this.f241832e;
                        chooseResult5.f241818d = 0;
                        finishProcess(chooseResult5);
                        return;
                    } else {
                        str = intent.getStringExtra("key_new_sight_image_path");
                        if (Util.isNullOrNil(str)) {
                            Log.m105920e("MicroMsg.JsApiChooseImage", "choose from new sight, but path is null");
                            ChooseResult chooseResult6 = this.f241832e;
                            chooseResult6.f241818d = 0;
                            finishProcess(chooseResult6);
                            return;
                        }
                    }
                    this.f241834g = str;
                    if (Util.isNullOrNil(str)) {
                        Log.m105928w("MicroMsg.JsApiChooseImage", "take photo, but result is null");
                        ChooseResult chooseResult7 = this.f241832e;
                        chooseResult7.f241818d = -2;
                        finishProcess(chooseResult7);
                        return;
                    }
                    if (!(getActivityContext() == null || getActivityContext().getWindow() == null)) {
                        getActivityContext().getWindow().getDecorView().setBackgroundColor(-16777216);
                    }
                    C88024r.m109571a().postToWorker(new C82758r0(this, str));
                    return;
                }
                if (intent == null) {
                    ChooseResult chooseResult8 = this.f241832e;
                    chooseResult8.f241818d = 0;
                    finishProcess(chooseResult8);
                    return;
                }
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
                ChooseRequest chooseRequest = this.f241831d;
                boolean z = chooseRequest.f241815h;
                boolean z2 = chooseRequest.f241816i;
                boolean z3 = ((z2 ^ true) && z) || ((z2 & z) && booleanExtra);
                boolean z4 = intent.getBooleanExtra("isTakePhoto", false) || intent.getBooleanExtra("isPreviewPhoto", false);
                Log.m105919d("MicroMsg.JsApiChooseImage", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", Boolean.valueOf(z4), Boolean.valueOf(this.f241831d.f241815h), Boolean.valueOf(this.f241831d.f241816i), Boolean.valueOf(booleanExtra), Boolean.valueOf(z3));
                if (z3) {
                    mo114941a(C0966R.string.f7637m9);
                }
                boolean z5 = !z3 && C1732c2.m1784d(stringArrayListExtra);
                if (z5) {
                    mo114941a(C0966R.string.f7733po);
                }
                C88024r.m109571a().postToWorker(new C82655b(stringArrayListExtra, z4, z3, z5));
            }
        }

        public void onProcessInterrupted() {
            super.onProcessInterrupted();
            C89779i0 i0Var = this.f241836i;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f241836i = null;
            }
            this.f241835h.clear();
        }
    }

    /* renamed from: w */
    public static JSONArray m101432w(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.JsApiChooseImage", "data is null");
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(arrayList.get(i));
        }
        return jSONArray;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar.getAppId() == null) {
            fVar.mo109647a(i, mo115109j("fail"));
        } else if (C84072q1.m103587b(fVar.getAppId()).f245462f) {
            fVar.mo109647a(i, mo115109j("cancel"));
        } else {
            Context context = fVar.getContext();
            if (context == null || !(context instanceof Activity)) {
                fVar.mo109647a(i, mo115109j("fail"));
                return;
            }
            this.f241809h = new ChooseRequest();
            JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
            String optString = jSONObject.optString("sizeType");
            String optString2 = jSONObject.optString("count");
            Log.m105925i("MicroMsg.JsApiChooseImage", "doChooseImage sourceType = %s, sizeType = %s, count = %s", optJSONArray, optString, optString2);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                ChooseRequest chooseRequest = this.f241809h;
                chooseRequest.f241813f = true;
                chooseRequest.f241814g = true;
            } else {
                this.f241809h.f241813f = optJSONArray.toString().contains("camera");
                this.f241809h.f241814g = optJSONArray.toString().contains(FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
            }
            C84072q1.m103586a(fVar.getAppId()).f245462f = true;
            C83231l.m102140a(fVar.getAppId(), new C82648a(this, fVar));
            if (Util.isNullOrNil(optString)) {
                optString = "compressed";
            }
            this.f241809h.f241815h = optString.contains("compressed");
            this.f241809h.f241816i = optString.contains("original");
            this.f241809h.f241812e = Util.getInt(optString2, 9);
            this.f241809h.f241811d = fVar.getAppId();
            this.f241810i = new C82649b(fVar, i);
            ChooseRequest chooseRequest2 = this.f241809h;
            if (!chooseRequest2.f241813f || !chooseRequest2.f241814g) {
                Log.m105924i("MicroMsg.JsApiChooseImage", "start select");
                ChooseRequest chooseRequest3 = this.f241809h;
                if (!chooseRequest3.f241814g || chooseRequest3.f241813f || mo114932y(fVar, jSONObject, i)) {
                    ChooseRequest chooseRequest4 = this.f241809h;
                    if (chooseRequest4.f241814g || !chooseRequest4.f241813f || mo114931x(fVar, jSONObject, i)) {
                        C81956c.m100674b(context, this.f241809h, this.f241810i);
                    } else {
                        Log.m105924i("MicroMsg.JsApiChooseImage", "requestCameraPermission fail, abort");
                    }
                } else {
                    Log.m105924i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission fail, abort");
                }
            } else {
                C88024r.m109572b(new C82650c(fVar, jSONObject, i, context));
            }
        }
    }

    /* renamed from: x */
    public final boolean mo114931x(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z;
        if (!this.f241808g) {
            C91085v.m114266a(fVar.getAppId(), new C82737m0(this, fVar, i));
            this.f241808g = true;
        }
        Context context = fVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            fVar.mo109647a(i, mo115109j("fail"));
            z = false;
        } else {
            z = C89922k.m112464a((Activity) context, fVar, "android.permission.CAMERA", 113, "", "");
        }
        if (!z) {
            Log.m105924i("MicroMsg.JsApiChooseImage", "requestCameraPermission fail, abort");
            return false;
        }
        C91085v.m114268c(fVar.getAppId());
        this.f241808g = false;
        return true;
    }

    /* renamed from: y */
    public final boolean mo114932y(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z;
        if (!this.f241808g) {
            C91085v.m114266a(fVar.getAppId(), new C82737m0(this, fVar, i));
            this.f241808g = true;
        }
        Context context = fVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            fVar.mo109647a(i, mo115109j("fail"));
            z = false;
        } else {
            z = Build.VERSION.SDK_INT >= 29 ? C89922k.m112464a((Activity) context, fVar, "android.permission.READ_EXTERNAL_STORAGE", 145, "", "") : C89922k.m112464a((Activity) context, fVar, "android.permission.WRITE_EXTERNAL_STORAGE", 145, "", "");
        }
        if (!z) {
            Log.m105924i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission fail, abort");
            return false;
        }
        C91085v.m114268c(fVar.getAppId());
        this.f241808g = false;
        return true;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest */
    public static final class ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<ChooseRequest> CREATOR = new C82646a();

        /* renamed from: d */
        public String f241811d;

        /* renamed from: e */
        public int f241812e;

        /* renamed from: f */
        public boolean f241813f;

        /* renamed from: g */
        public boolean f241814g;

        /* renamed from: h */
        public boolean f241815h;

        /* renamed from: i */
        public boolean f241816i;

        /* renamed from: j */
        public boolean f241817j = true;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest$a */
        public class C82646a implements Parcelable.Creator<ChooseRequest> {
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
            return C82653d.class;
        }

        public String getUIAlias() {
            return "GalleryChooseImage";
        }

        public boolean oneShotForeground() {
            if (this.f241817j) {
                return true;
            }
            this.f241817j = true;
            return false;
        }

        public void readParcel(Parcel parcel) {
            this.f241811d = parcel.readString();
            this.f241812e = parcel.readInt();
            boolean z = true;
            this.f241813f = parcel.readByte() != 0;
            this.f241814g = parcel.readByte() != 0;
            this.f241815h = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f241816i = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241811d);
            parcel.writeInt(this.f241812e);
            parcel.writeByte(this.f241813f ? (byte) 1 : 0);
            parcel.writeByte(this.f241814g ? (byte) 1 : 0);
            parcel.writeByte(this.f241815h ? (byte) 1 : 0);
            parcel.writeByte(this.f241816i ? (byte) 1 : 0);
        }

        public ChooseRequest(Parcel parcel) {
            readParcel(parcel);
        }
    }
}
