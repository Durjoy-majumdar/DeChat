package sk3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.activity.ImageQueryPersonUI;
import fy3.C32226l;
import gq3.C59629h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k20.C9556a;
import p157gk.C32466a;
import rx3.C13598b0;

/* renamed from: sk3.o */
public final class C64001o extends C87413o implements C32226l<C32466a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63995m f181444d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64001o(C63995m mVar) {
        super(1);
        this.f181444d = mVar;
    }

    public Object invoke(Object obj) {
        C32466a aVar = (C32466a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        ((C64004q0) C39818r.f106831a.mo62444c(this.f181444d.getActivity()).mo75002a(C64004q0.class)).mo88771c3();
        AppCompatActivity activity = this.f181444d.getActivity();
        Intent intent = new Intent(this.f181444d.getContext(), ImageQueryPersonUI.class);
        C63995m mVar = this.f181444d;
        intent.putExtra("KEY_CROP_IMAGE_PATH", aVar.f86262b);
        C59629h e3 = mVar.mo88763e3();
        String str = aVar.f86261a;
        e3.getClass();
        C87412m.m108594g(str, "labelId");
        intent.putParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST", (ArrayList) ((LinkedHashMap) e3.f170414u).get(str));
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$1", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$1", "invoke", "(Lcom/tencent/mm/data/CropImageItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return C13598b0.f38549a;
    }
}
