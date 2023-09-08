package sj3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import di3.C86312j;
import hc0.C20937c;
import i61.C98602h;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kg3.C76577a;
import p248ug.C52556a;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48329b;
import sb0.C48340e;
import z51.C39315g;

/* renamed from: sj3.b */
public class C48395b extends C6975i1<C48327a> implements C48329b.C48332c {

    /* renamed from: A */
    public boolean f129541A = false;

    /* renamed from: B */
    public boolean f129542B = false;

    /* renamed from: C */
    public long f129543C = 0;

    /* renamed from: o */
    public final MMFragmentActivity f129544o;

    /* renamed from: p */
    public final String f129545p;

    /* renamed from: q */
    public MMSlideDelView.C73186f f129546q = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: r */
    public float f129547r = -1.0f;

    /* renamed from: s */
    public final int f129548s;

    /* renamed from: t */
    public HashMap<C48327a.C48328a, Integer> f129549t = new LinkedHashMap();

    /* renamed from: u */
    public float f129550u = -1.0f;

    /* renamed from: v */
    public float f129551v = -1.0f;

    /* renamed from: w */
    public ColorStateList[] f129552w = new ColorStateList[5];

    /* renamed from: x */
    public C20937c f129553x = null;

    /* renamed from: y */
    public C20937c f129554y = null;

    /* renamed from: z */
    public HashMap<String, C48397b> f129555z;

    /* renamed from: sj3.b$b */
    public class C48397b {

        /* renamed from: a */
        public String f129556a = null;

        /* renamed from: b */
        public String f129557b = null;

        /* renamed from: c */
        public int f129558c = 0;

        /* renamed from: d */
        public boolean f129559d;

        /* renamed from: e */
        public boolean f129560e;

        /* renamed from: f */
        public C48327a f129561f;

        public C48397b(C48395b bVar, C48396a aVar) {
        }
    }

    /* renamed from: sj3.b$c */
    public static class C48398c {

        /* renamed from: a */
        public ImageView f129562a;

        /* renamed from: b */
        public NoMeasuredTextView f129563b;

        /* renamed from: c */
        public NoMeasuredTextView f129564c;

        /* renamed from: d */
        public NoMeasuredTextView f129565d;

        /* renamed from: e */
        public TextView f129566e;

        /* renamed from: f */
        public ImageView f129567f;

        /* renamed from: g */
        public ImageView f129568g;

        /* renamed from: h */
        public View f129569h;
    }

    public C48395b(Context context, C6975i1.C6977b bVar, String str) {
        super(context, new C48327a());
        this.f24699h = bVar;
        MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) context;
        this.f129544o = mMFragmentActivity;
        this.f129545p = str;
        this.f129555z = new HashMap<>();
        this.f129552w[0] = C76577a.m92154e(context, C0966R.color.f3563xt);
        this.f129552w[1] = C76577a.m92154e(context, C0966R.color.a4w);
        this.f129552w[3] = C76577a.m92154e(context, C0966R.color.a7f);
        this.f129552w[2] = C76577a.m92154e(context, C0966R.color.a4t);
        this.f129552w[2] = C76577a.m92154e(context, C0966R.color.a4t);
        this.f129552w[4] = C76577a.m92154e(context, C0966R.color.a1_);
        this.f129549t.put(C48327a.C48328a.ALL, Integer.valueOf(C0966R.C0969drawable.bph));
        this.f129549t.put(C48327a.C48328a.DEPARTMENT, Integer.valueOf(C0966R.C0969drawable.bpi));
        this.f129549t.put(C48327a.C48328a.EXTERNAL, Integer.valueOf(C0966R.C0969drawable.bpj));
        this.f129548s = C76577a.m92151b(context, 8);
        this.f129547r = (float) C76577a.m92157h(context, C0966R.dimen.f3927j7);
        this.f129550u = (float) C76577a.m92157h(context, C0966R.dimen.f3881hq);
        this.f129551v = (float) C76577a.m92157h(context, C0966R.dimen.f3964lm);
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        String str2 = C48340e.f129426a;
        bVar2.f59351g = C52556a.m58840a(str);
        bVar2.f59346b = true;
        bVar2.f59363s = true;
        bVar2.f59359o = C0966R.raw.default_avatar;
        bVar2.f59364t = true;
        bVar2.f59365u = ((float) C76577a.m92155f(mMFragmentActivity, C0966R.dimen.f3919iy)) * 0.1f;
        this.f129553x = bVar2.mo32666a();
        bVar2.f59365u = ((float) C76577a.m92155f(mMFragmentActivity, C0966R.dimen.f3626j)) * 0.1f;
        this.f129554y = bVar2.mo32666a();
    }

    /* renamed from: a */
    public void mo69969a(C48329b.C48332c.C48333a aVar) {
        if (this.f129541A) {
            mo7991f();
        } else {
            this.f129542B = true;
        }
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C48327a aVar = (C48327a) obj;
        if (aVar == null) {
            aVar = new C48327a();
            this.f129543C = aVar.field_bizChatId;
        }
        aVar.field_bizChatId = this.f129543C;
        aVar.convertFrom(cursor);
        return aVar;
    }

    /* renamed from: g */
    public Cursor mo7992g() {
        return super.mo7992g();
    }

    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03e1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            r28 = this;
            r0 = r28
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            java.lang.Object r2 = r28.getItem(r29)
            sb0.a r2 = (sb0.C48327a) r2
            r3 = 0
            if (r30 == 0) goto L_0x0014
            java.lang.Object r4 = r30.getTag()
            sj3.b$c r4 = (sj3.C48395b.C48398c) r4
            goto L_0x0015
        L_0x0014:
            r4 = r3
        L_0x0015:
            r5 = 5
            r6 = 4
            r7 = 1
            r8 = 0
            if (r30 == 0) goto L_0x0022
            if (r4 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            r9 = r30
            goto L_0x0100
        L_0x0022:
            sj3.b$c r4 = new sj3.b$c
            r4.<init>()
            com.tencent.mm.ui.MMFragmentActivity r9 = r0.f129544o
            boolean r9 = kg3.C76577a.m92147C(r9)
            if (r9 == 0) goto L_0x0039
            com.tencent.mm.ui.MMFragmentActivity r9 = r0.f129544o
            r10 = 2131493997(0x7f0c046d, float:1.861149E38)
            android.view.View r9 = android.view.View.inflate(r9, r10, r3)
            goto L_0x0042
        L_0x0039:
            com.tencent.mm.ui.MMFragmentActivity r9 = r0.f129544o
            r10 = 2131493996(0x7f0c046c, float:1.8611488E38)
            android.view.View r9 = android.view.View.inflate(r9, r10, r3)
        L_0x0042:
            r10 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r4.f129562a = r10
            r10 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r10 = r9.findViewById(r10)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r10
            r4.f129563b = r10
            r10 = 2131315971(0x7f094d03, float:1.825041E38)
            android.view.View r10 = r9.findViewById(r10)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r10
            r4.f129564c = r10
            r10 = 2131306982(0x7f0929e6, float:1.8232178E38)
            android.view.View r10 = r9.findViewById(r10)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r10
            r4.f129565d = r10
            r10 = 2131315309(0x7f094a6d, float:1.8249068E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r4.f129566e = r10
            com.tencent.mm.ui.MMFragmentActivity r11 = r0.f129544o
            int r11 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r11)
            r10.setBackgroundResource(r11)
            android.widget.TextView r10 = r4.f129566e
            com.tencent.mm.ui.MMFragmentActivity r11 = r0.f129544o
            r12 = 2131167343(0x7f07086f, float:1.7948957E38)
            int r11 = kg3.C76577a.m92155f(r11, r12)
            float r11 = (float) r11
            com.tencent.mm.ui.MMFragmentActivity r12 = r0.f129544o
            float r12 = kg3.C76577a.m92161l(r12)
            float r11 = r11 * r12
            r10.setTextSize(r8, r11)
            r10 = 2131306321(0x7f092751, float:1.8230838E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r4.f129567f = r10
            r10 = 2131297488(0x7f0904d0, float:1.8212922E38)
            android.view.View r10 = r9.findViewById(r10)
            r4.f129569h = r10
            r10 = 2131314937(0x7f0948f9, float:1.8248313E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r4.f129568g = r10
            r9.setTag(r4)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129565d
            float r11 = r0.f129550u
            r10.mo153549i(r8, r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129564c
            float r11 = r0.f129551v
            r10.mo153549i(r8, r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129563b
            float r11 = r0.f129547r
            r10.mo153549i(r8, r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129565d
            android.content.res.ColorStateList[] r11 = r0.f129552w
            r11 = r11[r8]
            r10.setTextColor((android.content.res.ColorStateList) r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129564c
            android.content.res.ColorStateList[] r11 = r0.f129552w
            r11 = r11[r6]
            r10.setTextColor((android.content.res.ColorStateList) r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129563b
            android.content.res.ColorStateList[] r11 = r0.f129552w
            r12 = 3
            r11 = r11[r12]
            r10.setTextColor((android.content.res.ColorStateList) r11)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129565d
            r10.setShouldEllipsize(r7)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129564c
            r10.setShouldEllipsize(r8)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129563b
            r10.setShouldEllipsize(r7)
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129564c
            r10.setGravity(r5)
        L_0x0100:
            long r10 = r2.field_bizChatId
            java.util.HashMap<java.lang.String, sj3.b$b> r12 = r0.f129555z
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            java.lang.String r14 = ""
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.Object r12 = r12.get(r13)
            sj3.b$b r12 = (sj3.C48395b.C48397b) r12
            if (r12 != 0) goto L_0x0186
            sj3.b$b r12 = new sj3.b$b
            r12.<init>(r0, r3)
            sb0.d r3 = rb0.C48009v0.Ax0()
            sb0.c r3 = r3.mo73042a0(r10)
            boolean r13 = r3.mo73037p2()
            if (r13 == 0) goto L_0x013f
            java.lang.String r13 = r3.field_chatName
            r12.f129556a = r13
            boolean r13 = r3.mo73033l2(r7)
            r12.f129560e = r13
            java.lang.String r13 = r3.field_headImageUrl
            r12.f129557b = r13
            goto L_0x0159
        L_0x013f:
            sb0.k r13 = rb0.C48009v0.Bx0()
            java.lang.String r15 = r3.field_bizChatServId
            sb0.j r13 = r13.get(r15)
            if (r13 == 0) goto L_0x0159
            java.lang.String r15 = r13.field_userName
            r12.f129556a = r15
            boolean r15 = r13.mo73073l2(r7)
            r12.f129560e = r15
            java.lang.String r13 = r13.field_headImageUrl
            r12.f129557b = r13
        L_0x0159:
            java.lang.String r13 = r12.f129556a
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x016c
            com.tencent.mm.ui.MMFragmentActivity r13 = r0.f129544o
            r15 = 2131834964(0x7f113854, float:1.9303053E38)
            java.lang.String r13 = r13.getString(r15)
            r12.f129556a = r13
        L_0x016c:
            int r3 = r3.field_roomflag
            r12.f129558c = r3
            r12.f129561f = r2
            java.util.HashMap<java.lang.String, sj3.b$b> r3 = r0.f129555z
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r14)
            java.lang.String r10 = r13.toString()
            r3.put(r10, r12)
        L_0x0186:
            sb0.b r3 = rb0.C48009v0.Dx0()
            boolean r2 = r3.mo73026bF(r2)
            r12.f129559d = r2
            android.widget.ImageView r2 = r4.f129568g
            r3 = 8
            r2.setVisibility(r3)
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r4.f129564c
            sb0.a r10 = r12.f129561f
            int r11 = r10.field_status
            if (r11 != r7) goto L_0x01a9
            com.tencent.mm.ui.MMFragmentActivity r10 = r0.f129544o
            r11 = 2131832668(0x7f112f5c, float:1.9298396E38)
            java.lang.String r10 = r10.getString(r11)
            goto L_0x01b1
        L_0x01a9:
            com.tencent.mm.ui.MMFragmentActivity r11 = r0.f129544o
            long r5 = r10.field_lastMsgTime
            java.lang.CharSequence r10 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r11, r5, r7)
        L_0x01b1:
            r2.setText((java.lang.CharSequence) r10)
            com.tencent.mm.ui.MMFragmentActivity r2 = r0.f129544o
            boolean r2 = kg3.C76577a.m92147C(r2)
            if (r2 == 0) goto L_0x01ca
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r5 = r12.f129557b
            android.widget.ImageView r6 = r4.f129562a
            hc0.c r10 = r0.f129554y
            r2.mo32519h(r5, r6, r10)
            goto L_0x01d7
        L_0x01ca:
            gc0.a r2 = gc0.C20828a.m22825b()
            java.lang.String r5 = r12.f129557b
            android.widget.ImageView r6 = r4.f129562a
            hc0.c r10 = r0.f129553x
            r2.mo32519h(r5, r6, r10)
        L_0x01d7:
            boolean r2 = r12.f129560e
            if (r2 == 0) goto L_0x01e1
            android.widget.ImageView r2 = r4.f129567f
            r2.setVisibility(r8)
            goto L_0x01e6
        L_0x01e1:
            android.widget.ImageView r2 = r4.f129567f
            r2.setVisibility(r3)
        L_0x01e6:
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r4.f129563b
            di3.d r3 = di3.C86312j.m106911c(r1)
            ny.h r3 = (p629ny.C76979h) r3
            com.tencent.mm.ui.MMFragmentActivity r5 = r0.f129544o
            java.lang.String r6 = r12.f129556a
            com.tencent.mm.ui.base.NoMeasuredTextView r10 = r4.f129563b
            float r10 = r10.getTextSize()
            int r10 = (int) r10
            android.text.SpannableString r3 = r3.op0(r5, r6, r10)
            r2.setText((java.lang.CharSequence) r3)
            sb0.a r2 = r12.f129561f
            com.tencent.mm.ui.base.NoMeasuredTextView r3 = r4.f129565d
            float r3 = r3.getTextSize()
            int r3 = (int) r3
            java.lang.String r5 = r12.f129556a
            java.lang.String r6 = r2.field_editingMsg
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r10 = 33
            r11 = -5569532(0xffffffffffab0404, float:NaN)
            java.lang.String r13 = " "
            java.lang.String r15 = ":"
            if (r6 != 0) goto L_0x025b
            int r6 = r2.field_atCount
            if (r6 > 0) goto L_0x0224
            int r6 = r2.field_atAll
            if (r6 <= 0) goto L_0x0228
        L_0x0224:
            int r6 = r2.field_unReadCount
            if (r6 > 0) goto L_0x025b
        L_0x0228:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            com.tencent.mm.ui.MMFragmentActivity r6 = r0.f129544o
            r7 = 2131832641(0x7f112f41, float:1.9298342E38)
            java.lang.String r6 = r6.getString(r7)
            r5.<init>(r6)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r11)
            int r7 = r5.length()
            r5.setSpan(r6, r8, r7, r10)
            android.text.SpannableStringBuilder r6 = r5.append(r13)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f129544o
            java.lang.String r2 = r2.field_editingMsg
            android.text.SpannableString r1 = r1.op0(r7, r2, r3)
            r6.append(r1)
        L_0x0257:
            r17 = r9
            goto L_0x03b1
        L_0x025b:
            java.lang.String r6 = r2.field_msgType
            if (r6 == 0) goto L_0x031f
            r7 = 47
            java.lang.String r7 = java.lang.String.valueOf(r7)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x027a
            java.lang.String r6 = r2.field_msgType
            r7 = 1048625(0x100031, float:1.469437E-39)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x031f
        L_0x027a:
            java.lang.String r6 = r2.field_digest
            java.lang.String r6 = r0.mo73093s(r6)
            java.lang.String r7 = "]"
            java.lang.String r10 = "["
            if (r6 == 0) goto L_0x0299
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r5 = r1.toString()
            goto L_0x0257
        L_0x0299:
            java.lang.String r6 = r2.field_digest
            java.lang.String r11 = ": "
            if (r6 == 0) goto L_0x02f7
            boolean r6 = r6.contains(r15)
            if (r6 == 0) goto L_0x02f7
            java.lang.String r6 = r2.field_digest
            r17 = r9
            int r9 = r6.indexOf(r15)
            java.lang.String r6 = r6.substring(r8, r9)
            java.lang.String r9 = r2.field_digest
            int r18 = r9.indexOf(r15)
            r16 = 1
            int r8 = r18 + 1
            java.lang.String r8 = r9.substring(r8)
            java.lang.String r8 = r8.replace(r13, r14)
            java.lang.String r8 = r0.mo73093s(r8)
            if (r8 == 0) goto L_0x02fa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r8)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 == 0) goto L_0x02e2
            goto L_0x02f4
        L_0x02e2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r11)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x02f4:
            r5 = r1
            goto L_0x03b1
        L_0x02f7:
            r17 = r9
            r6 = r14
        L_0x02fa:
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f129544o
            r8 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r7 = r7.getString(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 == 0) goto L_0x030a
            goto L_0x031c
        L_0x030a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r11)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L_0x031c:
            r2.field_digest = r7
            goto L_0x0321
        L_0x031f:
            r17 = r9
        L_0x0321:
            java.lang.String r6 = r2.field_digest
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0344
            java.lang.String r6 = r2.field_digestUser
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0341
            java.lang.String r6 = r2.field_digest     // Catch:{ Exception -> 0x033e }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x033e }
            r7 = 0
            r8[r7] = r5     // Catch:{ Exception -> 0x033e }
            java.lang.String r5 = java.lang.String.format(r6, r8)     // Catch:{ Exception -> 0x033e }
            goto L_0x0345
        L_0x033e:
            java.lang.String r5 = r2.field_digest
            goto L_0x0345
        L_0x0341:
            java.lang.String r5 = r2.field_digest
            goto L_0x0345
        L_0x0344:
            r5 = r14
        L_0x0345:
            r6 = 10
            r7 = 32
            java.lang.String r5 = r5.replace(r6, r7)
            int r6 = r2.field_atCount
            if (r6 > 0) goto L_0x0355
            int r6 = r2.field_atAll
            if (r6 <= 0) goto L_0x03a5
        L_0x0355:
            int r6 = r2.field_unReadCount
            if (r6 <= 0) goto L_0x03a5
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            int r7 = r2.field_atCount
            if (r7 <= 0) goto L_0x036e
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f129544o
            r8 = 2131832632(0x7f112f38, float:1.9298323E38)
            java.lang.String r7 = r7.getString(r8)
            r6.append(r7)
        L_0x036e:
            int r2 = r2.field_atAll
            if (r2 <= 0) goto L_0x037e
            com.tencent.mm.ui.MMFragmentActivity r2 = r0.f129544o
            r7 = 2131832631(0x7f112f37, float:1.9298321E38)
            java.lang.String r2 = r2.getString(r7)
            r6.append(r2)
        L_0x037e:
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r7 = -5569532(0xffffffffffab0404, float:NaN)
            r2.<init>(r7)
            int r7 = r6.length()
            r8 = 33
            r9 = 0
            r6.setSpan(r2, r9, r7, r8)
            android.text.SpannableStringBuilder r2 = r6.append(r13)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMFragmentActivity r7 = r0.f129544o
            android.text.SpannableString r1 = r1.op0(r7, r5, r3)
            r2.append(r1)
            r5 = r6
            goto L_0x03b1
        L_0x03a5:
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMFragmentActivity r2 = r0.f129544o
            android.text.SpannableString r5 = r1.op0(r2, r5, r3)
        L_0x03b1:
            sb0.a r1 = r12.f129561f
            int r1 = r1.field_status
            r2 = -1
            r3 = 1
            if (r1 == r3) goto L_0x03c2
            r3 = 5
            if (r1 == r3) goto L_0x03be
            r1 = -1
            goto L_0x03c5
        L_0x03be:
            r1 = 2131756708(0x7f1006a4, float:1.9144331E38)
            goto L_0x03c5
        L_0x03c2:
            r1 = 2131756709(0x7f1006a5, float:1.9144333E38)
        L_0x03c5:
            java.util.HashMap<sb0.a$a, java.lang.Integer> r3 = r0.f129549t
            int r6 = r12.f129558c
            sb0.a$a[] r7 = sb0.C48327a.C48328a.values()
            int r8 = r7.length
            r9 = 0
        L_0x03cf:
            if (r9 >= r8) goto L_0x03e1
            r10 = r7[r9]
            int r11 = r10.f129403d
            r11 = r11 & r6
            if (r11 == 0) goto L_0x03da
            r11 = 1
            goto L_0x03db
        L_0x03da:
            r11 = 0
        L_0x03db:
            if (r11 == 0) goto L_0x03de
            goto L_0x03e3
        L_0x03de:
            int r9 = r9 + 1
            goto L_0x03cf
        L_0x03e1:
            sb0.a$a r10 = sb0.C48327a.C48328a.NORMAL
        L_0x03e3:
            java.lang.Object r3 = r3.get(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0403
            com.tencent.mm.ui.base.NoMeasuredTextView r6 = r4.f129563b
            int r7 = r0.f129548s
            r6.setCompoundDrawablePadding(r7)
            com.tencent.mm.ui.base.NoMeasuredTextView r6 = r4.f129563b
            int r3 = r3.intValue()
            r6.setCompoundRightDrawablesWithIntrinsicBounds((int) r3)
            com.tencent.mm.ui.base.NoMeasuredTextView r3 = r4.f129563b
            r6 = 1
            r3.setDrawRightDrawable(r6)
            r7 = 0
            goto L_0x040a
        L_0x0403:
            r6 = 1
            com.tencent.mm.ui.base.NoMeasuredTextView r3 = r4.f129563b
            r7 = 0
            r3.setDrawRightDrawable(r7)
        L_0x040a:
            if (r1 == r2) goto L_0x0417
            com.tencent.mm.ui.base.NoMeasuredTextView r2 = r4.f129565d
            r2.setCompoundLeftDrawablesWithIntrinsicBounds((int) r1)
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r4.f129565d
            r1.setDrawLeftDrawable(r6)
            goto L_0x041c
        L_0x0417:
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r4.f129565d
            r1.setDrawLeftDrawable(r7)
        L_0x041c:
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r4.f129565d
            r1.setText((java.lang.CharSequence) r5)
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r4.f129565d
            com.tencent.mm.ui.MMFragmentActivity r2 = r0.f129544o
            r3 = 2131101151(0x7f0605df, float:1.7814704E38)
            android.content.res.ColorStateList r2 = kg3.C76577a.m92154e(r2, r3)
            r1.setTextColor((android.content.res.ColorStateList) r2)
            sb0.a r1 = r12.f129561f
            java.lang.String r1 = r1.field_msgType
            if (r1 == 0) goto L_0x0444
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0444
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0444 }
            int r1 = r1.intValue()     // Catch:{ NumberFormatException -> 0x0444 }
            goto L_0x0445
        L_0x0444:
            r1 = 1
        L_0x0445:
            r2 = 34
            if (r1 != r2) goto L_0x04bb
            sb0.a r1 = r12.f129561f
            int r2 = r1.field_isSend
            if (r2 != 0) goto L_0x04bb
            java.lang.String r1 = r1.field_content
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x04bb
            sb0.a r1 = r12.f129561f
            java.lang.String r1 = r1.field_content
            r2 = 0
            java.lang.String r5 = "\n"
            boolean r5 = r1.endsWith(r5)     // Catch:{ Exception -> 0x04a3 }
            if (r5 == 0) goto L_0x0471
            int r5 = r1.length()     // Catch:{ Exception -> 0x04a3 }
            r6 = 1
            int r5 = r5 - r6
            r7 = 0
            java.lang.String r1 = r1.substring(r7, r5)     // Catch:{ Exception -> 0x04a3 }
            goto L_0x0472
        L_0x0471:
            r6 = 1
        L_0x0472:
            java.lang.String[] r1 = r1.split(r15)     // Catch:{ Exception -> 0x04a3 }
            int r5 = r1.length     // Catch:{ Exception -> 0x04a3 }
            r7 = 4
            if (r5 != r7) goto L_0x0485
            r5 = 0
            r7 = r1[r5]     // Catch:{ Exception -> 0x04a3 }
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r7)     // Catch:{ Exception -> 0x04a3 }
            if (r5 == 0) goto L_0x0485
            r7 = 1
            goto L_0x0486
        L_0x0485:
            r7 = 0
        L_0x0486:
            int r5 = r1.length     // Catch:{ Exception -> 0x04a3 }
            if (r5 <= r7) goto L_0x048b
            r5 = r1[r7]     // Catch:{ Exception -> 0x04a3 }
        L_0x048b:
            int r5 = r1.length     // Catch:{ Exception -> 0x04a3 }
            int r6 = r7 + 1
            if (r5 <= r6) goto L_0x0495
            r5 = r1[r6]     // Catch:{ Exception -> 0x04a3 }
            com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r2)     // Catch:{ Exception -> 0x04a3 }
        L_0x0495:
            int r2 = r1.length     // Catch:{ Exception -> 0x04a3 }
            int r7 = r7 + 2
            if (r2 <= r7) goto L_0x04aa
            r1 = r1[r7]     // Catch:{ Exception -> 0x04a3 }
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x04a3 }
            goto L_0x04ab
        L_0x04a3:
            java.lang.String r1 = "MicroMsg.VoiceContent"
            java.lang.String r2 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
        L_0x04aa:
            r1 = 0
        L_0x04ab:
            if (r1 != 0) goto L_0x04bb
            com.tencent.mm.ui.base.NoMeasuredTextView r1 = r4.f129565d
            com.tencent.mm.ui.MMFragmentActivity r2 = r0.f129544o
            r3 = 2131101152(0x7f0605e0, float:1.7814706E38)
            android.content.res.ColorStateList r2 = kg3.C76577a.m92154e(r2, r3)
            r1.setTextColor((android.content.res.ColorStateList) r2)
        L_0x04bb:
            boolean r1 = r12.f129560e
            if (r1 == 0) goto L_0x0556
            sb0.a r1 = r12.f129561f
            int r1 = r1.field_unReadCount
            if (r1 <= 0) goto L_0x0509
            android.view.View r5 = r4.f129569h
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/bizchat/BizChatConversationAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r5
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r6 = "com/tencent/mm/ui/bizchat/BizChatConversationAdapter"
            java.lang.String r7 = "getView"
            java.lang.String r8 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x054e
        L_0x0509:
            android.view.View r1 = r4.f129569h
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r5)
            java.lang.Object[] r21 = r2.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/bizchat/BizChatConversationAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r1
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/ui/bizchat/BizChatConversationAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r18 = r1
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x054e:
            android.widget.TextView r1 = r4.f129566e
            r2 = 4
            r1.setVisibility(r2)
            goto L_0x05fc
        L_0x0556:
            r2 = 4
            android.view.View r5 = r4.f129569h
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/bizchat/BizChatConversationAdapter"
            java.lang.String r23 = "getView"
            java.lang.String r24 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r5
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r6 = "com/tencent/mm/ui/bizchat/BizChatConversationAdapter"
            java.lang.String r7 = "getView"
            java.lang.String r8 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            sb0.a r1 = r12.f129561f
            int r1 = r1.field_unReadCount
            r2 = 99
            java.lang.String r3 = "MicroMsg.BizChatConversationAdapter"
            if (r1 <= r2) goto L_0x05bc
            android.widget.TextView r1 = r4.f129566e
            r1.setText(r14)
            android.widget.TextView r1 = r4.f129566e
            r2 = 2131755223(0x7f1000d7, float:1.914132E38)
            r1.setBackgroundResource(r2)
            android.widget.TextView r1 = r4.f129566e
            r2 = 0
            r1.setVisibility(r2)
            java.lang.String r1 = "has unread 100"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r1)
            goto L_0x05fc
        L_0x05bc:
            if (r1 <= 0) goto L_0x05f1
            android.widget.TextView r1 = r4.f129566e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            sb0.a r5 = r12.f129561f
            int r5 = r5.field_unReadCount
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            android.widget.TextView r1 = r4.f129566e
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r4.f129566e
            com.tencent.mm.ui.MMFragmentActivity r2 = r0.f129544o
            sb0.a r4 = r12.f129561f
            int r4 = r4.field_unReadCount
            int r2 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r2, r4)
            r1.setBackgroundResource(r2)
            java.lang.String r1 = "has unread"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r1)
            goto L_0x05fc
        L_0x05f1:
            android.widget.TextView r1 = r4.f129566e
            r2 = 4
            r1.setVisibility(r2)
            java.lang.String r1 = "no unread"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r1)
        L_0x05fc:
            boolean r1 = r12.f129559d
            r2 = 2131300457(0x7f091069, float:1.8218944E38)
            if (r1 == 0) goto L_0x0610
            r9 = r17
            android.view.View r1 = r9.findViewById(r2)
            r2 = 2131231817(0x7f080449, float:1.8079726E38)
            r1.setBackgroundResource(r2)
            goto L_0x061c
        L_0x0610:
            r9 = r17
            android.view.View r1 = r9.findViewById(r2)
            r2 = 2131231818(0x7f08044a, float:1.8079728E38)
            r1.setBackgroundResource(r2)
        L_0x061c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.C48395b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        mo5580b();
        mo7998r(C48009v0.Dx0().mo73022Ow(this.f129545p));
        C6975i1.C6977b bVar = this.f24699h;
        if (bVar != null) {
            bVar.mo1327a((Object) null);
        }
        notifyDataSetChanged();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        super.onNotifyChange(i, mStorageEx, obj);
    }

    /* renamed from: s */
    public final String mo73093s(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
    }

    /* renamed from: t */
    public void mo73094t(long j) {
        HashMap<String, C48397b> hashMap = this.f129555z;
        if (hashMap != null) {
            hashMap.remove(j + "");
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (this.f129541A) {
            mo7991f();
        } else {
            this.f129542B = true;
        }
    }
}
