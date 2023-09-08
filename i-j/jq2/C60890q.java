package jq2;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rq2.C63489a;

/* renamed from: jq2.q */
public class C60890q {

    /* renamed from: jq2.q$a */
    public class C60891a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f173464d;

        /* renamed from: e */
        public final /* synthetic */ ADXml.C95018g f173465e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f173466f;

        /* renamed from: g */
        public final /* synthetic */ int f173467g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f173468h;

        /* renamed from: i */
        public final /* synthetic */ int f173469i;

        public C60891a(int i, ADXml.C95018g gVar, ImageView imageView, int i2, ImageView imageView2, int i3) {
            this.f173464d = i;
            this.f173465e = gVar;
            this.f173466f = imageView;
            this.f173467g = i2;
            this.f173468h = imageView2;
            this.f173469i = i3;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper$1");
            Log.m105918d("FullCardCoverImageHelper", "curPlayTime:" + this.f173464d + ", disppear=" + this.f173465e.f275692h + ", appear=" + this.f173465e.f275694j);
            try {
                if (!TextUtils.isEmpty(this.f173465e.f275691g)) {
                    C63489a.m74826a(this.f173465e.f275691g, this.f173466f);
                    int i = this.f173464d;
                    int i2 = this.f173467g;
                    if (i >= i2 && i2 > 0) {
                        C60890q.m71302a(this.f173466f);
                    } else if (this.f173466f.getVisibility() != 0) {
                        this.f173466f.setVisibility(0);
                        Log.m105918d("FullCardCoverImageHelper", "show frontCoverIv, hash=" + this.f173466f.hashCode());
                    }
                } else {
                    ImageView imageView = this.f173466f;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                    SnsMethodCalculate.markStartTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                    imageView.setVisibility(4);
                    imageView.setImageDrawable((Drawable) null);
                    imageView.setTag(C0966R.C0970id.joh, "");
                    SnsMethodCalculate.markEndTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                }
                if (!TextUtils.isEmpty(this.f173465e.f275693i)) {
                    C63489a.m74826a(this.f173465e.f275693i, this.f173468h);
                    if (this.f173464d >= this.f173469i) {
                        C60890q.m71303b(this.f173468h);
                    } else if (this.f173468h.getVisibility() == 0) {
                        this.f173468h.setVisibility(4);
                        Log.m105918d("FullCardCoverImageHelper", "hide endCoverIv, hash=" + this.f173468h.hashCode());
                    }
                } else {
                    ImageView imageView2 = this.f173468h;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                    SnsMethodCalculate.markStartTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                    imageView2.setVisibility(4);
                    imageView2.setImageDrawable((Drawable) null);
                    imageView2.setTag(C0966R.C0970id.joh, "");
                    SnsMethodCalculate.markEndTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
                }
            } catch (Exception e) {
                Log.m105920e("FullCardCoverImageHelper", "checkCoverImageState exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper$1");
        }
    }

    /* renamed from: a */
    public static void m71302a(View view) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        SnsMethodCalculate.markStartTimeMs("animHideView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (view.getVisibility() == 0) {
            Log.m105918d("FullCardCoverImageHelper", "animHideView:" + view.hashCode());
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animHideView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animHideView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
        }
        SnsMethodCalculate.markEndTimeMs("animHideView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    /* renamed from: b */
    public static void m71303b(View view) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        SnsMethodCalculate.markStartTimeMs("animShowView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (view.getVisibility() != 0) {
            Log.m105918d("FullCardCoverImageHelper", "animShowView:" + view.hashCode());
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animShowView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animShowView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
        }
        SnsMethodCalculate.markEndTimeMs("animShowView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    /* renamed from: c */
    public static void m71304c(ADXml.C95018g gVar, int i, ImageView imageView, ImageView imageView2) {
        SnsMethodCalculate.markStartTimeMs("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (gVar == null) {
            SnsMethodCalculate.markEndTimeMs("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            return;
        }
        MMHandlerThread.postToMainThread(new C60891a(i, gVar, imageView, gVar.f275692h, imageView2, gVar.f275694j));
        SnsMethodCalculate.markEndTimeMs("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    /* renamed from: d */
    public static void m71305d(String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("checkResetCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markStartTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            imageView.setVisibility(4);
            imageView.setImageDrawable((Drawable) null);
            imageView.setTag(C0966R.C0970id.joh, "");
            SnsMethodCalculate.markEndTimeMs("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        } else if (!str.equals((String) imageView.getTag(C0966R.C0970id.joh))) {
            imageView.setImageDrawable((Drawable) null);
        }
        SnsMethodCalculate.markEndTimeMs("checkResetCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }
}
