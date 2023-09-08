package t51;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import nj3.C76912y0;
import r51.C110502a;

/* renamed from: t51.h */
public final class C110916h<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331728d;

    public C110916h(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331728d = springLuckyEggActivity;
    }

    public final void onChanged(T t) {
        C110502a aVar = (C110502a) t;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                C76912y0.m92768g(this.f331728d.getContext(), this.f331728d.getContext().getResources().getString(C0966R.string.jmj));
            } else if (ordinal == 1) {
                C76912y0.m92767f(this.f331728d.getContext(), this.f331728d.getContext().getResources().getString(C0966R.string.jmi));
            } else if (ordinal == 2) {
                C76912y0.m92767f(this.f331728d.getContext(), this.f331728d.getContext().getResources().getString(C0966R.string.jmh));
            } else if (ordinal == 3) {
                C76912y0.m92767f(this.f331728d.getContext(), this.f331728d.getContext().getResources().getString(C0966R.string.jmi));
            }
            SpringLuckyEggActivity springLuckyEggActivity = this.f331728d;
            int i = SpringLuckyEggActivity.f312420n;
            springLuckyEggActivity.mo149514M7().f331789j.setValue(null);
        }
    }
}
