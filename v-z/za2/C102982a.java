package za2;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import la2.C99364n;

/* renamed from: za2.a */
public class C102982a {

    /* renamed from: a */
    public AudioManager f303912a = ((AudioManager) MMApplicationContext.getContext().getSystemService("audio"));

    /* renamed from: b */
    public AudioManager.OnAudioFocusChangeListener f303913b = new C102983a();

    /* renamed from: za2.a$a */
    public class C102983a implements AudioManager.OnAudioFocusChangeListener {
        public C102983a() {
        }

        public void onAudioFocusChange(int i) {
            Log.m105925i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", Integer.valueOf(i));
            if (i == -2 || i == -3) {
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
                if (C99364n.m129616h().mo138822a().mo32211k()) {
                    C99364n.m129616h().mo138822a().mo32196i();
                }
            } else if (i == 1 || i == 2 || i == 3) {
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
                if (C99364n.m129616h().mo138822a().mo32211k()) {
                    C99364n.m129616h().mo138822a().mo32209h(false);
                }
            } else if (i == -1) {
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
                if (C99364n.m129616h().mo138822a().mo32211k()) {
                    C99364n.m129616h().mo138822a().mo32196i();
                    C99364n.m129616h().mo138825d();
                    C99364n.m129616h().mo138836q(600000);
                }
                C102982a aVar = C102982a.this;
                AudioManager audioManager = aVar.f303912a;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(aVar.f303913b);
                }
            }
        }
    }
}
