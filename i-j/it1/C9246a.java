package it1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50141kk1;
import te3.C51863wp0;
import te3.C52002xp0;

/* renamed from: it1.a */
public final class C9246a extends C60625c<C52002xp0> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9246a(String str, int i, Long l, C89349b bVar, C50141kk1 kk12, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "topic");
        C51863wp0 wp02 = new C51863wp0();
        wp02.f144192f = i;
        wp02.f144193g = str;
        wp02.f144191e = bVar;
        if (l != null) {
            l.longValue();
            wp02.f144196j = l.longValue();
        }
        wp02.f144199p = kk12;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = wp02;
        bVar2.f127069d = 817;
        bVar2.f127067b = new C52002xp0();
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + str + ", " + l);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52002xp0) eu32, "resp");
        Log.m105924i("Finder.CgiFinderGetTopicFeed", "[onCgiEnd] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
