package com.tencent.p014mm.p136ui.transmit.recent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.mvvm.MvvmSelectContactUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import p240sx.C77808q;
import sn3.C13745k;
import un3.C78244i;
import vm3.C65764a;
import vm3.C78444g;
import xm3.C78870a;
import xm3.C78877c0;
import xm3.C78889f0;
import xm3.C78917n;
import xm3.C78924o0;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import yb2.C79062b;

@C86522b
/* renamed from: com.tencent.mm.ui.transmit.recent.b */
public final class C74924b extends C86301e implements C77808q {
    /* renamed from: Vv */
    public Intent mo104178Vv(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Intent intent = new Intent();
        intent.putExtra("list_type", 5);
        intent.putExtra("titile", appCompatActivity.getString(C0966R.string.f7496hv));
        intent.setClass(appCompatActivity, MvvmSelectContactUI.class);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219166g);
        intent.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
        C79062b.m95631b(intent, C13745k.class);
        C79062b.m95631b(intent, C78244i.class);
        C79062b.m95631b(intent, C78924o0.class);
        C79062b.m95631b(intent, C78444g.class);
        C79062b.m95631b(intent, C65764a.class);
        C79062b.m95631b(intent, C78877c0.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C78870a.class);
        C79062b.m95631b(intent, C78938y.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        return intent;
    }

    /* renamed from: cW */
    public Intent mo104179cW(AppCompatActivity appCompatActivity, List<String> list) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(list, "userNameList");
        Intent intent = new Intent(appCompatActivity, MvvmSelectContactUI.class);
        intent.putExtra("list_type", 14);
        intent.putExtra("titile", appCompatActivity.getString(C0966R.string.f7496hv));
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219167h);
        intent.putExtra("already_select_contact", Util.listToString(list, ","));
        intent.putExtra("max_limit_num", 9);
        intent.putExtra("block_contact", Util.setToString(C74560s1.m89274c(), ","));
        C79062b.m95631b(intent, C13745k.class);
        C79062b.m95631b(intent, C78924o0.class);
        C79062b.m95631b(intent, C78444g.class);
        C79062b.m95631b(intent, C65764a.class);
        C79062b.m95631b(intent, C78877c0.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C78870a.class);
        C79062b.m95631b(intent, C78938y.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        return intent;
    }
}
