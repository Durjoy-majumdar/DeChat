package com.tencent.p014mm.plugin.mall.p075ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TableCellClickEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C43420e0;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import di0.C86300q;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import kg3.C76577a;
import kr0.C76630x0;
import ob0.C117747y;
import s52.C48235m;
import te3.C48661a33;
import te3.C49009cj2;
import te3.C50456mv3;
import te3.C51264sl3;
import te3.C52206z23;
import te3.ue4;
import te3.zf4;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI */
public class MallWalletUI extends WalletBaseUI implements MStorageEx.IOnStorageChange {

    /* renamed from: q */
    public static final int f115142q = C76577a.m92151b(MMApplicationContext.getContext(), 8);

    /* renamed from: d */
    public TextView f115143d;

    /* renamed from: e */
    public WcPayBannerView f115144e;

    /* renamed from: f */
    public LinearLayout f115145f;

    /* renamed from: g */
    public LinearLayout f115146g;

    /* renamed from: h */
    public ue4 f115147h;

    /* renamed from: i */
    public Dialog f115148i;

    /* renamed from: j */
    public Dialog f115149j;

    /* renamed from: n */
    public C48235m.C48236a f115150n;

    /* renamed from: o */
    public boolean f115151o = false;

    /* renamed from: p */
    public IListener<TableCellClickEvent> f115152p = new IListener<TableCellClickEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1699303474;
        }

        public boolean callback(IEvent iEvent) {
            TableCellClickEvent.C40175a aVar;
            TableCellClickEvent tableCellClickEvent = (TableCellClickEvent) iEvent;
            if (!(tableCellClickEvent == null || (aVar = tableCellClickEvent.f107786d) == null || !Util.isEqual(aVar.f107787a, "fqf_cell"))) {
                Log.m105925i("MicroMsg.MallWalletUI", "%s click", tableCellClickEvent.f107786d.f107787a);
                MallWalletUI mallWalletUI = MallWalletUI.this;
                int i = MallWalletUI.f115142q;
                mallWalletUI.getClass();
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI$a */
    public class C42549a implements C48235m.C48236a {

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI$a$a */
        public class C42550a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C51264sl3 f115155d;

            /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI$a$a$a */
            public class C42551a implements View.OnClickListener {
                public C42551a() {
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/mall/ui/MallWalletUI$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    MallWalletUI.this.f115148i.dismiss();
                    C115669n.INSTANCE.mo160131h(16500, 5);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/MallWalletUI$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }

            public C42550a(C51264sl3 sl32) {
                this.f115155d = sl32;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.tencent.mm.ui.widget.MMSwitchBtn} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.tencent.mm.ui.widget.MMSwitchBtn} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: com.tencent.mm.ui.widget.MMSwitchBtn} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: android.widget.CheckBox} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.widget.CheckBox} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: android.widget.CheckBox} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: android.widget.CheckBox} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: android.widget.CheckBox} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: android.widget.CheckBox} */
            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [android.app.Dialog] */
            /* JADX WARNING: type inference failed for: r4v2 */
            /* JADX WARNING: type inference failed for: r4v3, types: [com.tencent.mm.plugin.wallet_core.utils.i0$e, android.util.AttributeSet] */
            /* JADX WARNING: type inference failed for: r4v4 */
            /* JADX WARNING: type inference failed for: r4v9, types: [android.widget.TextView, android.widget.Button, android.view.View] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:104:0x0294 A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x017f  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x0183  */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x0251  */
            /* JADX WARNING: Removed duplicated region for block: B:92:0x0276  */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r26 = this;
                    r0 = r26
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.this
                    com.tencent.mm.plugin.mall.ui.MallWalletUI r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.this
                    android.app.Dialog r1 = r1.f115148i
                    if (r1 == 0) goto L_0x0010
                    boolean r1 = r1.isShowing()
                    if (r1 != 0) goto L_0x02c0
                L_0x0010:
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.this
                    com.tencent.mm.plugin.mall.ui.MallWalletUI r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.this
                    boolean r1 = r1.isFinishing()
                    if (r1 != 0) goto L_0x02c0
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.this
                    com.tencent.mm.plugin.mall.ui.MallWalletUI r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.this
                    boolean r2 = r1.f115151o
                    if (r2 != 0) goto L_0x02c0
                    te3.sl3 r2 = r0.f115155d
                    te3.mv3 r2 = r2.f141594e
                    te3.o10 r2 = r2.f138237n
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a$a$a r3 = new com.tencent.mm.plugin.mall.ui.MallWalletUI$a$a$a
                    r3.<init>()
                    r4 = 0
                    r5 = 1
                    if (r2 != 0) goto L_0x0033
                    goto L_0x02a5
                L_0x0033:
                    xj.a r6 = new xj.a
                    r7 = 2131887328(0x7f1204e0, float:1.940926E38)
                    r6.<init>(r1, r7)
                    android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r1)
                    r8 = 2131498217(0x7f0c14e9, float:1.862005E38)
                    r9 = 0
                    android.view.View r7 = r7.inflate(r8, r4, r9)
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    te3.z23 r8 = r2.f138896d
                    if (r8 == 0) goto L_0x007f
                    te3.a33 r8 = r8.f145660g
                    if (r8 == 0) goto L_0x007f
                    r8 = 2131316894(0x7f09509e, float:1.8252282E38)
                    android.view.View r8 = r7.findViewById(r8)
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView r8 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r8
                    te3.z23 r10 = r2.f138896d
                    te3.a33 r10 = r10.f145660g
                    int r11 = r10.f130279f
                    if (r11 != r5) goto L_0x007f
                    te3.xh2 r11 = r10.f130277d
                    r12 = 2131233415(0x7f080a87, float:1.8082967E38)
                    r13 = 0
                    r14 = 0
                    r15 = 1
                    r10 = r8
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46934e(r10, r11, r12, r13, r14, r15)
                    r10 = 1112014848(0x42480000, float:50.0)
                    int r10 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r1, r10)
                    com.tencent.p014mm.sdk.platformtools.Util.expandViewTouchArea(r8, r10, r10, r10, r10)
                    com.tencent.mm.plugin.wallet_core.utils.j0 r10 = new com.tencent.mm.plugin.wallet_core.utils.j0
                    r10.<init>(r6)
                    r8.setOnClickListener(r10)
                L_0x007f:
                    r8 = 2131316892(0x7f09509c, float:1.8252278E38)
                    android.view.View r8 = r7.findViewById(r8)
                    android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
                    java.util.LinkedList<te3.vr4> r10 = r2.f138898f
                    if (r10 == 0) goto L_0x029a
                    boolean r10 = r10.isEmpty()
                    if (r10 != 0) goto L_0x029a
                    java.util.LinkedList<te3.vr4> r2 = r2.f138898f
                    java.util.Iterator r2 = r2.iterator()
                L_0x0098:
                    boolean r10 = r2.hasNext()
                    if (r10 == 0) goto L_0x029a
                    java.lang.Object r10 = r2.next()
                    te3.vr4 r10 = (te3.vr4) r10
                    android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
                    r12 = -2
                    r11.<init>(r12, r12)
                    int r13 = r10.f143642d
                    if (r13 != r5) goto L_0x00c8
                    android.widget.TextView r12 = new android.widget.TextView
                    android.content.Context r13 = r8.getContext()
                    r12.<init>(r13)
                    te3.zf4 r13 = r10.f143643e
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46937h(r12, r13, r4)
                    te3.as4 r10 = r10.f143638C
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46938i(r12, r11, r10)
                    r8.addView(r12, r11)
                L_0x00c4:
                    r19 = r2
                    goto L_0x0294
                L_0x00c8:
                    r14 = 11
                    if (r13 != r14) goto L_0x00fe
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView r12 = new com.tencent.mm.pluginsdk.ui.applet.CdnImageView
                    android.content.Context r13 = r8.getContext()
                    r12.<init>(r13, r4)
                    android.content.Context r13 = r8.getContext()
                    r14 = 64
                    int r13 = kg3.C76577a.m92151b(r13, r14)
                    te3.xh2 r14 = r10.f143653r
                    r17 = -1
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r15 = r12
                    r16 = r14
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46934e(r15, r16, r17, r18, r19, r20)
                    r12.setMinimumWidth(r13)
                    r12.setMinimumHeight(r13)
                    te3.as4 r10 = r10.f143638C
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46938i(r12, r11, r10)
                    r8.addView(r12, r11)
                    goto L_0x00c4
                L_0x00fe:
                    r11 = 20
                    if (r13 != r11) goto L_0x00c4
                    te3.bl r11 = r10.f143636A
                    te3.as4 r10 = r10.f143638C
                    if (r11 != 0) goto L_0x0109
                    goto L_0x00c4
                L_0x0109:
                    r8.setGravity(r5)
                    te3.wz r13 = r11.f131179d
                    if (r13 == 0) goto L_0x00c4
                    android.widget.LinearLayout r13 = new android.widget.LinearLayout
                    android.content.Context r14 = r8.getContext()
                    r13.<init>(r14)
                    r14 = 48
                    r13.setGravity(r14)
                    r13.setOrientation(r9)
                    android.content.Context r14 = r8.getContext()
                    te3.wz r15 = r11.f131179d
                    te3.de4 r15 = r15.f144361d
                    if (r15 != 0) goto L_0x012c
                    goto L_0x0166
                L_0x012c:
                    int r12 = r15.f132272e
                    if (r12 != 0) goto L_0x0147
                    com.tencent.mm.ui.widget.MMSwitchBtn r12 = new com.tencent.mm.ui.widget.MMSwitchBtn
                    r12.<init>(r14)
                    int r14 = r15.f132271d
                    if (r14 != 0) goto L_0x013d
                    r12.setCheck(r9)
                    goto L_0x0167
                L_0x013d:
                    if (r14 != r5) goto L_0x0143
                    r12.setCheck(r5)
                    goto L_0x0167
                L_0x0143:
                    r12.setEnabled(r9)
                    goto L_0x0167
                L_0x0147:
                    if (r12 != r5) goto L_0x0166
                    android.widget.CheckBox r12 = new android.widget.CheckBox
                    r12.<init>(r14)
                    r14 = 2131234031(0x7f080cef, float:1.8084216E38)
                    r12.setBackgroundResource(r14)
                    int r14 = r15.f132271d
                    if (r14 != 0) goto L_0x015c
                    r12.setChecked(r9)
                    goto L_0x0167
                L_0x015c:
                    if (r14 != r5) goto L_0x0162
                    r12.setChecked(r5)
                    goto L_0x0167
                L_0x0162:
                    r12.setEnabled(r9)
                    goto L_0x0167
                L_0x0166:
                    r12 = r4
                L_0x0167:
                    android.widget.TextView r14 = new android.widget.TextView
                    android.content.Context r15 = r8.getContext()
                    r14.<init>(r15)
                    te3.wz r15 = r11.f131179d
                    te3.zf4 r15 = r15.f144362e
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46937h(r14, r15, r4)
                    android.content.Context r15 = r8.getContext()
                    te3.al r11 = r11.f131180e
                    if (r11 != 0) goto L_0x0183
                    r19 = r2
                    goto L_0x0224
                L_0x0183:
                    int r4 = r11.f130604f
                    if (r4 != r5) goto L_0x01f0
                    android.widget.Button r4 = new android.widget.Button
                    r4.<init>(r15)
                    r5 = 2131165550(0x7f07016e, float:1.794532E38)
                    int r5 = kg3.C76577a.m92157h(r15, r5)
                    float r5 = (float) r5
                    r4.setTextSize(r9, r5)
                    r5 = 2131100345(0x7f0602b9, float:1.7813069E38)
                    android.content.res.ColorStateList r5 = kg3.C76577a.m92154e(r15, r5)
                    r4.setTextColor(r5)
                    r5 = 2131231392(0x7f0802a0, float:1.8078864E38)
                    r4.setBackgroundResource(r5)
                    r5 = 17
                    r4.setGravity(r5)
                    r5 = 1
                    r4.setAllCaps(r5)
                    r5 = 2131165638(0x7f0701c6, float:1.7945499E38)
                    r19 = r2
                    int r2 = kg3.C76577a.m92157h(r15, r5)
                    int r5 = kg3.C76577a.m92157h(r15, r5)
                    r4.setPadding(r2, r9, r5, r9)
                    r2 = 184(0xb8, float:2.58E-43)
                    int r2 = kg3.C76577a.m92151b(r15, r2)
                    r4.setWidth(r2)
                    r2 = 40
                    int r2 = kg3.C76577a.m92151b(r15, r2)
                    r4.setHeight(r2)
                    int r2 = r11.f130602d
                    r5 = 1
                    if (r2 != r5) goto L_0x01db
                    r4.setEnabled(r5)
                    goto L_0x01de
                L_0x01db:
                    r4.setEnabled(r9)
                L_0x01de:
                    java.lang.String r2 = r11.f130606h
                    r4.setText(r2)
                    int r2 = r11.f130608j
                    if (r2 != r5) goto L_0x0225
                    com.tencent.mm.plugin.wallet_core.utils.c0 r2 = new com.tencent.mm.plugin.wallet_core.utils.c0
                    r2.<init>(r15, r11, r3)
                    r4.setOnClickListener(r2)
                    goto L_0x0225
                L_0x01f0:
                    r19 = r2
                    if (r4 != 0) goto L_0x0224
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = new com.tencent.mm.pluginsdk.ui.applet.CdnImageView
                    r2 = 0
                    r4.<init>(r15, r2)
                    te3.xh2 r5 = r11.f130605g
                    r22 = -1
                    r23 = 0
                    r24 = 0
                    r25 = 1
                    r20 = r4
                    r21 = r5
                    com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46934e(r20, r21, r22, r23, r24, r25)
                    int r5 = r11.f130602d
                    r2 = 1
                    if (r5 != r2) goto L_0x0214
                    r4.setEnabled(r2)
                    goto L_0x0217
                L_0x0214:
                    r4.setEnabled(r9)
                L_0x0217:
                    int r5 = r11.f130608j
                    if (r5 != r2) goto L_0x0225
                    com.tencent.mm.plugin.wallet_core.utils.d0 r2 = new com.tencent.mm.plugin.wallet_core.utils.d0
                    r2.<init>(r15, r11, r3)
                    r4.setOnClickListener(r2)
                    goto L_0x0225
                L_0x0224:
                    r4 = 0
                L_0x0225:
                    android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
                    r5 = -2
                    r2.<init>(r5, r5)
                    if (r10 == 0) goto L_0x0240
                    te3.su2 r5 = r10.f130755e
                    if (r5 == 0) goto L_0x0240
                    android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    te3.su2 r11 = r10.f130755e
                    float r11 = r11.f141760d
                    int r11 = (int) r11
                    int r5 = kg3.C76577a.m92151b(r5, r11)
                    r2.topMargin = r5
                L_0x0240:
                    android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    r11 = 32
                    int r5 = kg3.C76577a.m92151b(r5, r11)
                    r2.bottomMargin = r5
                    r8.addView(r13, r2)
                    if (r12 == 0) goto L_0x0271
                    r13.addView(r12)
                    boolean r2 = r12 instanceof com.tencent.p014mm.p136ui.widget.MMSwitchBtn
                    if (r2 == 0) goto L_0x0263
                    com.tencent.mm.ui.widget.MMSwitchBtn r12 = (com.tencent.p014mm.p136ui.widget.MMSwitchBtn) r12
                    com.tencent.mm.plugin.wallet_core.utils.a0 r2 = new com.tencent.mm.plugin.wallet_core.utils.a0
                    r2.<init>(r4)
                    r12.setSwitchListener(r2)
                    goto L_0x0271
                L_0x0263:
                    boolean r2 = r12 instanceof android.widget.CheckBox
                    if (r2 == 0) goto L_0x0271
                    android.widget.CheckBox r12 = (android.widget.CheckBox) r12
                    com.tencent.mm.plugin.wallet_core.utils.b0 r2 = new com.tencent.mm.plugin.wallet_core.utils.b0
                    r2.<init>(r4)
                    r12.setOnCheckedChangeListener(r2)
                L_0x0271:
                    r13.addView(r14)
                    if (r4 == 0) goto L_0x0294
                    android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
                    r5 = -2
                    r2.<init>(r5, r5)
                    if (r10 == 0) goto L_0x0291
                    te3.su2 r5 = r10.f130755e
                    if (r5 == 0) goto L_0x0291
                    android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    te3.su2 r10 = r10.f130755e
                    float r10 = r10.f141761e
                    int r10 = (int) r10
                    int r5 = kg3.C76577a.m92151b(r5, r10)
                    r2.bottomMargin = r5
                L_0x0291:
                    r8.addView(r4, r2)
                L_0x0294:
                    r2 = r19
                    r4 = 0
                    r5 = 1
                    goto L_0x0098
                L_0x029a:
                    r6.setContentView(r7)
                    r2 = 1
                    r6.setCancelable(r2)
                    r6.setCanceledOnTouchOutside(r9)
                    r4 = r6
                L_0x02a5:
                    r1.f115148i = r4
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.this
                    com.tencent.mm.plugin.mall.ui.MallWalletUI r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.this
                    android.app.Dialog r2 = r1.f115148i
                    r1.addDialog(r2)
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.this
                    com.tencent.mm.plugin.mall.ui.MallWalletUI r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.this
                    android.app.Dialog r1 = r1.f115148i
                    r1.show()
                    com.tencent.mm.plugin.mall.ui.MallWalletUI$a r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.this
                    com.tencent.mm.plugin.mall.ui.MallWalletUI r1 = com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.this
                    r2 = 1
                    r1.f115151o = r2
                L_0x02c0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI.C42549a.C42550a.run():void");
            }
        }

        public C42549a() {
        }

        /* renamed from: a */
        public void mo66646a(C51264sl3 sl32) {
            Log.m105925i("MicroMsg.MallWalletUI", "net callback: %s", sl32);
            Dialog dialog = MallWalletUI.this.f115149j;
            if (dialog != null) {
                dialog.dismiss();
                MallWalletUI.this.f115149j = null;
            }
            if (sl32 != null) {
                ue4 ue4 = sl32.f141593d;
                if (ue4 != null) {
                    MallWalletUI mallWalletUI = MallWalletUI.this;
                    mallWalletUI.f115147h = ue4;
                    mallWalletUI.mo66645I7(false);
                }
                C50456mv3 mv32 = sl32.f141594e;
                if (mv32 != null && mv32.f138230d == 13) {
                    MallWalletUI.this.runOnUiThread(new C42550a(sl32));
                }
            }
        }

        /* renamed from: b */
        public void mo66647b(C51264sl3 sl32) {
            Log.m105924i("MicroMsg.MallWalletUI", "cache callback");
            if (sl32 != null) {
                Dialog dialog = MallWalletUI.this.f115149j;
                if (dialog != null) {
                    dialog.dismiss();
                    MallWalletUI.this.f115149j = null;
                }
                MallWalletUI mallWalletUI = MallWalletUI.this;
                mallWalletUI.f115147h = sl32.f141593d;
                mallWalletUI.mo66645I7(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI$b */
    public class C42552b implements C86300q {
        public C42552b(MallWalletUI mallWalletUI) {
        }

        /* renamed from: a */
        public void mo63853a() {
            Log.m105924i("MicroMsg.MallWalletUI", "onAppBrandProcessDied");
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: b */
        public void mo63854b(String str) {
            Log.m105924i("MicroMsg.MallWalletUI", "onTriggerHalfScreenShare");
        }

        /* renamed from: c */
        public void mo63855c() {
            Log.m105924i("MicroMsg.MallWalletUI", "onAppBrandUIEnter");
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
            Log.m105924i("MicroMsg.MallWalletUI", "onAppBrandPreconditionError");
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
            Log.m105925i("MicroMsg.MallWalletUI", "onAppBrandUIExit：%s", Boolean.valueOf(z));
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI$c */
    public class C42553c implements C43423i0.C43429f {
        public C42553c() {
        }

        /* renamed from: a */
        public void mo66650a(Bundle bundle) {
            int i = bundle.getInt("callbackEventType");
            if (i == 1) {
                Log.m105924i("MicroMsg.MallWalletUI", "refresh wallet data from pay settings");
                MallWalletUI mallWalletUI = MallWalletUI.this;
                int i2 = MallWalletUI.f115142q;
                mallWalletUI.mo66644H7(false, true);
            } else if (i == 2) {
                Log.m105924i("MicroMsg.MallWalletUI", "refresh wallet data from realname end");
                MallWalletUI mallWalletUI2 = MallWalletUI.this;
                int i3 = MallWalletUI.f115142q;
                mallWalletUI2.mo66644H7(false, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletUI$d */
    public static class C42554d extends MMBaseAccessibilityConfig {
        public C42554d(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.h9h);
            root.disable(C0966R.C0970id.h9h);
            root.disable(C0966R.C0970id.h9g);
            root.disable(C0966R.C0970id.h9f);
            root.disable(C0966R.C0970id.h9e);
        }

        public void onResume() {
            super.onResume();
        }
    }

    /* renamed from: H7 */
    public final void mo66644H7(boolean z, boolean z2) {
        Log.m105924i("MicroMsg.MallWalletUI", "do query wechat wallet");
        if (z2) {
            this.f115149j = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
        }
        C48235m.m53574a(this.f115150n, true, z, 0);
    }

    /* renamed from: I7 */
    public final void mo66645I7(boolean z) {
        zf4 zf4;
        ue4 ue4 = this.f115147h;
        if (ue4 != null) {
            C52206z23 z232 = ue4.f142817d;
            int i = 0;
            if (z232 != null) {
                setMMTitle(C43423i0.m46933d(this, z232.f145657d, (C43423i0.C43428e) null));
                C48661a33 a332 = z232.f145659f;
                C42556b0 b0Var = new C42556b0(this);
                if (!(a332 == null || a332.f130279f != 2 || (zf4 = a332.f130278e) == null)) {
                    addTextOptionMenu(0, C43423i0.m46933d(this, zf4, (C43423i0.C43428e) null).toString(), new C43420e0(a332, b0Var, this));
                }
            }
            Log.m105925i("MicroMsg.MallWalletUI", "section size: %s", this.f115147h.f142818e);
            int childCount = this.f115145f.getChildCount();
            int size = this.f115147h.f142818e.size();
            C42552b bVar = new C42552b(this);
            C42553c cVar = new C42553c();
            for (int i2 = 0; i2 < size; i2++) {
                C49009cj2 cj22 = this.f115147h.f142818e.get(i2);
                if (i2 < childCount) {
                    Log.m105918d("MicroMsg.MallWalletUI", "update layout");
                    ((MallWalletSectionView) this.f115145f.getChildAt(i2)).mo66643a(cj22, z, bVar, cVar);
                } else {
                    Log.m105918d("MicroMsg.MallWalletUI", "insert layout");
                    MallWalletSectionView mallWalletSectionView = new MallWalletSectionView(getContext());
                    mallWalletSectionView.mo66643a(cj22, z, bVar, cVar);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = f115142q;
                    mallWalletSectionView.setLayoutParams(layoutParams);
                    this.f115145f.addView(mallWalletSectionView, layoutParams);
                }
            }
            if (childCount > size) {
                Log.m105918d("MicroMsg.MallWalletUI", "remove layout");
                this.f115145f.removeViews(size, childCount - size);
            }
            LinkedList<zf4> linkedList = this.f115147h.f142819f;
            if (linkedList != null && !linkedList.isEmpty()) {
                this.f115146g.removeAllViews();
                linkedList.size();
                for (zf4 h : linkedList) {
                    TextView textView = new TextView(this);
                    C43423i0.m46937h(textView, h, new C42557c0(this));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    if (i != 0) {
                        layoutParams2.topMargin = C76577a.m92151b(this, 8);
                    }
                    this.f115146g.addView(textView, layoutParams2);
                    i++;
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359875bb0;
    }

    public void initView() {
        this.f115145f = (LinearLayout) findViewById(C0966R.C0970id.h9f);
        this.f115146g = (LinearLayout) findViewById(C0966R.C0970id.h9e);
        this.f115143d = (TextView) findViewById(C0966R.C0970id.a7l);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f115144e = wcPayBannerView;
        wcPayBannerView.mo105020a();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.MallWalletUI", "requestCode: %s, resultCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 65281 && i != 65286) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f3284m6));
        hideActionbarLine();
        setMMTitle("");
        initView();
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().add(this);
        this.f115150n = new C42549a();
        mo66644H7(true, true);
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        WalletGetBulletinEvent.C28847a aVar = walletGetBulletinEvent.f79042d;
        aVar.f79044a = "1";
        aVar.f79045b = new C69784d0(this, walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
        this.f115152p.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f115152p.dead();
        Log.m105919d("MicroMsg.QueryWeChatWalletManager", "remove ret: %s", Boolean.valueOf(((ArrayList) C48235m.f129231b).remove(this.f115150n)));
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().remove(this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (mStorageEx == ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI() && i == 4) {
            Log.m105925i("MicroMsg.MallWalletUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG") || obj.equals("USERINFO_NEW_LQT_LONG")) {
                mo66645I7(false);
            }
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        mo66644H7(false, false);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C42554d.class);
    }
}
