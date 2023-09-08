package fu3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicBoolean;
import mu3.C109639a;
import zt3.C119146d;

/* renamed from: fu3.b */
public final class C116902b implements C116901a {

    /* renamed from: a */
    public final Handler f350320a;

    /* renamed from: b */
    public AtomicBoolean f350321b = new AtomicBoolean();

    public C116902b(Handler handler) {
        this.f350320a = handler;
    }

    public void dispatchMessage(Message message) {
        this.f350320a.dispatchMessage(message);
    }

    public void dump(Printer printer, String str) {
        this.f350320a.dump(printer, str);
    }

    public boolean executeOrSendMessage(Message message) {
        if (isQuit()) {
            return false;
        }
        if (getLooper() != Looper.myLooper()) {
            return sendMessage(message);
        }
        this.f350320a.dispatchMessage(message);
        return true;
    }

    public Looper getLooper() {
        return this.f350320a.getLooper();
    }

    public String getMessageName(Message message) {
        return this.f350320a.getMessageName(message);
    }

    public Handler getSelf() {
        return this.f350320a;
    }

    public C109639a getSerial() {
        return null;
    }

    public String getSerialTag() {
        return null;
    }

    public boolean hasMessages(int i) {
        return this.f350320a.hasMessages(i);
    }

    public boolean isQuit() {
        return this.f350321b.get();
    }

    public Message obtainMessage() {
        return this.f350320a.obtainMessage();
    }

    public boolean post(Runnable runnable) {
        return this.f350320a.post(runnable);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f350320a.postAtFrontOfQueue(runnable);
    }

    public boolean postAtTime(Runnable runnable, long j) {
        return this.f350320a.postAtTime(runnable, j);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return this.f350320a.postDelayed(runnable, j);
    }

    public boolean quit() {
        if (!this.f350321b.compareAndSet(false, true)) {
            return false;
        }
        removeCallbacksAndMessages((Object) null);
        if (getLooper() != null) {
            C119146d.f356851c.mo125766w("WrapperHandler", "Do you want to quit this looper thread? You'd better get this Looper to quit.", new Object[0]);
        }
        return true;
    }

    public void removeCallbacks(Runnable runnable) {
        this.f350320a.removeCallbacks(runnable);
    }

    public void removeCallbacksAndMessages(Object obj) {
        this.f350320a.removeCallbacksAndMessages(obj);
    }

    public void removeMessages(int i) {
        this.f350320a.removeMessages(i);
    }

    public boolean sendEmptyMessage(int i) {
        return this.f350320a.sendEmptyMessage(i);
    }

    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.f350320a.sendEmptyMessageAtTime(i, j);
    }

    public boolean sendEmptyMessageDelayed(int i, long j) {
        return this.f350320a.sendEmptyMessageDelayed(i, j);
    }

    public boolean sendMessage(Message message) {
        return this.f350320a.sendMessage(message);
    }

    public boolean sendMessageAtFrontOfQueue(Message message) {
        return this.f350320a.sendMessageAtFrontOfQueue(message);
    }

    public boolean sendMessageAtTime(Message message, long j) {
        if (isQuit()) {
            return false;
        }
        return this.f350320a.sendMessageAtTime(message, j);
    }

    public boolean sendMessageDelayed(Message message, long j) {
        return this.f350320a.sendMessageDelayed(message, j);
    }

    public String toString() {
        return this.f350320a.toString();
    }

    public boolean hasMessages(int i, Object obj) {
        return this.f350320a.hasMessages(i, obj);
    }

    public Message obtainMessage(int i) {
        return this.f350320a.obtainMessage(i);
    }

    public boolean postAtTime(Runnable runnable, Object obj, long j) {
        return this.f350320a.postAtTime(runnable, obj, j);
    }

    public boolean postDelayed(Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f350320a.postDelayed(runnable, obj, j);
        }
        throw new RuntimeException("Call requires API level 28 (current min is 19): android.os.Handler#postDelayed");
    }

    public void removeCallbacks(Runnable runnable, Object obj) {
        this.f350320a.removeCallbacks(runnable, obj);
    }

    public void removeMessages(int i, Object obj) {
        this.f350320a.removeMessages(i, obj);
    }

    public Message obtainMessage(int i, Object obj) {
        return this.f350320a.obtainMessage(i, obj);
    }

    public Message obtainMessage(int i, int i2, int i3) {
        return this.f350320a.obtainMessage(i, i2, i3);
    }

    public Message obtainMessage(int i, int i2, int i3, Object obj) {
        return this.f350320a.obtainMessage(i, i2, i3, obj);
    }
}
