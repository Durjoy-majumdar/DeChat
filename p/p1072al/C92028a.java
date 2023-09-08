package p1072al;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import o40.C61926c;
import p1089xk.C102686a;
import p1090yk.C102869a;
import rx3.C13598b0;
import z51.C39315g;

/* renamed from: al.a */
public final class C92028a extends C92037e {

    /* renamed from: g */
    public final String f263539g;

    /* renamed from: h */
    public boolean f263540h = true;

    /* renamed from: al.a$a */
    public static final class C92029a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92028a f263541d;

        /* renamed from: e */
        public final /* synthetic */ Drawable f263542e;

        /* renamed from: f */
        public final /* synthetic */ AbsEmojiView f263543f;

        /* renamed from: g */
        public final /* synthetic */ boolean f263544g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92029a(C92028a aVar, Drawable drawable, AbsEmojiView absEmojiView, boolean z) {
            super(0);
            this.f263541d = aVar;
            this.f263542e = drawable;
            this.f263543f = absEmojiView;
            this.f263544g = z;
        }

        public Object invoke() {
            LruCache<String, WeakReference<Drawable>> lruCache = C102686a.f303299a;
            String str = this.f263541d.f263539g;
            Drawable drawable = this.f263542e;
            Log.m105924i("MicroMsg.EmojiLoader.AnimateCache", "put " + str);
            if (str != null) {
                if (drawable != null) {
                    C102686a.f303299a.put(str, new WeakReference(drawable));
                } else {
                    C102686a.f303299a.remove(str);
                }
            }
            AbsEmojiView absEmojiView = this.f263543f;
            if (absEmojiView != null) {
                absEmojiView.setImageDrawable(this.f263542e);
            }
            AbsEmojiView absEmojiView2 = this.f263543f;
            if (absEmojiView2 != null) {
                absEmojiView2.resume();
            }
            C92042f fVar = this.f263541d.f263557d;
            if (fVar != null) {
                fVar.mo55799a(this.f263544g && this.f263542e != null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: al.a$b */
    public static final class C92030b extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92028a f263545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92030b(C92028a aVar) {
            super(2);
            this.f263545d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            IEmojiInfo iEmojiInfo = this.f263545d.f263567a;
            C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
            if (emojiInfo.field_width == 0 || emojiInfo.field_height == 0) {
                emojiInfo.field_width = intValue;
                emojiInfo.field_height = intValue2;
                ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138019f(emojiInfo);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: al.a$c */
    public static final class C92031c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92028a f263546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92031c(C92028a aVar) {
            super(0);
            this.f263546d = aVar;
        }

        public Object invoke() {
            this.f263546d.mo126009c(true);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92028a(com.tencent.p014mm.storage.emotion.EmojiInfo r3, com.tencent.p014mm.pluginsdk.p133ui.emoji.ChattingEmojiView r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "emojiInfo"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "cacheKey"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.emoji.view.AbsEmojiView$a r0 = r4.getDelegate()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.emoji.loader.request.IRequest.Callback"
            gy3.C87412m.m108592e(r0, r1)
            r2.<init>(r3, r4, r0)
            r2.f263539g = r5
            r3 = 1
            r2.f263540h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1072al.C92028a.<init>(com.tencent.mm.storage.emotion.EmojiInfo, com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView, java.lang.String):void");
    }

    /* renamed from: c */
    public void mo126009c(boolean z) {
        Drawable drawable;
        StringBuilder sb = new StringBuilder();
        sb.append("onLoad ");
        sb.append(this);
        sb.append(' ');
        WeakReference<V> weakReference = this.f263569c;
        sb.append(weakReference != null ? (AbsEmojiView) weakReference.get() : null);
        sb.append(' ');
        sb.append(z);
        Log.m105918d("MicroMsg.ChatEmojiViewRequest", sb.toString());
        IEmojiInfo iEmojiInfo = this.f263567a;
        C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        WeakReference<V> weakReference2 = this.f263569c;
        AbsEmojiView absEmojiView = weakReference2 != null ? (AbsEmojiView) weakReference2.get() : null;
        if (z) {
            C102869a aVar = new C102869a();
            IEmojiInfo iEmojiInfo2 = this.f263567a;
            C87412m.m108592e(iEmojiInfo2, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            drawable = aVar.mo142584a((EmojiInfo) iEmojiInfo2, new C92030b(this));
        } else {
            drawable = null;
        }
        if (drawable != null || !this.f263540h) {
            C61926c.m72668M(new C92029a(this, drawable, absEmojiView, z));
            return;
        }
        this.f263540h = false;
        C92043g.m115671e(this, false, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (gy3.C87412m.m108589b(r2, r3 != null ? (com.tencent.p014mm.emoji.view.AbsEmojiView) r3.get() : null) != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r5 = p1089xk.C102686a.f303299a.get(r5);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126010f(boolean r5) {
        /*
            r4 = this;
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.ref.WeakReference<android.graphics.drawable.Drawable>> r5 = p1089xk.C102686a.f303299a
            java.lang.String r5 = r4.f263539g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.EmojiLoader.AnimateCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            if (r5 != 0) goto L_0x001e
            goto L_0x002f
        L_0x001e:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.ref.WeakReference<android.graphics.drawable.Drawable>> r1 = p1089xk.C102686a.f303299a
            java.lang.Object r5 = r1.get(r5)
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r5.get()
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            goto L_0x0030
        L_0x002f:
            r5 = r0
        L_0x0030:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start: "
            r1.append(r2)
            r1.append(r5)
            r2 = 32
            r1.append(r2)
            java.lang.ref.WeakReference<V> r3 = r4.f263569c
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r3.get()
            com.tencent.mm.emoji.view.AbsEmojiView r3 = (com.tencent.p014mm.emoji.view.AbsEmojiView) r3
            goto L_0x004f
        L_0x004e:
            r3 = r0
        L_0x004f:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r4.f263539g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ChatEmojiViewRequest"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            r1 = 1
            if (r5 == 0) goto L_0x00a8
            android.graphics.drawable.Drawable$Callback r2 = r5.getCallback()
            if (r2 == 0) goto L_0x0082
            android.graphics.drawable.Drawable$Callback r2 = r5.getCallback()
            java.lang.ref.WeakReference<V> r3 = r4.f263569c
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r3.get()
            com.tencent.mm.emoji.view.AbsEmojiView r3 = (com.tencent.p014mm.emoji.view.AbsEmojiView) r3
            goto L_0x007c
        L_0x007b:
            r3 = r0
        L_0x007c:
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x00a8
        L_0x0082:
            java.lang.ref.WeakReference<V> r0 = r4.f263569c
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r0.get()
            com.tencent.mm.emoji.view.AbsEmojiView r0 = (com.tencent.p014mm.emoji.view.AbsEmojiView) r0
            if (r0 == 0) goto L_0x0091
            r0.setImageDrawable(r5)
        L_0x0091:
            java.lang.ref.WeakReference<V> r5 = r4.f263569c
            if (r5 == 0) goto L_0x00a0
            java.lang.Object r5 = r5.get()
            com.tencent.mm.emoji.view.AbsEmojiView r5 = (com.tencent.p014mm.emoji.view.AbsEmojiView) r5
            if (r5 == 0) goto L_0x00a0
            r5.resume()
        L_0x00a0:
            al.f r5 = r4.f263557d
            if (r5 == 0) goto L_0x00bd
            r5.mo55799a(r1)
            goto L_0x00bd
        L_0x00a8:
            com.tencent.mm.api.IEmojiInfo r5 = r4.f263567a
            boolean r5 = r5.mo62633C1()
            if (r5 == 0) goto L_0x00b9
            al.a$c r5 = new al.a$c
            r5.<init>(r4)
            o40.C61926c.m72656A(r0, r5)
            goto L_0x00bd
        L_0x00b9:
            r5 = 0
            p1072al.C92043g.m115671e(r4, r5, r1, r0)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1072al.C92028a.mo126010f(boolean):void");
    }
}
