package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p447aw.C103918d;
import p763ym.C79138l;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid */
public class AppGrid extends GridView {

    /* renamed from: d */
    public C44604d f120916d;

    /* renamed from: e */
    public Context f120917e;

    /* renamed from: f */
    public int f120918f;

    /* renamed from: g */
    public int f120919g = 0;

    /* renamed from: h */
    public int f120920h = 0;

    /* renamed from: i */
    public int f120921i;

    /* renamed from: j */
    public int f120922j;

    /* renamed from: n */
    public C44602c f120923n;

    /* renamed from: o */
    public SharedPreferences f120924o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f120925p = new C44605a();

    /* renamed from: q */
    public AdapterView.OnItemLongClickListener f120926q = new C44606b();

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid$c */
    public class C44602c extends BaseAdapter {

        /* renamed from: d */
        public List<C44561j> f120927d = new ArrayList();

        /* renamed from: e */
        public int f120928e;

        /* renamed from: f */
        public int f120929f;

        /* renamed from: g */
        public Map<String, C44561j> f120930g = null;

        /* renamed from: h */
        public boolean f120931h = false;

        /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid$c$a */
        public class C44603a {

            /* renamed from: a */
            public TextView f120933a;

            /* renamed from: b */
            public TextView f120934b;

            /* renamed from: c */
            public ImageView f120935c;

            /* renamed from: d */
            public CdnImageView f120936d;

            /* renamed from: e */
            public TextView f120937e;

            /* renamed from: f */
            public View f120938f;

            /* renamed from: g */
            public View f120939g;

            public C44603a(C44602c cVar) {
            }
        }

        public C44602c(Context context, List<C44561j> list, Map<String, C44561j> map, ArrayList<C72791h.C44607a> arrayList) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(list == null ? -1 : list.size());
            Log.m105925i("MicroMsg.AppGrid", "AppGridAdapter infoList size:%s ", objArr);
            this.f120927d.clear();
            this.f120927d.addAll(list);
            this.f120927d.addAll(arrayList);
            this.f120930g = map;
            this.f120928e = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 56.0f);
            this.f120929f = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 53.3f);
            Iterator<C72791h.C44607a> it = arrayList.iterator();
            while (it.hasNext()) {
                C72791h.C44609b b = AppGrid.m49053b(it.next());
                if (b != null && !Util.isNullOrNil(b.f120964b)) {
                    this.f120931h = true;
                    return;
                }
            }
        }

        /* renamed from: a */
        public final void mo69393a(C44603a aVar, String str, String str2) {
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC;
            Map<String, C44561j> map = this.f120930g;
            if (map == null) {
                Log.m105928w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] harcodeServiceAppInfoMap null");
                return;
            }
            C44561j jVar = map.get(str);
            if (jVar == null) {
                Log.m105928w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] info null");
                return;
            }
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44561j.f120844x1;
            if ("wxce6f23b478a3a2a2".equals(jVar.field_appId)) {
                aVar.f120935c.setImageResource(C0966R.raw.panel_icon_transfer);
            } else if ("wx6fa7e3bab7e15415".equals(jVar.field_appId)) {
                aVar.f120935c.setImageResource(C0966R.raw.panel_icon_luckymoney);
            } else if ("wx7302cee7c7d6d7d6".equals(jVar.field_appId)) {
                aVar.f120935c.setImageResource(C0966R.raw.panel_icon_card);
            } else if ("wx3cc22b542de028d4".equals(jVar.field_appId)) {
                aVar.f120935c.setImageResource(C0966R.raw.panel_icon_aa);
            } else {
                aVar.f120935c.setImageResource(C0966R.C0969drawable.buj);
            }
            if (!Util.isNullOrNil(str2)) {
                TextView textView = aVar.f120933a;
                Context context = AppGrid.this.f120917e;
                if (context != null) {
                    String l = C44565l.m48992l(context);
                    String str3 = null;
                    if (l.equalsIgnoreCase("zh_CN")) {
                        str3 = jVar.field_appName;
                    }
                    if (l.equalsIgnoreCase("en")) {
                        str3 = Util.isNullOrNil(jVar.field_appName_en) ? jVar.field_appName : jVar.field_appName_en;
                    }
                    if (l.equalsIgnoreCase("zh_TW") || l.equalsIgnoreCase("zh_HK")) {
                        if (l.equalsIgnoreCase("zh_HK")) {
                            str3 = Util.isNullOrNil(jVar.field_appName_hk) ? jVar.field_appName_tw : jVar.field_appName_hk;
                        }
                        if (Util.isNullOrNil(str3)) {
                            str3 = Util.isNullOrNil(jVar.field_appName_tw) ? jVar.field_appName : jVar.field_appName_tw;
                        }
                    }
                    if (!Util.isNullOrNil(str3)) {
                        str2 = str3;
                    }
                }
                textView.setText(str2);
            } else {
                aVar.f120933a.setText(((C79138l) C86312j.m106911c(C79138l.class)).mo74011hv(AppGrid.this.f120917e, jVar));
            }
            if (jVar.mo69361t2()) {
                if ((jVar.field_serviceAppInfoFlag & 2) != 0) {
                    AppGrid appGrid = AppGrid.this;
                    if (appGrid.f120924o == null) {
                        appGrid.f120924o = appGrid.f120917e.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
                    }
                    SharedPreferences sharedPreferences = AppGrid.this.f120924o;
                    if (sharedPreferences.getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + jVar.field_appId, true)) {
                        aVar.f120937e.setVisibility(0);
                    }
                }
            }
            if ("wxce6f23b478a3a2a2".equals(jVar.field_appId)) {
                int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(aVar2, 0)).intValue();
                if (intValue > 1) {
                    ArrayList<String> stringsToList = Util.stringsToList(((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_STRING_SYNC, "")).split(";"));
                    if (!stringsToList.contains(intValue + "")) {
                        aVar.f120937e.setVisibility(0);
                    }
                }
            } else if ("wx6fa7e3bab7e15415".equals(jVar.field_appId)) {
                int intValue2 = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(aVar2, 0)).intValue();
                if (intValue2 <= 1) {
                    aVar.f120937e.setVisibility(8);
                    return;
                }
                ArrayList<String> stringsToList2 = Util.stringsToList(((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_STRING_SYNC, "")).split(";"));
                if (!stringsToList2.contains(intValue2 + "")) {
                    aVar.f120937e.setVisibility(0);
                }
            }
        }

        /* renamed from: b */
        public C44561j getItem(int i) {
            AppGrid appGrid = AppGrid.this;
            int i2 = appGrid.f120922j;
            if (i < i2 && appGrid.f120921i == 0) {
                return null;
            }
            int i3 = appGrid.f120921i;
            int i4 = appGrid.f120919g;
            if ((i3 * i4) + i < i2 || (i - i2) + (i3 * i4) >= ((ArrayList) this.f120927d).size()) {
                return null;
            }
            AppGrid appGrid2 = AppGrid.this;
            int i5 = (i - appGrid2.f120922j) + (appGrid2.f120921i * appGrid2.f120919g);
            Log.m105927v("MicroMsg.AppGrid", "get item db pos: %d", Integer.valueOf(i5));
            return (C44561j) ((ArrayList) this.f120927d).get(i5);
        }

        public int getCount() {
            AppGrid appGrid = AppGrid.this;
            int i = appGrid.f120921i;
            return i == appGrid.f120920h + -1 ? appGrid.f120918f - (i * appGrid.f120919g) : appGrid.f120919g;
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                java.lang.Class<ym.l> r2 = p763ym.C79138l.class
                r3 = 0
                if (r27 != 0) goto L_0x0066
                com.tencent.mm.pluginsdk.ui.chat.AppGrid$c$a r4 = new com.tencent.mm.pluginsdk.ui.chat.AppGrid$c$a
                r4.<init>(r0)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r5 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r5 = r5.f120917e
                r6 = 2131493186(0x7f0c0142, float:1.8609845E38)
                android.view.View r5 = android.view.View.inflate(r5, r6, r3)
                r6 = 2131297188(0x7f0903a4, float:1.8212314E38)
                android.view.View r6 = r5.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r4.f120935c = r6
                r6 = 2131297187(0x7f0903a3, float:1.8212312E38)
                android.view.View r6 = r5.findViewById(r6)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r6
                r4.f120936d = r6
                r6 = 2131297189(0x7f0903a5, float:1.8212316E38)
                android.view.View r6 = r5.findViewById(r6)
                r4.f120938f = r6
                r6 = 2131297190(0x7f0903a6, float:1.8212318E38)
                android.view.View r6 = r5.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r4.f120933a = r6
                r6 = 2131297186(0x7f0903a2, float:1.821231E38)
                android.view.View r6 = r5.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r4.f120934b = r6
                r6 = 2131297191(0x7f0903a7, float:1.821232E38)
                android.view.View r6 = r5.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r4.f120937e = r6
                r6 = 2131297192(0x7f0903a8, float:1.8212322E38)
                android.view.View r6 = r5.findViewById(r6)
                r4.f120939g = r6
                r5.setTag(r4)
                goto L_0x006e
            L_0x0066:
                java.lang.Object r4 = r27.getTag()
                com.tencent.mm.pluginsdk.ui.chat.AppGrid$c$a r4 = (com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.C44602c.C44603a) r4
                r5 = r27
            L_0x006e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "pos:"
                r6.append(r7)
                r6.append(r1)
                java.lang.String r7 = " page:"
                r6.append(r7)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r7 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                int r7 = r7.f120921i
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "MicroMsg.AppGrid"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                android.widget.TextView r6 = r4.f120933a
                r8 = 0
                r6.setVisibility(r8)
                boolean r6 = r0.f120931h
                r9 = 8
                if (r6 == 0) goto L_0x00a3
                android.widget.TextView r6 = r4.f120934b
                r6.setVisibility(r8)
                goto L_0x00a8
            L_0x00a3:
                android.widget.TextView r6 = r4.f120934b
                r6.setVisibility(r9)
            L_0x00a8:
                android.view.View r6 = r4.f120939g
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r15.mo10233c(r10)
                java.lang.Object[] r11 = r15.mo10232b()
                java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r10 = r6
                r3 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r3 = r3.mo10231a(r8)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r6.setVisibility(r3)
                java.lang.String r11 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                android.widget.TextView r3 = r4.f120937e
                r3.setVisibility(r9)
                android.view.View r3 = r4.f120938f
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                r6.mo10233c(r10)
                java.lang.Object[] r11 = r6.mo10232b()
                java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r3
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r6 = r6.mo10231a(r8)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r11 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                android.widget.ImageView r3 = r4.f120935c
                r3.setVisibility(r8)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r4.f120936d
                r3.setVisibility(r9)
                android.widget.ImageView r3 = r4.f120935c
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                int r6 = r0.f120928e
                r3.width = r6
                r3.height = r6
                android.widget.ImageView r6 = r4.f120935c
                r6.setLayoutParams(r3)
                android.widget.TextView r6 = r4.f120933a
                r10 = 0
                r6.setTag(r10)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r6 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                int r10 = r6.f120921i
                int r11 = r6.f120919g
                int r10 = r10 * r11
                int r10 = r10 + r1
                com.tencent.mm.pluginsdk.ui.chat.AppGrid$d r6 = r6.f120916d
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$d r6 = (com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.C72749d) r6
                int r6 = r6.mo100337a(r10)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r11 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                int r12 = r11.f120922j
                java.lang.String r13 = "wx3cc22b542de028d4"
                java.lang.String r14 = "wxce6f23b478a3a2a2"
                java.lang.String r15 = "wx6fa7e3bab7e15415"
                if (r10 >= r12) goto L_0x064a
                r2 = 2131316900(0x7f0950a4, float:1.8252295E38)
                r10 = 2131821521(0x7f1103d1, float:1.9275788E38)
                switch(r6) {
                    case 0: goto L_0x0630;
                    case 1: goto L_0x0614;
                    case 2: goto L_0x05d3;
                    case 3: goto L_0x0598;
                    case 4: goto L_0x055d;
                    case 5: goto L_0x051f;
                    case 6: goto L_0x0466;
                    case 7: goto L_0x0448;
                    case 8: goto L_0x042a;
                    case 9: goto L_0x0422;
                    case 10: goto L_0x03e4;
                    case 11: goto L_0x03ca;
                    case 12: goto L_0x03b0;
                    case 13: goto L_0x0396;
                    case 14: goto L_0x037c;
                    case 15: goto L_0x0362;
                    case 16: goto L_0x0301;
                    case 17: goto L_0x0248;
                    case 18: goto L_0x01ed;
                    case 19: goto L_0x01d3;
                    case 20: goto L_0x01b9;
                    case 21: goto L_0x0182;
                    default: goto L_0x0180;
                }
            L_0x0180:
                goto L_0x07f9
            L_0x0182:
                android.content.Context r2 = r11.f120917e
                android.content.res.Resources r2 = r2.getResources()
                r6 = 2131165346(0x7f0700a2, float:1.7944907E38)
                int r2 = r2.getDimensionPixelSize(r6)
                r3.width = r2
                r3.height = r2
                android.widget.ImageView r2 = r4.f120935c
                r2.setLayoutParams(r3)
                android.widget.ImageView r2 = r4.f120935c
                android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
                r2.setScaleType(r3)
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131755900(0x7f10037c, float:1.9142692E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821501(0x7f1103bd, float:1.9275747E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x01b9:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756047(0x7f10040f, float:1.914299E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821492(0x7f1103b4, float:1.9275729E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x01d3:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756804(0x7f100704, float:1.9144526E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821490(0x7f1103b2, float:1.9275725E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x01ed:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756802(0x7f100702, float:1.9144522E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821488(0x7f1103b0, float:1.927572E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                android.view.View r2 = r4.f120939g     // Catch:{ Exception -> 0x0611 }
                k20.a r3 = new k20.a     // Catch:{ Exception -> 0x0611 }
                r3.<init>()     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0611 }
                r3.mo10233c(r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object[] r11 = r3.mo10232b()     // Catch:{ Exception -> 0x0611 }
                java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r3 = r3.mo10231a(r8)     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0611 }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0611 }
                java.lang.String r11 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r10 = r2
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0248:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756811(0x7f10070b, float:1.914454E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821509(0x7f1103c5, float:1.9275763E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 327744(0x50040, float:4.59267E-40)
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x02bc
                android.view.View r2 = r4.f120939g     // Catch:{ Exception -> 0x0611 }
                k20.a r3 = new k20.a     // Catch:{ Exception -> 0x0611 }
                r3.<init>()     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0611 }
                r3.mo10233c(r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object[] r11 = r3.mo10232b()     // Catch:{ Exception -> 0x0611 }
                java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r3 = r3.mo10231a(r8)     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0611 }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0611 }
                java.lang.String r11 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r10 = r2
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x02bc:
                android.view.View r2 = r4.f120939g     // Catch:{ Exception -> 0x0611 }
                k20.a r3 = new k20.a     // Catch:{ Exception -> 0x0611 }
                r3.<init>()     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0611 }
                r3.mo10233c(r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object[] r18 = r3.mo10232b()     // Catch:{ Exception -> 0x0611 }
                java.lang.String r19 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r20 = "getView"
                java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r2
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r3 = r3.mo10231a(r8)     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0611 }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0611 }
                java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r19 = "getView"
                java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r2
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0301:
                android.widget.TextView r2 = r4.f120933a
                android.content.Context r3 = r11.f120917e
                r6 = 2131825080(0x7f1111b8, float:1.9283006E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 208899(0x33003, float:2.9273E-40)
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                eb0.c r3 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r3 = r3.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r7 = 208913(0x33011, float:2.9275E-40)
                java.lang.Object r3 = r3.mo119684e(r7, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0611 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 != 0) goto L_0x0347
                if (r3 == 0) goto L_0x0340
                goto L_0x0347
            L_0x0340:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r9)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0347:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r8)     // Catch:{ Exception -> 0x0611 }
                if (r3 == 0) goto L_0x0358
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r3 = 2131821542(0x7f1103e6, float:1.927583E38)
                r2.setText(r3)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0358:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r3 = 2131821611(0x7f11042b, float:1.927597E38)
                r2.setText(r3)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0362:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756805(0x7f100705, float:1.9144528E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821484(0x7f1103ac, float:1.9275712E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x037c:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756806(0x7f100706, float:1.914453E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821491(0x7f1103b3, float:1.9275727E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x0396:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756274(0x7f1004f2, float:1.914345E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821493(0x7f1103b5, float:1.927573E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x03b0:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756052(0x7f100414, float:1.9143E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821494(0x7f1103b6, float:1.9275733E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x03ca:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756803(0x7f100703, float:1.9144524E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821489(0x7f1103b1, float:1.9275723E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x03e4:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756814(0x7f10070e, float:1.9144546E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131831204(0x7f1129a4, float:1.9295427E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 73
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x041b
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r8)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x041b:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r9)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0422:
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                r2 = 0
                r0.mo69393a(r4, r13, r2)
                goto L_0x07f9
            L_0x042a:
                java.lang.String r3 = "attach remittance"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
                android.widget.TextView r3 = r4.f120933a
                java.lang.String r6 = "ViewId_Remittance_Attach_View"
                r3.setTag(r2, r6)
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r2 = r2.f120917e
                r3 = 2131821513(0x7f1103c9, float:1.9275771E38)
                java.lang.String r2 = r2.getString(r3)
                r0.mo69393a(r4, r14, r2)
                goto L_0x07f9
            L_0x0448:
                java.lang.String r3 = "attach lucky money"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
                android.widget.TextView r3 = r4.f120933a
                java.lang.String r6 = "ViewId_Luckymoney_Attach_View"
                r3.setTag(r2, r6)
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r2 = r2.f120917e
                r3 = 2131821497(0x7f1103b9, float:1.9275739E38)
                java.lang.String r2 = r2.getString(r3)
                r0.mo69393a(r4, r15, r2)
                goto L_0x07f9
            L_0x0466:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756807(0x7f100707, float:1.9144532E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821496(0x7f1103b8, float:1.9275737E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 290817(0x47001, float:4.07521E-40)
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x04da
                android.view.View r2 = r4.f120939g     // Catch:{ Exception -> 0x0611 }
                k20.a r3 = new k20.a     // Catch:{ Exception -> 0x0611 }
                r3.<init>()     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0611 }
                r3.mo10233c(r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object[] r11 = r3.mo10232b()     // Catch:{ Exception -> 0x0611 }
                java.lang.String r12 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r2
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r3 = r3.mo10231a(r8)     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0611 }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0611 }
                java.lang.String r11 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r12 = "getView"
                java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r10 = r2
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x04da:
                android.view.View r2 = r4.f120939g     // Catch:{ Exception -> 0x0611 }
                k20.a r3 = new k20.a     // Catch:{ Exception -> 0x0611 }
                r3.<init>()     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0611 }
                r3.mo10233c(r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object[] r18 = r3.mo10232b()     // Catch:{ Exception -> 0x0611 }
                java.lang.String r19 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r20 = "getView"
                java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r2
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r3 = r3.mo10231a(r8)     // Catch:{ Exception -> 0x0611 }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0611 }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0611 }
                java.lang.String r18 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$AppGridAdapter"
                java.lang.String r19 = "getView"
                java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r2
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x051f:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756817(0x7f100711, float:1.9144552E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821512(0x7f1103c8, float:1.927577E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 67
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x0556
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r8)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0556:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r9)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x055d:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756816(0x7f100710, float:1.914455E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                java.lang.String r3 = r3.getString(r10)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 62
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x0591
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r8)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0591:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r9)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0598:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756809(0x7f100709, float:1.9144536E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                java.lang.String r3 = r3.getString(r10)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 81
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x05cc
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r8)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x05cc:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r9)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x05d3:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756815(0x7f10070f, float:1.9144548E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821519(0x7f1103cf, float:1.9275783E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0611 }
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()     // Catch:{ Exception -> 0x0611 }
                r3 = 54
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0611 }
                java.lang.Object r2 = r2.mo119684e(r3, r6)     // Catch:{ Exception -> 0x0611 }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0611 }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0611 }
                if (r2 == 0) goto L_0x060a
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r8)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x060a:
                android.widget.TextView r2 = r4.f120937e     // Catch:{ Exception -> 0x0611 }
                r2.setVisibility(r9)     // Catch:{ Exception -> 0x0611 }
                goto L_0x07f9
            L_0x0611:
                goto L_0x07f9
            L_0x0614:
                boolean r2 = sf0.C90188n0.f258933a
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756800(0x7f100700, float:1.9144518E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821498(0x7f1103ba, float:1.927574E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x0630:
                android.widget.ImageView r2 = r4.f120935c
                r3 = 2131756810(0x7f10070a, float:1.9144538E38)
                r2.setImageResource(r3)
                android.widget.TextView r2 = r4.f120933a
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r3 = r3.f120917e
                r6 = 2131821502(0x7f1103be, float:1.927575E38)
                java.lang.String r3 = r3.getString(r6)
                r2.setText(r3)
                goto L_0x07f9
            L_0x064a:
                int r6 = r0.f120929f
                r3.width = r6
                r3.height = r6
                android.widget.ImageView r6 = r4.f120935c
                r6.setLayoutParams(r3)
                com.tencent.mm.pluginsdk.model.app.j r3 = r25.getItem(r26)
                if (r3 == 0) goto L_0x07f9
                boolean r6 = r3 instanceof com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h.C44607a
                if (r6 == 0) goto L_0x06f4
                com.tencent.mm.pluginsdk.ui.chat.h$a r3 = (com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h.C44607a) r3
                com.tencent.mm.pluginsdk.ui.chat.h$b r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.m49053b(r3)
                java.lang.String r6 = r3.f120953L1
                r6.getClass()
                java.lang.String r7 = "icons_filled_live_mark"
                boolean r7 = r6.equals(r7)
                if (r7 != 0) goto L_0x06d4
                java.lang.String r7 = "icons_filled_health_note"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x06cb
                android.widget.ImageView r6 = r4.f120935c
                r6.setVisibility(r9)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = r4.f120936d
                r6.setVisibility(r8)
                boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                r7 = -1
                if (r6 == 0) goto L_0x06af
                java.lang.String r6 = r3.f120954M1
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x06af
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = r4.f120936d
                java.lang.String r9 = r3.f120954M1
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r10 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r10 = r10.f120917e
                int r11 = r3.f120955N1
                int r10 = kg3.C76577a.m92151b(r10, r11)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r11 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r11 = r11.f120917e
                int r3 = r3.f120956O1
                int r3 = kg3.C76577a.m92151b(r11, r3)
                r6.mo100288c(r9, r10, r3, r7)
                goto L_0x06dc
            L_0x06af:
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = r4.f120936d
                java.lang.String r9 = r3.f120953L1
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r10 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r10 = r10.f120917e
                int r11 = r3.f120955N1
                int r10 = kg3.C76577a.m92151b(r10, r11)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r11 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r11 = r11.f120917e
                int r3 = r3.f120956O1
                int r3 = kg3.C76577a.m92151b(r11, r3)
                r6.mo100288c(r9, r10, r3, r7)
                goto L_0x06dc
            L_0x06cb:
                android.widget.ImageView r3 = r4.f120935c
                r6 = 2131756054(0x7f100416, float:1.9143005E38)
                r3.setImageResource(r6)
                goto L_0x06dc
            L_0x06d4:
                android.widget.ImageView r3 = r4.f120935c
                r6 = 2131756070(0x7f100426, float:1.9143037E38)
                r3.setImageResource(r6)
            L_0x06dc:
                android.widget.TextView r3 = r4.f120933a
                java.lang.String r6 = r2.f120963a
                r3.setText(r6)
                java.lang.String r3 = r2.f120964b
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x07f9
                android.widget.TextView r3 = r4.f120934b
                java.lang.String r2 = r2.f120964b
                r3.setText(r2)
                goto L_0x07f9
            L_0x06f4:
                eb0.c r6 = eb0.C97625j3.m125812b()
                boolean r6 = r6.mo105883I()
                r7 = 1
                if (r6 == 0) goto L_0x0799
                int r6 = r3.field_status
                r9 = 5
                if (r6 != r9) goto L_0x0719
                di3.d r6 = di3.C86312j.m106911c(r2)
                ym.l r6 = (p763ym.C79138l) r6
                java.lang.String r9 = r3.field_appId
                r10 = 3
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r11 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r11 = r11.f120917e
                float r11 = kg3.C76577a.m92156g(r11)
                r6.mo74018ub(r9, r10, r11)
                goto L_0x0747
            L_0x0719:
                boolean r6 = r3.mo69361t2()
                if (r6 == 0) goto L_0x0734
                di3.d r6 = di3.C86312j.m106911c(r2)
                ym.l r6 = (p763ym.C79138l) r6
                java.lang.String r9 = r3.field_appId
                r10 = 4
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r11 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r11 = r11.f120917e
                float r11 = kg3.C76577a.m92156g(r11)
                r6.mo74018ub(r9, r10, r11)
                goto L_0x0747
            L_0x0734:
                di3.d r6 = di3.C86312j.m106911c(r2)
                ym.l r6 = (p763ym.C79138l) r6
                java.lang.String r9 = r3.field_appId
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r10 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r10 = r10.f120917e
                float r10 = kg3.C76577a.m92156g(r10)
                r6.mo74018ub(r9, r7, r10)
            L_0x0747:
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r6 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                java.lang.String r6 = r3.field_appId
                boolean r6 = r14.equals(r6)
                if (r6 == 0) goto L_0x075a
                android.widget.ImageView r6 = r4.f120935c
                r9 = 2131756813(0x7f10070d, float:1.9144544E38)
                r6.setImageResource(r9)
                goto L_0x07a1
            L_0x075a:
                java.lang.String r6 = r3.field_appId
                boolean r6 = r15.equals(r6)
                if (r6 == 0) goto L_0x076b
                android.widget.ImageView r6 = r4.f120935c
                r9 = 2131756808(0x7f100708, float:1.9144534E38)
                r6.setImageResource(r9)
                goto L_0x07a1
            L_0x076b:
                java.lang.String r6 = r3.field_appId
                java.lang.String r9 = "wx7302cee7c7d6d7d6"
                boolean r6 = r9.equals(r6)
                if (r6 == 0) goto L_0x077f
                android.widget.ImageView r6 = r4.f120935c
                r9 = 2131756801(0x7f100701, float:1.914452E38)
                r6.setImageResource(r9)
                goto L_0x07a1
            L_0x077f:
                java.lang.String r6 = r3.field_appId
                boolean r6 = r13.equals(r6)
                if (r6 == 0) goto L_0x0790
                android.widget.ImageView r6 = r4.f120935c
                r9 = 2131756799(0x7f1006ff, float:1.9144516E38)
                r6.setImageResource(r9)
                goto L_0x07a1
            L_0x0790:
                android.widget.ImageView r6 = r4.f120935c
                r9 = 2131231060(0x7f080154, float:1.807819E38)
                r6.setBackgroundResource(r9)
                goto L_0x07a1
            L_0x0799:
                android.widget.ImageView r6 = r4.f120935c
                r9 = 2131234862(0x7f08102e, float:1.8085902E38)
                r6.setBackgroundResource(r9)
            L_0x07a1:
                android.widget.TextView r6 = r4.f120933a
                di3.d r2 = di3.C86312j.m106911c(r2)
                ym.l r2 = (p763ym.C79138l) r2
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r9 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.Context r9 = r9.f120917e
                java.lang.String r2 = r2.mo74011hv(r9, r3)
                r6.setText(r2)
                boolean r2 = r3.mo69361t2()
                if (r2 == 0) goto L_0x07f9
                int r2 = r3.field_serviceAppInfoFlag
                r2 = r2 & 2
                if (r2 == 0) goto L_0x07c2
                r2 = 1
                goto L_0x07c3
            L_0x07c2:
                r2 = 0
            L_0x07c3:
                if (r2 == 0) goto L_0x07f9
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.SharedPreferences r6 = r2.f120924o
                if (r6 != 0) goto L_0x07d7
                android.content.Context r6 = r2.f120917e
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                android.content.SharedPreferences r6 = r6.getSharedPreferences(r9, r8)
                r2.f120924o = r6
            L_0x07d7:
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                android.content.SharedPreferences r2 = r2.f120924o
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "SP_KEY_SERVICE_APP_PREFIX_"
                r6.append(r9)
                java.lang.String r3 = r3.field_appId
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                boolean r2 = r2.getBoolean(r3, r7)
                if (r2 == 0) goto L_0x07f9
                android.widget.TextView r2 = r4.f120937e
                r2.setVisibility(r8)
            L_0x07f9:
                com.tencent.mm.pluginsdk.model.app.j r1 = r25.getItem(r26)
                if (r1 == 0) goto L_0x080a
                boolean r1 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48984d(r1)
                if (r1 == 0) goto L_0x080a
                android.widget.TextView r1 = r4.f120937e
                r1.setVisibility(r8)
            L_0x080a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.C44602c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid$d */
    public interface C44604d {
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid$a */
    public class C44605a implements AdapterView.OnItemClickListener {
        public C44605a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: com.tencent.mm.pluginsdk.model.app.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: com.tencent.mm.pluginsdk.model.app.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v191, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: com.tencent.mm.pluginsdk.model.app.j} */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0701, code lost:
            if (r2 == null) goto L_0x0c88;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r19, android.view.View r20, int r21, long r22) {
            /*
                r18 = this;
                r6 = r18
                r7 = r21
                java.lang.Class<xy1.i> r8 = xy1.C79011i.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r19
                r0.add(r1)
                r1 = r20
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r0.add(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r22)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$1"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r4 = r18
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                com.tencent.mm.pluginsdk.ui.chat.AppGrid$d r1 = r0.f120916d
                int r2 = r0.f120921i
                int r0 = r0.f120919g
                int r2 = r2 * r0
                int r0 = r7 + r2
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$d r1 = (com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.C72749d) r1
                int r0 = r1.mo100337a(r0)
                com.tencent.mm.pluginsdk.ui.chat.AppGrid r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.this
                com.tencent.mm.pluginsdk.ui.chat.AppGrid$c r2 = r2.f120923n
                com.tencent.mm.pluginsdk.model.app.j r2 = r2.getItem(r7)
                r1.getClass()
                java.lang.Class<ht1.e4> r3 = ht1.C60165e4.class
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
                r5 = 2
                java.lang.Object[] r7 = new java.lang.Object[r5]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                r10 = 0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                r7[r10] = r9
                r9 = 1
                if (r2 == 0) goto L_0x006b
                r12 = 1
                goto L_0x006c
            L_0x006b:
                r12 = 0
            L_0x006c:
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                r7[r9] = r12
                java.lang.String r12 = "MicroMsg.AppPanel"
                java.lang.String r13 = "pos=%d, has appInfo = %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r7)
                if (r2 == 0) goto L_0x008c
                boolean r7 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48984d(r2)
                if (r7 == 0) goto L_0x008c
                r7 = 327682(0x50002, float:4.5918E-40)
                java.lang.String r13 = r2.field_appId
                java.lang.String r14 = "1"
                eb0.C75592q0.m90768P(r7, r13, r14)
            L_0x008c:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r7 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.ui.base.MMFlipper r13 = r7.f211713p
                int r13 = r13.getCurScreen()
                r7.f211722y = r13
                boolean r7 = r2 instanceof com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h.C44607a
                if (r7 == 0) goto L_0x0169
                com.tencent.mm.pluginsdk.ui.chat.h$a r2 = (com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h.C44607a) r2
                java.lang.Object[] r0 = new java.lang.Object[r9]
                int r3 = r2.f120942A1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r10] = r3
                java.lang.String r3 = "jump_type:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r0)
                com.tencent.mm.pluginsdk.ui.chat.h$a$a r0 = r2.f120960S1
                if (r0 == 0) goto L_0x00ed
                com.tencent.mm.ui.chatting.component.i0 r0 = (com.tencent.p014mm.p136ui.chatting.component.C44829i0) r0
                di3.d r3 = di3.C86312j.m106911c(r8)
                xy1.i r3 = (xy1.C79011i) r3
                com.tencent.mm.ui.chatting.component.j0 r4 = r0.f121663b
                ck3.b r4 = r4.f215752d
                java.lang.String r4 = r4.mo91577r()
                py1.i r0 = r0.f121662a
                int r0 = r0.f127764d
                java.lang.String r0 = r3.mo71415Vl(r4, r0)
                if (r0 == 0) goto L_0x00ed
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h$a$a r1 = r2.f120960S1
                com.tencent.mm.ui.chatting.component.i0 r1 = (com.tencent.p014mm.p136ui.chatting.component.C44829i0) r1
                r1.getClass()
                di3.d r2 = di3.C86312j.m106911c(r8)
                xy1.i r2 = (xy1.C79011i) r2
                com.tencent.mm.ui.chatting.component.j0 r3 = r1.f121663b
                ck3.b r3 = r3.f215752d
                java.lang.String r3 = r3.mo91577r()
                py1.i r1 = r1.f121662a
                int r1 = r1.f127764d
                java.lang.String r1 = r2.mo71415Vl(r3, r1)
                r0.mo100335x(r1)
                goto L_0x0c88
            L_0x00ed:
                int r0 = r2.f120942A1
                if (r0 != r9) goto L_0x0134
                di0.o r0 = new di0.o
                r0.<init>()
                java.lang.String r3 = r2.f120943B1
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x0103
                java.lang.String r3 = r2.f120943B1
                r0.f250929a = r3
                goto L_0x0107
            L_0x0103:
                java.lang.String r3 = r2.f120944C1
                r0.f250930b = r3
            L_0x0107:
                int r3 = r2.f120945D1
                r0.f250932d = r3
                java.lang.String r3 = r2.f120947F1     // Catch:{ NumberFormatException -> 0x0114 }
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0114 }
                r0.f250931c = r3     // Catch:{ NumberFormatException -> 0x0114 }
                goto L_0x0116
            L_0x0114:
                r0.f250931c = r10
            L_0x0116:
                java.lang.String r3 = r2.f120946E1
                r0.f250934f = r3
                r3 = 1156(0x484, float:1.62E-42)
                r0.f250939k = r3
                java.lang.String r3 = r2.f120958Q1
                r0.f250948t = r3
                java.lang.Class<kr0.x0> r3 = kr0.C76630x0.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                kr0.x0 r3 = (kr0.C76630x0) r3
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.getContext()
                r3.mo106898tv(r1, r0)
                goto L_0x014d
            L_0x0134:
                if (r0 != r5) goto L_0x014d
                int r0 = r2.f120959R1
                if (r0 <= 0) goto L_0x0144
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                java.lang.String r3 = r2.f120948G1
                qg0.C12215a.m11777b(r1, r3, r10, r9, r0)
                goto L_0x014d
            L_0x0144:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r2.f120948G1
                qg0.C12215a.m11778c(r0, r1, r10, r9)
            L_0x014d:
                com.tencent.mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct
                r0.<init>()
                r3 = 2
                r0.f194312d = r3
                r3 = 0
                r0.f194313e = r3
                java.lang.String r1 = r2.f120961y1
                java.lang.String r2 = "AppList"
                java.lang.String r1 = r0.mo86045b(r2, r1, r9)
                r0.f194314f = r1
                r0.mo86054n()
                goto L_0x0c88
            L_0x0169:
                r7 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r13 = "SP_KEY_SERVICE_APP_PREFIX_"
                r14 = 2131823590(0x7f110be6, float:1.9279984E38)
                r16 = 11
                r17 = 3
                if (r0 == r7) goto L_0x0b89
                r7 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = ""
                if (r0 == r7) goto L_0x0b41
                java.lang.String r7 = "Talkroom is on: "
                java.lang.String r9 = ";"
                r15 = 2131821617(0x7f110431, float:1.9275982E38)
                switch(r0) {
                    case 0: goto L_0x0ac9;
                    case 1: goto L_0x0a65;
                    case 2: goto L_0x09a6;
                    case 3: goto L_0x099b;
                    case 4: goto L_0x08f1;
                    case 5: goto L_0x08b2;
                    case 6: goto L_0x0828;
                    case 7: goto L_0x06be;
                    case 8: goto L_0x061a;
                    case 9: goto L_0x0589;
                    case 10: goto L_0x052a;
                    case 11: goto L_0x04e1;
                    case 12: goto L_0x049f;
                    case 13: goto L_0x0437;
                    case 14: goto L_0x03a2;
                    case 15: goto L_0x0360;
                    case 16: goto L_0x02c9;
                    case 17: goto L_0x0256;
                    case 18: goto L_0x0236;
                    case 19: goto L_0x01ec;
                    case 20: goto L_0x01aa;
                    case 21: goto L_0x0189;
                    default: goto L_0x0187;
                }
            L_0x0187:
                goto L_0x0c88
            L_0x0189:
                java.lang.Class<fv.k> r0 = p529fv.C75798k.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                fv.k r0 = (p529fv.C75798k) r0
                com.tencent.mm.pluginsdk.model.app.z r2 = new com.tencent.mm.pluginsdk.model.app.z
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2.<init>(r3)
                r0.Y90(r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                r0.mo106097nV(r1)
                goto L_0x0c88
            L_0x01aa:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212153B
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x01c3
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x01c3:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96058r()
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 21
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r1.f211710j
                java.lang.String r1 = r1.mo100532b()
                r2[r17] = r1
                r1 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r1, r2)
                goto L_0x0c88
            L_0x01ec:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212180x
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x0205
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x0205:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 17
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r1 = r0.f211708h
                if (r1 == 0) goto L_0x0c88
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96044d()
                goto L_0x0c88
            L_0x0236:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r1 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r1 = r1.f212178v
                boolean r1 = r1.f212183a
                if (r1 != 0) goto L_0x024f
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x024f:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96052l()
                goto L_0x0c88
            L_0x0256:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212164h
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x026f
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x026f:
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r3 = 327744(0x50040, float:4.59267E-40)
                java.lang.Object r0 = r0.mo119684e(r3, r2)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x029a
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.mo119676J(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                r0.mo100321s()
            L_0x029a:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 12
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96047g()
                goto L_0x0c88
            L_0x02c9:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212174r
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x02e2
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x02e2:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r2 = r0.f211708h
                if (r2 == 0) goto L_0x02ed
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96055o()
            L_0x02ed:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r2 = 15
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r10] = r2
                r2 = 1
                r3[r2] = r5
                r2 = 2
                r3[r2] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r1.f211710j
                java.lang.String r1 = r1.mo100532b()
                r3[r17] = r1
                r1 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r1, r3)
                eb0.c r1 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r1 = r1.mo105906u()
                r2 = 208899(0x33003, float:2.9273E-40)
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                java.lang.Object r1 = r1.mo119684e(r2, r3)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()
                r4 = 208913(0x33011, float:2.9275E-40)
                java.lang.Object r2 = r2.mo119684e(r4, r3)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r3 = 11594(0x2d4a, float:1.6247E-41)
                if (r1 == 0) goto L_0x034f
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
                r1[r10] = r2
                r0.mo160131h(r3, r1)
                goto L_0x0c88
            L_0x034f:
                r1 = 1
                if (r2 == 0) goto L_0x0c88
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 4
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r10] = r2
                r0.mo160131h(r3, r1)
                goto L_0x0c88
            L_0x0360:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212160d
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x0379
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x0379:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r10] = r2
                r2 = 1
                r3[r2] = r5
                r2 = 2
                r3[r2] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r2 = r2.f211710j
                java.lang.String r2 = r2.mo100532b()
                r3[r17] = r2
                r2 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r2, r3)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96041a()
                goto L_0x0c88
            L_0x03a2:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionGroupLive
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r2 = r2.getContext()
                boolean r0 = r0.checkAvailable(r2)
                if (r0 != 0) goto L_0x03b2
                goto L_0x0c88
            L_0x03b2:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212152A
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x03d3
                android.content.Context r0 = r0.f211711n
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                java.lang.String r1 = r1.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x03d3:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r4 = 20
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r10] = r4
                r4 = 1
                r2[r4] = r5
                r4 = 2
                r2[r4] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r4 = r4.f211710j
                java.lang.String r4 = r4.mo100532b()
                r2[r17] = r4
                r4 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r4, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                if (r0 == 0) goto L_0x0c88
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                int r2 = r2.f211705e
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                long r4 = r4.f211706f
                r0.mo96053m(r2, r4)
                di3.d r0 = di3.C86312j.m106911c(r3)
                r7 = r0
                ht1.e4 r7 = (ht1.C60165e4) r7
                r8 = 2
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                int r9 = r0.f211705e
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                long r10 = r0.f211706f
                r12 = 0
                r7.mo85147I3(r8, r9, r10, r12)
                di3.d r0 = di3.C86312j.m106911c(r3)
                ht1.e4 r0 = (ht1.C60165e4) r0
                r0.mo85151MA()
                goto L_0x0c88
            L_0x0437:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionGroupSolitaire
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r2 = r2.getContext()
                boolean r0 = r0.checkAvailable(r2)
                if (r0 != 0) goto L_0x0447
                goto L_0x0c88
            L_0x0447:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212182z
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x0468
                android.content.Context r0 = r0.f211711n
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                java.lang.String r1 = r1.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x0468:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 19
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                if (r0 == 0) goto L_0x0c88
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96060t()
                goto L_0x0c88
            L_0x049f:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionGroupTools
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r2 = r2.getContext()
                boolean r0 = r0.checkAvailable(r2)
                if (r0 != 0) goto L_0x04af
                goto L_0x0c88
            L_0x04af:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212181y
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x04d0
                android.content.Context r0 = r0.f211711n
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                java.lang.String r1 = r1.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x04d0:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                if (r0 == 0) goto L_0x0c88
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96049i()
                goto L_0x0c88
            L_0x04e1:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212161e
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x04fa
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x04fa:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 5
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r1 = r0.f211708h
                if (r1 == 0) goto L_0x0c88
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96054n()
                goto L_0x0c88
            L_0x052a:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                boolean r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85205e(r0)
                if (r0 == 0) goto L_0x0539
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85206f(r0)
                goto L_0x0c88
            L_0x0539:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionVoiceMsg
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r2 = r2.getContext()
                boolean r0 = r0.checkAvailable(r2)
                if (r0 != 0) goto L_0x0549
                goto L_0x0c88
            L_0x0549:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                r2 = 73
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r0.mo119676J(r2, r3)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$h r0 = r0.f211709i
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$g r0 = (com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$g) r0
                r0.mo100528a()
                goto L_0x0c88
            L_0x0589:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r3 = r0.f211708h
                if (r3 == 0) goto L_0x0c88
                if (r2 != 0) goto L_0x05aa
                java.util.Map r0 = r0.f211697K
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                java.lang.String r2 = "wx3cc22b542de028d4"
                java.lang.Object r0 = r0.get(r2)
                r2 = r0
                com.tencent.mm.pluginsdk.model.app.j r2 = (com.tencent.p014mm.pluginsdk.model.app.C44561j) r2
                if (r2 != 0) goto L_0x05aa
                java.lang.String r0 = "empty info"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                goto L_0x0c88
            L_0x05aa:
                boolean r0 = r2.mo69361t2()
                if (r0 != 0) goto L_0x05b6
                boolean r0 = r2.mo69360s2()
                if (r0 == 0) goto L_0x060f
            L_0x05b6:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                if (r0 != 0) goto L_0x05cf
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r3 = r0.f211711n
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r10)
                android.content.SharedPreferences unused = r0.f211704d = r3
            L_0x05cf:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                java.lang.String r4 = r2.field_appId
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 1
                boolean r0 = r0.getBoolean(r3, r4)
                if (r0 == 0) goto L_0x060f
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                android.content.SharedPreferences$Editor r0 = r0.edit()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                java.lang.String r2 = r2.field_appId
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r10)
                r0.commit()
            L_0x060f:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96056p()
                goto L_0x0c88
            L_0x061a:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionPayment
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r3 = r3.getContext()
                boolean r0 = r0.checkAvailable(r3)
                if (r0 != 0) goto L_0x062a
                goto L_0x0c88
            L_0x062a:
                if (r2 != 0) goto L_0x063e
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                java.util.Map r0 = r0.f211697K
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                java.lang.String r2 = "wxce6f23b478a3a2a2"
                java.lang.Object r0 = r0.get(r2)
                r2 = r0
                com.tencent.mm.pluginsdk.model.app.j r2 = (com.tencent.p014mm.pluginsdk.model.app.C44561j) r2
            L_0x063e:
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.Object r0 = r0.mo119685f(r4, r11)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                eb0.c r3 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r3 = r3.mo105906u()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_STRING_SYNC
                java.lang.Object r3 = r3.mo119685f(r4, r5)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String[] r3 = r3.split(r9)
                java.util.ArrayList r3 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r3)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                r7.append(r5)
                java.lang.String r7 = r7.toString()
                boolean r7 = r3.contains(r7)
                if (r7 == 0) goto L_0x067e
                goto L_0x06a4
            L_0x067e:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                r7.append(r5)
                java.lang.String r0 = r7.toString()
                r3.add(r0)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r3, r9)
                r0.mo119677K(r4, r3)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                r0.mo100321s()
            L_0x06a4:
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                r3 = 80
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r0.mo119676J(r3, r4)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96050j(r2)
                goto L_0x0c88
            L_0x06be:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionLuckyMoney
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r3 = r3.getContext()
                boolean r0 = r0.checkAvailable(r3)
                if (r0 != 0) goto L_0x06ce
                goto L_0x0c88
            L_0x06ce:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r3 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r3 = r3.f212176t
                boolean r3 = r3.f212183a
                if (r3 != 0) goto L_0x06ef
                android.content.Context r0 = r0.f211711n
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                java.lang.String r1 = r1.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x06ef:
                if (r2 != 0) goto L_0x0705
                java.util.Map r0 = r0.f211697K
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r2 = com.tencent.p014mm.pluginsdk.model.app.C44561j.f120844x1
                java.lang.String r2 = "wx6fa7e3bab7e15415"
                java.lang.Object r0 = r0.get(r2)
                r2 = r0
                com.tencent.mm.pluginsdk.model.app.j r2 = (com.tencent.p014mm.pluginsdk.model.app.C44561j) r2
                if (r2 != 0) goto L_0x0705
                goto L_0x0c88
            L_0x0705:
                boolean r0 = r2.mo69361t2()
                if (r0 != 0) goto L_0x0738
                boolean r0 = r2.mo69360s2()
                if (r0 == 0) goto L_0x0712
                goto L_0x0738
            L_0x0712:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
                r3[r10] = r7
                java.lang.String r2 = r2.field_appId
                r7 = 1
                r3[r7] = r2
                r2 = 2
                r3[r2] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r2 = r2.f211710j
                java.lang.String r2 = r2.mo100532b()
                r3[r17] = r2
                r2 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r2, r3)
                goto L_0x07b7
            L_0x0738:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                if (r0 != 0) goto L_0x0751
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r3 = r0.f211711n
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                android.content.SharedPreferences r3 = r3.getSharedPreferences(r7, r10)
                android.content.SharedPreferences unused = r0.f211704d = r3
            L_0x0751:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                java.lang.String r7 = r2.field_appId
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                r7 = 1
                boolean r0 = r0.getBoolean(r3, r7)
                if (r0 == 0) goto L_0x0791
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                android.content.SharedPreferences$Editor r0 = r0.edit()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                java.lang.String r7 = r2.field_appId
                r3.append(r7)
                java.lang.String r3 = r3.toString()
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r10)
                r0.commit()
            L_0x0791:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r7 = 13
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r3[r10] = r7
                java.lang.String r2 = r2.field_appId
                r7 = 1
                r3[r7] = r2
                r2 = 2
                r3[r2] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r2 = r2.f211710j
                java.lang.String r2 = r2.mo100532b()
                r3[r17] = r2
                r2 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r2, r3)
            L_0x07b7:
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.Object r0 = r0.mo119685f(r4, r11)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                eb0.c r2 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r2 = r2.mo105906u()
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_HONGBAO_STRING_SYNC
                java.lang.Object r2 = r2.mo119685f(r3, r5)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String[] r2 = r2.split(r9)
                java.util.ArrayList r2 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                boolean r4 = r2.contains(r4)
                if (r4 == 0) goto L_0x07f7
                goto L_0x081d
            L_0x07f7:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r5)
                java.lang.String r0 = r4.toString()
                r2.add(r0)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r2, r9)
                r0.mo119677K(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                r0.mo100321s()
            L_0x081d:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96046f()
                goto L_0x0c88
            L_0x0828:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionLocation
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r2 = r2.getContext()
                boolean r0 = r0.checkAvailable(r2)
                if (r0 != 0) goto L_0x0838
                goto L_0x0c88
            L_0x0838:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r0 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r0.f212172p
                boolean r2 = r2.f212183a
                if (r2 == 0) goto L_0x08a1
                boolean r0 = r0.mo100622a()
                if (r0 != 0) goto L_0x0849
                goto L_0x08a1
            L_0x0849:
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r3 = 290817(0x47001, float:4.07521E-40)
                java.lang.Object r0 = r0.mo119684e(r3, r2)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0874
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.mo119676J(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                r0.mo100321s()
            L_0x0874:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96051k()
                goto L_0x0c88
            L_0x08a1:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x08b2:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                if (r0 == 0) goto L_0x0c88
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 6
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                r2 = 67
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r0.mo119676J(r2, r3)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96059s()
                goto L_0x0c88
            L_0x08f1:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212168l
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x090a
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x090a:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 7
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                r2 = 62
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r0.mo119676J(r2, r3)
                com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
                r0.<init>()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$a r2 = r0.f154883d
                r3 = 1
                r2.f154885a = r3
                r0.publish()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
                java.lang.String r0 = r0.f154887a
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 != 0) goto L_0x0992
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r7)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r0)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r7 = r0.f211711n
                r0 = 2131837619(0x7f1142b3, float:1.9308438E38)
                java.lang.String r8 = r7.getString(r0)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                java.lang.String r10 = r0.getString(r15)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                r2 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.String r11 = r0.getString(r2)
                com.tencent.mm.pluginsdk.ui.chat.e r12 = new com.tencent.mm.pluginsdk.ui.chat.e
                r12.<init>(r1)
                com.tencent.mm.pluginsdk.ui.chat.f r13 = new com.tencent.mm.pluginsdk.ui.chat.f
                r13.<init>(r1)
                java.lang.String r9 = ""
                nj3.C76879j.m92707A(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0c88
            L_0x0992:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96057q()
                goto L_0x0c88
            L_0x099b:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                if (r0 == 0) goto L_0x0c88
                r0.mo96040I()
                goto L_0x0c88
            L_0x09a6:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212162f
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x09bf
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x09bf:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                r2 = 54
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r0.mo119676J(r2, r3)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                if (r0 == 0) goto L_0x0c88
                com.tencent.mm.autogen.events.TalkRoomServerEvent r0 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
                r0.<init>()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$a r2 = r0.f154883d
                r3 = 1
                r2.f154885a = r3
                r0.publish()
                com.tencent.mm.autogen.events.TalkRoomServerEvent$b r0 = r0.f154884e
                java.lang.String r0 = r0.f154887a
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 != 0) goto L_0x0a5a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r7)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r0)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r7 = r0.f211711n
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                r2 = 2131837619(0x7f1142b3, float:1.9308438E38)
                java.lang.String r8 = r0.getString(r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                java.lang.String r10 = r0.getString(r15)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r0 = r0.f211711n
                r2 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.String r11 = r0.getString(r2)
                com.tencent.mm.pluginsdk.ui.chat.c r12 = new com.tencent.mm.pluginsdk.ui.chat.c
                r12.<init>(r1)
                com.tencent.mm.pluginsdk.ui.chat.d r13 = new com.tencent.mm.pluginsdk.ui.chat.d
                r13.<init>(r1)
                java.lang.String r9 = ""
                nj3.C76879j.m92707A(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0c88
            L_0x0a5a:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96042b()
                goto L_0x0c88
            L_0x0a65:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                boolean r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85205e(r0)
                if (r0 == 0) goto L_0x0a74
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85206f(r0)
                goto L_0x0c88
            L_0x0a74:
                di3.d r0 = di3.C86312j.m106911c(r8)
                xy1.i r0 = (xy1.C79011i) r0
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r2 = r2.f211710j
                java.lang.String r2 = r2.mo100532b()
                java.lang.String r0 = r0.mo71418pA(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x0a93
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                r1.mo100335x(r0)
                goto L_0x0c88
            L_0x0a93:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 14
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2[r10] = r3
                r3 = 1
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r1 = r0.f211708h
                com.tencent.mm.pluginsdk.ui.chat.h r0 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r0 = r0.f212175s
                boolean r0 = r0.f212183a
                if (r0 == 0) goto L_0x0ac3
                r5 = 0
                goto L_0x0ac4
            L_0x0ac3:
                r5 = 2
            L_0x0ac4:
                r1.mo96045e(r5)
                goto L_0x0c88
            L_0x0ac9:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                boolean r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85205e(r0)
                if (r0 == 0) goto L_0x0ad8
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85206f(r0)
                goto L_0x0c88
            L_0x0ad8:
                di3.d r0 = di3.C86312j.m106911c(r8)
                xy1.i r0 = (xy1.C79011i) r0
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r2 = r2.f211710j
                java.lang.String r2 = r2.mo100532b()
                java.lang.String r0 = r0.mo71413QN(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x0af7
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                r1.mo100335x(r0)
                goto L_0x0c88
            L_0x0af7:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r2 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r2 = r2.f212159c
                boolean r2 = r2.f212183a
                if (r2 != 0) goto L_0x0b18
                android.content.Context r0 = r0.f211711n
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.Context r1 = r1.f211711n
                java.lang.String r1 = r1.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x0b18:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r2[r10] = r4
                r2[r3] = r5
                r3 = 2
                r2[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r2[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r3, r2)
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.m85207g(r0, r10)
                goto L_0x0c88
            L_0x0b41:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                java.util.List<com.tencent.mm.pluginsdk.model.app.j> r0 = r0.f211699M
                if (r0 != 0) goto L_0x0b4e
                java.lang.String r0 = "infoList == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                goto L_0x0c88
            L_0x0b4e:
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 10305(0x2841, float:1.444E-41)
                int r0 = r0.size()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2.kvStat(r3, r0)
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r3 = 10
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r10] = r3
                r3 = 1
                r0[r3] = r5
                r3 = 2
                r0[r3] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r3.f211710j
                java.lang.String r3 = r3.mo100532b()
                r0[r17] = r3
                r3 = 10923(0x2aab, float:1.5306E-41)
                r2.mo160131h(r3, r0)
                com.tencent.p014mm.pluginsdk.p133ui.tools.C72918o.m85513a()
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96048h()
                goto L_0x0c88
            L_0x0b89:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.h r3 = r0.f211687A
                com.tencent.mm.pluginsdk.ui.chat.h$c r3 = r3.f212166j
                boolean r3 = r3.f212183a
                if (r3 != 0) goto L_0x0ba2
                android.content.Context r0 = r0.f211711n
                java.lang.String r1 = r0.getString(r14)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r10)
                r0.show()
                goto L_0x0c88
            L_0x0ba2:
                if (r2 != 0) goto L_0x0bab
                java.lang.String r0 = "APP_MSG_POS bug appInfo is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                goto L_0x0c88
            L_0x0bab:
                boolean r0 = r2.mo69361t2()
                if (r0 != 0) goto L_0x0bdc
                boolean r0 = r2.mo69360s2()
                if (r0 == 0) goto L_0x0bb8
                goto L_0x0bdc
            L_0x0bb8:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
                r3[r10] = r4
                java.lang.String r4 = r2.field_appId
                r5 = 1
                r3[r5] = r4
                r4 = 2
                r3[r4] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r4 = r4.f211710j
                java.lang.String r4 = r4.mo100532b()
                r3[r17] = r4
                r4 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r4, r3)
                goto L_0x0c7f
            L_0x0bdc:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r3 = r0.f211704d
                if (r3 != 0) goto L_0x0bee
                android.content.Context r3 = r0.f211711n
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
                android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r10)
                r0.f211704d = r3
            L_0x0bee:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                java.lang.String r4 = r2.field_appId
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 1
                boolean r0 = r0.getBoolean(r3, r4)
                if (r0 == 0) goto L_0x0c2c
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                android.content.SharedPreferences r0 = r0.f211704d
                android.content.SharedPreferences$Editor r0 = r0.edit()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                java.lang.String r4 = r2.field_appId
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r10)
                r0.commit()
            L_0x0c2c:
                boolean r0 = r2.mo69360s2()
                if (r0 == 0) goto L_0x0c59
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 16
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r10] = r4
                java.lang.String r4 = r2.field_appId
                r5 = 1
                r3[r5] = r4
                r4 = 2
                r3[r4] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r4 = r4.f211710j
                java.lang.String r4 = r4.mo100532b()
                r3[r17] = r4
                r4 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r4, r3)
                goto L_0x0c7f
            L_0x0c59:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 13
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r10] = r4
                java.lang.String r4 = r2.field_appId
                r5 = 1
                r3[r5] = r4
                r4 = 2
                r3[r4] = r11
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r4 = r4.f211710j
                java.lang.String r4 = r4.mo100532b()
                r3[r17] = r4
                r4 = 10923(0x2aab, float:1.5306E-41)
                r0.mo160131h(r4, r3)
            L_0x0c7f:
                com.tencent.mm.pluginsdk.ui.chat.AppPanel r0 = com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel.this
                com.tencent.mm.pluginsdk.ui.chat.AppPanel$g r0 = r0.f211708h
                r0.mo96050j(r2)
            L_0x0c88:
                java.lang.String r0 = "com/tencent/mm/pluginsdk/ui/chat/AppGrid$1"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.AppGrid.C44605a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.AppGrid$b */
    public class C44606b implements AdapterView.OnItemLongClickListener {
        public C44606b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            AppGrid appGrid = AppGrid.this;
            C44604d dVar = appGrid.f120916d;
            int a = ((AppPanel.C72749d) dVar).mo100337a((appGrid.f120921i * appGrid.f120919g) + i);
            AppGrid.this.f120923n.getItem(i);
            AppPanel.C72749d dVar2 = (AppPanel.C72749d) dVar;
            if (a == 0) {
                AppPanel appPanel = AppPanel.this;
                if (!appPanel.f211687A.f212159c.f212183a) {
                    Context context = appPanel.f211711n;
                    C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f360266ba0), 0).show();
                } else if (AppPanel.m85205e(appPanel)) {
                    AppPanel.m85206f(AppPanel.this);
                } else if (((C103918d) C86312j.m106911c(C103918d.class)).Gd0(AppPanel.this.f211711n, "android.permission.CAMERA")) {
                    AppPanel.m85207g(AppPanel.this, true);
                } else {
                    AppPanel.m85207g(AppPanel.this, false);
                }
            } else {
                dVar2.getClass();
            }
            return true;
        }
    }

    public AppGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120917e = context;
    }

    /* renamed from: b */
    public static C72791h.C44609b m49053b(C72791h.C44607a aVar) {
        if (aVar == null) {
            return null;
        }
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        return "zh_CN".equals(applicationLanguage) ? aVar.f120949H1 : "zh_TW".equals(applicationLanguage) ? aVar.f120951J1 : "zh_HK".equals(applicationLanguage) ? aVar.f120950I1 : aVar.f120952K1;
    }

    public int getCount() {
        return this.f120923n.getCount();
    }

    public void setOnAppSelectedListener(C44604d dVar) {
        this.f120916d = dVar;
    }

    public AppGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f120917e = context;
    }
}
