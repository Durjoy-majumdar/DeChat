package com.tencent.p014mm.plugin.appbrand.jsapi.advertise;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.OpenCanvasEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas */
public abstract class JsApiOpenAdCanvas<Service extends C82381f> extends C82268c<Service> {
    public static final int CTRL_INDEX = 476;
    public static final String NAME = "openADCanvas";

    /* renamed from: g */
    public String f11059g = "";

    /* renamed from: h */
    public JsApiOpenAdCanvasTask<Service> f11060h = null;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d1  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(Service r20, org.json.JSONObject r21, int r22) {
        /*
            r19 = this;
            r12 = r19
            r13 = r20
            r0 = r21
            r14 = r22
            java.lang.String r15 = "MicroMsg.JsApiOpenAdCanvas"
            java.lang.String r1 = "canvasId"
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r12.mo115109j(r0)
            r13.mo109647a(r14, r0)
            return
        L_0x0018:
            r11 = 1
            r10 = 0
            java.lang.String r2 = r0.getString(r1)     // Catch:{ JSONException -> 0x00c9 }
            r12.f11059g = r2     // Catch:{ JSONException -> 0x00c9 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ JSONException -> 0x00c9 }
            if (r2 != 0) goto L_0x00ab
            java.lang.String r2 = "0"
            java.lang.String r3 = r12.f11059g     // Catch:{ JSONException -> 0x00c9 }
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x00c9 }
            if (r2 == 0) goto L_0x0032
            goto L_0x00ab
        L_0x0032:
            java.lang.String r1 = "preLoad"
            int r6 = r0.getInt(r1)     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r1 = "noStore"
            int r7 = r0.getInt(r1)     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r1 = "openFirstSightVoice"
            int r16 = r0.optInt(r1, r10)     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r1 = "extraData"
            java.lang.String r8 = r0.getString(r1)     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r1 = "adInfoXml"
            java.lang.String r9 = r0.getString(r1)     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r1 = "canvasDynamicInfo"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ JSONException -> 0x00c9 }
            r1 = 1676(0x68c, float:2.349E-42)
            if (r6 != 0) goto L_0x0062
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ JSONException -> 0x00c9 }
            r3 = 19
            r2.mo175911u(r1, r3)     // Catch:{ JSONException -> 0x00c9 }
            goto L_0x0069
        L_0x0062:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ JSONException -> 0x00c9 }
            r3 = 20
            r2.mo175911u(r1, r3)     // Catch:{ JSONException -> 0x00c9 }
        L_0x0069:
            java.lang.String r1 = "doOpenCanvas canvasid %s, preLoad %d, noStore %d, adInfoXml %s, canvasDynamicInfo %s"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r3 = r12.f11059g     // Catch:{ JSONException -> 0x00c9 }
            r2[r10] = r3     // Catch:{ JSONException -> 0x00c9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x00c9 }
            r2[r11] = r3     // Catch:{ JSONException -> 0x00c9 }
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x00c9 }
            r2[r3] = r4     // Catch:{ JSONException -> 0x00c9 }
            r3 = 3
            r2[r3] = r9     // Catch:{ JSONException -> 0x00c9 }
            r3 = 4
            r2[r3] = r0     // Catch:{ JSONException -> 0x00c9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r2)     // Catch:{ JSONException -> 0x00c9 }
            com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask r5 = new com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r4 = r12.f11059g     // Catch:{ JSONException -> 0x00c9 }
            r1 = r5
            r2 = r19
            r3 = r20
            r17 = r4
            r4 = r22
            r18 = r15
            r15 = r5
            r5 = r17
            r10 = r16
            r11 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x00c7 }
            r12.f11060h = r15     // Catch:{ JSONException -> 0x00c7 }
            com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask<Service> r0 = r12.f11060h     // Catch:{ JSONException -> 0x00c7 }
            r0.mo114395c()     // Catch:{ JSONException -> 0x00c7 }
            r19.mo1621x(r20)     // Catch:{ JSONException -> 0x00c7 }
            goto L_0x00ee
        L_0x00ab:
            r18 = r15
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x00c7 }
            r0.<init>()     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r2 = r12.f11059g     // Catch:{ JSONException -> 0x00c7 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r1 = "fail"
            java.lang.String r0 = r12.mo115112m(r1, r0)     // Catch:{ JSONException -> 0x00c7 }
            r13.mo109647a(r14, r0)     // Catch:{ JSONException -> 0x00c7 }
            r1 = 0
            r12.mo1620w(r1)     // Catch:{ JSONException -> 0x00c5 }
            return
        L_0x00c5:
            r0 = move-exception
            goto L_0x00cd
        L_0x00c7:
            r0 = move-exception
            goto L_0x00cc
        L_0x00c9:
            r0 = move-exception
            r18 = r15
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask<Service> r2 = r12.f11060h
            if (r2 == 0) goto L_0x00d4
            r2.mo114397h()
        L_0x00d4:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r12.f11059g
            r3[r1] = r4
            java.lang.String r1 = "canvasId=%s"
            r4 = r18
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r3)
            r12.mo1620w(r2)
            java.lang.String r0 = "fail parse json error"
            java.lang.String r0 = r12.mo115109j(r0)
            r13.mo109647a(r14, r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public abstract void mo1620w(int i);

    /* renamed from: x */
    public abstract void mo1621x(Service service);

    /* renamed from: y */
    public abstract void mo1622y(Service service, Intent intent, int i);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask */
    public static class JsApiOpenAdCanvasTask<Service extends C82381f> extends MainProcessTask {
        public static final Parcelable.Creator<JsApiOpenAdCanvasTask> CREATOR = new C1585b();

        /* renamed from: f */
        public WeakReference<JsApiOpenAdCanvas<Service>> f11061f;

        /* renamed from: g */
        public WeakReference<Service> f11062g;

        /* renamed from: h */
        public int f11063h;

        /* renamed from: i */
        public String f11064i;

        /* renamed from: j */
        public int f11065j;

        /* renamed from: n */
        public int f11066n;

        /* renamed from: o */
        public int f11067o;

        /* renamed from: p */
        public String f11068p;

        /* renamed from: q */
        public String f11069q;

        /* renamed from: r */
        public String f11070r;

        /* renamed from: s */
        public String f11071s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask$a */
        public class C1584a implements Runnable {
            public C1584a() {
            }

            public void run() {
                OpenCanvasEvent openCanvasEvent = new OpenCanvasEvent();
                OpenCanvasEvent.C1103a aVar = openCanvasEvent.f9369d;
                JsApiOpenAdCanvasTask jsApiOpenAdCanvasTask = JsApiOpenAdCanvasTask.this;
                aVar.f9371a = jsApiOpenAdCanvasTask.f11064i;
                aVar.f9372b = jsApiOpenAdCanvasTask.f11068p;
                aVar.f9373c = jsApiOpenAdCanvasTask.f11065j;
                aVar.f9374d = jsApiOpenAdCanvasTask.f11066n;
                aVar.f9376f = 0;
                aVar.f9375e = 28;
                aVar.f9377g = jsApiOpenAdCanvasTask.f11069q;
                aVar.f9378h = jsApiOpenAdCanvasTask.f11071s;
                openCanvasEvent.publish();
                JsApiOpenAdCanvasTask jsApiOpenAdCanvasTask2 = JsApiOpenAdCanvasTask.this;
                jsApiOpenAdCanvasTask2.f11070r = openCanvasEvent.f9370e.f9380a;
                jsApiOpenAdCanvasTask2.mo114394b();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas$JsApiOpenAdCanvasTask$b */
        public class C1585b implements Parcelable.Creator<JsApiOpenAdCanvasTask> {
            public Object createFromParcel(Parcel parcel) {
                return new JsApiOpenAdCanvasTask(parcel);
            }

            public Object[] newArray(int i) {
                return new JsApiOpenAdCanvasTask[i];
            }
        }

        public JsApiOpenAdCanvasTask(JsApiOpenAdCanvas<Service> jsApiOpenAdCanvas, Service service, int i, String str, int i2, int i3, String str2, String str3, int i4, String str4) {
            this.f11061f = new WeakReference<>(jsApiOpenAdCanvas);
            this.f11062g = new WeakReference<>(service);
            this.f11063h = i;
            this.f11064i = str;
            this.f11065j = i2;
            this.f11066n = i3;
            this.f11068p = str2;
            this.f11069q = str3;
            this.f11067o = i4;
            this.f11071s = str4;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11064i = parcel.readString();
            this.f11065j = parcel.readInt();
            this.f11066n = parcel.readInt();
            this.f11068p = parcel.readString();
            this.f11069q = parcel.readString();
            this.f11070r = parcel.readString();
            this.f11067o = parcel.readInt();
            this.f11071s = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            JsApiOpenAdCanvas jsApiOpenAdCanvas = this.f11061f.get();
            C82381f fVar = (C82381f) this.f11062g.get();
            if (jsApiOpenAdCanvas == null || fVar == null) {
                Log.m105920e("MicroMsg.JsApiOpenAdCanvas", "hy: lost context!!");
                return;
            }
            String str = this.f11070r;
            int i = this.f11065j;
            boolean z = true;
            if (i == 0) {
                Intent intent = new Intent();
                if (str == null) {
                    str = "";
                }
                intent.putExtra("sns_landing_pages_xml", str);
                intent.putExtra("sns_landing_pages_pageid", Util.safeParseLong(this.f11064i));
                intent.putExtra("sns_landig_pages_from_source", 28);
                intent.putExtra("sns_landing_pages_extra", this.f11068p);
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                intent.putExtra("sns_landing_pages_no_store", this.f11066n);
                intent.putExtra("sns_landing_pages_ad_info", this.f11069q);
                if (this.f11067o != 1) {
                    z = false;
                }
                intent.putExtra("sns_landing_is_native_sight_ad", z);
                intent.putExtra("sns_landing_page_canvas_dynamicinfo", this.f11071s);
                jsApiOpenAdCanvas.mo1622y(fVar, intent, this.f11063h);
            } else if (i == 1) {
                fVar.mo109647a(this.f11063h, jsApiOpenAdCanvas.mo115109j("ok"));
            } else {
                fVar.mo109647a(this.f11063h, jsApiOpenAdCanvas.mo115109j("fail"));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            ThreadPool.post(new C1584a(), "JsApiOpenAdCanvas");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11064i);
            parcel.writeInt(this.f11065j);
            parcel.writeInt(this.f11066n);
            parcel.writeString(this.f11068p);
            parcel.writeString(this.f11069q);
            parcel.writeString(this.f11070r);
            parcel.writeInt(this.f11067o);
            parcel.writeString(this.f11071s);
        }

        public JsApiOpenAdCanvasTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
