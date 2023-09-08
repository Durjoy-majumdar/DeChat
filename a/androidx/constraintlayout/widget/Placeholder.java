package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.xweb.util.WXWebReporter;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public class Placeholder extends View {

    /* renamed from: d */
    public int f192667d = -1;

    /* renamed from: e */
    public View f192668e = null;

    /* renamed from: f */
    public int f192669f = 4;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo91157a(attributeSet);
    }

    /* renamed from: a */
    public final void mo91157a(AttributeSet attributeSet) {
        super.setVisibility(this.f192669f);
        this.f192667d = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_placeholder_content) {
                    this.f192667d = obtainStyledAttributes.getResourceId(index, this.f192667d);
                } else if (index == R$styleable.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f192669f = obtainStyledAttributes.getInt(index, this.f192669f);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo91158b(ConstraintLayout constraintLayout) {
        if (this.f192667d == -1 && !isInEditMode()) {
            setVisibility(this.f192669f);
        }
        View findViewById = constraintLayout.findViewById(this.f192667d);
        this.f192668e = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f44434Z = true;
            View view = this.f192668e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "androidx/constraintlayout/widget/Placeholder", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "androidx/constraintlayout/widget/Placeholder", "updatePreLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f192668e;
    }

    public int getEmptyVisibility() {
        return this.f192669f;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f192667d != i) {
            View view = this.f192668e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((ConstraintLayout.LayoutParams) this.f192668e.getLayoutParams()).f44434Z = false;
                this.f192668e = null;
            }
            this.f192667d = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "androidx/constraintlayout/widget/Placeholder", "setContentId", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f192669f = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo91157a(attributeSet);
    }
}
