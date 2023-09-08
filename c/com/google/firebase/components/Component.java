package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p1192e9.C116704b;
import p1192e9.C116705c;

public final class Component<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f339203a;

    /* renamed from: b */
    public final Set<Dependency> f339204b;

    /* renamed from: c */
    public final int f339205c;

    /* renamed from: d */
    public final ComponentFactory<T> f339206d;

    public static class Builder<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f339207a;

        /* renamed from: b */
        public final Set<Dependency> f339208b = new HashSet();

        /* renamed from: c */
        public int f339209c;

        /* renamed from: d */
        public ComponentFactory<T> f339210d;

        public Builder(Class cls, Class[] clsArr, C116705c cVar) {
            HashSet hashSet = new HashSet();
            this.f339207a = hashSet;
            int i = 0;
            this.f339209c = 0;
            if (cls != null) {
                hashSet.add(cls);
                int length = clsArr.length;
                while (i < length) {
                    if (clsArr[i] != null) {
                        i++;
                    } else {
                        throw new NullPointerException("Null interface");
                    }
                }
                Collections.addAll(this.f339207a, clsArr);
                return;
            }
            throw new NullPointerException("Null interface");
        }

        public Builder<T> add(Dependency dependency) {
            if (dependency != null) {
                if (!((HashSet) this.f339207a).contains(dependency.f339211a)) {
                    ((HashSet) this.f339208b).add(dependency);
                    return this;
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new NullPointerException("Null dependency");
        }

        public Builder<T> alwaysEager() {
            if (this.f339209c == 0) {
                this.f339209c = 1;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }

        public Component<T> build() {
            if (this.f339210d != null) {
                return new Component(new HashSet(this.f339207a), new HashSet(this.f339208b), this.f339209c, this.f339210d, (C116705c) null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            if (componentFactory != null) {
                this.f339210d = componentFactory;
                return this;
            }
            throw new NullPointerException("Null factory");
        }
    }

    public Component(Set set, Set set2, int i, ComponentFactory componentFactory, C116705c cVar) {
        this.f339203a = Collections.unmodifiableSet(set);
        this.f339204b = Collections.unmodifiableSet(set2);
        this.f339205c = i;
        this.f339206d = componentFactory;
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0], (C116705c) null);
    }

    /* renamed from: of */
    public static <T> Component<T> m155203of(Class<T> cls, T t) {
        return builder(cls).factory(new C116704b(t)).build();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f339203a.toArray()) + ">{" + this.f339205c + ", deps=" + Arrays.toString(this.f339204b.toArray()) + "}";
    }
}
