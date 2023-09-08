package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cc0.C79995a;
import com.tencent.map.geolocation.sapp.TencentLocationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import f40.C86709a0;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import ms0.C88840a;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import p1016ob.C89131a;
import p140cw.C7138g;
import p224ra.C89909e;
import p914oj.C89231c;
import qo3.C89779i0;
import r80.C89903h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia */
public final class JsApiChooseMultiMedia extends C82268c {
    public static final int CTRL_INDEX = 549;
    public static final String NAME = "chooseMultiMedia";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest */
    public static final class ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<ChooseRequest> CREATOR = new C82671a();

        /* renamed from: d */
        public String f241906d;

        /* renamed from: e */
        public int f241907e;

        /* renamed from: f */
        public double f241908f;

        /* renamed from: g */
        public double f241909g;

        /* renamed from: h */
        public String f241910h;

        /* renamed from: i */
        public double f241911i;

        /* renamed from: j */
        public boolean f241912j;

        /* renamed from: n */
        public boolean f241913n;

        /* renamed from: o */
        public int f241914o;

        /* renamed from: p */
        public boolean f241915p;

        /* renamed from: q */
        public boolean f241916q;

        /* renamed from: r */
        public int f241917r;

        /* renamed from: s */
        public boolean f241918s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest$a */
        public class C82671a implements Parcelable.Creator<ChooseRequest> {
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
            return C82676d.class;
        }

        public String getUIAlias() {
            return "GalleryChooseMultiMedia";
        }

        public boolean oneShotForeground() {
            return true;
        }

        public void readParcel(Parcel parcel) {
            this.f241906d = parcel.readString();
            this.f241907e = parcel.readInt();
            this.f241908f = parcel.readDouble();
            this.f241909g = parcel.readDouble();
            this.f241910h = parcel.readString();
            this.f241911i = parcel.readDouble();
            boolean z = true;
            this.f241912j = parcel.readByte() != 0;
            this.f241913n = parcel.readByte() != 0;
            this.f241914o = parcel.readInt();
            this.f241915p = parcel.readByte() != 0;
            this.f241916q = parcel.readByte() != 0;
            this.f241917r = parcel.readInt();
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f241918s = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f241906d);
            parcel.writeInt(this.f241907e);
            parcel.writeDouble(this.f241908f);
            parcel.writeDouble(this.f241909g);
            parcel.writeString(this.f241910h);
            parcel.writeDouble(this.f241911i);
            parcel.writeByte(this.f241912j ? (byte) 1 : 0);
            parcel.writeByte(this.f241913n ? (byte) 1 : 0);
            parcel.writeInt(this.f241914o);
            parcel.writeByte(this.f241915p ? (byte) 1 : 0);
            parcel.writeByte(this.f241916q ? (byte) 1 : 0);
            parcel.writeInt(this.f241917r);
            parcel.writeByte(this.f241918s ? (byte) 1 : 0);
        }

        public ChooseRequest(Parcel parcel) {
            readParcel(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult */
    public static final class ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<ChooseResult> CREATOR = new C82672a();

        /* renamed from: d */
        public int f241919d;

        /* renamed from: e */
        public String f241920e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult$a */
        public class C82672a implements Parcelable.Creator<ChooseResult> {
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
            this.f241919d = parcel.readInt();
            this.f241920e = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f241919d);
            parcel.writeString(this.f241920e);
        }

        public ChooseResult(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$a */
    public class C82673a implements C88840a.C88842b {

        /* renamed from: d */
        public final /* synthetic */ Context f241921d;

        public C82673a(JsApiChooseMultiMedia jsApiChooseMultiMedia, Context context) {
            this.f241921d = context;
        }

        /* renamed from: f */
        public void mo114898f(int i, String str, C88840a.C88841a aVar) {
            if (i == 0) {
                int i2 = (int) (aVar.f256263a * 1000000.0d);
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append(",");
                sb.append((int) (aVar.f256264b * 1000000.0d));
                Context context = this.f241921d;
                context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_locCache", 0).edit().putString("locStr", sb.toString()).apply();
                Log.m105919d("MicroMsg.JsApiChooseMultiMedia", "onLocationChange latitude %f, longitude: %f, locStr: %s.", Double.valueOf(aVar.f256263a), Double.valueOf(aVar.f256264b), sb);
                ((C88840a) C89909e.m112436a(C88840a.class)).mo123225a6("wgs84", this, (Bundle) null);
                return;
            }
            Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "onLocationChange error, errCode: %d.", Integer.valueOf(i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$b */
    public class C82674b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241922d;

        public C82674b(JsApiChooseMultiMedia jsApiChooseMultiMedia, C82381f fVar) {
            this.f241922d = fVar;
        }

        /* renamed from: f */
        public void mo109498f() {
            C84072q1.m103586a(this.f241922d.getAppId()).f245464h = false;
            C83231l.m102144e(this.f241922d.getAppId(), this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$c */
    public class C82675c implements AppBrandProxyUIProcessTask.C81943b<ChooseResult> {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241923a;

        /* renamed from: b */
        public final /* synthetic */ int f241924b;

        public C82675c(C82381f fVar, int i) {
            this.f241923a = fVar;
            this.f241924b = i;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            ChooseResult chooseResult = (ChooseResult) processResult;
            if (chooseResult == null) {
                this.f241923a.mo109647a(this.f241924b, JsApiChooseMultiMedia.this.mo115109j("fail"));
                return;
            }
            int i = chooseResult.f241919d;
            if (i == -1) {
                HashMap hashMap = new HashMap();
                try {
                    hashMap.put("tempFiles", new JSONArray(chooseResult.f241920e));
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "err tempFiles json object create");
                }
                this.f241923a.mo109647a(this.f241924b, JsApiChooseMultiMedia.this.mo115112m("ok", hashMap));
            } else if (i != 0) {
                this.f241923a.mo109647a(this.f241924b, JsApiChooseMultiMedia.this.mo115109j("fail"));
            } else {
                this.f241923a.mo109647a(this.f241924b, JsApiChooseMultiMedia.this.mo115109j("cancel"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d */
    public static final class C82676d extends AppBrandProxyUIProcessTask {

        /* renamed from: d */
        public ChooseRequest f241926d;

        /* renamed from: e */
        public ChooseResult f241927e = new ChooseResult();

        /* renamed from: f */
        public int f241928f = 7;

        /* renamed from: g */
        public C89779i0 f241929g;

        /* renamed from: h */
        public DialogInterface.OnCancelListener f241930h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$a */
        public class C82677a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List f241931d;

            /* renamed from: e */
            public final /* synthetic */ double f241932e;

            /* renamed from: f */
            public final /* synthetic */ double f241933f;

            /* renamed from: g */
            public final /* synthetic */ boolean f241934g;

            /* renamed from: h */
            public final /* synthetic */ boolean f241935h;

            /* renamed from: i */
            public final /* synthetic */ List f241936i;

            public C82677a(List list, double d, double d2, boolean z, boolean z2, List list2) {
                this.f241931d = list;
                this.f241932e = d;
                this.f241933f = d2;
                this.f241934g = z;
                this.f241935h = z2;
                this.f241936i = list2;
            }

            /* JADX WARNING: type inference failed for: r2v17 */
            /* JADX WARNING: type inference failed for: r2v45 */
            /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v9, types: [boolean, int] */
            /* JADX WARNING: Removed duplicated region for block: B:120:0x028a  */
            /* JADX WARNING: Removed duplicated region for block: B:176:0x03bc  */
            /* JADX WARNING: Removed duplicated region for block: B:180:0x03fc  */
            /* JADX WARNING: Removed duplicated region for block: B:186:0x0435  */
            /* JADX WARNING: Removed duplicated region for block: B:232:0x0421 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x0130  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0153  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x015c  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x01e4  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x01f9 A[SYNTHETIC, Splitter:B:80:0x01f9] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r39 = this;
                    r1 = r39
                    org.json.JSONArray r2 = new org.json.JSONArray
                    r2.<init>()
                    java.util.List r0 = r1.f241931d
                    java.lang.String r3 = "album"
                    java.lang.String r4 = "scene"
                    java.lang.String r5 = "mark"
                    java.lang.String r6 = "height"
                    java.lang.String r7 = "width"
                    java.lang.String r8 = "size"
                    java.lang.String r9 = "tempFilePath"
                    java.lang.String r11 = "type"
                    r16 = 0
                    java.lang.String r14 = ""
                    java.lang.String r10 = "MicroMsg.JsApiChooseMultiMedia"
                    r12 = 0
                    if (r0 == 0) goto L_0x02bd
                    int r0 = r0.size()
                    if (r0 <= 0) goto L_0x02bd
                    java.util.List r0 = r1.f241931d
                    java.util.Iterator r13 = r0.iterator()
                L_0x0033:
                    boolean r0 = r13.hasNext()
                    if (r0 == 0) goto L_0x02bd
                    java.lang.Object r0 = r13.next()
                    r15 = r0
                    java.lang.String r15 = (java.lang.String) r15
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                    if (r0 != 0) goto L_0x02a6
                    android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r15)
                    r21 = r13
                    java.lang.String r13 = r0.getPath()
                    if (r13 == 0) goto L_0x006c
                    java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r12, r12)
                    java.lang.String r12 = r0.getPath()
                    boolean r12 = r12.equals(r13)
                    if (r12 != 0) goto L_0x006c
                    android.net.Uri$Builder r0 = r0.buildUpon()
                    android.net.Uri$Builder r0 = r0.path(r13)
                    android.net.Uri r0 = r0.build()
                L_0x006c:
                    com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                    r13 = 0
                    com.tencent.mm.vfs.f0$h r0 = r12.mo177799l(r0, r13)
                    boolean r12 = r0.mo177810a()
                    if (r12 != 0) goto L_0x007b
                    r0 = 0
                    goto L_0x0083
                L_0x007b:
                    com.tencent.mm.vfs.FileSystem$c r12 = r0.f348991a
                    java.lang.String r0 = r0.f348992b
                    boolean r0 = r12.mo119948x(r0)
                L_0x0083:
                    if (r0 == 0) goto L_0x02a8
                    java.lang.String r0 = "local img file exist, success"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifTime(r15)     // Catch:{ Exception -> 0x00c9 }
                    if (r0 == 0) goto L_0x00c2
                    java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00c9 }
                    java.lang.String r13 = "yyyy:MM:dd HH:mm:ss"
                    r12.<init>(r13)     // Catch:{ Exception -> 0x00c9 }
                    java.util.Date r0 = r12.parse(r0)     // Catch:{ Exception -> 0x00c9 }
                    long r12 = r0.getTime()     // Catch:{ Exception -> 0x00c9 }
                    r19 = 1000(0x3e8, double:4.94E-321)
                    long r12 = r12 / r19
                    java.lang.String r0 = "parse result time: %d, imgPath: %s."
                    r24 = r2
                    r23 = r14
                    r14 = 2
                    java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x00cf }
                    java.lang.Long r14 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x00cf }
                    r22 = 0
                    r2[r22] = r14     // Catch:{ Exception -> 0x00cf }
                    r14 = 1
                    r2[r14] = r15     // Catch:{ Exception -> 0x00cf }
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r0, r2)     // Catch:{ Exception -> 0x00cf }
                    goto L_0x00db
                L_0x00bd:
                    r24 = r2
                    r23 = r14
                    goto L_0x00cf
                L_0x00c2:
                    r24 = r2
                    r23 = r14
                    r12 = r16
                    goto L_0x00db
                L_0x00c9:
                    r24 = r2
                    r23 = r14
                    r12 = r16
                L_0x00cf:
                    r2 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r2 = 0
                    r0[r2] = r15
                    java.lang.String r2 = "parse from Date String error, imgPath: %s."
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r0)
                L_0x00db:
                    r14 = r3
                    double r2 = r1.f241932e
                    boolean r0 = cc0.C79995a.m97218a(r2)
                    if (r0 == 0) goto L_0x0130
                    double r2 = r1.f241933f
                    boolean r0 = cc0.C79995a.m97219b(r2)
                    if (r0 == 0) goto L_0x0130
                    com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r0 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifLatLong(r15)
                    if (r0 == 0) goto L_0x0118
                    float r2 = r0.latitude
                    double r2 = (double) r2
                    float r0 = r0.longtitude
                    r33 = r4
                    r34 = r5
                    double r4 = (double) r0
                    r35 = r6
                    r36 = r7
                    double r6 = r1.f241932e
                    r37 = r8
                    r38 = r9
                    double r8 = r1.f241933f
                    r25 = r2
                    r27 = r4
                    r29 = r6
                    r31 = r8
                    double r2 = com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(r25, r27, r29, r31)
                    r4 = r2
                    r2 = 1
                    r3 = 0
                    goto L_0x0149
                L_0x0118:
                    r33 = r4
                    r34 = r5
                    r35 = r6
                    r36 = r7
                    r37 = r8
                    r38 = r9
                    r2 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r3 = 0
                    r0[r3] = r15
                    java.lang.String r4 = "calculate X fail, locData is null. imgPath: %s."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r4, r0)
                    goto L_0x0147
                L_0x0130:
                    r33 = r4
                    r34 = r5
                    r35 = r6
                    r36 = r7
                    r37 = r8
                    r38 = r9
                    r2 = 1
                    r3 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    r0[r3] = r15
                    java.lang.String r2 = "calculate X fail, lat/long is invalid. imgPath: %s."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r2, r0)
                L_0x0147:
                    r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                L_0x0149:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101457a(r0, r12, r4)
                    boolean r0 = r1.f241934g
                    if (r0 == 0) goto L_0x015c
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    java.lang.String r15 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101458b(r0, r15)
                L_0x0159:
                    r0 = 1
                    goto L_0x01e8
                L_0x015c:
                    boolean r0 = r1.f241935h
                    if (r0 == 0) goto L_0x01e7
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    r0.getClass()
                    com.tencent.mm.compatible.util.Exif r0 = com.tencent.p014mm.compatible.util.Exif.fromFile(r15)
                    int r0 = r0.getOrientationInDegree()
                    if (r0 == 0) goto L_0x01dd
                    int r0 = r0 % 360
                    android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    r3.<init>()     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    android.graphics.Bitmap r4 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r15, r3)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    if (r4 != 0) goto L_0x0183
                    java.lang.String r0 = "rotate image, get null bmp"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    goto L_0x01dd
                L_0x0183:
                    float r0 = (float) r0     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r4, r0)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    r4.<init>()     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    java.lang.String r5 = a70.C112760b.m154240l()     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    r4.append(r5)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    java.lang.String r5 = "microMsg.tmp."
                    r4.append(r5)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    long r5 = java.lang.System.currentTimeMillis()     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    r4.append(r5)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    boolean r5 = p1016ob.C89131a.m111396d(r3)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    if (r5 == 0) goto L_0x01a9
                    java.lang.String r5 = ".jpg"
                    goto L_0x01ab
                L_0x01a9:
                    java.lang.String r5 = ".png"
                L_0x01ab:
                    r4.append(r5)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    java.lang.String r4 = r4.toString()     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    boolean r5 = p1016ob.C89131a.m111396d(r3)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    if (r5 == 0) goto L_0x01bb
                    android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    goto L_0x01bd
                L_0x01bb:
                    android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                L_0x01bd:
                    r6 = 80
                    r7 = 1
                    com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r6, r5, r4, r7)     // Catch:{ Exception -> 0x01cd }
                    boolean r0 = p1016ob.C89131a.m111396d(r3)     // Catch:{ Exception -> 0x01cd }
                    if (r0 == 0) goto L_0x01de
                    ck0.C92423c.m116249b(r15, r4)     // Catch:{ Exception -> 0x01cd }
                    goto L_0x01de
                L_0x01cd:
                    r0 = move-exception
                    java.lang.String r3 = "rotate image, exception occurred when saving | %s"
                    r5 = 1
                    java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    r5 = 0
                    r6[r5] = r0     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r3, r6)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                    com.tencent.p014mm.vfs.C86013q1.m106447h(r4)     // Catch:{ NullPointerException | OutOfMemoryError -> 0x01dd }
                L_0x01dd:
                    r4 = r15
                L_0x01de:
                    boolean r0 = r4.equals(r15)
                    if (r0 != 0) goto L_0x01e7
                    r15 = r4
                    goto L_0x0159
                L_0x01e7:
                    r0 = 0
                L_0x01e8:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$e r3 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.m101453w(r15)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest r4 = r4.f241926d
                    java.lang.String r4 = r4.f241906d
                    r5 = 0
                    com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r0 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.m99829b(r4, r15, r5, r0)
                    if (r0 == 0) goto L_0x028a
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0272 }
                    r4.<init>()     // Catch:{ Exception -> 0x0272 }
                    java.lang.String r5 = "image"
                    r4.put(r11, r5)     // Catch:{ Exception -> 0x0272 }
                    java.lang.String r5 = r0.f238902d     // Catch:{ Exception -> 0x0272 }
                    r6 = r38
                    r4.put(r6, r5)     // Catch:{ Exception -> 0x0264 }
                    long r7 = r0.f238907i     // Catch:{ Exception -> 0x0264 }
                    r5 = r37
                    r4.put(r5, r7)     // Catch:{ Exception -> 0x0258 }
                    int r0 = r3.f241949a     // Catch:{ Exception -> 0x0258 }
                    r7 = r36
                    r4.put(r7, r0)     // Catch:{ Exception -> 0x024e }
                    int r0 = r3.f241950b     // Catch:{ Exception -> 0x024e }
                    r8 = r35
                    r4.put(r8, r0)     // Catch:{ Exception -> 0x0246 }
                    java.lang.String r0 = "orientation"
                    java.lang.String r3 = r3.f241951c     // Catch:{ Exception -> 0x0246 }
                    r4.put(r0, r3)     // Catch:{ Exception -> 0x0246 }
                    r3 = r34
                    r4.put(r3, r2)     // Catch:{ Exception -> 0x0240 }
                    r2 = r33
                    r4.put(r2, r14)     // Catch:{ Exception -> 0x023c }
                    r9 = r24
                    r9.put(r4)     // Catch:{ Exception -> 0x023a }
                    r13 = r23
                    goto L_0x02b0
                L_0x023a:
                    r0 = move-exception
                    goto L_0x0281
                L_0x023c:
                    r0 = move-exception
                    r9 = r24
                    goto L_0x0281
                L_0x0240:
                    r0 = move-exception
                    r9 = r24
                    r2 = r33
                    goto L_0x0281
                L_0x0246:
                    r0 = move-exception
                    r9 = r24
                    r2 = r33
                    r3 = r34
                    goto L_0x0281
                L_0x024e:
                    r0 = move-exception
                    r9 = r24
                    r2 = r33
                    r3 = r34
                    r8 = r35
                    goto L_0x0281
                L_0x0258:
                    r0 = move-exception
                    r9 = r24
                    r2 = r33
                    r3 = r34
                    r8 = r35
                    r7 = r36
                    goto L_0x0281
                L_0x0264:
                    r0 = move-exception
                    r9 = r24
                    r2 = r33
                    r3 = r34
                    r8 = r35
                    r7 = r36
                    r5 = r37
                    goto L_0x0281
                L_0x0272:
                    r0 = move-exception
                    r9 = r24
                    r2 = r33
                    r3 = r34
                    r8 = r35
                    r7 = r36
                    r5 = r37
                    r6 = r38
                L_0x0281:
                    r4 = 0
                    java.lang.Object[] r12 = new java.lang.Object[r4]
                    r13 = r23
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r13, r12)
                    goto L_0x02b0
                L_0x028a:
                    r13 = r23
                    r9 = r24
                    r2 = r33
                    r3 = r34
                    r8 = r35
                    r7 = r36
                    r5 = r37
                    r6 = r38
                    r4 = 0
                    r12 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r12]
                    r0[r4] = r15
                    java.lang.String r4 = "handle chosen list from gallery, get null obj from path: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r4, r0)
                    goto L_0x02b0
                L_0x02a6:
                    r21 = r13
                L_0x02a8:
                    r13 = r14
                    r14 = r3
                    r3 = r5
                    r5 = r8
                    r8 = r6
                    r6 = r9
                    r9 = r2
                    r2 = r4
                L_0x02b0:
                    r4 = r2
                    r2 = r9
                    r12 = 0
                    r9 = r6
                    r6 = r8
                    r8 = r5
                    r5 = r3
                    r3 = r14
                    r14 = r13
                    r13 = r21
                    goto L_0x0033
                L_0x02bd:
                    r13 = r14
                    r14 = r3
                    r3 = r5
                    r5 = r8
                    r8 = r6
                    r6 = r9
                    r9 = r2
                    r2 = r4
                    java.util.List r0 = r1.f241936i
                    if (r0 == 0) goto L_0x04df
                    int r0 = r0.size()
                    if (r0 <= 0) goto L_0x04df
                    java.util.List r0 = r1.f241936i
                    java.util.Iterator r4 = r0.iterator()
                L_0x02d5:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L_0x04df
                    java.lang.Object r0 = r4.next()
                    java.lang.String r0 = (java.lang.String) r0
                    boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r12 != 0) goto L_0x04c5
                    android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
                    java.lang.String r15 = r12.getPath()
                    r21 = r4
                    if (r15 == 0) goto L_0x030e
                    r4 = 0
                    java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r4, r4)
                    java.lang.String r4 = r12.getPath()
                    boolean r4 = r4.equals(r15)
                    if (r4 != 0) goto L_0x030e
                    android.net.Uri$Builder r4 = r12.buildUpon()
                    android.net.Uri$Builder r4 = r4.path(r15)
                    android.net.Uri r12 = r4.build()
                L_0x030e:
                    com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                    r15 = 0
                    com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r12, r15)
                    boolean r12 = r4.mo177810a()
                    if (r12 != 0) goto L_0x031d
                    r4 = 0
                    goto L_0x0325
                L_0x031d:
                    com.tencent.mm.vfs.FileSystem$c r12 = r4.f348991a
                    java.lang.String r4 = r4.f348992b
                    boolean r4 = r12.mo119948x(r4)
                L_0x0325:
                    if (r4 == 0) goto L_0x04c7
                    java.lang.String r4 = "local video file exist, success"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
                    java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.getVideoTakeTime(r0)     // Catch:{ Exception -> 0x0396 }
                    if (r4 == 0) goto L_0x038c
                    java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0396 }
                    java.lang.String r15 = "yyyyMMdd'T'hhmmss.SSS'Z'"
                    r12.<init>(r15)     // Catch:{ Exception -> 0x0396 }
                    java.util.Date r4 = r12.parse(r4)     // Catch:{ Exception -> 0x0396 }
                    r23 = r13
                    long r12 = r4.getTime()     // Catch:{ Exception -> 0x0389 }
                    java.util.TimeZone r4 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x0389 }
                    java.util.Calendar r4 = java.util.Calendar.getInstance(r4)     // Catch:{ Exception -> 0x0389 }
                    r15 = 15
                    int r15 = r4.get(r15)     // Catch:{ Exception -> 0x0389 }
                    r24 = r9
                    r9 = 16
                    int r4 = r4.get(r9)     // Catch:{ Exception -> 0x039a }
                    java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x039a }
                    r9.setTimeInMillis(r12)     // Catch:{ Exception -> 0x039a }
                    r12 = 14
                    int r15 = r15 + r4
                    r9.add(r12, r15)     // Catch:{ Exception -> 0x039a }
                    long r12 = r9.getTimeInMillis()     // Catch:{ Exception -> 0x039a }
                    r19 = 1000(0x3e8, double:4.94E-321)
                    long r12 = r12 / r19
                    java.lang.String r4 = "parse result time: %d, videoPath: %s."
                    r9 = 2
                    java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x039f }
                    java.lang.Long r18 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x039f }
                    r22 = 0
                    r15[r22] = r18     // Catch:{ Exception -> 0x039f }
                    r18 = 1
                    r15[r18] = r0     // Catch:{ Exception -> 0x039f }
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r4, r15)     // Catch:{ Exception -> 0x039f }
                    goto L_0x03ab
                L_0x0385:
                    r9 = 2
                    goto L_0x039f
                L_0x0387:
                    r9 = 2
                    goto L_0x039d
                L_0x0389:
                    r24 = r9
                    goto L_0x039a
                L_0x038c:
                    r24 = r9
                    r23 = r13
                    r9 = 2
                    r19 = 1000(0x3e8, double:4.94E-321)
                    r12 = r16
                    goto L_0x03ab
                L_0x0396:
                    r24 = r9
                    r23 = r13
                L_0x039a:
                    r9 = 2
                    r19 = 1000(0x3e8, double:4.94E-321)
                L_0x039d:
                    r12 = r16
                L_0x039f:
                    r4 = 1
                    java.lang.Object[] r15 = new java.lang.Object[r4]
                    r4 = 0
                    r15[r4] = r0
                    java.lang.String r4 = "parse from Date String error, videoPath: %s."
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r4, r15)
                L_0x03ab:
                    r4 = r10
                    double r9 = r1.f241932e
                    boolean r9 = cc0.C79995a.m97218a(r9)
                    if (r9 == 0) goto L_0x03fc
                    double r9 = r1.f241933f
                    boolean r9 = cc0.C79995a.m97219b(r9)
                    if (r9 == 0) goto L_0x03fc
                    com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r9 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.getVideoLatLong(r0)
                    if (r9 == 0) goto L_0x03e6
                    float r10 = r9.latitude
                    r33 = r14
                    double r14 = (double) r10
                    float r9 = r9.longtitude
                    double r9 = (double) r9
                    r35 = r2
                    r34 = r3
                    double r2 = r1.f241932e
                    r36 = r7
                    r37 = r8
                    double r7 = r1.f241933f
                    r25 = r14
                    r27 = r9
                    r29 = r2
                    r31 = r7
                    double r2 = com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(r25, r27, r29, r31)
                    r8 = r2
                    r2 = 1
                    r7 = 0
                    goto L_0x0413
                L_0x03e6:
                    r35 = r2
                    r34 = r3
                    r36 = r7
                    r37 = r8
                    r33 = r14
                    r2 = 1
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r7 = 0
                    r3[r7] = r0
                    java.lang.String r8 = "calculate X fail, locData is null. videoPath: %s."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r3)
                    goto L_0x0411
                L_0x03fc:
                    r35 = r2
                    r34 = r3
                    r36 = r7
                    r37 = r8
                    r33 = r14
                    r2 = 1
                    r7 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    r3[r7] = r0
                    java.lang.String r8 = "calculate X fail, lat/long is invalid. videoPath: %s."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r3)
                L_0x0411:
                    r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                L_0x0413:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r3 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    java.lang.String r3 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101457a(r3, r12, r8)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r8 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject r8 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101459c(r8, r0, r2)
                    if (r8 != 0) goto L_0x0435
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r7] = r0
                    java.lang.String r0 = "addVideoItem fail, mVideoFilePath is %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r2 = r0.f241927e
                    r3 = -2
                    r2.f241919d = r3
                    r0.finishProcess(r2)
                    return
                L_0x0435:
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r7 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101460d(r7, r0)
                    boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r7 != 0) goto L_0x0448
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r7 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101461e(r7, r0)
                    goto L_0x044a
                L_0x0448:
                    r0 = r23
                L_0x044a:
                    org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x04af }
                    r7.<init>()     // Catch:{ Exception -> 0x04af }
                    java.lang.String r9 = "video"
                    r7.put(r11, r9)     // Catch:{ Exception -> 0x04af }
                    java.lang.String r9 = r8.f238902d     // Catch:{ Exception -> 0x04af }
                    r7.put(r6, r9)     // Catch:{ Exception -> 0x04af }
                    long r9 = r8.f238913o     // Catch:{ Exception -> 0x04af }
                    r7.put(r5, r9)     // Catch:{ Exception -> 0x04af }
                    int r9 = r8.f238914p     // Catch:{ Exception -> 0x04af }
                    r10 = r36
                    r7.put(r10, r9)     // Catch:{ Exception -> 0x04a5 }
                    int r9 = r8.f238915q     // Catch:{ Exception -> 0x04a5 }
                    r12 = r37
                    r7.put(r12, r9)     // Catch:{ Exception -> 0x049b }
                    java.lang.String r9 = "duration"
                    int r8 = r8.f238912n     // Catch:{ Exception -> 0x049b }
                    r7.put(r9, r8)     // Catch:{ Exception -> 0x049b }
                    java.lang.String r8 = "thumbTempFilePath"
                    r7.put(r8, r0)     // Catch:{ Exception -> 0x049b }
                    r8 = r34
                    r7.put(r8, r3)     // Catch:{ Exception -> 0x0495 }
                    r3 = r33
                    r9 = r35
                    r7.put(r9, r3)     // Catch:{ Exception -> 0x0491 }
                    r13 = r24
                    r13.put(r7)     // Catch:{ Exception -> 0x048f }
                    r15 = r23
                    r7 = 0
                    goto L_0x04d3
                L_0x048f:
                    r0 = move-exception
                    goto L_0x04bc
                L_0x0491:
                    r0 = move-exception
                    r13 = r24
                    goto L_0x04bc
                L_0x0495:
                    r0 = move-exception
                    r13 = r24
                    r3 = r33
                    goto L_0x04a2
                L_0x049b:
                    r0 = move-exception
                    r13 = r24
                    r3 = r33
                    r8 = r34
                L_0x04a2:
                    r9 = r35
                    goto L_0x04bc
                L_0x04a5:
                    r0 = move-exception
                    r13 = r24
                    r3 = r33
                    r8 = r34
                    r9 = r35
                    goto L_0x04ba
                L_0x04af:
                    r0 = move-exception
                    r13 = r24
                    r3 = r33
                    r8 = r34
                    r9 = r35
                    r10 = r36
                L_0x04ba:
                    r12 = r37
                L_0x04bc:
                    r7 = 0
                    java.lang.Object[] r14 = new java.lang.Object[r7]
                    r15 = r23
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r15, r14)
                    goto L_0x04d3
                L_0x04c5:
                    r21 = r4
                L_0x04c7:
                    r12 = r8
                    r4 = r10
                    r15 = r13
                    r19 = 1000(0x3e8, double:4.94E-321)
                    r8 = r3
                    r10 = r7
                    r13 = r9
                    r3 = r14
                    r7 = 0
                    r9 = r2
                    r2 = 1
                L_0x04d3:
                    r14 = r3
                    r3 = r8
                    r2 = r9
                    r7 = r10
                    r8 = r12
                    r9 = r13
                    r13 = r15
                    r10 = r4
                    r4 = r21
                    goto L_0x02d5
                L_0x04df:
                    r13 = r9
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r0.f241927e
                    r2 = -1
                    r0.f241919d = r2
                    java.lang.String r2 = r13.toString()
                    r0.f241920e = r2
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.this
                    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r2 = r0.f241927e
                    r0.finishProcess(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.C82677a.run():void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$b */
        public class C82678b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f241938d;

            /* renamed from: e */
            public final /* synthetic */ String f241939e;

            /* renamed from: f */
            public final /* synthetic */ double f241940f;

            /* renamed from: g */
            public final /* synthetic */ double f241941g;

            public C82678b(boolean z, String str, double d, double d2) {
                this.f241938d = z;
                this.f241939e = str;
                this.f241940f = d;
                this.f241941g = d2;
            }

            public void run() {
                String str;
                String str2;
                String b = this.f241938d ? C82676d.m101458b(C82676d.this, this.f241939e) : this.f241939e;
                C82682e w = JsApiChooseMultiMedia.m101453w(b);
                AppBrandLocalMediaObject b2 = AppBrandLocalMediaObjectManager.m99829b(C82676d.this.f241926d.f241906d, b, (String) null, this.f241938d | true);
                if (b2 != null) {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                    double d = -1.0d;
                    if (!C79995a.m97218a(this.f241940f) || !C79995a.m97219b(this.f241941g)) {
                        str = "MicroMsg.JsApiChooseMultiMedia";
                        Log.m105929w(str, "calculate X fail, lat/long is invalid. pic_Path: %s.", this.f241939e);
                    } else {
                        BackwardSupportUtil.ExifHelper.LatLongData f = C82676d.m101462f(C82676d.this);
                        if (f != null) {
                            d = TencentLocationUtils.distanceBetween((double) f.latitude, (double) f.longtitude, this.f241940f, this.f241941g);
                            str = "MicroMsg.JsApiChooseMultiMedia";
                        } else {
                            str = "MicroMsg.JsApiChooseMultiMedia";
                            Log.m105929w(str, "calculate X fail, locData is null. pic_Path: %s.", this.f241939e);
                        }
                    }
                    String a = C82676d.m101457a(C82676d.this, timeInMillis, d);
                    Log.m105924i(str, "handle image from mm-sight is done.");
                    ChooseResult chooseResult = C82676d.this.f241927e;
                    chooseResult.f241919d = -1;
                    String str3 = b2.f238902d;
                    long j = b2.f238907i;
                    int i = w.f241949a;
                    int i2 = w.f241950b;
                    String str4 = w.f241951c;
                    JSONArray jSONArray = new JSONArray();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", "image");
                        jSONObject.put("tempFilePath", str3);
                        jSONObject.put("size", j);
                        jSONObject.put("width", i);
                        jSONObject.put("height", i2);
                        jSONObject.put("orientation", str4);
                        jSONObject.put("mark", a);
                        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "camera");
                        jSONArray.put(jSONObject);
                        str2 = jSONArray.toString();
                        Log.m105925i(str, "parseImageItemToJson, res: %s.", str2);
                    } catch (Exception e) {
                        Log.printErrStackTrace(str, e, "", new Object[0]);
                        str2 = "";
                    }
                    chooseResult.f241920e = str2;
                    C82676d dVar = C82676d.this;
                    dVar.finishProcess(dVar.f241927e);
                    return;
                }
                Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight camera, get null obj from path: %s", this.f241939e);
                C82676d dVar2 = C82676d.this;
                ChooseResult chooseResult2 = dVar2.f241927e;
                chooseResult2.f241919d = -2;
                dVar2.finishProcess(chooseResult2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$c */
        public class C82679c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f241943d;

            /* renamed from: e */
            public final /* synthetic */ double f241944e;

            /* renamed from: f */
            public final /* synthetic */ double f241945f;

            public C82679c(String str, double d, double d2) {
                this.f241943d = str;
                this.f241944e = d;
                this.f241945f = d2;
            }

            public void run() {
                String str;
                Uri n = C116299g2.m163858n(this.f241943d);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                    Log.m105924i("MicroMsg.JsApiChooseMultiMedia", "take media camera, the mVideoFilePath file exist, success");
                    C82676d dVar = C82676d.this;
                    dVar.f241927e.f241919d = -1;
                    AppBrandLocalVideoObject c = C82676d.m101459c(dVar, this.f241943d, false);
                    if (c == null) {
                        Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem fail ,mVideoFilePath is %s", this.f241943d);
                        C82676d dVar2 = C82676d.this;
                        ChooseResult chooseResult = dVar2.f241927e;
                        chooseResult.f241919d = -2;
                        dVar2.finishProcess(chooseResult);
                        return;
                    }
                    String d = C82676d.m101460d(C82676d.this, this.f241943d);
                    String str2 = "";
                    String e = !Util.isNullOrNil(d) ? C82676d.m101461e(C82676d.this, d) : str2;
                    long timeInMillis = Calendar.getInstance().getTimeInMillis() / 1000;
                    double d2 = -1.0d;
                    if (!C79995a.m97218a(this.f241944e) || !C79995a.m97219b(this.f241945f)) {
                        str = "MicroMsg.JsApiChooseMultiMedia";
                        Log.m105929w(str, "calculate X fail, lat/long is invalid. video_Path: %s.", this.f241943d);
                    } else {
                        BackwardSupportUtil.ExifHelper.LatLongData f = C82676d.m101462f(C82676d.this);
                        if (f != null) {
                            d2 = TencentLocationUtils.distanceBetween((double) f.latitude, (double) f.longtitude, this.f241944e, this.f241945f);
                            str = "MicroMsg.JsApiChooseMultiMedia";
                        } else {
                            str = "MicroMsg.JsApiChooseMultiMedia";
                            Log.m105929w(str, "calculate X fail, locData is null. video_Path: %s.", this.f241943d);
                        }
                    }
                    String a = C82676d.m101457a(C82676d.this, timeInMillis, d2);
                    ChooseResult chooseResult2 = C82676d.this.f241927e;
                    String str3 = c.f238902d;
                    long j = c.f238913o;
                    int i = c.f238914p;
                    int i2 = c.f238915q;
                    int i3 = c.f238912n;
                    Log.m105924i(str, "parseImageItemToJson()");
                    JSONArray jSONArray = new JSONArray();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", "video");
                        jSONObject.put("tempFilePath", str3);
                        jSONObject.put("size", j);
                        jSONObject.put("width", i);
                        jSONObject.put("height", i2);
                        jSONObject.put("duration", i3);
                        jSONObject.put("thumbTempFilePath", e);
                        jSONObject.put("mark", a);
                        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "camera");
                        jSONArray.put(jSONObject);
                        str2 = jSONArray.toString();
                    } catch (Exception e2) {
                        Log.printErrStackTrace(str, e2, str2, new Object[0]);
                    }
                    chooseResult2.f241920e = str2;
                    C82676d dVar3 = C82676d.this;
                    dVar3.finishProcess(dVar3.f241927e);
                    return;
                }
                Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", this.f241943d);
                C82676d dVar4 = C82676d.this;
                ChooseResult chooseResult3 = dVar4.f241927e;
                chooseResult3.f241919d = -2;
                dVar4.finishProcess(chooseResult3);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$d */
        public class C82680d implements DialogInterface.OnCancelListener {
            public C82680d() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "cancel show the progress dialog and finish progress");
                C82676d dVar = C82676d.this;
                ChooseResult chooseResult = dVar.f241927e;
                chooseResult.f241919d = 0;
                dVar.finishProcess(chooseResult);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$e */
        public class C82681e implements C89903h.C89905b {

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f241948a;

            public C82681e(CountDownLatch countDownLatch) {
                this.f241948a = countDownLatch;
            }

            /* renamed from: a */
            public void mo114978a(String str) {
                Log.m105918d("MicroMsg.JsApiChooseMultiMedia", "remux onFinish.");
                this.f241948a.countDown();
            }
        }

        /* renamed from: a */
        public static String m101457a(C82676d dVar, long j, double d) {
            String str;
            dVar.getClass();
            Log.m105919d("MicroMsg.JsApiChooseMultiMedia", "generateMarkStr, time: %d X: %f.", Long.valueOf(j), Double.valueOf(d));
            String str2 = j + "";
            if (d < 0.0d) {
                str = str2 + "00";
            } else if (d <= 20.0d) {
                str = str2 + "99";
            } else if (d <= 40.0d) {
                str = str2 + "97";
            } else if (d <= 60.0d) {
                str = str2 + "95";
            } else if (d <= 80.0d) {
                str = str2 + "93";
            } else if (d <= 100.0d) {
                str = str2 + "91";
            } else if (d <= 120.0d) {
                str = str2 + "89";
            } else if (d <= 140.0d) {
                str = str2 + "87";
            } else if (d <= 160.0d) {
                str = str2 + "85";
            } else if (d <= 180.0d) {
                str = str2 + "83";
            } else if (d <= 200.0d) {
                str = str2 + "81";
            } else if (d <= 250.0d) {
                str = str2 + "76";
            } else if (d <= 300.0d) {
                str = str2 + "71";
            } else if (d <= 350.0d) {
                str = str2 + "66";
            } else if (d <= 400.0d) {
                str = str2 + "61";
            } else if (d <= 450.0d) {
                str = str2 + "56";
            } else if (d <= 500.0d) {
                str = str2 + "51";
            } else if (d <= 1000.0d) {
                str = str2 + "20";
            } else {
                str = str2 + PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
            }
            if (dVar.f241926d.f241918s) {
                str = j + "01";
            }
            Log.m105919d("MicroMsg.JsApiChooseMultiMedia", "generateMarkStr, mark: %s.", str);
            return str;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0047 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m101458b(com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d r8, java.lang.String r9) {
            /*
                r8.getClass()
                java.lang.String r8 = "MicroMsg.JsApiChooseMultiMedia"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = a70.C112760b.m154240l()
                r0.append(r1)
                java.lang.String r1 = "microMsg."
                r0.append(r1)
                long r1 = java.lang.System.currentTimeMillis()
                r0.append(r1)
                java.lang.String r1 = ".jpg"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r1)
                r2 = 0
                android.graphics.Bitmap r3 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r9)     // Catch:{ OutOfMemoryError -> 0x0062, NullPointerException -> 0x0047, Exception -> 0x0031 }
                goto L_0x0088
            L_0x0031:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "doCompressImage, decode bmp e "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
                goto L_0x0087
            L_0x0047:
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r9, r2)     // Catch:{ Exception -> 0x004c }
                goto L_0x0088
            L_0x004c:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "doCompressImage, decode bmp npe retry, e "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
                goto L_0x0087
            L_0x0062:
                java.lang.String r3 = "doCompressImage, decode bmp oom"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r9, r2)     // Catch:{ OutOfMemoryError -> 0x0082, Exception -> 0x006c }
                goto L_0x0088
            L_0x006c:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "doCompressImage, decode bmp oom retry, e "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
                goto L_0x0087
            L_0x0082:
                java.lang.String r3 = "doCompressImage, decode bmp oom retry, oom again"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
            L_0x0087:
                r3 = r2
            L_0x0088:
                if (r3 != 0) goto L_0x0090
                java.lang.String r9 = "doCompressImage, decode bmp return null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
                goto L_0x00d3
            L_0x0090:
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r4 = -1
                boolean r4 = com.tencent.p014mm.plugin.appbrand.utils.C84798z.m104479a(r0, r9, r4, r4)
                r5 = 6
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                r5[r6] = r7
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                long r6 = r6 - r2
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r5[r1] = r2
                r1 = 2
                r5[r1] = r9
                r1 = 3
                long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r5[r1] = r2
                r1 = 4
                r5[r1] = r0
                r1 = 5
                long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r5[r1] = r2
                java.lang.String r1 = "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r5)
                if (r4 == 0) goto L_0x00d2
                r9 = r0
            L_0x00d2:
                r2 = r9
            L_0x00d3:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101458b(com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d, java.lang.String):java.lang.String");
        }

        /* renamed from: c */
        public static AppBrandLocalVideoObject m101459c(C82676d dVar, String str, boolean z) {
            C89231c cVar;
            dVar.getClass();
            if (z) {
                try {
                    str = m101463g(str);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, remux failed, exp = %s", Util.stackTraceToString(e));
                }
            }
            try {
                cVar = new C89231c();
                cVar.setDataSource(str);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e2);
                cVar = null;
            }
            if (cVar == null) {
                Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, null meta data");
                return null;
            }
            int i = Util.getInt(cVar.extractMetadata(18), 0);
            int i2 = Util.getInt(cVar.extractMetadata(19), 0);
            int i3 = Util.getInt(cVar.extractMetadata(9), 0);
            if ("90".equals(cVar.extractMetadata(24)) && i > i2) {
                int i4 = i2;
                i2 = i;
                i = i4;
            }
            cVar.release();
            String str2 = dVar.f241926d.f241906d;
            String str3 = AppBrandLocalMediaObjectManager.f238909a;
            AppBrandLocalVideoObject appBrandLocalVideoObject = (AppBrandLocalVideoObject) AppBrandLocalMediaObjectManager.m99830c(str2, str, AppBrandLocalVideoObject.class, "mp4", false);
            if (appBrandLocalVideoObject == null) {
                Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "attachVideo error, return null");
                return null;
            }
            appBrandLocalVideoObject.f238912n = (i3 + 500) / 1000;
            appBrandLocalVideoObject.f238914p = i;
            appBrandLocalVideoObject.f238915q = i2;
            appBrandLocalVideoObject.f238913o = C86013q1.m106451l(str);
            Log.m105925i("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, return %s", appBrandLocalVideoObject);
            return appBrandLocalVideoObject;
        }

        /* renamed from: d */
        public static String m101460d(C82676d dVar, String str) {
            String str2;
            dVar.getClass();
            if (Util.isNullOrNil(str)) {
                return "";
            }
            C86009m1 m1Var = new C86009m1(str);
            if (!m1Var.mo119967g()) {
                return "";
            }
            String name = m1Var.getName();
            String str3 = null;
            if (!TextUtils.isEmpty(name) && name.contains(".")) {
                str3 = name.substring(0, name.lastIndexOf("."));
            }
            if (TextUtils.isEmpty(str3)) {
                str2 = C112760b.m154240l() + ("microMsg_" + System.currentTimeMillis()) + ".jpeg";
            } else if (C112760b.m154240l() == null || !C112760b.m154240l().endsWith("/")) {
                str2 = C112760b.m154240l() + "/" + str3 + System.currentTimeMillis() + ".jpeg";
            } else {
                str2 = C112760b.m154240l() + str3 + System.currentTimeMillis() + ".jpeg";
            }
            if (!new C86009m1(str2).mo119967g()) {
                Log.m105925i("MicroMsg.JsApiChooseMultiMedia", "file not exist for path:%s! create it!", str2);
                Bitmap createVideoThumbnail = BitmapUtil.createVideoThumbnail(str, 2);
                if (createVideoThumbnail == null) {
                    Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "createVideoThumbnail bitmap fail for path:%s!", str2);
                    return "";
                }
                try {
                    BitmapUtil.saveBitmapToImage(createVideoThumbnail, 80, Bitmap.CompressFormat.JPEG, str2, true);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "saveBitmapToImage exist IOException:" + e.getMessage());
                }
            } else {
                Log.m105925i("MicroMsg.JsApiChooseMultiMedia", "file is exist for path:%s!", str2);
            }
            return str2;
        }

        /* renamed from: e */
        public static String m101461e(C82676d dVar, String str) {
            dVar.getClass();
            if (!TextUtils.isEmpty(str)) {
                AppBrandLocalMediaObject b = AppBrandLocalMediaObjectManager.m99829b(dVar.f241926d.f241906d, str, (String) null, true);
                if (b != null && !Util.isNullOrNil(b.f238902d)) {
                    return b.f238902d;
                }
                Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "addThumbItem error, localId is null");
            }
            return "";
        }

        /* renamed from: f */
        public static BackwardSupportUtil.ExifHelper.LatLongData m101462f(C82676d dVar) {
            dVar.getClass();
            Context context = MMApplicationContext.getContext();
            String string = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_locCache", 0).getString("locStr", (String) null);
            if (string != null) {
                String[] split = string.split(",");
                float f = ((float) Util.getInt(split[0], 0)) / 1000000.0f;
                float f2 = ((float) Util.getInt(split[1], 0)) / 1000000.0f;
                Log.m105919d("MicroMsg.JsApiChooseMultiMedia", "locStr: %s, latitude: %f, longitude: %f", string, Float.valueOf(f), Float.valueOf(f2));
                return new BackwardSupportUtil.ExifHelper.LatLongData(f, f2);
            }
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(67591, (Object) null);
            if (str != null) {
                try {
                    String[] split2 = str.split(",");
                    int intValue = Integer.valueOf(split2[0]).intValue();
                    String str2 = 1 == Integer.valueOf(split2[1]).intValue() ? "network" : "gps";
                    float intValue2 = ((float) Integer.valueOf(split2[2]).intValue()) / 1000000.0f;
                    float intValue3 = ((float) Integer.valueOf(split2[3]).intValue()) / 1000000.0f;
                    Log.m105919d("MicroMsg.JsApiChooseMultiMedia", "cached gps coordinate, precision: %d source: %s latitude: %f longitude: %f", Integer.valueOf(intValue), str2, Float.valueOf(intValue2), Float.valueOf(intValue3));
                    return new BackwardSupportUtil.ExifHelper.LatLongData(intValue2, intValue3);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.JsApiChooseMultiMedia", "getCurrentGPSData parse value error.", e);
                    return null;
                }
            } else {
                Log.m105924i("MicroMsg.JsApiChooseMultiMedia", "lbs location is null, no cached data!");
                Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "location get error!");
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0111  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m101463g(java.lang.String r17) {
            /*
                java.lang.Class<rz.q> r0 = p682rz.C36594q.class
                java.lang.String r1 = "MicroMsg.JsApiChooseMultiMedia"
                r2 = 2
                int[] r3 = new int[r2]
                r4 = 0
                oj.c r5 = new oj.c     // Catch:{ all -> 0x010e }
                r5.<init>()     // Catch:{ all -> 0x010e }
                r4 = r17
                r5.setDataSource(r4)     // Catch:{ all -> 0x010b }
                r6 = 18
                java.lang.String r6 = r5.extractMetadata(r6)     // Catch:{ all -> 0x010b }
                r15 = 0
                int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r15)     // Catch:{ all -> 0x010b }
                r7 = 19
                java.lang.String r7 = r5.extractMetadata(r7)     // Catch:{ all -> 0x010b }
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r15)     // Catch:{ all -> 0x010b }
                r3[r15] = r6     // Catch:{ all -> 0x010b }
                r14 = 1
                r3[r14] = r7     // Catch:{ all -> 0x010b }
                di3.d r8 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x010b }
                rz.q r8 = (p682rz.C36594q) r8     // Catch:{ all -> 0x010b }
                com.tencent.mm.modelcontrol.VideoTransPara r8 = r8.mo60731HF()     // Catch:{ all -> 0x010b }
                int r9 = r8.f267166d     // Catch:{ all -> 0x010b }
                int r10 = r8.f267167e     // Catch:{ all -> 0x010b }
                android.graphics.Point r9 = m101464h(r6, r7, r9, r10)     // Catch:{ all -> 0x010b }
                if (r9 == 0) goto L_0x0048
                int r10 = r9.x     // Catch:{ all -> 0x010b }
                r3[r15] = r10     // Catch:{ all -> 0x010b }
                int r9 = r9.y     // Catch:{ all -> 0x010b }
                r3[r14] = r9     // Catch:{ all -> 0x010b }
            L_0x0048:
                java.lang.String r9 = "r.w: %d r.h: %d para.width: %d para.height: %d out.w: %d out.h: %d."
                r10 = 6
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x010b }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x010b }
                r10[r15] = r6     // Catch:{ all -> 0x010b }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x010b }
                r10[r14] = r6     // Catch:{ all -> 0x010b }
                int r6 = r8.f267166d     // Catch:{ all -> 0x010b }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x010b }
                r10[r2] = r6     // Catch:{ all -> 0x010b }
                r2 = 3
                int r6 = r8.f267167e     // Catch:{ all -> 0x010b }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x010b }
                r10[r2] = r6     // Catch:{ all -> 0x010b }
                r2 = 4
                r6 = r3[r15]     // Catch:{ all -> 0x010b }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x010b }
                r10[r2] = r6     // Catch:{ all -> 0x010b }
                r2 = 5
                r6 = r3[r14]     // Catch:{ all -> 0x010b }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x010b }
                r10[r2] = r6     // Catch:{ all -> 0x010b }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r9, r10)     // Catch:{ all -> 0x010b }
                r5.release()
                r9 = r3[r15]
                r10 = r3[r14]
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = a70.C112760b.m154240l()
                r2.append(r3)
                java.lang.String r3 = "microMsg."
                r2.append(r3)
                long r5 = java.lang.System.currentTimeMillis()
                r2.append(r5)
                java.lang.String r3 = ".mp4"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                di3.d r0 = di3.C86312j.m106911c(r0)
                rz.q r0 = (p682rz.C36594q) r0
                com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.mo60731HF()
                java.lang.Object[] r3 = new java.lang.Object[r14]
                int r5 = r0.f267169g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r15] = r5
                java.lang.String r5 = "para.videoBitrate: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r5, r3)
                java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
                r3.<init>(r14)
                java.lang.Class<eu.e> r5 = p509eu.C86680e.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                eu.e r5 = (p509eu.C86680e) r5
                r80.h$a r5 = r5.mo120820U8()
                int r11 = r0.f267169g
                int r12 = r0.f267168f
                int r13 = r0.f267157D
                int r0 = r0.f267158E
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$e r8 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$e
                r8.<init>(r3)
                r6 = r5
                r80.j0 r6 = (r80.C101359j0) r6
                r7 = r17
                r4 = r8
                r8 = r2
                r5 = 1
                r14 = r0
                r16 = 0
                r15 = r4
                r80.h r0 = r6.mo140842a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                r0.mo124208b()
                java.lang.String r0 = "latch await "
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ InterruptedException -> 0x00fc }
                r3.await()     // Catch:{ InterruptedException -> 0x00fc }
                goto L_0x010a
            L_0x00fc:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r0 = r0.getMessage()
                r3[r16] = r0
                java.lang.String r0 = "latch await exception, %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)
            L_0x010a:
                return r2
            L_0x010b:
                r0 = move-exception
                r4 = r5
                goto L_0x010f
            L_0x010e:
                r0 = move-exception
            L_0x010f:
                if (r4 == 0) goto L_0x0114
                r4.release()
            L_0x0114:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.m101463g(java.lang.String):java.lang.String");
        }

        /* renamed from: h */
        public static Point m101464h(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            Log.m105918d("MicroMsg.JsApiChooseMultiMedia", "scale() called with: decoderOutputWidth = [" + i + "], decoderOutputHeight = [" + i2 + "], specWidth = [" + i3 + "], specHeight = [" + i4 + "]");
            if (i > i3 || i2 > i4) {
                int max = Math.max(i, i2);
                int min = Math.min(i, i2);
                int max2 = Math.max(i3, i4);
                int min2 = Math.min(i3, i4);
                if (max % 16 != 0 || Math.abs(max - max2) >= 16 || min % 16 != 0 || Math.abs(min - min2) >= 16) {
                    int i7 = max / 2;
                    int i8 = min / 2;
                    if (i7 % 16 != 0 || Math.abs(i7 - max2) >= 16 || i8 % 16 != 0 || Math.abs(i8 - min2) >= 16) {
                        Point point = new Point();
                        if (i < i2) {
                            i5 = Math.min(i3, i4);
                            i6 = (int) (((double) i2) / ((((double) i) * 1.0d) / ((double) i5)));
                        } else {
                            int min3 = Math.min(i3, i4);
                            int i9 = min3;
                            i5 = (int) (((double) i) / ((((double) i2) * 1.0d) / ((double) min3)));
                            i6 = i9;
                        }
                        if (i6 % 2 != 0) {
                            i6++;
                        }
                        if (i5 % 2 != 0) {
                            i5++;
                        }
                        Log.m105925i("MicroMsg.JsApiChooseMultiMedia", "calc scale, outputsize: %s %s", Integer.valueOf(i5), Integer.valueOf(i6));
                        point.x = i5;
                        point.y = i6;
                        return point;
                    }
                    Log.m105924i("MicroMsg.JsApiChooseMultiMedia", "calc scale, double ratio divide by 16");
                    int i15 = i / 2;
                    int i16 = i2 / 2;
                    if (i15 % 2 != 0) {
                        i15++;
                    }
                    if (i16 % 2 != 0) {
                        i16++;
                    }
                    return new Point(i15, i16);
                }
                Log.m105924i("MicroMsg.JsApiChooseMultiMedia", "calc scale, same len divide by 16, no need scale");
                return null;
            }
            Log.m105924i("MicroMsg.JsApiChooseMultiMedia", "calc scale, small or equal to spec size");
            return null;
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            boolean z;
            this.f241926d = (ChooseRequest) processRequest;
            if (!(Util.getAvailableMemoryMB(getActivityContext()) > 200)) {
                C76912y0.makeText((Context) getActivityContext(), (CharSequence) getString(C0966R.string.f7636m8), 1).show();
            }
            Class cls = C7138g.class;
            getActivityContext().mmSetOnActivityResultCallback(this);
            ChooseRequest chooseRequest = this.f241926d;
            int i = chooseRequest.f241917r;
            int i2 = 3;
            if (i == 1) {
                z = true;
            } else if (i == 2) {
                z = false;
                i2 = 1;
            } else if (i == 3) {
                z = false;
                i2 = 2;
            } else {
                z = false;
            }
            boolean z2 = chooseRequest.f241912j;
            if (z2 && chooseRequest.f241913n) {
                Intent i3 = mo114972i();
                i3.putExtra("query_media_type", i2);
                i3.putExtra("key_can_select_video_and_pic", z);
                ((C7138g) C86312j.m106911c(cls)).mo8311H7(getActivityContext(), 1, this.f241926d.f241907e, this.f241928f, i3);
            } else if (chooseRequest.f241913n) {
                Intent i4 = mo114972i();
                i4.putExtra("show_header_view", false);
                i4.putExtra("query_media_type", i2);
                i4.putExtra("key_can_select_video_and_pic", z);
                ((C7138g) C86312j.m106911c(cls)).mo8311H7(getActivityContext(), 1, this.f241926d.f241907e, this.f241928f, i4);
            } else if (z2) {
                Intent intent = new Intent();
                intent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.f241926d.f241909g);
                intent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.f241926d.f241908f);
                ChooseRequest chooseRequest2 = this.f241926d;
                boolean z3 = chooseRequest2.f241915p;
                int i5 = (!z3 || chooseRequest2.f241916q) ? (!chooseRequest2.f241916q || z3) ? 0 : 2 : 1;
                SightParams sightParams = new SightParams(7, 1);
                sightParams.f248450d = i5;
                sightParams.f248452f.f267170h = this.f241926d.f241914o;
                intent.putExtra("KEY_SIGHT_PARAMS", sightParams);
                ((C7138g) C86312j.m106911c(cls)).mo8314Vt(getActivityContext(), 2, intent, 7, i5);
            } else {
                Log.m105920e("MicroMsg.JsApiChooseMultiMedia", "unknown scene, ignore this request");
                ChooseResult chooseResult = this.f241927e;
                chooseResult.f241919d = -2;
                finishProcess(chooseResult);
            }
        }

        /* renamed from: i */
        public final Intent mo114972i() {
            Intent intent = new Intent();
            intent.putExtra("album_business_tag", "album_business_bubble_media_by_coordinate");
            intent.putExtra("album_video_max_duration", this.f241926d.f241914o);
            intent.putExtra("album_business_bubble_media_by_coordinate_distance", this.f241926d.f241911i);
            intent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.f241926d.f241909g);
            intent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.f241926d.f241908f);
            intent.putExtra("album_business_bubble_media_by_coordinate_posname", this.f241926d.f241910h);
            intent.putExtra("query_media_type", 3);
            intent.putExtra("send_btn_string", getString(C0966R.string.f360089a13));
            intent.putExtra("gallery_report_tag", 18);
            return intent;
        }

        /* renamed from: j */
        public final void mo114973j() {
            this.f241930h = new C82680d();
            this.f241929g = C76879j.m92723Q(getActivityContext(), getString(C0966R.string.a3h), getString(C0966R.string.f7638m_), true, true, this.f241930h);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x014b, code lost:
            if (r0 != false) goto L_0x014f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mmOnActivityResult(int r15, int r16, android.content.Intent r17) {
            /*
                r14 = this;
                r10 = r14
                r0 = r15
                r1 = r17
                r2 = 0
                if (r16 != 0) goto L_0x000f
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r2
                r14.finishProcess(r0)
                return
            L_0x000f:
                r3 = 4640572387912318976(0x4066a00000000000, double:181.0)
                if (r1 == 0) goto L_0x001c
                java.lang.String r5 = "longitude"
                double r3 = r1.getDoubleExtra(r5, r3)
            L_0x001c:
                r6 = r3
                r3 = 4636103972657037312(0x4056c00000000000, double:91.0)
                if (r1 == 0) goto L_0x002a
                java.lang.String r5 = "latitude"
                double r3 = r1.getDoubleExtra(r5, r3)
            L_0x002a:
                r4 = r3
                r3 = 2
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.Double r9 = java.lang.Double.valueOf(r6)
                r8[r2] = r9
                java.lang.Double r9 = java.lang.Double.valueOf(r4)
                r11 = 1
                r8[r11] = r9
                java.lang.String r9 = "MicroMsg.JsApiChooseMultiMedia"
                java.lang.String r12 = "longitude: %f, latitude: %f."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r12, r8)
                java.lang.Object[] r8 = new java.lang.Object[r11]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
                r8[r2] = r12
                java.lang.String r12 = "requestCode: %d."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r8)
                java.lang.String r8 = "CropImage_Compress_Img"
                if (r0 == r11) goto L_0x0104
                r12 = -2
                if (r0 == r3) goto L_0x0060
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r12
                r14.finishProcess(r0)
                goto L_0x0162
            L_0x0060:
                java.lang.String r0 = "REQUEST_CODE_TAKE_MEDIA_CAMERA"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                if (r1 != 0) goto L_0x006f
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r2
                r14.finishProcess(r0)
                return
            L_0x006f:
                java.lang.String r0 = "data is valid!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                java.lang.String r0 = "key_req_result"
                android.os.Parcelable r0 = r1.getParcelableExtra(r0)
                com.tencent.mm.plugin.mmsight.SightCaptureResult r0 = (com.tencent.p014mm.plugin.mmsight.SightCaptureResult) r0
                if (r0 != 0) goto L_0x008c
                java.lang.String r0 = "sight capture result is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r12
                r14.finishProcess(r0)
                return
            L_0x008c:
                boolean r3 = r0.f201515e
                if (r3 == 0) goto L_0x00d1
                java.lang.String r3 = r0.f201523p
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r0 != 0) goto L_0x00bf
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
                if (r0 != 0) goto L_0x009f
                goto L_0x00bf
            L_0x009f:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r2] = r3
                java.lang.String r11 = "filePath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r0)
                boolean r2 = r1.getBooleanExtra(r8, r2)
                r14.mo114973j()
                js0.r$a r8 = js0.C88024r.m109571a()
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$b r9 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$b
                r0 = r9
                r1 = r14
                r0.<init>(r2, r3, r4, r6)
                r8.postToWorker(r9)
                goto L_0x0162
            L_0x00bf:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r2] = r3
                java.lang.String r1 = "picture_picturePath file is not exist! path:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r1, r0)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r12
                r14.finishProcess(r0)
                return
            L_0x00d1:
                java.lang.String r3 = r0.f201517g
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r0 == 0) goto L_0x00e6
                java.lang.String r0 = "mVideoFilePath is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r12
                r14.finishProcess(r0)
                return
            L_0x00e6:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r2] = r3
                java.lang.String r1 = "mVideoFilePath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
                r14.mo114973j()
                js0.r$a r8 = js0.C88024r.m109571a()
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$c r9 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$c
                r0 = r9
                r1 = r14
                r2 = r3
                r3 = r4
                r5 = r6
                r0.<init>(r2, r3, r5)
                r8.postToWorker(r9)
                goto L_0x0162
            L_0x0104:
                java.lang.String r0 = "REQUEST_CODE_GALLERY"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
                if (r1 != 0) goto L_0x0113
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult r0 = r10.f241927e
                r0.f241919d = r2
                r14.finishProcess(r0)
                return
            L_0x0113:
                java.lang.String r0 = "CropImage_OutputPath_List"
                java.util.ArrayList r3 = r1.getStringArrayListExtra(r0)
                java.lang.String r0 = "key_select_video_list"
                java.util.ArrayList r9 = r1.getStringArrayListExtra(r0)
                boolean r8 = r1.getBooleanExtra(r8, r2)
                r14.mo114973j()
                if (r8 != 0) goto L_0x014e
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r0 == 0) goto L_0x0130
            L_0x012e:
                r0 = 0
                goto L_0x014b
            L_0x0130:
                java.util.Iterator r0 = r3.iterator()
            L_0x0134:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x012e
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                com.tencent.mm.compatible.util.Exif r1 = com.tencent.p014mm.compatible.util.Exif.fromFile(r1)
                int r1 = r1.getOrientationInDegree()
                if (r1 == 0) goto L_0x0134
                r0 = 1
            L_0x014b:
                if (r0 == 0) goto L_0x014e
                goto L_0x014f
            L_0x014e:
                r11 = 0
            L_0x014f:
                js0.r$a r12 = js0.C88024r.m109571a()
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$a r13 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$d$a
                r0 = r13
                r1 = r14
                r2 = r3
                r3 = r4
                r5 = r6
                r7 = r8
                r8 = r11
                r0.<init>(r2, r3, r5, r7, r8, r9)
                r12.postToWorker(r13)
            L_0x0162:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.C82676d.mmOnActivityResult(int, int, android.content.Intent):void");
        }

        public void onProcessInterrupted() {
            super.onProcessInterrupted();
            C89779i0 i0Var = this.f241929g;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f241929g = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$e */
    public static final class C82682e {

        /* renamed from: a */
        public int f241949a;

        /* renamed from: b */
        public int f241950b;

        /* renamed from: c */
        public String f241951c;

        public C82682e(C82673a aVar) {
        }
    }

    /* renamed from: w */
    public static C82682e m101453w(String str) {
        C82682e eVar = new C82682e((C82673a) null);
        if (!Util.isNullOrNil(str)) {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g()) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                MMBitmapFactory.m98735d(m1Var.mo119971i(), options);
                eVar.f241949a = options.outWidth;
                eVar.f241950b = options.outHeight;
                eVar.f241951c = C89131a.m111396d(options) ? C89131a.m111394b(C89131a.m111393a(m1Var.mo119971i())) : "up";
            }
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0379  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r64, org.json.JSONObject r65, int r66) {
        /*
            r63 = this;
            r0 = r63
            r7 = r64
            r1 = r65
            r8 = r66
            java.lang.String r2 = r64.getAppId()
            com.tencent.mm.plugin.appbrand.q1 r2 = com.tencent.p014mm.plugin.appbrand.C84072q1.m103587b(r2)
            boolean r2 = r2.f245464h
            if (r2 == 0) goto L_0x001e
            java.lang.String r1 = "cancel"
            java.lang.String r1 = r0.mo115109j(r1)
            r7.mo109647a(r8, r1)
            return
        L_0x001e:
            android.content.Context r9 = r64.getContext()
            boolean r2 = r9 instanceof android.app.Activity
            java.lang.String r3 = "fail"
            if (r2 != 0) goto L_0x0030
            java.lang.String r1 = r0.mo115109j(r3)
            r7.mo109647a(r8, r1)
            return
        L_0x0030:
            java.lang.String r10 = "MicroMsg.JsApiChooseMultiMedia"
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = "chooseMedia fail, data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            java.lang.String r1 = "fail:data is null"
            java.lang.String r1 = r0.mo115109j(r1)
            r7.mo109647a(r8, r1)
            return
        L_0x0043:
            r2 = 10
            java.lang.String r4 = "maxDuration"
            int r11 = r1.optInt(r4, r2)
            r12 = 1
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r13 = 0
            r2[r13] = r4
            java.lang.String r4 = "videoMaxDuration: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
            if (r11 <= 0) goto L_0x03a8
            r2 = 1800(0x708, float:2.522E-42)
            if (r11 <= r2) goto L_0x0063
            goto L_0x03a8
        L_0x0063:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r2.append(r4)
            java.lang.String r4 = "_locCache"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences r2 = r9.getSharedPreferences(r2, r13)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "locStr"
            r14 = 0
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r14)
            r2.apply()
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$a
            r2.<init>(r0, r9)
            java.lang.Class<ms0.a> r4 = ms0.C88840a.class
            ra.b r4 = p224ra.C89909e.m112436a(r4)
            ms0.a r4 = (ms0.C88840a) r4
            java.lang.String r5 = "wgs84"
            r4.Cb0(r5, r2, r14)
            r2 = 9
            java.lang.String r4 = "count"
            int r15 = r1.optInt(r4, r2)
            java.lang.String r2 = "location"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            r4 = 4636103972657037312(0x4056c00000000000, double:91.0)
            r16 = 4640572387912318976(0x4066a00000000000, double:181.0)
            if (r2 == 0) goto L_0x00d4
            java.lang.String r6 = "longitude"
            double r18 = r2.optDouble(r6)
            java.lang.String r6 = "latitude"
            double r20 = r2.optDouble(r6)
            boolean r2 = java.lang.Double.isNaN(r18)
            if (r2 != 0) goto L_0x00d4
            boolean r2 = java.lang.Double.isNaN(r20)
            if (r2 == 0) goto L_0x00d0
            goto L_0x00d4
        L_0x00d0:
            r16 = r18
            r6 = 0
            goto L_0x00d7
        L_0x00d4:
            r20 = r4
            r6 = 1
        L_0x00d7:
            java.lang.String r2 = "poiName"
            java.lang.String r2 = r1.optString(r2, r14)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x00ef
            android.content.Context r2 = r64.getContext()
            r4 = 2131821878(0x7f110536, float:1.9276512E38)
            java.lang.String r2 = r2.getString(r4)
        L_0x00ef:
            r5 = r2
            r19 = r15
            r14 = 4632233691727265792(0x4049000000000000, double:50.0)
            java.lang.String r2 = "locationRadius"
            double r14 = r1.optDouble(r2, r14)
            java.lang.String r2 = "sourceType"
            org.json.JSONArray r2 = r1.optJSONArray(r2)
            java.lang.String r4 = "cameraType"
            org.json.JSONArray r4 = r1.optJSONArray(r4)
            java.lang.String r12 = "pickAlbumType"
            int r12 = r1.optInt(r12, r13)
            if (r2 == 0) goto L_0x012f
            int r22 = r2.length()
            if (r22 != 0) goto L_0x0117
            goto L_0x012f
        L_0x0117:
            java.lang.String r13 = r2.toString()
            r23 = r5
            java.lang.String r5 = "camera"
            boolean r5 = r13.contains(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r13 = "album"
            boolean r2 = r2.contains(r13)
            r13 = r2
            goto L_0x0133
        L_0x012f:
            r23 = r5
            r5 = 1
            r13 = 1
        L_0x0133:
            if (r4 == 0) goto L_0x0156
            int r2 = r4.length()
            if (r2 != 0) goto L_0x013c
            goto L_0x0156
        L_0x013c:
            java.lang.String r2 = r4.toString()
            r24 = r6
            java.lang.String r6 = "video"
            boolean r2 = r2.contains(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "photo"
            boolean r4 = r4.contains(r6)
            r6 = r2
            goto L_0x015a
        L_0x0156:
            r24 = r6
            r4 = 0
            r6 = 0
        L_0x015a:
            if (r5 == 0) goto L_0x01ad
            java.lang.String r2 = r64.getAppId()
            r25 = r4
            com.tencent.mm.plugin.appbrand.jsapi.media.a1 r4 = new com.tencent.mm.plugin.appbrand.jsapi.media.a1
            r4.<init>(r0, r7, r1, r8)
            wq0.C91085v.m114266a(r2, r4)
            android.content.Context r1 = r64.getContext()
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 != 0) goto L_0x0184
            java.lang.String r1 = r0.mo115109j(r3)
            r7.mo109647a(r8, r1)
            r29 = r5
            r8 = r6
            r28 = r9
            r30 = r23
            r9 = r25
            r1 = 0
            goto L_0x01aa
        L_0x0184:
            android.app.Activity r1 = (android.app.Activity) r1
            r4 = 113(0x71, float:1.58E-43)
            java.lang.String r3 = "android.permission.CAMERA"
            java.lang.String r26 = ""
            java.lang.String r27 = ""
            r2 = r64
            r28 = r9
            r9 = r25
            r29 = r5
            r30 = r23
            r5 = r26
            r8 = r6
            r6 = r27
            boolean r1 = p225rc.C89922k.m112464a(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x01aa
            java.lang.String r2 = r64.getAppId()
            wq0.C91085v.m114268c(r2)
        L_0x01aa:
            if (r1 != 0) goto L_0x01b5
            return
        L_0x01ad:
            r29 = r5
            r8 = r6
            r28 = r9
            r30 = r23
            r9 = r4
        L_0x01b5:
            java.lang.String r1 = r64.getAppId()
            com.tencent.mm.plugin.appbrand.q1 r1 = com.tencent.p014mm.plugin.appbrand.C84072q1.m103586a(r1)
            r2 = 1
            r1.f245464h = r2
            java.lang.String r1 = r64.getAppId()
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$b r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$b
            r2.<init>(r0, r7)
            com.tencent.p014mm.plugin.appbrand.C83231l.m102140a(r1, r2)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest r1 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest
            r1.<init>()
            java.lang.String r2 = r64.getAppId()
            r1.f241906d = r2
            r2 = r19
            r1.f241907e = r2
            r2 = 4634767247992638407(0x4052004189374bc7, double:72.004)
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0203
            r2 = 4639053643935792916(0x40613ab5dcc63f14, double:137.8347)
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ee
            goto L_0x0203
        L_0x01ee:
            r2 = 4605644889887233121(0x3fea89a027525461, double:0.8293)
            int r4 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0203
            r2 = 4633053783145661124(0x404be9de69ad42c4, double:55.8271)
            int r4 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            r2 = 0
            goto L_0x0204
        L_0x0203:
            r2 = 1
        L_0x0204:
            r3 = 2
            if (r2 == 0) goto L_0x0211
            double[] r2 = new double[r3]
            r4 = 0
            r2[r4] = r16
            r4 = 1
            r2[r4] = r20
            goto L_0x0370
        L_0x0211:
            r4 = 4637089135075524608(0x405a400000000000, double:105.0)
            double r4 = r16 - r4
            r25 = 4630122629401935872(0x4041800000000000, double:35.0)
            double r25 = r20 - r25
            r31 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r33 = r4 * r31
            r35 = -4586634745500139520(0xc059000000000000, double:-100.0)
            double r35 = r33 + r35
            r37 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r39 = r25 * r37
            double r35 = r35 + r39
            r39 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r41 = r25 * r39
            double r41 = r41 * r25
            double r35 = r35 + r41
            r41 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r43 = r4 * r41
            double r45 = r43 * r25
            double r35 = r35 + r45
            double r47 = java.lang.Math.abs(r4)
            double r47 = java.lang.Math.sqrt(r47)
            double r47 = r47 * r39
            double r35 = r35 + r47
            r39 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r39 = r39 * r4
            r47 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r39 = r39 * r47
            double r49 = java.lang.Math.sin(r39)
            r51 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r49 = r49 * r51
            double r33 = r33 * r47
            double r53 = java.lang.Math.sin(r33)
            double r53 = r53 * r51
            double r49 = r49 + r53
            double r49 = r49 * r31
            double r49 = r49 / r37
            double r35 = r35 + r49
            double r49 = r25 * r47
            double r53 = java.lang.Math.sin(r49)
            double r53 = r53 * r51
            double r55 = r25 / r37
            double r55 = r55 * r47
            double r55 = java.lang.Math.sin(r55)
            r57 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r55 = r55 * r57
            double r53 = r53 + r55
            double r53 = r53 * r31
            double r53 = r53 / r37
            double r35 = r35 + r53
            r53 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r55 = r25 / r53
            double r55 = r55 * r47
            double r55 = java.lang.Math.sin(r55)
            r59 = 4639833516098453504(0x4064000000000000, double:160.0)
            double r55 = r55 * r59
            r59 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r49 = r49 / r59
            double r49 = java.lang.Math.sin(r49)
            r61 = 4644337115725824000(0x4074000000000000, double:320.0)
            double r49 = r49 * r61
            double r55 = r55 + r49
            double r55 = r55 * r31
            double r55 = r55 / r37
            double r35 = r35 + r55
            r49 = 4643985272004935680(0x4072c00000000000, double:300.0)
            double r55 = r4 + r49
            double r25 = r25 * r31
            double r55 = r55 + r25
            double r43 = r43 * r4
            double r55 = r55 + r43
            double r55 = r55 + r45
            double r25 = java.lang.Math.abs(r4)
            double r25 = java.lang.Math.sqrt(r25)
            double r25 = r25 * r41
            double r55 = r55 + r25
            double r25 = java.lang.Math.sin(r39)
            double r25 = r25 * r51
            double r33 = java.lang.Math.sin(r33)
            double r33 = r33 * r51
            double r25 = r25 + r33
            double r25 = r25 * r31
            double r25 = r25 / r37
            double r55 = r55 + r25
            double r25 = r4 * r47
            double r25 = java.lang.Math.sin(r25)
            double r25 = r25 * r51
            double r33 = r4 / r37
            double r33 = r33 * r47
            double r33 = java.lang.Math.sin(r33)
            double r33 = r33 * r57
            double r25 = r25 + r33
            double r25 = r25 * r31
            double r25 = r25 / r37
            double r55 = r55 + r25
            double r25 = r4 / r53
            double r25 = r25 * r47
            double r25 = java.lang.Math.sin(r25)
            r33 = 4639481672377565184(0x4062c00000000000, double:150.0)
            double r25 = r25 * r33
            double r4 = r4 / r59
            double r4 = r4 * r47
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r49
            double r25 = r25 + r4
            double r25 = r25 * r31
            double r25 = r25 / r37
            double r55 = r55 + r25
            r4 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r25 = r20 / r4
            double r25 = r25 * r47
            double r33 = java.lang.Math.sin(r25)
            r37 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r39 = 4574367011882200843(0x3f7b6a8faf80ef0b, double:0.006693421622965943)
            double r39 = r39 * r33
            double r39 = r39 * r33
            double r37 = r37 - r39
            double r33 = java.lang.Math.sqrt(r37)
            double r35 = r35 * r4
            r39 = 4708560758905198017(0x41582b102de355c1, double:6335552.717000426)
            double r37 = r37 * r33
            double r39 = r39 / r37
            double r39 = r39 * r47
            double r35 = r35 / r39
            double r55 = r55 * r4
            r4 = 4708606599395016704(0x415854c140000000, double:6378245.0)
            double r4 = r4 / r33
            double r25 = java.lang.Math.cos(r25)
            double r4 = r4 * r25
            double r4 = r4 * r47
            double r55 = r55 / r4
            double r35 = r20 + r35
            double r55 = r16 + r55
            double[] r2 = new double[r3]
            double r16 = r16 * r31
            double r16 = r16 - r55
            r4 = 0
            r2[r4] = r16
            double r20 = r20 * r31
            double r20 = r20 - r35
            r4 = 1
            r2[r4] = r20
        L_0x0370:
            int r5 = r2.length
            if (r5 == r3) goto L_0x0379
            java.lang.String r1 = "coordinate transfer error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            return
        L_0x0379:
            r3 = 0
            r5 = r2[r3]
            r1.f241908f = r5
            r3 = r2[r4]
            r1.f241909g = r3
            r2 = r30
            r1.f241910h = r2
            r1.f241911i = r14
            r5 = r29
            r1.f241912j = r5
            r1.f241913n = r13
            r1.f241914o = r11
            r1.f241915p = r8
            r1.f241916q = r9
            r1.f241917r = r12
            r12 = r24
            r1.f241918s = r12
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$c r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$c
            r3 = r66
            r2.<init>(r7, r3)
            r3 = r28
            r4 = 0
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r3, r1, r2, r4)
            return
        L_0x03a8:
            r3 = r8
            java.lang.String r1 = "chooseMedia fail, invalid maxDuration parameter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            java.lang.String r1 = "fail:invalid maxDuration parameter"
            java.lang.String r1 = r0.mo115109j(r1)
            r7.mo109647a(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
