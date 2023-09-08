package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lv1.C99681n;
import p196ln.C76705f;
import pv1.C22019b;

/* renamed from: xv1.f */
public class C102750f extends C23128k {

    /* renamed from: A */
    public C102751a f303395A = new C102751a();

    /* renamed from: B */
    public C102752b f303396B = new C102752b(this);

    /* renamed from: u */
    public CharSequence f303397u;

    /* renamed from: v */
    public String f303398v;

    /* renamed from: w */
    public CharSequence f303399w;

    /* renamed from: x */
    public String f303400x;

    /* renamed from: y */
    public String f303401y;

    /* renamed from: z */
    public C99681n f303402z;

    /* renamed from: xv1.f$a */
    public class C102751a extends C22019b.C22021b {
        public C102751a() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            Class cls = C76705f.class;
            C102752b bVar2 = (C102752b) aVar;
            C93938f0.m118693a(C102750f.this.f303397u, bVar2.f303405b);
            ((C76705f) C86312j.m106911c(cls)).mo106849z(bVar2.f303406c, C102750f.this.f303398v);
            C93938f0.m118693a(C102750f.this.f303399w, bVar2.f303407d);
            if (!Util.isNullOrNil(C102750f.this.f303400x)) {
                bVar2.f303408e.setVisibility(0);
                ((C76705f) C86312j.m106911c(cls)).mo106849z(bVar2.f303408e, C102750f.this.f303400x);
            } else {
                bVar2.f303408e.setVisibility(8);
            }
            View view = bVar2.f303404a;
            if (C102750f.this.f62326d) {
                view.setBackgroundResource(C0966R.C0969drawable.bcr);
            } else {
                view.setBackgroundResource(C0966R.C0969drawable.ags);
            }
            if (C102750f.this.f62324b == 0) {
                View view2 = bVar2.f303410g;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view4 = bVar2.f303410g;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            bVar2.f303409f.setVisibility(0);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.asw, viewGroup, false);
            C102752b bVar = C102750f.this.f303396B;
            bVar.f303405b = (TextView) inflate.findViewById(C0966R.C0970id.euc);
            bVar.f303406c = (ImageView) inflate.findViewById(C0966R.C0970id.a1s);
            bVar.f303407d = (TextView) inflate.findViewById(C0966R.C0970id.eud);
            bVar.f303408e = (ImageView) inflate.findViewById(C0966R.C0970id.a1u);
            bVar.f303409f = (TextView) inflate.findViewById(C0966R.C0970id.f358456f71);
            bVar.f303404a = inflate.findViewById(C0966R.C0970id.f359139j63);
            bVar.f303410g = inflate.findViewById(C0966R.C0970id.hqn);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    /* renamed from: xv1.f$b */
    public class C102752b extends C22019b.C22020a {

        /* renamed from: a */
        public View f303404a;

        /* renamed from: b */
        public TextView f303405b;

        /* renamed from: c */
        public ImageView f303406c;

        /* renamed from: d */
        public TextView f303407d;

        /* renamed from: e */
        public ImageView f303408e;

        /* renamed from: f */
        public TextView f303409f;

        /* renamed from: g */
        public View f303410g;

        public C102752b(C102750f fVar) {
            super(fVar);
        }
    }

    public C102750f(int i) {
        super(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35129a(android.content.Context r17, pv1.C22019b.C22020a r18, java.lang.Object... r19) {
        /*
            r16 = this;
            r0 = r16
            lv1.n r1 = r0.f303402z
            java.lang.String r2 = r1.f292151e
            int r1 = r1.f292149c
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 3
            r7 = 2
            if (r1 == r3) goto L_0x0049
            if (r1 == r7) goto L_0x0046
            if (r1 == r6) goto L_0x0044
            r8 = 5
            if (r1 == r8) goto L_0x0025
            r8 = 6
            if (r1 == r8) goto L_0x0022
            r8 = 7
            if (r1 == r8) goto L_0x0020
            r10 = r5
            r12 = 0
            r13 = 0
            goto L_0x0052
        L_0x0020:
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            r5 = 1
            goto L_0x0027
        L_0x0025:
            r1 = 0
            r5 = 0
        L_0x0027:
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.get(r2)
            java.lang.String r8 = r8.getNickname()
            java.lang.String r9 = kv1.C99251g.m129283d(r2)
            r13 = r1
            r12 = r5
            r10 = r8
            r5 = r9
            goto L_0x0052
        L_0x0044:
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            r8 = 1
            goto L_0x004b
        L_0x0049:
            r1 = 0
            r8 = 0
        L_0x004b:
            java.lang.String r9 = kv1.C99251g.m129283d(r2)
            r13 = r1
            r12 = r8
            r10 = r9
        L_0x0052:
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r6]
            java.lang.String r8 = "\""
            r1[r4] = r8
            java.lang.String r9 = r0.f303401y
            java.lang.String r9 = kv1.C99251g.m129283d(r9)
            android.text.TextPaint r11 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162739c
            r14 = 1133903872(0x43960000, float:300.0)
            android.text.TextUtils$TruncateAt r15 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r9 = android.text.TextUtils.ellipsize(r9, r11, r14, r15)
            r1[r3] = r9
            r1[r7] = r8
            java.lang.CharSequence r1 = android.text.TextUtils.concat(r1)
            r0.f303397u = r1
            java.lang.String r1 = r0.f303401y
            r0.f303398v = r1
            r0.f303400x = r2
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 != 0) goto L_0x00b7
            lv1.n r1 = r0.f303402z
            lv1.i r1 = r1.f292168v
            r2 = 1137180672(0x43c80000, float:400.0)
            android.text.TextPaint r9 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162737a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            java.lang.String r5 = "("
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            lv1.f r11 = new lv1.f
            r11.<init>()
            r11.f292088a = r10
            r11.f292089b = r1
            r11.f292090c = r12
            r11.f292091d = r13
            r11.f292094g = r2
            r11.f292095h = r9
            r11.f292096i = r5
            java.lang.String r1 = ")"
            r11.f292097j = r1
            lv1.g r1 = kv1.C99254i.m129308e(r11)
            java.lang.CharSequence r1 = r1.f292107a
            r0.f303399w = r1
            goto L_0x00cb
        L_0x00b7:
            lv1.n r1 = r0.f303402z
            lv1.i r11 = r1.f292168v
            r14 = 1137180672(0x43c80000, float:400.0)
            android.text.TextPaint r15 = com.tencent.p014mm.plugin.fts.p059ui.C56782d.f162737a
            lv1.f r1 = lv1.C99667f.m130092e(r10, r11, r12, r13, r14, r15)
            lv1.g r1 = kv1.C99254i.m129308e(r1)
            java.lang.CharSequence r1 = r1.f292107a
            r0.f303399w = r1
        L_0x00cb:
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r6]
            r1[r4] = r8
            java.lang.CharSequence r2 = r0.f303399w
            r1[r3] = r2
            r2 = 2131835455(0x7f113a3f, float:1.930405E38)
            r3 = r17
            java.lang.String r2 = r3.getString(r2)
            r1[r7] = r2
            java.lang.CharSequence r1 = android.text.TextUtils.concat(r1)
            r0.f303399w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.C102750f.mo35129a(android.content.Context, pv1.b$a, java.lang.Object[]):void");
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303395A;
    }

    /* renamed from: l */
    public C22019b.C22020a mo36518l() {
        return this.f303396B;
    }
}
