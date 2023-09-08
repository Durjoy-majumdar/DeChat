package com.tencent.p014mm.plugin.rubbishbin;

import a70.C79471a;
import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import j20.C117292a;
import java.util.Locale;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.rubbishbin.JNIExceptionHandlerImpl */
public class JNIExceptionHandlerImpl extends JNIExceptionHandler {
    private static final String REPORT_TAG = "RubbishBinProgramException";
    public static final String TAG = "JNIException";
    private byte _hellAccFlag_;
    private Context context;
    private String reportExecutionTag;

    public JNIExceptionHandlerImpl(Context context2, String str) {
        this.context = context2;
        this.reportExecutionTag = str;
    }

    public static void initJNIExceptionHandler(Context context2, String str) {
        JNIExceptionHandler.INSTANCE = new JNIExceptionHandlerImpl(context2, str);
    }

    public void onException(int i, String str) {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : allStackTraces.entrySet()) {
            if (((Thread) next.getKey()).getName().equals(this.reportExecutionTag)) {
                sb.append("Java stack trace:\n");
                for (StackTraceElement stackTraceElement : (StackTraceElement[]) next.getValue()) {
                    if (!stackTraceElement.isNativeMethod()) {
                        sb.append(String.format(Locale.ENGLISH, "at %s.%s(%s:%d)\n", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
                    } else {
                        sb.append(String.format(Locale.ENGLISH, "at %s.%s(%s:%d)(Native Call)\n", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
                    }
                }
            }
        }
        String str2 = sb.toString() + "Signal:" + i + ",Native trace\n" + str;
        int length = (str2.length() / 512) + 1;
        long nanoTime = System.nanoTime();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = i3 * 512;
            C115669n.INSTANCE.mo160140o(17910, true, true, C79471a.f233015c, BuildInfo.CLIENT_VERSION, this.reportExecutionTag, 0, i4 < str2.length() ? str2.substring(i2 * 512, i4) : str2.substring(i2 * 512), 1, Integer.valueOf(i3), Integer.valueOf(length), Long.valueOf(nanoTime));
            i2 = i3;
        }
        Context context2 = this.context;
        if (context2 instanceof RubbishBinService) {
            ((RubbishBinService) context2).f248882e.interrupt();
            ((RubbishBinService) this.context).stopSelf();
        }
        try {
            int i5 = ((RubbishBinService) this.context).f248884g;
            if (i5 > 0) {
                Thread.sleep((long) i5);
            }
        } catch (Exception unused) {
        }
        if (str2.contains("pthread_exit")) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/rubbishbin/JNIExceptionHandlerImpl", "onException", "(ILjava/lang/String;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            System.exit(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/rubbishbin/JNIExceptionHandlerImpl", "onException", "(ILjava/lang/String;)V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    }

    public void setReportExecutionTag(String str) {
        this.reportExecutionTag = str;
    }
}
