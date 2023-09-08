package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import op3.C117882j;
import org.json.JSONObject;
import p1016ob.C89131a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q1 */
public final class C82751q1 extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 120;
    private static final String NAME = "getImageInfo";

    /* renamed from: g */
    public static final Collection<C82753b> f242077g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q1$a */
    public static final class C82752a implements C82753b {
        public C82752a(C82747p1 p1Var) {
        }

        /* renamed from: a */
        public C117882j mo115018a(AppBrandRuntime appBrandRuntime, String str) {
            C86009m1 absoluteFile = appBrandRuntime.mo113034V().getAbsoluteFile(str);
            if (absoluteFile == null) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absoluteFile.mo119971i(), options);
            C82754c cVar = new C82754c();
            cVar.f242078a = options.outWidth;
            cVar.f242079b = options.outHeight;
            cVar.f242081d = C89131a.m111395c(options);
            cVar.f242080c = C89131a.m111396d(options) ? C89131a.m111394b(C89131a.m111393a(absoluteFile.mo119971i())) : "up";
            return C117882j.m166284c(C82756e.RESOLVED, cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q1$b */
    public interface C82753b {
        /* renamed from: a */
        C117882j mo115018a(AppBrandRuntime appBrandRuntime, String str);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q1$c */
    public static final class C82754c {

        /* renamed from: a */
        public int f242078a;

        /* renamed from: b */
        public int f242079b;

        /* renamed from: c */
        public String f242080c;

        /* renamed from: d */
        public String f242081d;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q1$d */
    public static final class C82755d implements C82753b {
        public C82755d(C82747p1 p1Var) {
        }

        /* renamed from: a */
        public C117882j mo115018a(AppBrandRuntime appBrandRuntime, String str) {
            String str2;
            InputStream m = C81247g3.m99557m(appBrandRuntime, str);
            if (m == null) {
                return C117882j.m166283b(C82756e.FILE_NOT_FOUND);
            }
            int i = 0;
            m.mark(0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(m, new Rect(), options);
            C82754c cVar = new C82754c();
            cVar.f242078a = options.outWidth;
            cVar.f242079b = options.outHeight;
            cVar.f242081d = C89131a.m111395c(options);
            boolean d = C89131a.m111396d(options);
            try {
                m.reset();
            } catch (IOException unused) {
            }
            if (d) {
                try {
                    i = new ExifInterface(m).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                } catch (Error | Exception unused2) {
                }
                str2 = C89131a.m111394b(i);
            } else {
                str2 = "up";
            }
            cVar.f242080c = str2;
            Util.qualityClose(m);
            return C117882j.m166284c(C82756e.RESOLVED, cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.q1$e */
    public enum C82756e {
        FILE_NOT_FOUND,
        RESOLVED
    }

    static {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C82752a((C82747p1) null));
        linkedList.add(new C82755d((C82747p1) null));
        f242077g = Collections.unmodifiableCollection(linkedList);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        i2Var.getAppId();
        String optString = jSONObject.optString("src");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        ThreadPool.post((Runnable) new C82747p1(this, i2Var, optString, new WeakReference(i2Var), i), String.format(Locale.US, "AppBrandJsApiGetImageInfo[%s]", new Object[]{optString}), 10);
    }
}
