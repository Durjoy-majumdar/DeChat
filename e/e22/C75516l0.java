package e22;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74804o4;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import gl3.C75921a;
import gl3.C75922b;
import gy3.C87412m;
import kg3.C76577a;
import p629ny.C76979h;
import p910lj.C76701a;

/* renamed from: e22.l0 */
public final class C75516l0 extends C75921a {

    /* renamed from: H */
    public static final /* synthetic */ int f221887H = 0;

    /* renamed from: B */
    public String f221888B;

    /* renamed from: C */
    public final C75519b f221889C = new C75519b();

    /* renamed from: D */
    public final int f221890D = 36;

    /* renamed from: E */
    public final C75517a f221891E = new C75517a();

    /* renamed from: F */
    public C75520c f221892F;

    /* renamed from: G */
    public Integer f221893G = 0;

    /* renamed from: e22.l0$a */
    public final class C75517a implements C75922b.C75923a {

        /* renamed from: a */
        public MMEditText f221894a;

        /* renamed from: b */
        public ImageView f221895b;

        /* renamed from: c */
        public TextView f221896c;

        /* renamed from: e22.l0$a$a */
        public final class C75518a implements InputFilter {

            /* renamed from: d */
            public final char[] f221898d = {10, ',', ';', 12289, 65292, 65307};

            public C75518a() {
            }

            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                C87412m.m108594g(charSequence, FirebaseAnalytics.C113379b.SOURCE);
                C87412m.m108594g(spanned, "dest");
                for (int i5 = i; i5 < i2; i5++) {
                    char[] cArr = new char[(i2 - i)];
                    TextUtils.getChars(charSequence, i, i2, cArr, 0);
                    for (char c : this.f221898d) {
                        char c2 = cArr[i5];
                        if (c2 == ' ' && i3 == 0 && i5 == 0) {
                            return "";
                        }
                        if (c2 == c) {
                            C75517a aVar = C75517a.this;
                            aVar.mo105837b();
                            aVar.mo105837b().setVisibility(8);
                            C74804o4.f219938a.mo103976a();
                            C76701a.makeText(aVar.mo105837b().getContext(), (CharSequence) aVar.mo105837b().getContext().getString(C0966R.string.f7384eq), 0).show();
                            return "";
                        }
                    }
                }
                return null;
            }
        }

        public C75517a() {
        }

        /* renamed from: a */
        public final MMEditText mo105836a() {
            MMEditText mMEditText = this.f221894a;
            if (mMEditText != null) {
                return mMEditText;
            }
            C87412m.m108603p("editText");
            throw null;
        }

        /* renamed from: b */
        public final TextView mo105837b() {
            TextView textView = this.f221896c;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p("mErrorMsgTextView");
            throw null;
        }
    }

    /* renamed from: e22.l0$b */
    public final class C75519b implements C75922b.C75924b {
        public C75519b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ben, viewGroup, false);
            C75517a aVar = C75516l0.this.f221891E;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.HeaderLabelDataItem.HeaderLabelViewHolder");
            C87412m.m108591d(inflate);
            View findViewById = inflate.findViewById(C0966R.C0970id.cd7);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.edittext)");
            aVar.f221894a = (MMEditText) findViewById;
            C75516l0.this.f221893G = Integer.valueOf(C76577a.m92157h(aVar.mo105836a().getContext(), C0966R.dimen.f3881hq));
            View findViewById2 = inflate.findViewById(C0966R.C0970id.c16);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.delete)");
            aVar.f221895b = (ImageView) findViewById2;
            View findViewById3 = inflate.findViewById(C0966R.C0970id.ckp);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.err_msg)");
            aVar.f221896c = (TextView) findViewById3;
            aVar.mo105836a();
            C75516l0 l0Var = C75516l0.this;
            int i = C75516l0.f221887H;
            l0Var.getClass();
            aVar.mo105836a().setFilters(new InputFilter[]{new C75517a.C75518a()});
            aVar.mo105836a().requestFocus();
            aVar.mo105836a().addTextChangedListener(new C75521m0(C75516l0.this, aVar));
            new MMHandler().postDelayed(new C75523n0(aVar), 0);
            ImageView imageView = aVar.f221895b;
            if (imageView != null) {
                imageView.setOnClickListener(new C75525o0(aVar, C75516l0.this));
                aVar.mo105837b();
                aVar.mo105837b().setOnTouchListener(new C75527p0(aVar));
                String str = C75516l0.this.f221888B;
                C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
                C75516l0.this.getClass();
                aVar.mo105836a();
                if (!Util.isNullOrNil(str)) {
                    Context context2 = aVar.mo105836a().getContext();
                    Integer num = C75516l0.this.f221893G;
                    C87412m.m108591d(num);
                    SpannableString op02 = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context2, str, num.intValue());
                    C87412m.m108593f(op02, "getService(ISpannableSer…xt(), text, mSpannSize!!)");
                    aVar.mo105836a().setText(op02);
                }
                aVar.mo105836a().setHint(aVar.mo105836a().getContext().getString(C0966R.string.g1u));
                inflate.setTag(aVar);
                return inflate;
            }
            C87412m.m108603p("mDeleteBtn");
            throw null;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    /* renamed from: e22.l0$c */
    public interface C75520c {
        /* renamed from: a */
        void mo95165a(String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75516l0(int i, String str) {
        super(1, i);
        C87412m.m108594g(str, "labelString");
        this.f221888B = str;
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f221889C;
    }
}
