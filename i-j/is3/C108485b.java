package is3;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import java.util.List;
import ks3.C109054b;
import rx3.C13598b0;

/* renamed from: is3.b */
public interface C108485b {
    /* renamed from: a */
    void mo149674a();

    /* renamed from: b */
    void mo149675b(boolean z);

    void reload();

    void setEffectItems(List<C109054b> list);

    void setOnRequestDefaultSeekByKey(C32226l<? super Integer, Integer> lVar);

    void setOnRequestReset(C32224a<C13598b0> aVar);

    void setOnRequestSeekByKey(C32226l<? super Integer, Integer> lVar);

    void setOnSeekChanging(C32227p<? super Integer, ? super Integer, C13598b0> pVar);

    void setOnSeekDone(C32227p<? super Integer, ? super Integer, C13598b0> pVar);
}
