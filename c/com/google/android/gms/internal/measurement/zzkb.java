package com.google.android.gms.internal.measurement;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class zzkb extends SSLSocketFactory {
    private final SSLSocketFactory zzari;

    public zzkb() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private zzkb(SSLSocketFactory sSLSocketFactory) {
        this.zzari = sSLSocketFactory;
    }

    private final SSLSocket zza(SSLSocket sSLSocket) {
        return new zzkc(this, sSLSocket);
    }

    public final Socket createSocket() {
        return zza((SSLSocket) this.zzari.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return zza((SSLSocket) this.zzari.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return zza((SSLSocket) this.zzari.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return zza((SSLSocket) this.zzari.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return zza((SSLSocket) this.zzari.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return zza((SSLSocket) this.zzari.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.zzari.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzari.getSupportedCipherSuites();
    }
}
