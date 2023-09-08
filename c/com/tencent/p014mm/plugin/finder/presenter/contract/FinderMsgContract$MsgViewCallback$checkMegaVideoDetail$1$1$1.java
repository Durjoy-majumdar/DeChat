package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import hp3.C87581a;
import kotlin.Metadata;
import p749xh.C66276va;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"Lob0/b$c;", "Lte3/jm0;", "kotlin.jvm.PlatformType", "result", "Lrx3/b0;", "call", "(Lob0/b$c;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1 */
final class FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160409a;

    /* renamed from: b */
    public final /* synthetic */ C66276va f160410b;

    public FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1(FinderMsgContract.MsgViewCallback msgViewCallback, C66276va vaVar) {
        this.f160409a = msgViewCallback;
        this.f160410b = vaVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r5, zc1.C66785b.f191882e.mo90662O5()) != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            ob0.b$c r1 = (ob0.C89132b.C89134c) r1
            if (r1 != 0) goto L_0x0036
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback r1 = r0.f160409a
            java.lang.String r1 = r1.f160387d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "result == null id "
            r2.append(r3)
            xh.va r3 = r0.f160410b
            long r3 = r3.field_id
            r2.append(r3)
            java.lang.String r3 = " content "
            r2.append(r3)
            xh.va r3 = r0.f160410b
            java.lang.String r3 = r3.field_content
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x00dd
        L_0x0036:
            int r2 = r1.f256793a
            if (r2 != 0) goto L_0x003e
            int r3 = r1.f256794b
            if (r3 == 0) goto L_0x0048
        L_0x003e:
            er1.j4 r3 = er1.C58739j4.f168176a
            int r4 = r1.f256794b
            boolean r2 = r3.mo83681J(r2, r4)
            if (r2 == 0) goto L_0x00d6
        L_0x0048:
            T r1 = r1.f256796d
            te3.jm0 r1 = (te3.C50008jm0) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f136184e
            if (r1 == 0) goto L_0x00dd
            xh.va r2 = r0.f160410b
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback r3 = r0.f160409a
            com.tencent.mm.plugin.finder.storage.FinderItem$a r4 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            r5 = 32
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo79056a(r1, r5)
            vp1.e r5 = vp1.C65834e.f189316a
            vp1.e$b r6 = vp1.C65834e.C65836b.f189330j
            r5.mo89878l(r4, r6)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            long r5 = r2.field_objectId
            java.lang.String r7 = "feed_object_id"
            r4.putExtra(r7, r5)
            long r5 = r2.field_id
            java.lang.String r7 = "mention_id"
            r4.putExtra(r7, r5)
            int r2 = r2.field_createTime
            java.lang.String r5 = "mention_create_time"
            r4.putExtra(r5, r2)
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter r2 = r3.f160389f
            int r2 = r2.f160376d
            java.lang.String r5 = "from_scene"
            r4.putExtra(r5, r2)
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.contact
            r5 = 0
            if (r2 == 0) goto L_0x008e
            java.lang.String r2 = r2.username
            goto L_0x008f
        L_0x008e:
            r2 = r5
        L_0x008f:
            java.lang.String r6 = "feed_username"
            r4.putExtra(r6, r2)
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter r2 = r3.f160389f
            int r2 = r2.f160376d
            r6 = 1
            if (r2 != r6) goto L_0x00ae
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.contact
            if (r1 == 0) goto L_0x00a1
            java.lang.String r5 = r1.username
        L_0x00a1:
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r1)
            if (r1 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r6 = 0
        L_0x00af:
            java.lang.String r1 = "feed_is_self"
            r4.putExtra(r1, r6)
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r8 = r3.f160390g
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 252(0xfc, float:3.53E-43)
            r18 = 0
            r9 = r4
            rs1.C13442s8.C13443a.m12791e(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Class<er1.b> r1 = er1.C58684b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            er1.b r1 = (er1.C58684b) r1
            com.tencent.mm.ui.MMActivity r2 = r3.f160390g
            r1.Sx0(r2, r4)
            goto L_0x00dd
        L_0x00d6:
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback r2 = r0.f160409a
            int r1 = r1.f256794b
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.m64245y(r2, r1)
        L_0x00dd:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1.call(java.lang.Object):java.lang.Object");
    }
}
