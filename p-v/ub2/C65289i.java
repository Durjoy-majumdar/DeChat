package ub2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ub2.i */
public final class C65289i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMVCardChooseView f187945d;

    /* renamed from: ub2.i$a */
    public static final class C65290a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MusicMVCardChooseView f187946d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65290a(MusicMVCardChooseView musicMVCardChooseView) {
            super(0);
            this.f187946d = musicMVCardChooseView;
        }

        public Object invoke() {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "afterModeChanged, onModeChanged:false, showVKB");
            MusicMVCardChooseView musicMVCardChooseView = this.f187946d;
            int i = MusicMVCardChooseView.f163455X0;
            musicMVCardChooseView.mo80524o();
            return C13598b0.f38549a;
        }
    }

    public C65289i(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187945d = musicMVCardChooseView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initEditView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMVCardChooseView.C57080a aVar = this.f187945d.f163463G;
        if (aVar != null) {
            aVar.mo80371s4();
        }
        this.f187945d.mo80523n();
        if (!this.f187945d.mo80518h()) {
            MusicMVCardChooseView musicMVCardChooseView = this.f187945d;
            MusicMVCardChooseView.m65779j(musicMVCardChooseView, false, (C32226l) null, new C65290a(musicMVCardChooseView), 2, (Object) null);
        } else {
            this.f187945d.mo80524o();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initEditView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
