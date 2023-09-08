package cr2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;

/* renamed from: cr2.b */
public abstract class C97358b {

    /* renamed from: a */
    public C97359a f285836a;

    /* renamed from: b */
    public int f285837b;

    /* renamed from: c */
    public int f285838c;

    /* renamed from: d */
    public Context f285839d;

    /* renamed from: e */
    public ArrayList<Rect> f285840e = new ArrayList<>();

    /* renamed from: cr2.b$a */
    public static class C97359a {

        /* renamed from: a */
        public Bitmap f285841a;

        /* renamed from: b */
        public int f285842b;

        /* renamed from: c */
        public int f285843c;

        /* renamed from: d */
        public int f285844d;

        /* renamed from: e */
        public int f285845e;

        /* renamed from: f */
        public int f285846f;

        /* renamed from: g */
        public int f285847g;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene$SceneParams");
            String str = "SceneParams{bmp=" + this.f285841a + ", minSize=" + this.f285842b + ", maxSize=" + this.f285843c + ", duration=" + this.f285844d + ", sceneWidth=" + this.f285845e + ", sceneHeight=" + this.f285846f + ", spriteNum=" + this.f285847g + '}';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene$SceneParams");
            return str;
        }
    }

    public C97358b(Context context, C97359a aVar) {
        this.f285839d = context;
        this.f285836a = aVar;
        if (this.f285837b == 0) {
            this.f285837b = C76577a.m92151b(context, 180);
        }
        if (this.f285838c == 0) {
            this.f285838c = C76577a.m92151b(this.f285839d, 220);
        }
    }

    /* renamed from: a */
    public abstract void mo136626a(Rect rect);

    /* renamed from: b */
    public synchronized void mo136629b() {
        SnsMethodCalculate.markStartTimeMs("buildSprites", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        try {
            mo136627c();
            SnsMethodCalculate.markStartTimeMs("getSpriteNum", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            int i = this.f285836a.f285847g;
            SnsMethodCalculate.markEndTimeMs("getSpriteNum", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            for (int i2 = 0; i2 < i; i2++) {
                this.f285840e.add(mo136630d());
            }
            Iterator<Rect> it = this.f285840e.iterator();
            while (it.hasNext()) {
                mo136626a(it.next());
            }
        } catch (Throwable th) {
            Log.m105920e("longTouchAd.BaseScene", "buildSprites exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("buildSprites", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
    }

    /* renamed from: c */
    public abstract void mo136627c();

    /* renamed from: d */
    public abstract Rect mo136630d();

    /* renamed from: e */
    public Rect mo136631e(Rect rect, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("initRect", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        int i4 = i3 / 2;
        rect.left = i - i4;
        rect.right = i + i4;
        rect.top = i2 - i4;
        rect.bottom = i2 + i4;
        SnsMethodCalculate.markEndTimeMs("initRect", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        return rect;
    }
}
