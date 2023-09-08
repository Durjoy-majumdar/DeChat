package com.tencent.p014mm.plugin.pwdgroup.p089ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.ArrayList;
import wf2.C22911a;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView */
public class MMKeyBoardView extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: A */
    public int f53266A;

    /* renamed from: B */
    public int f53267B;

    /* renamed from: C */
    public float f53268C;

    /* renamed from: D */
    public ColorStateList f53269D;

    /* renamed from: E */
    public int f53270E;

    /* renamed from: F */
    public int f53271F;

    /* renamed from: G */
    public int f53272G;

    /* renamed from: H */
    public int f53273H;

    /* renamed from: I */
    public int f53274I;

    /* renamed from: J */
    public int f53275J;

    /* renamed from: K */
    public int f53276K;

    /* renamed from: d */
    public Button f53277d;

    /* renamed from: e */
    public Button f53278e;

    /* renamed from: f */
    public Button f53279f;

    /* renamed from: g */
    public Button f53280g;

    /* renamed from: h */
    public Button f53281h;

    /* renamed from: i */
    public Button f53282i;

    /* renamed from: j */
    public Button f53283j;

    /* renamed from: n */
    public Button f53284n;

    /* renamed from: o */
    public Button f53285o;

    /* renamed from: p */
    public Button f53286p;

    /* renamed from: q */
    public ImageButton f53287q;

    /* renamed from: r */
    public View f53288r;

    /* renamed from: s */
    public View f53289s;

    /* renamed from: t */
    public View f53290t;

    /* renamed from: u */
    public View f53291u;

    /* renamed from: v */
    public View f53292v;

    /* renamed from: w */
    public View f53293w;

    /* renamed from: x */
    public C18974a f53294x;

    /* renamed from: y */
    public Context f53295y;

    /* renamed from: z */
    public boolean f53296z;

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView$a */
    public interface C18974a {
    }

    public MMKeyBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = (com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.C18966k) r0;
        r1 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.this;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24151a(java.lang.String r4) {
        /*
            r3 = this;
            com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView$a r0 = r3.f53294x
            if (r0 == 0) goto L_0x004b
            boolean r1 = r3.f53296z
            if (r1 == 0) goto L_0x004b
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$k r0 = (com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.C18966k) r0
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI r1 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.this
            com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView r2 = r1.f53225n
            if (r2 == 0) goto L_0x004b
            boolean r1 = r1.f53219e
            if (r1 != 0) goto L_0x002b
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x004b
            boolean r0 = r2.f53298e
            if (r0 == 0) goto L_0x001f
            goto L_0x004b
        L_0x001f:
            java.lang.StringBuilder r0 = r2.f53297d
            r0.append(r4)
            r2.mo24159a()
            r2.mo24161c()
            goto L_0x004b
        L_0x002b:
            r2.mo24160b()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0044
            boolean r1 = r2.f53298e
            if (r1 == 0) goto L_0x0039
            goto L_0x0044
        L_0x0039:
            java.lang.StringBuilder r1 = r2.f53297d
            r1.append(r4)
            r2.mo24159a()
            r2.mo24161c()
        L_0x0044:
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI r4 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.this
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$o r0 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.C18971o.Normal
            r4.mo24135M7(r0)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.pwdgroup.p089ui.widget.MMKeyBoardView.mo24151a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        r8 = (com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.C18966k) r8;
        r0 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.this;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            boolean r0 = r7.f53296z
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView"
            if (r0 != 0) goto L_0x0035
            java.lang.String r8 = "MicroMsg.Facing.MMKeyBoardView"
            java.lang.String r0 = "onClick KeyBoard is disable."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r0)
            j20.C117292a.m165361g(r7, r4, r3, r2, r1)
            return
        L_0x0035:
            android.widget.Button r5 = r7.f53277d
            if (r8 != r5) goto L_0x0040
            java.lang.String r8 = "0"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x0040:
            android.widget.Button r5 = r7.f53278e
            if (r8 != r5) goto L_0x004b
            java.lang.String r8 = "1"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x004b:
            android.widget.Button r5 = r7.f53279f
            if (r8 != r5) goto L_0x0056
            java.lang.String r8 = "2"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x0056:
            android.widget.Button r5 = r7.f53280g
            if (r8 != r5) goto L_0x0061
            java.lang.String r8 = "3"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x0061:
            android.widget.Button r5 = r7.f53281h
            if (r8 != r5) goto L_0x006b
            java.lang.String r8 = "4"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x006b:
            android.widget.Button r5 = r7.f53282i
            if (r8 != r5) goto L_0x0075
            java.lang.String r8 = "5"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x0075:
            android.widget.Button r5 = r7.f53283j
            if (r8 != r5) goto L_0x007f
            java.lang.String r8 = "6"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x007f:
            android.widget.Button r5 = r7.f53284n
            if (r8 != r5) goto L_0x0089
            java.lang.String r8 = "7"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x0089:
            android.widget.Button r5 = r7.f53285o
            if (r8 != r5) goto L_0x0093
            java.lang.String r8 = "8"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x0093:
            android.widget.Button r5 = r7.f53286p
            if (r8 != r5) goto L_0x009d
            java.lang.String r8 = "9"
            r7.mo24151a(r8)
            goto L_0x00cf
        L_0x009d:
            android.widget.ImageButton r5 = r7.f53287q
            if (r8 != r5) goto L_0x00cf
            com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView$a r8 = r7.f53294x
            if (r8 == 0) goto L_0x00cf
            if (r0 == 0) goto L_0x00cf
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$k r8 = (com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.C18966k) r8
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI r0 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.this
            com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView r5 = r0.f53225n
            if (r5 == 0) goto L_0x00cf
            boolean r0 = r0.f53219e
            if (r0 != 0) goto L_0x00c5
            int r8 = r5.f53299f
            if (r8 <= 0) goto L_0x00be
            java.lang.StringBuilder r0 = r5.f53297d
            int r8 = r8 + -1
            r0.deleteCharAt(r8)
        L_0x00be:
            r5.mo24159a()
            r5.mo24161c()
            goto L_0x00cf
        L_0x00c5:
            r5.mo24160b()
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI r8 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.this
            com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$o r0 = com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI.C18971o.Normal
            r8.mo24135M7(r0)
        L_0x00cf:
            j20.C117292a.m165361g(r7, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.pwdgroup.p089ui.widget.MMKeyBoardView.onClick(android.view.View):void");
    }

    public void onDraw(Canvas canvas) {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f53271F = getWidth();
        this.f53272G = getHeight();
        int i5 = this.f53267B;
        int i6 = -i5;
        int i7 = this.f53275J;
        int i8 = (i7 - i5) + 1;
        int i9 = ((i7 * 2) - i5) + 2;
        int i15 = this.f53276K;
        int i16 = i15 + 2;
        int i17 = (i15 * 2) + 3;
        int i18 = (i15 * 3) + 4;
        this.f53278e.layout(i6, 1, this.f53273H + i6, this.f53274I + 1);
        this.f53279f.layout(i8, 1, this.f53273H + i8, this.f53274I + 1);
        this.f53280g.layout(i9, 1, this.f53273H + i9, this.f53274I + 1);
        this.f53281h.layout(i6, i16, this.f53273H + i6, this.f53274I + i16);
        this.f53282i.layout(i8, i16, this.f53273H + i8, this.f53274I + i16);
        this.f53283j.layout(i9, i16, this.f53273H + i9, this.f53274I + i16);
        this.f53284n.layout(i6, i17, this.f53273H + i6, this.f53274I + i17);
        this.f53285o.layout(i8, i17, this.f53273H + i8, this.f53274I + i17);
        this.f53286p.layout(i9, i17, this.f53273H + i9, this.f53274I + i17);
        this.f53277d.layout(i8, i18, this.f53273H + i8, this.f53274I + i18);
        this.f53287q.layout(i9, i18, this.f53273H + i9, this.f53274I + i18);
        View view = this.f53288r;
        int i19 = this.f53266A;
        view.layout(0, i19 + 1, this.f53271F, i19 + 1 + 1);
        View view2 = this.f53289s;
        int i25 = this.f53266A;
        view2.layout(0, i16 + i25, this.f53271F, i16 + i25 + 1);
        View view3 = this.f53290t;
        int i26 = this.f53266A;
        view3.layout(0, i17 + i26, this.f53271F, i17 + i26 + 1);
        View view4 = this.f53291u;
        int i27 = this.f53266A;
        view4.layout(0, i18 + i27, this.f53271F, i18 + i27 + 1);
        View view5 = this.f53292v;
        int i28 = this.f53275J;
        view5.layout(i28 + 1, this.f53266A, i28 + 2, this.f53272G);
        View view6 = this.f53293w;
        int i29 = this.f53275J;
        view6.layout((i29 * 2) + 2, this.f53266A, (i29 * 2) + 3, this.f53272G);
    }

    public boolean onLongClick(View view) {
        C18974a aVar;
        MMPwdInputView mMPwdInputView;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == this.f53287q && (aVar = this.f53294x) != null && this.f53296z && (mMPwdInputView = FacingCreateChatRoomAllInOneUI.this.f53225n) != null) {
            mMPwdInputView.mo24160b();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f53271F = getWidth();
        int height = getHeight();
        this.f53272G = height;
        int i3 = this.f53271F;
        if (!(i3 == 0 || height == 0)) {
            int i4 = (i3 - 2) / 3;
            this.f53275J = i4;
            int i5 = this.f53266A;
            int i6 = ((height - i5) - 4) / 4;
            this.f53276K = i6;
            this.f53273H = i4 + (this.f53267B * 2);
            this.f53274I = i6 + (i5 * 2);
        }
        this.f53278e.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53279f.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53280g.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53281h.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53282i.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53283j.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53284n.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53285o.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53286p.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53277d.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53287q.measure(View.MeasureSpec.makeMeasureSpec(this.f53273H, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53274I, 1073741824));
        this.f53288r.measure(View.MeasureSpec.makeMeasureSpec(this.f53271F, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f53289s.measure(View.MeasureSpec.makeMeasureSpec(this.f53271F, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f53290t.measure(View.MeasureSpec.makeMeasureSpec(this.f53271F, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f53291u.measure(View.MeasureSpec.makeMeasureSpec(this.f53271F, 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f53292v.measure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53272G, 1073741824));
        this.f53293w.measure(View.MeasureSpec.makeMeasureSpec(1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f53272G, 1073741824));
    }

    public void setKeyBoardEnable(boolean z) {
        this.f53296z = z;
        this.f53277d.setEnabled(z);
        this.f53278e.setEnabled(z);
        this.f53279f.setEnabled(z);
        this.f53280g.setEnabled(z);
        this.f53281h.setEnabled(z);
        this.f53282i.setEnabled(z);
        this.f53283j.setEnabled(z);
        this.f53284n.setEnabled(z);
        this.f53285o.setEnabled(z);
        this.f53286p.setEnabled(z);
        this.f53287q.setEnabled(z);
    }

    public void setOnInputDeleteListener(C18974a aVar) {
        this.f53294x = aVar;
    }

    public MMKeyBoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f53296z = true;
        this.f53295y = context;
        this.f53266A = getResources().getDimensionPixelSize(C0966R.dimen.ack);
        this.f53267B = getResources().getDimensionPixelSize(C0966R.dimen.acl);
        this.f53268C = (float) getResources().getDimensionPixelSize(C0966R.dimen.acm);
        this.f53269D = getResources().getColorStateList(C0966R.color.a0t);
        this.f53270E = getResources().getColor(C0966R.color.a0s);
        this.f53277d = new Button(this.f53295y);
        this.f53278e = new Button(this.f53295y);
        this.f53279f = new Button(this.f53295y);
        this.f53280g = new Button(this.f53295y);
        this.f53281h = new Button(this.f53295y);
        this.f53282i = new Button(this.f53295y);
        this.f53283j = new Button(this.f53295y);
        this.f53284n = new Button(this.f53295y);
        this.f53285o = new Button(this.f53295y);
        this.f53286p = new Button(this.f53295y);
        this.f53287q = new ImageButton(this.f53295y);
        this.f53288r = new View(this.f53295y);
        this.f53288r = new View(this.f53295y);
        this.f53289s = new View(this.f53295y);
        this.f53290t = new View(this.f53295y);
        this.f53291u = new View(this.f53295y);
        this.f53292v = new View(this.f53295y);
        this.f53293w = new View(this.f53295y);
        this.f53277d.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53278e.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53279f.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53280g.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53281h.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53282i.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53283j.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53284n.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53285o.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53282i.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53286p.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53287q.setBackgroundResource(C0966R.C0969drawable.aaf);
        this.f53287q.setImageResource(C0966R.C0969drawable.aag);
        this.f53287q.setContentDescription("删除");
        this.f53277d.setText("0");
        this.f53278e.setText("1");
        this.f53279f.setText("2");
        this.f53280g.setText("3");
        this.f53281h.setText(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        this.f53282i.setText(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
        this.f53283j.setText(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
        this.f53284n.setText("7");
        this.f53285o.setText("8");
        this.f53286p.setText("9");
        this.f53277d.setGravity(17);
        this.f53278e.setGravity(17);
        this.f53279f.setGravity(17);
        this.f53280g.setGravity(17);
        this.f53281h.setGravity(17);
        this.f53282i.setGravity(17);
        this.f53283j.setGravity(17);
        this.f53284n.setGravity(17);
        this.f53285o.setGravity(17);
        this.f53286p.setGravity(17);
        this.f53277d.setTextSize(0, this.f53268C);
        this.f53278e.setTextSize(0, this.f53268C);
        this.f53279f.setTextSize(0, this.f53268C);
        this.f53280g.setTextSize(0, this.f53268C);
        this.f53281h.setTextSize(0, this.f53268C);
        this.f53282i.setTextSize(0, this.f53268C);
        this.f53283j.setTextSize(0, this.f53268C);
        this.f53284n.setTextSize(0, this.f53268C);
        this.f53285o.setTextSize(0, this.f53268C);
        this.f53286p.setTextSize(0, this.f53268C);
        this.f53277d.setTextColor(this.f53269D);
        this.f53278e.setTextColor(this.f53269D);
        this.f53279f.setTextColor(this.f53269D);
        this.f53280g.setTextColor(this.f53269D);
        this.f53281h.setTextColor(this.f53269D);
        this.f53282i.setTextColor(this.f53269D);
        this.f53283j.setTextColor(this.f53269D);
        this.f53284n.setTextColor(this.f53269D);
        this.f53285o.setTextColor(this.f53269D);
        this.f53286p.setTextColor(this.f53269D);
        this.f53277d.setOnClickListener(this);
        this.f53278e.setOnClickListener(this);
        this.f53279f.setOnClickListener(this);
        this.f53280g.setOnClickListener(this);
        this.f53281h.setOnClickListener(this);
        this.f53282i.setOnClickListener(this);
        this.f53283j.setOnClickListener(this);
        this.f53284n.setOnClickListener(this);
        this.f53285o.setOnClickListener(this);
        this.f53286p.setOnClickListener(this);
        this.f53287q.setOnClickListener(this);
        this.f53287q.setOnLongClickListener(this);
        this.f53288r.setBackgroundColor(this.f53270E);
        this.f53288r.setBackgroundColor(this.f53270E);
        this.f53289s.setBackgroundColor(this.f53270E);
        this.f53290t.setBackgroundColor(this.f53270E);
        this.f53291u.setBackgroundColor(this.f53270E);
        this.f53292v.setBackgroundColor(this.f53270E);
        this.f53293w.setBackgroundColor(this.f53270E);
        addView(this.f53277d);
        addView(this.f53278e);
        addView(this.f53279f);
        addView(this.f53280g);
        addView(this.f53281h);
        addView(this.f53282i);
        addView(this.f53283j);
        addView(this.f53284n);
        addView(this.f53285o);
        addView(this.f53286p);
        addView(this.f53287q);
        addView(this.f53288r);
        addView(this.f53289s);
        addView(this.f53290t);
        addView(this.f53291u);
        addView(this.f53292v);
        addView(this.f53293w);
        post(new C22911a(this));
    }
}
