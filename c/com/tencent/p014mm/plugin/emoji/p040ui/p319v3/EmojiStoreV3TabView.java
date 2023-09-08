package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import xi3.C78844a;
import z04.C112551y;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\tR\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3TabView;", "Landroid/view/ViewGroup;", "", "pxValue", "Lrx3/b0;", "setTitleTextSize", "", "colors", "setTitleTextColor", "", "str", "setTitleText", "resId", "getText", "getUnread", "unread", "setUnread", "i", "I", "getTotal", "()I", "setTotal", "(I)V", "total", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView */
public final class EmojiStoreV3TabView extends ViewGroup {

    /* renamed from: d */
    public final String f110679d;

    /* renamed from: e */
    public final int f110680e;

    /* renamed from: f */
    public TextView f110681f;

    /* renamed from: g */
    public ImageView f110682g;

    /* renamed from: h */
    public TextView f110683h;

    /* renamed from: i */
    public int f110684i;

    /* renamed from: j */
    public int f110685j;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView$a */
    public static final class C41079a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextView f110686d;

        /* renamed from: e */
        public final /* synthetic */ String f110687e;

        /* renamed from: f */
        public final /* synthetic */ EmojiStoreV3TabView f110688f;

        public C41079a(TextView textView, String str, EmojiStoreV3TabView emojiStoreV3TabView) {
            this.f110686d = textView;
            this.f110687e = str;
            this.f110688f = emojiStoreV3TabView;
        }

        public final void run() {
            this.f110686d.setText(this.f110687e);
            this.f110686d.setBackgroundResource(C45081s1.m49933b(this.f110688f.getContext(), Integer.parseInt(this.f110687e)));
            this.f110688f.mo64151a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f110679d = "MicroMsg.EmojiStoreV3TabView";
        this.f110680e = 2;
        this.f110684i = 3;
        TextView textView = new TextView(context);
        this.f110681f = textView;
        textView.setSingleLine();
        textView.setTextColor(textView.getResources().getColorStateList(C0966R.color.FG_1));
        setTitleTextSize((float) C76577a.m92157h(context, C0966R.dimen.f3628l));
        textView.setText("");
        addView(this.f110681f);
        ImageView imageView = new ImageView(context);
        this.f110682g = imageView;
        imageView.setBackgroundResource(C0966R.C0969drawable.az5);
        imageView.setVisibility(4);
        addView(this.f110682g);
        TextView textView2 = new TextView(context);
        this.f110683h = textView2;
        textView2.setTextColor(textView2.getResources().getColor(C0966R.color.al_));
        textView2.setTextSize(1, 11.0f);
        textView2.setBackgroundResource(C45081s1.m49932a(context));
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        textView2.setVisibility(4);
        addView(this.f110683h);
        mo64151a();
        this.f110685j = getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
    }

    /* renamed from: a */
    public final void mo64151a() {
        Log.m105919d(this.f110679d, "build: %d desc, unread: %s", 0, getUnread());
        C78844a.C15689b.f42385a.mo108840e(this, getText(), getUnread(), 0);
    }

    public final String getText() {
        TextView textView = this.f110681f;
        return String.valueOf(textView != null ? textView.getText() : null);
    }

    public final int getTotal() {
        return this.f110684i;
    }

    public final String getUnread() {
        TextView textView = this.f110683h;
        return String.valueOf(textView != null ? textView.getText() : null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        TextView textView = this.f110681f;
        if (textView != null) {
            int measuredWidth = (i5 - textView.getMeasuredWidth()) / 2;
            int measuredWidth2 = textView.getMeasuredWidth() + measuredWidth;
            int measuredHeight = (i6 - textView.getMeasuredHeight()) / 2;
            textView.layout(measuredWidth, measuredHeight, measuredWidth2, textView.getMeasuredHeight() + measuredHeight);
            ImageView imageView = this.f110682g;
            if (imageView != null) {
                int i7 = this.f110685j + measuredWidth2;
                int measuredHeight2 = (i6 - imageView.getMeasuredHeight()) / 2;
                imageView.layout(i7, measuredHeight2, imageView.getMeasuredWidth() + i7, imageView.getMeasuredHeight() + measuredHeight2);
            }
            TextView textView2 = this.f110683h;
            if (textView2 == null) {
                return;
            }
            if (measuredWidth - this.f110685j < textView2.getMeasuredWidth()) {
                int measuredWidth3 = i5 - textView2.getMeasuredWidth();
                int measuredHeight3 = (i6 - textView2.getMeasuredHeight()) / 2;
                textView2.layout(measuredWidth3, measuredHeight3, textView2.getMeasuredWidth() + measuredWidth3, textView2.getMeasuredHeight() + measuredHeight3);
                return;
            }
            int i8 = measuredWidth2 + this.f110685j;
            int measuredHeight4 = (i6 - textView2.getMeasuredHeight()) / 2;
            textView2.layout(i8, measuredHeight4, textView2.getMeasuredWidth() + i8, textView2.getMeasuredHeight() + measuredHeight4);
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) + getPaddingLeft() + getPaddingRight();
        ImageView imageView = this.f110682g;
        if (imageView != null && imageView.getVisibility() == 0) {
            ImageView imageView2 = this.f110682g;
            size = size + (imageView2 != null ? imageView2.getMeasuredWidth() : 0) + C79406f.m96347a(getContext(), (float) this.f110685j);
        }
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.f110681f;
        if (textView != null) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        ImageView imageView3 = this.f110682g;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        TextView textView2 = this.f110683h;
        if (textView2 != null) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        }
        setMeasuredDimension(size, size2);
    }

    public final void setTitleText(String str) {
        C87412m.m108594g(str, "str");
        TextView textView = this.f110681f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setTitleTextColor(int i) {
        TextView textView = this.f110681f;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setTitleTextSize(float f) {
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        boolean isChineseAppLang = LocaleUtil.isChineseAppLang();
        boolean i = C112551y.m153809i(applicationLanguage, "en", true);
        int p = isChineseAppLang ? (int) (C76577a.m92165p(getContext()) * ((float) C76577a.m92151b(getContext(), this.f110680e))) : 0;
        TextView textView = this.f110681f;
        if (textView != null) {
            textView.setTextSize(0, f);
            if (isChineseAppLang) {
                textView.setTextSize(0, textView.getTextSize() + ((float) p));
                textView.setTypeface((Typeface) null, 0);
            } else if (i) {
                textView.setTypeface((Typeface) null, 1);
            }
        }
    }

    public final void setTotal(int i) {
        this.f110684i = i;
    }

    public final void setUnread(String str) {
        C87412m.m108594g(str, "unread");
        if (Util.isNullOrNil(str)) {
            TextView textView = this.f110683h;
            if (textView != null) {
                textView.setVisibility(4);
                return;
            }
            return;
        }
        TextView textView2 = this.f110683h;
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.post(new C41079a(textView2, str, this));
        }
    }

    public final void setTitleText(int i) {
        TextView textView = this.f110681f;
        if (textView != null) {
            textView.setText(i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3TabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
