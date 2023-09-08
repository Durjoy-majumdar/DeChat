package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Context;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import qo3.C89779i0;
import te3.C49098d51;
import te3.C51098rf;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.b */
public final class C42702b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C42713g f115639a;

    /* renamed from: b */
    public final /* synthetic */ boolean f115640b;

    /* renamed from: c */
    public final /* synthetic */ String f115641c;

    public C42702b(C42713g gVar, boolean z, String str) {
        this.f115639a = gVar;
        this.f115640b = z;
        this.f115641c = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C89779i0 i0Var = this.f115639a.f115681o;
        if (i0Var != null && i0Var.isShowing()) {
            C89779i0 i0Var2 = this.f115639a.f115681o;
            C87412m.m108591d(i0Var2);
            i0Var2.dismiss();
        }
        if (this.f115639a.f115667a.isFinishing()) {
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "activity.isFinishing");
            return Boolean.TRUE;
        }
        Log.m105925i("ContactBizHeaderLiveNoticeLogic", "reserve: cgi result: type = %s, code = %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105924i("ContactBizHeaderLiveNoticeLogic", "cgi ok,  " + this.f115640b);
            if (this.f115640b) {
                C2816v vVar = C2816v.f14072a;
                String str = this.f115641c;
                C87412m.m108593f(str, "finderUserName");
                C51098rf rfVar = this.f115639a.f115680n;
                C87412m.m108591d(rfVar);
                String str2 = rfVar.f140874g;
                C87412m.m108593f(str2, "liveNoticeInfoFirst!!.notice_id");
                C49098d51 d = vVar.mo2915d(str, str2);
                if (d != null) {
                    d.f132119e = 0;
                }
                Context context = this.f115639a.f115679m;
                Toast makeText = C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.dzj), 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            } else {
                C2816v vVar2 = C2816v.f14072a;
                String str3 = this.f115641c;
                C87412m.m108593f(str3, "finderUserName");
                C51098rf rfVar2 = this.f115639a.f115680n;
                C87412m.m108591d(rfVar2);
                String str4 = rfVar2.f140874g;
                C87412m.m108593f(str4, "liveNoticeInfoFirst!!.notice_id");
                C49098d51 d2 = vVar2.mo2915d(str3, str4);
                if (d2 != null) {
                    d2.f132119e = 1;
                }
                Context context2 = this.f115639a.f115679m;
                C76912y0.m92769h(context2, context2.getResources().getString(C0966R.string.d2w), C0966R.raw.icons_filled_done);
            }
            this.f115639a.mo66867c(this.f115640b);
            return Boolean.TRUE;
        }
        String string = this.f115640b ? this.f115639a.f115679m.getString(C0966R.string.dzw) : this.f115639a.f115679m.getString(C0966R.string.dz_);
        C87412m.m108593f(string, "if (needReserve) mContex…_reserve_fail_toast_tips)");
        Toast makeText2 = C76912y0.makeText(this.f115639a.f115679m, (CharSequence) string, 0);
        makeText2.setGravity(17, 0, 0);
        makeText2.show();
        return Boolean.TRUE;
    }
}
