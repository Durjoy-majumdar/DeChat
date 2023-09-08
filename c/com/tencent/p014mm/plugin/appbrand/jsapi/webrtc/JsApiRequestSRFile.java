package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.webrtc.C1902l;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONObject;
import p156gj.C87203t;
import p237sp.C13754y;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile */
public final class JsApiRequestSRFile extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 1206;
    public static final String NAME = "requestSRFile";

    /* renamed from: g */
    public String f11740g = "";

    /* renamed from: h */
    public String f11741h = "";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadInfo;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo */
    public static final class GetDownloadInfo implements Parcelable {
        public static final Parcelable.Creator<GetDownloadInfo> CREATOR = new C1896a();

        /* renamed from: d */
        public final String f11742d;

        /* renamed from: e */
        public final String f11743e;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadInfo$a */
        public static final class C1896a implements Parcelable.Creator<GetDownloadInfo> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new GetDownloadInfo(parcel.readString(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new GetDownloadInfo[i];
            }
        }

        public GetDownloadInfo(String str, String str2) {
            C87412m.m108594g(str, "cdnUrl");
            C87412m.m108594g(str2, "fileMd5");
            this.f11742d = str;
            this.f11743e = str2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeString(this.f11742d);
            parcel.writeString(this.f11743e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadStatus;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadStatus */
    public static final class GetDownloadStatus implements Parcelable {
        public static final Parcelable.Creator<GetDownloadStatus> CREATOR = new C1897a();

        /* renamed from: d */
        public final int f11744d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$GetDownloadStatus$a */
        public static final class C1897a implements Parcelable.Creator<GetDownloadStatus> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new GetDownloadStatus(parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new GetDownloadStatus[i];
            }
        }

        public GetDownloadStatus(int i) {
            this.f11744d = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f11744d);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadInfo;", "Lcom/tencent/mm/plugin/appbrand/jsapi/webrtc/JsApiRequestSRFile$GetDownloadStatus;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.JsApiRequestSRFile$a */
    public static final class C1898a implements C80883e<GetDownloadInfo, GetDownloadStatus> {
        public void invoke(Object obj, C1256g gVar) {
            GetDownloadInfo getDownloadInfo = (GetDownloadInfo) obj;
            C87412m.m108594g(getDownloadInfo, "data");
            C1902l lVar = C1902l.INSTANCE;
            String str = getDownloadInfo.f11742d;
            String str2 = getDownloadInfo.f11743e;
            C1900g gVar2 = new C1900g(gVar);
            lVar.getClass();
            C40939n nVar = new C40939n((C40939n.C2206a) null);
            nVar.f110176a = str;
            nVar.f110179d = str2;
            nVar.f110181f = 2;
            nVar.f110185j = false;
            if (((ConcurrentHashMap) lVar.f11752e).containsKey(str)) {
                Log.m105924i("MicroMsg.SRDownloadFile", str + " is downloading");
                gVar2.mo1794a(5);
                return;
            }
            long b = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
            C1902l.C1904b bVar = new C1902l.C1904b(lVar, str, str2, gVar2);
            ((ConcurrentHashMap) lVar.f11751d).put(Long.valueOf(b), bVar);
            ((ConcurrentHashMap) lVar.f11752e).put(str, bVar);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.JsApiRequestSRFile", "invoke, env is null");
            return;
        }
        if (C87203t.m108279o()) {
            this.f11740g = "https://mmgame.qpic.cn/h5/minigame/cloudgame/arm64-v8a.zip";
            this.f11741h = "1ac39c1bb2d8db344b671a40401c4b9a";
        } else {
            this.f11740g = "https://mmgame.qpic.cn/h5/minigame/cloudgame/armeabi-v7a.zip";
            this.f11741h = "da7b68479bd4bd7b510bb66105e65795";
        }
        String str = this.f11740g;
        String str2 = this.f11741h;
        C87412m.m108594g(str, "cdnUrl");
        C87412m.m108594g(str2, "fileMd5");
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GetDownloadInfo(str, str2), C1898a.class, new C1901h(fVar, i, this));
    }
}
