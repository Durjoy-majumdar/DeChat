package p226rg;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: rg.p */
public final class C63430p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AlbumPreviewUIC f179915d;

    /* renamed from: e */
    public final /* synthetic */ IStateAction f179916e;

    public C63430p(AlbumPreviewUIC albumPreviewUIC, IStateAction iStateAction) {
        this.f179915d = albumPreviewUIC;
        this.f179916e = iStateAction;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppCompatActivity activity = this.f179915d.getActivity();
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C63417i.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…eviewMenuUIC::class.java)");
        ((UIStateCenter) ((C36570n) ((C63417i) a).f179905e).getValue()).dispatch(new C63434t(52, ((C63413d) this.f179916e).f179894a, AlbumPreviewUIC.m62215g3(this.f179915d)));
        C117292a.m165361g(this, "com/tencent/mm/album/ui/preview/uic/AlbumPreviewUIC$observeState$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
