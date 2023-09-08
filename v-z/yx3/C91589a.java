package yx3;

import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91591g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo182094d2 = {"Lyx3/a;", "Lwx3/d;", "", "Lyx3/e;", "Ljava/io/Serializable;", "Lkotlin/Result;", "result", "Lrx3/b0;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lwx3/d;", "getCompletion", "()Lwx3/d;", "getCallerFrame", "()Lyx3/e;", "callerFrame", "<init>", "(Lwx3/d;)V", "kotlin-stdlib"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: yx3.a */
public abstract class C91589a implements C15601d<Object>, C66705e, Serializable {
    private final C15601d<Object> completion;

    public C91589a(C15601d<Object> dVar) {
        this.completion = dVar;
    }

    public C15601d<C13598b0> create(C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C66705e getCallerFrame() {
        C15601d<Object> dVar = this.completion;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    public final C15601d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        C91590f fVar = (C91590f) getClass().getAnnotation(C91590f.class);
        String str2 = null;
        if (fVar == null) {
            return null;
        }
        int v = fVar.mo125472v();
        if (v <= 1) {
            int i2 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i2 = fVar.mo125470l()[i];
            }
            C91591g.C91592a aVar = C91591g.f262434b;
            if (aVar == null) {
                try {
                    C91591g.C91592a aVar2 = new C91591g.C91592a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C91591g.f262434b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = C91591g.f262433a;
                    C91591g.f262434b = aVar;
                }
            }
            if (aVar != C91591g.f262433a) {
                Method method = aVar.f262435a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.f262436b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.f262437c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = fVar.mo125468c();
            } else {
                str = str2 + XVFSFile.SEPARATOR_CHAR + fVar.mo125468c();
            }
            return new StackTraceElement(str, fVar.mo125471m(), fVar.mo125469f(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + 1 + ", got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C15601d dVar = this;
        while (true) {
            C91589a aVar = (C91589a) dVar;
            C15601d dVar2 = aVar.completion;
            C87412m.m108591d(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C15911a.COROUTINE_SUSPENDED) {
                    obj = Result.m168114constructorimpl(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof C91589a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C87412m.m108594g(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
