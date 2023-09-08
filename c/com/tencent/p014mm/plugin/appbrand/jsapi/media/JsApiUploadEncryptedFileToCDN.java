package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import nj3.C76879j;
import org.json.JSONObject;
import p1081gi.C98124g;
import p663qo.C101213l;
import qo3.C89779i0;
import vi0.C22757a;
import vi0.C22759b;
import vi0.C22761c;
import vi0.C22762d;
import vi0.C22763e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN */
public class JsApiUploadEncryptedFileToCDN extends C82268c {
    public static final int CTRL_INDEX = 194;
    public static final String NAME = "uploadEncryptedFileToCDN";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$a */
    public class C17900a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JsApiUploadEncryptedMediaFileTask f49370d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f49371e;

        /* renamed from: f */
        public final /* synthetic */ int f49372f;

        public C17900a(JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask, C82381f fVar, int i) {
            this.f49370d = jsApiUploadEncryptedMediaFileTask;
            this.f49371e = fVar;
            this.f49372f = i;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            hashMap.put("fileId", this.f49370d.f49350i);
            hashMap.put("aesKey", this.f49370d.f49351j);
            hashMap.put("fileUrl", this.f49370d.f49352n);
            hashMap.put("fileLength", "" + this.f49370d.f49353o);
            Log.m105925i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fileId:%s", this.f49370d.f49350i);
            if (Util.isNullOrNil(this.f49370d.f49350i)) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail , return serverId is empty");
                this.f49371e.mo109647a(this.f49372f, JsApiUploadEncryptedFileToCDN.this.mo115109j("fail"));
            } else {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN ok");
                this.f49371e.mo109647a(this.f49372f, JsApiUploadEncryptedFileToCDN.this.mo115112m("ok", hashMap));
            }
            this.f49370d.mo114397h();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$b */
    public class C17901b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLocalMediaObject f49374d;

        /* renamed from: e */
        public final /* synthetic */ Context f49375e;

        /* renamed from: f */
        public final /* synthetic */ String f49376f;

        /* renamed from: g */
        public final /* synthetic */ JsApiUploadEncryptedMediaFileTask f49377g;

        /* renamed from: h */
        public final /* synthetic */ C82381f f49378h;

        /* renamed from: i */
        public final /* synthetic */ int f49379i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$b$a */
        public class C17902a implements DialogInterface.OnClickListener {
            public C17902a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "do confirm upload in 2G/3G/4G network");
                C17901b.this.f49377g.getClass();
                C17901b.this.f49377g.mo114395c();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$b$b */
        public class C17903b implements DialogInterface.OnClickListener {
            public C17903b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "do cancel upload in 2G/3G/4G network");
                C17901b bVar = C17901b.this;
                bVar.f49378h.mo109647a(bVar.f49379i, JsApiUploadEncryptedFileToCDN.this.mo115109j("cancel"));
                C17901b.this.f49377g.mo114397h();
            }
        }

        public C17901b(AppBrandLocalMediaObject appBrandLocalMediaObject, Context context, String str, JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask, C82381f fVar, int i) {
            this.f49374d = appBrandLocalMediaObject;
            this.f49375e = context;
            this.f49376f = str;
            this.f49377g = jsApiUploadEncryptedMediaFileTask;
            this.f49378h = fVar;
            this.f49379i = i;
        }

        public void run() {
            String string = (TextUtils.isEmpty(this.f49374d.f238904f) || !this.f49374d.f238904f.contains("video")) ? this.f49375e.getString(C0966R.string.a6p) : this.f49375e.getString(C0966R.string.a6v);
            Context context = this.f49375e;
            C76879j.m92750u(context, context.getString(C0966R.string.a6r, new Object[]{string, this.f49376f}), this.f49375e.getString(C0966R.string.a3h), new C17902a(), new C17903b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$c */
    public static final class C17904c extends C82926s {
        private static final int CTRL_INDEX = 196;
        private static final String NAME = "onUploadEncryptedFileToCDNProgress";

        public C17904c(C17900a aVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Context context = fVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  pageContext is null");
            fVar.mo109647a(i, mo115109j("fail"));
        } else if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            String appId = fVar.getAppId();
            String optString = jSONObject.optString("tempFilePath");
            boolean optBoolean = jSONObject.optBoolean("isShowProgressTips", false);
            Log.m105925i("MicroMsg.JsApiUploadEncryptedFileToCDN", "JsApiUploadEncryptedFileToCDN appId:%s, data:%s", appId, jSONObject.toString());
            if (Util.isNullOrNil(optString)) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath is null");
                fVar.mo109647a(i, mo115109j("fail:tempFilePath is null"));
                return;
            }
            AppBrandLocalMediaObject d = AppBrandLocalMediaObjectManager.m99831d(appId, optString);
            if (d == null) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath file is not exist");
                fVar.mo109647a(i, mo115109j("fail:file doesn't exist"));
            } else if (TextUtils.isEmpty(d.f238903e)) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail, fileFullPath is null");
                fVar.mo109647a(i, mo115109j("fail:fileFullPath is null"));
            } else {
                JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask = new JsApiUploadEncryptedMediaFileTask();
                jsApiUploadEncryptedMediaFileTask.f49347f = appId;
                jsApiUploadEncryptedMediaFileTask.f49348g = optString;
                jsApiUploadEncryptedMediaFileTask.f49349h = optBoolean;
                jsApiUploadEncryptedMediaFileTask.f49359u = (Activity) context;
                jsApiUploadEncryptedMediaFileTask.f49360v = fVar;
                jsApiUploadEncryptedMediaFileTask.f49357s = d.f238904f;
                jsApiUploadEncryptedMediaFileTask.f49358t = new C17900a(jsApiUploadEncryptedMediaFileTask, fVar, i);
                if (!C114786m0.m161568a(context)) {
                    Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "2G/3G/4G network available, do upload in mobile network and show the gprs confirm tips dialog");
                    MMHandlerThread.postToMainThread(new C17901b(d, context, Util.getSizeMB((long) ((int) C86013q1.m106451l(d.f238903e))), jsApiUploadEncryptedMediaFileTask, fVar, i));
                    return;
                }
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "wifi network available, do not show the gprs confirm dialog");
                jsApiUploadEncryptedMediaFileTask.mo114395c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask */
    public static class JsApiUploadEncryptedMediaFileTask extends MainProcessTask {
        public static final Parcelable.Creator<JsApiUploadEncryptedMediaFileTask> CREATOR = new C17899e();

        /* renamed from: f */
        public String f49347f;

        /* renamed from: g */
        public String f49348g;

        /* renamed from: h */
        public boolean f49349h;

        /* renamed from: i */
        public String f49350i;

        /* renamed from: j */
        public String f49351j;

        /* renamed from: n */
        public String f49352n;

        /* renamed from: o */
        public int f49353o;

        /* renamed from: p */
        public int f49354p = 0;

        /* renamed from: q */
        public int f49355q = 0;

        /* renamed from: r */
        public int f49356r = 0;

        /* renamed from: s */
        public String f49357s;

        /* renamed from: t */
        public Runnable f49358t;

        /* renamed from: u */
        public Activity f49359u;

        /* renamed from: v */
        public C82381f f49360v;

        /* renamed from: w */
        public ProgressDialog f49361w = null;

        /* renamed from: x */
        public C22762d f49362x;

        /* renamed from: y */
        public C22763e f49363y;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$a */
        public class C17893a implements C22762d {
            public C17893a() {
            }

            /* renamed from: R */
            public void mo22159R(boolean z, int i, int i2, String str, String str2) {
                Log.m105919d("MicroMsg.JsApiUploadEncryptedFileToCDN", "progress, percent:%d, localId:%s", Integer.valueOf(i2), str);
                JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask = JsApiUploadEncryptedMediaFileTask.this;
                jsApiUploadEncryptedMediaFileTask.f49354p = i2;
                jsApiUploadEncryptedMediaFileTask.f49356r = 3;
                jsApiUploadEncryptedMediaFileTask.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$b */
        public class C17894b implements C22763e {

            /* renamed from: a */
            public final /* synthetic */ AppBrandLocalMediaObject f49365a;

            public C17894b(AppBrandLocalMediaObject appBrandLocalMediaObject) {
                this.f49365a = appBrandLocalMediaObject;
            }

            /* renamed from: a */
            public void mo22160a(boolean z, String str, String str2, String str3) {
                Log.m105925i("MicroMsg.JsApiUploadEncryptedFileToCDN", " on cdn finish,  is success : %s, mediaId : %s, localId : %s, mediaUrl : %s", Boolean.valueOf(z), str2, str, str3);
                if (!Util.isNullOrNil(str) && str.equals(this.f49365a.f238902d)) {
                    C22759b xx02 = C81161g2.xx0();
                    C22762d dVar = JsApiUploadEncryptedMediaFileTask.this.f49362x;
                    Vector<C22762d> vector = xx02.f65471b;
                    if (!(vector == null || dVar == null)) {
                        vector.remove(dVar);
                    }
                    C22759b xx03 = C81161g2.xx0();
                    C22763e eVar = JsApiUploadEncryptedMediaFileTask.this.f49363y;
                    Vector<C22763e> vector2 = xx03.f65470a;
                    if (!(vector2 == null || eVar == null)) {
                        vector2.remove(eVar);
                    }
                    C81161g2.xx0().mo35858b(this.f49365a.f238902d);
                    if (!z) {
                        Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file false");
                    } else {
                        JsApiUploadEncryptedMediaFileTask.this.f49350i = str2;
                        Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file success");
                    }
                    C22761c zx02 = C81161g2.zx0();
                    String str4 = JsApiUploadEncryptedMediaFileTask.this.f49350i;
                    zx02.getClass();
                    C22757a aVar = null;
                    if (!Util.isNullOrNil(str4)) {
                        Iterator<C22757a> it = zx02.f65474a.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C22757a next = it.next();
                            if (Util.nullAsNil(next.f65466c).equals(str4)) {
                                aVar = next;
                                break;
                            }
                        }
                    } else {
                        Log.m105920e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByServerId error, media id is null or nil");
                    }
                    if (aVar == null || aVar.f65468e == null) {
                        Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is null");
                    } else {
                        Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is valid");
                        JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask = JsApiUploadEncryptedMediaFileTask.this;
                        C22757a.C22758a aVar2 = aVar.f65468e;
                        String str5 = aVar2.field_aesKey;
                        jsApiUploadEncryptedMediaFileTask.f49351j = str5;
                        jsApiUploadEncryptedMediaFileTask.f49350i = aVar2.field_fileId;
                        jsApiUploadEncryptedMediaFileTask.f49352n = aVar2.field_fileUrl;
                        int i = aVar2.field_fileLength;
                        jsApiUploadEncryptedMediaFileTask.f49353o = i;
                        Log.m105919d("MicroMsg.JsApiUploadEncryptedFileToCDN", "aesKey:%s, fileLength:%d", str5, Integer.valueOf(i));
                    }
                    JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask2 = JsApiUploadEncryptedMediaFileTask.this;
                    jsApiUploadEncryptedMediaFileTask2.f49356r = 1;
                    jsApiUploadEncryptedMediaFileTask2.mo114394b();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$c */
        public class C17895c implements DialogInterface.OnCancelListener {
            public C17895c() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel uploading the media file");
                dialogInterface.dismiss();
                JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask = JsApiUploadEncryptedMediaFileTask.this;
                jsApiUploadEncryptedMediaFileTask.f49355q = 1;
                jsApiUploadEncryptedMediaFileTask.f49356r = 1;
                jsApiUploadEncryptedMediaFileTask.mo114395c();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$d */
        public class C17896d implements DialogInterface.OnKeyListener {

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$d$a */
            public class C17897a implements DialogInterface.OnClickListener {
                public C17897a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the media file");
                    JsApiUploadEncryptedMediaFileTask.this.f49361w.cancel();
                    JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedMediaFileTask = JsApiUploadEncryptedMediaFileTask.this;
                    jsApiUploadEncryptedMediaFileTask.f49355q = 1;
                    jsApiUploadEncryptedMediaFileTask.f49356r = 1;
                    jsApiUploadEncryptedMediaFileTask.mo114395c();
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$d$b */
            public class C17898b implements DialogInterface.OnClickListener {
                public C17898b(C17896d dVar) {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "user continue upload media file");
                }
            }

            public C17896d() {
            }

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                String string = (TextUtils.isEmpty(JsApiUploadEncryptedMediaFileTask.this.f49357s) || !JsApiUploadEncryptedMediaFileTask.this.f49357s.contains("video")) ? JsApiUploadEncryptedMediaFileTask.this.f49359u.getString(C0966R.string.a6p) : JsApiUploadEncryptedMediaFileTask.this.f49359u.getString(C0966R.string.a6v);
                Activity activity = JsApiUploadEncryptedMediaFileTask.this.f49359u;
                C76879j.m92717K(activity, true, activity.getString(C0966R.string.a6q, new Object[]{string}), "", JsApiUploadEncryptedMediaFileTask.this.f49359u.getString(C0966R.string.a6s), JsApiUploadEncryptedMediaFileTask.this.f49359u.getString(C0966R.string.a6t), new C17897a(), new C17898b(this));
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$e */
        public class C17899e implements Parcelable.Creator<JsApiUploadEncryptedMediaFileTask> {
            public Object createFromParcel(Parcel parcel) {
                return new JsApiUploadEncryptedMediaFileTask(parcel);
            }

            public Object[] newArray(int i) {
                return new JsApiUploadEncryptedMediaFileTask[i];
            }
        }

        public JsApiUploadEncryptedMediaFileTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f49347f = parcel.readString();
            this.f49348g = parcel.readString();
            this.f49350i = parcel.readString();
            this.f49351j = parcel.readString();
            this.f49352n = parcel.readString();
            this.f49353o = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f49349h = z;
            this.f49354p = parcel.readInt();
            this.f49356r = parcel.readInt();
            this.f49355q = parcel.readInt();
            this.f49357s = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            int i = this.f49356r;
            if (i == 0) {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_INIT");
            } else if (i == 1) {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_FINISH");
                ProgressDialog progressDialog = this.f49361w;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    this.f49361w = null;
                }
                Runnable runnable = this.f49358t;
                if (runnable != null) {
                    ((C17900a) runnable).run();
                }
            } else if (i == 2) {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_SHOW_DIALOG");
                Activity activity = this.f49359u;
                C89779i0 Q = C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), this.f49359u.getString(C0966R.string.a6u), true, true, new C17895c());
                this.f49361w = Q;
                Q.setOnKeyListener(new C17896d());
            } else if (i == 3) {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_PROGRESS");
                HashMap hashMap = new HashMap();
                hashMap.put("tempFilePath", this.f49348g);
                hashMap.put("percent", Integer.valueOf(this.f49354p));
                String jSONObject = new JSONObject(hashMap).toString();
                C17904c cVar = new C17904c((C17900a) null);
                cVar.mo115194p(this.f49360v);
                cVar.f242407f = jSONObject;
                cVar.mo115158h();
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            C22757a aVar;
            boolean z;
            Vector<C22763e> vector;
            Log.m105925i("MicroMsg.JsApiUploadEncryptedFileToCDN", "runInMainProcess mainEvent:%d, clientEvent:%d", Integer.valueOf(this.f49355q), Integer.valueOf(this.f49356r));
            if (this.f49355q == 1) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the file, remove callback");
                C22759b xx02 = C81161g2.xx0();
                C22762d dVar = this.f49362x;
                Vector<C22762d> vector2 = xx02.f65471b;
                if (!(vector2 == null || dVar == null)) {
                    vector2.remove(dVar);
                }
                C22759b xx03 = C81161g2.xx0();
                C22763e eVar = this.f49363y;
                Vector<C22763e> vector3 = xx03.f65470a;
                if (!(vector3 == null || eVar == null)) {
                    vector3.remove(eVar);
                }
                C81161g2.xx0().mo35858b(this.f49348g);
                this.f49355q = 0;
                this.f49356r = 1;
                mo114394b();
                return;
            }
            AppBrandLocalMediaObject d = AppBrandLocalMediaObjectManager.m99831d(this.f49347f, this.f49348g);
            if (d == null) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "getItemByLocalId return mediaObject is null, ");
                this.f49356r = 1;
                mo114394b();
                return;
            }
            C22757a aVar2 = new C22757a();
            aVar2.f65464a = d.f238902d;
            aVar2.f65465b = d.f238903e;
            String str = this.f49348g;
            aVar2.f65467d = C1297x.m1387b("appbrandmediafile", Util.nowMilliSecond(), str, str);
            C81161g2.zx0().mo35859a(aVar2);
            this.f49362x = new C17893a();
            this.f49363y = new C17894b(d);
            C22759b xx04 = C81161g2.xx0();
            C22762d dVar2 = this.f49362x;
            Vector<C22762d> vector4 = xx04.f65471b;
            if (!(vector4 == null || dVar2 == null || vector4.contains(dVar2))) {
                xx04.f65471b.add(dVar2);
            }
            C22759b xx05 = C81161g2.xx0();
            String str2 = d.f238902d;
            C22763e eVar2 = this.f49363y;
            xx05.getClass();
            C22761c zx02 = C81161g2.zx0();
            zx02.getClass();
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
                aVar = null;
            } else {
                aVar = zx02.f65474a.get(str2);
            }
            if (aVar == null) {
                Log.m105921e("MicroMsg.AppbrandCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", str2);
                z = false;
            } else {
                if (!(eVar2 == null || (vector = xx05.f65470a) == null || vector.contains(eVar2))) {
                    xx05.f65470a.add(eVar2);
                }
                aVar.f65469f = true;
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_AppbrandCdnService_1";
                gVar.f287662f = xx05.f65472c;
                gVar.f287661e = true;
                gVar.field_mediaId = aVar.f65467d;
                gVar.field_fullpath = aVar.f65465b;
                gVar.field_fileType = CdnLogic.kMediaTypeBeatificFile;
                gVar.field_talker = "weixin";
                gVar.field_priority = 2;
                gVar.field_needStorage = true;
                gVar.field_isStreamMedia = false;
                gVar.field_appType = 0;
                gVar.field_bzScene = 0;
                gVar.field_force_aeskeycdn = true;
                gVar.field_trysafecdn = false;
                z = ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
                Log.m105925i("MicroMsg.AppbrandCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", Boolean.valueOf(z), Boolean.valueOf(gVar.field_force_aeskeycdn), Boolean.valueOf(gVar.field_trysafecdn), str2);
            }
            Log.m105925i("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask: add cdn upload task result : %b", Boolean.valueOf(z));
            if (!z) {
                Log.m105920e("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask fail");
                this.f49356r = 1;
                C22759b xx06 = C81161g2.xx0();
                C22762d dVar3 = this.f49362x;
                Vector<C22762d> vector5 = xx06.f65471b;
                if (!(vector5 == null || dVar3 == null)) {
                    vector5.remove(dVar3);
                }
                C22759b xx07 = C81161g2.xx0();
                C22763e eVar3 = this.f49363y;
                Vector<C22763e> vector6 = xx07.f65470a;
                if (!(vector6 == null || eVar3 == null)) {
                    vector6.remove(eVar3);
                }
                C81161g2.xx0().mo35858b(d.f238902d);
                mo114394b();
            } else if (this.f49349h) {
                Log.m105924i("MicroMsg.JsApiUploadEncryptedFileToCDN", "show the process dialog");
                this.f49356r = 2;
                mo114394b();
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f49347f);
            parcel.writeString(this.f49348g);
            parcel.writeString(this.f49350i);
            parcel.writeString(this.f49351j);
            parcel.writeString(this.f49352n);
            parcel.writeInt(this.f49353o);
            parcel.writeInt(this.f49349h ? 1 : 0);
            parcel.writeInt(this.f49354p);
            parcel.writeInt(this.f49356r);
            parcel.writeInt(this.f49355q);
            parcel.writeString(this.f49357s);
        }

        public JsApiUploadEncryptedMediaFileTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
