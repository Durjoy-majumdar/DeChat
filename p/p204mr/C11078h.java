package p204mr;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: mr.h */
public interface C11078h {

    /* renamed from: mr.h$a */
    public static final class C11079a {
        /* renamed from: a */
        public static /* synthetic */ void m10985a(C11078h hVar, FinderObject finderObject, View view, C32224a aVar, C32224a aVar2, C32227p pVar, int i, Object obj) {
            if (obj == null) {
                hVar.mo11217d(finderObject, view, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : aVar2, (i & 16) != 0 ? null : pVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playFinderLive");
        }
    }

    /* renamed from: a */
    void mo11214a();

    /* renamed from: b */
    void mo11215b();

    /* renamed from: c */
    void mo11216c();

    /* renamed from: d */
    void mo11217d(FinderObject finderObject, View view, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32227p<? super Integer, ? super Integer, C13598b0> pVar);

    void detach();

    /* renamed from: e */
    void mo11219e();

    /* renamed from: f */
    void mo11220f();

    /* renamed from: g */
    void mo11221g();
}
