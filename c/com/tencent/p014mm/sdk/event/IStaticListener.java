package com.tencent.p014mm.sdk.event;

import com.tencent.p014mm.sdk.event.IEvent;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p261wl.C38173h;

/* renamed from: com.tencent.mm.sdk.event.IStaticListener */
public abstract class IStaticListener<T extends IEvent> implements C38173h {
    private final int priority;

    @Documented
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.tencent.mm.sdk.event.IStaticListener$WithEvent */
    public @interface WithEvent {
        Class<? extends IEvent>[] value();
    }

    public IStaticListener() {
        this(0);
    }

    public abstract boolean callback(T t);

    /* access modifiers changed from: package-private */
    public int getPriority() {
        return this.priority;
    }

    public IStaticListener(int i) {
        this.priority = i;
    }
}
