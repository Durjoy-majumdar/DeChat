package p1202o3;

import android.os.Bundle;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import androidx.lifecycle.C54219z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p1042u.C111060j;
import p1202o3.C117643a;
import p329d3.C86166b;
import p860p3.C117911b;

/* renamed from: o3.b */
public class C117645b extends C117643a {

    /* renamed from: a */
    public final C0125s f351899a;

    /* renamed from: b */
    public final C117648c f351900b;

    /* renamed from: o3.b$a */
    public static class C117646a<D> extends C54219z<D> implements C117911b.C117913b<D> {

        /* renamed from: d */
        public final int f351901d;

        /* renamed from: e */
        public final Bundle f351902e;

        /* renamed from: f */
        public final C117911b<D> f351903f;

        /* renamed from: g */
        public C0125s f351904g;

        /* renamed from: h */
        public C117647b<D> f351905h;

        /* renamed from: i */
        public C117911b<D> f351906i;

        public C117646a(int i, Bundle bundle, C117911b<D> bVar, C117911b<D> bVar2) {
            this.f351901d = i;
            this.f351902e = bundle;
            this.f351903f = bVar;
            this.f351906i = bVar2;
            bVar.registerListener(i, this);
        }

        /* renamed from: a */
        public void mo182368a() {
            C0125s sVar = this.f351904g;
            C117647b<D> bVar = this.f351905h;
            if (sVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(sVar, bVar);
            }
        }

        public void onActive() {
            this.f351903f.startLoading();
        }

        public void onInactive() {
            this.f351903f.stopLoading();
        }

        public void removeObserver(C0120a0<? super D> a0Var) {
            super.removeObserver(a0Var);
            this.f351904g = null;
            this.f351905h = null;
        }

        public void setValue(D d) {
            super.setValue(d);
            C117911b<D> bVar = this.f351906i;
            if (bVar != null) {
                bVar.reset();
                this.f351906i = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f351901d);
            sb.append(" : ");
            C86166b.m106678a(this.f351903f, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: o3.b$b */
    public static class C117647b<D> implements C0120a0<D> {

        /* renamed from: d */
        public final C117911b<D> f351907d;

        /* renamed from: e */
        public final C117643a.C117644a<D> f351908e;

        /* renamed from: f */
        public boolean f351909f = false;

        public C117647b(C117911b<D> bVar, C117643a.C117644a<D> aVar) {
            this.f351907d = bVar;
            this.f351908e = aVar;
        }

        public void onChanged(D d) {
            this.f351908e.onLoadFinished(this.f351907d, d);
            this.f351909f = true;
        }

        public String toString() {
            return this.f351908e.toString();
        }
    }

    /* renamed from: o3.b$c */
    public static class C117648c extends C39622i0 {

        /* renamed from: f */
        public static final C54209k0.C54210b f351910f = new C117649a();

        /* renamed from: d */
        public C111060j<C117646a> f351911d = new C111060j<>();

        /* renamed from: e */
        public boolean f351912e = false;

        /* renamed from: o3.b$c$a */
        public static class C117649a implements C54209k0.C54210b {
            public <T extends C39622i0> T create(Class<T> cls) {
                return new C117648c();
            }
        }

        public void onCleared() {
            super.onCleared();
            int h = this.f351911d.mo162808h();
            for (int i = 0; i < h; i++) {
                C117646a j = this.f351911d.mo162809j(i);
                j.f351903f.cancelLoad();
                j.f351903f.abandon();
                C117647b<D> bVar = j.f351905h;
                if (bVar != null) {
                    j.removeObserver(bVar);
                    if (bVar.f351909f) {
                        bVar.f351908e.onLoaderReset(bVar.f351907d);
                    }
                }
                j.f351903f.unregisterListener(j);
                j.f351903f.reset();
            }
            C111060j<C117646a> jVar = this.f351911d;
            int i2 = jVar.f332588g;
            Object[] objArr = jVar.f332587f;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            jVar.f332588g = 0;
            jVar.f332585d = false;
        }
    }

    public C117645b(C0125s sVar, C39630m0 m0Var) {
        this.f351899a = sVar;
        this.f351900b = (C117648c) new C54209k0(m0Var, C117648c.f351910f).mo75002a(C117648c.class);
    }

    @Deprecated
    /* renamed from: a */
    public void mo182366a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C117648c cVar = this.f351900b;
        if (cVar.f351911d.mo162808h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.f351911d.mo162808h(); i++) {
                C117646a j = cVar.f351911d.mo162809j(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f351911d.mo162806f(i));
                printWriter.print(": ");
                printWriter.println(j.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(j.f351901d);
                printWriter.print(" mArgs=");
                printWriter.println(j.f351902e);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(j.f351903f);
                j.f351903f.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (j.f351905h != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(j.f351905h);
                    C117647b<D> bVar = j.f351905h;
                    bVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar.f351909f);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(j.f351903f.dataToString(j.getValue()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(j.hasActiveObservers());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C86166b.m106678a(this.f351899a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
