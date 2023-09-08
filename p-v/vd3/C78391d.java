package vd3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.MaskImageButton;
import com.tencent.p014mm.pluginsdk.p133ui.NotCopyUserNameImageView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import p196ln.C10579k;
import p910lj.C76701a;
import vd3.C78407r;

/* renamed from: vd3.d */
public class C78391d extends C78407r implements C10579k.C10580a {

    /* renamed from: s */
    public boolean f229710s;

    /* renamed from: vd3.d$b */
    public static class C78393b {

        /* renamed from: a */
        public static C78407r.C78409b f229711a;

        /* renamed from: vd3.d$b$a */
        public class C14434a implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ ImageView f40047d;

            /* renamed from: e */
            public final /* synthetic */ String f40048e;

            public C14434a(ImageView imageView, String str) {
                this.f40047d = imageView;
                this.f40048e = str;
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                ClipboardHelper.setText(this.f40047d.getContext(), "UserName:", this.f40048e);
                C76701a.makeText(this.f40047d.getContext(), (int) C0966R.string.f7938wv, 0).show();
                C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* renamed from: vd3.d$b$b */
        public class C14435b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ ImageView f40049d;

            public C14435b(ImageView imageView) {
                this.f40049d = imageView;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                View view2 = (View) view.getParent();
                while (true) {
                    if (view2 == null) {
                        break;
                    } else if (!view2.isClickable()) {
                        view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
                    } else if (view2 instanceof AdapterView) {
                        Object tag = this.f40049d.getTag();
                        if (tag instanceof Integer) {
                            ((AdapterView) view2).performItemClick((View) null, ((Integer) tag).intValue(), -1);
                        }
                    } else {
                        view2.performClick();
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/AvatarDrawable$Factory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: a */
        public static void m94669a(ImageView imageView, String str) {
            if (imageView == null) {
                Log.m105920e("MicroMsg.AvatarDrawable", "imageView is null");
            } else {
                m94670b(imageView, str, 0.1f, false);
            }
        }

        /* renamed from: b */
        public static void m94670b(ImageView imageView, String str, float f, boolean z) {
            C78395g gVar;
            if (imageView == null) {
                Log.m105920e("MicroMsg.AvatarDrawable", "imageView is null");
                return;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || !(drawable instanceof C78395g)) {
                gVar = new C78395g(str, f);
                gVar.f229745f = z;
            } else {
                gVar = (C78395g) drawable;
                gVar.f229715t = f;
            }
            gVar.mo108360a(str);
            imageView.setImageDrawable(gVar);
            imageView.invalidate();
            m94672d(imageView, str);
            if (imageView instanceof MaskImageButton) {
                return;
            }
            if (imageView.isClickable() || imageView.isLongClickable()) {
                try {
                    imageView.setOnTouchListener(new C65585e(imageView));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AvatarDrawable", e, "", new Object[0]);
                }
            }
        }

        /* renamed from: c */
        public static C78407r.C78409b m94671c() {
            Assert.assertTrue(f229711a != null);
            return f229711a;
        }

        /* renamed from: d */
        public static void m94672d(ImageView imageView, String str) {
            if (WeChatEnvironment.hasDebugger() && imageView != null && !imageView.isLongClickable() && !(imageView instanceof NotCopyUserNameImageView)) {
                imageView.setOnLongClickListener(new C14434a(imageView, str));
                if (!imageView.isClickable()) {
                    imageView.setOnClickListener(new C14435b(imageView));
                }
            }
        }
    }

    public C78391d(C78407r.C78409b bVar, String str) {
        super(bVar, str);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        super.mo1428X(str);
    }

    public C78391d(String str, C78392a aVar) {
        super(C78393b.f229711a, str);
    }
}
