package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;

public class ExternalDecodeFactoryManager {

    /* renamed from: a */
    private static C17356n f46892a;

    /* renamed from: a */
    public static synchronized boolean m17221a() {
        synchronized (ExternalDecodeFactoryManager.class) {
            C17356n nVar = f46892a;
            if (nVar == null) {
                return false;
            }
            long a = nVar.mo20422a();
            if (a == 0) {
                return false;
            }
            f46892a.mo20423a(a);
            return true;
        }
    }

    public static synchronized long createH265Decoder() {
        synchronized (ExternalDecodeFactoryManager.class) {
            C17356n nVar = f46892a;
            if (nVar == null) {
                return 0;
            }
            long a = nVar.mo20422a();
            return a;
        }
    }

    public static synchronized void destroyH265Decoder(long j) {
        synchronized (ExternalDecodeFactoryManager.class) {
            C17356n nVar = f46892a;
            if (nVar == null) {
                LiteavLog.m16905w("ExternalDecodeFactoryManager", "DestroyHevcDecoder sDecoderFactory is null: ".concat(String.valueOf(j)));
            } else {
                nVar.mo20423a(j);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m17220a(C17356n nVar) {
        synchronized (ExternalDecodeFactoryManager.class) {
            f46892a = nVar;
        }
    }
}
