package com.tencent.p014mm.sdk.platformtools;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.crash.CallbackForReset;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import nr3.C89062i;

/* renamed from: com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler */
public final class MMUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static MMUncaughtExceptionHandler thiz;
    private byte _hellAccFlag_;
    public IAfterReport after;
    private Map<String, IAssertFailedReporter> assertFailedReporter;
    /* access modifiers changed from: private */
    public CallbackForReset callbackReset;
    private boolean hasBeenReport;
    private List<IOnUncaughtExceptionListener> mOnUncaughtExceptionListenerList;
    private IReporter reporter;
    private Thread.UncaughtExceptionHandler ueh;

    /* renamed from: com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler$IOnUncaughtExceptionListener */
    public interface IOnUncaughtExceptionListener {
        void uncaughtException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th);
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler$IAfterReport */
    public interface IAfterReport {
        void afterReport();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler$IAssertFailedReporter */
    public interface IAssertFailedReporter {
        String getReport();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMUncaughtExceptionHandler$IReporter */
    public interface IReporter {
        void reportException(MMUncaughtExceptionHandler mMUncaughtExceptionHandler, String str, Throwable th);
    }

    private MMUncaughtExceptionHandler() {
        this.reporter = null;
        this.callbackReset = null;
        this.after = null;
        this.assertFailedReporter = new HashMap();
        this.ueh = null;
        this.hasBeenReport = false;
        this.mOnUncaughtExceptionListenerList = new LinkedList();
        this.ueh = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static synchronized void addAssertFailedReporter(String str, IAssertFailedReporter iAssertFailedReporter) {
        synchronized (MMUncaughtExceptionHandler.class) {
            if (thiz == null) {
                thiz = new MMUncaughtExceptionHandler();
            }
            thiz.assertFailedReporter.put(str, iAssertFailedReporter);
        }
    }

    public static synchronized void addOnUncaughtExceptionListener(IOnUncaughtExceptionListener iOnUncaughtExceptionListener) {
        synchronized (MMUncaughtExceptionHandler.class) {
            if (iOnUncaughtExceptionListener != null) {
                if (thiz == null) {
                    thiz = new MMUncaughtExceptionHandler();
                }
                thiz.mOnUncaughtExceptionListenerList.add(iOnUncaughtExceptionListener);
            }
        }
    }

    public static synchronized void assertTrue(String str, final String str2, boolean z) {
        synchronized (MMUncaughtExceptionHandler.class) {
            addAssertFailedReporter(str, new IAssertFailedReporter() {
                public String getReport() {
                    return "subinfo=" + str2;
                }
            });
            Assert.assertTrue(str, z);
        }
    }

    public static String getExceptionCauseString(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        while (th.getCause() != null) {
            try {
                th = th.getCause();
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        th.printStackTrace(printStream);
        return toVisualString(byteArrayOutputStream.toString());
    }

    public static synchronized void setAfterReport(IAfterReport iAfterReport) {
        synchronized (MMUncaughtExceptionHandler.class) {
            if (thiz == null) {
                thiz = new MMUncaughtExceptionHandler();
            }
            thiz.after = iAfterReport;
        }
    }

    public static synchronized void setCallbackForReset(CallbackForReset callbackForReset) {
        synchronized (MMUncaughtExceptionHandler.class) {
            if (thiz == null) {
                thiz = new MMUncaughtExceptionHandler();
            }
            thiz.callbackReset = callbackForReset;
        }
    }

    public static synchronized void setReporter(IReporter iReporter) {
        synchronized (MMUncaughtExceptionHandler.class) {
            if (thiz == null) {
                thiz = new MMUncaughtExceptionHandler();
            }
            thiz.reporter = iReporter;
        }
    }

    private static String toVisualString(String str) {
        char[] charArray;
        if (str == null || (charArray = str.toCharArray()) == null) {
            return null;
        }
        int i = 0;
        boolean z = false;
        while (i < charArray.length) {
            if (charArray[i] > 127) {
                charArray[i] = '?';
                z = true;
            }
            i++;
        }
        return z ? new String(charArray, 0, i) : str;
    }

    public String getReportByAssertPrefix(String str) {
        Iterator<Map.Entry<String, IAssertFailedReporter>> it = this.assertFailedReporter.entrySet().iterator();
        if (it == null) {
            return "";
        }
        while (it.hasNext()) {
            Map.Entry next = it.next();
            String str2 = (String) next.getKey();
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return ((IAssertFailedReporter) next.getValue()).getReport();
            }
        }
        return "";
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Throwable th4 = th;
        if (!this.hasBeenReport) {
            this.hasBeenReport = true;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                Throwable th5 = th4;
                while (th5.getCause() != null) {
                    th5 = th5.getCause();
                }
                th5.printStackTrace(printStream);
                final String visualString = toVisualString(byteArrayOutputStream.toString());
                if (!(this.callbackReset == null || visualString == null)) {
                    final C89062i iVar = new C89062i();
                    new MMHandler("close-db-while-crash").post(new Runnable() {
                        public void run() {
                            MMUncaughtExceptionHandler.this.callbackReset.callbackForReset(visualString);
                            C89062i iVar = iVar;
                            synchronized (iVar.f256713a) {
                                byte[] bArr = iVar.f256713a;
                                if (bArr[0] == 0) {
                                    bArr[0] = 1;
                                    bArr.notifyAll();
                                    Log.m105925i("MicroMsg.WxTimeoutLock", "notify done %s", iVar);
                                }
                            }
                        }
                    });
                    iVar.mo123426a(3000);
                }
                IReporter iReporter = this.reporter;
                if (!(iReporter == null || visualString == null)) {
                    iReporter.reportException(this, visualString, th4);
                    IAfterReport iAfterReport = this.after;
                    if (iAfterReport != null) {
                        iAfterReport.afterReport();
                    }
                }
                for (IOnUncaughtExceptionListener next : this.mOnUncaughtExceptionListenerList) {
                    if (next != null) {
                        try {
                            next.uncaughtException(this, visualString, th4);
                        } catch (Exception unused) {
                        }
                    }
                }
                byteArrayOutputStream.close();
            } catch (Exception unused2) {
            }
            Log.appenderClose();
            if (BuildInfo.DEBUG) {
                this.ueh.uncaughtException(thread, th4);
                return;
            }
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/MMUncaughtExceptionHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/sdk/platformtools/MMUncaughtExceptionHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mm/sdk/platformtools/MMUncaughtExceptionHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            System.exit(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(obj2, "com/tencent/mm/sdk/platformtools/MMUncaughtExceptionHandler", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }
}
