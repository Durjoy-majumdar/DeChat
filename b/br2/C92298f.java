package br2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.FinderLivingAnimWrapper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ht1.C98520u2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: br2.f */
public class C92298f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f264125d;

    /* renamed from: e */
    public final /* synthetic */ FinderLivingAnimWrapper f264126e;

    /* renamed from: br2.f$a */
    public class C92299a implements Runnable {
        public C92299a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1$1");
            FinderLivingAnimWrapper finderLivingAnimWrapper = C92298f.this.f264126e;
            int i = FinderLivingAnimWrapper.f274420o;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            boolean z = finderLivingAnimWrapper.f274428n;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            if (z) {
                Log.m105924i("FinderLivingAnimWrapper", "before startAnim, isDestroyed=true");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1$1");
                return;
            }
            int width = C92298f.this.f264126e.getWidth();
            int height = C92298f.this.f264126e.getHeight();
            FinderLivingAnimWrapper finderLivingAnimWrapper2 = C92298f.this.f264126e;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            boolean z2 = finderLivingAnimWrapper2.f274424g;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            if (z2 && width > 0 && height > 0) {
                try {
                    FinderLivingAnimWrapper finderLivingAnimWrapper3 = C92298f.this.f264126e;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    C98520u2 u2Var = finderLivingAnimWrapper3.f274422e;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    FinderLivingAnimWrapper finderLivingAnimWrapper4 = C92298f.this.f264126e;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    int i2 = finderLivingAnimWrapper4.f274426i;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    FinderLivingAnimWrapper finderLivingAnimWrapper5 = C92298f.this.f264126e;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    int i3 = finderLivingAnimWrapper5.f274427j;
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    u2Var.mo78230d(width - i2, height - i3);
                    FinderLivingAnimWrapper finderLivingAnimWrapper6 = C92298f.this.f264126e;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    C98520u2 u2Var2 = finderLivingAnimWrapper6.f274422e;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                    u2Var2.start();
                } catch (Throwable th) {
                    Log.m105920e("FinderLivingAnimWrapper", "start exp=" + th.toString());
                }
                Log.m105924i("FinderLivingAnimWrapper", "prepareIconAsynAndStart, startAnim, w=" + width + ", h=" + height);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1$1");
        }
    }

    public C92298f(FinderLivingAnimWrapper finderLivingAnimWrapper, List list) {
        this.f264126e = finderLivingAnimWrapper;
        this.f264125d = list;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
        try {
            FinderLivingAnimWrapper finderLivingAnimWrapper = this.f264126e;
            int i = FinderLivingAnimWrapper.f274420o;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            boolean z = finderLivingAnimWrapper.f274428n;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            if (z) {
                Log.m105928w("FinderLivingAnimWrapper", "before addBitmap, isDestroyed=true");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            FinderLivingAnimWrapper finderLivingAnimWrapper2 = this.f264126e;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            boolean z2 = finderLivingAnimWrapper2.f274424g;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            if (!z2) {
                Log.m105924i("FinderLivingAnimWrapper", "prepareIconAsynAndStart, addDefaultBitmap");
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(C0966R.C0969drawable.bpv));
                arrayList.add(Integer.valueOf(C0966R.C0969drawable.bpw));
                arrayList.add(Integer.valueOf(C0966R.C0969drawable.bpx));
                arrayList.add(Integer.valueOf(C0966R.C0969drawable.bpy));
                arrayList.add(Integer.valueOf(C0966R.C0969drawable.bpz));
                arrayList.add(Integer.valueOf(C0966R.C0969drawable.f357237bq0));
                FinderLivingAnimWrapper finderLivingAnimWrapper3 = this.f264126e;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                C98520u2 u2Var = finderLivingAnimWrapper3.f274422e;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                u2Var.mo78229c(arrayList);
                FinderLivingAnimWrapper finderLivingAnimWrapper4 = this.f264126e;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
                finderLivingAnimWrapper4.f274424g = true;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            FinderLivingAnimWrapper.m120029a(this.f264126e, this.f264125d);
            long currentTimeMillis3 = System.currentTimeMillis();
            Log.m105924i("FinderLivingAnimWrapper", "prepareIconAsynAndStart, defIcon cost=" + (currentTimeMillis2 - currentTimeMillis) + ", configIcon cost=" + (currentTimeMillis3 - currentTimeMillis2));
            MMHandlerThread.postToMainThreadDelayed(new C92299a(), 50);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper$1");
        } catch (Throwable th) {
            Log.m105920e("FinderLivingAnimWrapper", "prepareIconAsynAndStart, exp=" + android.util.Log.getStackTraceString(th));
        }
    }
}
