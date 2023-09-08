package aq3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.activity.ImageQueryGalleryUI;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Iterator;
import k20.C9556a;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: aq3.y */
public final class C54315y extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54313w f152439d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54315y(C54313w wVar) {
        super(1);
        this.f152439d = wVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        Iterator<T> it = this.f152439d.f152437h.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            T next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (C87412m.m108589b(((QueryImageData) next).f154725f, str)) {
                break;
            } else {
                i = i2;
            }
        }
        C54313w wVar = this.f152439d;
        if (i != -1) {
            AppCompatActivity activity = wVar.getActivity();
            Intent intent = new Intent(wVar.getContext(), ImageQueryGalleryUI.class);
            intent.putExtra("KEY_IMAGE_CURRENT_INDEX", i);
            intent.putParcelableArrayListExtra("KEY_IMAGE_DATA", wVar.f152437h);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = activity;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/view/activity/ImageQueryPersonUIC$initView$1$2", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/view/activity/ImageQueryPersonUIC$initView$1$2", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return C13598b0.f38549a;
    }
}
