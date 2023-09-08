package com.tencent.xweb.file;

public class XFileManager {
    private static IFileProvider sGlobalProvider;

    public static synchronized IFileProvider getProvider() {
        synchronized (XFileManager.class) {
            IFileProvider iFileProvider = sGlobalProvider;
            if (iFileProvider != null) {
                return iFileProvider;
            }
            DefaultFileProvider defaultFileProvider = new DefaultFileProvider();
            return defaultFileProvider;
        }
    }

    public static synchronized void setProvider(IFileProvider iFileProvider) {
        synchronized (XFileManager.class) {
            sGlobalProvider = iFileProvider;
        }
    }
}
