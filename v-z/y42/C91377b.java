package y42;

import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30208m0;
import com.tencent.p014mm.plugin.magicbrush.C85256f0;
import com.tencent.p014mm.plugin.magicbrush.api.IMBNetworkService;
import com.tencent.p014mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnDownloadTaskStateChange;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import d42.C86176d0;
import d42.C86184l;
import di3.C86312j;
import e42.C7596h;
import e42.C7597n;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Map;
import js0.C9514m;
import org.json.JSONObject;
import x42.C91140b;

/* renamed from: y42.b */
public final class C91377b extends C91140b {

    /* renamed from: d */
    public final String f262068d = "MBJsApiCreateDownloadTask";

    /* renamed from: y42.b$a */
    public static final class C91378a implements C86176d0 {

        /* renamed from: a */
        public JSONObject f262069a;

        /* renamed from: b */
        public final /* synthetic */ C91377b f262070b;

        /* renamed from: c */
        public final /* synthetic */ String f262071c;

        /* renamed from: d */
        public final /* synthetic */ String f262072d;

        /* renamed from: e */
        public final /* synthetic */ String f262073e;

        public C91378a(C91377b bVar, String str, String str2, String str3) {
            this.f262070b = bVar;
            this.f262071c = str;
            this.f262072d = str2;
            this.f262073e = str3;
        }

        /* renamed from: a */
        public void mo120571a(JSONObject jSONObject, int i) {
            if (jSONObject != null) {
                this.f262069a = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("downloadTaskId", this.f262072d);
                jSONObject2.put("state", "headersReceived");
                jSONObject2.put("header", this.f262069a);
                String jSONObject3 = jSONObject2.toString();
                C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …             }.toString()");
                C91377b bVar = this.f262070b;
                MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new MBJsEventOnDownloadTaskStateChange();
                mBJsEventOnDownloadTaskStateChange.f81582e = jSONObject3;
                bVar.mo125211r(mBJsEventOnDownloadTaskStateChange);
            }
        }

        /* renamed from: b */
        public void mo120572b(int i, String str, String str2, Map<Object, Object> map) {
            if (!C91377b.m114638s(this.f262070b, this.f262071c, this.f262072d)) {
                this.f262070b.mo125347t(this.f262071c, this.f262072d, i, str);
            }
        }

        /* renamed from: c */
        public void mo120573c(int i, String str, Object obj, JSONObject jSONObject, Map<Object, Object> map, Map<Object, Object> map2, Map<Object, Object> map3) {
            String str2;
            String str3;
            Map<Object, Object> map4 = map;
            Map<Object, Object> map5 = map2;
            T t = C81410b0.OK;
            C81415h0 j702 = ((C30208m0) C86312j.m106911c(C30208m0.class)).j70(this.f262070b.mo120841d().f26666a);
            if (j702 == null) {
                this.f262070b.mo125347t(this.f262071c, this.f262072d, 303304, "fail:get file system error");
                return;
            }
            Object obj2 = map4 != null ? map4.get(FFmpegMetadataRetriever.METADATA_KEY_FILENAME) : null;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj2;
            Object obj3 = map4 != null ? map4.get("mimeType") : null;
            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str5 = (String) obj3;
            Object obj4 = map4 != null ? map4.get("dataLength") : null;
            C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj4).longValue();
            Object obj5 = map4 != null ? map4.get("statusCode") : null;
            C87412m.m108592e(obj5, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj5).intValue();
            boolean isNullOrNil = Util.isNullOrNil(this.f262073e);
            String str6 = str5;
            String str7 = "JSONObject().apply {\n   …             }.toString()";
            String str8 = Scopes.PROFILE;
            if (!isNullOrNil) {
                C91377b bVar = this.f262070b;
                C86009m1 m1Var = new C86009m1(str4);
                String str9 = this.f262073e;
                C87412m.m108593f(str9, "dstPath");
                bVar.getClass();
                if (!m1Var.mo119967g()) {
                    str3 = "fail:file not exists";
                    str2 = "header";
                } else {
                    T isdir = j702.isdir(str9);
                    str2 = "header";
                    C87412m.m108593f(isdir, "fs.isdir(dstPath)");
                    if (isdir != t) {
                        try {
                            isdir = j702.saveFile(m1Var, str9, new C9514m());
                            C87412m.m108593f(isdir, "fs.saveFile(srcFile, dstPath, pRetPath)");
                        } catch (Exception e) {
                            str3 = "fail:writeFile exception: " + e;
                        }
                    }
                    int ordinal = isdir.ordinal();
                    if (ordinal == 0) {
                        str3 = "ok";
                    } else if (ordinal == 9) {
                        str3 = String.format("fail illegal operation on a directory, open \"%s\"", Arrays.copyOf(new Object[]{str9}, 1));
                        C87412m.m108593f(str3, "format(format, *args)");
                    } else if (ordinal == 15) {
                        str3 = "fail the maximum size of the file storage limit is exceeded";
                    } else if (ordinal == 3) {
                        str3 = String.format("fail no such file or directory \"%s\"", Arrays.copyOf(new Object[]{str9}, 1));
                        C87412m.m108593f(str3, "format(format, *args)");
                    } else if (ordinal != 4) {
                        str3 = "fail " + isdir.name();
                    } else {
                        str3 = String.format("fail permission denied, open \"%s\"", Arrays.copyOf(new Object[]{str9}, 1));
                        C87412m.m108593f(str3, "format(format, *args)");
                    }
                }
                if (C87412m.m108589b("ok", str3)) {
                    Log.m105925i(this.f262070b.f262068d, "onDownloadResultWithCode filePath %s", this.f262073e);
                    JSONObject jSONObject2 = new JSONObject();
                    String str10 = this.f262072d;
                    String str11 = this.f262073e;
                    jSONObject2.put("downloadTaskId", str10);
                    jSONObject2.put("state", "success");
                    jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str11);
                    jSONObject2.put("dataLength", longValue);
                    jSONObject2.put("statusCode", intValue);
                    JSONObject jSONObject3 = this.f262069a;
                    if (jSONObject3 != null) {
                        jSONObject2.put(str2, jSONObject3);
                    }
                    Map<Object, Object> map6 = map2;
                    if (map6 != null && (!map2.isEmpty())) {
                        jSONObject2.put(str8, map6);
                    }
                    String jSONObject4 = jSONObject2.toString();
                    C87412m.m108593f(jSONObject4, str7);
                    C91377b bVar2 = this.f262070b;
                    MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new MBJsEventOnDownloadTaskStateChange();
                    mBJsEventOnDownloadTaskStateChange.f81582e = jSONObject4;
                    bVar2.mo125211r(mBJsEventOnDownloadTaskStateChange);
                } else if (!C91377b.m114638s(this.f262070b, this.f262071c, this.f262072d)) {
                    this.f262070b.mo125347t(this.f262071c, this.f262072d, 303300, "fail:download save file error");
                }
            } else {
                String str12 = str7;
                String str13 = str8;
                C9514m mVar = new C9514m();
                this.f262070b.getClass();
                String extByMimeType = MimeTypeUtil.getExtByMimeType(str6);
                String str14 = (!Util.isNullOrNil(extByMimeType) || !C87412m.m108589b(MimeTypes.AUDIO_MP4, str6)) ? extByMimeType : "mp4";
                C9514m mVar2 = new C9514m();
                String str15 = "header";
                T createTempFileFrom = j702.createTempFileFrom(new C86009m1(str4), str14, true, mVar2);
                C87412m.m108593f(createTempFileFrom, "fs.createTempFileFrom(VF…h), fileExt, true, pPath)");
                mVar.f29691a = createTempFileFrom;
                String str16 = createTempFileFrom != t ? null : (String) mVar2.f29691a;
                if (str16 != null) {
                    Log.m105925i(this.f262070b.f262068d, "onDownloadResultWithCode localId %s", str16);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("downloadTaskId", this.f262072d);
                    jSONObject5.put("state", "success");
                    jSONObject5.put("tempFilePath", str16);
                    jSONObject5.put("dataLength", longValue);
                    jSONObject5.put("statusCode", intValue);
                    JSONObject jSONObject6 = this.f262069a;
                    if (jSONObject6 != null) {
                        jSONObject5.put(str15, jSONObject6);
                    }
                    Map<Object, Object> map7 = map2;
                    if (map7 != null && (!map2.isEmpty())) {
                        jSONObject5.put(str8, map7);
                    }
                    String jSONObject7 = jSONObject5.toString();
                    C87412m.m108593f(jSONObject7, str12);
                    C91377b bVar3 = this.f262070b;
                    MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange2 = new MBJsEventOnDownloadTaskStateChange();
                    mBJsEventOnDownloadTaskStateChange2.f81582e = jSONObject7;
                    bVar3.mo125211r(mBJsEventOnDownloadTaskStateChange2);
                } else if (!C91377b.m114638s(this.f262070b, this.f262071c, this.f262072d)) {
                    this.f262070b.mo125347t(this.f262071c, this.f262072d, 303300, mVar.f29691a == C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail");
                }
            }
        }

        /* renamed from: d */
        public void mo120574d(int i, long j, long j2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("downloadTaskId", this.f262072d);
            jSONObject.put("state", "progressUpdate");
            jSONObject.put("progress", i);
            jSONObject.put("totalBytesWritten", j);
            jSONObject.put("totalBytesExpectedToWrite", j2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            C91377b bVar = this.f262070b;
            MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new MBJsEventOnDownloadTaskStateChange();
            mBJsEventOnDownloadTaskStateChange.f81582e = jSONObject2;
            bVar.mo125211r(mBJsEventOnDownloadTaskStateChange);
        }
    }

    /* renamed from: s */
    public static final boolean m114638s(C91377b bVar, String str, String str2) {
        bVar.getClass();
        C86184l r3 = ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118377r3(str, IMBNetworkService.Key.Download);
        if (r3 == null || !r3.mo120592d(str2)) {
            return false;
        }
        Log.m105925i(bVar.f262068d, "download abort %s", str2);
        return true;
    }

    /* renamed from: a */
    public String mo125208a() {
        return "downloadTaskId";
    }

    /* renamed from: c */
    public void mo125209c(C7596h hVar, String str, String str2, String str3) {
        C87412m.m108594g(hVar, "data");
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(str3, "bizName");
        String optString = hVar.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        int optInt = hVar.optInt("timeout", CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        String str4 = this.f262068d;
        Log.m105924i(str4, "bizName:" + str3 + ",configTimeout:" + optInt + ",url:" + str2 + ",dstPath:" + optString);
        C86184l r3 = ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118377r3(str3, IMBNetworkService.Key.Download);
        if (r3 != null) {
            r3.mo120590b((C7597n) this.f251227a, str3, hVar, optInt, str, "createDownloadTask", new C91378a(this, str3, str, optString));
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "createDownloadTask";
    }

    public String getTaskId() {
        return ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118376NQ(IMBNetworkService.Key.Download);
    }

    /* renamed from: t */
    public final void mo125347t(String str, String str2, int i, String str3) {
        C87412m.m108594g(str, "bizName");
        Log.m105929w(this.f262068d, "sendFailMsg, bizName = %s, downloadTaskId = %s, errno = %d, errMsg = %s", str, str2, Integer.valueOf(i), str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("downloadTaskId", str2);
        jSONObject.put("state", "fail");
        jSONObject.put("errno", i);
        jSONObject.put("errMsg", str3);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …Msg)\n        }.toString()");
        MBJsEventOnDownloadTaskStateChange mBJsEventOnDownloadTaskStateChange = new MBJsEventOnDownloadTaskStateChange();
        mBJsEventOnDownloadTaskStateChange.f81582e = jSONObject2;
        mo125211r(mBJsEventOnDownloadTaskStateChange);
    }
}
