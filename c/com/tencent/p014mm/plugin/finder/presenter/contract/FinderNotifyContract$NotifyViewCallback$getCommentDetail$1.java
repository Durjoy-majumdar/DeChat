package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import hp3.C87581a;
import kotlin.Metadata;
import p749xh.C66276va;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lob0/b$c;", "Lte3/jm0;", "kotlin.jvm.PlatformType", "result", "call", "(Lob0/b$c;)Lob0/b$c;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$getCommentDetail$1 */
public final class FinderNotifyContract$NotifyViewCallback$getCommentDetail$1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160490a;

    /* renamed from: b */
    public final /* synthetic */ C66276va f160491b;

    /* renamed from: c */
    public final /* synthetic */ int f160492c;

    public FinderNotifyContract$NotifyViewCallback$getCommentDetail$1(FinderNotifyContract.NotifyViewCallback notifyViewCallback, C66276va vaVar, int i) {
        this.f160490a = notifyViewCallback;
        this.f160491b = vaVar;
        this.f160492c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r2, zc1.C66785b.f191882e.mo90662O5()) != false) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            ob0.b$c r1 = (ob0.C89132b.C89134c) r1
            r2 = 0
            if (r1 == 0) goto L_0x01a3
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback r3 = r0.f160490a
            xh.va r4 = r0.f160491b
            int r11 = r0.f160492c
            int r5 = r1.f256793a
            r6 = 0
            if (r5 != 0) goto L_0x0018
            int r7 = r1.f256794b
            if (r7 == 0) goto L_0x0022
        L_0x0018:
            er1.j4 r7 = er1.C58739j4.f168176a
            int r8 = r1.f256794b
            boolean r5 = r7.mo83681J(r5, r8)
            if (r5 == 0) goto L_0x0178
        L_0x0022:
            T r5 = r1.f256796d
            te3.jm0 r5 = (te3.C50008jm0) r5
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f136184e
            if (r5 == 0) goto L_0x01a4
            java.lang.String r7 = r3.f160453e
            java.lang.String r8 = "get feed detail success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            com.tencent.mm.protocal.protobuf.FinderContact r7 = new com.tencent.mm.protocal.protobuf.FinderContact
            r7.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r5.contact
            if (r8 == 0) goto L_0x003d
            java.lang.String r9 = r8.username
            goto L_0x003e
        L_0x003d:
            r9 = r2
        L_0x003e:
            r7.username = r9
            if (r8 == 0) goto L_0x0045
            java.lang.String r9 = r8.nickname
            goto L_0x0046
        L_0x0045:
            r9 = r2
        L_0x0046:
            r7.nickname = r9
            if (r8 == 0) goto L_0x004d
            java.lang.String r9 = r8.headUrl
            goto L_0x004e
        L_0x004d:
            r9 = r2
        L_0x004e:
            r7.headUrl = r9
            if (r8 == 0) goto L_0x0055
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r8.authInfo
            goto L_0x0056
        L_0x0055:
            r9 = r2
        L_0x0056:
            r7.authInfo = r9
            if (r8 == 0) goto L_0x005d
            te3.ii0 r8 = r8.extInfo
            goto L_0x005e
        L_0x005d:
            r8 = r2
        L_0x005e:
            r7.extInfo = r8
            fe1.d$b r8 = fe1.C58961d.f168673a
            r9 = 2
            fe1.C58961d.C58963b.m68837m(r8, r7, r6, r9, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            r8 = 32
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r7.mo79056a(r5, r8)
            vp1.e r7 = vp1.C65834e.f189316a
            vp1.e$b r8 = vp1.C65834e.C65836b.f189330j
            r7.mo89878l(r15, r8)
            up1.f r7 = up1.C37521f.f99374d
            r7.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99288T0
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r12 = 0
            r8 = 3
            r10 = 1
            if (r7 != r10) goto L_0x00da
            int r7 = r4.field_type
            if (r7 == r8) goto L_0x0098
            if (r7 != r9) goto L_0x00da
            long r6 = r4.field_commentId
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00da
        L_0x0098:
            int r2 = r5.objectType
            if (r2 != r9) goto L_0x00a3
            long r6 = r4.field_commentId
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.m64263D(r3, r10, r5, r6)
            goto L_0x01a4
        L_0x00a3:
            com.tencent.mm.plugin.finder.view.e1$a r5 = com.tencent.p014mm.plugin.finder.view.C56597e1.f162252i
            long r6 = r4.field_id
            int r8 = r4.field_createTime
            com.tencent.mm.ui.MMActivity r9 = r3.f160456h
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r2 = r3.f160455g
            int r10 = r2.f160440d
            r12 = 0
            r13 = 32
            r14 = 0
            com.tencent.mm.plugin.finder.view.e1 r12 = com.tencent.p014mm.plugin.finder.view.C56597e1.C56598a.m65270a(r5, r6, r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            long r2 = r4.field_commentId
            r4 = r15
            r15 = r2
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 8178(0x1ff2, float:1.146E-41)
            r29 = 0
            r13 = r4
            com.tencent.p014mm.plugin.finder.view.C56597e1.m65265e(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)
            goto L_0x01a4
        L_0x00da:
            int r6 = r5.objectType
            if (r6 != r9) goto L_0x00fa
            int r2 = r4.field_type
            if (r2 == r8) goto L_0x00f3
            if (r2 != r9) goto L_0x00eb
            long r6 = r4.field_commentId
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            long r6 = r4.field_commentId
            r2 = 0
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.m64263D(r3, r2, r5, r6)
            goto L_0x01a4
        L_0x00f3:
            long r6 = r4.field_commentId
            com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.m64263D(r3, r10, r5, r6)
            goto L_0x01a4
        L_0x00fa:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            er1.w3 r7 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r8 = r3.f160455g
            int r8 = r8.f160440d
            int r9 = r3.f160452d
            r7.mo83873H1(r6, r8, r9)
            long r7 = r4.field_objectId
            java.lang.String r9 = "feed_object_id"
            r6.putExtra(r9, r7)
            long r7 = r4.field_id
            java.lang.String r9 = "mention_id"
            r6.putExtra(r9, r7)
            int r7 = r4.field_createTime
            java.lang.String r8 = "mention_create_time"
            r6.putExtra(r8, r7)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r7 = r3.f160455g
            int r7 = r7.f160440d
            java.lang.String r8 = "from_scene"
            r6.putExtra(r8, r7)
            int r4 = r4.field_type
            r7 = 5
            if (r4 != r7) goto L_0x012f
            r4 = 1
            goto L_0x0130
        L_0x012f:
            r4 = 0
        L_0x0130:
            java.lang.String r7 = "force_show_ad_tip"
            r6.putExtra(r7, r4)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r5.contact
            if (r4 == 0) goto L_0x013d
            java.lang.String r4 = r4.username
            if (r4 != 0) goto L_0x013f
        L_0x013d:
            java.lang.String r4 = ""
        L_0x013f:
            java.lang.String r7 = "feed_username"
            r6.putExtra(r7, r4)
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter r4 = r3.f160455g
            int r4 = r4.f160440d
            if (r4 != r10) goto L_0x015d
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r5.contact
            if (r4 == 0) goto L_0x0150
            java.lang.String r2 = r4.username
        L_0x0150:
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r4)
            if (r2 == 0) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r10 = 0
        L_0x015e:
            java.lang.String r2 = "feed_is_self"
            r6.putExtra(r2, r10)
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r4 = r3.f160456h
            r2.mo12871c(r4, r6)
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            er1.b r2 = (er1.C58684b) r2
            com.tencent.mm.ui.MMActivity r3 = r3.f160456h
            r2.Sx0(r3, r6)
            goto L_0x01a4
        L_0x0178:
            int r2 = r1.f256794b
            r4 = -4011(0xfffffffffffff055, float:NaN)
            if (r2 != r4) goto L_0x0188
            com.tencent.mm.ui.MMActivity r2 = r3.f160456h
            r3 = 2131826557(0x7f11177d, float:1.9286002E38)
            r4 = 0
            nj3.C76879j.m92738i(r2, r3, r4)
            goto L_0x01a4
        L_0x0188:
            r4 = 0
            r5 = -4033(0xfffffffffffff03f, float:NaN)
            if (r2 != r5) goto L_0x0196
            com.tencent.mm.ui.MMActivity r2 = r3.f160456h
            r3 = 2131826641(0x7f1117d1, float:1.9286172E38)
            nj3.C76879j.m92738i(r2, r3, r4)
            goto L_0x01a4
        L_0x0196:
            r5 = -4036(0xfffffffffffff03c, float:NaN)
            if (r2 != r5) goto L_0x01a4
            com.tencent.mm.ui.MMActivity r2 = r3.f160456h
            r3 = 2131829851(0x7f11245b, float:1.9292683E38)
            nj3.C76879j.m92738i(r2, r3, r4)
            goto L_0x01a4
        L_0x01a3:
            r1 = r2
        L_0x01a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$getCommentDetail$1.call(java.lang.Object):java.lang.Object");
    }
}
