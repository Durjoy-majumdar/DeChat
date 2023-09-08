package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import hd0.C98410o0;
import kotlin.ResultKt;
import p243tn.C14050a;
import p682rz.C101488s;
import rx3.C13598b0;
import s90.C48300n;
import te3.C64598o03;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$loadThumb$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {999}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.c1 */
public final class C97041c1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f284666d;

    /* renamed from: e */
    public int f284667e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f284668f;

    /* renamed from: g */
    public final /* synthetic */ C97087m1 f284669g;

    /* renamed from: h */
    public final /* synthetic */ C97136u0 f284670h;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$loadThumb$1$bitmap$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.ui.chatting.gallery.c1$a */
    public static final class C97042a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C97087m1 f284671d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f284672e;

        /* renamed from: f */
        public final /* synthetic */ int f284673f;

        /* renamed from: g */
        public final /* synthetic */ int f284674g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97042a(C97087m1 m1Var, C72963f4 f4Var, int i, int i2, C15601d<? super C97042a> dVar) {
            super(2, dVar);
            this.f284671d = m1Var;
            this.f284672e = f4Var;
            this.f284673f = i;
            this.f284674g = i2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97042a(this.f284671d, this.f284672e, this.f284673f, this.f284674g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97042a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "[+] [tomys] Easy crash pos, bitmap will be down sample to reduce mem cost. position=" + this.f284671d.f284836c);
            try {
                return BitmapUtil.createThumbBitmap(((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(this.f284672e.mo108765s2()), this.f284673f, this.f284674g, false, false);
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97041c1(C72963f4 f4Var, C97087m1 m1Var, C97136u0 u0Var, C15601d<? super C97041c1> dVar) {
        super(2, dVar);
        this.f284668f = f4Var;
        this.f284669g = m1Var;
        this.f284670h = u0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C97041c1(this.f284668f, this.f284669g, this.f284670h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97041c1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f284667e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C97052g.m124928p(this.f284668f);
            if (this.f284668f.mo100983V3()) {
                C48300n n = C97052g.m124926n(this.f284668f);
                if (n == null) {
                    return C13598b0.f38549a;
                }
                String b = C14050a.m13405b(n.f133370h);
                C20828a b2 = C20828a.m22825b();
                String str = n.f133370h;
                C97087m1 m1Var = this.f284669g;
                m1Var.mo135970f();
                ImageView imageView2 = m1Var.f284847n;
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59350f = b;
                bVar.f59346b = true;
                b2.mo32519h(str, imageView2, bVar.mo32666a());
                C85820q1 q1Var = C85820q1.f249947a;
                String d = n.mo73008d(this.f284668f.mo108765s2());
                C87412m.m108593f(d, "mpShareVideoInfo.getPlayKey(msg.imgPath)");
                C64598o03 b3 = q1Var.mo119747b(d);
                if (b3.f184602e == 1) {
                    this.f284670h.mo135911x(this.f284669g, b3.f184603f);
                } else {
                    this.f284670h.mo135910q(this.f284669g);
                }
                return C13598b0.f38549a;
            }
            C97087m1 m1Var2 = this.f284669g;
            m1Var2.mo135970f();
            ImageView imageView3 = m1Var2.f284847n;
            int width = imageView3.getWidth();
            int height = imageView3.getHeight();
            C53896h0 h0Var = C53872d1.f151119c;
            C97042a aVar2 = new C97042a(this.f284669g, this.f284668f, width, height, (C15601d<? super C97042a>) null);
            this.f284666d = imageView3;
            this.f284667e = 1;
            Object g = C53895h.m60469g(h0Var, aVar2, this);
            if (g == aVar) {
                return aVar;
            }
            imageView = imageView3;
            obj = g;
        } else if (i == 1) {
            imageView = (ImageView) this.f284666d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Bitmap bitmap = (Bitmap) obj;
        imageView.setImageBitmap(bitmap);
        C97087m1 m1Var3 = this.f284669g;
        m1Var3.mo135970f();
        m1Var3.f284849p.setThumb(bitmap);
        return C13598b0.f38549a;
    }
}
