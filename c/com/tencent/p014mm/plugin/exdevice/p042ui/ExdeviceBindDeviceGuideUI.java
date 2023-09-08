package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import qw0.C47887a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI */
public class ExdeviceBindDeviceGuideUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public ArrayList<String> f52355A;

    /* renamed from: B */
    public String f52356B;

    /* renamed from: C */
    public boolean f52357C = false;

    /* renamed from: D */
    public boolean f52358D = false;

    /* renamed from: E */
    public boolean f52359E = false;

    /* renamed from: F */
    public BroadcastReceiver f52360F = new C18715d();

    /* renamed from: d */
    public ListView f52361d;

    /* renamed from: e */
    public C2247e f52362e;

    /* renamed from: f */
    public Button f52363f;

    /* renamed from: g */
    public Button f52364g;

    /* renamed from: h */
    public TextView f52365h;

    /* renamed from: i */
    public ScrollView f52366i;

    /* renamed from: j */
    public ImageView f52367j;

    /* renamed from: n */
    public TextView f52368n;

    /* renamed from: o */
    public TextView f52369o;

    /* renamed from: p */
    public String f52370p;

    /* renamed from: q */
    public String f52371q;

    /* renamed from: r */
    public String f52372r;

    /* renamed from: s */
    public String f52373s;

    /* renamed from: t */
    public String f52374t;

    /* renamed from: u */
    public String f52375u;

    /* renamed from: v */
    public String f52376v;

    /* renamed from: w */
    public String f52377w;

    /* renamed from: x */
    public String f52378x;

    /* renamed from: y */
    public String f52379y;

    /* renamed from: z */
    public long f52380z;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e */
    public static final class C2247e extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<String> f12316d;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e$a */
        public static class C2248a {

            /* renamed from: a */
            public TextView f12317a;

            /* renamed from: b */
            public TextView f12318b;

            /* renamed from: c */
            public View f12319c;

            /* renamed from: d */
            public View f12320d;
        }

        public C2247e(ArrayList<String> arrayList) {
            this.f12316d = arrayList;
        }

        public int getCount() {
            ArrayList<String> arrayList = this.f12316d;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            ArrayList<String> arrayList = this.f12316d;
            if (arrayList == null || arrayList.size() <= 0) {
                return null;
            }
            return this.f12316d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r24, android.view.View r25, android.view.ViewGroup r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                java.util.ArrayList<java.lang.String> r2 = r0.f12316d
                r3 = 0
                if (r2 == 0) goto L_0x021e
                int r2 = r2.size()
                if (r2 > 0) goto L_0x0011
                goto L_0x021e
            L_0x0011:
                java.util.ArrayList<java.lang.String> r2 = r0.f12316d
                if (r2 == 0) goto L_0x0024
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0024
                java.util.ArrayList<java.lang.String> r2 = r0.f12316d
                java.lang.Object r2 = r2.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0025
            L_0x0024:
                r2 = r3
            L_0x0025:
                if (r25 != 0) goto L_0x0063
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e$a r4 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e$a
                r4.<init>()
                android.content.Context r5 = r26.getContext()
                r6 = 2131494259(0x7f0c0573, float:1.8612021E38)
                android.view.View r3 = android.view.View.inflate(r5, r6, r3)
                r5 = 2131300373(0x7f091015, float:1.8218774E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f12318b = r5
                r5 = 2131314354(0x7f0946b2, float:1.824713E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f12317a = r5
                r5 = 2131315490(0x7f094b22, float:1.8249435E38)
                android.view.View r5 = r3.findViewById(r5)
                r4.f12319c = r5
                r5 = 2131298187(0x7f09078b, float:1.821434E38)
                android.view.View r5 = r3.findViewById(r5)
                r4.f12320d = r5
                r3.setTag(r4)
                goto L_0x006c
            L_0x0063:
                java.lang.Object r3 = r25.getTag()
                r4 = r3
                com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e$a r4 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceGuideUI.C2247e.C2248a) r4
                r3 = r25
            L_0x006c:
                android.widget.TextView r5 = r4.f12317a
                int r6 = r1 + 1
                java.lang.String r6 = java.lang.Integer.toString(r6)
                r5.setText(r6)
                android.widget.TextView r5 = r4.f12318b
                r5.setText(r2)
                r2 = 4
                r5 = 0
                r6 = 1
                if (r1 != 0) goto L_0x010d
                java.util.ArrayList<java.lang.String> r7 = r0.f12316d
                int r7 = r7.size()
                if (r7 != r6) goto L_0x010d
                android.view.View r1 = r4.f12319c
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                r6.mo10233c(r7)
                java.lang.Object[] r9 = r6.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r1
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r6 = r6.mo10231a(r5)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r1.setVisibility(r6)
                java.lang.String r9 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r1 = r4.f12320d
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4.mo10233c(r2)
                java.lang.Object[] r16 = r4.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r1
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r2 = r4.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r16 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r17 = "getView"
                java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
                goto L_0x021e
            L_0x010d:
                if (r1 != 0) goto L_0x0193
                android.view.View r1 = r4.f12319c
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r14.mo10233c(r2)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r9 = "getView"
                java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r1
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r2 = r14.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r7 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r8 = "getView"
                java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                android.view.View r1 = r4.f12320d
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r2.mo10233c(r4)
                java.lang.Object[] r14 = r2.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r1
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r2 = r2.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r14 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r15 = "getView"
                java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x021e
            L_0x0193:
                java.util.ArrayList<java.lang.String> r7 = r0.f12316d
                int r7 = r7.size()
                int r7 = r7 - r6
                if (r1 != r7) goto L_0x021e
                android.view.View r1 = r4.f12320d
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r6.mo10233c(r2)
                java.lang.Object[] r9 = r6.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r11 = "getView"
                java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r1
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r2 = r6.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r9 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                android.view.View r1 = r4.f12319c
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r2.mo10233c(r4)
                java.lang.Object[] r16 = r2.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r1
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r2 = r2.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r16 = "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$GuideListAdapter"
                java.lang.String r17 = "getView"
                java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            L_0x021e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceGuideUI.C2247e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$a */
    public class C18712a implements MenuItem.OnMenuItemClickListener {
        public C18712a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceBindDeviceGuideUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$b */
    public class C18713b implements View.OnClickListener {
        public C18713b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.this.f52370p);
            intent.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.this.f52371q);
            intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, ExdeviceBindDeviceGuideUI.this.f52372r);
            intent.putExtra("device_type", ExdeviceBindDeviceGuideUI.this.f52373s);
            intent.putExtra("device_title", ExdeviceBindDeviceGuideUI.this.f52374t);
            intent.putExtra("device_desc", ExdeviceBindDeviceGuideUI.this.f52375u);
            intent.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.this.f52376v);
            intent.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.this.f52377w);
            intent.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.this.f52378x);
            intent.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.this.f52379y);
            intent.putExtra("device_ble_simple_proto", ExdeviceBindDeviceGuideUI.this.f52380z);
            intent.putExtra("encryptKey", ExdeviceBindDeviceGuideUI.this.f52356B);
            intent.putExtra("jumpToBindDevice", true);
            ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI = ExdeviceBindDeviceGuideUI.this;
            boolean z = exdeviceBindDeviceGuideUI.f52358D;
            if (z && !exdeviceBindDeviceGuideUI.f52357C) {
                C88144b.m109791i(exdeviceBindDeviceGuideUI.getContext(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, (Bundle) null);
            } else if (exdeviceBindDeviceGuideUI.f52357C && !z) {
                intent.putExtra("exdevice_airkiss_open_type", 2);
                C88144b.m109791i(ExdeviceBindDeviceGuideUI.this.getContext(), "exdevice", ".ui.ExdeviceConnectWifiUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$c */
    public class C18714c implements View.OnClickListener {
        public C18714c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceBindDeviceGuideUI exdeviceBindDeviceGuideUI = ExdeviceBindDeviceGuideUI.this;
            if (exdeviceBindDeviceGuideUI.f52357C && !exdeviceBindDeviceGuideUI.f52358D) {
                Intent intent = new Intent();
                intent.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.this.f52370p);
                intent.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.this.f52371q);
                intent.putExtra(TPDownloadProxyEnum.USER_DEVICE_ID, ExdeviceBindDeviceGuideUI.this.f52372r);
                intent.putExtra("device_type", ExdeviceBindDeviceGuideUI.this.f52373s);
                intent.putExtra("device_title", ExdeviceBindDeviceGuideUI.this.f52374t);
                intent.putExtra("device_desc", ExdeviceBindDeviceGuideUI.this.f52375u);
                intent.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.this.f52376v);
                intent.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.this.f52377w);
                intent.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.this.f52378x);
                intent.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.this.f52379y);
                C88144b.m109791i(ExdeviceBindDeviceGuideUI.this.getContext(), "exdevice", ".ui.ExdeviceBindDeviceUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceGuideUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$d */
    public class C18715d extends BroadcastReceiver {
        public C18715d() {
        }

        public void onReceive(Context context, Intent intent) {
            Log.m105924i("MicroMsg.ExdeviceBindDeviceGuideUI", "Action broadcast receive...");
            if (intent != null) {
                String action = intent.getAction();
                Log.m105919d("MicroMsg.ExdeviceBindDeviceGuideUI", "Receiver action(%s)", action);
                if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action) && ExdeviceBindDeviceGuideUI.this.f52358D) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                    if (intExtra == 12) {
                        if (!ExdeviceBindDeviceGuideUI.this.f52359E || LocationUtil.isGpsEnable()) {
                            ExdeviceBindDeviceGuideUI.this.mo23566H7(2);
                        } else {
                            ExdeviceBindDeviceGuideUI.this.mo23566H7(6);
                        }
                    } else if (intExtra == 10) {
                        ExdeviceBindDeviceGuideUI.this.mo23566H7(3);
                    }
                } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) && ExdeviceBindDeviceGuideUI.this.f52357C) {
                    int intExtra2 = intent.getIntExtra("wifi_state", -1);
                    Log.m105925i("MicroMsg.ExdeviceBindDeviceGuideUI", "Wifi state changed action: wifiState(%d)", Integer.valueOf(intExtra2));
                    if (intExtra2 == 3) {
                        ExdeviceBindDeviceGuideUI.this.mo23566H7(1);
                    } else if (intExtra2 == 1) {
                        ExdeviceBindDeviceGuideUI.this.mo23566H7(5);
                    }
                } else if (ExdeviceBindDeviceGuideUI.this.f52359E && "android.location.MODE_CHANGED".equals(action)) {
                    if (!LocationUtil.isGpsEnable()) {
                        ExdeviceBindDeviceGuideUI.this.mo23566H7(6);
                    } else if (!C47887a.m53196c()) {
                        ExdeviceBindDeviceGuideUI.this.mo23566H7(3);
                    } else {
                        ExdeviceBindDeviceGuideUI.this.mo23566H7(2);
                    }
                }
            }
        }
    }

    /* renamed from: H7 */
    public final void mo23566H7(int i) {
        switch (i) {
            case 1:
                this.f52363f.setText(getContext().getString(C0966R.string.cd6));
                this.f52364g.setText(getContext().getString(C0966R.string.f360384cc2));
                this.f52365h.setText(getContext().getString(C0966R.string.cd7));
                break;
            case 2:
                this.f52363f.setText(getContext().getString(C0966R.string.ccy));
                this.f52364g.setVisibility(8);
                this.f52365h.setText(getContext().getString(C0966R.string.ccx));
                break;
            case 3:
                this.f52367j.setImageResource(C0966R.raw.bluetooth_logo);
                this.f52368n.setText(C0966R.string.ccl);
                this.f52369o.setText(C0966R.string.cc6);
                break;
            case 4:
                this.f52367j.setImageResource(C0966R.raw.bluetooth_logo);
                this.f52368n.setText(C0966R.string.ccj);
                this.f52369o.setText("");
                break;
            case 5:
                this.f52367j.setImageResource(C0966R.raw.wifi_logo);
                this.f52368n.setText(C0966R.string.ccl);
                this.f52369o.setText(C0966R.string.ccg);
                break;
            case 6:
                this.f52367j.setImageResource(C0966R.raw.bluetooth_logo);
                this.f52368n.setText(C0966R.string.ccl);
                this.f52369o.setText(C0966R.string.cdw);
                break;
        }
        switch (i) {
            case 1:
            case 2:
                this.f52367j.setVisibility(8);
                this.f52368n.setVisibility(8);
                this.f52369o.setVisibility(8);
                this.f52361d.setVisibility(0);
                this.f52366i.setVisibility(0);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                this.f52367j.setVisibility(0);
                this.f52368n.setVisibility(0);
                this.f52361d.setVisibility(8);
                this.f52366i.setVisibility(8);
                if (i == 4) {
                    this.f52369o.setVisibility(8);
                    return;
                } else {
                    this.f52369o.setVisibility(0);
                    return;
                }
            default:
                return;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359658a41;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$a r7 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$a
            r7.<init>()
            r6.setBackBtn(r7)
            r7 = 23
            boolean r7 = p206nj.C11171e.m11046c(r7)
            r0 = 0
            java.lang.String r1 = "MicroMsg.ExdeviceBindDeviceGuideUI"
            r2 = 1
            if (r7 == 0) goto L_0x0034
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = "6.0"
            boolean r3 = r7.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x0034
            java.lang.String r3 = "6.0.0"
            boolean r3 = r7.equalsIgnoreCase(r3)
            if (r3 != 0) goto L_0x0034
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r7
            java.lang.String r7 = "Bluetooth limited version(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r3)
            r6.f52359E = r2
        L_0x0034:
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r3 = "device_scan_mode"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52370p = r3
            java.lang.String r3 = "device_scan_conn_proto"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52371q = r3
            java.lang.String r3 = "device_id"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52372r = r3
            java.lang.String r3 = "device_type"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52373s = r3
            java.lang.String r3 = "device_title"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52374t = r3
            java.lang.String r3 = "device_desc"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52375u = r3
            java.lang.String r3 = "device_icon_url"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52376v = r3
            java.lang.String r3 = "device_category_id"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52377w = r3
            java.lang.String r3 = "device_brand_name"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52378x = r3
            java.lang.String r3 = "bind_ticket"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52379y = r3
            r3 = -1
            java.lang.String r5 = "device_ble_simple_proto"
            long r3 = r7.getLongExtra(r5, r3)
            r6.f52380z = r3
            java.lang.String r3 = "device_airkiss_steps"
            java.util.ArrayList r3 = r7.getStringArrayListExtra(r3)
            r6.f52355A = r3
            java.lang.String r3 = "device_airkiss_key"
            java.lang.String r3 = r7.getStringExtra(r3)
            r6.f52356B = r3
            java.lang.String r3 = "device_airkiss_title"
            r7.getStringExtra(r3)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.util.ArrayList<java.lang.String> r3 = r6.f52355A
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r0] = r3
            java.lang.String r3 = "Category config guide steps(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r7)
            r7 = 2131300370(0x7f091012, float:1.8218768E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ListView r7 = (android.widget.ListView) r7
            r6.f52361d = r7
            r7 = 2131494254(0x7f0c056e, float:1.8612011E38)
            r3 = 0
            android.view.View r7 = android.view.View.inflate(r6, r7, r3)
            r3 = 2131315363(0x7f094aa3, float:1.8249177E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6.f52365h = r3
            com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e r3 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e
            java.util.ArrayList<java.lang.String> r4 = r6.f52355A
            r3.<init>(r4)
            r6.f52362e = r3
            android.widget.ListView r3 = r6.f52361d
            r3.addHeaderView(r7)
            android.widget.ListView r7 = r6.f52361d
            r7.setDividerHeight(r0)
            android.widget.ListView r7 = r6.f52361d
            r7.setClickable(r0)
            android.widget.ListView r7 = r6.f52361d
            r7.setFooterDividersEnabled(r0)
            android.widget.ListView r7 = r6.f52361d
            com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$e r3 = r6.f52362e
            r7.setAdapter(r3)
            r7 = 2131308156(0x7f092e7c, float:1.823456E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f52367j = r7
            r7 = 2131305802(0x7f09254a, float:1.8229785E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ScrollView r7 = (android.widget.ScrollView) r7
            r6.f52366i = r7
            r7 = 2131300129(0x7f090f21, float:1.8218279E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r6.f52363f = r7
            r7 = 2131310250(0x7f0936aa, float:1.8238807E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r6.f52364g = r7
            r7 = 2131301683(0x7f091533, float:1.822143E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f52368n = r7
            r7 = 2131301684(0x7f091534, float:1.8221433E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f52369o = r7
            java.lang.String r7 = r6.f52370p
            java.lang.String r3 = "SCAN_CATALOG"
            int r7 = r7.compareTo(r3)
            if (r7 != 0) goto L_0x017d
            java.lang.String r7 = r6.f52371q
            java.lang.String r3 = "wifi"
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L_0x0161
            r6.f52357C = r2
            androidx.appcompat.app.AppCompatActivity r7 = r6.getContext()
            r3 = 2131825233(0x7f111251, float:1.9283316E38)
            java.lang.String r7 = r7.getString(r3)
            goto L_0x0182
        L_0x0161:
            java.lang.String r7 = r6.f52371q
            java.lang.String r3 = "blue"
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L_0x0179
            r6.f52358D = r2
            androidx.appcompat.app.AppCompatActivity r7 = r6.getContext()
            r3 = 2131825199(0x7f11122f, float:1.9283247E38)
            java.lang.String r7 = r7.getString(r3)
            goto L_0x0182
        L_0x0179:
            junit.framework.Assert.assertTrue(r0)
            goto L_0x0180
        L_0x017d:
            junit.framework.Assert.assertTrue(r0)
        L_0x0180:
            java.lang.String r7 = ""
        L_0x0182:
            r6.setMMTitle((java.lang.String) r7)
            boolean r7 = r6.f52358D
            if (r7 == 0) goto L_0x01cf
            boolean r7 = r6.f52357C
            if (r7 != 0) goto L_0x01cf
            androidx.appcompat.app.AppCompatActivity r7 = r6.getContext()
            boolean r7 = qw0.C47887a.m53195b(r7)
            if (r7 != 0) goto L_0x01ab
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r0] = r2
            java.lang.String r0 = "now sdk version not support ble device : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r7)
            r7 = 4
            r6.mo23566H7(r7)
            goto L_0x0202
        L_0x01ab:
            boolean r7 = qw0.C47887a.m53196c()
            if (r7 != 0) goto L_0x01bb
            java.lang.String r7 = "Bluetooth is not open, Just leave"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r7 = 3
            r6.mo23566H7(r7)
            goto L_0x0202
        L_0x01bb:
            boolean r7 = r6.f52359E
            if (r7 == 0) goto L_0x01cf
            boolean r7 = com.tencent.p014mm.sdk.platformtools.LocationUtil.isGpsEnable()
            if (r7 != 0) goto L_0x01cf
            java.lang.String r7 = "BLE limited version, GPS do not open"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r7 = 6
            r6.mo23566H7(r7)
            goto L_0x0202
        L_0x01cf:
            boolean r7 = r6.f52358D
            if (r7 != 0) goto L_0x01ec
            boolean r7 = r6.f52357C
            if (r7 == 0) goto L_0x01ec
            androidx.appcompat.app.AppCompatActivity r7 = r6.getContext()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r7)
            if (r7 != 0) goto L_0x01ec
            java.lang.String r7 = "wifi is not open, Just leave"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r7 = 5
            r6.mo23566H7(r7)
            goto L_0x0202
        L_0x01ec:
            boolean r7 = r6.f52357C
            if (r7 == 0) goto L_0x01f8
            boolean r0 = r6.f52358D
            if (r0 != 0) goto L_0x01f8
            r6.mo23566H7(r2)
            goto L_0x0202
        L_0x01f8:
            boolean r0 = r6.f52358D
            if (r0 == 0) goto L_0x0202
            if (r7 != 0) goto L_0x0202
            r7 = 2
            r6.mo23566H7(r7)
        L_0x0202:
            android.widget.Button r7 = r6.f52363f
            com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$b r0 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$b
            r0.<init>()
            r7.setOnClickListener(r0)
            android.widget.Button r7 = r6.f52364g
            com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$c r0 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI$c
            r0.<init>()
            r7.setOnClickListener(r0)
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r7.addAction(r0)
            java.lang.String r0 = "android.net.wifi.WIFI_STATE_CHANGED"
            r7.addAction(r0)
            java.lang.String r0 = "android.location.MODE_CHANGED"
            r7.addAction(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r6.getContext()
            android.content.BroadcastReceiver r1 = r6.f52360F
            r0.registerReceiver(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceBindDeviceGuideUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        getContext().unregisterReceiver(this.f52360F);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
