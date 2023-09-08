package b03;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.C103834d;
import androidx.transition.C67095c;
import androidx.transition.Transition;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p1050v2.C111325g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vl3.C102226d;

/* renamed from: b03.s */
public final class C67133s {

    /* renamed from: a */
    public final TextView f192747a;

    /* renamed from: b */
    public final List<Transition.C103824e> f192748b = new LinkedList();

    /* renamed from: c */
    public C67135b f192749c;

    /* renamed from: d */
    public int f192750d;

    /* renamed from: e */
    public int f192751e;

    /* renamed from: f */
    public boolean f192752f;

    /* renamed from: g */
    public CharSequence f192753g;

    /* renamed from: h */
    public CharSequence f192754h;

    /* renamed from: i */
    public CharSequence f192755i;

    /* renamed from: j */
    public Integer f192756j;

    /* renamed from: k */
    public View.OnClickListener f192757k;

    /* renamed from: l */
    public C67134a f192758l;

    /* renamed from: m */
    public CharSequence f192759m;

    /* renamed from: n */
    public CharSequence f192760n;

    /* renamed from: o */
    public boolean f192761o;

    /* renamed from: p */
    public boolean f192762p;

    /* renamed from: q */
    public int f192763q;

    /* renamed from: r */
    public Transition f192764r;

    /* renamed from: s */
    public final C67095c f192765s;

    /* renamed from: t */
    public ViewGroup f192766t;

    /* renamed from: u */
    public boolean f192767u;

    /* renamed from: v */
    public MovementMethod f192768v;

    /* renamed from: w */
    public boolean f192769w;

    /* renamed from: x */
    public final C32228q<String, CharSequence, Integer, CharSequence> f192770x;

    /* renamed from: y */
    public final C13601g f192771y;

    /* renamed from: b03.s$a */
    public interface C67134a {
        void onChange(int i);
    }

    /* renamed from: b03.s$b */
    public interface C67135b {
        /* renamed from: a */
        void mo91248a();
    }

    /* renamed from: b03.s$c */
    public static final class C67136c {

        /* renamed from: a */
        public final int f192772a;

        /* renamed from: b */
        public final int f192773b;

        /* renamed from: c */
        public final Integer f192774c;

        /* renamed from: d */
        public final View.OnClickListener f192775d;

        public C67136c(int i, int i2, Integer num, View.OnClickListener onClickListener) {
            this.f192772a = i;
            this.f192773b = i2;
            this.f192774c = num;
            this.f192775d = onClickListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C67136c)) {
                return false;
            }
            C67136c cVar = (C67136c) obj;
            return this.f192772a == cVar.f192772a && this.f192773b == cVar.f192773b && C87412m.m108589b(this.f192774c, cVar.f192774c) && C87412m.m108589b(this.f192775d, cVar.f192775d);
        }

        public int hashCode() {
            int i = ((this.f192772a * 31) + this.f192773b) * 31;
            Integer num = this.f192774c;
            int i2 = 0;
            int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
            View.OnClickListener onClickListener = this.f192775d;
            if (onClickListener != null) {
                i2 = onClickListener.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "SuffixColor(fromIndex=" + this.f192772a + ", toIndex=" + this.f192773b + ", color=" + this.f192774c + ", listener=" + this.f192775d + ')';
        }
    }

    /* renamed from: b03.s$d */
    public static final class C67137d extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ C67133s f192776d;

        public C67137d(C67133s sVar) {
            this.f192776d = sVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$createExpandContent$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            if (view instanceof TextView) {
                ((TextView) view).setHighlightColor(MMApplicationContext.getResources().getColor(17170445));
            }
            View.OnClickListener onClickListener = this.f192776d.f192757k;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$createExpandContent$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            super.updateDrawState(textPaint);
            C67133s sVar = this.f192776d;
            Integer num = sVar.f192756j;
            if (num != null) {
                num.intValue();
                Resources resources = sVar.f192747a.getResources();
                Integer num2 = sVar.f192756j;
                C87412m.m108591d(num2);
                textPaint.setColor(C111325g.m151807a(resources, num2.intValue(), sVar.f192747a.getContext().getTheme()));
                textPaint.setUnderlineText(false);
            }
        }
    }

    /* renamed from: b03.s$e */
    public static final class C67138e extends C67095c {

        /* renamed from: d */
        public final /* synthetic */ C67133s f192777d;

        /* renamed from: e */
        public final /* synthetic */ TextView f192778e;

        public C67138e(C67133s sVar, TextView textView) {
            this.f192777d = sVar;
            this.f192778e = textView;
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            C87412m.m108594g(transition, "transition");
            this.f192777d.mo91244f(this);
            this.f192778e.getLayoutParams().height = -2;
            TextView textView = this.f192778e;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f192778e.setMaxLines(this.f192777d.f192763q);
            this.f192777d.f192747a.setPadding(this.f192778e.getPaddingLeft(), this.f192778e.getPaddingTop(), this.f192778e.getPaddingRight(), this.f192777d.f192750d);
            this.f192778e.setText(C102226d.m134696a(MMApplicationContext.getContext(), this.f192777d.f192753g));
            C67135b bVar = this.f192777d.f192749c;
            if (bVar != null) {
                bVar.mo91248a();
            }
        }
    }

    /* renamed from: b03.s$f */
    public static final class C67139f extends C87413o implements C32224a<List<C67136c>> {

        /* renamed from: d */
        public static final C67139f f192779d = new C67139f();

        public C67139f() {
            super(0);
        }

        public Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: b03.s$g */
    public static final class C67140g extends C87413o implements C32228q<String, CharSequence, Integer, SpannableStringBuilder> {

        /* renamed from: d */
        public final /* synthetic */ C67133s f192780d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67140g(C67133s sVar) {
            super(3);
            this.f192780d = sVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
            C87412m.m108594g((CharSequence) obj2, "suffix");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            C67133s sVar = this.f192780d;
            for (C67136c cVar : (List) ((C36570n) sVar.f192771y).getValue()) {
                int i = cVar.f192772a + intValue;
                int i2 = cVar.f192773b + intValue;
                View.OnClickListener onClickListener = cVar.f192775d;
                if (onClickListener != null) {
                    spannableStringBuilder.setSpan(new C67126a0(cVar, sVar, onClickListener), i, i2, 33);
                    sVar.f192747a.setMovementMethod(sVar.f192768v);
                }
            }
            return spannableStringBuilder;
        }
    }

    /* renamed from: b03.s$h */
    public static final class C67141h extends C67095c {

        /* renamed from: d */
        public final /* synthetic */ C67133s f192781d;

        public C67141h(C67133s sVar) {
            this.f192781d = sVar;
        }

        /* renamed from: a */
        public void mo91179a(Transition transition) {
            C87412m.m108594g(transition, "transition");
            this.f192781d.f192769w = true;
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            C87412m.m108594g(transition, "transition");
            this.f192781d.f192769w = false;
        }
    }

    public C67133s(TextView textView) {
        C87412m.m108594g(textView, "textView");
        this.f192747a = textView;
        CharSequence text = textView.getText();
        C87412m.m108593f(text, "textView.text");
        this.f192753g = text;
        this.f192754h = MMApplicationContext.getResources().getString(C0966R.string.me6);
        this.f192755i = MMApplicationContext.getResources().getString(C0966R.string.me7);
        this.f192756j = Integer.valueOf(C0966R.color.BW_100_Alpha_0_6);
        this.f192762p = true;
        this.f192763q = 3;
        this.f192764r = new AutoTransition();
        this.f192765s = new C67141h(this);
        ViewParent parent = textView.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f192766t = (ViewGroup) parent;
        this.f192768v = LinkMovementMethod.getInstance();
        this.f192770x = new C67140g(this);
        this.f192771y = C36568h.m40985a(C67139f.f192779d);
        if (textView.getLayoutParams().width == -2) {
            throw new RuntimeException("textView's width can't be wrap_content. Only support match_parent or specified size");
        }
    }

    /* renamed from: b */
    public static final int m79390b(Map<Integer, Integer> map, C8478d0 d0Var, CharSequence charSequence, CharSequence charSequence2, TextView textView, C32228q<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, C67133s sVar, int i, int i2) {
        CharSequence charSequence3;
        int i3 = (i << 16) | i2;
        Integer num = map.get(Integer.valueOf(i3));
        if (num != null) {
            C67127b0.m79385a("verify: " + i2 + " cached");
            return num.intValue();
        }
        d0Var.f27483d++;
        String str = charSequence.subSequence(i, i2).toString() + charSequence2;
        Context context = MMApplicationContext.getContext();
        if (qVar == null || (charSequence3 = (CharSequence) qVar.invoke(str, charSequence2, Integer.valueOf(i2))) == null) {
            charSequence3 = str;
        }
        textView.setText(C102226d.m134696a(context, charSequence3));
        int lineCount = textView.getLineCount();
        if (i2 == charSequence.length() && !C87412m.m108589b(str, charSequence2)) {
            sVar.f192751e = lineCount;
            sVar.f192752f = true;
            C67134a aVar = sVar.f192758l;
            if (aVar != null) {
                aVar.onChange(lineCount);
            }
            Log.m105919d("TextViewSuffixWrapper", "verify: fullTextLineCountListener:%s  fullTextLineCount:%s ", sVar.f192758l, Integer.valueOf(sVar.f192751e));
        }
        C67127b0.m79385a("verify: end:" + i2 + ", lineCount = " + lineCount + " content:" + str);
        map.put(Integer.valueOf(i3), Integer.valueOf(lineCount));
        return lineCount;
    }

    /* renamed from: e */
    public static final void m79391e(C67133s sVar, Transition transition) {
        sVar.f192747a.setMaxLines(sVar.f192763q);
        sVar.f192747a.setEllipsize(TextUtils.TruncateAt.END);
        CharSequence text = sVar.f192747a.getText();
        sVar.f192747a.setText(C102226d.m134696a(MMApplicationContext.getContext(), sVar.f192753g));
        if (transition != null) {
            TextView textView = sVar.f192747a;
            Layout layout = textView.getLayout();
            if (layout != null) {
                int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(C102226d.m134696a(MMApplicationContext.getContext(), text));
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.getLayoutParams().height = height;
                textView.setLayoutParams(textView.getLayoutParams());
                C67138e eVar = new C67138e(sVar, textView);
                transition.mo145324a(eVar);
                ((LinkedList) sVar.f192748b).add(eVar);
            }
            C103834d.m138407a(sVar.f192766t, transition);
        }
    }

    /* renamed from: h */
    public static final void m79392h(C32226l<? super CharSequence, C13598b0> lVar, CharSequence charSequence, TextView textView, CharSequence charSequence2, CharSequence charSequence3, C32228q<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, C32226l<? super CharSequence, C13598b0> lVar2, int i) {
        CharSequence charSequence4;
        CharSequence charSequence5;
        if (i < 0) {
            C87412m.m108593f(charSequence, "originText");
            lVar.invoke(charSequence);
            return;
        }
        if (i >= charSequence2.length()) {
            charSequence4 = C102226d.m134696a(MMApplicationContext.getContext(), charSequence2);
        } else {
            CharSequence charSequence6 = charSequence2.subSequence(0, i).toString() + charSequence3;
            Context context = MMApplicationContext.getContext();
            if (!(qVar == null || (charSequence5 = (CharSequence) qVar.invoke(charSequence6, charSequence3, Integer.valueOf(i))) == null)) {
                charSequence6 = charSequence5;
            }
            charSequence4 = C102226d.m134696a(context, charSequence6);
        }
        textView.setText(charSequence4);
        CharSequence text = textView.getText();
        C87412m.m108593f(text, "textview.text");
        lVar2.invoke(text);
    }

    /* renamed from: a */
    public final int mo91241a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, C32228q<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar) {
        LinkedHashMap linkedHashMap;
        int i2;
        CharSequence charSequence3 = charSequence;
        int i3 = i;
        C8478d0 d0Var = new C8478d0();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (textView.getLayout() == null) {
            C67127b0.m79385a("layout is null");
            return -1;
        }
        int b = m79390b(linkedHashMap2, d0Var, charSequence, charSequence2, textView, qVar, this, 0, charSequence.length());
        if (b <= i3) {
            C67127b0.m79385a("verify <= targetLineCount, verify = " + b + ", targetLineCount = " + i3);
            textView.setText(C102226d.m134696a(MMApplicationContext.getContext(), charSequence3));
            return charSequence.length();
        }
        TextView textView2 = textView;
        int length = charSequence.length();
        C67127b0.m79385a("left = " + 0 + ", right = " + length);
        int i4 = length;
        int i5 = 0;
        while (true) {
            if (i5 > i4) {
                break;
            }
            int i6 = i5;
            int i7 = i4;
            int i8 = (i5 + i4) / 2;
            int b2 = m79390b(linkedHashMap2, d0Var, charSequence, charSequence2, textView, qVar, this, 0, i8);
            String str = "binarySearch: (" + i6 + ", " + i8 + ", " + i7 + "), pLineCount = " + b2;
            if (b2 < i3) {
                str = str + ", targetLineCount = " + i3 + ", pLineCount < targetLineCount";
                i5 = i8 + 1;
                i2 = i8;
                linkedHashMap = linkedHashMap2;
            } else if (b2 == i3) {
                int i9 = i8 + 1;
                linkedHashMap = linkedHashMap2;
                int i15 = i8;
                int b3 = m79390b(linkedHashMap2, d0Var, charSequence, charSequence2, textView, qVar, this, 0, i9);
                str = str + ", nLineCount = " + b3;
                int i16 = i3 + 1;
                if (b3 < i16) {
                    i2 = i15;
                    i5 = i9;
                } else if (b3 == i16) {
                    C67127b0.m79385a("success = " + i15 + ", verifyCount = " + d0Var.f27483d);
                    return i15;
                } else {
                    C67127b0.m79385a("impossible");
                }
            } else {
                i2 = i8;
                linkedHashMap = linkedHashMap2;
                String str2 = str;
                i7 = i2 - 1;
                i5 = i6;
            }
            C67127b0.m79385a(str + ", text = " + charSequence3.subSequence(0, i2).toString() + charSequence2);
            i4 = i7;
            linkedHashMap2 = linkedHashMap;
            TextView textView3 = textView;
        }
        C67127b0.m79385a("failed, verifyCount = " + d0Var.f27483d);
        return -1;
    }

    /* renamed from: c */
    public final void mo91242c(boolean z) {
        CharSequence charSequence;
        Log.m105924i("TextViewSuffixWrapper", "collapse: isAnimationRunning:" + this.f192769w + " textview:" + this.f192747a);
        if (!this.f192769w) {
            this.f192747a.scrollTo(0, 0);
            Transition transition = z ? this.f192764r : null;
            this.f192761o = true;
            CharSequence charSequence2 = this.f192754h;
            if (charSequence2 == null) {
                m79391e(this, transition);
            } else if (!this.f192762p || (charSequence = this.f192759m) == null) {
                TextView textView = this.f192747a;
                CharSequence charSequence3 = this.f192753g;
                int i = this.f192763q;
                ViewGroup viewGroup = this.f192766t;
                C67144w wVar = new C67144w(this);
                C67145x xVar = new C67145x(this, transition);
                C32228q<String, CharSequence, Integer, CharSequence> qVar = this.f192770x;
                C87412m.m108594g(textView, "textview");
                C87412m.m108594g(charSequence3, "mainContent");
                C87412m.m108594g(viewGroup, "sceneRoot");
                C67143u uVar = new C67143u(transition, wVar, textView, textView.getText(), this, viewGroup);
                C39722v vVar = new C39722v(textView, charSequence3, i, xVar);
                CharSequence text = textView.getText();
                if (textView.getLayout() == null) {
                    textView.addOnLayoutChangeListener(new C67147z(textView, vVar, this, charSequence3, charSequence2, i, qVar, text, uVar));
                    textView.requestLayout();
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                m79392h(vVar, text, textView, charSequence3, charSequence2, qVar, uVar, mo91241a(this.f192747a, charSequence3, charSequence2, i, qVar));
                long currentTimeMillis2 = System.currentTimeMillis();
                C67127b0.m79385a(">>>>>performance: " + (currentTimeMillis2 - currentTimeMillis) + LocaleUtil.MALAY);
            } else if (!C87412m.m108589b(charSequence, this.f192753g)) {
                if (transition != null) {
                    TextView textView2 = this.f192747a;
                    CharSequence charSequence4 = this.f192759m;
                    C87412m.m108591d(charSequence4);
                    ViewGroup viewGroup2 = this.f192766t;
                    C87412m.m108594g(textView2, "textview");
                    C87412m.m108594g(viewGroup2, "sceneRoot");
                    CharSequence text2 = textView2.getText();
                    textView2.setText(C102226d.m134696a(MMApplicationContext.getContext(), charSequence4));
                    Layout layout = textView2.getLayout();
                    if (layout != null) {
                        int height = layout.getHeight() + textView2.getPaddingTop() + textView2.getPaddingBottom();
                        textView2.setText(C102226d.m134696a(MMApplicationContext.getContext(), text2));
                        textView2.getLayoutParams().height = height;
                        textView2.setLayoutParams(textView2.getLayoutParams());
                        C67146y yVar = new C67146y(this, textView2, charSequence4);
                        transition.mo145324a(yVar);
                        ((LinkedList) this.f192748b).add(yVar);
                    }
                    C103834d.m138407a(viewGroup2, transition);
                    return;
                }
                this.f192747a.setMaxLines(this.f192763q);
                this.f192747a.setEllipsize(TextUtils.TruncateAt.END);
                this.f192747a.setText(C102226d.m134696a(MMApplicationContext.getContext(), this.f192759m));
                C67135b bVar = this.f192749c;
                if (bVar != null) {
                    bVar.mo91248a();
                }
            }
        }
    }

    /* renamed from: d */
    public final CharSequence mo91243d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f192753g);
        sb.append(this.f192755i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        C67137d dVar = new C67137d(this);
        int length = spannableStringBuilder.length();
        CharSequence charSequence = this.f192755i;
        C87412m.m108591d(charSequence);
        spannableStringBuilder.setSpan(dVar, length - charSequence.length(), spannableStringBuilder.length(), 33);
        this.f192760n = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* renamed from: f */
    public final void mo91244f(Transition.C103824e eVar) {
        Transition transition = this.f192764r;
        if (transition != null) {
            transition.mo145310C(eVar);
        }
        ((LinkedList) this.f192748b).remove(eVar);
    }

    /* renamed from: g */
    public final void mo91245g(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "value");
        this.f192759m = null;
        this.f192760n = null;
        this.f192751e = 0;
        this.f192752f = false;
        this.f192753g = charSequence;
        mo91242c(false);
        if (!(this.f192755i == null || this.f192756j == null)) {
            mo91243d();
        }
        if (charSequence.length() == 0) {
            this.f192747a.setVisibility(8);
        } else {
            this.f192747a.setVisibility(0);
        }
    }

    /* renamed from: i */
    public final void mo91246i(int i, int i2, int i3, View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((List) ((C36570n) this.f192771y).getValue()).add(new C67136c(i, i2, Integer.valueOf(C111325g.m151807a(this.f192747a.getResources(), i3, this.f192747a.getContext().getTheme())), onClickListener));
    }
}
