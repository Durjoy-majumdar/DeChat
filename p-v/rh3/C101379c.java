package rh3;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.List;
import te3.C101814mn2;
import te3.C64529ln2;
import te3.C64613on2;

/* renamed from: rh3.c */
public final class C101379c extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ List<C101380d> f296958a;

    /* renamed from: b */
    public final /* synthetic */ List<C101380d> f296959b;

    public C101379c(List<C101380d> list, List<C101380d> list2) {
        this.f296958a = list;
        this.f296959b = list2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        C101814mn2 mn22 = this.f296958a.get(i).f296960a;
        C101814mn2 mn23 = this.f296959b.get(i2).f296960a;
        C87412m.m108594g(mn22, "oldItem");
        C87412m.m108594g(mn23, "newItem");
        if (Util.isNullOrNil(mn22.f298862d)) {
            return C87412m.m108589b(mn22, mn23);
        }
        if (Util.isEqual(mn22.f298862d, mn23.f298862d)) {
            C64529ln2 ln22 = mn22.f298863e;
            String str = null;
            String str2 = ln22 != null ? ln22.f184127d : null;
            C64529ln2 ln23 = mn23.f298863e;
            if (Util.isEqual(str2, ln23 != null ? ln23.f184127d : null)) {
                C64613on2 on22 = mn22.f298866h;
                String str3 = on22 != null ? on22.f184679d : null;
                C64613on2 on23 = mn23.f298866h;
                if (on23 != null) {
                    str = on23.f184679d;
                }
                if (Util.isEqual(str3, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        return C87412m.m108589b(this.f296958a.get(i).f296960a.f298862d, this.f296959b.get(i2).f296960a.f298862d);
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f296959b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f296958a.size();
    }
}
