package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import br2.C92298f;
import br2.C92300g;
import co2.C92445n;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C98520u2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kg3.C76577a;
import ps2.C100891r;
import rq2.C63489a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper */
public class FinderLivingAnimWrapper extends FrameLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f274420o = 0;

    /* renamed from: d */
    public Context f274421d;

    /* renamed from: e */
    public C98520u2 f274422e;

    /* renamed from: f */
    public String f274423f;

    /* renamed from: g */
    public volatile boolean f274424g = false;

    /* renamed from: h */
    public Set<String> f274425h = Collections.synchronizedSet(new HashSet());

    /* renamed from: i */
    public int f274426i;

    /* renamed from: j */
    public int f274427j;

    /* renamed from: n */
    public volatile boolean f274428n = false;

    public FinderLivingAnimWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130548c(context);
    }

    /* renamed from: a */
    public static void m120029a(FinderLivingAnimWrapper finderLivingAnimWrapper, List list) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        finderLivingAnimWrapper.getClass();
        SnsMethodCalculate.markStartTimeMs("prepareConfigIconAsyn", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (it.hasNext()) {
                C92445n.C92446a aVar = (C92445n.C92446a) it.next();
                if (!finderLivingAnimWrapper.f274425h.contains(aVar.f264565a)) {
                    Bitmap i = C100891r.m132214i("adId_mm", aVar.f264565a);
                    if (i != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList.add(i);
                        arrayList2.add(Integer.valueOf(aVar.f264566b));
                        finderLivingAnimWrapper.f274425h.add(aVar.f264565a);
                        Log.m105918d("FinderLivingAnimWrapper", "addIcon, rate=" + aVar.f264566b + ", iconUrl=" + aVar.f264565a);
                    } else {
                        C63489a.m74828c(aVar.f264565a, new C92300g(finderLivingAnimWrapper, aVar));
                    }
                }
            }
            if (finderLivingAnimWrapper.f274422e != null && arrayList != null && arrayList.size() > 0 && arrayList2.size() > 0) {
                try {
                    finderLivingAnimWrapper.f274422e.mo78228b(arrayList, arrayList2);
                } catch (Throwable th) {
                    Log.m105920e("FinderLivingAnimWrapper", "addCustomBitmapsAndRate, exp=" + th.toString());
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("prepareConfigIconAsyn", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    /* renamed from: e */
    public static boolean m120030e(C92445n nVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        StringBuilder sb = new StringBuilder();
        sb.append("showLivingAnim, isLivingNow=");
        sb.append(z);
        sb.append(", showLikeAnimation=");
        sb.append(nVar.f264562h);
        sb.append(", sdk_int=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        Log.m105924i("FinderLivingAnimWrapper", sb.toString());
        boolean z2 = z && nVar.f264562h && i >= 24;
        SnsMethodCalculate.markEndTimeMs("showLivingAnim", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        return z2;
    }

    /* renamed from: b */
    public final void mo130547b() {
        SnsMethodCalculate.markStartTimeMs("doClear", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        Log.m105924i("FinderLivingAnimWrapper", "doClear");
        try {
            C98520u2 u2Var = this.f274422e;
            if (u2Var != null) {
                u2Var.mo78227a();
            }
        } catch (Throwable th) {
            Log.m105920e("FinderLivingAnimWrapper", "doClear, exp=" + android.util.Log.getStackTraceString(th));
        }
        try {
            this.f274425h.clear();
        } catch (Throwable th4) {
            Log.m105920e("FinderLivingAnimWrapper", "doClear, exp=" + android.util.Log.getStackTraceString(th4));
        }
        this.f274424g = false;
        SnsMethodCalculate.markEndTimeMs("doClear", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    /* renamed from: c */
    public final void mo130548c(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        this.f274421d = context;
        this.f274426i = C76577a.m92151b(context, 60);
        this.f274427j = C76577a.m92151b(this.f274421d, 35);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    /* renamed from: d */
    public void mo130549d(C92445n nVar, String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        try {
            this.f274426i = i;
            this.f274427j = i2;
            Log.m105924i("FinderLivingAnimWrapper", "setAdLiveInfo, snsId=" + str + ", hash=" + hashCode());
            if (!TextUtils.isEmpty(this.f274423f) && !this.f274423f.equals(str)) {
                Log.m105928w("FinderLivingAnimWrapper", "setAdLiveInfo, snsId changed, old=" + this.f274423f + ", new=" + str);
                mo130547b();
            }
            this.f274423f = str;
            this.f274428n = false;
            if (this.f274422e == null) {
                C98520u2 s2 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83797s2(this.f274421d);
                this.f274422e = s2;
                FrameLayout view = s2.getView();
                if (view != null) {
                    addView(view, new FrameLayout.LayoutParams(-1, -1));
                } else {
                    Log.m105920e("FinderLivingAnimWrapper", "mILiveView.getView()==null");
                }
            }
            C98520u2 u2Var = this.f274422e;
            if (u2Var != null) {
                int i3 = (int) (nVar.f264563i * 1000.0f);
                if (i3 <= 0) {
                    i3 = 600;
                }
                u2Var.setInterval((long) i3);
            }
            List<C92445n.C92446a> list = nVar.f264564j;
            SnsMethodCalculate.markStartTimeMs("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            if (this.f274422e == null) {
                Log.m105920e("FinderLivingAnimWrapper", "prepareIconAsynAndStart, mILiveView==null");
                SnsMethodCalculate.markEndTimeMs("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            } else {
                ((C119157j) C119157j.f356862d).mo183875f(new C92298f(this, list));
                SnsMethodCalculate.markEndTimeMs("prepareIconAsynAndStart", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            }
        } catch (Throwable th) {
            Log.m105920e("FinderLivingAnimWrapper", "setAdLiveInfo, exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("setAdLiveInfo", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        super.onDetachedFromWindow();
        Log.m105924i("FinderLivingAnimWrapper", "onDetachedFromWindow, snsId=" + this.f274423f + ", hash=" + hashCode());
        this.f274428n = true;
        mo130547b();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public void setVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
        super.setVisibility(i);
        if (!(i == 0 || this.f274422e == null)) {
            Log.m105924i("FinderLivingAnimWrapper", "setVisibility=" + i + ", stopAndDestroy");
            mo130547b();
        }
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
    }

    public FinderLivingAnimWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo130548c(context);
    }
}
