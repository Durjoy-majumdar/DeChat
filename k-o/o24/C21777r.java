package o24;

import gy3.C87412m;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import z04.C112550d0;

/* renamed from: o24.r */
public final class C21777r {
    /* renamed from: a */
    public static final C21767i m24934a(C21754b0 b0Var) {
        C87412m.m108594g(b0Var, "$this$buffer");
        return new C21781v(b0Var);
    }

    /* renamed from: b */
    public static final C21768j m24935b(C21760d0 d0Var) {
        C87412m.m108594g(d0Var, "$this$buffer");
        return new C21783x(d0Var);
    }

    /* renamed from: c */
    public static final boolean m24936c(AssertionError assertionError) {
        Logger logger = C21778s.f61715a;
        C87412m.m108594g(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C112550d0.m153801u(message, "getsockname failed", false) : false;
    }

    /* renamed from: d */
    public static final C21754b0 m24937d(Socket socket) {
        Logger logger = C21778s.f61715a;
        C87412m.m108594g(socket, "$this$sink");
        C21758c0 c0Var = new C21758c0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C87412m.m108593f(outputStream, "getOutputStream()");
        return new C21759d(c0Var, new C21779t(outputStream, c0Var));
    }

    /* renamed from: e */
    public static final C21760d0 m24938e(File file) {
        Logger logger = C21778s.f61715a;
        C87412m.m108594g(file, "$this$source");
        return m24939f(new FileInputStream(file));
    }

    /* renamed from: f */
    public static final C21760d0 m24939f(InputStream inputStream) {
        Logger logger = C21778s.f61715a;
        C87412m.m108594g(inputStream, "$this$source");
        return new C21776q(inputStream, new C21762e0());
    }

    /* renamed from: g */
    public static final C21760d0 m24940g(Socket socket) {
        Logger logger = C21778s.f61715a;
        C87412m.m108594g(socket, "$this$source");
        C21758c0 c0Var = new C21758c0(socket);
        InputStream inputStream = socket.getInputStream();
        C87412m.m108593f(inputStream, "getInputStream()");
        return new C21761e(c0Var, new C21776q(inputStream, c0Var));
    }
}
