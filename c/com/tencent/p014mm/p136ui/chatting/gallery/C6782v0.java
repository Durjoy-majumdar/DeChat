package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.widget.TextView;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p500dy.C97560f;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$attachDebugInfo$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {774}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.v0 */
public final class C6782v0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f24327d;

    /* renamed from: e */
    public final /* synthetic */ TextView f24328e;

    /* renamed from: f */
    public final /* synthetic */ String f24329f;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$attachDebugInfo$1$mediaInfo$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.ui.chatting.gallery.v0$a */
    public static final class C6783a extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f24330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6783a(String str, C15601d<? super C6783a> dVar) {
            super(2, dVar);
            this.f24330d = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C6783a(this.f24330d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C6783a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return ((C97560f) C86312j.m106911c(C97560f.class)).mo136825un(this.f24330d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6782v0(TextView textView, String str, C15601d<? super C6782v0> dVar) {
        super(2, dVar);
        this.f24328e = textView;
        this.f24329f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C6782v0(this.f24328e, this.f24329f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C6782v0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f24327d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object f = C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, new Integer(0));
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) f).intValue() == 1) {
                C53896h0 h0Var = C53872d1.f151119c;
                C6783a aVar2 = new C6783a(this.f24329f, (C15601d<? super C6783a>) null);
                this.f24327d = 1;
                obj = C53895h.m60469g(h0Var, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TextView textView = this.f24328e;
        textView.setVisibility(0);
        textView.setText((String) obj);
        return C13598b0.f38549a;
    }
}
