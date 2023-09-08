package o24;

import gy3.C87412m;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o24.c0 */
public final class C21758c0 extends C21755c {

    /* renamed from: l */
    public final Socket f61684l;

    public C21758c0(Socket socket) {
        C87412m.m108594g(socket, "socket");
        this.f61684l = socket;
    }

    /* renamed from: j */
    public IOException mo33151j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: k */
    public void mo31965k() {
        try {
            this.f61684l.close();
        } catch (Exception e) {
            Logger logger = C21778s.f61715a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + this.f61684l, e);
        } catch (AssertionError e2) {
            if (C21777r.m24936c(e2)) {
                Logger logger2 = C21778s.f61715a;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f61684l, e2);
                return;
            }
            throw e2;
        }
    }
}
