package jh2;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import c03.C54600b;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import d03.C58010a;
import di3.C86312j;
import e03.C20502f;
import e03.C20505i;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jp3.C9486a;
import jp3.C9487b;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p294b7.C16739c;
import p300c8.C79946g;
import p300c8.C79954q;
import p300c8.C79957s;
import p300c8.C79967x;
import p328cz.C20373i;
import p370p7.C21941l;
import p370p7.C21949o;
import p663qo.C101213l;
import rx3.C13598b0;

/* renamed from: jh2.m */
public final class C60863m {

    /* renamed from: b */
    public static final C60868a f173403b = new C60868a((C8480h) null);

    /* renamed from: c */
    public static final C60863m f173404c = new C60863m();

    /* renamed from: a */
    public final Map<Integer, C60858c> f173405a = Collections.synchronizedMap(new HashMap());

    /* renamed from: jh2.m$b */
    public static final class C60864b implements C20502f {

        /* renamed from: a */
        public final /* synthetic */ C98127h f173406a;

        public C60864b(C98127h hVar) {
            this.f173406a = hVar;
        }

        /* renamed from: a */
        public C98127h mo32064a(String str) {
            C87412m.m108594g(str, "id");
            return this.f173406a;
        }
    }

    /* renamed from: jh2.m$c */
    public static final class C60865c implements C20505i {

        /* renamed from: a */
        public final /* synthetic */ C60863m f173407a;

        /* renamed from: b */
        public final /* synthetic */ String f173408b;

        /* renamed from: c */
        public final /* synthetic */ C58010a f173409c;

        /* renamed from: d */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f173410d;

        public C60865c(C60863m mVar, String str, C58010a aVar, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
            this.f173407a = mVar;
            this.f173408b = str;
            this.f173409c = aVar;
            this.f173410d = pVar;
        }

        /* renamed from: a */
        public void mo32067a(int i, C98127h hVar) {
            if (i == 0) {
                String unused = this.f173407a.getClass();
                Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] start stream download ringtone success, mediaId:" + this.f173408b + ", path:" + this.f173409c.f165948t);
            } else if (i != 1) {
                String unused2 = this.f173407a.getClass();
                Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] start cacheAudio onStart " + this.f173408b + " fail: " + i);
                C32227p<Boolean, String, C13598b0> pVar = this.f173410d;
                if (pVar != null) {
                    pVar.invoke(Boolean.FALSE, null);
                }
            } else {
                String unused3 = this.f173407a.getClass();
                Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] start stream download ringtone success, hit cache, mediaId:" + this.f173408b + ", path:" + this.f173409c.f165948t);
                C32227p<Boolean, String, C13598b0> pVar2 = this.f173410d;
                if (pVar2 != null) {
                    pVar2.invoke(Boolean.TRUE, this.f173409c.f165948t);
                }
            }
        }

        /* renamed from: b */
        public void mo32068b(int i, C98127h hVar, C98121d dVar) {
            String unused = this.f173407a.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("[cacheAudio] onStop, mediaId:");
            sb.append(this.f173408b);
            sb.append(", ret:");
            sb.append(i);
            sb.append(", sceneResult:");
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            Log.m105924i("MicroMsg.StoryAudioManager", sb.toString());
            C32227p<Boolean, String, C13598b0> pVar = this.f173410d;
            if (pVar != null) {
                pVar.invoke(Boolean.FALSE, null);
            }
        }
    }

    /* renamed from: jh2.m$d */
    public static final class C60866d implements C98127h.C98128a {

        /* renamed from: d */
        public final /* synthetic */ C60863m f173411d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f173412e;

        /* renamed from: f */
        public final /* synthetic */ C58010a f173413f;

        public C60866d(C60863m mVar, C32227p<? super Boolean, ? super String, C13598b0> pVar, C58010a aVar) {
            this.f173411d = mVar;
            this.f173412e = pVar;
            this.f173413f = aVar;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            String unused = this.f173411d.getClass();
            Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] onProgress, mediaId:" + str + ", offset:" + j + ", total:" + j2);
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            String unused = this.f173411d.getClass();
            Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] onFinish, mediaId:" + str + ", ret:" + i);
            C32227p<Boolean, String, C13598b0> pVar = this.f173412e;
            if (pVar != null) {
                pVar.invoke(Boolean.valueOf(i == 0), this.f173413f.f165948t);
            }
        }

        public void onDataAvailable(String str, long j, long j2) {
            String unused = this.f173411d.getClass();
            Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] onDataAvailable, mediaId:" + str + ", offset:" + j + ", length:" + j2);
        }

        public void onM3U8Ready(String str, String str2) {
            String unused = this.f173411d.getClass();
            Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] onM3U8Ready, mediaId:" + str);
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            C87412m.m108594g(videoInfo, "info");
            String unused = this.f173411d.getClass();
            Log.m105924i("MicroMsg.StoryAudioManager", "[cacheAudio] onMoovReady, mediaId:" + str + ", offset:" + j + ", length:" + j2);
        }
    }

    /* renamed from: jh2.m$e */
    public static final class C60867e extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60863m f173414d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f173415e;

        /* renamed from: f */
        public final /* synthetic */ AudioCacheInfo f173416f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60867e(C60863m mVar, C32227p<? super Boolean, ? super String, C13598b0> pVar, AudioCacheInfo audioCacheInfo) {
            super(2);
            this.f173414d = mVar;
            this.f173415e = pVar;
            this.f173416f = audioCacheInfo;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            String unused = this.f173414d.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("cacheAudio callback ");
            sb.append(booleanValue);
            sb.append(", ");
            sb.append(this.f173415e == null);
            Log.m105924i("MicroMsg.StoryAudioManager", sb.toString());
            this.f173414d.f173405a.remove(Integer.valueOf(this.f173416f.f163813e));
            C32227p<Boolean, String, C13598b0> pVar = this.f173415e;
            if (pVar != null) {
                pVar.invoke(Boolean.valueOf(booleanValue), str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jh2.m$a */
    public static final class C60868a {
        public C60868a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C21949o mo85773a(AudioCacheInfo audioCacheInfo, String str) {
            C87412m.m108594g(audioCacheInfo, "cacheInfo");
            C87412m.m108594g(str, "userAgent");
            return audioCacheInfo.f163818j ? new C21941l(Uri.parse(C86013q1.m106448i(audioCacheInfo.f163817i, false)), new C79957s(), new C16739c(), (Handler) null, (C21941l.C21942a) null) : new C21941l(Uri.parse(audioCacheInfo.f163814f), new C79954q(str, (C79967x<? super C79946g>) null), new C16739c(), (Handler) null, (C21941l.C21942a) null);
        }
    }

    /* renamed from: b */
    public final void mo85768b(Context context, AudioCacheInfo audioCacheInfo, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(audioCacheInfo, "info");
        StringBuilder sb = new StringBuilder();
        sb.append("cacheAudio: ");
        sb.append(context);
        sb.append(", ");
        sb.append(pVar == null);
        Log.m105924i("MicroMsg.StoryAudioManager", sb.toString());
        if (context instanceof MMFragmentActivity) {
            mo85771e((C9487b) context, audioCacheInfo, pVar);
            return;
        }
        Log.m105928w("MicroMsg.StoryAudioManager", "context is not LifeCycle: " + context);
        mo85771e((C9487b<C9486a>) null, audioCacheInfo, pVar);
    }

    /* renamed from: c */
    public final void mo85769c(AudioCacheInfo audioCacheInfo, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        C87412m.m108594g(audioCacheInfo, "info");
        mo85771e((C9487b<C9486a>) null, audioCacheInfo, pVar);
    }

    /* renamed from: d */
    public final void mo85770d(C58010a aVar, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        C58010a aVar2 = aVar;
        C32227p<? super Boolean, ? super String, C13598b0> pVar2 = pVar;
        C87412m.m108594g(aVar2, "mediaInfo");
        String str = "ringtone_" + aVar2.f165947s;
        Log.m105924i("MicroMsg.StoryAudioManager", "start cacheAudio, mediaId mapping:" + aVar2.f165947s + " => " + str + ", videoFlag:" + aVar2.f165946r);
        C54600b bVar = C54600b.f153106a;
        C60866d dVar = new C60866d(this, pVar2, aVar2);
        String str2 = str == null ? aVar2.f165947s : str;
        String str3 = str2 == null ? "" : str2;
        String str4 = aVar2.f165949u;
        String str5 = str4 == null ? "" : str4;
        String str6 = aVar2.f165948t;
        String str7 = str6 == null ? "" : str6;
        int i = aVar2.f165929a;
        String str8 = aVar2.f165930b;
        if (str8 == null) {
            str8 = "xV2";
        }
        String str9 = str8;
        String str10 = aVar2.f165931c;
        String str11 = str10 == null ? "" : str10;
        String str12 = aVar2.f165932d;
        String str13 = str12 == null ? "" : str12;
        String str14 = aVar2.f165946r;
        C98127h b = bVar.mo75507b(str3, str5, str7, i, str9, str11, str13, str14 == null ? "" : str14, dVar, "MicroMsg.StoryAudioManager");
        b.f287654K = 0;
        b.f287689V = 0;
        ((C20373i) C86312j.m106911c(C20373i.class)).xx0().mo32061i(str, new C60864b(b), new C60865c(this, str, aVar2, pVar2));
    }

    /* renamed from: e */
    public final void mo85771e(C9487b<C9486a> bVar, AudioCacheInfo audioCacheInfo, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        C87412m.m108594g(audioCacheInfo, "info");
        Log.m105924i("MicroMsg.StoryAudioManager", "cache audio " + audioCacheInfo.f163813e);
        if (audioCacheInfo.f163826u.length() == 0) {
            C60858c cVar = this.f173405a.get(Integer.valueOf(audioCacheInfo.f163813e));
            if (cVar == null) {
                if (!C86013q1.m106450k(audioCacheInfo.f163817i)) {
                    C60858c cVar2 = new C60858c(bVar, audioCacheInfo);
                    cVar2.f173398i.add(new C60867e(this, pVar, audioCacheInfo));
                    if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(cVar2.f173396g)) {
                        cVar2.mo85767a(false, (String) null);
                    } else {
                        C9487b<C9486a> bVar2 = cVar2.f173393d;
                        if (bVar2 != null) {
                            bVar2.keep(cVar2);
                        }
                    }
                    Map<Integer, C60858c> map = this.f173405a;
                    C87412m.m108593f(map, "audioTaskMap");
                    map.put(Integer.valueOf(audioCacheInfo.f163813e), cVar2);
                    return;
                }
                Log.m105924i("MicroMsg.StoryAudioManager", "cacheAudio is exist " + audioCacheInfo.f163817i);
                if (pVar != null) {
                    pVar.invoke(Boolean.TRUE, audioCacheInfo.f163817i);
                }
            } else if (pVar != null) {
                cVar.f173398i.add(pVar);
            }
        } else if (!C86013q1.m106450k(audioCacheInfo.f163817i) || C86013q1.m106451l(audioCacheInfo.f163817i) <= 0 || !audioCacheInfo.f163818j) {
            Log.m105924i("MicroMsg.StoryAudioManager", "info is not cached, start download");
            String str = audioCacheInfo.f163814f;
            C87412m.m108591d(str);
            String valueOf = String.valueOf(audioCacheInfo.f163813e);
            String str2 = audioCacheInfo.f163817i;
            C87412m.m108591d(str2);
            C58010a aVar = new C58010a(valueOf, str2, str, 0, 0);
            aVar.f165932d = audioCacheInfo.f163826u;
            if (audioCacheInfo.f163831z) {
                aVar.f165946r = "A0";
            }
            mo85770d(aVar, pVar);
        } else {
            Log.m105924i("MicroMsg.StoryAudioManager", "info is cached, directly invoke callback success");
            if (pVar != null) {
                pVar.invoke(Boolean.TRUE, audioCacheInfo.f163817i);
            }
        }
    }

    /* renamed from: f */
    public final void mo85772f(AudioCacheInfo audioCacheInfo) {
        C60858c remove;
        if (audioCacheInfo != null && (remove = this.f173405a.remove(Integer.valueOf(audioCacheInfo.f163813e))) != null) {
            String str = remove.f173395f;
            Log.m105924i(str, "cancel " + remove.f173397h);
            ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(remove.f173397h);
            remove.f173398i.clear();
        }
    }
}
