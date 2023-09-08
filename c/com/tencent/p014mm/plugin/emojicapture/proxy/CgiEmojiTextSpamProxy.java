package com.tencent.p014mm.plugin.emojicapture.proxy;

import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ef3.C86513a;
import ef3.C86514b;
import fy3.C32226l;
import gy3.C87412m;
import hp3.C87581a;
import kotlin.Metadata;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51067r70;
import w61.C53083a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/CgiEmojiTextSpamProxy;", "Lcom/tencent/mm/remoteservice/a;", "", "text", "Lkotlin/Function1;", "", "Lrx3/b0;", "callback", "cgiEmojiTextSpam", "shouldBlock", "cgiEmojiTextSpamCallback", "cgiEmojiTextSpamRemote", "g", "Lfy3/l;", "getCallback", "()Lfy3/l;", "setCallback", "(Lfy3/l;)V", "Lcom/tencent/mm/remoteservice/d;", "serverProxy", "<init>", "(Lcom/tencent/mm/remoteservice/d;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.CgiEmojiTextSpamProxy */
public final class CgiEmojiTextSpamProxy extends C96897a {

    /* renamed from: f */
    public final String f110689f = "MicroMsg.CgiEmojiTextSpamProxy";

    /* renamed from: g */
    public C32226l<? super Boolean, C13598b0> f110690g;

    /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.CgiEmojiTextSpamProxy$a */
    public static final class C41080a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f110691d;

        /* renamed from: e */
        public final /* synthetic */ CgiEmojiTextSpamProxy f110692e;

        /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.CgiEmojiTextSpamProxy$a$a */
        public static final class C41081a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ CgiEmojiTextSpamProxy f110693a;

            public C41081a(CgiEmojiTextSpamProxy cgiEmojiTextSpamProxy) {
                this.f110693a = cgiEmojiTextSpamProxy;
            }

            public Object call(Object obj) {
                boolean z;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                C87412m.m108594g(cVar, "cgiBack");
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C51067r70 r702 = (C51067r70) cVar.f256796d;
                    String access$getTAG$p = this.f110693a.f110689f;
                    Log.m105924i(access$getTAG$p, "CgiTextAntiSpam " + r702.f140738d + ' ' + r702.f140739e + ' ' + r702.f140740f);
                    z = r702.f140738d;
                } else {
                    String access$getTAG$p2 = this.f110693a.f110689f;
                    Log.m105928w(access$getTAG$p2, "CgiTextAntiSpam error " + cVar.f256793a + ' ' + cVar.f256794b);
                    z = false;
                }
                return this.f110693a.CLIENT_CALL("cgiEmojiTextSpamCallback", Boolean.valueOf(z));
            }
        }

        public C41080a(String str, CgiEmojiTextSpamProxy cgiEmojiTextSpamProxy) {
            this.f110691d = str;
            this.f110692e = cgiEmojiTextSpamProxy;
        }

        public final void run() {
            new C53083a(this.f110691d).mo9225i().mo123420E(new C41081a(this.f110692e));
        }
    }

    public CgiEmojiTextSpamProxy(C96905d dVar) {
        super(dVar);
    }

    public final void cgiEmojiTextSpam(String str, C32226l<? super Boolean, C13598b0> lVar) {
        String str2 = this.f110689f;
        Log.m105924i(str2, "cgiEmojiTextSpam " + str);
        REMOTE_CALL("cgiEmojiTextSpamRemote", str);
        this.f110690g = lVar;
    }

    @C86513a
    public final void cgiEmojiTextSpamCallback(boolean z) {
        String str = this.f110689f;
        Log.m105924i(str, "cgiEmojiTextSpamCallback " + z);
        C32226l<? super Boolean, C13598b0> lVar = this.f110690g;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    @C86514b
    public final void cgiEmojiTextSpamRemote(String str) {
        MMHandlerThread.postToMainThread(new C41080a(str, this));
    }

    public final C32226l<Boolean, C13598b0> getCallback() {
        return this.f110690g;
    }

    public final void setCallback(C32226l<? super Boolean, C13598b0> lVar) {
        this.f110690g = lVar;
    }
}
