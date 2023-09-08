package mc1;

import com.tencent.p014mm.plugin.fav.p047ui.C93745z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import pb1.C100755z;
import qo3.C47883u;
import rx3.C13598b0;
import zp3.C23564m;

/* renamed from: mc1.f */
public final class C99834f implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ List<C100755z> f292536a;

    /* renamed from: b */
    public final /* synthetic */ C99841k f292537b;

    /* renamed from: mc1.f$a */
    public static final class C99835a implements C93745z1.C93749c {

        /* renamed from: a */
        public final /* synthetic */ C99841k f292538a;

        /* renamed from: mc1.f$a$a */
        public static final class C99836a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C99841k f292539d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99836a(C99841k kVar) {
                super(0);
                this.f292539d = kVar;
            }

            public Object invoke() {
                this.f292539d.f292547f.invoke(13);
                return C13598b0.f38549a;
            }
        }

        public C99835a(C99841k kVar) {
            this.f292538a = kVar;
        }

        /* renamed from: a */
        public final void mo128364a() {
            C23564m.m28136f(new C99836a(this.f292538a));
        }
    }

    public C99834f(List<? extends C100755z> list, C99841k kVar) {
        this.f292536a = list;
        this.f292537b = kVar;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            for (C100755z zVar : this.f292536a) {
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] positiveClick remove favItemInfo = " + zVar.field_id);
            }
            List<C100755z> f3 = this.f292537b.mo139192d3().mo139186f3();
            List<Integer> e3 = this.f292537b.mo139192d3().mo139185e3();
            StringBuilder sb = new StringBuilder();
            sb.append("[handleMoreFooterDelete] selectItems size = ");
            ArrayList arrayList = (ArrayList) f3;
            sb.append(arrayList.size());
            sb.append(", selectIndexs size = ");
            ArrayList arrayList2 = (ArrayList) e3;
            sb.append(arrayList2.size());
            Log.m105924i("MicroMsg.FavFinderFilterUI", sb.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[handleMoreFooterDelete] selectItem field_id = ");
            sb4.append(((C100755z) arrayList.get(0)).field_id);
            sb4.append(", selectItem index = ");
            sb4.append(((Number) arrayList2.get(0)).intValue());
            Log.m105924i("MicroMsg.FavFinderFilterUI", sb4.toString());
            if (arrayList2.isEmpty() || arrayList.isEmpty() || arrayList2.size() != arrayList.size()) {
                Log.m105920e("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] selectIndex size or selectItem size error, undo delete");
                this.f292537b.f292547f.invoke(14);
                return;
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] removeFavItemInfoList selectItem field_id = " + ((C100755z) arrayList.get(i)).field_id + ", selectItem index = " + ((Number) arrayList2.get(i)).intValue());
            }
            C99830c d3 = this.f292537b.mo139192d3();
            C93745z1.m118444a(d3.getContext(), d3.mo139186f3(), new C99827a(d3, new C99835a(this.f292537b)), 25);
        }
    }
}
