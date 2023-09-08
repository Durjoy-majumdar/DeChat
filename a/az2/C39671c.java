package az2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import lz2.C46926k;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qz2.C47917h;
import rz2.C48202d;

/* renamed from: az2.c */
public final class C39671c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C47917h f106451d;

    /* renamed from: az2.c$a */
    public static final class C39672a implements C11385n {
        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C46926k) {
                C89137b0 d = C86709a0.m107524d();
                ((C46926k) yVar).getClass();
                d.mo123470p(4099, this);
                if (i == 0 && i2 == 0) {
                    Log.m105924i("MicroMsg.TextStatus.SquareItemConvert", "onSceneEnd NetSceneTextStatusLike ok");
                }
            }
        }
    }

    public C39671c(C47917h hVar) {
        this.f106451d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/SquareItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C47917h hVar = this.f106451d;
        String str = hVar.f128576e;
        String str2 = hVar.f128577f;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C48202d.f129182L;
        C46926k kVar = new C46926k(str, str2, "hello", 0, 4);
        C86709a0.m107524d().mo123455a(4099, new C39672a());
        C86709a0.m107524d().mo123460f(kVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/SquareItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
