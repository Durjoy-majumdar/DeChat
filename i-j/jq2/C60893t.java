package jq2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import co2.C55058p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ps2.C100891r;
import rq2.C101425k;
import rq2.C63489a;
import zt3.C119157j;

/* renamed from: jq2.t */
public class C60893t implements LivingDescBarLayout.C57346b {

    /* renamed from: a */
    public LivingDescBarLayout f173473a;

    /* renamed from: b */
    public C55058p f173474b;

    /* renamed from: jq2.t$a */
    public class C60894a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f173475d;

        /* renamed from: e */
        public final /* synthetic */ LivingDescBarLayout f173476e;

        /* renamed from: jq2.t$a$a */
        public class C60895a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f173477d;

            public C60895a(Bitmap bitmap) {
                this.f173477d = bitmap;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2$1");
                try {
                    C60894a.this.f173476e.setIconImage(new BitmapDrawable(this.f173477d));
                } catch (Throwable th) {
                    Log.m105920e("SnsAdRollHelper", "setImageBitmapAsync set bitmap drawable, exp = " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2$1");
            }
        }

        public C60894a(C60893t tVar, String str, LivingDescBarLayout livingDescBarLayout) {
            this.f173475d = str;
            this.f173476e = livingDescBarLayout;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2");
            try {
                Bitmap decodeFile = BitmapUtil.decodeFile(this.f173475d, (BitmapFactory.Options) null);
                if (decodeFile != null && !decodeFile.isRecycled()) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C60895a(decodeFile));
                }
            } catch (Throwable th) {
                Log.m105920e("SnsAdRollHelper", "setImageBitmapAsync decode bitmap drawable, exp = " + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2");
        }
    }

    public C60893t(LivingDescBarLayout livingDescBarLayout) {
        this.f173473a = livingDescBarLayout;
    }

    /* renamed from: a */
    public String mo80948a(int i) {
        SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        SnsMethodCalculate.markStartTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        C55058p pVar = this.f173474b;
        ArrayList arrayList = new ArrayList();
        if (pVar != null) {
            arrayList.addAll(pVar.f154592b);
        }
        SnsMethodCalculate.markEndTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (i < 0 || i >= arrayList.size()) {
            SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return "";
        }
        String str = (String) arrayList.get(i);
        SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        return str;
    }

    /* renamed from: b */
    public void mo85785b() {
        SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        C55058p pVar = this.f173474b;
        if (pVar == null) {
            Log.m105920e("SnsAdRollHelper", "checkLoadImage, adRollInfo is null");
            SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        LivingDescBarLayout livingDescBarLayout = this.f173473a;
        if (livingDescBarLayout == null) {
            Log.m105920e("SnsAdRollHelper", "checkLoadImage, rollingBar is null");
            SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        String str = pVar.f154591a;
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markStartTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            ImageView imageView = livingDescBarLayout.f164310d;
            if (imageView != null) {
                imageView.setImageResource(C0966R.raw.ad_living_description_icon);
            }
            SnsMethodCalculate.markEndTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            Log.m105924i("SnsAdRollHelper", "checkLoadImage, iconUrl is null");
            SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (!str.equals((String) livingDescBarLayout.getTag(C0966R.C0970id.joh))) {
            SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            if (Util.isNullOrNil(str)) {
                SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            } else {
                String l = C100891r.m132217l("adId_mm", str);
                if (Util.isNullOrNil(l) || !C86013q1.m106450k(l)) {
                    livingDescBarLayout.setTag(C0966R.C0970id.joh, str);
                    Log.m105918d("SnsAdRollHelper", "loadImage, hash = " + livingDescBarLayout.hashCode() + ", url = " + str);
                    C63489a.m74828c(str, new C60892s(this, new WeakReference(livingDescBarLayout), str));
                    SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                } else {
                    mo85786c(l, livingDescBarLayout);
                    SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
    }

    /* renamed from: c */
    public final void mo85786c(String str, LivingDescBarLayout livingDescBarLayout) {
        SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("SnsAdRollHelper", "setImageBitmapAsync, path is null");
            SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (livingDescBarLayout == null) {
            Log.m105920e("SnsAdRollHelper", "setImageBitmapAsync, bar is null");
            SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C60894a(this, str, livingDescBarLayout));
            SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
    }

    /* renamed from: d */
    public void mo85787d() {
        SnsMethodCalculate.markStartTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        LivingDescBarLayout livingDescBarLayout = this.f173473a;
        if (livingDescBarLayout == null) {
            Log.m105920e("SnsAdRollHelper", "setRollingBarAdapter, rollingBar is null");
            SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (!livingDescBarLayout.mo80930a()) {
            Log.m105924i("SnsAdRollHelper", "setRollingBarAdapter, rollingBar adapter is not empty");
            livingDescBarLayout.mo80931b();
            SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (getCount() == 0) {
            Log.m105924i("SnsAdRollHelper", "setRollingBarAdapter, adRollInfoTextList size is 0");
            SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else {
            livingDescBarLayout.setSlideAdapter(this);
            SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
    }

    /* renamed from: e */
    public void mo85788e() {
        SnsMethodCalculate.markStartTimeMs("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        LivingDescBarLayout livingDescBarLayout = this.f173473a;
        if (livingDescBarLayout == null) {
            Log.m105920e("SnsAdRollHelper", "setRollingBarStatus, rollingBar is null");
            SnsMethodCalculate.markEndTimeMs("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (getCount() == 0) {
            Log.m105924i("SnsAdRollHelper", "setRollingBarStatus, adRollInfoTextList size is 0");
            livingDescBarLayout.setVisibility(4);
            livingDescBarLayout.mo80932c();
        } else {
            livingDescBarLayout.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        SnsMethodCalculate.markStartTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        C55058p pVar = this.f173474b;
        ArrayList arrayList = new ArrayList();
        if (pVar != null) {
            arrayList.addAll(pVar.f154592b);
        }
        SnsMethodCalculate.markEndTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (C101425k.m133097a(arrayList)) {
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return 0;
        }
        int size = arrayList.size();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        return size;
    }
}
