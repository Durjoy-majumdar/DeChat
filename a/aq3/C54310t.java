package aq3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.activity.ImageQueryPersonUI;
import fy3.C32226l;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import ig3.C60282d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k20.C9556a;
import p157gk.C32466a;
import rx3.C13598b0;

/* renamed from: aq3.t */
public final class C54310t extends C87413o implements C32226l<C32466a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54301o f152427d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54310t(C54301o oVar) {
        super(1);
        this.f152427d = oVar;
    }

    public Object invoke(Object obj) {
        C32466a aVar = (C32466a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        AppCompatActivity activity = this.f152427d.getActivity();
        Intent intent = new Intent(this.f152427d.getContext(), ImageQueryPersonUI.class);
        C54301o oVar = this.f152427d;
        intent.putExtra("KEY_CROP_IMAGE_PATH", aVar.f86262b);
        C59629h c3 = oVar.mo75099c3();
        String str = aVar.f86261a;
        c3.getClass();
        C87412m.m108594g(str, "labelId");
        intent.putParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST", (ArrayList) ((LinkedHashMap) c3.f170414u).get(str));
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$3", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$3", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C60282d.f171857a.mo85266c(55);
        return C13598b0.f38549a;
    }
}
