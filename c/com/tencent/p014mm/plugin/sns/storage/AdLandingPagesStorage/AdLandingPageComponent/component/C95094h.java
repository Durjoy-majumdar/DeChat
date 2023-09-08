package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.model.C94978z0;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p749xh.C102646h;
import qs2.C101255a0;
import qs2.C101271i0;
import qs2.C101278l0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h */
public class C95094h extends C95295z {

    /* renamed from: A */
    public int f275994A = 0;

    /* renamed from: B */
    public int f275995B = 0;

    /* renamed from: C */
    public int f275996C = 0;

    /* renamed from: D */
    public Handler f275997D = new C95096b(Looper.getMainLooper());

    /* renamed from: s */
    public Context f275998s;

    /* renamed from: t */
    public C101278l0 f275999t;

    /* renamed from: u */
    public View f276000u;

    /* renamed from: v */
    public TextView f276001v;

    /* renamed from: w */
    public FrameLayout f276002w;

    /* renamed from: x */
    public ViewGroup f276003x;

    /* renamed from: y */
    public C95098h0 f276004y;

    /* renamed from: z */
    public boolean f276005z = false;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h$a */
    public class C95095a implements View.OnClickListener {
        public C95095a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$1");
            C95094h hVar = C95094h.this;
            if (!hVar.f276005z) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            hVar.f275994A++;
            SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            int i = 0;
            C95098h0 h0Var = C95094h.this.f276004y;
            if (h0Var != null) {
                Button button = null;
                try {
                    if (h0Var instanceof C95108i0) {
                        button = ((C95108i0) h0Var).mo131625N();
                    } else if (h0Var instanceof C95144m0) {
                        button = ((C95144m0) h0Var).mo131669h0();
                    }
                    if (button != null) {
                        button.performClick();
                    } else {
                        Log.m105920e("AdLandingFullScreenFloatBarComp", "onClick noBtn found, comp=" + C95094h.this.f276004y);
                    }
                    i = C95094h.this.f276004y.mo131614H();
                } catch (Exception e) {
                    Log.m105920e("AdLandingFullScreenFloatBarComp", "onClick exp=" + e.toString());
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("onClick, clickCount=");
            C95094h hVar2 = C95094h.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            int i2 = hVar2.f275994A;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            sb.append(i2);
            sb.append(", btnClickCount=");
            sb.append(i);
            Log.m105924i("AdLandingFullScreenFloatBarComp", sb.toString());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h$b */
    public class C95096b extends Handler {
        public C95096b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            TranslateAnimation translateAnimation;
            TranslateAnimation translateAnimation2;
            Message message2 = message;
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$2");
            int i = message2.what;
            if (i == 1) {
                C95094h hVar = C95094h.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                int i2 = hVar.f275995B;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                if (i2 == 0) {
                    C95094h hVar2 = C95094h.this;
                    boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                    hVar2.getClass();
                    SnsMethodCalculate.markStartTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    if (hVar2.f276000u.getVisibility() != 0) {
                        View view = hVar2.f276000u;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        hVar2.mo124360B();
                        hVar2.f276000u.clearAnimation();
                        if (booleanValue) {
                            TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                            translateAnimation3.setInterpolator(new OvershootInterpolator(1.0f));
                            translateAnimation3.setDuration(700);
                            hVar2.f276000u.startAnimation(translateAnimation3);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                } else {
                    C95094h hVar3 = C95094h.this;
                    boolean booleanValue2 = ((Boolean) message2.obj).booleanValue();
                    C95094h hVar4 = C95094h.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    int i3 = hVar4.f275996C;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    hVar3.getClass();
                    SnsMethodCalculate.markStartTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    if (hVar3.f276000u.getVisibility() != 0) {
                        View view3 = hVar3.f276000u;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doShow", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        hVar3.mo124360B();
                        hVar3.f276000u.clearAnimation();
                        if (booleanValue2) {
                            float height = (((float) hVar3.f276000u.getHeight()) * 1.5f) / ((float) hVar3.f276000u.getWidth());
                            if (i3 == 0) {
                                translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.5f, 1, 0.0f);
                            } else {
                                translateAnimation2 = i3 == 90 ? new TranslateAnimation(1, -height, 1, 0.0f, 1, 0.0f, 1, 0.0f) : new TranslateAnimation(1, height, 1, 0.0f, 1, 0.0f, 1, 0.0f);
                            }
                            translateAnimation2.setInterpolator(new OvershootInterpolator(1.0f));
                            translateAnimation2.setDuration(700);
                            hVar3.f276000u.startAnimation(translateAnimation2);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("doShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                }
            } else if (i == 2) {
                C95094h hVar5 = C95094h.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                int i4 = hVar5.f275995B;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                if (i4 == 0) {
                    C95094h hVar6 = C95094h.this;
                    boolean booleanValue3 = ((Boolean) message2.obj).booleanValue();
                    hVar6.getClass();
                    SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    if (hVar6.f276000u.getVisibility() == 0) {
                        View view5 = hVar6.f276000u;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        hVar6.mo124361D();
                        hVar6.f276000u.clearAnimation();
                        if (booleanValue3) {
                            TranslateAnimation translateAnimation4 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                            translateAnimation4.setDuration(400);
                            hVar6.f276000u.startAnimation(translateAnimation4);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                } else {
                    C95094h hVar7 = C95094h.this;
                    boolean booleanValue4 = ((Boolean) message2.obj).booleanValue();
                    C95094h hVar8 = C95094h.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    int i5 = hVar8.f275996C;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    hVar7.getClass();
                    SnsMethodCalculate.markStartTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                    if (hVar7.f276000u.getVisibility() == 0) {
                        View view7 = hVar7.f276000u;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        Object[] b = aVar4.mo10232b();
                        C9556a aVar5 = aVar4;
                        View view8 = view7;
                        C117292a.m165358d(view8, b, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "doHide", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        hVar7.mo124361D();
                        hVar7.f276000u.clearAnimation();
                        if (booleanValue4) {
                            float height2 = (((float) hVar7.f276000u.getHeight()) * 1.5f) / ((float) hVar7.f276000u.getWidth());
                            if (i5 == 0) {
                                translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
                            } else {
                                translateAnimation = i5 == 90 ? new TranslateAnimation(1, 0.0f, 1, -height2, 1, 0.0f, 1, 0.0f) : new TranslateAnimation(1, 0.0f, 1, height2, 1, 0.0f, 1, 0.0f);
                            }
                            translateAnimation.setDuration(400);
                            hVar7.f276000u.startAnimation(translateAnimation);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("doHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h$c */
    public static class C95097c {

        /* renamed from: a */
        public C104289g f276008a = new C104289g();

        public C95097c(int i, long j, int i2, String str, int i3, long j2, int i4) {
            try {
                C104289g gVar = new C104289g();
                gVar.put("cid", str);
                gVar.mo145953n(C102646h.COL_EXPOSURECOUNT, i3);
                gVar.mo145954o("stayTime", j2);
                gVar.mo145953n("clickCount", i4);
                this.f276008a.mo145953n(C102646h.COL_EXPOSURECOUNT, i);
                this.f276008a.mo145954o("stayTime", j);
                this.f276008a.mo145953n("clickCount", i2);
                this.f276008a.put("btnInfo", gVar);
            } catch (Throwable th) {
                Log.m105920e("AdLandingFullScreenFloatBarComp", th.toString());
            }
        }
    }

    public C95094h(Context context, C101278l0 l0Var, ViewGroup viewGroup, int i) {
        super(context, l0Var, viewGroup);
        this.f275998s = context;
        this.f276003x = viewGroup;
        this.f275999t = l0Var;
        this.f275995B = i;
        mo67238e();
        mo67240g();
        Log.m105924i("AdLandingFullScreenFloatBarComp", "refreshView, cid=" + l0Var.f296495a + ", hash=" + hashCode());
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        super.mo124360B();
        C95098h0 h0Var = this.f276004y;
        if (h0Var != null) {
            h0Var.mo124360B();
        }
        Log.m105924i("AdLandingFullScreenFloatBarComp", "viewWillAppear");
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        super.mo67235C();
        C95098h0 h0Var = this.f276004y;
        if (h0Var != null) {
            h0Var.mo67235C();
            Log.m105924i("AdLandingFullScreenFloatBarComp", "viewWillDestroy, mBtnComponent exposureCount = " + this.f276004y.mo131851j() + ", mBtnComponent stayTime = " + this.f276004y.mo131555o() + ", mBtnComponent cid = " + this.f276004y.mo131857r());
        }
        this.f275997D.removeCallbacksAndMessages((Object) null);
        Log.m105924i("AdLandingFullScreenFloatBarComp", "viewWillDestroy");
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        super.mo124361D();
        C95098h0 h0Var = this.f276004y;
        if (h0Var != null) {
            h0Var.mo124361D();
            Log.m105924i("AdLandingFullScreenFloatBarComp", "viewWillDisappear, mBtnComponent exposureCount = " + this.f276004y.mo131851j() + ", mBtnComponent stayTime = " + this.f276004y.mo131555o() + ", mBtnComponent cid = " + this.f276004y.mo131857r());
        }
        Log.m105924i("AdLandingFullScreenFloatBarComp", "viewWillDisappear, exposureCount = " + mo131851j() + ", stayTime = " + mo131555o());
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: E */
    public final void mo131603E() {
        SnsMethodCalculate.markStartTimeMs("adJustBtnClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        C95098h0 h0Var = this.f276004y;
        if (h0Var != null) {
            h0Var.mo131615I(h0Var.mo131614H() - this.f275994A);
            Log.m105924i("AdLandingFullScreenFloatBarComp", "btn kv, clickCount=" + this.f276004y.mo131614H() + ", stayTime=" + this.f276004y.mo131555o());
        }
        SnsMethodCalculate.markEndTimeMs("adJustBtnClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: G */
    public String mo131604G() {
        SnsMethodCalculate.markStartTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        try {
            SnsMethodCalculate.markStartTimeMs("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            C95098h0 h0Var = this.f276004y;
            SnsMethodCalculate.markEndTimeMs("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            if (h0Var != null) {
                mo131603E();
                C95097c cVar = new C95097c(mo131851j(), mo131555o(), this.f275994A, h0Var.mo131857r(), h0Var.mo131851j(), h0Var.mo131555o(), h0Var.mo131614H());
                SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$FullScreenFloatBarContentBuilder");
                String gVar = cVar.f276008a.toString();
                SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp$FullScreenFloatBarContentBuilder");
                SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                return gVar;
            }
        } catch (Throwable th) {
            Log.m105920e("AdLandingFullScreenFloatBarComp", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        return "";
    }

    /* renamed from: H */
    public void mo131605H(boolean z, long j) {
        SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        this.f275997D.removeCallbacksAndMessages((Object) null);
        this.f275997D.sendMessageDelayed(this.f275997D.obtainMessage(2, Boolean.valueOf(z)), j);
        SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: I */
    public void mo131606I() {
        SnsMethodCalculate.markStartTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        int b = C76577a.m92151b(this.f275998s, 44);
        if (this.f276000u.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f276000u.getLayoutParams();
            layoutParams.leftMargin = b;
            layoutParams.rightMargin = b;
        }
        if (this.f276002w.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) this.f276002w.getLayoutParams()).leftMargin = C76577a.m92151b(this.f275998s, 24);
        }
        SnsMethodCalculate.markEndTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: J */
    public void mo131607J() {
        SnsMethodCalculate.markStartTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        if (this.f276000u.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f276000u.getLayoutParams();
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
        SnsMethodCalculate.markEndTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: K */
    public void mo131608K(boolean z, long j) {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        this.f275997D.removeCallbacksAndMessages((Object) null);
        this.f275997D.sendMessageDelayed(this.f275997D.obtainMessage(1, Boolean.valueOf(z)), j);
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        View inflate = LayoutInflater.from(this.f275998s).inflate(C0966R.C0971layout.c16, this.f276003x, false);
        this.f276000u = inflate;
        this.f276001v = (TextView) inflate.findViewById(C0966R.C0970id.eaf);
        this.f276002w = (FrameLayout) inflate.findViewById(C0966R.C0970id.eac);
        ((RoundedCornerFrameLayout) inflate.findViewById(C0966R.C0970id.ea_)).setRadius(0.0f);
        this.f276003x.addView(this.f276000u);
        View view = this.f276000u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFullScreenFloatBarComp", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        if (!TextUtils.isEmpty(this.f275999t.f296655z)) {
            this.f276001v.setText(this.f275999t.f296655z);
            this.f276001v.setVisibility(0);
        } else {
            this.f276001v.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f275999t.f296652A)) {
            try {
                this.f276001v.setTextColor(Color.parseColor(this.f275999t.f296652A));
            } catch (Exception e) {
                Log.m105920e("AdLandingFullScreenFloatBarComp", "refreshView descColor, exp=" + e.toString() + ", color=" + this.f275999t.f296652A);
            }
        }
        this.f276002w.removeAllViews();
        C95295z a = C96328z2.m123559a(this.f275998s, this.f275999t.f296654C, this.f276002w, 0);
        if (a instanceof C95098h0) {
            C95098h0 h0Var = (C95098h0) a;
            this.f276004y = h0Var;
            if (this.f275995B == 0) {
                C101255a0 a0Var = this.f275999t.f296654C;
                SnsMethodCalculate.markStartTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                C101271i0 i0Var = C94978z0.f275381a;
                if (i0Var != null) {
                    SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                } else {
                    i0Var = new C101271i0();
                    SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                }
                h0Var.mo131616J(a0Var, i0Var);
            }
        } else {
            Log.m105920e("AdLandingFullScreenFloatBarComp", "btnComp=" + a);
        }
        C95098h0 h0Var2 = this.f276004y;
        if (h0Var2 != null) {
            this.f276002w.addView(h0Var2.mo131855p());
        }
        this.f276005z = this.f275999t.f296653B;
        this.f276000u.setOnClickListener(new C95095a());
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
    }

    /* renamed from: i */
    public View mo131609i() {
        SnsMethodCalculate.markStartTimeMs("getContentView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        View view = this.f276000u;
        SnsMethodCalculate.markEndTimeMs("getContentView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        return view;
    }
}
