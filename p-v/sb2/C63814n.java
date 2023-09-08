package sb2;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: sb2.n */
public final class C63814n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Object f180895d;

    /* renamed from: e */
    public final /* synthetic */ C63807m f180896e;

    public C63814n(Object obj, C63807m mVar) {
        this.f180895d = obj;
        this.f180896e = mVar;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/uic/MusicMvInfoUIC$mediaChangeListener$1$onChange$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderContact finderContact = ((FinderObject) this.f180895d).contact;
        if (!(finderContact == null || (str = finderContact.username) == null)) {
            this.f180896e.mo88600c3(str, false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvInfoUIC$mediaChangeListener$1$onChange$1$1$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
