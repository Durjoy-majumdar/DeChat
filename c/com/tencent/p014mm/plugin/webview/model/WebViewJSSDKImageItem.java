package com.tencent.p014mm.plugin.webview.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86312j;
import e00.C7577t0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem */
public class WebViewJSSDKImageItem extends WebViewJSSDKFileItem {
    public static final Parcelable.Creator<WebViewJSSDKImageItem> CREATOR = new C6021a();

    /* renamed from: w */
    public boolean f22268w;

    /* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem$a */
    public class C6021a implements Parcelable.Creator<WebViewJSSDKImageItem> {
        public Object createFromParcel(Parcel parcel) {
            return new WebViewJSSDKImageItem(parcel);
        }

        public Object[] newArray(int i) {
            return new WebViewJSSDKImageItem[i];
        }
    }

    public WebViewJSSDKImageItem() {
        this.f283028n = 1;
    }

    /* renamed from: a */
    public JSONObject mo6979a() {
        JSONObject a = super.mo6979a();
        try {
            a.put("isGif", this.f22268w);
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: b */
    public String mo6980b() {
        return "jpeg";
    }

    /* renamed from: c */
    public String mo6981c() {
        return "image";
    }

    /* renamed from: d */
    public void mo6982d(JSONObject jSONObject) {
        super.mo6982d(jSONObject);
        if (jSONObject != null) {
            this.f22268w = jSONObject.optBoolean("isGif");
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public void mo6984f() {
        Uri n = C116299g2.m163858n(this.f283024g);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105924i("MicroMsg.WebViewJSSDkImageItem", "Original file not existed");
            return;
        }
        String str = this.f283023f;
        if (str == null) {
            this.f283023f = ((C7577t0) C86312j.m106911c(C7577t0.class)).getFilePath(System.currentTimeMillis() + "");
        } else if (str.equals(this.f283024g)) {
            Log.m105924i("MicroMsg.WebViewJSSDkImageItem", "Thumb file is original file");
            return;
        }
        Bitmap extractThumbNail = BitmapUtil.extractThumbNail(this.f283024g, 640, 640, false);
        if (extractThumbNail != null) {
            Log.m105924i("MicroMsg.WebViewJSSDkImageItem", "extract thumbnail bitmap");
            Bitmap rotate = BitmapUtil.rotate(extractThumbNail, (float) BackwardSupportUtil.ExifHelper.getExifOrientation(this.f283024g));
            if (rotate != null) {
                try {
                    BitmapUtil.saveBitmapToImage(rotate, 100, Bitmap.CompressFormat.JPEG, this.f283023f, true);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewJSSDkImageItem", "save bitmap to file failed : %s", e.getMessage());
                }
            }
        }
        Log.m105925i("MicroMsg.WebViewJSSDkImageItem", "Thumb Path: %s", this.f283023f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22268w ? 1 : 0);
    }

    public WebViewJSSDKImageItem(Parcel parcel) {
        super(parcel);
        this.f22268w = parcel.readInt() != 1 ? false : true;
    }
}
