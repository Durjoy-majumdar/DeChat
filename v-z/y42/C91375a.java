package y42;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30208m0;
import com.tencent.p014mm.plugin.magicbrush.C85256f0;
import com.tencent.p014mm.plugin.magicbrush.api.IMBNetworkService;
import com.tencent.p014mm.plugin.magicbrush.jsapi.network.download.MBJsEventOnCDNDownloadTaskStateChange;
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

/* renamed from: y42.a */
public final class C91375a extends C91140b {

    /* renamed from: d */
    public final String f262063d = "MBJsApiCreateCDNDownloadTask";

    /* renamed from: y42.a$a */
    public static final class C91376a implements C86176d0 {

        /* renamed from: a */
        public final /* synthetic */ C91375a f262064a;

        /* renamed from: b */
        public final /* synthetic */ String f262065b;

        /* renamed from: c */
        public final /* synthetic */ String f262066c;

        /* renamed from: d */
        public final /* synthetic */ String f262067d;

        public C91376a(C91375a aVar, String str, String str2, String str3) {
            this.f262064a = aVar;
            this.f262065b = str;
            this.f262066c = str2;
            this.f262067d = str3;
        }

        /* renamed from: a */
        public void mo120571a(JSONObject jSONObject, int i) {
        }

        /* renamed from: b */
        public void mo120572b(int i, String str, String str2, Map<Object, Object> map) {
            if (!C91375a.m114629s(this.f262064a, this.f262065b, this.f262066c)) {
                this.f262064a.mo125346t(this.f262065b, this.f262066c, i, str);
            }
        }

        /* renamed from: c */
        public void mo120573c(int i, String str, Object obj, JSONObject jSONObject, Map<Object, Object> map, Map<Object, Object> map2, Map<Object, Object> map3) {
            String str2;
            Map<Object, Object> map4 = map;
            T t = C81410b0.OK;
            C81415h0 j702 = ((C30208m0) C86312j.m106911c(C30208m0.class)).j70(this.f262064a.mo120841d().f26666a);
            if (j702 == null) {
                this.f262064a.mo125346t(this.f262065b, this.f262066c, 303304, "fail:get file system error");
                return;
            }
            Object obj2 = map4 != null ? map4.get(FFmpegMetadataRetriever.METADATA_KEY_FILENAME) : null;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj2;
            Object obj3 = map4 != null ? map4.get("mimeType") : null;
            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj3;
            Object obj4 = map4 != null ? map4.get("dataLength") : null;
            C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj4).longValue();
            if (!Util.isNullOrNil(this.f262067d)) {
                C91375a aVar = this.f262064a;
                C86009m1 m1Var = new C86009m1(str3);
                String str5 = this.f262067d;
                C87412m.m108593f(str5, "dstPath");
                aVar.getClass();
                if (!m1Var.mo119967g()) {
                    str2 = "fail:file not exists";
                } else {
                    T isdir = j702.isdir(str5);
                    C87412m.m108593f(isdir, "fs.isdir(dstPath)");
                    if (isdir != t) {
                        try {
                            isdir = j702.saveFile(m1Var, str5, new C9514m());
                            C87412m.m108593f(isdir, "fs.saveFile(srcFile, dstPath, pRetPath)");
                        } catch (Exception e) {
                            str2 = "fail:writeFile exception: " + e;
                        }
                    }
                    int ordinal = isdir.ordinal();
                    if (ordinal == 0) {
                        str2 = "ok";
                    } else if (ordinal == 9) {
                        str2 = String.format("fail illegal operation on a directory, open \"%s\"", Arrays.copyOf(new Object[]{str5}, 1));
                        C87412m.m108593f(str2, "format(format, *args)");
                    } else if (ordinal == 15) {
                        str2 = "fail the maximum size of the file storage limit is exceeded";
                    } else if (ordinal == 3) {
                        str2 = String.format("fail no such file or directory \"%s\"", Arrays.copyOf(new Object[]{str5}, 1));
                        C87412m.m108593f(str2, "format(format, *args)");
                    } else if (ordinal != 4) {
                        str2 = "fail " + isdir.name();
                    } else {
                        str2 = String.format("fail permission denied, open \"%s\"", Arrays.copyOf(new Object[]{str5}, 1));
                        C87412m.m108593f(str2, "format(format, *args)");
                    }
                }
                if (C87412m.m108589b("ok", str2)) {
                    Log.m105925i(this.f262064a.f262063d, "onDownloadResultWithCode filePath %s", this.f262067d);
                    JSONObject jSONObject2 = new JSONObject();
                    String str6 = this.f262066c;
                    String str7 = this.f262067d;
                    jSONObject2.put("downloadTaskId", str6);
                    jSONObject2.put("state", "success");
                    jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str7);
                    jSONObject2.put("dataLength", longValue);
                    String jSONObject3 = jSONObject2.toString();
                    C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …             }.toString()");
                    C91375a aVar2 = this.f262064a;
                    MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange = new MBJsEventOnCDNDownloadTaskStateChange();
                    mBJsEventOnCDNDownloadTaskStateChange.f81582e = jSONObject3;
                    aVar2.mo125211r(mBJsEventOnCDNDownloadTaskStateChange);
                } else if (!C91375a.m114629s(this.f262064a, this.f262065b, this.f262066c)) {
                    this.f262064a.mo125346t(this.f262065b, this.f262066c, 303300, "fail:download save file error");
                }
            } else {
                C9514m mVar = new C9514m();
                this.f262064a.getClass();
                String extByMimeType = MimeTypeUtil.getExtByMimeType(str4);
                if (Util.isNullOrNil(extByMimeType) && C87412m.m108589b(MimeTypes.AUDIO_MP4, str4)) {
                    extByMimeType = "mp4";
                }
                C9514m mVar2 = new C9514m();
                T createTempFileFrom = j702.createTempFileFrom(new C86009m1(str3), extByMimeType, true, mVar2);
                C87412m.m108593f(createTempFileFrom, "fs.createTempFileFrom(VF…h), fileExt, true, pPath)");
                mVar.f29691a = createTempFileFrom;
                String str8 = createTempFileFrom != t ? null : (String) mVar2.f29691a;
                if (str8 != null) {
                    Log.m105925i(this.f262064a.f262063d, "onDownloadResultWithCode localId %s", str8);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("downloadTaskId", this.f262066c);
                    jSONObject4.put("state", "success");
                    jSONObject4.put("tempFilePath", str8);
                    jSONObject4.put("dataLength", longValue);
                    String jSONObject5 = jSONObject4.toString();
                    C87412m.m108593f(jSONObject5, "JSONObject().apply {\n   …             }.toString()");
                    C91375a aVar3 = this.f262064a;
                    MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange2 = new MBJsEventOnCDNDownloadTaskStateChange();
                    mBJsEventOnCDNDownloadTaskStateChange2.f81582e = jSONObject5;
                    aVar3.mo125211r(mBJsEventOnCDNDownloadTaskStateChange2);
                } else if (!C91375a.m114629s(this.f262064a, this.f262065b, this.f262066c)) {
                    this.f262064a.mo125346t(this.f262065b, this.f262066c, 303300, mVar.f29691a == C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail");
                }
            }
        }

        /* renamed from: d */
        public void mo120574d(int i, long j, long j2) {
        }
    }

    /* renamed from: s */
    public static final boolean m114629s(C91375a aVar, String str, String str2) {
        aVar.getClass();
        C86184l r3 = ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118377r3(str, IMBNetworkService.Key.CDNDownload);
        if (r3 == null || !r3.mo120592d(str2)) {
            return false;
        }
        Log.m105925i(aVar.f262063d, "download abort %s", str2);
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
        String str4 = this.f262063d;
        Log.m105924i(str4, "bizName:" + str3 + ",configTimeout:" + optInt + ",url:" + str2 + ",dstPath:" + optString);
        C86184l r3 = ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118377r3(str3, IMBNetworkService.Key.CDNDownload);
        if (r3 != null) {
            r3.mo120590b((C7597n) this.f251227a, str3, hVar, optInt, str, "createCDNDownloadTask", new C91376a(this, str3, str, optString));
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "createCDNDownloadTask";
    }

    public String getTaskId() {
        return ((C85256f0) C86312j.m106911c(C85256f0.class)).mo118376NQ(IMBNetworkService.Key.CDNDownload);
    }

    /* renamed from: t */
    public final void mo125346t(String str, String str2, int i, String str3) {
        C87412m.m108594g(str, "bizName");
        Log.m105929w(this.f262063d, "sendFailMsg, bizName = %s, downloadTaskId = %s, errno = %d, errMsg = %s", str, str2, Integer.valueOf(i), str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("downloadTaskId", str2);
        jSONObject.put("state", "fail");
        jSONObject.put("errno", i);
        jSONObject.put("errMsg", str3);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …Msg)\n        }.toString()");
        MBJsEventOnCDNDownloadTaskStateChange mBJsEventOnCDNDownloadTaskStateChange = new MBJsEventOnCDNDownloadTaskStateChange();
        mBJsEventOnCDNDownloadTaskStateChange.f81582e = jSONObject2;
        mo125211r(mBJsEventOnCDNDownloadTaskStateChange);
    }
}
