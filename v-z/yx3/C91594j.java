package yx3;

import gy3.C24560g0;
import gy3.C24562j;
import gy3.C87412m;
import kotlin.Metadata;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo182094d2 = {"Lyx3/j;", "Lyx3/d;", "Lgy3/j;", "", "", "toString", "", "arity", "I", "getArity", "()I", "Lwx3/d;", "completion", "<init>", "(ILwx3/d;)V", "(I)V", "kotlin-stdlib"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: yx3.j */
public abstract class C91594j extends C66704d implements C24562j<Object> {
    private final int arity;

    public C91594j(int i, C15601d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = C24560g0.f70158a.mo51274h(this);
        C87412m.m108593f(h, "renderLambdaToString(this)");
        return h;
    }

    public C91594j(int i) {
        this(i, (C15601d<Object>) null);
    }
}
