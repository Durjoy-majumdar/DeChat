package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import fe1.C58961d;
import hp3.C87581a;
import kotlin.Metadata;
import nj3.C76879j;
import ob0.C89132b;
import p749xh.C66276va;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C50008jm0;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65834e;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo182094d2 = {"Lob0/b$c;", "Lte3/jm0;", "kotlin.jvm.PlatformType", "result", "Lrx3/b0;", "call", "(Lob0/b$c;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$getCommentDetail$1 */
final class FinderMsgContract$MsgViewCallback$getCommentDetail$1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160415a;

    /* renamed from: b */
    public final /* synthetic */ C66276va f160416b;

    /* renamed from: c */
    public final /* synthetic */ int f160417c;

    public FinderMsgContract$MsgViewCallback$getCommentDetail$1(FinderMsgContract.MsgViewCallback msgViewCallback, C66276va vaVar, int i) {
        this.f160415a = msgViewCallback;
        this.f160416b = vaVar;
        this.f160417c = i;
    }

    public Object call(Object obj) {
        int i;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar == null) {
            String str = this.f160415a.f160387d;
            Log.m105924i(str, "result == null id " + this.f160416b.field_id + " content " + Util.secPrint(this.f160416b.field_content));
        } else {
            int i2 = cVar.f256793a;
            boolean z = false;
            if (!(i2 == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i2, cVar.f256794b)) {
                int i3 = cVar.f256794b;
                if (i3 == -4011) {
                    C76879j.m92738i(this.f160415a.f160390g, C0966R.string.f360503d90, 0);
                } else if (i3 == -4033) {
                    C76879j.m92738i(this.f160415a.f160390g, C0966R.string.d_8, 0);
                } else if (i3 == -4036) {
                    C76879j.m92738i(this.f160415a.f160390g, C0966R.string.eoh, 0);
                }
            } else {
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                if (finderObject != null) {
                    FinderMsgContract.MsgViewCallback msgViewCallback = this.f160415a;
                    C66276va vaVar = this.f160416b;
                    int i4 = this.f160417c;
                    Log.m105924i(msgViewCallback.f160387d, "get feed detail success");
                    FinderContact finderContact = new FinderContact();
                    FinderContact finderContact2 = finderObject.contact;
                    String str2 = null;
                    finderContact.username = finderContact2 != null ? finderContact2.username : null;
                    finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
                    finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
                    finderContact.authInfo = finderContact2 != null ? finderContact2.authInfo : null;
                    finderContact.extInfo = finderContact2 != null ? finderContact2.extInfo : null;
                    C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
                    FinderItem a = FinderItem.Companion.mo79056a(finderObject, 32);
                    C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
                    C37521f.f99374d.getClass();
                    if (C37521f.f99288T0.mo60266n().intValue() == 1 && ((i = vaVar.field_type) == 3 || (i == 2 && vaVar.field_commentId != 0))) {
                        C56597e1.m65265e(C56597e1.C56598a.m65270a(C56597e1.f162252i, vaVar.field_id, vaVar.field_createTime, msgViewCallback.f160390g, msgViewCallback.f160389f.f160376d, i4, false, 32, (Object) null), a, false, vaVar.field_commentId, true, false, (C65426w0) null, false, 0, (CommentDrawerContract.CloseDrawerCallback) null, false, 0, 0, 0, 8178, (Object) null);
                    } else if (finderObject.objectType == 2) {
                        int i5 = vaVar.field_type;
                        if (i5 == 3 || (i5 == 2 && vaVar.field_commentId != 0)) {
                            FinderMsgContract.MsgViewCallback.m64244Z(msgViewCallback, true, finderObject, vaVar.field_commentId);
                        } else {
                            FinderMsgContract.MsgViewCallback.m64244Z(msgViewCallback, false, finderObject, vaVar.field_commentId);
                        }
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("feed_object_id", vaVar.field_objectId);
                        intent.putExtra("mention_id", vaVar.field_id);
                        intent.putExtra("mention_create_time", vaVar.field_createTime);
                        intent.putExtra("from_scene", msgViewCallback.f160389f.f160376d);
                        FinderContact finderContact3 = finderObject.contact;
                        intent.putExtra("feed_username", finderContact3 != null ? finderContact3.username : null);
                        if (msgViewCallback.f160389f.f160376d == 1) {
                            FinderContact finderContact4 = finderObject.contact;
                            if (finderContact4 != null) {
                                str2 = finderContact4.username;
                            }
                            if (Util.isEqual(str2, C66785b.f191882e.mo90662O5())) {
                                z = true;
                            }
                        }
                        intent.putExtra("feed_is_self", z);
                        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, msgViewCallback.f160390g, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                        ((C58684b) C86312j.m106911c(C58684b.class)).Sx0(msgViewCallback.f160390g, intent);
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
