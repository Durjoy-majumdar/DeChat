package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76901s0;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView */
public class GetHdHeadImageGalleryView extends MMGestureGallery {

    /* renamed from: Q0 */
    public Bitmap f283620Q0;

    /* renamed from: R0 */
    public Bitmap f283621R0;

    /* renamed from: S0 */
    public C96808b f283622S0;

    /* renamed from: T0 */
    public String f283623T0;

    /* renamed from: U0 */
    public String f283624U0;

    /* renamed from: y0 */
    public C76901s0 f283625y0;

    /* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView$b */
    public class C96808b extends BaseAdapter {

        /* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView$b$a */
        public class C96809a {

            /* renamed from: a */
            public ProgressBar f283627a;

            /* renamed from: b */
            public ImageView f283628b;

            /* renamed from: c */
            public View f283629c;

            public C96809a(C96808b bVar) {
            }
        }

        public C96808b(C96807a aVar) {
        }

        public int getCount() {
            return 1;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C96809a aVar;
            if (view == null) {
                aVar = new C96809a(this);
                view = View.inflate(GetHdHeadImageGalleryView.this.getContext(), C0966R.C0971layout.cby, (ViewGroup) null);
                aVar.f283627a = (ProgressBar) view.findViewById(C0966R.C0970id.etx);
                aVar.f283628b = (ImageView) view.findViewById(C0966R.C0970id.etw);
                aVar.f283629c = view.findViewById(C0966R.C0970id.ety);
                view.setTag(aVar);
            } else {
                aVar = (C96809a) view.getTag();
            }
            view.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            if (GetHdHeadImageGalleryView.this.f283621R0 != null) {
                aVar.f283627a.setVisibility(8);
                aVar.f283628b.setVisibility(8);
                View view2 = aVar.f283629c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/pluginsdk/ui/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MultiTouchImageView multiTouchImageView = new MultiTouchImageView(GetHdHeadImageGalleryView.this.getContext(), GetHdHeadImageGalleryView.this.f283621R0.getWidth(), GetHdHeadImageGalleryView.this.f283621R0.getHeight());
                multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
                multiTouchImageView.setImageBitmap(GetHdHeadImageGalleryView.this.f283621R0);
                multiTouchImageView.setMaxZoomLimit(2.0f);
                multiTouchImageView.setMaxZoomDoubleTab(true);
                return multiTouchImageView;
            }
            aVar.f283627a.setVisibility(0);
            View view4 = aVar.f283629c;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/pluginsdk/ui/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (GetHdHeadImageGalleryView.this.f283620Q0 != null) {
                aVar.f283628b.setVisibility(0);
                aVar.f283628b.setImageBitmap(GetHdHeadImageGalleryView.this.f283620Q0);
            } else {
                aVar.f283628b.setVisibility(8);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView$c */
    public class C96810c implements MMGestureGallery.C19841d {

        /* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView$c$a */
        public class C96811a implements C76879j.C11180n {

            /* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView$c$a$a */
            public class C96812a implements C98250h.C98251a {
                public C96812a() {
                }

                /* renamed from: a */
                public void mo2055a(String str, String str2) {
                    AndroidMediaUtil.refreshMediaScanner(str2, GetHdHeadImageGalleryView.this.getContext());
                    C76701a.makeText(GetHdHeadImageGalleryView.this.getContext(), (CharSequence) GetHdHeadImageGalleryView.this.getContext().getString(C0966R.string.fen, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
                }

                /* renamed from: b */
                public void mo2056b(String str, String str2) {
                    C76701a.makeText(GetHdHeadImageGalleryView.this.getContext(), (CharSequence) GetHdHeadImageGalleryView.this.getContext().getString(C0966R.string.iak), 1).show();
                }
            }

            public C96811a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i == 0) {
                    ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(GetHdHeadImageGalleryView.this.getContext(), GetHdHeadImageGalleryView.this.f283624U0, new C96812a());
                }
            }
        }

        public C96810c(C96807a aVar) {
        }

        /* renamed from: a */
        public void mo26369a() {
            GetHdHeadImageGalleryView getHdHeadImageGalleryView = GetHdHeadImageGalleryView.this;
            if (getHdHeadImageGalleryView.f283624U0 != null && getHdHeadImageGalleryView.f283623T0 != null) {
                C76879j.m92736g(GetHdHeadImageGalleryView.this.getContext(), (String) null, getHdHeadImageGalleryView.getContext().getResources().getStringArray(C0966R.array.f2579m), "", new C96811a());
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView$d */
    public class C96813d implements MMGestureGallery.C19842g {
        public C96813d(C96807a aVar) {
        }

        /* renamed from: a */
        public void mo26370a() {
            C76901s0 s0Var = GetHdHeadImageGalleryView.this.f283625y0;
            if (s0Var != null) {
                s0Var.dismiss();
            }
        }
    }

    public GetHdHeadImageGalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo135086e();
    }

    /* renamed from: e */
    public final void mo135086e() {
        this.f283622S0 = new C96808b((C96807a) null);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter(this.f283622S0);
        setSelection(0);
        setSingleClickOverListener(new C96813d((C96807a) null));
        setLongClickOverListener(new C96810c((C96807a) null));
    }

    public void setHdHeadImage(Bitmap bitmap) {
        this.f283621R0 = bitmap;
        this.f283622S0.notifyDataSetChanged();
    }

    public void setHdHeadImagePath(String str) {
        this.f283624U0 = str;
    }

    public void setParentWindow(C76901s0 s0Var) {
        this.f283625y0 = s0Var;
    }

    public void setThumbImage(Bitmap bitmap) {
        this.f283620Q0 = bitmap;
        this.f283622S0.notifyDataSetChanged();
    }

    public void setUsername(String str) {
        this.f283623T0 = str;
    }

    public GetHdHeadImageGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo135086e();
    }
}
