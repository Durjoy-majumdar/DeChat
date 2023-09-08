package l24;

import android.net.ssl.SSLSockets;
import d24.C116554w;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: l24.a */
public class C117433a extends C117434b {
    public C117433a(Class<?> cls) {
        super(cls, (C117442f<Socket>) null, (C117442f<Socket>) null, (C117442f<Socket>) null, (C117442f<Socket>) null);
    }

    /* renamed from: f */
    public void mo182126f(SSLSocket sSLSocket, String str, List<C116554w> list) {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) ((ArrayList) C117443g.m165641b(list)).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    /* renamed from: i */
    public String mo182127i(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
