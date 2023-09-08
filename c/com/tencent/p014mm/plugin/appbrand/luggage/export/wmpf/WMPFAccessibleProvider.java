package com.tencent.p014mm.plugin.appbrand.luggage.export.wmpf;

import a70.C112760b;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/wmpf/WMPFAccessibleProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider */
public final class WMPFAccessibleProvider extends ContentProvider {

    /* renamed from: d */
    public static final UriMatcher f108790d;

    /* renamed from: e */
    public static final boolean f108791e;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.wmpf.WMPFAccessibleProvider$a */
    public static final class C40493a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ byte[] f108792d;

        /* renamed from: e */
        public final /* synthetic */ WMPFAccessibleProvider f108793e;

        public C40493a(byte[] bArr, WMPFAccessibleProvider wMPFAccessibleProvider) {
            this.f108792d = bArr;
            this.f108793e = wMPFAccessibleProvider;
        }

        public final void run() {
            byte[] bArr = this.f108792d;
            Bitmap a = MMBitmapFactory.m98732a(bArr, 0, bArr.length);
            String str = C112760b.m154233h() + "wmpf_qrcode.png";
            C86013q1.m106461v(C112760b.m154233h());
            BitmapUtil.saveBitmapToImage(a, 100, Bitmap.CompressFormat.PNG, str, true);
            try {
                WMPFQRCodeDetectProxyUI.f108794e.mo1824a(this.f108793e.getContext(), str);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AppBrand.WMPFAccessibleProvider", th, "WMPFQRCodeDetectProxyUI.waitFor", new Object[0]);
            }
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f108790d = uriMatcher;
        boolean z = true;
        uriMatcher.addURI("com.tencent.mm.export.wmpf.provider", "detect_qrcode", 1);
        if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !WeChatEnvironment.hasDebugger()) {
            z = false;
        }
        f108791e = z;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C87412m.m108594g(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        C87412m.m108594g(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C87412m.m108594g(uri, "uri");
        if (f108791e && contentValues != null && f108790d.match(uri) == 1) {
            byte[] asByteArray = contentValues.getAsByteArray("CV_KEY_DETECT_QRCODE_BYTES");
            ((C119157j) C119157j.f356862d).mo183875f(new C40493a(asByteArray, this));
        }
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C87412m.m108594g(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C87412m.m108594g(uri, "uri");
        return 0;
    }
}
