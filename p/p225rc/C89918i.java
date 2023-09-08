package p225rc;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import ny3.C89104m;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: rc.i */
public final class C89918i<T> {

    /* renamed from: a */
    public String f258394a;

    /* renamed from: b */
    public T f258395b;

    /* renamed from: c */
    public Class<?> f258396c;

    /* renamed from: d */
    public Object f258397d;

    /* renamed from: e */
    public final C13601g f258398e;

    /* renamed from: rc.i$a */
    public static final class C89919a {
        public C89919a(C8480h hVar) {
        }
    }

    /* renamed from: rc.i$b */
    public static final class C89920b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public final /* synthetic */ C89918i<T> f258399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89920b(C89918i<T> iVar) {
            super(0);
            this.f258399d = iVar;
        }

        public Object invoke() {
            C89918i<T> iVar = this.f258399d;
            String str = iVar.f258394a;
            if (str == null) {
                Object obj = iVar.f258397d;
                if (obj != null) {
                    str = obj.getClass().getCanonicalName();
                    C87412m.m108591d(str);
                } else {
                    C87412m.m108603p("thisRef");
                    throw null;
                }
            }
            return MultiProcessMMKV.getMMKV(str, 2);
        }
    }

    static {
        new C89919a((C8480h) null);
    }

    public C89918i(T t) {
        C87412m.m108594g(t, "defaultValue");
        this.f258398e = C36568h.m40985a(new C89920b(this));
        this.f258395b = t;
        this.f258396c = t.getClass();
    }

    /* renamed from: a */
    public final MultiProcessMMKV mo124237a() {
        Object value = ((C36570n) this.f258398e).getValue();
        C87412m.m108593f(value, "<get-mmkv>(...)");
        return (MultiProcessMMKV) value;
    }

    /* renamed from: b */
    public final T mo124238b(Object obj, C89104m<?> mVar) {
        C87412m.m108594g(obj, "thisRef");
        C87412m.m108594g(mVar, "property");
        this.f258397d = obj;
        Class<?> cls = this.f258396c;
        boolean z = true;
        if (C87412m.m108589b(cls, Float.TYPE) ? true : C87412m.m108589b(cls, Float.class)) {
            MultiProcessMMKV a = mo124237a();
            String name = mVar.getName();
            T t = this.f258395b;
            C87412m.m108592e(t, "null cannot be cast to non-null type kotlin.Float");
            return Float.valueOf(a.getFloat(name, ((Float) t).floatValue()));
        }
        if (C87412m.m108589b(cls, Integer.TYPE) ? true : C87412m.m108589b(cls, Integer.class)) {
            MultiProcessMMKV a2 = mo124237a();
            String name2 = mVar.getName();
            T t2 = this.f258395b;
            C87412m.m108592e(t2, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(a2.getInt(name2, ((Integer) t2).intValue()));
        } else if (C87412m.m108589b(cls, String.class)) {
            MultiProcessMMKV a3 = mo124237a();
            String name3 = mVar.getName();
            T t3 = this.f258395b;
            C87412m.m108592e(t3, "null cannot be cast to non-null type kotlin.String");
            T string = a3.getString(name3, (String) t3);
            C87412m.m108592e(string, "null cannot be cast to non-null type T of com.tencent.luggage.util.LuggageMMKVProperty");
            return string;
        } else {
            if (C87412m.m108589b(cls, Long.TYPE) ? true : C87412m.m108589b(cls, Long.class)) {
                MultiProcessMMKV a4 = mo124237a();
                String name4 = mVar.getName();
                T t4 = this.f258395b;
                C87412m.m108592e(t4, "null cannot be cast to non-null type kotlin.Long");
                return Long.valueOf(a4.getLong(name4, ((Long) t4).longValue()));
            }
            if (!C87412m.m108589b(cls, Boolean.TYPE)) {
                z = C87412m.m108589b(cls, Boolean.class);
            }
            if (z) {
                MultiProcessMMKV a5 = mo124237a();
                String name5 = mVar.getName();
                T t5 = this.f258395b;
                C87412m.m108592e(t5, "null cannot be cast to non-null type kotlin.Boolean");
                return Boolean.valueOf(a5.getBoolean(name5, ((Boolean) t5).booleanValue()));
            } else if (C87412m.m108589b(cls, byte[].class)) {
                Object decodeBytes = mo124237a().decodeBytes(mVar.getName());
                if (decodeBytes == null) {
                    decodeBytes = this.f258395b;
                }
                C87412m.m108592e(decodeBytes, "null cannot be cast to non-null type T of com.tencent.luggage.util.LuggageMMKVProperty");
                return decodeBytes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Class superclass = this.f258396c.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                }
                if (arrayList.contains(C47465a.class)) {
                    byte[] decodeBytes2 = mo124237a().decodeBytes(mVar.getName());
                    if (decodeBytes2 == null) {
                        return this.f258395b;
                    }
                    try {
                        T newInstance = this.f258396c.newInstance();
                        C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
                        T t6 = (C47465a) newInstance;
                        t6.parseFrom(decodeBytes2);
                        return t6;
                    } catch (Exception unused) {
                        Log.m105920e("AppBrand.utils.AppBrandMMKVProperty", "parse pb failed, class:" + this.f258396c.getCanonicalName());
                        return this.f258395b;
                    }
                } else {
                    throw new IllegalAccessError("unsupported type:" + this.f258396c);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo124239c(Object obj, C89104m<?> mVar, T t) {
        C87412m.m108594g(obj, "thisRef");
        C87412m.m108594g(mVar, "property");
        this.f258397d = obj;
        if (t == null) {
            mo124237a().removeValueForKey(mVar.getName());
            return;
        }
        Class<?> cls = this.f258396c;
        boolean z = true;
        if (C87412m.m108589b(cls, Float.TYPE) ? true : C87412m.m108589b(cls, Float.class)) {
            mo124237a().putFloat(mVar.getName(), ((Float) t).floatValue());
            return;
        }
        if (C87412m.m108589b(cls, Integer.TYPE) ? true : C87412m.m108589b(cls, Integer.class)) {
            mo124237a().putInt(mVar.getName(), ((Integer) t).intValue());
        } else if (C87412m.m108589b(cls, String.class)) {
            mo124237a().putString(mVar.getName(), (String) t);
        } else {
            if (C87412m.m108589b(cls, Long.TYPE) ? true : C87412m.m108589b(cls, Long.class)) {
                mo124237a().putLong(mVar.getName(), ((Long) t).longValue());
                return;
            }
            if (!C87412m.m108589b(cls, Boolean.TYPE)) {
                z = C87412m.m108589b(cls, Boolean.class);
            }
            if (z) {
                mo124237a().putBoolean(mVar.getName(), ((Boolean) t).booleanValue());
            } else if (C87412m.m108589b(cls, byte[].class)) {
                mo124237a().encode(mVar.getName(), (byte[]) t);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Class superclass = this.f258396c.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                }
                if (arrayList.contains(C47465a.class)) {
                    mo124237a().encode(mVar.getName(), ((C47465a) t).toByteArray());
                    return;
                }
                throw new IllegalAccessError("unsupported type:" + this.f258396c);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C89918i(T t, String str) {
        this(t);
        C87412m.m108594g(t, "defaultValue");
        C87412m.m108594g(str, "mmkvName");
        this.f258394a = str;
        this.f258395b = t;
        this.f258396c = t.getClass();
    }
}
