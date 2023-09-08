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

/* renamed from: gv2.o */
public class C98241o {

    /* renamed from: d */
    public static C98241o f288030d = new C98241o();

    /* renamed from: a */
    public C99786a f288031a = null;

    /* renamed from: b */
    public int f288032b = 0;

    /* renamed from: c */
    public Activity f288033c;

    /* renamed from: a */
    public static C98241o m126934a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        C98241o oVar = f288030d;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return oVar;
    }

    /* renamed from: b */
    public C99786a mo137540b() {
        SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        int b = C76577a.m92151b(MMApplicationContext.getContext(), (int) (C76577a.m92165p(MMApplicationContext.getContext()) * 15.0f));
        C99786a aVar = this.f288031a;
        if (aVar == null || ((int) aVar.f292464l) != b) {
            C99787b a = C99787b.m130238a();
            a.f292468a.f292464l = (float) b;
            int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0_5);
            C99786a aVar2 = a.f292468a;
            aVar2.f292465m = color;
            aVar2.f292459g = 16;
            this.f288031a = aVar2;
        }
        C99786a aVar3 = this.f288031a;
        SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return aVar3;
    }

    /* renamed from: c */
    public int mo137541c() {
        SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        if (this.f288032b <= 0) {
            int i = C94866e1.Lx0().x;
            int dimension = (int) (MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6) + MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6));
            int dimension2 = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.aoo);
            int dimension3 = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6);
            int i2 = ((i - dimension2) - dimension) - dimension3;
            this.f288032b = i2;
            if (i2 <= 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                this.f288032b = ((i - dimension2) - dimension) - dimension3;
                Log.m105924i("MicroMsg.SnsCommentPreloadTextViewConfig", "try again, screenWidth " + i + " textViewWidth " + this.f288032b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
            }
            if (C85875k4.m106197n0() && C85875k4.m106208w()) {
                if (C11171e.m11046c(30) && C85878m2.m106212a(MMApplicationContext.getContext())) {
                    this.f288032b = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
                } else if ((C85875k4.m106154K(this.f288033c.getTaskId()) || (C85875k4.m106155L(this.f288033c.getContentResolver()) && Build.VERSION.SDK_INT >= 24 && !this.f288033c.isInMultiWindowMode())) && !C85878m2.m106213b(this.f288033c.getTaskId())) {
                    this.f288032b = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
                }
            }
            Log.m105924i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + i + " textViewWidth " + this.f288032b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
        }
        int i3 = this.f288032b;
        SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        return i3;
    }

    /* renamed from: d */
    public void mo137542d() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        this.f288032b = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
    }

    /* renamed from: e */
    public void mo137543e(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        this.f288033c = activity;
        SnsMethodCalculate.markEndTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
    }
}
