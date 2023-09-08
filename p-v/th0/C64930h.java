package th0;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import p434ig.C98672d;
import p434ig.C98674g;
import p548hg.C98450d;
import ph0.C100792a;
import z04.C112550d0;

/* renamed from: th0.h */
public final class C64930h implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C98674g f186964d;

    /* renamed from: e */
    public final /* synthetic */ MMActivity f186965e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f186966f;

    public C64930h(C98674g gVar, MMActivity mMActivity, C72963f4 f4Var) {
        this.f186964d = gVar;
        this.f186965e = mMActivity;
        this.f186966f = f4Var;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        String[] strArr;
        C98450d.C59881a aVar;
        if (i == 1 && intent != null) {
            ArrayList arrayList = new ArrayList();
            for (C98672d dVar : this.f186964d.mo55348A()) {
                if (dVar.mo55274P() == 2) {
                    aVar = C98450d.C59881a.TYPE_IMG;
                } else if (dVar.mo55274P() == 4) {
                    aVar = C98450d.C59881a.TYPE_VIDEO;
                }
                arrayList.add(new C98450d.C59882b(C100792a.f295260a.mo140234e(dVar, "", 0), false, (int) dVar.mo55278R(), aVar));
            }
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra != null) {
                Object[] array = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                strArr = (String[]) array;
            } else {
                strArr = null;
            }
            ArrayList<String> stringsToList = Util.stringsToList(strArr);
            C87412m.m108593f(stringsToList, "stringsToList(toUsers?.split(\",\")?.toTypedArray())");
            for (String VP : stringsToList) {
                ((C98450d) C86312j.m106911c(C98450d.class)).mo137795VP(this.f186965e, VP, this.f186964d, this.f186966f);
            }
        }
    }
}
