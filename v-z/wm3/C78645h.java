package wm3;

import ac2.C39535k;
import ac2.C91988j;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.p136ui.base.AlphabetScrollBar;
import com.tencent.p014mm.p136ui.mvvm.list.SelectContactMvvmList;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import gy3.C87412m;
import om3.C77020b;
import p278yh.C79115l;
import rx3.C36570n;

/* renamed from: wm3.h */
public final class C78645h<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C78638g f230343d;

    /* renamed from: e */
    public final /* synthetic */ MvvmList<C77020b> f230344e;

    public C78645h(C78638g gVar, MvvmList<C77020b> mvvmList) {
        this.f230343d = gVar;
        this.f230344e = mvvmList;
    }

    public void onChanged(Object obj) {
        if (((C91988j) obj).f263327a == C39535k.UIRefresh) {
            AlphabetScrollBar h = ((C79115l) ((C36570n) this.f230343d.f230329e).getValue()).mo109050h();
            Object[] array = ((SelectContactMvvmList) this.f230344e).f219927x.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            h.setAlphabet((String[]) array);
        }
    }
}
