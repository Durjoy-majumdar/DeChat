package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import js0.C88024r;
import nj3.C76879j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import p225rc.C89922k;
import p914oj.C89231c;
import qo3.C89779i0;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia */
public final class JsApiChooseMedia extends C82268c {
    public static final int CTRL_INDEX = 193;
    public static final String NAME = "chooseMedia";

    /* renamed from: h */
    public static volatile boolean f241846h;

    /* renamed from: g */
    public boolean f241847g = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest */
    public static final class ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<ChooseRequest> CREATOR = new C82657a();

        /* renamed from: d */
        public String f241848d;

        /* renamed from: e */
        public boolean f241849e;

        /* renamed from: f */
        public boolean f241850f;

        /* renamed from: g */
        public boolean f241851g;

        /* renamed from: h */
        public boolean f241852h;

        /* renamed from: i */
        public boolean f241853i;

        /* renamed from: j */
        public boolean f241854j;

        /* renamed from: n */
        public int f241855n;

        /* renamed from: o */
        public int f241856o;

        /* renamed from: p */
        public boolean f241857p;

        /* renamed from: q */
        public boolean f241858q;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest$a */
        public class C82657a implements Parcelable.Creator<ChooseRequest> {
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
            return C82662d.class;
        }

        public String getUIAlias() {
            return "GalleryChooseMedia";
        }

        public boolean oneShotForeground() {
            return true;
        }

        public void readParcel(Parcel parcel) {
            this.f241848d = parcel.readString();
            boolean z = true;
            this.f241849e = parcel.readByte() != 0;
            this.f241850f = parcel.readByte() != 0;
            this.f241851g = parcel.readByte() != 0;
            this.f241852h = parcel.readByte() != 0;
            this.f241853i = parcel.readByte() != 0;
            this.f241854j = parcel.readByte() != 0;
            this.f241855n = parcel.readInt();
            this.f241856o = parcel.readInt();
            this.f241857p = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f241858q = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241848d);
            parcel.writeByte(this.f241849e ? (byte) 1 : 0);
            parcel.writeByte(this.f241850f ? (byte) 1 : 0);
            parcel.writeByte(this.f241851g ? (byte) 1 : 0);
            parcel.writeByte(this.f241852h ? (byte) 1 : 0);
            parcel.writeByte(this.f241853i ? (byte) 1 : 0);
            parcel.writeByte(this.f241854j ? (byte) 1 : 0);
            parcel.writeInt(this.f241855n);
            parcel.writeInt(this.f241856o);
            parcel.writeByte(this.f241857p ? (byte) 1 : 0);
            parcel.writeByte(this.f241858q ? (byte) 1 : 0);
        }

        public ChooseRequest(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult */
    public static final class ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<ChooseResult> CREATOR = new C82658a();

        /* renamed from: d */
        public int f241859d;

        /* renamed from: e */
        public String f241860e;

        /* renamed from: f */
        public String f241861f;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult$a */
        public class C82658a implements Parcelable.Creator<ChooseResult> {
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
            this.f241859d = parcel.readInt();
            this.f241860e = parcel.readString();
            this.f241861f = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f241859d);
            parcel.writeString(this.f241860e);
            parcel.writeString(this.f241861f);
        }

        public ChooseResult(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$a */
    public class C82659a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241862d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f241863e;

        /* renamed from: f */
        public final /* synthetic */ int f241864f;

        /* renamed from: g */
        public final /* synthetic */ ChooseRequest f241865g;

        public C82659a(C82381f fVar, JSONObject jSONObject, int i, ChooseRequest chooseRequest) {
            this.f241862d = fVar;
            this.f241863e = jSONObject;
            this.f241864f = i;
            this.f241865g = chooseRequest;
        }

        public void run() {
            JsApiChooseMedia jsApiChooseMedia = JsApiChooseMedia.this;
            C82381f fVar = this.f241862d;
            JSONObject jSONObject = this.f241863e;
            int i = this.f241864f;
            ChooseRequest chooseRequest = this.f241865g;
            jsApiChooseMedia.getClass();
            Log.m105924i("MicroMsg.JsApiChooseMedia", "showSelectMenu");
            Context context = fVar.getContext();
            C45082x0 x0Var = new C45082x0(context);
            C82762s0 s0Var = new C82762s0(jsApiChooseMedia, fVar, i);
            x0Var.f122289h = s0Var;
            x0Var.f122286e.f225761d = s0Var;
            x0Var.mo70436b((View) null, new C82765t0(jsApiChooseMedia, context), new C82768u0(jsApiChooseMedia, chooseRequest, fVar, jSONObject, i), new C82771v0(jsApiChooseMedia, fVar, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$b */
    public class C82660b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241867d;

        public C82660b(JsApiChooseMedia jsApiChooseMedia, C82381f fVar) {
            this.f241867d = fVar;
        }

        /* renamed from: f */
        public void mo109498f() {
            Log.m105924i("MicroMsg.JsApiChooseMedia", "chooseMedia, onResume, remove listener");
            JsApiChooseMedia.f241846h = false;
            C83231l.m102144e(this.f241867d.getAppId(), this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$c */
    public class C82661c implements AppBrandProxyUIProcessTask.C81943b<ChooseResult> {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241868a;

        /* renamed from: b */
        public final /* synthetic */ int f241869b;

        public C82661c(C82381f fVar, int i) {
            this.f241868a = fVar;
            this.f241869b = i;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            ChooseResult chooseResult = (ChooseResult) processResult;
            JsApiChooseMedia.f241846h = false;
            if (chooseResult == null) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult result is null");
                this.f241868a.mo109647a(this.f241869b, JsApiChooseMedia.this.mo115109j("fail"));
                return;
            }
            int i = chooseResult.f241859d;
            if (i == -1) {
                String str = chooseResult.f241860e;
                JSONArray jSONArray = null;
                try {
                    jSONArray = new JSONArray(chooseResult.f241861f);
                } catch (JSONException unused) {
                    Log.m105921e("MicroMsg.JsApiChooseMedia", "parse:%s err", null);
                }
                if (jSONArray == null) {
                    Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult localIds is null");
                    this.f241868a.mo109647a(this.f241869b, JsApiChooseMedia.this.mo115109j("fail"));
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("type", str);
                hashMap.put("tempFiles", jSONArray);
                Log.m105925i("MicroMsg.JsApiChooseMedia", "chooseMedia ok, type:%s, localIds:%s", str, jSONArray);
                this.f241868a.mo109647a(this.f241869b, JsApiChooseMedia.this.mo115112m("ok", hashMap));
            } else if (i != 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult");
                this.f241868a.mo109647a(this.f241869b, JsApiChooseMedia.this.mo115109j("fail"));
            } else {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
                this.f241868a.mo109647a(this.f241869b, JsApiChooseMedia.this.mo115109j("fail:cancel"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d */
    public static final class C82662d extends AppBrandProxyUIProcessTask {

        /* renamed from: d */
        public ChooseResult f241871d = new ChooseResult();

        /* renamed from: e */
        public ChooseRequest f241872e;

        /* renamed from: f */
        public String f241873f;

        /* renamed from: g */
        public String f241874g;

        /* renamed from: h */
        public C89779i0 f241875h;

        /* renamed from: i */
        public DialogInterface.OnCancelListener f241876i;

        /* renamed from: j */
        public int f241877j;

        /* renamed from: n */
        public int f241878n = -1;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$a */
        public class C82663a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f241879d;

            /* renamed from: e */
            public final /* synthetic */ boolean f241880e;

            /* renamed from: f */
            public final /* synthetic */ List f241881f;

            /* renamed from: g */
            public final /* synthetic */ ArrayList f241882g;

            /* renamed from: h */
            public final /* synthetic */ boolean f241883h;

            /* renamed from: i */
            public final /* synthetic */ List f241884i;

            /* renamed from: j */
            public final /* synthetic */ boolean f241885j;

            public C82663a(boolean z, boolean z2, List list, ArrayList arrayList, boolean z3, List list2, boolean z4) {
                this.f241879d = z;
                this.f241880e = z2;
                this.f241881f = list;
                this.f241882g = arrayList;
                this.f241883h = z3;
                this.f241884i = list2;
                this.f241885j = z4;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:60:0x0145, code lost:
                if (r4.equals(r14) == false) goto L_0x0147;
             */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x015a A[Catch:{ Exception -> 0x01a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x015d A[Catch:{ Exception -> 0x01a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x0174 A[Catch:{ Exception -> 0x01a9 }] */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x019a A[Catch:{ Exception -> 0x01a9 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r16 = this;
                    r1 = r16
                    java.lang.String r2 = "MicroMsg.JsApiChooseMedia"
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r0 = r0.f241871d
                    r3 = -2
                    r0.f241859d = r3
                    org.json.JSONStringer r3 = new org.json.JSONStringer
                    r3.<init>()
                    r12 = 1
                    r13 = 0
                    r3.array()     // Catch:{ Exception -> 0x01a9 }
                    boolean r0 = r1.f241879d     // Catch:{ Exception -> 0x01a9 }
                    if (r0 != 0) goto L_0x001d
                    boolean r0 = r1.f241880e     // Catch:{ Exception -> 0x01a9 }
                    if (r0 == 0) goto L_0x01a5
                L_0x001d:
                    java.util.List r0 = r1.f241881f     // Catch:{ Exception -> 0x01a9 }
                    if (r0 == 0) goto L_0x01a5
                    int r0 = r0.size()     // Catch:{ Exception -> 0x01a9 }
                    if (r0 <= 0) goto L_0x01a5
                    java.util.List r0 = r1.f241881f     // Catch:{ Exception -> 0x01a9 }
                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01a9 }
                L_0x002d:
                    boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x01a5
                    java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x01a9 }
                    r14 = r4
                    java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x01a9 }
                    boolean r4 = r1.f241879d     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r15 = "mix"
                    r10 = -1
                    r11 = 0
                    if (r4 == 0) goto L_0x00ce
                    java.util.ArrayList r4 = r1.f241882g     // Catch:{ Exception -> 0x01a9 }
                    boolean r4 = r4.contains(r14)     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x00ce
                    android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = r4.getPath()     // Catch:{ Exception -> 0x01a9 }
                    if (r5 == 0) goto L_0x006e
                    java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r13, r13)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r6 = r4.getPath()     // Catch:{ Exception -> 0x01a9 }
                    boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x01a9 }
                    if (r6 != 0) goto L_0x006e
                    android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Exception -> 0x01a9 }
                    android.net.Uri$Builder r4 = r4.path(r5)     // Catch:{ Exception -> 0x01a9 }
                    android.net.Uri r4 = r4.build()     // Catch:{ Exception -> 0x01a9 }
                L_0x006e:
                    com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.vfs.f0$h r4 = r5.mo177799l(r4, r11)     // Catch:{ Exception -> 0x01a9 }
                    boolean r5 = r4.mo177810a()     // Catch:{ Exception -> 0x01a9 }
                    if (r5 != 0) goto L_0x007c
                    r4 = 0
                    goto L_0x0084
                L_0x007c:
                    com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r4 = r4.f348992b     // Catch:{ Exception -> 0x01a9 }
                    boolean r4 = r5.mo119948x(r4)     // Catch:{ Exception -> 0x01a9 }
                L_0x0084:
                    if (r4 == 0) goto L_0x00c4
                    java.lang.String r4 = "take media local, the path file exist, success, path:%s"
                    java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a9 }
                    r5[r13] = r14     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r5 = r4.f241871d     // Catch:{ Exception -> 0x01a9 }
                    r5.f241859d = r10     // Catch:{ Exception -> 0x01a9 }
                    r5.f241860e = r15     // Catch:{ Exception -> 0x01a9 }
                    boolean r5 = r1.f241883h     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.m101443c(r4, r14, r5)     // Catch:{ Exception -> 0x01a9 }
                    if (r4 != 0) goto L_0x00aa
                    java.lang.String r4 = "addVideoItem fail ,videoFilePath is %s"
                    java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a9 }
                    r5[r13] = r14     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x002d
                L_0x00aa:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r5 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.m101444d(r5, r14)     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r5 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.m101445e(r5)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = r4.f238902d     // Catch:{ Exception -> 0x01a9 }
                    int r7 = r4.f238912n     // Catch:{ Exception -> 0x01a9 }
                    int r8 = r4.f238915q     // Catch:{ Exception -> 0x01a9 }
                    int r9 = r4.f238914p     // Catch:{ Exception -> 0x01a9 }
                    long r10 = r4.f238913o     // Catch:{ Exception -> 0x01a9 }
                    r4 = r3
                    com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.m101442b(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x00ce
                L_0x00c4:
                    java.lang.String r4 = "take media local, videoFilePath is %s, the file not exist, fail"
                    java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a9 }
                    r5[r13] = r14     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)     // Catch:{ Exception -> 0x01a9 }
                L_0x00ce:
                    boolean r4 = r1.f241880e     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x002d
                    java.util.List r4 = r1.f241884i     // Catch:{ Exception -> 0x01a9 }
                    boolean r4 = r4.contains(r14)     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x002d
                    android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = r4.getPath()     // Catch:{ Exception -> 0x01a9 }
                    if (r5 == 0) goto L_0x00fe
                    java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r13, r13)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r6 = r4.getPath()     // Catch:{ Exception -> 0x01a9 }
                    boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x01a9 }
                    if (r6 != 0) goto L_0x00fe
                    android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Exception -> 0x01a9 }
                    android.net.Uri$Builder r4 = r4.path(r5)     // Catch:{ Exception -> 0x01a9 }
                    android.net.Uri r4 = r4.build()     // Catch:{ Exception -> 0x01a9 }
                L_0x00fe:
                    com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x01a9 }
                    r6 = 0
                    com.tencent.mm.vfs.f0$h r4 = r5.mo177799l(r4, r6)     // Catch:{ Exception -> 0x01a9 }
                    boolean r5 = r4.mo177810a()     // Catch:{ Exception -> 0x01a9 }
                    r7 = 0
                    if (r5 != 0) goto L_0x010e
                    goto L_0x011b
                L_0x010e:
                    com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r4 = r4.f348992b     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.vfs.b0 r4 = r5.mo119945q(r4)     // Catch:{ Exception -> 0x01a9 }
                    if (r4 != 0) goto L_0x0119
                    goto L_0x011b
                L_0x0119:
                    long r7 = r4.f250473c     // Catch:{ Exception -> 0x01a9 }
                L_0x011b:
                    java.lang.String r4 = "fileLength:%d"
                    java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a9 }
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x01a9 }
                    r5[r13] = r7     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x01a9 }
                    boolean r4 = r1.f241883h     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x0139
                    java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1782b(r14)     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x014a
                    boolean r5 = r4.equals(r14)     // Catch:{ Exception -> 0x01a9 }
                    if (r5 != 0) goto L_0x014a
                    goto L_0x0147
                L_0x0139:
                    boolean r4 = r1.f241885j     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x014a
                    java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1783c(r14, r12)     // Catch:{ Exception -> 0x01a9 }
                    boolean r5 = r4.equals(r14)     // Catch:{ Exception -> 0x01a9 }
                    if (r5 != 0) goto L_0x014a
                L_0x0147:
                    r14 = r4
                    r4 = 1
                    goto L_0x014b
                L_0x014a:
                    r4 = 0
                L_0x014b:
                    com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1781a(r14)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r7 = ".jpg"
                    boolean r5 = r5.endsWith(r7)     // Catch:{ Exception -> 0x01a9 }
                    if (r5 != 0) goto L_0x015d
                    java.lang.String r11 = "jpg"
                    goto L_0x015e
                L_0x015d:
                    r11 = r6
                L_0x015e:
                    java.lang.String r5 = "path:%s"
                    java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a9 }
                    r6[r13] = r14     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r5 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r5 = r5.f241872e     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = r5.f241848d     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r4 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99829b(r5, r14, r11, r4)     // Catch:{ Exception -> 0x01a9 }
                    if (r4 == 0) goto L_0x019a
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r5 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r5 = r5.f241871d     // Catch:{ Exception -> 0x01a9 }
                    r6 = -1
                    r5.f241859d = r6     // Catch:{ Exception -> 0x01a9 }
                    r5.f241860e = r15     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = r4.f238902d     // Catch:{ Exception -> 0x01a9 }
                    long r6 = r4.f238907i     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.m101441a(r3, r5, r6)     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r5 = "handle image success， mediaObj.localId：%s, mediaObj.fileLength:%d"
                    r6 = 2
                    java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01a9 }
                    java.lang.String r7 = r4.f238902d     // Catch:{ Exception -> 0x01a9 }
                    r6[r13] = r7     // Catch:{ Exception -> 0x01a9 }
                    long r7 = r4.f238907i     // Catch:{ Exception -> 0x01a9 }
                    java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x01a9 }
                    r6[r12] = r4     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x002d
                L_0x019a:
                    java.lang.String r4 = "handle image from album, get null obj from path: %s"
                    java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a9 }
                    r5[r13] = r14     // Catch:{ Exception -> 0x01a9 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x002d
                L_0x01a5:
                    r3.endArray()     // Catch:{ Exception -> 0x01a9 }
                    goto L_0x01b1
                L_0x01a9:
                    r0 = move-exception
                    java.lang.Object[] r4 = new java.lang.Object[r13]
                    java.lang.String r5 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r4)
                L_0x01b1:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r0 = r0.f241871d
                    java.lang.String r4 = r3.toString()
                    r0.f241861f = r4
                    java.lang.Object[] r0 = new java.lang.Object[r12]
                    java.lang.String r3 = r3.toString()
                    r0[r13] = r3
                    java.lang.String r3 = "return json: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r2 = r0.f241871d
                    r0.finishProcess(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.C82663a.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$b */
        public class C82664b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f241887d;

            /* renamed from: e */
            public final /* synthetic */ boolean f241888e;

            public C82664b(ArrayList arrayList, boolean z) {
                this.f241887d = arrayList;
                this.f241888e = z;
            }

            public void run() {
                if (this.f241887d.size() == 1) {
                    C82662d.this.f241873f = C86013q1.m106448i((String) this.f241887d.get(0), false);
                    if (Util.isNullOrNil(C82662d.this.f241873f)) {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is  null, fail");
                        C82662d dVar = C82662d.this;
                        ChooseResult chooseResult = dVar.f241871d;
                        chooseResult.f241859d = -2;
                        dVar.finishProcess(chooseResult);
                        return;
                    }
                    Uri n = C116299g2.m163858n(C82662d.this.f241873f);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                        Log.m105924i("MicroMsg.JsApiChooseMedia", "take media local, the mVideoFilePath file exist, success");
                        C82662d dVar2 = C82662d.this;
                        ChooseResult chooseResult2 = dVar2.f241871d;
                        chooseResult2.f241859d = -1;
                        chooseResult2.f241860e = "video";
                        AppBrandLocalVideoObject c = C82662d.m101443c(dVar2, dVar2.f241873f, this.f241888e);
                        if (c == null) {
                            Log.m105921e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", C82662d.this.f241873f);
                            C82662d dVar3 = C82662d.this;
                            ChooseResult chooseResult3 = dVar3.f241871d;
                            chooseResult3.f241859d = -2;
                            dVar3.finishProcess(chooseResult3);
                            return;
                        }
                        C82662d dVar4 = C82662d.this;
                        C82662d.m101444d(dVar4, dVar4.f241873f);
                        C82662d.this.f241871d.f241861f = C82662d.m101446f(c.f238902d, C82662d.m101445e(C82662d.this), c.f238912n, c.f238915q, c.f238914p, c.f238913o);
                        C82662d dVar5 = C82662d.this;
                        dVar5.finishProcess(dVar5.f241871d);
                        return;
                    }
                    Log.m105921e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is %s, the file not exist, fail", C82662d.this.f241873f);
                    C82662d dVar6 = C82662d.this;
                    ChooseResult chooseResult4 = dVar6.f241871d;
                    chooseResult4.f241859d = -2;
                    dVar6.finishProcess(chooseResult4);
                } else if (this.f241887d.size() > 1) {
                    C82662d.this.f241871d.f241859d = -2;
                    JSONStringer jSONStringer = new JSONStringer();
                    try {
                        jSONStringer.array();
                        Iterator it = this.f241887d.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            Uri n2 = C116299g2.m163858n(str);
                            String path2 = n2.getPath();
                            if (path2 != null) {
                                String k2 = C116299g2.m163855k(path2, false, false);
                                if (!n2.getPath().equals(k2)) {
                                    n2 = n2.buildUpon().path(k2).build();
                                }
                            }
                            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                            if (!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) {
                                Log.m105925i("MicroMsg.JsApiChooseMedia", "take media local, the path file exist, success, path:%s", str);
                                C82662d dVar7 = C82662d.this;
                                ChooseResult chooseResult5 = dVar7.f241871d;
                                chooseResult5.f241859d = -1;
                                chooseResult5.f241860e = "video";
                                AppBrandLocalVideoObject c2 = C82662d.m101443c(dVar7, str, this.f241888e);
                                if (c2 == null) {
                                    Log.m105921e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,videoFilePath is %s", str);
                                } else {
                                    C82662d.m101444d(C82662d.this, str);
                                    C82662d.m101442b(jSONStringer, c2.f238902d, C82662d.m101445e(C82662d.this), c2.f238912n, c2.f238915q, c2.f238914p, c2.f238913o);
                                }
                            } else {
                                Log.m105921e("MicroMsg.JsApiChooseMedia", "take media local, videoFilePath is %s, the file not exist, fail", str);
                            }
                        }
                        jSONStringer.endArray();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e, "", new Object[0]);
                    }
                    C82662d.this.f241871d.f241861f = jSONStringer.toString();
                    C82662d dVar8 = C82662d.this;
                    dVar8.finishProcess(dVar8.f241871d);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$c */
        public class C82665c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List f241890d;

            /* renamed from: e */
            public final /* synthetic */ boolean f241891e;

            /* renamed from: f */
            public final /* synthetic */ boolean f241892f;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$c$a */
            public class C82666a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ArrayList f241894d;

                /* renamed from: e */
                public final /* synthetic */ ArrayList f241895e;

                public C82666a(ArrayList arrayList, ArrayList arrayList2) {
                    this.f241894d = arrayList;
                    this.f241895e = arrayList2;
                }

                public void run() {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
                    C82662d dVar = C82662d.this;
                    ChooseResult chooseResult = dVar.f241871d;
                    chooseResult.f241859d = -1;
                    chooseResult.f241860e = "image";
                    chooseResult.f241861f = C82662d.m101447g(this.f241894d, this.f241895e, dVar.f241872e.f241853i);
                    C82662d dVar2 = C82662d.this;
                    dVar2.finishProcess(dVar2.f241871d);
                }
            }

            public C82665c(List list, boolean z, boolean z2) {
                this.f241890d = list;
                this.f241891e = z;
                this.f241892f = z2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
                if (r6.equals(r3) == false) goto L_0x0099;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0097, code lost:
                if (r6.equals(r3) == false) goto L_0x0099;
             */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.List r1 = r11.f241890d
                    int r1 = r1.size()
                    r0.<init>(r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    java.util.List r2 = r11.f241890d
                    int r2 = r2.size()
                    r1.<init>(r2)
                    java.util.List r2 = r11.f241890d
                    java.util.Iterator r2 = r2.iterator()
                L_0x001c:
                    boolean r3 = r2.hasNext()
                    java.lang.String r4 = "MicroMsg.JsApiChooseMedia"
                    if (r3 == 0) goto L_0x00ee
                    java.lang.Object r3 = r2.next()
                    java.lang.String r3 = (java.lang.String) r3
                    android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r3)
                    java.lang.String r6 = r5.getPath()
                    r7 = 0
                    if (r6 == 0) goto L_0x004f
                    java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r7, r7)
                    java.lang.String r8 = r5.getPath()
                    boolean r8 = r8.equals(r6)
                    if (r8 != 0) goto L_0x004f
                    android.net.Uri$Builder r5 = r5.buildUpon()
                    android.net.Uri$Builder r5 = r5.path(r6)
                    android.net.Uri r5 = r5.build()
                L_0x004f:
                    com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                    r8 = 0
                    com.tencent.mm.vfs.f0$h r5 = r6.mo177799l(r5, r8)
                    boolean r6 = r5.mo177810a()
                    r9 = 0
                    if (r6 != 0) goto L_0x005f
                    goto L_0x006c
                L_0x005f:
                    com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
                    java.lang.String r5 = r5.f348992b
                    com.tencent.mm.vfs.b0 r5 = r6.mo119945q(r5)
                    if (r5 != 0) goto L_0x006a
                    goto L_0x006c
                L_0x006a:
                    long r9 = r5.f250473c
                L_0x006c:
                    r5 = 1
                    java.lang.Object[] r6 = new java.lang.Object[r5]
                    java.lang.Long r9 = java.lang.Long.valueOf(r9)
                    r6[r7] = r9
                    java.lang.String r9 = "fileLength:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r6)
                    boolean r6 = r11.f241891e
                    if (r6 == 0) goto L_0x008b
                    java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1782b(r3)
                    if (r6 == 0) goto L_0x009c
                    boolean r9 = r6.equals(r3)
                    if (r9 != 0) goto L_0x009c
                    goto L_0x0099
                L_0x008b:
                    boolean r6 = r11.f241892f
                    if (r6 == 0) goto L_0x009c
                    java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1783c(r3, r5)
                    boolean r9 = r6.equals(r3)
                    if (r9 != 0) goto L_0x009c
                L_0x0099:
                    r3 = r6
                    r6 = 1
                    goto L_0x009d
                L_0x009c:
                    r6 = 0
                L_0x009d:
                    com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1781a(r3)
                    java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
                    java.lang.String r10 = ".jpg"
                    boolean r9 = r9.endsWith(r10)
                    if (r9 != 0) goto L_0x00ae
                    java.lang.String r8 = "jpg"
                L_0x00ae:
                    java.lang.Object[] r9 = new java.lang.Object[r5]
                    r9[r7] = r3
                    java.lang.String r10 = "path:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r9)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r9 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r9 = r9.f241872e
                    java.lang.String r9 = r9.f241848d
                    com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r6 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99829b(r9, r3, r8, r6)
                    if (r6 == 0) goto L_0x00e3
                    long r8 = r6.f238907i
                    java.lang.Long r3 = java.lang.Long.valueOf(r8)
                    r0.add(r3)
                    java.lang.Object[] r3 = new java.lang.Object[r5]
                    long r8 = r6.f238907i
                    java.lang.Long r5 = java.lang.Long.valueOf(r8)
                    r3[r7] = r5
                    java.lang.String r5 = "mediaObj fileLength:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                    java.lang.String r3 = r6.f238902d
                    r1.add(r3)
                    goto L_0x001c
                L_0x00e3:
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    r5[r7] = r3
                    java.lang.String r3 = "handle image from album, get null obj from path: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r5)
                    goto L_0x001c
                L_0x00ee:
                    int r2 = r1.size()
                    if (r2 != 0) goto L_0x0104
                    java.lang.String r0 = "handle image from album, get null obj"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r1 = r0.f241871d
                    r2 = -2
                    r1.f241859d = r2
                    r0.finishProcess(r1)
                    return
                L_0x0104:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$c$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$c$a
                    r2.<init>(r1, r0)
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.C82665c.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$d */
        public class C82667d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f241897d;

            /* renamed from: e */
            public final /* synthetic */ boolean f241898e;

            /* renamed from: f */
            public final /* synthetic */ boolean f241899f;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$d$a */
            public class C82668a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ArrayList f241901d;

                /* renamed from: e */
                public final /* synthetic */ ArrayList f241902e;

                public C82668a(ArrayList arrayList, ArrayList arrayList2) {
                    this.f241901d = arrayList;
                    this.f241902e = arrayList2;
                }

                public void run() {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
                    C82662d dVar = C82662d.this;
                    ChooseResult chooseResult = dVar.f241871d;
                    chooseResult.f241859d = -1;
                    boolean z = dVar.f241872e.f241853i;
                    if (z) {
                        chooseResult.f241860e = "mix";
                    } else {
                        chooseResult.f241860e = "image";
                    }
                    chooseResult.f241861f = C82662d.m101447g(this.f241901d, this.f241902e, z);
                    C82662d dVar2 = C82662d.this;
                    dVar2.finishProcess(dVar2.f241871d);
                }
            }

            public C82667d(String str, boolean z, boolean z2) {
                this.f241897d = str;
                this.f241898e = z;
                this.f241899f = z2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                if (r1.equals(r0) == false) goto L_0x0022;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
                if (r1.equals(r0) == false) goto L_0x0022;
             */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = r9.f241897d
                    boolean r1 = r9.f241898e
                    r2 = 1
                    if (r1 == 0) goto L_0x0014
                    java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1782b(r0)
                    if (r1 == 0) goto L_0x0023
                    boolean r3 = r1.equals(r0)
                    if (r3 != 0) goto L_0x0023
                    goto L_0x0022
                L_0x0014:
                    boolean r1 = r9.f241899f
                    if (r1 == 0) goto L_0x0023
                    java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1783c(r0, r2)
                    boolean r3 = r1.equals(r0)
                    if (r3 != 0) goto L_0x0023
                L_0x0022:
                    r0 = r1
                L_0x0023:
                    com.tencent.p014mm.plugin.appbrand.jsapi.media.C1732c2.m1781a(r0)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    r4 = 0
                    java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                    java.lang.String r6 = ".jpg"
                    boolean r5 = r5.endsWith(r6)
                    if (r5 != 0) goto L_0x003f
                    java.lang.String r4 = "jpg"
                L_0x003f:
                    java.lang.Object[] r5 = new java.lang.Object[r2]
                    r6 = 0
                    r5[r6] = r0
                    java.lang.String r7 = "MicroMsg.JsApiChooseMedia"
                    java.lang.String r8 = "path:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r5 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r5 = r5.f241872e
                    java.lang.String r5 = r5.f241848d
                    com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r0 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99829b(r5, r0, r4, r2)
                    if (r0 == 0) goto L_0x006f
                    long r4 = r0.f238907i
                    java.lang.Long r2 = java.lang.Long.valueOf(r4)
                    r1.add(r2)
                    java.lang.String r0 = r0.f238902d
                    r3.add(r0)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$d$a r0 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$d$a
                    r0.<init>(r3, r1)
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                    return
                L_0x006f:
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    java.lang.String r1 = r9.f241897d
                    r0[r6] = r1
                    java.lang.String r1 = "handle image from mm-sight camera, get null obj from path: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r0)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r1 = r0.f241871d
                    r2 = -2
                    r1.f241859d = r2
                    r0.finishProcess(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.C82667d.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$e */
        public class C82669e implements Runnable {
            public C82669e() {
            }

            public void run() {
                Uri n = C116299g2.m163858n(C82662d.this.f241873f);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "take media camera, the mVideoFilePath file exist, success");
                    C82662d dVar = C82662d.this;
                    ChooseResult chooseResult = dVar.f241871d;
                    chooseResult.f241859d = -1;
                    ChooseRequest chooseRequest = dVar.f241872e;
                    if (chooseRequest.f241853i) {
                        chooseResult.f241860e = "mix";
                    } else {
                        chooseResult.f241860e = "video";
                    }
                    AppBrandLocalVideoObject c = C82662d.m101443c(dVar, dVar.f241873f, chooseRequest.f241857p);
                    if (c == null) {
                        Log.m105921e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", C82662d.this.f241873f);
                        C82662d dVar2 = C82662d.this;
                        ChooseResult chooseResult2 = dVar2.f241871d;
                        chooseResult2.f241859d = -2;
                        dVar2.finishProcess(chooseResult2);
                        return;
                    }
                    C82662d dVar3 = C82662d.this;
                    C82662d.m101444d(dVar3, dVar3.f241873f);
                    C82662d.this.f241871d.f241861f = C82662d.m101446f(c.f238902d, C82662d.m101445e(C82662d.this), c.f238912n, c.f238915q, c.f238914p, c.f238913o);
                    C82662d dVar4 = C82662d.this;
                    dVar4.finishProcess(dVar4.f241871d);
                    return;
                }
                Log.m105921e("MicroMsg.JsApiChooseMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", C82662d.this.f241873f);
                C82662d dVar5 = C82662d.this;
                ChooseResult chooseResult3 = dVar5.f241871d;
                chooseResult3.f241859d = -2;
                dVar5.finishProcess(chooseResult3);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$d$f */
        public class C82670f implements DialogInterface.OnCancelListener {
            public C82670f() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "cancel show the progress dialog and finish progress");
                C82662d dVar = C82662d.this;
                ChooseResult chooseResult = dVar.f241871d;
                chooseResult.f241859d = 0;
                dVar.finishProcess(chooseResult);
            }
        }

        /* renamed from: a */
        public static void m101441a(JSONStringer jSONStringer, String str, long j) {
            try {
                jSONStringer.object();
                jSONStringer.key("tempFilePath");
                jSONStringer.value(str);
                jSONStringer.key("size");
                jSONStringer.value("" + j);
                jSONStringer.key("fileType");
                jSONStringer.value("image");
                jSONStringer.endObject();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e, "", new Object[0]);
            }
        }

        /* renamed from: b */
        public static void m101442b(JSONStringer jSONStringer, String str, String str2, int i, int i2, int i3, long j) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
                return;
            }
            Log.m105924i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
            try {
                jSONStringer.object();
                jSONStringer.key("tempFilePath");
                jSONStringer.value(str);
                jSONStringer.key("thumbTempFilePath");
                jSONStringer.value(str2);
                jSONStringer.key("duration");
                jSONStringer.value(i + "");
                jSONStringer.key("height");
                jSONStringer.value(i2 + "");
                jSONStringer.key("width");
                jSONStringer.value(i3 + "");
                jSONStringer.key("size");
                jSONStringer.value(j + "");
                jSONStringer.key("fileType");
                jSONStringer.value("video");
                jSONStringer.endObject();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e, "", new Object[0]);
            }
        }

        /* renamed from: c */
        public static AppBrandLocalVideoObject m101443c(C82662d dVar, String str, boolean z) {
            C89231c cVar;
            dVar.getClass();
            if (z) {
                try {
                    str = C82713f2.m101487e(str);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiChooseMedia", "addVideoItem, remux failed, exp = %s", Util.stackTraceToString(e));
                }
            }
            try {
                cVar = new C89231c();
                cVar.setDataSource(str);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.JsApiChooseMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e2);
                cVar = null;
            }
            if (cVar == null) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "addVideoItem, null meta data");
                return null;
            }
            int i = Util.getInt(cVar.extractMetadata(18), 0);
            int i2 = Util.getInt(cVar.extractMetadata(19), 0);
            int i3 = Util.getInt(cVar.extractMetadata(9), 0);
            int i4 = Util.getInt(cVar.extractMetadata(24), 0);
            Log.m105925i("MicroMsg.JsApiChooseMedia", "outputWidth:%d, outputHeight:%d, rotation:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
            if (i4 == 90 || i4 == 270) {
                int i5 = i2;
                i2 = i;
                i = i5;
            }
            cVar.release();
            String str2 = dVar.f241872e.f241848d;
            String str3 = AppBrandLocalMediaObjectManager.f238909a;
            AppBrandLocalVideoObject appBrandLocalVideoObject = (AppBrandLocalVideoObject) AppBrandLocalMediaObjectManager.m99830c(str2, str, AppBrandLocalVideoObject.class, "mp4", false);
            if (appBrandLocalVideoObject == null) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "attachVideo error, return null");
                return null;
            }
            appBrandLocalVideoObject.f238912n = (i3 + 500) / 1000;
            appBrandLocalVideoObject.f238914p = i;
            appBrandLocalVideoObject.f238915q = i2;
            appBrandLocalVideoObject.f238913o = C86013q1.m106451l(str);
            Log.m105925i("MicroMsg.JsApiChooseMedia", "addVideoItem, return %s", appBrandLocalVideoObject);
            return appBrandLocalVideoObject;
        }

        /* renamed from: d */
        public static void m101444d(C82662d dVar, String str) {
            C86009m1 m1Var;
            if (!TextUtils.isEmpty(dVar.f241874g)) {
                m1Var = new C86009m1(dVar.f241874g);
            } else {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "mThumbFilePath is empty!");
                m1Var = null;
            }
            if (m1Var == null || !m1Var.mo119967g()) {
                Log.m105921e("MicroMsg.JsApiChooseMedia", "file == null or file not exist for path:%s!", dVar.f241874g);
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                String path2 = n.getPath();
                int lastIndexOf = path2.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    path2 = path2.substring(lastIndexOf + 1);
                }
                String substring = (TextUtils.isEmpty(path2) || !path2.contains(".")) ? null : path2.substring(0, path2.lastIndexOf("."));
                String K = C112760b.m154203K();
                if (TextUtils.isEmpty(substring)) {
                    dVar.f241874g = C86013q1.m106448i(K + ("microMsg_" + System.currentTimeMillis()) + ".jpeg", true);
                } else if (K == null || !K.endsWith("/")) {
                    dVar.f241874g = C86013q1.m106448i(K + "/" + substring + ".jpeg", true);
                } else {
                    dVar.f241874g = C86013q1.m106448i(K + substring + ".jpeg", true);
                }
                Uri n2 = C116299g2.m163858n(dVar.f241874g);
                String path3 = n2.getPath();
                if (path3 != null) {
                    String k2 = C116299g2.m163855k(path3, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "file not exist for path:%s!", dVar.f241874g);
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "create new thumb path:%s!", dVar.f241874g);
                    Bitmap createVideoThumbnail = BitmapUtil.createVideoThumbnail(str, 1);
                    if (createVideoThumbnail == null) {
                        Log.m105921e("MicroMsg.JsApiChooseMedia", "createVideoThumbnail bitmap fail for path:%s!", dVar.f241874g);
                        return;
                    }
                    try {
                        BitmapUtil.saveBitmapToImage(createVideoThumbnail, 30, Bitmap.CompressFormat.JPEG, dVar.f241874g, true);
                    } catch (IOException e) {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "saveBitmapToImage exist IOException:" + e.getMessage());
                    }
                } else {
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "file is exist for path:%s!", dVar.f241874g);
                }
            } else {
                Log.m105925i("MicroMsg.JsApiChooseMedia", "file is exist!, path:%s", dVar.f241874g);
            }
        }

        /* renamed from: e */
        public static String m101445e(C82662d dVar) {
            if (!TextUtils.isEmpty(dVar.f241874g)) {
                AppBrandLocalMediaObject b = AppBrandLocalMediaObjectManager.m99829b(dVar.f241872e.f241848d, dVar.f241874g, (String) null, true);
                if (b != null && !Util.isNullOrNil(b.f238902d)) {
                    return b.f238902d;
                }
                Log.m105920e("MicroMsg.JsApiChooseMedia", "addThumbItem error, localId is null");
            }
            return "";
        }

        /* renamed from: f */
        public static String m101446f(String str, String str2, int i, int i2, int i3, long j) {
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
                return "";
            }
            Log.m105924i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.array();
                m101442b(jSONStringer, str, str2, i, i2, i3, j);
                jSONStringer.endArray();
                return jSONStringer.toString();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e, "", new Object[0]);
                return "";
            }
        }

        /* renamed from: g */
        public static String m101447g(ArrayList arrayList, ArrayList arrayList2, boolean z) {
            if (arrayList == null || arrayList.size() == 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "parseImageItemToJson localIds is null");
                return "";
            }
            Log.m105924i("MicroMsg.JsApiChooseMedia", "parseImageItemToJson()");
            JSONStringer jSONStringer = new JSONStringer();
            try {
                jSONStringer.array();
                if (arrayList.size() == 0) {
                    Log.m105920e("MicroMsg.JsApiChooseMedia", "_parseImageItemToJson localIds is null");
                } else {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "_parseImageItemToJson()");
                    for (int i = 0; i < arrayList.size(); i++) {
                        m101441a(jSONStringer, (String) arrayList.get(i), ((Long) arrayList2.get(i)).longValue());
                    }
                }
                jSONStringer.endArray();
                return jSONStringer.toString();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e, "", new Object[0]);
                return "";
            }
        }

        /* renamed from: h */
        public final SightParams mo114953h(int i) {
            String str = "microMsg." + System.currentTimeMillis() + ".jpg";
            this.f241873f = C86013q1.m106448i(C112760b.m154203K() + "microMsg." + str + ".mp4", false);
            int i2 = 1;
            this.f241874g = C86013q1.m106448i(C112760b.m154203K() + "microMsg." + str + ".jpeg", true);
            int i3 = this.f241872e.f241855n;
            SightParams sightParams = new SightParams(3, 1);
            if (!this.f241872e.f241854j) {
                i2 = 2;
            }
            sightParams.f248451e = i2;
            sightParams.f248450d = i;
            if (sightParams.f248452f == null) {
                sightParams.f248452f = new VideoTransPara();
            }
            sightParams.f248452f.f267170h = i3;
            sightParams.f248459p = false;
            sightParams.mo118479a(str, this.f241873f, this.f241874g, C112760b.m154203K());
            return sightParams;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01dc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleRequest(com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.ChooseRequest) r1
                r0.f241872e = r1
                r1 = 16
                r0.f241877j = r1
                com.tencent.mm.ui.MMActivity r2 = r17.getActivityContext()
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.getAvailableMemoryMB(r2)
                r4 = 0
                r5 = 1
                r6 = 200(0xc8, double:9.9E-322)
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x001e
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                java.lang.String r3 = "MicroMsg.JsApiChooseMedia"
                if (r2 != 0) goto L_0x003a
                java.lang.String r2 = "memory is not enough!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
                com.tencent.mm.ui.MMActivity r2 = r17.getActivityContext()
                r6 = 2131821035(0x7f1101eb, float:1.9274802E38)
                java.lang.String r6 = r0.getString(r6)
                android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r6, (int) r5)
                r2.show()
            L_0x003a:
                java.lang.Class<cw.g> r2 = p140cw.C7138g.class
                java.lang.String r6 = "goVideo"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
                com.tencent.mm.ui.MMActivity r6 = r17.getActivityContext()
                r6.mmSetOnActivityResultCallback(r0)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r6 = r0.f241872e
                boolean r7 = r6.f241849e
                r8 = 2
                if (r7 == 0) goto L_0x00d0
                java.lang.String r6 = "chooseMediaFromAlbum"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r3 = r0.f241872e
                boolean r6 = r3.f241858q
                boolean r7 = r3.f241853i
                if (r7 == 0) goto L_0x005d
                goto L_0x0070
            L_0x005d:
                boolean r7 = r3.f241851g
                if (r7 == 0) goto L_0x0066
                boolean r9 = r3.f241852h
                if (r9 == 0) goto L_0x0066
                goto L_0x0070
            L_0x0066:
                if (r7 == 0) goto L_0x006a
                r14 = 1
                goto L_0x0072
            L_0x006a:
                boolean r3 = r3.f241852h
                if (r3 == 0) goto L_0x0070
                r14 = 2
                goto L_0x0072
            L_0x0070:
                r8 = 3
                r14 = 3
            L_0x0072:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r7 = r0.f241872e
                boolean r7 = r7.f241853i
                if (r7 != 0) goto L_0x0082
                java.lang.String r7 = "key_can_select_video_and_pic"
                r3.putExtra(r7, r5)
            L_0x0082:
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r7 = r0.f241872e
                boolean r7 = r7.f241857p
                r7 = r7 ^ r5
                java.lang.String r8 = "key_send_raw_image"
                r3.putExtra(r8, r7)
                java.lang.String r7 = "key_force_show_raw_image_button"
                r3.putExtra(r7, r6)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r6 = r0.f241872e
                boolean r7 = r6.f241858q
                if (r7 == 0) goto L_0x009c
                boolean r6 = r6.f241857p
                if (r6 != 0) goto L_0x009c
                r4 = 1
            L_0x009c:
                java.lang.String r5 = "key_is_raw_image_button_disable"
                r3.putExtra(r5, r4)
                java.lang.String r4 = "gallery_report_tag"
                r3.putExtra(r4, r1)
                r1 = 86400(0x15180, float:1.21072E-40)
                java.lang.String r4 = "album_video_max_duration"
                r3.putExtra(r4, r1)
                java.lang.String r1 = "album_business_tag"
                java.lang.String r4 = "album_business_bubble_media_by_jsapi_choosevideo"
                r3.putExtra(r1, r4)
                di3.d r1 = di3.C86312j.m106911c(r2)
                r9 = r1
                cw.g r9 = (p140cw.C7138g) r9
                com.tencent.mm.ui.MMActivity r10 = r17.getActivityContext()
                r11 = 8
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r0.f241872e
                int r12 = r1.f241856o
                int r13 = r0.f241877j
                r15 = 0
                r16 = r3
                r9.mo8324nq(r10, r11, r12, r13, r14, r15, r16)
                goto L_0x025b
            L_0x00d0:
                boolean r1 = r6.f241850f
                if (r1 == 0) goto L_0x024b
                java.lang.String r1 = "chooseMediaFromCamera"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r0.f241872e
                boolean r6 = r1.f241852h
                if (r6 == 0) goto L_0x00e4
                boolean r7 = r1.f241851g
                if (r7 == 0) goto L_0x00e4
                goto L_0x00ee
            L_0x00e4:
                if (r6 == 0) goto L_0x00e8
                r14 = 1
                goto L_0x00ef
            L_0x00e8:
                boolean r1 = r1.f241851g
                if (r1 == 0) goto L_0x00ee
                r14 = 2
                goto L_0x00ef
            L_0x00ee:
                r14 = 0
            L_0x00ef:
                bp3.p r1 = bp3.C79758p.f233760a
                bp3.f r6 = bp3.C104160f.RepairerConfig_Media_AppbrandUseMMrecord_Int
                int r1 = r1.mo109882e(r6, r4)
                if (r1 != r5) goto L_0x00fb
                r1 = 1
                goto L_0x00fc
            L_0x00fb:
                r1 = 0
            L_0x00fc:
                java.lang.Class<h81.h> r6 = h81.C32735h.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                h81.h r6 = (h81.C32735h) r6
                h81.h$c r7 = h81.C32735h.C32737c.clicfg_appbrand_use_mmrecordui
                boolean r6 = r6.mo58784wf(r7, r5)
                java.lang.Object[] r7 = new java.lang.Object[r8]
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
                r7[r4] = r9
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                r7[r5] = r9
                java.lang.String r9 = "useMMRecordUI %b localConfigEnable:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r7)
                if (r6 != 0) goto L_0x0143
                if (r1 == 0) goto L_0x0123
                goto L_0x0143
            L_0x0123:
                android.content.Intent r12 = new android.content.Intent
                r12.<init>()
                com.tencent.mm.plugin.mmsight.SightParams r1 = r0.mo114953h(r14)
                java.lang.String r3 = "KEY_SIGHT_PARAMS"
                r12.putExtra(r3, r1)
                di3.d r1 = di3.C86312j.m106911c(r2)
                r9 = r1
                cw.g r9 = (p140cw.C7138g) r9
                com.tencent.mm.ui.MMActivity r10 = r17.getActivityContext()
                r11 = 7
                r13 = 3
                r9.mo8314Vt(r10, r11, r12, r13, r14)
                goto L_0x025b
            L_0x0143:
                com.tencent.mm.plugin.mmsight.SightParams r1 = r0.mo114953h(r14)
                java.lang.String r2 = r1.f248453g
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r1.f248456j
                r6.append(r7)
                java.lang.String r7 = r1.f248455i
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.mm.modelcontrol.VideoTransPara r7 = r1.f248452f
                int r9 = r7.f267170h
                int r9 = r9 * 1000
                r10 = 9
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119436f(r2, r6, r7, r9, r10)
                java.lang.String r6 = r1.f248456j
                if (r6 == 0) goto L_0x01a2
                java.lang.String r7 = "/"
                boolean r6 = r6.endsWith(r7)
                if (r6 != 0) goto L_0x018d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = r1.f248456j
                r6.append(r9)
                r6.append(r7)
                java.lang.String r1 = r1.f248455i
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                r2.f272904E = r1
                goto L_0x01a2
            L_0x018d:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r1.f248456j
                r6.append(r7)
                java.lang.String r1 = r1.f248455i
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                r2.f272904E = r1
            L_0x01a2:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r2.f272934v = r1
                r2.f272937y = r5
                if (r14 != 0) goto L_0x01b1
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r2.f272932t = r1
                r2.f272931s = r1
                goto L_0x01c2
            L_0x01b1:
                if (r14 != r5) goto L_0x01ba
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                r2.f272932t = r6
                r2.f272931s = r1
                goto L_0x01c2
            L_0x01ba:
                if (r14 != r8) goto L_0x01c2
                r2.f272932t = r1
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r2.f272931s = r1
            L_0x01c2:
                android.os.Bundle r1 = r2.f272912M
                java.lang.String r6 = "key_hide_operation"
                r1.putBoolean(r6, r5)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r0.f241872e
                boolean r1 = r1.f241854j
                java.lang.String r6 = "key_camera_select"
                if (r1 == 0) goto L_0x01dc
                java.lang.String r1 = "FRONT_CAMERA"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                android.os.Bundle r1 = r2.f272912M
                r1.putInt(r6, r5)
                goto L_0x01e6
            L_0x01dc:
                java.lang.String r1 = "BACK_CAMERA"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                android.os.Bundle r1 = r2.f272912M
                r1.putInt(r6, r8)
            L_0x01e6:
                android.os.Bundle r1 = r2.f272912M
                java.lang.String r3 = "key_record_bitrate_ratio"
                r1.putInt(r3, r5)
                com.tencent.mm.component.api.jumper.UICustomParam$b r1 = new com.tencent.mm.component.api.jumper.UICustomParam$b
                r1.<init>()
                r1.mo126647a(r5)
                r1.mo126652f(r5)
                r1.mo126650d(r5)
                r1.mo126654h(r5)
                r1.mo126651e(r5)
                com.tencent.mm.component.api.jumper.UICustomParam r3 = r1.f266587a
                java.util.Map<java.lang.String, java.lang.Boolean> r3 = r3.f266575h
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.lang.String r7 = "plugin_photo_crop"
                r3.put(r7, r6)
                com.tencent.mm.component.api.jumper.UICustomParam r3 = r1.f266587a
                java.util.Map<java.lang.String, java.lang.Boolean> r3 = r3.f266575h
                java.util.HashMap r3 = (java.util.HashMap) r3
                java.lang.String r7 = "plugin_doodle"
                r3.put(r7, r6)
                r1.mo126649c(r5)
                com.tencent.mm.component.api.jumper.UICustomParam r1 = r1.f266587a
                r2.f272927o = r1
                java.lang.String r1 = "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout"
                r2.mo129804a(r8, r1)
                java.lang.Class<cw.e> r1 = p140cw.C7136e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                cw.e r1 = (p140cw.C7136e) r1
                java.lang.String r1 = r1.nc0()
                r2.mo129804a(r4, r1)
                java.lang.Class<rw.l> r1 = p232rw.C77572l.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                rw.l r1 = (p232rw.C77572l) r1
                com.tencent.mm.ui.MMActivity r3 = r17.getActivityContext()
                com.tencent.mm.plugin.appbrand.jsapi.media.x0 r4 = new com.tencent.mm.plugin.appbrand.jsapi.media.x0
                r4.<init>(r0)
                r1.mo107612ZM(r3, r2, r4)
                goto L_0x025b
            L_0x024b:
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r1 = r0.f241871d
                r2 = -2
                r1.f241859d = r2
                java.lang.String r1 = "parameter is invalid, fail and finish process"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult r1 = r0.f241871d
                r0.finishProcess(r1)
            L_0x025b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.C82662d.handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest):void");
        }

        /* renamed from: i */
        public final void mo114954i(String str, String str2) {
            String i = C86013q1.m106448i(str, false);
            this.f241873f = i;
            if (Util.isNullOrNil(i)) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "mVideoFilePath is null");
                ChooseResult chooseResult = this.f241871d;
                chooseResult.f241859d = -2;
                finishProcess(chooseResult);
                return;
            }
            Log.m105925i("MicroMsg.JsApiChooseMedia", "mVideoFilePath:%s", this.f241873f);
            if (!mo114956k(this.f241874g) && mo114956k(str2)) {
                this.f241874g = C86013q1.m106448i(str2, true);
            }
            mo114957l(C0966R.string.f7637m9);
            C88024r.m109571a().postToWorker(new C82669e());
        }

        /* renamed from: j */
        public final void mo114955j(String str, Intent intent) {
            boolean z = false;
            String i = C86013q1.m106448i(str, false);
            if (Util.isNullOrNil(i)) {
                Log.m105921e("MicroMsg.JsApiChooseMedia", "picture_picturePath file is not exist! path:%s", i);
                ChooseResult chooseResult = this.f241871d;
                chooseResult.f241859d = -2;
                finishProcess(chooseResult);
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
            ChooseRequest chooseRequest = this.f241872e;
            boolean z2 = chooseRequest.f241857p;
            boolean z3 = chooseRequest.f241858q;
            boolean z4 = ((z3 ^ true) && z2) || ((z3 & z2) && booleanExtra);
            Log.m105919d("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", Boolean.TRUE, Boolean.valueOf(z2), Boolean.valueOf(this.f241872e.f241858q), Boolean.valueOf(booleanExtra), Boolean.valueOf(z4));
            if (z4) {
                mo114957l(C0966R.string.f7637m9);
            }
            if (!z4) {
                C87412m.m108594g(i, "imageFile");
                if (!Util.isNullOrNil(i) && Exif.fromFile(i).getOrientationInDegree() != 0) {
                    z = true;
                }
            }
            if (z) {
                mo114957l(C0966R.string.f7638m_);
            }
            C88024r.m109571a().postToWorker(new C82667d(i, z4, z));
        }

        /* renamed from: k */
        public final boolean mo114956k(String str) {
            if (!TextUtils.isEmpty(str)) {
                C86009m1 m1Var = new C86009m1(str);
                Log.m105925i("MicroMsg.JsApiChooseMedia", "thumbFilePath:%s", str);
                if (m1Var.mo119967g()) {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "video thumb file is exist");
                    return true;
                }
                Log.m105920e("MicroMsg.JsApiChooseMedia", "video thumb file is not exist");
                return false;
            }
            Log.m105920e("MicroMsg.JsApiChooseMedia", "video thumb file path is null");
            return false;
        }

        /* renamed from: l */
        public final void mo114957l(int i) {
            this.f241876i = new C82670f();
            this.f241875h = C76879j.m92723Q(getActivityContext(), getString(C0966R.string.a3h), getString(i), true, true, this.f241876i);
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            int i3 = i;
            int i4 = i2;
            Intent intent2 = intent;
            if (i3 != this.f241878n) {
                boolean z = false;
                if (i4 == 0) {
                    Log.m105920e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is canceled");
                    ChooseResult chooseResult = this.f241871d;
                    chooseResult.f241859d = 0;
                    finishProcess(chooseResult);
                } else if (-1 != i4) {
                    Log.m105920e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is not RESULT_OK");
                    ChooseResult chooseResult2 = this.f241871d;
                    chooseResult2.f241859d = -2;
                    finishProcess(chooseResult2);
                } else if (i3 == 7) {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
                    if (intent2 != null) {
                        Log.m105924i("MicroMsg.JsApiChooseMedia", "data is valid!");
                        SightCaptureResult sightCaptureResult = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
                        if (sightCaptureResult == null) {
                            Log.m105920e("MicroMsg.JsApiChooseMedia", "sight capture result is null!");
                            ChooseResult chooseResult3 = this.f241871d;
                            chooseResult3.f241859d = -2;
                            finishProcess(chooseResult3);
                        } else if (sightCaptureResult.f201515e) {
                            mo114955j(sightCaptureResult.f201523p, intent2);
                        } else {
                            mo114954i(sightCaptureResult.f201517g, sightCaptureResult.f201518h);
                        }
                    } else {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "data is null!");
                        ChooseResult chooseResult4 = this.f241871d;
                        chooseResult4.f241859d = -2;
                        finishProcess(chooseResult4);
                    }
                } else if (i3 == 8) {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
                    if (this.f241872e.f241853i) {
                        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                        ArrayList<String> stringArrayListExtra3 = intent2.getStringArrayListExtra("key_select_mix_media_list");
                        boolean z2 = stringArrayListExtra != null && stringArrayListExtra.size() > 0;
                        boolean z3 = stringArrayListExtra2 != null && stringArrayListExtra2.size() > 0;
                        if (stringArrayListExtra3 == null || stringArrayListExtra3.size() == 0) {
                            stringArrayListExtra3 = new ArrayList<>();
                            if (z2) {
                                stringArrayListExtra3.addAll(stringArrayListExtra);
                            }
                            if (z3) {
                                stringArrayListExtra3.addAll(stringArrayListExtra2);
                            }
                        }
                        ArrayList<String> arrayList = stringArrayListExtra3;
                        for (String str : arrayList) {
                            Log.m105925i("MicroMsg.JsApiChooseMedia", "mediaPath:%s", str);
                        }
                        if (z2 || z3) {
                            boolean booleanExtra = intent2.getBooleanExtra("CropImage_Compress_Img", false);
                            ChooseRequest chooseRequest = this.f241872e;
                            boolean z4 = chooseRequest.f241857p;
                            boolean z5 = chooseRequest.f241858q;
                            boolean z6 = ((z5 ^ true) && z4) || ((z5 & z4) && booleanExtra);
                            Log.m105925i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromAlbum, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", Boolean.valueOf(z4), Boolean.valueOf(this.f241872e.f241858q), Boolean.valueOf(booleanExtra), Boolean.valueOf(z6));
                            if (z6 ? true : z2) {
                                mo114957l(C0966R.string.f7637m9);
                            }
                            boolean z7 = !z6 && stringArrayListExtra2 != null && C1732c2.m1784d(stringArrayListExtra2);
                            if (z7) {
                                mo114957l(C0966R.string.f7638m_);
                            }
                            Set<Object> set = C84737f0.f247137a;
                            C88024r.m109571a().postToWorker(new C82663a(z2, z3, arrayList, stringArrayListExtra, z6, stringArrayListExtra2, z7));
                            return;
                        }
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "none select any image or video");
                        ChooseResult chooseResult5 = this.f241871d;
                        chooseResult5.f241859d = -2;
                        finishProcess(chooseResult5);
                        return;
                    }
                    ArrayList<String> stringArrayListExtra4 = intent2.getStringArrayListExtra("key_select_video_list");
                    boolean booleanExtra2 = intent2.getBooleanExtra("CropImage_Compress_Img", false);
                    ChooseRequest chooseRequest2 = this.f241872e;
                    boolean z8 = chooseRequest2.f241857p;
                    boolean z9 = chooseRequest2.f241858q;
                    boolean z15 = ((z9 ^ true) && z8) || ((z9 & z8) && booleanExtra2);
                    Log.m105925i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromAlbum, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", Boolean.valueOf(z8), Boolean.valueOf(this.f241872e.f241858q), Boolean.valueOf(booleanExtra2), Boolean.valueOf(z15));
                    if (stringArrayListExtra4 == null || stringArrayListExtra4.size() <= 0) {
                        ArrayList<String> stringArrayListExtra5 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                        if (stringArrayListExtra5 == null || stringArrayListExtra5.size() == 0) {
                            Log.m105920e("MicroMsg.JsApiChooseMedia", "chosen is null,  fail");
                            ChooseResult chooseResult6 = this.f241871d;
                            chooseResult6.f241859d = -2;
                            finishProcess(chooseResult6);
                            return;
                        }
                        Log.m105925i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", Boolean.FALSE, Boolean.valueOf(this.f241872e.f241857p), Boolean.valueOf(this.f241872e.f241858q), Boolean.valueOf(booleanExtra2), Boolean.valueOf(z15));
                        if (z15) {
                            mo114957l(C0966R.string.f7637m9);
                        }
                        if (!z15 && C1732c2.m1784d(stringArrayListExtra5)) {
                            z = true;
                        }
                        if (z) {
                            mo114957l(C0966R.string.f7638m_);
                        }
                        C88024r.m109571a().postToWorker(new C82665c(stringArrayListExtra5, z15, z));
                        return;
                    }
                    mo114957l(C0966R.string.f7637m9);
                    Set<Object> set2 = C84737f0.f247137a;
                    C88024r.m109571a().postToWorker(new C82664b(stringArrayListExtra4, z15));
                } else if (i3 != 9) {
                    ChooseResult chooseResult7 = this.f241871d;
                    chooseResult7.f241859d = -2;
                    finishProcess(chooseResult7);
                } else {
                    Log.m105924i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_MMRECORDUI");
                    if (intent2 != null) {
                        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent2.getParcelableExtra("KSEGMENTMEDIAINFO");
                        if (captureVideoNormalModel == null) {
                            ChooseResult chooseResult8 = this.f241871d;
                            chooseResult8.f241859d = 0;
                            finishProcess(chooseResult8);
                        } else if (captureVideoNormalModel.f272897h.booleanValue()) {
                            mo114955j(captureVideoNormalModel.f272895f, intent2);
                        } else {
                            mo114954i(captureVideoNormalModel.f272894e, captureVideoNormalModel.f272895f);
                        }
                    } else {
                        Log.m105920e("MicroMsg.JsApiChooseMedia", "data is null!");
                        ChooseResult chooseResult9 = this.f241871d;
                        chooseResult9.f241859d = -2;
                        finishProcess(chooseResult9);
                    }
                }
            }
        }

        public void onProcessInterrupted() {
            super.onProcessInterrupted();
            C89779i0 i0Var = this.f241875h;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f241875h = null;
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        String str2;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        if (f241846h) {
            Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia sChoosingMedia is true, do not again");
            fVar2.mo109647a(i2, mo115109j("cancel"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiChooseMedia", "chooseMedia %s", jSONObject2);
        Context context = fVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
            fVar2.mo109647a(i2, mo115109j("fail:page context is null"));
        } else if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  data is null");
            fVar2.mo109647a(i2, mo115109j("fail:data is null"));
        } else {
            Log.m105924i("MicroMsg.JsApiChooseMedia", "chooseMedia data:" + jSONObject.toString());
            String str3 = "";
            if (jSONObject2.optJSONArray("sourceType") == null || jSONObject2.optJSONArray("sourceType").length() <= 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "sourceType is invalid param");
                str = str3;
            } else {
                str = jSONObject2.optJSONArray("sourceType").toString();
            }
            if (Util.isNullOrNil(str)) {
                str = "camera|album";
            }
            if (jSONObject2.optJSONArray("mediaType") == null || jSONObject2.optJSONArray("mediaType").length() <= 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "mediaType is invalid param");
                str2 = str3;
            } else {
                str2 = jSONObject2.optJSONArray("mediaType").toString();
            }
            if (Util.isNullOrNil(str2)) {
                str2 = "video|image";
            }
            int min = Math.min(jSONObject2.optInt("maxDuration", 10), 60);
            if (min < 3 || min > 60) {
                fVar2.mo109647a(i2, mo115109j("fail:error maxDuration"));
                return;
            }
            String optString = jSONObject2.optString("camera");
            if (Util.isNullOrNil(optString)) {
                optString = "back";
            }
            int min2 = Math.min(jSONObject2.optInt("count", 20), 20);
            if (jSONObject2.optJSONArray("sizeType") == null || jSONObject2.optJSONArray("sizeType").length() <= 0) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "sizeType is invalid param");
            } else {
                str3 = jSONObject2.optJSONArray("sizeType").toString();
            }
            if (Util.isNullOrNil(str3)) {
                str3 = "original|compressed";
            }
            Log.m105925i("MicroMsg.JsApiChooseMedia", "chooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", str, str2, Integer.valueOf(min), optString, Integer.valueOf(min2), str3);
            ChooseRequest chooseRequest = new ChooseRequest();
            chooseRequest.f241848d = fVar.getAppId();
            chooseRequest.f241849e = str.contains(FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
            chooseRequest.f241850f = str.contains("camera");
            chooseRequest.f241851g = str2.contains("image");
            chooseRequest.f241852h = str2.contains("video");
            chooseRequest.f241853i = str2.contains("mix");
            if (optString.contains("back")) {
                chooseRequest.f241854j = false;
            } else if (optString.contains("front")) {
                chooseRequest.f241854j = true;
            } else {
                chooseRequest.f241854j = false;
            }
            chooseRequest.f241855n = min;
            chooseRequest.f241856o = min2;
            chooseRequest.f241857p = str3.contains("compressed");
            chooseRequest.f241858q = str3.contains("original");
            if (!this.f241847g) {
                C91085v.m114266a(fVar.getAppId(), new C82774w0(this, fVar, jSONObject, i, chooseRequest));
                this.f241847g = true;
            }
            if (!chooseRequest.f241849e || !chooseRequest.f241850f) {
                mo114945w(fVar2, jSONObject2, i2, chooseRequest);
            } else {
                C88024r.m109572b(new C82659a(fVar, jSONObject, i, chooseRequest));
            }
        }
    }

    /* renamed from: w */
    public final void mo114945w(C82381f fVar, JSONObject jSONObject, int i, ChooseRequest chooseRequest) {
        boolean z;
        boolean z2;
        boolean z3;
        C82381f fVar2 = fVar;
        int i2 = i;
        ChooseRequest chooseRequest2 = chooseRequest;
        Log.m105920e("MicroMsg.JsApiChooseMedia", "invokeInternalImpl");
        Context context = fVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
            fVar2.mo109647a(i2, mo115109j("fail:page context is null"));
            return;
        }
        if (chooseRequest2.f241849e && Build.VERSION.SDK_INT < 29) {
            Context context2 = fVar.getContext();
            if (context2 == null || !(context2 instanceof Activity)) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestExternalStoragePermission pageContext is null");
                fVar2.mo109647a(i2, mo115109j("fail"));
                z3 = false;
            } else {
                z3 = C89922k.m112464a((Activity) context2, fVar, "android.permission.WRITE_EXTERNAL_STORAGE", 145, "", "");
            }
            if (!z3) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia requestExternalStoragePermission is fail");
                return;
            }
        }
        if (chooseRequest2.f241850f && chooseRequest2.f241852h) {
            Context context3 = fVar.getContext();
            if (context3 == null || !(context3 instanceof Activity)) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestAudioPermission pageContext is null");
                fVar2.mo109647a(i2, mo115109j("fail"));
                z2 = false;
            } else {
                z2 = C89922k.m112464a((Activity) context3, fVar, "android.permission.RECORD_AUDIO", 120, "", "");
            }
            if (!z2) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia requestAudioPermission is fail");
                return;
            }
        }
        if (chooseRequest2.f241850f && (chooseRequest2.f241851g || chooseRequest2.f241852h)) {
            Context context4 = fVar.getContext();
            if (context4 == null || !(context4 instanceof Activity)) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestCameraPermission pageContext is null");
                fVar2.mo109647a(i2, mo115109j("fail"));
                z = false;
            } else {
                z = C89922k.m112464a((Activity) context4, fVar, "android.permission.CAMERA", 119, "", "");
            }
            if (!z) {
                Log.m105920e("MicroMsg.JsApiChooseMedia", "chooseMedia requestCameraPermission is fail");
                return;
            }
        }
        C91085v.m114268c(fVar.getAppId());
        this.f241847g = false;
        Log.m105924i("MicroMsg.JsApiChooseMedia", "do chooseMedia");
        f241846h = true;
        C83231l.m102140a(fVar.getAppId(), new C82660b(this, fVar2));
        C81956c.m100675c(context, chooseRequest2, new C82661c(fVar2, i2), (Intent) null);
    }
}
