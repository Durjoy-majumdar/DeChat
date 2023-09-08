package mm1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50008jm0;

/* renamed from: mm1.c */
public final class C10938c<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ long f32594a;

    /* renamed from: b */
    public final /* synthetic */ String f32595b;

    public C10938c(long j, String str) {
        this.f32594a = j;
        this.f32595b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C10935b.f32586b = false;
        int i = cVar.f256793a;
        if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
            C10935b.m10930c(C10935b.f32585a, this.f32594a, (FinderObject) null);
        } else {
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            if (finderObject != null) {
                long j = this.f32594a;
                String str = this.f32595b;
                Log.m105924i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject fetch time:" + (System.currentTimeMillis() - C10935b.f32588d));
                C10935b.f32587c.put(C10935b.f32585a.mo11138f(j, str), finderObject);
            }
            C10935b bVar = C10935b.f32585a;
            FinderObject finderObject2 = ((C50008jm0) cVar.f256796d).f136184e;
            C10935b.m10930c(bVar, finderObject2 != null ? finderObject2.f164794id : this.f32594a, finderObject2);
        }
        return C13598b0.f38549a;
    }
}
