package ga2;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: ga2.a */
public class C20826a {

    /* renamed from: a */
    public AudioManager f58832a = ((AudioManager) MMApplicationContext.getContext().getSystemService("audio"));

    /* renamed from: b */
    public boolean f58833b = false;

    /* renamed from: c */
    public AudioManager.OnAudioFocusChangeListener f58834c = new C20827a();

    /* renamed from: ga2.a$a */
    public class C20827a implements AudioManager.OnAudioFocusChangeListener {
        public C20827a() {
        }

        public void onAudioFocusChange(int i) {
            Log.m105925i("MicroMsg.Music.MusicAudioFocusHelper", "focus change %d", Integer.valueOf(i));
            if (i == -2 || i == -3) {
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus lossTransient");
            } else if (i == 1 || i == 2 || i == 3) {
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus gain");
            } else if (i == -1) {
                Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "audio focus loss, passive pause");
                C20826a aVar = C20826a.this;
                AudioManager audioManager = aVar.f58832a;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(aVar.f58834c);
                }
                C20826a.this.f58833b = false;
            }
        }
    }
}
