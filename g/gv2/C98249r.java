package gv2;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import m40.C99786a;
import m40.C99787b;
import p206nj.C11171e;

/* renamed from: gv2.r */
public class C98249r {

    /* renamed from: e */
    public static C98249r f288050e = new C98249r();

    /* renamed from: f */
    public static final int f288051f = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3635t);

    /* renamed from: a */
    public int f288052a = 0;

    /* renamed from: b */
    public C99786a f288053b = null;

    /* renamed from: c */
    public C99786a f288054c = null;

    /* renamed from: d */
    public Activity f288055d;

    /* renamed from: a */
    public static C98249r m126976a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        C98249r rVar = f288050e;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return rVar;
    }

    /* renamed from: f */
    public static void m126977f() {
        SnsMethodCalculate.markStartTimeMs("resetConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        m126976a();
        C98249r rVar = f288050e;
        SnsMethodCalculate.markStartTimeMs("resetImp", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        rVar.f288053b = null;
        rVar.f288054c = null;
        SnsMethodCalculate.markEndTimeMs("resetImp", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        SnsMethodCalculate.markEndTimeMs("resetConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
    }

    /* renamed from: b */
    public C99786a mo137551b() {
        SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        int p = (int) (((float) f288051f) * C76577a.m92165p(MMApplicationContext.getContext()));
        C99786a aVar = this.f288053b;
        if (aVar == null || ((int) aVar.f292464l) != p) {
            if (Build.VERSION.SDK_INT == 28) {
                C99787b a = C99787b.m130238a();
                a.f292468a.f292459g = 8388627;
                int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7f);
                C99786a aVar2 = a.f292468a;
                aVar2.f292465m = color;
                aVar2.f292464l = (float) p;
                aVar2.f292467o = 1;
                this.f288053b = aVar2;
            } else {
                C99787b a2 = C99787b.m130238a();
                a2.f292468a.f292459g = 8388627;
                int color2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7f);
                C99786a aVar3 = a2.f292468a;
                aVar3.f292465m = color2;
                aVar3.f292464l = (float) p;
                this.f288053b = aVar3;
            }
        }
        C99786a aVar4 = this.f288053b;
        SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return aVar4;
    }

    /* renamed from: c */
    public C99786a mo137552c() {
        SnsMethodCalculate.markStartTimeMs("getTextViewShortConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        int p = (int) (((float) f288051f) * C76577a.m92165p(MMApplicationContext.getContext()));
        if (Build.VERSION.SDK_INT == 28) {
            C99787b a = C99787b.m130238a();
            a.f292468a.f292459g = 8388627;
            int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7f);
            C99786a aVar = a.f292468a;
            aVar.f292465m = color;
            aVar.f292464l = (float) p;
            aVar.f292453a = 6;
            aVar.f292467o = 1;
            this.f288054c = aVar;
        } else {
            C99787b a2 = C99787b.m130238a();
            a2.f292468a.f292459g = 8388627;
            int color2 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7f);
            C99786a aVar2 = a2.f292468a;
            aVar2.f292465m = color2;
            aVar2.f292464l = (float) p;
            aVar2.f292453a = 6;
            this.f288054c = aVar2;
        }
        C99786a aVar3 = this.f288054c;
        SnsMethodCalculate.markEndTimeMs("getTextViewShortConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return aVar3;
    }

    /* renamed from: d */
    public int mo137553d() {
        SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        if (this.f288052a <= 0) {
            int i = C94866e1.Lx0().x;
            int dimension = (int) (MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6) + MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6));
            int dimension2 = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.aoo);
            int dimension3 = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6);
            int i2 = (i - dimension2) - dimension;
            this.f288052a = i2;
            if (i2 <= 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                this.f288052a = (i - dimension2) - dimension;
                Log.m105924i("MicroMsg.SnsPostDescPreloadTextViewConfig", "try again, screenWidth " + i + " textViewWidth " + this.f288052a + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
            }
            if (C85875k4.m106197n0()) {
                if (!C11171e.m11046c(30) || !C85878m2.m106212a(MMApplicationContext.getContext()) || C85875k4.m106164U()) {
                    Activity activity = this.f288055d;
                    if (activity != null && ((C85875k4.m106154K(activity.getTaskId()) || (C85875k4.m106155L(this.f288055d.getContentResolver()) && Build.VERSION.SDK_INT >= 24 && !this.f288055d.isInMultiWindowMode())) && !C85878m2.m106213b(this.f288055d.getTaskId()))) {
                        this.f288052a = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
                    }
                } else {
                    this.f288052a = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("finally, screenWidth ");
            sb.append(i);
            sb.append(" textViewWidth ");
            sb.append(this.f288052a);
            sb.append(" padding: ");
            sb.append(dimension);
            sb.append(" marginLeft: ");
            sb.append(dimension2);
            sb.append(" thisviewPadding: ");
            sb.append(dimension3);
            sb.append("activity: ");
            sb.append(this.f288055d == null);
            Log.m105924i("MicroMsg.SnsPostDescPreloadTextViewConfig", sb.toString());
        }
        int i3 = this.f288052a;
        SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        return i3;
    }

    /* renamed from: e */
    public void mo137554e() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        this.f288052a = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
    }

    /* renamed from: g */
    public void mo137555g(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        this.f288055d = activity;
        SnsMethodCalculate.markEndTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
    }
}
