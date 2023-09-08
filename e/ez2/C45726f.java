package ez2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import p773yy.C66710j;
import rz2.C48201c;
import uz2.C52678e0;
import vz2.C78501d;

/* renamed from: ez2.f */
public final class C45726f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f123563d;

    /* renamed from: e */
    public final /* synthetic */ C45723c f123564e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f123565f;

    public C45726f(C60905o oVar, C45723c cVar, ImageView imageView) {
        this.f123563d = oVar;
        this.f123564e = cVar;
        this.f123565f = imageView;
    }

    public final void onClick(View view) {
        C52678e0 a;
        C52678e0 a2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusCardFeedsActivity.C43198a aVar = TextStatusCardFeedsActivity.f116896j;
        Context context = this.f123563d.f173499A;
        C87412m.m108593f(context, "holder.context");
        TextStatusCardFeedsActivity.C43198a.m46779a(aVar, context, this.f123564e.f123557e, 1002, (String) null, (Integer) null, this.f123565f, 24, (Object) null);
        C78501d dVar = C78501d.f229945a;
        C45723c cVar = this.f123564e;
        C48201c cVar2 = cVar.f123559g;
        String str = cVar2 != null ? cVar2.field_IconID : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = cVar.f123557e;
        int size = cVar.f123556d.f129772d.f129193b.size();
        C48201c cVar3 = this.f123564e.f123559g;
        String str4 = (cVar3 == null || (a2 = C66710j.C53637a.m60171a(cVar3, false, 1, (Object) null)) == null) ? null : a2.f147092i;
        C48201c cVar4 = this.f123564e.f123559g;
        C78501d.m94807i(dVar, 7, str2, size, str3, (String) null, (String) null, 0, 0, 0, str4, (cVar4 == null || (a = C66710j.C53637a.m60171a(cVar4, false, 1, (Object) null)) == null) ? null : Integer.valueOf(a.f147099s), (String) null, 2544, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/topic/SameTopicFriendItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
