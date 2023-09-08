package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p910lj.C76701a;
import qo3.C77390c0;
import te3.C101804kv2;
import te3.C64545m7;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader */
public class ArtistHeader extends LinearLayout implements C94853e.C94861h {

    /* renamed from: d */
    public C64545m7 f276629d = null;

    /* renamed from: e */
    public C95313d f276630e;

    /* renamed from: f */
    public C77390c0 f276631f = null;

    /* renamed from: g */
    public ImageView f276632g;

    /* renamed from: h */
    public ProgressBar f276633h;

    /* renamed from: i */
    public View f276634i;

    /* renamed from: j */
    public Context f276635j = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$a */
    public class C95307a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f276636d;

        /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$a$a */
        public class C95308a implements View.OnClickListener {
            public C95308a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistHeader$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$1");
                ArtistHeader.m121405a(ArtistHeader.this).dismiss();
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$a$b */
        public class C95309b implements C94901o.C94915l {
            public C95309b() {
            }

            /* renamed from: a */
            public void mo131160a(Bitmap bitmap) {
                SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$2");
                if (C102236a0.m134740e(bitmap)) {
                    ArtistHeader.m121407c(ArtistHeader.this, bitmap);
                    ArtistHeader artistHeader = ArtistHeader.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    ProgressBar progressBar = artistHeader.f276633h;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    progressBar.setVisibility(4);
                    ArtistHeader artistHeader2 = ArtistHeader.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    View view = artistHeader2.f276634i;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$2", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$2", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C94901o Fx0 = C94866e1.Fx0();
                    C101804kv2 kv22 = ArtistHeader.m121406b(ArtistHeader.this).f184213h.f184437d;
                    ArtistHeader artistHeader3 = ArtistHeader.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    ImageView imageView = artistHeader3.f276632g;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    Fx0.mo131105Y(kv22, imageView, C95307a.this.f276636d.hashCode(), C96983o3.f284139k);
                }
                SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$2");
            }
        }

        public C95307a(Context context) {
            this.f276636d = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
            if (ArtistHeader.m121405a(ArtistHeader.this) != null && ArtistHeader.m121405a(ArtistHeader.this).isShowing()) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (ArtistHeader.m121406b(ArtistHeader.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                View inflate = LayoutInflater.from(ArtistHeader.this.getContext()).inflate(C0966R.C0971layout.cby, (ViewGroup) null);
                ArtistHeader artistHeader = ArtistHeader.this;
                C77390c0 c0Var = new C77390c0(ArtistHeader.this.getContext(), C0966R.style.a65);
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                artistHeader.f276631f = c0Var;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                inflate.setOnClickListener(new C95308a());
                ArtistHeader.m121405a(ArtistHeader.this).setCanceledOnTouchOutside(true);
                ArtistHeader.m121405a(ArtistHeader.this).setContentView(inflate);
                ArtistHeader.m121405a(ArtistHeader.this).show();
                ArtistHeader artistHeader2 = ArtistHeader.this;
                SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                artistHeader2.f276632g = (ImageView) inflate.findViewById(C0966R.C0970id.etw);
                SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                ArtistHeader artistHeader3 = ArtistHeader.this;
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                artistHeader3.f276633h = (ProgressBar) inflate.findViewById(C0966R.C0970id.etx);
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                ArtistHeader artistHeader4 = ArtistHeader.this;
                View findViewById = inflate.findViewById(C0966R.C0970id.ety);
                SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                artistHeader4.f276634i = findViewById;
                SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                C94901o Fx0 = C94866e1.Fx0();
                C101804kv2 kv22 = ArtistHeader.m121406b(ArtistHeader.this).f184213h.f184437d;
                ArtistHeader artistHeader5 = ArtistHeader.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                ImageView imageView = artistHeader5.f276632g;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                Fx0.mo131127l(kv22, imageView, this.f276636d.hashCode(), true, C96983o3.f284139k, false, new C95309b());
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$b */
    public class C95310b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$b$a */
        public class C95311a implements C94901o.C94915l {
            public C95311a() {
            }

            /* renamed from: a */
            public void mo131160a(Bitmap bitmap) {
                SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2$1");
                if (C102236a0.m134740e(bitmap)) {
                    ArtistHeader.m121407c(ArtistHeader.this, bitmap);
                    ArtistHeader artistHeader = ArtistHeader.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    ProgressBar progressBar = artistHeader.f276633h;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    progressBar.setVisibility(4);
                    ArtistHeader artistHeader2 = ArtistHeader.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    View view = artistHeader2.f276634i;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistHeader$2$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/ArtistHeader$2$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2$1");
            }
        }

        public C95310b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2");
            C94901o Fx0 = C94866e1.Fx0();
            C101804kv2 kv22 = ArtistHeader.m121406b(ArtistHeader.this).f184213h.f184437d;
            ArtistHeader artistHeader = ArtistHeader.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            ImageView imageView = artistHeader.f276632g;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            ArtistHeader artistHeader2 = ArtistHeader.this;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            Context context = artistHeader2.f276635j;
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            Fx0.mo131127l(kv22, imageView, context.hashCode(), true, C96983o3.f284139k, false, new C95311a());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$c */
    public interface C95312c {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader$d */
    public class C95313d {

        /* renamed from: a */
        public ImageView f276642a;

        /* renamed from: b */
        public TextView f276643b;

        /* renamed from: c */
        public TextView f276644c;

        /* renamed from: d */
        public TextView f276645d;

        /* renamed from: e */
        public TextView f276646e;

        public C95313d(ArtistHeader artistHeader) {
        }
    }

    public ArtistHeader(Context context) {
        super(context);
        mo132033d(context);
    }

    /* renamed from: a */
    public static /* synthetic */ C77390c0 m121405a(ArtistHeader artistHeader) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        C77390c0 c0Var = artistHeader.f276631f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        return c0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C64545m7 m121406b(ArtistHeader artistHeader) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        C64545m7 m7Var = artistHeader.f276629d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        return m7Var;
    }

    /* renamed from: c */
    public static void m121407c(ArtistHeader artistHeader, Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        artistHeader.getClass();
        SnsMethodCalculate.markStartTimeMs("showHDAvatar", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        ImageView imageView = artistHeader.f276632g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        SnsMethodCalculate.markEndTimeMs("showHDAvatar", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    /* renamed from: d */
    public final void mo132033d(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c28, this, true);
        this.f276635j = context;
        C95313d dVar = new C95313d(this);
        this.f276630e = dVar;
        dVar.f276642a = (ImageView) inflate.findViewById(C0966R.C0970id.f6156yv);
        this.f276630e.f276643b = (TextView) inflate.findViewById(C0966R.C0970id.f5257a6);
        this.f276630e.f276644c = (TextView) inflate.findViewById(C0966R.C0970id.f5260a9);
        this.f276630e.f276645d = (TextView) inflate.findViewById(C0966R.C0970id.f5258a7);
        this.f276630e.f276646e = (TextView) inflate.findViewById(C0966R.C0970id.f5259a8);
        this.f276630e.f276642a.setOnClickListener(new C95307a(context));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void onImageFinish(String str, boolean z) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        if (this.f276629d == null) {
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            return;
        }
        C77390c0 c0Var = this.f276631f;
        if (c0Var != null && c0Var.isShowing()) {
            if (z || (str2 = this.f276629d.f184213h.f184437d.f298689d) == null || !str2.equals(str)) {
                ImageView imageView = this.f276632g;
                if (imageView != null) {
                    imageView.post(new C95310b());
                }
            } else {
                Context context = this.f276635j;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.jbu), 0).show();
                SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                return;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void setBackClickListener(C95312c cVar) {
        SnsMethodCalculate.markStartTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        SnsMethodCalculate.markEndTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public void setUserName(C64545m7 m7Var) {
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        if (m7Var == null) {
            Log.m105920e("MicroMsg.ArtistHeader", "userName or selfName is null ");
            SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            return;
        }
        this.f276629d = m7Var;
        C94866e1.Fx0().mo131105Y(m7Var.f184213h.f184437d, this.f276630e.f276642a, this.f276635j.hashCode(), C96983o3.f284139k);
        this.f276630e.f276644c.setText(m7Var.f184209d);
        this.f276630e.f276643b.setText(m7Var.f184212g);
        this.f276630e.f276646e.setText(m7Var.f184210e);
        this.f276630e.f276645d.setText(m7Var.f184211f);
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public ArtistHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132033d(context);
    }
}
