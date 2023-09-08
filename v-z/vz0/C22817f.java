package vz0;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C52139yn;

/* renamed from: vz0.f */
public class C22817f extends C22821l {

    /* renamed from: b */
    public View f65604b;

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65604b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        C20483c cVar = ((CardDetailUIContoller) this.f65616a).f51776E;
        C52139yn ynVar = cVar.mo23264L0().f64111I;
        if (ynVar != null) {
            Log.m105924i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + ynVar.f145416g);
            Log.m105924i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + ynVar.f145414e);
            Log.m105924i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + ynVar.f145418i);
        }
        if (ynVar == null || TextUtils.isEmpty(ynVar.f145414e) || !cVar.mo23277X0()) {
            View view = this.f65604b;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.f65604b == null) {
            this.f65604b = ((ViewStub) mo35969b(C0966R.C0970id.as5)).inflate();
        }
        ((TextView) this.f65604b.findViewById(C0966R.C0970id.i8k)).setText(ynVar.f145414e);
        this.f65604b.setOnClickListener(((CardDetailUIContoller) this.f65616a).f51794X);
    }
}
