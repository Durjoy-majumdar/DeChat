package of0;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.picker.base.view.WheelView;
import pf0.C21966a;
import qf0.C22082c;
import qf0.C22083d;
import rf0.C22228b;
import rf0.C22232f;

/* renamed from: of0.a */
public class C21793a {

    /* renamed from: a */
    public C21966a f61766a;

    public C21793a(Context context, C22083d dVar) {
        C21966a aVar = new C21966a(1);
        this.f61766a = aVar;
        aVar.f62194k = context;
        aVar.f62184a = dVar;
    }

    /* renamed from: a */
    public void mo34201a(C22228b bVar) {
        bVar.f226020g = this.f61766a;
        Context context = bVar.f62979q;
        bVar.mo107670c();
        bVar.mo107669b();
        C22232f fVar = bVar.f62978p;
        WheelView wheelView = new WheelView(context);
        bVar.f226020g.getClass();
        if (fVar.f62986a == null) {
            fVar.f62986a = wheelView;
        }
        fVar.f62987b = fVar.f62986a;
        C22082c cVar = bVar.f226020g.f62187d;
        if (cVar != null) {
            bVar.f62978p.f62989d = cVar;
        }
        bVar.f62978p.getClass();
        C22232f fVar2 = bVar.f62978p;
        bVar.f226020g.getClass();
        fVar2.getClass();
        C22232f fVar3 = bVar.f62978p;
        fVar3.f62987b.setCyclic(bVar.f226020g.f62189f);
        C22232f fVar4 = bVar.f62978p;
        Typeface typeface = bVar.f226020g.f62196m;
        fVar4.getClass();
        bVar.f226020g.getClass();
        ViewGroup viewGroup = bVar.f226019f;
        if (viewGroup != null) {
            viewGroup.findViewById(C0966R.C0970id.f358895hq0).setOnTouchListener(bVar.f226025o);
        }
        C22232f fVar5 = bVar.f62978p;
        fVar5.f62987b.setDividerColor(bVar.f226020g.f62195l);
        C22232f fVar6 = bVar.f62978p;
        WheelView.C17837b bVar2 = bVar.f226020g.f62197n;
        fVar6.getClass();
        C22232f fVar7 = bVar.f62978p;
        bVar.f226020g.getClass();
        fVar7.getClass();
        C22232f fVar8 = bVar.f62978p;
        bVar.f226020g.getClass();
        fVar8.f62987b.f49149o = false;
        C22232f fVar9 = bVar.f62978p;
        int i = bVar.f226020g.f62198o;
        if (fVar9.f62988c != null) {
            fVar9.f62987b.setCurrentItem(i);
        }
        C22232f fVar10 = bVar.f62978p;
        fVar10.f62987b.setDividerColor(bVar.f226020g.f62195l);
    }
}
