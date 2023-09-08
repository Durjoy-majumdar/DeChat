package hi3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import ii3.C87740c;

/* renamed from: hi3.c */
public class C87517c extends C87516b {

    /* renamed from: i */
    public C87518a f253541i;

    /* renamed from: hi3.c$a */
    public static class C87518a extends Drawable.ConstantState {

        /* renamed from: a */
        public Picture f253542a;

        /* renamed from: b */
        public Bitmap f253543b;

        /* renamed from: c */
        public int f253544c;

        public C87518a(Picture picture, int i) {
            this.f253542a = picture;
            this.f253544c = i;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C87517c(this.f253542a, this.f253544c);
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return newDrawable();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87517c(Picture picture, int i) {
        super(picture != null ? picture.getWidth() : 0, picture != null ? picture.getHeight() : 0, 1.0f, i);
        this.f253541i = new C87518a(picture, i);
        this.f253534b.set(0, 0, this.f253539g, this.f253540h);
    }

    /* renamed from: c */
    public void mo121979c() {
        Bitmap bitmap = this.f253541i.f253543b;
        if (bitmap != null && !bitmap.isRecycled()) {
            C87740c.m109160c("MicroMsg.SVGPictureDrawable", "recycle bitmap:%s", this.f253541i.f253543b.toString());
            this.f253541i.f253543b.recycle();
            this.f253541i.f253543b = null;
        }
    }

    /* renamed from: d */
    public void mo121980d() {
        int i;
        if (this.f253541i.f253542a == null) {
            C87740c.m109159b("MicroMsg.SVGPictureDrawable", "Must not go here! %s", Integer.valueOf(this.f253533a));
            return;
        }
        long nanoTime = System.nanoTime();
        Bitmap bitmap = this.f253541i.f253543b;
        if (bitmap == null || bitmap.isRecycled()) {
            int i2 = this.f253539g;
            if (i2 > 2048 || (i = this.f253540h) > 2048) {
                C87740c.m109159b("MicroMsg.SVGPictureDrawable", "This drawable is too big. %s", Integer.valueOf(this.f253533a));
            } else if (i2 <= 0 || i <= 0) {
                C87740c.m109159b("MicroMsg.SVGPictureDrawable", "width and height must > 0.", new Object[0]);
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                this.f253541i.f253542a.draw(canvas);
                this.f253541i.f253543b = createBitmap;
                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000;
                mo121969a(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r5 = (java.lang.System.nanoTime() - r0) / 1000;
        mo121969a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085 A[Catch:{ all -> 0x001a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            long r0 = java.lang.System.nanoTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            android.view.View r4 = r11.mo121970b()     // Catch:{ all -> 0x001a }
            if (r4 != 0) goto L_0x0020
            android.view.View r4 = hi3.C87515a.m108832b(r11)     // Catch:{ all -> 0x001a }
            monitor-enter(r11)     // Catch:{ all -> 0x001a }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x001d }
            r5.<init>(r4)     // Catch:{ all -> 0x001d }
            r11.f253538f = r5     // Catch:{ all -> 0x001d }
            monitor-exit(r11)     // Catch:{ all -> 0x001a }
            goto L_0x0020
        L_0x001a:
            r4 = move-exception
            goto L_0x00b6
        L_0x001d:
            r4 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x001a }
            throw r4     // Catch:{ all -> 0x001a }
        L_0x0020:
            r5 = 30
            boolean r5 = p206nj.C11171e.m11046c(r5)     // Catch:{ all -> 0x001a }
            r6 = 119(0x77, float:1.67E-43)
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x0043
            int r5 = r4.getLayerType()     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0043
            boolean r5 = p156gj.C87203t.m108279o()     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0043
            boolean r5 = hi3.C87515a.m108837h()     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0043
            r11.mo121979c()     // Catch:{ all -> 0x001a }
            goto L_0x007d
        L_0x0043:
            boolean r5 = r12.isHardwareAccelerated()     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x007a
            r11.mo121980d()     // Catch:{ all -> 0x001a }
            hi3.c$a r5 = r11.f253541i     // Catch:{ all -> 0x001a }
            android.graphics.Bitmap r5 = r5.f253543b     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x007d
            boolean r5 = r5.isRecycled()     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0059
            goto L_0x007d
        L_0x0059:
            boolean r5 = r11.f253535c     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x006a
            android.graphics.Rect r5 = r11.getBounds()     // Catch:{ all -> 0x001a }
            int r8 = r11.f253539g     // Catch:{ all -> 0x001a }
            int r9 = r11.f253540h     // Catch:{ all -> 0x001a }
            android.graphics.Rect r10 = r11.f253534b     // Catch:{ all -> 0x001a }
            android.view.Gravity.apply(r6, r8, r9, r5, r10)     // Catch:{ all -> 0x001a }
        L_0x006a:
            r11.f253535c = r7     // Catch:{ all -> 0x001a }
            hi3.c$a r5 = r11.f253541i     // Catch:{ all -> 0x001a }
            android.graphics.Bitmap r5 = r5.f253543b     // Catch:{ all -> 0x001a }
            r8 = 0
            android.graphics.Rect r9 = r11.f253534b     // Catch:{ all -> 0x001a }
            android.graphics.Paint r10 = r11.f253536d     // Catch:{ all -> 0x001a }
            r12.drawBitmap(r5, r8, r9, r10)     // Catch:{ all -> 0x001a }
            r5 = 1
            goto L_0x007e
        L_0x007a:
            r11.mo121979c()     // Catch:{ all -> 0x001a }
        L_0x007d:
            r5 = 0
        L_0x007e:
            android.graphics.Paint r8 = r11.f253536d     // Catch:{ all -> 0x001a }
            hi3.C87515a.m108836g(r4, r8)     // Catch:{ all -> 0x001a }
            if (r5 != 0) goto L_0x00ac
            r12.isHardwareAccelerated()     // Catch:{ all -> 0x001a }
            hi3.c$a r4 = r11.f253541i     // Catch:{ all -> 0x001a }
            android.graphics.Picture r4 = r4.f253542a     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x00ac
            boolean r5 = r11.f253535c     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x009f
            android.graphics.Rect r5 = r11.getBounds()     // Catch:{ all -> 0x001a }
            int r8 = r11.f253539g     // Catch:{ all -> 0x001a }
            int r9 = r11.f253540h     // Catch:{ all -> 0x001a }
            android.graphics.Rect r10 = r11.f253534b     // Catch:{ all -> 0x001a }
            android.view.Gravity.apply(r6, r8, r9, r5, r10)     // Catch:{ all -> 0x001a }
        L_0x009f:
            r11.f253535c = r7     // Catch:{ all -> 0x001a }
            r12.save()     // Catch:{ all -> 0x001a }
            android.graphics.Rect r5 = r11.f253534b     // Catch:{ all -> 0x001a }
            r12.drawPicture(r4, r5)     // Catch:{ all -> 0x001a }
            r12.restore()     // Catch:{ all -> 0x001a }
        L_0x00ac:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r0
            long r4 = r4 / r2
            r11.mo121969a(r12)
            return
        L_0x00b6:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r0
            long r5 = r5 / r2
            r11.mo121969a(r12)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hi3.C87517c.draw(android.graphics.Canvas):void");
    }

    public Drawable.ConstantState getConstantState() {
        return this.f253541i;
    }
}
