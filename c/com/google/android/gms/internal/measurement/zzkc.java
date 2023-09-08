package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class zzkc extends SSLSocket {
    private final SSLSocket zzarj;

    public zzkc(zzkb zzkb, SSLSocket sSLSocket) {
        this.zzarj = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.zzarj.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.zzarj.bind(socketAddress);
    }

    public final synchronized void close() {
        this.zzarj.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.zzarj.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.zzarj.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.zzarj.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.zzarj.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.zzarj.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.zzarj.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.zzarj.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.zzarj.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.zzarj.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.zzarj.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.zzarj.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.zzarj.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.zzarj.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.zzarj.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.zzarj.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.zzarj.getOutputStream();
    }

    public final int getPort() {
        return this.zzarj.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.zzarj.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.zzarj.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.zzarj.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.zzarj.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.zzarj.getSession();
    }

    public final int getSoLinger() {
        return this.zzarj.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.zzarj.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzarj.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.zzarj.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.zzarj.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.zzarj.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.zzarj.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.zzarj.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.zzarj.isBound();
    }

    public final boolean isClosed() {
        return this.zzarj.isClosed();
    }

    public final boolean isConnected() {
        return this.zzarj.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.zzarj.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.zzarj.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.zzarj.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.zzarj.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.zzarj.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.zzarj.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.zzarj.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.zzarj.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.zzarj.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.zzarj.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.zzarj.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.zzarj.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.zzarj.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.zzarj.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.zzarj.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.zzarj.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.zzarj.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.zzarj.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.zzarj.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.zzarj.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.zzarj.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.zzarj.shutdownInput();
    }

    public final void shutdownOutput() {
        this.zzarj.shutdownOutput();
    }

    public final void startHandshake() {
        this.zzarj.startHandshake();
    }

    public final String toString() {
        return this.zzarj.toString();
    }
}
