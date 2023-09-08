package p206nj;

import android.app.Activity;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p206nj.C100115c;

/* renamed from: nj.d */
public class C100118d implements C100115c.C100117b {

    /* renamed from: a */
    public Context f293269a;

    /* renamed from: b */
    public AudioManager f293270b;

    /* renamed from: c */
    public C100115c.C100116a f293271c;

    /* renamed from: d */
    public AudioManager.OnAudioFocusChangeListener f293272d = new C100119a();

    /* renamed from: nj.d$a */
    public class C100119a implements AudioManager.OnAudioFocusChangeListener {
        public C100119a() {
        }

        public void onAudioFocusChange(int i) {
            if (C100118d.this.f293271c != null) {
                Log.m105919d("MicroMsg.AudioFocusHelper", "jacks change: %d", Integer.valueOf(i));
                C100118d.this.f293271c.onChange(i);
            }
        }
    }

    public C100118d(Context context) {
        this.f293269a = context instanceof Activity ? MMApplicationContext.getContext() : context;
    }

    /* renamed from: a */
    public boolean mo139416a() {
        Context context;
        if (this.f293270b == null && (context = this.f293269a) != null) {
            this.f293270b = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this.f293270b;
        return audioManager != null && 1 == audioManager.abandonAudioFocus(this.f293272d);
    }

    /* renamed from: b */
    public int mo139417b() {
        Context context;
        if (this.f293270b == null && (context = this.f293269a) != null) {
            this.f293270b = (AudioManager) context.getSystemService("audio");
        }
        if (Build.VERSION.SDK_INT < 26) {
            return this.f293270b.requestAudioFocus(this.f293272d, 3, 1);
        }
        return this.f293270b.requestAudioFocus(new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.f293272d).build());
    }

    /* renamed from: c */
    public boolean mo139418c() {
        Context context;
        if (this.f293270b == null && (context = this.f293269a) != null) {
            this.f293270b = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this.f293270b;
        boolean z = audioManager != null && 1 == audioManager.requestAudioFocus(this.f293272d, 3, 2);
        Log.printInfoStack("MicroMsg.AudioFocusHelper", "jacks requestFocus: %B, %x", Boolean.valueOf(z), Integer.valueOf(this.f293272d.hashCode()));
        return z;
    }
}
