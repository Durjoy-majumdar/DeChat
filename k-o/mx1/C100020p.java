package mx1;

import a14.C0000n0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gx1.C98277g;
import gy3.C87412m;
import kotlin.ResultKt;
import p1084mk.C99908b;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.game.chatroom.viewmodel.ChatroomViewModel$getPagBackgroundLiveData$1", mo125469f = "ChatroomViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: mx1.p */
public final class C100020p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f293037d;

    /* renamed from: e */
    public final /* synthetic */ String f293038e;

    /* renamed from: f */
    public final /* synthetic */ C54219z<C13604l<Boolean, String>> f293039f;

    /* renamed from: mx1.p$a */
    public static final class C100021a implements C99908b {

        /* renamed from: a */
        public final /* synthetic */ C54219z<C13604l<Boolean, String>> f293040a;

        public C100021a(C54219z<C13604l<Boolean, String>> zVar) {
            this.f293040a = zVar;
        }

        public void onTaskFailed(String str, int i, boolean z) {
            C87412m.m108594g(str, "url");
            Log.m105921e("GameChatRoom.ChatroomViewModel", "onTaskFinished Failed url:%s, err_code:%s", str, Integer.valueOf(i));
            this.f293040a.postValue(new C13604l(Boolean.FALSE, null));
        }

        public void onTaskFinished(String str, String str2, boolean z) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(str2, "save_path");
            Log.m105925i("GameChatRoom.ChatroomViewModel", "onTaskFinished url:%s, save_path:%s", str, str2);
            this.f293040a.postValue(new C13604l(Boolean.TRUE, str2));
        }

        public void onTaskProgressChanged(String str, long j, long j2) {
            C87412m.m108594g(str, "url");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100020p(String str, String str2, C54219z<C13604l<Boolean, String>> zVar, C15601d<? super C100020p> dVar) {
        super(2, dVar);
        this.f293037d = str;
        this.f293038e = str2;
        this.f293039f = zVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100020p(this.f293037d, this.f293038e, this.f293039f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100020p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C98277g gVar;
        ResultKt.throwOnFailure(obj);
        synchronized (C98277g.class) {
            if (C98277g.f288108c == null) {
                C98277g.f288108c = new C98277g();
            }
            gVar = C98277g.f288108c;
        }
        gVar.mo137573a(this.f293037d, this.f293038e, 0, new C100021a(this.f293039f));
        return C13598b0.f38549a;
    }
}
