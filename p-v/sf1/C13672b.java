package sf1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import df1.C7322a;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C87412m;
import h81.C59774i;
import hp3.C87581a;
import ht1.C60172g4;
import java.util.List;
import je1.C60809u;
import kj2.C117407d;
import ob0.C89132b;
import rs1.C13442s8;
import rx3.C13598b0;
import wp1.C15585f;

/* renamed from: sf1.b */
public final class C13672b {

    /* renamed from: a */
    public static final C13672b f38719a = new C13672b();

    /* renamed from: sf1.b$a */
    public static final class C13673a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ List<Long> f38720a;

        public C13673a(List<Long> list) {
            this.f38720a = list;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("Finder.NoInterestedLogic", "[CgiFinderFeedBack] errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256794b == 0 && cVar.f256793a == 0) {
                for (Number longValue : this.f38720a) {
                    C15585f.f42211a.mo14339b(longValue.longValue());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo13059a(Context context, long j, String str, Boolean bool, C32226l<? super Integer, ? extends List<Long>> lVar) {
        C7322a b;
        Context context2 = context;
        long j2 = j;
        C32226l<? super Integer, ? extends List<Long>> lVar2 = lVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(lVar2, "onSelectedCallback");
        List list = (List) lVar2.invoke(2);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(context2);
        new C60809u(j, str, 1, 2, f != null ? f.mo12861q3() : null, bool).mo9225i().mo123419C(new C13673a(list));
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat(1278, 9, 1, false);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String simpleName = context.getClass().getSimpleName();
        y0Var.getClass();
        FinderItem Br0 = y0Var.Br0(j2);
        if (Br0 != null) {
            FinderObject feedObject = Br0.getFeedObject();
            String str2 = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + simpleName + ',' + y0Var.xx0(feedObject.f164794id) + ',' + feedObject.username + ',' + Br0.getMediaType() + ',' + feedObject.recommendType + ',' + feedObject.likeCount + ',' + feedObject.commentCount + ',' + feedObject.friendLikeCount + ",0,0,0," + 2;
            Log.m105924i(y0Var.f167350d, "18946 " + str2);
            dVar.kvStat(18946, str2);
        }
        C13442s8 f2 = aVar.mo12873f(context2);
        if (f2 != null && (b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null)) != null) {
            b.mo8766a(new C7322a.C7323a(12, j2));
        }
    }
}
