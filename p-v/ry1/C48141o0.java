package ry1;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.model.C42143x;
import com.tencent.p014mm.plugin.game.p061ui.GameMessageListContainerView;
import com.tencent.p014mm.plugin.game.p061ui.GameMessageListUserIconView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.wechat.aff.ting.TingClientProto;
import di3.C86312j;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o90.C100301b;
import p196ln.C76705f;
import p823sg.C101611g;
import q90.C101062d;
import sw1.C48484q;
import uy1.C52642c;
import uy1.C52645f;

/* renamed from: ry1.o0 */
public class C48141o0 extends C6975i1<C42119w> {

    /* renamed from: C */
    public static C48108b1 f129038C;

    /* renamed from: A */
    public C42143x f129039A;

    /* renamed from: B */
    public C101611g<String, Bitmap> f129040B;

    /* renamed from: o */
    public View.OnClickListener f129041o;

    /* renamed from: p */
    public View.OnClickListener f129042p;

    /* renamed from: q */
    public C48103a1 f129043q;

    /* renamed from: r */
    public C48103a1 f129044r;

    /* renamed from: s */
    public int f129045s = 15;

    /* renamed from: t */
    public int f129046t;

    /* renamed from: u */
    public int f129047u;

    /* renamed from: v */
    public Context f129048v;

    /* renamed from: w */
    public int f129049w;

    /* renamed from: x */
    public int f129050x;

    /* renamed from: y */
    public int f129051y;

    /* renamed from: z */
    public long f129052z;

    /* renamed from: ry1.o0$a */
    public class C48142a implements C52645f.C52652e {

        /* renamed from: a */
        public final /* synthetic */ String f129053a;

        public C48142a(String str) {
            this.f129053a = str;
        }

        /* renamed from: a */
        public void mo65432a(View view, Bitmap bitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                ((C100301b) C48141o0.this.f129040B).put(this.f129053a, bitmap);
            }
        }

        /* renamed from: b */
        public void mo65433b(String str, View view) {
        }
    }

    /* renamed from: ry1.o0$b */
    public static class C48143b {

        /* renamed from: a */
        public LinearLayout f129055a;

        /* renamed from: b */
        public ImageView f129056b;

        /* renamed from: c */
        public TextView f129057c;

        /* renamed from: d */
        public ImageView f129058d;

        /* renamed from: e */
        public TextView f129059e;

        /* renamed from: f */
        public TextView f129060f;

        /* renamed from: g */
        public LinearLayout f129061g;

        /* renamed from: h */
        public TextView f129062h;

        /* renamed from: i */
        public ImageView f129063i;

        /* renamed from: j */
        public ImageView f129064j;

        /* renamed from: k */
        public TextView f129065k;

        /* renamed from: l */
        public TextView f129066l;

        /* renamed from: m */
        public LinearLayout f129067m;

        /* renamed from: n */
        public GameMessageListContainerView f129068n;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48141o0(Context context, C42119w wVar, int i, long j) {
        super(context, wVar);
        Class cls = C48484q.class;
        int i2 = 0;
        this.f129046t = 0;
        this.f129047u = 0;
        this.f129050x = 0;
        this.f129051y = 0;
        this.f129048v = context;
        this.f129049w = i;
        this.f129052z = j;
        C42040b0 xi02 = ((C48484q) C86312j.m106911c(cls)).xi0();
        xi02.getClass();
        String Yt = xi02.mo66003Yt(2, 5, 6, 10, 11, 100);
        Cursor rawQuery = xi02.rawQuery("select count(*) from GameRawMessage where " + Yt + " and " + "showInMsgList" + " = " + 1 + " and " + "isHidden" + " = " + 0, new String[0]);
        if (rawQuery != null) {
            i2 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : i2;
            rawQuery.close();
        }
        this.f129046t = i2;
        this.f129047u = ((C48484q) C86312j.m106911c(cls)).xi0().mo66008kD();
        f129038C = new C48108b1();
        this.f129041o = new C48147p0(context, i);
        this.f129042p = new C48151q0(context, i);
        C48103a1 a1Var = new C48103a1(context, 13);
        this.f129043q = a1Var;
        a1Var.f128958f = i;
        a1Var.f128959g = TingClientProto.TingScene.TingScene_ChatHistory_VALUE;
        a1Var.f128960h = 1;
        C48103a1 a1Var2 = new C48103a1(context, 13);
        this.f129044r = a1Var2;
        a1Var2.f128958f = i;
        a1Var2.f128959g = TingClientProto.TingScene.TingScene_ChatHistory_VALUE;
        a1Var2.f128960h = 2;
        this.f129039A = new C42143x(context, this.f129049w);
        this.f129050x = C76577a.m92152c(this.f129048v, ((C52642c.m58990h(this.f129048v) - (this.f129048v.getResources().getDimensionPixelSize(C0966R.dimen.f3633r) * 2)) - this.f129048v.getResources().getDimensionPixelSize(C0966R.dimen.f3863h3)) - this.f129048v.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq)) / 34;
        this.f129040B = new C100301b(30, C48141o0.class);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C42119w wVar = (C42119w) obj;
        if (wVar == null) {
            wVar = new C42119w();
        }
        wVar.convertFrom(cursor);
        return wVar;
    }

    public int getCount() {
        if (this.f24700i < 0) {
            this.f24700i = mo7992g().getCount();
        }
        int i = this.f24700i;
        if (i <= 0) {
            return 0;
        }
        return i + mo6470i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x088b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r25, android.view.View r26, android.view.ViewGroup r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            r4 = 0
            if (r26 != 0) goto L_0x00c0
            ry1.o0$b r5 = new ry1.o0$b
            r5.<init>()
            android.content.Context r6 = r0.f24696e
            r7 = 2131495879(0x7f0c0bc7, float:1.8615307E38)
            android.view.View r6 = android.view.View.inflate(r6, r7, r4)
            r7 = 2131306206(0x7f0926de, float:1.8230605E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f129056b = r7
            r7 = 2131309568(0x7f093400, float:1.8237423E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5.f129055a = r7
            r7 = 2131309576(0x7f093408, float:1.823744E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r7 = 2131310284(0x7f0936cc, float:1.8238876E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f129057c = r7
            r7 = 2131297570(0x7f090522, float:1.8213089E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f129058d = r7
            r7 = 2131315352(0x7f094a98, float:1.8249155E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f129059e = r7
            r7 = 2131309582(0x7f09340e, float:1.8237452E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f129060f = r7
            r7 = 2131309613(0x7f09342d, float:1.8237515E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5.f129061g = r7
            r7 = 2131309615(0x7f09342f, float:1.8237519E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f129062h = r7
            r7 = 2131309614(0x7f09342e, float:1.8237517E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f129063i = r7
            r7 = 2131309586(0x7f093412, float:1.823746E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f129064j = r7
            r7 = 2131309622(0x7f093436, float:1.8237533E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f129065k = r7
            r7 = 2131309618(0x7f093432, float:1.8237525E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f129066l = r7
            r7 = 2131309626(0x7f09343a, float:1.8237541E38)
            android.view.View r7 = r6.findViewById(r7)
            com.tencent.mm.plugin.game.ui.GameMessageListContainerView r7 = (com.tencent.p014mm.plugin.game.p061ui.GameMessageListContainerView) r7
            r5.f129068n = r7
            r7 = 2131309581(0x7f09340d, float:1.823745E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5.f129067m = r7
            r6.setTag(r5)
            goto L_0x00c8
        L_0x00c0:
            java.lang.Object r5 = r26.getTag()
            ry1.o0$b r5 = (ry1.C48141o0.C48143b) r5
            r6 = r26
        L_0x00c8:
            com.tencent.mm.plugin.game.model.w r7 = r24.getItem(r25)
            r8 = 8
            r9 = 0
            if (r7 == 0) goto L_0x00e1
            boolean r10 = r7.f113488n2
            if (r10 == 0) goto L_0x00e1
            android.widget.LinearLayout r1 = r5.f129055a
            r1.setVisibility(r8)
            android.widget.LinearLayout r1 = r5.f129067m
            r1.setVisibility(r9)
            goto L_0x08f6
        L_0x00e1:
            if (r7 == 0) goto L_0x08f6
            r7.mo66075l2()
            boolean r10 = r7.f113478i2
            r11 = 1
            if (r10 != 0) goto L_0x0117
            r7.f113478i2 = r11
            int r10 = r1 + 1001
            int r12 = r0.f129047u
            if (r12 <= 0) goto L_0x00f7
            if (r1 <= r12) goto L_0x00f7
            int r10 = r1 + -1
        L_0x00f7:
            r15 = r10
            android.content.Context r12 = r0.f129048v
            r13 = 13
            r14 = 1300(0x514, float:1.822E-42)
            r16 = 1
            r17 = 0
            r18 = 0
            int r1 = r0.f129049w
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r10 = r7.f113474g2
            java.lang.String r23 = com.tencent.p014mm.game.report.C40314g.m43482a(r4, r4, r10, r4)
            r19 = r1
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0117:
            android.widget.LinearLayout r1 = r5.f129055a
            r1.setVisibility(r9)
            android.widget.LinearLayout r1 = r5.f129067m
            r1.setVisibility(r8)
            android.widget.TextView r1 = r5.f129065k
            android.content.Context r10 = r0.f24696e
            long r12 = r7.field_createTime
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            java.lang.String r10 = uy1.C14391b.m13703a(r10, r12)
            r1.setText(r10)
            int r1 = r7.field_msgType
            r10 = 100
            r14 = 2
            if (r1 != r10) goto L_0x044b
            com.tencent.mm.plugin.game.model.w$k r1 = r7.f113491q1
            boolean r1 = r1.f113532f
            if (r1 == 0) goto L_0x0143
            r1 = 1034594987(0x3daaaaab, float:0.083333336)
            goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            com.tencent.mm.plugin.game.model.w$n r4 = r7.f113455P1
            r10 = 1301(0x515, float:1.823E-42)
            if (r4 == 0) goto L_0x01da
            android.widget.ImageView r2 = r5.f129056b
            java.lang.String r4 = r4.f113541b
            r0.mo72887u(r2, r4, r1)
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r9)
            com.tencent.mm.plugin.game.model.w$n r1 = r7.f113455P1
            java.lang.String r1 = r1.f113540a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x016f
            android.widget.TextView r1 = r5.f129057c
            com.tencent.mm.plugin.game.model.w$n r2 = r7.f113455P1
            java.lang.String r2 = r2.f113540a
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r9)
            goto L_0x0174
        L_0x016f:
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r8)
        L_0x0174:
            com.tencent.mm.plugin.game.model.w$n r1 = r7.f113455P1
            java.lang.String r1 = r1.f113542c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x018d
            android.widget.ImageView r1 = r5.f129058d
            com.tencent.mm.plugin.game.model.w$n r2 = r7.f113455P1
            java.lang.String r2 = r2.f113542c
            r0.mo72886t(r1, r2)
            android.widget.ImageView r1 = r5.f129058d
            r1.setVisibility(r9)
            goto L_0x0192
        L_0x018d:
            android.widget.ImageView r1 = r5.f129058d
            r1.setVisibility(r8)
        L_0x0192:
            com.tencent.mm.plugin.game.model.w$n r1 = r7.f113455P1
            java.lang.String r1 = r1.f113543d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01ce
            android.widget.TextView r1 = r5.f129057c
            r1.setEnabled(r11)
            android.widget.ImageView r1 = r5.f129056b
            r1.setEnabled(r11)
            com.tencent.mm.plugin.game.model.x$a r1 = new com.tencent.mm.plugin.game.model.x$a
            com.tencent.mm.plugin.game.model.w$n r2 = r7.f113455P1
            java.lang.String r2 = r2.f113543d
            r1.<init>(r7, r2, r10, r11)
            com.tencent.mm.plugin.game.model.x$a r4 = new com.tencent.mm.plugin.game.model.x$a
            r4.<init>(r7, r2, r10, r14)
            android.widget.TextView r2 = r5.f129057c
            r2.setTag(r1)
            android.widget.TextView r1 = r5.f129057c
            com.tencent.mm.plugin.game.model.x r2 = r0.f129039A
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r5.f129056b
            r1.setTag(r4)
            android.widget.ImageView r1 = r5.f129056b
            com.tencent.mm.plugin.game.model.x r2 = r0.f129039A
            r1.setOnClickListener(r2)
            goto L_0x02ca
        L_0x01ce:
            android.widget.TextView r1 = r5.f129057c
            r1.setEnabled(r9)
            android.widget.ImageView r1 = r5.f129056b
            r1.setEnabled(r9)
            goto L_0x02ca
        L_0x01da:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r4 = r7.f113489o1
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x02bb
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r4 = r7.f113489o1
            java.lang.Object r4 = r4.get(r9)
            com.tencent.mm.plugin.game.model.w$p r4 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r4
            java.lang.String r15 = r4.f113547b
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x01f5
            java.lang.String r2 = r4.f113547b
            goto L_0x0219
        L_0x01f5:
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r15 = r4.f113546a
            com.tencent.mm.storage.z1 r2 = r2.get(r15)
            if (r2 == 0) goto L_0x0217
            java.lang.String r15 = r2.mo62898f()
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            java.lang.String r2 = r2.mo62898f()
            goto L_0x0219
        L_0x0217:
            java.lang.String r2 = r4.f113546a
        L_0x0219:
            java.lang.String r15 = r4.f113550e
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x0250
            android.widget.TextView r15 = r5.f129057c
            r15.setEnabled(r11)
            android.widget.ImageView r15 = r5.f129056b
            r15.setEnabled(r11)
            com.tencent.mm.plugin.game.model.x$a r15 = new com.tencent.mm.plugin.game.model.x$a
            java.lang.String r12 = r4.f113550e
            r15.<init>(r7, r12, r10, r11)
            com.tencent.mm.plugin.game.model.x$a r13 = new com.tencent.mm.plugin.game.model.x$a
            r13.<init>(r7, r12, r10, r14)
            android.widget.TextView r12 = r5.f129057c
            r12.setTag(r15)
            android.widget.TextView r12 = r5.f129057c
            com.tencent.mm.plugin.game.model.x r14 = r0.f129039A
            r12.setOnClickListener(r14)
            android.widget.ImageView r12 = r5.f129056b
            r12.setTag(r13)
            android.widget.ImageView r12 = r5.f129056b
            com.tencent.mm.plugin.game.model.x r13 = r0.f129039A
            r12.setOnClickListener(r13)
            goto L_0x025a
        L_0x0250:
            android.widget.TextView r12 = r5.f129057c
            r12.setEnabled(r9)
            android.widget.ImageView r12 = r5.f129056b
            r12.setEnabled(r9)
        L_0x025a:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r12 != 0) goto L_0x027f
            android.widget.TextView r12 = r5.f129057c
            di3.d r13 = di3.C86312j.m106911c(r3)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = r0.f24696e
            android.widget.TextView r15 = r5.f129057c
            float r15 = r15.getTextSize()
            android.text.SpannableString r2 = r13.yp0(r14, r2, r15)
            android.widget.TextView$BufferType r13 = android.widget.TextView.BufferType.SPANNABLE
            r12.setText(r2, r13)
            android.widget.TextView r2 = r5.f129057c
            r2.setVisibility(r9)
            goto L_0x0284
        L_0x027f:
            android.widget.TextView r2 = r5.f129057c
            r2.setVisibility(r8)
        L_0x0284:
            android.widget.ImageView r2 = r5.f129056b
            r2.setVisibility(r9)
            java.lang.String r2 = r4.f113548c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0299
            android.widget.ImageView r2 = r5.f129056b
            java.lang.String r12 = r4.f113548c
            r0.mo72887u(r2, r12, r1)
            goto L_0x02a0
        L_0x0299:
            android.widget.ImageView r1 = r5.f129056b
            java.lang.String r2 = r4.f113546a
            r0.mo72885s(r1, r2)
        L_0x02a0:
            java.lang.String r1 = r4.f113549d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x02b5
            android.widget.ImageView r1 = r5.f129058d
            java.lang.String r2 = r4.f113549d
            r0.mo72886t(r1, r2)
            android.widget.ImageView r1 = r5.f129058d
            r1.setVisibility(r9)
            goto L_0x02ca
        L_0x02b5:
            android.widget.ImageView r1 = r5.f129058d
            r1.setVisibility(r8)
            goto L_0x02ca
        L_0x02bb:
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r8)
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r5.f129058d
            r1.setVisibility(r8)
        L_0x02ca:
            java.lang.String r1 = r7.f113451L1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0313
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            int r1 = r1.size()
            if (r1 <= r11) goto L_0x0306
            android.widget.TextView r2 = r5.f129059e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r12 = r0.f24696e
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131830880(0x7f112860, float:1.929477E38)
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r9] = r1
            java.lang.String r1 = r12.getString(r13, r14)
            r4.append(r1)
            java.lang.String r1 = r7.f113451L1
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.setText(r1)
            goto L_0x030d
        L_0x0306:
            android.widget.TextView r1 = r5.f129059e
            java.lang.String r2 = r7.f113451L1
            r1.setText(r2)
        L_0x030d:
            android.widget.TextView r1 = r5.f129059e
            r1.setVisibility(r9)
            goto L_0x0318
        L_0x0313:
            android.widget.TextView r1 = r5.f129059e
            r1.setVisibility(r8)
        L_0x0318:
            java.lang.String r1 = r7.f113452M1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x033f
            android.widget.TextView r1 = r5.f129060f
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r4 = r0.f24696e
            java.lang.String r12 = r7.f113452M1
            android.widget.TextView r13 = r5.f129060f
            float r13 = r13.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r4, r12, r13)
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129060f
            r1.setVisibility(r9)
            goto L_0x0344
        L_0x033f:
            android.widget.TextView r1 = r5.f129060f
            r1.setVisibility(r8)
        L_0x0344:
            r0.mo72890z(r7, r5)
            com.tencent.mm.plugin.game.model.w$m r1 = r7.f113456Q1
            java.lang.String r1 = r1.f113537a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03bb
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setVisibility(r9)
            com.tencent.mm.plugin.game.model.w$m r1 = r7.f113456Q1
            java.lang.String r1 = r1.f113539c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x037c
            com.tencent.mm.plugin.game.model.x$a r1 = new com.tencent.mm.plugin.game.model.x$a
            com.tencent.mm.plugin.game.model.w$m r2 = r7.f113456Q1
            java.lang.String r2 = r2.f113539c
            r4 = 3
            r1.<init>(r7, r2, r10, r4)
            android.widget.LinearLayout r2 = r5.f129061g
            r2.setTag(r1)
            android.widget.LinearLayout r1 = r5.f129061g
            com.tencent.mm.plugin.game.model.x r2 = r0.f129039A
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setEnabled(r11)
            goto L_0x0381
        L_0x037c:
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setEnabled(r9)
        L_0x0381:
            android.widget.TextView r1 = r5.f129062h
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r0.f24696e
            com.tencent.mm.plugin.game.model.w$m r4 = r7.f113456Q1
            java.lang.String r4 = r4.f113537a
            android.widget.TextView r12 = r5.f129062h
            float r12 = r12.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r4, r12)
            r1.setText(r2)
            com.tencent.mm.plugin.game.model.w$m r1 = r7.f113456Q1
            java.lang.String r1 = r1.f113538b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03b5
            android.widget.ImageView r1 = r5.f129063i
            com.tencent.mm.plugin.game.model.w$m r2 = r7.f113456Q1
            java.lang.String r2 = r2.f113538b
            r0.mo72886t(r1, r2)
            android.widget.ImageView r1 = r5.f129063i
            r1.setVisibility(r9)
            goto L_0x03c0
        L_0x03b5:
            android.widget.ImageView r1 = r5.f129063i
            r1.setVisibility(r8)
            goto L_0x03c0
        L_0x03bb:
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setVisibility(r8)
        L_0x03c0:
            java.lang.String r1 = r7.f113453N1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03fc
            android.widget.ImageView r1 = r5.f129064j
            java.lang.String r2 = r7.f113453N1
            r0.mo72886t(r1, r2)
            android.widget.ImageView r1 = r5.f129064j
            r1.setVisibility(r9)
            java.lang.String r1 = r7.f113454O1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03f6
            com.tencent.mm.plugin.game.model.x$a r1 = new com.tencent.mm.plugin.game.model.x$a
            java.lang.String r2 = r7.f113454O1
            r3 = 3
            r1.<init>(r7, r2, r10, r3)
            android.widget.ImageView r2 = r5.f129064j
            r2.setTag(r1)
            android.widget.ImageView r1 = r5.f129064j
            com.tencent.mm.plugin.game.model.x r2 = r0.f129039A
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r5.f129064j
            r1.setEnabled(r11)
            goto L_0x0401
        L_0x03f6:
            android.widget.ImageView r1 = r5.f129064j
            r1.setEnabled(r9)
            goto L_0x0401
        L_0x03fc:
            android.widget.ImageView r1 = r5.f129064j
            r1.setVisibility(r8)
        L_0x0401:
            com.tencent.mm.plugin.game.model.w$o r1 = r7.f113457R1
            java.lang.String r1 = r1.f113544a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0445
            android.widget.TextView r1 = r5.f129066l
            com.tencent.mm.plugin.game.model.w$o r2 = r7.f113457R1
            java.lang.String r2 = r2.f113544a
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129066l
            r1.setVisibility(r9)
            com.tencent.mm.plugin.game.model.w$o r1 = r7.f113457R1
            java.lang.String r1 = r1.f113545b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x043f
            com.tencent.mm.plugin.game.model.x$a r1 = new com.tencent.mm.plugin.game.model.x$a
            com.tencent.mm.plugin.game.model.w$o r2 = r7.f113457R1
            java.lang.String r2 = r2.f113545b
            r3 = 5
            r1.<init>(r7, r2, r10, r3)
            android.widget.TextView r2 = r5.f129066l
            r2.setTag(r1)
            android.widget.TextView r1 = r5.f129066l
            com.tencent.mm.plugin.game.model.x r2 = r0.f129039A
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r5.f129066l
            r1.setEnabled(r11)
            goto L_0x044a
        L_0x043f:
            android.widget.TextView r1 = r5.f129066l
            r1.setEnabled(r9)
            goto L_0x044a
        L_0x0445:
            android.widget.TextView r1 = r5.f129066l
            r1.setVisibility(r8)
        L_0x044a:
            return r6
        L_0x044b:
            android.widget.TextView r1 = r5.f129059e
            r1.setVisibility(r8)
            android.widget.TextView r1 = r5.f129060f
            r1.setVisibility(r8)
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r5.f129063i
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r5.f129064j
            r1.setVisibility(r8)
            android.widget.TextView r1 = r5.f129066l
            r1.setVisibility(r8)
            android.widget.TextView r1 = r5.f129066l
            r1.setEnabled(r9)
            android.widget.ImageView r1 = r5.f129064j
            r1.setEnabled(r9)
            android.widget.ImageView r1 = r5.f129056b
            r1.setEnabled(r9)
            android.widget.TextView r1 = r5.f129057c
            r1.setEnabled(r9)
            com.tencent.mm.plugin.game.ui.GameMessageListContainerView r1 = r5.f129068n
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r5.f129058d
            r1.setVisibility(r8)
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x04bf
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.game.model.w$p r1 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r1
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r10 = r1.f113546a
            com.tencent.mm.storage.z1 r2 = r2.get(r10)
            if (r2 == 0) goto L_0x04ae
            java.lang.String r2 = r2.mo62898f()
            goto L_0x04af
        L_0x04ae:
            r2 = r4
        L_0x04af:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r10 == 0) goto L_0x04b7
            java.lang.String r2 = r1.f113547b
        L_0x04b7:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r1 != 0) goto L_0x04c0
            r1 = 1
            goto L_0x04c1
        L_0x04bf:
            r2 = r4
        L_0x04c0:
            r1 = 0
        L_0x04c1:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r10 = r7.f113489o1
            int r10 = r10.size()
            java.lang.String r12 = r7.f113485m1
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x053d
            long r12 = r7.f113500z1
            r15 = 1
            long r12 = r12 & r15
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x053d
            android.widget.TextView r12 = r5.f129066l
            java.lang.String r13 = r7.f113485m1
            r12.setText(r13)
            android.widget.TextView r12 = r5.f129066l
            r12.setVisibility(r9)
            long r12 = r7.f113500z1
            r17 = 2
            long r12 = r12 & r17
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x051c
            android.content.Context r12 = r0.f24696e
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131100854(0x7f0604b6, float:1.7814101E38)
            int r12 = r12.getColor(r13)
            android.widget.TextView r13 = r5.f129066l
            r13.setTextColor(r12)
            android.widget.TextView r12 = r5.f129066l
            r13 = 2131233198(0x7f0809ae, float:1.8082527E38)
            r12.setBackgroundResource(r13)
            android.widget.TextView r12 = r5.f129066l
            android.view.View$OnClickListener r13 = r0.f129041o
            r12.setOnClickListener(r13)
            android.widget.TextView r12 = r5.f129066l
            r12.setTag(r7)
            android.widget.TextView r12 = r5.f129066l
            r12.setEnabled(r11)
            goto L_0x053d
        L_0x051c:
            android.content.Context r12 = r0.f24696e
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131100832(0x7f0604a0, float:1.7814057E38)
            int r12 = r12.getColor(r13)
            android.widget.TextView r13 = r5.f129066l
            r13.setTextColor(r12)
            android.widget.TextView r12 = r5.f129066l
            r12.setBackgroundResource(r9)
            android.widget.TextView r12 = r5.f129066l
            r12.setOnClickListener(r4)
            android.widget.TextView r12 = r5.f129066l
            r12.setEnabled(r9)
        L_0x053d:
            int r12 = r7.field_msgType
            r13 = 11
            r15 = 10
            if (r12 == r15) goto L_0x0586
            if (r12 != r13) goto L_0x0548
            goto L_0x0586
        L_0x0548:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r12 != 0) goto L_0x0580
            android.widget.TextView r12 = r5.f129057c
            di3.d r16 = di3.C86312j.m106911c(r3)
            r4 = r16
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r13 = r0.f24696e
            android.widget.TextView r15 = r5.f129057c
            float r15 = r15.getTextSize()
            android.text.SpannableString r2 = r4.yp0(r13, r2, r15)
            r12.setText(r2)
            android.widget.TextView r2 = r5.f129057c
            r2.setVisibility(r9)
            if (r1 == 0) goto L_0x05d7
            android.widget.TextView r1 = r5.f129057c
            ry1.a1 r2 = r0.f129043q
            r1.setOnClickListener(r2)
            android.widget.TextView r1 = r5.f129057c
            r1.setTag(r7)
            android.widget.TextView r1 = r5.f129057c
            r1.setEnabled(r11)
            goto L_0x05d7
        L_0x0580:
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r8)
            goto L_0x05d7
        L_0x0586:
            java.lang.String r1 = r7.f113481k1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x05af
            android.widget.TextView r1 = r5.f129057c
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r4 = r0.f24696e
            java.lang.String r12 = r7.f113481k1
            android.widget.TextView r13 = r5.f129057c
            float r13 = r13.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r4, r12, r13)
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r2, r4)
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r9)
            goto L_0x05d7
        L_0x05af:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r1 != 0) goto L_0x05d2
            android.widget.TextView r1 = r5.f129057c
            di3.d r4 = di3.C86312j.m106911c(r3)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r12 = r0.f24696e
            android.widget.TextView r13 = r5.f129057c
            float r13 = r13.getTextSize()
            android.text.SpannableString r2 = r4.yp0(r12, r2, r13)
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r9)
            goto L_0x05d7
        L_0x05d2:
            android.widget.TextView r1 = r5.f129057c
            r1.setVisibility(r8)
        L_0x05d7:
            int r1 = r7.field_msgType
            java.lang.String r2 = ""
            if (r1 == r14) goto L_0x088b
            r4 = 5
            if (r1 == r4) goto L_0x07b1
            r4 = 6
            if (r1 == r4) goto L_0x0693
            java.lang.String r2 = "MicroMsg.GameMessageAdapter"
            r3 = 10
            if (r1 == r3) goto L_0x0605
            r3 = 11
            if (r1 == r3) goto L_0x0605
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "error msgtype: "
            r1.append(r3)
            int r3 = r7.field_msgType
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x08f6
        L_0x0605:
            java.lang.String r1 = r7.f113483l1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x061a
            android.widget.ImageView r1 = r5.f129056b
            java.lang.String r2 = r7.f113483l1
            r0.mo72886t(r1, r2)
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r9)
            goto L_0x0624
        L_0x061a:
            java.lang.String r1 = "mAppIcon is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r8)
        L_0x0624:
            java.lang.String r1 = r7.f113475h1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x065f
            java.lang.String r1 = r7.f113495u1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0641
            android.widget.TextView r1 = r5.f129060f
            java.lang.String r2 = r7.f113475h1
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129060f
            r1.setVisibility(r9)
            goto L_0x065f
        L_0x0641:
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f129062h
            java.lang.String r2 = r7.f113475h1
            r1.setText(r2)
            android.widget.LinearLayout r1 = r5.f129061g
            android.view.View$OnClickListener r2 = r0.f129042p
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r5.f129061g
            long r2 = r7.field_msgId
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.setTag(r2)
        L_0x065f:
            java.lang.String r1 = r7.f113495u1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x08f6
            android.widget.ImageView r1 = r5.f129064j
            java.lang.String r2 = r7.f113495u1
            r0.mo72886t(r1, r2)
            android.widget.ImageView r1 = r5.f129064j
            long r2 = r7.field_msgId
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.setTag(r2)
            android.widget.ImageView r1 = r5.f129064j
            ry1.b1 r2 = f129038C
            r1.setOnTouchListener(r2)
            android.widget.ImageView r1 = r5.f129064j
            android.view.View$OnClickListener r2 = r0.f129042p
            r1.setOnClickListener(r2)
            android.widget.ImageView r1 = r5.f129064j
            r1.setVisibility(r9)
            android.widget.ImageView r1 = r5.f129064j
            r1.setEnabled(r11)
            goto L_0x08f6
        L_0x0693:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x06f3
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r9)
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.game.model.w$p r1 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r1
            java.lang.String r1 = r1.f113548c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06c0
            android.widget.ImageView r1 = r5.f129056b
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r4 = r7.f113489o1
            java.lang.Object r4 = r4.get(r9)
            com.tencent.mm.plugin.game.model.w$p r4 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r4
            java.lang.String r4 = r4.f113548c
            r0.mo72886t(r1, r4)
            goto L_0x06cf
        L_0x06c0:
            android.widget.ImageView r1 = r5.f129056b
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r4 = r7.f113489o1
            java.lang.Object r4 = r4.get(r9)
            com.tencent.mm.plugin.game.model.w$p r4 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r4
            java.lang.String r4 = r4.f113546a
            r0.mo72885s(r1, r4)
        L_0x06cf:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.game.model.w$p r1 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r1
            r1.getClass()
            r1 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06f8
            android.widget.ImageView r1 = r5.f129056b
            ry1.a1 r4 = r0.f129044r
            r1.setOnClickListener(r4)
            android.widget.ImageView r1 = r5.f129056b
            r1.setTag(r7)
            android.widget.ImageView r1 = r5.f129056b
            r1.setEnabled(r11)
            goto L_0x06f8
        L_0x06f3:
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r8)
        L_0x06f8:
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setVisibility(r9)
            android.widget.LinearLayout r1 = r5.f129061g
            android.view.View$OnClickListener r4 = r0.f129042p
            r1.setOnClickListener(r4)
            android.widget.LinearLayout r1 = r5.f129061g
            long r12 = r7.field_msgId
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r1.setTag(r4)
            int r1 = r7.f113469d2
            if (r1 != r11) goto L_0x073a
            android.widget.TextView r1 = r5.f129060f
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f129060f
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r0.f24696e
            java.lang.String r4 = r7.f113443D1
            android.widget.TextView r8 = r5.f129060f
            float r8 = r8.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r4, r8)
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129062h
            java.lang.String r2 = r7.f113446G1
            r1.setText(r2)
            goto L_0x08f6
        L_0x073a:
            if (r1 != r14) goto L_0x0763
            android.widget.TextView r1 = r5.f129060f
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f129060f
            di3.d r2 = di3.C86312j.m106911c(r3)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = r0.f24696e
            java.lang.String r4 = r7.f113443D1
            android.widget.TextView r8 = r5.f129060f
            float r8 = r8.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r4, r8)
            r1.setText(r2)
            android.widget.TextView r1 = r5.f129062h
            java.lang.String r2 = r7.f113444E1
            r1.setText(r2)
            goto L_0x08f6
        L_0x0763:
            r3 = 3
            if (r1 != r3) goto L_0x08f6
            android.widget.TextView r1 = r5.f129059e
            r1.setVisibility(r9)
            if (r10 <= r11) goto L_0x0796
            android.widget.TextView r1 = r5.f129059e
            android.content.Context r3 = r0.f24696e
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131830869(0x7f112855, float:1.9294748E38)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = r11.toString()
            r8[r9] = r2
            java.lang.String r2 = r3.getString(r4, r8)
            r1.setText(r2)
            r0.mo72890z(r7, r5)
            goto L_0x07a8
        L_0x0796:
            android.widget.TextView r1 = r5.f129059e
            android.content.Context r2 = r0.f24696e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131830870(0x7f112856, float:1.929475E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
        L_0x07a8:
            android.widget.TextView r1 = r5.f129062h
            java.lang.String r2 = r7.f113446G1
            r1.setText(r2)
            goto L_0x08f6
        L_0x07b1:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x0811
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r9)
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.game.model.w$p r1 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r1
            java.lang.String r1 = r1.f113548c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x07de
            android.widget.ImageView r1 = r5.f129056b
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r3 = r7.f113489o1
            java.lang.Object r3 = r3.get(r9)
            com.tencent.mm.plugin.game.model.w$p r3 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r3
            java.lang.String r3 = r3.f113548c
            r0.mo72886t(r1, r3)
            goto L_0x07ed
        L_0x07de:
            android.widget.ImageView r1 = r5.f129056b
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r3 = r7.f113489o1
            java.lang.Object r3 = r3.get(r9)
            com.tencent.mm.plugin.game.model.w$p r3 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r3
            java.lang.String r3 = r3.f113546a
            r0.mo72885s(r1, r3)
        L_0x07ed:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r1 = r7.f113489o1
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.game.model.w$p r1 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r1
            r1.getClass()
            r1 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0816
            android.widget.ImageView r1 = r5.f129056b
            ry1.a1 r3 = r0.f129044r
            r1.setOnClickListener(r3)
            android.widget.ImageView r1 = r5.f129056b
            r1.setTag(r7)
            android.widget.ImageView r1 = r5.f129056b
            r1.setEnabled(r11)
            goto L_0x0816
        L_0x0811:
            android.widget.ImageView r1 = r5.f129056b
            r1.setVisibility(r8)
        L_0x0816:
            if (r10 <= r11) goto L_0x0841
            android.widget.TextView r1 = r5.f129059e
            android.content.Context r3 = r0.f24696e
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131830871(0x7f112857, float:1.9294752E38)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r10)
            java.lang.String r2 = r11.toString()
            r8[r9] = r2
            java.lang.String r2 = r3.getString(r4, r8)
            r1.setText(r2)
            r0.mo72890z(r7, r5)
            goto L_0x0853
        L_0x0841:
            android.widget.TextView r1 = r5.f129059e
            android.content.Context r2 = r0.f24696e
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131830872(0x7f112858, float:1.9294754E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
        L_0x0853:
            android.widget.LinearLayout r1 = r5.f129061g
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f129059e
            r1.setVisibility(r9)
            android.widget.TextView r1 = r5.f129062h
            java.lang.String r2 = r7.f113447H1
            r1.setText(r2)
            android.widget.LinearLayout r1 = r5.f129061g
            android.view.View$OnClickListener r2 = r0.f129042p
            r1.setOnClickListener(r2)
            android.widget.LinearLayout r1 = r5.f129061g
            long r2 = r7.field_msgId
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.setTag(r2)
            java.lang.String r1 = r7.f113449J1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x08f6
            android.widget.ImageView r1 = r5.f129063i
            r1.setVisibility(r9)
            android.widget.ImageView r1 = r5.f129063i
            java.lang.String r2 = r7.f113449J1
            r0.mo72886t(r1, r2)
            goto L_0x08f6
        L_0x088b:
            android.widget.ImageView r1 = r5.f129056b
            java.lang.String r3 = r7.f113483l1
            r0.mo72886t(r1, r3)
            java.lang.String r1 = r7.f113497w1
            java.lang.String r3 = "爱心"
            boolean r1 = r1.contains(r3)
            java.lang.String r4 = "体力"
            if (r1 == 0) goto L_0x08a1
            goto L_0x08ae
        L_0x08a1:
            java.lang.String r1 = r7.f113497w1
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x08ab
            r3 = r4
            goto L_0x08ae
        L_0x08ab:
            java.lang.String r3 = "礼物"
        L_0x08ae:
            if (r10 <= r11) goto L_0x08d8
            android.widget.TextView r1 = r5.f129059e
            android.content.Context r4 = r0.f24696e
            android.content.res.Resources r4 = r4.getResources()
            r8 = 2131830878(0x7f11285e, float:1.9294766E38)
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r10)
            java.lang.String r2 = r13.toString()
            r12[r9] = r2
            r12[r11] = r3
            java.lang.String r2 = r4.getString(r8, r12)
            r1.setText(r2)
            goto L_0x08ee
        L_0x08d8:
            android.widget.TextView r1 = r5.f129059e
            android.content.Context r2 = r0.f24696e
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131830879(0x7f11285f, float:1.9294768E38)
            java.lang.Object[] r8 = new java.lang.Object[r11]
            r8[r9] = r3
            java.lang.String r2 = r2.getString(r4, r8)
            r1.setText(r2)
        L_0x08ee:
            android.widget.TextView r1 = r5.f129059e
            r1.setVisibility(r9)
            r0.mo72890z(r7, r5)
        L_0x08f6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ry1.C48141o0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: i */
    public int mo6470i() {
        int i = this.f129046t;
        int i2 = this.f129047u;
        return (i <= i2 || i2 <= 0) ? 0 : 1;
    }

    /* renamed from: k */
    public Object mo7995k() {
        return (C42119w) this.f24695d;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5580b();
        mo1333o();
    }

    /* renamed from: n */
    public boolean mo7996n(int i) {
        int i2 = this.f129046t;
        int i3 = this.f129047u;
        return i2 > i3 && i3 > 0 && i == i3;
    }

    /* renamed from: o */
    public void mo1333o() {
        C42040b0 xi02 = ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
        int i = this.f129045s;
        xi02.getClass();
        String Yt = xi02.mo66003Yt(2, 5, 6, 10, 11, 100);
        StringBuilder sb = new StringBuilder();
        sb.append("select * from GameRawMessage where ");
        sb.append(Yt);
        sb.append(" and ");
        sb.append("showInMsgList");
        sb.append(" = ");
        sb.append(1);
        sb.append(" and ");
        sb.append("isHidden");
        sb.append(" = ");
        int i2 = 0;
        sb.append(0);
        sb.append(" order by isRead, createTime desc limit ");
        sb.append(i);
        mo7998r(xi02.rawQuery(sb.toString(), new String[0]));
        this.f129045s = getCount();
        C6975i1.C6977b bVar = this.f24699h;
        if (bVar != null) {
            bVar.mo1327a((Object) null);
        }
        if (this.f129052z > 0) {
            int count = getCount();
            while (true) {
                if (i2 < count) {
                    C42119w x = getItem(i2);
                    if (x != null && x.field_msgId == this.f129052z) {
                        this.f129051y = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            this.f129052z = 0;
        }
        notifyDataSetChanged();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        mo7992g().close();
        mo1333o();
    }

    /* renamed from: s */
    public final void mo72885s(ImageView imageView, String str) {
        if (Util.isNullOrNil(str)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
        } else if (!((C101062d) this.f129040B).check(str)) {
            Bitmap c = C52645f.m59023a().mo73593c(imageView, str);
            if (c != null) {
                ((C100301b) this.f129040B).put(str, c);
            }
        } else {
            Bitmap bitmap = (Bitmap) ((C100301b) this.f129040B).get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                Bitmap c2 = C52645f.m59023a().mo73593c(imageView, str);
                if (c2 != null) {
                    ((C100301b) this.f129040B).put(str, c2);
                    return;
                }
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: t */
    public final void mo72886t(ImageView imageView, String str) {
        if (((C101062d) this.f129040B).check(str)) {
            Bitmap bitmap = (Bitmap) ((C100301b) this.f129040B).get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                mo72888w(imageView, str, 0.0f);
            } else {
                imageView.setImageBitmap(bitmap);
            }
        } else {
            mo72888w(imageView, str, 0.0f);
        }
    }

    /* renamed from: u */
    public final void mo72887u(ImageView imageView, String str, float f) {
        if (((C101062d) this.f129040B).check(str)) {
            Bitmap bitmap = (Bitmap) ((C100301b) this.f129040B).get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                mo72888w(imageView, str, f);
            } else {
                imageView.setImageBitmap(bitmap);
            }
        } else {
            mo72888w(imageView, str, f);
        }
    }

    /* renamed from: w */
    public final void mo72888w(ImageView imageView, String str, float f) {
        C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
        aVar.f147020a = false;
        aVar.f147026g = f;
        C52645f.m59023a().mo73595e(imageView, str, aVar.mo73598a(), new C48142a(str));
    }

    /* renamed from: x */
    public C42119w getItem(int i) {
        if (mo7996n(i)) {
            return (C42119w) this.f24695d;
        }
        Map<Integer, T> map = this.f24698g;
        if (map != null) {
            C42119w wVar = (C42119w) ((HashMap) map).get(Integer.valueOf(i));
            if (wVar != null) {
                return wVar;
            }
        }
        int i2 = this.f129046t;
        int i3 = this.f129047u;
        int i4 = i2 > i3 && i3 > 0 && i > i3 ? i - 1 : i;
        if (i < 0 || !mo7992g().moveToPosition(i4)) {
            return null;
        }
        if (this.f24698g == null) {
            C42119w wVar2 = (C42119w) this.f24695d;
            Cursor g = mo7992g();
            if (wVar2 == null) {
                wVar2 = new C42119w();
            }
            wVar2.convertFrom(g);
            return wVar2;
        }
        Cursor g2 = mo7992g();
        C42119w wVar3 = new C42119w();
        wVar3.convertFrom(g2);
        ((HashMap) this.f24698g).put(Integer.valueOf(i), wVar3);
        return wVar3;
    }

    /* renamed from: z */
    public final void mo72890z(C42119w wVar, C48143b bVar) {
        C42119w wVar2 = wVar;
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < wVar2.f113489o1.size(); i++) {
            linkedList.add(wVar2.f113489o1.get(i));
        }
        GameMessageListContainerView gameMessageListContainerView = bVar.f129068n;
        int i2 = this.f129050x;
        int i3 = this.f129049w;
        C101611g<String, Bitmap> gVar = this.f129040B;
        gameMessageListContainerView.getClass();
        int i4 = 8;
        if (Util.isNullOrNil((List) linkedList)) {
            gameMessageListContainerView.setVisibility(8);
            return;
        }
        boolean z = false;
        gameMessageListContainerView.setVisibility(0);
        int i5 = i2 > linkedList.size() ? 1 : 2;
        Resources resources = gameMessageListContainerView.f114067d.getResources();
        int i6 = C0966R.dimen.f3623g;
        int dimensionPixelSize = resources.getDimensionPixelSize(C0966R.dimen.f3623g);
        while (gameMessageListContainerView.getChildCount() < i5) {
            GameMessageListUserIconView gameMessageListUserIconView = new GameMessageListUserIconView(gameMessageListContainerView.f114067d);
            if (gameMessageListContainerView.getChildCount() > 0) {
                gameMessageListUserIconView.setPadding(0, dimensionPixelSize, 0, 0);
            }
            gameMessageListUserIconView.setSourceScene(i3);
            gameMessageListContainerView.addView(gameMessageListUserIconView);
        }
        int i7 = 0;
        while (i7 < gameMessageListContainerView.getChildCount()) {
            if (i7 < i5) {
                View childAt = gameMessageListContainerView.getChildAt(i7);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(z ? 1 : 0));
                View view = childAt;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(z)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                GameMessageListUserIconView gameMessageListUserIconView2 = (GameMessageListUserIconView) gameMessageListContainerView.getChildAt(i7);
                LinkedList linkedList2 = new LinkedList();
                int i8 = i7 * i2;
                while (i8 < (i7 + 1) * i2 && i8 < linkedList.size()) {
                    linkedList2.add((C42119w.C42135p) linkedList.get(i8));
                    i8++;
                }
                gameMessageListUserIconView2.getClass();
                if (Util.isNullOrNil((List) linkedList2)) {
                    gameMessageListUserIconView2.setVisibility(i4);
                } else {
                    gameMessageListUserIconView2.f114070f = gVar;
                    gameMessageListUserIconView2.setVisibility(z);
                    int dimensionPixelSize2 = gameMessageListUserIconView2.f114068d.getResources().getDimensionPixelSize(C0966R.dimen.f3878hk);
                    int dimensionPixelSize3 = gameMessageListUserIconView2.f114068d.getResources().getDimensionPixelSize(i6);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                    layoutParams.rightMargin = dimensionPixelSize3;
                    while (gameMessageListUserIconView2.getChildCount() < linkedList2.size()) {
                        ImageView imageView = new ImageView(gameMessageListUserIconView2.f114068d);
                        imageView.setLayoutParams(layoutParams);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setOnClickListener(gameMessageListUserIconView2.f114069e);
                        gameMessageListUserIconView2.addView(imageView);
                    }
                    int i9 = 0;
                    while (i9 < gameMessageListUserIconView2.getChildCount()) {
                        ImageView imageView2 = (ImageView) gameMessageListUserIconView2.getChildAt(i9);
                        if (i9 < linkedList2.size()) {
                            imageView2.setVisibility(z ? 1 : 0);
                            C42119w.C42135p pVar = (C42119w.C42135p) linkedList2.get(i9);
                            if (!Util.isNullOrNil(pVar.f113548c)) {
                                String str = pVar.f113548c;
                                if (gameMessageListUserIconView2.f114070f.check(str)) {
                                    Bitmap bitmap = gameMessageListUserIconView2.f114070f.get(str);
                                    if (bitmap == null || bitmap.isRecycled()) {
                                        C52645f.C52650d.C52651a aVar2 = new C52645f.C52650d.C52651a();
                                        aVar2.f147020a = z;
                                        C52645f.m59023a().mo73595e(imageView2, str, aVar2.mo73598a(), new C48153r0(gameMessageListUserIconView2, str));
                                    } else {
                                        imageView2.setImageBitmap(bitmap);
                                    }
                                } else {
                                    C52645f.C52650d.C52651a aVar3 = new C52645f.C52650d.C52651a();
                                    aVar3.f147020a = false;
                                    C52645f.m59023a().mo73595e(imageView2, str, aVar3.mo73598a(), new C48153r0(gameMessageListUserIconView2, str));
                                }
                            } else {
                                String str2 = pVar.f113546a;
                                if (Util.isNullOrNil(str2)) {
                                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView2, str2);
                                } else if (!gameMessageListUserIconView2.f114070f.check(str2)) {
                                    Bitmap c = C52645f.m59023a().mo73593c(imageView2, str2);
                                    if (c != null) {
                                        gameMessageListUserIconView2.f114070f.put(str2, c);
                                    }
                                } else {
                                    Bitmap bitmap2 = gameMessageListUserIconView2.f114070f.get(str2);
                                    if (bitmap2 == null || bitmap2.isRecycled()) {
                                        Bitmap c2 = C52645f.m59023a().mo73593c(imageView2, str2);
                                        if (c2 != null) {
                                            gameMessageListUserIconView2.f114070f.put(str2, c2);
                                        }
                                    } else {
                                        imageView2.setImageBitmap(bitmap2);
                                    }
                                }
                            }
                            if (!Util.isNullOrNil(pVar.f113550e)) {
                                imageView2.setTag(new C42143x.C42144a(wVar2, pVar.f113550e, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, 6));
                                imageView2.setEnabled(true);
                            } else {
                                imageView2.setEnabled(false);
                            }
                        } else {
                            imageView2.setVisibility(8);
                        }
                        i9++;
                        z = false;
                    }
                }
                i4 = 8;
            } else {
                View childAt2 = gameMessageListContainerView.getChildAt(i7);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                i4 = 8;
                aVar4.mo10233c(8);
                View view2 = childAt2;
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameMessageListContainerView", "setData", "(Lcom/tencent/mm/plugin/game/model/GameMessage;Ljava/util/LinkedList;IILcom/tencent/mm/algorithm/LRUMap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i7++;
            z = false;
            i6 = C0966R.dimen.f3623g;
        }
    }
}
