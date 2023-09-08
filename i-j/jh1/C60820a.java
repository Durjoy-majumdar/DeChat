package jh1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fh1.C58999c1;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C64622p31;
import wc1.C15064b;

/* renamed from: jh1.a */
public final class C60820a implements View.OnClickListener {

    /* renamed from: d */
    public final View f173221d;

    /* renamed from: e */
    public final C58999c1 f173222e;

    /* renamed from: f */
    public final String f173223f;

    /* renamed from: g */
    public ViewGroup f173224g;

    /* renamed from: h */
    public View f173225h;

    /* renamed from: i */
    public TextView f173226i;

    /* renamed from: j */
    public ImageView f173227j;

    /* renamed from: n */
    public TextView f173228n;

    /* renamed from: o */
    public WeImageView f173229o;

    /* renamed from: p */
    public TextView f173230p;

    public C60820a(View view, C58999c1 c1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(c1Var, "controller");
        this.f173221d = view;
        this.f173222e = c1Var;
        this.f173223f = c1Var.f168796j;
    }

    /* renamed from: a */
    public final void mo85735a() {
        ViewGroup viewGroup = this.f173224g;
        TextView textView = null;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.f173221d.findViewById(C0966R.C0970id.ogc);
            if (viewGroup != null) {
                viewGroup.setOnClickListener(this);
            } else {
                viewGroup = null;
            }
        }
        this.f173224g = viewGroup;
        View view = this.f173225h;
        if (view == null) {
            if (viewGroup == null || (view = viewGroup.findViewById(C0966R.C0970id.oh_)) == null) {
                view = null;
            } else {
                view.setOnClickListener(this);
            }
        }
        this.f173225h = view;
        TextView textView2 = this.f173226i;
        if (textView2 == null) {
            ViewGroup viewGroup2 = this.f173224g;
            if (viewGroup2 == null || (textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.oh7)) == null) {
                textView2 = null;
            } else {
                C15064b bVar = C15064b.f41199a;
                Context context = textView2.getContext();
                C87412m.m108593f(context, "context");
                C15064b.m14230a(bVar, context, textView2, 17.0f, 0.0f, 8, (Object) null);
            }
        }
        this.f173226i = textView2;
        ImageView imageView = this.f173227j;
        if (imageView == null) {
            ViewGroup viewGroup3 = this.f173224g;
            imageView = viewGroup3 != null ? (ImageView) viewGroup3.findViewById(C0966R.C0970id.ohi) : null;
        }
        this.f173227j = imageView;
        TextView textView3 = this.f173228n;
        if (textView3 == null) {
            ViewGroup viewGroup4 = this.f173224g;
            if (viewGroup4 == null || (textView3 = (TextView) viewGroup4.findViewById(C0966R.C0970id.ohd)) == null) {
                textView3 = null;
            } else {
                textView3.setOnClickListener(this);
            }
        }
        this.f173228n = textView3;
        WeImageView weImageView = this.f173229o;
        if (weImageView == null) {
            ViewGroup viewGroup5 = this.f173224g;
            if (viewGroup5 == null || (weImageView = (WeImageView) viewGroup5.findViewById(C0966R.C0970id.ohe)) == null) {
                weImageView = null;
            } else {
                weImageView.setOnClickListener(this);
            }
        }
        this.f173229o = weImageView;
        TextView textView4 = this.f173230p;
        if (textView4 == null) {
            ViewGroup viewGroup6 = this.f173224g;
            if (!(viewGroup6 == null || (textView4 = (TextView) viewGroup6.findViewById(C0966R.C0970id.oir)) == null)) {
                C15064b bVar2 = C15064b.f41199a;
                Context context2 = textView4.getContext();
                C87412m.m108593f(context2, "context");
                C15064b.m14230a(bVar2, context2, textView4, 14.0f, 0.0f, 8, (Object) null);
            }
            this.f173230p = textView;
        }
        textView = textView4;
        this.f173230p = textView;
    }

    /* renamed from: b */
    public final void mo85736b(boolean z, boolean z2, Integer num) {
        String str;
        if (z) {
            TextView textView = this.f173228n;
            if (textView != null) {
                textView.setVisibility(0);
            }
            WeImageView weImageView = this.f173229o;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            C9406j jVar = C9406j.f29357a;
            C64622p31 p312 = this.f173222e.f168804u;
            if (p312 == null || (str = p312.f184746d) == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 20, (String) null, (String) null, num, 12, (Object) null);
            return;
        }
        TextView textView2 = this.f173228n;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        WeImageView weImageView2 = this.f173229o;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo85737c(int i) {
        Integer num = null;
        if (C58739j4.f168176a.mo83692U()) {
            String str = this.f173223f;
            StringBuilder sb = new StringBuilder();
            sb.append("setVisible:");
            sb.append(i);
            sb.append(",participantContainner visibility:");
            ViewGroup viewGroup = this.f173224g;
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getVisibility());
            }
            sb.append(num);
            Log.printInfoStack(str, sb.toString(), new Object[0]);
        } else {
            String str2 = this.f173223f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("setVisible:");
            sb4.append(i);
            sb4.append(",participantContainner visibility:");
            ViewGroup viewGroup2 = this.f173224g;
            if (viewGroup2 != null) {
                num = Integer.valueOf(viewGroup2.getVisibility());
            }
            sb4.append(num);
            Log.m105924i(str2, sb4.toString());
        }
        if (this.f173224g == null) {
            mo85735a();
        }
        ViewGroup viewGroup3 = this.f173224g;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(i);
        }
    }

    public void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = true;
        if ((valueOf == null || valueOf.intValue() != C0966R.C0970id.ohd) && (valueOf == null || valueOf.intValue() != C0966R.C0970id.ohe)) {
            z = false;
        }
        if (z) {
            C9406j jVar = C9406j.f29357a;
            C64622p31 p312 = this.f173222e.f168804u;
            if (p312 == null || (str = p312.f184746d) == null) {
                str = "";
            }
            C9406j.m9112f(jVar, str, 21, (String) null, (String) null, 3, 12, (Object) null);
            this.f173222e.mo84229G3(this.f173224g);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.oh_) {
            C32226l<? super Boolean, C13598b0> lVar = this.f173222e.f168806w;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            this.f173222e.mo84230m3();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultParticipantPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
