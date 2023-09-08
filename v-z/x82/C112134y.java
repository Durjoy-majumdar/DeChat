package x82;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import x82.C112075a;

/* renamed from: x82.y */
public final class C112134y {

    /* renamed from: a */
    public C112075a f335732a;

    /* renamed from: b */
    public TextView f335733b;

    /* renamed from: c */
    public FrameLayout f335734c;

    /* renamed from: d */
    public FrameLayout f335735d;

    /* renamed from: e */
    public FrameLayout f335736e;

    /* renamed from: f */
    public WeImageView f335737f;

    /* renamed from: g */
    public WeImageView f335738g;

    /* renamed from: h */
    public int f335739h = -1;

    /* renamed from: i */
    public int f335740i = -1;

    /* renamed from: j */
    public String f335741j;

    /* renamed from: x82.y$a */
    public static final class C112135a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112134y f335742d;

        public C112135a(C112134y yVar) {
            this.f335742d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f335742d.f335739h == 0) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickIconFlipPage");
            C115669n.INSTANCE.mo175913w(1538, 13, 1);
            C112134y yVar = this.f335742d;
            yVar.f335739h--;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f335742d.f335739h + 1);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(this.f335742d.f335740i);
            yVar.mo163918e(sb.toString());
            Bundle bundle = new Bundle();
            bundle.putInt("thumb_flip_target_position", this.f335742d.f335739h);
            this.f335742d.f335732a.mo163772c(C112075a.C112077b.THUMB_VIEW_PAGE_FLIP, bundle);
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: x82.y$b */
    public static final class C112136b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112134y f335743d;

        public C112136b(C112134y yVar) {
            this.f335743d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112134y yVar = this.f335743d;
            if (yVar.f335739h == yVar.f335740i - 1) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickIconFlipPage");
            C115669n.INSTANCE.mo175913w(1538, 13, 1);
            C112134y yVar2 = this.f335743d;
            yVar2.f335739h++;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f335743d.f335739h + 1);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(this.f335743d.f335740i);
            yVar2.mo163918e(sb.toString());
            Bundle bundle = new Bundle();
            bundle.putInt("thumb_flip_target_position", this.f335743d.f335739h);
            this.f335743d.f335732a.mo163772c(C112075a.C112077b.THUMB_VIEW_PAGE_FLIP, bundle);
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C112134y(C112075a aVar) {
        C87412m.m108594g(aVar, "statusManager");
        this.f335732a = aVar;
    }

    /* renamed from: a */
    public final void mo163914a() {
        FrameLayout frameLayout = this.f335734c;
        if (frameLayout != null) {
            TextView textView = (TextView) frameLayout.findViewById(C0966R.C0970id.j3i);
            this.f335733b = textView;
            if (textView != null) {
                textView.setVisibility(4);
            }
            FrameLayout frameLayout2 = this.f335734c;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(4);
            }
            this.f335737f = (WeImageView) frameLayout.findViewById(C0966R.C0970id.j3l);
            this.f335738g = (WeImageView) frameLayout.findViewById(C0966R.C0970id.j3n);
            this.f335735d = (FrameLayout) frameLayout.findViewById(C0966R.C0970id.j3m);
            this.f335736e = (FrameLayout) frameLayout.findViewById(C0966R.C0970id.j3o);
            WeImageView weImageView = this.f335737f;
            if (weImageView != null) {
                weImageView.setRotation(180.0f);
            }
            WeImageView weImageView2 = this.f335737f;
            if (weImageView2 != null) {
                weImageView2.setImageDrawable(C74933u4.m89768e(frameLayout.getContext(), C0966R.raw.icons_filled_arrow, mo163915b(true)));
            }
            WeImageView weImageView3 = this.f335737f;
            if (weImageView3 != null) {
                weImageView3.setIconColor(frameLayout.getContext().getResources().getColor(mo163915b(true)));
            }
            WeImageView weImageView4 = this.f335738g;
            if (weImageView4 != null) {
                weImageView4.setImageDrawable(C74933u4.m89768e(frameLayout.getContext(), C0966R.raw.icons_filled_arrow, mo163915b(false)));
            }
            WeImageView weImageView5 = this.f335738g;
            if (weImageView5 != null) {
                weImageView5.setIconColor(frameLayout.getContext().getResources().getColor(mo163915b(false)));
            }
            FrameLayout frameLayout3 = this.f335735d;
            if (frameLayout3 != null) {
                frameLayout3.setOnClickListener(new C112135a(this));
            }
            FrameLayout frameLayout4 = this.f335736e;
            if (frameLayout4 != null) {
                frameLayout4.setOnClickListener(new C112136b(this));
            }
            String str = this.f335741j;
            if (str != null) {
                mo163918e(str);
            }
        }
    }

    /* renamed from: b */
    public final int mo163915b(boolean z) {
        if (z) {
            if (this.f335739h == 0) {
                return C0966R.color.f3540x5;
            }
        } else if (this.f335739h == this.f335740i - 1) {
            return C0966R.color.f3540x5;
        }
        return C0966R.color.f2975b6;
    }

    /* renamed from: c */
    public final View mo163916c(Context context, FrameLayout frameLayout) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(frameLayout, "viewGroup");
        if (this.f335732a.mo163773d()) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bhv, frameLayout);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f335734c = (FrameLayout) inflate;
            mo163914a();
        } else {
            View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.bhu, frameLayout);
            C87412m.m108592e(inflate2, "null cannot be cast to non-null type android.widget.FrameLayout");
            this.f335734c = (FrameLayout) inflate2;
            mo163914a();
        }
        return this.f335734c;
    }

    /* renamed from: d */
    public final void mo163917d() {
        TextView textView = this.f335733b;
        if (textView != null) {
            WeImageView weImageView = this.f335737f;
            if (weImageView != null) {
                weImageView.setIconColor(textView.getContext().getResources().getColor(mo163915b(true)));
            }
            WeImageView weImageView2 = this.f335738g;
            if (weImageView2 != null) {
                weImageView2.setIconColor(textView.getContext().getResources().getColor(mo163915b(false)));
            }
        }
    }

    /* renamed from: e */
    public final void mo163918e(String str) {
        C87412m.m108594g(str, "str");
        TextView textView = this.f335733b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f335734c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        this.f335741j = str;
        TextView textView2 = this.f335733b;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f335733b;
        if (textView3 != null) {
            WeImageView weImageView = this.f335737f;
            if (weImageView != null) {
                weImageView.setIconColor(textView3.getContext().getResources().getColor(mo163915b(true)));
            }
            WeImageView weImageView2 = this.f335738g;
            if (weImageView2 != null) {
                weImageView2.setIconColor(textView3.getContext().getResources().getColor(mo163915b(false)));
            }
        }
    }
}
