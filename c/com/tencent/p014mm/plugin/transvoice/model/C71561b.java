package com.tencent.p014mm.plugin.transvoice.model;

import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.List;
import md0.C76751a;
import md0.C99846b;
import md0.C99847f;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.transvoice.model.b */
public class C71561b implements C11385n {

    /* renamed from: j */
    public static final String f207358j = (C72994y1.f212832a + "voice_temp.silk");

    /* renamed from: d */
    public int f207359d;

    /* renamed from: e */
    public C92866b.C68146d f207360e;

    /* renamed from: f */
    public C76751a f207361f = null;

    /* renamed from: g */
    public C99847f f207362g;

    /* renamed from: h */
    public boolean f207363h = false;

    /* renamed from: i */
    public boolean f207364i = false;

    public C71561b(C99847f fVar, int i, C92866b.C68146d dVar) {
        this.f207362g = fVar;
        this.f207359d = i;
        this.f207360e = dVar;
    }

    /* renamed from: a */
    public void mo98687a(boolean z, boolean z2) {
        Log.m105925i("MicroMsg.SceneVoiceInputAddr2", "continuable: %s, cancel fromUI = %s.", Boolean.valueOf(z), Boolean.valueOf(z2));
        mo98688b(z, z2);
    }

    /* renamed from: b */
    public final void mo98688b(boolean z, boolean z2) {
        Log.m105925i("MicroMsg.SceneVoiceInputAddr2", "reset continuable = %s, sendLastScene = %s.", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z) {
            this.f207364i = true;
            return;
        }
        this.f207364i = false;
        C76751a aVar = this.f207361f;
        if (aVar instanceof C99846b) {
            aVar.mo72192n1();
        }
        if (this.f207361f instanceof C99846b) {
            Log.m105925i("MicroMsg.SceneVoiceInputAddr2", "reset call stop, sendLastScene: %s.", Boolean.valueOf(z2));
            if (z2) {
                ((C99846b) this.f207361f).mo139199p1();
            }
            C86709a0.m107524d().mo123470p(235, this);
        }
        this.f207361f = null;
        this.f207360e = null;
    }

    /* renamed from: c */
    public void mo98689c() {
        Log.m105925i("MicroMsg.SceneVoiceInputAddr2", "start trans, time: %s.", Long.valueOf(System.currentTimeMillis()));
        this.f207361f = new C99846b(f207358j, this.f207362g, String.valueOf(0), this.f207359d, 10);
        C86709a0.m107524d().mo123455a(235, this);
        if (!((C99846b) this.f207361f).mo139200q1() || !C86709a0.m107524d().mo123461g(this.f207361f, 0)) {
            MMHandlerThread.postToMainThread(new C71560a(this, 13, 131, -1));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = str;
        C117747y yVar2 = yVar;
        C76751a aVar = (C76751a) yVar2;
        String[] k1 = aVar.mo72189k1();
        aVar.mo72190l1();
        List<String> m1 = aVar.mo72191m1();
        Object[] objArr = new Object[6];
        objArr[0] = Long.valueOf(System.currentTimeMillis());
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        int i3 = -1;
        objArr[3] = Integer.valueOf(k1 == null ? -1 : k1.length);
        objArr[4] = Integer.valueOf(yVar.hashCode());
        C76751a aVar2 = this.f207361f;
        if (aVar2 != null) {
            i3 = aVar2.hashCode();
        }
        objArr[5] = Integer.valueOf(i3);
        Log.m105919d("MicroMsg.SceneVoiceInputAddr2", "onSceneEnd time: %s errType: %s errCode: %s list: %s scene.hashCode(): %s this.hashCode(): %s.", objArr);
        if (this.f207361f == null || yVar.hashCode() != this.f207361f.hashCode()) {
            Log.m105918d("MicroMsg.SceneVoiceInputAddr2", "onSceneEnd scene.hashCode() != mVoiceRecogScene.hashCode()");
            return;
        }
        C92866b.C68146d dVar = this.f207360e;
        if (dVar == null) {
            return;
        }
        if (i2 == 0 && i == 0) {
            dVar.mo21934b(k1, m1);
            if ((yVar2 instanceof C99846b) && ((C99846b) yVar2).f292559g.mo139205e()) {
                this.f207360e.mo21933a();
                mo98687a(this.f207363h, false);
                return;
            }
            return;
        }
        if (str2 != null && str2.equalsIgnoreCase("SecurityCheckError")) {
            this.f207360e.mo21935c(13, 132, -1, -1);
        } else if (str2 == null || !str2.equalsIgnoreCase("ReadFileLengthError")) {
            this.f207360e.mo21935c(11, i, i2, (long) ((C76751a) yVar2).mo72188j1());
        } else {
            this.f207360e.mo21935c(13, 133, -1, -1);
        }
        mo98687a(false, false);
    }
}
