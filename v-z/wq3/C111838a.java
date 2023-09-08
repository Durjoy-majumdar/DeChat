package wq3;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.core.provider.AccProviderFactory;
import com.tencent.p014mm.kiss.widget.textview.StaticTextView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMVerticalTextView;
import com.tencent.p014mm.p136ui.widget.MMCollapsibleTextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.view.x2c.X2CMergeView;
import fj3.C20713c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kg3.C76577a;
import pl3.C100823c;
import sx3.C110818d0;
import sx3.C64197v;
import wq3.C111855q;

/* renamed from: wq3.a */
public abstract class C111838a implements C111849j {

    /* renamed from: a */
    public int f334873a;

    /* renamed from: b */
    public int f334874b;

    /* renamed from: c */
    public List<C38260a> f334875c;

    /* renamed from: wq3.a$a */
    public final class C38260a {

        /* renamed from: a */
        public long f101024a;

        /* renamed from: b */
        public int f101025b;

        public C38260a(C111838a aVar, String str, C38261b bVar, long j, int i, int i2, C8480h hVar) {
            str = (i2 & 1) != 0 ? "" : str;
            bVar = (i2 & 2) != 0 ? C38261b.Start : bVar;
            j = (i2 & 4) != 0 ? System.nanoTime() : j;
            i = (i2 & 8) != 0 ? -1 : i;
            C87412m.m108594g(str, "name");
            C87412m.m108594g(bVar, "type");
            this.f101024a = j;
            this.f101025b = i;
        }
    }

    /* renamed from: wq3.a$b */
    public enum C38261b {
        Start,
        End
    }

    /* renamed from: a */
    public View mo163554a(Context context, ViewGroup viewGroup, boolean z) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(viewGroup, "parent");
        View e = mo163512e(context);
        if (e == null) {
            return null;
        }
        if (e instanceof X2CMergeView) {
            ArrayList<View> arrayList = new ArrayList<>();
            X2CMergeView x2CMergeView = (X2CMergeView) e;
            int childCount = x2CMergeView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = x2CMergeView.getChildAt(i);
                C87412m.m108593f(childAt, "view.getChildAt(index)");
                arrayList.add(childAt);
            }
            x2CMergeView.removeAllViews();
            for (View layoutParams : arrayList) {
                C111855q.f334885a.getClass();
                ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(C111855q.f334888d);
                ViewGroup.LayoutParams layoutParams2 = layoutParams.getLayoutParams();
                C87412m.m108593f(layoutParams2, "it.layoutParams");
                C87412m.m108593f(generateLayoutParams, "layoutParams");
                generateLayoutParams.width = layoutParams2.width;
                generateLayoutParams.height = layoutParams2.height;
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (generateLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) generateLayoutParams;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
                    marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
                    marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
                    marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
                    marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                    marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
                }
                viewGroup.addView(e);
            }
        } else {
            C111855q.f334885a.getClass();
            e.setLayoutParams(viewGroup.generateLayoutParams(C111855q.f334888d));
            Object tag = e.getTag(C0966R.C0970id.mku);
            C87412m.m108592e(tag, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) tag;
            ViewGroup.LayoutParams layoutParams4 = e.getLayoutParams();
            C87412m.m108593f(layoutParams4, "view.layoutParams");
            layoutParams4.width = layoutParams3.width;
            layoutParams4.height = layoutParams3.height;
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.rightMargin = marginLayoutParams4.rightMargin;
                marginLayoutParams3.topMargin = marginLayoutParams4.topMargin;
                marginLayoutParams3.leftMargin = marginLayoutParams4.leftMargin;
                marginLayoutParams3.bottomMargin = marginLayoutParams4.bottomMargin;
                marginLayoutParams3.setMarginStart(marginLayoutParams4.getMarginStart());
                marginLayoutParams3.setMarginEnd(marginLayoutParams4.getMarginEnd());
            }
            if (z) {
                viewGroup.addView(e);
            }
        }
        return e;
    }

    /* renamed from: b */
    public View mo163555b(Context context, AttributeSet attributeSet, String str, int i) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(attributeSet, "attributeSet");
        C87412m.m108594g(str, "name");
        return mo163513g(context, attributeSet, str, i);
    }

    /* renamed from: d */
    public View mo163556d(Context context) {
        C87412m.m108594g(context, "ctx");
        return mo163512e(context);
    }

    /* renamed from: e */
    public abstract View mo163512e(Context context);

    /* renamed from: f */
    public final void mo163557f(Context context, View view, String str, boolean z, int i) {
        List<C38260a> list;
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(str, "name");
        if (view != null) {
            mo163563n(context, view, str);
            if (view instanceof C111847h) {
                ((C111847h) view).onFinishInflate();
            }
            if (z) {
                view.setTag(C0966R.C0970id.kdq, Integer.valueOf(getLayoutId()));
                AccProviderFactory.INSTANCE.onInflateRootAsync(view);
            }
        }
        if (Log.getLogLevel() <= 1 && mo163562m() && !C87412m.m108589b(str, "include") && (list = this.f334875c) != null) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C38260a(this, str, C38261b.End, 0, i, 4, (C8480h) null));
        }
    }

    /* renamed from: g */
    public abstract View mo163513g(Context context, AttributeSet attributeSet, String str, int i);

    /* renamed from: h */
    public final void mo163558h(Context context, View view, String str, int i) {
        List<C38260a> list;
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(str, "name");
        if (view != null) {
            mo163563n(context, view, str);
        }
        if (Log.getLogLevel() <= 1 && !C87412m.m108589b(str, "include") && (list = this.f334875c) != null) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C38260a(this, str, C38261b.End, 0, i, 4, (C8480h) null));
        }
    }

    /* renamed from: i */
    public final View mo163559i(Context context, String str, int i) {
        List<C38260a> list;
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(str, "name");
        if (Log.getLogLevel() <= 1 && mo163562m() && (list = this.f334875c) != null) {
            ((ArrayList) list).add(new C38260a(this, str, (C38261b) null, 0, i, 6, (C8480h) null));
        }
        C111848i d = C111855q.f334885a.mo163608b().mo163576d();
        View b = d != null ? d.mo61584b(context, str) : null;
        if (b != null && C87412m.m108589b(b.getTag(C0966R.C0970id.mkt), 1)) {
            this.f334873a++;
        }
        return b;
    }

    /* renamed from: j */
    public final AttributeSet mo163560j() {
        C111855q.f334885a.getClass();
        return C111855q.f334888d;
    }

    /* renamed from: k */
    public abstract String mo163515k();

    /* renamed from: l */
    public final float mo163561l(Context context, int i) {
        float p = C76577a.m92165p(context);
        return ((!C85875k4.m106153J(p, C76577a.m92169t(context)) && !C85875k4.m106153J(p, C76577a.m92170u(context))) || i == 1690268602 || i == -771693267 || i == 200122345 || i == 999067519 || i == -472572735 || i == -602931483 || i == -1992485345 || i == 1262601901 || i == 295445588) ? p : C76577a.m92168s(context);
    }

    /* renamed from: m */
    public final boolean mo163562m() {
        return C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    /* renamed from: n */
    public final void mo163563n(Context context, View view, String str) {
        Context context2 = context;
        View view2 = view;
        C20713c cVar = C20713c.f58572a;
        int hashCode = str.hashCode();
        if (hashCode == -938935918 || hashCode == 2001146706 || hashCode == 1666676343 || hashCode == 1601505219 || hashCode == 776382189 || hashCode == 1125864064 || hashCode == -307023012 || hashCode == 742575657 || hashCode == -1455429095 || hashCode == 1690268602 || hashCode == 913567 || hashCode == -472572735 || hashCode == 295445588 || hashCode == -720637559 || hashCode == 625619963 || hashCode == -124208923 || hashCode == 310672300 || hashCode == 1524180521 || hashCode == -1299757303 || hashCode == -527895810 || hashCode == -1374364899 || hashCode == 132421285 || hashCode == 418111674 || hashCode == 540561289 || hashCode == 1079639440 || hashCode == 2077030397 || hashCode == 2076872964 || hashCode == -771693267 || hashCode == 200122345 || hashCode == 999067519 || hashCode == -1489232690 || hashCode == -1259604263 || hashCode == -1601904316 || hashCode == 1226216429 || hashCode == 960005444 || hashCode == -1568925917 || hashCode == -251296369 || hashCode == 687897231 || hashCode == -602931483 || hashCode == -1992485345 || hashCode == 1262601901 || hashCode == -455447493 || hashCode == 1215740217 || hashCode == -978427796 || hashCode == -602460368 || hashCode == -529817397 || hashCode == -1880646591) {
            C87412m.m108594g(context2, "ctx");
            C87412m.m108594g(view2, "view");
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                float lineSpacingMultiplier = textView.getLineSpacingMultiplier();
                float lineSpacingExtra = textView.getLineSpacingExtra();
                if (((double) lineSpacingMultiplier) < 1.1d) {
                    if (lineSpacingExtra == 0.0f) {
                        textView.setLineSpacing(0.0f, 1.1f);
                    }
                }
            } else if (view2 instanceof MMNeat7extView) {
                MMNeat7extView mMNeat7extView = (MMNeat7extView) view2;
                if (((double) mMNeat7extView.getLineSpacingMultiplier()) < 1.1d) {
                    mMNeat7extView.mo154993k(0.0f, 1.1f);
                }
            } else if (view2 instanceof StaticTextView) {
                StaticTextView staticTextView = (StaticTextView) view2;
                float lineSpacingMultiplier2 = staticTextView.getLineSpacingMultiplier();
                float lineSpacingExtra2 = staticTextView.getLineSpacingExtra();
                if (((double) lineSpacingMultiplier2) < 1.1d) {
                    if (lineSpacingExtra2 == 0.0f) {
                        staticTextView.mo126801e(0.0f, 1.1f);
                    }
                }
            }
            if (C87412m.m108589b(view2.getTag(C0966R.C0970id.mio), 1)) {
                Log.m105919d("MicroMsg.X2C.BaseViewCreator", "skip set text size %s", str);
                return;
            }
            float l = mo163561l(context2, hashCode);
            if (hashCode == -938935918 || hashCode == 1690268602 || hashCode == 960005444 || hashCode == 2076872964 || hashCode == -251296369) {
                TextView textView2 = (TextView) view2;
                float textSize = (textView2.getTextSize() * l) / C76577a.m92156g(context);
                textView2.setTextSize(1, textSize);
                if (hashCode == -251296369) {
                    C103733h.m138105b(textView2, 1, (int) textSize, 1, 1);
                }
            } else if (hashCode == 2001146706 || hashCode == 687897231) {
                Button button = (Button) view2;
                float textSize2 = (button.getTextSize() * l) / C76577a.m92156g(context);
                button.setTextSize(1, textSize2);
                if (hashCode == 687897231) {
                    C103733h.m138105b(button, 1, (int) textSize2, 1, 1);
                }
            } else if (hashCode == 1666676343 || hashCode == 913567 || hashCode == -720637559 || hashCode == -124208923 || hashCode == 132421285 || hashCode == 310672300 || hashCode == 1524180521 || hashCode == -1489232690 || hashCode == 625619963 || hashCode == -978427796 || hashCode == -1880646591 || hashCode == -602460368 || hashCode == -529817397) {
                EditText editText = (EditText) view2;
                editText.setTextSize(1, (editText.getTextSize() * l) / C76577a.m92156g(context));
            } else if (hashCode == -602931483 || hashCode == -1992485345 || hashCode == 1262601901) {
                C74974a aVar = (C74974a) view2;
                aVar.setTextSize(1, (aVar.getTextSize() * l) / C76577a.m92156g(context));
            } else if (hashCode == 1601505219) {
                CheckBox checkBox = (CheckBox) view2;
                checkBox.setTextSize(1, (checkBox.getTextSize() * l) / C76577a.m92156g(context));
            } else if (hashCode == -472572735) {
                MMNeat7extView mMNeat7extView2 = (MMNeat7extView) view2;
                mMNeat7extView2.mo154994l(1, (mMNeat7extView2.getTextSize() * l) / C76577a.m92156g(context));
            } else if (hashCode == -1568925917) {
                MMVerticalTextView mMVerticalTextView = (MMVerticalTextView) view2;
                mMVerticalTextView.setTextSize(mMVerticalTextView.getTextSize() * l);
            } else if (hashCode == 295445588) {
                MMCollapsibleTextView mMCollapsibleTextView = (MMCollapsibleTextView) view2;
                mMCollapsibleTextView.mo104237w(1, (mMCollapsibleTextView.getTextSize() * l) / C76577a.m92156g(context));
            } else if (view2 instanceof TextView) {
                TextView textView3 = (TextView) view2;
                textView3.setTextSize(1, (textView3.getTextSize() * l) / C76577a.m92156g(context));
            }
            C100823c.f295336a.mo140272a(view2, 1);
        }
    }

    /* renamed from: o */
    public final void mo163564o() {
        List<C38260a> list;
        List<C38260a> list2;
        if (Log.getLogLevel() <= 1 && mo163562m() && (list = this.f334875c) != null) {
            long nanoTime = System.nanoTime();
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C38260a(this, "ViewCreate", C38261b.End, nanoTime, 0, 8, (C8480h) null));
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C38260a aVar = (C38260a) next;
                    if (i > 0) {
                        C38260a aVar2 = (C38260a) arrayList.get(i - 1);
                        list2 = list;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append('[');
                        sb4.append(aVar2.f101025b);
                        sb4.append('-');
                        sb4.append(aVar.f101025b);
                        sb4.append(": ");
                        String format = String.format("%.3fms", Arrays.copyOf(new Object[]{Float.valueOf(((float) (aVar.f101024a - aVar2.f101024a)) / 1000000.0f)}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        sb4.append(format);
                        sb4.append("] ");
                        sb.append(sb4.toString());
                    } else {
                        list2 = list;
                    }
                    i = i2;
                    list = list2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String str = "%.3fms";
            C38260a aVar3 = (C38260a) C110818d0.m150917O(list, 0);
            long j = nanoTime - (aVar3 != null ? aVar3.f101024a : 0);
            String k = mo163515k();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("create view useCacheView:");
            sb5.append(this.f334873a);
            sb5.append(" useCacheResource:");
            sb5.append(this.f334874b);
            sb5.append(" cost: ");
            String format2 = String.format(str, Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1000000.0f)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            sb5.append(format2);
            sb5.append(" detail: ");
            sb5.append(sb);
            Log.m105918d(k, sb5.toString());
            arrayList.clear();
        }
    }

    /* renamed from: p */
    public final void mo163565p() {
        this.f334873a = 0;
        this.f334874b = 0;
        if (Log.getLogLevel() <= 1 && mo163562m()) {
            ArrayList arrayList = new ArrayList();
            this.f334875c = arrayList;
            arrayList.add(new C38260a(this, "ViewCreate", (C38261b) null, 0, 0, 14, (C8480h) null));
        }
    }

    /* renamed from: q */
    public final int mo163566q(Context context, View view, String str, String str2, int i) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "value");
        if (i == 0) {
            return Color.parseColor(str2);
        }
        C91096l a = C111855q.f334885a.mo163608b().mo163573a();
        if (a == null) {
            return C76577a.m92153d(context, i);
        }
        Object a2 = a.mo90274a(i);
        if (a2 != null) {
            Integer num = a2 instanceof Integer ? (Integer) a2 : null;
            if (num != null) {
                int intValue = num.intValue();
                this.f334874b++;
                return intValue;
            }
        }
        int d = C76577a.m92153d(context, i);
        a.mo90276c(i, Integer.valueOf(d));
        return d;
    }

    /* renamed from: r */
    public final int mo163567r(Context context, View view, String str, int i, float f, int i2) {
        float applyDimension;
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "name");
        if (i2 == 0) {
            applyDimension = TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
        } else {
            C111855q.C111858c cVar = C111855q.f334885a;
            C91096l a = cVar.mo163608b().mo163573a();
            if (a != null) {
                Object a2 = a.mo90274a(i2);
                if (a2 != null) {
                    Float f2 = a2 instanceof Float ? (Float) a2 : null;
                    if (f2 != null) {
                        float floatValue = f2.floatValue();
                        this.f334874b++;
                        applyDimension = TypedValue.applyDimension(0, floatValue, context.getResources().getDisplayMetrics());
                    }
                }
                float dimension = context.getResources().getDimension(i2);
                C91096l a3 = cVar.mo163608b().mo163573a();
                if (a3 != null) {
                    a3.mo90276c(i2, Float.valueOf(dimension));
                }
                applyDimension = TypedValue.applyDimension(0, dimension, context.getResources().getDisplayMetrics());
            } else {
                applyDimension = TypedValue.applyDimension(0, context.getResources().getDimension(i2), context.getResources().getDisplayMetrics());
            }
        }
        return (int) applyDimension;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r4 = r4.newDrawable();
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo163568s(android.content.Context r3, android.view.View r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            java.lang.String r0 = "ctx"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "value"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "#"
            r1 = 0
            boolean r0 = z04.C112551y.m153819s(r6, r0, r1)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "@color/"
            boolean r0 = z04.C112551y.m153819s(r6, r0, r1)
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "@android:color/"
            boolean r0 = z04.C112551y.m153819s(r6, r0, r1)
            if (r0 == 0) goto L_0x002e
            goto L_0x007d
        L_0x002e:
            r4 = 0
            if (r7 != 0) goto L_0x0032
            return r4
        L_0x0032:
            wq3.q$c r5 = wq3.C111855q.f334885a
            wq3.k r5 = r5.mo163608b()
            wq3.l r5 = r5.mo163573a()
            if (r5 == 0) goto L_0x0078
            java.lang.Object r6 = r5.mo90274a(r7)
            if (r6 == 0) goto L_0x0064
            boolean r0 = r6 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L_0x004b
            r4 = r6
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
        L_0x004b:
            if (r4 == 0) goto L_0x0064
            int r5 = r2.f334874b
            int r5 = r5 + 1
            r2.f334874b = r5
            android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
            if (r4 == 0) goto L_0x005f
            android.graphics.drawable.Drawable r4 = r4.newDrawable()
            if (r4 != 0) goto L_0x0063
        L_0x005f:
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r3, r7)
        L_0x0063:
            return r4
        L_0x0064:
            android.graphics.drawable.Drawable r3 = kg3.C76577a.m92158i(r3, r7)
            android.graphics.drawable.Drawable$ConstantState r4 = r3.getConstantState()
            if (r4 == 0) goto L_0x0077
            android.graphics.drawable.Drawable r4 = r4.newDrawable()
            if (r4 == 0) goto L_0x0077
            r5.mo90276c(r7, r4)
        L_0x0077:
            return r3
        L_0x0078:
            android.graphics.drawable.Drawable r3 = kg3.C76577a.m92158i(r3, r7)
            return r3
        L_0x007d:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r3 = r2.mo163566q(r3, r4, r5, r6, r7)
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wq3.C111838a.mo163568s(android.content.Context, android.view.View, java.lang.String, java.lang.String, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: t */
    public final int mo163569t(Context context, View view, String str, int i, int i2) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "name");
        if (i2 == 0) {
            return i;
        }
        C91096l a = C111855q.f334885a.mo163608b().mo163573a();
        if (a == null) {
            return context.getResources().getInteger(i2);
        }
        Object a2 = a.mo90274a(i2);
        if (a2 != null) {
            Integer num = a2 instanceof Integer ? (Integer) a2 : null;
            if (num != null) {
                return num.intValue();
            }
        }
        int integer = context.getResources().getInteger(i2);
        a.mo90276c(i2, Integer.valueOf(integer));
        return integer;
    }

    /* renamed from: u */
    public final String mo163570u(Context context, View view, String str, String str2, int i) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "value");
        if (i != 0) {
            C91096l a = C111855q.f334885a.mo163608b().mo163573a();
            if (a != null) {
                Object a2 = a.mo90274a(i);
                if (a2 != null) {
                    String str3 = a2 instanceof String ? (String) a2 : null;
                    if (str3 != null) {
                        this.f334874b++;
                        return str3;
                    }
                }
                String string = context.getString(i);
                C87412m.m108593f(string, "ctx.getString(valueResId)");
                a.mo90276c(i, string);
                return string;
            }
            String string2 = context.getString(i);
            C87412m.m108593f(string2, "ctx.getString(valueResId)");
            return string2;
        } else if (TextUtils.isEmpty(str2)) {
            return str2;
        } else {
            String translate = WeChatBrands.Wordings.translate(str2);
            C87412m.m108593f(translate, "translate(raw)");
            return translate;
        }
    }

    /* renamed from: v */
    public final float mo163571v(Context context, View view, String str, int i, float f, int i2) {
        float dimension;
        float g;
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "name");
        if (i2 == 0) {
            return f;
        }
        view.setTag(C0966R.C0970id.mio, 1);
        float l = mo163561l(context, str.hashCode());
        C111855q.C111858c cVar = C111855q.f334885a;
        C91096l a = cVar.mo163608b().mo163573a();
        if (a != null) {
            Object a2 = a.mo90274a(i2);
            if (a2 != null) {
                Float f2 = a2 instanceof Float ? (Float) a2 : null;
                if (f2 != null) {
                    float floatValue = f2.floatValue();
                    this.f334874b++;
                    dimension = l * floatValue;
                    g = C76577a.m92156g(context);
                }
            }
            float dimension2 = context.getResources().getDimension(i2);
            C91096l a3 = cVar.mo163608b().mo163573a();
            if (a3 != null) {
                a3.mo90276c(i2, Float.valueOf(dimension2));
            }
            dimension = l * dimension2;
            g = C76577a.m92156g(context);
        } else {
            dimension = l * context.getResources().getDimension(i2);
            g = C76577a.m92156g(context);
        }
        return dimension / g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r6.equals("normal") == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo163572w(android.content.Context r3, android.view.View r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = this;
            java.lang.String r0 = "ctx"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r3 = "view"
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "name"
            gy3.C87412m.m108594g(r5, r3)
            java.lang.String r3 = "textStyleStr"
            gy3.C87412m.m108594g(r6, r3)
            java.lang.String r3 = "fontFamilyStr"
            gy3.C87412m.m108594g(r7, r3)
            java.lang.String r3 = "typeFaceStr"
            gy3.C87412m.m108594g(r8, r3)
            int r3 = r6.hashCode()
            r4 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            java.lang.String r5 = "italic"
            java.lang.String r0 = "bold"
            r1 = 0
            if (r3 == r4) goto L_0x0049
            r4 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r3 == r4) goto L_0x0040
            r4 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r3 == r4) goto L_0x0037
            goto L_0x004f
        L_0x0037:
            boolean r3 = r6.equals(r0)
            if (r3 != 0) goto L_0x003e
            goto L_0x004f
        L_0x003e:
            r1 = 1
            goto L_0x005e
        L_0x0040:
            java.lang.String r3 = "normal"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x005e
            goto L_0x004f
        L_0x0049:
            boolean r3 = r6.equals(r5)
            if (r3 != 0) goto L_0x005d
        L_0x004f:
            boolean r3 = z04.C112550d0.m153801u(r6, r0, r1)
            if (r3 == 0) goto L_0x005e
            boolean r3 = z04.C112550d0.m153801u(r6, r5, r1)
            if (r3 == 0) goto L_0x005e
            r1 = 3
            goto L_0x005e
        L_0x005d:
            r1 = 2
        L_0x005e:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r3 != 0) goto L_0x006e
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r7, r1)
            java.lang.String r4 = "create(fontFamilyStr, textStyleValue)"
            gy3.C87412m.m108593f(r3, r4)
            return r3
        L_0x006e:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r3 != 0) goto L_0x00b7
            int r3 = r8.hashCode()
            r4 = -1431958525(0xffffffffaaa60c03, float:-2.9495858E-13)
            if (r3 == r4) goto L_0x00a0
            r4 = 3522707(0x35c093, float:4.936364E-39)
            if (r3 == r4) goto L_0x0094
            r4 = 109326717(0x684317d, float:4.97256E-35)
            if (r3 == r4) goto L_0x0088
            goto L_0x00a8
        L_0x0088:
            java.lang.String r3 = "serif"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0091
            goto L_0x00a8
        L_0x0091:
            android.graphics.Typeface r3 = android.graphics.Typeface.SERIF
            goto L_0x00ad
        L_0x0094:
            java.lang.String r3 = "sans"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x009d
            goto L_0x00a8
        L_0x009d:
            android.graphics.Typeface r3 = android.graphics.Typeface.SANS_SERIF
            goto L_0x00ad
        L_0x00a0:
            java.lang.String r3 = "monospace"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x00ab
        L_0x00a8:
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            goto L_0x00ad
        L_0x00ab:
            android.graphics.Typeface r3 = android.graphics.Typeface.MONOSPACE
        L_0x00ad:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            java.lang.String r4 = "create(typefaceValue, textStyleValue)"
            gy3.C87412m.m108593f(r3, r4)
            return r3
        L_0x00b7:
            android.graphics.Typeface r3 = android.graphics.Typeface.defaultFromStyle(r1)
            java.lang.String r4 = "defaultFromStyle(textStyleValue)"
            gy3.C87412m.m108593f(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wq3.C111838a.mo163572w(android.content.Context, android.view.View, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.graphics.Typeface");
    }
}
