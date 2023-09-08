package sn2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import nn2.C21685l;
import p375qh.C110390f;

/* renamed from: sn2.p */
public class C22377p extends C21685l.C21687b {

    /* renamed from: g */
    public static C22377p f63447g;

    /* renamed from: e */
    public C22370a f63448e = new C22370a();

    /* renamed from: f */
    public C22376m f63449f;

    public C22377p(Context context, C21685l.C21686a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo33950a() {
        this.f63448e.mo35505b();
        this.f61391d = null;
    }

    /* renamed from: b */
    public void mo33951b() {
    }

    /* renamed from: c */
    public void mo33952c() {
    }

    /* renamed from: d */
    public void mo33953d() {
    }

    /* renamed from: e */
    public void mo33954e() {
        if (this.f61391d == null) {
            Log.m105928w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
            return;
        }
        System.currentTimeMillis();
        C22370a aVar = this.f63448e;
        aVar.f63410o = this.f63449f;
        p$$a p__a = new p$$a(this);
        C97625j3.m125815e().mo123455a(5245, aVar);
        aVar.f63404f = (int) Util.nowMilliSecond();
        aVar.f63409n = p__a;
        C110390f fVar = new C110390f(8000, 1, 4);
        aVar.f63408j = fVar;
        fVar.f330234m = -19;
        fVar.f330245x = aVar.f63415t;
        if (!fVar.mo161906k()) {
            Log.m105921e("MicroMsg.MusicAndSingRecorder", "start record failed clientId: %d", Integer.valueOf(aVar.f63404f));
            aVar.mo35504a();
            return;
        }
        aVar.f63405g = Util.nowMilliSecond();
        aVar.f63407i = false;
        aVar.f63412q = 0;
        aVar.f63406h = 1;
        aVar.f63413r = 0;
        aVar.f63414s = false;
    }
}
