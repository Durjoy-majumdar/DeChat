package gy3;

import ey3.C116797b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import ny3.C109824f;
import ny3.C25234c;
import ny3.C25239j;
import ny3.C25245n;
import ny3.C25246o;
import ny3.C25250r;

/* renamed from: gy3.d */
public abstract class C24557d implements C25234c, Serializable {
    public static final Object NO_RECEIVER = C24558a.f70153d;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient C25234c reflected;
    private final String signature;

    /* renamed from: gy3.d$a */
    public static class C24558a implements Serializable {

        /* renamed from: d */
        public static final C24558a f70153d = new C24558a();
    }

    public C24557d() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C25234c compute() {
        C25234c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        C25234c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract C25234c computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C109824f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C24560g0.f70158a.mo51269c(cls, "") : C24560g0.m30725a(cls);
    }

    public List<C25239j> getParameters() {
        return getReflected().getParameters();
    }

    public C25234c getReflected() {
        C25234c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C116797b();
    }

    public C25245n getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<C25246o> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C25250r getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public C24557d(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    public C24557d(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
