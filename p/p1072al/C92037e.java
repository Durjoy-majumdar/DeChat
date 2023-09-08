package p1072al;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import o40.C61926c;
import p1090yk.C102869a;
import rx3.C13598b0;

/* renamed from: al.e */
public class C92037e extends C92045h<AbsEmojiView> {

    /* renamed from: d */
    public C92042f f263557d;

    /* renamed from: e */
    public long f263558e = System.currentTimeMillis();

    /* renamed from: f */
    public boolean f263559f;

    /* renamed from: al.e$a */
    public static final class C92038a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f263560d;

        /* renamed from: e */
        public final /* synthetic */ Drawable f263561e;

        /* renamed from: f */
        public final /* synthetic */ AbsEmojiView f263562f;

        /* renamed from: g */
        public final /* synthetic */ C92037e f263563g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92038a(boolean z, Drawable drawable, AbsEmojiView absEmojiView, C92037e eVar) {
            super(0);
            this.f263560d = z;
            this.f263561e = drawable;
            this.f263562f = absEmojiView;
            this.f263563g = eVar;
        }

        public Object invoke() {
            Drawable drawable;
            if (!this.f263560d || (drawable = this.f263561e) == null) {
                AbsEmojiView absEmojiView = this.f263562f;
                if (absEmojiView != null) {
                    absEmojiView.mo129221p();
                }
                C92042f fVar = this.f263563g.f263557d;
                if (fVar != null) {
                    fVar.mo55799a(false);
                }
            } else {
                AbsEmojiView absEmojiView2 = this.f263562f;
                if (absEmojiView2 != null) {
                    absEmojiView2.setImageDrawable(drawable);
                }
                AbsEmojiView absEmojiView3 = this.f263562f;
                if (absEmojiView3 != null) {
                    absEmojiView3.resume();
                }
                C92042f fVar2 = this.f263563g.f263557d;
                if (fVar2 != null) {
                    fVar2.mo55799a(true);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: al.e$b */
    public static final class C92039b extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92037e f263564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92039b(C92037e eVar) {
            super(2);
            this.f263564d = eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            IEmojiInfo iEmojiInfo = this.f263564d.f263567a;
            C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
            if (emojiInfo.field_width == 0 || emojiInfo.field_height == 0) {
                emojiInfo.field_width = intValue;
                emojiInfo.field_height = intValue2;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: al.e$c */
    public static final class C92040c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92037e f263565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92040c(C92037e eVar) {
            super(0);
            this.f263565d = eVar;
        }

        public Object invoke() {
            this.f263565d.mo126009c(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: al.e$d */
    public static final class C92041d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92037e f263566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92041d(C92037e eVar) {
            super(0);
            this.f263566d = eVar;
        }

        public Object invoke() {
            AbsEmojiView absEmojiView;
            WeakReference<V> weakReference = this.f263566d.f263569c;
            if (!(weakReference == null || (absEmojiView = (AbsEmojiView) weakReference.get()) == null)) {
                absEmojiView.mo129221p();
            }
            C92043g.m115671e(this.f263566d, false, 1, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92037e(EmojiInfo emojiInfo, AbsEmojiView absEmojiView, C92042f fVar) {
        super(emojiInfo, absEmojiView);
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(absEmojiView, "view");
        this.f263557d = fVar;
    }

    /* renamed from: a */
    public void mo126012a() {
        super.mo126012a();
        this.f263557d = null;
    }

    /* renamed from: c */
    public void mo126009c(boolean z) {
        boolean z2 = z;
        StringBuilder sb = new StringBuilder();
        sb.append("onLoad ");
        sb.append(this);
        sb.append(' ');
        WeakReference<V> weakReference = this.f263569c;
        Drawable drawable = null;
        sb.append(weakReference != null ? (AbsEmojiView) weakReference.get() : null);
        sb.append(' ');
        sb.append(z2);
        Log.m105918d("MicroMsg.EmojiViewRequest", sb.toString());
        if (this.f263559f) {
            if (System.currentTimeMillis() - this.f263558e <= 10000) {
                int iOSNetType = NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
                if (iOSNetType == 1) {
                    C115669n.INSTANCE.mo175912v(1257, 124);
                } else if (iOSNetType == 2) {
                    C115669n.INSTANCE.mo175912v(1257, 115);
                } else if (iOSNetType == 3) {
                    C115669n.INSTANCE.mo175912v(1257, 118);
                } else if (iOSNetType == 4) {
                    C115669n.INSTANCE.mo175912v(1257, 121);
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f263558e;
                int iOSNetType2 = NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
                if (iOSNetType2 == 1) {
                    C115669n.INSTANCE.mo175913w(1257, 125, currentTimeMillis);
                } else if (iOSNetType2 == 2) {
                    C115669n.INSTANCE.mo175913w(1257, 116, currentTimeMillis);
                } else if (iOSNetType2 == 3) {
                    C115669n.INSTANCE.mo175913w(1257, 119, currentTimeMillis);
                } else if (iOSNetType2 == 4) {
                    C115669n.INSTANCE.mo175913w(1257, 122, currentTimeMillis);
                }
            }
        }
        WeakReference<V> weakReference2 = this.f263569c;
        AbsEmojiView absEmojiView = weakReference2 != null ? (AbsEmojiView) weakReference2.get() : null;
        if (z2) {
            C102869a aVar = new C102869a();
            IEmojiInfo iEmojiInfo = this.f263567a;
            C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            drawable = aVar.mo142584a((EmojiInfo) iEmojiInfo, new C92039b(this));
        }
        C61926c.m72668M(new C92038a(z2, drawable, absEmojiView, this));
    }

    /* renamed from: f */
    public void mo126010f(boolean z) {
        if (this.f263567a.mo62633C1()) {
            C61926c.m72656A((String) null, new C92040c(this));
            return;
        }
        this.f263559f = true;
        C61926c.m72668M(new C92041d(this));
    }
}
