package com.tencent.maas;

import p1003m6.C88699a;
import p1003m6.C88700b;

public class MJMaasInitializer {

    public static class NativeLoaderProxy implements C88700b {
        public final MJNativeLoader mNativeLoader;

        public NativeLoaderProxy(MJNativeLoader mJNativeLoader) {
            this.mNativeLoader = mJNativeLoader;
        }

        public String getLibraryPath(String str) {
            return null;
        }

        public int getSoSourcesVersion() {
            return 0;
        }

        public boolean loadLibrary(String str, int i) {
            this.mNativeLoader.loadLibrary(str);
            return true;
        }
    }

    private MJMaasInitializer() {
    }

    public static void initialize(MJNativeLoader mJNativeLoader) {
        boolean z;
        Class<C88699a> cls = C88699a.class;
        synchronized (cls) {
            z = C88699a.f256049a != null;
        }
        if (!z) {
            NativeLoaderProxy nativeLoaderProxy = new NativeLoaderProxy(mJNativeLoader);
            synchronized (cls) {
                if (C88699a.f256049a == null) {
                    C88699a.f256049a = nativeLoaderProxy;
                } else {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
            }
        }
        C88699a.m110646a("linkid");
        C88699a.m110646a("ilink_protobuf");
        C88699a.m110646a("ilink2");
        C88699a.m110646a("ilink_network");
        C88699a.m110646a("owl");
        C88699a.m110646a("mmskia");
        C88699a.m110646a("WeVision");
        C88699a.m110646a("WeEffect");
        C88699a.m110646a("MaasSDK");
    }
}
