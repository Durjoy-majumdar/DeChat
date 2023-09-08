package hi3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.svg.WeChatSVG;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.file.XVFSFile;
import gi3.C24542c;
import ii3.C87739b;
import ii3.C87740c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oa1.C117731d;
import org.apache.http.util.EncodingUtils;

/* renamed from: hi3.a */
public class C87515a {

    /* renamed from: c */
    public static String f253525c = "";

    /* renamed from: d */
    public static Map<Integer, C24542c> f253526d = new ConcurrentHashMap();

    /* renamed from: e */
    public static Map<Integer, Picture> f253527e = new ConcurrentHashMap();

    /* renamed from: f */
    public static Map<String, Picture> f253528f = new ConcurrentHashMap();

    /* renamed from: g */
    public static volatile Float f253529g;

    /* renamed from: h */
    public static Boolean f253530h = null;

    /* renamed from: a */
    public TypedValue f253531a = new TypedValue();

    /* renamed from: b */
    public byte[] f253532b = new byte[0];

    /* renamed from: a */
    public static Bitmap m108831a(Resources resources, int i, float f) {
        Drawable e = m108835e(MMApplicationContext.getResources(), i, f);
        if (e == null) {
            return null;
        }
        C87516b bVar = (C87516b) e;
        Bitmap createBitmap = Bitmap.createBitmap(bVar.f253539g, bVar.f253540h, Bitmap.Config.ARGB_8888);
        e.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: b */
    public static View m108832b(Drawable drawable) {
        Drawable.Callback callback = drawable.getCallback();
        if (callback == null) {
            return null;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        if (callback instanceof Drawable) {
            return m108832b((Drawable) callback);
        }
        return null;
    }

    /* renamed from: c */
    public static Picture m108833c(float f, C24542c cVar, float f2) {
        Picture picture = new Picture();
        if (cVar == null) {
            C87740c.m109159b("MicroMsg.SVGCompat", "fromCodeToPicture code is null!", new Object[0]);
            return picture;
        }
        if (f253529g == null) {
            f253529g = Float.valueOf(f / 3.0f);
        }
        float floatValue = f253529g.floatValue() * f2;
        Canvas beginRecording = picture.beginRecording((int) (((float) C24542c.getWidth(cVar)) * floatValue), (int) (((float) C24542c.getHeight(cVar)) * floatValue));
        beginRecording.save();
        beginRecording.scale(floatValue, floatValue);
        C24542c.render(cVar, beginRecording, Looper.myLooper());
        beginRecording.restore();
        picture.endRecording();
        return picture;
    }

    /* renamed from: d */
    public static C24542c m108834d(Resources resources, int i, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            if (((ConcurrentHashMap) f253526d).containsKey(Integer.valueOf(i))) {
                return (C24542c) ((ConcurrentHashMap) f253526d).get(Integer.valueOf(i));
            }
            String resourceName = resources.getResourceName(i);
            if (resourceName == null) {
                C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : resource not found", new Object[0]);
                return null;
            }
            int indexOf = resourceName.indexOf("/");
            if (indexOf > 0) {
                str5 = str + "." + resourceName.substring(indexOf + 1);
            } else {
                str5 = str + "." + resourceName;
            }
            try {
                C24542c cVar = (C24542c) Class.forName(str5).newInstance();
                ((ConcurrentHashMap) f253526d).put(Integer.valueOf(i), cVar);
                return cVar;
            } catch (ClassNotFoundException e) {
                ClassNotFoundException classNotFoundException = e;
                str2 = str5;
                e = classNotFoundException;
                Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new Object[0]);
                C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : ClassNotFoundException %s", str2);
                return null;
            } catch (InstantiationException e2) {
                InstantiationException instantiationException = e2;
                str3 = str5;
                e = instantiationException;
                C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : InstantiationException %s", str3);
                Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new Object[0]);
                return null;
            } catch (IllegalAccessException e3) {
                IllegalAccessException illegalAccessException = e3;
                str4 = str5;
                e = illegalAccessException;
                C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : IllegalAccessException %s", str4);
                Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new Object[0]);
                return null;
            }
        } catch (ClassNotFoundException e4) {
            e = e4;
            str2 = "";
            Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new Object[0]);
            C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : ClassNotFoundException %s", str2);
            return null;
        } catch (InstantiationException e5) {
            e = e5;
            str3 = "";
            C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : InstantiationException %s", str3);
            Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new Object[0]);
            return null;
        } catch (IllegalAccessException e6) {
            e = e6;
            str4 = "";
            C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : IllegalAccessException %s", str4);
            Log.printErrStackTrace("MicroMsg.SVGCompat", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public static Drawable m108835e(Resources resources, int i, float f) {
        String str = "";
        if (i == 0) {
            C87740c.m109159b("MicroMsg.SVGCompat", "getSVGDrawable a invalid resource!!! %s", Integer.valueOf(i));
            C87740c.m109159b("MicroMsg.SVGCompat", "Why no log??", new Object[0]);
            Object[] objArr = new Object[1];
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 4) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    if (stackTrace[i2].getClassName().contains("com.tencent.mm") && !stackTrace[i2].getClassName().contains("sdk.platformtools.Log")) {
                        sb.append("[");
                        sb.append(stackTrace[i2].getClassName().substring(15));
                        sb.append(XVFSFile.PATH_SEPARATOR);
                        sb.append(stackTrace[i2].getMethodName());
                        sb.append("(" + stackTrace[i2].getLineNumber() + ")]");
                    }
                }
                str = sb.toString();
            }
            objArr[0] = str;
            C87740c.m109159b("MicroMsg.SVGCompat", "The stack : %s", objArr);
            return new C87517c(new Picture(), i);
        }
        float f2 = 1.0f;
        if (C87739b.m109157b()) {
            C87740c.m109158a("MicroMsg.SVGCompat", "Using wechat svg library.", new Object[0]);
            InputStream openRawResource = resources.openRawResource(i);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                try {
                    openRawResource.close();
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.SVGCompat", e, str, new Object[0]);
                }
                long parse = WeChatSVG.parse(EncodingUtils.getString(bArr, "UTF-8").toString());
                if (parse == 0) {
                    C87740c.m109159b("MicroMsg.SVGCompat", "Parse SVG failed.", new Object[0]);
                    return null;
                }
                float[] viewPort = WeChatSVG.getViewPort(parse);
                float f3 = resources.getDisplayMetrics().density;
                int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                float f4 = (viewPort[0] / 3.0f) * f3 * (i3 > 0 ? f : 1.0f);
                float f5 = (viewPort[1] / 3.0f) * f3;
                if (i3 <= 0) {
                    f = 1.0f;
                }
                float f6 = f5 * f;
                Picture picture = new Picture();
                int i4 = (int) f4;
                int i5 = (int) f6;
                int renderViewPort = WeChatSVG.renderViewPort(parse, picture.beginRecording(i4, i5), (float) i4, (float) i5);
                picture.endRecording();
                WeChatSVG.release(parse);
                C87517c cVar = new C87517c(picture, i);
                if (renderViewPort >= 0) {
                    return cVar;
                }
                C87740c.m109159b("MicroMsg.SVGCompat", "Render SVG failed. Reason : %s", Integer.valueOf(renderViewPort));
                return null;
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.SVGCompat", e2, str, new Object[0]);
                C87740c.m109159b("MicroMsg.SVGCompat", "Get SVGPictureDrawable failed. Reason : IOException", new Object[0]);
                if (openRawResource == null) {
                    return null;
                }
                try {
                    openRawResource.close();
                    return null;
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.SVGCompat", e3, str, new Object[0]);
                    return null;
                }
            } catch (Throwable th) {
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException e4) {
                        Log.printErrStackTrace("MicroMsg.SVGCompat", e4, str, new Object[0]);
                    }
                }
                throw th;
            }
        } else {
            String str2 = f253525c + ".svg.code.drawable";
            Log.m105925i("MicroMsg.SVGCompat", "geDrawableWithSVGCode, resources: %s, id: %s, outScale: %s, density: %s", resources, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(resources.getDisplayMetrics().density));
            float f7 = resources.getDisplayMetrics().density;
            int i6 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i6 > 0) {
                f2 = f;
            }
            if (i6 > 0) {
                String str3 = i + "_scale_" + f;
                Picture picture2 = (Picture) ((ConcurrentHashMap) f253528f).get(str3);
                if (picture2 == null) {
                    picture2 = m108833c(f7, m108834d(resources, i, str2), f2);
                    ((ConcurrentHashMap) f253528f).put(str3, picture2);
                }
                return new C87517c(picture2, i);
            }
            Picture picture3 = (Picture) ((ConcurrentHashMap) f253527e).get(Integer.valueOf(i));
            if (picture3 == null) {
                picture3 = m108833c(f7, m108834d(resources, i, str2), f2);
                ((ConcurrentHashMap) f253527e).put(Integer.valueOf(i), picture3);
            }
            return new C87517c(picture3, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108836g(android.view.View r5, android.graphics.Paint r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x004a
            r1 = 30
            r2 = 1
            boolean r1 = p206nj.C11171e.m11046c(r1)     // Catch:{ NullPointerException -> 0x002d }
            if (r1 == 0) goto L_0x0023
            boolean r1 = p156gj.C87203t.m108279o()     // Catch:{ NullPointerException -> 0x002d }
            if (r1 == 0) goto L_0x0023
            boolean r1 = r5.isHardwareAccelerated()     // Catch:{ NullPointerException -> 0x002d }
            if (r1 == 0) goto L_0x0023
            boolean r1 = m108837h()     // Catch:{ NullPointerException -> 0x002d }
            if (r1 == 0) goto L_0x0023
            r1 = 2
            r5.setLayerType(r1, r6)     // Catch:{ NullPointerException -> 0x002d }
            goto L_0x0037
        L_0x0023:
            int r1 = r5.getLayerType()     // Catch:{ NullPointerException -> 0x002d }
            if (r1 == r2) goto L_0x0037
            r5.setLayerType(r2, r6)     // Catch:{ NullPointerException -> 0x002d }
            goto L_0x0037
        L_0x002d:
            r6 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r3 = "MicroMsg.SVGCompat"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r4, r1)
        L_0x0037:
            boolean r6 = r5.willNotCacheDrawing()
            if (r6 == 0) goto L_0x0049
            r5.setWillNotCacheDrawing(r0)
            android.os.IBinder r6 = r5.getWindowToken()
            if (r6 == 0) goto L_0x0049
            r5.buildLayer()
        L_0x0049:
            r0 = 1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hi3.C87515a.m108836g(android.view.View, android.graphics.Paint):boolean");
    }

    /* renamed from: h */
    public static boolean m108837h() {
        if (f253530h == null) {
            try {
                if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_svg_hardware", "0", false, true), 1) > 0) {
                    Log.m105924i("MicroMsg.SVGCompat", "svg openHardWare!!");
                    f253530h = new Boolean(true);
                } else {
                    f253530h = new Boolean(false);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SVGCompat", e, "svg openHardWare", new Object[0]);
                f253530h = new Boolean(false);
            }
        }
        return f253530h.booleanValue();
    }

    /* renamed from: f */
    public boolean mo121968f(Resources resources, int i) {
        String charSequence;
        try {
            if (resources.getResourceTypeName(i).equals(ShareConstants.DEXMODE_RAW)) {
                synchronized (this.f253532b) {
                    TypedValue typedValue = this.f253531a;
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        this.f253531a = typedValue;
                    }
                    resources.getValue(i, typedValue, true);
                    charSequence = typedValue.string.toString();
                }
                if (charSequence.endsWith(".svg")) {
                    return true;
                }
            }
            return false;
        } catch (Resources.NotFoundException e) {
            C87740c.m109161d("MicroMsg.SVGCompat", e, "resource not found", new Object[0]);
            return false;
        }
    }
}
