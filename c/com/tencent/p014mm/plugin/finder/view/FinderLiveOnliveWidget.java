package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p1050v2.C111325g;
import p151er.C58678p;
import p151er.C7775q;
import v00.C14402a;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B!\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u0004\u0018\u00010\tR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038B@\u0002X\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00038B@\u0002X\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038B@\u0002X\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00038B@\u0002X\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveOnliveWidget;", "Landroid/widget/LinearLayout;", "Ler/p;", "", "visibility", "Lrx3/b0;", "setVisibility", "style", "setLogoStyle", "", "text", "setText", "getText", "n", "Ljava/lang/Integer;", "getLogoViewW", "()Ljava/lang/Integer;", "logoViewW", "o", "getLogoViewH", "logoViewH", "x", "getDescW", "descW", "y", "getDescH", "descH", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "finder-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget */
public final class FinderLiveOnliveWidget extends LinearLayout implements C58678p {

    /* renamed from: F */
    public static final /* synthetic */ int f17843F = 0;

    /* renamed from: A */
    public int f17844A;

    /* renamed from: B */
    public int f17845B;

    /* renamed from: C */
    public int f17846C = C79406f.m96347a(getContext(), 10.0f);

    /* renamed from: D */
    public boolean f17847D;

    /* renamed from: E */
    public boolean f17848E;

    /* renamed from: d */
    public int f17849d = 2;

    /* renamed from: e */
    public int f17850e;

    /* renamed from: f */
    public Drawable f17851f;

    /* renamed from: g */
    public String f17852g;

    /* renamed from: h */
    public PAGView f17853h;

    /* renamed from: i */
    public ImageView f17854i;

    /* renamed from: j */
    public TextView f17855j;

    /* renamed from: n */
    public Integer f17856n = 0;

    /* renamed from: o */
    public Integer f17857o = 0;

    /* renamed from: p */
    public int f17858p;

    /* renamed from: q */
    public int f17859q;

    /* renamed from: r */
    public int f17860r;

    /* renamed from: s */
    public boolean f17861s;

    /* renamed from: t */
    public boolean f17862t;

    /* renamed from: u */
    public boolean f17863u;

    /* renamed from: v */
    public int f17864v;

    /* renamed from: w */
    public String f17865w;

    /* renamed from: x */
    public Integer f17866x = 0;

    /* renamed from: y */
    public Integer f17867y = 0;

    /* renamed from: z */
    public int f17868z;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget$a */
    public static final class C3965a {
        public C3965a(C8480h hVar) {
        }
    }

    static {
        new C3965a((C8480h) null);
        ((C7775q) C86312j.m106911c(C7775q.class)).tryLoadLibrary();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveOnliveWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo4627c(attributeSet, 0);
        mo4626b();
    }

    private final Integer getDescH() {
        Integer num;
        Integer num2 = this.f17867y;
        if ((num2 != null && num2.intValue() == 0) || (num = this.f17867y) == null) {
            return -2;
        }
        return num;
    }

    private final Integer getDescW() {
        Integer num;
        Integer num2 = this.f17866x;
        if ((num2 != null && num2.intValue() == 0) || (num = this.f17866x) == null) {
            return -2;
        }
        return num;
    }

    private final Integer getLogoViewH() {
        Integer num;
        Integer num2 = this.f17857o;
        if ((num2 != null && num2.intValue() == 0) || (num = this.f17857o) == null) {
            return -2;
        }
        return num;
    }

    private final Integer getLogoViewW() {
        Integer num;
        Integer num2 = this.f17856n;
        if ((num2 != null && num2.intValue() == 0) || (num = this.f17856n) == null) {
            return -2;
        }
        return num;
    }

    /* renamed from: a */
    public void mo4625a() {
        PAGView pAGView = this.f17853h;
        if (pAGView != null) {
            pAGView.stop();
        }
    }

    /* renamed from: b */
    public final void mo4626b() {
        PAGView pAGView;
        Class cls = C7775q.class;
        setOrientation(0);
        boolean z = this.f17861s;
        if (!z && !this.f17863u && this.f17864v == 0) {
            throw new Exception("neither amin or logo been set");
        } else if (!z || (!this.f17863u && this.f17864v == 0)) {
            if (this.f17850e != 0) {
                setBackground(this.f17851f);
            }
            if (this.f17861s) {
                if (!((C7775q) C86312j.m106911c(cls)).isInstalled("xlab")) {
                    Log.m105924i("Finder.LiveOnliveWidget", "showAnim fail,pag not ready!");
                } else {
                    if (this.f17853h == null) {
                        this.f17853h = new PAGView(getContext());
                    }
                    Integer logoViewW = getLogoViewW();
                    C87412m.m108591d(logoViewW);
                    int intValue = logoViewW.intValue();
                    Integer logoViewH = getLogoViewH();
                    C87412m.m108591d(logoViewH);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(intValue, logoViewH.intValue());
                    layoutParams.setMargins(this.f17858p, 0, this.f17859q, 0);
                    layoutParams.gravity = 16;
                    PAGView pAGView2 = this.f17853h;
                    if (pAGView2 != null) {
                        pAGView2.setLayoutParams(layoutParams);
                    }
                    if (((C7775q) C86312j.m106911c(cls)).isInstalled("pag")) {
                        if (!Util.isNullOrNil(this.f17852g)) {
                            PAGView pAGView3 = this.f17853h;
                            if (pAGView3 != null) {
                                pAGView3.setComposition(PAGFile.Load(getContext().getAssets(), this.f17852g));
                            }
                        } else if (this.f17860r == getResources().getColor(C0966R.color.f3441zk)) {
                            PAGView pAGView4 = this.f17853h;
                            if (pAGView4 != null) {
                                pAGView4.setComposition(PAGFile.Load(getContext().getAssets(), "finder_live_logo_amin_red.pag"));
                            }
                        } else {
                            PAGView pAGView5 = this.f17853h;
                            if (pAGView5 != null) {
                                pAGView5.setComposition(PAGFile.Load(getContext().getAssets(), "finder_live_logo_amin_white.pag"));
                            }
                        }
                    }
                    addView(this.f17853h, 0);
                    PAGView pAGView6 = this.f17853h;
                    if (pAGView6 != null) {
                        pAGView6.setRepeatCount(-1);
                    }
                    if (this.f17862t && (pAGView = this.f17853h) != null) {
                        pAGView.play();
                    }
                    Log.m105924i("Finder.LiveOnliveWidget", "showAnim auto play:" + this.f17862t);
                }
            }
            if (this.f17863u) {
                if (this.f17854i == null) {
                    this.f17854i = new ImageView(getContext());
                }
                if (this.f17864v != 0) {
                    ImageView imageView = this.f17854i;
                    if (imageView != null) {
                        Resources resources = getContext().getResources();
                        int i = this.f17864v;
                        ThreadLocal<TypedValue> threadLocal = C111325g.f333301a;
                        imageView.setImageDrawable(resources.getDrawable(i, (Resources.Theme) null));
                    }
                } else {
                    ImageView imageView2 = this.f17854i;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.finder_live_logo, this.f17860r));
                    }
                }
                Integer logoViewW2 = getLogoViewW();
                C87412m.m108591d(logoViewW2);
                int intValue2 = logoViewW2.intValue();
                Integer logoViewH2 = getLogoViewH();
                C87412m.m108591d(logoViewH2);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(intValue2, logoViewH2.intValue());
                layoutParams2.setMargins(this.f17858p, 0, this.f17859q, 0);
                layoutParams2.gravity = 16;
                ImageView imageView3 = this.f17854i;
                if (imageView3 != null) {
                    imageView3.setLayoutParams(layoutParams2);
                }
                addView(this.f17854i, 0);
                Log.m105924i("Finder.LiveOnliveWidget", "showImage logoImgId:" + this.f17864v);
            }
            mo4628d();
        } else {
            throw new Exception("either amin or logo been set");
        }
    }

    /* renamed from: c */
    public final void mo4627c(AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, C14402a.f39979a, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…nliveWidget, defStyle, 0)");
            int i2 = obtainStyledAttributes.getInt(17, 0);
            this.f17850e = i2;
            if (i2 == 1) {
                this.f17851f = getContext().getResources().getDrawable(C0966R.C0969drawable.a0d, (Resources.Theme) null);
                this.f17860r = getResources().getColor(C0966R.color.f2975b6);
                this.f17856n = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd));
                this.f17857o = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd));
                this.f17845B = getContext().getResources().getColor(C0966R.color.f2975b6);
                this.f17846C = C79406f.m96347a(getContext(), 10.0f);
                this.f17868z = C79406f.m96347a(getContext(), 2.0f);
                this.f17865w = getContext().getResources().getString(C0966R.string.efu);
                this.f17847D = false;
            } else if (i2 == 2) {
                this.f17851f = getContext().getResources().getDrawable(C0966R.C0969drawable.a06, (Resources.Theme) null);
                this.f17860r = getResources().getColor(C0966R.color.f3441zk);
                this.f17856n = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd));
                this.f17857o = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd));
                this.f17845B = getContext().getResources().getColor(C0966R.color.f3441zk);
                this.f17846C = C79406f.m96347a(getContext(), 10.0f);
                this.f17868z = C79406f.m96347a(getContext(), 2.0f);
                this.f17865w = getContext().getResources().getString(C0966R.string.efu);
                this.f17847D = false;
            } else if (i2 == 3) {
                this.f17851f = null;
                this.f17860r = getResources().getColor(C0966R.color.f2975b6);
                this.f17856n = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
                this.f17857o = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
                this.f17845B = getContext().getResources().getColor(C0966R.color.f2975b6);
                this.f17846C = C79406f.m96347a(getContext(), 17.0f);
                this.f17868z = C79406f.m96347a(getContext(), 4.0f);
                this.f17865w = getContext().getResources().getString(C0966R.string.dkt);
                this.f17847D = true;
            } else if (i2 == 4) {
                this.f17851f = null;
                this.f17860r = getResources().getColor(C0966R.color.f2975b6);
                this.f17856n = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3738cr));
                this.f17857o = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3738cr));
                this.f17845B = getContext().getResources().getColor(C0966R.color.f2975b6);
                this.f17846C = C79406f.m96347a(getContext(), 15.0f);
                this.f17868z = C79406f.m96347a(getContext(), 4.0f);
                this.f17865w = getContext().getResources().getString(C0966R.string.dkt);
                this.f17847D = true;
            } else if (i2 == 5) {
                this.f17851f = null;
                this.f17860r = getResources().getColor(C0966R.color.f3441zk);
                this.f17856n = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
                this.f17857o = Integer.valueOf(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df));
                this.f17865w = "";
            }
            int i3 = obtainStyledAttributes.getInt(18, 2);
            this.f17849d = i3;
            if (i3 == 1) {
                this.f17861s = true;
                this.f17863u = false;
                this.f17862t = obtainStyledAttributes.getBoolean(11, false);
                this.f17852g = obtainStyledAttributes.getString(0);
            } else {
                this.f17861s = false;
                this.f17863u = true;
                this.f17864v = obtainStyledAttributes.getResourceId(14, 0);
            }
            if (obtainStyledAttributes.hasValue(12)) {
                this.f17860r = obtainStyledAttributes.getColor(12, getResources().getColor(C0966R.color.f2975b6));
            }
            if (obtainStyledAttributes.hasValue(19)) {
                this.f17856n = Integer.valueOf((int) obtainStyledAttributes.getDimension(19, 0.0f));
            }
            if (obtainStyledAttributes.hasValue(13)) {
                this.f17857o = Integer.valueOf((int) obtainStyledAttributes.getDimension(13, 0.0f));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                this.f17858p = (int) obtainStyledAttributes.getDimension(15, 0.0f);
            }
            if (obtainStyledAttributes.hasValue(16)) {
                this.f17859q = (int) obtainStyledAttributes.getDimension(16, 0.0f);
            }
            if (obtainStyledAttributes.hasValue(6)) {
                this.f17865w = obtainStyledAttributes.getString(6);
            }
            if (obtainStyledAttributes.hasValue(10)) {
                this.f17866x = Integer.valueOf((int) obtainStyledAttributes.getDimension(10, 0.0f));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.f17867y = Integer.valueOf((int) obtainStyledAttributes.getDimension(3, 0.0f));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                this.f17868z = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            }
            if (obtainStyledAttributes.hasValue(5)) {
                this.f17844A = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.f17845B = obtainStyledAttributes.getColor(2, this.f17860r);
            }
            if (obtainStyledAttributes.hasValue(9)) {
                this.f17846C = (int) obtainStyledAttributes.getDimension(9, 0.0f);
            }
            if (obtainStyledAttributes.hasValue(7)) {
                this.f17847D = obtainStyledAttributes.getBoolean(7, false);
            }
            if (obtainStyledAttributes.hasValue(8)) {
                this.f17848E = obtainStyledAttributes.getBoolean(8, false);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.f17851f = obtainStyledAttributes.getDrawable(1);
            }
            obtainStyledAttributes.recycle();
            if (BuildInfo.DEBUG) {
                Log.m105924i("Finder.LiveOnliveWidget", "[initAttribute],mode:" + this.f17850e + ",logoStyle:" + this.f17849d + ",logoAnimationFile:" + this.f17852g + ",logoColor:" + this.f17860r + ",logoViewW:" + getLogoViewW() + ",logoViewH:" + getLogoViewH() + ",logoMarginLeft:" + this.f17858p + ",logoMarginRight:" + this.f17859q + ",logoAnimAutoPlay" + this.f17862t + ",\\n text:" + this.f17865w + ",descW:" + getDescW() + ",descH:" + getDescH() + ",descMarginLeft:" + this.f17868z + ",descMarginRight:" + this.f17844A + ",descColor:" + this.f17845B + ",descTextSize:" + this.f17846C);
            }
        }
    }

    /* renamed from: d */
    public final void mo4628d() {
        TextView textView;
        String str = this.f17865w;
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            if (this.f17855j == null) {
                this.f17855j = new TextView(getContext());
            }
            Integer descW = getDescW();
            C87412m.m108591d(descW);
            int intValue = descW.intValue();
            Integer descH = getDescH();
            C87412m.m108591d(descH);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(intValue, descH.intValue());
            layoutParams.setMargins(this.f17868z, 0, this.f17844A, 0);
            layoutParams.gravity = 16;
            TextView textView2 = this.f17855j;
            if (textView2 != null) {
                textView2.setLayoutParams(layoutParams);
            }
            TextView textView3 = this.f17855j;
            if (textView3 != null) {
                textView3.setText(this.f17865w);
            }
            TextView textView4 = this.f17855j;
            if (textView4 != null) {
                textView4.setGravity(16);
            }
            TextView textView5 = this.f17855j;
            if (textView5 != null) {
                textView5.setTextSize(0, (float) this.f17846C);
            }
            TextView textView6 = this.f17855j;
            if (textView6 != null) {
                textView6.setTextColor(this.f17845B);
            }
            TextView textView7 = this.f17855j;
            if (textView7 != null) {
                textView7.setIncludeFontPadding(false);
            }
            if (this.f17847D) {
                TextView textView8 = this.f17855j;
                C85875k4.m106189j0(textView8 != null ? textView8.getPaint() : null, 0.8f);
            }
            if (this.f17848E && (textView = this.f17855j) != null) {
                textView.setShadowLayer(4.0f, 0.0f, 1.0f, Color.parseColor("#66000000"));
            }
            int childCount = getChildCount();
            if (childCount < 0 || childCount >= 2) {
                z = false;
            }
            if (z) {
                addView(this.f17855j, getChildCount());
                Log.m105924i("Finder.LiveOnliveWidget", "showDesc desc:" + this.f17865w);
                return;
            }
            Log.m105924i("Finder.LiveOnliveWidget", "showDesc fail,childCount:" + getChildCount() + ", desc:" + this.f17865w);
        }
    }

    public final String getText() {
        return this.f17865w;
    }

    public void setLogoStyle(int i) {
        this.f17849d = i;
    }

    public final void setText(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        if (C87412m.m108589b(this.f17865w, str)) {
            String str2 = "same text:" + str + '!';
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                Log.m105918d("Finder.LiveOnliveWidget", str2);
                return;
            }
            return;
        }
        if (indexOfChild(this.f17855j) != -1) {
            removeView(this.f17855j);
            Log.m105924i("Finder.LiveOnliveWidget", "hideDesc");
        }
        this.f17865w = str;
        mo4628d();
    }

    public void setVisibility(int i) {
        PAGView pAGView;
        PAGView pAGView2;
        super.setVisibility(i);
        if (i != 0) {
            if (this.f17861s && (pAGView2 = this.f17853h) != null) {
                pAGView2.stop();
            }
        } else if (this.f17862t && this.f17861s && (pAGView = this.f17853h) != null) {
            pAGView.play();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveOnliveWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo4627c(attributeSet, i);
        mo4626b();
    }
}
