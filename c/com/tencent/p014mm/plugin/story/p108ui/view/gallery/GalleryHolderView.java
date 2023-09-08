package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import go3.C76003c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import zv2.C103109c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView;", "Landroid/widget/RelativeLayout;", "", "visibility", "Lrx3/b0;", "setVisibility", "i", "I", "getInitMargin", "()I", "setInitMargin", "(I)V", "initMargin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attr", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView */
public final class GalleryHolderView extends RelativeLayout {

    /* renamed from: d */
    public LinearLayout f21281d;

    /* renamed from: e */
    public ImageView f21282e;

    /* renamed from: f */
    public ImageView f21283f;

    /* renamed from: g */
    public TextView f21284g;

    /* renamed from: h */
    public boolean f21285h;

    /* renamed from: i */
    public int f21286i;

    /* renamed from: j */
    public float f21287j;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView$a */
    public static final class C5489a implements View.OnClickListener {

        /* renamed from: d */
        public static final C5489a f21288d = new C5489a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.c6t, this);
        View findViewById = findViewById(C0966R.C0970id.f359314k72);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_…ery_holder_action_layout)");
        this.f21281d = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f359313k71);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_gallery_holder_action_iv)");
        this.f21282e = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k74);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_gallery_holder_bubble)");
        this.f21283f = (ImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k76);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_gallery_holder_title_tv)");
        this.f21284g = (TextView) findViewById4;
        this.f21281d.setVisibility(4);
        ImageView imageView = this.f21282e;
        Drawable drawable = context.getResources().getDrawable(C0966R.raw.icons_filled_camera);
        C74933u4.m89769f(drawable, context.getResources().getColor(C0966R.color.afp));
        imageView.setImageDrawable(drawable);
        this.f21281d.setOnClickListener(C5489a.f21288d);
        setBackgroundColor(context.getResources().getColor(C0966R.color.aff));
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_STORY_FIRST_PULL_DOWN_BOOLEAN_SYNC, Boolean.TRUE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f).booleanValue();
        this.f21285h = booleanValue;
        if (booleanValue) {
            this.f21284g.setTextColor(getResources().getColor(C0966R.color.aeq));
            TextView textView = this.f21284g;
            String string = getResources().getString(C0966R.string.jqs);
            C87412m.m108593f(string, "resources.getString(R.st…ory_gallery_holder_title)");
            int color = getResources().getColor(C0966R.color.aeq);
            Context context2 = MMApplicationContext.getContext();
            Drawable e = C74933u4.m89768e(context2, C0966R.raw.story_downward_arrow, color);
            e.setBounds(0, 0, C76577a.m92151b(context2, 14), C76577a.m92151b(context2, 20));
            C76003c cVar = new C76003c(e, 1);
            SpannableString spannableString = new SpannableString('#' + string);
            spannableString.setSpan(cVar, 0, 1, 17);
            textView.setText(spannableString);
        } else {
            this.f21284g.setTextColor(getResources().getColor(C0966R.color.afg));
            this.f21284g.setText(getResources().getString(C0966R.string.jqq));
        }
        if (C103109c.f304232b.mo108963a()) {
            this.f21283f.setVisibility(8);
        } else {
            this.f21283f.setVisibility(0);
        }
        this.f21287j = 1.0f;
    }

    public final int getInitMargin() {
        return this.f21286i;
    }

    public final void setInitMargin(int i) {
        this.f21286i = i;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            return;
        }
        if (C103109c.f304232b.mo108963a()) {
            this.f21283f.setVisibility(8);
        } else {
            this.f21283f.setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
