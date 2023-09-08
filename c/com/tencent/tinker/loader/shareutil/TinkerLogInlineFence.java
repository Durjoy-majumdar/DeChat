package com.tencent.tinker.loader.shareutil;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

final class TinkerLogInlineFence extends Handler {
    private static final String TAG = "Tinker.TinkerLogInlineFence";
    /* access modifiers changed from: private */
    public static final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static final List<Object[]> pendingLogs = new ArrayList();

    private static void dummyThrowExceptionMethod() {
        if (TinkerLogInlineFence.class.isPrimitive()) {
            throw new RuntimeException();
        }
    }

    private void handleMessageImpl(Message message) {
        ShareTinkerLog.TinkerLogImp defaultImpl = ShareTinkerLog.getDefaultImpl();
        ShareTinkerLog.TinkerLogImp impl = ShareTinkerLog.getImpl();
        int i = message.what;
        if (i == 2) {
            Object[] objArr = (Object[]) message.obj;
            if (impl != null) {
                impl.mo55595v((String) objArr[2], (String) objArr[3], (Object[]) objArr[4]);
            }
            if (impl == null || impl == defaultImpl) {
                List<Object[]> list = pendingLogs;
                synchronized (list) {
                    list.add(objArr);
                }
            }
        } else if (i == 3) {
            Object[] objArr2 = (Object[]) message.obj;
            if (impl != null) {
                impl.mo55591d((String) objArr2[2], (String) objArr2[3], (Object[]) objArr2[4]);
            }
            if (impl == null || impl == defaultImpl) {
                List<Object[]> list2 = pendingLogs;
                synchronized (list2) {
                    list2.add(objArr2);
                }
            }
        } else if (i == 4) {
            Object[] objArr3 = (Object[]) message.obj;
            if (impl != null) {
                impl.mo55593i((String) objArr3[2], (String) objArr3[3], (Object[]) objArr3[4]);
            }
            if (impl == null || impl == defaultImpl) {
                List<Object[]> list3 = pendingLogs;
                synchronized (list3) {
                    list3.add(objArr3);
                }
            }
        } else if (i == 5) {
            Object[] objArr4 = (Object[]) message.obj;
            if (impl != null) {
                impl.mo55596w((String) objArr4[2], (String) objArr4[3], (Object[]) objArr4[4]);
            }
            if (impl == null || impl == defaultImpl) {
                List<Object[]> list4 = pendingLogs;
                synchronized (list4) {
                    list4.add(objArr4);
                }
            }
        } else if (i == 6) {
            Object[] objArr5 = (Object[]) message.obj;
            if (impl != null) {
                impl.mo55592e((String) objArr5[2], (String) objArr5[3], (Object[]) objArr5[4]);
            }
            if (impl == null || impl == defaultImpl) {
                List<Object[]> list5 = pendingLogs;
                synchronized (list5) {
                    list5.add(objArr5);
                }
            }
        } else if (i == 4001) {
            Object[] objArr6 = (Object[]) message.obj;
            if (impl != null) {
                impl.printErrStackTrace((String) objArr6[2], (Throwable) objArr6[3], (String) objArr6[4], (Object[]) objArr6[5]);
            }
            if (impl == null || impl == defaultImpl) {
                List<Object[]> list6 = pendingLogs;
                synchronized (list6) {
                    list6.add(objArr6);
                }
            }
        } else if (i != 4002) {
            impl.mo55592e(TAG, "[-] Bad msg id: " + message.what, new Object[0]);
        } else {
            printPendingLogs(impl);
        }
    }

    private void handleMessage_$noinline$(Message message) {
        try {
            dummyThrowExceptionMethod();
        } finally {
            handleMessageImpl(message);
        }
    }

    private static void printPendingLogs(final ShareTinkerLog.TinkerLogImp tinkerLogImp) {
        List<Object[]> list = pendingLogs;
        synchronized (list) {
            if (tinkerLogImp != null) {
                if (!list.isEmpty()) {
                    new Thread(new Runnable() {
                        public void run() {
                            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
                            synchronized (TinkerLogInlineFence.pendingLogs) {
                                for (final Object[] objArr : TinkerLogInlineFence.pendingLogs) {
                                    TinkerLogInlineFence.mainThreadHandler.post(new Runnable() {
                                        public void run() {
                                            String str = "[PendingLog @ " + simpleDateFormat.format(new Date(((Long) objArr[1]).longValue())) + "] ";
                                            int intValue = ((Integer) objArr[0]).intValue();
                                            if (intValue == 2) {
                                                tinkerLogImp.mo55595v((String) objArr[2], str + ((String) objArr[3]), (Object[]) objArr[4]);
                                            } else if (intValue == 3) {
                                                tinkerLogImp.mo55591d((String) objArr[2], str + ((String) objArr[3]), (Object[]) objArr[4]);
                                            } else if (intValue == 4) {
                                                tinkerLogImp.mo55593i((String) objArr[2], str + ((String) objArr[3]), (Object[]) objArr[4]);
                                            } else if (intValue == 5) {
                                                tinkerLogImp.mo55596w((String) objArr[2], str + ((String) objArr[3]), (Object[]) objArr[4]);
                                            } else if (intValue == 6) {
                                                tinkerLogImp.mo55592e((String) objArr[2], str + ((String) objArr[3]), (Object[]) objArr[4]);
                                            } else if (intValue == 4001) {
                                                ShareTinkerLog.TinkerLogImp tinkerLogImp = tinkerLogImp;
                                                Object[] objArr = objArr;
                                                tinkerLogImp.printErrStackTrace((String) objArr[2], (Throwable) objArr[3], str + ((String) objArr[4]), (Object[]) objArr[5]);
                                            }
                                        }
                                    });
                                }
                                TinkerLogInlineFence.pendingLogs.clear();
                            }
                        }
                    }, "tinker_log_printer").start();
                }
            }
        }
    }

    public void handleMessage(Message message) {
        handleMessage_$noinline$(message);
    }
}
