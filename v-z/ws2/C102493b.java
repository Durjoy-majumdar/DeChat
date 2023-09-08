package ws2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import as2.C92084a;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.C95278e;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import fm0.C86937f0;
import java.util.Map;
import java.util.WeakHashMap;
import ps2.C100882l;
import ps2.C100891r;

/* renamed from: ws2.b */
public class C102493b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f301788d;

    /* renamed from: e */
    public final /* synthetic */ String f301789e;

    /* renamed from: f */
    public final /* synthetic */ String f301790f;

    /* renamed from: g */
    public final /* synthetic */ ContentFragment f301791g;

    /* renamed from: ws2.b$a */
    public class C102494a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f301792d;

        public C102494a(Bitmap bitmap) {
            this.f301792d = bitmap;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$3$1");
            if (this.f301792d == null) {
                Log.m105925i("ContentFragment", "decode img fail, set bg color %s", C102493b.this.f301790f);
                ContentFragment contentFragment = C102493b.this.f301791g;
                int i = ContentFragment.f276480P;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment.getClass();
                SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment.mo131813Y();
                SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            } else {
                Log.m105924i("ContentFragment", "set bg with bitmap");
                ContentFragment contentFragment2 = C102493b.this.f301791g;
                int i2 = ContentFragment.f276480P;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                Map<String, Bitmap> map = contentFragment2.f276495d;
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                ((WeakHashMap) map).put(C102493b.this.f301790f, this.f301792d);
                ContentFragment contentFragment3 = C102493b.this.f301791g;
                Bitmap bitmap = this.f301792d;
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment3.mo131812X(bitmap);
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$3$1");
        }
    }

    public C102493b(ContentFragment contentFragment, String str, String str2, String str3) {
        this.f301791g = contentFragment;
        this.f301788d = str;
        this.f301789e = str2;
        this.f301790f = str3;
    }

    public void run() {
        Bitmap bitmap;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$3");
        Log.m105925i("ContentFragment", "download bg ok path %s ", this.f301788d);
        try {
            ContentFragment contentFragment = this.f301791g;
            int i = ContentFragment.f276480P;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            C100882l lVar = contentFragment.f276482B;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            Bitmap bitmap2 = null;
            if (lVar.f295428c) {
                ContentFragment contentFragment2 = this.f301791g;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment2.getClass();
                SnsMethodCalculate.markStartTimeMs("setBlurHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                MMHandlerThread.postToMainThreadDelayed(new C95278e(contentFragment2), 1000);
                SnsMethodCalculate.markEndTimeMs("setBlurHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                String l = C100891r.m132217l(this.f301789e, this.f301790f + "_blurimg");
                if (!C86013q1.m106450k(l)) {
                    Bitmap decodeFile = BitmapUtil.decodeFile(this.f301788d, (BitmapFactory.Options) null);
                    if (decodeFile != null) {
                        float f = 1.0f;
                        if (decodeFile.getHeight() < ContentFragment.m121306N(this.f301791g) || decodeFile.getWidth() < ContentFragment.m121303K(this.f301791g)) {
                            f = Math.max((((float) ContentFragment.m121303K(this.f301791g)) * 1.0f) / ((float) decodeFile.getWidth()), (((float) ContentFragment.m121306N(this.f301791g)) * 1.0f) / ((float) decodeFile.getHeight()));
                        }
                        Bitmap rotateAndScale = BitmapUtil.rotateAndScale(decodeFile, 0.0f, f, f);
                        try {
                            bitmap = Bitmap.createBitmap(rotateAndScale, (rotateAndScale.getWidth() - ContentFragment.m121303K(this.f301791g)) >>> 1, (rotateAndScale.getHeight() - ContentFragment.m121306N(this.f301791g)) >>> 1, ContentFragment.m121303K(this.f301791g), ContentFragment.m121306N(this.f301791g));
                        } catch (OutOfMemoryError e) {
                            Log.printErrStackTrace("ContentFragment", e, "", new Object[0]);
                            bitmap = null;
                        }
                        C92714n a = bitmap != null ? C92084a.m115749a(bitmap, l, Color.argb(140, 0, 0, 0), 180) : null;
                        if (a != null) {
                            bitmap2 = a.f266818d;
                        }
                    }
                } else {
                    bitmap2 = BitmapUtil.decodeFile(l);
                }
            } else {
                bitmap2 = BitmapUtil.decodeFile(this.f301788d, (BitmapFactory.Options) null);
            }
            MMHandlerThread.postToMainThread(new C102494a(bitmap2));
        } catch (Exception e2) {
            Log.m105920e("ContentFragment", "the backgroundCoverUrl is set error ,because " + e2.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$3");
    }
}
