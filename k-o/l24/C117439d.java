package l24;

import d24.C116554w;
import e24.C20509c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: l24.d */
public final class C117439d extends C117443g {

    /* renamed from: c */
    public final Method f351494c;

    /* renamed from: d */
    public final Method f351495d;

    public C117439d(Method method, Method method2) {
        this.f351494c = method;
        this.f351495d = method2;
    }

    /* renamed from: f */
    public void mo182126f(SSLSocket sSLSocket, String str, List<C116554w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b = C117443g.m165641b(list);
            ArrayList arrayList = (ArrayList) b;
            this.f351494c.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20509c.m22195a("unable to set ssl parameters", e);
        }
    }

    /* renamed from: i */
    public String mo182127i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f351495d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw C20509c.m22195a("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw C20509c.m22195a("failed to get ALPN selected protocol", e2);
        }
    }
}
