package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import a14.C0000n0;
import a14.C53921m;
import a70.C112760b;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.EmojiFetcher;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.io.IOException;
import kotlin.ResultKt;
import p008bq.C0363p0;
import p008bq.C67309t0;
import p008bq.C92289q0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$fetchGifBytes$3$1$1", mo125469f = "EmojiFetcher.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.e */
public final class C29550e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f80464d;

    /* renamed from: e */
    public /* synthetic */ Object f80465e;

    /* renamed from: f */
    public final /* synthetic */ EmojiFetcher.EmojiArgs f80466f;

    /* renamed from: g */
    public final /* synthetic */ C1256g<IPCString> f80467g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29550e(EmojiFetcher.EmojiArgs emojiArgs, C1256g<IPCString> gVar, C15601d<? super C29550e> dVar) {
        super(2, dVar);
        this.f80466f = emojiArgs;
        this.f80467g = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C29550e eVar = new C29550e(this.f80466f, this.f80467g, dVar);
        eVar.f80465e = obj;
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C29550e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        String str;
        Class cls = C67309t0.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f80464d;
        boolean z = true;
        String str2 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EmojiFetcher.EmojiArgs emojiArgs = this.f80466f;
            C87412m.m108593f(emojiArgs, "args");
            this.f80465e = (C0000n0) this.f80465e;
            this.f80464d = 1;
            Class cls2 = C0363p0.class;
            if (((C67309t0) C86312j.m106911c(cls)).mo91194sI()) {
                Log.m105920e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + emojiArgs + ", invalid state, emojiMgr is NULL");
                obj = null;
            } else {
                C8479f0 f0Var = new C8479f0();
                T Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(emojiArgs.f80452d);
                f0Var.f27484d = Vs;
                if (Vs == null) {
                    T zE = ((C0363p0) C86312j.m106911c(cls2)).mo404zE();
                    zE.setMd5(emojiArgs.f80452d);
                    zE.mo62634E(emojiArgs.f80455g);
                    zE.mo62658e1(emojiArgs.f80453e);
                    zE.setAesKey(emojiArgs.f80454f);
                    zE.mo62687p1(65);
                    zE.mo62691s(emojiArgs.f80456h);
                    zE.mo62692s0(1);
                    f0Var.f27484d = zE;
                    ((C0363p0) C86312j.m106911c(cls2)).lu0((IEmojiInfo) f0Var.f27484d);
                }
                T t = f0Var.f27484d;
                C87412m.m108591d(t);
                if (!((IEmojiInfo) t).mo62642M0()) {
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    ((C92289q0) C86312j.m106911c(C92289q0.class)).mo126041BA((IEmojiInfo) f0Var.f27484d, new C29549d(emojiArgs, mVar, f0Var));
                    obj = mVar.mo74608o();
                } else {
                    Log.m105924i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + emojiArgs + ", return cached info");
                    obj = (IEmojiInfo) f0Var.f27484d;
                }
            }
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C0000n0 n0Var = (C0000n0) this.f80465e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        IEmojiInfo iEmojiInfo = (IEmojiInfo) obj;
        if (iEmojiInfo == null) {
            C1256g<IPCString> gVar = this.f80467g;
            if (gVar != null) {
                gVar.mo894a(null);
            }
            return C13598b0.f38549a;
        }
        if (((C67309t0) C86312j.m106911c(cls)).mo91194sI()) {
            Log.m105920e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "decode with md5:" + iEmojiInfo.getMd5() + ", invalid state, emojiMgr is NULL");
            bArr = null;
        } else {
            bArr = ((C67309t0) C86312j.m106911c(cls)).mo91191ZT(iEmojiInfo);
        }
        if (bArr != null) {
            if (bArr.length != 0) {
                z = false;
            }
            if (!z) {
                synchronized (C112760b.class) {
                    str = C112760b.m154225d() + "appbrand/emojicache/";
                }
                String str3 = str + iEmojiInfo.getMd5() + ".data";
                try {
                    C86013q1.m106461v(str);
                    C86013q1.m106438T(str3, bArr, 0, bArr.length);
                    str2 = str3;
                } catch (IOException unused) {
                }
                C1256g<IPCString> gVar2 = this.f80467g;
                if (gVar2 != null) {
                    gVar2.mo894a(new IPCString(str2));
                }
                return C13598b0.f38549a;
            }
        }
        C1256g<IPCString> gVar3 = this.f80467g;
        if (gVar3 != null) {
            gVar3.mo894a(null);
        }
        return C13598b0.f38549a;
    }
}
