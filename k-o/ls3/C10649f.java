package ls3;

import android.content.Context;
import android.content.Intent;
import cm1.C0740i2;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C7335d;
import java.util.ArrayList;
import java.util.List;
import jp3.C9487b;
import ob0.C89132b;
import rx3.C13604l;
import te3.C50008jm0;
import te3.C50851pn0;
import te3.C64238ap2;
import te3.C64256b90;
import te3.C64279c90;

/* renamed from: ls3.f */
public interface C10649f extends C7335d {

    /* renamed from: ls3.f$a */
    public interface C10650a {
        /* renamed from: a */
        void mo5052a();

        /* renamed from: b */
        void mo5053b(FinderObject finderObject);

        /* renamed from: c */
        void mo5054c(Object obj);

        /* renamed from: d */
        void mo5055d(C89132b.C89134c<C50008jm0> cVar);

        /* renamed from: e */
        void mo5056e(C89132b.C89134c<C50851pn0> cVar);

        void onFailed(int i);
    }

    void E40(Context context, Intent intent, String str, C9487b<?> bVar, C64279c90 c902, C10650a aVar);

    void Uf0(Context context, Intent intent, C64256b90 b902, C64279c90 c902, C10650a aVar);

    /* renamed from: cP */
    void mo10913cP(Context context, Intent intent, List<? extends FinderObject> list, int i, C64279c90 c902, C10650a aVar);

    /* renamed from: oa */
    boolean mo10914oa(Context context, boolean z);

    /* renamed from: sr */
    C13604l<List<FinderObject>, Integer> mo10915sr(ArrayList<C0740i2> arrayList, C0740i2 i2Var);

    /* renamed from: tP */
    void mo10916tP(Context context, Intent intent, C64238ap2 ap22, boolean z, C64279c90 c902, C10650a aVar);

    /* renamed from: ze */
    void mo10917ze(Context context, Intent intent, String str, C9487b<?> bVar, Object obj, C10650a aVar);
}
