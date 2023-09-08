package p419td;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import p419td.C26308j;

/* renamed from: td.g */
public class C26304g {

    /* renamed from: a */
    public C26306h f73267a;

    /* renamed from: b */
    public HashMap<String, C26310k> f73268b;

    /* renamed from: c */
    public C26305a f73269c;

    /* renamed from: d */
    public FloatBuffer f73270d;

    /* renamed from: e */
    public List<C26310k> f73271e;

    /* renamed from: f */
    public C26308j f73272f;

    /* renamed from: g */
    public StringBuilder f73273g = new StringBuilder();

    /* renamed from: td.g$a */
    public static class C26305a {

        /* renamed from: a */
        public Queue<C26310k> f73274a = new LinkedList();
    }

    public C26304g(C26301e eVar, C90392c cVar) {
        C26306h hVar = new C26306h(eVar, this);
        this.f73267a = hVar;
        hVar.f73280f = cVar;
        this.f73268b = new HashMap<>();
        this.f73269c = new C26305a();
        this.f73271e = new ArrayList();
    }

    /* renamed from: a */
    public void mo53177a(C26308j jVar) {
        C26308j jVar2 = jVar;
        C26308j.C26309a aVar = C26308j.C26309a.ITALIC;
        C26308j.C26309a aVar2 = C26308j.C26309a.BOLD;
        this.f73272f = jVar2;
        C26306h hVar = this.f73267a;
        C26308j.C26309a aVar3 = C26308j.C26309a.BOLD_ITALIC;
        hVar.f73278d = jVar2;
        hVar.f73279e.setTypeface(jVar2.f73291a);
        hVar.f73279e.setTextSize(jVar2.f73293c);
        if (jVar2.f73294d) {
            hVar.f73279e.setStyle(Paint.Style.STROKE);
            hVar.f73279e.setStrokeWidth(jVar2.f73295e);
        } else {
            hVar.f73279e.setStyle(Paint.Style.FILL);
        }
        hVar.f73279e.setTextSkewX(0.0f);
        hVar.f73279e.setFakeBoldText(false);
        if (jVar2.f73296f != null) {
            Typeface typeface = jVar2.f73291a;
            if (typeface == null || typeface.getStyle() != jVar2.f73296f.f73302d) {
                C26308j.C26309a aVar4 = jVar2.f73296f;
                if (aVar4 == aVar || aVar4 == aVar3) {
                    hVar.f73279e.setTextSkewX(-0.25f);
                }
                C26308j.C26309a aVar5 = jVar2.f73296f;
                if (aVar5 == aVar2 || aVar5 == aVar3) {
                    hVar.f73279e.setFakeBoldText(true);
                }
            }
            C26308j.C26309a aVar6 = jVar2.f73296f;
            aVar6.getClass();
            if (aVar6 == aVar2 || aVar6 == aVar3) {
                hVar.f73279e.setFakeBoldText(true);
            }
        }
        C90392c cVar = hVar.f73280f;
        if (cVar != null) {
            Paint paint = hVar.f73279e;
            Typeface typeface2 = jVar2.f73291a;
            String str = jVar2.f73292b;
            float f = jVar2.f73293c;
            boolean z = jVar2.f73294d;
            float f2 = jVar2.f73295e;
            C26308j.C26309a aVar7 = jVar2.f73296f;
            aVar7.getClass();
            boolean z2 = aVar7 == aVar2 || aVar7 == aVar3;
            C26308j.C26309a aVar8 = jVar2.f73296f;
            aVar8.getClass();
            cVar.mo124200a(paint, typeface2, str, f, z, f2, z2, aVar8 == aVar || aVar8 == aVar3);
        }
        hVar.f73279e.getFontMetrics(hVar.f73283i);
    }

    /* renamed from: b */
    public FloatBuffer mo53178b(String str) {
        List<C26310k> c;
        if (!(str == null || str.length() == 0 || (c = mo53179c(str)) == null)) {
            ArrayList arrayList = (ArrayList) c;
            if (arrayList.size() != 0) {
                int max = (Math.max(str.length(), 10) * 40) + 16;
                FloatBuffer floatBuffer = this.f73270d;
                if (floatBuffer == null || floatBuffer.capacity() * 4 < max) {
                    this.f73270d = ByteBuffer.allocateDirect(max).order(ByteOrder.nativeOrder()).asFloatBuffer();
                }
                this.f73270d.clear();
                FloatBuffer floatBuffer2 = this.f73270d;
                float a = this.f73267a.mo53181a(c);
                Paint.FontMetrics fontMetrics = this.f73267a.f73283i;
                floatBuffer2.put(a).put(fontMetrics.ascent).put(fontMetrics.bottom).put(fontMetrics.bottom - fontMetrics.ascent);
                int i = C26310k.f73303k;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C26310k kVar = (C26310k) it.next();
                        if (kVar != null) {
                            floatBuffer2.put(kVar.f73304a).put(kVar.f73305b).put(kVar.f73306c).put(kVar.f73307d).put(kVar.f73308e).put(kVar.f73309f).put(kVar.f73310g).put(kVar.f73311h).put(kVar.f73312i ? 1.0f : 0.0f).put((float) kVar.f73313j);
                        }
                    }
                }
                floatBuffer2.flip();
                ((ArrayList) this.f73271e).clear();
                return floatBuffer2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0238  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p419td.C26310k> mo53179c(java.lang.String r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            td.j$a r2 = p419td.C26308j.C26309a.BOLD_ITALIC
            if (r1 == 0) goto L_0x0373
            int r4 = r24.length()
            if (r4 != 0) goto L_0x0010
            goto L_0x0373
        L_0x0010:
            java.util.List<td.k> r4 = r0.f73271e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.clear()
            r4 = 0
            r5 = 0
        L_0x0019:
            int r6 = r24.length()
            if (r5 >= r6) goto L_0x0370
            qd.a$b r6 = p416qd.C25546a.f72238a
            if (r6 != 0) goto L_0x0025
            r6 = 0
            goto L_0x0029
        L_0x0025:
            int r6 = r6.mo52785b(r1, r5)
        L_0x0029:
            java.lang.String r7 = "MagicBrush.MBFontGlyphManager"
            r8 = 0
            java.lang.String r9 = "|"
            r10 = 1
            if (r6 <= 0) goto L_0x015e
            if (r6 <= 0) goto L_0x0156
            java.lang.StringBuilder r11 = r0.f73273g
            r11.setLength(r4)
            r12 = r5
            r11 = r6
        L_0x003a:
            if (r11 <= 0) goto L_0x0049
            java.lang.StringBuilder r13 = r0.f73273g
            char r14 = r1.charAt(r12)
            r13.append(r14)
            int r12 = r12 + r10
            int r11 = r11 + -1
            goto L_0x003a
        L_0x0049:
            java.lang.StringBuilder r11 = r0.f73273g
            r11.append(r9)
            td.j r9 = r0.f73272f
            float r9 = r9.f73293c
            r11.append(r9)
            java.lang.StringBuilder r9 = r0.f73273g
            java.lang.String r9 = r9.toString()
            java.util.HashMap<java.lang.String, td.k> r11 = r0.f73268b
            java.lang.Object r11 = r11.get(r9)
            td.k r11 = (p419td.C26310k) r11
            if (r11 == 0) goto L_0x0067
            goto L_0x014a
        L_0x0067:
            qd.a$b r11 = p416qd.C25546a.f72238a
            if (r11 == 0) goto L_0x014e
            android.graphics.drawable.Drawable r11 = r11.mo52784a(r1, r5)
            if (r11 != 0) goto L_0x0073
            goto L_0x0149
        L_0x0073:
            td.j r12 = r0.f73272f
            float r12 = r12.f73293c
            int r12 = (int) r12
            if (r12 <= 0) goto L_0x0149
            if (r12 > 0) goto L_0x007e
            goto L_0x0149
        L_0x007e:
            td.h r13 = r0.f73267a
            r13.getClass()
            if (r12 <= 0) goto L_0x0141
            if (r12 <= 0) goto L_0x0141
            td.g r14 = r13.f73275a
            td.g$a r14 = r14.f73269c
            java.util.Queue<td.k> r14 = r14.f73274a
            java.util.LinkedList r14 = (java.util.LinkedList) r14
            java.lang.Object r14 = r14.poll()
            td.k r14 = (p419td.C26310k) r14
            if (r14 != 0) goto L_0x009c
            td.k r14 = new td.k
            r14.<init>()
        L_0x009c:
            float r15 = (float) r12
            r14.f73304a = r15
            r14.f73305b = r8
            td.e r8 = r13.f73276b
            android.graphics.Rect r3 = r13.f73282h
            r8.mo53175a(r12, r12, r3)
            android.graphics.Rect r3 = r13.f73282h
            int r8 = r3.left
            if (r8 < 0) goto L_0x012b
            int r8 = r3.right
            if (r8 < 0) goto L_0x012b
            int r8 = r3.width()
            if (r8 <= 0) goto L_0x012b
            int r8 = r3.height()
            if (r8 > 0) goto L_0x00bf
            goto L_0x012b
        L_0x00bf:
            r14.f73306c = r15
            r14.f73307d = r15
            int r8 = r3.left
            float r8 = (float) r8
            td.e r12 = r13.f73276b
            android.graphics.Bitmap r12 = r12.f73260a
            if (r12 == 0) goto L_0x00d1
            int r12 = r12.getWidth()
            goto L_0x00d2
        L_0x00d1:
            r12 = 0
        L_0x00d2:
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = r3.top
            float r12 = (float) r12
            td.e r15 = r13.f73276b
            android.graphics.Bitmap r15 = r15.f73260a
            if (r15 == 0) goto L_0x00e2
            int r15 = r15.getHeight()
            goto L_0x00e3
        L_0x00e2:
            r15 = 0
        L_0x00e3:
            float r15 = (float) r15
            float r12 = r12 / r15
            int r15 = r3.right
            float r15 = (float) r15
            td.e r4 = r13.f73276b
            android.graphics.Bitmap r4 = r4.f73260a
            if (r4 == 0) goto L_0x00f3
            int r4 = r4.getWidth()
            goto L_0x00f4
        L_0x00f3:
            r4 = 0
        L_0x00f4:
            float r4 = (float) r4
            float r15 = r15 / r4
            int r4 = r3.bottom
            float r4 = (float) r4
            td.e r10 = r13.f73276b
            android.graphics.Bitmap r10 = r10.f73260a
            if (r10 == 0) goto L_0x0104
            int r10 = r10.getHeight()
            goto L_0x0105
        L_0x0104:
            r10 = 0
        L_0x0105:
            float r10 = (float) r10
            float r4 = r4 / r10
            r14.f73308e = r8
            r14.f73309f = r12
            r14.f73310g = r15
            r14.f73311h = r4
            r4 = 1
            r14.f73312i = r4
            android.graphics.Canvas r4 = r13.f73277c
            r4.save()
            android.graphics.Canvas r4 = r13.f73277c
            r4.clipRect(r3)
            r11.setBounds(r3)
            android.graphics.Canvas r3 = r13.f73277c
            r11.draw(r3)
            android.graphics.Canvas r3 = r13.f73277c
            r3.restore()
            r11 = r14
            goto L_0x012c
        L_0x012b:
            r11 = 0
        L_0x012c:
            if (r11 != 0) goto L_0x0139
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            qd.f r3 = p416qd.C89598h.f257791a
            java.lang.String r8 = "Load font drawable glyph failed."
            r3.mo109481d(r7, r8, r4)
            goto L_0x0149
        L_0x0139:
            r11.f73313j = r6
            java.util.HashMap<java.lang.String, td.k> r3 = r0.f73268b
            r3.put(r9, r11)
            goto L_0x014a
        L_0x0141:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "width or height unexpected"
            r1.<init>(r2)
            throw r1
        L_0x0149:
            r11 = 0
        L_0x014a:
            int r5 = r5 + r6
            r6 = 0
            goto L_0x035a
        L_0x014e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "FontDrawableProvider must support"
            r1.<init>(r2)
            throw r1
        L_0x0156:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "There is no font drawable"
            r1.<init>(r2)
            throw r1
        L_0x015e:
            char r3 = r1.charAt(r5)
            td.j r4 = r0.f73272f
            if (r4 != 0) goto L_0x0169
            r6 = 0
            goto L_0x034f
        L_0x0169:
            java.lang.StringBuilder r4 = r0.f73273g
            r6 = 0
            r4.setLength(r6)
            java.lang.StringBuilder r4 = r0.f73273g
            r4.append(r3)
            r4.append(r9)
            td.j r6 = r0.f73272f
            float r6 = r6.f73293c
            r4.append(r6)
            r4.append(r9)
            td.j r6 = r0.f73272f
            android.graphics.Typeface r6 = r6.f73291a
            if (r6 != 0) goto L_0x018a
            java.lang.String r6 = "null"
            goto L_0x0192
        L_0x018a:
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x0192:
            r4.append(r6)
            td.j r6 = r0.f73272f
            boolean r6 = r6.f73294d
            if (r6 == 0) goto L_0x01a5
            r4.append(r9)
            td.j r6 = r0.f73272f
            float r6 = r6.f73295e
            r4.append(r6)
        L_0x01a5:
            td.j r6 = r0.f73272f
            td.j$a r6 = r6.f73296f
            if (r6 == 0) goto L_0x01b7
            r4.append(r9)
            td.j r6 = r0.f73272f
            td.j$a r6 = r6.f73296f
            int r6 = r6.f73302d
            r4.append(r6)
        L_0x01b7:
            java.lang.String r4 = r4.toString()
            java.util.HashMap<java.lang.String, td.k> r6 = r0.f73268b
            java.lang.Object r6 = r6.get(r4)
            td.k r6 = (p419td.C26310k) r6
            if (r6 == 0) goto L_0x01c9
            r11 = r6
            r6 = 0
            goto L_0x0358
        L_0x01c9:
            td.h r6 = r0.f73267a
            td.g r9 = r6.f73275a
            td.g$a r9 = r9.f73269c
            java.util.Queue<td.k> r9 = r9.f73274a
            java.util.LinkedList r9 = (java.util.LinkedList) r9
            java.lang.Object r9 = r9.poll()
            td.k r9 = (p419td.C26310k) r9
            if (r9 != 0) goto L_0x01e0
            td.k r9 = new td.k
            r9.<init>()
        L_0x01e0:
            r10 = 0
            r9.f73312i = r10
            android.graphics.Paint$FontMetrics r11 = r6.f73283i
            float r12 = r11.bottom
            float r11 = r11.ascent
            float r12 = r12 - r11
            double r11 = (double) r12
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            char[] r12 = r6.f73281g
            r12[r10] = r3
            android.graphics.Paint r13 = r6.f73279e
            android.graphics.Rect r14 = r6.f73282h
            r15 = 1
            r13.getTextBounds(r12, r10, r15, r14)
            android.graphics.Paint r12 = r6.f73279e
            char[] r13 = r6.f73281g
            float r12 = r12.measureText(r13, r10, r15)
            android.graphics.Rect r10 = r6.f73282h
            int r10 = r10.width()
            float r10 = (float) r10
            float r10 = java.lang.Math.max(r10, r12)
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 + r12
            double r13 = (double) r10
            double r13 = java.lang.Math.ceil(r13)
            int r10 = (int) r13
            float r10 = (float) r10
            r9.f73304a = r10
            r9.f73305b = r8
            float r8 = (float) r11
            r9.f73306c = r10
            r9.f73307d = r8
            td.j r8 = r6.f73278d
            if (r8 != 0) goto L_0x0228
        L_0x0226:
            r8 = 0
            goto L_0x0234
        L_0x0228:
            td.j$a r8 = r8.f73296f
            r8.getClass()
            td.j$a r11 = p419td.C26308j.C26309a.ITALIC
            if (r8 == r11) goto L_0x0233
            if (r8 != r2) goto L_0x0226
        L_0x0233:
            r8 = 1
        L_0x0234:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x024e
            r8 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r8
            double r13 = (double) r10
            double r13 = java.lang.Math.ceil(r13)
            float r8 = (float) r13
            float r10 = r9.f73305b
            float r13 = r8 / r11
            float r10 = r10 - r13
            r9.f73305b = r10
            float r10 = r9.f73306c
            float r10 = r10 + r8
            r9.f73306c = r10
        L_0x024e:
            td.j r8 = r6.f73278d
            if (r8 != 0) goto L_0x0254
            r10 = 0
            goto L_0x0256
        L_0x0254:
            boolean r10 = r8.f73294d
        L_0x0256:
            if (r10 == 0) goto L_0x0266
            float r10 = r9.f73305b
            float r13 = r8.f73295e
            float r14 = r13 / r11
            float r10 = r10 - r14
            r9.f73305b = r10
            float r10 = r9.f73306c
            float r10 = r10 + r13
            r9.f73306c = r10
        L_0x0266:
            if (r8 != 0) goto L_0x026a
        L_0x0268:
            r10 = 0
            goto L_0x0276
        L_0x026a:
            td.j$a r8 = r8.f73296f
            r8.getClass()
            td.j$a r10 = p419td.C26308j.C26309a.BOLD
            if (r8 == r10) goto L_0x0275
            if (r8 != r2) goto L_0x0268
        L_0x0275:
            r10 = 1
        L_0x0276:
            if (r10 == 0) goto L_0x0282
            float r8 = r9.f73305b
            float r8 = r8 - r12
            r9.f73305b = r8
            float r8 = r9.f73306c
            float r8 = r8 + r11
            r9.f73306c = r8
        L_0x0282:
            td.e r8 = r6.f73276b
            float r10 = r9.f73306c
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            float r11 = r9.f73307d
            double r13 = (double) r11
            double r13 = java.lang.Math.ceil(r13)
            int r11 = (int) r13
            android.graphics.Rect r13 = r6.f73282h
            boolean r8 = r8.mo53175a(r10, r11, r13)
            if (r8 != 0) goto L_0x029f
            r9 = 0
            goto L_0x032f
        L_0x029f:
            android.graphics.Rect r8 = r6.f73282h
            int r10 = r8.left
            float r10 = (float) r10
            td.e r11 = r6.f73276b
            android.graphics.Bitmap r11 = r11.f73260a
            if (r11 == 0) goto L_0x02af
            int r11 = r11.getWidth()
            goto L_0x02b0
        L_0x02af:
            r11 = 0
        L_0x02b0:
            float r11 = (float) r11
            float r10 = r10 / r11
            int r11 = r8.top
            float r11 = (float) r11
            td.e r13 = r6.f73276b
            android.graphics.Bitmap r13 = r13.f73260a
            if (r13 == 0) goto L_0x02c0
            int r13 = r13.getHeight()
            goto L_0x02c1
        L_0x02c0:
            r13 = 0
        L_0x02c1:
            float r13 = (float) r13
            float r11 = r11 / r13
            int r13 = r8.right
            float r13 = (float) r13
            td.e r14 = r6.f73276b
            android.graphics.Bitmap r14 = r14.f73260a
            if (r14 == 0) goto L_0x02d1
            int r14 = r14.getWidth()
            goto L_0x02d2
        L_0x02d1:
            r14 = 0
        L_0x02d2:
            float r14 = (float) r14
            float r13 = r13 / r14
            int r8 = r8.bottom
            float r8 = (float) r8
            td.e r14 = r6.f73276b
            android.graphics.Bitmap r14 = r14.f73260a
            if (r14 == 0) goto L_0x02e2
            int r14 = r14.getHeight()
            goto L_0x02e3
        L_0x02e2:
            r14 = 0
        L_0x02e3:
            float r14 = (float) r14
            float r8 = r8 / r14
            r9.f73308e = r10
            r9.f73309f = r11
            r9.f73310g = r13
            r9.f73311h = r8
            android.graphics.Rect r8 = r6.f73282h
            android.graphics.Paint r10 = r6.f73279e
            if (r10 == 0) goto L_0x032f
            if (r8 != 0) goto L_0x02f6
            goto L_0x032f
        L_0x02f6:
            char[] r11 = r6.f73281g
            r13 = 0
            r11[r13] = r3
            android.graphics.Canvas r11 = r6.f73277c
            r11.save()
            android.graphics.Canvas r11 = r6.f73277c
            r11.clipRect(r8)
            android.graphics.Canvas r11 = r6.f73277c
            char[] r13 = r6.f73281g
            r18 = 0
            r19 = 1
            int r14 = r8.left
            float r14 = (float) r14
            float r15 = r9.f73305b
            float r20 = r14 - r15
            int r8 = r8.top
            float r8 = (float) r8
            float r14 = r9.f73307d
            float r8 = r8 + r14
            android.graphics.Paint$FontMetrics r14 = r6.f73283i
            float r14 = r14.bottom
            float r8 = r8 - r14
            float r21 = r8 - r12
            r16 = r11
            r17 = r13
            r22 = r10
            r16.drawText(r17, r18, r19, r20, r21, r22)
            android.graphics.Canvas r6 = r6.f73277c
            r6.restore()
        L_0x032f:
            if (r9 != 0) goto L_0x0351
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Load glyph failed. glyph == null ["
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = "]"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r6 = 0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            qd.f r8 = p416qd.C89598h.f257791a
            r8.mo109481d(r7, r3, r4)
        L_0x034f:
            r11 = 0
            goto L_0x0358
        L_0x0351:
            r6 = 0
            java.util.HashMap<java.lang.String, td.k> r3 = r0.f73268b
            r3.put(r4, r9)
            r11 = r9
        L_0x0358:
            int r5 = r5 + 1
        L_0x035a:
            if (r11 != 0) goto L_0x0365
            java.util.List<td.k> r1 = r0.f73271e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            r3 = 0
            return r3
        L_0x0365:
            r3 = 0
            java.util.List<td.k> r4 = r0.f73271e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r11)
            r4 = 0
            goto L_0x0019
        L_0x0370:
            java.util.List<td.k> r1 = r0.f73271e
            return r1
        L_0x0373:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p419td.C26304g.mo53179c(java.lang.String):java.util.List");
    }

    /* renamed from: d */
    public float mo53180d(String str) {
        if (str == null || str.length() == 0) {
            return 0.0f;
        }
        List<C26310k> c = mo53179c(str);
        if (c == null || ((ArrayList) c).size() == 0) {
            return -1.0f;
        }
        return this.f73267a.mo53181a(c);
    }
}
