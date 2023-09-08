package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57839g4;
import com.tencent.p014mm.p136ui.C57840h4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import wq3.C111847h;

/* renamed from: com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView */
public class LargeTouchableAreasItemView extends LinearLayout implements C111847h {

    /* renamed from: o */
    public static final int f157003o = Color.argb(0, 0, 0, 0);

    /* renamed from: d */
    public final ArrayList<C55183c> f157004d = new ArrayList<>();

    /* renamed from: e */
    public final Paint f157005e;

    /* renamed from: f */
    public C57839g4 f157006f;

    /* renamed from: g */
    public int f157007g;

    /* renamed from: h */
    public boolean f157008h;

    /* renamed from: i */
    public int f157009i;

    /* renamed from: j */
    public int f157010j;

    /* renamed from: n */
    public ImageButton f157011n;

    /* renamed from: com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView$a */
    public class C55181a implements View.OnClickListener {
        public C55181a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/LargeTouchableAreasItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LargeTouchableAreasItemView largeTouchableAreasItemView = LargeTouchableAreasItemView.this;
            largeTouchableAreasItemView.setItemViewSelected(!largeTouchableAreasItemView.f157008h);
            LargeTouchableAreasItemView.this.getClass();
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/LargeTouchableAreasItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView$b */
    public interface C55182b {
        /* renamed from: a */
        void mo76345a(LargeTouchableAreasItemView largeTouchableAreasItemView, boolean z);
    }

    /* renamed from: com.tencent.mm.chatroom.ui.LargeTouchableAreasItemView$c */
    public static class C55183c {

        /* renamed from: a */
        public Rect f157013a;

        /* renamed from: b */
        public int f157014b;

        public C55183c(Rect rect, int i) {
            this.f157013a = rect;
            this.f157014b = i;
        }
    }

    public LargeTouchableAreasItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f157005e = paint;
        this.f157009i = -1;
        this.f157010j = -1;
        setOrientation(0);
        setDescendantFocusability(393216);
        this.f157006f = new C57839g4(this);
        paint.setStyle(Paint.Style.FILL);
        this.f157007g = (int) ((context.getResources().getDisplayMetrics().density * 66.0f) + 0.5f);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6993uc, this);
    }

    public void dispatchDraw(Canvas canvas) {
        Iterator<C55183c> it = this.f157004d.iterator();
        while (it.hasNext()) {
            C55183c next = it.next();
            this.f157005e.setColor(next.f157014b);
            canvas.drawRect(next.f157013a, this.f157005e);
        }
        super.dispatchDraw(canvas);
    }

    public boolean getSelected() {
        return this.f157008h;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        ImageButton imageButton = (ImageButton) findViewById(C0966R.C0970id.am8);
        this.f157011n = imageButton;
        imageButton.setOnClickListener(new C55181a());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != this.f157009i || i6 != this.f157010j) {
            this.f157009i = i5;
            this.f157010j = i6;
            C57839g4 g4Var = this.f157006f;
            ArrayList<C57840h4> arrayList = g4Var.f165467a;
            if (arrayList != null) {
                arrayList.clear();
            }
            g4Var.f165468b = null;
            Rect rect = new Rect((i5 - this.f157011n.getWidth()) - this.f157007g, 0, i5, i6);
            int i7 = f157003o;
            this.f157006f.mo82266a(new C57840h4(rect, this.f157011n));
            this.f157004d.add(new C55183c(rect, i7));
            setTouchDelegate(this.f157006f);
        }
    }

    public void setItemViewSelected(boolean z) {
        if (this.f157008h != z) {
            this.f157008h = z;
            this.f157011n.setImageResource(z ? C0966R.raw.checkbox_selected : C0966R.C0969drawable.f4823ny);
        }
    }

    public void setOnLargeTouchableAreasListener(C55182b bVar) {
    }
}
