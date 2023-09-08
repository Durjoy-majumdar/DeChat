package m93;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: m93.i */
public final class C46971i extends AsyncTask<ResolveInfo, Void, Drawable> {

    /* renamed from: a */
    public final Context f126282a;

    /* renamed from: b */
    public final String f126283b;

    /* renamed from: c */
    public final C46972a f126284c;

    /* renamed from: m93.i$a */
    public interface C46972a {
        /* renamed from: a */
        void mo68403a(Drawable drawable);
    }

    public C46971i(Context context, String str, C46972a aVar) {
        C87412m.m108594g(context, "context");
        this.f126282a = context;
        this.f126283b = str;
        this.f126284c = aVar;
    }

    /* renamed from: a */
    public final Bitmap mo72155a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Rect bounds = drawable.getBounds();
        C87412m.m108593f(bounds, "drawable.bounds");
        int width = !bounds.isEmpty() ? bounds.width() : drawable.getIntrinsicWidth();
        int height = !bounds.isEmpty() ? bounds.height() : drawable.getIntrinsicHeight();
        if (width <= 0) {
            width = 1;
        }
        if (height <= 0) {
            height = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        drawable.setBounds(bounds);
        return createBitmap;
    }

    /* renamed from: b */
    public final BitmapDrawable mo72156b(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(this.f126282a.getResources(), BitmapUtil.getRoundedCornerBitmap(bitmap, z, ((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.16666667f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r5 != null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            android.content.pm.ResolveInfo[] r5 = (android.content.pm.ResolveInfo[]) r5
            java.lang.String r0 = "MicroMsg.BrowserIconLoadTask"
            java.lang.String r1 = "params"
            gy3.C87412m.m108594g(r5, r1)
            r1 = 0
            r5 = r5[r1]
            r2 = 0
            android.content.Context r3 = r4.f126282a     // Catch:{ all -> 0x005a }
            android.graphics.drawable.Drawable r2 = m93.C46969f.m52279d(r3, r5)     // Catch:{ all -> 0x005a }
            boolean r5 = r2 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0025
            r5 = r2
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5     // Catch:{ all -> 0x005a }
            android.graphics.Bitmap r5 = r5.getBitmap()     // Catch:{ all -> 0x005a }
            android.graphics.drawable.BitmapDrawable r5 = r4.mo72156b(r5, r1)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x003b
            goto L_0x003a
        L_0x0025:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005a }
            r3 = 26
            if (r5 < r3) goto L_0x003b
            boolean r5 = r2 instanceof android.graphics.drawable.AdaptiveIconDrawable     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x003b
            android.graphics.Bitmap r5 = r4.mo72155a(r2)     // Catch:{ all -> 0x005a }
            r3 = 1
            android.graphics.drawable.BitmapDrawable r5 = r4.mo72156b(r5, r3)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x003b
        L_0x003a:
            r2 = r5
        L_0x003b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r5.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "alvinluo BrowserIconLoadTask doInBackground name: "
            r5.append(r3)     // Catch:{ all -> 0x005a }
            java.lang.String r3 = r4.f126283b     // Catch:{ all -> 0x005a }
            r5.append(r3)     // Catch:{ all -> 0x005a }
            java.lang.String r3 = ", iconDrawable "
            r5.append(r3)     // Catch:{ all -> 0x005a }
            r5.append(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x005a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x005a }
            goto L_0x0062
        L_0x005a:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "alvinluo loadBrowserIcon exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r3, r1)
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m93.C46971i.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable == null) {
            Log.m105921e("MicroMsg.BrowserIconLoadTask", "alvinluo loadBrowserIcon failed: %s", this.f126283b);
        }
        C46972a aVar = this.f126284c;
        if (aVar != null) {
            aVar.mo68403a(drawable);
        }
    }
}
