package jh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C64758ut2;
import te3.C64839xt2;

/* renamed from: jh2.a */
public final class C60855a<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C60856b f173376a;

    public C60855a(C60856b bVar) {
        this.f173376a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C60856b bVar = this.f173376a;
        bVar.f173391o = false;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        String str = cVar.f256795c;
        String str2 = bVar.f173379c;
        Log.m105924i(str2, "LogStory: getRecommendMusic callback " + i + ' ' + i2 + ", " + str);
        if (i == 0 && i2 == 0) {
            C64758ut2 ut22 = (C64758ut2) cVar.f256796d;
            C60856b bVar2 = this.f173376a;
            bVar2.f173382f = ut22.f185791d;
            LinkedList<C64839xt2> linkedList = ut22.f185792e;
            String str3 = bVar2.f173379c;
            Log.m105924i(str3, "get audio list " + ut22);
            C32226l<? super LinkedList<C64839xt2>, C13598b0> lVar = this.f173376a.f173390n;
            if (lVar == null) {
                return null;
            }
            C87412m.m108593f(linkedList, "audioList");
            lVar.invoke(linkedList);
            return null;
        }
        C32226l<? super LinkedList<C64839xt2>, C13598b0> lVar2 = this.f173376a.f173390n;
        if (lVar2 == null) {
            return null;
        }
        lVar2.invoke(new LinkedList());
        return null;
    }
}
