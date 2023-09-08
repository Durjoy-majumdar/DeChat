package fw1;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import te3.e94;

/* renamed from: fw1.a */
public final class C98050a implements View.OnClickListener {

    /* renamed from: d */
    public WeakReference<AlbumPreviewUI> f287473d;

    /* renamed from: e */
    public final e94 f287474e;

    /* renamed from: f */
    public final boolean f287475f;

    /* renamed from: g */
    public C54219z<Integer> f287476g;

    /* renamed from: h */
    public LiveData<Integer> f287477h;

    /* renamed from: i */
    public LinearLayout f287478i;

    /* renamed from: j */
    public ImageButton f287479j;

    /* renamed from: n */
    public TextView f287480n;

    /* renamed from: o */
    public LinearLayout f287481o;

    /* renamed from: p */
    public TextView f287482p;

    /* renamed from: q */
    public int f287483q;

    /* renamed from: r */
    public C32224a<Boolean> f287484r;

    /* renamed from: fw1.a$a */
    public static final class C98051a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C98051a f287485d = new C98051a();

        public C98051a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r6 = (r6 = r6.get()).getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C98050a(java.lang.ref.WeakReference<com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI> r6, te3.e94 r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.f287473d = r6
            r5.f287474e = r7
            r0 = 0
            if (r6 == 0) goto L_0x0020
            java.lang.Object r6 = r6.get()
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r6 = (com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI) r6
            if (r6 == 0) goto L_0x0020
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L_0x0020
            java.lang.String r1 = "key_sns_publish_template"
            boolean r6 = r6.getBooleanExtra(r1, r0)
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r5.f287475f = r6
            androidx.lifecycle.z r1 = new androidx.lifecycle.z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.<init>(r2)
            r5.f287476g = r1
            r5.f287477h = r1
            r1 = 1
            r5.f287483q = r1
            fw1.a$a r2 = fw1.C98050a.C98051a.f287485d
            r5.f287484r = r2
            java.lang.ref.WeakReference<com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI> r2 = r5.f287473d
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI r2 = (com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI) r2
            if (r2 == 0) goto L_0x0090
            r3 = 2131310655(0x7f09383f, float:1.8239628E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3 = 2131314994(0x7f094932, float:1.8248429E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5.f287478i = r3
            r3 = 2131314991(0x7f09492f, float:1.8248423E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            r5.f287479j = r3
            r3 = 2131315005(0x7f09493d, float:1.8248451E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5.f287480n = r3
            if (r3 == 0) goto L_0x007a
            r4 = 2131165591(0x7f070197, float:1.7945403E38)
            int r4 = kg3.C76577a.m92155f(r2, r4)
            float r4 = (float) r4
            r3.setTextSize(r0, r4)
        L_0x007a:
            r3 = 2131314989(0x7f09492d, float:1.8248419E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5.f287481o = r3
            r3 = 2131314990(0x7f09492e, float:1.824842E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r5.f287482p = r2
        L_0x0090:
            android.widget.ImageButton r2 = r5.f287479j
            if (r2 == 0) goto L_0x0097
            r2.setOnClickListener(r5)
        L_0x0097:
            android.widget.TextView r2 = r5.f287480n
            if (r2 == 0) goto L_0x009e
            r2.setOnClickListener(r5)
        L_0x009e:
            if (r6 == 0) goto L_0x00a8
            android.widget.LinearLayout r6 = r5.f287478i
            if (r6 != 0) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r6.setVisibility(r0)
        L_0x00a8:
            if (r7 == 0) goto L_0x00ad
            java.lang.String r6 = r7.f182943e
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r1 == 0) goto L_0x00c2
            java.lang.Class<da0.e> r6 = da0.C58247e.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            da0.e r6 = (da0.C58247e) r6
            r6.On0()
            r5.mo137353b(r0)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw1.C98050a.<init>(java.lang.ref.WeakReference, te3.e94):void");
    }

    /* renamed from: a */
    public final boolean mo137352a() {
        Integer value = this.f287477h.getValue();
        return value == null || value.intValue() != 0;
    }

    /* renamed from: b */
    public final void mo137353b(int i) {
        if (i == 0) {
            ImageButton imageButton = this.f287479j;
            if (imageButton != null) {
                imageButton.setSelected(true);
            }
            ImageButton imageButton2 = this.f287479j;
            if (imageButton2 != null) {
                imageButton2.setEnabled(false);
            }
            TextView textView = this.f287480n;
            if (textView != null) {
                textView.setClickable(false);
            }
            this.f287476g.setValue(2);
            this.f287483q = 2;
        } else if (mo137352a()) {
            ImageButton imageButton3 = this.f287479j;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
            ImageButton imageButton4 = this.f287479j;
            if (imageButton4 != null) {
                imageButton4.setEnabled(true);
            }
            TextView textView2 = this.f287480n;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            this.f287476g.setValue(1);
            this.f287483q = 1;
        }
        if (mo137352a()) {
            ((C58247e) C86312j.m106911c(C58247e.class)).On0();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.glf) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.hqo)) {
            Integer value = this.f287477h.getValue();
            if (value != null && value.intValue() == 2) {
                Log.m105928w("MicroMsg.GalleryTemplateUI", "onClick: not enable to change");
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (mo137352a() || this.f287484r.invoke().booleanValue()) {
                this.f287476g.setValue(mo137352a() ? 0 : 1);
                ImageButton imageButton = this.f287479j;
                if (imageButton != null) {
                    imageButton.setSelected(mo137352a());
                }
                if (mo137352a()) {
                    ((C58247e) C86312j.m106911c(C58247e.class)).On0();
                }
            } else {
                Log.m105928w("MicroMsg.GalleryTemplateUI", "not enable to select");
                C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
