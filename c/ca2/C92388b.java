package ca2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.music.model.player.WechatMusicLoadLibrary;
import com.tencent.p014mm.plugin.music.player.base.AudioPlayerUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ea2.C97612f;
import ei3.C86522b;
import f81.C7998c;
import fa2.C20698b;
import fa2.C20705c;
import ha2.C98327c;
import la2.C109332o;
import la2.C99356c;
import na2.C100110e;
import ua2.C101991b;

@C86522b(dependencies = {C7998c.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI})
/* renamed from: ca2.b */
public class C92388b extends C86301e {
    public void onCreate(Context context) {
        Context context2 = MMApplicationContext.getContext();
        synchronized (C101991b.class) {
            if (C101991b.f300315c == null) {
                Log.m105924i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                C101991b.f300315c = new C101991b(context2);
            }
        }
        C101991b.m134283a(C98327c.class, new C100110e());
        C101991b.m134283a(C20705c.class, new C20698b());
        C101991b.m134283a(C99356c.class, new C109332o());
        synchronized (C97612f.class) {
            if (C97612f.f286370a == null) {
                Log.m105924i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                C97612f.f286370a = new C97612f();
            }
        }
        AudioPlayerUtils.f53178a = new WechatMusicLoadLibrary();
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("MicroMsg.Music.PluginMusic", "PluginMusic configure SubCoreMusic");
        }
    }
}
