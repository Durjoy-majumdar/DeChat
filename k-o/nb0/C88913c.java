package nb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C20557b;
import p1055vh.C90804a;

/* renamed from: nb0.c */
public final class C88913c {
    /* renamed from: a */
    public static String m111003a(String str, String str2) {
        Log.m105925i("MicroMsg.AudioPlayerHelper", "createAudioPlayer, appId:%s, audioId:%s", str, str2);
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 10;
        aVar2.f260752c = str;
        aVar2.f260751b = str2;
        C20557b.m22327a(aVar);
        return aVar.f260748a.f260751b;
    }

    /* renamed from: b */
    public static boolean m111004b(String str) {
        Log.m105925i("MicroMsg.AudioPlayerHelper", "destroyAudio, audioId:%s", str);
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 5;
        aVar2.f260751b = str;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260756a;
    }

    /* renamed from: c */
    public static C88912b m111005c(String str) {
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 16;
        aVar2.f260751b = str;
        C20557b.m22327a(aVar);
        return aVar.f260748a.f260754e;
    }

    /* renamed from: d */
    public static C88914d m111006d(String str) {
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 6;
        aVar2.f260751b = str;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260757b;
    }

    /* renamed from: e */
    public static boolean m111007e(String str) {
        Log.m105919d("MicroMsg.AudioPlayerHelper", "pauseAudio, audioId:%s", str);
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 2;
        aVar2.f260751b = str;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260756a;
    }

    /* renamed from: f */
    public static boolean m111008f(String str, C88912b bVar) {
        Log.m105919d("MicroMsg.AudioPlayerHelper", "resumeAudio, audioId:%s", str);
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 1;
        aVar2.f260751b = str;
        aVar2.f260754e = bVar;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260756a;
    }

    /* renamed from: g */
    public static boolean m111009g(String str, int i) {
        Log.m105925i("MicroMsg.AudioPlayerHelper", "seekToAudio, audioId:%s, currentTime:%d", str, Integer.valueOf(i));
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 4;
        aVar2.f260751b = str;
        aVar2.f260753d = i;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260756a;
    }

    /* renamed from: h */
    public static boolean m111010h(C88912b bVar) {
        Log.m105919d("MicroMsg.AudioPlayerHelper", "startAudio, audioId:%s", bVar.f256416a);
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 0;
        aVar2.f260751b = bVar.f256416a;
        aVar2.f260754e = bVar;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260756a;
    }

    /* renamed from: i */
    public static boolean m111011i(String str) {
        Log.m105925i("MicroMsg.AudioPlayerHelper", "stopAudio, audioId:%s", str);
        C90804a aVar = new C90804a();
        C90804a.C90805a aVar2 = aVar.f260748a;
        aVar2.f260750a = 3;
        aVar2.f260751b = str;
        C20557b.m22327a(aVar);
        return aVar.f260749b.f260756a;
    }
}
