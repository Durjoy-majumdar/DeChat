package com.tencent.tinker.loader.app;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;

public final class TinkerInlineFenceAction {
    public static final int ACTION_GET_ASSETS = 9;
    public static final int ACTION_GET_BASE_CONTEXT = 8;
    public static final int ACTION_GET_CLASSLOADER = 7;
    public static final int ACTION_GET_RESOURCES = 10;
    public static final int ACTION_GET_SYSTEM_SERVICE = 11;
    public static final int ACTION_MZ_NIGHTMODE_USE_OF = 12;
    public static final int ACTION_ON_BASE_CONTEXT_ATTACHED = 1;
    public static final int ACTION_ON_CONFIGURATION_CHANGED = 3;
    public static final int ACTION_ON_CREATE = 2;
    public static final int ACTION_ON_LOW_MEMORY = 5;
    public static final int ACTION_ON_TERMINATE = 6;
    public static final int ACTION_ON_TRIM_MEMORY = 4;

    public static AssetManager callGetAssets(Handler handler, AssetManager assetManager) {
        Message message;
        try {
            message = Message.obtain(handler, 9, assetManager);
            try {
                handler.handleMessage(message);
                AssetManager assetManager2 = (AssetManager) message.obj;
                message.recycle();
                return assetManager2;
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static Context callGetBaseContext(Handler handler, Context context) {
        Message message;
        try {
            message = Message.obtain(handler, 8, context);
            try {
                handler.handleMessage(message);
                Context context2 = (Context) message.obj;
                message.recycle();
                return context2;
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static ClassLoader callGetClassLoader(Handler handler, ClassLoader classLoader) {
        Message message;
        try {
            message = Message.obtain(handler, 7, classLoader);
            try {
                handler.handleMessage(message);
                ClassLoader classLoader2 = (ClassLoader) message.obj;
                message.recycle();
                return classLoader2;
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static Resources callGetResources(Handler handler, Resources resources) {
        Message message;
        try {
            message = Message.obtain(handler, 10, resources);
            try {
                handler.handleMessage(message);
                Resources resources2 = (Resources) message.obj;
                message.recycle();
                return resources2;
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static Object callGetSystemService(Handler handler, String str, Object obj) {
        Message message = null;
        try {
            message = Message.obtain(handler, 11, new Object[]{str, obj});
            handler.handleMessage(message);
            return message.obj;
        } finally {
            message.recycle();
        }
    }

    public static int callMZNightModeUseOf(Handler handler) {
        Message message;
        try {
            message = Message.obtain(handler, 12);
            try {
                handler.handleMessage(message);
                int intValue = ((Integer) message.obj).intValue();
                message.recycle();
                return intValue;
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static void callOnBaseContextAttached(Handler handler, Context context) {
        Message message;
        try {
            message = Message.obtain(handler, 1, context);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static void callOnConfigurationChanged(Handler handler, Configuration configuration) {
        Message message;
        try {
            message = Message.obtain(handler, 3, configuration);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static void callOnCreate(Handler handler) {
        Message message;
        try {
            message = Message.obtain(handler, 2);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static void callOnLowMemory(Handler handler) {
        Message message;
        try {
            message = Message.obtain(handler, 5);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static void callOnTerminate(Handler handler) {
        Message message;
        try {
            message = Message.obtain(handler, 6);
            try {
                handler.handleMessage(message);
                message.recycle();
            } catch (Throwable th) {
                th = th;
                message.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            message = null;
            message.recycle();
            throw th;
        }
    }

    public static void callOnTrimMemory(Handler handler, int i) {
        Message message = null;
        try {
            message = Message.obtain(handler, 4, Integer.valueOf(i));
            handler.handleMessage(message);
        } finally {
            message.recycle();
        }
    }
}
