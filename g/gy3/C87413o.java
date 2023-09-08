package gy3;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lgy3/o;", "R", "Lgy3/j;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: gy3.o */
public abstract class C87413o<R> implements C24562j<R>, Serializable {
    private final int arity;

    public C87413o(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = C24560g0.f70158a.mo51275i(this);
        C87412m.m108593f(i, "renderLambdaToString(this)");
        return i;
    }
}
