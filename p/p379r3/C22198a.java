package p379r3;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import java.util.Objects;

/* renamed from: r3.a */
public class C22198a {

    /* renamed from: g */
    public static final /* synthetic */ int f62835g = 0;

    /* renamed from: a */
    public final int f62836a;

    /* renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f62837b;

    /* renamed from: c */
    public final Handler f62838c;

    /* renamed from: d */
    public final AudioAttributesCompat f62839d;

    /* renamed from: e */
    public final boolean f62840e;

    /* renamed from: f */
    public final Object f62841f;

    /* renamed from: r3.a$b */
    public static class C22199b implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* renamed from: d */
        public final Handler f62842d;

        /* renamed from: e */
        public final AudioManager.OnAudioFocusChangeListener f62843e;

        public C22199b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f62843e = onAudioFocusChangeListener;
            this.f62842d = new Handler(handler.getLooper(), this);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f62843e.onAudioFocusChange(message.arg1);
            return true;
        }

        public void onAudioFocusChange(int i) {
            Handler handler = this.f62842d;
            handler.sendMessage(Message.obtain(handler, 2782386, i, 0));
        }
    }

    /* renamed from: r3.a$a */
    public static class C22200a {
        /* renamed from: a */
        public static AudioFocusRequest m25663a(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    static {
        int i = AudioAttributesCompat.f306545b;
        AudioAttributesImpl.C16598a aVar = Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.C16600a() : new AudioAttributesImplApi21.C16599a();
        aVar.mo16918a(1);
        new AudioAttributesCompat(aVar.build());
    }

    public C22198a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.f62836a = i;
        this.f62838c = handler;
        this.f62839d = audioAttributesCompat;
        this.f62840e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f62837b = onAudioFocusChangeListener;
        } else {
            this.f62837b = new C22199b(onAudioFocusChangeListener, handler);
        }
        AudioAttributes audioAttributes = null;
        if (i2 >= 26) {
            this.f62841f = C22200a.m25663a(i, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f306546a.mo16917b() : audioAttributes, z, this.f62837b, handler);
        } else {
            this.f62841f = null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22198a)) {
            return false;
        }
        C22198a aVar = (C22198a) obj;
        return this.f62836a == aVar.f62836a && this.f62840e == aVar.f62840e && Objects.equals(this.f62837b, aVar.f62837b) && Objects.equals(this.f62838c, aVar.f62838c) && Objects.equals(this.f62839d, aVar.f62839d);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f62836a), this.f62837b, this.f62838c, this.f62839d, Boolean.valueOf(this.f62840e)});
    }
}
