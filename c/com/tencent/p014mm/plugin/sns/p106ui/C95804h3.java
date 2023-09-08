package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.RecyclerView;
import co2.C92435h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94625d;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94700b;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94722i;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94723j;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95287y1;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import hr2.C46102b;
import hr2.C60146a;
import hr2.C98509c;
import j20.C117292a;
import java.util.List;
import jt2.C99024c;
import jt2.C99033h;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101296v;
import vo2.C102227a;
import vo2.C65833d;
import wo2.C102466d;
import zq2.C103063b;
import zq2.C103065c;
import zq2.C103066d;
import zq2.C112668f;
import zs2.C103069a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.h3 */
public class C95804h3 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ ContentFragment f279554d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f279555e;

    /* renamed from: f */
    public final /* synthetic */ SnsAdNativeLandingPagesUI.C95441x f279556f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.h3$a */
    public class C95805a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f279557d;

        public C95805a(Bitmap bitmap) {
            this.f279557d = bitmap;
        }

        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            boolean z;
            Bitmap bitmap;
            String str5 = "run";
            String str6 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
            SnsMethodCalculate.markStartTimeMs(str5, str6);
            Bitmap bitmap2 = this.f279557d;
            if (bitmap2 == null) {
                try {
                    if (SnsAdNativeLandingPagesUI.m121803J7(SnsAdNativeLandingPagesUI.this)) {
                        bitmap = BitmapUtil.getBitmapFromView(C95804h3.this.f279555e.getChildAt(0));
                        SnsAdNativeLandingPagesUI.m121804K7(SnsAdNativeLandingPagesUI.this).setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        bitmap = BitmapUtil.getBitmapFromView(SnsAdNativeLandingPagesUI.m121802I7(SnsAdNativeLandingPagesUI.this));
                        SnsAdNativeLandingPagesUI.m121804K7(SnsAdNativeLandingPagesUI.this).setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th) {
                    Throwable th4 = th;
                    bitmap2 = null;
                    Log.m105920e("MicroMsg.SnsAdNativeLandingPagesUI", "getBitmapFromView exp=" + th4.toString());
                }
            }
            if (bitmap2 != null) {
                SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).setAlpha(1.0f);
                SnsAdNativeLandingPagesUI.m121804K7(SnsAdNativeLandingPagesUI.this).setImageBitmap(bitmap2);
                C95804h3 h3Var = C95804h3.this;
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
                RecyclerView recyclerView = h3Var.f279555e;
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                snsAdNativeLandingPagesUI.getClass();
                SnsMethodCalculate.markStartTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                if (snsAdNativeLandingPagesUI.f277594m1) {
                    Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "is playing animation");
                    SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    str2 = str5;
                    str = str6;
                    str4 = "access$1400";
                    str3 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                } else {
                    snsAdNativeLandingPagesUI.f277594m1 = true;
                    if (snsAdNativeLandingPagesUI.isSupportNavigationSwipeBack()) {
                        snsAdNativeLandingPagesUI.getSwipeBackLayout().setEnableGesture(false);
                        snsAdNativeLandingPagesUI.getSwipeBackLayout().mo26381c(true);
                    }
                    AdLandingPageEggCardHelper adLandingPageEggCardHelper = snsAdNativeLandingPagesUI.f277519I1;
                    FrameLayout frameLayout = snsAdNativeLandingPagesUI.f277565b1;
                    adLandingPageEggCardHelper.getClass();
                    SnsMethodCalculate.markStartTimeMs("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    str2 = str5;
                    str = str6;
                    String str7 = "access$1400";
                    RecyclerView recyclerView2 = recyclerView;
                    int i = height;
                    int i2 = width;
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = snsAdNativeLandingPagesUI;
                    String str8 = "setSnsAnimaListener";
                    String str9 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                    String str10 = "tryPlayEnterAnimation";
                    if (adLandingPageEggCardHelper.f274094e) {
                        int width2 = frameLayout.getWidth();
                        int height2 = frameLayout.getHeight();
                        SnsMethodCalculate.markStartTimeMs("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        View view = adLandingPageEggCardHelper.f274107r;
                        String str11 = "checkStartSimpleTwistAnimation";
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        String str12 = "doSimpleTwistAnim";
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (!adLandingPageEggCardHelper.f274115z) {
                            View view3 = adLandingPageEggCardHelper.f274108s;
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(0);
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        View view4 = adLandingPageEggCardHelper.f274107r;
                        C9556a aVar3 = new C9556a();
                        String str13 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                        aVar3.mo10233c(Float.valueOf(0.0f));
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        View view6 = adLandingPageEggCardHelper.f274106q;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(Float.valueOf(0.0f));
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view6.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        View view8 = adLandingPageEggCardHelper.f274108s;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(Float.valueOf(0.0f));
                        View view9 = view8;
                        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view8.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                        C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        int intExtra = adLandingPageEggCardHelper.f274090a.getIntent().getIntExtra("img_gallery_top", 0);
                        if (C85875k4.m106205t(adLandingPageEggCardHelper.f274090a, false)) {
                            int o = C85875k4.m106198o(adLandingPageEggCardHelper.f274090a);
                            intExtra -= o;
                            Log.m105924i("AdLandingPageEggCardHelper", "hasCutOut, h=" + o + ", thumbTop=" + intExtra);
                        }
                        int intExtra2 = adLandingPageEggCardHelper.f274090a.getIntent().getIntExtra("img_gallery_left", 0);
                        int intExtra3 = adLandingPageEggCardHelper.f274090a.getIntent().getIntExtra("img_gallery_width", 0);
                        String str14 = str8;
                        int intExtra4 = adLandingPageEggCardHelper.f274090a.getIntent().getIntExtra("img_gallery_height", 0);
                        Bundle bundle = new Bundle();
                        bundle.putInt("param_thumb_left", intExtra2);
                        bundle.putInt("param_thumb_top", intExtra);
                        bundle.putInt("param_thumb_width", intExtra3);
                        bundle.putInt("param_thumb_height", intExtra4);
                        bundle.putInt("param_target_width", width2);
                        bundle.putInt("param_target_height", height2);
                        C99033h hVar = new C99033h(adLandingPageEggCardHelper.f274090a, adLandingPageEggCardHelper.f274105p, bundle, adLandingPageEggCardHelper.f274110u.f264513c.f264528a);
                        C94723j jVar = new C94723j(adLandingPageEggCardHelper);
                        str8 = str14;
                        SnsMethodCalculate.markStartTimeMs(str8, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
                        hVar.f290304d = jVar;
                        SnsMethodCalculate.markEndTimeMs(str8, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
                        View view10 = adLandingPageEggCardHelper.f274105p;
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c((Object) null);
                        View view11 = view10;
                        C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view11, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        hVar.mo138368b(0);
                        AdLandingPagesProxy.getInstance().playTimelineClickAnimation(0);
                        String str15 = str13;
                        SnsMethodCalculate.markEndTimeMs(str12, str15);
                        SnsMethodCalculate.markEndTimeMs(str11, str15);
                        z = true;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        z = false;
                    }
                    if (z) {
                        str3 = str9;
                        SnsMethodCalculate.markEndTimeMs(str10, str3);
                    } else {
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = snsAdNativeLandingPagesUI2;
                        str3 = str9;
                        String str16 = str10;
                        if (snsAdNativeLandingPagesUI3.f277590k1 == null) {
                            snsAdNativeLandingPagesUI3.f277590k1 = new C99024c(snsAdNativeLandingPagesUI3, snsAdNativeLandingPagesUI3.f277581h, snsAdNativeLandingPagesUI3.f277615t);
                            AdLandingPagesProxy.getInstance().playTimelineClickAnimation(0);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("param_thumb_left", snsAdNativeLandingPagesUI3.f277596n);
                            bundle2.putInt("param_thumb_top", snsAdNativeLandingPagesUI3.f277587j);
                            bundle2.putInt("param_thumb_width", snsAdNativeLandingPagesUI3.f277599o);
                            bundle2.putInt("param_thumb_height", snsAdNativeLandingPagesUI3.f277602p);
                            bundle2.putInt("param_target_width", i2);
                            bundle2.putInt("param_target_height", i);
                            snsAdNativeLandingPagesUI3.f277590k1.mo138367a(bundle2);
                            C99024c cVar = snsAdNativeLandingPagesUI3.f277590k1;
                            C95756d3 d3Var = new C95756d3(snsAdNativeLandingPagesUI3, recyclerView2);
                            cVar.getClass();
                            SnsMethodCalculate.markStartTimeMs(str8, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
                            cVar.f290304d = d3Var;
                            SnsMethodCalculate.markEndTimeMs(str8, "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
                            snsAdNativeLandingPagesUI3.f277590k1.mo138368b(0);
                        }
                        SnsMethodCalculate.markEndTimeMs(str16, str3);
                    }
                    str4 = str7;
                }
                SnsMethodCalculate.markEndTimeMs(str4, str3);
                str5 = str2;
                str6 = str;
            } else {
                String str17 = str5;
                String str18 = str6;
                SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).setAlpha(1.0f);
            }
            SnsMethodCalculate.markEndTimeMs(str5, str6);
        }
    }

    public C95804h3(SnsAdNativeLandingPagesUI.C95441x xVar, ContentFragment contentFragment, RecyclerView recyclerView) {
        this.f279556f = xVar;
        this.f279554d = contentFragment;
        this.f279555e = recyclerView;
    }

    public boolean onPreDraw() {
        String str;
        String str2;
        String str3;
        String str4;
        Bitmap bitmap;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Bitmap bitmap2;
        String str11;
        String str12;
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
        List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C102466d.C102468b bVar = snsAdNativeLandingPagesUI.f277532P1;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("firstFrameShow", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        if (bVar.f301742h == 0) {
            bVar.f301742h = System.currentTimeMillis();
        }
        SnsMethodCalculate.markEndTimeMs("firstFrameShow", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        Log.m105918d("MicroMsg.SnsAdNativeLandingPagesUI.launch", "firstPage onPreDraw");
        Log.m105925i("MicroMsg.SnsAdNativeLandingPagesUI", "onPreDraw %d, %d", Integer.valueOf(SnsAdNativeLandingPagesUI.m121807N7(SnsAdNativeLandingPagesUI.this).getHeight()), Integer.valueOf(SnsAdNativeLandingPagesUI.m121810Q7(SnsAdNativeLandingPagesUI.this)));
        SnsAdNativeLandingPagesUI.this.mo132534f8();
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = SnsAdNativeLandingPagesUI.this;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        AdLandingPageEggCardHelper adLandingPageEggCardHelper = snsAdNativeLandingPagesUI2.f277519I1;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ContentFragment contentFragment = this.f279554d;
        adLandingPageEggCardHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("checkStartAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        if (adLandingPageEggCardHelper.f274093d) {
            if (adLandingPageEggCardHelper.f274112w) {
                View view = adLandingPageEggCardHelper.f274106q;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "checkStartAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "checkStartAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adLandingPageEggCardHelper.f274107r, "alpha", new float[]{0.0f, 1.0f});
                str6 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                ofFloat.setDuration(1000);
                ofFloat.start();
            } else {
                str6 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
            }
            adLandingPageEggCardHelper.mo130364v(false, false);
            if (adLandingPageEggCardHelper.f274109t) {
                SnsMethodCalculate.markStartTimeMs("tryPlayGLTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                if (adLandingPageEggCardHelper.f274092c == null) {
                    Log.m105920e("AdLandingPageEggCardHelper", "tryPlayGLTwistAdAnimation, TwistAdCardView==null");
                    SnsMethodCalculate.markEndTimeMs("tryPlayGLTwistAdAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    str2 = "onPreDraw";
                    str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1";
                    str4 = "MicroMsg.SnsAdNativeLandingPagesUI";
                    str7 = "alpha";
                    str10 = "checkStartAnimation";
                    str9 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                    str3 = str6;
                    bitmap2 = null;
                } else {
                    adLandingPageEggCardHelper.mo130361r(contentFragment);
                    C94625d dVar = adLandingPageEggCardHelper.f274096g;
                    if (dVar != null) {
                        SnsMethodCalculate.markStartTimeMs("getTwistCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        C92435h.C92441e eVar = dVar.f273814s.f297601A;
                        SnsMethodCalculate.markEndTimeMs("getTwistCardAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                        if (TextUtils.isEmpty(adLandingPageEggCardHelper.f274110u.f264512b.f264530b) && eVar != null) {
                            C92435h.C92441e eVar2 = adLandingPageEggCardHelper.f274110u.f264512b;
                            eVar2.f264530b = eVar.f264530b;
                            eVar2.f264531c = eVar.f264531c;
                        }
                        if (TextUtils.isEmpty(adLandingPageEggCardHelper.f274097h)) {
                            adLandingPageEggCardHelper.mo130363u();
                        } else {
                            Log.m105928w("AdLandingPageEggCardHelper", "skip reqTwistCardId, twistCardId=" + adLandingPageEggCardHelper.f274097h);
                        }
                        if (adLandingPageEggCardHelper.f274090a.isSupportNavigationSwipeBack()) {
                            adLandingPageEggCardHelper.f274090a.getSwipeBackLayout().setEnableGesture(false);
                            adLandingPageEggCardHelper.f274090a.getSwipeBackLayout().mo26381c(true);
                        }
                        if (adLandingPageEggCardHelper.f274112w) {
                            View i = adLandingPageEggCardHelper.f274096g.mo131609i();
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(4);
                            C117292a.m165358d(i, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayGLTwistAdAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(i, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "tryPlayGLTwistAdAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        adLandingPageEggCardHelper.f274092c.setVisibility(0);
                        adLandingPageEggCardHelper.f274092c.setOnCardAnimListener(new C94722i(adLandingPageEggCardHelper));
                        Pair<Integer, Integer> U = adLandingPageEggCardHelper.f274096g.mo130206U();
                        GLTwistRoateCardsView gLTwistRoateCardsView = adLandingPageEggCardHelper.f274092c;
                        int intValue = ((Integer) U.first).intValue();
                        int intValue2 = ((Integer) U.second).intValue();
                        C92435h.C92441e eVar3 = adLandingPageEggCardHelper.f274110u.f264512b;
                        boolean z3 = eVar3.f264529a;
                        String str13 = eVar3.f264530b;
                        String str14 = eVar3.f264531c;
                        gLTwistRoateCardsView.getClass();
                        str4 = "MicroMsg.SnsAdNativeLandingPagesUI";
                        str3 = str6;
                        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                        str2 = "onPreDraw";
                        StringBuilder sb = new StringBuilder();
                        str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1";
                        sb.append("initData, defBgColor=");
                        sb.append(str14);
                        sb.append(", imgUrl=");
                        sb.append(str13);
                        Log.m105924i("GLTwistRoateCardsView", sb.toString());
                        gLTwistRoateCardsView.f274531E = str13;
                        if (!TextUtils.isEmpty(str14)) {
                            try {
                                gLTwistRoateCardsView.f274532F = Color.parseColor(str14);
                            } catch (Exception e) {
                                Log.m105920e("GLTwistRoateCardsView", "parseColor exp=" + e.toString());
                            }
                        }
                        if (intValue <= 0 || intValue2 <= 0) {
                            Log.m105920e("GLTwistRoateCardsView", "initData, size is 0, w=" + intValue + ", h=" + intValue2);
                            gLTwistRoateCardsView.f274543x = C76577a.m92151b(gLTwistRoateCardsView.f274538s, 221);
                            gLTwistRoateCardsView.f274544y = C76577a.m92151b(gLTwistRoateCardsView.f274538s, 375);
                        } else {
                            gLTwistRoateCardsView.f274543x = (int) (((float) intValue) * 0.75f);
                            gLTwistRoateCardsView.f274544y = (int) (((float) intValue2) * 0.75f);
                        }
                        Context context = gLTwistRoateCardsView.f274538s;
                        String str15 = gLTwistRoateCardsView.f274531E;
                        int i2 = gLTwistRoateCardsView.f274543x;
                        int i3 = gLTwistRoateCardsView.f274544y;
                        int i4 = gLTwistRoateCardsView.f274545z;
                        int i5 = gLTwistRoateCardsView.f274532F;
                        str7 = "alpha";
                        int i6 = gLTwistRoateCardsView.f274527A;
                        String str16 = "checkStartAnimation";
                        String str17 = "tryPlayGLTwistAdAnimation";
                        SnsMethodCalculate.markStartTimeMs("getCardBitmap", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                        long currentTimeMillis = System.currentTimeMillis();
                        String str18 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                        SnsMethodCalculate.markStartTimeMs("getShadowCachePath", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                        AdLandingPageEggCardHelper adLandingPageEggCardHelper2 = adLandingPageEggCardHelper;
                        String l = C100891r.m132217l("twist_card_shadow", str15);
                        SnsMethodCalculate.markEndTimeMs("getShadowCachePath", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                        Bitmap decodeFile = BitmapUtil.decodeFile(l, (BitmapFactory.Options) null);
                        if (decodeFile == null || decodeFile.isRecycled()) {
                            Bitmap bitmap3 = decodeFile;
                            SnsMethodCalculate.markStartTimeMs("loadRawCardBitmap", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                            str12 = "initData";
                            Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(C100891r.m132217l("adId", str15), i2, i3);
                            SnsMethodCalculate.markEndTimeMs("loadRawCardBitmap", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                            if (decodeFileWithSample != null) {
                                str11 = "GLTwistRoateCardsView";
                                decodeFile = BitmapUtil.getRoundedCornerBitmap(BitmapUtil.getCenterCropBitmap(decodeFileWithSample, i2, i3, true), true, (float) i6, true);
                            } else {
                                str11 = "GLTwistRoateCardsView";
                                Log.m105924i("CardImgCacheUtil", "start download");
                                C100891r.m132208c(str15, false, 1, 0, new C60146a(str15));
                                decodeFile = bitmap3;
                            }
                            if (decodeFile == null || decodeFile.isRecycled()) {
                                Log.m105924i("CardImgCacheUtil", "create defColor bmp");
                                decodeFile = C112668f.m154044a(i2, i3, i5, i6);
                                z2 = true;
                            } else {
                                Log.m105924i("CardImgCacheUtil", "create url bmp");
                                z2 = false;
                            }
                            if (decodeFile == null || decodeFile.isRecycled()) {
                                bitmap = null;
                            } else {
                                Log.m105924i("CardImgCacheUtil", "createShadowBmp");
                                int i7 = i4 * 2;
                                int i8 = i2 + i7;
                                int i9 = i3 + i7;
                                SnsMethodCalculate.markStartTimeMs("createShadowBmp", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                                Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                Bitmap bitmap4 = createBitmap;
                                Drawable drawable = context.getDrawable(C0966R.C0969drawable.bqh);
                                drawable.setBounds(0, 0, i8, i9);
                                drawable.draw(canvas);
                                Paint paint = new Paint();
                                Rect rect = new Rect(i4, i4, i8 - i4, i9 - i4);
                                bitmap = null;
                                canvas.drawBitmap(decodeFile, (Rect) null, rect, paint);
                                try {
                                    decodeFile.recycle();
                                } catch (Throwable unused) {
                                }
                                SnsMethodCalculate.markEndTimeMs("createShadowBmp", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                                decodeFile = bitmap4;
                            }
                            if (decodeFile != null && !decodeFile.isRecycled() && !z2) {
                                ((C119157j) C119157j.f356862d).mo183875f(new C46102b(decodeFile, str15));
                            }
                            Log.m105924i("CardImgCacheUtil", "getCardBitmap, cost=" + (System.currentTimeMillis() - currentTimeMillis));
                            SnsMethodCalculate.markEndTimeMs("getCardBitmap", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                        } else {
                            Log.m105924i("CardImgCacheUtil", "use cache shadow file");
                            SnsMethodCalculate.markEndTimeMs("getCardBitmap", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                            str11 = "GLTwistRoateCardsView";
                            str12 = "initData";
                            bitmap = null;
                        }
                        gLTwistRoateCardsView.f274533G = decodeFile;
                        int b = C76577a.m92151b(gLTwistRoateCardsView.f274538s, 200) + (gLTwistRoateCardsView.f274544y / 2);
                        gLTwistRoateCardsView.f274541v = b;
                        gLTwistRoateCardsView.f274542w = b;
                        gLTwistRoateCardsView.f274529C = z3;
                        if (z3) {
                            gLTwistRoateCardsView.f274530D = 3;
                        } else {
                            gLTwistRoateCardsView.f274530D = 9;
                        }
                        SnsMethodCalculate.markStartTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                        gLTwistRoateCardsView.queueEvent(new C103065c(gLTwistRoateCardsView));
                        SnsMethodCalculate.markEndTimeMs("removeAllViews", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                        SnsMethodCalculate.markStartTimeMs("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                        String str19 = str11;
                        Log.m105924i(str19, "addCardView begin");
                        for (int i15 = 0; i15 < 12; i15++) {
                            SnsMethodCalculate.markStartTimeMs("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                            C103063b bVar2 = new C103063b(gLTwistRoateCardsView.f274538s);
                            int i16 = gLTwistRoateCardsView.f274543x;
                            int i17 = gLTwistRoateCardsView.f274545z * 2;
                            bVar2.mo142776m(new C103063b.C103064a(i16 + i17, gLTwistRoateCardsView.f274544y + i17));
                            SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                            bVar2.f304079i = 0;
                            SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                            bVar2.mo142771h(gLTwistRoateCardsView.f274533G);
                            bVar2.mo142775l(0.0f);
                            SnsMethodCalculate.markEndTimeMs("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                            gLTwistRoateCardsView.mo130529d(bVar2);
                        }
                        SnsMethodCalculate.markStartTimeMs("glRequestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                        gLTwistRoateCardsView.queueEvent(new C103066d(gLTwistRoateCardsView));
                        SnsMethodCalculate.markEndTimeMs("glRequestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer");
                        gLTwistRoateCardsView.invalidate();
                        Log.m105924i(str19, "addCardView end");
                        SnsMethodCalculate.markEndTimeMs("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                        SnsMethodCalculate.markEndTimeMs(str12, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                        GLTwistRoateCardsView gLTwistRoateCardsView2 = adLandingPageEggCardHelper2.f274092c;
                        gLTwistRoateCardsView2.getClass();
                        SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                        gLTwistRoateCardsView2.f274534H.postDelayed(new C98509c(gLTwistRoateCardsView2), 100);
                        SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                        str9 = str18;
                        SnsMethodCalculate.markEndTimeMs(str17, str9);
                        str8 = str16;
                        z = true;
                        SnsMethodCalculate.markEndTimeMs(str8, str9);
                    } else {
                        str2 = "onPreDraw";
                        str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1";
                        str4 = "MicroMsg.SnsAdNativeLandingPagesUI";
                        str7 = "alpha";
                        str10 = "checkStartAnimation";
                        str9 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
                        str3 = str6;
                        bitmap2 = null;
                        Log.m105920e("AdLandingPageEggCardHelper", "mEggCardComponent==null");
                        SnsMethodCalculate.markEndTimeMs("tryPlayGLTwistAdAnimation", str9);
                    }
                }
                str8 = str10;
                z = false;
                SnsMethodCalculate.markEndTimeMs(str8, str9);
            } else {
                str2 = "onPreDraw";
                str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1";
                str4 = "MicroMsg.SnsAdNativeLandingPagesUI";
                str7 = "alpha";
                str3 = str6;
                bitmap = null;
                z = adLandingPageEggCardHelper.mo130366y(contentFragment, false);
                SnsMethodCalculate.markEndTimeMs("checkStartAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            }
            str5 = str7;
        } else {
            str2 = "onPreDraw";
            str = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1";
            str3 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
            str4 = "MicroMsg.SnsAdNativeLandingPagesUI";
            String str20 = "alpha";
            String str21 = "checkStartAnimation";
            AdLandingPageEggCardHelper adLandingPageEggCardHelper3 = adLandingPageEggCardHelper;
            String str22 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper";
            bitmap = null;
            if (adLandingPageEggCardHelper3.f274100k) {
                if (adLandingPageEggCardHelper3.f274112w) {
                    View view3 = adLandingPageEggCardHelper3.f274106q;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "checkStartAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "checkStartAnimation", "(Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    str5 = str20;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(adLandingPageEggCardHelper3.f274107r, str5, new float[]{0.0f, 1.0f});
                    ofFloat2.setDuration(1000);
                    ofFloat2.start();
                } else {
                    str5 = str20;
                }
                adLandingPageEggCardHelper3.mo130364v(false, false);
                z = adLandingPageEggCardHelper3.mo130365x(contentFragment, false);
                SnsMethodCalculate.markEndTimeMs(str21, str22);
            } else {
                str5 = str20;
                if (adLandingPageEggCardHelper3.f274101l) {
                    SnsMethodCalculate.markEndTimeMs(str21, str22);
                } else if (adLandingPageEggCardHelper3.f274103n) {
                    SnsMethodCalculate.markEndTimeMs(str21, str22);
                } else {
                    SnsMethodCalculate.markEndTimeMs(str21, str22);
                    z = false;
                }
                z = true;
            }
        }
        if (z) {
            this.f279555e.getViewTreeObserver().removeOnPreDrawListener(this);
            SnsMethodCalculate.markEndTimeMs(str2, str);
            return false;
        }
        String str23 = str2;
        String str24 = str;
        if (SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this)) {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = SnsAdNativeLandingPagesUI.this;
            String str25 = str3;
            SnsMethodCalculate.markStartTimeMs("access$700", str25);
            snsAdNativeLandingPagesUI3.getClass();
            SnsMethodCalculate.markStartTimeMs("initAdHalfScreenLandingPageHelper", str25);
            if (snsAdNativeLandingPagesUI3.f277624w != null) {
                SnsMethodCalculate.markEndTimeMs("initAdHalfScreenLandingPageHelper", str25);
            } else {
                Log.m105924i(str4, "initAdHalfScreenLandingPageHelper");
                C94696a aVar4 = new C94696a(snsAdNativeLandingPagesUI3);
                snsAdNativeLandingPagesUI3.f277624w = aVar4;
                C95971j3 j3Var = new C95971j3(snsAdNativeLandingPagesUI3);
                SnsMethodCalculate.markStartTimeMs("setHalfScreenModeListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                aVar4.f274080h = j3Var;
                SnsMethodCalculate.markEndTimeMs("setHalfScreenModeListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                SnsMethodCalculate.markEndTimeMs("initAdHalfScreenLandingPageHelper", str25);
            }
            SnsMethodCalculate.markEndTimeMs("access$700", str25);
            C94696a S7 = SnsAdNativeLandingPagesUI.m121812S7(SnsAdNativeLandingPagesUI.this);
            S7.getClass();
            SnsMethodCalculate.markStartTimeMs("runEnterAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            int height = S7.f274073a.findViewById(C0966R.C0970id.iwc).getHeight();
            int i18 = S7.f274077e;
            int i19 = height - i18;
            int i25 = i19 - i18;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(S7.f274074b, "translationY", new float[]{(float) i19, (float) i18});
            ofFloat3.setDuration(300);
            ofFloat3.addListener(new C94700b(S7));
            ofFloat3.addUpdateListener(new C102227a(S7, i25));
            if (C65833d.m77546a() && !S7.f274078f) {
                AdLandingPagesProxy.getInstance().onHalfScreenAnimationChange(true, true);
            }
            ofFloat3.start();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(S7.f274074b, str5, new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(300);
            ofFloat4.start();
            S7.f274076d.setBackgroundColor(Color.parseColor("#00000000"));
            View view4 = S7.f274076d;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper", "runEnterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper", "runEnterAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = S7.f274076d;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(Float.valueOf(0.0f));
            View view7 = view6;
            C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper", "runEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper", "runEnterAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            SnsMethodCalculate.markEndTimeMs("runEnterAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            this.f279555e.getViewTreeObserver().removeOnPreDrawListener(this);
            SnsMethodCalculate.markEndTimeMs(str23, str24);
            return false;
        }
        String str26 = str3;
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = SnsAdNativeLandingPagesUI.this;
        SnsMethodCalculate.markStartTimeMs("access$900", str26);
        C95287y1 l8 = snsAdNativeLandingPagesUI4.mo132539l8();
        SnsMethodCalculate.markEndTimeMs("access$900", str26);
        if (l8 != null) {
            SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            C101296v E = l8.mo131833E();
            bitmap = C103069a.m136314b(E != null ? E.f296751A : "", "scene_ad_landing");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onPreDraw, fullscreen, container.size=");
            sb4.append(SnsAdNativeLandingPagesUI.m121802I7(SnsAdNativeLandingPagesUI.this).getWidth());
            sb4.append(", ");
            sb4.append(SnsAdNativeLandingPagesUI.m121802I7(SnsAdNativeLandingPagesUI.this).getHeight());
            sb4.append(", shootImg.w=");
            sb4.append(bitmap != null ? bitmap.getWidth() : 0);
            sb4.append(", shootImg.h=");
            sb4.append(bitmap != null ? bitmap.getHeight() : 0);
            Log.m105924i("SphereImageView.SnsAdNativeLandingPagesUI", sb4.toString());
        }
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI5 = SnsAdNativeLandingPagesUI.this;
        SnsMethodCalculate.markStartTimeMs("access$1100", str26);
        boolean z4 = snsAdNativeLandingPagesUI5.f277612s;
        SnsMethodCalculate.markEndTimeMs("access$1100", str26);
        if (z4) {
            MMHandlerThread.postToMainThreadDelayed(new C95805a(bitmap), 50);
        } else {
            if (!SnsAdNativeLandingPagesUI.m121811R7(SnsAdNativeLandingPagesUI.this)) {
                SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI6 = SnsAdNativeLandingPagesUI.this;
                SnsMethodCalculate.markStartTimeMs("access$1500", str26);
                View view8 = snsAdNativeLandingPagesUI6.f277567c1;
                SnsMethodCalculate.markEndTimeMs("access$1500", str26);
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$3$1", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$3$1", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI7 = SnsAdNativeLandingPagesUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1600", str26);
            C54219z<Integer> zVar = snsAdNativeLandingPagesUI7.f277547U1;
            SnsMethodCalculate.markEndTimeMs("access$1600", str26);
            zVar.setValue(2);
            SnsAdNativeLandingPagesUI.this.mo132524Z8();
        }
        this.f279555e.getViewTreeObserver().removeOnPreDrawListener(this);
        SnsMethodCalculate.markEndTimeMs(str23, str24);
        return false;
    }
}
