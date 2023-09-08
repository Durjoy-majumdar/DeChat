package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tencent.mapsdk.engine.jni.models.IconImageInfo;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.tencent.mapsdk.internal.tb */
public final class C114334tb implements C114005ny {

    /* renamed from: c */
    private Context f342634c;

    /* renamed from: d */
    private final float f342635d;

    /* renamed from: e */
    private String f342636e;

    /* renamed from: f */
    private String f342637f;

    public C114334tb(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f342634c = applicationContext;
        this.f342635d = C113801hf.m157135a(applicationContext);
        this.f342636e = str;
    }

    /* renamed from: b */
    private Bitmap m160301b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        InputStream b = C113886kg.m157521b(C113959ml.m157965a(this.f342634c, (TencentMapOptions) null).mo172402a(this.f342636e) + str);
        if (b == null) {
            b = C113886kg.m157521b(C113959ml.m157965a(this.f342634c, (TencentMapOptions) null).mo172404b(this.f342636e) + str);
        }
        if (b == null) {
            b = C113886kg.m157521b(C113959ml.m157965a(this.f342634c, (TencentMapOptions) null).mo172408e() + str);
        }
        if (b == null && this.f342637f != null) {
            b = C113886kg.m157514a(new File(this.f342637f, str));
        }
        if (b == null) {
            if (C113956mi.m157946a() != null) {
                Context context = this.f342634c;
                b = C113956mi.m157952b(context, C113956mi.m157946a() + str);
            } else if (C113956mi.m157953b() != null) {
                b = C113886kg.m157521b(C113956mi.m157953b() + str);
            }
        }
        if (b == null) {
            b = C113956mi.m157944a(this.f342634c, str);
        }
        if (b == null) {
            b = C113956mi.m157952b(this.f342634c, str);
        }
        if (b == null) {
            return null;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(b);
        C113886kg.m157515a((Closeable) b);
        return decodeStream;
    }

    /* renamed from: a */
    public final String mo172560a() {
        return null;
    }

    /* renamed from: a */
    public final void mo172561a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("../")) {
                str = str.replaceAll("\\.\\./", "");
            }
            if (!TextUtils.isEmpty(str)) {
                this.f342637f = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo172562a(String str, IconImageInfo iconImageInfo) {
        Bitmap a = C104548ha.f309920b.mo147862a(str);
        if (a == null) {
            a = C104548ha.f309920b.mo147862a(str);
        }
        iconImageInfo.bitmap = a;
        if (str.endsWith(C0938ej.f2164s) || str.contains("@2x")) {
            iconImageInfo.scale = 2.0f;
        } else if (str.endsWith("@3x.png") || str.contains("@3x")) {
            iconImageInfo.scale = 3.0f;
        } else {
            iconImageInfo.scale = this.f342635d;
        }
        if (this.f342634c != null && a == null) {
            try {
                if (str.startsWith("poi_icon") || str.startsWith(C0938ej.f2163r)) {
                    a = m160301b(C40002he.m42807b(str) + C0938ej.f2164s);
                }
                if (a != null) {
                    iconImageInfo.bitmap = a;
                    iconImageInfo.scale = 2.0f;
                    return;
                }
                iconImageInfo.bitmap = m160301b(str);
                if (!str.equals(C114005ny.f340983a)) {
                    if (!str.equals(C114005ny.f340984b)) {
                        iconImageInfo.scale = 1.0f;
                        return;
                    }
                }
                iconImageInfo.scale = this.f342635d;
            } catch (OutOfMemoryError unused) {
            }
        }
    }
}
