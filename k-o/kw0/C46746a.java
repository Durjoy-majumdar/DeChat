package kw0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import fy3.C32224a;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64186f0;
import yr3.C112481c;
import yr3.C79150a;

/* renamed from: kw0.a */
public final class C46746a {

    /* renamed from: a */
    public static final C46746a f125826a = new C46746a();

    /* renamed from: b */
    public static HashMap<Integer, Integer> f125827b = new HashMap<>();

    /* renamed from: c */
    public static final C13601g f125828c = C36568h.m40985a(C10424b.f31645d);

    /* renamed from: kw0.a$b */
    public static final class C10424b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C10424b f31645d = new C10424b();

        public C10424b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_option_search_open, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: kw0.a$c */
    public static final class C46747c extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ boolean f125829a;

        /* renamed from: b */
        public final /* synthetic */ boolean f125830b;

        /* renamed from: c */
        public final /* synthetic */ float f125831c;

        public C46747c(boolean z, boolean z2, float f) {
            this.f125829a = z;
            this.f125830b = z2;
            this.f125831c = f;
        }

        public void getOutline(View view, Outline outline) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(outline, "outline");
            boolean z = this.f125829a;
            if (z && this.f125830b) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f125831c);
            } else if (z) {
                int width = view.getWidth();
                float f = this.f125831c;
                outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
            } else if (this.f125830b) {
                outline.setRoundRect(0, (int) (((float) 0) - this.f125831c), view.getWidth(), view.getHeight(), this.f125831c);
            }
        }
    }

    /* renamed from: kw0.a$d */
    public static final class C46748d implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ MMNeat7extView f125832d;

        /* renamed from: e */
        public final /* synthetic */ int f125833e;

        /* renamed from: kw0.a$d$a */
        public static final class C46749a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f125834d;

            /* renamed from: e */
            public final /* synthetic */ MMNeat7extView f125835e;

            public C46749a(int i, MMNeat7extView mMNeat7extView) {
                this.f125834d = i;
                this.f125835e = mMNeat7extView;
            }

            public final void run() {
                C46746a aVar = C46746a.f125826a;
                int i = this.f125834d;
                int width = this.f125835e.getWidth();
                C46746a.f125827b.put(Integer.valueOf(i), Integer.valueOf(width));
            }
        }

        public C46748d(MMNeat7extView mMNeat7extView, int i) {
            this.f125832d = mMNeat7extView;
            this.f125833e = i;
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = this.f125832d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            MMNeat7extView mMNeat7extView = this.f125832d;
            mMNeat7extView.post(new C46749a(this.f125833e, mMNeat7extView));
            return true;
        }
    }

    /* renamed from: kw0.a$a */
    public static final class C46750a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f125836d;

        /* renamed from: e */
        public final /* synthetic */ int f125837e;

        /* renamed from: f */
        public final /* synthetic */ int f125838f;

        /* renamed from: g */
        public final /* synthetic */ View f125839g;

        public C46750a(View view, int i, int i2, View view2) {
            this.f125836d = view;
            this.f125837e = i;
            this.f125838f = i2;
            this.f125839g = view2;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f125836d.getHitRect(rect);
            int b = C76577a.m92151b(this.f125836d.getContext(), this.f125837e);
            int b2 = C76577a.m92151b(this.f125836d.getContext(), this.f125838f);
            rect.left += b;
            rect.top += b2;
            rect.right += b;
            rect.bottom += b2;
            this.f125839g.setTouchDelegate(new TouchDelegate(rect, this.f125836d));
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m52038k(C46746a aVar, View view, float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        aVar.mo71977j(view, f, z, z2);
    }

    /* renamed from: a */
    public final void mo71968a(MMNeat7extView mMNeat7extView, CharSequence charSequence, Drawable drawable, int i) {
        C87412m.m108594g(mMNeat7extView, "tv");
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(drawable, "drawable");
        mMNeat7extView.mo154992j(TextUtils.TruncateAt.END, 0.0f);
        C76003c cVar = new C76003c(drawable, 1);
        SpannableString spannableString = new SpannableString("@");
        spannableString.setSpan(cVar, 0, 1, 33);
        Context context = mMNeat7extView.getContext();
        C87412m.m108593f(context, "tv.context");
        Drawable drawable2 = context.getResources().getDrawable(C0966R.C0969drawable.ags);
        drawable2.setBounds(0, 0, C76577a.m92151b(context, i), (int) mMNeat7extView.getTextSize());
        C76003c cVar2 = new C76003c(drawable2, 1);
        SpannableString spannableString2 = new SpannableString("@");
        spannableString2.setSpan(cVar2, 0, 1, 33);
        mMNeat7extView.mo104279b(TextUtils.concat(new CharSequence[]{charSequence, spannableString2, spannableString}));
    }

    /* renamed from: b */
    public final void mo71969b(ViewParent viewParent, View view, int i, int i2) {
        if (view != null && viewParent != null) {
            View view2 = viewParent instanceof View ? (View) viewParent : null;
            if (view2 != null) {
                view2.post(new C46750a(view, i, i2, view2));
            }
        }
    }

    /* renamed from: c */
    public final String mo71970c(View view) {
        C87412m.m108594g(view, "view");
        StringBuilder sb = new StringBuilder();
        for (View view2 : mo71971d(view)) {
            if (view2.getVisibility() == 0) {
                sb.append(view2 instanceof MMNeat7extView ? ((MMNeat7extView) view2).mo154968a() : view2 instanceof TextView ? ((TextView) view2).getText() : "");
                sb.append("，");
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "accessibilityDesc.toString()");
        return sb4;
    }

    /* renamed from: d */
    public final List<View> mo71971d(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() != 0) {
                return C64186f0.f181907d;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C87412m.m108593f(childAt, "viewChild");
                arrayList.add(childAt);
                arrayList.addAll(mo71971d(childAt));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final Matrix mo71972e(ImageView imageView, Bitmap bitmap) {
        C87412m.m108594g(imageView, "containerImageView");
        C87412m.m108594g(bitmap, "fgBitmap");
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        RectF rectF2 = new RectF();
        rectF2.set(0.0f, 0.0f, (float) imageView.getWidth(), (float) imageView.getHeight());
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        return matrix;
    }

    /* renamed from: f */
    public final int mo71973f(Context context) {
        C87412m.m108594g(context, "context");
        try {
            return C74783i3.m89537a(context).f24704a;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizViewUtils", e, "getRealScreenWidth exception", new Object[0]);
            return 0;
        }
    }

    /* renamed from: g */
    public final int mo71974g(Context context) {
        C87412m.m108594g(context, "context");
        return context.getResources().getConfiguration().orientation == 1 ? mo71973f(context) : mo71973f(context) - C75044y4.m89991c(context);
    }

    /* renamed from: h */
    public final String mo71975h(TextView textView) {
        C87412m.m108594g(textView, "<this>");
        return textView.getVisibility() == 0 ? textView.getText().toString() : "";
    }

    /* renamed from: i */
    public final int mo71976i(View view, View view2) {
        if (view == null || view2 == null || view == view2) {
            return 0;
        }
        int i = 0;
        while (view2 != view) {
            i += view2.getTop();
            Log.m105927v("MicroMsg.BizViewUtils", "alvinluo getViewTop top: %d", Integer.valueOf(i));
            if (!(view2.getParent() instanceof View)) {
                break;
            }
            ViewParent parent = view2.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            view2 = (View) parent;
        }
        return i;
    }

    /* renamed from: j */
    public final void mo71977j(View view, float f, boolean z, boolean z2) {
        if (f > 0.0f) {
            if (view != null) {
                view.setOutlineProvider(new C46747c(z, z2, f));
            }
            if (view != null) {
                view.setClipToOutline(true);
            }
        }
    }

    /* renamed from: l */
    public final void mo71978l(Context context, MMNeat7extView mMNeat7extView, int i, CharSequence charSequence, int i2) {
        int i3;
        int i4;
        int i5;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(mMNeat7extView, "tv");
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        mMNeat7extView.mo104279b(charSequence);
        if (mMNeat7extView.getWidth() > 0) {
            i3 = mMNeat7extView.getWidth();
        } else {
            if (f125827b.containsKey(Integer.valueOf(i2))) {
                Integer num = f125827b.get(Integer.valueOf(i2));
                C87412m.m108591d(num);
                i3 = num.intValue();
            } else {
                f125827b.put(Integer.valueOf(i2), 0);
                i3 = 0;
            }
        }
        if (i3 <= 0) {
            ViewTreeObserver viewTreeObserver = mMNeat7extView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new C46748d(mMNeat7extView, i2));
            }
            if (i2 == 0 || i2 == 11) {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 48);
            } else if (i2 == 1) {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 136);
            } else if (i2 == 2 || i2 == 21) {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 64);
            } else if (i2 == 3) {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 136);
            } else if (i2 == 4 || i2 == 41) {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 64);
            } else if (i2 == 5) {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 144);
            } else {
                i4 = C76577a.m92145A(context);
                i5 = C76577a.m92151b(context, 64);
            }
            i3 = i4 - i5;
        }
        Drawable drawable = context.getResources().getDrawable(i);
        int textSize = (int) mMNeat7extView.getTextSize();
        int intrinsicWidth = (drawable.getIntrinsicWidth() * textSize) / drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, textSize);
        mMNeat7extView.mo154992j(TextUtils.TruncateAt.END, ((float) intrinsicWidth) + ((float) C76577a.m92151b(context, 9)));
        C79150a i6 = mMNeat7extView.mo154990i(i3, Integer.MAX_VALUE);
        if (i6 != null) {
            int m0 = ((C112481c) i6).mo109129m0(mMNeat7extView.getMaxLines() - 1);
            if (m0 <= 0) {
                mo71968a(mMNeat7extView, charSequence, drawable, 8);
                return;
            }
            String obj = charSequence.subSequence(0, charSequence.length() - m0).toString();
            mo71968a(mMNeat7extView, obj + 8230, drawable, 8);
        } else {
            mo71968a(mMNeat7extView, charSequence, drawable, 8);
        }
        mMNeat7extView.setContentDescription(mMNeat7extView.mo154968a() + 65292 + mMNeat7extView.getContext().getResources().getString(C0966R.string.gw8));
    }

    /* renamed from: m */
    public final void mo71979m(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: n */
    public final void mo71980n(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
