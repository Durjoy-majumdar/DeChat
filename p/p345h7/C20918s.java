package p345h7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20528a;
import p345h7.C20923v;

/* renamed from: h7.s */
public final class C20918s {

    /* renamed from: a */
    public final List<Format> f59246a;

    /* renamed from: b */
    public final C16750m[] f59247b;

    public C20918s(List<Format> list) {
        this.f59246a = list;
        this.f59247b = new C16750m[list.size()];
    }

    /* renamed from: a */
    public void mo32632a(C16743g gVar, C20923v.C20927d dVar) {
        C20923v.C20927d dVar2 = dVar;
        for (int i = 0; i < this.f59247b.length; i++) {
            dVar.mo32634a();
            dVar.mo32635b();
            C16750m o = gVar.mo17752o(dVar2.f59280d, 3);
            Format format = this.f59246a.get(i);
            String str = format.f45777i;
            boolean z = MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str);
            C20528a.m22238b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = format.f45772d;
            if (str2 == null) {
                dVar.mo32635b();
                str2 = dVar2.f59281e;
            }
            o.mo17741a(Format.m16648i(str2, str, (String) null, -1, format.f45768D, format.f45769E, format.f45770F, (DrmInitData) null, MAlarmHandler.NEXT_FIRE_INTERVAL, Collections.emptyList()));
            this.f59247b[i] = o;
        }
    }
}
