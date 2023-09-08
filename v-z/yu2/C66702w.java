package yu2;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: yu2.w */
public final class C66702w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f191744d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66702w(SnsAlbumPickerUI snsAlbumPickerUI) {
        super(0);
        this.f191744d = snsAlbumPickerUI;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        RecyclerView.LayoutManager layoutManager = SnsAlbumPickerUI.m123169I7(this.f191744d).getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int D = gridLayoutManager.mo16958D();
        if (D == gridLayoutManager.getItemCount() - 2) {
            RecyclerView I7 = SnsAlbumPickerUI.m123169I7(this.f191744d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(D + 1));
            RecyclerView recyclerView = I7;
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initPickerAdapter$5", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            I7.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initPickerAdapter$5", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        return b0Var;
    }
}
