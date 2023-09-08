package nb2;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import j20.C117292a;
import java.util.ArrayList;
import sb2.C63807m;

/* renamed from: nb2.w */
public final class C61671w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61646d f175361d;

    /* renamed from: e */
    public final /* synthetic */ C63807m f175362e;

    public C61671w(C61646d dVar, C63807m mVar) {
        this.f175361d = dVar;
        this.f175362e = mVar;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderContact finderContact = this.f175361d.f175298d.f170762j;
        if (!(finderContact == null || (str = finderContact.username) == null)) {
            this.f175362e.mo88600c3(str, true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
