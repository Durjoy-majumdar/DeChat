package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import hp3.C87581a;
import kotlin.Metadata;
import p749xh.C66276va;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"Lob0/b$c;", "Lte3/jm0;", "kotlin.jvm.PlatformType", "result", "Lrx3/b0;", "call", "(Lob0/b$c;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$checkMegaVideoDetail$1$1$1 */
final class C56192x87e8e247<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160484a;

    /* renamed from: b */
    public final /* synthetic */ C66276va f160485b;

    public C56192x87e8e247(FinderNotifyContract.NotifyViewCallback notifyViewCallback, C66276va vaVar) {
        this.f160484a = notifyViewCallback;
        this.f160485b = vaVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r7 != null ? r7.username : null, zc1.C66785b.f191882e.mo90662O5()) != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r7) {
        /*
            r6 = this;
            ob0.b$c r7 = (ob0.C89132b.C89134c) r7
            if (r7 != 0) goto L_0x0032
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r7 = r6.f160484a
            java.lang.String r7 = r7.f160453e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "result == null id "
            r0.append(r1)
            xh.va r1 = r6.f160485b
            long r1 = r1.field_id
            r0.append(r1)
            java.lang.String r1 = " content "
            r0.append(r1)
            xh.va r1 = r6.f160485b
            java.lang.String r1 = r1.field_content
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x00d2
        L_0x0032:
            int r0 = r7.f256793a
            if (r0 != 0) goto L_0x003a
            int r1 = r7.f256794b
            if (r1 == 0) goto L_0x0044
        L_0x003a:
            er1.j4 r1 = er1.C58739j4.f168176a
            int r2 = r7.f256794b
            boolean r0 = r1.mo83681J(r0, r2)
            if (r0 == 0) goto L_0x00cb
        L_0x0044:
            T r7 = r7.f256796d
            te3.jm0 r7 = (te3.C50008jm0) r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f136184e
            if (r7 == 0) goto L_0x00d2
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r0 = r6.f160484a
            xh.va r1 = r6.f160485b
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            er1.w3 r3 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r4 = r0.f160455g
            int r4 = r4.f160440d
            int r5 = r0.f160452d
            r3.mo83873H1(r2, r4, r5)
            long r3 = r7.f164794id
            java.lang.String r5 = "feed_object_id"
            r2.putExtra(r5, r3)
            java.lang.String r3 = r7.objectNonceId
            java.lang.String r4 = "feed_object_nonceid"
            r2.putExtra(r4, r3)
            long r3 = r1.field_id
            java.lang.String r5 = "mention_id"
            r2.putExtra(r5, r3)
            int r1 = r1.field_createTime
            java.lang.String r3 = "mention_create_time"
            r2.putExtra(r3, r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r0.f160455g
            int r1 = r1.f160440d
            java.lang.String r3 = "from_scene"
            r2.putExtra(r3, r1)
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r7.contact
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r1.username
            if (r1 != 0) goto L_0x008f
        L_0x008d:
            java.lang.String r1 = ""
        L_0x008f:
            java.lang.String r3 = "feed_username"
            r2.putExtra(r3, r1)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r1 = r0.f160455g
            int r1 = r1.f160440d
            r3 = 1
            if (r1 != r3) goto L_0x00b0
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.contact
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.username
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r1)
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            java.lang.String r7 = "feed_is_self"
            r2.putExtra(r7, r3)
            rs1.s8$a r7 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r1 = r0.f160456h
            r7.mo12871c(r1, r2)
            java.lang.Class<er1.b> r7 = er1.C58684b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            er1.b r7 = (er1.C58684b) r7
            com.tencent.mm.ui.MMActivity r0 = r0.f160456h
            r7.Sx0(r0, r2)
            goto L_0x00d2
        L_0x00cb:
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r0 = r6.f160484a
            int r7 = r7.f256794b
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.m64264y(r0, r7)
        L_0x00d2:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C56192x87e8e247.call(java.lang.Object):java.lang.Object");
    }
}
