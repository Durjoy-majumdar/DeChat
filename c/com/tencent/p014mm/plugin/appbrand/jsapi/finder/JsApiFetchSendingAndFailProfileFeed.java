package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;
import java.util.List;
import o40.C61937h;
import org.json.JSONArray;
import org.json.JSONObject;
import p749xh.C66261f3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed */
public class JsApiFetchSendingAndFailProfileFeed extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "fetchSendingAndFailProfileFeed";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.Finder.JsApiFetchSendingAndFailProfileFeed", "JsApiFetchSendingAndFailProfileFeed");
        new FetchSendingAndFailProfileFeedTask(i, (C81925i2) fVar).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask */
    public static class FetchSendingAndFailProfileFeedTask extends MainProcessTask {
        public static final Parcelable.Creator<FetchSendingAndFailProfileFeedTask> CREATOR = new C1686a();

        /* renamed from: f */
        public int f11369f;

        /* renamed from: g */
        public C81925i2 f11370g;

        /* renamed from: h */
        public String f11371h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask$a */
        public class C1686a implements Parcelable.Creator<FetchSendingAndFailProfileFeedTask> {
            public Object createFromParcel(Parcel parcel) {
                return new FetchSendingAndFailProfileFeedTask(parcel);
            }

            public Object[] newArray(int i) {
                return new FetchSendingAndFailProfileFeedTask[i];
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed$FetchSendingAndFailProfileFeedTask$b */
        public class C1687b implements Runnable {
            public C1687b() {
            }

            public void run() {
                List<C66261f3> Hw0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Hw0();
                JSONArray jSONArray = new JSONArray();
                for (C66261f3 next : Hw0) {
                    FinderObject finderObject = next.field_finderObject;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        C61937h.m72704c(finderObject, jSONObject);
                        jSONObject.put("status", next.field_localFlag);
                        jSONObject.put("feedLocalId", String.valueOf(next.systemRowid));
                        jSONArray.put(jSONObject);
                    } catch (Exception unused) {
                    }
                }
                FetchSendingAndFailProfileFeedTask fetchSendingAndFailProfileFeedTask = FetchSendingAndFailProfileFeedTask.this;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errMsg", "");
                    jSONObject2.put("errCode", 0);
                    jSONObject2.put("data", jSONArray);
                } catch (Exception unused2) {
                }
                fetchSendingAndFailProfileFeedTask.f11371h = jSONObject2.toString();
                FetchSendingAndFailProfileFeedTask.this.mo114394b();
            }
        }

        public FetchSendingAndFailProfileFeedTask(int i, C81925i2 i2Var) {
            this.f11369f = i;
            this.f11370g = i2Var;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11371h = parcel.readString();
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3 A[Catch:{ Exception -> 0x00c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00ad A[SYNTHETIC] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1552i() {
            /*
                r18 = this;
                r1 = r18
                java.lang.String r2 = "data"
                com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
                java.lang.String r3 = "thumbUrl"
                java.lang.String r4 = "url"
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r7 = r1.f11371h     // Catch:{ Exception -> 0x00c3 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x00c3 }
                org.json.JSONArray r7 = r6.optJSONArray(r2)     // Catch:{ Exception -> 0x00c3 }
                if (r7 == 0) goto L_0x00bc
                r8 = 0
            L_0x001a:
                int r9 = r7.length()     // Catch:{ Exception -> 0x00c3 }
                if (r8 >= r9) goto L_0x00bc
                org.json.JSONObject r9 = r7.optJSONObject(r8)     // Catch:{ Exception -> 0x00c3 }
                if (r9 == 0) goto L_0x00b4
                java.lang.String r10 = "objectDesc"
                org.json.JSONObject r9 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x00c3 }
                if (r9 == 0) goto L_0x00b4
                java.lang.String r10 = "media"
                org.json.JSONArray r9 = r9.optJSONArray(r10)     // Catch:{ Exception -> 0x00c3 }
                if (r9 == 0) goto L_0x00b4
                r10 = 0
            L_0x0037:
                int r11 = r9.length()     // Catch:{ Exception -> 0x00c3 }
                if (r10 >= r11) goto L_0x00b4
                org.json.JSONObject r11 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x00c3 }
                if (r11 == 0) goto L_0x00a9
                java.lang.String r12 = r11.optString(r4)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r13 = r11.optString(r3)     // Catch:{ Exception -> 0x00c3 }
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r15 = "http"
                if (r14 != 0) goto L_0x007b
                boolean r14 = r12.startsWith(r15)     // Catch:{ Exception -> 0x00c3 }
                if (r14 != 0) goto L_0x007b
                js0.m r14 = new js0.m     // Catch:{ Exception -> 0x00c3 }
                r14.<init>()     // Catch:{ Exception -> 0x00c3 }
                com.tencent.mm.plugin.appbrand.i2 r5 = r1.f11370g     // Catch:{ Exception -> 0x00c3 }
                com.tencent.mm.plugin.appbrand.appstorage.h0 r5 = r5.getFileSystem()     // Catch:{ Exception -> 0x00c3 }
                r16 = r7
                com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00c3 }
                r7.<init>((java.lang.String) r12)     // Catch:{ Exception -> 0x00c3 }
                r17 = r9
                r9 = 0
                r12 = 0
                com.tencent.mm.plugin.appbrand.appstorage.b0 r5 = r5.createTempFileFrom(r7, r12, r9, r14)     // Catch:{ Exception -> 0x00c3 }
                if (r5 != r0) goto L_0x007f
                T r5 = r14.f29691a     // Catch:{ Exception -> 0x00c3 }
                r11.put(r4, r5)     // Catch:{ Exception -> 0x00c3 }
                goto L_0x007f
            L_0x007b:
                r16 = r7
                r17 = r9
            L_0x007f:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ Exception -> 0x00c3 }
                if (r5 != 0) goto L_0x00ad
                boolean r5 = r13.startsWith(r15)     // Catch:{ Exception -> 0x00c3 }
                if (r5 != 0) goto L_0x00ad
                js0.m r5 = new js0.m     // Catch:{ Exception -> 0x00c3 }
                r5.<init>()     // Catch:{ Exception -> 0x00c3 }
                com.tencent.mm.plugin.appbrand.i2 r7 = r1.f11370g     // Catch:{ Exception -> 0x00c3 }
                com.tencent.mm.plugin.appbrand.appstorage.h0 r7 = r7.getFileSystem()     // Catch:{ Exception -> 0x00c3 }
                com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00c3 }
                r9.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x00c3 }
                r12 = 0
                r13 = 0
                com.tencent.mm.plugin.appbrand.appstorage.b0 r7 = r7.createTempFileFrom(r9, r12, r13, r5)     // Catch:{ Exception -> 0x00c3 }
                if (r7 != r0) goto L_0x00ad
                T r5 = r5.f29691a     // Catch:{ Exception -> 0x00c3 }
                r11.put(r3, r5)     // Catch:{ Exception -> 0x00c3 }
                goto L_0x00ad
            L_0x00a9:
                r16 = r7
                r17 = r9
            L_0x00ad:
                int r10 = r10 + 1
                r7 = r16
                r9 = r17
                goto L_0x0037
            L_0x00b4:
                r16 = r7
                int r8 = r8 + 1
                r7 = r16
                goto L_0x001a
            L_0x00bc:
                java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x00c3 }
                r1.f11371h = r0     // Catch:{ Exception -> 0x00c3 }
                goto L_0x00e6
            L_0x00c3:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                r3 = -1
                org.json.JSONArray r4 = new org.json.JSONArray
                r4.<init>()
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r6 = "errMsg"
                r5.put(r6, r0)     // Catch:{ Exception -> 0x00e0 }
                java.lang.String r0 = "errCode"
                r5.put(r0, r3)     // Catch:{ Exception -> 0x00e0 }
                r5.put(r2, r4)     // Catch:{ Exception -> 0x00e0 }
            L_0x00e0:
                java.lang.String r0 = r5.toString()
                r1.f11371h = r0
            L_0x00e6:
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.mm.plugin.appbrand.i2 r2 = r1.f11370g
                java.lang.String r2 = r2.getAppId()
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = r1.f11371h
                r3 = 1
                r0[r3] = r2
                r2 = 2
                int r3 = r1.f11369f
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                r2 = 3
                com.tencent.mm.plugin.appbrand.i2 r3 = r1.f11370g
                boolean r3 = r3.isRunning()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0[r2] = r3
                java.lang.String r2 = "MicroMsg.Finder.JsApiFetchSendingAndFailProfileFeed"
                java.lang.String r3 = "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
                com.tencent.mm.plugin.appbrand.i2 r0 = r1.f11370g
                int r2 = r1.f11369f
                java.lang.String r3 = r1.f11371h
                r0.mo109647a(r2, r3)
                r18.mo114397h()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiFetchSendingAndFailProfileFeed.FetchSendingAndFailProfileFeedTask.mo1552i():void");
        }

        /* renamed from: j */
        public void mo1553j() {
            ((C119157j) C119157j.f356862d).mo183876g(new C1687b(), "JsApiFetchSendingAndFailProfileFeed");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11371h);
        }

        public FetchSendingAndFailProfileFeedTask(Parcel parcel) {
            this.f11371h = parcel.readString();
        }
    }
}
