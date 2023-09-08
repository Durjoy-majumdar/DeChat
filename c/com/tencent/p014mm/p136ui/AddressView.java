package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;
import p1108f3.C107453d;
import p849e3.C107166a;
import p849e3.C107207u;
import vd3.C78395g;
import vd3.C78399i;

/* renamed from: com.tencent.mm.ui.AddressView */
public class AddressView extends View implements C78399i.C78400a {
    private static final String TAG = "MicroMsg.AddressView";
    public final int AVATAR_LAYOUT_WIDTH;
    public final int AVATAR_PADDING;
    public final int AVATAR_START_POS;
    public final int AVATAR_WIDTH;
    public final int COMMON_PADDING;
    public final int DESCRIPTION_PADDING;
    public final float DESCRIPTION_TEXT_SIZE;
    private int NAME_RIGHT_PADDING;
    public final float NAME_TEXT_SIZE;
    public final int TEXT_TOP_PADDING;
    public final int WEIBO_ICON_SIZE;
    public Drawable avatarDrawable;
    public Context context;
    public float density;
    public String description;
    private Paint.FontMetrics descriptionFontMetrics;
    private TextPaint descriptionPaint;
    public CharSequence destNickName;
    private TextPaint displayNamePaint;
    public Drawable drawable;

    /* renamed from: fm */
    private Paint.FontMetrics f318634fm;
    public StaticLayout layout;
    public C106631b mergeCallback;
    public boolean nameIsSpanned;
    public boolean needInvaildate;
    public BitmapDrawable needMask;
    public boolean needUpdatePostion;
    public CharSequence nickName;
    private int nickNameCurrentTextColor;
    public int nickNameHeight;
    private ColorStateList nickNameTextColor;
    public int nickNameWidth;
    public StaticLayout nickNamelayout;

    /* renamed from: com.tencent.mm.ui.AddressView$a */
    public class C106630a extends C107166a {
        public C106630a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            CharSequence contentDescription = AddressView.this.getContentDescription();
            if (Util.isNullOrNil((String) contentDescription)) {
                contentDescription = AddressView.this.nickName;
            }
            dVar.mo157866y(contentDescription);
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            CharSequence contentDescription = AddressView.this.getContentDescription();
            if (Util.isNullOrNil((String) contentDescription)) {
                contentDescription = AddressView.this.nickName;
            }
            accessibilityEvent.getText().add(contentDescription);
        }
    }

    /* renamed from: com.tencent.mm.ui.AddressView$b */
    public interface C106631b {
        /* renamed from: a */
        CharSequence mo153378a(int i);
    }

    public AddressView(Context context2) {
        this(context2, (AttributeSet) null, 0);
    }

    private TextPaint generateDescriptionPaint() {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.DESCRIPTION_TEXT_SIZE);
        textPaint.setColor(getResources().getColor(C0966R.color.f3563xt));
        return textPaint;
    }

    private TextPaint generateOnePaint() {
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.NAME_TEXT_SIZE);
        textPaint.setColor(getContext().getResources().getColor(C0966R.color.FG_0));
        return textPaint;
    }

    private Paint.FontMetrics getFontMetrics() {
        if (this.displayNamePaint == null) {
            this.displayNamePaint = generateOnePaint();
        }
        if (this.f318634fm == null) {
            this.f318634fm = this.displayNamePaint.getFontMetrics();
        }
        return this.f318634fm;
    }

    private int getShowAreaWidth() {
        return (getTextAreaWidth() - getPaddingLeft()) - this.NAME_RIGHT_PADDING;
    }

    private void installAccessibilityDelegate() {
        C107207u.m145168i(this, new C106630a());
    }

    public void doInvalidate() {
        invalidate();
    }

    public void drawableStateChanged() {
        updateTextColors();
        super.drawableStateChanged();
    }

    public int fromDPToPix(Context context2, int i) {
        return Math.round(getDensity(context2) * ((float) i));
    }

    public float getDensity(Context context2) {
        if (context2 == null) {
            context2 = getContext();
        }
        if (this.density < 0.0f) {
            this.density = context2.getResources().getDisplayMetrics().density;
        }
        return this.density;
    }

    public float getDesiredWidth(CharSequence charSequence, TextPaint textPaint) {
        if (charSequence instanceof Spanned) {
            return Layout.getDesiredWidth(charSequence, textPaint);
        }
        if (charSequence == null) {
            Log.m105928w(TAG, "source is null, set it empty.");
            charSequence = "";
        }
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public Drawable getDrawable() {
        return this.avatarDrawable;
    }

    public CharSequence getNickName() {
        return this.nickName;
    }

    public float getNickNameSize() {
        return this.NAME_TEXT_SIZE;
    }

    public int getTextAreaWidth() {
        return (getMeasuredWidth() - this.AVATAR_LAYOUT_WIDTH) - this.AVATAR_PADDING;
    }

    public void invalidateDrawable(Drawable drawable2) {
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        C106631b bVar = this.mergeCallback;
        if (bVar != null) {
            bVar.mo153378a(getShowAreaWidth());
        }
        updatePosition();
        Drawable drawable2 = this.avatarDrawable;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        BitmapDrawable bitmapDrawable = this.needMask;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
        if (this.nameIsSpanned) {
            canvas.save();
            canvas.translate((float) (this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING), (float) ((getHeight() - this.nickNameHeight) / 2));
            this.nickNamelayout.draw(canvas);
            canvas.restore();
        } else if (!Util.isNullOrNil(this.description)) {
            CharSequence charSequence = this.destNickName;
            if (charSequence != null) {
                int length = charSequence.length();
                float f = (float) (this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING);
                Paint.FontMetrics fontMetrics = this.f318634fm;
                float f2 = fontMetrics.bottom;
                float f3 = fontMetrics.top;
                canvas.drawText(charSequence, 0, length, f, ((float) this.TEXT_TOP_PADDING) + (((((float) getHeight()) - (f2 - f3)) / 2.0f) - (f3 / 3.0f)), this.displayNamePaint);
                int width = getWidth();
                float measureText = this.descriptionPaint.measureText(this.description);
                String str2 = this.description;
                if (measureText > ((float) (width - this.DESCRIPTION_PADDING))) {
                    int i = 1;
                    while (true) {
                        if (i >= this.description.length()) {
                            break;
                        }
                        String substring = this.description.substring(0, i);
                        if (this.descriptionPaint.measureText(substring) >= ((float) (width - this.DESCRIPTION_PADDING))) {
                            str = str2 + "...";
                            break;
                        }
                        i++;
                        str2 = substring;
                    }
                    int length2 = str.length();
                    float f4 = (float) (this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING);
                    Paint.FontMetrics fontMetrics2 = this.descriptionFontMetrics;
                    float f5 = fontMetrics2.bottom;
                    float f6 = fontMetrics2.top;
                    canvas.drawText(str, 0, length2, f4, ((float) this.TEXT_TOP_PADDING) + (((((float) getHeight()) - (f5 - f6)) / 2.0f) - ((float) ((int) (((double) f6) * 1.7d)))), this.descriptionPaint);
                }
                str = str2;
                int length22 = str.length();
                float f44 = (float) (this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING);
                Paint.FontMetrics fontMetrics22 = this.descriptionFontMetrics;
                float f54 = fontMetrics22.bottom;
                float f64 = fontMetrics22.top;
                canvas.drawText(str, 0, length22, f44, ((float) this.TEXT_TOP_PADDING) + (((((float) getHeight()) - (f54 - f64)) / 2.0f) - ((float) ((int) (((double) f64) * 1.7d)))), this.descriptionPaint);
            }
        } else {
            CharSequence charSequence2 = this.destNickName;
            if (charSequence2 != null) {
                Paint.FontMetrics fontMetrics3 = this.f318634fm;
                float f7 = fontMetrics3.bottom;
                float f8 = fontMetrics3.top;
                canvas.drawText(charSequence2, 0, charSequence2.length(), (float) (this.AVATAR_LAYOUT_WIDTH + this.AVATAR_PADDING), ((((float) getHeight()) - (f7 - f8)) / 2.0f) - f8, this.displayNamePaint);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence contentDescription = getContentDescription();
        if (Util.isNullOrNil((String) contentDescription)) {
            contentDescription = this.nickName;
        }
        accessibilityNodeInfo.setText(contentDescription);
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence contentDescription = getContentDescription();
        if (Util.isNullOrNil((String) contentDescription)) {
            contentDescription = this.nickName;
        }
        accessibilityEvent.getText().add(contentDescription);
    }

    public void onScrollStateChanged(boolean z) {
        if (z) {
            stopAvatarLoad();
        } else {
            resumeAvatarLoad();
        }
    }

    public void resumeAvatarLoad() {
        Drawable drawable2 = this.avatarDrawable;
        if (drawable2 != null) {
            C78395g gVar = (C78395g) drawable2;
            if (gVar.f229746g) {
                gVar.f229746g = false;
                if (gVar.f229747h) {
                    gVar.f229747h = false;
                    gVar.invalidateSelf();
                }
            }
        }
    }

    public void setDescription(String str) {
        this.description = str;
        if (this.descriptionPaint == null) {
            TextPaint generateDescriptionPaint = generateDescriptionPaint();
            this.descriptionPaint = generateDescriptionPaint;
            this.descriptionFontMetrics = generateDescriptionPaint.getFontMetrics();
        }
    }

    public void setImageDrawable(Drawable drawable2) {
        this.avatarDrawable = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    public void setMaskBitmap(Bitmap bitmap) {
        this.needMask = new BitmapDrawable(getResources(), bitmap);
    }

    public void setMergeCallback(C106631b bVar) {
        if (bVar != null) {
            this.needInvaildate = true;
        }
        this.mergeCallback = bVar;
    }

    public void setName(CharSequence charSequence) {
        CharSequence charSequence2 = this.nickName;
        if (charSequence2 == null || !charSequence2.equals(charSequence)) {
            this.needInvaildate = true;
        }
        this.nickName = charSequence;
        this.nameIsSpanned = charSequence instanceof Spanned;
        getFontMetrics();
    }

    public void setNickNameTextColor(ColorStateList colorStateList) {
        this.nickNameTextColor = colorStateList;
    }

    public void stopAvatarLoad() {
        Drawable drawable2 = this.avatarDrawable;
        if (drawable2 != null) {
            ((C78395g) drawable2).f229746g = true;
        }
    }

    public void updatePosition() {
        if (this.needUpdatePostion) {
            this.nickNameWidth = (getTextAreaWidth() - getPaddingLeft()) - this.NAME_RIGHT_PADDING;
            int desiredWidth = (int) getDesiredWidth(this.nickName, this.displayNamePaint);
            int i = this.nickNameWidth;
            if (desiredWidth > i) {
                this.destNickName = TextUtils.ellipsize(this.nickName, this.displayNamePaint, (float) i, TextUtils.TruncateAt.END);
            } else {
                CharSequence charSequence = this.nickName;
                this.destNickName = charSequence;
                this.nickNameWidth = (int) getDesiredWidth(charSequence, this.displayNamePaint);
            }
            if (this.nickName instanceof Spanned) {
                StaticLayout staticLayout = new StaticLayout(this.destNickName, this.displayNamePaint, getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                this.nickNamelayout = staticLayout;
                this.nickNameHeight = staticLayout.getHeight();
            } else {
                this.nickNamelayout = null;
                Paint.FontMetrics fontMetrics = getFontMetrics();
                this.nickNameHeight = ((int) Math.ceil((double) (fontMetrics.descent - fontMetrics.top))) + 2;
            }
            this.needUpdatePostion = false;
        }
    }

    public void updatePositionFlag() {
        this.needUpdatePostion = true;
        if (this.needInvaildate) {
            invalidate();
            this.needInvaildate = false;
        }
    }

    public void updateTextColors() {
        int colorForState;
        ColorStateList colorStateList = this.nickNameTextColor;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(getDrawableState(), 0)) != this.nickNameCurrentTextColor) {
            this.nickNameCurrentTextColor = colorForState;
            if (this.displayNamePaint == null) {
                this.displayNamePaint = generateOnePaint();
            }
            this.displayNamePaint.setColor(this.nickNameCurrentTextColor);
        }
    }

    public AddressView(Context context2, AttributeSet attributeSet) {
        this(context2, attributeSet, 0);
    }

    public AddressView(Context context2, AttributeSet attributeSet, int i) {
        super(context2, attributeSet, i);
        this.drawable = getResources().getDrawable(C0966R.C0969drawable.blm);
        this.needUpdatePostion = true;
        this.mergeCallback = null;
        this.AVATAR_LAYOUT_WIDTH = 0;
        this.AVATAR_WIDTH = 0;
        this.NAME_TEXT_SIZE = (float) C76577a.m92157h(context2, C0966R.dimen.f3927j7);
        this.DESCRIPTION_TEXT_SIZE = (float) C76577a.m92157h(context2, C0966R.dimen.f3964lm);
        this.WEIBO_ICON_SIZE = getResources().getDimensionPixelSize(C0966R.dimen.f3954lc);
        this.AVATAR_START_POS = 0;
        this.AVATAR_PADDING = 0;
        this.COMMON_PADDING = 0;
        this.DESCRIPTION_PADDING = getResources().getDimensionPixelSize(C0966R.dimen.f3899i_) * 2;
        this.TEXT_TOP_PADDING = getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        this.NAME_RIGHT_PADDING = getResources().getDimensionPixelSize(C0966R.dimen.f3621e);
        if (this.displayNamePaint == null) {
            this.displayNamePaint = generateOnePaint();
        }
    }
}
