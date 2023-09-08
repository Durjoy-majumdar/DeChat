package ao1;

import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ao1.m0 */
public final class C0174m0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f637d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0174m0(PostMainUIC postMainUIC) {
        super(1);
        this.f637d = postMainUIC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        r7 = r7.field_authInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00fb
            com.tencent.mm.plugin.finder.post.PostMainUIC r7 = r6.f637d
            r7.getClass()
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r1 = r7.getActivity()
            bl3.r$a r0 = r0.mo62444c(r1)
            java.lang.Class<ao1.f1> r1 = ao1.C0150f1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            ao1.f1 r0 = (ao1.C0150f1) r0
            ao1.r0 r1 = new ao1.r0
            r1.<init>(r7)
            r0.getClass()
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99327X3
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r2 = "Finder.PostRealNameAuthUIC"
            r3 = 0
            r4 = 1
            if (r7 != 0) goto L_0x0044
            java.lang.String r7 = "[isNeedAuth] disable, no need auth"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            goto L_0x0088
        L_0x0044:
            fe1.d$b r7 = fe1.C58961d.f168673a
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            fe1.q r7 = r7.mo84155b(r5)
            if (r7 == 0) goto L_0x005d
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r7 = r7.field_authInfo
            if (r7 == 0) goto L_0x005d
            int r7 = r7.authIconType
            r5 = 2
            if (r7 != r5) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            if (r7 == 0) goto L_0x0066
            java.lang.String r7 = "[isNeedAuth] enterprise account, no need auth"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            goto L_0x0088
        L_0x0066:
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t1 r7 = (ht1.C60200t1) r7
            boolean r7 = r7.u60()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "[isNeedAuth] hasPosted:"
            r3.append(r5)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r3 = r7 ^ 1
        L_0x0088:
            if (r3 == 0) goto L_0x00f6
            java.lang.String r7 = "[gotoRealNameAuth]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r2 = "intent_appid"
            java.lang.String r3 = "wxd6fc9057fee8b782"
            r7.putExtra(r2, r3)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.String r3 = "8,578"
            r2.add(r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "intent_category_id"
            r7.putExtra(r3, r2)
            java.lang.String r2 = "intent_auth_type"
            r7.putExtra(r2, r4)
            java.lang.String r2 = "id_ui_theme"
            r7.putExtra(r2, r4)
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131829468(0x7f1122dc, float:1.9291906E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "intent_app_name"
            r7.putExtra(r3, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x00dd
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r2 == 0) goto L_0x00e8
            ao1.e1 r3 = new ao1.e1
            r3.<init>(r1)
            r2.mmSetOnActivityResultCallback(r3)
        L_0x00e8:
            android.app.Activity r0 = r0.getContext()
            r1 = 30001(0x7531, float:4.204E-41)
            java.lang.String r2 = "appbrand"
            java.lang.String r3 = ".ui.autofill.AppBrandIDCardUI"
            ke3.C88144b.m109795m(r0, r2, r3, r7, r1)
            goto L_0x00fb
        L_0x00f6:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r1.invoke(r7)
        L_0x00fb:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao1.C0174m0.invoke(java.lang.Object):java.lang.Object");
    }
}
