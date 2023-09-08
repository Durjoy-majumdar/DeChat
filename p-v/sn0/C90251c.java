package sn0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import ck0.C80043a;
import cl0.C80047b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1737l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ht0.C87586a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import js0.C88020k;
import km0.C88227d;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import s24.C90125c;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: sn0.c */
public class C90251c {

    /* renamed from: sn0.c$a */
    public class C90252a implements C91755a.C91758c {

        /* renamed from: a */
        public final /* synthetic */ String f259066a;

        /* renamed from: b */
        public final /* synthetic */ C90256c f259067b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f259068c;

        /* renamed from: d */
        public final /* synthetic */ WeakReference f259069d;

        /* renamed from: sn0.c$a$a */
        public class C90253a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C87586a f259070d;

            /* renamed from: e */
            public final /* synthetic */ byte[] f259071e;

            public C90253a(C90252a aVar, C87586a aVar2, byte[] bArr) {
                this.f259070d = aVar2;
                this.f259071e = bArr;
            }

            public void run() {
                this.f259070d.setImageByteArray(this.f259071e);
            }
        }

        /* renamed from: sn0.c$a$b */
        public class C90254b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C87586a f259072d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f259073e;

            public C90254b(C90252a aVar, C87586a aVar2, Bitmap bitmap) {
                this.f259072d = aVar2;
                this.f259073e = bitmap;
            }

            public void run() {
                this.f259072d.setImageBitmap(this.f259073e);
            }
        }

        public C90252a(String str, C90256c cVar, WeakReference weakReference, WeakReference weakReference2) {
            this.f259066a = str;
            this.f259067b = cVar;
            this.f259068c = weakReference;
            this.f259069d = weakReference2;
        }

        /* renamed from: a */
        public void mo121428a(InputStream inputStream) {
            if (inputStream == null) {
                Log.m105921e("Luggage.ViewAttributeHelper", "attachImageViewAttribute, openRead failed, url=%s", this.f259066a);
                C90256c cVar = this.f259067b;
                if (cVar != null) {
                    ((C80047b) cVar).mo110314p((BitmapFactory.Options) null);
                    return;
                }
                return;
            }
            InputStream a = C80043a.m97325a(inputStream);
            "HUAWEI".equals(Build.MANUFACTURER);
            a.mark(8388608);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                C90251c.m112987c().mo1726jg(a, (Rect) null, options);
                String str = options.outMimeType;
                C90256c cVar2 = this.f259067b;
                if (cVar2 != null) {
                    ((C80047b) cVar2).mo110314p(options);
                }
                if (!TextUtils.isEmpty(str)) {
                    str.getClass();
                    if (str.equals("image/GIF") || str.equals("image/gif")) {
                        try {
                            a.reset();
                            byte[] c = C90125c.m112776c(a);
                            C90125c.m112774a(a);
                            C82381f fVar = (C82381f) this.f259068c.get();
                            C87586a aVar = (C87586a) this.f259069d.get();
                            if (fVar != null && aVar != null) {
                                fVar.mo109673t(new C90253a(this, aVar, c));
                                return;
                            }
                            return;
                        } catch (Throwable unused) {
                            Log.m105921e("Luggage.ViewAttributeHelper", "attachImageViewAttribute, setImageByteArray failed, url=%s", this.f259066a);
                            return;
                        }
                    }
                }
                try {
                    a.reset();
                    if (options.inSampleSize <= 1) {
                        options.inSampleSize = 1;
                    }
                    while (true) {
                        int i = options.outHeight * options.outWidth;
                        int i2 = options.inSampleSize;
                        if ((i / i2) / i2 <= 16000000) {
                            break;
                        }
                        options.inSampleSize = i2 + 1;
                    }
                    options.inJustDecodeBounds = false;
                    options.inMutable = true;
                    Bitmap jg = C90251c.m112987c().mo1726jg(a, (Rect) null, options);
                    C90125c.m112774a(a);
                    if (jg != null && !jg.isRecycled()) {
                        C82381f fVar2 = (C82381f) this.f259068c.get();
                        C87586a aVar2 = (C87586a) this.f259069d.get();
                        if (fVar2 != null && aVar2 != null) {
                            fVar2.mo109673t(new C90254b(this, aVar2, jg));
                        }
                    }
                } catch (Throwable unused2) {
                    Log.m105921e("Luggage.ViewAttributeHelper", "attachImageViewAttribute, setImageBitmap failed, url=%s", this.f259066a);
                }
            } catch (IllegalArgumentException e) {
                Log.printErrStackTrace("Luggage.ViewAttributeHelper", e, "[CAUGHT EXCEPTION]", new Object[0]);
                C90256c cVar3 = this.f259067b;
                if (cVar3 != null) {
                    ((C80047b) cVar3).mo110314p((BitmapFactory.Options) null);
                }
            }
        }
    }

    /* renamed from: sn0.c$b */
    public interface C90255b {
        float getTextSize();

        void setEllipsize(TextUtils.TruncateAt truncateAt);

        void setFakeBoldText(boolean z);

        void setFontWeight(int i);

        void setGravity(int i);

        void setLineHeight(int i);

        void setSingleLine(boolean z);

        void setText(CharSequence charSequence);

        void setTextColor(int i);

        void setTextSize(int i, float f);
    }

    /* renamed from: sn0.c$c */
    public interface C90256c {
    }

    /* renamed from: a */
    public static void m112985a(C82520h hVar, int i, C87586a aVar, JSONObject jSONObject, C90256c cVar) {
        ByteArrayInputStream byteArrayInputStream;
        if (aVar != null && jSONObject != null) {
            try {
                String a = C88227d.m109877a(hVar, aVar, jSONObject);
                String optString = jSONObject.optString("iconPath");
                if (!TextUtils.isEmpty(optString)) {
                    Map map = null;
                    if (!optString.startsWith("data:image/") || !optString.contains("base64")) {
                        String nO = ((C91759b) hVar.mo109668l(C91759b.class)).mo115838nO(hVar, optString);
                        C91755a aVar2 = (C91755a) hVar.mo109668l(C91755a.class);
                        if (a != null) {
                            map = Collections.singletonMap("Referer", a);
                        }
                        aVar2.mo124757N0(nO, map, new C90252a(nO, cVar, new WeakReference(hVar), new WeakReference(aVar)));
                        return;
                    }
                    Log.m105925i("Luggage.ViewAttributeHelper", "it is data:image/ format file, iconPath:%s", optString);
                    byte[] decode = Base64.decode(optString.substring(optString.indexOf("base64,") + 7).trim(), 0);
                    if (decode != null) {
                        if (decode.length != 0) {
                            if (cVar != null) {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(decode);
                                    m112987c().mo1726jg(byteArrayInputStream, (Rect) null, options);
                                    ((C80047b) cVar).mo110314p(options);
                                    byteArrayInputStream.close();
                                } catch (Exception e) {
                                    Log.m105921e("Luggage.ViewAttributeHelper", "attachImageViewAttribute appId:%s, viewId:%d, decode gif bounds, get exception:%s", hVar.getAppId(), Integer.valueOf(i), e);
                                    ((C80047b) cVar).mo110314p((BitmapFactory.Options) null);
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                            aVar.setImageByteArray(decode);
                            return;
                        }
                    }
                    Log.m105924i("Luggage.ViewAttributeHelper", "bytes is empty");
                    if (cVar != null) {
                        ((C80047b) cVar).mo110314p((BitmapFactory.Options) null);
                        return;
                    }
                    return;
                }
                return;
            } catch (NullPointerException e2) {
                Log.printErrStackTrace("Luggage.ViewAttributeHelper", e2, "attachImageViewAttribute", new Object[0]);
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public static void m112986b(C90255b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            try {
                String string = jSONObject.getString("color");
                if (!Util.isNullOrNil(string)) {
                    bVar.setTextColor(C88020k.m109550a(string));
                }
            } catch (JSONException unused) {
            }
            try {
                bVar.setTextSize(0, C88020k.m109552c((float) jSONObject.getDouble("fontSize")));
            } catch (JSONException unused2) {
            }
            try {
                String string2 = jSONObject.getString("textAlign");
                if ("left".equals(string2)) {
                    bVar.setGravity(3);
                } else if ("center".equals(string2)) {
                    bVar.setGravity(1);
                } else if ("right".equals(string2)) {
                    bVar.setGravity(5);
                }
            } catch (JSONException unused3) {
            }
            try {
                String string3 = jSONObject.getString("fontWeight");
                if ("bold".equals(string3)) {
                    bVar.setFakeBoldText(true);
                } else if ("normal".equals(string3)) {
                    bVar.setFakeBoldText(false);
                } else {
                    int safeParseInt = Util.safeParseInt(string3);
                    if (safeParseInt >= 100 && safeParseInt <= 900) {
                        bVar.setFontWeight(safeParseInt);
                    }
                }
            } catch (JSONException unused4) {
            }
            bVar.setLineHeight(C88020k.m109560k(jSONObject, "lineHeight", Math.round(bVar.getTextSize() * 1.2f)));
            try {
                String string4 = jSONObject.getString("lineBreak");
                if ("ellipsis".equals(string4)) {
                    bVar.setEllipsize(TextUtils.TruncateAt.END);
                    bVar.setSingleLine(true);
                } else if (TPReportKeys.VodExKeys.VOD_EX_CLIP_COUNT.equals(string4)) {
                    bVar.setSingleLine(true);
                } else if ("break-word".equals(string4)) {
                    bVar.setSingleLine(false);
                } else if ("break-all".equals(string4)) {
                    bVar.setSingleLine(false);
                }
            } catch (JSONException unused5) {
            }
            try {
                bVar.setText(jSONObject.getString("content"));
            } catch (JSONException unused6) {
            }
        }
    }

    /* renamed from: c */
    public static C1737l0 m112987c() {
        C1737l0 l0Var = (C1737l0) C89909e.m112436a(C1737l0.class);
        return l0Var == null ? C1737l0.f11455j0 : l0Var;
    }
}
