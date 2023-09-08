package com.tencent.p014mm.app.plugin;

import android.content.Context;
import com.tencent.p014mm.app.plugin.C40034i;
import com.tencent.p014mm.app.plugin.URISpanHandlerSet;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.concurrent.atomic.AtomicBoolean;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p831xg.C53324a;
import qo3.C89779i0;
import te3.C50755oy3;

/* renamed from: com.tencent.mm.app.plugin.c */
public class C40028c implements C11385n {

    /* renamed from: d */
    public C40029a f107323d;

    /* renamed from: e */
    public Context f107324e;

    /* renamed from: f */
    public C89779i0 f107325f;

    /* renamed from: g */
    public boolean f107326g;

    /* renamed from: h */
    public int f107327h;

    /* renamed from: i */
    public String f107328i;

    /* renamed from: j */
    public Runnable f107329j;

    /* renamed from: n */
    public Runnable f107330n;

    /* renamed from: o */
    public AtomicBoolean f107331o = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.app.plugin.c$a */
    public interface C40029a {
    }

    public C40028c(Context context, int i, String str, C40029a aVar) {
        this.f107324e = context;
        this.f107323d = aVar;
        this.f107325f = null;
        this.f107327h = i;
        this.f107328i = str;
    }

    /* renamed from: a */
    public final void mo62717a(boolean z, C50755oy3 oy32) {
        C40029a aVar = this.f107323d;
        if (aVar != null) {
            Context context = this.f107324e;
            C40034i.C40035a aVar2 = (C40034i.C40035a) aVar;
            aVar2.getClass();
            Log.m105924i("MicroMsg.URISpanHandler", "finishCheckTag");
            if (oy32 == null) {
                Log.m105924i("MicroMsg.URISpanHandler", "handleSpanClick, response is null");
                return;
            }
            C40034i iVar = C40034i.this;
            iVar.f107347g = context;
            iVar.f107346f.f107260a = context;
            iVar.f107344d.put(aVar2.f107351a.f148312c, oy32);
            C40034i.this.mo62726q(oy32, (URISpanHandlerSet.TopicSpanHandler) aVar2.f107352b, aVar2.f107353c, aVar2.f107351a, aVar2.f107354d);
            C40034i.this.f107345e = null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.AddContact", "onSceneEnd, errType = " + i + ", errCode = " + i2 + "," + str);
        if (!(yVar instanceof C53324a) || yVar.getType() != 4790) {
            Log.m105928w("MicroMsg.AddContact", "not expected scene,  type = " + yVar.getType());
            return;
        }
        if (this.f107326g) {
            Runnable runnable = this.f107330n;
            if (runnable != null) {
                MMHandlerThread.removeRunnable(runnable);
            }
            C89779i0 i0Var = this.f107325f;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f107325f = null;
            }
        }
        MMHandlerThread.removeRunnable(this.f107329j);
        C86709a0.m107529k().f251779b.mo123470p(4790, this);
        if (i == 0 && i2 == 0) {
            mo62717a(true, (C50755oy3) ((C53324a) yVar).f148927e.f127056b.f127083a);
            return;
        }
        if (!Util.isNullOrNil(str)) {
            C76879j.m92748s(this.f107324e, str, "");
        }
        mo62717a(false, (C50755oy3) null);
    }
}
