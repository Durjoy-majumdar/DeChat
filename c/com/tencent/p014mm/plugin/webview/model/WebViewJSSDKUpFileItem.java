package com.tencent.p014mm.plugin.webview.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.WCWebUpdater;
import java.util.ArrayList;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem */
public class WebViewJSSDKUpFileItem extends WebViewJSSDKFileItem {
    public static final Parcelable.Creator<WebViewJSSDKUpFileItem> CREATOR = new C96647a();

    /* renamed from: w */
    public int f283037w = -1;

    /* renamed from: x */
    public String f283038x;

    /* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem$a */
    public class C96647a implements Parcelable.Creator<WebViewJSSDKUpFileItem> {
        public Object createFromParcel(Parcel parcel) {
            return new WebViewJSSDKUpFileItem(parcel, (C96647a) null);
        }

        public Object[] newArray(int i) {
            return new WebViewJSSDKUpFileItem[i];
        }
    }

    public WebViewJSSDKUpFileItem() {
        this.f283028n = 3;
    }

    /* renamed from: b */
    public String mo6980b() {
        return "file";
    }

    /* renamed from: c */
    public String mo6981c() {
        return "nomal";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo134796e(C98121d dVar) {
        super.mo134796e(dVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f283037w + "");
        arrayList.add(this.f283038x);
        arrayList.add(dVar.field_fileId);
        arrayList.add(dVar.field_aesKey);
        arrayList.add(dVar.field_fileLength + "");
        Context context = MMApplicationContext.getContext();
        if (NetStatusUtil.isWifi(context)) {
            arrayList.add("1");
        } else if (NetStatusUtil.is3G(context)) {
            arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        } else if (NetStatusUtil.is4G(context)) {
            arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
        } else if (NetStatusUtil.is5G(context)) {
            arrayList.add(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
        } else if (NetStatusUtil.is2G(context)) {
            arrayList.add("3");
        } else if (NetStatusUtil.isWap(context)) {
            arrayList.add("2");
        } else {
            arrayList.add("0");
        }
        Log.m105919d("MicroMsg.WebViewJSSDKVoiceItem", "fileType=%d, initUrl=%s, field_fileId=%s", Integer.valueOf(this.f283037w), this.f283038x, dVar.field_fileId);
        C115669n.INSTANCE.mo160137l(12018, arrayList);
        String str = this.f283024g;
        if (!Util.isNullOrNil(str)) {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public WebViewJSSDKUpFileItem(Parcel parcel, C96647a aVar) {
    }
}
