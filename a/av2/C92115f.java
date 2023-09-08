package av2;

import com.tencent.p014mm.plugin.sns.p106ui.FlipView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.HashSet;
import java.util.WeakHashMap;
import rx3.C13598b0;

/* renamed from: av2.f */
public final class C92115f extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FlipView f263696d;

    /* renamed from: e */
    public final /* synthetic */ int f263697e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92115f(FlipView flipView, int i) {
        super(1);
        this.f263696d = flipView;
        this.f263697e = i;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        Throwable th = (Throwable) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        FlipView flipView = this.f263696d;
        int i = this.f263697e;
        SnsMethodCalculate.markStartTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        SnsMethodCalculate.markStartTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "markTokenDone, token: " + i);
        WeakHashMap<FlipView, HashSet<Integer>> weakHashMap = C92116g.f263698a;
        if (weakHashMap == null) {
            SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        } else {
            HashSet hashSet = weakHashMap.get(flipView);
            if (hashSet == null) {
                SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            } else {
                if (hashSet.remove(Integer.valueOf(i)) && hashSet.isEmpty() && weakHashMap.remove(flipView) != null && weakHashMap.isEmpty()) {
                    C92116g.f263698a = null;
                }
                SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return b0Var;
    }
}
