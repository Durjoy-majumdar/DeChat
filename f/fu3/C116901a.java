package fu3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import mu3.C109639a;

/* renamed from: fu3.a */
public interface C116901a {
    void dispatchMessage(Message message);

    void dump(Printer printer, String str);

    boolean executeOrSendMessage(Message message);

    Looper getLooper();

    String getMessageName(Message message);

    Handler getSelf();

    C109639a getSerial();

    String getSerialTag();

    boolean hasMessages(int i);

    boolean hasMessages(int i, Object obj);

    boolean isQuit();

    Message obtainMessage();

    Message obtainMessage(int i);

    Message obtainMessage(int i, int i2, int i3);

    Message obtainMessage(int i, int i2, int i3, Object obj);

    Message obtainMessage(int i, Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postAtTime(Runnable runnable, long j);

    boolean postAtTime(Runnable runnable, Object obj, long j);

    boolean postDelayed(Runnable runnable, long j);

    boolean postDelayed(Runnable runnable, Object obj, long j);

    boolean quit();

    void removeCallbacks(Runnable runnable);

    void removeCallbacks(Runnable runnable, Object obj);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i);

    void removeMessages(int i, Object obj);

    boolean sendEmptyMessage(int i);

    boolean sendEmptyMessageAtTime(int i, long j);

    boolean sendEmptyMessageDelayed(int i, long j);

    boolean sendMessage(Message message);

    boolean sendMessageAtFrontOfQueue(Message message);

    boolean sendMessageAtTime(Message message, long j);

    boolean sendMessageDelayed(Message message, long j);
}
