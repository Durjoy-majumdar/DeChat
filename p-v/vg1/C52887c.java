package vg1;

import ak1.C54116w;
import android.view.View;
import bl1.C39775b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import nj3.C11184p0;
import rx3.C13598b0;

/* renamed from: vg1.c */
public final class C52887c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C60905o f147692d;

    /* renamed from: e */
    public final /* synthetic */ C52890e f147693e;

    /* renamed from: f */
    public final /* synthetic */ C39775b f147694f;

    /* renamed from: g */
    public final /* synthetic */ View f147695g;

    /* renamed from: vg1.c$a */
    public static final class C52888a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52890e f147696d;

        /* renamed from: e */
        public final /* synthetic */ C39775b f147697e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52888a(C52890e eVar, C39775b bVar) {
            super(0);
            this.f147696d = eVar;
            this.f147697e = bVar;
        }

        public Object invoke() {
            this.f147696d.mo73650e(this.f147697e);
            ((C54116w) C86312j.m106911c(C54116w.class)).Qx0(14, 1, this.f147697e.mo62407a(), this.f147697e.getContent());
            return C13598b0.f38549a;
        }
    }

    public C52887c(C60905o oVar, C52890e eVar, C39775b bVar, View view) {
        this.f147692d = oVar;
        this.f147693e = eVar;
        this.f147694f = bVar;
        this.f147695g = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0086, code lost:
        r6 = r5.f151988c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMMMenuItemSelected(android.view.MenuItem r10, int r11) {
        /*
            r9 = this;
            java.lang.Class<ak1.w> r11 = ak1.C54116w.class
            int r10 = r10.getItemId()
            r0 = 0
            r1 = 0
            r2 = 1
            switch(r10) {
                case 154: goto L_0x0153;
                case 155: goto L_0x0121;
                case 156: goto L_0x0071;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r10) {
                case 165: goto L_0x0051;
                case 166: goto L_0x0031;
                case 167: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x01f7
        L_0x0011:
            vg1.e r10 = r9.f147693e
            android.content.Context r11 = r10.f147700a
            bl1.b r1 = r9.f147694f
            java.lang.String r1 = r1.mo62408b()
            r10.getClass()
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r2 = "Contact_User"
            r10.putExtra(r2, r1)
            java.lang.String r1 = "profile"
            java.lang.String r2 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r11, r1, r2, r10, r0)
            goto L_0x01f7
        L_0x0031:
            vg1.e r10 = r9.f147693e
            bl1.b r0 = r9.f147694f
            r10.mo73649d(r0)
            di3.d r10 = di3.C86312j.m106911c(r11)
            ak1.w r10 = (ak1.C54116w) r10
            r11 = 17
            bl1.b r0 = r9.f147694f
            java.lang.String r0 = r0.mo62407a()
            bl1.b r1 = r9.f147694f
            java.lang.String r1 = r1.getContent()
            r10.Qx0(r11, r2, r0, r1)
            goto L_0x01f7
        L_0x0051:
            vg1.f r10 = vg1.C52891f.f147704a
            jq3.o r11 = r9.f147692d
            a14.n0 r0 = r11.f29679z
            r1 = 2131300009(0x7f090ea9, float:1.8218036E38)
            android.view.View r11 = r11.mo85812D(r1)
            java.lang.String r1 = "holder.getView<View>(R.id.comment_like_ui_root)"
            gy3.C87412m.m108593f(r11, r1)
            vg1.c$a r1 = new vg1.c$a
            vg1.e r2 = r9.f147693e
            bl1.b r3 = r9.f147694f
            r1.<init>(r2, r3)
            r10.mo73665o(r0, r11, r1)
            goto L_0x01f7
        L_0x0071:
            vg1.e r10 = r9.f147693e
            bl1.b r3 = r9.f147694f
            r10.getClass()
            te3.hj1 r4 = new te3.hj1
            r4.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r5.getClass()
            al1.i r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r5 == 0) goto L_0x008d
            al1.l r6 = r5.f151988c
            if (r6 == 0) goto L_0x008d
            int r6 = r6.f152031k
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            r4.f134677n = r6
            if (r5 == 0) goto L_0x0098
            al1.l r5 = r5.f151988c
            if (r5 == 0) goto L_0x0098
            int r1 = r5.f152031k
        L_0x0098:
            r4.f134675i = r1
            qg1.c0 r1 = new qg1.c0
            te3.xs0 r5 = r3.f106734e
            long r5 = r5.f144913r
            java.lang.String r3 = r3.mo62407a()
            te3.lw0 r7 = new te3.lw0
            r7.<init>()
            int r8 = ks3.C46740q.f125820a
            r7.f137676d = r2
            r7.f137677e = r3
            te3.xs0 r3 = new te3.xs0
            r3.<init>()
            r3.f144905g = r5
            r5 = 20008(0x4e28, float:2.8037E-41)
            r3.f144903e = r5
            te3.xt0 r5 = new te3.xt0
            r5.<init>()
            r5.f144935d = r7
            byte[] r5 = r5.toByteArray()
            pe3.b r5 = pe3.C89349b.m111674a(r5)
            r3.f144906h = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = eb0.C75592q0.m90789s()
            r5.append(r6)
            long r6 = java.lang.System.currentTimeMillis()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.f144904f = r5
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r5 = r10.f147701b
            fj1.b r5 = r5.mo87684A0()
            r1.<init>(r3, r5, r4, r0)
            r1.mo9225i()
            android.content.Context r0 = r10.f147700a
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827247(0x7f111a2f, float:1.9287401E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "context.resources.getStr…nder_live_complaint_done)"
            gy3.C87412m.m108593f(r0, r1)
            android.content.Context r10 = r10.f147700a
            vg1.a r1 = vg1.C14860a.f40874a
            nj3.C76912y0.m92766e(r10, r0, r1)
            di3.d r10 = di3.C86312j.m106911c(r11)
            ak1.w r10 = (ak1.C54116w) r10
            r11 = 6
            bl1.b r0 = r9.f147694f
            java.lang.String r0 = r0.mo62407a()
            bl1.b r1 = r9.f147694f
            java.lang.String r1 = r1.getContent()
            r10.Qx0(r11, r2, r0, r1)
            goto L_0x01f7
        L_0x0121:
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = "clipboard"
            java.lang.Object r10 = r10.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            gy3.C87412m.m108592e(r10, r0)
            android.content.ClipboardManager r10 = (android.content.ClipboardManager) r10
            bl1.b r0 = r9.f147694f
            java.lang.String r0 = r0.getContent()
            r10.setText(r0)
            di3.d r10 = di3.C86312j.m106911c(r11)
            ak1.w r10 = (ak1.C54116w) r10
            r11 = 5
            bl1.b r0 = r9.f147694f
            java.lang.String r0 = r0.mo62407a()
            bl1.b r1 = r9.f147694f
            java.lang.String r1 = r1.getContent()
            r10.Qx0(r11, r2, r0, r1)
            goto L_0x01f7
        L_0x0153:
            vg1.e r10 = r9.f147693e
            java.lang.Class<cl1.j> r3 = cl1.C39975j.class
            androidx.lifecycle.i0 r10 = r10.mo73647b(r3)
            cl1.j r10 = (cl1.C39975j) r10
            androidx.lifecycle.z<te3.lw0> r10 = r10.f107170j
            java.lang.Object r10 = r10.getValue()
            te3.lw0 r10 = (te3.C50317lw0) r10
            if (r10 == 0) goto L_0x016b
            java.lang.String r10 = r10.f137677e
            if (r10 != 0) goto L_0x016d
        L_0x016b:
            java.lang.String r10 = ""
        L_0x016d:
            java.lang.Class<wo.b> r3 = p740wo.C53193b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            wo.b r3 = (p740wo.C53193b) r3
            boolean r3 = r3.mo73725eL(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "isNotInChatRoom "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r10 = ", "
            r4.append(r10)
            r4.append(r3)
            java.lang.String r10 = r4.toString()
            java.lang.String r4 = "Finder.FinderLiveBoxUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            if (r3 == 0) goto L_0x01b6
            android.view.View r10 = r9.f147695g
            android.content.Context r10 = r10.getContext()
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131826706(0x7f111812, float:1.9286304E38)
            java.lang.String r11 = r11.getString(r0)
            android.widget.Toast r10 = nj3.C76912y0.makeText((android.content.Context) r10, (java.lang.CharSequence) r11, (int) r1)
            r10.show()
            goto L_0x01f7
        L_0x01b6:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r1 = "PARAM_IS_ENTERING_COMMENT"
            r10.putBoolean(r1, r2)
            bl1.b r1 = r9.f147694f
            te3.xs0 r1 = r1.f106734e
            te3.hx0 r1 = r1.f144914s
            if (r1 == 0) goto L_0x01cc
            byte[] r0 = r1.toByteArray()
        L_0x01cc:
            java.lang.String r1 = "PARAM_ENTER_COMMENT_AT_NAME"
            r10.putByteArray(r1, r0)
            java.lang.String r0 = "PARAM_ENTER_COMMENT_HIDE_AT_ENTRANCE"
            r10.putBoolean(r0, r2)
            vg1.e r0 = r9.f147693e
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r0 = r0.f147701b
            d60.b r0 = r0.f111631p
            d60.b$b r1 = d60.C58124b.C58125b.ENTERING_COMMENT
            r0.statusChange(r1, r10)
            di3.d r10 = di3.C86312j.m106911c(r11)
            ak1.w r10 = (ak1.C54116w) r10
            r11 = 4
            bl1.b r0 = r9.f147694f
            java.lang.String r0 = r0.mo62407a()
            bl1.b r1 = r9.f147694f
            java.lang.String r1 = r1.getContent()
            r10.Qx0(r11, r2, r0, r1)
        L_0x01f7:
            android.view.View r10 = r9.f147695g
            vg1.e r11 = r9.f147693e
            android.graphics.drawable.Drawable r11 = r11.f147703d
            r10.setBackground(r11)
            com.tencent.mm.plugin.finder.view.e3 r10 = com.tencent.p014mm.plugin.finder.view.C41573e3.f111902a
            r10.mo64658a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg1.C52887c.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
