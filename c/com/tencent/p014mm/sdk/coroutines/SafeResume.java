package com.tencent.p014mm.sdk.coroutines;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0015B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/SafeResume;", "T", "", "value", "Lrx3/b0;", "resume", "(Ljava/lang/Object;)V", "La14/l;", "cont", "La14/l;", "getCont", "()La14/l;", "", "hasResume", "Z", "getHasResume", "()Z", "setHasResume", "(Z)V", "<init>", "(La14/l;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.SafeResume */
public final class SafeResume<T> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.SafeResume";
    private final C53916l<T> cont;
    private boolean hasResume;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/SafeResume$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.coroutines.SafeResume$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public SafeResume(C53916l<? super T> lVar) {
        C87412m.m108594g(lVar, "cont");
        this.cont = lVar;
    }

    public final C53916l<T> getCont() {
        return this.cont;
    }

    public final boolean getHasResume() {
        return this.hasResume;
    }

    public final synchronized void resume(T t) {
        if (!this.hasResume) {
            this.hasResume = true;
            try {
                this.cont.resumeWith(Result.m168114constructorimpl(t));
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "resume", new Object[0]);
            }
        }
        return;
    }

    public final void setHasResume(boolean z) {
        this.hasResume = z;
    }
}
