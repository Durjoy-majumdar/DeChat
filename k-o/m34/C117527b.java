package m34;

import java.util.List;
import l34.C88379f;

/* renamed from: m34.b */
public final class C117527b {
    /* renamed from: a */
    public static void m165773a(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            } else {
                throw new C117522a(list);
            }
        }
    }

    /* renamed from: b */
    public static void m165774b(Throwable th) {
        if (th instanceof C88695f) {
            throw ((C88695f) th);
        } else if (th instanceof C117530e) {
            throw ((C117530e) th);
        } else if (th instanceof C117529d) {
            throw ((C117529d) th);
        } else if (th instanceof StackOverflowError) {
            throw ((StackOverflowError) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: c */
    public static void m165775c(Throwable th, C88379f<?> fVar) {
        m165774b(th);
        fVar.onError(th);
    }

    /* renamed from: d */
    public static void m165776d(Throwable th, C88379f<?> fVar, Object obj) {
        m165774b(th);
        fVar.onError(C117531g.m165777a(th, obj));
    }
}
