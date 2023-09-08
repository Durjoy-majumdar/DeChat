package p419td;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.tencent.magicbrush.handler.glfont.IMBFontHandler;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import p416qd.C35829i;
import p416qd.C89598h;
import p419td.C26304g;
import p419td.C26308j;
import p748xd.C91176h;

/* renamed from: td.i */
public class C26307i implements IMBFontHandler {

    /* renamed from: a */
    public C26301e f73284a;

    /* renamed from: b */
    public C26302f f73285b;

    /* renamed from: c */
    public C26304g f73286c;

    /* renamed from: d */
    public C26308j f73287d;

    /* renamed from: e */
    public C26296b f73288e;

    /* renamed from: f */
    public C90392c f73289f;

    /* renamed from: g */
    public boolean f73290g = false;

    /* renamed from: a */
    public final void mo53182a() {
        HashMap<String, C26310k> hashMap;
        C89598h.m112045b("MicroMsg.MBFontManagerImpl", "FontManager clear", new Object[0]);
        C26301e eVar = this.f73284a;
        if (eVar != null) {
            eVar.f73262c.setEmpty();
            ((C26311l) eVar.f73261b).mo53198a();
            Bitmap bitmap = eVar.f73260a;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
        }
        C26304g gVar = this.f73286c;
        if (!(gVar == null || (hashMap = gVar.f73268b) == null)) {
            for (C26310k next : hashMap.values()) {
                C26304g.C26305a aVar = gVar.f73269c;
                aVar.getClass();
                if (next != null) {
                    next.f73307d = 0.0f;
                    next.f73306c = 0.0f;
                    next.f73305b = 0.0f;
                    next.f73304a = 0.0f;
                    next.f73311h = 0.0f;
                    next.f73310g = 0.0f;
                    next.f73309f = 0.0f;
                    next.f73308e = 0.0f;
                    next.f73313j = 1;
                    next.f73312i = false;
                    ((LinkedList) aVar.f73274a).offer(next);
                }
            }
            gVar.f73268b.clear();
        }
        this.f73290g = true;
    }

    public boolean checkAndFlushClearSignal() {
        boolean z = this.f73290g;
        this.f73290g = false;
        return z;
    }

    public int[] checkAndFlushDirtySignal() {
        C26301e eVar = this.f73284a;
        if (eVar == null || !(!eVar.f73262c.isEmpty())) {
            return null;
        }
        int[] iArr = eVar.f73263d;
        Rect rect = eVar.f73262c;
        iArr[0] = rect.left;
        iArr[1] = rect.top;
        iArr[2] = rect.right;
        iArr[3] = rect.bottom;
        rect.setEmpty();
        return eVar.f73263d;
    }

    public FloatBuffer drawText(String str) {
        this.f73286c.mo53177a(this.f73287d);
        FloatBuffer b = this.f73286c.mo53178b(str);
        if (b == null) {
            C89598h.m112045b("MicroMsg.MBFontManagerImpl", "drawText() load result is null. atlas may be full. first time, clear and retry; text = [%s]; mCurrentState = [%s]", str, this.f73287d);
            mo53182a();
            b = this.f73286c.mo53178b(str);
        }
        if (b != null) {
            return b;
        }
        C89598h.m112045b("MicroMsg.MBFontManagerImpl", "drawText() load result is null. atlas may be full. second time, just returned; text = [%s]; mCurrentState = [%s]", str, this.f73287d);
        return null;
    }

    public void enableStroke(boolean z) {
        this.f73287d.f73294d = z;
    }

    public Bitmap getBitmapAtlas() {
        C26301e eVar = this.f73284a;
        if (eVar != null) {
            return eVar.f73260a;
        }
        return null;
    }

    public float getTextLineHeight(String str) {
        C26304g gVar;
        if (str == null || str.length() == 0 || this.f73285b == null || (gVar = this.f73286c) == null) {
            return 0.0f;
        }
        gVar.mo53177a(this.f73287d);
        Paint.FontMetrics fontMetrics = this.f73286c.f73267a.f73283i;
        if (fontMetrics == null) {
            return 0.0f;
        }
        return (fontMetrics.bottom - fontMetrics.ascent) + 1.0f;
    }

    public void init(int i, int i2) {
        C89598h.m112045b("MicroMsg.MBFontManagerImpl", "init() called with: m_atlasWidth = [" + i + "], m_atlasHeight = [" + i2 + "]", new Object[0]);
        this.f73284a = new C26301e(i, i2);
        this.f73285b = new C26302f(this.f73288e);
        this.f73286c = new C26304g(this.f73284a, this.f73289f);
        this.f73287d = new C26308j((Typeface) null, "normal", 20.0f, false, 0.0f, C26308j.C26309a.NORMAL);
    }

    public String loadFont(String str) {
        C35829i iVar;
        C26302f fVar = this.f73285b;
        fVar.getClass();
        String str2 = null;
        if (!(str == null || str.length() == 0)) {
            C26296b bVar = fVar.f73266c;
            if (bVar == null) {
                C89598h.m112045b("MicroMsg.MBFont", "[MBFontHandler] FaceProvider is null", new Object[0]);
            } else {
                String a = bVar.mo53170a(str);
                Typeface loadFont = fVar.f73266c.loadFont(a);
                if (loadFont != null) {
                    if (!C91176h.m114416a(a)) {
                        if (!a.endsWith("ttf") && (iVar = C26294a.f73251a) != null) {
                            iVar.mo53169a(1);
                        }
                        try {
                            str2 = C90393m.f259402a.mo124605b(a);
                        } catch (Exception e) {
                            C89598h.m112046c("MicroMsg.MBFont", e, "ttf parse error, path: %s", a);
                        }
                    }
                    if (C91176h.m114416a(str2)) {
                        C35829i iVar2 = C26294a.f73251a;
                        if (iVar2 != null) {
                            iVar2.mo53169a(0);
                        }
                        str2 = "font" + loadFont.hashCode();
                    }
                    C89598h.m112045b("MicroMsg.MBFont", "familyName:" + str2, new Object[0]);
                    fVar.f73264a.put(str2, loadFont);
                }
            }
        }
        return str2;
    }

    public byte[] loadFontData(String str) {
        return this.f73288e.mo53171b(str);
    }

    public float measureText(String str) {
        this.f73286c.mo53177a(this.f73287d);
        float d = this.f73286c.mo53180d(str);
        if (d == -1.0f) {
            C89598h.m112045b("MicroMsg.MBFontManagerImpl", "measure() load result is null. atlas may be full. first time, clear and retry; text = [%s]; mCurrentState = [%s]", str, this.f73287d);
            mo53182a();
            d = this.f73286c.mo53180d(str);
        }
        if (d != -1.0f) {
            return d;
        }
        C89598h.m112045b("MicroMsg.MBFontManagerImpl", "measure() load result is null. atlas may be full. second time, just returned; text = [%s]; mCurrentState = [%s]", str, this.f73287d);
        return 0.0f;
    }

    public void release() {
        C26301e eVar = this.f73284a;
        if (eVar != null) {
            Bitmap bitmap = eVar.f73260a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f73284a = null;
        }
        C26302f fVar = this.f73285b;
        if (fVar != null) {
            HashMap<String, Typeface> hashMap = fVar.f73264a;
            if (hashMap != null) {
                hashMap.clear();
                fVar.f73264a = null;
            }
            this.f73285b = null;
        }
        C26304g gVar = this.f73286c;
        if (gVar != null) {
            if (gVar.f73267a != null) {
                gVar.f73267a = null;
            }
            this.f73286c = null;
        }
    }

    public void setStrokeWidth(float f) {
        this.f73287d.f73295e = f;
    }

    public void useFont(String str, String str2, float f, boolean z, boolean z2) {
        C26308j.C26309a aVar = (!z || !z2) ? z ? C26308j.C26309a.ITALIC : z2 ? C26308j.C26309a.BOLD : C26308j.C26309a.NORMAL : C26308j.C26309a.BOLD_ITALIC;
        this.f73287d.f73291a = this.f73285b.mo53176a(str, aVar, str2);
        C26308j jVar = this.f73287d;
        jVar.f73292b = str2;
        jVar.f73293c = f;
        jVar.f73296f = aVar;
    }
}
