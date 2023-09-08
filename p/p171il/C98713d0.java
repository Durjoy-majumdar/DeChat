package p171il;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.AbsEmojiView;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p260wk.C102457e;
import p813fl.C97904g;
import p813fl.C97927q0;
import rx3.C13598b0;

/* renamed from: il.d0 */
public class C98713d0 extends C98748z<C97904g> {

    /* renamed from: B */
    public boolean f289459B;

    /* renamed from: C */
    public final EmojiStatusView f289460C;

    /* renamed from: D */
    public final ProgressBar f289461D;

    /* renamed from: E */
    public final TextView f289462E;

    /* renamed from: il.d0$a */
    public static final class C98714a implements AbsEmojiView.C92684b {

        /* renamed from: a */
        public final /* synthetic */ C98713d0 f289463a;

        /* renamed from: il.d0$a$a */
        public static final class C98715a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f289464d;

            /* renamed from: e */
            public final /* synthetic */ C98713d0 f289465e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C98715a(int i, C98713d0 d0Var) {
                super(0);
                this.f289464d = i;
                this.f289465e = d0Var;
            }

            public Object invoke() {
                if (this.f289464d == 0) {
                    this.f289465e.f289461D.setVisibility(0);
                } else {
                    this.f289465e.f289461D.setVisibility(8);
                }
                return C13598b0.f38549a;
            }
        }

        public C98714a(C98713d0 d0Var) {
            this.f289463a = d0Var;
        }

        /* renamed from: a */
        public void mo126734a(int i) {
            C61926c.m72668M(new C98715a(i, this.f289463a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98713d0(View view, boolean z, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        this.f289459B = z;
        View findViewById = view.findViewById(C0966R.C0970id.f6152yr);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.art_emoji_icon_iv)");
        EmojiStatusView emojiStatusView = (EmojiStatusView) findViewById;
        this.f289460C = emojiStatusView;
        this.f289461D = (ProgressBar) view.findViewById(C0966R.C0970id.c6r);
        View findViewById2 = view.findViewById(C0966R.C0970id.f6153ys);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.art_emoji_icon_text)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.hsc);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.pay_tip)");
        this.f289462E = (TextView) findViewById3;
        emojiStatusView.setDefaultImageResource(0);
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        C97904g gVar = (C97904g) q0Var;
        String str = null;
        if (this.f289461D != null) {
            this.f289460C.setStatusListener(new C98714a(this));
            this.f289460C.setImageDrawable((Drawable) null);
            AbsEmojiView.C92684b statusListener = this.f289460C.getStatusListener();
            if (statusListener != null) {
                statusListener.mo126734a(0);
            }
        }
        if (gVar.f287200b.mo62654b0() == 1) {
            this.f289462E.setVisibility(0);
            EmojiStatusView emojiStatusView = this.f289460C;
            emojiStatusView.setContentDescription(this.f44854d.getContext().getString(C0966R.string.c76) + gVar.f287200b.mo62652Z1());
        } else {
            this.f289462E.setVisibility(8);
            this.f289460C.setContentDescription(gVar.f287200b.mo62652Z1());
        }
        this.f289460C.mo129237x();
        if (this.f289461D == null) {
            IEmojiInfo emojiInfo = this.f289460C.getEmojiInfo();
            if (emojiInfo != null) {
                str = emojiInfo.getMd5();
            }
            if (!C87412m.m108589b(str, gVar.f287200b.getMd5())) {
                this.f289460C.setImageDrawable(new ColorDrawable(this.f289460C.getContext().getResources().getColor(C0966R.color.f2930d)));
            }
        }
        if (this.f289459B) {
            this.f289460C.setEmojiInfo(gVar.f287200b);
            this.f289460C.setContentDescription(gVar.f287200b.mo62652Z1());
            return;
        }
        C102457e eVar = C102457e.f301712a;
        IEmojiInfo iEmojiInfo = gVar.f287200b;
        C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        eVar.mo142072d((EmojiInfo) iEmojiInfo, this.f289460C, new ColorDrawable(this.f289460C.getContext().getResources().getColor(C0966R.color.f2930d)));
    }
}
