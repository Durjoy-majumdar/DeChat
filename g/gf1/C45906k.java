package gf1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C49575gl0;
import te3.C50401mh0;

/* renamed from: gf1.k */
public final class C45906k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C50401mh0 f123878d;

    /* renamed from: e */
    public final /* synthetic */ C45907m f123879e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45906k(C50401mh0 mh02, C45907m mVar) {
        super(0);
        this.f123878d = mh02;
        this.f123879e = mVar;
    }

    public Object invoke() {
        C49575gl0 gl02 = new C49575gl0();
        C89349b bVar = this.f123878d.f138029e;
        if (bVar != null) {
            C45907m mVar = this.f123879e;
            gl02.parseFrom(bVar.mo123703f());
            mVar.getClass();
            Log.m105924i("Finder.SyncHandler", "processGetFollower: follow contact size = " + gl02.f134117d.size());
            LinkedList<FinderContact> linkedList = gl02.f134117d;
            C87412m.m108593f(linkedList, "follower.followers");
            int i = 0;
            for (T next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    FinderContact finderContact = (FinderContact) next;
                    C58961d.C58963b bVar2 = C58961d.f168673a;
                    C58969q b = bVar2.mo84155b(finderContact.username);
                    Log.m105924i("Finder.SyncHandler", "sync follow contact index=" + i + " username=" + finderContact.username + " nickname=" + finderContact.nickname + " followFlag=" + finderContact.followFlag + " user_flag=" + finderContact.user_flag + " avatarUrl=" + finderContact.headUrl);
                    if (b != null) {
                        b.field_nickname = finderContact.nickname;
                        b.field_user_flag = finderContact.user_flag;
                        b.field_follow_Flag = finderContact.followFlag;
                        b.field_authInfo = finderContact.authInfo;
                        b.field_avatarUrl = finderContact.headUrl;
                        bVar2.mo84163k(b);
                    } else {
                        bVar2.mo84162j(finderContact);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
