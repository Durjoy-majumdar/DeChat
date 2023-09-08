package ez2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import p773yy.C66710j;
import rx3.C13598b0;
import rz2.C48201c;
import sz2.C48518b;
import vz2.C78501d;

/* renamed from: ez2.p */
public final class C45732p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48518b f123575d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f123576e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45732p(C48518b bVar, C60905o oVar) {
        super(0);
        this.f123575d = bVar;
        this.f123576e = oVar;
    }

    public Object invoke() {
        View view;
        if (this.f123575d.f129772d.f129193b.size() > 0) {
            String str = this.f123575d.f129772d.f129193b.get(0).field_UserName;
            View findViewWithTag = this.f123576e.f44854d.findViewWithTag("status_avatar_" + str);
            if (findViewWithTag != null) {
                Rect rect = new Rect();
                if (findViewWithTag.getLocalVisibleRect(rect) && rect.height() == findViewWithTag.getHeight()) {
                    view = findViewWithTag;
                    TextStatusCardFeedsActivity.C43198a aVar = TextStatusCardFeedsActivity.f116896j;
                    Context context = this.f123576e.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    TextStatusCardFeedsActivity.C43198a.m46779a(aVar, context, str, 1002, (String) null, (Integer) null, view, 24, (Object) null);
                    C48201c cVar = this.f123575d.f129772d.f129193b.get(0);
                    C78501d dVar = C78501d.f229945a;
                    String str2 = cVar.field_IconID;
                    String str3 = cVar.field_UserName;
                    int size = this.f123575d.f129772d.f129193b.size();
                    int i = C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147099s;
                    C87412m.m108593f(str2, "field_IconID");
                    C87412m.m108593f(str3, "field_UserName");
                    C78501d.m94807i(dVar, 6, str2, size, str3, (String) null, (String) null, 0, 0, 0, C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147092i, Integer.valueOf(i), (String) null, 2544, (Object) null);
                }
            }
            view = null;
            TextStatusCardFeedsActivity.C43198a aVar2 = TextStatusCardFeedsActivity.f116896j;
            Context context2 = this.f123576e.f173499A;
            C87412m.m108593f(context2, "holder.context");
            TextStatusCardFeedsActivity.C43198a.m46779a(aVar2, context2, str, 1002, (String) null, (Integer) null, view, 24, (Object) null);
            C48201c cVar2 = this.f123575d.f129772d.f129193b.get(0);
            C78501d dVar2 = C78501d.f229945a;
            String str22 = cVar2.field_IconID;
            String str32 = cVar2.field_UserName;
            int size2 = this.f123575d.f129772d.f129193b.size();
            int i2 = C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null).f147099s;
            C87412m.m108593f(str22, "field_IconID");
            C87412m.m108593f(str32, "field_UserName");
            C78501d.m94807i(dVar2, 6, str22, size2, str32, (String) null, (String) null, 0, 0, 0, C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null).f147092i, Integer.valueOf(i2), (String) null, 2544, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
