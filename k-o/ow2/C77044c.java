package ow2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import zv2.C103105a;

/* renamed from: ow2.c */
public final class C77044c extends C104428a {

    /* renamed from: A */
    public boolean f225053A = true;

    /* renamed from: B */
    public boolean f225054B;

    /* renamed from: C */
    public boolean f225055C;

    /* renamed from: D */
    public boolean f225056D = true;

    /* renamed from: E */
    public boolean f225057E;

    /* renamed from: F */
    public boolean f225058F = true;

    /* renamed from: n */
    public View f225059n;

    /* renamed from: o */
    public View f225060o;

    /* renamed from: p */
    public View f225061p;

    /* renamed from: q */
    public ImageView f225062q;

    /* renamed from: r */
    public ImageView f225063r;

    /* renamed from: s */
    public ImageView f225064s;

    /* renamed from: t */
    public TextView f225065t;

    /* renamed from: u */
    public View f225066u;

    /* renamed from: v */
    public ImageView f225067v;

    /* renamed from: w */
    public C32224a<C13598b0> f225068w;

    /* renamed from: x */
    public C32224a<C13598b0> f225069x;

    /* renamed from: y */
    public C32224a<C13598b0> f225070y;

    /* renamed from: z */
    public C32224a<C13598b0> f225071z;

    /* renamed from: ow2.c$a */
    public static final class C77045a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77044c f225072d;

        public C77045a(C77044c cVar) {
            this.f225072d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f225072d.f225069x;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f225072d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77044c(Context context) {
        super(context, 0);
        C87412m.m108594g(context, "context");
        setContentView((int) C0966R.C0971layout.c6g);
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(134218752);
            window.clearFlags(2);
        }
        this.f225059n = findViewById(C0966R.C0970id.k4r);
        this.f225060o = findViewById(C0966R.C0970id.k4z);
        this.f225061p = findViewById(C0966R.C0970id.k4w);
        this.f225062q = (ImageView) findViewById(C0966R.C0970id.k4s);
        this.f225063r = (ImageView) findViewById(C0966R.C0970id.f359304k50);
        this.f225064s = (ImageView) findViewById(C0966R.C0970id.k4x);
        this.f225065t = (TextView) findViewById(C0966R.C0970id.k4y);
        this.f225066u = findViewById(C0966R.C0970id.k4t);
        this.f225066u = findViewById(C0966R.C0970id.k4t);
        TextView textView = (TextView) findViewById(C0966R.C0970id.k4v);
        this.f225067v = (ImageView) findViewById(C0966R.C0970id.k4u);
        int color = getContext().getResources().getColor(C0966R.color.f2966ao);
        ImageView imageView = this.f225062q;
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.delete_icon_nor, color));
        }
        ImageView imageView2 = this.f225063r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_refresh, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
        }
        ImageView imageView3 = this.f225067v;
        if (imageView3 != null) {
            imageView3.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_circle_star, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
        }
        View view2 = this.f225060o;
        if (view2 != null) {
            view2.setOnClickListener(new C77045a(this));
        }
        if (this.f225054B && (view = this.f225060o) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f225053A) {
            View view3 = this.f225059n;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view4 = this.f225059n;
            if (view4 != null) {
                view4.setOnClickListener(new C77042a(this));
            }
        } else {
            View view5 = this.f225059n;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initDelBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f225056D) {
            View view7 = this.f225061p;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view8 = this.f225061p;
            if (view8 != null) {
                view8.setOnClickListener(new C77043b(this));
            }
            if (this.f225055C) {
                ImageView imageView4 = this.f225064s;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_unlock, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
                }
                TextView textView2 = this.f225065t;
                if (textView2 != null) {
                    textView2.setText(getContext().getString(C0966R.string.jpc));
                }
            } else {
                ImageView imageView5 = this.f225064s;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_lock, getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9)));
                }
                TextView textView3 = this.f225065t;
                if (textView3 != null) {
                    textView3.setText(getContext().getString(C0966R.string.jpd));
                }
            }
        } else {
            View view9 = this.f225061p;
            if (view9 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initPrivacyBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f225058F) {
            C103105a.C103106a aVar6 = (C103105a.C103106a) C103105a.f304209b.mo138761d();
        }
        View view11 = this.f225066u;
        if (view11 != null) {
            C9556a aVar7 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar7.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog", "initFavoriteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById = findViewById(C0966R.C0970id.c2m);
        if (findViewById != null) {
            findViewById.setBackgroundResource(C0966R.color.ahf);
        }
    }
}
