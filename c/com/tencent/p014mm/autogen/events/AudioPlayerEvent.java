package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.tav.core.AssetExtension;

/* renamed from: com.tencent.mm.autogen.events.AudioPlayerEvent */
public final class AudioPlayerEvent extends IEvent {

    /* renamed from: d */
    public C17674a f48073d = new C17674a();

    /* renamed from: com.tencent.mm.autogen.events.AudioPlayerEvent$a */
    public static final class C17674a {

        /* renamed from: a */
        public int f48074a;

        /* renamed from: b */
        public long f48075b;

        /* renamed from: c */
        public String f48076c;

        /* renamed from: d */
        public String f48077d;

        /* renamed from: e */
        public String f48078e;

        /* renamed from: f */
        public int f48079f;

        /* renamed from: g */
        public String f48080g;

        /* renamed from: h */
        public String f48081h;
    }

    public AudioPlayerEvent() {
        this.order = false;
        this.callback = null;
    }

    /* renamed from: a */
    public static String m17972a(int i) {
        return (i == 0 || i == 1) ? AssetExtension.SCENE_PLAY : i == 2 ? "pause" : i == 3 ? "stop" : i == 4 ? "error" : i == 5 ? "ended" : i == 6 ? "seeked" : i == 7 ? "canplay" : i == 9 ? "waiting" : i == 10 ? "seeking" : i == 11 ? "real_play" : i == 12 ? "mix_play_ready" : i == 13 ? "preload_end" : "";
    }
}
