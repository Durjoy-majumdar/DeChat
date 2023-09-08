package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Random;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector;", "Landroid/widget/LinearLayout;", "", "j", "I", "getSelectedColor", "()I", "setSelectedColor", "(I)V", "selectedColor", "Lkotlin/Function1;", "Lrx3/b0;", "n", "Lfy3/l;", "getOnColorSelected", "()Lfy3/l;", "setOnColorSelected", "(Lfy3/l;)V", "onColorSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector */
public final class StoryCommentColorSelector extends LinearLayout {

    /* renamed from: d */
    public final int f281832d;

    /* renamed from: e */
    public final Drawable f281833e;

    /* renamed from: f */
    public final ImageView f281834f;

    /* renamed from: g */
    public final ImageView f281835g;

    /* renamed from: h */
    public final ImageView f281836h;

    /* renamed from: i */
    public final TextView f281837i;

    /* renamed from: j */
    public int f281838j;

    /* renamed from: n */
    public C32226l<? super Integer, C13598b0> f281839n;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector$a */
    public static final class C96362a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentColorSelector f281840d;

        public C96362a(StoryCommentColorSelector storyCommentColorSelector) {
            this.f281840d = storyCommentColorSelector;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f281840d.setSelectedColor(-1);
            this.f281840d.mo134229a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector$b */
    public static final class C96363b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentColorSelector f281841d;

        public C96363b(StoryCommentColorSelector storyCommentColorSelector) {
            this.f281841d = storyCommentColorSelector;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f281841d.setSelectedColor(-16777216);
            this.f281841d.mo134229a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector$c */
    public static final class C96364c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryCommentColorSelector f281842d;

        public C96364c(StoryCommentColorSelector storyCommentColorSelector) {
            this.f281842d = storyCommentColorSelector;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StoryCommentColorSelector storyCommentColorSelector = this.f281842d;
            storyCommentColorSelector.getClass();
            storyCommentColorSelector.setSelectedColor(StoryCommentView.f281874N[new Random().nextInt(8)]);
            this.f281842d.mo134229a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCommentColorSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f281838j = -1;
        View.inflate(context, C0966R.C0971layout.c6_, this);
        setOrientation(0);
        View findViewById = findViewById(C0966R.C0970id.k3q);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_…ent_color_selector_white)");
        ImageView imageView = (ImageView) findViewById;
        this.f281834f = imageView;
        View findViewById2 = findViewById(C0966R.C0970id.k3m);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_…ent_color_selector_black)");
        ImageView imageView2 = (ImageView) findViewById2;
        this.f281835g = imageView2;
        View findViewById3 = findViewById(C0966R.C0970id.k3o);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_…lor_selector_random_icon)");
        this.f281836h = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k3n);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_…nt_color_selector_random)");
        View findViewById5 = findViewById(C0966R.C0970id.k3p);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_…lor_selector_random_text)");
        this.f281837i = (TextView) findViewById5;
        imageView.setOnClickListener(new C96362a(this));
        imageView2.setOnClickListener(new C96363b(this));
        ((LinearLayout) findViewById4).setOnClickListener(new C96364c(this));
        int b = C76577a.m92151b(context, 2);
        this.f281832d = b;
        int b2 = C76577a.m92151b(context, 4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{-372399, -352965, -15616, -7220480, -16268960, -15683841, -15432210, -10197008, -372399});
        gradientDrawable.setGradientType(2);
        gradientDrawable.setStroke(b, -1);
        gradientDrawable.setShape(1);
        this.f281833e = new InsetDrawable(gradientDrawable, b2);
        mo134229a();
    }

    /* renamed from: a */
    public final void mo134229a() {
        int i = this.f281838j;
        if (i == -16777216) {
            this.f281834f.setSelected(false);
            this.f281835g.setSelected(true);
            this.f281836h.setImageDrawable(this.f281833e);
            this.f281837i.setVisibility(8);
        } else if (i != -1) {
            this.f281834f.setSelected(false);
            this.f281835g.setSelected(false);
            ImageView imageView = this.f281836h;
            int i2 = this.f281838j;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i2);
            gradientDrawable.setStroke(this.f281832d, -1);
            gradientDrawable.setShape(1);
            imageView.setImageDrawable(gradientDrawable);
            this.f281837i.setVisibility(0);
        } else {
            this.f281834f.setSelected(true);
            this.f281835g.setSelected(false);
            this.f281836h.setImageDrawable(this.f281833e);
            this.f281837i.setVisibility(8);
        }
        C32226l<? super Integer, C13598b0> lVar = this.f281839n;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(this.f281838j));
        }
    }

    public final C32226l<Integer, C13598b0> getOnColorSelected() {
        return this.f281839n;
    }

    public final int getSelectedColor() {
        return this.f281838j;
    }

    public final void setOnColorSelected(C32226l<? super Integer, C13598b0> lVar) {
        this.f281839n = lVar;
    }

    public final void setSelectedColor(int i) {
        this.f281838j = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryCommentColorSelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
