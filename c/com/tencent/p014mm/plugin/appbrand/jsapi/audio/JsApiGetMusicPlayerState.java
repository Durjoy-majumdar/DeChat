package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.HashMap;
import org.json.JSONObject;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12155j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState */
public class JsApiGetMusicPlayerState extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 46;
    public static final String NAME = "getMusicPlayerState";

    /* renamed from: g */
    public GetMusicPlayerState f240515g;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        GetMusicPlayerState getMusicPlayerState = new GetMusicPlayerState(this, fVar, i);
        this.f240515g = getMusicPlayerState;
        getMusicPlayerState.f240519i = fVar.getAppId();
        this.f240515g.mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState */
    public static class GetMusicPlayerState extends MainProcessTask {
        public static final Parcelable.Creator<GetMusicPlayerState> CREATOR = new C82029a();

        /* renamed from: f */
        public C82870p f240516f;

        /* renamed from: g */
        public C82381f f240517g;

        /* renamed from: h */
        public int f240518h;

        /* renamed from: i */
        public String f240519i;

        /* renamed from: j */
        public boolean f240520j = false;

        /* renamed from: n */
        public int f240521n;

        /* renamed from: o */
        public int f240522o;

        /* renamed from: p */
        public int f240523p;

        /* renamed from: q */
        public int f240524q;

        /* renamed from: r */
        public String f240525r;

        /* renamed from: s */
        public String f240526s;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState$a */
        public class C82029a implements Parcelable.Creator<GetMusicPlayerState> {
            public Object createFromParcel(Parcel parcel) {
                return new GetMusicPlayerState(parcel);
            }

            public Object[] newArray(int i) {
                return new GetMusicPlayerState[i];
            }
        }

        public GetMusicPlayerState(C82870p pVar, C82381f fVar, int i) {
            this.f240516f = pVar;
            this.f240517g = fVar;
            this.f240518h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240519i = parcel.readString();
            this.f240520j = parcel.readByte() != 0;
            this.f240521n = parcel.readInt();
            this.f240522o = parcel.readInt();
            this.f240523p = parcel.readInt();
            this.f240524q = parcel.readInt();
            this.f240525r = parcel.readString();
            this.f240526s = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            String str;
            String str2;
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Integer.valueOf(this.f240521n));
            hashMap.put("currentPosition", Integer.valueOf(this.f240522o));
            hashMap.put("status", Integer.valueOf(this.f240523p));
            hashMap.put("downloadPercent", Integer.valueOf(this.f240524q));
            hashMap.put("dataUrl", this.f240525r);
            C82381f fVar = this.f240517g;
            int i = this.f240518h;
            C82870p pVar = this.f240516f;
            if (this.f240520j) {
                StringBuilder sb = new StringBuilder();
                sb.append("fail");
                if (TextUtils.isEmpty(this.f240526s)) {
                    str2 = "";
                } else {
                    str2 = XVFSFile.PATH_SEPARATOR + this.f240526s;
                }
                sb.append(str2);
                str = sb.toString();
            } else {
                str = "ok";
            }
            fVar.mo109647a(i, pVar.mo115112m(str, hashMap));
        }

        /* renamed from: j */
        public void mo1553j() {
            int i;
            String str = C83613a.C83615b.f244198a.f244191a;
            if (Util.isNullOrNil(str) || str.equals(this.f240519i)) {
                C101106m b = C101093a.m132480b();
                if (b != null) {
                    C12155j a = C101093a.m132479a();
                    int i2 = -1;
                    if (a != null) {
                        i2 = a.f35260a;
                        i = a.f35261b;
                        this.f240523p = a.f35262c;
                        this.f240524q = a.f35263d;
                    } else {
                        i = -1;
                    }
                    this.f240521n = i2 / 1000;
                    this.f240522o = i / 1000;
                    this.f240525r = b.f295966n;
                    this.f240526s = "";
                    this.f240520j = false;
                } else {
                    this.f240523p = 2;
                    this.f240526s = "";
                    this.f240520j = false;
                }
                Log.m105925i("MicroMsg.JsApiGetMusicPlayerState", "duration %d , position %d ,status %s , downloadpercent %d , dataurl %s", Integer.valueOf(this.f240521n), Integer.valueOf(this.f240522o), Integer.valueOf(this.f240523p), Integer.valueOf(this.f240524q), this.f240525r);
                mo114394b();
                return;
            }
            Log.m105924i("MicroMsg.JsApiGetMusicPlayerState", "appid not match cannot operate");
            this.f240520j = true;
            this.f240526s = "appid not match cannot operate";
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240519i);
            parcel.writeByte(this.f240520j ? (byte) 1 : 0);
            parcel.writeInt(this.f240521n);
            parcel.writeInt(this.f240522o);
            parcel.writeInt(this.f240523p);
            parcel.writeInt(this.f240524q);
            parcel.writeString(this.f240525r);
            parcel.writeString(this.f240526s);
        }

        public GetMusicPlayerState(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}
