package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98201k;

/* renamed from: com.tencent.mm.ui.chatting.w0 */
public class C74332w0 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f218349d;

    /* renamed from: e */
    public final /* synthetic */ int f218350e;

    /* renamed from: f */
    public final /* synthetic */ int f218351f;

    /* renamed from: g */
    public final /* synthetic */ String f218352g;

    /* renamed from: h */
    public final /* synthetic */ String f218353h;

    /* renamed from: i */
    public final /* synthetic */ String f218354i;

    /* renamed from: j */
    public final /* synthetic */ String f218355j;

    /* renamed from: n */
    public final /* synthetic */ int f218356n;

    /* renamed from: o */
    public final /* synthetic */ C92836k f218357o;

    /* renamed from: p */
    public final /* synthetic */ Context f218358p;

    public C74332w0(C72963f4 f4Var, int i, int i2, String str, String str2, String str3, String str4, int i3, C92836k kVar, Context context) {
        this.f218349d = f4Var;
        this.f218350e = i;
        this.f218351f = i2;
        this.f218352g = str;
        this.f218353h = str2;
        this.f218354i = str3;
        this.f218355j = str4;
        this.f218356n = i3;
        this.f218357o = kVar;
        this.f218358p = context;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (dVar != null) {
            if (dVar.field_exist_whencheck) {
                Log.m105919d("MicroMsg.ChattingEditModeLogic", "support second !! sceneResult:[%s]", dVar);
                C74343y0.m88757a(dVar, this.f218349d, this.f218350e, this.f218351f, this.f218352g, this.f218353h, this.f218354i, this.f218355j, this.f218356n);
            } else {
                Log.m105918d("MicroMsg.ChattingEditModeLogic", "not support second !! dealDownLoadImg");
                C74343y0.m88759c(this.f218358p, this.f218357o, this.f218349d, this.f218350e, this.f218352g, ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127174TY(this.f218357o.f267380g, "th_", "", true));
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
