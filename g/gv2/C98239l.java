package gv2;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import m40.C99786a;
import m40.C99787b;

/* renamed from: gv2.l */
public class C98239l {

    /* renamed from: c */
    public static C98239l f288025c = new C98239l();

    /* renamed from: a */
    public C99786a f288026a = null;

    /* renamed from: b */
    public int f288027b = 0;

    /* renamed from: a */
    public static C98239l m126931a() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        C98239l lVar = f288025c;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return lVar;
    }

    /* renamed from: b */
    public C99786a mo137536b() {
        SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        int b = C76577a.m92151b(MMApplicationContext.getContext(), (int) (C76577a.m92165p(MMApplicationContext.getContext()) * 15.0f));
        C99786a aVar = this.f288026a;
        if (aVar == null || ((int) aVar.f292464l) != b) {
            C99787b a = C99787b.m130238a();
            a.f292468a.f292464l = (float) b;
            int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_0_5);
            C99786a aVar2 = a.f292468a;
            aVar2.f292465m = color;
            aVar2.f292459g = 16;
            aVar2.f292458f = TextUtils.TruncateAt.END;
            this.f288026a = aVar2;
        }
        C99786a aVar3 = this.f288026a;
        SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return aVar3;
    }

    /* renamed from: c */
    public int mo137537c() {
        SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        if (this.f288027b <= 0) {
            int i = C94866e1.Lx0().x;
            int dimension = (int) (MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6) + MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6));
            int dimension2 = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.aoo);
            int dimension3 = (int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f3926j6);
            int i2 = ((i - dimension2) - dimension) - dimension3;
            this.f288027b = i2;
            if (i2 <= 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                this.f288027b = ((i - dimension2) - dimension) - dimension3;
                Log.m105924i("MicroMsg.SnsComment2LinePreloadTextViewConfig", "try again, screenWidth " + i + " textViewWidth " + this.f288027b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
            }
            if (C85875k4.m106197n0() && (C85875k4.m106156M(MMApplicationContext.getContext()) || C85875k4.m106155L(MMApplicationContext.getContext().getContentResolver()))) {
                this.f288027b = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.avl);
            }
            Log.m105924i("MicroMsg.SnsComment2LinePreloadTextViewConfig", "finally, screenWidth " + i + " textViewWidth " + this.f288027b + " padding: " + dimension + " marginLeft: " + dimension2 + " thisviewPadding: " + dimension3);
        }
        int i3 = this.f288027b;
        SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextViewConfig");
        return i3;
    }
}
