package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8794p5;
import nj3.C76879j;
import rx3.C13598b0;
import te3.C64707sc1;

/* renamed from: com.tencent.mm.plugin.finder.ui.v0 */
public final class C41540v0 {

    /* renamed from: a */
    public static final C32228q<String, Context, C8794p5<C64707sc1>, C13598b0> f111850a = C3878a.f17432d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.v0$a */
    public static final class C3878a extends C87413o implements C32228q<String, Context, C8794p5<C64707sc1>, C13598b0> {

        /* renamed from: d */
        public static final C3878a f17432d = new C3878a();

        public C3878a() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            Context context = (Context) obj2;
            C87412m.m108594g(context, "context");
            C76879j.m92707A(context, context.getString(C0966R.string.d0b), "", context.getString(C0966R.string.boi), context.getString(C0966R.string.f7926wf), new C3875u0((String) obj, (C8794p5) obj3), (DialogInterface.OnClickListener) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r0 = r0.extInfo;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.finder.view.C4191v0 m44890a(te3.C50275lk0 r7, android.content.Context r8, fy3.C32226l<? super java.lang.String, rx3.C13598b0> r9) {
        /*
            java.lang.String r0 = "fansContact"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r8, r0)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = r0.username
            if (r2 != 0) goto L_0x0024
        L_0x0019:
            if (r0 == 0) goto L_0x0023
            te3.mi0 r0 = r0.msgInfo
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = r0.f138041d
            if (r2 != 0) goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            java.lang.String r0 = "Username"
            r4.putExtra(r0, r2)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r0 = r1
        L_0x0032:
            java.lang.String r2 = "Nickname"
            r4.putExtra(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.headUrl
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            java.lang.String r2 = "Avatar"
            r4.putExtra(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r0.signature
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            java.lang.String r2 = "Signature"
            r4.putExtra(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x005e
            te3.ii0 r0 = r0.extInfo
            if (r0 == 0) goto L_0x005e
            int r0 = r0.f135356g
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            java.lang.String r2 = "Sex"
            r4.putExtra(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x0070
            te3.ii0 r0 = r0.extInfo
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r0.f135354e
            if (r0 != 0) goto L_0x0071
        L_0x0070:
            r0 = r1
        L_0x0071:
            java.lang.String r2 = "Province"
            r4.putExtra(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x0082
            te3.ii0 r0 = r0.extInfo
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r0.f135355f
            if (r0 != 0) goto L_0x0083
        L_0x0082:
            r0 = r1
        L_0x0083:
            java.lang.String r2 = "City"
            r4.putExtra(r2, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x0094
            te3.ii0 r0 = r0.extInfo
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r0.f135353d
            if (r0 != 0) goto L_0x0095
        L_0x0094:
            r0 = r1
        L_0x0095:
            java.lang.String r2 = "Country"
            r4.putExtra(r2, r0)
            int r0 = r7.f137480h
            r2 = 1
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "Action"
            r4.putExtra(r0, r2)
        L_0x00a4:
            java.lang.String r0 = r7.f137478f
            java.lang.String r3 = "FansId"
            r4.putExtra(r3, r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r0.wx_username_v5
            if (r0 != 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r1 = r0
        L_0x00b5:
            java.lang.String r0 = "V5UserName"
            r4.putExtra(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f137476d
            if (r0 == 0) goto L_0x00c7
            te3.mi0 r0 = r0.msgInfo
            if (r0 == 0) goto L_0x00c7
            byte[] r0 = r0.toByteArray()
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            java.lang.String r1 = "ContactMsgInfo"
            r4.putExtra(r1, r0)
            java.lang.String r0 = "IsPoster"
            r4.putExtra(r0, r2)
            er1.w3 r1 = er1.C58784w3.f168295a
            java.lang.String r3 = r7.f137481i
            r5 = 1
            r2 = r8
            r6 = r9
            com.tencent.mm.plugin.finder.view.v0 r7 = r1.mo83938i1(r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C41540v0.m44890a(te3.lk0, android.content.Context, fy3.l):com.tencent.mm.plugin.finder.view.v0");
    }
}
