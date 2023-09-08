package pu2;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import ip3.C98780b;
import ju2.C9530k;
import op3.C117882j;

/* renamed from: pu2.q */
public abstract class C100940q extends C100921i0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100940q(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: C */
    public void mo87548C(C96275w6 w6Var, boolean z) {
        int i;
        boolean z2;
        C96275w6 w6Var2 = w6Var;
        SnsMethodCalculate.markStartTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
        C87412m.m108594g(w6Var2, "newStruct");
        super.mo87548C(w6Var, z);
        SnsMethodCalculate.markStartTimeMs("buildHolderAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
        Log.m105918d("MicroMsg.Feed.Improve.TimelineItemAccessibility", "buildHolderAccessibilityDesc: localId:" + w6Var2.f281381h);
        StringBuilder sb = new StringBuilder("");
        C98780b<C117882j> bVar = w6Var2.f281363W;
        boolean z3 = true;
        if (bVar != null && bVar.mo138165b() > 0) {
            sb.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.j96));
            sb.append(XVFSFile.PATH_SEPARATOR);
            int b = bVar.mo138165b();
            for (int i2 = 0; i2 < b; i2++) {
                C117882j a = bVar.mo138164a(i2);
                C87412m.m108593f(a, "likeUserList.get(i)");
                sb.append((String) a.mo182596a(1));
                sb.append(",");
            }
        }
        C98780b<C117882j> bVar2 = w6Var2.f281364X;
        StringBuilder sb4 = new StringBuilder("");
        if (bVar2 != null && bVar2.mo138165b() > 0) {
            sb4.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.f361361j91));
            sb4.append(XVFSFile.PATH_SEPARATOR);
            int b2 = bVar2.mo138165b();
            for (int i3 = 0; i3 < b2; i3++) {
                Object a2 = w6Var2.f281364X.mo138164a(i3).mo182596a(6);
                C87412m.m108593f(a2, "user.get(6)");
                sb4.append((CharSequence) a2);
                sb4.append(",");
            }
        }
        int i4 = w6Var2.f281379g;
        if (i4 == 2) {
            z2 = false;
            i = 1;
        } else if (i4 == 3 || i4 == 4 || i4 == 5) {
            z2 = false;
            i = 2;
        } else {
            if (i4 != 9) {
                z3 = false;
            }
            z2 = z3;
            i = 0;
        }
        C9530k kVar = C9530k.f29712a;
        String str = w6Var2.f281399z;
        String str2 = w6Var2.f281390q;
        String str3 = w6Var2.f281346F;
        String contentAccessibilityDesc = getContentAccessibilityDesc();
        CharSequence charSequence = w6Var2.f281350J;
        kVar.mo10206a(this, str, str2, str3, contentAccessibilityDesc, (TextView) null, z2, charSequence != null ? charSequence.toString() : null, sb.toString(), sb4.toString(), i);
        SnsMethodCalculate.markEndTimeMs("buildHolderAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
        SnsMethodCalculate.markEndTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
    }

    public final String getContentAccessibilityDesc() {
        SnsMethodCalculate.markStartTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
        String content = getContentText().getContent();
        if (TextUtils.isEmpty(content)) {
            content = "";
        }
        if (content == null) {
            content = null;
        }
        SnsMethodCalculate.markEndTimeMs("getContentAccessibilityDesc", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
        return content;
    }
}
