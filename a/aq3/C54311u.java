package aq3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.activity.ImageQueryGalleryUI;
import fq3.C59270b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ig3.C60282d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import p157gk.C59480d;
import p157gk.C59492k;
import p175j0.C60667k2;
import p248ug.C102029k0;
import rx3.C13598b0;
import rx3.C13603j;
import rx3.C13604l;
import sx3.C64197v;

/* renamed from: aq3.u */
public final class C54311u extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54301o f152428d;

    /* renamed from: e */
    public final /* synthetic */ C60667k2<ArrayList<C59480d>> f152429e;

    /* renamed from: f */
    public final /* synthetic */ C60667k2<C59270b> f152430f;

    /* renamed from: g */
    public final /* synthetic */ C60667k2<String> f152431g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54311u(C54301o oVar, C60667k2<? extends ArrayList<C59480d>> k2Var, C60667k2<? extends C59270b> k2Var2, C60667k2<String> k2Var3) {
        super(1);
        this.f152428d = oVar;
        this.f152429e = k2Var;
        this.f152430f = k2Var2;
        this.f152431g = k2Var3;
    }

    public Object invoke(Object obj) {
        int i;
        C13604l lVar;
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        C54301o oVar = this.f152428d;
        ArrayList<C59480d> value = this.f152429e.getValue();
        C87412m.m108593f(value, "imageDataState.value");
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = value.iterator();
        while (true) {
            boolean z = false;
            i = 1;
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
        C54301o oVar2 = this.f152428d;
        C60667k2<C59270b> k2Var = this.f152430f;
        C60667k2<String> k2Var2 = this.f152431g;
        oVar2.getClass();
        Iterator it4 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it4.hasNext()) {
                lVar = new C13604l(-1, 0L);
                break;
            }
            Object next = it4.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                QueryImageData queryImageData = (QueryImageData) next;
                if (C87412m.m108589b(queryImageData.f154725f, str)) {
                    lVar = new C13604l(Integer.valueOf(i2), Long.valueOf(queryImageData.f154723d));
                    break;
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        int intValue = ((Number) lVar.f38555d).intValue();
        long longValue = ((Number) lVar.f38556e).longValue();
        if (intValue != -1) {
            AppCompatActivity activity = oVar2.getActivity();
            Intent intent = new Intent(oVar2.getContext(), ImageQueryGalleryUI.class);
            intent.putExtra("KEY_IMAGE_CURRENT_INDEX", intValue);
            intent.putParcelableArrayListExtra("KEY_IMAGE_DATA", arrayList);
            if (k2Var.getValue() == C59270b.OCR || oVar2.mo75099c3().mo84633F3(str)) {
                intent.putExtra("KEY_IMAGE_KEY_WORDS", k2Var2.getValue());
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = activity;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$4", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$4", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C60282d dVar2 = C60282d.f171857a;
        C102029k0 k0Var = C59492k.f169999a;
        C60282d.f171870n = k0Var != null ? k0Var.mo137213a(longValue) : 0;
        C59270b value2 = k2Var.getValue();
        C87412m.m108593f(value2, "imageQueryTypeState.value");
        C59270b bVar = value2;
        Log.m105924i("MicroMsg.ImageQueryReporter", "setMatchLogic >> type: " + bVar);
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            i = 11;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                i = 10;
            } else {
                throw new C13603j();
            }
        }
        C60282d.f171872p = i;
        dVar2.mo85266c(5);
        return C13598b0.f38549a;
    }
}
