package com.tencent.p014mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.C80938z;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import q20.C89449a;
import s20.C90122a;
import s20.C90123b;
import v20.C90739a;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker */
public class XIPCInvoker {

    /* renamed from: a */
    public static final Map<C1256g<?>, WeakReference<C1256g<?>>> f237712a = new WeakHashMap();

    /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable */
    public static class WrapperParcelable implements Parcelable {
        public static final Parcelable.Creator<WrapperParcelable> CREATOR = new C80884a();

        /* renamed from: d */
        public String f237713d;

        /* renamed from: e */
        public Object f237714e;

        /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable$a */
        public class C80884a implements Parcelable.Creator<WrapperParcelable> {
            public Object createFromParcel(Parcel parcel) {
                WrapperParcelable wrapperParcelable = new WrapperParcelable();
                wrapperParcelable.f237713d = parcel.readString();
                if (parcel.readInt() == 1) {
                    wrapperParcelable.f237714e = C80893c.m98762c(parcel.readString(), parcel);
                }
                return wrapperParcelable;
            }

            public Object[] newArray(int i) {
                return new WrapperParcelable[i];
            }
        }

        public WrapperParcelable() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C80891a b;
            parcel.writeString(this.f237713d);
            Object obj = this.f237714e;
            if (obj == null || (b = C80893c.m98761b(obj)) == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeString(b.getName());
            b.mo56344c(this.f237714e, parcel);
        }

        public WrapperParcelable(String str, Object obj) {
            this.f237713d = str;
            this.f237714e = obj;
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$a */
    public class C80885a implements C1256g<WrapperParcelable> {

        /* renamed from: d */
        public final /* synthetic */ C1256g f237715d;

        public C80885a(boolean z, C1256g gVar) {
            this.f237715d = gVar;
            if (!z) {
                Map<C1256g<?>, WeakReference<C1256g<?>>> map = XIPCInvoker.f237712a;
                synchronized (map) {
                    ((WeakHashMap) map).put(gVar, new WeakReference(this));
                }
            }
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            WrapperParcelable wrapperParcelable = (WrapperParcelable) obj;
            C1256g gVar = this.f237715d;
            if (gVar == null) {
                return;
            }
            if (wrapperParcelable == null) {
                C90741c.m113810c("IPC.XIPCInvoker", "async invoke callback error, wrapper parcelable data is null!", new Object[0]);
                this.f237715d.mo894a(null);
                return;
            }
            gVar.mo894a(wrapperParcelable.f237714e);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$b */
    public static class C80886b implements C80883e<WrapperParcelable, WrapperParcelable> {
        private C80886b() {
        }

        public /* synthetic */ C80886b(C80885a aVar) {
            this();
        }

        public void invoke(Object obj, C1256g gVar) {
            WrapperParcelable wrapperParcelable = (WrapperParcelable) obj;
            Object obj2 = wrapperParcelable.f237714e;
            String str = wrapperParcelable.f237713d;
            if (str == null || str.length() == 0) {
                C90741c.m113808a("IPC.IPCAsyncInvokeTaskProxy", "proxy AsyncInvoke failed, class is null or nil.", new Object[0]);
                return;
            }
            C80883e eVar = (C80883e) C80938z.m98814b(str, C80883e.class);
            if (eVar == null) {
                C90741c.m113810c("IPC.IPCAsyncInvokeTaskProxy", "proxy AsyncInvoke failed, newInstance(%s) return null.", str);
                return;
            }
            eVar.invoke(obj2, new C80888d(gVar));
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$c */
    public static class C80887c extends C80886b implements C1255d<WrapperParcelable, WrapperParcelable> {
        private C80887c() {
            super((C80885a) null);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$d */
    public static class C80888d implements C1256g, C90122a {

        /* renamed from: d */
        public C1256g<WrapperParcelable> f237716d;

        /* renamed from: e */
        public C90122a f237717e;

        public C80888d(C1256g<WrapperParcelable> gVar) {
            this.f237716d = gVar;
            if (gVar instanceof C90122a) {
                this.f237717e = (C90122a) gVar;
            }
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            C1256g<WrapperParcelable> gVar = this.f237716d;
            if (gVar != null) {
                gVar.mo894a(new WrapperParcelable((String) null, obj));
            }
        }

        /* renamed from: d */
        public void mo112675d(C90123b bVar) {
            C90122a aVar = this.f237717e;
            if (aVar != null) {
                aVar.mo112675d(bVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.extension.XIPCInvoker$e */
    public static class C80889e implements C80916r<WrapperParcelable, WrapperParcelable> {
        private C80889e() {
        }

        public Object invoke(Object obj) {
            WrapperParcelable wrapperParcelable = (WrapperParcelable) obj;
            Object obj2 = wrapperParcelable.f237714e;
            String str = wrapperParcelable.f237713d;
            if (str == null || str.length() == 0) {
                C90741c.m113808a("IPC.XIPCInvoker", "proxy SyncInvoke failed, class is null or nil.", new Object[0]);
                return new WrapperParcelable((String) null, (Object) null);
            }
            C80916r rVar = (C80916r) C80938z.m98814b(str, C80916r.class);
            if (rVar != null) {
                return new WrapperParcelable((String) null, rVar.invoke(obj2));
            }
            C90741c.m113810c("IPC.XIPCInvoker", "proxy SyncInvoke failed, newInstance(%s) return null.", str);
            return new WrapperParcelable((String) null, (Object) null);
        }
    }

    /* renamed from: a */
    public static <T extends C80883e<InputType, ResultType>, InputType, ResultType> void m98748a(String str, InputType inputtype, Class<T> cls, C1256g<ResultType> gVar) {
        boolean z;
        boolean z2 = false;
        try {
            z = C90739a.m113806a(cls, C89449a.class);
        } catch (Exception unused) {
            z = false;
        }
        if (z || gVar == null) {
            z2 = true;
        }
        C80907o.m98781d(str, new WrapperParcelable(cls.getName(), inputtype), z2 ? C80887c.class : C80886b.class, gVar == null ? null : new C80885a(z2, gVar));
    }

    /* renamed from: b */
    public static <T extends C80916r<InputType, ResultType>, InputType, ResultType> ResultType m98749b(String str, InputType inputtype, Class<T> cls) {
        WrapperParcelable wrapperParcelable = (WrapperParcelable) C80907o.m98783f(str, new WrapperParcelable(cls.getName(), inputtype), C80889e.class);
        if (wrapperParcelable != null) {
            return wrapperParcelable.f237714e;
        }
        C90741c.m113810c("IPC.XIPCInvoker", "sync invoke error, wrapper parcelable data is null!", new Object[0]);
        return null;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 121 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98750c(com.tencent.p014mm.ipcinvoker.C1256g<?> r2) {
        /*
            if (r2 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<com.tencent.mm.ipcinvoker.g<?>, java.lang.ref.WeakReference<com.tencent.mm.ipcinvoker.g<?>>> r0 = f237712a
            monitor-enter(r0)
            r1 = r0
            java.util.WeakHashMap r1 = (java.util.WeakHashMap) r1     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x0025 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0013
            r1 = 0
            goto L_0x0019
        L_0x0013:
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0025 }
            com.tencent.mm.ipcinvoker.g r1 = (com.tencent.p014mm.ipcinvoker.C1256g) r1     // Catch:{ all -> 0x0025 }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x001f
            com.tencent.p014mm.ipcinvoker.C80907o.m98785h(r1)
        L_0x001f:
            com.tencent.p014mm.ipcinvoker.C80907o.m98785h(r2)
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r2
        L_0x0025:
            r2 = move-exception
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98750c(com.tencent.mm.ipcinvoker.g):void");
    }
}
