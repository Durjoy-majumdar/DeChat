package ny0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMCacheSlotManager;
import ea3.C45590f;
import ex0.C45700h;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: ny0.b */
public final class C47307b {

    /* renamed from: a */
    public static final C47307b f126966a = new C47307b();

    /* renamed from: b */
    public static final MMCacheSlotManager f126967b = new MMCacheSlotManager();

    /* renamed from: c */
    public static final ConcurrentSkipListSet<String> f126968c = new ConcurrentSkipListSet<>();

    /* renamed from: ny0.b$a */
    public static final class C47308a {

        /* renamed from: a */
        public final String f126969a;

        /* renamed from: b */
        public final String f126970b;

        /* renamed from: c */
        public final String f126971c;

        /* renamed from: d */
        public final String f126972d;

        /* renamed from: e */
        public int f126973e;

        /* renamed from: f */
        public int f126974f;

        /* renamed from: g */
        public int f126975g;

        /* renamed from: h */
        public final String f126976h;

        /* renamed from: i */
        public final String f126977i;

        /* renamed from: j */
        public final String f126978j;

        public C47308a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, String str8, int i4, C8480h hVar) {
            str5 = (i4 & 16) != 0 ? "" : str5;
            i = (i4 & 32) != 0 ? -1 : i;
            i2 = (i4 & 64) != 0 ? -1 : i2;
            i3 = (i4 & 128) != 0 ? -1 : i3;
            Integer num = null;
            str6 = (i4 & 256) != 0 ? null : str6;
            str7 = (i4 & 512) != 0 ? null : str7;
            str8 = (i4 & 1024) != 0 ? null : str8;
            C87412m.m108594g(str, "url");
            C87412m.m108594g(str2, "appId");
            C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str4, "desc");
            C87412m.m108594g(str5, "from");
            this.f126969a = str;
            this.f126970b = str2;
            this.f126971c = str3;
            this.f126972d = str4;
            this.f126973e = i;
            this.f126974f = i2;
            this.f126975g = i3;
            this.f126976h = str6;
            this.f126977i = str7;
            this.f126978j = str8;
            if (C45590f.m50649i(str)) {
                num = 211;
            } else if (C45590f.m50651k(str)) {
                num = 213;
            } else if (C45590f.m50652l(str)) {
                num = 212;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (this.f126974f != num.intValue()) {
                    this.f126975g = this.f126974f;
                    this.f126974f = intValue;
                }
            }
            Log.m105926v("MicroMsg.WebPrefetcherPreAuther", "[TRACE_PREFETCH-preAuth] checkScene scene: " + this.f126974f + ", subBizScene: " + this.f126975g);
        }
    }

    /* renamed from: a */
    public final void mo72359a(C47308a aVar, boolean z, List<C45700h.C45704d> list, int i) {
        if (!z && list != null) {
            list.add(mo72360b(aVar, i));
        }
    }

    /* renamed from: b */
    public final C45700h.C45704d mo72360b(C47308a aVar, int i) {
        C87412m.m108594g(aVar, "<this>");
        C45700h.C45702b bVar = new C45700h.C45702b();
        bVar.f123504a = aVar.f126969a;
        bVar.f123505b = aVar.f126978j;
        bVar.f123506c = aVar.f126974f;
        bVar.f123507d = aVar.f126973e;
        bVar.f123508e = aVar.f126970b;
        bVar.f123509f = aVar.f126971c;
        bVar.f123510g = aVar.f126972d;
        bVar.f123512i = aVar.f126977i;
        bVar.f123513j = aVar.f126975g;
        return new C45700h.C45704d(bVar, i);
    }
}
