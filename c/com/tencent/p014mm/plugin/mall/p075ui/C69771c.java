package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c63.C67347d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import v52.C14411b;

/* renamed from: com.tencent.mm.plugin.mall.ui.c */
public class C69771c extends BaseAdapter {

    /* renamed from: d */
    public List<ArrayList<C69776e>> f201328d = new ArrayList();

    /* renamed from: e */
    public SparseArray<String> f201329e = null;

    /* renamed from: f */
    public C69777f f201330f;

    /* renamed from: g */
    public Context f201331g;

    /* renamed from: h */
    public LayoutInflater f201332h;

    /* renamed from: i */
    public int f201333i;

    /* renamed from: j */
    public boolean f201334j = true;

    /* renamed from: n */
    public int f201335n = 0;

    /* renamed from: o */
    public int f201336o = 0;

    /* renamed from: p */
    public boolean f201337p = false;

    /* renamed from: q */
    public boolean f201338q = false;

    /* renamed from: com.tencent.mm.plugin.mall.ui.c$a */
    public class C69772a implements View.OnClickListener {
        public C69772a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mall/ui/FunctionListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C69771c cVar = C69771c.this;
            cVar.f201334j = !cVar.f201334j;
            cVar.f201338q = true;
            cVar.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.c$b */
    public class C69773b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f201340d;

        /* renamed from: e */
        public final /* synthetic */ MallFunction f201341e;

        public C69773b(int i, MallFunction mallFunction) {
            this.f201340d = i;
            this.f201341e = mallFunction;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x015c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r17) {
            /*
                r16 = this;
                r6 = r16
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r17
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r16
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "MicroMsg.FunctionListAdapter"
                java.lang.String r1 = "on Click"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
                com.tencent.mm.plugin.mall.ui.c r0 = com.tencent.p014mm.plugin.mall.p075ui.C69771c.this
                com.tencent.mm.plugin.mall.ui.c$f r0 = r0.f201330f
                if (r0 == 0) goto L_0x01d1
                int r1 = r6.f201340d
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r2 = r6.f201341e
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI$$c r0 = (com.tencent.p014mm.plugin.mall.p075ui.MallIndexBaseUI$$c) r0
                r0.getClass()
                java.lang.String r3 = "MicroMsg.MallIndexBaseUI"
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x01c4
                java.lang.String r7 = r2.f209731d
                boolean r7 = c63.C67345b.C0426a.m369a(r7)
                if (r7 != 0) goto L_0x004e
                java.lang.String r7 = r2.f209741q
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x004e
                r7 = 1
                goto L_0x004f
            L_0x004e:
                r7 = 0
            L_0x004f:
                r10 = 2
                if (r7 == 0) goto L_0x018e
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.String r11 = r2.f209731d
                r7[r5] = r11
                java.lang.String r11 = "onFunctionItemClick show disclaimer funcId=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r7)
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI r7 = r0.f201181a
                r11 = 2131832762(0x7f112fba, float:1.9298587E38)
                java.lang.String r7 = r7.getString(r11)
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI r11 = r0.f201181a
                r12 = 2131821556(0x7f1103f4, float:1.9275859E38)
                java.lang.String r11 = r11.getString(r12)
                com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle r12 = new com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle
                r12.<init>()
                r12.f157919d = r10
                r12.f157921f = r7
                java.lang.String r13 = r2.f209741q
                r12.f157922g = r13
                r12.f157923h = r11
                r12.f157924i = r5
                java.lang.String r13 = r2.f209731d
                r12.f157920e = r13
                android.os.Bundle r13 = new android.os.Bundle
                r13.<init>()
                java.lang.String r14 = "weapp_open_declare_prompt_key"
                r13.putParcelable(r14, r12)
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI r12 = r0.f201181a
                r12.getClass()
                java.lang.Class<h81.h> r14 = h81.C32735h.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                h81.h r14 = (h81.C32735h) r14
                h81.h$c r15 = h81.C32735h.C32737c.clicfg_appbrand_dialog_optimize_switch
                int r14 = r14.mo58779Qe(r15, r4)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
                if (r14 != r4) goto L_0x00aa
                r14 = 1
                goto L_0x00ab
            L_0x00aa:
                r14 = 0
            L_0x00ab:
                if (r14 != 0) goto L_0x00b4
                java.lang.String r12 = "handleFunctionByAppBrand clicfg_appbrand_dialog_optimize_switch close"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
                goto L_0x0159
            L_0x00b4:
                java.lang.String r14 = r2.f209736i
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 != 0) goto L_0x0159
                java.lang.Class<kr0.y0> r14 = kr0.C76632y0.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                kr0.y0 r14 = (kr0.C76632y0) r14
                java.lang.String r8 = r2.f209736i
                boolean r8 = r14.mo106904s8(r8, r13)
                if (r8 == 0) goto L_0x0159
                java.lang.Object[] r8 = new java.lang.Object[r4]
                java.lang.String r13 = r2.f209736i
                r8[r5] = r13
                java.lang.String r13 = "handleFunctionByAppBrand, intercept by AppBrandNativeLink, nativeUrl = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r8)
                c63.c r8 = c63.C67346c.m79699b()
                java.lang.String r13 = r2.f209731d
                r8.mo91481f(r13)
                c63.d r8 = c63.C67347d.m79705b()
                java.lang.String r13 = r2.f209731d
                r8.mo91485d(r13)
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews r8 = r2.f209739o
                if (r8 == 0) goto L_0x00f4
                c63.c r8 = c63.C67346c.m79699b()
                r8.mo91480d(r2)
            L_0x00f4:
                if (r1 < 0) goto L_0x0157
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews r8 = r2.f209739o
                if (r8 == 0) goto L_0x0107
                java.lang.String r8 = r8.f209746g
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x0107
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews r8 = r2.f209739o
                java.lang.String r8 = r8.f209746g
                goto L_0x0109
            L_0x0107:
                java.lang.String r8 = ""
            L_0x0109:
                java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.mall.MallFunction> r12 = r12.f201171i
                if (r12 != 0) goto L_0x010f
                r12 = 0
                goto L_0x0113
            L_0x010f:
                int r12 = r12.size()
            L_0x0113:
                boolean r13 = com.tencent.p014mm.plugin.mall.p075ui.C69771c.m82209d(r2)
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 10
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.String r10 = r2.f209731d
                r9[r5] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
                r9[r4] = r10
                r10 = 2
                r9[r10] = r15
                java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
                r12 = 3
                r9[r12] = r10
                r10 = 4
                r9[r10] = r8
                r8 = 5
                if (r13 == 0) goto L_0x0139
                r10 = 2
                goto L_0x013a
            L_0x0139:
                r10 = 1
            L_0x013a:
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9[r8] = r10
                r8 = 6
                java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
                r9[r8] = r10
                r8 = 7
                r9[r8] = r15
                r8 = 8
                r9[r8] = r15
                r8 = 9
                r9[r8] = r15
                r8 = 10881(0x2a81, float:1.5248E-41)
                r14.mo160131h(r8, r9)
            L_0x0157:
                r8 = 1
                goto L_0x015a
            L_0x0159:
                r8 = 0
            L_0x015a:
                if (r8 != 0) goto L_0x0193
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI r8 = r0.f201181a
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                qo3.a r9 = new qo3.a
                r9.<init>()
                r9.f225644a = r7
                java.lang.String r7 = r2.f209741q
                r9.f225660q = r7
                r9.f225663t = r11
                com.tencent.mm.plugin.mall.ui.h r7 = new com.tencent.mm.plugin.mall.ui.h
                r7.<init>(r0, r2, r1)
                r9.f225620C = r7
                r9.f225668y = r4
                com.tencent.mm.plugin.mall.ui.i r1 = new com.tencent.mm.plugin.mall.ui.i
                r1.<init>(r0, r2)
                r9.f225622E = r1
                qo3.g r1 = new qo3.g
                r7 = 2131887328(0x7f1204e0, float:1.940926E38)
                r1.<init>(r8, r7)
                r1.mo107525e(r9)
                r1.show()
                goto L_0x0193
            L_0x018e:
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI r7 = r0.f201181a
                r7.mo95935L7(r2, r1)
            L_0x0193:
                java.lang.Object[] r1 = new java.lang.Object[r4]
                int r7 = r2.f209740p
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r1[r5] = r7
                java.lang.String r7 = "type: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r1)
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 14419(0x3853, float:2.0205E-41)
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI r0 = r0.f201181a
                java.lang.String r0 = r0.f201170h
                r7[r5] = r0
                r0 = 4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7[r4] = r0
                int r0 = r2.f209740p
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = 2
                r7[r2] = r0
                r1.mo160131h(r3, r7)
                goto L_0x01d1
            L_0x01c4:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0[r5] = r1
                java.lang.String r1 = "onFunctionItemClick functionItem null; pos=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r0)
            L_0x01d1:
                java.lang.String r0 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69773b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.c$c */
    public class C69774c {

        /* renamed from: a */
        public View f201343a = null;

        /* renamed from: b */
        public ImageView f201344b = null;

        /* renamed from: c */
        public ImageView f201345c = null;

        /* renamed from: d */
        public TextView f201346d = null;

        /* renamed from: e */
        public TextView f201347e = null;

        /* renamed from: f */
        public String f201348f = null;

        /* renamed from: g */
        public ImageView f201349g = null;

        /* renamed from: h */
        public ImageView f201350h = null;

        /* renamed from: i */
        public ImageView f201351i = null;

        /* renamed from: j */
        public ImageView f201352j = null;

        public C69774c(C69771c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.c$d */
    public class C69775d {

        /* renamed from: a */
        public LinearLayout f201353a;

        /* renamed from: b */
        public TextView f201354b;

        /* renamed from: c */
        public View f201355c;

        /* renamed from: d */
        public View f201356d;

        /* renamed from: e */
        public View f201357e;

        /* renamed from: f */
        public ImageView f201358f;

        /* renamed from: g */
        public TextView f201359g;

        /* renamed from: h */
        public View f201360h = null;

        /* renamed from: i */
        public View f201361i;

        public C69775d(C69771c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.c$e */
    public class C69776e {

        /* renamed from: a */
        public MallFunction f201362a;

        /* renamed from: b */
        public int f201363b;

        public C69776e(C69771c cVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.c$f */
    public interface C69777f {
    }

    public C69771c(Context context, int i) {
        this.f201331g = context;
        this.f201333i = i;
        this.f201332h = LayoutInflater.from(context);
    }

    /* renamed from: d */
    public static boolean m82209d(MallFunction mallFunction) {
        MallNews mallNews = mallFunction.f209739o;
        return mallNews != null && !Util.isNullOrNil(mallNews.f209748i) && m82210g(mallFunction) && C67347d.m79705b().mo91484c(mallFunction.f209731d) != null;
    }

    /* renamed from: g */
    public static boolean m82210g(MallFunction mallFunction) {
        MallNews c = C67347d.m79705b().mo91484c(mallFunction.f209731d);
        if (c == null || Util.isNullOrNil(c.f209746g) || !c.f209746g.equals(mallFunction.f209739o.f209746g)) {
            Log.m105919d("MicroMsg.FunctionListAdapter", "old news null or should be replaced %s %s", mallFunction.f209739o.f209746g, mallFunction.f209732e);
            C67347d.m79705b().mo91483a(mallFunction.f209739o);
            return true;
        } else if (!"0".equals(c.f209743d)) {
            Log.m105918d("MicroMsg.FunctionListAdapter", "still old news or clicked, then should not show");
            return false;
        } else {
            Log.m105918d("MicroMsg.FunctionListAdapter", "still old news and should show");
            return true;
        }
    }

    /* renamed from: a */
    public final void mo95987a(View view, C69776e eVar, int i, int i2) {
        View view2 = view;
        C69776e eVar2 = eVar;
        int i3 = i;
        int i4 = i2;
        if (view2 != null) {
            C69774c cVar = (C69774c) view.getTag();
            MallFunction mallFunction = eVar2.f201362a;
            int i5 = eVar2.f201363b;
            cVar.f201348f = mallFunction.f209735h;
            C14411b.m13704a(cVar.f201344b, mallFunction.f209734g, C0966R.raw.mall_index_icon_default);
            cVar.f201346d.setText(mallFunction.f209732e);
            cVar.f201345c.setVisibility(8);
            MallNews mallNews = mallFunction.f209739o;
            if (mallNews == null || Util.isNullOrNil(mallNews.f209748i) || !m82210g(mallFunction)) {
                MallNews mallNews2 = mallFunction.f209739o;
                if (mallNews2 == null || mallNews2.f209753q != 1) {
                    cVar.f201347e.setText("");
                    cVar.f201347e.setVisibility(8);
                } else {
                    cVar.f201347e.setText(mallNews2.f209748i);
                    cVar.f201347e.setVisibility(0);
                }
                cVar.f201345c.setImageBitmap((Bitmap) null);
                cVar.f201345c.setVisibility(8);
                cVar.f201343a.setTag(C0966R.C0970id.f359346ke3, mallFunction.f209732e);
            } else {
                if (C67347d.m79705b().mo91484c(mallFunction.f209731d) != null) {
                    Log.m105928w("MicroMsg.FunctionListAdapter", "show the news : " + C67347d.m79705b().mo91484c(mallFunction.f209731d).f209748i);
                    cVar.f201347e.setText(mallFunction.f209739o.f209748i);
                    cVar.f201347e.setVisibility(0);
                } else {
                    cVar.f201347e.setVisibility(8);
                }
                C14411b.m13704a(cVar.f201345c, cVar.f201348f, 0);
                cVar.f201345c.setVisibility(0);
                View view3 = cVar.f201343a;
                view3.setTag(C0966R.C0970id.f359346ke3, mallFunction.f209732e + this.f201331g.getString(C0966R.string.f7359dv));
            }
            view2.setOnClickListener(new C69773b(i5, mallFunction));
            View view4 = cVar.f201343a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$MallFunctionWrapper;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$MallFunctionWrapper;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setEnabled(true);
            view2.setClickable(true);
            view2.setFocusable(true);
            cVar.f201352j.setVisibility(4);
            if (i3 == 0) {
                cVar.f201350h.setVisibility(0);
            } else if (i3 == 1) {
                cVar.f201350h.setVisibility(0);
            } else if (i3 == 2) {
                cVar.f201350h.setVisibility(4);
            }
            if (i4 == 0) {
                cVar.f201349g.setVisibility(0);
                cVar.f201351i.setVisibility(4);
            } else if (i4 == 1) {
                cVar.f201349g.setVisibility(4);
                cVar.f201351i.setVisibility(0);
            } else {
                cVar.f201349g.setVisibility(0);
                cVar.f201351i.setVisibility(0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95988b(int r29, com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69775d r30, int r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.c$e>> r4 = r0.f201328d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r1)
            java.util.List r4 = (java.util.List) r4
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r4.get(r5)
            com.tencent.mm.plugin.mall.ui.c$e r7 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69776e) r7
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r7 = r7.f201362a
            int r7 = r7.f209740p
            int r7 = r4.size()
            r8 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 0
            r11 = 1
            if (r7 <= 0) goto L_0x01b5
            java.lang.Object r7 = r4.get(r5)
            com.tencent.mm.plugin.mall.ui.c$e r7 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69776e) r7
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r7 = r7.f201362a
            int r7 = r7.f209740p
            android.util.SparseArray<java.lang.String> r12 = r0.f201329e
            if (r12 != 0) goto L_0x003f
            r12 = r10
            goto L_0x0045
        L_0x003f:
            java.lang.Object r12 = r12.get(r7)
            java.lang.String r12 = (java.lang.String) r12
        L_0x0045:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x00a0
            if (r1 != 0) goto L_0x004e
            goto L_0x0076
        L_0x004e:
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.c$e>> r13 = r0.f201328d
            int r14 = r1 + -1
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r14)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0078
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.c$e>> r13 = r0.f201328d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r14)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r5)
            com.tencent.mm.plugin.mall.ui.c$e r13 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69776e) r13
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r13 = r13.f201362a
            int r13 = r13.f209740p
            if (r7 == r13) goto L_0x0078
        L_0x0076:
            r13 = 1
            goto L_0x0079
        L_0x0078:
            r13 = 0
        L_0x0079:
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.c$e>> r14 = r0.f201328d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r14 = r14.size()
            int r14 = r14 - r11
            if (r1 != r14) goto L_0x0085
            goto L_0x009c
        L_0x0085:
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.c$e>> r14 = r0.f201328d
            int r1 = r1 + r11
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r1 = r14.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r5)
            com.tencent.mm.plugin.mall.ui.c$e r1 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69776e) r1
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r1 = r1.f201362a
            int r1 = r1.f209740p
            if (r7 == r1) goto L_0x009e
        L_0x009c:
            r1 = 1
            goto L_0x00a2
        L_0x009e:
            r1 = 0
            goto L_0x00a2
        L_0x00a0:
            r1 = 0
            r13 = 0
        L_0x00a2:
            if (r13 == 0) goto L_0x0137
            android.widget.TextView r7 = r2.f201354b
            r7.setText(r12)
            android.widget.TextView r7 = r2.f201354b
            r7.setVisibility(r5)
            android.view.View r7 = r2.f201355c
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r8.mo10233c(r9)
            java.lang.Object[] r13 = r8.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r15 = "fillFunctionsLine"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r7
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r7 = r2.f201356d
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r6)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r22 = "fillFunctionsLine"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r7
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "fillFunctionsLine"
            java.lang.String r22 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            android.widget.TextView r7 = r2.f201354b
            int r8 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201322c
            r7.setMinHeight(r8)
            android.view.View r7 = r2.f201356d
            int r8 = com.tencent.p014mm.plugin.mall.p075ui.C69803z.m82223a()
            r7.setBackgroundColor(r8)
            goto L_0x0232
        L_0x0137:
            android.widget.TextView r7 = r2.f201354b
            r7.setVisibility(r8)
            android.view.View r7 = r2.f201355c
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r8.mo10233c(r9)
            java.lang.Object[] r13 = r8.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r15 = "fillFunctionsLine"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r7
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r7 = r2.f201356d
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r9)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r22 = "fillFunctionsLine"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r7
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "fillFunctionsLine"
            java.lang.String r22 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0232
        L_0x01b5:
            android.widget.TextView r1 = r2.f201354b
            r1.setVisibility(r8)
            android.view.View r1 = r2.f201355c
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r7.mo10233c(r9)
            java.lang.Object[] r13 = r7.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r15 = "fillFunctionsLine"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r1 = r2.f201356d
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r9)
            java.lang.Object[] r20 = r7.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r22 = "fillFunctionsLine"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "fillFunctionsLine"
            java.lang.String r22 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r1 = 0
        L_0x0232:
            android.widget.LinearLayout r2 = r2.f201353a
            r2.setFocusable(r11)
            r7 = 0
        L_0x0238:
            r8 = 3
            if (r7 >= r8) goto L_0x0486
            int r8 = r2.getChildCount()
            r9 = 4
            if (r7 >= r8) goto L_0x0327
            android.view.View r8 = r2.getChildAt(r7)
            if (r8 == 0) goto L_0x0327
            android.view.View r8 = r2.getChildAt(r7)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r15.mo10233c(r6)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r16 = "fillFunctionsLine"
            java.lang.String r17 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r12 = r8
            r11 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r11 = r11.mo10231a(r5)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            int r11 = r4.size()
            if (r7 >= r11) goto L_0x02a2
            java.lang.Object r9 = r4.get(r7)
            com.tencent.mm.plugin.mall.ui.c$e r9 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69776e) r9
            r0.mo95987a(r8, r9, r7, r3)
            goto L_0x0322
        L_0x02a2:
            android.view.View r11 = r2.getChildAt(r7)
            r11.setFocusable(r5)
            android.view.View r11 = r2.getChildAt(r7)
            r11.setOnClickListener(r10)
            android.view.View r11 = r2.getChildAt(r7)
            java.lang.Object r11 = r11.getTag()
            com.tencent.mm.plugin.mall.ui.c$c r11 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69774c) r11
            android.view.View r15 = r11.f201343a
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r14.mo10233c(r12)
            java.lang.Object[] r13 = r14.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r17 = "fillFunctionsLine"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r12 = r15
            r10 = r14
            r14 = r16
            r9 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r22
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r10 = r10.mo10231a(r5)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "fillFunctionsLine"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r12 = r9
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            r8.setEnabled(r5)
            r8.setClickable(r5)
            android.widget.ImageView r9 = r11.f201349g
            r9.setVisibility(r5)
            android.widget.ImageView r9 = r11.f201350h
            r10 = 4
            r9.setVisibility(r10)
            android.widget.ImageView r9 = r11.f201351i
            r9.setVisibility(r10)
            android.widget.ImageView r9 = r11.f201352j
            r9.setVisibility(r10)
        L_0x0322:
            r20 = r4
            r4 = 0
            goto L_0x0433
        L_0x0327:
            com.tencent.mm.plugin.mall.ui.c$c r8 = new com.tencent.mm.plugin.mall.ui.c$c
            r8.<init>(r0)
            android.view.LayoutInflater r9 = r0.f201332h
            r10 = 2131496432(0x7f0c0df0, float:1.8616429E38)
            android.view.View r9 = r9.inflate(r10, r2, r5)
            r10 = 2131308890(0x7f09315a, float:1.8236048E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f201343a = r10
            r10 = 2131308887(0x7f093157, float:1.8236042E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201344b = r10
            r10 = 2131308892(0x7f09315c, float:1.8236052E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8.f201346d = r10
            r10 = 2131308886(0x7f093156, float:1.823604E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8.f201347e = r10
            r10 = 2131310186(0x7f09366a, float:1.8238677E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201345c = r10
            r10 = 2131301114(0x7f0912fa, float:1.8220277E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201349g = r10
            r10 = 2131301112(0x7f0912f8, float:1.8220273E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201350h = r10
            r10 = 2131301096(0x7f0912e8, float:1.822024E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201351i = r10
            r10 = 2131301104(0x7f0912f0, float:1.8220256E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201352j = r10
            r9.setTag(r8)
            int r8 = r4.size()
            if (r7 >= r8) goto L_0x03ad
            java.lang.Object r8 = r4.get(r7)
            com.tencent.mm.plugin.mall.ui.c$e r8 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69776e) r8
            r0.mo95987a(r9, r8, r7, r3)
            r20 = r4
            r4 = 0
            goto L_0x0425
        L_0x03ad:
            r9.setFocusable(r5)
            java.lang.Object r8 = r9.getTag()
            com.tencent.mm.plugin.mall.ui.c$c r8 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69774c) r8
            android.view.View r15 = r8.f201343a
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r14.mo10233c(r11)
            java.lang.Object[] r11 = r14.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "fillFunctionsLine"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r10 = r15
            r20 = r4
            r4 = r14
            r14 = r16
            r27 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r10 = r27
            r10.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r12 = "fillFunctionsLine"
            java.lang.String r13 = "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            r4 = 0
            r9.setOnClickListener(r4)
            r9.setEnabled(r5)
            r9.setClickable(r5)
            android.widget.ImageView r10 = r8.f201349g
            r10.setVisibility(r5)
            android.widget.ImageView r10 = r8.f201350h
            r11 = 4
            r10.setVisibility(r11)
            android.widget.ImageView r10 = r8.f201351i
            r10.setVisibility(r11)
            android.widget.ImageView r8 = r8.f201352j
            r8.setVisibility(r11)
        L_0x0425:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            int r11 = com.tencent.p014mm.plugin.mall.p075ui.C69770b.f201323d
            r12 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r10, r11, r12)
            r2.addView(r9, r8)
            r8 = r9
        L_0x0433:
            r9 = 2131233976(0x7f080cb8, float:1.8084105E38)
            if (r3 != 0) goto L_0x0470
            if (r1 == 0) goto L_0x0470
            if (r7 != 0) goto L_0x044e
            android.content.Context r9 = r0.f201331g
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131233972(0x7f080cb4, float:1.8084097E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r10)
            r8.setBackground(r9)
            r10 = 1
            goto L_0x047e
        L_0x044e:
            r10 = 1
            if (r7 != r10) goto L_0x045f
            android.content.Context r11 = r0.f201331g
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r9 = r11.getDrawable(r9)
            r8.setBackground(r9)
            goto L_0x047e
        L_0x045f:
            android.content.Context r9 = r0.f201331g
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131233973(0x7f080cb5, float:1.8084099E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r11)
            r8.setBackground(r9)
            goto L_0x047e
        L_0x0470:
            r10 = 1
            android.content.Context r11 = r0.f201331g
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r9 = r11.getDrawable(r9)
            r8.setBackground(r9)
        L_0x047e:
            int r7 = r7 + 1
            r10 = r4
            r4 = r20
            r11 = 1
            goto L_0x0238
        L_0x0486:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.C69771c.mo95988b(int, com.tencent.mm.plugin.mall.ui.c$d, int):void");
    }

    /* renamed from: f */
    public final boolean mo95989f(int i) {
        if (this.f201335n > 9) {
            int i2 = 0;
            for (int i3 = 0; i3 <= i; i3++) {
                i2 += ((ArrayList) ((ArrayList) this.f201328d).get(i3)).size();
            }
            int i4 = this.f201336o;
            int i5 = 3;
            if (i4 <= 3) {
                i5 = i4;
            }
            if (i2 >= 9) {
                boolean z = this.f201334j;
                if (!z || i != i5) {
                    return i == i4 && !z;
                }
                return true;
            }
        }
    }

    public int getCount() {
        return ((ArrayList) this.f201328d).size();
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r5 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r30, android.view.View r31, android.view.ViewGroup r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            boolean r2 = r29.mo95989f(r30)
            int r3 = r0.f201335n
            r4 = 9
            if (r3 <= r4) goto L_0x0015
            int r3 = r0.f201336o
            r4 = 3
            if (r3 <= r4) goto L_0x0016
            r3 = 3
            goto L_0x0016
        L_0x0015:
            r3 = -1
        L_0x0016:
            r4 = 0
            if (r2 != 0) goto L_0x002a
            int r5 = r1 + 1
            java.util.List<java.util.ArrayList<com.tencent.mm.plugin.mall.ui.c$e>> r6 = r0.f201328d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x002a
            boolean r5 = r0.mo95989f(r5)
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r6 = 1
            r7 = 2
            if (r2 == 0) goto L_0x0031
            r5 = 1
            goto L_0x0036
        L_0x0031:
            if (r5 == 0) goto L_0x0035
            r5 = 2
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            if (r31 != 0) goto L_0x00af
            com.tencent.mm.plugin.mall.ui.c$d r8 = new com.tencent.mm.plugin.mall.ui.c$d
            r8.<init>(r0)
            android.view.LayoutInflater r9 = r0.f201332h
            r10 = 2131496425(0x7f0c0de9, float:1.8616415E38)
            r11 = r32
            android.view.View r9 = r9.inflate(r10, r11, r4)
            r10 = 2131308880(0x7f093150, float:1.8236028E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r8.f201353a = r10
            r10 = 2131308879(0x7f09314f, float:1.8236026E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8.f201354b = r10
            r10 = 2131301075(0x7f0912d3, float:1.8220198E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f201355c = r10
            r10 = 2131307304(0x7f092b28, float:1.8232832E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f201356d = r10
            r10 = 2131308969(0x7f0931a9, float:1.8236209E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f201357e = r10
            r10 = 2131308970(0x7f0931aa, float:1.823621E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8.f201359g = r10
            r10 = 2131308968(0x7f0931a8, float:1.8236207E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8.f201358f = r10
            r10 = 2131309504(0x7f0933c0, float:1.8237294E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f201360h = r10
            r10 = 2131298214(0x7f0907a6, float:1.8214395E38)
            android.view.View r10 = r9.findViewById(r10)
            r8.f201361i = r10
            android.view.View r10 = r8.f201357e
            com.tencent.mm.plugin.mall.ui.c$a r11 = new com.tencent.mm.plugin.mall.ui.c$a
            r11.<init>()
            r10.setOnClickListener(r11)
            r9.setTag(r8)
            goto L_0x00b7
        L_0x00af:
            java.lang.Object r8 = r31.getTag()
            com.tencent.mm.plugin.mall.ui.c$d r8 = (com.tencent.p014mm.plugin.mall.p075ui.C69771c.C69775d) r8
            r9 = r31
        L_0x00b7:
            r10 = 8
            if (r2 == 0) goto L_0x02ab
            android.widget.TextView r2 = r8.f201354b
            r2.setVisibility(r10)
            android.view.View r2 = r8.f201355c
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r11)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r8.f201356d
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r11)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r2 = r8.f201357e
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r11)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.ImageView r2 = r8.f201358f
            r3 = 2131756221(0x7f1004bd, float:1.9143343E38)
            r2.setImageResource(r3)
            android.widget.ImageView r2 = r8.f201358f
            android.content.Context r11 = r0.f201331g
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131101015(0x7f060557, float:1.7814428E38)
            int r11 = r11.getColor(r12)
            android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r11, r13)
            android.widget.ImageView r2 = r8.f201358f
            int r11 = r2.getWidth()
            int r11 = r11 / r7
            float r11 = (float) r11
            r2.setPivotX(r11)
            android.widget.ImageView r2 = r8.f201358f
            int r11 = r2.getHeight()
            int r11 = r11 / r7
            float r11 = (float) r11
            r2.setPivotY(r11)
            android.widget.ImageView r2 = r8.f201358f
            r11 = 1119092736(0x42b40000, float:90.0)
            r2.setRotation(r11)
            android.widget.TextView r2 = r8.f201359g
            android.content.Context r11 = r0.f201331g
            r13 = 2131832684(0x7f112f6c, float:1.9298429E38)
            java.lang.String r11 = r11.getString(r13)
            r2.setText(r11)
            boolean r2 = r0.f201337p
            if (r2 == 0) goto L_0x020b
            boolean r2 = r0.f201338q
            if (r2 != 0) goto L_0x020b
            android.view.View r2 = r8.f201360h
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r11.mo10233c(r14)
            java.lang.Object[] r15 = r11.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r17 = "getView"
            java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r2.setVisibility(r11)
            java.lang.String r15 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x024a
        L_0x020b:
            android.view.View r2 = r8.f201360h
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r11.mo10233c(r14)
            java.lang.Object[] r22 = r11.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r24 = "getView"
            java.lang.String r25 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r2
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r2.setVisibility(r11)
            java.lang.String r22 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x024a:
            boolean r2 = r0.f201334j
            if (r2 == 0) goto L_0x0260
            android.widget.LinearLayout r2 = r8.f201353a
            r2.setVisibility(r10)
            android.widget.TextView r2 = r8.f201359g
            android.content.Context r3 = r0.f201331g
            java.lang.String r3 = r3.getString(r13)
            r2.setText(r3)
            goto L_0x0446
        L_0x0260:
            android.widget.LinearLayout r2 = r8.f201353a
            r2.setVisibility(r4)
            r0.mo95988b(r1, r8, r5)
            android.widget.ImageView r2 = r8.f201358f
            r2.setImageResource(r3)
            android.widget.ImageView r2 = r8.f201358f
            android.content.Context r3 = r0.f201331g
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r12)
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r3, r5)
            android.widget.ImageView r2 = r8.f201358f
            int r3 = r2.getWidth()
            int r3 = r3 / r7
            float r3 = (float) r3
            r2.setPivotX(r3)
            android.widget.ImageView r2 = r8.f201358f
            int r3 = r2.getHeight()
            int r3 = r3 / r7
            float r3 = (float) r3
            r2.setPivotY(r3)
            android.widget.ImageView r2 = r8.f201358f
            r3 = 1132920832(0x43870000, float:270.0)
            r2.setRotation(r3)
            android.widget.TextView r2 = r8.f201359g
            android.content.Context r3 = r0.f201331g
            r5 = 2131832682(0x7f112f6a, float:1.9298425E38)
            java.lang.String r3 = r3.getString(r5)
            r2.setText(r3)
            goto L_0x0446
        L_0x02ab:
            if (r3 <= 0) goto L_0x03bf
            boolean r2 = r0.f201334j
            if (r2 == 0) goto L_0x03bf
            if (r1 < r3) goto L_0x03bf
            int r2 = r0.f201336o
            if (r1 > r2) goto L_0x03bf
            android.widget.LinearLayout r2 = r8.f201353a
            r2.setVisibility(r10)
            android.view.View r2 = r8.f201357e
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r8.f201360h
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.widget.TextView r2 = r8.f201354b
            r2.setVisibility(r10)
            android.view.View r2 = r8.f201355c
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r8.f201356d
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0446
        L_0x03bf:
            android.widget.LinearLayout r2 = r8.f201353a
            r2.setVisibility(r4)
            r0.mo95988b(r1, r8, r5)
            android.view.View r2 = r8.f201357e
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r2 = r8.f201360h
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r3.mo10233c(r5)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r21 = "getView"
            java.lang.String r22 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0446:
            int r2 = r29.getCount()
            int r2 = r2 - r6
            if (r1 != r2) goto L_0x0495
            android.view.View r1 = r8.f201361i
            int r2 = com.tencent.p014mm.plugin.mall.p075ui.C69803z.m82223a()
            r1.setBackgroundColor(r2)
            android.view.View r1 = r8.f201361i
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r11 = r2.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r12 = "getView"
            java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x04d4
        L_0x0495:
            android.view.View r2 = r8.f201361i
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r3)
            java.lang.Object[] r18 = r1.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/mall/ui/FunctionListAdapter"
            java.lang.String r4 = "getView"
            java.lang.String r5 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x04d4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.C69771c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
