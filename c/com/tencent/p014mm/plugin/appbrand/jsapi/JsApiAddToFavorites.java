package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import kr0.C88267e;
import org.json.JSONObject;
import p547hb.C87464c;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites */
public class JsApiAddToFavorites extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 800;
    public static final String NAME = "addToFavorites";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest */
    public static final class IPCFavRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final Parcelable.Creator<IPCFavRequest> CREATOR = new C81979a();

        /* renamed from: d */
        public String f240382d;

        /* renamed from: e */
        public String f240383e;

        /* renamed from: f */
        public String f240384f;

        /* renamed from: g */
        public String f240385g;

        /* renamed from: h */
        public int f240386h;

        /* renamed from: i */
        public int f240387i;

        /* renamed from: j */
        public String f240388j;

        /* renamed from: n */
        public String f240389n;

        /* renamed from: o */
        public int f240390o;

        /* renamed from: p */
        public int f240391p;

        /* renamed from: q */
        public int f240392q;

        /* renamed from: r */
        public String f240393r;

        /* renamed from: s */
        public int f240394s;

        /* renamed from: t */
        public boolean f240395t;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest$a */
        public class C81979a implements Parcelable.Creator<IPCFavRequest> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCFavRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCFavRequest[i];
            }
        }

        public IPCFavRequest() {
        }

        public int describeContents() {
            return 0;
        }

        public Class<? extends AppBrandProxyUIProcessTask> getTaskClass() {
            return JsApiAddToFavorites$$b.class;
        }

        public boolean useLandscape() {
            return this.f240395t;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240382d);
            parcel.writeString(this.f240383e);
            parcel.writeString(this.f240384f);
            parcel.writeString(this.f240385g);
            parcel.writeInt(this.f240386h);
            parcel.writeInt(this.f240387i);
            parcel.writeString(this.f240388j);
            parcel.writeString(this.f240389n);
            parcel.writeInt(this.f240390o);
            parcel.writeInt(this.f240391p);
            parcel.writeInt(this.f240392q);
            parcel.writeString(this.f240393r);
            parcel.writeInt(this.f240394s);
            parcel.writeInt(this.f240395t ? 1 : 0);
        }

        public IPCFavRequest(Parcel parcel) {
            this.f240382d = parcel.readString();
            this.f240383e = parcel.readString();
            this.f240384f = parcel.readString();
            this.f240385g = parcel.readString();
            this.f240386h = parcel.readInt();
            this.f240387i = parcel.readInt();
            this.f240388j = parcel.readString();
            this.f240389n = parcel.readString();
            this.f240390o = parcel.readInt();
            this.f240391p = parcel.readInt();
            this.f240392q = parcel.readInt();
            this.f240393r = parcel.readString();
            this.f240394s = parcel.readInt();
            this.f240395t = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult */
    public static final class IPCFavResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final Parcelable.Creator<IPCFavResult> CREATOR = new C81980a();

        /* renamed from: d */
        public int f240396d;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult$a */
        public class C81980a implements Parcelable.Creator<IPCFavResult> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCFavResult(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCFavResult[i];
            }
        }

        public IPCFavResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
            this.f240396d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f240396d);
        }

        public IPCFavResult(Parcel parcel) {
            this.f240396d = parcel.readInt();
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString2 = jSONObject.optString("path");
        String optString3 = jSONObject.optString("imageUrl");
        boolean optBoolean = jSONObject.optBoolean("disableForward", false);
        int optInt = jSONObject.optInt("cardSubType", 0);
        C83928t1 M0 = eVar.mo114341l0();
        C83928t1 t1Var = M0;
        C82523h1 h1Var = new C82523h1(this, t1Var, optString2, optString, optBoolean, optInt, C90595a.m113498b(C79778e.C79780b.f233803n, eVar.f240292z.getOrientationHandler().mo109917a()), i);
        if (Util.isNullOrNil(optString3)) {
            Log.m105924i("MicroMsg.JsApiAddToFavorites", "loadThumbFromSnapShot");
            C81415h0 fileSystem = M0.getFileSystem();
            C86009m1 allocTempFile = fileSystem.allocTempFile("addFavoriteSnapShot_" + System.currentTimeMillis());
            if (allocTempFile == null) {
                Log.m105920e("MicroMsg.JsApiAddToFavorites", "loadThumbFromSnapShot failed for allocTempFile");
                h1Var.mo1966a((String) null);
                return;
            }
            String i2 = allocTempFile.mo119971i();
            C87464c cVar = (C87464c) M0.mo116150E0(C87464c.class);
            if (cVar != null) {
                try {
                    mo114415w(h1Var, M0, cVar.mo111251c().getMagicBrush().f235098n.mo123492a(cVar.mo111251c().getVirtualElementId(), -1, true, 2500), i2);
                } catch (NullPointerException e) {
                    Log.printErrStackTrace("MicroMsg.JsApiAddToFavorites", e, "hy: can not get snapshot!", new Object[0]);
                    h1Var.mo1966a("");
                }
            } else {
                C2039g2.m1988b(new JsApiAddToFavorites$$a(this, M0, h1Var, i2));
            }
        } else {
            C84795y.m104477c(M0, optString3, (String) null, h1Var);
        }
    }

    /* renamed from: w */
    public final void mo114415w(C84795y.C40572a aVar, C83780d1 d1Var, Bitmap bitmap, String str) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str, true);
                    Log.m105925i("MicroMsg.JsApiAddToFavorites", "saveFile(appId : %s, pageView : %s, saveFileCost : %sms)", d1Var.getAppId(), Integer.valueOf(d1Var.hashCode()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    aVar.mo1966a(str);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    bitmap.recycle();
                    return;
                }
            } catch (Exception e) {
                Log.m105929w("MicroMsg.JsApiAddToFavorites", "save temp bitmap to file failed, . exception : %s", e);
                aVar.mo1966a("");
                if (bitmap == null || bitmap.isRecycled()) {
                    return;
                }
            } catch (Throwable th) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                throw th;
            }
        }
        Log.m105928w("MicroMsg.JsApiAddToFavorites", "snapshot can not be taken");
        aVar.mo1966a("");
    }
}
