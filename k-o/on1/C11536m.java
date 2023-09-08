package on1;

import cm1.C0740i2;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.List;
import rx3.C36570n;

/* renamed from: on1.m */
public class C11536m<T extends C0740i2> extends C11575y<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11536m(List<? extends T> list) {
        super(list, false);
        C87412m.m108594g(list, "feeds");
    }

    /* renamed from: a */
    public RefreshLoadMoreLayout.C7080c<Object> mo11463a() {
        return new RefreshLoadMoreLayout.C7080c<>(0);
    }

    /* renamed from: b */
    public void mo11464b(List<T> list) {
        C87412m.m108594g(list, "dataList");
        ((C11512c) ((C36570n) this.f33961c).getValue()).mo11474a(list, this.f33959a);
    }

    /* renamed from: c */
    public int mo11488c() {
        return 1;
    }
}
