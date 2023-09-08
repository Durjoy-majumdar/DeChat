package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p379r3.C101337b;
import p379r3.C22198a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.j2 */
public final class C29523j2 extends C29527l2 {

    /* renamed from: g */
    public final String f80404g = ("MicroMsg.WxaAudioFocusService#" + hashCode());

    /* renamed from: h */
    public final C13601g f80405h;

    /* renamed from: i */
    public final C13601g f80406i;

    /* renamed from: j */
    public final C13601g f80407j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.j2$b */
    public static final class C17905b extends C87413o implements C32224a<C22198a> {

        /* renamed from: d */
        public final /* synthetic */ C29523j2 f49383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17905b(C29523j2 j2Var) {
            super(0);
            this.f49383d = j2Var;
        }

        public Object invoke() {
            int i = C22198a.f62835g;
            int i2 = AudioAttributesCompat.f306545b;
            AudioAttributesImplApi21.C16599a aVar = Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.C16600a() : new AudioAttributesImplApi21.C16599a();
            aVar.mo16918a(1);
            aVar.f44664a.setLegacyStreamType(3);
            AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat(aVar.build());
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) ((C36570n) this.f49383d.f80406i).getValue();
            Handler handler = new Handler(Looper.getMainLooper());
            if (onAudioFocusChangeListener != null) {
                return new C22198a(2, onAudioFocusChangeListener, handler, audioAttributesCompat, false);
            }
            throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.j2$a */
    public static final class C29524a extends C87413o implements C32224a<AudioManager> {

        /* renamed from: d */
        public final /* synthetic */ Context f80408d;

        /* renamed from: e */
        public final /* synthetic */ C29523j2 f80409e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29524a(Context context, C29523j2 j2Var) {
            super(0);
            this.f80408d = context;
            this.f80409e = j2Var;
        }

        public Object invoke() {
            Object systemService = this.f80408d.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            C29523j2 j2Var = this.f80409e;
            if (audioManager == null) {
                Log.m105920e(j2Var.f80404g, "audioManager is null");
            }
            return audioManager;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.j2$c */
    public static final class C29525c extends C87413o implements C32224a<AudioManager.OnAudioFocusChangeListener> {

        /* renamed from: d */
        public final /* synthetic */ C29523j2 f80410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29525c(C29523j2 j2Var) {
            super(0);
            this.f80410d = j2Var;
        }

        public Object invoke() {
            return new C29526k2(this.f80410d);
        }
    }

    public C29523j2(Context context) {
        C87412m.m108594g(context, "context");
        this.f80405h = C36568h.m40985a(new C29524a(context, this));
        this.f80406i = C36568h.m40985a(new C29525c(this));
        this.f80407j = C36568h.m40985a(new C17905b(this));
    }

    /* renamed from: c */
    public boolean mo56764c() {
        if (((AudioManager) ((C36570n) this.f80405h).getValue()) == null) {
            return false;
        }
        AudioManager audioManager = (AudioManager) ((C36570n) this.f80405h).getValue();
        C87412m.m108591d(audioManager);
        return 1 == C101337b.m132965a(audioManager, (C22198a) ((C36570n) this.f80407j).getValue());
    }

    /* renamed from: e */
    public String mo56765e() {
        return this.f80404g;
    }

    /* renamed from: q */
    public boolean mo56766q() {
        if (((AudioManager) ((C36570n) this.f80405h).getValue()) == null) {
            return false;
        }
        AudioManager audioManager = (AudioManager) ((C36570n) this.f80405h).getValue();
        C87412m.m108591d(audioManager);
        return 1 == C101337b.m132966b(audioManager, (C22198a) ((C36570n) this.f80407j).getValue());
    }
}
