package uj3;

import android.util.SparseArray;
import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import rx3.C36570n;
import uj3.C78190b;
import vj3.C78421a;

/* renamed from: uj3.c */
public final class C78206c extends C54248l.C54250b {

    /* renamed from: a */
    public final SparseArray<C72963f4> f229155a;

    /* renamed from: b */
    public final SparseArray<C72963f4> f229156b;

    public C78206c(SparseArray<C72963f4> sparseArray, SparseArray<C72963f4> sparseArray2) {
        C87412m.m108594g(sparseArray, "oldList");
        C87412m.m108594g(sparseArray2, "newList");
        this.f229155a = sparseArray;
        this.f229156b = sparseArray2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        C72963f4 f4Var = this.f229155a.get(i);
        C72963f4 f4Var2 = this.f229156b.get(i2);
        C78190b.C78193e eVar = C78190b.f229093y0;
        if (((C78421a) ((C36570n) C78190b.f229092R0).getValue()).f229770a.contains(Integer.valueOf(f4Var.getType())) || !f4Var.compareContent(f4Var2)) {
            return false;
        }
        C72963f4.C72966d dVar = null;
        C72963f4.C72966d dVar2 = f4Var.f212670y1;
        if (f4Var2 != null) {
            dVar = f4Var2.f212670y1;
        }
        return (dVar2 != null || dVar != null) ? (dVar2 == null || dVar == null) ? false : dVar2.mo82132a(dVar) : true;
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        return this.f229155a.get(i).getMsgId() == this.f229156b.get(i2).getMsgId();
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f229156b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f229155a.size();
    }
}
