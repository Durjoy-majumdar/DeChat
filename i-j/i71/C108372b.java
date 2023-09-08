package i71;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.p014mm.fontdecode.PathExtractor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my3.C61590c;

/* renamed from: i71.b */
public final class C108372b implements C108374c {

    /* renamed from: a */
    public CharSequence f324434a;

    /* renamed from: b */
    public String f324435b = "";

    /* renamed from: c */
    public Map<String, C108373a> f324436c = new HashMap();

    /* renamed from: d */
    public final C108371a f324437d = new C108371a();

    /* renamed from: i71.b$a */
    public static final class C108373a {

        /* renamed from: a */
        public final PathExtractor f324438a;

        /* renamed from: b */
        public final List<Path> f324439b = new ArrayList();

        /* renamed from: c */
        public final List<RectF> f324440c = new ArrayList();

        public C108373a(String str, int i) {
            C87412m.m108594g(str, "fontPath");
            PathExtractor pathExtractor = new PathExtractor(str);
            this.f324438a = pathExtractor;
            PathExtractor.Metrics metrics = new PathExtractor.Metrics();
            pathExtractor.mo148237c(i);
            pathExtractor.mo148236b(metrics);
        }
    }

    public C108372b(String[] strArr, int i) {
        C87412m.m108594g(strArr, "fontPaths");
        for (String str : strArr) {
            C108373a aVar = new C108373a(str, i);
            if (aVar.f324438a.f310684a != 0) {
                this.f324436c.put(str, aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo158885a() {
        for (C108373a aVar : ((HashMap) this.f324436c).values()) {
            CharSequence charSequence = this.f324434a;
            ((ArrayList) aVar.f324439b).clear();
            ((ArrayList) aVar.f324440c).clear();
            if (charSequence != null) {
                for (int i = 0; i < charSequence.length(); i++) {
                    char charAt = charSequence.charAt(i);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    if (aVar.f324438a.mo148235a(charAt, path, rectF)) {
                        ((ArrayList) aVar.f324439b).add(path);
                        ((ArrayList) aVar.f324440c).add(rectF);
                    } else {
                        ((ArrayList) aVar.f324439b).add((Object) null);
                        ((ArrayList) aVar.f324440c).add((Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo158886b(String str) {
        C87412m.m108594g(str, "fontPath");
        this.f324435b = str;
    }

    /* renamed from: c */
    public void mo158887c(Canvas canvas, int i, int i2, float f, float f2, Paint paint, boolean z) {
        float f3;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        C87412m.m108594g(canvas2, "canvas");
        C87412m.m108594g(paint2, "paint");
        if (!Util.isNullOrNil(this.f324434a)) {
            C108373a aVar = (C108373a) ((HashMap) this.f324436c).get(this.f324435b);
            if (aVar == null) {
                this.f324437d.mo158887c(canvas, i, i2, f, f2, paint, z);
                return;
            }
            canvas.save();
            canvas2.translate(f, f2);
            int i3 = -1;
            int i4 = i;
            int i5 = -1;
            while (i4 < i2) {
                if (((ArrayList) aVar.f324439b).get(i4) != null) {
                    Object obj = ((ArrayList) aVar.f324439b).get(i4);
                    C87412m.m108591d(obj);
                    canvas2.drawPath((Path) obj, paint2);
                    f3 = paint2.measureText(this.f324434a, i4, i4 + 1);
                } else {
                    CharSequence charSequence = this.f324434a;
                    C87412m.m108591d(charSequence);
                    char charAt = charSequence.charAt(i4);
                    boolean z2 = false;
                    if ((C87412m.m108596i(55296, charAt) <= 0 && C87412m.m108596i(charAt, new C61590c(55296, 57343).f175168e) <= 0) && i5 == i3) {
                        i5 = i4;
                        i4++;
                        i3 = -1;
                    } else if (i5 != i3) {
                        CharSequence charSequence2 = this.f324434a;
                        C87412m.m108591d(charSequence2);
                        if (i4 < charSequence2.length() + i3) {
                            CharSequence charSequence3 = this.f324434a;
                            C87412m.m108591d(charSequence3);
                            char charAt2 = charSequence3.charAt(i4 + 1);
                            C61590c cVar = new C61590c(55296, 57343);
                            if (C87412m.m108596i(55296, charAt2) <= 0 && C87412m.m108596i(charAt2, cVar.f175168e) <= 0) {
                                z2 = true;
                            }
                            if (z2) {
                                i4++;
                                i3 = -1;
                            }
                        }
                        canvas.save();
                        CharSequence charSequence4 = this.f324434a;
                        C87412m.m108591d(charSequence4);
                        int i6 = i4 + 1;
                        canvas.drawText(charSequence4, i5, i6, 0.0f, 0.0f, paint);
                        canvas.restore();
                        f3 = paint2.measureText(this.f324434a, i5, i6);
                        i5 = -1;
                    } else {
                        CharSequence charSequence5 = this.f324434a;
                        C87412m.m108591d(charSequence5);
                        int i7 = i4 + 1;
                        canvas.drawText(charSequence5, i4, i7, 0.0f, 0.0f, paint);
                        f3 = paint2.measureText(this.f324434a, i4, i7);
                    }
                }
                canvas2.translate(f3, 0.0f);
                i4++;
                i3 = -1;
            }
            if (z) {
                canvas2.drawText("...", 0.0f, 0.0f, paint2);
            }
            canvas.restore();
        }
    }

    public void setText(CharSequence charSequence) {
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        this.f324434a = charSequence;
        C108371a aVar = this.f324437d;
        aVar.getClass();
        aVar.f324433a = charSequence;
    }
}
