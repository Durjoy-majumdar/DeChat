package de3;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1889w5;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: de3.f0 */
public final class C45331f0 {

    /* renamed from: de3.f0$a */
    public static final class C45332a {
        public C45332a(C8480h hVar) {
        }
    }

    /* renamed from: de3.f0$b */
    public enum C45333b {
        SINGLE_CHATTING(1007, 0),
        GROUP_CHATTING(1008, 0),
        TIME_LINE(C1889w5.CTRL_INDEX, 0),
        CHATTING_RECORD_FROM_FAV(1096, 5),
        CHATTING_RECORD_FROM_SINGLE_CHAT(1096, 1),
        CHATTING_RECORD_FROM_GROUP_CHAT(1096, 2),
        NOTE_FROM_FAV(1186, 5),
        NOTE_FROM_SINGLE_CHAT(1186, 1),
        NOTE_FROM_GROUP_CHAT(1186, 2),
        NOTE_FROM_TIMELINE(1186, 3);
        

        /* renamed from: d */
        public final int f122801d;

        /* renamed from: e */
        public int f122802e;

        /* access modifiers changed from: public */
        C45333b(int i, int i2) {
            this.f122801d = i;
            this.f122802e = i2;
        }

        /* renamed from: a */
        public final Bundle mo70879a(int i) {
            Bundle bundle = new Bundle();
            bundle.putString("key_wxa_short_link_launch_scene", name());
            bundle.putInt("key_wxa_short_link_launch_chat_type", i);
            return bundle;
        }

        /* renamed from: b */
        public final void mo70880b(Bundle bundle, int i) {
            C87412m.m108594g(bundle, FFmpegMetadataRetriever.METADATA_KEY_DATE);
            bundle.putString("key_wxa_short_link_launch_scene", name());
            bundle.putInt("key_wxa_short_link_launch_chat_type", i);
        }
    }

    static {
        new C45332a((C8480h) null);
    }

    /* renamed from: a */
    public static final Bundle m50242a(boolean z, int i) {
        Bundle a = (z ? C45333b.GROUP_CHATTING : C45333b.SINGLE_CHATTING).mo70879a(i);
        a.putInt("key_wxa_short_link_launch_chat_type", i);
        return a;
    }
}
