package p207nl;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.SnackContainer;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.smiley.C96954m;
import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import p384tk.C101897a;
import rx3.C13598b0;

/* renamed from: nl.g */
public final class C76926g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C76922c f224797d;

    /* renamed from: e */
    public final /* synthetic */ boolean f224798e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76926g(C76922c cVar, boolean z) {
        super(0);
        this.f224797d = cVar;
        this.f224798e = z;
    }

    public Object invoke() {
        boolean z;
        C75018a aVar = this.f224797d.f224792i;
        if (aVar != null) {
            SnackContainer snackContainer = aVar.f220735a;
            ((LinkedList) snackContainer.f220722d).clear();
            ((SnackContainer.C75014a) snackContainer.f220724f).run();
        }
        if (this.f224798e) {
            C76922c cVar = this.f224797d;
            Log.m105924i(cVar.f224788e, "dealSaveSuccess");
            EmojiInfo emojiInfo = cVar.f224787d;
            int i = emojiInfo.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            boolean z2 = true;
            if (i != 81) {
                emojiInfo.field_catalog = 81;
                C101897a.m134075e().mo141394c(cVar.f224787d, false);
                cVar.f224787d.field_reserved3 = C30790w2.m39221h().mo57717d().mo142062nP() + 1;
                C115669n nVar = C115669n.INSTANCE;
                EmojiInfo emojiInfo2 = cVar.f224787d;
                nVar.mo160131h(10431, 0, cVar.f224787d.getMd5(), emojiInfo2.field_designerID, emojiInfo2.field_groupId, 0, 0, Integer.valueOf(cVar.f224787d.field_size), cVar.f224786c, cVar.f224787d.field_activityid);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C30790w2.m39221h().mo57717d().r50(cVar.f224787d);
            }
            if (C30777t2.f82756d.wx0()) {
                C96954m mVar = C96954m.f284033a;
                Log.m105924i("MicroMsg.EmojiOcrService", "restart");
                mVar.mo135540d();
                mVar.mo135539c(false);
            } else if (!TextUtils.isEmpty(cVar.f224787d.field_meanings)) {
                C30764p2 p2Var = C30764p2.f82718j;
                if (p2Var.mo57678e()) {
                    p2Var.mo57680g();
                }
            }
            ArrayList arrayList = new ArrayList();
            String md5 = cVar.f224787d.getMd5();
            C87412m.m108593f(md5, "emojiInfo.getMd5()");
            arrayList.add(md5);
            C30790w2.m39221h().mo57717d().c40(0, arrayList);
            C76922c cVar2 = this.f224797d;
            C75018a.C75023c cVar3 = new C75018a.C75023c(cVar2.f224784a, cVar2.f224785b);
            cVar3.f220747c = this.f224797d.f224784a.getString(C0966R.string.ncp);
            String str = this.f224797d.f224787d.field_groupId;
            if (!(str == null || str.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                C76922c cVar4 = this.f224797d;
                cVar3.f220749e = cVar4.f224789f;
                cVar3.f220748d = cVar4.f224784a.getString(C0966R.string.gs7);
                cVar3.f220745a.f220737c = new C76925f(this.f224797d);
            } else {
                cVar3.f220749e = this.f224797d.f224790g;
            }
            cVar3.mo104599a();
        }
        return C13598b0.f38549a;
    }
}
