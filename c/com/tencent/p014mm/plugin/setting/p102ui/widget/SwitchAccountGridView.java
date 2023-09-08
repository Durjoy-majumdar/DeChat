package com.tencent.p014mm.plugin.setting.p102ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C85444i3;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsSwitchAccountUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView */
public class SwitchAccountGridView extends LinearLayout {

    /* renamed from: d */
    public boolean f249037d;

    /* renamed from: e */
    public boolean f249038e;

    /* renamed from: f */
    public boolean f249039f;

    /* renamed from: g */
    public String f249040g;

    /* renamed from: h */
    public String f249041h;

    /* renamed from: i */
    public List<String> f249042i = new ArrayList();

    /* renamed from: j */
    public List<C85455g> f249043j = new ArrayList();

    /* renamed from: n */
    public List<View> f249044n = new ArrayList();

    /* renamed from: o */
    public C85453e f249045o;

    /* renamed from: p */
    public C85454f f249046p;

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$a */
    public class C85449a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f249047d;

        public C85449a(String str) {
            this.f249047d = str;
        }

        public void onClick(View view) {
            C85453e eVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.SwitchAccountGridView", "click %s", this.f249047d);
            SwitchAccountGridView switchAccountGridView = SwitchAccountGridView.this;
            if (!switchAccountGridView.f249037d && !switchAccountGridView.f249038e && (eVar = switchAccountGridView.f249045o) != null) {
                ((SettingsSwitchAccountUI.C85429h) eVar).mo118790a(this.f249047d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$b */
    public class C85450b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f249049d;

        public C85450b(String str) {
            this.f249049d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C85454f fVar = SwitchAccountGridView.this.f249046p;
            if (fVar != null) {
                String str = this.f249049d;
                SettingsSwitchAccountUI.C85428g gVar = (SettingsSwitchAccountUI.C85428g) fVar;
                SettingsSwitchAccountUI settingsSwitchAccountUI = SettingsSwitchAccountUI.this;
                C76879j.m92707A(settingsSwitchAccountUI, settingsSwitchAccountUI.getString(C0966R.string.izt, new Object[]{((SwitchAccountModel) ((HashMap) settingsSwitchAccountUI.f248998s).get(str)).f248935e}), SettingsSwitchAccountUI.this.getString(C0966R.string.a3h), SettingsSwitchAccountUI.this.getString(C0966R.string.a4h), SettingsSwitchAccountUI.this.getString(C0966R.string.f360090a14), new C85444i3(gVar, str), (DialogInterface.OnClickListener) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$c */
    public class C85451c implements View.OnClickListener {
        public C85451c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.SwitchAccountGridView", "click addBtn");
            SwitchAccountGridView switchAccountGridView = SwitchAccountGridView.this;
            C85453e eVar = switchAccountGridView.f249045o;
            if (eVar != null && !switchAccountGridView.f249038e && !switchAccountGridView.f249037d) {
                ((SettingsSwitchAccountUI.C85429h) eVar).mo118790a((String) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$d */
    public interface C85452d {
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$e */
    public interface C85453e {
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$f */
    public interface C85454f {
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g */
    public class C85455g {

        /* renamed from: a */
        public ImageView f249052a;

        /* renamed from: b */
        public Button f249053b;

        /* renamed from: c */
        public TextView f249054c;

        /* renamed from: d */
        public View f249055d;

        public C85455g(SwitchAccountGridView switchAccountGridView, C85449a aVar) {
        }
    }

    public SwitchAccountGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getResources().getDimensionPixelOffset(C0966R.dimen.f3624h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo118800a(java.util.Map<java.lang.String, com.tencent.p014mm.plugin.setting.model.SwitchAccountModel> r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            java.util.List<java.lang.String> r0 = r1.f249042i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g> r0 = r1.f249043j
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<android.view.View> r0 = r1.f249044n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            if (r2 == 0) goto L_0x0033
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0033
            java.util.List<java.lang.String> r0 = r1.f249042i
            java.util.Set r4 = r24.keySet()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r4)
            java.util.List<java.lang.String> r0 = r1.f249042i
            java.util.Collections.sort(r0)
        L_0x0033:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List<java.lang.String> r4 = r1.f249042i
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "MicroMsg.SwitchAccountGridView"
            java.lang.String r6 = "account count %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            r6 = 0
        L_0x004d:
            java.util.List<java.lang.String> r0 = r1.f249042i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r7 = 2131296407(0x7f090097, float:1.821073E38)
            r8 = 2131296418(0x7f0900a2, float:1.8210752E38)
            r9 = 2131296395(0x7f09008b, float:1.8210705E38)
            r10 = 2131296390(0x7f090086, float:1.8210695E38)
            r11 = 2131497456(0x7f0c11f0, float:1.8618506E38)
            r12 = 0
            if (r6 >= r0) goto L_0x0186
            android.content.Context r0 = r23.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            android.view.View r11 = r0.inflate(r11, r12)
            android.view.View r0 = r11.findViewById(r10)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.view.View r9 = r11.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r10 = 2131300622(0x7f09110e, float:1.8219279E38)
            android.view.View r10 = r11.findViewById(r10)
            java.util.List<java.lang.String> r13 = r1.f249042i
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r6)
            java.lang.String r13 = (java.lang.String) r13
            android.view.View r8 = r11.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g r14 = new com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g
            r14.<init>(r1, r12)
            r14.f249052a = r0
            r14.f249053b = r9
            android.view.View r7 = r11.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r14.f249054c = r7
            r14.f249055d = r10
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r7)
            java.lang.Object r7 = r2.get(r13)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r7 = (com.tencent.p014mm.plugin.setting.model.SwitchAccountModel) r7
            java.lang.String r7 = r7.f248936f
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x0108 }
            if (r10 != 0) goto L_0x0106
            boolean r10 = r1.f249039f     // Catch:{ Exception -> 0x0108 }
            if (r10 == 0) goto L_0x00e2
            java.lang.String r10 = "use system decoder!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)     // Catch:{ Exception -> 0x0108 }
            r15 = r6
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r7)     // Catch:{ Exception -> 0x0103 }
            int r6 = (int) r5
            r5 = 0
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r7, r5, r6)     // Catch:{ Exception -> 0x00e0 }
            if (r6 == 0) goto L_0x0111
            int r7 = r6.length     // Catch:{ Exception -> 0x00e0 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r5, r7)     // Catch:{ Exception -> 0x00e0 }
            if (r6 == 0) goto L_0x0111
            r0.setImageBitmap(r6)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0111
        L_0x00e0:
            r0 = move-exception
            goto L_0x010a
        L_0x00e2:
            r15 = r6
            java.lang.Class<ln.i> r5 = p196ln.C76708i.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0103 }
            ln.i r5 = (p196ln.C76708i) r5     // Catch:{ Exception -> 0x0103 }
            android.graphics.Bitmap r5 = r5.Wd0(r7, r12)     // Catch:{ Exception -> 0x0103 }
            if (r5 == 0) goto L_0x00f5
            r0.setImageBitmap(r5)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0111
        L_0x00f5:
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0103 }
            ln.f r0 = (p196ln.C76705f) r0     // Catch:{ Exception -> 0x0103 }
            android.widget.ImageView r5 = r14.f249052a     // Catch:{ Exception -> 0x0103 }
            r0.mo106849z(r5, r13)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0111
        L_0x0103:
            r0 = move-exception
            r5 = 0
            goto L_0x010a
        L_0x0106:
            r15 = r6
            goto L_0x0111
        L_0x0108:
            r0 = move-exception
            r15 = r6
        L_0x010a:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = "get avatar error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r6)
        L_0x0111:
            di3.d r0 = di3.C86312j.m106911c(r3)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r5 = r23.getContext()
            java.lang.Object r6 = r2.get(r13)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r6 = (com.tencent.p014mm.plugin.setting.model.SwitchAccountModel) r6
            java.lang.String r6 = r6.f248935e
            float r7 = r8.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r5, r6, r7)
            r8.setText(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0156
            android.widget.TextView r0 = r14.f249054c
            di3.d r5 = di3.C86312j.m106911c(r3)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r6 = r23.getContext()
            java.lang.Object r7 = r2.get(r13)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r7 = (com.tencent.p014mm.plugin.setting.model.SwitchAccountModel) r7
            java.lang.String r7 = r7.f248939i
            android.widget.TextView r8 = r14.f249054c
            float r8 = r8.getTextSize()
            android.text.SpannableString r5 = r5.yp0(r6, r7, r8)
            r0.setText(r5)
            goto L_0x0163
        L_0x0156:
            android.widget.TextView r0 = r14.f249054c
            java.lang.Object r5 = r2.get(r13)
            com.tencent.mm.plugin.setting.model.SwitchAccountModel r5 = (com.tencent.p014mm.plugin.setting.model.SwitchAccountModel) r5
            java.lang.String r5 = r5.f248939i
            r0.setText(r5)
        L_0x0163:
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$a r0 = new com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$a
            r0.<init>(r13)
            r11.setOnClickListener(r0)
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$b r0 = new com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$b
            r0.<init>(r13)
            r9.setOnClickListener(r0)
            java.util.List<com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g> r0 = r1.f249043j
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r14)
            java.util.List<android.view.View> r0 = r1.f249044n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r11)
            int r6 = r15 + 1
            r5 = 0
            goto L_0x004d
        L_0x0186:
            android.content.Context r0 = r23.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            android.view.View r0 = r0.inflate(r11, r12)
            android.view.View r2 = r0.findViewById(r10)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.view.View r3 = r0.findViewById(r9)
            android.widget.Button r3 = (android.widget.Button) r3
            android.view.View r4 = r0.findViewById(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g r5 = new com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g
            r5.<init>(r1, r12)
            r5.f249052a = r2
            r5.f249053b = r3
            android.view.View r3 = r0.findViewById(r7)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r7 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r8)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView"
            java.lang.String r18 = "initAccountGrid"
            java.lang.String r19 = "(Ljava/util/Map;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r3
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r16 = "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView"
            java.lang.String r17 = "initAccountGrid"
            java.lang.String r18 = "(Ljava/util/Map;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY
            r2.setScaleType(r3)
            r3 = 2131231180(0x7f0801cc, float:1.8078434E38)
            r2.setImageResource(r3)
            android.view.ViewParent r2 = r4.getParent()
            r8 = r2
            android.view.View r8 = (android.view.View) r8
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r3)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView"
            java.lang.String r18 = "initAccountGrid"
            java.lang.String r19 = "(Ljava/util/Map;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r8
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView"
            java.lang.String r10 = "initAccountGrid"
            java.lang.String r11 = "(Ljava/util/Map;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            r2 = 2131296388(0x7f090084, float:1.8210691E38)
            android.view.View r2 = r0.findViewById(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r6)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView"
            java.lang.String r9 = "initAccountGrid"
            java.lang.String r10 = "(Ljava/util/Map;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView"
            java.lang.String r8 = "initAccountGrid"
            java.lang.String r9 = "(Ljava/util/Map;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$c r2 = new com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$c
            r2.<init>()
            r0.setOnClickListener(r2)
            java.util.List<com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView$g> r2 = r1.f249043j
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r5)
            java.util.List<android.view.View> r2 = r1.f249044n
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.widget.SwitchAccountGridView.mo118800a(java.util.Map):void");
    }

    /* renamed from: b */
    public void mo118801b() {
        removeAllViews();
        int min = Math.min(5, ((ArrayList) this.f249042i).size());
        for (int i = 0; i < min; i++) {
            if (!this.f249037d) {
                View view = (View) ((ArrayList) this.f249044n).get(i);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                ((C85455g) ((ArrayList) this.f249043j).get(i)).f249053b.setVisibility(4);
            } else if (!((String) ((ArrayList) this.f249042i).get(i)).equals(this.f249040g)) {
                ((C85455g) ((ArrayList) this.f249043j).get(i)).f249053b.setVisibility(0);
            } else {
                View view3 = (View) ((ArrayList) this.f249044n).get(i);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.5f));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view5 = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(4);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!Util.isNullOrNil(this.f249040g) && ((String) ((ArrayList) this.f249042i).get(i)).equals(this.f249040g)) {
                if (this.f249038e) {
                    ((ImageView) ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxn)).setImageResource(C0966R.C0969drawable.a8m);
                    ((TextView) ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxp)).setText(getContext().getResources().getString(C0966R.string.lmx));
                } else {
                    ((ImageView) ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxn)).setImageResource(C0966R.C0969drawable.a8i);
                    ((TextView) ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxp)).setText(getContext().getResources().getString(C0966R.string.izs));
                }
                View findViewById = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.f5358d0);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                C117292a.m165358d(findViewById, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxn);
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                C117292a.m165358d(findViewById2, aVar5.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!Util.isNullOrNil(this.f249041h) && ((String) ((ArrayList) this.f249042i).get(i)).equals(this.f249041h)) {
                ((TextView) ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxp)).setText(getContext().getResources().getString(C0966R.string.gda));
                View findViewById3 = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.bxn);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                C117292a.m165358d(findViewById3, aVar7.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d.findViewById(C0966R.C0970id.f5358d0);
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(0);
                View view8 = findViewById4;
                C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = ((C85455g) ((ArrayList) this.f249043j).get(i)).f249055d;
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar9.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f249038e) {
                if (Util.isNullOrNil(this.f249040g) || !((String) ((ArrayList) this.f249042i).get(i)).equals(this.f249040g)) {
                    View view11 = (View) ((ArrayList) this.f249044n).get(i);
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(Float.valueOf(0.5f));
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar10.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view11.setAlpha(((Float) aVar10.mo10231a(0)).floatValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    View view13 = (View) ((ArrayList) this.f249044n).get(i);
                    C9556a aVar11 = new C9556a();
                    aVar11.mo10233c(Float.valueOf(1.0f));
                    View view14 = view13;
                    C117292a.m165358d(view14, aVar11.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view13.setAlpha(((Float) aVar11.mo10231a(0)).floatValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            if (!Util.isNullOrNil(this.f249041h)) {
                if (((String) ((ArrayList) this.f249042i).get(i)).equals(this.f249041h)) {
                    View view15 = (View) ((ArrayList) this.f249044n).get(i);
                    C9556a aVar12 = new C9556a();
                    aVar12.mo10233c(Float.valueOf(1.0f));
                    View view16 = view15;
                    C117292a.m165358d(view16, aVar12.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view15.setAlpha(((Float) aVar12.mo10231a(0)).floatValue());
                    C117292a.m165359e(view16, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    View view17 = (View) ((ArrayList) this.f249044n).get(i);
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(Float.valueOf(0.5f));
                    View view18 = view17;
                    C117292a.m165358d(view18, aVar13.mo10232b(), "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view17.setAlpha(((Float) aVar13.mo10231a(0)).floatValue());
                    C117292a.m165359e(view18, "com/tencent/mm/plugin/setting/ui/widget/SwitchAccountGridView", "refreshGrid", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);
            addView((View) ((ArrayList) this.f249044n).get(i), layoutParams);
        }
        if (getChildCount() < 5 && !this.f249037d && !this.f249038e && Util.isNullOrNil(this.f249041h)) {
            List<C85455g> list = this.f249043j;
            ((C85455g) ((ArrayList) list).get(((ArrayList) list).size() - 1)).f249053b.setVisibility(4);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            List<View> list2 = this.f249044n;
            addView((View) ((ArrayList) list2).get(((ArrayList) list2).size() - 1), layoutParams2);
        }
    }

    public int getAccountCount() {
        return ((ArrayList) this.f249042i).size();
    }

    public void setDeleteState(boolean z) {
        this.f249037d = z;
    }

    public void setLastLoginWxUsername(String str) {
        this.f249040g = str;
    }

    public void setLogoutState(boolean z) {
        this.f249038e = z;
    }

    public void setOnAnimatorEndListener(C85452d dVar) {
    }

    public void setOnClickAvatarListener(C85453e eVar) {
        this.f249045o = eVar;
    }

    public void setOnDeleteAvatarListener(C85454f fVar) {
        this.f249046p = fVar;
    }

    public void setSwitchToWxUsername(String str) {
        this.f249041h = str;
    }

    public void setUseSystemDecoder(boolean z) {
        this.f249039f = z;
    }
}
