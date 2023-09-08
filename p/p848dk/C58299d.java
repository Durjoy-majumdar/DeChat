package p848dk;

import android.util.LruCache;

/* renamed from: dk.d */
public class C58299d<T> {

    /* renamed from: a */
    public LruCache<String, T> f166937a = new C58300a(((int) Runtime.getRuntime().maxMemory()) / 32);

    /* renamed from: dk.d$a */
    public class C58300a extends LruCache<String, T> {
        public C58300a(int i) {
            super(i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int sizeOf(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                r2 = 0
                if (r3 != 0) goto L_0x0006
                goto L_0x003c
            L_0x0006:
                dk.d r0 = p848dk.C58299d.this
                r0.getClass()
                boolean r0 = r3 instanceof android.graphics.Bitmap
                if (r0 == 0) goto L_0x001c
                android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
                int r0 = r3.getRowBytes()
                int r3 = r3.getHeight()
            L_0x0019:
                int r0 = r0 * r3
                goto L_0x0033
            L_0x001c:
                boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
                if (r0 == 0) goto L_0x0032
                android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
                android.graphics.Bitmap r3 = r3.getBitmap()
                if (r3 != 0) goto L_0x0029
                goto L_0x0032
            L_0x0029:
                int r0 = r3.getRowBytes()
                int r3 = r3.getHeight()
                goto L_0x0019
            L_0x0032:
                r0 = 0
            L_0x0033:
                if (r0 != 0) goto L_0x003b
                dk.d r3 = p848dk.C58299d.this
                r3.getClass()
                goto L_0x003c
            L_0x003b:
                r2 = r0
            L_0x003c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p848dk.C58299d.C58300a.sizeOf(java.lang.Object, java.lang.Object):int");
        }
    }
}
