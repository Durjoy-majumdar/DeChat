package w82;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.avatar_view.MultitalkStatusIconLayout;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import lu3.C34379c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: w82.e */
public final class C111759e {

    /* renamed from: a */
    public final Context f334675a;

    /* renamed from: b */
    public final C111773l f334676b;

    /* renamed from: c */
    public final MultitalkStatusIconLayout f334677c;

    /* renamed from: d */
    public final C13601g f334678d = C36568h.m40985a(new C111760a(this));

    /* renamed from: e */
    public C105882d f334679e;

    /* renamed from: f */
    public C34379c<?> f334680f;

    /* renamed from: g */
    public final C13601g f334681g;

    /* renamed from: h */
    public int f334682h;

    /* renamed from: i */
    public boolean f334683i;

    /* renamed from: j */
    public boolean f334684j;

    /* renamed from: k */
    public final String f334685k;

    /* renamed from: w82.e$a */
    public static final class C111760a extends C87413o implements C32224a<C111751a> {

        /* renamed from: d */
        public final /* synthetic */ C111759e f334686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111760a(C111759e eVar) {
            super(0);
            this.f334686d = eVar;
        }

        public Object invoke() {
            return new C111751a(this.f334686d.f334675a);
        }
    }

    /* renamed from: w82.e$b */
    public static final class C111761b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C111759e f334687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111761b(C111759e eVar) {
            super(0);
            this.f334687d = eVar;
        }

        public Object invoke() {
            TextView textView = new TextView(this.f334687d.f334675a);
            int dimensionPixelSize = textView.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            textView.setGravity(80);
            textView.setMaxLines(2);
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(textView.getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            textView.setBackgroundResource(C0966R.C0969drawable.icon_shadow_multitalk_avatar);
            textView.setVisibility(4);
            return textView;
        }
    }

    public C111759e(Context context, C105882d dVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(dVar, "defaultMemberInfo");
        this.f334675a = context;
        this.f334676b = new C111773l(context);
        this.f334677c = new MultitalkStatusIconLayout(context, (AttributeSet) null);
        this.f334679e = dVar;
        this.f334681g = C36568h.m40985a(new C111761b(this));
        this.f334682h = -1;
        this.f334685k = C75592q0.m90789s();
        mo163496c(dVar, true);
    }

    /* renamed from: a */
    public final C111751a mo163494a() {
        return (C111751a) ((C36570n) this.f334678d).getValue();
    }

    /* renamed from: b */
    public final TextView mo163495b() {
        return (TextView) this.f334681g.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (gy3.C87412m.m108589b(r2.f334679e.f314927b, r3.f314927b) != false) goto L_0x008c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163496c(com.tencent.p014mm.plugin.multitalk.p078ui.C105882d r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "memberInfo"
            gy3.C87412m.m108594g(r3, r0)
            com.tencent.mm.plugin.multitalk.ui.d r0 = r2.f334679e
            boolean r0 = gy3.C87412m.m108589b(r3, r0)
            if (r0 == 0) goto L_0x0010
            if (r4 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update member info "
            r0.append(r1)
            java.lang.String r1 = r3.f314927b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MT.MultiTalkAvatarHolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.widget.TextView r0 = r2.mo163495b()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0037
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r0 = r2.f334677c
            r0.mo151000a(r3)
        L_0x0037:
            if (r4 != 0) goto L_0x0057
            com.tencent.mm.plugin.multitalk.ui.d r4 = r2.f334679e
            boolean r0 = r4.f314929d
            boolean r1 = r3.f314929d
            if (r0 != r1) goto L_0x0057
            boolean r4 = r4.mo150900a()
            boolean r0 = r3.mo150900a()
            if (r4 != r0) goto L_0x0057
            com.tencent.mm.plugin.multitalk.ui.d r4 = r2.f334679e
            java.lang.String r4 = r4.f314927b
            java.lang.String r0 = r3.f314927b
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 != 0) goto L_0x008c
        L_0x0057:
            w82.l r4 = r2.f334676b
            r4.mo163506d(r3)
            android.widget.TextView r4 = r2.mo163495b()
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = r3.f314927b
            com.tencent.mm.storage.z1 r0 = r0.get(r1)
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = r0.mo62909j3()
            if (r0 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            java.lang.String r0 = r3.f314927b
        L_0x007f:
            r4.setText(r0)
            java.lang.String r4 = r3.f314927b
            java.lang.String r0 = r2.f334685k
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            r2.f334684j = r4
        L_0x008c:
            w82.l r4 = r2.f334676b
            r4.mo163507e(r3)
            r2.f334679e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w82.C111759e.mo163496c(com.tencent.mm.plugin.multitalk.ui.d, boolean):void");
    }
}
