package l24;

import d24.C116554w;
import e24.C20509c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: l24.e */
public class C117440e extends C117443g {

    /* renamed from: c */
    public final Method f351496c;

    /* renamed from: d */
    public final Method f351497d;

    /* renamed from: e */
    public final Method f351498e;

    /* renamed from: f */
    public final Class<?> f351499f;

    /* renamed from: g */
    public final Class<?> f351500g;

    /* renamed from: l24.e$a */
    public static class C117441a implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f351501a;

        /* renamed from: b */
        public boolean f351502b;

        /* renamed from: c */
        public String f351503c;

        public C117441a(List<String> list) {
            this.f351501a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C20509c.f57730b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f351502b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f351501a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f351501a.contains(list.get(i))) {
                                String str = (String) list.get(i);
                                this.f351503c = str;
                                return str;
                            }
                        }
                        String str2 = this.f351501a.get(0);
                        this.f351503c = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f351503c = (String) objArr[0];
                return null;
            }
        }
    }

    public C117440e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f351496c = method;
        this.f351497d = method2;
        this.f351498e = method3;
        this.f351499f = cls;
        this.f351500g = cls2;
    }

    /* renamed from: a */
    public void mo182144a(SSLSocket sSLSocket) {
        try {
            this.f351498e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20509c.m22195a("unable to remove alpn", e);
        }
    }

    /* renamed from: f */
    public void mo182126f(SSLSocket sSLSocket, String str, List<C116554w> list) {
        List<String> b = C117443g.m165641b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C117443g.class.getClassLoader(), new Class[]{this.f351499f, this.f351500g}, new C117441a(b));
            this.f351496c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20509c.m22195a("unable to set alpn", e);
        }
    }

    /* renamed from: i */
    public String mo182127i(SSLSocket sSLSocket) {
        try {
            C117441a aVar = (C117441a) Proxy.getInvocationHandler(this.f351497d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.f351502b;
            if (!z && aVar.f351503c == null) {
                C117443g.f351507a.mo182134l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f351503c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20509c.m22195a("unable to get selected protocol", e);
        }
    }
}
