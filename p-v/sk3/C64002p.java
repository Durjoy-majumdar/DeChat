package sk3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.activity.ImageQueryGalleryUI;
import fq3.C59270b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import p157gk.C59480d;
import rk3.C63462a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;

/* renamed from: sk3.p */
public final class C64002p extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63995m f181445d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64002p(C63995m mVar) {
        super(1);
        this.f181445d = mVar;
    }

    public Object invoke(Object obj) {
        C13604l lVar;
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        ArrayList value = this.f181445d.mo88763e3().f170405i.getValue();
        C87412m.m108591d(value);
        ArrayList arrayList = new ArrayList();
        Iterator it = value.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            C59480d dVar = (C59480d) it.next();
            ArrayList<QueryImageData> arrayList2 = dVar.f169960b;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z = true;
            }
            if (!z) {
                arrayList.addAll(dVar.f169960b);
            }
        }
        C63995m mVar = this.f181445d;
        ((C64004q0) C39818r.f106831a.mo62444c(mVar.getActivity()).mo75002a(C64004q0.class)).mo88771c3();
        C63462a.m74799d(C63462a.f180011a, 1, 0, 0, 6, (Object) null);
        Iterator it4 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it4.hasNext()) {
                lVar = new C13604l(-1, 0L);
                break;
            }
            Object next = it4.next();
            int i2 = i + 1;
            if (i >= 0) {
                QueryImageData queryImageData = (QueryImageData) next;
                if (C87412m.m108589b(queryImageData.f154725f, str)) {
                    lVar = new C13604l(Integer.valueOf(i), Long.valueOf(queryImageData.f154723d));
                    break;
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int intValue = ((Number) lVar.f38555d).intValue();
        ((Number) lVar.f38556e).longValue();
        if (intValue != -1) {
            AppCompatActivity activity = mVar.getActivity();
            Intent intent = new Intent(mVar.getContext(), ImageQueryGalleryUI.class);
            intent.putExtra("KEY_IMAGE_CURRENT_INDEX", intValue);
            intent.putParcelableArrayListExtra("KEY_IMAGE_DATA", arrayList);
            if (mVar.mo88763e3().f170401e.getValue() == C59270b.OCR || mVar.mo88763e3().mo84633F3(str)) {
                intent.putExtra("KEY_IMAGE_KEY_WORDS", mVar.f181429g);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = activity;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$2", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageUIC$showImageResultComposeView$1$2", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return C13598b0.f38549a;
    }
}
