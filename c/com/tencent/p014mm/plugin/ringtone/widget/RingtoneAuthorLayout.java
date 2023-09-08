package com.tencent.p014mm.plugin.ringtone.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import x00.C66233a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\n8\u0016@\u0016X.¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/RingtoneAuthorLayout;", "Landroid/widget/LinearLayout;", "", "f", "Z", "getShowAuthProfession", "()Z", "setShowAuthProfession", "(Z)V", "showAuthProfession", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "getAuthor", "()Landroid/widget/TextView;", "setAuthor", "(Landroid/widget/TextView;)V", "author", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "getAuthIcon", "()Landroid/widget/ImageView;", "setAuthIcon", "(Landroid/widget/ImageView;)V", "authIcon", "i", "getAuthProfession", "setAuthProfession", "authProfession", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ringtone-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneAuthorLayout */
public final class RingtoneAuthorLayout extends LinearLayout {

    /* renamed from: d */
    public float f164106d;

    /* renamed from: e */
    public ColorStateList f164107e;

    /* renamed from: f */
    public boolean f164108f = true;

    /* renamed from: g */
    public TextView f164109g;

    /* renamed from: h */
    public ImageView f164110h;

    /* renamed from: i */
    public TextView f164111i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RingtoneAuthorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f359952cq0, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C66233a.f190289a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ble.RingtoneAuthorLayout)");
        this.f164106d = obtainStyledAttributes.getDimension(2, (float) C76577a.m92157h(context, C0966R.dimen.f3957lf));
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList == null) {
            colorStateList = C76577a.m92154e(context, C0966R.color.FG_1);
            C87412m.m108593f(colorStateList, "getColorStateList(contex…nt.mm.uikit.R.color.FG_1)");
        }
        this.f164107e = colorStateList;
        setShowAuthProfession(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View findViewById = findViewById(C0966R.C0970id.mgy);
        C87412m.m108593f(findViewById, "findViewById(R.id.ringtone_author)");
        setAuthor((TextView) findViewById);
        View findViewById2 = findViewById(C0966R.C0970id.mgw);
        C87412m.m108593f(findViewById2, "findViewById(R.id.ringtone_auth_icon)");
        setAuthIcon((ImageView) findViewById2);
        View findViewById3 = findViewById(C0966R.C0970id.mgx);
        C87412m.m108593f(findViewById3, "findViewById(R.id.ringtone_auth_profession)");
        setAuthProfession((TextView) findViewById3);
        getAuthor().setTextSize(0, this.f164106d);
        TextView author = getAuthor();
        ColorStateList colorStateList2 = this.f164107e;
        if (colorStateList2 != null) {
            author.setTextColor(colorStateList2);
            getAuthProfession().setTextSize(0, this.f164106d);
            TextView authProfession = getAuthProfession();
            ColorStateList colorStateList3 = this.f164107e;
            if (colorStateList3 != null) {
                authProfession.setTextColor(colorStateList3);
            } else {
                C87412m.m108603p("textColor");
                throw null;
            }
        } else {
            C87412m.m108603p("textColor");
            throw null;
        }
    }

    public ImageView getAuthIcon() {
        ImageView imageView = this.f164110h;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("authIcon");
        throw null;
    }

    public TextView getAuthProfession() {
        TextView textView = this.f164111i;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("authProfession");
        throw null;
    }

    public TextView getAuthor() {
        TextView textView = this.f164109g;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("author");
        throw null;
    }

    public boolean getShowAuthProfession() {
        return this.f164108f;
    }

    public void setAuthIcon(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f164110h = imageView;
    }

    public void setAuthProfession(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f164111i = textView;
    }

    public void setAuthor(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f164109g = textView;
    }

    public void setShowAuthProfession(boolean z) {
        this.f164108f = z;
    }
}
