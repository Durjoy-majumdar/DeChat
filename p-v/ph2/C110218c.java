package ph2;

import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d03.C58010a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import j03.C60700d;
import jh2.C108745d;
import rx3.C13598b0;
import th2.C110992d;
import zt3.C119157j;

/* renamed from: ph2.c */
public final class C110218c implements C110220d {

    /* renamed from: a */
    public final String f329717a = ("MicroMsg.EditMusicController" + hashCode());

    /* renamed from: b */
    public C60700d f329718b;

    /* renamed from: ph2.c$a */
    public static final class C110219a extends C87413o implements C32227p<String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AudioCacheInfo f329719d;

        /* renamed from: e */
        public final /* synthetic */ C110218c f329720e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110219a(AudioCacheInfo audioCacheInfo, C110218c cVar) {
            super(2);
            this.f329719d = audioCacheInfo;
            this.f329720e = cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            int intValue = ((Number) obj2).intValue();
            if (intValue == 0) {
                this.f329719d.f163818j = true;
            } else {
                String str2 = this.f329720e.f329717a;
                Log.m105928w(str2, "onPlayMusicError, ret:" + intValue);
                if (this.f329719d.f163831z) {
                    Log.m105928w(this.f329720e.f329717a, "onPlayMusicError, try switch to video!");
                    AudioCacheInfo audioCacheInfo = this.f329719d;
                    audioCacheInfo.f163831z = false;
                    ((C119157j) C119157j.f356862d).mo183895z(new C110217b(this.f329720e, audioCacheInfo));
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C110218c(Context context) {
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo161623a() {
        Log.m105924i(this.f329717a, "pause music");
        StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
        storyDoPublishStruct.f310301n = storyDoPublishStruct.mo86045b("MusicId", "", true);
        StoryDoPublishStruct storyDoPublishStruct2 = C110992d.f332428d;
        storyDoPublishStruct2.f310302o = 0;
        storyDoPublishStruct2.f310304q = 0;
        C110992d.f332431g.f310323m = 0;
        C108745d dVar = C108745d.f325633i;
        if (dVar != null) {
            dVar.mo159766b();
        }
        C60700d dVar2 = this.f329718b;
        if (dVar2 != null) {
            C60695a.C60696a.m70998a(dVar2, false, 1, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo161624b(AudioCacheInfo audioCacheInfo) {
        Log.m105924i(this.f329717a, "play music");
        try {
            mo161625c(audioCacheInfo);
            C60700d dVar = this.f329718b;
            if (dVar != null) {
                dVar.mo85619m();
            }
        } catch (Exception e) {
            String str = this.f329717a;
            Log.m105920e(str, "play music " + audioCacheInfo + " fail:" + e.getLocalizedMessage());
        }
    }

    /* renamed from: c */
    public final void mo161625c(AudioCacheInfo audioCacheInfo) {
        mo161623a();
        if (audioCacheInfo != null) {
            String str = audioCacheInfo.f163814f;
            String str2 = str == null ? "" : str;
            String valueOf = String.valueOf(audioCacheInfo.f163813e);
            String str3 = audioCacheInfo.f163817i;
            C58010a aVar = new C58010a(valueOf, str3 == null ? "" : str3, str2, 0, 0);
            aVar.f165933e = audioCacheInfo.f163818j;
            aVar.f165932d = audioCacheInfo.f163826u;
            if (audioCacheInfo.f163831z) {
                aVar.f165946r = "A0";
            }
            C60700d dVar = this.f329718b;
            if (dVar != null) {
                dVar.stop();
            }
            C60700d dVar2 = this.f329718b;
            if (dVar2 != null) {
                dVar2.recycle();
            }
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C60700d dVar3 = new C60700d(context);
            this.f329718b = dVar3;
            dVar3.f172880k = true;
            dVar3.setLoop(true);
            C60700d dVar4 = this.f329718b;
            if (dVar4 != null) {
                dVar4.setMute(false);
            }
            C60700d dVar5 = this.f329718b;
            if (dVar5 != null) {
                dVar5.setMediaInfo(aVar);
            }
            C60700d dVar6 = this.f329718b;
            C60700d.C60701a aVar2 = dVar6 != null ? dVar6.f172876g : null;
            if (aVar2 != null) {
                aVar2.f172902j = new C110219a(audioCacheInfo, this);
            }
        }
    }

    /* renamed from: d */
    public void mo161626d() {
        Log.m105924i(this.f329717a, "release");
        C60700d dVar = this.f329718b;
        if (dVar != null) {
            dVar.stop();
        }
        C60700d dVar2 = this.f329718b;
        if (dVar2 != null) {
            dVar2.recycle();
        }
        this.f329718b = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f172872c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161627e(long r10) {
        /*
            r9 = this;
            j03.d r0 = r9.f329718b
            r1 = 0
            if (r0 == 0) goto L_0x000f
            j03.b r0 = r0.f172872c
            if (r0 == 0) goto L_0x000f
            long r3 = r0.getDurationMs()
            goto L_0x0010
        L_0x000f:
            r3 = r1
        L_0x0010:
            long r3 = java.lang.Math.max(r1, r3)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0023
            long r0 = r10 % r3
            goto L_0x0024
        L_0x0023:
            r0 = r10
        L_0x0024:
            java.lang.String r2 = r9.f329717a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "seek music to "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r10 = ", durationMs "
            r5.append(r10)
            r5.append(r3)
            java.lang.String r10 = ", seek to "
            r5.append(r10)
            r5.append(r0)
            java.lang.String r10 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            j03.d r3 = r9.f329718b
            if (r3 == 0) goto L_0x0057
            int r4 = (int) r0
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            j03.C60695a.C60696a.m70999b(r3, r4, r5, r6, r7, r8)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph2.C110218c.mo161627e(long):void");
    }
}
