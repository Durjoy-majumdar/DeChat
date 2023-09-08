package com.tencent.p014mm.plugin.repairer.p099ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import lc3.C10485b;
import nj3.C76912y0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI */
public final class RepairerResetConfigUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI$a */
    public static final class C5074a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResetConfigUI f20431d;

        public C5074a(RepairerResetConfigUI repairerResetConfigUI) {
            this.f20431d = repairerResetConfigUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20431d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI$b */
    public static final class C5075b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResetConfigUI f20432d;

        public C5075b(RepairerResetConfigUI repairerResetConfigUI) {
            this.f20432d = repairerResetConfigUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((EditText) this.f20432d.findViewById(C0966R.C0970id.g3z)).getText().toString();
            EditText editText = (EditText) this.f20432d.findViewById(C0966R.C0970id.f358624g42);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI$c */
    public static final class C5076c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResetConfigUI f20433d;

        public C5076c(RepairerResetConfigUI repairerResetConfigUI) {
            this.f20433d = repairerResetConfigUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x011b, code lost:
            nj3.C76912y0.makeText((android.content.Context) r7.f20433d.getContext(), (java.lang.CharSequence) r7.f20433d.getString(com.tencent.p014mm.C0966R.string.a0g), 0).show();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0137, code lost:
            throw new java.lang.RuntimeException();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$3"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                r8 = 0
                com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI r0 = r7.f20433d     // Catch:{ Exception -> 0x0138 }
                r1 = 2131308059(0x7f092e1b, float:1.8234363E38)
                android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0     // Catch:{ Exception -> 0x0138 }
                android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0138 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI r1 = r7.f20433d     // Catch:{ Exception -> 0x0138 }
                r2 = 2131308062(0x7f092e1e, float:1.8234369E38)
                android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.ui.widget.MMEditText r1 = (com.tencent.p014mm.p136ui.widget.MMEditText) r1     // Catch:{ Exception -> 0x0138 }
                android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0138 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.valueOf(r0)     // Catch:{ Exception -> 0x0138 }
                z04.k r3 = new z04.k     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = "_"
                r3.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0138 }
                java.util.List r0 = r3.mo90760e(r0, r8)     // Catch:{ Exception -> 0x0138 }
                java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0138 }
                java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ Exception -> 0x0138 }
                java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r0, r3)     // Catch:{ Exception -> 0x0138 }
                java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x0138 }
                int r3 = r0.length     // Catch:{ Exception -> 0x0138 }
                int r3 = r3 + -1
                r3 = r0[r3]     // Catch:{ Exception -> 0x0138 }
                java.lang.String r4 = "SYNC"
                boolean r4 = gy3.C87412m.m108589b(r3, r4)     // Catch:{ Exception -> 0x0138 }
                if (r4 == 0) goto L_0x0072
                int r3 = r0.length     // Catch:{ Exception -> 0x0138 }
                int r3 = r3 + -2
                r3 = r0[r3]     // Catch:{ Exception -> 0x0138 }
            L_0x0072:
                int r0 = r3.hashCode()     // Catch:{ Exception -> 0x0138 }
                switch(r0) {
                    case -1838656495: goto L_0x0108;
                    case 72655: goto L_0x00ec;
                    case 2342524: goto L_0x00d0;
                    case 66988604: goto L_0x00b4;
                    case 782694408: goto L_0x0098;
                    case 2022338513: goto L_0x007b;
                    default: goto L_0x0079;
                }     // Catch:{ Exception -> 0x0138 }
            L_0x0079:
                goto L_0x0132
            L_0x007b:
                java.lang.String r0 = "DOUBLE"
                boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0138 }
                if (r0 == 0) goto L_0x0132
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0138 }
                double r3 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x0138 }
                java.lang.Double r1 = java.lang.Double.valueOf(r3)     // Catch:{ Exception -> 0x0138 }
                r0.mo119677K(r2, r1)     // Catch:{ Exception -> 0x0138 }
                goto L_0x011b
            L_0x0098:
                java.lang.String r0 = "BOOLEAN"
                boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0138 }
                if (r0 == 0) goto L_0x0132
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0138 }
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ Exception -> 0x0138 }
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0138 }
                r0.mo119677K(r2, r1)     // Catch:{ Exception -> 0x0138 }
                goto L_0x011b
            L_0x00b4:
                java.lang.String r0 = "FLOAT"
                boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0138 }
                if (r0 == 0) goto L_0x0132
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0138 }
                float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ Exception -> 0x0138 }
                java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ Exception -> 0x0138 }
                r0.mo119677K(r2, r1)     // Catch:{ Exception -> 0x0138 }
                goto L_0x011b
            L_0x00d0:
                java.lang.String r0 = "LONG"
                boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0138 }
                if (r0 == 0) goto L_0x0132
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0138 }
                long r3 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0138 }
                java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0138 }
                r0.mo119677K(r2, r1)     // Catch:{ Exception -> 0x0138 }
                goto L_0x011b
            L_0x00ec:
                java.lang.String r0 = "INT"
                boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0138 }
                if (r0 == 0) goto L_0x0132
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0138 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0138 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0138 }
                r0.mo119677K(r2, r1)     // Catch:{ Exception -> 0x0138 }
                goto L_0x011b
            L_0x0108:
                java.lang.String r0 = "STRING"
                boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0138 }
                if (r0 == 0) goto L_0x0132
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x0138 }
                r0.mo119677K(r2, r1)     // Catch:{ Exception -> 0x0138 }
            L_0x011b:
                com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI r0 = r7.f20433d     // Catch:{ Exception -> 0x0138 }
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()     // Catch:{ Exception -> 0x0138 }
                com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI r1 = r7.f20433d     // Catch:{ Exception -> 0x0138 }
                r2 = 2131821585(0x7f110411, float:1.9275917E38)
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0138 }
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r8)     // Catch:{ Exception -> 0x0138 }
                r0.show()     // Catch:{ Exception -> 0x0138 }
                goto L_0x014e
            L_0x0132:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0138 }
                r0.<init>()     // Catch:{ Exception -> 0x0138 }
                throw r0     // Catch:{ Exception -> 0x0138 }
            L_0x0138:
                com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI r0 = r7.f20433d
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI r1 = r7.f20433d
                r2 = 2131821584(0x7f110410, float:1.9275915E38)
                java.lang.String r1 = r1.getString(r2)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r8)
                r8.show()
            L_0x014e:
                java.lang.String r8 = "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.repairer.p099ui.RepairerResetConfigUI.C5076c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI$d */
    public static final class C5077d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResetConfigUI f20434d;

        public C5077d(RepairerResetConfigUI repairerResetConfigUI) {
            this.f20434d = repairerResetConfigUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107408f(((MMEditText) this.f20434d.findViewById(C0966R.C0970id.cah)).getText().toString(), ((MMEditText) this.f20434d.findViewById(C0966R.C0970id.caj)).getText().toString());
                C76912y0.makeText((Context) this.f20434d.getContext(), (CharSequence) this.f20434d.getString(C0966R.string.a0g), 0).show();
            } catch (Exception unused) {
                C76912y0.makeText((Context) this.f20434d.getContext(), (CharSequence) this.f20434d.getString(C0966R.string.a0f), 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI$e */
    public static final class C5078e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResetConfigUI f20435d;

        public C5078e(RepairerResetConfigUI repairerResetConfigUI) {
            this.f20435d = repairerResetConfigUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(((MMEditText) this.f20435d.findViewById(C0966R.C0970id.cah)).getText().toString());
                ((MMEditText) this.f20435d.findViewById(C0966R.C0970id.caj)).setText(c);
                if (Util.isNullOrNil(c)) {
                    C76912y0.makeText((Context) this.f20435d.getContext(), (CharSequence) "Config is Empty", 0).show();
                }
            } catch (Exception unused) {
                C76912y0.makeText((Context) this.f20435d.getContext(), (CharSequence) "Error", 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI$f */
    public static final class C5079f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResetConfigUI f20436d;

        public C5079f(RepairerResetConfigUI repairerResetConfigUI) {
            this.f20436d = repairerResetConfigUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                String obj = ((MMEditText) this.f20436d.findViewById(C0966R.C0970id.m4o)).getText().toString();
                String obj2 = ((MMEditText) this.f20436d.findViewById(C0966R.C0970id.m4q)).getText().toString();
                int parseInt = Integer.parseInt(((MMEditText) this.f20436d.findViewById(C0966R.C0970id.m4r)).getText().toString());
                if (parseInt == 1) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt(obj, Integer.parseInt(obj2)).commit();
                } else if (parseInt == 2) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putLong(obj, Long.parseLong(obj2)).commit();
                } else if (parseInt == 3) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putString(obj, obj2).commit();
                } else if (parseInt == 4) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean(obj, Boolean.parseBoolean(obj2)).commit();
                } else if (parseInt == 5) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putFloat(obj, Float.parseFloat(obj2)).commit();
                }
                C76912y0.makeText((Context) this.f20436d.getContext(), (CharSequence) this.f20436d.getString(C0966R.string.a0g), 0).show();
            } catch (Exception unused) {
                C76912y0.makeText((Context) this.f20436d.getContext(), (CharSequence) this.f20436d.getString(C0966R.string.a0f), 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359948bt0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("微信设置本地配置");
        setBackBtn(new C5074a(this));
        Button button = (Button) findViewById(C0966R.C0970id.f358623g41);
        if (button != null) {
            button.setOnClickListener(new C5075b(this));
        }
        ((Button) findViewById(C0966R.C0970id.f358622g40)).setOnClickListener(new C5076c(this));
        ((Button) findViewById(C0966R.C0970id.cai)).setOnClickListener(new C5077d(this));
        ((Button) findViewById(C0966R.C0970id.f357889ct1)).setOnClickListener(new C5078e(this));
        ((Button) findViewById(C0966R.C0970id.m4p)).setOnClickListener(new C5079f(this));
    }
}
