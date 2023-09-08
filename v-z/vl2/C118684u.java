package vl2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.TextPaint;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.model.C85609x0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p391w3.C22857b;
import te3.bk4;
import zt3.C119157j;

/* renamed from: vl2.u */
public class C118684u {

    /* renamed from: c */
    public static ExecutorService f355143c = ((C119157j) C119157j.f356862d).mo183883n("ScanTranslationRender");

    /* renamed from: a */
    public volatile int f355144a;

    /* renamed from: b */
    public volatile C118686b f355145b;

    /* renamed from: vl2.u$a */
    public class C118685a extends C85609x0<Void, Void, Bitmap> {

        /* renamed from: c */
        public int f355146c;

        /* renamed from: d */
        public Canvas f355147d;

        /* renamed from: e */
        public Bitmap f355148e;

        /* renamed from: f */
        public Bitmap f355149f;

        /* renamed from: g */
        public Matrix f355150g;

        /* renamed from: h */
        public float f355151h;

        /* renamed from: i */
        public Matrix f355152i;

        /* renamed from: j */
        public List<bk4> f355153j;

        /* renamed from: k */
        public Set<bk4> f355154k = new HashSet();

        /* renamed from: l */
        public Map<Integer, List<bk4>> f355155l = new HashMap();

        public C118685a(int i, List<bk4> list, float f, Bitmap bitmap) {
            int i2;
            int i3;
            int i4;
            this.f355146c = i;
            this.f355153j = list;
            this.f355151h = f;
            this.f355149f = bitmap;
            Iterator<bk4> it = this.f355153j.iterator();
            while (it.hasNext()) {
                bk4 next = it.next();
                int i5 = next.f353922f;
                boolean z = true;
                if (i5 <= 1 || (i2 = next.f353923g) <= 1 || i5 == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE || (i3 = next.f353920d) < 0 || (i4 = next.f353921e) < 0 || i3 == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE) {
                    Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "invalid translation info (%d,%d) %d %d", Integer.valueOf(next.f353920d), Integer.valueOf(next.f353921e), Integer.valueOf(next.f353922f), Integer.valueOf(next.f353923g));
                    z = false;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "remove invalid translation info");
                    it.remove();
                }
            }
            for (bk4 next2 : this.f355153j) {
                int i6 = next2.f353927n;
                if (i6 > 0) {
                    if (!this.f355155l.containsKey(Integer.valueOf(i6))) {
                        this.f355155l.put(Integer.valueOf(next2.f353927n), new ArrayList());
                    }
                    this.f355155l.get(Integer.valueOf(next2.f353927n)).add(next2);
                } else {
                    this.f355154k.add(next2);
                }
            }
        }

        /* renamed from: a */
        public Object mo57374a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            char c = 0;
            try {
                char c2 = 1;
                Bitmap copy = this.f355149f.copy(Bitmap.Config.ARGB_8888, true);
                this.f355150g = new Matrix();
                char c3 = 4;
                int i = 2;
                char c4 = 3;
                float[] fArr = {0.0f, 0.0f, (float) this.f355149f.getWidth(), (float) this.f355149f.getHeight()};
                float[] fArr2 = {0.0f, (float) (((double) this.f355149f.getWidth()) * Math.abs(Math.sin((double) this.f355151h))), (float) ((((double) this.f355149f.getWidth()) * Math.abs(Math.cos((double) this.f355151h))) + (((double) this.f355149f.getHeight()) * Math.abs(Math.sin((double) this.f355151h)))), (float) (((double) this.f355149f.getHeight()) * Math.abs(Math.cos((double) this.f355151h)))};
                this.f355150g.setPolyToPoly(fArr, 0, fArr2, 0, 2);
                this.f355150g.setRotate(-this.f355151h);
                Matrix matrix = new Matrix();
                this.f355152i = matrix;
                matrix.setPolyToPoly(fArr2, 0, fArr, 0, 2);
                this.f355152i.setRotate(this.f355151h);
                Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "angle %s", Float.valueOf(this.f355151h));
                long currentTimeMillis = System.currentTimeMillis();
                this.f355148e = Bitmap.createBitmap(copy, 0, 0, this.f355149f.getWidth(), this.f355149f.getHeight(), this.f355150g, true);
                Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "originalBitmap %d, %d  rotatedBitmap %d %d", Integer.valueOf(this.f355149f.getWidth()), Integer.valueOf(this.f355149f.getHeight()), Integer.valueOf(this.f355148e.getWidth()), Integer.valueOf(this.f355148e.getHeight()));
                this.f355147d = new Canvas(this.f355148e);
                Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "create rotated bitmap cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                long currentTimeMillis2 = System.currentTimeMillis();
                for (bk4 next : this.f355153j) {
                    Object[] objArr2 = new Object[5];
                    objArr2[0] = Integer.valueOf(next.f353920d);
                    objArr2[c2] = Integer.valueOf(next.f353921e);
                    objArr2[i] = Integer.valueOf(next.f353922f);
                    objArr2[c4] = Integer.valueOf(next.f353923g);
                    objArr2[c3] = Integer.valueOf(next.f353925i.length());
                    Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "x %s, y %s, width %s, height %s, text.length %s", objArr2);
                    C118684u uVar = C118684u.this;
                    Bitmap bitmap = this.f355148e;
                    uVar.getClass();
                    if (next.f353920d + next.f353922f > bitmap.getWidth()) {
                        next.f353922f = bitmap.getWidth() - next.f353920d;
                    }
                    if (next.f353921e + next.f353923g > bitmap.getHeight()) {
                        next.f353923g = bitmap.getHeight() - next.f353921e;
                    }
                    C118684u uVar2 = C118684u.this;
                    Bitmap bitmap2 = this.f355148e;
                    int i2 = next.f353920d;
                    int i3 = next.f353921e;
                    Bitmap a = C118684u.m167374a(uVar2, bitmap2, new Rect(i2, i3, next.f353922f + i2, next.f353923g + i3));
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = Integer.valueOf(a.getWidth());
                    objArr3[1] = Integer.valueOf(a.getHeight());
                    Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "area bitmap %d, %d", objArr3);
                    int[] b = C118684u.m167375b(C118684u.this, a);
                    C118684u uVar3 = C118684u.this;
                    int i4 = b[0];
                    Canvas canvas = this.f355147d;
                    uVar3.getClass();
                    Paint paint = new Paint();
                    int i5 = next.f353920d;
                    int i6 = next.f353921e;
                    Rect rect = new Rect(i5, i6, next.f353922f + i5, next.f353923g + i6);
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setColor(i4);
                    paint.setAntiAlias(true);
                    canvas.drawRect(rect, paint);
                    if (((HashSet) this.f355154k).contains(next)) {
                        C118684u uVar4 = C118684u.this;
                        C118684u.m167377d(uVar4, C118684u.m167376c(uVar4, next), b[1], next, this.f355147d);
                    }
                    c3 = 4;
                    c2 = 1;
                    i = 2;
                    c4 = 3;
                }
                Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "draw all translation bg cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                long currentTimeMillis3 = System.currentTimeMillis();
                Iterator it = ((HashMap) this.f355155l).keySet().iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    ArrayList arrayList = new ArrayList();
                    for (bk4 c5 : (List) ((HashMap) this.f355155l).get(Integer.valueOf(intValue))) {
                        arrayList.add(Float.valueOf(C118684u.m167376c(C118684u.this, c5)));
                    }
                    float floatValue = ((Float) Collections.min(arrayList)).floatValue();
                    List list = (List) ((HashMap) this.f355155l).get(Integer.valueOf(intValue));
                    int i7 = 0;
                    while (i7 < list.size()) {
                        bk4 bk4 = (bk4) list.get(i7);
                        Object[] objArr4 = new Object[4];
                        objArr4[c] = Integer.valueOf(bk4.f353920d);
                        objArr4[1] = Integer.valueOf(bk4.f353921e);
                        objArr4[2] = Integer.valueOf(bk4.f353922f);
                        objArr4[3] = Integer.valueOf(bk4.f353923g);
                        Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "x %s, y %s, width %s, height %s", objArr4);
                        C118684u uVar5 = C118684u.this;
                        Bitmap bitmap3 = this.f355148e;
                        int i8 = bk4.f353920d;
                        int i9 = bk4.f353921e;
                        Iterator it4 = it;
                        Bitmap a2 = C118684u.m167374a(uVar5, bitmap3, new Rect(i8, i9, bk4.f353922f + i8, bk4.f353923g + i9));
                        Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "area bitmap %d, %d", Integer.valueOf(a2.getWidth()), Integer.valueOf(a2.getHeight()));
                        C118684u.m167377d(C118684u.this, floatValue, C118684u.m167375b(C118684u.this, a2)[1], bk4, this.f355147d);
                        i7++;
                        it = it4;
                        c = 0;
                    }
                }
                Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "draw all translation text cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis3));
                Bitmap bitmap4 = this.f355148e;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap4, 0, 0, bitmap4.getWidth(), this.f355148e.getHeight(), this.f355152i, true);
                Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "resultBitmap width %d, height %d", Integer.valueOf(createBitmap.getWidth()), Integer.valueOf(createBitmap.getHeight()));
                int[] iArr = new int[(this.f355149f.getWidth() * this.f355149f.getHeight())];
                createBitmap.getPixels(iArr, 0, this.f355149f.getWidth(), (createBitmap.getWidth() - this.f355149f.getWidth()) / 2, (createBitmap.getHeight() - this.f355149f.getHeight()) / 2, this.f355149f.getWidth(), this.f355149f.getHeight());
                return BitmapUtil.createBitmapByPixels(iArr, this.f355149f.getWidth(), this.f355149f.getHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", e, "render translation info error", new Object[0]);
                return null;
            }
        }

        /* renamed from: b */
        public ExecutorService mo57375b() {
            return C118684u.f355143c;
        }

        /* renamed from: c */
        public void mo57376c(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Log.m105925i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "task session %d, curSession %d", Integer.valueOf(this.f355146c), Integer.valueOf(C118684u.this.f355144a));
            if (this.f355146c != C118684u.this.f355144a) {
                Log.m105924i("MicroMsg.ScanTranslationRender.RenderTranslationInfoTask", "ignore this translation result");
            } else if (C118684u.this.f355145b != null) {
                C118684u.this.f355145b.mo175938W6(this.f355146c, bitmap);
            }
        }
    }

    /* renamed from: vl2.u$b */
    public interface C118686b {
        /* renamed from: W6 */
        void mo175938W6(int i, Bitmap bitmap);
    }

    /* renamed from: a */
    public static Bitmap m167374a(C118684u uVar, Bitmap bitmap, Rect rect) {
        uVar.getClass();
        int height = (int) (((float) rect.height()) * 0.1f);
        int width = ((int) (((float) rect.width()) * 0.1f)) / 2;
        int i = rect.left - width;
        if (i < 0) {
            i = 0;
        }
        rect.left = i;
        int i2 = height / 2;
        int i3 = rect.top - i2;
        if (i3 < 0) {
            i3 = 0;
        }
        rect.top = i3;
        rect.right = rect.right + width > bitmap.getWidth() ? bitmap.getWidth() : width + rect.right;
        rect.bottom = rect.bottom + i2 > bitmap.getHeight() ? bitmap.getHeight() : rect.bottom + i2;
        Log.m105925i("MicroMsg.ScanTranslationRender", "get bg area rect %s", rect);
        return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
    }

    /* renamed from: b */
    public static int[] m167375b(C118684u uVar, Bitmap bitmap) {
        uVar.getClass();
        C22857b.C22862e eVar = new C22857b.C22859b(bitmap).mo36019b().f65701e;
        if (eVar == null) {
            Log.m105924i("MicroMsg.ScanTranslationRender", "can not find suitable swatch");
            return C85875k4.m106174c(bitmap, bitmap.getWidth(), bitmap.getHeight());
        }
        eVar.mo36022a();
        return new int[]{eVar.f65714d, eVar.f65718h};
    }

    /* renamed from: c */
    public static float m167376c(C118684u uVar, bk4 bk4) {
        uVar.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(16.0f);
        DynamicLayout dynamicLayout = new DynamicLayout(bk4.f353925i, textPaint, bk4.f353922f, Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        while (dynamicLayout.getLineBottom(dynamicLayout.getLineCount() - 1) < bk4.f353923g) {
            textPaint.setTextSize(textPaint.getTextSize() + 0.5f);
            Log.m105919d("MicroMsg.ScanTranslationRender", "try bigger text size %f", Float.valueOf(textPaint.getTextSize()));
            dynamicLayout = new DynamicLayout(bk4.f353925i, textPaint, bk4.f353922f, Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        }
        while (dynamicLayout.getLineBottom(dynamicLayout.getLineCount() - 1) > bk4.f353923g && textPaint.getTextSize() > 1.0f) {
            textPaint.setTextSize(textPaint.getTextSize() - 0.5f);
            Log.m105919d("MicroMsg.ScanTranslationRender", "try smaller text size %f", Float.valueOf(textPaint.getTextSize()));
            dynamicLayout = new DynamicLayout(bk4.f353925i, textPaint, bk4.f353922f, Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        }
        return textPaint.getTextSize();
    }

    /* renamed from: d */
    public static void m167377d(C118684u uVar, float f, int i, bk4 bk4, Canvas canvas) {
        uVar.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(i);
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        Log.m105925i("MicroMsg.ScanTranslationRender", "alignment %d", Integer.valueOf(bk4.f353928o));
        DynamicLayout dynamicLayout = new DynamicLayout(bk4.f353925i, textPaint, bk4.f353922f, bk4.f353928o == 2 ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        canvas.save();
        Log.m105925i("MicroMsg.ScanTranslationRender", "translate %d, %d, textHeight %d, rect Height %d", Integer.valueOf(bk4.f353920d), Integer.valueOf(bk4.f353921e), Integer.valueOf(dynamicLayout.getHeight()), Integer.valueOf(bk4.f353923g));
        int height = dynamicLayout.getHeight();
        int i2 = bk4.f353923g;
        if (height < i2) {
            canvas.translate((float) bk4.f353920d, (float) (bk4.f353921e + ((i2 - dynamicLayout.getHeight()) / 2)));
        } else {
            canvas.translate((float) bk4.f353920d, (float) bk4.f353921e);
        }
        dynamicLayout.draw(canvas);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo183403e(int i, List<bk4> list, float f, Bitmap bitmap, C118686b bVar) {
        if (i != 0 && list != null && list.size() > 0 && bVar != null) {
            if (!(this.f355144a == 0 || i == this.f355144a)) {
                Log.m105925i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", Integer.valueOf(this.f355144a), Integer.valueOf(i));
                this.f355144a = 0;
                this.f355145b = null;
            }
            this.f355144a = i;
            this.f355145b = bVar;
            new C118685a(i, list, f, bitmap).mo119143f(new Void[0]);
        }
    }
}
